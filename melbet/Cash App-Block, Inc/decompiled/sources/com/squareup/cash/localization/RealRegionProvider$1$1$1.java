package com.squareup.cash.localization;

import android.app.Activity;
import android.content.SharedPreferences;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.ui.platform.MotionDurationScaleImpl;
import androidx.work.impl.WorkLauncherImpl;
import app.cash.api.ApiResult;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.presenter.molecule.AnswerDispatcher;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.screen.Answer;
import app.cash.cdp.backend.android.AndroidSessionIdProvider;
import app.cash.cdp.integration.CashCdpConfigProvider;
import app.cash.cdp.integration.CdpConfigUpdateSetupTeardown;
import app.cash.local.navigation.api.RealCashLocalNavigator;
import app.cash.local.navigation.api.RealCashLocalNavigator$Factory$Impl;
import app.cash.molecule.PlatformKt;
import app.cash.passcode.backend.AppLockRecentScreenshotsDisabler;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import com.squareup.cash.appforeground.AppForegroundState;
import com.squareup.cash.appmessages.RealAppMessageRepositoryWriter;
import com.squareup.cash.arcade.treehouse.SearchBarBinding$Content$1$1;
import com.squareup.cash.attribution.ActivityTransitionsSideEffectsPerformer;
import com.squareup.cash.attribution.InstallAttributer;
import com.squareup.cash.attribution.InstallAttributer$AdvertisingIdState$Settled;
import com.squareup.cash.attribution.InstallAttributer$setup$1$1$3$emit$1;
import com.squareup.cash.attribution.deeplink.DeepLink;
import com.squareup.cash.attribution.deeplink.DeepLinkOnboardingContextWorker;
import com.squareup.cash.attribution.deeplink.DeepLinkOnboardingContextWorker$setup$1$5$emit$1;
import com.squareup.cash.attribution.wrappers.AppsFlyerClient;
import com.squareup.cash.attribution.wrappers.ProductionAppsFlyerClient;
import com.squareup.cash.blockers.analytics.BlockerFlowAnalyticsHelperKt;
import com.squareup.cash.blockers.analytics.RealBlockerFlowAnalytics;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.boost.backend.RealBoostSyncer$refresh$1;
import com.squareup.cash.cashapplite.CashAppLiteReleaseModule$$ExternalSyntheticLambda0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.blockerflow.BlockerFlowInteractBackgroundFlow;
import com.squareup.cash.cdf.moneybot.MoneybotEntrypointTap;
import com.squareup.cash.clientsync.models.SyncTrigger;
import com.squareup.cash.clientsync.pipeline.RealClientSyncRequestExecutor;
import com.squareup.cash.clientsync.pipeline.RealClientSyncRequestExecutor$queue$1$1$1$emit$1;
import com.squareup.cash.clientsync.pipeline.RealClientSyncResponseProcessor;
import com.squareup.cash.clientsync.pipeline.RealClientSyncResponseProcessor$queue$1$1$1$emit$1;
import com.squareup.cash.clientsync.pipeline.SessionAwareClientSyncRequestExecutor;
import com.squareup.cash.clientsync.pipeline.SyncRequestOperation;
import com.squareup.cash.clientsync.pipeline.SyncResponseOperation;
import com.squareup.cash.clientsync.pipeline.SyncScope;
import com.squareup.cash.clientsync.syncer.RealClientSyncer;
import com.squareup.cash.core.navigationcontainer.models.MainScreensViewEvent;
import com.squareup.cash.core.presenters.MainScreensPresenter;
import com.squareup.cash.data.profile.RealCustomerLimitsManager;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.data.profile.RealProfileManager$profileOrNull$2;
import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.payment.OfflineQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.family.navigation.RealFamilyNavigator$MetroFactory;
import com.squareup.cash.favorites.presenters.FavoriteUpsellRefresher;
import com.squareup.cash.favorites.presenters.FavoriteUpsellRefresher$setup$1$3$emit$1;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.history.navigation.RealActivityInboundNavigator$Factory$Impl;
import com.squareup.cash.initialscreenloader.backend.OpenTheAppUserJourney;
import com.squareup.cash.initialscreenloader.backend.RealOpenTheAppUserJourney;
import com.squareup.cash.initialscreenloader.backend.util.AppProcessInfo$ActivityEvent;
import com.squareup.cash.initialscreenloader.presenters.InitialScreenLoaderPresenter;
import com.squareup.cash.initialscreenloader.viewmodels.InitialScreenPlaceholderViewEvent;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.interaction.InteractionScreenViewLogger;
import com.squareup.cash.investing.backend.real.InvestingSetupTeardown;
import com.squareup.cash.investing.backend.real.InvestingSetupTeardown$setup$1$1$emit$1;
import com.squareup.cash.investing.backend.real.PersistentHistoricalDataCache;
import com.squareup.cash.investing.backend.real.RealInvestingHistoricalData;
import com.squareup.cash.investing.backend.real.RealInvestingSyncer;
import com.squareup.cash.lifecycle.ActivityEvent;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.money.applets.sections.PromotedAppletTileLocaleChangeIoSetupTeardown;
import com.squareup.cash.money.applets.sections.PromotedAppletTileLocaleChangeIoSetupTeardown$setup$1$1$emit$1;
import com.squareup.cash.money.navigation.real.RealMoneyInboundNavigator$Factory$Impl;
import com.squareup.cash.moneybot.presenters.RealMoneybotInboundNavigator$Factory$Impl;
import com.squareup.cash.navigation.CashTabProviderOutboundNavigator$Factory$Impl;
import com.squareup.cash.observability.backend.api.BugsnagClient;
import com.squareup.cash.observability.backend.api.ViewTracking;
import com.squareup.cash.observability.backend.real.bugsnag.ErrorReportingWorker;
import com.squareup.cash.onboarding.backend.OnboardingFlowTokenManager$FlowToken;
import com.squareup.cash.session.backend.SessionState;
import com.squareup.cash.tabprovider.api.TabInfo;
import com.squareup.cash.userjourneys.tracker.RealUserJourneyTracker;
import com.squareup.cash.userjourneys.tracker.UserJourney$Name;
import com.squareup.cash.userjourneys.tracker.UserJourney$Outcome;
import com.squareup.cash.userjourneys.tracker.UserJourney$Tag$OpenTheApp$ActivityStart;
import com.squareup.cash.userjourneys.tracker.UserJourneyTracker;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.util.money.Moneys$$ExternalSyntheticLambda0;
import com.squareup.preferences.KeyValue;
import com.squareup.preferences.StringPreference;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessageClientService;
import com.squareup.protos.cash.messagingplatformcommon.app.GetAppMessagesRequest;
import com.squareup.protos.cash.messagingplatformcommon.app.GetAppMessagesResponse;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.SetOnboardingContextRequest;
import com.squareup.protos.franklin.common.FeatureFlag;
import com.squareup.protos.franklin.common.FeatureFlagSource;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import io.noties.markwon.MarkwonConfiguration;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import retrofit2.OkHttpCall;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class RealRegionProvider$1$1$1 implements FlowCollector {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object this$0;

    public /* synthetic */ RealRegionProvider$1$1$1(Object obj, int i) {
        this.$r8$classId = i;
        this.this$0 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        TabInfo.Id id;
        ViewTracking viewTracking;
        Long l = 0;
        l = 0;
        l = 0;
        switch (this.$r8$classId) {
            case 0:
                RealRegionProvider realRegionProvider = (RealRegionProvider) this.this$0;
                realRegionProvider.profileRegion = null;
                Object delete = realRegionProvider.country.delete(continuation);
                return delete == CoroutineSingletons.COROUTINE_SUSPENDED ? delete : Unit.INSTANCE;
            case 1:
                ((WorkLauncherImpl) this.this$0).startStylusHandwriting();
                return Unit.INSTANCE;
            case 2:
                ((ProduceStateScope) this.this$0).setValue(obj);
                return Unit.INSTANCE;
            case 3:
                ((MotionDurationScaleImpl) this.this$0)._scaleFactor$delegate.setFloatValue(((Number) obj).floatValue());
                return Unit.INSTANCE;
            case 4:
                ((AnswerDispatcher) this.this$0).send((Answer) obj);
                return Unit.INSTANCE;
            case 5:
                AndroidSessionIdProvider androidSessionIdProvider = (AndroidSessionIdProvider) this.this$0;
                Function0 function0 = androidSessionIdProvider.secondsTimestampProvider;
                int ordinal = ((AppForegroundState) obj).ordinal();
                if (ordinal == 0) {
                    Long l2 = androidSessionIdProvider.backgroundedTime;
                    if (l2 != null) {
                        long longValue = l2.longValue();
                        CashCdpConfigProvider cashCdpConfigProvider = androidSessionIdProvider.configProvider;
                        long j = cashCdpConfigProvider.batchSize;
                        long j2 = cashCdpConfigProvider.interactivitySessionTimeoutSeconds;
                        cashCdpConfigProvider.readyForBatchUploading.get();
                        if (longValue + j2 < ((Number) function0.invoke()).longValue()) {
                            androidSessionIdProvider.sessionId.setValue(androidSessionIdProvider.uuidGenerator.invoke());
                        }
                    }
                } else {
                    if (ordinal != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    l = (Long) function0.invoke();
                }
                androidSessionIdProvider.backgroundedTime = l;
                return Unit.INSTANCE;
            case 6:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                AppLockRecentScreenshotsDisabler appLockRecentScreenshotsDisabler = (AppLockRecentScreenshotsDisabler) this.this$0;
                appLockRecentScreenshotsDisabler.setRecentsScreenshotEnabledCompat(appLockRecentScreenshotsDisabler.activity, !booleanValue);
                return Unit.INSTANCE;
            case 7:
                ActivityTransitionsSideEffectsPerformer activityTransitionsSideEffectsPerformer = (ActivityTransitionsSideEffectsPerformer) this.this$0;
                Activity activity = (Activity) activityTransitionsSideEffectsPerformer.activity;
                AppsFlyerClient appsFlyerClient = (AppsFlyerClient) activityTransitionsSideEffectsPerformer.appsFlyerClient;
                int ordinal2 = ((ActivityEvent) obj).ordinal();
                if (ordinal2 == 1) {
                    ((ProductionAppsFlyerClient) appsFlyerClient).activity = new WeakReference(activity);
                } else if (ordinal2 == 2) {
                    ((ProductionAppsFlyerClient) appsFlyerClient).onIncomingIntentForDeepLink(activity.getIntent());
                } else if (ordinal2 == 4) {
                    ((ProductionAppsFlyerClient) appsFlyerClient).activity = null;
                }
                return Unit.INSTANCE;
            case 8:
                return emit((InstallAttributer.State) obj, continuation);
            case 9:
                return emit((Pair) obj, continuation);
            case 10:
                RealBlockerFlowAnalytics realBlockerFlowAnalytics = (RealBlockerFlowAnalytics) this.this$0;
                realBlockerFlowAnalytics.sanityCheckFlowToken(realBlockerFlowAnalytics.lastBlockersData);
                BlockersData blockersData = realBlockerFlowAnalytics.lastBlockersData;
                if (blockersData != null) {
                    Flow$Type flow$Type = blockersData.flowType;
                    Analytics analytics = realBlockerFlowAnalytics.analytics;
                    String nextBlockerId = blockersData.getNextBlockerId();
                    ClientScenario clientScenario = blockersData.clientScenario;
                    analytics.track(new BlockerFlowInteractBackgroundFlow(nextBlockerId, clientScenario != null ? BlockerFlowAnalyticsHelperKt.analyticsName(clientScenario, flow$Type) : null, flow$Type != null ? flow$Type.name() : null, blockersData.flowToken), null);
                }
                return Unit.INSTANCE;
            case 11:
                return emit((RealClientSyncRequestExecutor.SyncRequestQueueElement) obj, continuation);
            case 12:
                return emit((RealClientSyncResponseProcessor.SyncResponseQueueElement) obj, continuation);
            case 13:
                if (((SessionState) obj) instanceof SessionState.Authenticated) {
                    ((SessionAwareClientSyncRequestExecutor) this.this$0).executeDeferredRequests();
                }
                return Unit.INSTANCE;
            case 14:
                MainScreensPresenter mainScreensPresenter = (MainScreensPresenter) this.this$0;
                MainScreensViewEvent mainScreensViewEvent = (MainScreensViewEvent) obj;
                if (mainScreensViewEvent instanceof MainScreensViewEvent.TapActivity) {
                    id = TabInfo.Id.Activity;
                } else if (mainScreensViewEvent instanceof MainScreensViewEvent.TapBanking) {
                    id = TabInfo.Id.Money;
                } else if (mainScreensViewEvent instanceof MainScreensViewEvent.TapLocal) {
                    id = TabInfo.Id.Local;
                } else if (mainScreensViewEvent instanceof MainScreensViewEvent.TapMoneybot) {
                    mainScreensPresenter.moneybotAnalyticsService.analytics.track(new MoneybotEntrypointTap(), null);
                    id = TabInfo.Id.Moneybot;
                } else {
                    if (!(mainScreensViewEvent instanceof MainScreensViewEvent.TapSend)) {
                        if (!(mainScreensViewEvent instanceof MainScreensViewEvent.InAppNotificationEvent) && !(mainScreensViewEvent instanceof MainScreensViewEvent.TooltipAppMessageEvent)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        return Unit.INSTANCE;
                    }
                    id = TabInfo.Id.Payment;
                }
                OkHttpCall.AnonymousClass1 anonymousClass1 = mainScreensPresenter.tabNavigator;
                Navigator navigator = mainScreensPresenter.navigator;
                navigator.getClass();
                RealFamilyNavigator$MetroFactory realFamilyNavigator$MetroFactory = ((CashTabProviderOutboundNavigator$Factory$Impl) anonymousClass1.val$callback).delegateFactory;
                CashAppLiteReleaseModule$$ExternalSyntheticLambda0 cashAppLiteReleaseModule$$ExternalSyntheticLambda0 = (CashAppLiteReleaseModule$$ExternalSyntheticLambda0) realFamilyNavigator$MetroFactory.analytics.invoke();
                RealActivityInboundNavigator$Factory$Impl realActivityInboundNavigator$Factory$Impl = (RealActivityInboundNavigator$Factory$Impl) realFamilyNavigator$MetroFactory.sessionManager.invoke();
                RealMoneyInboundNavigator$Factory$Impl realMoneyInboundNavigator$Factory$Impl = (RealMoneyInboundNavigator$Factory$Impl) realFamilyNavigator$MetroFactory.supportNavigator.invoke();
                RealMoneybotInboundNavigator$Factory$Impl realMoneybotInboundNavigator$Factory$Impl = (RealMoneybotInboundNavigator$Factory$Impl) realFamilyNavigator$MetroFactory.stringManager.invoke();
                cashAppLiteReleaseModule$$ExternalSyntheticLambda0.getClass();
                realActivityInboundNavigator$Factory$Impl.getClass();
                realMoneyInboundNavigator$Factory$Impl.getClass();
                realMoneybotInboundNavigator$Factory$Impl.getClass();
                MarkwonConfiguration markwonConfiguration = new MarkwonConfiguration(cashAppLiteReleaseModule$$ExternalSyntheticLambda0, realActivityInboundNavigator$Factory$Impl, realMoneyInboundNavigator$Factory$Impl, realMoneybotInboundNavigator$Factory$Impl, navigator);
                int ordinal3 = id.ordinal();
                if (ordinal3 != 0) {
                    if (ordinal3 == 1) {
                        markwonConfiguration.goToBanking();
                    } else if (ordinal3 == 2) {
                        markwonConfiguration.goToMoneybot();
                    } else if (ordinal3 == 3) {
                        markwonConfiguration.goToPaymentPad();
                    } else if (ordinal3 != 4) {
                        if (ordinal3 != 5) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        RealUuidGenerator realUuidGenerator = (RealUuidGenerator) ((RealCashLocalNavigator$Factory$Impl) anonymousClass1.this$0).delegateFactory.sandboxer.invoke();
                        realUuidGenerator.getClass();
                        new RealCashLocalNavigator(realUuidGenerator, navigator).goToLocal();
                    }
                    return Unit.INSTANCE;
                }
                markwonConfiguration.goToActivity();
                return Unit.INSTANCE;
            case 15:
                RealCustomerLimitsManager realCustomerLimitsManager = (RealCustomerLimitsManager) this.this$0;
                InstrumentQueries instrumentQueries = realCustomerLimitsManager.limitsQueries;
                instrumentQueries.driver.execute(-1918847836, "DELETE FROM effective_limits", null);
                instrumentQueries.notifyQueries(-1918847836, new OfflineQueries$$ExternalSyntheticLambda1(19));
                realCustomerLimitsManager.lastRefresh = 0L;
                return Unit.INSTANCE;
            case 16:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                RealProfileManager realProfileManager = (RealProfileManager) this.this$0;
                if (booleanValue2) {
                    return Unit.INSTANCE;
                }
                RealClientSyncer realClientSyncer = (RealClientSyncer) realProfileManager.clientSyncer.getValue();
                SyncTrigger syncTrigger = SyncTrigger.BLOCKING_USER_ACTION;
                realClientSyncer.getClass();
                realClientSyncer.sync(syncTrigger, SyncScope.Global.INSTANCE);
                Object refresh = realProfileManager.referralManager.refresh(true, continuation);
                return refresh == CoroutineSingletons.COROUTINE_SUSPENDED ? refresh : Unit.INSTANCE;
            case 17:
                return emit$3(continuation);
            case 18:
                Map map = (Map) obj;
                RealFeatureFlagManager realFeatureFlagManager = (RealFeatureFlagManager) this.this$0;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (((FeatureFlag) entry.getValue()).selected_option_value != null) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                RealFeatureFlagManager realFeatureFlagManager2 = (RealFeatureFlagManager) this.this$0;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(linkedHashMap.size()));
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    Object key = entry2.getKey();
                    String str = ((FeatureFlag) entry2.getValue()).selected_option_value;
                    str.getClass();
                    String access$selected_option_label = RealFeatureFlagManager.access$selected_option_label(realFeatureFlagManager2, (FeatureFlag) entry2.getValue());
                    if (access$selected_option_label == null) {
                        access$selected_option_label = str;
                    }
                    linkedHashMap2.put(key, new FeatureFlagManager.CurrentlySelectedOption(access$selected_option_label, str));
                }
                realFeatureFlagManager.currentSelectedOptions = linkedHashMap2;
                RealFeatureFlagManager realFeatureFlagManager3 = (RealFeatureFlagManager) this.this$0;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Map.Entry entry3 : map.entrySet()) {
                    if (((FeatureFlag) entry3.getValue()).feature_flag_source != null) {
                        linkedHashMap3.put(entry3.getKey(), entry3.getValue());
                    }
                }
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(linkedHashMap3.size()));
                for (Map.Entry entry4 : linkedHashMap3.entrySet()) {
                    Object key2 = entry4.getKey();
                    FeatureFlagSource featureFlagSource = ((FeatureFlag) entry4.getValue()).feature_flag_source;
                    featureFlagSource.getClass();
                    linkedHashMap4.put(key2, featureFlagSource);
                }
                realFeatureFlagManager3.featureFlagSources = linkedHashMap4;
                return Unit.INSTANCE;
            case 19:
                RealOpenTheAppUserJourney realOpenTheAppUserJourney = (RealOpenTheAppUserJourney) this.this$0;
                int ordinal4 = ((AppProcessInfo$ActivityEvent) obj).ordinal();
                if (ordinal4 == 0) {
                    int i = RealOpenTheAppUserJourney.$r8$clinit;
                    Duration.Companion companion = Duration.Companion;
                    AndroidClock androidClock = realOpenTheAppUserJourney.clock;
                    realOpenTheAppUserJourney.m3574startJourneyNqJ4yvY(DurationKt.toDuration(androidClock.millis(), DurationUnit.MILLISECONDS), DimensionKt.elapsedRealtimeDuration(androidClock), UserJourney$Tag$OpenTheApp$ActivityStart.INSTANCE);
                } else if (ordinal4 == 1) {
                    int i2 = RealOpenTheAppUserJourney.$r8$clinit;
                    realOpenTheAppUserJourney.onInitialScreenLoaded(OpenTheAppUserJourney.InitialScreen.RESTORED_STATE);
                } else {
                    if (ordinal4 != 2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ((RealUserJourneyTracker) ((UserJourneyTracker) realOpenTheAppUserJourney.userJourneyTrackerProvider.invoke())).endJourney(UserJourney$Name.OPEN_THE_APP, UserJourney$Outcome.UserCanceled.INSTANCE);
                }
                return Unit.INSTANCE;
            case 20:
                InitialScreenLoaderPresenter initialScreenLoaderPresenter = (InitialScreenLoaderPresenter) this.this$0;
                if (((InitialScreenPlaceholderViewEvent) obj) instanceof InitialScreenPlaceholderViewEvent.IgnoreError) {
                    ((RealUserJourneyTracker) ((UserJourneyTracker) ((RealOpenTheAppUserJourney) initialScreenLoaderPresenter.openTheAppUserJourney).userJourneyTrackerProvider.invoke())).endJourney(UserJourney$Name.OPEN_THE_APP, UserJourney$Outcome.UserCanceled.INSTANCE);
                    initialScreenLoaderPresenter.activityFinisher.finish();
                }
                return Unit.INSTANCE;
            case 21:
                Pair pair = (Pair) obj;
                ((Analytics) ((CdpConfigUpdateSetupTeardown) this.this$0).cdpConfigurationProvider).track((Event) pair.first, (Long) pair.second);
                return Unit.INSTANCE;
            case 22:
                AppForegroundState appForegroundState = (AppForegroundState) obj;
                InteractionScreenViewLogger interactionScreenViewLogger = (InteractionScreenViewLogger) this.this$0;
                InteractionScreenViewLogger.LastScreenView lastScreenView = interactionScreenViewLogger.lastScreenInteraction;
                if (lastScreenView != null && (viewTracking = lastScreenView.lastScreenInteraction) != null) {
                    ViewTracking.viewEnded$default(viewTracking);
                }
                InteractionScreenViewLogger.LastScreenView lastScreenView2 = interactionScreenViewLogger.lastScreenInteraction;
                interactionScreenViewLogger.lastScreenInteraction = lastScreenView2 != null ? new InteractionScreenViewLogger.LastScreenView(lastScreenView2.viewKey, lastScreenView2.name, null) : null;
                int ordinal5 = appForegroundState.ordinal();
                if (ordinal5 == 0) {
                    InteractionScreenViewLogger.LastScreenView lastScreenView3 = interactionScreenViewLogger.lastScreenInteraction;
                    if (lastScreenView3 != null) {
                        interactionScreenViewLogger.startTracking(lastScreenView3.viewKey, lastScreenView3.name, null);
                    }
                } else if (ordinal5 != 1) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                return Unit.INSTANCE;
            case 23:
                return emit((List) obj, continuation);
            case 24:
                PersistentHistoricalDataCache persistentHistoricalDataCache = ((RealInvestingHistoricalData) this.this$0).cache;
                Object withContext = JobKt.withContext(persistentHistoricalDataCache.ioDispatcher, new RealProfileManager$profileOrNull$2(persistentHistoricalDataCache, l, 27), continuation);
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (withContext != coroutineSingletons) {
                    withContext = Unit.INSTANCE;
                }
                return withContext == coroutineSingletons ? withContext : Unit.INSTANCE;
            case 25:
                ((RealInvestingSyncer) this.this$0).newsCacheExpiryTimes.clear();
                return Unit.INSTANCE;
            case 26:
                return emit((Locale) obj, continuation);
            case 27:
                Object obj2 = ((RealLanguageManager) ((CdpConfigUpdateSetupTeardown) this.this$0).cdpConfigurationProvider).isSpanishEnabled.set(Boolean.valueOf(((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) obj).enabled()), continuation);
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (obj2 != coroutineSingletons2) {
                    obj2 = Unit.INSTANCE;
                }
                return obj2 == coroutineSingletons2 ? obj2 : Unit.INSTANCE;
            case 28:
                return emit((Locale) obj, continuation);
            default:
                String str2 = (String) obj;
                ErrorReportingWorker errorReportingWorker = (ErrorReportingWorker) this.this$0;
                BugsnagClient bugsnagClient = errorReportingWorker.bugsnagClient;
                if (str2 == null) {
                    StringPreference stringPreference = errorReportingWorker.temporaryErrorReporterUserIdentifier;
                    String str3 = stringPreference.key;
                    SharedPreferences sharedPreferences = stringPreference.preferences;
                    String string2 = sharedPreferences.getString(str3, null);
                    if (string2 == null) {
                        string2 = "tmp-" + UUID.randomUUID();
                        sharedPreferences.edit().putString(str3, string2).commit();
                    }
                    str2 = string2;
                }
                bugsnagClient.setUserIdentifier(str2);
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
    
        if (r6 == r7) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0076, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0049, code lost:
    
        if (r6 == r7) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object emit$3(Continuation continuation) {
        FavoriteUpsellRefresher$setup$1$3$emit$1 favoriteUpsellRefresher$setup$1$3$emit$1;
        int i;
        GetAppMessagesResponse getAppMessagesResponse;
        FavoriteUpsellRefresher favoriteUpsellRefresher = (FavoriteUpsellRefresher) this.this$0;
        if (continuation instanceof FavoriteUpsellRefresher$setup$1$3$emit$1) {
            favoriteUpsellRefresher$setup$1$3$emit$1 = (FavoriteUpsellRefresher$setup$1$3$emit$1) continuation;
            int i2 = favoriteUpsellRefresher$setup$1$3$emit$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                favoriteUpsellRefresher$setup$1$3$emit$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = favoriteUpsellRefresher$setup$1$3$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = favoriteUpsellRefresher$setup$1$3$emit$1.label;
                Continuation continuation2 = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    AppMessageClientService appMessageClientService = favoriteUpsellRefresher.appService;
                    GetAppMessagesRequest getAppMessagesRequest = new GetAppMessagesRequest();
                    favoriteUpsellRefresher$setup$1$3$emit$1.label = 1;
                    obj = appMessageClientService.getAppMessages(getAppMessagesRequest, favoriteUpsellRefresher$setup$1$3$emit$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                ApiResult apiResult = (ApiResult) obj;
                getAppMessagesResponse = (GetAppMessagesResponse) (!(apiResult instanceof ApiResult.Success) ? ((ApiResult.Success) apiResult).response : null);
                if (getAppMessagesResponse != null) {
                    RealAppMessageRepositoryWriter realAppMessageRepositoryWriter = favoriteUpsellRefresher.appMessageRepositoryWriter;
                    List list = getAppMessagesResponse.messages;
                    favoriteUpsellRefresher$setup$1$3$emit$1.label = 2;
                    Object withContext = JobKt.withContext(realAppMessageRepositoryWriter.ioDispatcher, new SearchBarBinding$Content$1$1(realAppMessageRepositoryWriter, list, continuation2, 21), favoriteUpsellRefresher$setup$1$3$emit$1);
                    if (withContext != coroutineSingletons) {
                        withContext = Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        favoriteUpsellRefresher$setup$1$3$emit$1 = new FavoriteUpsellRefresher$setup$1$3$emit$1(this, continuation);
        Object obj2 = favoriteUpsellRefresher$setup$1$3$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = favoriteUpsellRefresher$setup$1$3$emit$1.label;
        Continuation continuation22 = null;
        if (i != 0) {
        }
        ApiResult apiResult2 = (ApiResult) obj2;
        getAppMessagesResponse = (GetAppMessagesResponse) (!(apiResult2 instanceof ApiResult.Success) ? ((ApiResult.Success) apiResult2).response : null);
        if (getAppMessagesResponse != null) {
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ RealRegionProvider$1$1$1(CoroutineScope coroutineScope, MoleculePresenter moleculePresenter, int i) {
        this.$r8$classId = i;
        this.this$0 = moleculePresenter;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object emit(InstallAttributer.State state, Continuation continuation) {
        InstallAttributer$setup$1$1$3$emit$1 installAttributer$setup$1$1$3$emit$1;
        int i;
        InstallAttributer installAttributer = (InstallAttributer) this.this$0;
        if (continuation instanceof InstallAttributer$setup$1$1$3$emit$1) {
            installAttributer$setup$1$1$3$emit$1 = (InstallAttributer$setup$1$1$3$emit$1) continuation;
            int i2 = installAttributer$setup$1$1$3$emit$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                installAttributer$setup$1$1$3$emit$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = installAttributer$setup$1$1$3$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = installAttributer$setup$1$1$3$emit$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (state.clientState == InstallAttributer.AppsFlyerClientState.Stopped) {
                        AppsFlyerClient appsFlyerClient = installAttributer.appsFlyerClient;
                        Moneys$$ExternalSyntheticLambda0 moneys$$ExternalSyntheticLambda0 = new Moneys$$ExternalSyntheticLambda0(3);
                        ProductionAppsFlyerClient productionAppsFlyerClient = (ProductionAppsFlyerClient) appsFlyerClient;
                        if (productionAppsFlyerClient.hasStarted) {
                            productionAppsFlyerClient.getAppsFlyerLib().stop(false, productionAppsFlyerClient.getActiveContext());
                        }
                        productionAppsFlyerClient.hasStarted = true;
                        productionAppsFlyerClient.getAppsFlyerLib().start(productionAppsFlyerClient.getActiveContext(), "xkvAHP4a6YwdTapN6DcZcn", new WireAdapter(moneys$$ExternalSyntheticLambda0, productionAppsFlyerClient));
                        String appsFlyerUID = productionAppsFlyerClient.getAppsFlyerLib().getAppsFlyerUID(productionAppsFlyerClient.f1049app);
                        productionAppsFlyerClient.appsFlyerId = appsFlyerUID;
                        appsFlyerUID.getClass();
                        InstallAttributer.AppsFlyerClientState appsFlyerClientState = InstallAttributer.AppsFlyerClientState.Started;
                        state = InstallAttributer.State.copy$default(state, null, null, appsFlyerUID, 6);
                    }
                    installAttributer$setup$1$1$3$emit$1.L$2 = installAttributer;
                    installAttributer$setup$1$1$3$emit$1.label = 1;
                    String str = state.appToken;
                    InstallAttributer$AdvertisingIdState$Settled installAttributer$AdvertisingIdState$Settled = state.advertisingIdState;
                    String str2 = state.appsFlyerId;
                    if (str != null) {
                        boolean z = str2 != null;
                        if (z && installAttributer$AdvertisingIdState$Settled.equals(new InstallAttributer$AdvertisingIdState$Settled(false))) {
                            str2.getClass();
                            obj = installAttributer.handleSetAdvertisingId(state, str, str2, installAttributer$setup$1$1$3$emit$1);
                        } else if (!z && installAttributer$AdvertisingIdState$Settled.equals(new InstallAttributer$AdvertisingIdState$Settled(true))) {
                            obj = installAttributer.handleClearAdvertisingId(state, str, installAttributer$setup$1$1$3$emit$1);
                        }
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    obj = state;
                    if (obj == coroutineSingletons) {
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    installAttributer = installAttributer$setup$1$1$3$emit$1.L$2;
                    SafeTrace.throwOnFailure(obj);
                }
                installAttributer.state = (InstallAttributer.State) obj;
                return Unit.INSTANCE;
            }
        }
        installAttributer$setup$1$1$3$emit$1 = new InstallAttributer$setup$1$1$3$emit$1(this, continuation);
        Object obj2 = installAttributer$setup$1$1$3$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = installAttributer$setup$1$1$3$emit$1.label;
        if (i != 0) {
        }
        installAttributer.state = (InstallAttributer.State) obj2;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object emit(RealClientSyncRequestExecutor.SyncRequestQueueElement syncRequestQueueElement, Continuation continuation) {
        RealClientSyncRequestExecutor$queue$1$1$1$emit$1 realClientSyncRequestExecutor$queue$1$1$1$emit$1;
        int i;
        CompletableDeferred completableDeferred;
        if (continuation instanceof RealClientSyncRequestExecutor$queue$1$1$1$emit$1) {
            realClientSyncRequestExecutor$queue$1$1$1$emit$1 = (RealClientSyncRequestExecutor$queue$1$1$1$emit$1) continuation;
            int i2 = realClientSyncRequestExecutor$queue$1$1$1$emit$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realClientSyncRequestExecutor$queue$1$1$1$emit$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realClientSyncRequestExecutor$queue$1$1$1$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realClientSyncRequestExecutor$queue$1$1$1$emit$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    SyncRequestOperation component1 = syncRequestQueueElement.component1();
                    CompletableDeferred component2 = syncRequestQueueElement.component2();
                    RealClientSyncRequestExecutor realClientSyncRequestExecutor = (RealClientSyncRequestExecutor) this.this$0;
                    realClientSyncRequestExecutor$queue$1$1$1$emit$1.L$2 = component2;
                    realClientSyncRequestExecutor$queue$1$1$1$emit$1.label = 1;
                    obj = RealClientSyncRequestExecutor.access$executeSyncRequestSynchronously(realClientSyncRequestExecutor, component1, realClientSyncRequestExecutor$queue$1$1$1$emit$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    completableDeferred = component2;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    completableDeferred = realClientSyncRequestExecutor$queue$1$1$1$emit$1.L$2;
                    SafeTrace.throwOnFailure(obj);
                }
                completableDeferred.complete(obj);
                return Unit.INSTANCE;
            }
        }
        realClientSyncRequestExecutor$queue$1$1$1$emit$1 = new RealClientSyncRequestExecutor$queue$1$1$1$emit$1(this, continuation);
        Object obj2 = realClientSyncRequestExecutor$queue$1$1$1$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realClientSyncRequestExecutor$queue$1$1$1$emit$1.label;
        if (i != 0) {
        }
        completableDeferred.complete(obj2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object emit(RealClientSyncResponseProcessor.SyncResponseQueueElement syncResponseQueueElement, Continuation continuation) {
        RealClientSyncResponseProcessor$queue$1$1$1$emit$1 realClientSyncResponseProcessor$queue$1$1$1$emit$1;
        int i;
        CompletableDeferred completableDeferred;
        if (continuation instanceof RealClientSyncResponseProcessor$queue$1$1$1$emit$1) {
            realClientSyncResponseProcessor$queue$1$1$1$emit$1 = (RealClientSyncResponseProcessor$queue$1$1$1$emit$1) continuation;
            int i2 = realClientSyncResponseProcessor$queue$1$1$1$emit$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realClientSyncResponseProcessor$queue$1$1$1$emit$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realClientSyncResponseProcessor$queue$1$1$1$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realClientSyncResponseProcessor$queue$1$1$1$emit$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    SyncResponseOperation component1 = syncResponseQueueElement.component1();
                    CompletableDeferred component2 = syncResponseQueueElement.component2();
                    RealClientSyncResponseProcessor realClientSyncResponseProcessor = (RealClientSyncResponseProcessor) this.this$0;
                    realClientSyncResponseProcessor$queue$1$1$1$emit$1.L$2 = component2;
                    realClientSyncResponseProcessor$queue$1$1$1$emit$1.label = 1;
                    obj = RealClientSyncResponseProcessor.access$processSyncResponseSynchronously(realClientSyncResponseProcessor, component1, realClientSyncResponseProcessor$queue$1$1$1$emit$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    completableDeferred = component2;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    completableDeferred = realClientSyncResponseProcessor$queue$1$1$1$emit$1.L$2;
                    SafeTrace.throwOnFailure(obj);
                }
                completableDeferred.complete(obj);
                return Unit.INSTANCE;
            }
        }
        realClientSyncResponseProcessor$queue$1$1$1$emit$1 = new RealClientSyncResponseProcessor$queue$1$1$1$emit$1(this, continuation);
        Object obj2 = realClientSyncResponseProcessor$queue$1$1$1$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realClientSyncResponseProcessor$queue$1$1$1$emit$1.label;
        if (i != 0) {
        }
        completableDeferred.complete(obj2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:10)(2:14|15))(2:16|(2:18|19)(3:20|(1:22)(1:25)|(1:24)))|11|12))|28|6|7|(0)(0)|11|12) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x002d, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
    
        timber.log.Timber.Forest.w("Failed to sync portfolio news from holding change", new java.lang.Object[0], r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object emit(List list, Continuation continuation) {
        InvestingSetupTeardown$setup$1$1$emit$1 investingSetupTeardown$setup$1$1$emit$1;
        int i;
        InvestingSetupTeardown investingSetupTeardown = (InvestingSetupTeardown) this.this$0;
        if (continuation instanceof InvestingSetupTeardown$setup$1$1$emit$1) {
            investingSetupTeardown$setup$1$1$emit$1 = (InvestingSetupTeardown$setup$1$1$emit$1) continuation;
            int i2 = investingSetupTeardown$setup$1$1$emit$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                investingSetupTeardown$setup$1$1$emit$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = investingSetupTeardown$setup$1$1$emit$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = investingSetupTeardown$setup$1$1$emit$1.label;
                Continuation continuation2 = null;
                boolean z = true;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!(PlatformKt.getCurrentSessionState(investingSetupTeardown.sessionManager) instanceof SessionState.Authenticated)) {
                        Timber.Forest.d("Skipping portfolio news sync from holding change - user not authenticated", new Object[0]);
                        return Unit.INSTANCE;
                    }
                    RealInvestingSyncer realInvestingSyncer = investingSetupTeardown.syncer;
                    investingSetupTeardown$setup$1$1$emit$1.label = 1;
                    Object withContext = JobKt.withContext(realInvestingSyncer.ioDispatcher, new RealBoostSyncer$refresh$1(z, realInvestingSyncer, continuation2, 6), investingSetupTeardown$setup$1$1$emit$1);
                    if (withContext != obj2) {
                        withContext = Unit.INSTANCE;
                    }
                    if (withContext == obj2) {
                        return obj2;
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
        }
        investingSetupTeardown$setup$1$1$emit$1 = new InvestingSetupTeardown$setup$1$1$emit$1(this, continuation);
        Object obj3 = investingSetupTeardown$setup$1$1$emit$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = investingSetupTeardown$setup$1$1$emit$1.label;
        Continuation continuation22 = null;
        boolean z2 = true;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
    
        if (r0.set(r11, r7) == r12) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004d, code lost:
    
        if (r10 == r12) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d7, code lost:
    
        if (com.squareup.cash.localization.ClientSyncLocaleChangeIoSetupTeardown.access$handleLocaleChange(r2, r0) == r12) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c4, code lost:
    
        if (r10 == r12) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object emit(Locale locale, Continuation continuation) {
        ClientSyncLocaleChangeIoSetupTeardown$setup$1$1$emit$1 clientSyncLocaleChangeIoSetupTeardown$setup$1$1$emit$1;
        Object obj;
        int i;
        PromotedAppletTileLocaleChangeIoSetupTeardown$setup$1$1$emit$1 promotedAppletTileLocaleChangeIoSetupTeardown$setup$1$1$emit$1;
        Object obj2;
        int i2;
        int i3 = this.$r8$classId;
        Object obj3 = this.this$0;
        switch (i3) {
            case 26:
                ClientSyncLocaleChangeIoSetupTeardown clientSyncLocaleChangeIoSetupTeardown = (ClientSyncLocaleChangeIoSetupTeardown) obj3;
                if (continuation instanceof ClientSyncLocaleChangeIoSetupTeardown$setup$1$1$emit$1) {
                    clientSyncLocaleChangeIoSetupTeardown$setup$1$1$emit$1 = (ClientSyncLocaleChangeIoSetupTeardown$setup$1$1$emit$1) continuation;
                    int i4 = clientSyncLocaleChangeIoSetupTeardown$setup$1$1$emit$1.label;
                    if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                        clientSyncLocaleChangeIoSetupTeardown$setup$1$1$emit$1.label = i4 - PKIFailureInfo.systemUnavail;
                        obj = clientSyncLocaleChangeIoSetupTeardown$setup$1$1$emit$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = clientSyncLocaleChangeIoSetupTeardown$setup$1$1$emit$1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj);
                            KeyValue keyValue = clientSyncLocaleChangeIoSetupTeardown.clientSyncLocale;
                            clientSyncLocaleChangeIoSetupTeardown$setup$1$1$emit$1.L$0 = locale;
                            clientSyncLocaleChangeIoSetupTeardown$setup$1$1$emit$1.label = 1;
                            obj = keyValue.get(clientSyncLocaleChangeIoSetupTeardown$setup$1$1$emit$1);
                            break;
                        } else if (i == 1) {
                            locale = clientSyncLocaleChangeIoSetupTeardown$setup$1$1$emit$1.L$0;
                            SafeTrace.throwOnFailure(obj);
                        } else if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj);
                            break;
                        }
                        if (!Intrinsics.areEqual(locale, (Locale) obj)) {
                            clientSyncLocaleChangeIoSetupTeardown$setup$1$1$emit$1.L$0 = null;
                            clientSyncLocaleChangeIoSetupTeardown$setup$1$1$emit$1.label = 2;
                            break;
                        }
                    }
                }
                clientSyncLocaleChangeIoSetupTeardown$setup$1$1$emit$1 = new ClientSyncLocaleChangeIoSetupTeardown$setup$1$1$emit$1(this, continuation);
                obj = clientSyncLocaleChangeIoSetupTeardown$setup$1$1$emit$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = clientSyncLocaleChangeIoSetupTeardown$setup$1$1$emit$1.label;
                if (i != 0) {
                }
                if (!Intrinsics.areEqual(locale, (Locale) obj)) {
                }
            default:
                PromotedAppletTileLocaleChangeIoSetupTeardown promotedAppletTileLocaleChangeIoSetupTeardown = (PromotedAppletTileLocaleChangeIoSetupTeardown) obj3;
                KeyValue keyValue2 = promotedAppletTileLocaleChangeIoSetupTeardown.promotedAppletTileCacheLocale;
                if (continuation instanceof PromotedAppletTileLocaleChangeIoSetupTeardown$setup$1$1$emit$1) {
                    promotedAppletTileLocaleChangeIoSetupTeardown$setup$1$1$emit$1 = (PromotedAppletTileLocaleChangeIoSetupTeardown$setup$1$1$emit$1) continuation;
                    int i5 = promotedAppletTileLocaleChangeIoSetupTeardown$setup$1$1$emit$1.label;
                    if ((i5 & PKIFailureInfo.systemUnavail) != 0) {
                        promotedAppletTileLocaleChangeIoSetupTeardown$setup$1$1$emit$1.label = i5 - PKIFailureInfo.systemUnavail;
                        obj2 = promotedAppletTileLocaleChangeIoSetupTeardown$setup$1$1$emit$1.result;
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = promotedAppletTileLocaleChangeIoSetupTeardown$setup$1$1$emit$1.label;
                        if (i2 != 0) {
                            SafeTrace.throwOnFailure(obj2);
                            promotedAppletTileLocaleChangeIoSetupTeardown$setup$1$1$emit$1.L$0 = locale;
                            promotedAppletTileLocaleChangeIoSetupTeardown$setup$1$1$emit$1.label = 1;
                            obj2 = keyValue2.get(promotedAppletTileLocaleChangeIoSetupTeardown$setup$1$1$emit$1);
                            break;
                        } else if (i2 == 1) {
                            locale = promotedAppletTileLocaleChangeIoSetupTeardown$setup$1$1$emit$1.L$0;
                            SafeTrace.throwOnFailure(obj2);
                        } else if (i2 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj2);
                            break;
                        }
                        if (!Intrinsics.areEqual(locale, (Locale) obj2)) {
                            GpsConfigQueries gpsConfigQueries = promotedAppletTileLocaleChangeIoSetupTeardown.promotedAppletTileStore.database.promotedAppletTileQueries;
                            gpsConfigQueries.driver.execute(1633878677, "DELETE FROM promotedAppletTiles", null);
                            gpsConfigQueries.notifyQueries(1633878677, new CashMapViewKt$$ExternalSyntheticLambda0(25));
                            promotedAppletTileLocaleChangeIoSetupTeardown$setup$1$1$emit$1.L$0 = null;
                            promotedAppletTileLocaleChangeIoSetupTeardown$setup$1$1$emit$1.label = 2;
                            break;
                        }
                    }
                }
                promotedAppletTileLocaleChangeIoSetupTeardown$setup$1$1$emit$1 = new PromotedAppletTileLocaleChangeIoSetupTeardown$setup$1$1$emit$1(this, continuation);
                obj2 = promotedAppletTileLocaleChangeIoSetupTeardown$setup$1$1$emit$1.result;
                CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = promotedAppletTileLocaleChangeIoSetupTeardown$setup$1$1$emit$1.label;
                if (i2 != 0) {
                }
                if (!Intrinsics.areEqual(locale, (Locale) obj2)) {
                }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object emit(Pair pair, Continuation continuation) {
        DeepLinkOnboardingContextWorker$setup$1$5$emit$1 deepLinkOnboardingContextWorker$setup$1$5$emit$1;
        Object obj;
        int i;
        if (continuation instanceof DeepLinkOnboardingContextWorker$setup$1$5$emit$1) {
            deepLinkOnboardingContextWorker$setup$1$5$emit$1 = (DeepLinkOnboardingContextWorker$setup$1$5$emit$1) continuation;
            int i2 = deepLinkOnboardingContextWorker$setup$1$5$emit$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                deepLinkOnboardingContextWorker$setup$1$5$emit$1.label = i2 - PKIFailureInfo.systemUnavail;
                obj = deepLinkOnboardingContextWorker$setup$1$5$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deepLinkOnboardingContextWorker$setup$1$5$emit$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    DeepLink deepLink = (DeepLink) pair.first;
                    OnboardingFlowTokenManager$FlowToken onboardingFlowTokenManager$FlowToken = (OnboardingFlowTokenManager$FlowToken) pair.second;
                    AppService appService = ((DeepLinkOnboardingContextWorker) this.this$0).appService;
                    ClientScenario clientScenario = ClientScenario.ONBOARDING;
                    onboardingFlowTokenManager$FlowToken.getClass();
                    String str = onboardingFlowTokenManager$FlowToken.value;
                    deepLink.getClass();
                    SetOnboardingContextRequest setOnboardingContextRequest = new SetOnboardingContextRequest(deepLink.payload, null, ByteString.EMPTY);
                    deepLinkOnboardingContextWorker$setup$1$5$emit$1.label = 1;
                    obj = appService.setOnboardingContext(clientScenario, str, setOnboardingContextRequest, deepLinkOnboardingContextWorker$setup$1$5$emit$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                if (((ApiResult) obj) instanceof ApiResult.Failure) {
                    Timber.Forest.e("Failed to set onboarding context", new Object[0]);
                }
                return Unit.INSTANCE;
            }
        }
        deepLinkOnboardingContextWorker$setup$1$5$emit$1 = new DeepLinkOnboardingContextWorker$setup$1$5$emit$1(this, continuation);
        obj = deepLinkOnboardingContextWorker$setup$1$5$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deepLinkOnboardingContextWorker$setup$1$5$emit$1.label;
        if (i != 0) {
        }
        if (((ApiResult) obj) instanceof ApiResult.Failure) {
        }
        return Unit.INSTANCE;
    }
}
