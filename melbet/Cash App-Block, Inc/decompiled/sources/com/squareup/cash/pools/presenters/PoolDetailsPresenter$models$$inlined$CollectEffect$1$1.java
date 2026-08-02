package com.squareup.cash.pools.presenters;

import androidx.camera.video.internal.utils.StorageUtil;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.State;
import androidx.room.util.DBUtil;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.local.navigation.launcher.RealLocalLauncher;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.presenters.RealBrandFollowPresenter$models$2$1$1;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.local.primitives.BrandCollectionData;
import app.cash.local.primitives.GpsCoordinates;
import app.cash.local.screens.app.LocalPosCheckInScreen;
import app.cash.local.viewmodels.BrandFollowViewEvent$Toggled;
import app.cash.local.viewmodels.wallet.BrandCollectionEvent;
import app.cash.local.viewmodels.wallet.BrandCollectionMapViewEvent;
import app.cash.local.viewmodels.wallet.BrandSheetViewEvent;
import app.cash.molecule.PlatformKt;
import app.cash.versioned.VersionedKt;
import com.google.android.gms.internal.mlkit_genai_prompt.zzaky;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.autofillweb.api.AutofillWebField;
import com.squareup.cash.blockers.presenters.EarnerEnrollmentBlockerPresenter;
import com.squareup.cash.blockers.presenters.EarnerOnboardingAnalytics;
import com.squareup.cash.blockers.presenters.EarnerOnboardingScreen;
import com.squareup.cash.blockers.presenters.SsnPresenter$models$2$2;
import com.squareup.cash.blockers.viewmodels.EarnerEnrollmentBlockerViewEvent;
import com.squareup.cash.cdf.asset.AssetPoolAddMemberStart;
import com.squareup.cash.cdf.asset.AssetPoolClosePoolStart;
import com.squareup.cash.cdf.asset.AssetPoolPoolContributionStart;
import com.squareup.cash.cdf.asset.AssetPoolPoolHomeViewExit;
import com.squareup.cash.cdf.asset.PoolViewerType;
import com.squareup.cash.cdf.browser.BrowserCheckoutDismissAutofillInfo;
import com.squareup.cash.cdf.browser.BrowserCheckoutDismissSaveAutofillInfo;
import com.squareup.cash.cdf.browser.BrowserCheckoutDismissUpdateAutofillInfo;
import com.squareup.cash.cdf.browser.BrowserCheckoutTapAutofillButton;
import com.squareup.cash.cdf.browser.BrowserCheckoutTapSaveAutofillButton;
import com.squareup.cash.cdf.browser.BrowserCheckoutTapUpdateAutofillButton;
import com.squareup.cash.cdf.browser.BrowserTapEditAutofillDetails;
import com.squareup.cash.cdf.earnings.EarningsOnboardingSelectCategory;
import com.squareup.cash.cdf.earnings.EarningsOnboardingSubmitCategory;
import com.squareup.cash.cdf.earnings.EarningsOnboardingViewCategoryPicker;
import com.squareup.cash.cdf.localclient.LocalClientMapToggleFullsheet;
import com.squareup.cash.cdf.moneybot.ChatContentState;
import com.squareup.cash.cdf.moneybot.MoneybotChatClose;
import com.squareup.cash.cdf.moneybot.MoneybotChatOpen;
import com.squareup.cash.cdf.moneybot.MoneybotChatViewHistory;
import com.squareup.cash.cdf.moneybot.MoneybotInChatPromptClick;
import com.squareup.cash.cdf.moneybot.MoneybotOverflowMenuSelectItem;
import com.squareup.cash.cdf.moneybot.MoneybotQuickActionTap;
import com.squareup.cash.cdf.moneybot.MoneybotSurface;
import com.squareup.cash.cdf.system.SystemNotificationSettingsOrigin;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.data.FeatureContext;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealFlowStarter;
import com.squareup.cash.db2.profile.Profile;
import com.squareup.cash.featureflags.AmplitudeExperiments$MoneybotFeedbackSheet;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.maps.presenter.CashMapPresenter$models$3$1;
import com.squareup.cash.maps.viewmodels.LatLng;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda13;
import com.squareup.cash.moneybot.analytics.RealMoneybotAnalyticsService;
import com.squareup.cash.moneybot.backend.api.MoneybotChatScrollPosition;
import com.squareup.cash.moneybot.backend.api.model.chat.ChatKickoffParams;
import com.squareup.cash.moneybot.backend.real.managers.RealChatSessionManager;
import com.squareup.cash.moneybot.presenters.MoneybotChatPresenter;
import com.squareup.cash.moneybot.presenters.MoneybotChatPresenter$models$10$1;
import com.squareup.cash.moneybot.presenters.MoneybotChatPresenter$models$3$1;
import com.squareup.cash.moneybot.presenters.MoneybotChatPresenter$processChatEvent$9;
import com.squareup.cash.moneybot.presenters.MoneybotChatPresenterKt;
import com.squareup.cash.moneybot.screens.ChatSourceContext;
import com.squareup.cash.moneybot.screens.HomeSourceContext;
import com.squareup.cash.moneybot.screens.MoneybotChatEntryPoint;
import com.squareup.cash.moneybot.screens.MoneybotChatHistoryScreen;
import com.squareup.cash.moneybot.screens.MoneybotChatScreen;
import com.squareup.cash.moneybot.screens.MoneybotDebugOverlayScreen;
import com.squareup.cash.moneybot.screens.MoneybotFeedbackQuestion;
import com.squareup.cash.moneybot.screens.MoneybotOverflowMenuScreen;
import com.squareup.cash.moneybot.screens.MoneybotPendingSheet$TransferOptionPicker;
import com.squareup.cash.moneybot.screens.ThumbDirection;
import com.squareup.cash.moneybot.viewmodels.chat.ChatCardViewEvent;
import com.squareup.cash.moneybot.viewmodels.chat.ChatFooterViewModel$Attachment$ImageAttachment;
import com.squareup.cash.moneybot.viewmodels.chat.MessageViewModel;
import com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewEvent;
import com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewEvent$SuggestionEvent$StartChatWithSuggestion;
import com.squareup.cash.music.presenters.MusicPresenter$models$1$1;
import com.squareup.cash.music.presenters.MusicPresenter$models$2$1;
import com.squareup.cash.music.presenters.MusicPresenter$models$3$1;
import com.squareup.cash.payments.presenters.PaymentLoadingPresenter;
import com.squareup.cash.pools.backend.api.LoadPoolStatus;
import com.squareup.cash.pools.screens.PoolContributeScreen;
import com.squareup.cash.pools.screens.PoolDetailsScreen;
import com.squareup.cash.pools.screens.PoolInvitePeopleListScreen;
import com.squareup.cash.pools.screens.PoolMemberListScreen;
import com.squareup.cash.pools.screens.PoolMoreOptionsBottomSheet;
import com.squareup.cash.pools.viewmodels.PoolDetailsViewEvent;
import com.squareup.cash.profile.presenters.ProfilePresenter;
import com.squareup.cash.profile.presenters.notifications.CategoryListPresenter$models$2$2;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.profile.viewmodels.Category;
import com.squareup.cash.profile.viewmodels.CategoryListType;
import com.squareup.cash.profile.viewmodels.CategoryListViewEvent;
import com.squareup.cash.qrcodes.presenters.RealQrCodesPresenter$models$1$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Back;
import com.squareup.cash.screens.RedactedParcelable;
import com.squareup.cash.screens.RedactedParcelableList;
import com.squareup.cash.screens.RedactedString;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.shopping.autofill.presenters.AutofillMapperKt;
import com.squareup.cash.shopping.autofill.presenters.ShoppingAutofillAnalyticsHandler;
import com.squareup.cash.shopping.autofill.screens.AutofillAnalyticsParam;
import com.squareup.cash.shopping.autofill.screens.AutofillScreen;
import com.squareup.cash.shopping.autofill.screens.EditAutofillScreen;
import com.squareup.cash.shopping.autofill.viewmodels.AutofillViewEvent;
import com.squareup.cash.shopping.screens.AutofillQuestion;
import com.squareup.cash.util.money.Moneys;
import com.squareup.protos.cash.grantly.api.FullName;
import com.squareup.protos.cash.kgoose.api.v3.FeedbackType;
import com.squareup.protos.cash.pools.MoneyPool;
import com.squareup.protos.cash.pools.PoolOwner;
import com.squareup.protos.cash.pools.PoolParticipant;
import com.squareup.protos.cash.pools.PoolParticipantType;
import com.squareup.protos.cash.pools.PoolState;
import com.squareup.protos.cash.pools.PoolSurcharge;
import com.squareup.protos.common.Money;
import com.squareup.util.coroutines.StateFlowKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import squareup.cash.earnings.EarnerCategory;

/* loaded from: classes6.dex */
public final class PoolDetailsPresenter$models$$inlined$CollectEffect$1$1 implements FlowCollector {
    public final /* synthetic */ Object $$this$LaunchedEffect;
    public final /* synthetic */ Object $contributionCompleted$delegate$inlined;
    public final /* synthetic */ Object $error$delegate$inlined;
    public final /* synthetic */ Object $isRefreshing$delegate$inlined;
    public final /* synthetic */ State $participants$delegate$inlined;
    public final /* synthetic */ MutableState $pool$delegate$inlined;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState $viewerCanLeavePool$delegate$inlined;
    public final /* synthetic */ Object this$0;

    public PoolDetailsPresenter$models$$inlined$CollectEffect$1$1(CoroutineScope coroutineScope, LocalEditorialPresenter localEditorialPresenter, CoroutineScope coroutineScope2, MutableState mutableState, State state, Function1 function1, Function0 function0, State state2, MutableState mutableState2) {
        this.$r8$classId = 5;
        this.this$0 = localEditorialPresenter;
        this.$$this$LaunchedEffect = coroutineScope2;
        this.$pool$delegate$inlined = mutableState;
        this.$participants$delegate$inlined = state;
        this.$error$delegate$inlined = function1;
        this.$isRefreshing$delegate$inlined = function0;
        this.$contributionCompleted$delegate$inlined = state2;
        this.$viewerCanLeavePool$delegate$inlined = mutableState2;
    }

    private final Object emit$com$squareup$cash$profile$presenters$notifications$CategoryListPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        MutableState mutableState = (MutableState) this.$participants$delegate$inlined;
        PaymentLoadingPresenter paymentLoadingPresenter = (PaymentLoadingPresenter) this.this$0;
        ProfileScreens.CategoryListScreen categoryListScreen = (ProfileScreens.CategoryListScreen) paymentLoadingPresenter.flowToken;
        BetterNavigator.ScreenNavigator screenNavigator = paymentLoadingPresenter.navigator;
        CoroutineScope coroutineScope = (CoroutineScope) this.$$this$LaunchedEffect;
        CategoryListViewEvent categoryListViewEvent = (CategoryListViewEvent) obj;
        if (categoryListViewEvent instanceof CategoryListViewEvent.GoBack) {
            screenNavigator.goTo(Back.INSTANCE);
        } else {
            if (categoryListViewEvent instanceof CategoryListViewEvent.CategoryClicked) {
                Category category = ((CategoryListViewEvent.CategoryClicked) categoryListViewEvent).category;
                Category.CategoryType categoryType = category.categoryType;
                if (categoryType instanceof Category.CategoryType.CategoryList) {
                    screenNavigator.goTo(new ProfileScreens.CategoryListScreen(((Category.CategoryType.CategoryList) category.categoryType).categoryListType == CategoryListType.INVESTING ? ((AndroidStringManager) paymentLoadingPresenter.flowStarter).get(R.string.investing_category_title) : null, ((Category.CategoryType.CategoryList) categoryType).categoryListType, categoryListScreen.ownerAccountToken));
                } else {
                    if (!(categoryType instanceof Category.CategoryType.ChannelList)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    screenNavigator.goTo(new ProfileScreens.ChannelListScreen(((Category.CategoryType.ChannelList) categoryType).notificationCategory, categoryListScreen.ownerAccountToken));
                }
            } else if (categoryListViewEvent instanceof CategoryListViewEvent.ParentToggleClicked) {
                JobKt.launch$default(coroutineScope, null, null, new CategoryListPresenter$models$2$2(this.$pool$delegate$inlined, paymentLoadingPresenter, (String) this.$contributionCompleted$delegate$inlined, categoryListViewEvent, this.$viewerCanLeavePool$delegate$inlined, mutableState, (MutableState) this.$error$delegate$inlined, (MutableState) this.$isRefreshing$delegate$inlined, null), 3);
            } else if (Intrinsics.areEqual(categoryListViewEvent, CategoryListViewEvent.DialogDismissed.INSTANCE)) {
                mutableState.setValue(Boolean.FALSE);
            } else {
                if (!Intrinsics.areEqual(categoryListViewEvent, CategoryListViewEvent.OpenNotificationSettingsClick.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                ((IntentLauncher) paymentLoadingPresenter.args).launchNotificationSettings();
                zzaky.trackSystemOpenNotificationSettings((Analytics) paymentLoadingPresenter.analytics, SystemNotificationSettingsOrigin.NOTIFICATION_SETTINGS_CHANNEL);
                mutableState.setValue(Boolean.FALSE);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [kotlin.coroutines.CoroutineContext, kotlinx.coroutines.CoroutineStart] */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        ?? r4;
        boolean z;
        PoolSurcharge poolSurcharge;
        Boolean valueOf;
        AssetPoolPoolHomeViewExit.MemberType memberType;
        PoolOwner poolOwner;
        Object obj2;
        MoneybotQuickActionTap.QuickActionType quickActionType;
        MoneybotQuickActionTap.QuickActionType quickActionType2;
        MoneybotQuickActionTap.QuickActionType quickActionType3;
        String str;
        String str2;
        int i = this.$r8$classId;
        Back back = Back.INSTANCE;
        MutableState mutableState = this.$pool$delegate$inlined;
        Object obj3 = this.$contributionCompleted$delegate$inlined;
        MutableState mutableState2 = this.$viewerCanLeavePool$delegate$inlined;
        Object obj4 = this.this$0;
        State state = this.$participants$delegate$inlined;
        Object obj5 = this.$$this$LaunchedEffect;
        Object obj6 = this.$isRefreshing$delegate$inlined;
        Object obj7 = this.$error$delegate$inlined;
        switch (i) {
            case 0:
                MutableState mutableState3 = (MutableState) obj7;
                MutableState mutableState4 = (MutableState) state;
                ProfilePresenter profilePresenter = (ProfilePresenter) obj4;
                SessionManager sessionManager = (SessionManager) profilePresenter.jurisdictionConfigManager;
                Analytics analytics = profilePresenter.analytics;
                String str3 = (String) profilePresenter.profileDetailsProvider;
                BetterNavigator.ScreenNavigator screenNavigator = profilePresenter.navigator;
                PoolDetailsScreen poolDetailsScreen = (PoolDetailsScreen) profilePresenter.paymentsInboundNavigator;
                CoroutineScope coroutineScope = (CoroutineScope) obj5;
                PoolDetailsViewEvent poolDetailsViewEvent = (PoolDetailsViewEvent) obj;
                boolean z2 = poolDetailsViewEvent instanceof PoolDetailsViewEvent.AdditionalOptionsTapped;
                MutableState mutableState5 = this.$pool$delegate$inlined;
                if (z2) {
                    MoneyPool moneyPool = (MoneyPool) mutableState5.getValue();
                    moneyPool.getClass();
                    screenNavigator.goTo(new PoolMoreOptionsBottomSheet(new RedactedParcelable(moneyPool), ((Boolean) mutableState2.getValue()).booleanValue(), str3, ProfilePresenter.access$getOriginForLeavePool(profilePresenter, poolDetailsScreen.origin)));
                } else if (poolDetailsViewEvent instanceof PoolDetailsViewEvent.ShareTapped) {
                    IntentLauncher intentLauncher = (IntentLauncher) profilePresenter.favoritesManager;
                    MoneyPool moneyPool2 = (MoneyPool) mutableState5.getValue();
                    moneyPool2.getClass();
                    String str4 = moneyPool2.share_link;
                    str4.getClass();
                    intentLauncher.shareText(str4, null, null);
                } else if (poolDetailsViewEvent instanceof PoolDetailsViewEvent.Close) {
                    String str5 = poolDetailsScreen.token;
                    MoneyPool moneyPool3 = (MoneyPool) mutableState5.getValue();
                    if (((moneyPool3 == null || (poolOwner = moneyPool3.owner) == null) ? null : poolOwner.customer_token) == null) {
                        valueOf = null;
                    } else {
                        MoneyPool moneyPool4 = (MoneyPool) mutableState5.getValue();
                        moneyPool4.getClass();
                        PoolOwner poolOwner2 = moneyPool4.owner;
                        poolOwner2.getClass();
                        valueOf = Boolean.valueOf(Intrinsics.areEqual(poolOwner2.customer_token, PlatformKt.activeAccountTokenOrNull(sessionManager)));
                    }
                    str3.getClass();
                    str5.getClass();
                    if (Intrinsics.areEqual(valueOf, Boolean.TRUE)) {
                        memberType = AssetPoolPoolHomeViewExit.MemberType.OWNER;
                    } else if (Intrinsics.areEqual(valueOf, Boolean.FALSE)) {
                        memberType = AssetPoolPoolHomeViewExit.MemberType.CONTRIBUTOR;
                    } else {
                        if (valueOf != null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        memberType = null;
                    }
                    analytics.track(new AssetPoolPoolHomeViewExit(memberType, str3, str5), null);
                    screenNavigator.goTo(back);
                } else if (poolDetailsViewEvent instanceof PoolDetailsViewEvent.ContributeTapped) {
                    String str6 = poolDetailsScreen.token;
                    MoneyPool moneyPool5 = (MoneyPool) mutableState5.getValue();
                    moneyPool5.getClass();
                    double amount = Moneys.amount(moneyPool5.target);
                    MoneyPool moneyPool6 = (MoneyPool) mutableState5.getValue();
                    moneyPool6.getClass();
                    double amount2 = Moneys.amount(moneyPool6.balance);
                    MoneyPool moneyPool7 = (MoneyPool) mutableState5.getValue();
                    moneyPool7.getClass();
                    PoolOwner poolOwner3 = moneyPool7.owner;
                    poolOwner3.getClass();
                    boolean areEqual = Intrinsics.areEqual(poolOwner3.customer_token, PlatformKt.activeAccountTokenOrNull(sessionManager));
                    str6.getClass();
                    str3.getClass();
                    analytics.track(new AssetPoolPoolContributionStart(areEqual ? PoolViewerType.OWNER : PoolViewerType.CONTRIBUTOR, str6, Double.valueOf(amount), Double.valueOf(amount2), str3), null);
                    MoneyPool moneyPool8 = (MoneyPool) mutableState5.getValue();
                    moneyPool8.getClass();
                    PoolOwner poolOwner4 = moneyPool8.owner;
                    poolOwner4.getClass();
                    String str7 = poolOwner4.full_name;
                    if (str7 == null) {
                        str7 = "";
                    }
                    RedactedString redactedString = new RedactedString(str7);
                    MoneyPool moneyPool9 = (MoneyPool) mutableState5.getValue();
                    moneyPool9.getClass();
                    PoolOwner poolOwner5 = moneyPool9.owner;
                    poolOwner5.getClass();
                    String str8 = poolOwner5.customer_token;
                    if (str8 == null) {
                        str8 = "";
                    }
                    RedactedString redactedString2 = new RedactedString(str8);
                    String str9 = poolDetailsScreen.token;
                    MoneyPool moneyPool10 = (MoneyPool) mutableState5.getValue();
                    moneyPool10.getClass();
                    String str10 = moneyPool10.name;
                    if (str10 == null) {
                        str10 = "";
                    }
                    RedactedString redactedString3 = new RedactedString(str10);
                    MoneyPool moneyPool11 = (MoneyPool) mutableState5.getValue();
                    moneyPool11.getClass();
                    Money money = moneyPool11.balance;
                    money.getClass();
                    MoneyPool moneyPool12 = (MoneyPool) mutableState5.getValue();
                    Long l = (moneyPool12 == null || (poolSurcharge = moneyPool12.surcharge) == null) ? null : poolSurcharge.in_network_p2p_credit_card_fee_bps;
                    String str11 = (String) profilePresenter.profileDetailsProvider;
                    MoneyPool moneyPool13 = (MoneyPool) mutableState5.getValue();
                    moneyPool13.getClass();
                    screenNavigator.goTo(new PoolContributeScreen(redactedString, redactedString2, str9, redactedString3, money, l, str11, new RedactedParcelable(moneyPool13)));
                } else if (poolDetailsViewEvent instanceof PoolDetailsViewEvent.ClosePoolTapped) {
                    String str12 = poolDetailsScreen.token;
                    MoneyPool moneyPool14 = (MoneyPool) mutableState5.getValue();
                    moneyPool14.getClass();
                    double amount3 = Moneys.amount(moneyPool14.balance);
                    str3.getClass();
                    str12.getClass();
                    analytics.track(new AssetPoolClosePoolStart(Double.valueOf(amount3), str3, str12), null);
                    FlowStarter flowStarter = (FlowStarter) profilePresenter.principalAccountToken;
                    String str13 = poolDetailsScreen.token;
                    screenNavigator.goTo(((RealFlowStarter) flowStarter).startClosePoolFlow(str13, new PoolDetailsScreen(str13, null, null, null, null, null, 62)));
                } else if (poolDetailsViewEvent instanceof PoolDetailsViewEvent.CurrentMembersTapped) {
                    String str14 = poolDetailsScreen.token;
                    MoneyPool moneyPool15 = (MoneyPool) mutableState5.getValue();
                    moneyPool15.getClass();
                    PoolOwner poolOwner6 = moneyPool15.owner;
                    poolOwner6.getClass();
                    RedactedParcelable redactedParcelable = new RedactedParcelable(poolOwner6);
                    RedactedParcelableList redactList = DBUtil.redactList((List) mutableState4.getValue());
                    MoneyPool moneyPool16 = (MoneyPool) mutableState5.getValue();
                    moneyPool16.getClass();
                    String str15 = moneyPool16.share_link;
                    boolean booleanValue = ((Boolean) mutableState2.getValue()).booleanValue();
                    String str16 = (String) profilePresenter.profileDetailsProvider;
                    MoneyPool moneyPool17 = (MoneyPool) mutableState5.getValue();
                    moneyPool17.getClass();
                    double amount4 = Moneys.amount(moneyPool17.target);
                    MoneyPool moneyPool18 = (MoneyPool) mutableState5.getValue();
                    moneyPool18.getClass();
                    double amount5 = Moneys.amount(moneyPool18.balance);
                    MoneyPool moneyPool19 = (MoneyPool) mutableState5.getValue();
                    moneyPool19.getClass();
                    if (moneyPool19.status != PoolState.POOL_STATE_MANUAL_CLOSED) {
                        MoneyPool moneyPool20 = (MoneyPool) mutableState5.getValue();
                        moneyPool20.getClass();
                        if (moneyPool20.closed_at == null) {
                            MoneyPool moneyPool21 = (MoneyPool) mutableState5.getValue();
                            moneyPool21.getClass();
                            if (moneyPool21.status != PoolState.POOL_STATE_CLOSING) {
                                z = false;
                                screenNavigator.goTo(new PoolMemberListScreen(str14, redactedParcelable, redactList, str15, booleanValue, str16, amount4, amount5, z, ProfilePresenter.access$getOriginForLeavePool(profilePresenter, poolDetailsScreen.origin)));
                            }
                        }
                    }
                    z = true;
                    screenNavigator.goTo(new PoolMemberListScreen(str14, redactedParcelable, redactList, str15, booleanValue, str16, amount4, amount5, z, ProfilePresenter.access$getOriginForLeavePool(profilePresenter, poolDetailsScreen.origin)));
                } else if (poolDetailsViewEvent instanceof PoolDetailsViewEvent.InvitePeopleTapped) {
                    List list = (List) mutableState4.getValue();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj8 : list) {
                        if (((PoolParticipant) obj8).participant_type == PoolParticipantType.POOL_PARTICIPANT_TYPE_CASH_APP_USER) {
                            arrayList.add(obj8);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String str17 = ((PoolParticipant) it.next()).customer_identifier;
                        if (str17 != null) {
                            arrayList2.add(str17);
                        }
                    }
                    String str18 = poolDetailsScreen.token;
                    MoneyPool moneyPool22 = (MoneyPool) mutableState5.getValue();
                    screenNavigator.goTo(new PoolInvitePeopleListScreen(str18, arrayList2, moneyPool22 != null ? moneyPool22.share_link : null, null, AssetPoolAddMemberStart.AddMemberSource.POOL_HOME, (String) profilePresenter.profileDetailsProvider));
                } else if (poolDetailsViewEvent instanceof PoolDetailsViewEvent.Refresh) {
                    if (((LoadPoolStatus) mutableState3.getValue()) == null) {
                        ((MutableState) obj6).setValue(Boolean.TRUE);
                        r4 = 0;
                    } else {
                        r4 = 0;
                        mutableState3.setValue(null);
                        mutableState5.setValue(null);
                    }
                    JobKt.launch$default(coroutineScope, r4, r4, new PoolsListPresenter$models$2$2(profilePresenter, (MutableState) obj6, (MutableState) obj7, mutableState5, this.$viewerCanLeavePool$delegate$inlined, null, 11), 3);
                } else if (poolDetailsViewEvent instanceof PoolDetailsViewEvent.GoalMetAnimationShown) {
                    JobKt.launch$default(coroutineScope, null, null, new MusicPresenter$models$3$1(profilePresenter, null, 29), 3);
                } else {
                    if (!(poolDetailsViewEvent instanceof PoolDetailsViewEvent.ContributionAnimationShown)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ((MutableState) obj3).setValue(Boolean.TRUE);
                }
                return Unit.INSTANCE;
            case 1:
                MutableSharedFlow mutableSharedFlow = (MutableSharedFlow) obj4;
                LocalHomePresenter localHomePresenter = (LocalHomePresenter) obj5;
                RealLocalLauncher realLocalLauncher = (RealLocalLauncher) localHomePresenter.tabContentPresenterFactory;
                BetterNavigator.ScreenNavigator screenNavigator2 = (BetterNavigator.ScreenNavigator) localHomePresenter.navigator;
                BrandCollectionMapViewEvent brandCollectionMapViewEvent = (BrandCollectionMapViewEvent) obj;
                if (brandCollectionMapViewEvent instanceof BrandCollectionMapViewEvent.BackClicked) {
                    screenNavigator2.goTo(back);
                } else {
                    boolean z3 = brandCollectionMapViewEvent instanceof BrandSheetViewEvent;
                    BrandFollowViewEvent$Toggled brandFollowViewEvent$Toggled = BrandFollowViewEvent$Toggled.INSTANCE;
                    if (z3) {
                        BrandSheetViewEvent brandSheetViewEvent = (BrandSheetViewEvent) brandCollectionMapViewEvent;
                        if (brandSheetViewEvent instanceof BrandSheetViewEvent.CheckInClicked) {
                            screenNavigator2.goTo(LocalPosCheckInScreen.INSTANCE);
                        } else if (brandSheetViewEvent instanceof BrandSheetViewEvent.Dismissed) {
                            mutableState.setValue(null);
                        } else if (brandSheetViewEvent instanceof BrandSheetViewEvent.ProfileClicked) {
                            String str19 = (String) mutableState.getValue();
                            if (str19 != null) {
                                realLocalLauncher.openWeb(screenNavigator2, str19);
                            }
                        } else {
                            if (!(brandSheetViewEvent instanceof BrandSheetViewEvent.AddBrandClicked)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            StateFlowKt.emitOrThrow(mutableSharedFlow, brandFollowViewEvent$Toggled);
                        }
                    } else if (brandCollectionMapViewEvent instanceof BrandCollectionEvent) {
                        BrandCollectionEvent brandCollectionEvent = (BrandCollectionEvent) brandCollectionMapViewEvent;
                        if (brandCollectionEvent instanceof BrandCollectionEvent.LocationRowClicked) {
                            Iterator it2 = ((List) obj6).iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    Object next = it2.next();
                                    if (Intrinsics.areEqual(((BrandCollectionData.Location) next).clientRoute, ((BrandCollectionEvent.LocationRowClicked) brandCollectionMapViewEvent).clientRoute)) {
                                        obj2 = next;
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            BrandCollectionData.Location location = (BrandCollectionData.Location) obj2;
                            if (location != null) {
                                GpsCoordinates gpsCoordinates = location.gpsCoordinates;
                                mutableState2.setValue(new Pair(new Integer(((Number) ((Pair) mutableState2.getValue()).first).intValue() + 1), new LatLng(gpsCoordinates.latitude, gpsCoordinates.longitude)));
                            }
                            MutableState mutableState6 = (MutableState) state;
                            mutableState6.setValue(new Pair(new Integer(((Number) ((Pair) mutableState6.getValue()).first).intValue() + 1), ((BrandCollectionEvent.LocationRowClicked) brandCollectionMapViewEvent).clientRoute));
                        } else if (brandCollectionEvent instanceof BrandCollectionEvent.SearchInputChanged) {
                            ((MutableState) obj7).setValue(((BrandCollectionEvent.SearchInputChanged) brandCollectionMapViewEvent).text);
                        } else if (brandCollectionEvent instanceof BrandCollectionEvent.PrimaryCtaClicked) {
                            realLocalLauncher.openWeb(screenNavigator2, ((BrandCollectionEvent.PrimaryCtaClicked) brandCollectionMapViewEvent).clientRoute);
                        } else {
                            if (!(brandCollectionEvent instanceof BrandCollectionEvent.BrandFollowToggled)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            BrandCollectionData.Location location2 = (BrandCollectionData.Location) obj3;
                            if (Intrinsics.areEqual(location2 != null ? location2.brandSpot : null, ((BrandCollectionEvent.BrandFollowToggled) brandCollectionMapViewEvent).brandSpot)) {
                                StateFlowKt.emitOrThrow(mutableSharedFlow, brandFollowViewEvent$Toggled);
                            }
                        }
                    } else if (brandCollectionMapViewEvent instanceof BrandCollectionMapViewEvent.SheetToggled) {
                        ((Analytics) localHomePresenter.embeddedMapEnabled$delegate).track(new LocalClientMapToggleFullsheet(), null);
                    } else {
                        if (!(brandCollectionMapViewEvent instanceof BrandCollectionMapViewEvent.LocationSelectorClicked)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        realLocalLauncher.openWeb(screenNavigator2, ((BrandCollectionMapViewEvent.LocationSelectorClicked) brandCollectionMapViewEvent).clientRoute);
                    }
                }
                return Unit.INSTANCE;
            case 2:
                MutableState mutableState7 = (MutableState) obj6;
                MutableState mutableState8 = (MutableState) obj7;
                MutableState mutableState9 = (MutableState) state;
                String str20 = (String) obj3;
                EarnerEnrollmentBlockerPresenter earnerEnrollmentBlockerPresenter = (EarnerEnrollmentBlockerPresenter) obj4;
                BetterNavigator.ScreenNavigator screenNavigator3 = earnerEnrollmentBlockerPresenter.navigator;
                EarnerOnboardingAnalytics earnerOnboardingAnalytics = earnerEnrollmentBlockerPresenter.earnerOnboardingAnalytics;
                CoroutineScope coroutineScope2 = (CoroutineScope) obj5;
                EarnerEnrollmentBlockerViewEvent earnerEnrollmentBlockerViewEvent = (EarnerEnrollmentBlockerViewEvent) obj;
                if (Intrinsics.areEqual(earnerEnrollmentBlockerViewEvent, EarnerEnrollmentBlockerViewEvent.Back.INSTANCE)) {
                    if (((EarnerEnrollmentBlockerPresenter.Step) mutableState.getValue()) == EarnerEnrollmentBlockerPresenter.Step.CATEGORY_SELECTION) {
                        earnerOnboardingAnalytics.trackDismiss(str20, EarnerOnboardingScreen.CATEGORY_PICKER);
                        mutableState9.setValue((EarnerCategory) mutableState2.getValue());
                        mutableState.setValue(EarnerEnrollmentBlockerPresenter.Step.FORM);
                    } else {
                        earnerOnboardingAnalytics.trackDismiss(str20, EarnerOnboardingScreen.CATEGORY_SELECTION);
                        screenNavigator3.goTo(back);
                    }
                } else if (Intrinsics.areEqual(earnerEnrollmentBlockerViewEvent, EarnerEnrollmentBlockerViewEvent.Continue.INSTANCE)) {
                    EarnerCategory earnerCategory = (EarnerCategory) mutableState2.getValue();
                    if (((Boolean) mutableState8.getValue()).booleanValue() && ((Boolean) mutableState7.getValue()).booleanValue() && earnerCategory != null) {
                        str20.getClass();
                        earnerOnboardingAnalytics.analytics.track(new EarningsOnboardingSubmitCategory(str20, earnerCategory.name()), null);
                        JobKt.launch$default(coroutineScope2, null, null, new SsnPresenter$models$2$2(earnerEnrollmentBlockerPresenter, earnerCategory, null, 12), 3);
                    }
                } else if (Intrinsics.areEqual(earnerEnrollmentBlockerViewEvent, EarnerEnrollmentBlockerViewEvent.EarnerCategorySelected.INSTANCE)) {
                    EarnerCategory earnerCategory2 = (EarnerCategory) mutableState2.getValue();
                    str20.getClass();
                    earnerOnboardingAnalytics.analytics.track(new EarningsOnboardingViewCategoryPicker(str20, earnerCategory2 != null ? earnerCategory2.name() : null), null);
                    mutableState9.setValue((EarnerCategory) mutableState2.getValue());
                    mutableState.setValue(EarnerEnrollmentBlockerPresenter.Step.CATEGORY_SELECTION);
                } else if (earnerEnrollmentBlockerViewEvent instanceof EarnerEnrollmentBlockerViewEvent.EarnerCategorySelectionChanged) {
                    EarnerCategory earnerCategory3 = ((EarnerEnrollmentBlockerViewEvent.EarnerCategorySelectionChanged) earnerEnrollmentBlockerViewEvent).category;
                    str20.getClass();
                    earnerOnboardingAnalytics.analytics.track(new EarningsOnboardingSelectCategory(str20, earnerCategory3 != null ? earnerCategory3.name() : null), null);
                    mutableState9.setValue(earnerCategory3);
                } else if (Intrinsics.areEqual(earnerEnrollmentBlockerViewEvent, EarnerEnrollmentBlockerViewEvent.EarnerCategorySelectionContinued.INSTANCE)) {
                    mutableState2.setValue((EarnerCategory) mutableState9.getValue());
                    mutableState.setValue(EarnerEnrollmentBlockerPresenter.Step.FORM);
                } else if (earnerEnrollmentBlockerViewEvent instanceof EarnerEnrollmentBlockerViewEvent.IndividualCertificationChanged) {
                    mutableState8.setValue(Boolean.valueOf(((EarnerEnrollmentBlockerViewEvent.IndividualCertificationChanged) earnerEnrollmentBlockerViewEvent).checked));
                } else if (earnerEnrollmentBlockerViewEvent instanceof EarnerEnrollmentBlockerViewEvent.LegalAgreementChanged) {
                    mutableState7.setValue(Boolean.valueOf(((EarnerEnrollmentBlockerViewEvent.LegalAgreementChanged) earnerEnrollmentBlockerViewEvent).checked));
                } else if (earnerEnrollmentBlockerViewEvent instanceof EarnerEnrollmentBlockerViewEvent.LegalLinkClicked) {
                    earnerEnrollmentBlockerPresenter.router.route(new RoutingParams(null, null, null, null, null, null, 511), ((EarnerEnrollmentBlockerViewEvent.LegalLinkClicked) earnerEnrollmentBlockerViewEvent).url);
                } else if (!Intrinsics.areEqual(earnerEnrollmentBlockerViewEvent, EarnerEnrollmentBlockerViewEvent.ManageCustomerList.INSTANCE)) {
                    if (!Intrinsics.areEqual(earnerEnrollmentBlockerViewEvent, EarnerEnrollmentBlockerViewEvent.Done.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    screenNavigator3.goTo(earnerEnrollmentBlockerPresenter.args.getBlockersData().exitScreen);
                }
                return Unit.INSTANCE;
            case 3:
                CoroutineScope coroutineScope3 = (CoroutineScope) obj5;
                MoneybotChatViewEvent moneybotChatViewEvent = (MoneybotChatViewEvent) obj;
                MoneybotChatPresenter moneybotChatPresenter = (MoneybotChatPresenter) obj4;
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = moneybotChatPresenter.loadChatRetryTrigger$delegate;
                FeatureFlagManager featureFlagManager = moneybotChatPresenter.featureFlagManager;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = moneybotChatPresenter.pendingCancellation$delegate;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = moneybotChatPresenter.initialRequestKeyboardFocus$delegate;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState3 = moneybotChatPresenter.restoreInputText$delegate;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState4 = moneybotChatPresenter.composerText$delegate;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState5 = moneybotChatPresenter.sendMessageAnimating$delegate;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState6 = moneybotChatPresenter.slashCommandMatches$delegate;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState7 = moneybotChatPresenter.pendingAttachments$delegate;
                ChatContentState chatContentState = (ChatContentState) mutableState.getValue();
                RealChatSessionManager realChatSessionManager = (RealChatSessionManager) mutableState2.getValue();
                String sessionId = ((MoneybotChatPresenter.ChatSessionState) ((MutableState) state).getValue()).session.getSessionId();
                MutableState mutableState10 = (MutableState) obj6;
                RealBrandFollowPresenter$models$2$1$1 realBrandFollowPresenter$models$2$1$1 = new RealBrandFollowPresenter$models$2$1$1(27, (MutableState) obj3);
                BetterNavigator.ScreenNavigator screenNavigator4 = moneybotChatPresenter.navigator;
                RealRouter realRouter = moneybotChatPresenter.router;
                RealMoneybotAnalyticsService realMoneybotAnalyticsService = moneybotChatPresenter.analyticsService;
                Analytics analytics2 = realMoneybotAnalyticsService.analytics;
                ThumbDirection thumbDirection = null;
                thumbDirection = null;
                if (moneybotChatViewEvent instanceof MoneybotChatViewEvent.Exit) {
                    analytics2.track(new MoneybotChatClose(realMoneybotAnalyticsService.chatId, chatContentState, sessionId), null);
                    JobKt.launch$default(coroutineScope3, null, null, new MoneybotChatPresenter$models$10$1(moneybotChatPresenter, sessionId, null, 2), 3);
                } else if (moneybotChatViewEvent instanceof MoneybotChatViewEvent.SubmitMessagePrompt) {
                    String str21 = ((MoneybotChatViewEvent.SubmitMessagePrompt) moneybotChatViewEvent).promptId;
                    if (str21 != null) {
                        analytics2.track(new MoneybotInChatPromptClick(str21), null);
                        JobKt.launch$default(coroutineScope3, null, null, new CashMapPresenter$models$3$1(moneybotChatPresenter, str21, realBrandFollowPresenter$models$2$1$1, (Continuation) null, 24), 3);
                    }
                    parcelableSnapshotMutableState6.setValue(EmptyList.INSTANCE);
                    List list2 = (List) parcelableSnapshotMutableState7.getValue();
                    List<ChatFooterViewModel$Attachment$ImageAttachment> list3 = list2;
                    ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                    for (ChatFooterViewModel$Attachment$ImageAttachment chatFooterViewModel$Attachment$ImageAttachment : list3) {
                        if (chatFooterViewModel$Attachment$ImageAttachment == null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        arrayList3.add(new MoneybotChatPresenter.PendingMessage.Resolved(new MessageViewModel.ImageMessageViewModel(chatFooterViewModel$Attachment$ImageAttachment.uri, chatFooterViewModel$Attachment$ImageAttachment.mimeType, true)));
                    }
                    moneybotChatPresenter.setPendingMessages(arrayList3);
                    parcelableSnapshotMutableState7.setValue(EmptyList.INSTANCE);
                    parcelableSnapshotMutableState5.setValue(Boolean.TRUE);
                    JobKt.launch$default(coroutineScope3, null, null, new MusicPresenter$models$1$1(moneybotChatPresenter, realChatSessionManager, moneybotChatViewEvent, list2, null, 11), 3);
                } else if (moneybotChatViewEvent instanceof MoneybotChatViewEvent.MessageSendAnimationFinished) {
                    parcelableSnapshotMutableState5.setValue(Boolean.FALSE);
                } else if (Intrinsics.areEqual(moneybotChatViewEvent, MoneybotChatViewEvent.KeyboardOpened.INSTANCE)) {
                    parcelableSnapshotMutableState2.setValue(Boolean.FALSE);
                } else if (moneybotChatViewEvent instanceof MoneybotChatViewEvent.MessageTextStreamingFinished) {
                    moneybotChatPresenter.setStreamingKickoffTexts(SetsKt___SetsKt.minus(moneybotChatPresenter.getStreamingKickoffTexts(), ((MoneybotChatViewEvent.MessageTextStreamingFinished) moneybotChatViewEvent).text));
                } else if (moneybotChatViewEvent instanceof MoneybotChatViewEvent.CancelMessage) {
                    if (!((Boolean) parcelableSnapshotMutableState.getValue()).booleanValue()) {
                        parcelableSnapshotMutableState.setValue(Boolean.TRUE);
                        JobKt.launch$default(coroutineScope3, null, null, new MoneybotChatPresenter$models$10$1(moneybotChatPresenter, sessionId, null, 3), 3);
                    }
                } else if (moneybotChatViewEvent instanceof MoneybotChatViewEvent.HandleChatCardEvent) {
                    ChatCardViewEvent chatCardViewEvent = ((MoneybotChatViewEvent.HandleChatCardEvent) moneybotChatViewEvent).event;
                    if (chatCardViewEvent instanceof ChatCardViewEvent.LaunchClientRoute) {
                        ChatCardViewEvent.LaunchClientRoute launchClientRoute = (ChatCardViewEvent.LaunchClientRoute) chatCardViewEvent;
                        String str22 = launchClientRoute.requestId;
                        realMoneybotAnalyticsService.submitActionCardTap(sessionId, str22);
                        MoneybotChatScreen moneybotChatScreen = new MoneybotChatScreen(new ChatKickoffParams(sessionId, null, 11), (MoneybotChatEntryPoint) null, (HomeSourceContext) null, (String) null, (MoneybotPendingSheet$TransferOptionPicker) null, 62);
                        realRouter.route(new RoutingParams(moneybotChatScreen, null, moneybotChatScreen, null, null, sessionId != null ? new FeatureContext.MoneybotChatContext(sessionId, str22) : null, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE), launchClientRoute.clientRoute);
                    }
                } else if (moneybotChatViewEvent instanceof MoneybotChatViewEvent$SuggestionEvent$StartChatWithSuggestion) {
                    MoneybotChatViewEvent$SuggestionEvent$StartChatWithSuggestion moneybotChatViewEvent$SuggestionEvent$StartChatWithSuggestion = (MoneybotChatViewEvent$SuggestionEvent$StartChatWithSuggestion) moneybotChatViewEvent;
                    if (!(moneybotChatViewEvent$SuggestionEvent$StartChatWithSuggestion instanceof MoneybotChatViewEvent$SuggestionEvent$StartChatWithSuggestion)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    parcelableSnapshotMutableState5.setValue(Boolean.TRUE);
                    JobKt.launch$default(coroutineScope3, null, null, new MusicPresenter$models$1$1(moneybotChatPresenter, moneybotChatViewEvent$SuggestionEvent$StartChatWithSuggestion, realChatSessionManager, (Continuation) null, 12), 3);
                } else if (moneybotChatViewEvent instanceof MoneybotChatViewEvent.MessageLinkTap) {
                    MoneybotChatScreen moneybotChatScreen2 = new MoneybotChatScreen(new ChatKickoffParams(sessionId, null, 11), (MoneybotChatEntryPoint) null, (HomeSourceContext) null, (String) null, (MoneybotPendingSheet$TransferOptionPicker) null, 62);
                    realRouter.route(new RoutingParams(moneybotChatScreen2, null, moneybotChatScreen2, null, null, sessionId != null ? new FeatureContext.MoneybotChatContext(sessionId, null) : null, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE), ((MoneybotChatViewEvent.MessageLinkTap) moneybotChatViewEvent).uri);
                } else if (moneybotChatViewEvent instanceof MoneybotChatViewEvent.OpenChatHistory) {
                    analytics2.track(new MoneybotChatViewHistory(realMoneybotAnalyticsService.chatId), null);
                    screenNavigator4.goTo(MoneybotChatHistoryScreen.INSTANCE);
                } else if (moneybotChatViewEvent instanceof MoneybotChatViewEvent.StartNewChat) {
                    moneybotChatPresenter.didClickStartNewChat$delegate.setValue(VersionedKt.update(moneybotChatPresenter.getDidClickStartNewChat(), MoneybotChatPresenter.StartNewChatAction.UserInitiated.INSTANCE));
                    parcelableSnapshotMutableState2.setValue(Boolean.TRUE);
                    realMoneybotAnalyticsService.analytics.track(new MoneybotChatOpen(realMoneybotAnalyticsService.chatId, null, MoneybotChatOpen.EntryPointSurface.NEW_CHAT, null, null, null), null);
                } else if (moneybotChatViewEvent instanceof MoneybotChatViewEvent.OpenOverflowMenu) {
                    RealMoneybotAnalyticsService.submitOverflowMenuOpen$default(realMoneybotAnalyticsService, MoneybotSurface.CHAT, sessionId, null, 4);
                    screenNavigator4.goTo(new MoneybotOverflowMenuScreen(new ChatSourceContext(sessionId), null, 2));
                } else if (moneybotChatViewEvent instanceof MoneybotChatViewEvent.QuickActionTap) {
                    MoneybotChatViewEvent.QuickActionTap quickActionTap = (MoneybotChatViewEvent.QuickActionTap) moneybotChatViewEvent;
                    MoneybotChatViewEvent.QuickActionTap.QuickActionType quickActionType4 = quickActionTap.f1173type;
                    String str23 = quickActionTap.messageId;
                    String str24 = str23 == null ? "" : str23;
                    int ordinal = quickActionType4.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1 || ordinal == 2) {
                            ThumbDirection thumbDirection2 = quickActionType4 == MoneybotChatViewEvent.QuickActionTap.QuickActionType.THUMBS_UP ? ThumbDirection.THUMBS_UP : ThumbDirection.THUMBS_DOWN;
                            MessageViewModel.MoneybotMessageViewModel.ThumbState access$toThumbState = MoneybotChatPresenterKt.access$toThumbState(thumbDirection2);
                            MessageViewModel.MoneybotMessageViewModel.ThumbState thumbState = (MessageViewModel.MoneybotMessageViewModel.ThumbState) moneybotChatPresenter.thumbStates.get(str24);
                            if (thumbState == access$toThumbState) {
                                int ordinal2 = thumbDirection2.ordinal();
                                if (ordinal2 == 0) {
                                    quickActionType3 = MoneybotQuickActionTap.QuickActionType.CLEAR_THUMBS_UP;
                                } else if (ordinal2 == 1) {
                                    quickActionType3 = MoneybotQuickActionTap.QuickActionType.CLEAR_THUMBS_DOWN;
                                } else {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                }
                                moneybotChatPresenter.submitQuickActionTap(sessionId, str24, quickActionType3);
                                moneybotChatPresenter.updateThumbState(str24, MessageViewModel.MoneybotMessageViewModel.ThumbState.NONE);
                                if (((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(AmplitudeExperiments$MoneybotFeedbackSheet.INSTANCE)).enabled()) {
                                    moneybotChatPresenter.submitFeedback(sessionId, str24, FeedbackType.FEEDBACK_TYPE_UNSPECIFIED, null, null);
                                }
                            } else {
                                String str25 = str24;
                                int ordinal3 = quickActionType4.ordinal();
                                if (ordinal3 == 0) {
                                    quickActionType2 = MoneybotQuickActionTap.QuickActionType.COPY;
                                } else if (ordinal3 == 1) {
                                    quickActionType2 = MoneybotQuickActionTap.QuickActionType.THUMBS_UP;
                                } else if (ordinal3 == 2) {
                                    quickActionType2 = MoneybotQuickActionTap.QuickActionType.THUMBS_DOWN;
                                } else {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                }
                                moneybotChatPresenter.submitQuickActionTap(sessionId, str25, quickActionType2);
                                if (((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(AmplitudeExperiments$MoneybotFeedbackSheet.INSTANCE)).enabled()) {
                                    int i2 = thumbState == null ? -1 : MoneybotChatPresenterKt.WhenMappings.$EnumSwitchMapping$1[thumbState.ordinal()];
                                    if (i2 != -1 && i2 != 1) {
                                        if (i2 == 2) {
                                            thumbDirection = ThumbDirection.THUMBS_UP;
                                        } else if (i2 == 3) {
                                            thumbDirection = ThumbDirection.THUMBS_DOWN;
                                        } else {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                        }
                                    }
                                    screenNavigator4.askQuestion(new MoneybotFeedbackQuestion(sessionId, str25, thumbDirection2, thumbDirection), new MoneyTabUIKt$$ExternalSyntheticLambda13(22));
                                } else {
                                    moneybotChatPresenter.updateThumbState(str25, access$toThumbState);
                                    JobKt.launch$default(coroutineScope3, null, null, new MoneybotChatPresenter$models$3$1(moneybotChatPresenter, null, 4), 3);
                                }
                            }
                        } else {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                        }
                        return null;
                    }
                    String str26 = str24;
                    int i3 = MoneybotChatPresenterKt.$r8$clinit;
                    int ordinal4 = quickActionType4.ordinal();
                    if (ordinal4 == 0) {
                        quickActionType = MoneybotQuickActionTap.QuickActionType.COPY;
                    } else if (ordinal4 == 1) {
                        quickActionType = MoneybotQuickActionTap.QuickActionType.THUMBS_UP;
                    } else {
                        if (ordinal4 != 2) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        quickActionType = MoneybotQuickActionTap.QuickActionType.THUMBS_DOWN;
                    }
                    moneybotChatPresenter.submitQuickActionTap(sessionId, str26, quickActionType);
                } else if (moneybotChatViewEvent instanceof MoneybotChatViewEvent.PinMessage) {
                    JobKt.launch$default(coroutineScope3, null, null, new MoneybotChatPresenter$processChatEvent$9(moneybotChatPresenter, moneybotChatViewEvent, null, 0), 3);
                } else if (moneybotChatViewEvent instanceof MoneybotChatViewEvent.DisclosureUrlClick) {
                    realRouter.route(new RoutingParams(null, null, null, null, null, null, 511), ((MoneybotChatViewEvent.DisclosureUrlClick) moneybotChatViewEvent).url);
                } else if (moneybotChatViewEvent instanceof MoneybotChatViewEvent.RetryLoad) {
                    MoneybotChatViewEvent.RetryLoad.RetryType retryType = MoneybotChatViewEvent.RetryLoad.RetryType.Chat;
                    if (MoneybotChatPresenter.WhenMappings.$EnumSwitchMapping$2[0] != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    parcelableSnapshotMutableIntState.setIntValue(parcelableSnapshotMutableIntState.getIntValue() + 1);
                } else if (moneybotChatViewEvent instanceof MoneybotChatViewEvent.OpenAboutMoneybot) {
                    MoneybotOverflowMenuSelectItem.OverflowMenuItemType overflowMenuItemType = MoneybotOverflowMenuSelectItem.OverflowMenuItemType.DISCLOSURE_INFO;
                    analytics2.track(new MoneybotOverflowMenuSelectItem(MoneybotSurface.CHAT, realMoneybotAnalyticsService.chatId, sessionId, null), null);
                    realRouter.route(new RoutingParams(null, null, null, null, null, null, 511), "https://cash.app/legal/us/en-us/moneybot-terms-disclosures");
                } else if (Intrinsics.areEqual(moneybotChatViewEvent, MoneybotChatViewEvent.ThinkingAnimationPaused.INSTANCE)) {
                    mutableState10.setValue(Boolean.FALSE);
                } else if (moneybotChatViewEvent instanceof MoneybotChatViewEvent.SaveScrollPosition) {
                    if (sessionId != null) {
                        MoneybotChatViewEvent.SaveScrollPosition saveScrollPosition = (MoneybotChatViewEvent.SaveScrollPosition) moneybotChatViewEvent;
                        moneybotChatPresenter.chatMessagesCache.cachedScrollPosition = new MoneybotChatScrollPosition(sessionId, saveScrollPosition.firstVisibleItemIndex, saveScrollPosition.firstVisibleItemScrollOffset);
                    }
                } else if (moneybotChatViewEvent instanceof MoneybotChatViewEvent.AttachData) {
                    List<MoneybotChatViewEvent.AttachData.Attachment> list4 = ((MoneybotChatViewEvent.AttachData) moneybotChatViewEvent).attachments;
                    ArrayList arrayList4 = new ArrayList();
                    for (MoneybotChatViewEvent.AttachData.Attachment attachment : list4) {
                        ChatFooterViewModel$Attachment$ImageAttachment chatFooterViewModel$Attachment$ImageAttachment2 = StringsKt__StringsJVMKt.startsWith(attachment.mimeType, "image/", false) ? new ChatFooterViewModel$Attachment$ImageAttachment(attachment.fileUri, attachment.mimeType) : null;
                        if (chatFooterViewModel$Attachment$ImageAttachment2 != null) {
                            arrayList4.add(chatFooterViewModel$Attachment$ImageAttachment2);
                        }
                    }
                    parcelableSnapshotMutableState7.setValue(CollectionsKt.plus((Iterable) arrayList4, (Collection) parcelableSnapshotMutableState7.getValue()));
                } else if (moneybotChatViewEvent instanceof MoneybotChatViewEvent.RemoveAttachment) {
                    int i4 = ((MoneybotChatViewEvent.RemoveAttachment) moneybotChatViewEvent).index;
                    if (i4 >= 0 && i4 < ((List) parcelableSnapshotMutableState7.getValue()).size()) {
                        ArrayList mutableList = CollectionsKt.toMutableList((Collection) parcelableSnapshotMutableState7.getValue());
                        mutableList.remove(i4);
                        parcelableSnapshotMutableState7.setValue(mutableList);
                    }
                } else if (Intrinsics.areEqual(moneybotChatViewEvent, MoneybotChatViewEvent.RequestCameraCapture.INSTANCE)) {
                    JobKt.launch$default(moneybotChatPresenter.scope, null, null, new MusicPresenter$models$2$1(moneybotChatPresenter, null, 16), 3);
                } else if (Intrinsics.areEqual(moneybotChatViewEvent, MoneybotChatViewEvent.CameraCapturePathConsumed.INSTANCE)) {
                    moneybotChatPresenter.cameraCapturePath$delegate.setValue(null);
                } else if (moneybotChatViewEvent instanceof MoneybotChatViewEvent.MemoryTooltipDismissed) {
                    JobKt.launch$default(coroutineScope3, null, null, new MoneybotChatPresenter$processChatEvent$9(moneybotChatPresenter, moneybotChatViewEvent, null, 1), 3);
                } else if (moneybotChatViewEvent instanceof MoneybotChatViewEvent.ComposerTextChanged) {
                    parcelableSnapshotMutableState4.setValue(((MoneybotChatViewEvent.ComposerTextChanged) moneybotChatViewEvent).text);
                    if (((String) parcelableSnapshotMutableState3.getValue()) != null) {
                        parcelableSnapshotMutableState3.setValue(null);
                    }
                    parcelableSnapshotMutableState6.setValue(StorageUtil.computeSlashCommandMatches((String) parcelableSnapshotMutableState4.getValue(), (List) moneybotChatPresenter.slashCommands$delegate.getValue()));
                } else if (moneybotChatViewEvent instanceof MoneybotChatViewEvent.SlashCommandSelected) {
                    String str27 = (String) parcelableSnapshotMutableState4.getValue();
                    String str28 = ((MoneybotChatViewEvent.SlashCommandSelected) moneybotChatViewEvent).command;
                    str27.getClass();
                    parcelableSnapshotMutableState3.setValue(str27.substring(0, StorageUtil.trailingWordStart(str27)) + "/" + str28 + " ");
                    parcelableSnapshotMutableState6.setValue(EmptyList.INSTANCE);
                } else {
                    if (!Intrinsics.areEqual(moneybotChatViewEvent, MoneybotChatViewEvent.OpenDebugOverlay.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    if (moneybotChatPresenter.moneybotFlagsHelper.showDebugOptions()) {
                        screenNavigator4.goTo(new MoneybotDebugOverlayScreen(new ChatSourceContext(sessionId)));
                    }
                }
                return Unit.INSTANCE;
            case 4:
                return emit$com$squareup$cash$profile$presenters$notifications$CategoryListPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            default:
                CoroutineScope coroutineScope4 = (CoroutineScope) obj5;
                LocalEditorialPresenter localEditorialPresenter = (LocalEditorialPresenter) obj4;
                BetterNavigator.ScreenNavigator screenNavigator5 = (BetterNavigator.ScreenNavigator) localEditorialPresenter.navigator;
                ShoppingAutofillAnalyticsHandler shoppingAutofillAnalyticsHandler = (ShoppingAutofillAnalyticsHandler) localEditorialPresenter.installedStore;
                AutofillScreen autofillScreen = (AutofillScreen) localEditorialPresenter.launcher;
                AutofillViewEvent autofillViewEvent = (AutofillViewEvent) obj;
                boolean z4 = autofillViewEvent instanceof AutofillViewEvent.ActionButtonPressed;
                AutofillQuestion.Result.AutofillConfirmed autofillConfirmed = AutofillQuestion.Result.AutofillConfirmed.INSTANCE;
                if (z4) {
                    mutableState.setValue(Boolean.TRUE);
                    AutofillScreen autofillScreen2 = (AutofillScreen) localEditorialPresenter.launcher;
                    if (autofillScreen2 instanceof AutofillScreen.SaveAutofillScreen) {
                        Profile profile = (Profile) state.getValue();
                        if (profile != null) {
                            JobKt.launch$default(coroutineScope4, null, null, new RealQrCodesPresenter$models$1$1(localEditorialPresenter, profile, (Function1) obj7, (Function0) obj6, null, 21), 3);
                        }
                    } else if (autofillScreen2 instanceof AutofillScreen.UpdateAutofillScreen) {
                        JobKt.launch$default(coroutineScope4, null, null, new RealQrCodesPresenter$models$1$1(localEditorialPresenter, (Function1) obj7, (Function0) obj6, this.$participants$delegate$inlined, null, 22), 3);
                    } else {
                        if (!(autofillScreen2 instanceof AutofillScreen.OfferAutofillScreen)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        AutofillAnalyticsParam autofillAnalyticsParam = ((AutofillScreen.OfferAutofillScreen) autofillScreen2).analyticsParam;
                        if (autofillAnalyticsParam != null) {
                            ((ShoppingAutofillAnalyticsHandler) localEditorialPresenter.installedStore).analytics.track(new BrowserCheckoutTapAutofillButton(autofillAnalyticsParam.origin, autofillAnalyticsParam.infoContext, autofillAnalyticsParam.flowToken, autofillAnalyticsParam.businessToken, autofillAnalyticsParam.businessName), null);
                        }
                        screenNavigator5.giveAnswer(((AutofillScreen.OfferAutofillScreen) autofillScreen).question, autofillConfirmed);
                    }
                    return Unit.INSTANCE;
                }
                if (autofillViewEvent instanceof AutofillViewEvent.SuccessAnimationCompleted) {
                    AutofillAnalyticsParam analyticsParam = autofillScreen.getAnalyticsParam();
                    if (analyticsParam != null) {
                        if (((AutofillQuestion) autofillScreen.getQuestion().question).autofillType == AutofillQuestion.AutofillType.SAVE) {
                            shoppingAutofillAnalyticsHandler.analytics.track(new BrowserCheckoutTapSaveAutofillButton(analyticsParam.origin, analyticsParam.infoContext, analyticsParam.flowToken, analyticsParam.businessToken, analyticsParam.businessName), null);
                        } else if (((AutofillQuestion) autofillScreen.getQuestion().question).autofillType == AutofillQuestion.AutofillType.UPDATE) {
                            shoppingAutofillAnalyticsHandler.analytics.track(new BrowserCheckoutTapUpdateAutofillButton(analyticsParam.origin, analyticsParam.infoContext, analyticsParam.flowToken, analyticsParam.businessToken, analyticsParam.businessName), null);
                        }
                    }
                    screenNavigator5.giveAnswer(autofillScreen.getQuestion(), autofillConfirmed);
                } else if (autofillViewEvent instanceof AutofillViewEvent.EditButtonPressed) {
                    if (autofillScreen instanceof AutofillScreen.SaveAutofillScreen) {
                        str2 = null;
                    } else {
                        if (autofillScreen instanceof AutofillScreen.OfferAutofillScreen) {
                            str = ((AutofillScreen.OfferAutofillScreen) autofillScreen).shippingAddressId;
                        } else {
                            if (!(autofillScreen instanceof AutofillScreen.UpdateAutofillScreen)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            str = ((AutofillScreen.UpdateAutofillScreen) autofillScreen).shippingAddressId;
                        }
                        str2 = str;
                    }
                    autofillScreen.getClass();
                    shoppingAutofillAnalyticsHandler.analytics.track(new BrowserTapEditAutofillDetails(ShoppingAutofillAnalyticsHandler.originScreenToAnalyticsOrigin(autofillScreen)), null);
                    AskedQuestion question = autofillScreen.getQuestion();
                    AutofillScreen autofillScreen3 = (AutofillScreen) localEditorialPresenter.launcher;
                    Profile profile2 = (Profile) state.getValue();
                    String str29 = profile2 != null ? profile2.profile_id : null;
                    FullName fullName = AutofillMapperKt.getFullName((Map) autofillScreen.getCapturedData().getValue());
                    Map map = (Map) autofillScreen.getCapturedData().getValue();
                    map.getClass();
                    screenNavigator5.goTo(new EditAutofillScreen(question, autofillScreen3, str2, str29, null, fullName, AutofillMapperKt.getOrNull(map, AutofillWebField.EMAIL), AutofillMapperKt.getPhone((Map) autofillScreen.getCapturedData().getValue()), AutofillMapperKt.getGlobalAddress((Map) autofillScreen.getCapturedData().getValue())));
                } else if (autofillViewEvent instanceof AutofillViewEvent.AutofillDismissed) {
                    AutofillAnalyticsParam analyticsParam2 = autofillScreen.getAnalyticsParam();
                    if (analyticsParam2 != null) {
                        int ordinal5 = ((AutofillQuestion) autofillScreen.getQuestion().question).autofillType.ordinal();
                        if (ordinal5 == 0) {
                            shoppingAutofillAnalyticsHandler.analytics.track(new BrowserCheckoutDismissSaveAutofillInfo(analyticsParam2.origin, analyticsParam2.infoContext, analyticsParam2.flowToken, analyticsParam2.businessToken, analyticsParam2.businessName), null);
                        } else if (ordinal5 == 1) {
                            shoppingAutofillAnalyticsHandler.analytics.track(new BrowserCheckoutDismissUpdateAutofillInfo(analyticsParam2.origin, analyticsParam2.infoContext, analyticsParam2.flowToken, analyticsParam2.businessToken, analyticsParam2.businessName), null);
                        } else {
                            if (ordinal5 != 2 && ordinal5 != 3) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            shoppingAutofillAnalyticsHandler.analytics.track(new BrowserCheckoutDismissAutofillInfo(analyticsParam2.origin, analyticsParam2.infoContext, analyticsParam2.flowToken, analyticsParam2.businessToken, analyticsParam2.businessName), null);
                        }
                    }
                    screenNavigator5.giveAnswer(autofillScreen.getQuestion(), AutofillQuestion.Result.AutofillDismissed.INSTANCE);
                } else {
                    if (!(autofillViewEvent instanceof AutofillViewEvent.ErrorDialogDismissed)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    AutofillAnalyticsParam analyticsParam3 = autofillScreen.getAnalyticsParam();
                    if (analyticsParam3 != null) {
                        shoppingAutofillAnalyticsHandler.trackBrowserCheckoutDismissAutofillError(analyticsParam3, ((AutofillViewEvent.ErrorDialogDismissed) autofillViewEvent).errorMessage);
                    }
                    mutableState2.setValue(localEditorialPresenter.asLoadedState(autofillScreen, ((Boolean) ((State) obj3).getValue()).booleanValue()));
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ PoolDetailsPresenter$models$$inlined$CollectEffect$1$1(CoroutineScope coroutineScope, MoleculePresenter moleculePresenter, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, int i) {
        this.$r8$classId = i;
        this.this$0 = moleculePresenter;
        this.$pool$delegate$inlined = mutableState;
        this.$viewerCanLeavePool$delegate$inlined = mutableState2;
        this.$participants$delegate$inlined = mutableState3;
        this.$error$delegate$inlined = mutableState4;
        this.$isRefreshing$delegate$inlined = mutableState5;
        this.$contributionCompleted$delegate$inlined = mutableState6;
        this.$$this$LaunchedEffect = coroutineScope;
    }

    public PoolDetailsPresenter$models$$inlined$CollectEffect$1$1(CoroutineScope coroutineScope, LocalHomePresenter localHomePresenter, MutableSharedFlow mutableSharedFlow, List list, BrandCollectionData.Location location, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4) {
        this.$r8$classId = 1;
        this.$$this$LaunchedEffect = localHomePresenter;
        this.this$0 = mutableSharedFlow;
        this.$isRefreshing$delegate$inlined = list;
        this.$contributionCompleted$delegate$inlined = location;
        this.$pool$delegate$inlined = mutableState;
        this.$viewerCanLeavePool$delegate$inlined = mutableState2;
        this.$participants$delegate$inlined = mutableState3;
        this.$error$delegate$inlined = mutableState4;
    }

    public PoolDetailsPresenter$models$$inlined$CollectEffect$1$1(CoroutineScope coroutineScope, EarnerEnrollmentBlockerPresenter earnerEnrollmentBlockerPresenter, String str, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5) {
        this.$r8$classId = 2;
        this.this$0 = earnerEnrollmentBlockerPresenter;
        this.$contributionCompleted$delegate$inlined = str;
        this.$pool$delegate$inlined = mutableState;
        this.$viewerCanLeavePool$delegate$inlined = mutableState2;
        this.$participants$delegate$inlined = mutableState3;
        this.$error$delegate$inlined = mutableState4;
        this.$isRefreshing$delegate$inlined = mutableState5;
        this.$$this$LaunchedEffect = coroutineScope;
    }

    public PoolDetailsPresenter$models$$inlined$CollectEffect$1$1(CoroutineScope coroutineScope, PaymentLoadingPresenter paymentLoadingPresenter, MutableState mutableState, String str, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5) {
        this.$r8$classId = 4;
        this.this$0 = paymentLoadingPresenter;
        this.$pool$delegate$inlined = mutableState;
        this.$contributionCompleted$delegate$inlined = str;
        this.$viewerCanLeavePool$delegate$inlined = mutableState2;
        this.$participants$delegate$inlined = mutableState3;
        this.$error$delegate$inlined = mutableState4;
        this.$isRefreshing$delegate$inlined = mutableState5;
        this.$$this$LaunchedEffect = coroutineScope;
    }
}
