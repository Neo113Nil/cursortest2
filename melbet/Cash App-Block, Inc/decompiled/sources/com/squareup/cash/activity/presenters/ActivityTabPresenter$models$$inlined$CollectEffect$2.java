package com.squareup.cash.activity.presenters;

import androidx.compose.runtime.MutableState;
import app.cash.broadway.screen.Screen;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.network.NetworkFetcher$doFetch$2;
import coil3.size.DimensionKt;
import com.squareup.cash.activity.analytics.ActivityAnalyticsService;
import com.squareup.cash.activity.backend.RealActivityAnalyticsService;
import com.squareup.cash.activity.screens.ActivityScreen;
import com.squareup.cash.activity.viewmodels.ActivityTabViewEvent;
import com.squareup.cash.activity.viewmodels.AppMessageEvent;
import com.squareup.cash.activity.viewmodels.ContactHeaderEvent;
import com.squareup.cash.activity.viewmodels.InviteFriendsClicked;
import com.squareup.cash.activity.viewmodels.LoadMore;
import com.squareup.cash.activity.viewmodels.PulledToRefresh;
import com.squareup.cash.activity.viewmodels.SuspensionsBannerClicked;
import com.squareup.cash.activity.viewmodels.TabToolbarEvent;
import com.squareup.cash.activity.viewmodels.TooltipDismissed;
import com.squareup.cash.activity.viewmodels.UpdateSearchQuery;
import com.squareup.cash.activity.viewmodels.ViewLoaded;
import com.squareup.cash.appmessages.AppMessageViewEvent;
import com.squareup.cash.appmessages.CardAppMessageViewModel;
import com.squareup.cash.appmessages.InlineAppMessageV2ViewModel;
import com.squareup.cash.appmessages.OnDemandMessageAnalyticsData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.cdf.ActivityItemOrigin;
import com.squareup.cash.cdf.Placement;
import com.squareup.cash.cdf.QABItemOrigin;
import com.squareup.cash.cdf.QABItemType;
import com.squareup.cash.cdf.activityhistory.ActivityHistoryBrowseViewScreen;
import com.squareup.cash.cdf.activityhistory.ActivityHistoryRefreshForce;
import com.squareup.cash.cdf.activityhistory.ActivityHistorySelectInviteFriends;
import com.squareup.cash.cdf.activityhistory.ActivityHistoryTapItem;
import com.squareup.cash.cdf.activityhistory.ActivityHistoryViewItem;
import com.squareup.cash.cdf.asset.AssetSendCancelSchedulePayment;
import com.squareup.cash.cdf.asset.AssetSendConfirmSchedulePayment;
import com.squareup.cash.cdf.asset.AssetSendRemoveSchedulePayment;
import com.squareup.cash.cdf.asset.AssetSendSelectScheduleFrequency;
import com.squareup.cash.cdf.asset.AssetSendSelectScheduleStartDate;
import com.squareup.cash.cdf.ondemandmessage.OnDemandMessageInteractClick;
import com.squareup.cash.cdf.ondemandmessage.OnDemandMessageInteractDismiss;
import com.squareup.cash.cdf.ondemandmessage.OnDemandMessageInteractView;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.analytics.AnalyticsParams;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.RealFlowStarter;
import com.squareup.cash.history.analytics.LoadTimeClock;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.payments.common.PaymentScheduleFrequency;
import com.squareup.cash.payments.presenters.AnalyticsHelperKt;
import com.squareup.cash.payments.screens.PaymentScheduleSelection;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.payments.viewmodels.ScheduleCalendarDate;
import com.squareup.cash.payments.viewmodels.SchedulePaymentViewEvent;
import com.squareup.cash.screens.Back;
import com.squareup.cash.screens.Finish;
import com.squareup.cash.sharesheet.ShareSheetPresenter;
import com.squareup.cash.wallet.views.HeroCardViewKt$Render$1$8$1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class ActivityTabPresenter$models$$inlined$CollectEffect$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $dismissedCardMessage$delegate$inlined;
    public final /* synthetic */ MutableState $dismissedInlineMessage$delegate$inlined;
    public final /* synthetic */ Flow $flow;
    public final /* synthetic */ MutableState $promoterCardMessage$delegate$inlined;
    public final /* synthetic */ MutableState $promoterInlineV2Message$delegate$inlined;
    public final /* synthetic */ MutableState $theManager$delegate$inlined;
    public final /* synthetic */ boolean $usePromoterUpsells$inlined;
    public final /* synthetic */ Set $viewedOnDemandTokens$inlined;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ ActivityTabPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityTabPresenter$models$$inlined$CollectEffect$2(Flow flow, Continuation continuation, ActivityTabPresenter activityTabPresenter, boolean z, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, Set set) {
        super(2, continuation);
        this.$flow = flow;
        this.this$0 = activityTabPresenter;
        this.$usePromoterUpsells$inlined = z;
        this.$theManager$delegate$inlined = mutableState;
        this.$dismissedInlineMessage$delegate$inlined = mutableState2;
        this.$dismissedCardMessage$delegate$inlined = mutableState3;
        this.$promoterInlineV2Message$delegate$inlined = mutableState4;
        this.$promoterCardMessage$delegate$inlined = mutableState5;
        this.$viewedOnDemandTokens$inlined = set;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ActivityTabPresenter$models$$inlined$CollectEffect$2 activityTabPresenter$models$$inlined$CollectEffect$2 = new ActivityTabPresenter$models$$inlined$CollectEffect$2(this.$flow, continuation, this.this$0, this.$usePromoterUpsells$inlined, this.$theManager$delegate$inlined, this.$dismissedInlineMessage$delegate$inlined, this.$dismissedCardMessage$delegate$inlined, this.$promoterInlineV2Message$delegate$inlined, this.$promoterCardMessage$delegate$inlined, this.$viewedOnDemandTokens$inlined);
        activityTabPresenter$models$$inlined$CollectEffect$2.L$0 = obj;
        return activityTabPresenter$models$$inlined$CollectEffect$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ActivityTabPresenter$models$$inlined$CollectEffect$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(coroutineScope, this.this$0, this.$usePromoterUpsells$inlined, this.$theManager$delegate$inlined, this.$dismissedInlineMessage$delegate$inlined, this.$dismissedCardMessage$delegate$inlined, this.$promoterInlineV2Message$delegate$inlined, this.$promoterCardMessage$delegate$inlined, this.$viewedOnDemandTokens$inlined);
            this.L$0 = null;
            this.label = 1;
            if (this.$flow.collect(anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: com.squareup.cash.activity.presenters.ActivityTabPresenter$models$$inlined$CollectEffect$2$1, reason: invalid class name */
    public final class AnonymousClass1 implements FlowCollector {
        public final /* synthetic */ Object $$this$LaunchedEffect;
        public final /* synthetic */ Object $dismissedCardMessage$delegate$inlined;
        public final /* synthetic */ MutableState $dismissedInlineMessage$delegate$inlined;
        public final /* synthetic */ Object $promoterCardMessage$delegate$inlined;
        public final /* synthetic */ Object $promoterInlineV2Message$delegate$inlined;
        public final /* synthetic */ int $r8$classId = 0;
        public final /* synthetic */ MutableState $theManager$delegate$inlined;
        public final /* synthetic */ boolean $usePromoterUpsells$inlined;
        public final /* synthetic */ Collection $viewedOnDemandTokens$inlined;
        public final /* synthetic */ Object this$0;

        public AnonymousClass1(CoroutineScope coroutineScope, ActivityTabPresenter activityTabPresenter, boolean z, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, Set set) {
            this.this$0 = activityTabPresenter;
            this.$usePromoterUpsells$inlined = z;
            this.$theManager$delegate$inlined = mutableState;
            this.$dismissedInlineMessage$delegate$inlined = mutableState2;
            this.$dismissedCardMessage$delegate$inlined = mutableState3;
            this.$promoterInlineV2Message$delegate$inlined = mutableState4;
            this.$promoterCardMessage$delegate$inlined = mutableState5;
            this.$viewedOnDemandTokens$inlined = set;
            this.$$this$LaunchedEffect = coroutineScope;
        }

        /* JADX WARN: Code restructure failed: missing block: B:57:0x025a, code lost:
        
            if (r0.isActive() == true) goto L200;
         */
        /* JADX WARN: Removed duplicated region for block: B:104:0x0357 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:107:0x0362  */
        /* JADX WARN: Removed duplicated region for block: B:133:0x03c5  */
        /* JADX WARN: Removed duplicated region for block: B:139:0x042a A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:142:0x04be  */
        /* JADX WARN: Removed duplicated region for block: B:148:0x0469  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            OnDemandMessageAnalyticsData onDemandMessageAnalyticsData;
            OnDemandMessageAnalyticsData access$models$onDemandAnalyticsForToken;
            String str;
            CardAppMessageViewModel.Ready ready;
            int i;
            Object obj2;
            int i2 = this.$r8$classId;
            Collection collection = this.$viewedOnDemandTokens$inlined;
            Object obj3 = this.$$this$LaunchedEffect;
            MutableState mutableState = this.$theManager$delegate$inlined;
            MutableState mutableState2 = this.$dismissedInlineMessage$delegate$inlined;
            Object obj4 = this.this$0;
            Object obj5 = this.$promoterCardMessage$delegate$inlined;
            boolean z = this.$usePromoterUpsells$inlined;
            Object obj6 = this.$dismissedCardMessage$delegate$inlined;
            Object obj7 = this.$promoterInlineV2Message$delegate$inlined;
            switch (i2) {
                case 0:
                    MutableState mutableState3 = (MutableState) obj5;
                    MutableState mutableState4 = (MutableState) obj7;
                    MutableState mutableState5 = (MutableState) obj6;
                    ActivityTabPresenter activityTabPresenter = (ActivityTabPresenter) obj4;
                    LoadTimeClock loadTimeClock = activityTabPresenter.loadTimeClock;
                    ActivityAnalyticsService activityAnalyticsService = activityTabPresenter.activityAnalyticsService;
                    CoroutineScope coroutineScope = (CoroutineScope) obj3;
                    ActivityTabViewEvent activityTabViewEvent = (ActivityTabViewEvent) obj;
                    if (!Intrinsics.areEqual(activityTabViewEvent, LoadMore.INSTANCE)) {
                        if (!(activityTabViewEvent instanceof InviteFriendsClicked)) {
                            if (!(activityTabViewEvent instanceof UpdateSearchQuery)) {
                                if (!(activityTabViewEvent instanceof PulledToRefresh)) {
                                    if (!(activityTabViewEvent instanceof ContactHeaderEvent) && !(activityTabViewEvent instanceof TabToolbarEvent)) {
                                        if (!(activityTabViewEvent instanceof ViewLoaded)) {
                                            if (!(activityTabViewEvent instanceof AppMessageEvent)) {
                                                if (!(activityTabViewEvent instanceof TooltipDismissed)) {
                                                    if (!Intrinsics.areEqual(activityTabViewEvent, SuspensionsBannerClicked.INSTANCE)) {
                                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                                        break;
                                                    }
                                                } else {
                                                    JobKt.launch$default(coroutineScope, null, null, new ActivityTabPresenter$models$2$1(activityTabPresenter, null, 3), 3);
                                                }
                                            } else {
                                                AppMessageViewEvent appMessageViewEvent = ((AppMessageEvent) activityTabViewEvent).appMessageEvent;
                                                if (appMessageViewEvent instanceof AppMessageViewEvent.AppMessageTemporarilyDismiss) {
                                                    AppMessageViewEvent.AppMessageTemporarilyDismiss appMessageTemporarilyDismiss = (AppMessageViewEvent.AppMessageTemporarilyDismiss) appMessageViewEvent;
                                                    mutableState2.setValue(appMessageTemporarilyDismiss.inlineMessage);
                                                    mutableState5.setValue(appMessageTemporarilyDismiss.cardMessage);
                                                } else if (appMessageViewEvent instanceof AppMessageViewEvent.AppMessageActionTaken) {
                                                    AppMessageViewEvent.AppMessageActionTaken appMessageActionTaken = (AppMessageViewEvent.AppMessageActionTaken) appMessageViewEvent;
                                                    boolean z2 = appMessageActionTaken.shouldDismissMessage;
                                                    Screen screen = appMessageActionTaken.exitScreen;
                                                    String str2 = appMessageActionTaken.url;
                                                    String str3 = appMessageActionTaken.messageToken;
                                                    if (z2 && str2 == null) {
                                                        InlineAppMessageV2ViewModel.Ready ready2 = (InlineAppMessageV2ViewModel.Ready) mutableState2.getValue();
                                                        if (Intrinsics.areEqual(str3, ready2 != null ? ready2.messageToken : null)) {
                                                            InlineAppMessageV2ViewModel.Ready ready3 = (InlineAppMessageV2ViewModel.Ready) mutableState2.getValue();
                                                            if (ready3 != null) {
                                                                onDemandMessageAnalyticsData = ready3.onDemandAnalytics;
                                                                access$models$onDemandAnalyticsForToken = (str2 == null || screen != null) ? ActivityTabPresenter.access$models$onDemandAnalyticsForToken(mutableState4, mutableState3, str3) : null;
                                                                if (z2) {
                                                                    InlineAppMessageV2ViewModel.Ready ready4 = (InlineAppMessageV2ViewModel.Ready) mutableState2.getValue();
                                                                    if (Intrinsics.areEqual(str3, ready4 != null ? ready4.messageToken : null)) {
                                                                        mutableState2.setValue(null);
                                                                    } else {
                                                                        CardAppMessageViewModel.Ready ready5 = (CardAppMessageViewModel.Ready) mutableState5.getValue();
                                                                        if (Intrinsics.areEqual(str3, ready5 != null ? ready5.messageToken : null)) {
                                                                            mutableState5.setValue(null);
                                                                        }
                                                                    }
                                                                    if (z) {
                                                                        CardAppMessageViewModel cardAppMessageViewModel = (CardAppMessageViewModel) mutableState3.getValue();
                                                                        if ((cardAppMessageViewModel instanceof CardAppMessageViewModel.Ready) && Intrinsics.areEqual(((CardAppMessageViewModel.Ready) cardAppMessageViewModel).messageToken, str3)) {
                                                                            mutableState3.setValue(CardAppMessageViewModel.NotAvailable.INSTANCE);
                                                                        }
                                                                        InlineAppMessageV2ViewModel inlineAppMessageV2ViewModel = (InlineAppMessageV2ViewModel) mutableState4.getValue();
                                                                        if ((inlineAppMessageV2ViewModel instanceof InlineAppMessageV2ViewModel.Ready) && Intrinsics.areEqual(((InlineAppMessageV2ViewModel.Ready) inlineAppMessageV2ViewModel).messageToken, str3)) {
                                                                            mutableState4.setValue(InlineAppMessageV2ViewModel.NotAvailable.INSTANCE);
                                                                        }
                                                                    }
                                                                }
                                                                if (onDemandMessageAnalyticsData != null) {
                                                                    Analytics analytics = ((RealActivityAnalyticsService) activityAnalyticsService).analyticsService;
                                                                    String str4 = onDemandMessageAnalyticsData.campaignToken;
                                                                    long currentTimeMillis = System.currentTimeMillis();
                                                                    String str5 = onDemandMessageAnalyticsData.templateToken;
                                                                    Long l = onDemandMessageAnalyticsData.templateVersion;
                                                                    OnDemandMessageAnalyticsData onDemandMessageAnalyticsData2 = onDemandMessageAnalyticsData;
                                                                    Integer valueOf = l != null ? Integer.valueOf((int) l.longValue()) : null;
                                                                    Placement placement = Placement.FAMILY_APPLET;
                                                                    analytics.track(new OnDemandMessageInteractDismiss(str4, Long.valueOf(currentTimeMillis), str5, valueOf, RealActivityAnalyticsService.toCdf(onDemandMessageAnalyticsData2.f1046format), CollectionsKt.joinToString$default(onDemandMessageAnalyticsData2.productTypes, null, null, null, 0, null, null, 63)), null);
                                                                    JobKt.launch$default(coroutineScope, null, null, new NetworkFetcher$doFetch$2(activityTabPresenter, onDemandMessageAnalyticsData2, null, 20), 3);
                                                                }
                                                                if (str2 == null || screen != null) {
                                                                    RealActivityAnalyticsService realActivityAnalyticsService = (RealActivityAnalyticsService) activityAnalyticsService;
                                                                    str3.getClass();
                                                                    Analytics analytics2 = realActivityAnalyticsService.analyticsService;
                                                                    ActivityItemOrigin activityItemOrigin = ActivityItemOrigin.HISTORY;
                                                                    String activityFlowToken = realActivityAnalyticsService.getActivityFlowToken();
                                                                    String str6 = realActivityAnalyticsService.searchFlowToken;
                                                                    String str7 = realActivityAnalyticsService.queryToken;
                                                                    ActivityAnalyticsService.TapElement tapElement = ActivityAnalyticsService.TapElement.AVATAR;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    ActivityHistoryTapItem activityHistoryTapItem = new ActivityHistoryTapItem(str3, bool, bool, null, null, null, activityItemOrigin, activityFlowToken, str6, str7, null, null, 0, "row");
                                                                    str = str3;
                                                                    analytics2.track(activityHistoryTapItem, null);
                                                                    if (access$models$onDemandAnalyticsForToken != null) {
                                                                        String str8 = appMessageActionTaken.url;
                                                                        Analytics analytics3 = ((RealActivityAnalyticsService) activityAnalyticsService).analyticsService;
                                                                        String str9 = access$models$onDemandAnalyticsForToken.campaignToken;
                                                                        long currentTimeMillis2 = System.currentTimeMillis();
                                                                        String str10 = access$models$onDemandAnalyticsForToken.templateToken;
                                                                        Long l2 = access$models$onDemandAnalyticsForToken.templateVersion;
                                                                        analytics3.track(new OnDemandMessageInteractClick(str9, Long.valueOf(currentTimeMillis2), str8, Placement.ACTIVITY_TAB, str10, l2 != null ? Integer.valueOf((int) l2.longValue()) : null, RealActivityAnalyticsService.toCdf(access$models$onDemandAnalyticsForToken.f1046format), CollectionsKt.joinToString$default(access$models$onDemandAnalyticsForToken.productTypes, null, null, null, 0, null, null, 63), 16), null);
                                                                    }
                                                                } else {
                                                                    str = str3;
                                                                }
                                                                if (z) {
                                                                    RealRouter realRouter = activityTabPresenter.router;
                                                                    AnalyticsParams.InAppNotificationParams inAppNotificationParams = new AnalyticsParams.InAppNotificationParams(str);
                                                                    if (screen == null) {
                                                                        screen = ActivityScreen.INSTANCE;
                                                                    }
                                                                    realRouter.route(new RoutingParams(null, null, screen, null, inAppNotificationParams, null, 471), str2);
                                                                }
                                                            }
                                                        } else {
                                                            CardAppMessageViewModel.Ready ready6 = (CardAppMessageViewModel.Ready) mutableState5.getValue();
                                                            if (Intrinsics.areEqual(str3, ready6 != null ? ready6.messageToken : null) && (ready = (CardAppMessageViewModel.Ready) mutableState5.getValue()) != null) {
                                                                onDemandMessageAnalyticsData = ready.onDemandAnalytics;
                                                                if (str2 == null) {
                                                                }
                                                                if (z2) {
                                                                }
                                                                if (onDemandMessageAnalyticsData != null) {
                                                                }
                                                                if (str2 == null) {
                                                                }
                                                                RealActivityAnalyticsService realActivityAnalyticsService2 = (RealActivityAnalyticsService) activityAnalyticsService;
                                                                str3.getClass();
                                                                Analytics analytics22 = realActivityAnalyticsService2.analyticsService;
                                                                ActivityItemOrigin activityItemOrigin2 = ActivityItemOrigin.HISTORY;
                                                                String activityFlowToken2 = realActivityAnalyticsService2.getActivityFlowToken();
                                                                String str62 = realActivityAnalyticsService2.searchFlowToken;
                                                                String str72 = realActivityAnalyticsService2.queryToken;
                                                                ActivityAnalyticsService.TapElement tapElement2 = ActivityAnalyticsService.TapElement.AVATAR;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                ActivityHistoryTapItem activityHistoryTapItem2 = new ActivityHistoryTapItem(str3, bool2, bool2, null, null, null, activityItemOrigin2, activityFlowToken2, str62, str72, null, null, 0, "row");
                                                                str = str3;
                                                                analytics22.track(activityHistoryTapItem2, null);
                                                                if (access$models$onDemandAnalyticsForToken != null) {
                                                                }
                                                                if (z) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                    onDemandMessageAnalyticsData = null;
                                                    if (str2 == null) {
                                                    }
                                                    if (z2) {
                                                    }
                                                    if (onDemandMessageAnalyticsData != null) {
                                                    }
                                                    if (str2 == null) {
                                                    }
                                                    RealActivityAnalyticsService realActivityAnalyticsService22 = (RealActivityAnalyticsService) activityAnalyticsService;
                                                    str3.getClass();
                                                    Analytics analytics222 = realActivityAnalyticsService22.analyticsService;
                                                    ActivityItemOrigin activityItemOrigin22 = ActivityItemOrigin.HISTORY;
                                                    String activityFlowToken22 = realActivityAnalyticsService22.getActivityFlowToken();
                                                    String str622 = realActivityAnalyticsService22.searchFlowToken;
                                                    String str722 = realActivityAnalyticsService22.queryToken;
                                                    ActivityAnalyticsService.TapElement tapElement22 = ActivityAnalyticsService.TapElement.AVATAR;
                                                    Boolean bool22 = Boolean.FALSE;
                                                    ActivityHistoryTapItem activityHistoryTapItem22 = new ActivityHistoryTapItem(str3, bool22, bool22, null, null, null, activityItemOrigin22, activityFlowToken22, str622, str722, null, null, 0, "row");
                                                    str = str3;
                                                    analytics222.track(activityHistoryTapItem22, null);
                                                    if (access$models$onDemandAnalyticsForToken != null) {
                                                    }
                                                    if (z) {
                                                    }
                                                } else if (appMessageViewEvent instanceof AppMessageViewEvent.AppMessageUndoDismiss) {
                                                    String str11 = ((AppMessageViewEvent.AppMessageUndoDismiss) appMessageViewEvent).messageToken;
                                                    InlineAppMessageV2ViewModel.Ready ready7 = (InlineAppMessageV2ViewModel.Ready) mutableState2.getValue();
                                                    if (Intrinsics.areEqual(str11, ready7 != null ? ready7.messageToken : null)) {
                                                        mutableState2.setValue(null);
                                                    } else {
                                                        CardAppMessageViewModel.Ready ready8 = (CardAppMessageViewModel.Ready) mutableState5.getValue();
                                                        if (Intrinsics.areEqual(str11, ready8 != null ? ready8.messageToken : null)) {
                                                            mutableState5.setValue(null);
                                                        }
                                                    }
                                                } else if (appMessageViewEvent instanceof AppMessageViewEvent.AppMessageViewed) {
                                                    String str12 = ((AppMessageViewEvent.AppMessageViewed) appMessageViewEvent).messageToken;
                                                    RealActivityAnalyticsService realActivityAnalyticsService3 = (RealActivityAnalyticsService) activityAnalyticsService;
                                                    str12.getClass();
                                                    Analytics analytics4 = realActivityAnalyticsService3.analyticsService;
                                                    ActivityItemOrigin activityItemOrigin3 = ActivityItemOrigin.HISTORY;
                                                    String activityFlowToken3 = realActivityAnalyticsService3.getActivityFlowToken();
                                                    String str13 = realActivityAnalyticsService3.searchFlowToken;
                                                    String str14 = realActivityAnalyticsService3.queryToken;
                                                    Boolean bool3 = Boolean.FALSE;
                                                    analytics4.track(new ActivityHistoryViewItem(str12, bool3, bool3, null, null, null, activityItemOrigin3, activityFlowToken3, str13, str14, null, null, 0, null, null), null);
                                                    OnDemandMessageAnalyticsData access$models$onDemandAnalyticsForToken2 = ActivityTabPresenter.access$models$onDemandAnalyticsForToken(mutableState4, mutableState3, str12);
                                                    if (access$models$onDemandAnalyticsForToken2 != null && ((Set) collection).add(str12)) {
                                                        Analytics analytics5 = ((RealActivityAnalyticsService) activityAnalyticsService).analyticsService;
                                                        String str15 = access$models$onDemandAnalyticsForToken2.campaignToken;
                                                        long currentTimeMillis3 = System.currentTimeMillis();
                                                        String str16 = access$models$onDemandAnalyticsForToken2.templateToken;
                                                        Long l3 = access$models$onDemandAnalyticsForToken2.templateVersion;
                                                        analytics5.track(new OnDemandMessageInteractView(str15, Long.valueOf(currentTimeMillis3), Placement.ACTIVITY_TAB, str16, l3 != null ? Integer.valueOf((int) l3.longValue()) : null, RealActivityAnalyticsService.toCdf(access$models$onDemandAnalyticsForToken2.f1046format), CollectionsKt.joinToString$default(access$models$onDemandAnalyticsForToken2.productTypes, null, null, null, 0, null, null, 63)), null);
                                                    }
                                                }
                                            }
                                        } else {
                                            loadTimeClock.stop();
                                            Long duration = loadTimeClock.duration();
                                            if (duration != null) {
                                                RealActivityAnalyticsService realActivityAnalyticsService4 = (RealActivityAnalyticsService) activityAnalyticsService;
                                                realActivityAnalyticsService4.analyticsService.track(new ActivityHistoryBrowseViewScreen(realActivityAnalyticsService4.getActivityFlowToken(), duration), null);
                                            }
                                        }
                                    }
                                } else if (((PulledToRefresh) activityTabViewEvent).manuallyTriggered) {
                                    RealActivityAnalyticsService realActivityAnalyticsService5 = (RealActivityAnalyticsService) activityAnalyticsService;
                                    realActivityAnalyticsService5.analyticsService.track(new ActivityHistoryRefreshForce(realActivityAnalyticsService5.getActivityFlowToken()), null);
                                }
                            }
                        } else {
                            if (((InviteFriendsClicked) activityTabViewEvent).fromQab) {
                                ((RealActivityAnalyticsService) activityAnalyticsService).trackSelectQabItem(QABItemType.INVITE_FRIENDS, null, QABItemOrigin.ACTIVITY);
                            } else {
                                activityTabPresenter.analytics.track(new ActivityHistorySelectInviteFriends(), null);
                            }
                            activityTabPresenter.navigator.goTo(((RealFlowStarter) activityTabPresenter.flowStarter).startInviteFlow(new Finish(null), BlockersScreens.StartFlowEntryPointScreen.Origin.ACTIVITY));
                        }
                    } else {
                        StandaloneCoroutine standaloneCoroutine = activityTabPresenter.loadMoreJob;
                        if (standaloneCoroutine != null) {
                            i = 1;
                            break;
                        } else {
                            i = 1;
                        }
                        activityTabPresenter.loadMoreJob = JobKt.launch$default(coroutineScope, null, null, new HeroCardViewKt$Render$1$8$1.AnonymousClass3(mutableState, null, i), 3);
                    }
                    break;
                default:
                    LocalDate localDate = (LocalDate) obj7;
                    PaymentScheduleFrequency paymentScheduleFrequency = (PaymentScheduleFrequency) obj6;
                    LocalDate localDate2 = (LocalDate) obj5;
                    String str17 = (String) obj4;
                    ShareSheetPresenter shareSheetPresenter = (ShareSheetPresenter) obj3;
                    BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) shareSheetPresenter.navigator;
                    Analytics analytics6 = (Analytics) shareSheetPresenter.analytics;
                    PaymentScreens.SchedulePayment schedulePayment = (PaymentScreens.SchedulePayment) shareSheetPresenter.modelUpdates;
                    SchedulePaymentViewEvent schedulePaymentViewEvent = (SchedulePaymentViewEvent) obj;
                    SchedulePaymentViewEvent.Close close = SchedulePaymentViewEvent.Close.INSTANCE;
                    if (!Intrinsics.areEqual(schedulePaymentViewEvent, close) && !Intrinsics.areEqual(schedulePaymentViewEvent, SchedulePaymentViewEvent.Cancel.INSTANCE)) {
                        if (!Intrinsics.areEqual(schedulePaymentViewEvent, SchedulePaymentViewEvent.RemoveSchedule.INSTANCE)) {
                            if (!Intrinsics.areEqual(schedulePaymentViewEvent, SchedulePaymentViewEvent.Done.INSTANCE)) {
                                if (!(schedulePaymentViewEvent instanceof SchedulePaymentViewEvent.FrequencyChanged)) {
                                    if (!(schedulePaymentViewEvent instanceof SchedulePaymentViewEvent.DateChanged)) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        break;
                                    } else {
                                        Iterator<E> it = ((ImmutableList) collection).iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                obj2 = it.next();
                                                if (((ScheduleCalendarDate) obj2).date.isEqual(((SchedulePaymentViewEvent.DateChanged) schedulePaymentViewEvent).date)) {
                                                }
                                            } else {
                                                obj2 = null;
                                            }
                                        }
                                        ScheduleCalendarDate scheduleCalendarDate = (ScheduleCalendarDate) obj2;
                                        if (scheduleCalendarDate != null) {
                                            String str18 = schedulePayment.flowToken;
                                            PaymentScheduleFrequency paymentScheduleFrequency2 = (PaymentScheduleFrequency) mutableState.getValue();
                                            LocalDate localDate3 = ((SchedulePaymentViewEvent.DateChanged) schedulePaymentViewEvent).date;
                                            int between = (int) ChronoUnit.DAYS.between(localDate2, localDate3);
                                            DayOfWeek dayOfWeek = localDate3.getDayOfWeek();
                                            dayOfWeek.getClass();
                                            int safeDayOfMonth = DimensionKt.getSafeDayOfMonth(localDate3);
                                            str17.getClass();
                                            paymentScheduleFrequency2.getClass();
                                            analytics6.track(new AssetSendSelectScheduleStartDate(str17, str18, AnalyticsHelperKt.toCdfFrequency(paymentScheduleFrequency2), Integer.valueOf(between), AnalyticsHelperKt.toCdfDayOfWeek(dayOfWeek), Integer.valueOf(safeDayOfMonth), Boolean.valueOf(z)), null);
                                            mutableState2.setValue(scheduleCalendarDate);
                                        }
                                    }
                                } else {
                                    String str19 = schedulePayment.flowToken;
                                    PaymentScheduleFrequency paymentScheduleFrequency3 = (PaymentScheduleFrequency) mutableState.getValue();
                                    PaymentScheduleFrequency paymentScheduleFrequency4 = ((SchedulePaymentViewEvent.FrequencyChanged) schedulePaymentViewEvent).frequency;
                                    str17.getClass();
                                    paymentScheduleFrequency3.getClass();
                                    paymentScheduleFrequency4.getClass();
                                    analytics6.track(new AssetSendSelectScheduleFrequency(str17, str19, AnalyticsHelperKt.toCdfFrequency(paymentScheduleFrequency3), AnalyticsHelperKt.toCdfFrequency(paymentScheduleFrequency4), Boolean.valueOf(z)), null);
                                    mutableState.setValue(paymentScheduleFrequency4);
                                }
                            } else {
                                String str20 = schedulePayment.flowToken;
                                PaymentScheduleFrequency paymentScheduleFrequency5 = (PaymentScheduleFrequency) mutableState.getValue();
                                int between2 = (int) ChronoUnit.DAYS.between(localDate2, ((ScheduleCalendarDate) mutableState2.getValue()).date);
                                DayOfWeek dayOfWeek2 = ((ScheduleCalendarDate) mutableState2.getValue()).date.getDayOfWeek();
                                dayOfWeek2.getClass();
                                int safeDayOfMonth2 = DimensionKt.getSafeDayOfMonth(((ScheduleCalendarDate) mutableState2.getValue()).date);
                                boolean z3 = ((PaymentScheduleFrequency) mutableState.getValue()) != paymentScheduleFrequency;
                                boolean z4 = !((ScheduleCalendarDate) mutableState2.getValue()).date.equals(localDate);
                                str17.getClass();
                                paymentScheduleFrequency5.getClass();
                                analytics6.track(new AssetSendConfirmSchedulePayment(str17, str20, AnalyticsHelperKt.toCdfFrequency(paymentScheduleFrequency5), Integer.valueOf(between2), AnalyticsHelperKt.toCdfDayOfWeek(dayOfWeek2), Integer.valueOf(safeDayOfMonth2), Boolean.valueOf(z), Boolean.valueOf(z3), Boolean.valueOf(z4)), null);
                                screenNavigator.giveAnswer(schedulePayment.question, new PaymentScreens.SchedulePayment.SchedulePaymentAnswer.Selected(new PaymentScheduleSelection(((ScheduleCalendarDate) mutableState2.getValue()).date, (PaymentScheduleFrequency) mutableState.getValue())));
                            }
                        } else {
                            String str21 = schedulePayment.flowToken;
                            int between3 = (int) ChronoUnit.DAYS.between(localDate2, localDate);
                            str17.getClass();
                            paymentScheduleFrequency.getClass();
                            analytics6.track(new AssetSendRemoveSchedulePayment(str17, str21, AnalyticsHelperKt.toCdfFrequency(paymentScheduleFrequency), Integer.valueOf(between3)), null);
                            screenNavigator.giveAnswer(schedulePayment.question, PaymentScreens.SchedulePayment.SchedulePaymentAnswer.Cleared.INSTANCE);
                        }
                    } else {
                        String str22 = schedulePayment.flowToken;
                        AssetSendCancelSchedulePayment.ScheduleDismissalMethod scheduleDismissalMethod = Intrinsics.areEqual(schedulePaymentViewEvent, close) ? AssetSendCancelSchedulePayment.ScheduleDismissalMethod.CLOSE_BUTTON : AssetSendCancelSchedulePayment.ScheduleDismissalMethod.CANCEL_BUTTON;
                        boolean z5 = (((PaymentScheduleFrequency) mutableState.getValue()) == paymentScheduleFrequency && ((ScheduleCalendarDate) mutableState2.getValue()).date.equals(localDate)) ? false : true;
                        PaymentScheduleFrequency paymentScheduleFrequency6 = (PaymentScheduleFrequency) mutableState.getValue();
                        int between4 = (int) ChronoUnit.DAYS.between(localDate2, ((ScheduleCalendarDate) mutableState2.getValue()).date);
                        str17.getClass();
                        paymentScheduleFrequency6.getClass();
                        analytics6.track(new AssetSendCancelSchedulePayment(str17, str22, scheduleDismissalMethod, Boolean.valueOf(z), Boolean.valueOf(z5), AnalyticsHelperKt.toCdfFrequency(paymentScheduleFrequency6), Integer.valueOf(between4)), null);
                        screenNavigator.goTo(Back.INSTANCE);
                    }
                    break;
            }
            return Unit.INSTANCE;
        }

        public AnonymousClass1(CoroutineScope coroutineScope, ShareSheetPresenter shareSheetPresenter, String str, boolean z, PaymentScheduleFrequency paymentScheduleFrequency, LocalDate localDate, LocalDate localDate2, ImmutableList immutableList, MutableState mutableState, MutableState mutableState2) {
            this.$$this$LaunchedEffect = shareSheetPresenter;
            this.this$0 = str;
            this.$usePromoterUpsells$inlined = z;
            this.$dismissedCardMessage$delegate$inlined = paymentScheduleFrequency;
            this.$promoterInlineV2Message$delegate$inlined = localDate;
            this.$promoterCardMessage$delegate$inlined = localDate2;
            this.$viewedOnDemandTokens$inlined = immutableList;
            this.$theManager$delegate$inlined = mutableState;
            this.$dismissedInlineMessage$delegate$inlined = mutableState2;
        }
    }
}
