package com.squareup.cash.invitations;

import android.os.Parcelable;
import androidx.room.util.DBUtil;
import app.cash.versioned.Versioned;
import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber$PhoneNumber;
import com.google.mlkit.vision.text.zza;
import com.squareup.cash.R;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.cash.db.contacts.WithContactAliasId;
import com.squareup.cash.featureflags.FeatureFlag$JsonFeatureFlag;
import com.squareup.cash.featureflags.JsonFeatureFlags$SmsInviteConsentPhoneNumbers;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.invitations.InviteContactsViewEvent;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.RedactedString;
import com.squareup.protos.franklin.api.InviteFriendsScreen;
import com.squareup.protos.franklin.api.PromotionUpsell;
import com.squareup.util.android.PhoneNumbers;
import com.squareup.util.cash.Regions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Triple;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function10;
import kotlinx.collections.immutable.ImmutableList;
import okhttp3.internal.Tags;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class InviteContactsPresenter$contentModels$1 extends SuspendLambda implements Function10 {
    public /* synthetic */ List L$0;
    public /* synthetic */ Triple L$1;
    public /* synthetic */ String L$2;
    public /* synthetic */ List L$3;
    public /* synthetic */ List L$4;
    public /* synthetic */ Versioned L$5;
    public /* synthetic */ Versioned L$6;
    public /* synthetic */ boolean Z$0;
    public /* synthetic */ boolean Z$1;
    public final /* synthetic */ InviteContactsPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InviteContactsPresenter$contentModels$1(InviteContactsPresenter inviteContactsPresenter, Continuation continuation) {
        super(10, continuation);
        this.this$0 = inviteContactsPresenter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0142  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        boolean z;
        String str3;
        InviteErrorDialogKt inviteErrorDialogKt;
        String str4;
        AreaCodeStates areaCodeState;
        InviteContactsViewEvent sendInvite;
        String nationalSignificantNumber;
        int lengthOfNationalDestinationCode;
        boolean z2 = this.Z$0;
        List list = this.L$0;
        Triple triple = this.L$1;
        String str5 = this.L$2;
        List list2 = this.L$3;
        List list3 = this.L$4;
        Versioned versioned = this.L$5;
        Versioned versioned2 = this.L$6;
        boolean z3 = this.Z$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        String str6 = (String) triple.first;
        String str7 = (String) triple.second;
        String str8 = (String) triple.third;
        InviteContactsPresenter inviteContactsPresenter = this.this$0;
        AndroidStringManager androidStringManager = inviteContactsPresenter.stringManager;
        BlockersScreens.InviteContactsScreen inviteContactsScreen = inviteContactsPresenter.args;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list3) {
            boolean z4 = z2;
            WithContactAliasId withContactAliasId = (WithContactAliasId) obj2;
            List list4 = list;
            if (withContactAliasId.hashed_alias != null && withContactAliasId.hashed_alias_id != null) {
                arrayList.add(obj2);
            }
            z2 = z4;
            list = list4;
        }
        boolean z5 = z2;
        List list5 = list;
        int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        if (mapCapacity < 16) {
            mapCapacity = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            WithContactAliasId withContactAliasId2 = (WithContactAliasId) it.next();
            String str9 = withContactAliasId2.hashed_alias;
            str9.getClass();
            String str10 = withContactAliasId2.hashed_alias_id;
            str10.getClass();
            linkedHashMap.put(str9, str10);
        }
        inviteContactsPresenter.hashedAliasToId = linkedHashMap;
        InviteFriendsScreen inviteFriendsScreen = inviteContactsScreen.inviteFriendsScreen;
        String str11 = inviteFriendsScreen.send_invite_button_text;
        String str12 = inviteFriendsScreen.invite_contact_button_text;
        String str13 = inviteFriendsScreen.contact_access_request_text;
        String str14 = inviteFriendsScreen.contact_access_request_button_text;
        String str15 = androidStringManager.get(R.string.invite_share_link_button_title);
        if (z5) {
            str15 = null;
        }
        if (str7 != null) {
            PhoneNumberUtil phoneNumberUtil = PhoneNumbers.f1416utils;
            String name = Regions.toCountry(inviteContactsScreen.blockersData.region).name();
            name.getClass();
            try {
                PhoneNumberUtil phoneNumberUtil2 = PhoneNumbers.f1416utils;
                Phonenumber$PhoneNumber parse = phoneNumberUtil2.parse(str7, name);
                str = str14;
                try {
                    nationalSignificantNumber = PhoneNumberUtil.getNationalSignificantNumber(parse);
                    lengthOfNationalDestinationCode = phoneNumberUtil2.getLengthOfNationalDestinationCode(parse);
                } catch (NumberParseException unused) {
                }
            } catch (NumberParseException unused2) {
                str = str14;
            }
            if (lengthOfNationalDestinationCode > 0) {
                try {
                    str4 = nationalSignificantNumber.substring(0, lengthOfNationalDestinationCode);
                } catch (NumberParseException unused3) {
                }
                areaCodeState = InviteErrorDialogKt.getAreaCodeState(str4, (JsonFeatureFlags$SmsInviteConsentPhoneNumbers.SmsInviteConsentPhoneNumbersOptions) ((FeatureFlag$JsonFeatureFlag.Options) ((RealFeatureFlagManager) inviteContactsPresenter.featureFlagManager).peekCurrentValue(JsonFeatureFlags$SmsInviteConsentPhoneNumbers.INSTANCE)).value);
                boolean z6 = !z3;
                if (areaCodeState != null || str8 == null) {
                    str2 = str8;
                    sendInvite = new InviteContactsViewEvent.SendInvite(str7, null, !list5.isEmpty() ? InviteContactsViewEvent.SendInvite.ContactSection.NOT_IN_CONTACTS : InviteContactsViewEvent.SendInvite.ContactSection.ALL_CONTACTS, 2);
                } else {
                    RedactedString redactedString = new RedactedString(str8);
                    Parcelable.Creator<Recipient> creator = Recipient.CREATOR;
                    str2 = str8;
                    sendInvite = new InviteContactsViewEvent.ShowConsent(redactedString, areaCodeState, DBUtil.redactList(CollectionsKt__CollectionsJVMKt.listOf(zza.createPhoneRecipient(0L, "", str7))), new RedactedString("type_ahead"), list5.isEmpty() ? InviteContactsViewEvent.SendInvite.ContactSection.NOT_IN_CONTACTS : InviteContactsViewEvent.SendInvite.ContactSection.ALL_CONTACTS);
                }
                inviteErrorDialogKt = new InviteContactsViewModel$State$ShowInvite(sendInvite, z6);
                z = true;
                str3 = null;
            }
            str4 = null;
            areaCodeState = InviteErrorDialogKt.getAreaCodeState(str4, (JsonFeatureFlags$SmsInviteConsentPhoneNumbers.SmsInviteConsentPhoneNumbersOptions) ((FeatureFlag$JsonFeatureFlag.Options) ((RealFeatureFlagManager) inviteContactsPresenter.featureFlagManager).peekCurrentValue(JsonFeatureFlags$SmsInviteConsentPhoneNumbers.INSTANCE)).value);
            boolean z62 = !z3;
            if (areaCodeState != null) {
            }
            str2 = str8;
            sendInvite = new InviteContactsViewEvent.SendInvite(str7, null, !list5.isEmpty() ? InviteContactsViewEvent.SendInvite.ContactSection.NOT_IN_CONTACTS : InviteContactsViewEvent.SendInvite.ContactSection.ALL_CONTACTS, 2);
            inviteErrorDialogKt = new InviteContactsViewModel$State$ShowInvite(sendInvite, z62);
            z = true;
            str3 = null;
        } else {
            str = str14;
            str2 = str8;
            if (str5 != null) {
                z = true;
                str3 = null;
                inviteErrorDialogKt = new InviteContactsViewModel$State$ShowInvite(new InviteContactsViewEvent.SendInvite(null, str5, list5.isEmpty() ? InviteContactsViewEvent.SendInvite.ContactSection.NOT_IN_CONTACTS : InviteContactsViewEvent.SendInvite.ContactSection.ALL_CONTACTS, 1), !z3);
            } else {
                z = true;
                str3 = null;
                str3 = null;
                inviteErrorDialogKt = !z5 ? InviteContactsViewModel$State$PromptForPermissions.INSTANCE : InviteContactsViewModel$State$ShowContacts.INSTANCE;
            }
        }
        ImmutableList immutableList = Tags.toImmutableList(list5);
        ImmutableList immutableList2 = Tags.toImmutableList(list2);
        if (str7 != null) {
            str6 = str2;
        } else if (str6.length() <= 0) {
            str6 = str3;
        }
        String str16 = androidStringManager.get(z5 ? R.string.blockers_invite_contacts_view_with_permissions_name_input_hint : R.string.blockers_invite_contacts_view_name_input_hint);
        String str17 = inviteContactsScreen.inviteFriendsScreen.header_text;
        String str18 = androidStringManager.get(R.string.blockers_invite_contacts_description);
        InviteFriendsScreen inviteFriendsScreen2 = inviteContactsScreen.inviteFriendsScreen;
        if (inviteFriendsScreen2.enable_referral_text == null) {
            z = false;
        }
        InviteContactsHeaderViewModel inviteContactsHeaderViewModel = new InviteContactsHeaderViewModel(str17, str18, z);
        PromotionUpsell promotionUpsell = inviteFriendsScreen2.promotion_upsell;
        Object obj3 = str3;
        if (promotionUpsell != null) {
            obj3 = InviteContactsPresenter.getPromotionUpsellViewModel(promotionUpsell);
        }
        return new InviteContactsViewModel(str12, str11, str15, str13, str, immutableList, immutableList2, inviteErrorDialogKt, str6, str16, inviteContactsHeaderViewModel, versioned, versioned2, obj3, false);
    }
}
