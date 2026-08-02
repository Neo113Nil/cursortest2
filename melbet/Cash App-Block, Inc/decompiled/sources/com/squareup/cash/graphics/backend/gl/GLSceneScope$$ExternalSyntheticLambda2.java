package com.squareup.cash.graphics.backend.gl;

import android.app.Activity;
import android.opengl.Matrix;
import androidx.compose.material3.DatePickerStateImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.unit.IntSize;
import app.cash.broadway.ui.Ui;
import app.cash.directoryui.viewmodels.DirectoryListItem;
import app.cash.directoryui.viewmodels.DirectoryViewEvent;
import app.cash.directoryui.viewmodels.MissingMetadata;
import com.google.android.libraries.places.api.model.zzco;
import com.squareup.cash.R;
import com.squareup.cash.activity.backend.loader.RealActivityTokenFactory;
import com.squareup.cash.amountchooser.views.AmountKeypadState;
import com.squareup.cash.arcade.components.SearchBarKeyboardState;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.cdf.shophub.Metadata;
import com.squareup.cash.collapsingtoolbar.views.CollapsingToolbarScaffoldState;
import com.squareup.cash.common.viewmodels.AvatarBadgeViewModel;
import com.squareup.cash.common.viewmodels.AvatarViewModel;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.db2.profile.Profile;
import com.squareup.cash.directory_ui.views.MooncakeAvatarView;
import com.squareup.cash.earnings.viewmodels.home.EarningsHomeViewEvent;
import com.squareup.cash.earnings.viewmodels.home.EarningsHomeViewModel;
import com.squareup.cash.family.familyhub.backend.api.ControlType;
import com.squareup.cash.family.familyhub.presenters.FamilyHomePresenter;
import com.squareup.cash.family.familyhub.presenters.FamilyPendingRequestRowModelHelperKt;
import com.squareup.cash.family.familyhub.presenters.ManagedAccountTransferPresenter;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlRowState$InitialLoading;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlsAndLimitsViewEvent;
import com.squareup.cash.family.familyhub.viewmodels.FamilyPendingRequestRowModel;
import com.squareup.cash.family.requestsponsorship.presenters.SelectSponsorPresenter;
import com.squareup.cash.family.requestsponsorship.presenters.SelectSponsorPresenter$getSuggestedSponsorSections$$inlined$sortedBy$1;
import com.squareup.cash.family.requestsponsorship.screens.SelectDependentScreen;
import com.squareup.cash.family.requestsponsorship.screens.SelectSponsorScreen;
import com.squareup.cash.family.requestsponsorship.viewmodels.SelectSponsorViewEvent;
import com.squareup.cash.family.requestsponsorship.viewmodels.SponsorRowViewModel;
import com.squareup.cash.family.requestsponsorship.viewmodels.SponsorSuggestionSection;
import com.squareup.cash.fidesmo.api.FidesmoShutdownReason;
import com.squareup.cash.fidesmo.real.RealFidesmoClient;
import com.squareup.cash.fidesmo.real.RealFidesmoClient$observeDeviceState$1$listener$1;
import com.squareup.cash.formview.components.arcade.ArcadeFormOptionPickerView;
import com.squareup.cash.formview.viewevents.api.FormViewEvent;
import com.squareup.cash.globalsearch.viewmodels.GlobalSearchViewEvent;
import com.squareup.cash.globalsearch.viewmodels.GlobalSearchViewModel;
import com.squareup.cash.globalsearch.viewmodels.GlobalSearchViewModel$Item$Accessory$ButtonAccessory;
import com.squareup.cash.globalsearch.views.GlobalSearchFeedKt$$ExternalSyntheticLambda5;
import com.squareup.cash.graphics.backend.math.Matrix4;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.graphics.backend.math.Vector4;
import com.squareup.cash.growtools.viewmodels.manager.GrowToolsManagerViewEvent;
import com.squareup.cash.growtools.viewmodels.manager.GrowToolsManagerViewModel;
import com.squareup.cash.history.payments.presenters.CounterpartyPageRequestHandler$Factory$Impl;
import com.squareup.cash.history.payments.presenters.ProfilePaymentHistoryPresenter;
import com.squareup.cash.history.payments.screens.PaymentHistoryScreens$ProfileCompletePaymentHistory;
import com.squareup.cash.instruments.viewmodels.SelectPaymentInstrumentViewEvent$SelectPaymentInstrument;
import com.squareup.cash.instruments.viewmodels.SelectPaymentInstrumentViewModel;
import com.squareup.cash.investing.viewmodels.categories.InvestingCategoryFilterViewEvent;
import com.squareup.cash.investing.viewmodels.categories.InvestingCategoryFilterViewModel;
import com.squareup.cash.investing.viewmodels.exchange.InvestingExchangeViewModel;
import com.squareup.cash.investing.viewmodels.search.InvestingSearchViewEvent;
import com.squareup.cash.investing.viewmodels.search.InvestingSecurityTileContentModel;
import com.squareup.cash.invitations.InviteContactsBodyKt$InviteContactsBody$4$2$1$2$1$1;
import com.squareup.cash.invitations.InviteContactsViewEvent;
import com.squareup.cash.invitations.InviteContactsViewModel;
import com.squareup.cash.invitations.InviteContactsViewModel$State$ShowInvite;
import com.squareup.cash.invitations.InviteErrorDialogKt;
import com.squareup.cash.moneybot.viewmodels.amountinput.MoneybotAmountInputViewEvent;
import com.squareup.cash.moneybot.viewmodels.amountinput.MoneybotAmountInputViewModel;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.theming.ThemablesKt;
import com.squareup.cash.presenters.RecipientAvatars;
import com.squareup.cash.recipients.data.Recipient;
import com.squareup.cash.recipients.data.Section;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.protos.cash.activity.api.v1.ActivityClientService;
import com.squareup.protos.cash.activity.api.v1.ActivityScope;
import com.squareup.protos.cash.activity.api.v1.ActivityToken;
import com.squareup.protos.cash.activity.api.v1.ActivityTokenType;
import com.squareup.protos.cash.aegis.core.FamilyAccountsParameters;
import com.squareup.protos.cash.aegis.core.PendingRequest;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.protos.franklin.api.Instrument;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.ui.MerchantData;
import com.squareup.util.cash.Cashtags;
import com.squareup.util.cash.Countries;
import com.squareup.wire.GrpcStatus;
import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import xyz.block.genie.state.GenieStateBinding;

/* loaded from: classes6.dex */
public final /* synthetic */ class GLSceneScope$$ExternalSyntheticLambda2 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ GLSceneScope$$ExternalSyntheticLambda2(State state, State state2, State state3) {
        this.$r8$classId = 15;
        this.f$2 = state;
        this.f$0 = state2;
        this.f$1 = state3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:324:0x0652, code lost:
    
        if (r14 == null) goto L267;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r11v15, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r3v47, types: [com.squareup.protos.franklin.api.FormBlocker$Element$OptionPickerElement$Option$Unselectable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v48, types: [com.squareup.protos.franklin.api.FormBlocker$Element$OptionPickerElement$Option$Unselectable] */
    /* JADX WARN: Type inference failed for: r3v58 */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        Image image;
        List list;
        Object obj;
        Object obj2;
        Object obj3;
        Instrument instrument;
        Long l;
        Iterator it;
        Region region;
        Iterator it2;
        SponsorRowViewModel sponsorRowViewModel;
        String fromString;
        SelectDependentScreen selectDependentScreen;
        boolean z;
        Boolean bool;
        String str;
        SelectSponsorPresenter.SponsorSuggestionSectionType sponsorSuggestionSectionType;
        String str2;
        boolean contains;
        String obj4;
        int i = this.$r8$classId;
        int i2 = 8;
        ?? r3 = 0;
        r3 = 0;
        boolean z2 = true;
        z2 = true;
        Object obj5 = this.f$2;
        Object obj6 = this.f$1;
        Object obj7 = this.f$0;
        switch (i) {
            case 0:
                GLSceneScope gLSceneScope = (GLSceneScope) obj7;
                long m3991toSizeozmzZPI = Countries.m3991toSizeozmzZPI(((IntSize) gLSceneScope._screenSize.getValue()).packedValue);
                gLSceneScope.cameraState.getClass();
                break;
            case 1:
                Ui.EventReceiver eventReceiver = (Ui.EventReceiver) obj7;
                DirectoryListItem.ItemViewModel itemViewModel = (DirectoryListItem.ItemViewModel) obj6;
                MooncakeAvatarView mooncakeAvatarView = (MooncakeAvatarView) obj5;
                Metadata metadata = Metadata.LOGO;
                AvatarViewModel avatarViewModel = itemViewModel.avatar;
                eventReceiver.sendEvent(new DirectoryViewEvent.DirectoryItemViewEvent.MissingMetadataEvent(new MissingMetadata(itemViewModel.analyticsData, metadata, (avatarViewModel == null || (image = GrpcStatus.Companion.getImage(avatarViewModel)) == null) ? null : ThemablesKt.urlForTheme(image, ThemeHelpersKt.themeInfo(mooncakeAvatarView)))));
                break;
            case 2:
                ((Ui.EventReceiver) obj7).sendEvent(new DirectoryViewEvent.DirectoryItemViewEvent.MissingMetadataEvent(new MissingMetadata(((DirectoryListItem.ItemViewModel) obj5).analyticsData, Metadata.LOGO, String.valueOf(GrpcStatus.Companion.getImage((AvatarViewModel) obj6)))));
                break;
            case 3:
                EarningsHomeViewModel.EarningToolsItem earningToolsItem = (EarningsHomeViewModel.EarningToolsItem) obj7;
                Function1 function1 = (Function1) obj6;
                MutableState mutableState = (MutableState) obj5;
                EarningsHomeViewModel.EarnerModeSheet earnerModeSheet = earningToolsItem.earnerModeSheet;
                if (((earnerModeSheet == null || earnerModeSheet.durationOptions.isEmpty()) ? null : earnerModeSheet) != null) {
                    mutableState.setValue(earningToolsItem.f1128type);
                } else {
                    EarningsHomeViewEvent earningsHomeViewEvent = earningToolsItem.action;
                    if (earningsHomeViewEvent != null) {
                        function1.invoke(earningsHomeViewEvent);
                    }
                }
                break;
            case 4:
                FamilyHomePresenter familyHomePresenter = (FamilyHomePresenter) obj7;
                State state = (State) obj5;
                FamilyAccountsParameters familyAccountsParameters = (FamilyAccountsParameters) ((MutableState) obj6).getValue();
                if (familyAccountsParameters != null && (list = familyAccountsParameters.pending_invitations) != null) {
                    Map map = (Map) state.getValue();
                    ArrayList arrayList = new ArrayList();
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        FamilyPendingRequestRowModel.Loaded model = FamilyPendingRequestRowModelHelperKt.toModel(familyHomePresenter, (PendingRequest) it3.next(), map);
                        if (model != null) {
                            arrayList.add(model);
                        }
                    }
                    break;
                } else {
                    break;
                }
            case 5:
                ManagedAccountTransferPresenter managedAccountTransferPresenter = (ManagedAccountTransferPresenter) obj7;
                MutableState mutableState2 = (MutableState) obj5;
                String str3 = (String) ((MutableState) obj6).getValue();
                if (str3 == null) {
                    str3 = managedAccountTransferPresenter.args.selectedInstrumentToken;
                }
                Iterator it4 = ((List) mutableState2.getValue()).iterator();
                while (true) {
                    if (it4.hasNext()) {
                        obj = it4.next();
                        if (Intrinsics.areEqual(((Instrument) obj).token, str3)) {
                        }
                    } else {
                        obj = null;
                    }
                }
                Instrument instrument2 = (Instrument) obj;
                if (instrument2 == null) {
                    List list2 = (List) mutableState2.getValue();
                    Iterator it5 = list2.iterator();
                    while (true) {
                        if (it5.hasNext()) {
                            obj2 = it5.next();
                            Instrument instrument3 = (Instrument) obj2;
                            if (instrument3.cash_instrument_type == CashInstrumentType.CASH_BALANCE) {
                                Money money = instrument3.available_balance;
                                if (((money == null || (l = money.amount) == null) ? 0L : l.longValue()) >= 100) {
                                }
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    Instrument instrument4 = (Instrument) obj2;
                    if (instrument4 == null) {
                        Iterator it6 = list2.iterator();
                        while (true) {
                            if (it6.hasNext()) {
                                obj3 = it6.next();
                                if (((Instrument) obj3).cash_instrument_type == CashInstrumentType.DEBIT_CARD) {
                                }
                            } else {
                                obj3 = null;
                            }
                        }
                        Instrument instrument5 = (Instrument) obj3;
                        if (instrument5 == null) {
                            Iterator it7 = list2.iterator();
                            while (true) {
                                if (it7.hasNext()) {
                                    ?? next = it7.next();
                                    if (((Instrument) next).cash_instrument_type == CashInstrumentType.BANK_ACCOUNT) {
                                        instrument = next;
                                    }
                                } else {
                                    instrument = null;
                                }
                            }
                            break;
                        }
                    }
                }
                break;
            case 6:
                Function1 function12 = (Function1) obj6;
                ControlType controlType = (ControlType) obj5;
                if (!(((zzco) obj7) instanceof DependentControlRowState$InitialLoading)) {
                    function12.invoke(new DependentControlsAndLimitsViewEvent.ControlDetailNavigation(controlType));
                }
                break;
            case 7:
                ((ParcelableSnapshotMutableIntState) obj7).setIntValue(0);
                ((ParcelableSnapshotMutableIntState) obj6).setIntValue(0);
                ((MutableState) obj5).setValue(Boolean.FALSE);
                break;
            case 8:
                SelectSponsorPresenter selectSponsorPresenter = (SelectSponsorPresenter) obj7;
                Map map2 = (Map) ((MutableState) obj6).getValue();
                Profile profile = (Profile) ((MutableState) obj5).getValue();
                Region region2 = profile != null ? profile.region : null;
                AndroidStringManager androidStringManager = selectSponsorPresenter.stringManager;
                SelectSponsorScreen selectSponsorScreen = selectSponsorPresenter.selectSponsorScreen;
                ArrayList arrayList2 = new ArrayList();
                for (Map.Entry entry : map2.entrySet()) {
                    Section.Type type2 = (Section.Type) entry.getKey();
                    List<Recipient> list3 = (List) entry.getValue();
                    ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                    for (Recipient recipient : list3) {
                        Section.Type type3 = Section.Type.RESULTS;
                        if (type2 != type3) {
                            if (selectSponsorScreen != null) {
                                if (type2 != type3 && (recipient.isCashCustomer || !selectSponsorScreen.shouldOnlyRecommendCashUsers)) {
                                    String str4 = recipient.contactName;
                                    if (str4 == null || (obj4 = StringsKt.trim(str4).toString()) == null) {
                                        str2 = "";
                                    } else {
                                        Locale locale = Locale.getDefault();
                                        locale.getClass();
                                        str2 = obj4.toLowerCase(locale);
                                        str2.getClass();
                                    }
                                    contains = ((List) selectSponsorPresenter.recommendedContactNames$delegate.getValue()).contains(str2);
                                } else {
                                    contains = false;
                                }
                                if (contains) {
                                    sponsorSuggestionSectionType = SelectSponsorPresenter.SponsorSuggestionSectionType.RECOMMENDED;
                                }
                            }
                            sponsorSuggestionSectionType = SelectSponsorPresenter.SponsorSuggestionSectionType.YOUR_NETWORK;
                        } else {
                            sponsorSuggestionSectionType = (recipient.isInContacts || recipient.isFavorited || recipient.isRecent) ? SelectSponsorPresenter.SponsorSuggestionSectionType.YOUR_NETWORK : SelectSponsorPresenter.SponsorSuggestionSectionType.MORE_RESULTS;
                        }
                        arrayList3.add(new Pair(sponsorSuggestionSectionType, recipient));
                    }
                    CollectionsKt__MutableCollectionsKt.addAll(arrayList3, arrayList2);
                }
                List sortedWith = CollectionsKt.sortedWith(arrayList2, new SelectSponsorPresenter$getSuggestedSponsorSections$$inlined$sortedBy$1());
                HashSet hashSet = new HashSet();
                ArrayList arrayList4 = new ArrayList();
                for (Object obj8 : sortedWith) {
                    if (hashSet.add((Recipient) ((Pair) obj8).second)) {
                        arrayList4.add(obj8);
                    }
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it8 = arrayList4.iterator();
                while (it8.hasNext()) {
                    Recipient recipient2 = (Recipient) ((Pair) it8.next()).second;
                    String str5 = recipient2.lookupKey;
                    if (str5 != null) {
                        if (recipient2.isCashCustomer) {
                            linkedHashSet.add(str5);
                        } else {
                            Object obj9 = linkedHashMap.get(str5);
                            Object obj10 = obj9;
                            if (obj9 == null) {
                                ArrayList arrayList5 = new ArrayList();
                                linkedHashMap.put(str5, arrayList5);
                                obj10 = arrayList5;
                            }
                            ((List) obj10).add(recipient2);
                        }
                    }
                }
                ArrayList arrayList6 = new ArrayList();
                Iterator it9 = arrayList4.iterator();
                while (it9.hasNext()) {
                    Pair pair = (Pair) it9.next();
                    SelectSponsorPresenter.SponsorSuggestionSectionType sponsorSuggestionSectionType2 = (SelectSponsorPresenter.SponsorSuggestionSectionType) pair.first;
                    Recipient recipient3 = (Recipient) pair.second;
                    boolean z3 = recipient3.isCashCustomer;
                    String str6 = recipient3.lookupKey;
                    if (!z3 && str6 != null) {
                        if (!CollectionsKt.contains(linkedHashSet, str6) && linkedHashMap.containsKey(str6)) {
                            Object remove = TypeIntrinsics.asMutableMap(linkedHashMap).remove(str6);
                            remove.getClass();
                            List list4 = (List) remove;
                            String str7 = recipient3.email;
                            if (str7 == null) {
                                Iterator it10 = list4.iterator();
                                while (true) {
                                    if (it10.hasNext()) {
                                        String str8 = ((Recipient) it10.next()).email;
                                        if (str8 != null) {
                                            str7 = str8;
                                        }
                                    } else {
                                        str7 = null;
                                    }
                                }
                            }
                            String str9 = str7;
                            List list5 = list4;
                            ArrayList arrayList7 = new ArrayList();
                            Iterator it11 = list5.iterator();
                            while (it11.hasNext()) {
                                String str10 = ((Recipient) it11.next()).emailAddresses;
                                if (str10 != null) {
                                    arrayList7.add(str10);
                                }
                            }
                            String joinToString$default = CollectionsKt.joinToString$default(arrayList7, ",", null, null, 0, null, null, 62);
                            String str11 = joinToString$default.length() == 0 ? null : joinToString$default;
                            String str12 = recipient3.sms;
                            if (str12 == null) {
                                Iterator it12 = list5.iterator();
                                while (true) {
                                    if (it12.hasNext()) {
                                        String str13 = ((Recipient) it12.next()).sms;
                                        if (str13 != null) {
                                            str12 = str13;
                                        }
                                    } else {
                                        str12 = null;
                                    }
                                }
                            }
                            String str14 = str12;
                            ArrayList arrayList8 = new ArrayList();
                            Iterator it13 = list5.iterator();
                            while (it13.hasNext()) {
                                String str15 = ((Recipient) it13.next()).smsNumbers;
                                if (str15 != null) {
                                    arrayList8.add(str15);
                                }
                            }
                            String joinToString$default2 = CollectionsKt.joinToString$default(arrayList8, ",", null, null, 0, null, null, 62);
                            pair = new Pair(sponsorSuggestionSectionType2, Recipient.copy$default(recipient3, str9, str14, str11, joinToString$default2.length() == 0 ? null : joinToString$default2, null, null, null, false, false, -26113, 3));
                        } else {
                            pair = null;
                        }
                    }
                    if (pair != null) {
                        arrayList6.add(pair);
                    }
                }
                HashSet hashSet2 = new HashSet();
                ArrayList arrayList9 = new ArrayList();
                Iterator it14 = arrayList6.iterator();
                while (it14.hasNext()) {
                    Object next2 = it14.next();
                    Recipient recipient4 = (Recipient) ((Pair) next2).second;
                    if (recipient4.isCashCustomer) {
                        String str16 = recipient4.customerId;
                        str = str16;
                        if (str16 == null) {
                            str = Integer.valueOf(recipient4.hashCode());
                        }
                    } else {
                        String str17 = recipient4.lookupKey;
                        str = str17;
                        if (str17 == null) {
                            str = Integer.valueOf(recipient4.hashCode());
                        }
                    }
                    if (hashSet2.add(str)) {
                        arrayList9.add(next2);
                    }
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                Iterator it15 = arrayList9.iterator();
                while (it15.hasNext()) {
                    Object next3 = it15.next();
                    SelectSponsorPresenter.SponsorSuggestionSectionType sponsorSuggestionSectionType3 = (SelectSponsorPresenter.SponsorSuggestionSectionType) ((Pair) next3).first;
                    Object obj11 = linkedHashMap2.get(sponsorSuggestionSectionType3);
                    if (obj11 == null) {
                        obj11 = new ArrayList();
                        linkedHashMap2.put(sponsorSuggestionSectionType3, obj11);
                    }
                    ((List) obj11).add(next3);
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(linkedHashMap2.size()));
                Iterator it16 = linkedHashMap2.entrySet().iterator();
                while (it16.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it16.next();
                    Object key = entry2.getKey();
                    List list6 = (List) entry2.getValue();
                    ArrayList arrayList10 = new ArrayList();
                    for (Iterator it17 = list6.iterator(); it17.hasNext(); it17 = it2) {
                        Pair pair2 = (Pair) it17.next();
                        SelectSponsorPresenter.SponsorSuggestionSectionType sponsorSuggestionSectionType4 = (SelectSponsorPresenter.SponsorSuggestionSectionType) pair2.first;
                        Recipient recipient5 = (Recipient) pair2.second;
                        if (recipient5.displayName != null) {
                            boolean z4 = recipient5.isCashCustomer;
                            if (!z4 && SelectSponsorPresenter.getHasMultipleContactMethods(recipient5)) {
                                fromString = androidStringManager.get(R.string.sponsor_row_subtitle_for_multiple_contact_methods);
                            } else if (recipient5.isInContacts || z4 || ((selectSponsorScreen == null || selectSponsorScreen.shouldOnlyRecommendCashUsers) && ((selectDependentScreen = selectSponsorPresenter.selectDependentScreen) == null || selectDependentScreen.allowOnlyCashUsers))) {
                                String str18 = recipient5.cashtag;
                                if (str18 == null || StringsKt.isBlank(str18)) {
                                    str18 = null;
                                }
                                fromString = Cashtags.fromString(str18, region2);
                                if (fromString != null) {
                                    if (StringsKt.isBlank(fromString)) {
                                        fromString = null;
                                        break;
                                    }
                                }
                                fromString = recipient5.email;
                                if (fromString == null || StringsKt.isBlank(fromString)) {
                                    fromString = null;
                                }
                                if (fromString == null && (fromString = recipient5.sms) == null) {
                                    fromString = "";
                                }
                            } else {
                                fromString = androidStringManager.get(R.string.sponsor_row_subtitle_for_unknown_contacts);
                            }
                            String str19 = fromString;
                            String str20 = recipient5.displayName;
                            str20.getClass();
                            Image image2 = recipient5.photo;
                            it = it16;
                            region = region2;
                            ColorModel.Accented accented = new ColorModel.Accented(recipient5.getAccentColor());
                            String str21 = recipient5.displayName;
                            String avatarMonogramSource = RecipientAvatars.avatarMonogramSource(recipient5.fullName, str21);
                            MerchantData merchantData = recipient5.merchantData;
                            if (merchantData != null) {
                                it2 = it17;
                                z = Intrinsics.areEqual(merchantData.should_colorize_avatar, Boolean.TRUE);
                            } else {
                                it2 = it17;
                                z = false;
                            }
                            sponsorRowViewModel = new SponsorRowViewModel(new StackedAvatarViewModel.Single(GrpcStatus.Companion.toStackedAvatar(new AvatarViewModel(image2, accented, str21, avatarMonogramSource, z, (merchantData == null || (bool = merchantData.should_fill_background) == null) ? z4 : bool.booleanValue(), recipient5.lookupKey, recipient5.email, recipient5.sms, (AvatarBadgeViewModel) null, (String) null, recipient5.isFavorited, recipient5.isSponsorAllowlisted, 19457))), str20, str19, selectSponsorPresenter.isSponsorRowCashLogoEnabled && z4, new SelectSponsorViewEvent.SponsorRowTapped(recipient5, sponsorSuggestionSectionType4 == SelectSponsorPresenter.SponsorSuggestionSectionType.RECOMMENDED));
                        } else {
                            it = it16;
                            region = region2;
                            it2 = it17;
                            sponsorRowViewModel = null;
                        }
                        if (sponsorRowViewModel != null) {
                            arrayList10.add(sponsorRowViewModel);
                        }
                        it16 = it;
                        region2 = region;
                    }
                    linkedHashMap3.put(key, arrayList10);
                }
                ArrayList arrayList11 = new ArrayList(linkedHashMap3.size());
                for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
                    arrayList11.add(new SponsorSuggestionSection(androidStringManager.get(((SelectSponsorPresenter.SponsorSuggestionSectionType) entry3.getKey()).header), (List) entry3.getValue()));
                }
                break;
            case 9:
                DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) obj7;
                Function1 function13 = (Function1) obj6;
                SponsorRowViewModel sponsorRowViewModel2 = (SponsorRowViewModel) obj5;
                if (delegatingSoftwareKeyboardController != null) {
                    delegatingSoftwareKeyboardController.hide();
                }
                function13.invoke(sponsorRowViewModel2.clickEvent);
                break;
            case 10:
                RealFidesmoClient realFidesmoClient = (RealFidesmoClient) obj7;
                realFidesmoClient.incrementActiveConnectionId();
                realFidesmoClient.shutdown((Activity) obj6, (RealFidesmoClient$observeDeviceState$1$listener$1) obj5, FidesmoShutdownReason.STREAM_DISPOSED);
                break;
            case 11:
                FormBlocker.Element.CellDefaultElement cellDefaultElement = (FormBlocker.Element.CellDefaultElement) obj6;
                boolean areEqual = Intrinsics.areEqual(((SnapshotStateMap) obj7).get(cellDefaultElement.selection_group_id), (String) obj5);
                String str22 = cellDefaultElement.selection_group_id;
                str22.getClass();
                break;
            case 12:
                Function1 function14 = (Function1) obj7;
                String str23 = ((ArcadeFormOptionPickerView) obj6).formElementId;
                FormBlocker.Element.OptionPickerElement.Option.Selectability selectability = ((FormBlocker.Element.OptionPickerElement.Option) obj5).selectability;
                if (selectability != null) {
                    FormBlocker.Element.OptionPickerElement.Option.Selectability.Unselectable unselectable = selectability instanceof FormBlocker.Element.OptionPickerElement.Option.Selectability.Unselectable ? (FormBlocker.Element.OptionPickerElement.Option.Selectability.Unselectable) selectability : null;
                    if (unselectable != null) {
                        r3 = unselectable.getValue();
                    }
                }
                r3.getClass();
                function14.invoke(new FormViewEvent.UpdateResultEvent.UnselectableOptionClick(str23, r3));
                break;
            case 13:
                ((Function0) obj7).invoke();
                ((Function1) obj6).invoke(new FormViewEvent.BlockerActionViewEvent.FormButtonClicked((BlockerAction) obj5));
                break;
            case 14:
                ((GlobalSearchFeedKt$$ExternalSyntheticLambda5) obj7).invoke(new GlobalSearchViewEvent.RowSectionEvent.AccessoryClicked((GlobalSearchViewModel.Item) obj6, ((GlobalSearchViewModel$Item$Accessory$ButtonAccessory) obj5).button.actionUrl));
                break;
            case 15:
                State state2 = (State) obj7;
                State state3 = (State) obj6;
                float[] rotationTransform = ((Quat) ((State) obj5).getValue()).toRotationTransform();
                Matrix.scaleM(rotationTransform, 0, ((Number) state2.getValue()).floatValue(), ((Number) state2.getValue()).floatValue(), ((Number) state2.getValue()).floatValue());
                float[] fArr = new float[16];
                Matrix.setIdentityM(fArr, 0);
                Matrix.translateM(fArr, 0, ((Vector4) state3.getValue()).vector[0], ((Vector4) state3.getValue()).vector[1], ((Vector4) state3.getValue()).vector[2]);
                Matrix4 matrix4 = new Matrix4();
                Matrix.multiplyMM(matrix4.matrix, 0, fArr, 0, rotationTransform, 0);
                break;
            case 16:
                break;
            case 17:
                Function1 function15 = (Function1) obj6;
                ((MutableState) obj5).setValue(Boolean.FALSE);
                if (((GrowToolsManagerViewModel.Loaded.Dialog) obj7).isError) {
                    function15.invoke(new GrowToolsManagerViewEvent.DialogDismissTapped(true));
                } else {
                    function15.invoke(GrowToolsManagerViewEvent.DialogConfirmTapped.INSTANCE);
                }
                break;
            case 18:
                ActivityToken create$default = RealActivityTokenFactory.create$default((RealActivityTokenFactory) obj7, ActivityTokenType.CUSTOMER_TOKEN);
                ActivityScope activityScope = ActivityScope.MY_ACTIVITY;
                String str24 = (String) ((PaymentHistoryScreens$ProfileCompletePaymentHistory) ((CardStudioPresenter) obj5).args).profileId.getValue();
                str24.getClass();
                ActivityClientService activityClientService = (ActivityClientService) ((CounterpartyPageRequestHandler$Factory$Impl) obj6).delegateFactory.staticImageLoader.invoke();
                activityClientService.getClass();
                break;
            case 19:
                ActivityToken create$default2 = RealActivityTokenFactory.create$default((RealActivityTokenFactory) obj7, ActivityTokenType.CUSTOMER_TOKEN);
                ActivityScope activityScope2 = ActivityScope.MY_ACTIVITY;
                String str25 = (String) ((ProfilePaymentHistoryPresenter) obj5).args.profileId.getValue();
                str25.getClass();
                ActivityClientService activityClientService2 = (ActivityClientService) ((CounterpartyPageRequestHandler$Factory$Impl) obj6).delegateFactory.staticImageLoader.invoke();
                activityClientService2.getClass();
                break;
            case 20:
                ((Function1) obj7).invoke(new SelectPaymentInstrumentViewEvent$SelectPaymentInstrument((SelectPaymentInstrumentViewModel.PaymentInstrument) ((SelectPaymentInstrumentViewModel) obj6).instruments.get(((ParcelableSnapshotMutableIntState) obj5).getIntValue())));
                break;
            case 21:
                ((Function1) obj7).invoke(new InvestingCategoryFilterViewEvent.ToggleCheckboxOption(((InvestingCategoryFilterViewModel.Content.FilterOption.Checkbox) obj5).token, ((InvestingCategoryFilterViewModel.Content.FilterSection) obj6).token, !r6.selected));
                break;
            case 22:
                InvestingExchangeViewModel investingExchangeViewModel = (InvestingExchangeViewModel) obj7;
                MutableState mutableState3 = (MutableState) obj6;
                MutableState mutableState4 = (MutableState) obj5;
                if ((!(investingExchangeViewModel instanceof InvestingExchangeViewModel.Content.FullScreenContent) || !((Boolean) mutableState3.getValue()).booleanValue()) && (!(investingExchangeViewModel instanceof InvestingExchangeViewModel.Content.BottomSheetContent) || !((Boolean) mutableState4.getValue()).booleanValue())) {
                    z2 = false;
                }
                break;
            case 23:
                InvestingSecurityTileContentModel investingSecurityTileContentModel = (InvestingSecurityTileContentModel) obj6;
                ((Function1) obj7).invoke(new InvestingSearchViewEvent.StockClicked(investingSecurityTileContentModel.token, new InvestingSearchViewEvent.StockClicked.SearchStockOrigin.SearchCarousel((List) obj5), investingSecurityTileContentModel.ticker));
                break;
            case 24:
                CollapsingToolbarScaffoldState collapsingToolbarScaffoldState = (CollapsingToolbarScaffoldState) obj7;
                CoroutineScope coroutineScope = (CoroutineScope) obj6;
                SearchBarKeyboardState searchBarKeyboardState = (SearchBarKeyboardState) obj5;
                if (!InviteErrorDialogKt.isExpanded(collapsingToolbarScaffoldState.toolbarState)) {
                    JobKt.launch$default(coroutineScope, null, null, new InviteContactsBodyKt$InviteContactsBody$4$2$1$2$1$1(collapsingToolbarScaffoldState, r3, z2 ? 1 : 0), 3);
                    searchBarKeyboardState.setOpen(false);
                }
                break;
            case 25:
                break;
            case 26:
                InviteContactsViewModel inviteContactsViewModel = (InviteContactsViewModel) obj7;
                DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController2 = (DelegatingSoftwareKeyboardController) obj6;
                Function1 function16 = (Function1) obj5;
                InviteErrorDialogKt inviteErrorDialogKt = inviteContactsViewModel.state;
                inviteErrorDialogKt.getClass();
                if ((((InviteContactsViewModel$State$ShowInvite) inviteErrorDialogKt).onInvite instanceof InviteContactsViewEvent.ShowConsent) && delegatingSoftwareKeyboardController2 != null) {
                    delegatingSoftwareKeyboardController2.hide();
                }
                InviteErrorDialogKt inviteErrorDialogKt2 = inviteContactsViewModel.state;
                inviteErrorDialogKt2.getClass();
                function16.invoke(((InviteContactsViewModel$State$ShowInvite) inviteErrorDialogKt2).onInvite);
                break;
            case 27:
                GenieStateBinding genieStateBinding = (GenieStateBinding) obj6;
                MutableState mutableState5 = (MutableState) obj5;
                Long selectedDateMillis = ((DatePickerStateImpl) obj7).getSelectedDateMillis();
                if (selectedDateMillis != null) {
                    String format2 = Instant.ofEpochMilli(selectedDateMillis.longValue()).atZone(ZoneOffset.UTC).toLocalDate().format(DateTimeFormatter.ISO_LOCAL_DATE);
                    format2.getClass();
                    genieStateBinding.setValue(format2);
                }
                mutableState5.setValue(Boolean.FALSE);
                break;
            case 28:
                ((GenieStateBinding) obj7).setValue((String) obj6);
                ((MutableState) obj5).setValue(Boolean.FALSE);
                break;
            default:
                Function1 function17 = (Function1) obj6;
                AmountKeypadState amountKeypadState = (AmountKeypadState) obj5;
                if (((MoneybotAmountInputViewModel) obj7).enableContinue) {
                    function17.invoke(MoneybotAmountInputViewEvent.ContinueTapped.INSTANCE);
                } else {
                    amountKeypadState.shake();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ GLSceneScope$$ExternalSyntheticLambda2(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    public /* synthetic */ GLSceneScope$$ExternalSyntheticLambda2(Matrix4 matrix4, Matrix4 matrix42, State state) {
        this.$r8$classId = 16;
        this.f$1 = matrix4;
        this.f$0 = matrix42;
        this.f$2 = state;
    }
}
