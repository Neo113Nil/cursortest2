package com.squareup.cash.card.onboarding;

import com.miteksystems.misnap.camera.a.b;
import com.squareup.cash.blockers.presenters.SelectionPresenter;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.cash.db.contacts.WithContactAliasId;
import com.squareup.cash.db2.StampsConfig;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.invitations.InviteContactsPresenter;
import com.squareup.cash.invitations.InviteContactsViewEvent;
import com.squareup.cash.invitations.InviteContactsViewModel;
import com.squareup.cash.taptopay.backend.real.RealTapToPayEligibilityProvider;
import com.squareup.protos.cash.cashbusinessaccounts.TapToPay;
import com.squareup.protos.franklin.api.CardPresentationStyle;
import com.squareup.protos.franklin.cards.CardCustomizationData;
import com.squareup.protos.franklin.cards.CardTheme;
import com.squareup.protos.franklin.cards.TouchData;
import com.squareup.protos.franklin.common.Stamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;
import kotlinx.collections.immutable.ImmutableList;
import okio.ByteString;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealStyledCardPresenter$model$1 extends SuspendLambda implements Function4 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public /* synthetic */ boolean Z$0;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealStyledCardPresenter$model$1(Object obj, Continuation continuation, int i) {
        super(4, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.$r8$classId;
        Object obj5 = this.this$0;
        switch (i) {
            case 0:
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                RealStyledCardPresenter$model$1 realStyledCardPresenter$model$1 = new RealStyledCardPresenter$model$1((RealStyledCardPresenter) obj5, (Continuation) obj4, 0);
                realStyledCardPresenter$model$1.L$0 = (StampsConfig) obj;
                realStyledCardPresenter$model$1.L$1 = (String) obj2;
                realStyledCardPresenter$model$1.Z$0 = booleanValue;
                return realStyledCardPresenter$model$1.invokeSuspend(Unit.INSTANCE);
            case 1:
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                RealStyledCardPresenter$model$1 realStyledCardPresenter$model$12 = new RealStyledCardPresenter$model$1((SelectionPresenter) obj5, (Continuation) obj4, 1);
                realStyledCardPresenter$model$12.L$0 = (BlockersScreens.SelectionScreen) obj;
                realStyledCardPresenter$model$12.Z$0 = booleanValue2;
                realStyledCardPresenter$model$12.L$1 = (String) obj3;
                return realStyledCardPresenter$model$12.invokeSuspend(Unit.INSTANCE);
            case 2:
                boolean booleanValue3 = ((Boolean) obj3).booleanValue();
                RealStyledCardPresenter$model$1 realStyledCardPresenter$model$13 = new RealStyledCardPresenter$model$1((InviteContactsPresenter) obj5, (Continuation) obj4, 2);
                realStyledCardPresenter$model$13.L$0 = (List) obj;
                realStyledCardPresenter$model$13.L$1 = (List) obj2;
                realStyledCardPresenter$model$13.Z$0 = booleanValue3;
                return realStyledCardPresenter$model$13.invokeSuspend(Unit.INSTANCE);
            default:
                boolean booleanValue4 = ((Boolean) obj).booleanValue();
                RealStyledCardPresenter$model$1 realStyledCardPresenter$model$14 = new RealStyledCardPresenter$model$1((RealTapToPayEligibilityProvider) obj5, (Continuation) obj4, 3);
                realStyledCardPresenter$model$14.Z$0 = booleanValue4;
                realStyledCardPresenter$model$14.L$0 = (FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) obj2;
                realStyledCardPresenter$model$14.L$1 = (List) obj3;
                return realStyledCardPresenter$model$14.invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:184:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x039a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        byte[] bArr;
        CustomizationDetails customizationDetails;
        ArrayList arrayList;
        InviteContactsViewModel.RecommendedContact recommendedContact;
        Object obj2;
        int i = this.$r8$classId;
        int i2 = 10;
        Object obj3 = this.this$0;
        switch (i) {
            case 0:
                StampsConfig stampsConfig = (StampsConfig) this.L$0;
                String str = (String) this.L$1;
                boolean z = this.Z$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                RealStyledCardPresenter realStyledCardPresenter = (RealStyledCardPresenter) obj3;
                CardCustomizationData cardCustomizationData = realStyledCardPresenter.cardData;
                CardPresentationStyle cardPresentationStyle = cardCustomizationData.card_presentation_style;
                CardPresentationStyle cardPresentationStyle2 = CardPresentationStyle.TRUE_3D;
                if (cardPresentationStyle != cardPresentationStyle2 || !z) {
                    cardPresentationStyle2 = CardPresentationStyle.PSEUDO_3D;
                }
                List list = stampsConfig.stamps;
                list.getClass();
                List<Stamp> list2 = list;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                for (Stamp stamp : list2) {
                    String str2 = stamp.name;
                    str2.getClass();
                    arrayList2.add(new Pair(str2, stamp));
                }
                Map map = MapsKt__MapsKt.toMap(arrayList2);
                ByteString byteString = cardCustomizationData.image_bytes;
                if (byteString != null) {
                    if (byteString.getSize$okio() <= 0) {
                        byteString = null;
                    }
                    if (byteString != null) {
                        bArr = byteString.toByteArray();
                        Boolean bool = cardCustomizationData.show_cashtag;
                        bool.getClass();
                        boolean booleanValue = bool.booleanValue();
                        CardTheme cardTheme = cardCustomizationData.card_theme;
                        cardTheme.getClass();
                        if (bArr == null) {
                            customizationDetails = new CustomizationDetails();
                        } else {
                            TouchData touchData = cardCustomizationData.touch_data;
                            customizationDetails = touchData != null ? StyledCardViewModelKt.toCustomizationDetails(touchData, map) : new CustomizationDetails();
                        }
                        return new StyledCardWidgetViewModel(new StyledCardViewModel(str, booleanValue, cardTheme, false, customizationDetails, bArr, false, cardCustomizationData.payment_method, null, null, null, null, null, 64456), cardPresentationStyle2, realStyledCardPresenter.isFilamentDisabled);
                    }
                }
                bArr = null;
                Boolean bool2 = cardCustomizationData.show_cashtag;
                bool2.getClass();
                boolean booleanValue2 = bool2.booleanValue();
                CardTheme cardTheme2 = cardCustomizationData.card_theme;
                cardTheme2.getClass();
                if (bArr == null) {
                }
                return new StyledCardWidgetViewModel(new StyledCardViewModel(str, booleanValue2, cardTheme2, false, customizationDetails, bArr, false, cardCustomizationData.payment_method, null, null, null, null, null, 64456), cardPresentationStyle2, realStyledCardPresenter.isFilamentDisabled);
            case 1:
                BlockersScreens.SelectionScreen selectionScreen = (BlockersScreens.SelectionScreen) this.L$0;
                boolean z2 = this.Z$0;
                String str3 = (String) this.L$1;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return ((SelectionPresenter) obj3).viewModelFor(selectionScreen, z2, str3);
            case 2:
                List list3 = (List) this.L$0;
                List list4 = (List) this.L$1;
                boolean z3 = this.Z$0;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                InviteContactsPresenter inviteContactsPresenter = (InviteContactsPresenter) obj3;
                BlockersScreens.InviteContactsScreen inviteContactsScreen = inviteContactsPresenter.args;
                if (inviteContactsScreen.recommendedContactsHashedAliasIds.isEmpty() || inviteContactsPresenter.hashedAliasToId.isEmpty() || !z3) {
                    return new InviteContactsViewModel.RecommendedContacts(EmptyList.INSTANCE, list3.size(), 0, 0, 0, 0);
                }
                List list5 = list4;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : list5) {
                    WithContactAliasId withContactAliasId = (WithContactAliasId) obj4;
                    if (withContactAliasId.hashed_alias != null && withContactAliasId.hashed_alias_id != null && withContactAliasId.sms != null) {
                        arrayList3.add(obj4);
                    }
                }
                int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
                if (mapCapacity < 16) {
                    mapCapacity = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    WithContactAliasId withContactAliasId2 = (WithContactAliasId) it.next();
                    String str4 = withContactAliasId2.hashed_alias;
                    str4.getClass();
                    linkedHashMap.put(str4, withContactAliasId2.lookupKey);
                }
                TreeMap recommendedIdToLookupKey = inviteContactsPresenter.getRecommendedIdToLookupKey(linkedHashMap);
                ArrayList arrayList4 = new ArrayList();
                for (Object obj5 : list5) {
                    WithContactAliasId withContactAliasId3 = (WithContactAliasId) obj5;
                    if (withContactAliasId3.hashed_alias != null && withContactAliasId3.hashed_alias_id != null && withContactAliasId3.email != null) {
                        arrayList4.add(obj5);
                    }
                }
                int mapCapacity2 = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, 10));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(mapCapacity2 >= 16 ? mapCapacity2 : 16);
                Iterator it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    WithContactAliasId withContactAliasId4 = (WithContactAliasId) it2.next();
                    String str5 = withContactAliasId4.hashed_alias;
                    str5.getClass();
                    linkedHashMap2.put(str5, withContactAliasId4.lookupKey);
                }
                TreeMap recommendedIdToLookupKey2 = inviteContactsPresenter.getRecommendedIdToLookupKey(linkedHashMap2);
                Set set = CollectionsKt.toSet(inviteContactsScreen.recommendedContactsHashedAliasIds);
                Set keySet = recommendedIdToLookupKey2.keySet();
                keySet.getClass();
                Set minus = SetsKt___SetsKt.minus(set, (Iterable) keySet);
                Set keySet2 = recommendedIdToLookupKey.keySet();
                keySet2.getClass();
                Set minus2 = SetsKt___SetsKt.minus(minus, (Iterable) keySet2);
                List list6 = list3;
                ArrayList arrayList5 = new ArrayList();
                for (Object obj6 : list6) {
                    if (((InviteContactsViewModel.Contact) obj6).status == InviteContactsViewModel.Contact.Status.CASH_CUSTOMER) {
                        arrayList5.add(obj6);
                    }
                }
                ArrayList arrayList6 = new ArrayList();
                Iterator it3 = arrayList5.iterator();
                while (it3.hasNext()) {
                    ImmutableList immutableList = ((InviteContactsViewModel.Contact) it3.next()).recipients;
                    ArrayList arrayList7 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(immutableList, 10));
                    Iterator<E> it4 = immutableList.iterator();
                    while (it4.hasNext()) {
                        arrayList7.add(((Recipient) it4.next()).lookupKey);
                    }
                    CollectionsKt__MutableCollectionsKt.addAll(arrayList7, arrayList6);
                }
                ArrayList filterNotNull = CollectionsKt.filterNotNull(arrayList6);
                Collection values = recommendedIdToLookupKey.values();
                values.getClass();
                Collection values2 = recommendedIdToLookupKey2.values();
                values2.getClass();
                ArrayList plus = CollectionsKt.plus((Iterable) values2, values);
                ArrayList arrayList8 = new ArrayList();
                Iterator it5 = plus.iterator();
                while (it5.hasNext()) {
                    Object next = it5.next();
                    if (filterNotNull.contains((String) next)) {
                        arrayList8.add(next);
                    }
                }
                int size = arrayList8.size();
                ArrayList arrayList9 = new ArrayList();
                for (Object obj7 : list6) {
                    if (((InviteContactsViewModel.Contact) obj7).status == InviteContactsViewModel.Contact.Status.NOT_INVITED) {
                        arrayList9.add(obj7);
                    }
                }
                TreeMap recommendedIdToLookupKey3 = inviteContactsPresenter.getRecommendedIdToLookupKey(linkedHashMap);
                Set<String> keySet3 = recommendedIdToLookupKey3.keySet();
                keySet3.getClass();
                ArrayList arrayList10 = new ArrayList();
                for (String str6 : keySet3) {
                    String str7 = (String) recommendedIdToLookupKey3.get(str6);
                    ArrayList arrayList11 = new ArrayList();
                    Iterator it6 = arrayList9.iterator();
                    while (it6.hasNext()) {
                        InviteContactsViewModel.Contact contact = (InviteContactsViewModel.Contact) it6.next();
                        ImmutableList immutableList2 = contact.recipients;
                        ArrayList arrayList12 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(immutableList2, i2));
                        Iterator<E> it7 = immutableList2.iterator();
                        while (it7.hasNext()) {
                            arrayList12.add(((Recipient) it7.next()).lookupKey);
                        }
                        if (arrayList12.contains(str7)) {
                            arrayList = arrayList9;
                            InviteContactsViewEvent.SendInvite sendInvite = new InviteContactsViewEvent.SendInvite(immutableList2, "select_contact", InviteContactsViewEvent.SendInvite.ContactSection.RECOMMENDED);
                            InviteContactsViewModel.Contact.Status status = contact.status;
                            String str8 = contact.description;
                            status.getClass();
                            str8.getClass();
                            recommendedContact = new InviteContactsViewModel.RecommendedContact(str6, new InviteContactsViewModel.Contact(immutableList2, status, str8, sendInvite));
                        } else {
                            arrayList = arrayList9;
                            recommendedContact = null;
                        }
                        if (recommendedContact != null) {
                            arrayList11.add(recommendedContact);
                        }
                        arrayList9 = arrayList;
                        i2 = 10;
                    }
                    CollectionsKt__MutableCollectionsKt.addAll(arrayList11, arrayList10);
                    i2 = 10;
                }
                return new InviteContactsViewModel.RecommendedContacts(CollectionsKt.sortedWith(CollectionsKt.take(arrayList10, 3), new b.C0008b(21)), list3.size(), size, recommendedIdToLookupKey2.keySet().size(), minus2.size(), arrayList10.size());
            default:
                boolean z4 = this.Z$0;
                FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = (FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) this.L$0;
                List list7 = (List) this.L$1;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Iterator it8 = list7.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        obj2 = it8.next();
                        if (((TapToPay) obj2).onboarding_status != null) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                TapToPay tapToPay = (TapToPay) obj2;
                TapToPay.OnboardingStatus onboardingStatus = tapToPay != null ? tapToPay.onboarding_status : null;
                int i3 = onboardingStatus == null ? -1 : RealTapToPayEligibilityProvider.WhenMappings.$EnumSwitchMapping$0[onboardingStatus.ordinal()];
                return Boolean.valueOf(z4 && featureFlag$EnabledDisabledAmplitudeExperiment$Options.enabled() && ((i3 != 1 && i3 != 2 && i3 != 3) || onboardingStatus == TapToPay.OnboardingStatus.ACTIVATED));
        }
    }
}
