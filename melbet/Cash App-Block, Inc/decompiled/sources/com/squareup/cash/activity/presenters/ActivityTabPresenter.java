package com.squareup.cash.activity.presenters;

import androidx.biometric.KeyguardUtils;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.compose.material3.DateInputKt$$ExternalSyntheticLambda5;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1;
import app.cash.badging.backend.RealBadger2$scheduleBadgeClearingWork$$inlined$map$1;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.presenter.molecule.RenavigationKt;
import app.cash.broadway.presenter.molecule.SwipeKt;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.inputfieldtext.InputFieldText;
import app.cash.inputfieldtext.saver.RealInputFieldTextSaver;
import app.cash.local.store.real.RealLocalInstalledStore$hideBrands$$inlined$map$1;
import app.cash.local.views.cart.CartBannerViewKt$$ExternalSyntheticLambda2;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.xg$$ExternalSyntheticLambda9;
import bo.app.yf$$ExternalSyntheticLambda2;
import coil3.RealImageLoader$execute$result$1;
import coil3.network.NetworkFetcher$doFetch$2;
import coil3.network.NetworkFetcher$fetch$2;
import com.google.android.gms.internal.mlkit_genai_prompt.zzaad;
import com.google.mlkit.vision.text.internal.zzr;
import com.miteksystems.misnap.camera.a.n;
import com.squareup.cash.account.presenters.EditProfilePresenter$models$2$1;
import com.squareup.cash.activity.analytics.ActivityAnalyticsService;
import com.squareup.cash.activity.backend.ActivityFeedProducer;
import com.squareup.cash.activity.backend.ActivityItem;
import com.squareup.cash.activity.backend.RealActivityAnalyticsService;
import com.squareup.cash.activity.backend.RealActivityUpdatesNotifier;
import com.squareup.cash.activity.backend.loader.Activities;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.activity.backend.loader.LoadingState;
import com.squareup.cash.activity.backend.offline.OfflineActivitiesManager;
import com.squareup.cash.activity.backend.offline.RealOfflineActivitiesManager;
import com.squareup.cash.activity.presenters.ActivityItemPresenter;
import com.squareup.cash.activity.screens.ActivityScreen;
import com.squareup.cash.activity.viewmodels.ActivityFeedEntry;
import com.squareup.cash.activity.viewmodels.ActivityItemPresentationContext;
import com.squareup.cash.activity.viewmodels.ActivityTabViewModel;
import com.squareup.cash.activity.viewmodels.ContactHeaderViewModel;
import com.squareup.cash.appmessages.CardAppMessageViewModel;
import com.squareup.cash.appmessages.InlineAppMessageV2ViewModel;
import com.squareup.cash.appmessages.InlineAppMessageViewModel;
import com.squareup.cash.appmessages.OnDemandMessageAnalyticsData;
import com.squareup.cash.appmessages.presenters.ActivityCardAppMessagePresenter$Factory$Impl;
import com.squareup.cash.appmessages.presenters.ActivityInlineAppMessageV2Presenter$Factory$Impl;
import com.squareup.cash.appmessages.presenters.CardAppMessagePresenterHelper$Factory$Impl;
import com.squareup.cash.appmessages.presenters.InlineAppMessageV2PresenterHelper$Factory$Impl;
import com.squareup.cash.appmessages.presenters.ProfileInlineAppMessagePresenter$Factory$Impl;
import com.squareup.cash.arcade.MotionKt$$ExternalSyntheticLambda0;
import com.squareup.cash.arcade.components.ToastKt$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.treehouse.SearchBarBinding$Content$1$1;
import com.squareup.cash.bitcoin.presenters.BitcoinDepositsPresenter$special$$inlined$filter$1;
import com.squareup.cash.blockers.views.SetNameViewKt$SetName$2$1;
import com.squareup.cash.boost.backend.RealBoostSyncer$refresh$1;
import com.squareup.cash.borrow.presenters.util.RealLoanFlowStarter$MetroFactory;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.cashapplite.cashin.RealLiteCashInRepo$MetroFactory;
import com.squareup.cash.cdf.ActivityItemOrigin;
import com.squareup.cash.cdf.activityhistory.ActivityHistorySearchStart;
import com.squareup.cash.cdf.activityhistory.ActivityHistoryViewLoad;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.db.InvitationConfig;
import com.squareup.cash.data.db.RealAppConfigManager;
import com.squareup.cash.datetimeformatter.real.RealDateTimeFormatterFactory;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$ActivityUsePromoterUpsells;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$EarningsCustomerTaggingPrompt;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$ScrollPerfLogging;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.history.analytics.LoadTimeClock;
import com.squareup.cash.history.analytics.LoadTimeClock$Factory$Impl;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.money.banners.presenters.KybBannerPresenter;
import com.squareup.cash.moneybot.backend.api.MoneybotFlagsHelper;
import com.squareup.cash.payments.backend.api.OfflineManager;
import com.squareup.cash.permissions.AndroidPermissionManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.score.views.ScoreUiFactory$$ExternalSyntheticLambda0;
import com.squareup.cash.securityhub.presenters.SecurityHubPresenter$MetroFactory;
import com.squareup.cash.storage.RealFileDownloader;
import com.squareup.cash.tabs.presenters.TabToolbarPresenter;
import com.squareup.cash.tabs.presenters.TabToolbarPresenter$Factory$Impl;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewModel;
import com.squareup.cash.ui.overlays.presenter.RealAlertBannerPresenter;
import com.squareup.cash.ui.overlays.presenter.RealAlertBannerPresenter$Factory$Impl;
import com.squareup.cash.ui.overlays.viewmodels.AlertBannerScreen;
import com.squareup.cash.ui.overlays.viewmodels.AlertBannerViewModel;
import com.squareup.cash.work.data.real.RealPayDataLoader$loadPayData$2;
import com.squareup.cash.work.session.RealCurrentUserSetter;
import com.squareup.cash.work.views.shift.ShiftListViewKt$$ExternalSyntheticLambda8;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.activity.api.v1.ActivityClientService;
import com.squareup.protos.cash.activity.api.v1.ActivityScope;
import com.squareup.protos.cash.activity.api.v1.ActivityToken;
import com.squareup.util.compose.LifecycleKt;
import com.squareup.util.coroutines.StateFlowKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import papa.InputEventTrigger;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes5.dex */
public final class ActivityTabPresenter implements MoleculePresenter {
    public final ActivitiesManager activitiesManager;
    public final ActivityAnalyticsService activityAnalyticsService;
    public final KybBannerPresenter activityCardAppMessagePresenter;
    public final ActivityFeedProducer activityFeedProducer;
    public final MoleculePresenter activityInlineAppMessagePresenter;
    public final KybBannerPresenter activityInlineAppMessageV2Presenter;
    public final ActivityItemPresenter.Factory activityItemPresenterFactory;
    public final zzr activityTabItemEventDecorator;
    public final ActivityToken activityToken;
    public final RealActivityUpdatesNotifier activityUpdatesNotifierRelay;
    public final KeyValue activityViewed;
    public final RealAlertBannerPresenter alertBannerPresenter;
    public final Analytics analytics;
    public final AppConfigManager appConfigManager;
    public final boolean canRequestNotificationPermission;
    public final DisclosurePresenter contactHeaderPresenter;
    public final RealDateTimeFormatterFactory dateTimeFormatterFactory;
    public final DefaultActivityItemEventHandler$Factory$Impl defaultActivityItemEventHandlerFactory;
    public final FeatureFlagManager featureFlagManager;
    public final SharedFlowImpl feedCallbackEvents;
    public final FlowStarter flowStarter;
    public final RealActivityScreenInitialArgumentsSupplier initialArgumentsSupplier;
    public final KeyValue inlineMessageV2TooltipViewed;
    public final RealInputFieldTextSaver inputFieldTextSaver;
    public StandaloneCoroutine loadMoreJob;
    public final LoadTimeClock loadTimeClock;
    public final ActivityTabPresenter$special$$inlined$map$1 mappedFeedCallbackEvents;
    public final MoneybotFlagsHelper moneybotFlagsHelper;
    public final BetterNavigator.ScreenNavigator navigator;
    public final OfflineActivitiesManager offlineActivitiesManager;
    public final OfflineManager offlineManager;
    public final Flow pendingPopupAppMessages;
    public final AndroidPermissionManager permissionManager;
    public final n promoterActivityMessageProvider;
    public final RealRouter router;
    public final ActivitiesManager searchActivitiesManager;
    public final n searchHandler;
    public final AndroidStringManager strings;
    public final TabToolbarPresenter tabToolbarPresenter;

    public ActivityTabPresenter(BetterNavigator.ScreenNavigator screenNavigator, boolean z, TabToolbarPresenter$Factory$Impl tabToolbarPresenter$Factory$Impl, ActivitiesManager.Factory factory, ActivityTabSearchCache activityTabSearchCache, ActivityClientService activityClientService, RealContactHeaderPresenter$Factory$Impl realContactHeaderPresenter$Factory$Impl, AndroidPermissionManager androidPermissionManager, RealActivityScreenInitialArgumentsSupplier realActivityScreenInitialArgumentsSupplier, ActivityFeedProducer activityFeedProducer, AndroidStringManager androidStringManager, ActivityItemPresenter.Factory factory2, RealActivityUpdatesNotifier realActivityUpdatesNotifier, OfflineActivitiesManager offlineActivitiesManager, OfflineManager offlineManager, AppConfigManager appConfigManager, FlowStarter flowStarter, Analytics analytics, RealInputFieldTextSaver realInputFieldTextSaver, ProfileInlineAppMessagePresenter$Factory$Impl profileInlineAppMessagePresenter$Factory$Impl, ActivityInlineAppMessageV2Presenter$Factory$Impl activityInlineAppMessageV2Presenter$Factory$Impl, ActivityCardAppMessagePresenter$Factory$Impl activityCardAppMessagePresenter$Factory$Impl, Flow flow, ActivityToken activityToken, ActivitiesManager activitiesManager, KeyValue keyValue, KeyValue keyValue2, ActivityAnalyticsService activityAnalyticsService, FeatureFlagManager featureFlagManager, n nVar, LoadTimeClock$Factory$Impl loadTimeClock$Factory$Impl, DefaultActivityItemEventHandler$Factory$Impl defaultActivityItemEventHandler$Factory$Impl, zzr zzrVar, RealAlertBannerPresenter$Factory$Impl realAlertBannerPresenter$Factory$Impl, RealRouter$Factory$Impl realRouter$Factory$Impl, MoneybotFlagsHelper moneybotFlagsHelper, RealDateTimeFormatterFactory realDateTimeFormatterFactory) {
        this.navigator = screenNavigator;
        this.canRequestNotificationPermission = z;
        this.permissionManager = androidPermissionManager;
        this.initialArgumentsSupplier = realActivityScreenInitialArgumentsSupplier;
        this.activityFeedProducer = activityFeedProducer;
        this.strings = androidStringManager;
        this.activityItemPresenterFactory = factory2;
        this.activityUpdatesNotifierRelay = realActivityUpdatesNotifier;
        this.offlineActivitiesManager = offlineActivitiesManager;
        this.offlineManager = offlineManager;
        this.appConfigManager = appConfigManager;
        this.flowStarter = flowStarter;
        this.analytics = analytics;
        this.inputFieldTextSaver = realInputFieldTextSaver;
        this.pendingPopupAppMessages = flow;
        this.activityToken = activityToken;
        this.activitiesManager = activitiesManager;
        this.activityViewed = keyValue;
        this.inlineMessageV2TooltipViewed = keyValue2;
        this.activityAnalyticsService = activityAnalyticsService;
        this.featureFlagManager = featureFlagManager;
        this.promoterActivityMessageProvider = nVar;
        this.defaultActivityItemEventHandlerFactory = defaultActivityItemEventHandler$Factory$Impl;
        this.activityTabItemEventDecorator = zzrVar;
        this.moneybotFlagsHelper = moneybotFlagsHelper;
        this.dateTimeFormatterFactory = realDateTimeFormatterFactory;
        ActivityScreen activityScreen = ActivityScreen.INSTANCE;
        this.tabToolbarPresenter = tabToolbarPresenter$Factory$Impl.create(screenNavigator, activityScreen);
        this.contactHeaderPresenter = realContactHeaderPresenter$Factory$Impl.create$1(activityScreen, screenNavigator);
        this.activityInlineAppMessagePresenter = profileInlineAppMessagePresenter$Factory$Impl.create(screenNavigator);
        SecurityHubPresenter$MetroFactory securityHubPresenter$MetroFactory = activityInlineAppMessageV2Presenter$Factory$Impl.delegateFactory;
        Flow flow2 = (Flow) securityHubPresenter$MetroFactory.analytics.getValue();
        InlineAppMessageV2PresenterHelper$Factory$Impl inlineAppMessageV2PresenterHelper$Factory$Impl = (InlineAppMessageV2PresenterHelper$Factory$Impl) securityHubPresenter$MetroFactory.protectionsSectionPresenterFactory.value;
        flow2.getClass();
        inlineAppMessageV2PresenterHelper$Factory$Impl.getClass();
        this.activityInlineAppMessageV2Presenter = new KybBannerPresenter(flow2, inlineAppMessageV2PresenterHelper$Factory$Impl, screenNavigator);
        SecurityHubPresenter$MetroFactory securityHubPresenter$MetroFactory2 = activityCardAppMessagePresenter$Factory$Impl.delegateFactory;
        Flow flow3 = (Flow) securityHubPresenter$MetroFactory2.analytics.getValue();
        CardAppMessagePresenterHelper$Factory$Impl cardAppMessagePresenterHelper$Factory$Impl = (CardAppMessagePresenterHelper$Factory$Impl) securityHubPresenter$MetroFactory2.protectionsSectionPresenterFactory.value;
        flow3.getClass();
        cardAppMessagePresenterHelper$Factory$Impl.getClass();
        this.activityCardAppMessagePresenter = new KybBannerPresenter(flow3, cardAppMessagePresenterHelper$Factory$Impl, screenNavigator);
        this.alertBannerPresenter = realAlertBannerPresenter$Factory$Impl.create$1(screenNavigator, AlertBannerScreen.ACTIVITY_TAB);
        this.router = realRouter$Factory$Impl.create$1(screenNavigator);
        LoadTimeClock create = loadTimeClock$Factory$Impl.create(false);
        this.loadTimeClock = create;
        n nVar2 = new n(activityClientService, activityAnalyticsService);
        this.searchHandler = nVar2;
        this.searchActivitiesManager = factory.create(new ActivitiesManager.ActivityContext(activityToken, ActivityScope.MY_ACTIVITY, nVar2, 8), activityTabSearchCache);
        SharedFlowImpl MutableSharedFlow$default = FlowKt.MutableSharedFlow$default(0, 50, null, 5);
        this.feedCallbackEvents = MutableSharedFlow$default;
        this.mappedFeedCallbackEvents = new ActivityTabPresenter$special$$inlined$map$1(MutableSharedFlow$default, 0);
        create.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0165 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0181 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable access$buildFeedEntries(ActivityTabPresenter activityTabPresenter, Activities activities, ContactHeaderViewModel contactHeaderViewModel, List list, InvitationConfig invitationConfig, InlineAppMessageViewModel inlineAppMessageViewModel, InlineAppMessageV2ViewModel inlineAppMessageV2ViewModel, CardAppMessageViewModel cardAppMessageViewModel, ContinuationImpl continuationImpl) {
        ActivityTabPresenter$buildFeedEntries$1 activityTabPresenter$buildFeedEntries$1;
        int i;
        ContactHeaderViewModel contactHeaderViewModel2;
        InvitationConfig invitationConfig2;
        InlineAppMessageViewModel inlineAppMessageViewModel2;
        InlineAppMessageV2ViewModel inlineAppMessageV2ViewModel2;
        CardAppMessageViewModel cardAppMessageViewModel2;
        Object produceFeed$default;
        Activities activities2;
        List list2;
        String str;
        LoadingState loadingState;
        ListBuilder createListBuilder;
        ListBuilder.Itr itr;
        Object next;
        Pair pair;
        LoadingState loadingState2;
        Function0 function0;
        if (continuationImpl instanceof ActivityTabPresenter$buildFeedEntries$1) {
            activityTabPresenter$buildFeedEntries$1 = (ActivityTabPresenter$buildFeedEntries$1) continuationImpl;
            int i2 = activityTabPresenter$buildFeedEntries$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                activityTabPresenter$buildFeedEntries$1.label = i2 - PKIFailureInfo.systemUnavail;
                ActivityTabPresenter$buildFeedEntries$1 activityTabPresenter$buildFeedEntries$12 = activityTabPresenter$buildFeedEntries$1;
                Object obj = activityTabPresenter$buildFeedEntries$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = activityTabPresenter$buildFeedEntries$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ActivityFeedProducer activityFeedProducer = activityTabPresenter.activityFeedProducer;
                    activityTabPresenter$buildFeedEntries$12.L$0 = activities;
                    contactHeaderViewModel2 = contactHeaderViewModel;
                    activityTabPresenter$buildFeedEntries$12.L$1 = contactHeaderViewModel2;
                    invitationConfig2 = invitationConfig;
                    activityTabPresenter$buildFeedEntries$12.L$3 = invitationConfig2;
                    inlineAppMessageViewModel2 = inlineAppMessageViewModel;
                    activityTabPresenter$buildFeedEntries$12.L$4 = inlineAppMessageViewModel2;
                    inlineAppMessageV2ViewModel2 = inlineAppMessageV2ViewModel;
                    activityTabPresenter$buildFeedEntries$12.L$5 = inlineAppMessageV2ViewModel2;
                    cardAppMessageViewModel2 = cardAppMessageViewModel;
                    activityTabPresenter$buildFeedEntries$12.L$6 = cardAppMessageViewModel2;
                    activityTabPresenter$buildFeedEntries$12.label = 1;
                    produceFeed$default = ActivityFeedProducer.produceFeed$default(activityFeedProducer, activities, list, 0, activityTabPresenter$buildFeedEntries$12, 4);
                    if (produceFeed$default == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    activities2 = activities;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    CardAppMessageViewModel cardAppMessageViewModel3 = activityTabPresenter$buildFeedEntries$12.L$6;
                    InlineAppMessageV2ViewModel inlineAppMessageV2ViewModel3 = activityTabPresenter$buildFeedEntries$12.L$5;
                    InlineAppMessageViewModel inlineAppMessageViewModel3 = activityTabPresenter$buildFeedEntries$12.L$4;
                    InvitationConfig invitationConfig3 = activityTabPresenter$buildFeedEntries$12.L$3;
                    ContactHeaderViewModel contactHeaderViewModel3 = activityTabPresenter$buildFeedEntries$12.L$1;
                    activities2 = activityTabPresenter$buildFeedEntries$12.L$0;
                    SafeTrace.throwOnFailure(obj);
                    cardAppMessageViewModel2 = cardAppMessageViewModel3;
                    inlineAppMessageV2ViewModel2 = inlineAppMessageV2ViewModel3;
                    inlineAppMessageViewModel2 = inlineAppMessageViewModel3;
                    invitationConfig2 = invitationConfig3;
                    produceFeed$default = obj;
                    contactHeaderViewModel2 = contactHeaderViewModel3;
                }
                list2 = (List) produceFeed$default;
                if (invitationConfig2 != null) {
                    InvitationConfig invitationConfig4 = invitationConfig2.enabled ? invitationConfig2 : null;
                    if (invitationConfig4 != null) {
                        str = invitationConfig4.standalone_invite_friends_cta;
                        if (str == null) {
                            str = invitationConfig4.activity_button_text;
                        }
                        List list3 = activities2.recentActivities;
                        loadingState = activities2.loadingState;
                        List list4 = list3;
                        boolean z = (list4 == null || list4.isEmpty()) && list2.isEmpty();
                        createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                        int i3 = 23;
                        if (!contactHeaderViewModel2.recipients.isEmpty()) {
                            createListBuilder.add(new CartBannerViewKt$$ExternalSyntheticLambda2(contactHeaderViewModel2, i3));
                        }
                        ListBuilder createListBuilder2 = CollectionsKt__CollectionsJVMKt.createListBuilder();
                        if (inlineAppMessageViewModel2 instanceof InlineAppMessageViewModel.Ready) {
                            InlineAppMessageViewModel.Ready ready = (InlineAppMessageViewModel.Ready) inlineAppMessageViewModel2;
                            createListBuilder2.add(new Pair(new Integer(ready.priority), new yf$$ExternalSyntheticLambda2(ready, i3)));
                        }
                        if (cardAppMessageViewModel2 instanceof CardAppMessageViewModel.Ready) {
                            CardAppMessageViewModel.Ready ready2 = (CardAppMessageViewModel.Ready) cardAppMessageViewModel2;
                            createListBuilder2.add(new Pair(new Integer(ready2.priority), new yf$$ExternalSyntheticLambda2(ready2, 24)));
                        }
                        if (inlineAppMessageV2ViewModel2 instanceof InlineAppMessageV2ViewModel.Ready) {
                            InlineAppMessageV2ViewModel.Ready ready3 = (InlineAppMessageV2ViewModel.Ready) inlineAppMessageV2ViewModel2;
                            createListBuilder2.add(new Pair(new Integer(ready3.priority), new yf$$ExternalSyntheticLambda2(ready3, 22)));
                        }
                        itr = (ListBuilder.Itr) CollectionsKt__CollectionsJVMKt.build(createListBuilder2).listIterator(0);
                        if (itr.hasNext()) {
                            next = null;
                        } else {
                            next = itr.next();
                            if (itr.hasNext()) {
                                int intValue = ((Number) ((Pair) next).first).intValue();
                                do {
                                    Object next2 = itr.next();
                                    int intValue2 = ((Number) ((Pair) next2).first).intValue();
                                    if (intValue < intValue2) {
                                        next = next2;
                                        intValue = intValue2;
                                    }
                                } while (itr.hasNext());
                            }
                        }
                        pair = (Pair) next;
                        if (pair != null && (function0 = (Function0) pair.second) != null) {
                            createListBuilder.add(new ShiftListViewKt$$ExternalSyntheticLambda8(2, function0));
                        }
                        loadingState2 = LoadingState.LOADED;
                        if (loadingState == loadingState2 && z) {
                            createListBuilder.add(new ToastKt$$ExternalSyntheticLambda1(str, 7));
                        }
                        zzaad.addGroupedActivityItems(createListBuilder, list2, activityTabPresenter.strings, new ScoreUiFactory$$ExternalSyntheticLambda0(activityTabPresenter, 3), activityTabPresenter.dateTimeFormatterFactory);
                        if (!activities2.hasMore && !z && invitationConfig2 != null && str != null && loadingState == loadingState2) {
                            createListBuilder.add(new CartBannerViewKt$$ExternalSyntheticLambda2(invitationConfig2, 21));
                        }
                        if (loadingState == loadingState2) {
                            RealActivityAnalyticsService realActivityAnalyticsService = (RealActivityAnalyticsService) activityTabPresenter.activityAnalyticsService;
                            LoadTimeClock loadTimeClock = realActivityAnalyticsService.loadTimeClock;
                            loadTimeClock.stop();
                            Long duration = loadTimeClock.duration();
                            if (duration != null) {
                                realActivityAnalyticsService.analyticsService.track(new ActivityHistoryViewLoad(Long.valueOf(duration.longValue()), Boolean.valueOf(realActivityAnalyticsService.isFirstView), Boolean.FALSE, 56), null);
                            }
                            realActivityAnalyticsService.isFirstView = false;
                        }
                        return CollectionsKt__CollectionsJVMKt.build(createListBuilder);
                    }
                }
                str = null;
                List list32 = activities2.recentActivities;
                loadingState = activities2.loadingState;
                List list42 = list32;
                if (list42 == null) {
                    createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                    int i32 = 23;
                    if (!contactHeaderViewModel2.recipients.isEmpty()) {
                    }
                    ListBuilder createListBuilder22 = CollectionsKt__CollectionsJVMKt.createListBuilder();
                    if (inlineAppMessageViewModel2 instanceof InlineAppMessageViewModel.Ready) {
                    }
                    if (cardAppMessageViewModel2 instanceof CardAppMessageViewModel.Ready) {
                    }
                    if (inlineAppMessageV2ViewModel2 instanceof InlineAppMessageV2ViewModel.Ready) {
                    }
                    itr = (ListBuilder.Itr) CollectionsKt__CollectionsJVMKt.build(createListBuilder22).listIterator(0);
                    if (itr.hasNext()) {
                    }
                    pair = (Pair) next;
                    if (pair != null) {
                        createListBuilder.add(new ShiftListViewKt$$ExternalSyntheticLambda8(2, function0));
                    }
                    loadingState2 = LoadingState.LOADED;
                    if (loadingState == loadingState2) {
                        createListBuilder.add(new ToastKt$$ExternalSyntheticLambda1(str, 7));
                    }
                    zzaad.addGroupedActivityItems(createListBuilder, list2, activityTabPresenter.strings, new ScoreUiFactory$$ExternalSyntheticLambda0(activityTabPresenter, 3), activityTabPresenter.dateTimeFormatterFactory);
                    if (!activities2.hasMore) {
                        createListBuilder.add(new CartBannerViewKt$$ExternalSyntheticLambda2(invitationConfig2, 21));
                    }
                    if (loadingState == loadingState2) {
                    }
                    return CollectionsKt__CollectionsJVMKt.build(createListBuilder);
                }
                createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                int i322 = 23;
                if (!contactHeaderViewModel2.recipients.isEmpty()) {
                }
                ListBuilder createListBuilder222 = CollectionsKt__CollectionsJVMKt.createListBuilder();
                if (inlineAppMessageViewModel2 instanceof InlineAppMessageViewModel.Ready) {
                }
                if (cardAppMessageViewModel2 instanceof CardAppMessageViewModel.Ready) {
                }
                if (inlineAppMessageV2ViewModel2 instanceof InlineAppMessageV2ViewModel.Ready) {
                }
                itr = (ListBuilder.Itr) CollectionsKt__CollectionsJVMKt.build(createListBuilder222).listIterator(0);
                if (itr.hasNext()) {
                }
                pair = (Pair) next;
                if (pair != null) {
                }
                loadingState2 = LoadingState.LOADED;
                if (loadingState == loadingState2) {
                }
                zzaad.addGroupedActivityItems(createListBuilder, list2, activityTabPresenter.strings, new ScoreUiFactory$$ExternalSyntheticLambda0(activityTabPresenter, 3), activityTabPresenter.dateTimeFormatterFactory);
                if (!activities2.hasMore) {
                }
                if (loadingState == loadingState2) {
                }
                return CollectionsKt__CollectionsJVMKt.build(createListBuilder);
            }
        }
        activityTabPresenter$buildFeedEntries$1 = new ActivityTabPresenter$buildFeedEntries$1(activityTabPresenter, continuationImpl);
        ActivityTabPresenter$buildFeedEntries$1 activityTabPresenter$buildFeedEntries$122 = activityTabPresenter$buildFeedEntries$1;
        Object obj2 = activityTabPresenter$buildFeedEntries$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = activityTabPresenter$buildFeedEntries$122.label;
        if (i != 0) {
        }
        list2 = (List) produceFeed$default;
        if (invitationConfig2 != null) {
        }
        str = null;
        List list322 = activities2.recentActivities;
        loadingState = activities2.loadingState;
        List list422 = list322;
        if (list422 == null) {
        }
        createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
        int i3222 = 23;
        if (!contactHeaderViewModel2.recipients.isEmpty()) {
        }
        ListBuilder createListBuilder2222 = CollectionsKt__CollectionsJVMKt.createListBuilder();
        if (inlineAppMessageViewModel2 instanceof InlineAppMessageViewModel.Ready) {
        }
        if (cardAppMessageViewModel2 instanceof CardAppMessageViewModel.Ready) {
        }
        if (inlineAppMessageV2ViewModel2 instanceof InlineAppMessageV2ViewModel.Ready) {
        }
        itr = (ListBuilder.Itr) CollectionsKt__CollectionsJVMKt.build(createListBuilder2222).listIterator(0);
        if (itr.hasNext()) {
        }
        pair = (Pair) next;
        if (pair != null) {
        }
        loadingState2 = LoadingState.LOADED;
        if (loadingState == loadingState2) {
        }
        zzaad.addGroupedActivityItems(createListBuilder, list2, activityTabPresenter.strings, new ScoreUiFactory$$ExternalSyntheticLambda0(activityTabPresenter, 3), activityTabPresenter.dateTimeFormatterFactory);
        if (!activities2.hasMore) {
        }
        if (loadingState == loadingState2) {
        }
        return CollectionsKt__CollectionsJVMKt.build(createListBuilder);
    }

    public static final Object access$models$applySearchQuery(ActivityTabPresenter activityTabPresenter, MutableState mutableState, MutableState mutableState2, InputFieldText inputFieldText, SuspendLambda suspendLambda) {
        Object obj;
        boolean booleanValue = ((Boolean) mutableState.getValue()).booleanValue();
        ActivityTabViewModel.ScrollToTop scrollToTop = (ActivityTabViewModel.ScrollToTop) mutableState2.getValue();
        ActivitiesManager activitiesManager = activityTabPresenter.searchActivitiesManager;
        ActivityAnalyticsService activityAnalyticsService = activityTabPresenter.activityAnalyticsService;
        Timber.Forest.v("applySearchQuery: %s", inputFieldText);
        if (!booleanValue && KeyguardUtils.isValidSearchQuery(inputFieldText.getValue())) {
            RealActivityAnalyticsService realActivityAnalyticsService = (RealActivityAnalyticsService) activityAnalyticsService;
            realActivityAnalyticsService.searchFlowToken = RealUuidGenerator.generate().toString();
            realActivityAnalyticsService.analyticsService.track(new ActivityHistorySearchStart(realActivityAnalyticsService.getActivityFlowToken(), realActivityAnalyticsService.searchFlowToken), null);
        }
        mutableState.setValue(Boolean.valueOf(KeyguardUtils.isValidSearchQuery(inputFieldText.getValue())));
        n nVar = activityTabPresenter.searchHandler;
        String obj2 = inputFieldText.getValue().toString();
        nVar.getClass();
        obj2.getClass();
        nVar.c = obj2;
        if (KeyguardUtils.isValidSearchQuery(inputFieldText.getValue())) {
            ((RealActivityAnalyticsService) activityAnalyticsService).queryToken = RealUuidGenerator.generate().toString();
            obj = activitiesManager.load(ActivitiesManager.LoadMode.RELOAD_FIRST_PAGE, suspendLambda);
            if (obj != CoroutineSingletons.COROUTINE_SUSPENDED) {
                obj = Unit.INSTANCE;
            }
        } else {
            RealActivityAnalyticsService realActivityAnalyticsService2 = (RealActivityAnalyticsService) activityAnalyticsService;
            realActivityAnalyticsService2.searchFlowToken = null;
            realActivityAnalyticsService2.queryToken = null;
            activitiesManager.clear();
            mutableState2.setValue(new ActivityTabViewModel.ScrollToTop(scrollToTop.id + 1, false));
            obj = Unit.INSTANCE;
        }
        return obj == CoroutineSingletons.COROUTINE_SUSPENDED ? obj : Unit.INSTANCE;
    }

    public static final OnDemandMessageAnalyticsData access$models$onDemandAnalyticsForToken(MutableState mutableState, MutableState mutableState2, String str) {
        OnDemandMessageAnalyticsData onDemandMessageAnalyticsData;
        InlineAppMessageV2ViewModel inlineAppMessageV2ViewModel = (InlineAppMessageV2ViewModel) mutableState.getValue();
        InlineAppMessageV2ViewModel.Ready ready = inlineAppMessageV2ViewModel instanceof InlineAppMessageV2ViewModel.Ready ? (InlineAppMessageV2ViewModel.Ready) inlineAppMessageV2ViewModel : null;
        if (ready != null) {
            if (!Intrinsics.areEqual(ready.messageToken, str)) {
                ready = null;
            }
            if (ready != null && (onDemandMessageAnalyticsData = ready.onDemandAnalytics) != null) {
                return onDemandMessageAnalyticsData;
            }
        }
        CardAppMessageViewModel cardAppMessageViewModel = (CardAppMessageViewModel) mutableState2.getValue();
        CardAppMessageViewModel.Ready ready2 = cardAppMessageViewModel instanceof CardAppMessageViewModel.Ready ? (CardAppMessageViewModel.Ready) cardAppMessageViewModel : null;
        if (ready2 != null) {
            if (!Intrinsics.areEqual(ready2.messageToken, str)) {
                ready2 = null;
            }
            if (ready2 != null) {
                return ready2.onDemandAnalytics;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v90 */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        MutableState mutableState;
        GapComposer gapComposer;
        ?? r0;
        InlineAppMessageViewModel inlineAppMessageViewModel;
        InlineAppMessageV2ViewModel inlineAppMessageV2ViewModel;
        CardAppMessageViewModel cardAppMessageViewModel;
        Object obj;
        LoadingState loadingState;
        MutableState mutableState2;
        IntermediateFeedState intermediateFeedState;
        GapComposer gapComposer2;
        Object[] objArr;
        Continuation continuation;
        MutableState mutableState3;
        MutableState mutableState4;
        MutableState mutableState5;
        Continuation continuation2;
        MutableState mutableState6;
        Flow flow2;
        Object activityTabPresenter$models$10$1;
        Flow flow3;
        MutableState mutableState7;
        Continuation continuation3;
        MutableState mutableState8;
        MutableState mutableState9;
        Continuation continuation4;
        MutableState mutableState10;
        MutableState mutableState11;
        MutableState mutableState12;
        Flow flow4;
        StandaloneCoroutine standaloneCoroutine;
        ActivityTabPresenter activityTabPresenter = this;
        flow.getClass();
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startReplaceGroup(-1429279826);
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer3.changedInstance(activityTabPresenter);
        Object rememberedValue = gapComposer3.rememberedValue();
        int i2 = 2;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Continuation continuation5 = null;
        if (changedInstance || rememberedValue == neverEqualPolicy) {
            rememberedValue = new RealBoostSyncer$refresh$1(activityTabPresenter, continuation5, i2);
            gapComposer3.updateRememberedValue(rememberedValue);
        }
        Updater.LaunchedEffect(gapComposer3, unit, (Function2) rememberedValue);
        boolean changedInstance2 = gapComposer3.changedInstance(activityTabPresenter);
        Object rememberedValue2 = gapComposer3.rememberedValue();
        int i3 = 0;
        if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new ActivityTabPresenter$models$2$1(activityTabPresenter, continuation5, i3);
            gapComposer3.updateRememberedValue(rememberedValue2);
        }
        Updater.LaunchedEffect(gapComposer3, unit, (Function2) rememberedValue2);
        Object rememberedValue3 = gapComposer3.rememberedValue();
        FeatureFlagManager featureFlagManager = activityTabPresenter.featureFlagManager;
        if (rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = Boolean.valueOf(((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$ActivityUsePromoterUpsells.INSTANCE)).enabled());
            gapComposer3.updateRememberedValue(rememberedValue3);
        }
        boolean booleanValue = ((Boolean) rememberedValue3).booleanValue();
        Object rememberedValue4 = gapComposer3.rememberedValue();
        if (rememberedValue4 == neverEqualPolicy) {
            rememberedValue4 = Updater.mutableStateOf$default(CardAppMessageViewModel.NotAvailable.INSTANCE);
            gapComposer3.updateRememberedValue(rememberedValue4);
        }
        MutableState mutableState13 = (MutableState) rememberedValue4;
        Object rememberedValue5 = gapComposer3.rememberedValue();
        if (rememberedValue5 == neverEqualPolicy) {
            rememberedValue5 = Updater.mutableStateOf$default(InlineAppMessageV2ViewModel.NotAvailable.INSTANCE);
            gapComposer3.updateRememberedValue(rememberedValue5);
        }
        MutableState mutableState14 = (MutableState) rememberedValue5;
        if (booleanValue) {
            gapComposer3.startReplaceGroup(632017345);
            boolean changedInstance3 = gapComposer3.changedInstance(activityTabPresenter);
            Object rememberedValue6 = gapComposer3.rememberedValue();
            if (changedInstance3 || rememberedValue6 == neverEqualPolicy) {
                rememberedValue6 = new EditProfilePresenter$models$2$1(activityTabPresenter, mutableState13, mutableState14, (Continuation) null);
                gapComposer3.updateRememberedValue(rememberedValue6);
            }
            Updater.LaunchedEffect(gapComposer3, unit, (Function2) rememberedValue6);
            gapComposer3.end(false);
        } else {
            gapComposer3.startReplaceGroup(632220116);
            gapComposer3.end(false);
        }
        Object rememberedValue7 = gapComposer3.rememberedValue();
        if (rememberedValue7 == neverEqualPolicy) {
            rememberedValue7 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer3.updateRememberedValue(rememberedValue7);
        }
        MutableState mutableState15 = (MutableState) rememberedValue7;
        Object rememberedValue8 = gapComposer3.rememberedValue();
        if (rememberedValue8 == neverEqualPolicy) {
            rememberedValue8 = new DateInputKt$$ExternalSyntheticLambda5(28, mutableState15);
            gapComposer3.updateRememberedValue(rememberedValue8);
        }
        int i4 = 3;
        int i5 = ((i >> 3) & 14) | 48;
        SwipeKt.SwipeHandler(activityTabPresenter, (Function1) rememberedValue8, gapComposer3, i5);
        Object[] objArr2 = {unit};
        boolean changedInstance4 = gapComposer3.changedInstance(activityTabPresenter);
        Object rememberedValue9 = gapComposer3.rememberedValue();
        if (changedInstance4 || rememberedValue9 == neverEqualPolicy) {
            rememberedValue9 = new SearchBarBinding$Content$1$1(activityTabPresenter, mutableState15, continuation5, i4);
            gapComposer3.updateRememberedValue(rememberedValue9);
        }
        int i6 = 14;
        LifecycleKt.LifecycleLaunchedEffect(objArr2, null, null, (Function2) rememberedValue9, gapComposer3, 0);
        GapComposer gapComposer4 = gapComposer3;
        Object rememberedValue10 = gapComposer4.rememberedValue();
        if (rememberedValue10 == neverEqualPolicy) {
            rememberedValue10 = Updater.mutableStateOf$default(ActivityTabViewModel.ScrollToTop.Initial);
            gapComposer4.updateRememberedValue(rememberedValue10);
        }
        MutableState mutableState16 = (MutableState) rememberedValue10;
        Object rememberedValue11 = gapComposer4.rememberedValue();
        if (rememberedValue11 == neverEqualPolicy) {
            rememberedValue11 = new TabContentViewKt$$ExternalSyntheticLambda1(i6, mutableState16);
            gapComposer4.updateRememberedValue(rememberedValue11);
        }
        RenavigationKt.RenavigationHandler(activityTabPresenter, (Function0) rememberedValue11, gapComposer4, i5);
        Object rememberedValue12 = gapComposer4.rememberedValue();
        if (rememberedValue12 == neverEqualPolicy) {
            rememberedValue12 = ((RealAppConfigManager) activityTabPresenter.appConfigManager).invitationConfig();
            gapComposer4.updateRememberedValue(rememberedValue12);
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue12, null, null, gapComposer4, 48, 2);
        Object rememberedValue13 = gapComposer4.rememberedValue();
        int i7 = 6;
        if (rememberedValue13 == neverEqualPolicy) {
            DataStoreImpl$data$1$invokeSuspend$$inlined$map$1 dataStoreImpl$data$1$invokeSuspend$$inlined$map$1 = new DataStoreImpl$data$1$invokeSuspend$$inlined$map$1(new BitcoinDepositsPresenter$special$$inlined$filter$1(flow, 4), i7);
            gapComposer4.updateRememberedValue(dataStoreImpl$data$1$invokeSuspend$$inlined$map$1);
            rememberedValue13 = dataStoreImpl$data$1$invokeSuspend$$inlined$map$1;
        }
        TabToolbarInternalViewModel models = activityTabPresenter.tabToolbarPresenter.models((Flow) rememberedValue13, (Composer) gapComposer4, 0);
        Object rememberedValue14 = gapComposer4.rememberedValue();
        if (rememberedValue14 == neverEqualPolicy) {
            DataStoreImpl$data$1$invokeSuspend$$inlined$map$1 dataStoreImpl$data$1$invokeSuspend$$inlined$map$12 = new DataStoreImpl$data$1$invokeSuspend$$inlined$map$1(new BitcoinDepositsPresenter$special$$inlined$filter$1(flow, 5), 7);
            gapComposer4.updateRememberedValue(dataStoreImpl$data$1$invokeSuspend$$inlined$map$12);
            rememberedValue14 = dataStoreImpl$data$1$invokeSuspend$$inlined$map$12;
        }
        ContactHeaderViewModel contactHeaderViewModel = (ContactHeaderViewModel) activityTabPresenter.contactHeaderPresenter.models((Flow) rememberedValue14, (Composer) gapComposer4, 0);
        Object rememberedValue15 = gapComposer4.rememberedValue();
        ActivitiesManager activitiesManager = activityTabPresenter.activitiesManager;
        if (rememberedValue15 == neverEqualPolicy) {
            rememberedValue15 = activitiesManager.activities();
            gapComposer4.updateRememberedValue(rememberedValue15);
        }
        EmptyList emptyList = EmptyList.INSTANCE;
        LoadingState loadingState2 = LoadingState.LOADING;
        MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue15, new Activities(emptyList, loadingState2, 14), null, gapComposer4, 0, 2);
        Object rememberedValue16 = gapComposer4.rememberedValue();
        if (rememberedValue16 == neverEqualPolicy) {
            rememberedValue16 = Boolean.valueOf(((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$EarningsCustomerTaggingPrompt.INSTANCE)).enabled());
            gapComposer4.updateRememberedValue(rememberedValue16);
        }
        boolean booleanValue2 = ((Boolean) rememberedValue16).booleanValue();
        Object rememberedValue17 = gapComposer4.rememberedValue();
        if (rememberedValue17 == neverEqualPolicy) {
            rememberedValue17 = new LinkedHashSet();
            gapComposer4.updateRememberedValue(rememberedValue17);
        }
        Set set = (Set) rememberedValue17;
        if (booleanValue2) {
            gapComposer4.startReplaceGroup(633704458);
            Object[] objArr3 = {unit};
            boolean changedInstance5 = gapComposer4.changedInstance(activityTabPresenter) | gapComposer4.changedInstance(set);
            Object rememberedValue18 = gapComposer4.rememberedValue();
            if (changedInstance5 || rememberedValue18 == neverEqualPolicy) {
                rememberedValue18 = new NetworkFetcher$doFetch$2(activityTabPresenter, set, null, 21);
                gapComposer4.updateRememberedValue(rememberedValue18);
            }
            mutableState = collectAsState2;
            LifecycleKt.LifecycleLaunchedEffect(objArr3, null, null, (Function2) rememberedValue18, gapComposer4, 0);
            GapComposer gapComposer5 = gapComposer4;
            gapComposer5.end(false);
            gapComposer = gapComposer5;
        } else {
            mutableState = collectAsState2;
            gapComposer4.startReplaceGroup(634021588);
            gapComposer4.end(false);
            gapComposer = gapComposer4;
        }
        Object rememberedValue19 = gapComposer.rememberedValue();
        ActivitiesManager activitiesManager2 = activityTabPresenter.searchActivitiesManager;
        if (rememberedValue19 == neverEqualPolicy) {
            rememberedValue19 = activitiesManager2.activities();
            gapComposer.updateRememberedValue(rememberedValue19);
        }
        MutableState collectAsState3 = Updater.collectAsState((Flow) rememberedValue19, new Activities(emptyList, loadingState2, 14), null, gapComposer, 0, 2);
        Object rememberedValue20 = gapComposer.rememberedValue();
        if (rememberedValue20 == neverEqualPolicy) {
            RealOfflineActivitiesManager realOfflineActivitiesManager = (RealOfflineActivitiesManager) activityTabPresenter.offlineActivitiesManager;
            RealBadger2$scheduleBadgeClearingWork$$inlined$map$1 realBadger2$scheduleBadgeClearingWork$$inlined$map$1 = new RealBadger2$scheduleBadgeClearingWork$$inlined$map$1(FlowKt.distinctUntilChanged(realOfflineActivitiesManager.pending), realOfflineActivitiesManager, 13);
            gapComposer.updateRememberedValue(realBadger2$scheduleBadgeClearingWork$$inlined$map$1);
            rememberedValue20 = realBadger2$scheduleBadgeClearingWork$$inlined$map$1;
        }
        MutableState collectAsState4 = Updater.collectAsState((Flow) rememberedValue20, emptyList, null, gapComposer, 48, 2);
        Object rememberedValue21 = gapComposer.rememberedValue();
        if (rememberedValue21 == neverEqualPolicy) {
            DataStoreImpl$data$1$invokeSuspend$$inlined$map$1 dataStoreImpl$data$1$invokeSuspend$$inlined$map$13 = new DataStoreImpl$data$1$invokeSuspend$$inlined$map$1(new BitcoinDepositsPresenter$special$$inlined$filter$1(flow, 6), 8);
            gapComposer.updateRememberedValue(dataStoreImpl$data$1$invokeSuspend$$inlined$map$13);
            rememberedValue21 = dataStoreImpl$data$1$invokeSuspend$$inlined$map$13;
        }
        Flow flow5 = (Flow) rememberedValue21;
        UiCallbackModel models2 = activityTabPresenter.alertBannerPresenter.models(gapComposer);
        RealLocalInstalledStore$hideBrands$$inlined$map$1 realLocalInstalledStore$hideBrands$$inlined$map$1 = new RealLocalInstalledStore$hideBrands$$inlined$map$1(flow, 29);
        Updater.LaunchedEffect(gapComposer, realLocalInstalledStore$hideBrands$$inlined$map$1, new EditProfilePresenter$models$2$1(realLocalInstalledStore$hideBrands$$inlined$map$1, (Continuation) null, models2, 14));
        if (booleanValue) {
            gapComposer.startReplaceGroup(851771892);
            r0 = 0;
            gapComposer.end(false);
            inlineAppMessageViewModel = InlineAppMessageViewModel.NotAvailable.INSTANCE;
        } else {
            r0 = 0;
            gapComposer.startReplaceGroup(851774572);
            inlineAppMessageViewModel = (InlineAppMessageViewModel) activityTabPresenter.activityInlineAppMessagePresenter.models(flow5, gapComposer, 0);
            gapComposer.end(false);
        }
        InlineAppMessageViewModel inlineAppMessageViewModel2 = inlineAppMessageViewModel;
        if (booleanValue) {
            gapComposer.startReplaceGroup(851777445);
            gapComposer.end(r0);
            inlineAppMessageV2ViewModel = (InlineAppMessageV2ViewModel) mutableState14.getValue();
        } else {
            gapComposer.startReplaceGroup(851779724);
            inlineAppMessageV2ViewModel = (InlineAppMessageV2ViewModel) activityTabPresenter.activityInlineAppMessageV2Presenter.models(flow5, (Composer) gapComposer, (int) r0);
            gapComposer.end(r0);
        }
        InlineAppMessageV2ViewModel inlineAppMessageV2ViewModel2 = inlineAppMessageV2ViewModel;
        if (booleanValue) {
            gapComposer.startReplaceGroup(851782465);
            gapComposer.end(r0);
            cardAppMessageViewModel = (CardAppMessageViewModel) mutableState13.getValue();
        } else {
            gapComposer.startReplaceGroup(851784492);
            cardAppMessageViewModel = (CardAppMessageViewModel) activityTabPresenter.activityCardAppMessagePresenter.models(flow5, (Composer) gapComposer, (int) r0);
            gapComposer.end(r0);
        }
        CardAppMessageViewModel cardAppMessageViewModel2 = cardAppMessageViewModel;
        Object rememberedValue22 = gapComposer.rememberedValue();
        if (rememberedValue22 == neverEqualPolicy) {
            rememberedValue22 = activityTabPresenter.inlineMessageV2TooltipViewed.observe();
            gapComposer.updateRememberedValue(rememberedValue22);
        }
        MutableState collectAsState5 = Updater.collectAsState((Flow) rememberedValue22, Boolean.TRUE, null, gapComposer, 48, 2);
        Object rememberedValue23 = gapComposer.rememberedValue();
        if (rememberedValue23 == neverEqualPolicy) {
            obj = null;
            rememberedValue23 = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue23);
        } else {
            obj = null;
        }
        MutableState mutableState17 = (MutableState) rememberedValue23;
        Object rememberedValue24 = gapComposer.rememberedValue();
        if (rememberedValue24 == neverEqualPolicy) {
            rememberedValue24 = Updater.mutableStateOf$default(obj);
            gapComposer.updateRememberedValue(rememberedValue24);
        }
        MutableState mutableState18 = (MutableState) rememberedValue24;
        Object rememberedValue25 = gapComposer.rememberedValue();
        if (rememberedValue25 == neverEqualPolicy) {
            rememberedValue25 = new LinkedHashSet();
            gapComposer.updateRememberedValue(rememberedValue25);
        }
        Set set2 = (Set) rememberedValue25;
        List list = (List) collectAsState4.getValue();
        boolean changedInstance6 = gapComposer.changedInstance(activityTabPresenter);
        Object rememberedValue26 = gapComposer.rememberedValue();
        if (changedInstance6 || rememberedValue26 == neverEqualPolicy) {
            rememberedValue26 = new xg$$ExternalSyntheticLambda9(activityTabPresenter, 27);
            gapComposer.updateRememberedValue(rememberedValue26);
        }
        Updater.DisposableEffect(list, (Function1) rememberedValue26, gapComposer);
        Object rememberedValue27 = gapComposer.rememberedValue();
        if (rememberedValue27 == neverEqualPolicy) {
            rememberedValue27 = activityTabPresenter.moneybotFlagsHelper.moneybotEnabled();
            gapComposer.updateRememberedValue(rememberedValue27);
        }
        Updater.collectAsState((Flow) rememberedValue27, Boolean.FALSE, null, gapComposer, 48, 2);
        GapComposer gapComposer6 = gapComposer;
        IntermediateFeedState intermediateFeedState2 = new IntermediateFeedState();
        Object[] objArr4 = {(Activities) mutableState.getValue(), contactHeaderViewModel, (List) collectAsState4.getValue(), (InvitationConfig) collectAsState.getValue(), inlineAppMessageViewModel2, inlineAppMessageV2ViewModel2, cardAppMessageViewModel2};
        boolean changed = gapComposer6.changed(mutableState) | gapComposer6.changedInstance(activityTabPresenter) | gapComposer6.changedInstance(contactHeaderViewModel) | gapComposer6.changed(collectAsState4) | gapComposer6.changed(collectAsState) | gapComposer6.changedInstance(inlineAppMessageViewModel2) | gapComposer6.changedInstance(inlineAppMessageV2ViewModel2) | gapComposer6.changedInstance(cardAppMessageViewModel2);
        Object rememberedValue28 = gapComposer6.rememberedValue();
        if (changed || rememberedValue28 == neverEqualPolicy) {
            loadingState = loadingState2;
            mutableState2 = mutableState16;
            intermediateFeedState = intermediateFeedState2;
            MutableState mutableState19 = mutableState;
            gapComposer2 = gapComposer6;
            objArr = objArr4;
            rememberedValue28 = new RealPayDataLoader$loadPayData$2(activityTabPresenter, contactHeaderViewModel, inlineAppMessageViewModel2, inlineAppMessageV2ViewModel2, cardAppMessageViewModel2, mutableState19, collectAsState4, collectAsState, null);
            gapComposer2.updateRememberedValue(rememberedValue28);
        } else {
            gapComposer2 = gapComposer6;
            loadingState = loadingState2;
            mutableState2 = mutableState16;
            objArr = objArr4;
            intermediateFeedState = intermediateFeedState2;
        }
        MutableState produceState = Updater.produceState(intermediateFeedState, objArr, (Function2) rememberedValue28, gapComposer2);
        IntermediateFeedState intermediateFeedState3 = new IntermediateFeedState();
        Activities activities = (Activities) collectAsState3.getValue();
        boolean changed2 = gapComposer2.changed(collectAsState3) | gapComposer2.changedInstance(activityTabPresenter);
        Object rememberedValue29 = gapComposer2.rememberedValue();
        int i8 = 1;
        if (changed2 || rememberedValue29 == neverEqualPolicy) {
            continuation = null;
            rememberedValue29 = new SetNameViewKt$SetName$2$1(activityTabPresenter, collectAsState3, continuation, i8);
            gapComposer2.updateRememberedValue(rememberedValue29);
        } else {
            continuation = null;
        }
        MutableState produceState2 = Updater.produceState(intermediateFeedState3, activities, (Function2) rememberedValue29, gapComposer2, 0);
        Object[] objArr5 = new Object[0];
        Object rememberedValue30 = gapComposer2.rememberedValue();
        if (rememberedValue30 == neverEqualPolicy) {
            rememberedValue30 = new MotionKt$$ExternalSyntheticLambda0(9);
            gapComposer2.updateRememberedValue(rememberedValue30);
        }
        MutableState mutableState20 = (MutableState) SaverKt.rememberSaveable(objArr5, (Function0) rememberedValue30, gapComposer2, 48);
        Object[] objArr6 = new Object[0];
        Object rememberedValue31 = gapComposer2.rememberedValue();
        if (rememberedValue31 == neverEqualPolicy) {
            rememberedValue31 = new MotionKt$$ExternalSyntheticLambda0(10);
            gapComposer2.updateRememberedValue(rememberedValue31);
        }
        MutableState rememberSaveable = SaverKt.rememberSaveable(objArr6, (Saver) activityTabPresenter.inputFieldTextSaver, (Function0) rememberedValue31, (Composer) gapComposer2, MLKEMEngine.KyberPolyBytes);
        boolean changed3 = gapComposer2.changed(rememberSaveable) | gapComposer2.changedInstance(activityTabPresenter) | gapComposer2.changed(mutableState20);
        Object rememberedValue32 = gapComposer2.rememberedValue();
        if (changed3 || rememberedValue32 == neverEqualPolicy) {
            MutableState mutableState21 = mutableState2;
            ActivityTabPresenter$models$10$1 activityTabPresenter$models$10$12 = new ActivityTabPresenter$models$10$1(rememberSaveable, activityTabPresenter, mutableState20, mutableState21, (Continuation) null);
            rememberSaveable = rememberSaveable;
            activityTabPresenter = activityTabPresenter;
            mutableState3 = mutableState20;
            mutableState4 = mutableState21;
            gapComposer2.updateRememberedValue(activityTabPresenter$models$10$12);
            rememberedValue32 = activityTabPresenter$models$10$12;
        } else {
            mutableState4 = mutableState2;
            mutableState3 = mutableState20;
        }
        Updater.LaunchedEffect(gapComposer2, unit, (Function2) rememberedValue32);
        MutableState rememberUpdatedState = Updater.rememberUpdatedState(((Boolean) mutableState3.getValue()).booleanValue() ? activitiesManager2 : activitiesManager, gapComposer2);
        boolean changedInstance7 = gapComposer2.changedInstance(flow) | gapComposer2.changedInstance(activityTabPresenter) | gapComposer2.changed(rememberUpdatedState);
        Object rememberedValue33 = gapComposer2.rememberedValue();
        if (changedInstance7 || rememberedValue33 == neverEqualPolicy) {
            Continuation continuation6 = continuation;
            mutableState5 = rememberSaveable;
            continuation2 = continuation6;
            EditProfilePresenter$models$2$1 editProfilePresenter$models$2$1 = new EditProfilePresenter$models$2$1(15, rememberUpdatedState, flow, this, continuation2);
            mutableState6 = rememberUpdatedState;
            flow2 = flow;
            activityTabPresenter = this;
            gapComposer2.updateRememberedValue(editProfilePresenter$models$2$1);
            rememberedValue33 = editProfilePresenter$models$2$1;
        } else {
            mutableState6 = rememberUpdatedState;
            continuation2 = continuation;
            mutableState5 = rememberSaveable;
            flow2 = flow;
        }
        Updater.LaunchedEffect(flow2, activityTabPresenter.mappedFeedCallbackEvents, (Function2) rememberedValue33, gapComposer2);
        boolean changedInstance8 = gapComposer2.changedInstance(activityTabPresenter) | gapComposer2.changed(mutableState5) | gapComposer2.changed(mutableState3);
        Object rememberedValue34 = gapComposer2.rememberedValue();
        if (changedInstance8 || rememberedValue34 == neverEqualPolicy) {
            MutableState mutableState22 = mutableState3;
            flow3 = flow2;
            mutableState7 = mutableState5;
            continuation3 = continuation2;
            mutableState8 = mutableState22;
            mutableState9 = mutableState4;
            activityTabPresenter$models$10$1 = new ActivityTabPresenter$models$10$1(activityTabPresenter, mutableState7, mutableState8, mutableState9, (Continuation) null);
            gapComposer2.updateRememberedValue(activityTabPresenter$models$10$1);
        } else {
            activityTabPresenter$models$10$1 = rememberedValue34;
            mutableState9 = mutableState4;
            mutableState8 = mutableState3;
            flow3 = flow2;
            mutableState7 = mutableState5;
            continuation3 = continuation2;
        }
        Updater.LaunchedEffect(gapComposer2, unit, (Function2) activityTabPresenter$models$10$1);
        boolean changedInstance9 = gapComposer2.changedInstance(flow3) | gapComposer2.changed(mutableState7) | gapComposer2.changed(mutableState8) | gapComposer2.changedInstance(activityTabPresenter);
        Object rememberedValue35 = gapComposer2.rememberedValue();
        if (changedInstance9 || rememberedValue35 == neverEqualPolicy) {
            MutableState mutableState23 = mutableState9;
            ActivityTabPresenter activityTabPresenter2 = activityTabPresenter;
            Flow flow6 = flow3;
            continuation4 = continuation3;
            RealImageLoader$execute$result$1 realImageLoader$execute$result$1 = new RealImageLoader$execute$result$1(flow6, mutableState7, mutableState8, activityTabPresenter2, mutableState23, null, 26);
            mutableState10 = mutableState7;
            mutableState11 = mutableState8;
            mutableState12 = mutableState23;
            flow4 = flow6;
            activityTabPresenter = activityTabPresenter2;
            gapComposer2.updateRememberedValue(realImageLoader$execute$result$1);
            rememberedValue35 = realImageLoader$execute$result$1;
        } else {
            mutableState10 = mutableState7;
            mutableState11 = mutableState8;
            mutableState12 = mutableState9;
            flow4 = flow3;
            continuation4 = continuation3;
        }
        Updater.LaunchedEffect(gapComposer2, flow4, (Function2) rememberedValue35);
        boolean changedInstance10 = gapComposer2.changedInstance(activityTabPresenter);
        Object rememberedValue36 = gapComposer2.rememberedValue();
        if (changedInstance10 || rememberedValue36 == neverEqualPolicy) {
            rememberedValue36 = new ActivityTabPresenter$models$2$1(activityTabPresenter, continuation4, 2);
            gapComposer2.updateRememberedValue(rememberedValue36);
        }
        Updater.LaunchedEffect(gapComposer2, unit, (Function2) rememberedValue36);
        Flow flow7 = flow4;
        ActivityTabPresenter activityTabPresenter3 = activityTabPresenter;
        Updater.LaunchedEffect(gapComposer2, flow7, new ActivityTabPresenter$models$$inlined$CollectEffect$2(flow7, null, activityTabPresenter3, booleanValue, mutableState6, mutableState17, mutableState18, mutableState14, mutableState13, set2));
        Object rememberedValue37 = gapComposer2.rememberedValue();
        if (rememberedValue37 == neverEqualPolicy) {
            rememberedValue37 = Boolean.valueOf(((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$ScrollPerfLogging.INSTANCE)).enabled());
            gapComposer2.updateRememberedValue(rememberedValue37);
        }
        boolean booleanValue3 = ((Boolean) rememberedValue37).booleanValue();
        MutableState rememberUpdatedState2 = Updater.rememberUpdatedState(((Boolean) mutableState11.getValue()).booleanValue() ? (IntermediateFeedState) produceState2.getValue() : (IntermediateFeedState) produceState.getValue(), gapComposer2);
        AlertBannerViewModel alertBannerViewModel = (AlertBannerViewModel) models2.model;
        boolean z = ((IntermediateFeedState) rememberUpdatedState2.getValue()).loadingState == loadingState && ((standaloneCoroutine = activityTabPresenter3.loadMoreJob) == null || !standaloneCoroutine.isActive());
        boolean z2 = ((IntermediateFeedState) rememberUpdatedState2.getValue()).hasMore;
        boolean z3 = ((IntermediateFeedState) rememberUpdatedState2.getValue()).loadingState == LoadingState.ERROR;
        InputFieldText inputFieldText = (InputFieldText) mutableState10.getValue();
        List list2 = ((IntermediateFeedState) rememberUpdatedState2.getValue()).feedEntries;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add((ActivityFeedEntry) ((Function2) it.next()).invoke(gapComposer2, 0));
        }
        ActivityTabViewModel activityTabViewModel = new ActivityTabViewModel(models, alertBannerViewModel, z, z2, z3, inputFieldText, arrayList, (ActivityTabViewModel.ScrollToTop) mutableState12.getValue(), (InlineAppMessageV2ViewModel.Ready) mutableState17.getValue(), (CardAppMessageViewModel.Ready) mutableState18.getValue(), !((Boolean) collectAsState5.getValue()).booleanValue(), booleanValue3);
        gapComposer2.end(false);
        return activityTabViewModel;
    }

    public final ActivityItemPresenter rememberActivityItemPresenter(ActivityItem activityItem, ActivityItemOrigin activityItemOrigin, int i, GapComposer gapComposer) {
        boolean changed = gapComposer.changed(activityItem);
        Object rememberedValue = gapComposer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = this.activityItemPresenterFactory.create(this.navigator, activityItem, new ActivityItemPresentationContext(activityItemOrigin, i, ActivityScreen.INSTANCE, ActivityScope.MY_ACTIVITY, this.activityToken, 1), InputEventTrigger.Companion.decoratedWith(this.defaultActivityItemEventHandlerFactory, this.activityTabItemEventDecorator), new NetworkFetcher$fetch$2(1, this.feedCallbackEvents, StateFlowKt.class, "emitOrThrow", "emitOrThrow(Lkotlinx/coroutines/flow/MutableSharedFlow;Ljava/lang/Object;)V", 1, 20));
            gapComposer.updateRememberedValue(rememberedValue);
        }
        return (ActivityItemPresenter) rememberedValue;
    }

    public final class IntermediateFeedState {
        public final List feedEntries;
        public final boolean hasMore;
        public final LoadingState loadingState;

        public IntermediateFeedState(LoadingState loadingState, boolean z, List list) {
            loadingState.getClass();
            list.getClass();
            this.loadingState = loadingState;
            this.hasMore = z;
            this.feedEntries = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IntermediateFeedState)) {
                return false;
            }
            IntermediateFeedState intermediateFeedState = (IntermediateFeedState) obj;
            return this.loadingState == intermediateFeedState.loadingState && this.hasMore == intermediateFeedState.hasMore && Intrinsics.areEqual(this.feedEntries, intermediateFeedState.feedEntries);
        }

        public final int hashCode() {
            return this.feedEntries.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.loadingState.hashCode() * 31, 31, this.hasMore);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("IntermediateFeedState(loadingState=");
            sb.append(this.loadingState);
            sb.append(", hasMore=");
            sb.append(this.hasMore);
            sb.append(", feedEntries=");
            return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.feedEntries, ")");
        }

        public IntermediateFeedState() {
            this(LoadingState.LOADING, false, EmptyList.INSTANCE);
        }
    }

    /* loaded from: classes.dex */
    public final class MetroFactory {
        public final Provider activitiesManager;
        public final Provider activitiesManagerFactory;
        public final Provider activitiesSearchCache;
        public final Provider activityAnalyticsService;
        public final Provider activityFeedProducer;
        public final Provider activityItemPresenterFactory;
        public final Factory activityTabItemEventDecorator;
        public final Provider activityToken;
        public final Provider activityUpdatesNotifierRelay;
        public final Provider activityViewed;
        public final Provider alertBannerPresenterFactory;
        public final Provider analytics;
        public final Provider appConfigManager;
        public final Provider appService;
        public final InstanceFactory cardAppMessagePresenterFactory;
        public final Provider contactHeaderPresenterFactory;
        public final Provider dateTimeFormatterFactory;
        public final Provider defaultActivityItemEventHandlerFactory;
        public final Provider featureFlagManager;
        public final Provider flowStarter;
        public final Provider initialArgumentsSupplier;
        public final InstanceFactory inlineAppMessagePresenterFactory;
        public final InstanceFactory inlineAppMessageV2PresenterFactory;
        public final Provider inlineMessageV2TooltipViewed;
        public final Provider inputFieldTextSaver;
        public final Factory loadTimeClockFactory;
        public final Provider moneybotFlagsHelper;
        public final Provider offlineActivitiesManager;
        public final Provider offlineManager;
        public final Provider pendingPopupAppMessages;
        public final Provider permissionManager;
        public final Factory promoterActivityMessageProvider;
        public final Provider routerFactory;
        public final Provider strings;
        public final Provider tabToolbarPresenterFactory;

        public MetroFactory(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, Provider provider14, Provider provider15, Provider provider16, Provider provider17, InstanceFactory instanceFactory, InstanceFactory instanceFactory2, InstanceFactory instanceFactory3, Provider provider18, Provider provider19, Provider provider20, Provider provider21, Provider provider22, Provider provider23, Provider provider24, RealFileDownloader.MetroFactory metroFactory, InstanceFactory instanceFactory4, Provider provider25, RealLiteCashInRepo$MetroFactory realLiteCashInRepo$MetroFactory, Provider provider26, Provider provider27, Provider provider28, Provider provider29) {
            this.tabToolbarPresenterFactory = provider;
            this.activitiesManagerFactory = provider2;
            this.activitiesSearchCache = provider3;
            this.appService = provider4;
            this.contactHeaderPresenterFactory = provider5;
            this.permissionManager = provider6;
            this.initialArgumentsSupplier = provider7;
            this.activityFeedProducer = provider8;
            this.strings = provider9;
            this.activityItemPresenterFactory = provider10;
            this.activityUpdatesNotifierRelay = provider11;
            this.offlineActivitiesManager = provider12;
            this.offlineManager = provider13;
            this.appConfigManager = provider14;
            this.flowStarter = provider15;
            this.analytics = provider16;
            this.inputFieldTextSaver = provider17;
            this.inlineAppMessagePresenterFactory = instanceFactory;
            this.inlineAppMessageV2PresenterFactory = instanceFactory2;
            this.cardAppMessagePresenterFactory = instanceFactory3;
            this.pendingPopupAppMessages = provider18;
            this.activityToken = provider19;
            this.activitiesManager = provider20;
            this.activityViewed = provider21;
            this.inlineMessageV2TooltipViewed = provider22;
            this.activityAnalyticsService = provider23;
            this.featureFlagManager = provider24;
            this.promoterActivityMessageProvider = metroFactory;
            this.loadTimeClockFactory = instanceFactory4;
            this.defaultActivityItemEventHandlerFactory = provider25;
            this.activityTabItemEventDecorator = realLiteCashInRepo$MetroFactory;
            this.alertBannerPresenterFactory = provider26;
            this.routerFactory = provider27;
            this.moneybotFlagsHelper = provider28;
            this.dateTimeFormatterFactory = provider29;
        }

        public MetroFactory(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, InstanceFactory instanceFactory, Provider provider12, Provider provider13, Provider provider14, Provider provider15, Provider provider16, Provider provider17, Provider provider18, Provider provider19, RealCurrentUserSetter.MetroFactory metroFactory, InstanceFactory instanceFactory2, Provider provider20, Provider provider21, Provider provider22, InstanceFactory instanceFactory3, Provider provider23, Provider provider24, Provider provider25, Provider provider26, RealCurrentUserSetter.MetroFactory metroFactory2, RealCurrentUserSetter.MetroFactory metroFactory3, Provider provider27, Provider provider28, RealLoanFlowStarter$MetroFactory realLoanFlowStarter$MetroFactory) {
            this.tabToolbarPresenterFactory = provider;
            this.activitiesManagerFactory = provider2;
            this.activitiesSearchCache = provider3;
            this.appService = provider4;
            this.contactHeaderPresenterFactory = provider5;
            this.permissionManager = provider6;
            this.initialArgumentsSupplier = provider7;
            this.activityFeedProducer = provider8;
            this.strings = provider9;
            this.activityItemPresenterFactory = provider10;
            this.activityUpdatesNotifierRelay = provider11;
            this.inlineAppMessagePresenterFactory = instanceFactory;
            this.offlineActivitiesManager = provider12;
            this.offlineManager = provider13;
            this.appConfigManager = provider14;
            this.flowStarter = provider15;
            this.analytics = provider16;
            this.inputFieldTextSaver = provider17;
            this.pendingPopupAppMessages = provider18;
            this.activityToken = provider19;
            this.dateTimeFormatterFactory = metroFactory;
            this.inlineAppMessageV2PresenterFactory = instanceFactory2;
            this.activitiesManager = provider20;
            this.activityViewed = provider21;
            this.inlineMessageV2TooltipViewed = provider22;
            this.cardAppMessagePresenterFactory = instanceFactory3;
            this.activityAnalyticsService = provider23;
            this.featureFlagManager = provider24;
            this.defaultActivityItemEventHandlerFactory = provider25;
            this.alertBannerPresenterFactory = provider26;
            this.loadTimeClockFactory = metroFactory2;
            this.promoterActivityMessageProvider = metroFactory3;
            this.routerFactory = provider27;
            this.moneybotFlagsHelper = provider28;
            this.activityTabItemEventDecorator = realLoanFlowStarter$MetroFactory;
        }
    }
}
