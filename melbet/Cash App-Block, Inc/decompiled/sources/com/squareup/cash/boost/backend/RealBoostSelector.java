package com.squareup.cash.boost.backend;

import androidx.compose.foundation.FocusableNode$focusTargetNode$1;
import androidx.compose.foundation.relocation.BringIntoViewRequesterImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Recomposer$join$2;
import androidx.compose.ui.platform.DerivedSize;
import androidx.compose.ui.platform.JvmActuals_jvmKt;
import androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda2;
import androidx.core.text.TextUtilsCompat;
import androidx.datastore.core.DataStoreImpl$data$1;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.api.ApiResult;
import app.cash.badging.backend.Badger$collect$$inlined$map$1;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.cdp.integration.CashCdpConfigProvider$1$2;
import app.cash.cdp.integration.CdpConfigUpdateSetupTeardown;
import app.cash.sqldelight.SimpleQuery;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import app.cash.sqldelight.db.SqlDriver;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bugsnag.android.Bugsnag;
import com.bugsnag.android.CallbackState;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.CashApp$onCreate$1;
import com.squareup.cash.CashApp$onCreate$4$1$1;
import com.squareup.cash.VariantAppComponent;
import com.squareup.cash.account.types.SignedInStateManager;
import com.squareup.cash.appforeground.AppForegroundStateProvider;
import com.squareup.cash.appforeground.RealAppForegroundStateProvider;
import com.squareup.cash.appmessages.AppMessageSyncer;
import com.squareup.cash.appmessages.RealAppMessageManager;
import com.squareup.cash.arcade.internalflags.InternalArcadeFlags;
import com.squareup.cash.arcade.internalflags.InternalArcadeFlagsHolder;
import com.squareup.cash.blockers.analytics.RealBlockerFlowAnalytics;
import com.squareup.cash.blockers.analytics.RealBlockerFlowAnalytics$setup$1$1;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.boost.backend.BoostAction;
import com.squareup.cash.boost.backend.BoostEvent;
import com.squareup.cash.boost.backend.analytics.BoostAppLocation$CardTab;
import com.squareup.cash.boost.backend.analytics.BoostAppLocation$MerchantProfile;
import com.squareup.cash.boost.backend.analytics.BoostAppLocation$OffersCollection;
import com.squareup.cash.boost.backend.analytics.BoostAppLocation$OffersDetail;
import com.squareup.cash.boost.backend.analytics.BoostAppLocation$ProfileDirectory;
import com.squareup.cash.boost.db.Slots;
import com.squareup.cash.borrow.views.BorrowHomeKt$$ExternalSyntheticLambda1;
import com.squareup.cash.braze.RealBrazeManager;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.boost.AppPresentation;
import com.squareup.cash.cdf.offers.AppLocation;
import com.squareup.cash.cdf.offers.OfferRequestStatus;
import com.squareup.cash.cdf.offers.OfferUpdateType;
import com.squareup.cash.cdf.offers.OffersUpdateComplete;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientsync.pipeline.RealClientSyncRequestExecutor;
import com.squareup.cash.clientsync.pipeline.RealClientSyncResponseProcessor;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.common.messaging.api.ErrorMessaging;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealFlowStarter;
import com.squareup.cash.data.js.ZiplineHistoryDataJavaScripter;
import com.squareup.cash.data.js.ZiplineHistoryDataJavaScripter$observable$1$invokeSuspend$$inlined$map$1$2;
import com.squareup.cash.data.profile.RealCustomerLimitsManager;
import com.squareup.cash.data.profile.RealProfileSyncSetupTeardown;
import com.squareup.cash.data.profile.RealProfileSyncSetupTeardown$setup$1$1;
import com.squareup.cash.data.profile.RealProfileSyncSetupTeardown$setup$1$2;
import com.squareup.cash.db.StorageLinkQueries$$ExternalSyntheticLambda8;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.Instrument$Adapter;
import com.squareup.cash.deviceintegrity.RealDeviceIntegrity;
import com.squareup.cash.deviceintegrity.RealDeviceIntegrity$ensureStandardTokenProviderInitialized$2;
import com.squareup.cash.directdeposit.backend.real.RealDdaManager;
import com.squareup.cash.e2ee.signature.RealSignatureManager;
import com.squareup.cash.eligibility.backend.real.EligibilityRefresherSetupTeardown$setup$1$1;
import com.squareup.cash.favorites.presenters.FavoriteUpsellRefresher;
import com.squareup.cash.featureflags.AmplitudeExperiments$ClientHapticsImprovements;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlag$Option;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$PlayIntegrityWarmUp;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$SecurityFetchSigningCertificates;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager$values$$inlined$map$1;
import com.squareup.cash.featureflags.RealSessionFlags;
import com.squareup.cash.filament.RealFilamentSupportProvider;
import com.squareup.cash.fileupload.real.RealFileUploadService;
import com.squareup.cash.google.pay.GooglePayPresenter$models$1$1;
import com.squareup.cash.history.navigation.PaymentActionNavigator;
import com.squareup.cash.history.treehouse.RealTreehouseActivity;
import com.squareup.cash.initialscreenloader.backend.InitialScreenLoader$TriggeredBy;
import com.squareup.cash.initialscreenloader.backend.RealInitialScreenLoader;
import com.squareup.cash.initialscreenloader.presenters.InitialScreenLoaderPresenter;
import com.squareup.cash.initialscreenloader.presenters.InitialScreenLoaderPresenter$models$1$1$1;
import com.squareup.cash.initialscreenloader.screens.InitialScreenPlaceholder;
import com.squareup.cash.instruments.backend.real.RealInstrumentManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.AppAnalyticsQueue;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.investing.backend.real.InvestingSetupTeardown;
import com.squareup.cash.investing.db.InvestmentEntityQueries;
import com.squareup.cash.investing.db.InvestmentHoldingQueries$tokensToStates$2;
import com.squareup.cash.localization.ClientSyncLocaleChangeIoSetupTeardown;
import com.squareup.cash.localization.RealRegionProvider;
import com.squareup.cash.localization.RealRegionProvider$1$1$1;
import com.squareup.cash.money.applets.sections.PromotedAppletTileLocaleChangeIoSetupTeardown;
import com.squareup.cash.observability.backend.api.BugsnagClient;
import com.squareup.cash.observability.backend.real.bugsnag.RealBugsnagClient;
import com.squareup.cash.observability.backend.real.bugsnag.RealBugsnagClient$Companion$$ExternalSyntheticLambda0;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.ThrowableScribe;
import com.squareup.cash.payments.backend.real.RealPaymentManager;
import com.squareup.cash.performance.JankStatsAggregator;
import com.squareup.cash.performance.JankStatsAggregator$1$1;
import com.squareup.cash.qrcodes.QrShortcutsOnboardingAppStartWorker;
import com.squareup.cash.recipients.data.RealCustomerStore$getCustomerForId$$inlined$map$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Back;
import com.squareup.cash.screens.Finish;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.session.backend.SignoutSideEffectsPerformer;
import com.squareup.cash.support.chat.backend.real.RealPendingMessagesStore;
import com.squareup.cash.support.chat.backend.real.RealRecordedMessagesStore;
import com.squareup.cash.support.chat.backend.real.SupportChatApi;
import com.squareup.cash.support.chat.backend.real.TransactionBodyResolver;
import com.squareup.cash.tabprovider.real.EmptyTabProvider;
import com.squareup.cash.ui.MainContainerDelegate$special$$inlined$map$1;
import com.squareup.cash.ui.gcm.RealGcmRegistrar$unregister$2;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.userjourneys.notifier.NoOpNotifierAppModule$ProvideUserJourneyNotifierMetroFactory;
import com.squareup.cash.userjourneys.notifier.NoOpUserJourneyNotifier;
import com.squareup.cash.userjourneys.tracker.RealJourneyRequestContextProvider;
import com.squareup.cash.userjourneys.tracker.RealObservabilityMetadataLogger;
import com.squareup.cash.userjourneys.tracker.RealUserJourneyRepository;
import com.squareup.cash.userjourneys.tracker.RealUserJourneySignalProcessor;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.wallet.views.WalletUiFactory$MetroFactory;
import com.squareup.preferences.BooleanPreference;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.AddOrUpdateRewardRequest;
import com.squareup.protos.franklin.app.AddOrUpdateRewardResponse;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.scenarios.BlockerDescriptor;
import com.squareup.protos.franklin.common.scenarios.ScenarioPlan;
import com.squareup.util.coroutines.DerivedStateFlow;
import com.squareup.util.coroutines.StateFlowKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Function;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator;
import kotlinx.coroutines.flow.ChannelAsFlow;
import kotlinx.coroutines.flow.DistinctFlowImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$nullArrayFactory$1;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.internal.CombineKt;
import kotlinx.coroutines.flow.internal.NopCollector;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.PapaEvent;
import papa.SafeTrace;
import retrofit2.OkHttpCall;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class RealBoostSelector {
    public final Analytics analytics;
    public final BlockersDataNavigator blockersNavigator;
    public final RealBoostProvider boostProvider;
    public final BoostSyncer boostSyncer;
    public final FlowStarter flowStarter;
    public final AppService franklinAppService;
    public final CoroutineContext ioContext;
    public final CoroutineScope scope;
    public final AndroidStringManager stringManager;
    public final BufferedChannel requests = PapaEvent.Channel$default(-2, null, null, 6);
    public final SharedFlowImpl actions = FlowKt.MutableSharedFlow$default(0, 0, null, 7);
    public final SharedFlowImpl actionsPerformed = FlowKt.MutableSharedFlow$default(0, 0, null, 7);

    public RealBoostSelector(CoroutineScope coroutineScope, AppService appService, AndroidStringManager androidStringManager, FlowStarter flowStarter, BlockersDataNavigator blockersDataNavigator, RealBoostProvider realBoostProvider, BoostSyncer boostSyncer, Analytics analytics, CoroutineContext coroutineContext) {
        this.scope = coroutineScope;
        this.franklinAppService = appService;
        this.stringManager = androidStringManager;
        this.flowStarter = flowStarter;
        this.blockersNavigator = blockersDataNavigator;
        this.boostProvider = realBoostProvider;
        this.boostSyncer = boostSyncer;
        this.analytics = analytics;
        this.ioContext = coroutineContext;
        JobKt.launch$default(coroutineScope, coroutineContext, null, new AnonymousClass1(this, (Continuation) null, 0), 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x03e1, code lost:
    
        if (r2.emit(r3, r4) == r5) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0424, code lost:
    
        if (r2.emit(r0, r4) == r5) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x037a, code lost:
    
        if (r0 != r5) goto L105;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$selectRewardInternal(RealBoostSelector realBoostSelector, Finish finish, String str, DerivedSize.Companion companion, String str2, String str3, String str4, String str5, String str6, AppPresentation appPresentation, Function0 function0, BlockersData.MoneybotContext moneybotContext, ContinuationImpl continuationImpl) {
        RealBoostSelector$selectRewardInternal$1 realBoostSelector$selectRewardInternal$1;
        String str7;
        DerivedSize.Companion companion2;
        String str8;
        String str9;
        String str10;
        String str11;
        AppPresentation appPresentation2;
        Object firstOrNull;
        BlockersData blockersData;
        Function0 function02;
        List list;
        Function0 function03;
        BoostSyncer boostSyncer;
        List list2;
        String str12;
        BoostEvent boostEvent;
        BoostEvent replaceBoostEvent;
        BoostActionPerformed boostActionPerformed;
        String str13;
        DerivedSize.Companion companion3;
        String str14;
        BlockersData blockersData2;
        BoostEvent boostEvent2;
        String str15;
        Function0 function04;
        List list3;
        DerivedSize.Companion companion4;
        String str16;
        Function0 function05;
        BlockersData.MoneybotContext moneybotContext2;
        Function0 function06;
        BlockersData blockersData3;
        String str17;
        String str18;
        DerivedSize.Companion companion5;
        Event removeCdfEvent;
        RealBoostSelector realBoostSelector2;
        ApiResult apiResult;
        ErrorMessaging errorMessaging;
        ScenarioPlan scenarioPlan;
        SharedFlowImpl sharedFlowImpl = realBoostSelector.actions;
        BoostSyncer boostSyncer2 = realBoostSelector.boostSyncer;
        if (continuationImpl instanceof RealBoostSelector$selectRewardInternal$1) {
            realBoostSelector$selectRewardInternal$1 = (RealBoostSelector$selectRewardInternal$1) continuationImpl;
            int i = realBoostSelector$selectRewardInternal$1.label;
            if ((i & PKIFailureInfo.systemUnavail) != 0) {
                realBoostSelector$selectRewardInternal$1.label = i - PKIFailureInfo.systemUnavail;
                Object obj = realBoostSelector$selectRewardInternal$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                switch (realBoostSelector$selectRewardInternal$1.label) {
                    case 0:
                        SafeTrace.throwOnFailure(obj);
                        RealFlowStarter realFlowStarter = (RealFlowStarter) realBoostSelector.flowStarter;
                        finish.getClass();
                        BlockersData startFlow$default = FlowStarter.startFlow$default(realFlowStarter, BlockersData.Flow.PROFILE_BLOCKERS, finish, null, ClientScenario.ADD_OR_UPDATE_REWARD, str3, null, null, moneybotContext, null, 724);
                        Flow boostSlots = realBoostSelector.boostProvider.getBoostSlots(false);
                        str7 = str;
                        realBoostSelector$selectRewardInternal$1.L$1 = str7;
                        companion2 = companion;
                        realBoostSelector$selectRewardInternal$1.L$2 = companion2;
                        str8 = str2;
                        realBoostSelector$selectRewardInternal$1.L$3 = str8;
                        str9 = str4;
                        realBoostSelector$selectRewardInternal$1.L$5 = str9;
                        str10 = str5;
                        realBoostSelector$selectRewardInternal$1.L$6 = str10;
                        str11 = str6;
                        realBoostSelector$selectRewardInternal$1.L$7 = str11;
                        appPresentation2 = appPresentation;
                        realBoostSelector$selectRewardInternal$1.L$8 = appPresentation2;
                        realBoostSelector$selectRewardInternal$1.L$11 = function0;
                        realBoostSelector$selectRewardInternal$1.L$13 = startFlow$default;
                        realBoostSelector$selectRewardInternal$1.label = 1;
                        firstOrNull = FlowKt.firstOrNull(boostSlots, realBoostSelector$selectRewardInternal$1);
                        if (firstOrNull != coroutineSingletons) {
                            blockersData = startFlow$default;
                            function02 = function0;
                            list = (List) firstOrNull;
                            if (list == null) {
                                List list4 = list;
                                function03 = function02;
                                boostSyncer = boostSyncer2;
                                list2 = list;
                                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                                Iterator it = list4.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((Slots) it.next()).getToken());
                                }
                                str12 = (String) CollectionsKt.firstOrNull((List) arrayList);
                            } else {
                                function03 = function02;
                                boostSyncer = boostSyncer2;
                                list2 = list;
                                str12 = null;
                            }
                            String str19 = blockersData.flowToken;
                            if (str7 == null || str12 == null) {
                                if (str12 != null && str7 != null) {
                                    boostEvent = new BoostEvent.AddBoostEvent(str19, str7, appPresentation2, null, null);
                                } else if (str12 != null || str7 == null) {
                                    Timber.Forest.e(new AssertionError("previousRewardToken should not be null when removing current rewardToken boost"));
                                    boostEvent = null;
                                } else {
                                    replaceBoostEvent = new BoostEvent.ReplaceBoostEvent(str19, str7, str12, appPresentation2, null, null);
                                }
                                if (boostEvent != null) {
                                    SharedFlowImpl sharedFlowImpl2 = realBoostSelector.actionsPerformed;
                                    if (boostEvent instanceof BoostEvent.RemoveBoostEvent) {
                                        boostActionPerformed = BoostActionPerformed.REMOVED;
                                    } else if (boostEvent instanceof BoostEvent.AddBoostEvent) {
                                        boostActionPerformed = BoostActionPerformed.ADDED;
                                    } else {
                                        if (!(boostEvent instanceof BoostEvent.ReplaceBoostEvent)) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            return null;
                                        }
                                        boostActionPerformed = BoostActionPerformed.REPLACED;
                                    }
                                    realBoostSelector$selectRewardInternal$1.L$1 = str7;
                                    realBoostSelector$selectRewardInternal$1.L$2 = companion2;
                                    realBoostSelector$selectRewardInternal$1.L$3 = str8;
                                    realBoostSelector$selectRewardInternal$1.L$5 = str9;
                                    realBoostSelector$selectRewardInternal$1.L$6 = str10;
                                    realBoostSelector$selectRewardInternal$1.L$7 = str11;
                                    realBoostSelector$selectRewardInternal$1.L$8 = null;
                                    realBoostSelector$selectRewardInternal$1.L$11 = function03;
                                    realBoostSelector$selectRewardInternal$1.L$13 = blockersData;
                                    realBoostSelector$selectRewardInternal$1.L$14 = list2;
                                    realBoostSelector$selectRewardInternal$1.L$16 = boostEvent;
                                    realBoostSelector$selectRewardInternal$1.label = 2;
                                    if (sharedFlowImpl2.emit(boostActionPerformed, realBoostSelector$selectRewardInternal$1) != coroutineSingletons) {
                                        DerivedSize.Companion companion6 = companion2;
                                        str13 = str7;
                                        companion3 = companion6;
                                        BlockersData blockersData4 = blockersData;
                                        str14 = str10;
                                        blockersData2 = blockersData4;
                                        boostEvent2 = boostEvent;
                                        str15 = str9;
                                        function04 = function03;
                                        list3 = list2;
                                        if (str8 != null || companion3 == null) {
                                            companion4 = companion3;
                                        } else {
                                            Analytics analytics = realBoostSelector.analytics;
                                            if (boostEvent2 instanceof BoostEvent.AddBoostEvent) {
                                                BoostEvent.AddBoostEvent addBoostEvent = (BoostEvent.AddBoostEvent) boostEvent2;
                                                DerivedSize.Companion companion7 = companion3;
                                                removeCdfEvent = JvmActuals_jvmKt.toAddCdfEvent(companion7, addBoostEvent.getFlowToken(), str8, addBoostEvent.getRewardToken(), null, addBoostEvent.getAppPresentation(), addBoostEvent.getRow(), addBoostEvent.getColumn());
                                                companion4 = companion7;
                                            } else {
                                                String str20 = str8;
                                                companion4 = companion3;
                                                if (boostEvent2 instanceof BoostEvent.ReplaceBoostEvent) {
                                                    BoostEvent.ReplaceBoostEvent replaceBoostEvent2 = (BoostEvent.ReplaceBoostEvent) boostEvent2;
                                                    removeCdfEvent = JvmActuals_jvmKt.toAddCdfEvent(companion4, replaceBoostEvent2.getFlowToken(), str20, replaceBoostEvent2.getRewardToken(), replaceBoostEvent2.getReplacedRewardToken(), replaceBoostEvent2.getAppPresentation(), replaceBoostEvent2.getRow(), replaceBoostEvent2.getColumn());
                                                } else {
                                                    if (!(boostEvent2 instanceof BoostEvent.RemoveBoostEvent)) {
                                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                                        return null;
                                                    }
                                                    BoostEvent.RemoveBoostEvent removeBoostEvent = (BoostEvent.RemoveBoostEvent) boostEvent2;
                                                    removeCdfEvent = JvmActuals_jvmKt.toRemoveCdfEvent(companion4, removeBoostEvent.getFlowToken(), str20, removeBoostEvent.getRewardToken(), removeBoostEvent.getAppPresentation(), removeBoostEvent.getRow(), removeBoostEvent.getColumn());
                                                }
                                            }
                                            analytics.track(removeCdfEvent, null);
                                        }
                                        if (list3 == null) {
                                            List list5 = list3;
                                            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list5, 10));
                                            Iterator it2 = list5.iterator();
                                            while (it2.hasNext()) {
                                                arrayList2.add(((Slots) it2.next()).getSelected_reward_token());
                                            }
                                            str16 = (String) CollectionsKt.firstOrNull((List) arrayList2);
                                        } else {
                                            str16 = null;
                                        }
                                        AddOrUpdateRewardRequest addOrUpdateRewardRequest = new AddOrUpdateRewardRequest(str16, str13);
                                        if (str13 == null) {
                                            RealBoostSyncer realBoostSyncer = (RealBoostSyncer) boostSyncer;
                                            function05 = function04;
                                            realBoostSyncer.activeRewardTokenOverrideQueries.transactionWithWrapper(new BorrowHomeKt$$ExternalSyntheticLambda1(1, realBoostSyncer, str13));
                                        } else {
                                            function05 = function04;
                                        }
                                        moneybotContext2 = blockersData2.moneybotContext;
                                        if (moneybotContext2 != null || str13 == null) {
                                            moneybotContext2 = null;
                                        }
                                        AppService appService = realBoostSelector.franklinAppService;
                                        ClientScenario clientScenario = blockersData2.clientScenario;
                                        clientScenario.getClass();
                                        String str21 = blockersData2.flowToken;
                                        String str22 = moneybotContext2 == null ? moneybotContext2.sessionId : null;
                                        String str23 = moneybotContext2 == null ? moneybotContext2.toolRequestId : null;
                                        realBoostSelector$selectRewardInternal$1.L$1 = null;
                                        realBoostSelector$selectRewardInternal$1.L$2 = companion4;
                                        realBoostSelector$selectRewardInternal$1.L$3 = null;
                                        realBoostSelector$selectRewardInternal$1.L$5 = str15;
                                        realBoostSelector$selectRewardInternal$1.L$6 = str14;
                                        realBoostSelector$selectRewardInternal$1.L$7 = str11;
                                        realBoostSelector$selectRewardInternal$1.L$8 = null;
                                        realBoostSelector$selectRewardInternal$1.L$11 = function05;
                                        realBoostSelector$selectRewardInternal$1.L$13 = blockersData2;
                                        realBoostSelector$selectRewardInternal$1.L$14 = null;
                                        realBoostSelector$selectRewardInternal$1.L$16 = boostEvent2;
                                        realBoostSelector$selectRewardInternal$1.label = 3;
                                        obj = appService.addOrUpdateReward(clientScenario, str21, str22, str23, addOrUpdateRewardRequest, realBoostSelector$selectRewardInternal$1);
                                        if (obj != coroutineSingletons) {
                                            function06 = function05;
                                            blockersData3 = blockersData2;
                                            str17 = str11;
                                            str18 = str14;
                                            companion5 = companion4;
                                            ApiResult apiResult2 = (ApiResult) obj;
                                            realBoostSelector$selectRewardInternal$1.L$1 = null;
                                            realBoostSelector$selectRewardInternal$1.L$2 = null;
                                            realBoostSelector$selectRewardInternal$1.L$3 = null;
                                            realBoostSelector$selectRewardInternal$1.L$5 = null;
                                            realBoostSelector$selectRewardInternal$1.L$6 = null;
                                            realBoostSelector$selectRewardInternal$1.L$7 = null;
                                            realBoostSelector$selectRewardInternal$1.L$8 = null;
                                            realBoostSelector$selectRewardInternal$1.L$11 = function06;
                                            realBoostSelector$selectRewardInternal$1.L$13 = blockersData3;
                                            realBoostSelector$selectRewardInternal$1.L$14 = null;
                                            realBoostSelector$selectRewardInternal$1.L$16 = null;
                                            realBoostSelector$selectRewardInternal$1.L$20 = apiResult2;
                                            realBoostSelector$selectRewardInternal$1.label = 4;
                                            DerivedSize.Companion companion8 = companion5;
                                            Object trackOfferUpdateComplete = realBoostSelector.trackOfferUpdateComplete(boostEvent2, apiResult2, companion8, str15, str18, str17, realBoostSelector$selectRewardInternal$1);
                                            realBoostSelector2 = realBoostSelector;
                                            apiResult = apiResult2;
                                            break;
                                        }
                                    }
                                } else {
                                    return Unit.INSTANCE;
                                }
                            } else {
                                replaceBoostEvent = new BoostEvent.RemoveBoostEvent(str19, str12, appPresentation2, null, null);
                            }
                            boostEvent = replaceBoostEvent;
                            if (boostEvent != null) {
                            }
                        }
                        return coroutineSingletons;
                    case 1:
                        BlockersData blockersData5 = realBoostSelector$selectRewardInternal$1.L$13;
                        Function0 function07 = realBoostSelector$selectRewardInternal$1.L$11;
                        AppPresentation appPresentation3 = realBoostSelector$selectRewardInternal$1.L$8;
                        String str24 = realBoostSelector$selectRewardInternal$1.L$7;
                        String str25 = realBoostSelector$selectRewardInternal$1.L$6;
                        String str26 = realBoostSelector$selectRewardInternal$1.L$5;
                        String str27 = realBoostSelector$selectRewardInternal$1.L$3;
                        DerivedSize.Companion companion9 = realBoostSelector$selectRewardInternal$1.L$2;
                        String str28 = realBoostSelector$selectRewardInternal$1.L$1;
                        SafeTrace.throwOnFailure(obj);
                        firstOrNull = obj;
                        function02 = function07;
                        str7 = str28;
                        blockersData = blockersData5;
                        appPresentation2 = appPresentation3;
                        companion2 = companion9;
                        str11 = str24;
                        str8 = str27;
                        str10 = str25;
                        str9 = str26;
                        list = (List) firstOrNull;
                        if (list == null) {
                        }
                        String str192 = blockersData.flowToken;
                        if (str7 == null) {
                        }
                        if (str12 != null) {
                        }
                        if (str12 != null) {
                        }
                        Timber.Forest.e(new AssertionError("previousRewardToken should not be null when removing current rewardToken boost"));
                        boostEvent = null;
                        if (boostEvent != null) {
                        }
                        break;
                    case 2:
                        boostEvent2 = realBoostSelector$selectRewardInternal$1.L$16;
                        list3 = realBoostSelector$selectRewardInternal$1.L$14;
                        blockersData2 = realBoostSelector$selectRewardInternal$1.L$13;
                        Function0 function08 = realBoostSelector$selectRewardInternal$1.L$11;
                        String str29 = realBoostSelector$selectRewardInternal$1.L$7;
                        str14 = realBoostSelector$selectRewardInternal$1.L$6;
                        String str30 = realBoostSelector$selectRewardInternal$1.L$5;
                        str8 = realBoostSelector$selectRewardInternal$1.L$3;
                        companion3 = realBoostSelector$selectRewardInternal$1.L$2;
                        str13 = realBoostSelector$selectRewardInternal$1.L$1;
                        SafeTrace.throwOnFailure(obj);
                        boostSyncer = boostSyncer2;
                        function04 = function08;
                        str11 = str29;
                        str15 = str30;
                        if (str8 != null) {
                        }
                        companion4 = companion3;
                        if (list3 == null) {
                        }
                        AddOrUpdateRewardRequest addOrUpdateRewardRequest2 = new AddOrUpdateRewardRequest(str16, str13);
                        if (str13 == null) {
                        }
                        moneybotContext2 = blockersData2.moneybotContext;
                        if (moneybotContext2 != null) {
                        }
                        moneybotContext2 = null;
                        AppService appService2 = realBoostSelector.franklinAppService;
                        ClientScenario clientScenario2 = blockersData2.clientScenario;
                        clientScenario2.getClass();
                        String str212 = blockersData2.flowToken;
                        if (moneybotContext2 == null) {
                        }
                        if (moneybotContext2 == null) {
                        }
                        realBoostSelector$selectRewardInternal$1.L$1 = null;
                        realBoostSelector$selectRewardInternal$1.L$2 = companion4;
                        realBoostSelector$selectRewardInternal$1.L$3 = null;
                        realBoostSelector$selectRewardInternal$1.L$5 = str15;
                        realBoostSelector$selectRewardInternal$1.L$6 = str14;
                        realBoostSelector$selectRewardInternal$1.L$7 = str11;
                        realBoostSelector$selectRewardInternal$1.L$8 = null;
                        realBoostSelector$selectRewardInternal$1.L$11 = function05;
                        realBoostSelector$selectRewardInternal$1.L$13 = blockersData2;
                        realBoostSelector$selectRewardInternal$1.L$14 = null;
                        realBoostSelector$selectRewardInternal$1.L$16 = boostEvent2;
                        realBoostSelector$selectRewardInternal$1.label = 3;
                        obj = appService2.addOrUpdateReward(clientScenario2, str212, str22, str23, addOrUpdateRewardRequest2, realBoostSelector$selectRewardInternal$1);
                        if (obj != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 3:
                        boostEvent2 = realBoostSelector$selectRewardInternal$1.L$16;
                        blockersData3 = realBoostSelector$selectRewardInternal$1.L$13;
                        function06 = realBoostSelector$selectRewardInternal$1.L$11;
                        str17 = realBoostSelector$selectRewardInternal$1.L$7;
                        str18 = realBoostSelector$selectRewardInternal$1.L$6;
                        str15 = realBoostSelector$selectRewardInternal$1.L$5;
                        companion5 = realBoostSelector$selectRewardInternal$1.L$2;
                        SafeTrace.throwOnFailure(obj);
                        boostSyncer = boostSyncer2;
                        ApiResult apiResult22 = (ApiResult) obj;
                        realBoostSelector$selectRewardInternal$1.L$1 = null;
                        realBoostSelector$selectRewardInternal$1.L$2 = null;
                        realBoostSelector$selectRewardInternal$1.L$3 = null;
                        realBoostSelector$selectRewardInternal$1.L$5 = null;
                        realBoostSelector$selectRewardInternal$1.L$6 = null;
                        realBoostSelector$selectRewardInternal$1.L$7 = null;
                        realBoostSelector$selectRewardInternal$1.L$8 = null;
                        realBoostSelector$selectRewardInternal$1.L$11 = function06;
                        realBoostSelector$selectRewardInternal$1.L$13 = blockersData3;
                        realBoostSelector$selectRewardInternal$1.L$14 = null;
                        realBoostSelector$selectRewardInternal$1.L$16 = null;
                        realBoostSelector$selectRewardInternal$1.L$20 = apiResult22;
                        realBoostSelector$selectRewardInternal$1.label = 4;
                        DerivedSize.Companion companion82 = companion5;
                        Object trackOfferUpdateComplete2 = realBoostSelector.trackOfferUpdateComplete(boostEvent2, apiResult22, companion82, str15, str18, str17, realBoostSelector$selectRewardInternal$1);
                        realBoostSelector2 = realBoostSelector;
                        apiResult = apiResult22;
                        break;
                    case 4:
                        apiResult = realBoostSelector$selectRewardInternal$1.L$20;
                        blockersData3 = realBoostSelector$selectRewardInternal$1.L$13;
                        function06 = realBoostSelector$selectRewardInternal$1.L$11;
                        SafeTrace.throwOnFailure(obj);
                        realBoostSelector2 = realBoostSelector;
                        boostSyncer = boostSyncer2;
                        if (function06 != null) {
                            function06.invoke();
                        }
                        if (!(apiResult instanceof ApiResult.Success)) {
                            ((RealBoostSyncer) boostSyncer).activeRewardTokenOverrideQueries.deleteAll();
                            AndroidStringManager androidStringManager = realBoostSelector2.stringManager;
                            apiResult.getClass();
                            errorMessaging = TextUtilsCompat.errorMessaging(androidStringManager, (ApiResult.Failure) apiResult, null);
                            BoostAction.Error error = new BoostAction.Error(errorMessaging.getMessage());
                            realBoostSelector$selectRewardInternal$1.L$1 = null;
                            realBoostSelector$selectRewardInternal$1.L$2 = null;
                            realBoostSelector$selectRewardInternal$1.L$3 = null;
                            realBoostSelector$selectRewardInternal$1.L$5 = null;
                            realBoostSelector$selectRewardInternal$1.L$6 = null;
                            realBoostSelector$selectRewardInternal$1.L$7 = null;
                            realBoostSelector$selectRewardInternal$1.L$8 = null;
                            realBoostSelector$selectRewardInternal$1.L$11 = null;
                            realBoostSelector$selectRewardInternal$1.L$13 = null;
                            realBoostSelector$selectRewardInternal$1.L$14 = null;
                            realBoostSelector$selectRewardInternal$1.L$16 = null;
                            realBoostSelector$selectRewardInternal$1.L$20 = null;
                            realBoostSelector$selectRewardInternal$1.label = 6;
                            break;
                        } else {
                            ResponseContext responseContext = ((AddOrUpdateRewardResponse) ((ApiResult.Success) apiResult).response).response_context;
                            List<BlockerDescriptor> list6 = (responseContext == null || (scenarioPlan = responseContext.scenario_plan) == null) ? null : scenarioPlan.blocker_descriptors;
                            if (list6 == null || list6.isEmpty()) {
                                if ((responseContext != null ? responseContext.status_result : null) == null) {
                                    return Unit.INSTANCE;
                                }
                            }
                            responseContext.getClass();
                            BoostAction.Blockers blockers = new BoostAction.Blockers(realBoostSelector2.blockersNavigator.getNext(null, blockersData3.updateFromResponseContext(responseContext, true)));
                            realBoostSelector$selectRewardInternal$1.L$1 = null;
                            realBoostSelector$selectRewardInternal$1.L$2 = null;
                            realBoostSelector$selectRewardInternal$1.L$3 = null;
                            realBoostSelector$selectRewardInternal$1.L$5 = null;
                            realBoostSelector$selectRewardInternal$1.L$6 = null;
                            realBoostSelector$selectRewardInternal$1.L$7 = null;
                            realBoostSelector$selectRewardInternal$1.L$8 = null;
                            realBoostSelector$selectRewardInternal$1.L$11 = null;
                            realBoostSelector$selectRewardInternal$1.L$13 = null;
                            realBoostSelector$selectRewardInternal$1.L$14 = null;
                            realBoostSelector$selectRewardInternal$1.L$16 = null;
                            realBoostSelector$selectRewardInternal$1.L$20 = null;
                            realBoostSelector$selectRewardInternal$1.label = 5;
                            break;
                        }
                        return coroutineSingletons;
                    case 5:
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    case 6:
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    default:
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        realBoostSelector$selectRewardInternal$1 = new RealBoostSelector$selectRewardInternal$1(realBoostSelector, continuationImpl);
        Object obj2 = realBoostSelector$selectRewardInternal$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (realBoostSelector$selectRewardInternal$1.label) {
        }
    }

    public final Object getOfferToken(String str, ContinuationImpl continuationImpl) {
        Object firstOrNull = FlowKt.firstOrNull(new RealCustomerStore$getCustomerForId$$inlined$map$1(this.boostProvider.getBoost(str), 5), continuationImpl);
        return firstOrNull == CoroutineSingletons.COROUTINE_SUSPENDED ? firstOrNull : (String) firstOrNull;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleOfferResponse(ApiResult apiResult, BlockersData blockersData, RealBoostSelector$updateBoostMultiSelectInternal$1 realBoostSelector$updateBoostMultiSelectInternal$1) {
        ErrorMessaging errorMessaging;
        Object obj;
        ScenarioPlan scenarioPlan;
        boolean z = apiResult instanceof ApiResult.Success;
        SharedFlowImpl sharedFlowImpl = this.actions;
        if (!z) {
            if (!(apiResult instanceof ApiResult.Failure)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            errorMessaging = TextUtilsCompat.errorMessaging(this.stringManager, (ApiResult.Failure) apiResult, null);
            Object emit = sharedFlowImpl.emit(new BoostAction.Error(errorMessaging.getMessage()), realBoostSelector$updateBoostMultiSelectInternal$1);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (emit != coroutineSingletons) {
                emit = Unit.INSTANCE;
            }
            return emit == coroutineSingletons ? emit : Unit.INSTANCE;
        }
        ResponseContext responseContext = ((AddOrUpdateRewardResponse) ((ApiResult.Success) apiResult).response).response_context;
        List<BlockerDescriptor> list = (responseContext == null || (scenarioPlan = responseContext.scenario_plan) == null) ? null : scenarioPlan.blocker_descriptors;
        if (list == null || list.isEmpty()) {
            if ((responseContext != null ? responseContext.status_result : null) == null) {
                obj = Unit.INSTANCE;
                return obj != CoroutineSingletons.COROUTINE_SUSPENDED ? obj : Unit.INSTANCE;
            }
        }
        responseContext.getClass();
        obj = sharedFlowImpl.emit(new BoostAction.Blockers(this.blockersNavigator.getNext(null, blockersData.updateFromResponseContext(responseContext, true))), realBoostSelector$updateBoostMultiSelectInternal$1);
        if (obj != CoroutineSingletons.COROUTINE_SUSPENDED) {
            obj = Unit.INSTANCE;
        }
        if (obj != CoroutineSingletons.COROUTINE_SUSPENDED) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object trackOfferUpdateComplete(BoostEvent boostEvent, ApiResult apiResult, DerivedSize.Companion companion, String str, String str2, String str3, ContinuationImpl continuationImpl) {
        RealBoostSelector$trackOfferUpdateComplete$1 realBoostSelector$trackOfferUpdateComplete$1;
        int i;
        OfferRequestStatus offerRequestStatus;
        AppLocation appLocation;
        BoostEvent boostEvent2;
        AppLocation appLocation2;
        String str4;
        String str5;
        String str6;
        Analytics analytics;
        OfferRequestStatus offerRequestStatus2;
        BoostEvent boostEvent3;
        AppLocation appLocation3;
        String str7;
        String str8;
        String str9;
        OfferRequestStatus offerRequestStatus3;
        BoostEvent boostEvent4;
        AppLocation appLocation4;
        String str10;
        String str11;
        String str12;
        OfferRequestStatus offerRequestStatus4;
        OffersUpdateComplete offersUpdateComplete;
        if (continuationImpl instanceof RealBoostSelector$trackOfferUpdateComplete$1) {
            realBoostSelector$trackOfferUpdateComplete$1 = (RealBoostSelector$trackOfferUpdateComplete$1) continuationImpl;
            int i2 = realBoostSelector$trackOfferUpdateComplete$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realBoostSelector$trackOfferUpdateComplete$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realBoostSelector$trackOfferUpdateComplete$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realBoostSelector$trackOfferUpdateComplete$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (apiResult instanceof ApiResult.Failure.HttpFailure) {
                        offerRequestStatus = OfferRequestStatus.LOGICAL_ERROR;
                    } else if (apiResult instanceof ApiResult.Failure.NetworkFailure) {
                        offerRequestStatus = OfferRequestStatus.NETWORK_ERROR;
                    } else {
                        if (!(apiResult instanceof ApiResult.Success)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        offerRequestStatus = OfferRequestStatus.SUCCESS;
                    }
                    if (Intrinsics.areEqual(companion, BoostAppLocation$CardTab.INSTANCE)) {
                        appLocation = AppLocation.CardTab;
                    } else if (companion instanceof BoostAppLocation$ProfileDirectory) {
                        appLocation = AppLocation.Discover;
                    } else if (companion instanceof BoostAppLocation$MerchantProfile) {
                        appLocation = AppLocation.MerchantProfile;
                    } else if (Intrinsics.areEqual(companion, BoostAppLocation$OffersCollection.INSTANCE)) {
                        appLocation = AppLocation.OffersTab;
                    } else if (companion instanceof BoostAppLocation$OffersDetail) {
                        appLocation = ((BoostAppLocation$OffersDetail) companion).getOrigin();
                    } else {
                        if (companion != null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        appLocation = null;
                    }
                    boolean z = boostEvent instanceof BoostEvent.AddBoostEvent;
                    Analytics analytics2 = this.analytics;
                    if (z) {
                        String rewardToken = ((BoostEvent.AddBoostEvent) boostEvent).getRewardToken();
                        realBoostSelector$trackOfferUpdateComplete$1.L$3 = str;
                        realBoostSelector$trackOfferUpdateComplete$1.L$4 = str2;
                        realBoostSelector$trackOfferUpdateComplete$1.L$5 = str3;
                        realBoostSelector$trackOfferUpdateComplete$1.L$6 = offerRequestStatus;
                        realBoostSelector$trackOfferUpdateComplete$1.L$7 = appLocation;
                        realBoostSelector$trackOfferUpdateComplete$1.L$8 = boostEvent;
                        realBoostSelector$trackOfferUpdateComplete$1.L$9 = analytics2;
                        realBoostSelector$trackOfferUpdateComplete$1.label = 1;
                        obj = getOfferToken(rewardToken, realBoostSelector$trackOfferUpdateComplete$1);
                        if (obj != obj2) {
                            boostEvent4 = boostEvent;
                            appLocation4 = appLocation;
                            str10 = str;
                            str11 = str2;
                            str12 = str3;
                            analytics = analytics2;
                            offerRequestStatus4 = offerRequestStatus;
                            offersUpdateComplete = new OffersUpdateComplete(str10, str11, str12, (String) obj, ((BoostEvent.AddBoostEvent) boostEvent4).getRewardToken(), appLocation4, OfferUpdateType.ADD, offerRequestStatus4);
                        }
                    } else if (boostEvent instanceof BoostEvent.RemoveBoostEvent) {
                        String rewardToken2 = ((BoostEvent.RemoveBoostEvent) boostEvent).getRewardToken();
                        realBoostSelector$trackOfferUpdateComplete$1.L$3 = str;
                        realBoostSelector$trackOfferUpdateComplete$1.L$4 = str2;
                        realBoostSelector$trackOfferUpdateComplete$1.L$5 = str3;
                        realBoostSelector$trackOfferUpdateComplete$1.L$6 = offerRequestStatus;
                        realBoostSelector$trackOfferUpdateComplete$1.L$7 = appLocation;
                        realBoostSelector$trackOfferUpdateComplete$1.L$8 = boostEvent;
                        realBoostSelector$trackOfferUpdateComplete$1.L$9 = analytics2;
                        realBoostSelector$trackOfferUpdateComplete$1.label = 2;
                        obj = getOfferToken(rewardToken2, realBoostSelector$trackOfferUpdateComplete$1);
                        if (obj != obj2) {
                            boostEvent3 = boostEvent;
                            appLocation3 = appLocation;
                            str7 = str;
                            str8 = str2;
                            str9 = str3;
                            analytics = analytics2;
                            offerRequestStatus3 = offerRequestStatus;
                            offersUpdateComplete = new OffersUpdateComplete(str7, str8, str9, (String) obj, ((BoostEvent.RemoveBoostEvent) boostEvent3).getRewardToken(), appLocation3, OfferUpdateType.REMOVE, offerRequestStatus3);
                        }
                    } else {
                        if (!(boostEvent instanceof BoostEvent.ReplaceBoostEvent)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        String rewardToken3 = ((BoostEvent.ReplaceBoostEvent) boostEvent).getRewardToken();
                        realBoostSelector$trackOfferUpdateComplete$1.L$3 = str;
                        realBoostSelector$trackOfferUpdateComplete$1.L$4 = str2;
                        realBoostSelector$trackOfferUpdateComplete$1.L$5 = str3;
                        realBoostSelector$trackOfferUpdateComplete$1.L$6 = offerRequestStatus;
                        realBoostSelector$trackOfferUpdateComplete$1.L$7 = appLocation;
                        realBoostSelector$trackOfferUpdateComplete$1.L$8 = boostEvent;
                        realBoostSelector$trackOfferUpdateComplete$1.L$9 = analytics2;
                        realBoostSelector$trackOfferUpdateComplete$1.label = 3;
                        obj = getOfferToken(rewardToken3, realBoostSelector$trackOfferUpdateComplete$1);
                        if (obj != obj2) {
                            boostEvent2 = boostEvent;
                            appLocation2 = appLocation;
                            str4 = str;
                            str5 = str2;
                            str6 = str3;
                            analytics = analytics2;
                            offerRequestStatus2 = offerRequestStatus;
                            offersUpdateComplete = new OffersUpdateComplete(str4, str5, str6, (String) obj, ((BoostEvent.ReplaceBoostEvent) boostEvent2).getRewardToken(), appLocation2, OfferUpdateType.SWAP, offerRequestStatus2);
                        }
                    }
                    return obj2;
                }
                if (i == 1) {
                    analytics = realBoostSelector$trackOfferUpdateComplete$1.L$9;
                    boostEvent4 = realBoostSelector$trackOfferUpdateComplete$1.L$8;
                    AppLocation appLocation5 = realBoostSelector$trackOfferUpdateComplete$1.L$7;
                    OfferRequestStatus offerRequestStatus5 = realBoostSelector$trackOfferUpdateComplete$1.L$6;
                    String str13 = realBoostSelector$trackOfferUpdateComplete$1.L$5;
                    String str14 = realBoostSelector$trackOfferUpdateComplete$1.L$4;
                    String str15 = realBoostSelector$trackOfferUpdateComplete$1.L$3;
                    SafeTrace.throwOnFailure(obj);
                    str12 = str13;
                    str11 = str14;
                    appLocation4 = appLocation5;
                    offerRequestStatus4 = offerRequestStatus5;
                    str10 = str15;
                    offersUpdateComplete = new OffersUpdateComplete(str10, str11, str12, (String) obj, ((BoostEvent.AddBoostEvent) boostEvent4).getRewardToken(), appLocation4, OfferUpdateType.ADD, offerRequestStatus4);
                } else if (i == 2) {
                    analytics = realBoostSelector$trackOfferUpdateComplete$1.L$9;
                    boostEvent3 = realBoostSelector$trackOfferUpdateComplete$1.L$8;
                    AppLocation appLocation6 = realBoostSelector$trackOfferUpdateComplete$1.L$7;
                    OfferRequestStatus offerRequestStatus6 = realBoostSelector$trackOfferUpdateComplete$1.L$6;
                    String str16 = realBoostSelector$trackOfferUpdateComplete$1.L$5;
                    String str17 = realBoostSelector$trackOfferUpdateComplete$1.L$4;
                    String str18 = realBoostSelector$trackOfferUpdateComplete$1.L$3;
                    SafeTrace.throwOnFailure(obj);
                    str9 = str16;
                    str8 = str17;
                    appLocation3 = appLocation6;
                    offerRequestStatus3 = offerRequestStatus6;
                    str7 = str18;
                    offersUpdateComplete = new OffersUpdateComplete(str7, str8, str9, (String) obj, ((BoostEvent.RemoveBoostEvent) boostEvent3).getRewardToken(), appLocation3, OfferUpdateType.REMOVE, offerRequestStatus3);
                } else {
                    if (i != 3) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    analytics = realBoostSelector$trackOfferUpdateComplete$1.L$9;
                    boostEvent2 = realBoostSelector$trackOfferUpdateComplete$1.L$8;
                    AppLocation appLocation7 = realBoostSelector$trackOfferUpdateComplete$1.L$7;
                    OfferRequestStatus offerRequestStatus7 = realBoostSelector$trackOfferUpdateComplete$1.L$6;
                    String str19 = realBoostSelector$trackOfferUpdateComplete$1.L$5;
                    String str20 = realBoostSelector$trackOfferUpdateComplete$1.L$4;
                    String str21 = realBoostSelector$trackOfferUpdateComplete$1.L$3;
                    SafeTrace.throwOnFailure(obj);
                    str6 = str19;
                    str5 = str20;
                    appLocation2 = appLocation7;
                    offerRequestStatus2 = offerRequestStatus7;
                    str4 = str21;
                    offersUpdateComplete = new OffersUpdateComplete(str4, str5, str6, (String) obj, ((BoostEvent.ReplaceBoostEvent) boostEvent2).getRewardToken(), appLocation2, OfferUpdateType.SWAP, offerRequestStatus2);
                }
                analytics.track(offersUpdateComplete, null);
                return Unit.INSTANCE;
            }
        }
        realBoostSelector$trackOfferUpdateComplete$1 = new RealBoostSelector$trackOfferUpdateComplete$1(this, continuationImpl);
        Object obj3 = realBoostSelector$trackOfferUpdateComplete$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realBoostSelector$trackOfferUpdateComplete$1.label;
        if (i != 0) {
        }
        analytics.track(offersUpdateComplete, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(10:5|6|7|8|(1:(3:(1:(5:13|14|15|16|17)(2:24|25))(7:26|27|28|29|30|(3:33|16|17)|32)|22|23)(2:38|39))(9:46|47|(1:63)(1:50)|51|(1:53)(1:62)|(1:55)(1:61)|56|57|(2:59|32)(1:60))|40|(2:42|(2:44|32)(2:45|29))|30|(0)|32))|65|6|7|8|(0)(0)|40|(0)|30|(0)|32) */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0061, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d2 A[Catch: all -> 0x0061, TryCatch #1 {all -> 0x0061, blocks: (B:30:0x00eb, B:39:0x005c, B:40:0x00ce, B:42:0x00d2, B:47:0x0087, B:51:0x00a9, B:53:0x00b4, B:55:0x00ba, B:57:0x00c1), top: B:8:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateBoostMultiSelectInternal(Back back, String str, String str2, String str3, OfferUpdateType offerUpdateType, String str4, Function1 function1, BlockersData.MoneybotContext moneybotContext, ContinuationImpl continuationImpl) {
        RealBoostSelector$updateBoostMultiSelectInternal$1 realBoostSelector$updateBoostMultiSelectInternal$1;
        RealBoostSelector$updateBoostMultiSelectInternal$1 realBoostSelector$updateBoostMultiSelectInternal$12;
        Object obj;
        int i;
        BlockersData blockersData;
        String str5;
        OfferUpdateType offerUpdateType2;
        ApiResult apiResult;
        Function1 function12;
        BlockersData blockersData2;
        ApiResult apiResult2;
        Function1 function13;
        Function1 function14 = function1;
        if (continuationImpl instanceof RealBoostSelector$updateBoostMultiSelectInternal$1) {
            realBoostSelector$updateBoostMultiSelectInternal$1 = (RealBoostSelector$updateBoostMultiSelectInternal$1) continuationImpl;
            int i2 = realBoostSelector$updateBoostMultiSelectInternal$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realBoostSelector$updateBoostMultiSelectInternal$1.label = i2 - PKIFailureInfo.systemUnavail;
                realBoostSelector$updateBoostMultiSelectInternal$12 = realBoostSelector$updateBoostMultiSelectInternal$1;
                Object obj2 = realBoostSelector$updateBoostMultiSelectInternal$12.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realBoostSelector$updateBoostMultiSelectInternal$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    RealFlowStarter realFlowStarter = (RealFlowStarter) this.flowStarter;
                    back.getClass();
                    BlockersData startFlow$default = FlowStarter.startFlow$default(realFlowStarter, BlockersData.Flow.PROFILE_BLOCKERS, back, null, ClientScenario.ADD_OR_UPDATE_REWARD, str3, null, null, moneybotContext, null, 724);
                    function14.invoke(Boolean.TRUE);
                    realBoostSelector$updateBoostMultiSelectInternal$12.L$4 = offerUpdateType;
                    realBoostSelector$updateBoostMultiSelectInternal$12.L$5 = str4;
                    realBoostSelector$updateBoostMultiSelectInternal$12.L$6 = function14;
                    realBoostSelector$updateBoostMultiSelectInternal$12.L$8 = startFlow$default;
                    realBoostSelector$updateBoostMultiSelectInternal$12.label = 1;
                    AddOrUpdateRewardRequest addOrUpdateRewardRequest = new AddOrUpdateRewardRequest(str2, str);
                    BlockersData.MoneybotContext moneybotContext2 = startFlow$default.moneybotContext;
                    if (moneybotContext2 == null || str == null) {
                        moneybotContext2 = null;
                    }
                    AppService appService = this.franklinAppService;
                    ClientScenario clientScenario = startFlow$default.clientScenario;
                    clientScenario.getClass();
                    Object addOrUpdateReward = appService.addOrUpdateReward(clientScenario, startFlow$default.flowToken, moneybotContext2 != null ? moneybotContext2.sessionId : null, moneybotContext2 != null ? moneybotContext2.toolRequestId : null, addOrUpdateRewardRequest, realBoostSelector$updateBoostMultiSelectInternal$12);
                    if (addOrUpdateReward == obj) {
                        return obj;
                    }
                    obj2 = addOrUpdateReward;
                    blockersData = startFlow$default;
                    str5 = str4;
                    offerUpdateType2 = offerUpdateType;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            apiResult2 = realBoostSelector$updateBoostMultiSelectInternal$12.L$9;
                            blockersData2 = realBoostSelector$updateBoostMultiSelectInternal$12.L$8;
                            function12 = realBoostSelector$updateBoostMultiSelectInternal$12.L$6;
                            try {
                                SafeTrace.throwOnFailure(obj2);
                                apiResult = apiResult2;
                                blockersData = blockersData2;
                                function14 = function12;
                                realBoostSelector$updateBoostMultiSelectInternal$12.L$4 = null;
                                realBoostSelector$updateBoostMultiSelectInternal$12.L$5 = null;
                                realBoostSelector$updateBoostMultiSelectInternal$12.L$6 = function14;
                                realBoostSelector$updateBoostMultiSelectInternal$12.L$8 = null;
                                realBoostSelector$updateBoostMultiSelectInternal$12.L$9 = null;
                                realBoostSelector$updateBoostMultiSelectInternal$12.label = 3;
                                if (handleOfferResponse(apiResult, blockersData, realBoostSelector$updateBoostMultiSelectInternal$12) != obj) {
                                    function13 = function14;
                                    function13.invoke(Boolean.FALSE);
                                    return Unit.INSTANCE;
                                }
                                return obj;
                            } catch (Throwable th) {
                                th = th;
                                function14 = function12;
                            }
                        } else {
                            if (i != 3) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            function13 = realBoostSelector$updateBoostMultiSelectInternal$12.L$6;
                            try {
                                SafeTrace.throwOnFailure(obj2);
                                function13.invoke(Boolean.FALSE);
                                return Unit.INSTANCE;
                            } catch (Throwable th2) {
                                th = th2;
                                function14 = function13;
                            }
                        }
                        function14.invoke(Boolean.FALSE);
                        throw th;
                    }
                    blockersData = realBoostSelector$updateBoostMultiSelectInternal$12.L$8;
                    function14 = realBoostSelector$updateBoostMultiSelectInternal$12.L$6;
                    str5 = realBoostSelector$updateBoostMultiSelectInternal$12.L$5;
                    offerUpdateType2 = realBoostSelector$updateBoostMultiSelectInternal$12.L$4;
                    SafeTrace.throwOnFailure(obj2);
                }
                apiResult = (ApiResult) obj2;
                if (str5 != null) {
                    realBoostSelector$updateBoostMultiSelectInternal$12.L$4 = null;
                    realBoostSelector$updateBoostMultiSelectInternal$12.L$5 = null;
                    realBoostSelector$updateBoostMultiSelectInternal$12.L$6 = function14;
                    realBoostSelector$updateBoostMultiSelectInternal$12.L$8 = blockersData;
                    realBoostSelector$updateBoostMultiSelectInternal$12.L$9 = apiResult;
                    realBoostSelector$updateBoostMultiSelectInternal$12.label = 2;
                    if (trackOfferUpdateComplete(str5, apiResult, offerUpdateType2, realBoostSelector$updateBoostMultiSelectInternal$12) == obj) {
                        return obj;
                    }
                    function12 = function14;
                    blockersData2 = blockersData;
                    apiResult2 = apiResult;
                    apiResult = apiResult2;
                    blockersData = blockersData2;
                    function14 = function12;
                }
                realBoostSelector$updateBoostMultiSelectInternal$12.L$4 = null;
                realBoostSelector$updateBoostMultiSelectInternal$12.L$5 = null;
                realBoostSelector$updateBoostMultiSelectInternal$12.L$6 = function14;
                realBoostSelector$updateBoostMultiSelectInternal$12.L$8 = null;
                realBoostSelector$updateBoostMultiSelectInternal$12.L$9 = null;
                realBoostSelector$updateBoostMultiSelectInternal$12.label = 3;
                if (handleOfferResponse(apiResult, blockersData, realBoostSelector$updateBoostMultiSelectInternal$12) != obj) {
                }
                return obj;
            }
        }
        realBoostSelector$updateBoostMultiSelectInternal$1 = new RealBoostSelector$updateBoostMultiSelectInternal$1(this, continuationImpl);
        realBoostSelector$updateBoostMultiSelectInternal$12 = realBoostSelector$updateBoostMultiSelectInternal$1;
        Object obj22 = realBoostSelector$updateBoostMultiSelectInternal$12.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realBoostSelector$updateBoostMultiSelectInternal$12.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj22;
        if (str5 != null) {
        }
        realBoostSelector$updateBoostMultiSelectInternal$12.L$4 = null;
        realBoostSelector$updateBoostMultiSelectInternal$12.L$5 = null;
        realBoostSelector$updateBoostMultiSelectInternal$12.L$6 = function14;
        realBoostSelector$updateBoostMultiSelectInternal$12.L$8 = null;
        realBoostSelector$updateBoostMultiSelectInternal$12.L$9 = null;
        realBoostSelector$updateBoostMultiSelectInternal$12.label = 3;
        if (handleOfferResponse(apiResult, blockersData, realBoostSelector$updateBoostMultiSelectInternal$12) != obj) {
        }
        return obj;
    }

    /* renamed from: com.squareup.cash.boost.backend.RealBoostSelector$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements Function2 {
        public final /* synthetic */ int $r8$classId;
        public Object L$0;
        public int label;
        public final /* synthetic */ Object this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(Object obj, Object obj2, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.L$0 = obj;
            this.this$0 = obj2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            int i = this.$r8$classId;
            Object obj2 = this.this$0;
            switch (i) {
                case 0:
                    return new AnonymousClass1((RealBoostSelector) obj2, continuation, 0);
                case 1:
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation, (RealBlockerFlowAnalytics) obj2, 1);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                case 2:
                    return new AnonymousClass1((BringIntoViewRequesterImpl) this.L$0, (MutableState) obj2, continuation, 2);
                case 3:
                    return new AnonymousClass1((BufferedChannel) this.L$0, (RealClientSyncRequestExecutor) obj2, continuation, 3);
                case 4:
                    return new AnonymousClass1((BufferedChannel) this.L$0, (RealClientSyncResponseProcessor) obj2, continuation, 4);
                case 5:
                    AnonymousClass1 anonymousClass12 = new AnonymousClass1((ZiplineHistoryDataJavaScripter) obj2, continuation, 5);
                    anonymousClass12.L$0 = obj;
                    return anonymousClass12;
                case 6:
                    return new AnonymousClass1((Flow) this.L$0, (RealCustomerLimitsManager) obj2, continuation, 6);
                case 7:
                    AnonymousClass1 anonymousClass13 = new AnonymousClass1(continuation, (RealProfileSyncSetupTeardown) obj2, 7);
                    anonymousClass13.L$0 = obj;
                    return anonymousClass13;
                case 8:
                    AnonymousClass1 anonymousClass14 = new AnonymousClass1(continuation, (CdpConfigUpdateSetupTeardown) obj2, 8);
                    anonymousClass14.L$0 = obj;
                    return anonymousClass14;
                case 9:
                    AnonymousClass1 anonymousClass15 = new AnonymousClass1(continuation, (EmptyTabProvider) obj2, 9);
                    anonymousClass15.L$0 = obj;
                    return anonymousClass15;
                case 10:
                    AnonymousClass1 anonymousClass16 = new AnonymousClass1(continuation, (RealSignatureManager) obj2, 10);
                    anonymousClass16.L$0 = obj;
                    return anonymousClass16;
                case 11:
                    AnonymousClass1 anonymousClass17 = new AnonymousClass1(continuation, (SignoutSideEffectsPerformer) obj2, 11);
                    anonymousClass17.L$0 = obj;
                    return anonymousClass17;
                case 12:
                    AnonymousClass1 anonymousClass18 = new AnonymousClass1(continuation, (FavoriteUpsellRefresher) obj2, 12);
                    anonymousClass18.L$0 = obj;
                    return anonymousClass18;
                case 13:
                    return new AnonymousClass1((OkHttpCall.AnonymousClass1) obj2, continuation, 13);
                case 14:
                    AnonymousClass1 anonymousClass19 = new AnonymousClass1((RealFeatureFlagManager) obj2, continuation, 14);
                    anonymousClass19.L$0 = obj;
                    return anonymousClass19;
                case 15:
                    AnonymousClass1 anonymousClass110 = new AnonymousClass1((RealSessionFlags.SessionFlagKeyValue) obj2, continuation, 15);
                    anonymousClass110.L$0 = obj;
                    return anonymousClass110;
                case 16:
                    AnonymousClass1 anonymousClass111 = new AnonymousClass1(continuation, (PaymentActionNavigator) obj2, 16);
                    anonymousClass111.L$0 = obj;
                    return anonymousClass111;
                case 17:
                    return new AnonymousClass1((InitialScreenLoaderPresenter) this.L$0, (Flow) obj2, continuation, 17);
                case 18:
                    AnonymousClass1 anonymousClass112 = new AnonymousClass1((Instrument$Adapter) obj2, continuation, 18);
                    anonymousClass112.L$0 = obj;
                    return anonymousClass112;
                case 19:
                    AnonymousClass1 anonymousClass113 = new AnonymousClass1(continuation, (CdpConfigUpdateSetupTeardown) obj2, 19);
                    anonymousClass113.L$0 = obj;
                    return anonymousClass113;
                case 20:
                    AnonymousClass1 anonymousClass114 = new AnonymousClass1(continuation, (InvestingSetupTeardown) obj2, 20);
                    anonymousClass114.L$0 = obj;
                    return anonymousClass114;
                case 21:
                    AnonymousClass1 anonymousClass115 = new AnonymousClass1(continuation, (ClientSyncLocaleChangeIoSetupTeardown) obj2, 21);
                    anonymousClass115.L$0 = obj;
                    return anonymousClass115;
                case 22:
                    return new AnonymousClass1((CashAccountDatabaseImpl) this.L$0, (RealRegionProvider) obj2, continuation, 22);
                case 23:
                    AnonymousClass1 anonymousClass116 = new AnonymousClass1(continuation, (PromotedAppletTileLocaleChangeIoSetupTeardown) obj2, 23);
                    anonymousClass116.L$0 = obj;
                    return anonymousClass116;
                case 24:
                    return new AnonymousClass1((RealBugsnagClient) this.L$0, (VariantAppComponent) obj2, continuation, 24);
                case 25:
                    return new AnonymousClass1((StateFlow) this.L$0, (JankStatsAggregator) obj2, continuation, 25);
                case 26:
                    return new AnonymousClass1((KeyValue) this.L$0, (JankStatsAggregator) obj2, continuation, 26);
                case 27:
                    return new AnonymousClass1((QrShortcutsOnboardingAppStartWorker) obj2, continuation, 27);
                case 28:
                    AnonymousClass1 anonymousClass117 = new AnonymousClass1((SessionManager.DeletionMode) obj2, continuation, 28);
                    anonymousClass117.L$0 = obj;
                    return anonymousClass117;
                default:
                    AnonymousClass1 anonymousClass118 = new AnonymousClass1((String) obj2, continuation, 29);
                    anonymousClass118.L$0 = obj;
                    return anonymousClass118;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            switch (this.$r8$classId) {
                case 21:
                    ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                    break;
                case 23:
                    ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                    break;
                case 25:
                    ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                    break;
            }
            return ((AnonymousClass1) create((SessionManager) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:175:0x0355, code lost:
        
            if (r0.emit(r3, r21) == r2) goto L167;
         */
        /* JADX WARN: Code restructure failed: missing block: B:181:0x036f, code lost:
        
            if (r0.emit(r3, r21) == r2) goto L167;
         */
        /* JADX WARN: Code restructure failed: missing block: B:187:0x039d, code lost:
        
            if (r0 == r2) goto L167;
         */
        /* JADX WARN: Code restructure failed: missing block: B:189:0x0340, code lost:
        
            if (r4 == r2) goto L167;
         */
        /* JADX WARN: Code restructure failed: missing block: B:275:0x0519, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(r3, r13, r21) == r2) goto L245;
         */
        /* JADX WARN: Code restructure failed: missing block: B:277:0x0536, code lost:
        
            return r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00c4, code lost:
        
            if (r2.set(r4, r21) == r0) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:?, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:442:0x083d, code lost:
        
            if (r2 == r0) goto L397;
         */
        /* JADX WARN: Code restructure failed: missing block: B:446:0x0856, code lost:
        
            if (r2.invoke(r21) == r0) goto L397;
         */
        /* JADX WARN: Code restructure failed: missing block: B:450:?, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00ad, code lost:
        
            if (r3 == r0) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00a0, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.first(r2, r3, r21) == r0) goto L41;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:378:0x0856 -> B:373:0x0835). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            BufferedChannel.BufferedChannelIterator bufferedChannelIterator;
            Object obj2;
            Object bringIntoView;
            Object value;
            Object value2;
            InitialScreenLoader$TriggeredBy initialScreenLoader$TriggeredBy;
            Object access$isLinkedBanksRowVisible;
            KeyValue keyValue;
            Object obj3;
            int i = this.$r8$classId;
            int i2 = 11;
            int i3 = 15;
            int i4 = 10;
            int i5 = 26;
            int i6 = 3;
            int i7 = 0;
            int i8 = 2;
            Object obj4 = this.this$0;
            int i9 = 1;
            Unit unit = null;
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            boolean z8 = false;
            boolean z9 = false;
            switch (i) {
                case 0:
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i10 = this.label;
                    if (i10 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        BufferedChannel bufferedChannel = ((RealBoostSelector) obj4).requests;
                        bufferedChannel.getClass();
                        bufferedChannelIterator = bufferedChannel.new BufferedChannelIterator();
                    } else if (i10 == 1) {
                        BufferedChannel.BufferedChannelIterator bufferedChannelIterator2 = (BufferedChannel.BufferedChannelIterator) this.L$0;
                        SafeTrace.throwOnFailure(obj);
                        bufferedChannelIterator = bufferedChannelIterator2;
                        obj2 = obj;
                        if (!((Boolean) obj2).booleanValue()) {
                            return Unit.INSTANCE;
                        }
                        Function1 function1 = (Function1) bufferedChannelIterator.next();
                        this.L$0 = bufferedChannelIterator;
                        this.label = 2;
                        break;
                    } else {
                        if (i10 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        BufferedChannel.BufferedChannelIterator bufferedChannelIterator3 = (BufferedChannel.BufferedChannelIterator) this.L$0;
                        SafeTrace.throwOnFailure(obj);
                        bufferedChannelIterator = bufferedChannelIterator3;
                    }
                    this.L$0 = bufferedChannelIterator;
                    this.label = 1;
                    obj2 = bufferedChannelIterator.hasNext(this);
                    break;
                case 1:
                    RealBlockerFlowAnalytics realBlockerFlowAnalytics = (RealBlockerFlowAnalytics) obj4;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = this.label;
                    if (i11 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        ReadonlyStateFlow readonlyStateFlow = ((RealAppForegroundStateProvider) realBlockerFlowAnalytics.appForegroundStateProvider).appForegroundState;
                        RealBlockerFlowAnalytics$setup$1$1 realBlockerFlowAnalytics$setup$1$1 = RealBlockerFlowAnalytics$setup$1$1.INSTANCE;
                        SaversKt$$ExternalSyntheticLambda2 saversKt$$ExternalSyntheticLambda2 = FlowKt.defaultKeySelector;
                        TypeIntrinsics.beforeCheckcastToFunctionOfArity(2, realBlockerFlowAnalytics$setup$1$1);
                        DistinctFlowImpl distinctUntilChangedBy$FlowKt__DistinctKt = FlowKt.distinctUntilChangedBy$FlowKt__DistinctKt(readonlyStateFlow, saversKt$$ExternalSyntheticLambda2, realBlockerFlowAnalytics$setup$1$1);
                        RealRegionProvider$1$1$1 realRegionProvider$1$1$1 = new RealRegionProvider$1$1$1(realBlockerFlowAnalytics, i4);
                        this.L$0 = null;
                        this.label = 1;
                        Object collect = distinctUntilChangedBy$FlowKt__DistinctKt.collect(new Badger$collect$$inlined$map$1.AnonymousClass2(realRegionProvider$1$1$1, 9), this);
                        if (collect != coroutineSingletons2) {
                            collect = Unit.INSTANCE;
                        }
                        if (collect == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                    } else {
                        if (i11 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 2:
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i12 = this.label;
                    if (i12 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        if (((Boolean) ((MutableState) obj4).getValue()).booleanValue()) {
                            BringIntoViewRequesterImpl bringIntoViewRequesterImpl = (BringIntoViewRequesterImpl) this.L$0;
                            this.label = 1;
                            bringIntoView = bringIntoViewRequesterImpl.bringIntoView(null, this);
                            if (bringIntoView == coroutineSingletons3) {
                                return coroutineSingletons3;
                            }
                        }
                    } else {
                        if (i12 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 3:
                    CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i13 = this.label;
                    if (i13 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        ChannelAsFlow consumeAsFlow = FlowKt.consumeAsFlow((BufferedChannel) this.L$0);
                        RealRegionProvider$1$1$1 realRegionProvider$1$1$12 = new RealRegionProvider$1$1$1((RealClientSyncRequestExecutor) obj4, i2);
                        this.label = 1;
                        if (consumeAsFlow.collect(realRegionProvider$1$1$12, this) == coroutineSingletons4) {
                            return coroutineSingletons4;
                        }
                    } else {
                        if (i13 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 4:
                    CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i14 = this.label;
                    if (i14 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        ChannelAsFlow consumeAsFlow2 = FlowKt.consumeAsFlow((BufferedChannel) this.L$0);
                        RealRegionProvider$1$1$1 realRegionProvider$1$1$13 = new RealRegionProvider$1$1$1((RealClientSyncResponseProcessor) obj4, 12);
                        this.label = 1;
                        if (consumeAsFlow2.collect(realRegionProvider$1$1$13, this) == coroutineSingletons5) {
                            return coroutineSingletons5;
                        }
                    } else {
                        if (i14 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 5:
                    ZiplineHistoryDataJavaScripter ziplineHistoryDataJavaScripter = (ZiplineHistoryDataJavaScripter) obj4;
                    FlowCollector flowCollector = (FlowCollector) this.L$0;
                    CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i15 = this.label;
                    if (i15 != 0) {
                        if (i15 == 1) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    StateFlowImpl stateFlowImpl = ((RealTreehouseActivity) ziplineHistoryDataJavaScripter.treehouseActivity.invoke()).getTreehouseApp().codeHost.mutableZipline;
                    this.L$0 = null;
                    this.label = 1;
                    FlowKt.ensureActive(flowCollector);
                    stateFlowImpl.collect(new ZiplineHistoryDataJavaScripter$observable$1$invokeSuspend$$inlined$map$1$2(flowCollector, ziplineHistoryDataJavaScripter, 0), this);
                    return coroutineSingletons6;
                case 6:
                    CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i16 = this.label;
                    if (i16 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Flow flow = (Flow) this.L$0;
                        RealRegionProvider$1$1$1 realRegionProvider$1$1$14 = new RealRegionProvider$1$1$1((RealCustomerLimitsManager) obj4, i3);
                        this.label = 1;
                        if (flow.collect(realRegionProvider$1$1$14, this) == coroutineSingletons7) {
                            return coroutineSingletons7;
                        }
                    } else {
                        if (i16 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 7:
                    RealProfileSyncSetupTeardown realProfileSyncSetupTeardown = (RealProfileSyncSetupTeardown) obj4;
                    CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i17 = this.label;
                    if (i17 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        StateFlow sessionState = realProfileSyncSetupTeardown.sessionManager.getSessionState();
                        RealProfileSyncSetupTeardown$setup$1$2 realProfileSyncSetupTeardown$setup$1$2 = new RealProfileSyncSetupTeardown$setup$1$2(realProfileSyncSetupTeardown, z ? 1 : 0, i7);
                        this.L$0 = null;
                        this.label = 1;
                        if (StateFlowKt.doWhile(sessionState, RealProfileSyncSetupTeardown$setup$1$1.INSTANCE, realProfileSyncSetupTeardown$setup$1$2, this) == coroutineSingletons8) {
                            return coroutineSingletons8;
                        }
                    } else {
                        if (i17 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 8:
                    CdpConfigUpdateSetupTeardown cdpConfigUpdateSetupTeardown = (CdpConfigUpdateSetupTeardown) obj4;
                    Object obj5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i18 = this.label;
                    if (i18 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        if (((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) ((FeatureFlagManager) cdpConfigUpdateSetupTeardown.featureFlagManager)).peekCurrentValue(LaunchDarklyFeatureFlags$PlayIntegrityWarmUp.INSTANCE)).enabled()) {
                            RealDeviceIntegrity realDeviceIntegrity = (RealDeviceIntegrity) cdpConfigUpdateSetupTeardown.cdpConfigurationProvider;
                            this.L$0 = null;
                            this.label = 1;
                            Object withContext = JobKt.withContext(realDeviceIntegrity.ioContext, new RealDeviceIntegrity$ensureStandardTokenProviderInitialized$2(realDeviceIntegrity, null), this);
                            Object obj6 = withContext;
                            if (withContext != obj5) {
                                obj6 = Unit.INSTANCE;
                            }
                            if (obj6 == obj5) {
                                return obj5;
                            }
                        }
                    } else {
                        if (i18 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 9:
                    CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i19 = this.label;
                    if (i19 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        RealDdaManager realDdaManager = (RealDdaManager) ((EmptyTabProvider) obj4).tabPublisher;
                        this.L$0 = null;
                        this.label = 1;
                        if (realDdaManager.fetchDdaAccountDetails(this) == coroutineSingletons9) {
                            return coroutineSingletons9;
                        }
                    } else {
                        if (i19 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 10:
                    RealSignatureManager realSignatureManager = (RealSignatureManager) obj4;
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    Object obj7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i20 = this.label;
                    if (i20 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        DerivedStateFlow derivedStateFlow = ((SignedInStateManager) realSignatureManager.signedInStateManager).state;
                        DerivedStateFlow valuesState = Trace.valuesState(realSignatureManager.featureFlagManager, LaunchDarklyFeatureFlags$SecurityFetchSigningCertificates.INSTANCE);
                        FlowKt__ZipKt$combine$1$1 flowKt__ZipKt$combine$1$1 = new FlowKt__ZipKt$combine$1$1(realSignatureManager, coroutineScope, z3 ? 1 : 0, i9);
                        this.L$0 = null;
                        this.label = 1;
                        Object combineInternal = CombineKt.combineInternal(this, FlowKt__ZipKt$nullArrayFactory$1.INSTANCE, new FlowKt__ZipKt$combine$1$1((Function) flowKt__ZipKt$combine$1$1, (Continuation) (z2 ? 1 : 0), i7), NopCollector.INSTANCE, new Flow[]{derivedStateFlow, valuesState});
                        Object obj8 = combineInternal;
                        if (combineInternal != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            obj8 = Unit.INSTANCE;
                        }
                        Object obj9 = obj8;
                        if (obj8 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            obj9 = Unit.INSTANCE;
                        }
                        if (obj9 == obj7) {
                            return obj7;
                        }
                    } else {
                        if (i20 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 11:
                    SignoutSideEffectsPerformer signoutSideEffectsPerformer = (SignoutSideEffectsPerformer) obj4;
                    CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i21 = this.label;
                    if (i21 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 realBadger2$setup$lambda$0$$inlined$mapNotNull$1 = new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(((SyncValueReader) signoutSideEffectsPerformer.flowStarter).getSingleValue(AndroidSyncValueSpecs.FeatureEligibilityRefreshPolicy), 24);
                        EligibilityRefresherSetupTeardown$setup$1$1 eligibilityRefresherSetupTeardown$setup$1$1 = new EligibilityRefresherSetupTeardown$setup$1$1(signoutSideEffectsPerformer, null);
                        this.L$0 = null;
                        this.label = 1;
                        if (FlowKt.collectLatest(realBadger2$setup$lambda$0$$inlined$mapNotNull$1, eligibilityRefresherSetupTeardown$setup$1$1, this) == coroutineSingletons10) {
                            return coroutineSingletons10;
                        }
                    } else {
                        if (i21 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 12:
                    FavoriteUpsellRefresher favoriteUpsellRefresher = (FavoriteUpsellRefresher) obj4;
                    CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i22 = this.label;
                    if (i22 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        FlowKt__MergeKt$flatMapConcat$$inlined$map$1 flowKt__MergeKt$flatMapConcat$$inlined$map$1 = new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new CashApp$onCreate$4$1$1(favoriteUpsellRefresher, z4 ? 1 : 0, 20), new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(((RealPaymentManager) favoriteUpsellRefresher.paymentManager).paymentActions, 11));
                        RealRegionProvider$1$1$1 realRegionProvider$1$1$15 = new RealRegionProvider$1$1$1(favoriteUpsellRefresher, 17);
                        this.L$0 = null;
                        this.label = 1;
                        if (flowKt__MergeKt$flatMapConcat$$inlined$map$1.collect(realRegionProvider$1$1$15, this) == coroutineSingletons11) {
                            return coroutineSingletons11;
                        }
                    } else {
                        if (i22 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 13:
                    CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i23 = this.label;
                    try {
                        if (i23 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            MainContainerDelegate$special$$inlined$map$1 mainContainerDelegate$special$$inlined$map$1 = new MainContainerDelegate$special$$inlined$map$1(((RealFeatureFlagManager) ((OkHttpCall.AnonymousClass1) obj4).val$callback).values(AmplitudeExperiments$ClientHapticsImprovements.INSTANCE), i9);
                            FocusableNode$focusTargetNode$1 focusableNode$focusTargetNode$1 = new FocusableNode$focusTargetNode$1(2, InternalArcadeFlagsHolder.INSTANCE, InternalArcadeFlagsHolder.class, "set", "set(Lcom/squareup/cash/arcade/internalflags/InternalArcadeFlags;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 2);
                            this.label = 1;
                            break;
                        } else {
                            if (i23 != 1) {
                                if (i23 != 2) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                CancellationException cancellationException = (CancellationException) this.L$0;
                                SafeTrace.throwOnFailure(obj);
                                throw cancellationException;
                            }
                            SafeTrace.throwOnFailure(obj);
                        }
                        unit = Unit.INSTANCE;
                        return unit;
                    } catch (CancellationException e) {
                        InternalArcadeFlagsHolder internalArcadeFlagsHolder = InternalArcadeFlagsHolder.INSTANCE;
                        this.L$0 = e;
                        this.label = 2;
                        StateFlowImpl stateFlowImpl2 = InternalArcadeFlagsHolder.mutableFlags;
                        stateFlowImpl2.getClass();
                        stateFlowImpl2.updateState(unit, InternalArcadeFlags.Default);
                        Unit unit2 = Unit.INSTANCE;
                        CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        if (unit2 != coroutineSingletons12) {
                            throw e;
                        }
                    }
                    break;
                case 14:
                    RealFeatureFlagManager realFeatureFlagManager = (RealFeatureFlagManager) obj4;
                    StateFlowImpl stateFlowImpl3 = realFeatureFlagManager.syncStatus;
                    Pair pair = (Pair) this.L$0;
                    Object obj10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i24 = this.label;
                    if (i24 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        String str = (String) pair.first;
                        String str2 = (String) pair.second;
                        if (str.length() <= 0 && str2 == null) {
                            do {
                                value2 = stateFlowImpl3.getValue();
                            } while (!stateFlowImpl3.compareAndSet(value2, RealFeatureFlagManager.SyncStatus.NOT_STARTED));
                        } else {
                            do {
                                value = stateFlowImpl3.getValue();
                            } while (!stateFlowImpl3.compareAndSet(value, RealFeatureFlagManager.SyncStatus.IN_PROGRESS));
                            this.L$0 = null;
                            this.label = 1;
                            Object withContext2 = JobKt.withContext(realFeatureFlagManager.ioContext, new GooglePayPresenter$models$1$1(realFeatureFlagManager, z5 ? 1 : 0, i5), this);
                            Object obj11 = withContext2;
                            if (withContext2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                obj11 = Unit.INSTANCE;
                            }
                            if (obj11 == obj10) {
                                return obj10;
                            }
                        }
                    } else {
                        if (i24 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 15:
                    FeatureFlag$Option featureFlag$Option = (FeatureFlag$Option) this.L$0;
                    CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i25 = this.label;
                    if (i25 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        String identifier = featureFlag$Option.getIdentifier();
                        this.L$0 = null;
                        this.label = 1;
                        if (((RealSessionFlags.SessionFlagKeyValue) obj4).$$delegate_0.set(identifier, this) == coroutineSingletons14) {
                            return coroutineSingletons14;
                        }
                    } else {
                        if (i25 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 16:
                    PaymentActionNavigator paymentActionNavigator = (PaymentActionNavigator) obj4;
                    CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i26 = this.label;
                    if (i26 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        RealRouter create$1 = paymentActionNavigator.routerFactory.create$1(paymentActionNavigator.navigator);
                        SafeFlow safeFlow = new SafeFlow(new DataStoreImpl$data$1((Flow) ((RealPaymentManager) paymentActionNavigator.paymentManager).paymentActions, (Continuation) (z6 ? 1 : 0), (Object) paymentActionNavigator, i5));
                        CashCdpConfigProvider$1$2 cashCdpConfigProvider$1$2 = new CashCdpConfigProvider$1$2(18, paymentActionNavigator, create$1);
                        this.L$0 = null;
                        this.label = 1;
                        if (safeFlow.collect(cashCdpConfigProvider$1$2, this) == coroutineSingletons15) {
                            return coroutineSingletons15;
                        }
                    } else {
                        if (i26 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 17:
                    InitialScreenLoaderPresenter initialScreenLoaderPresenter = (InitialScreenLoaderPresenter) this.L$0;
                    CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i27 = this.label;
                    if (i27 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        InitialScreenPlaceholder.TriggeredBy triggeredBy = initialScreenLoaderPresenter.screen.triggeredBy;
                        RealInitialScreenLoader realInitialScreenLoader = (RealInitialScreenLoader) initialScreenLoaderPresenter.initialScreenLoader$delegate.getValue();
                        if (triggeredBy instanceof InitialScreenPlaceholder.TriggeredBy.ActivityLaunch) {
                            initialScreenLoader$TriggeredBy = new InitialScreenLoader$TriggeredBy.ActivityLaunch(((InitialScreenPlaceholder.TriggeredBy.ActivityLaunch) triggeredBy).launchingIntent);
                        } else {
                            if (!(triggeredBy instanceof InitialScreenPlaceholder.TriggeredBy.SignOut)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            initialScreenLoader$TriggeredBy = InitialScreenLoader$TriggeredBy.SignOut.INSTANCE;
                        }
                        InitialScreenLoaderPresenter$models$1$1$1 initialScreenLoaderPresenter$models$1$1$1 = new InitialScreenLoaderPresenter$models$1$1$1(initialScreenLoaderPresenter, (Flow) obj4, (Continuation) null);
                        this.label = 1;
                        if (realInitialScreenLoader.loadInitialScreen(initialScreenLoader$TriggeredBy, initialScreenLoaderPresenter$models$1$1$1, this) == coroutineSingletons16) {
                            return coroutineSingletons16;
                        }
                    } else {
                        if (i27 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 18:
                    Instrument$Adapter instrument$Adapter = (Instrument$Adapter) obj4;
                    FlowCollector flowCollector2 = (FlowCollector) this.L$0;
                    CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i28 = this.label;
                    if (i28 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.L$0 = flowCollector2;
                        this.label = 1;
                        access$isLinkedBanksRowVisible = Instrument$Adapter.access$isLinkedBanksRowVisible(instrument$Adapter, this);
                        break;
                    } else {
                        if (i28 != 1) {
                            if (i28 == 2) {
                                SafeTrace.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            if (i28 == 3) {
                                SafeTrace.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            if (i28 == 4) {
                                SafeTrace.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        access$isLinkedBanksRowVisible = obj;
                    }
                    if (!((Boolean) access$isLinkedBanksRowVisible).booleanValue()) {
                        Boolean bool = Boolean.FALSE;
                        this.L$0 = null;
                        this.label = 2;
                        break;
                    } else if (!((BooleanPreference) instrument$Adapter.card_brandAdapter).get()) {
                        RealInstrumentManager realInstrumentManager = (RealInstrumentManager) instrument$Adapter.cash_instrument_typeAdapter;
                        Flow runUntil = StateFlowKt.runUntil(RealInstrumentManager.syncValueBased$default(realInstrumentManager), realInstrumentManager.signOut);
                        this.L$0 = null;
                        this.label = 4;
                        FlowKt.ensureActive(flowCollector2);
                        Object collect2 = runUntil.collect(new RealFeatureFlagManager$values$$inlined$map$1.AnonymousClass2(flowCollector2, instrument$Adapter, i3), this);
                        if (collect2 != coroutineSingletons17) {
                            collect2 = Unit.INSTANCE;
                        }
                        if (collect2 != coroutineSingletons17) {
                            collect2 = Unit.INSTANCE;
                            break;
                        }
                    } else {
                        Boolean bool2 = Boolean.FALSE;
                        this.L$0 = null;
                        this.label = 3;
                        break;
                    }
                    return coroutineSingletons17;
                case 19:
                    CdpConfigUpdateSetupTeardown cdpConfigUpdateSetupTeardown2 = (CdpConfigUpdateSetupTeardown) obj4;
                    CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i29 = this.label;
                    if (i29 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        ChannelAsFlow receiveAsFlow = FlowKt.receiveAsFlow(((AppAnalyticsQueue) cdpConfigUpdateSetupTeardown2.featureFlagManager).eventQueue);
                        RealRegionProvider$1$1$1 realRegionProvider$1$1$16 = new RealRegionProvider$1$1$1(cdpConfigUpdateSetupTeardown2, 21);
                        this.L$0 = null;
                        this.label = 1;
                        if (receiveAsFlow.collect(realRegionProvider$1$1$16, this) == coroutineSingletons18) {
                            return coroutineSingletons18;
                        }
                    } else {
                        if (i29 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 20:
                    InvestingSetupTeardown investingSetupTeardown = (InvestingSetupTeardown) obj4;
                    CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i30 = this.label;
                    if (i30 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        InvestmentEntityQueries investmentEntityQueries = investingSetupTeardown.database.investmentHoldingQueries;
                        investmentEntityQueries.getClass();
                        InvestmentHoldingQueries$tokensToStates$2 investmentHoldingQueries$tokensToStates$2 = InvestmentHoldingQueries$tokensToStates$2.INSTANCE;
                        SqlDriver sqlDriver = investmentEntityQueries.driver;
                        StorageLinkQueries$$ExternalSyntheticLambda8 storageLinkQueries$$ExternalSyntheticLambda8 = new StorageLinkQueries$$ExternalSyntheticLambda8(investmentEntityQueries);
                        sqlDriver.getClass();
                        Flow distinctUntilChanged = FlowKt.distinctUntilChanged(DBUtil.mapToList(DBUtil.toFlow(new SimpleQuery(2120917324, new String[]{"investment_holding"}, sqlDriver, "InvestmentHolding.sq", "tokensToStates", "SELECT token, state\nFROM investment_holding", storageLinkQueries$$ExternalSyntheticLambda8)), investingSetupTeardown.ioDispatcher));
                        RealRegionProvider$1$1$1 realRegionProvider$1$1$17 = new RealRegionProvider$1$1$1(investingSetupTeardown, 23);
                        this.L$0 = null;
                        this.label = 1;
                        if (distinctUntilChanged.collect(realRegionProvider$1$1$17, this) == coroutineSingletons19) {
                            return coroutineSingletons19;
                        }
                    } else {
                        if (i30 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 21:
                    CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i31 = this.label;
                    if (i31 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        ClientSyncLocaleChangeIoSetupTeardown clientSyncLocaleChangeIoSetupTeardown = (ClientSyncLocaleChangeIoSetupTeardown) obj4;
                        ReadonlyStateFlow readonlyStateFlow2 = clientSyncLocaleChangeIoSetupTeardown.localeManager.resolvedLocale;
                        RealRegionProvider$1$1$1 realRegionProvider$1$1$18 = new RealRegionProvider$1$1$1(clientSyncLocaleChangeIoSetupTeardown, i5);
                        this.L$0 = null;
                        this.label = 1;
                        if (readonlyStateFlow2.$$delegate_0.collect(realRegionProvider$1$1$18, this) == coroutineSingletons20) {
                            return coroutineSingletons20;
                        }
                    } else {
                        if (i31 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    OptionalProvider$$ExternalSyntheticLambda0.m$1();
                    return null;
                case 22:
                    RealRegionProvider realRegionProvider = (RealRegionProvider) obj4;
                    CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i32 = this.label;
                    if (i32 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        FlowQuery$mapToList$$inlined$map$1 mapToOneNotNull = DBUtil.mapToOneNotNull(DBUtil.toFlow(((CashAccountDatabaseImpl) this.L$0).profileQueries.selectRegion()), realRegionProvider.ioDispatcher);
                        RealGcmRegistrar$unregister$2 realGcmRegistrar$unregister$2 = new RealGcmRegistrar$unregister$2((Object) realRegionProvider, (Continuation) (z7 ? 1 : 0), 22);
                        this.label = 1;
                        if (FlowKt.collectLatest(mapToOneNotNull, realGcmRegistrar$unregister$2, this) == coroutineSingletons21) {
                            return coroutineSingletons21;
                        }
                    } else {
                        if (i32 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 23:
                    CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i33 = this.label;
                    if (i33 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        PromotedAppletTileLocaleChangeIoSetupTeardown promotedAppletTileLocaleChangeIoSetupTeardown = (PromotedAppletTileLocaleChangeIoSetupTeardown) obj4;
                        ReadonlyStateFlow readonlyStateFlow3 = promotedAppletTileLocaleChangeIoSetupTeardown.localeManager.resolvedLocale;
                        RealRegionProvider$1$1$1 realRegionProvider$1$1$19 = new RealRegionProvider$1$1$1(promotedAppletTileLocaleChangeIoSetupTeardown, 28);
                        this.L$0 = null;
                        this.label = 1;
                        if (readonlyStateFlow3.$$delegate_0.collect(realRegionProvider$1$1$19, this) == coroutineSingletons22) {
                            return coroutineSingletons22;
                        }
                    } else {
                        if (i33 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    OptionalProvider$$ExternalSyntheticLambda0.m$1();
                    return null;
                case 24:
                    RealBugsnagClient realBugsnagClient = (RealBugsnagClient) this.L$0;
                    CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i34 = this.label;
                    if (i34 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        if (realBugsnagClient.hasSetUpAdditionalMetadata) {
                            a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
                            return null;
                        }
                        realBugsnagClient.hasSetUpAdditionalMetadata = true;
                        VariantAppComponent.Impl impl = (VariantAppComponent.Impl) ((VariantAppComponent) obj4);
                        realBugsnagClient.context = impl.applicationInstance;
                        ThrowableScribe throwableScribe = (ThrowableScribe) impl.weakThrowableScribeProvider.getValue();
                        throwableScribe.getClass();
                        realBugsnagClient.throwableScribe = throwableScribe;
                        Analytics analytics = (Analytics) impl.appAnalyticsQueueProvider.getValue();
                        analytics.getClass();
                        realBugsnagClient.analytics = analytics;
                        Timber.Forest.i("Setting up FeatureError handling", new Object[0]);
                        RealBugsnagClient$Companion$$ExternalSyntheticLambda0 realBugsnagClient$Companion$$ExternalSyntheticLambda0 = new RealBugsnagClient$Companion$$ExternalSyntheticLambda0(realBugsnagClient, i9);
                        CallbackState callbackState = Bugsnag.getClient().callbackState;
                        if (callbackState.onErrorTasks.add(realBugsnagClient$Companion$$ExternalSyntheticLambda0)) {
                            callbackState.internalMetrics.notifyAddCallback("onError");
                        }
                        DefaultScheduler defaultScheduler = Dispatchers.Default;
                        DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
                        CashApp$onCreate$1 cashApp$onCreate$1 = new CashApp$onCreate$1(realBugsnagClient, z8 ? 1 : 0, 6);
                        this.label = 1;
                        if (JobKt.withContext(defaultIoScheduler, cashApp$onCreate$1, this) == coroutineSingletons23) {
                            return coroutineSingletons23;
                        }
                    } else {
                        if (i34 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    RealBugsnagClient$Companion$$ExternalSyntheticLambda0 realBugsnagClient$Companion$$ExternalSyntheticLambda02 = new RealBugsnagClient$Companion$$ExternalSyntheticLambda0(realBugsnagClient, i8);
                    CallbackState callbackState2 = Bugsnag.getClient().callbackState;
                    if (callbackState2.onErrorTasks.add(realBugsnagClient$Companion$$ExternalSyntheticLambda02)) {
                        callbackState2.internalMetrics.notifyAddCallback("onError");
                    }
                    return Unit.INSTANCE;
                case 25:
                    CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i35 = this.label;
                    if (i35 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        StateFlow stateFlow = (StateFlow) this.L$0;
                        JankStatsAggregator$1$1 jankStatsAggregator$1$1 = new JankStatsAggregator$1$1((JankStatsAggregator) obj4, i7);
                        this.label = 1;
                        if (stateFlow.collect(jankStatsAggregator$1$1, this) == coroutineSingletons24) {
                            return coroutineSingletons24;
                        }
                    } else {
                        if (i35 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    OptionalProvider$$ExternalSyntheticLambda0.m$1();
                    return null;
                case 26:
                    CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i36 = this.label;
                    if (i36 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Flow observe = ((KeyValue) this.L$0).observe();
                        JankStatsAggregator$1$1 jankStatsAggregator$1$12 = new JankStatsAggregator$1$1((JankStatsAggregator) obj4, i6);
                        this.label = 1;
                        if (observe.collect(jankStatsAggregator$1$12, this) == coroutineSingletons25) {
                            return coroutineSingletons25;
                        }
                    } else {
                        if (i36 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 27:
                    QrShortcutsOnboardingAppStartWorker qrShortcutsOnboardingAppStartWorker = (QrShortcutsOnboardingAppStartWorker) obj4;
                    CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i37 = this.label;
                    if (i37 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        ReadonlyStateFlow readonlyStateFlow4 = ((RealAppForegroundStateProvider) qrShortcutsOnboardingAppStartWorker.appForegroundStateProvider).appForegroundState;
                        Recomposer$join$2 recomposer$join$2 = new Recomposer$join$2(i8, z9 ? 1 : 0, i4);
                        this.label = 1;
                        break;
                    } else if (i37 == 1) {
                        SafeTrace.throwOnFailure(obj);
                    } else if (i37 == 2) {
                        keyValue = (KeyValue) this.L$0;
                        SafeTrace.throwOnFailure(obj);
                        obj3 = obj;
                        Integer num = new Integer(((Number) obj3).intValue() + 1);
                        this.L$0 = null;
                        this.label = 3;
                        break;
                    } else {
                        if (i37 == 3) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    keyValue = qrShortcutsOnboardingAppStartWorker.appStarts;
                    this.L$0 = keyValue;
                    this.label = 2;
                    obj3 = keyValue.get(this);
                    break;
                case 28:
                    SessionManager sessionManager = (SessionManager) this.L$0;
                    CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i38 = this.label;
                    if (i38 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.L$0 = null;
                        this.label = 1;
                        if (sessionManager.delete((SessionManager.DeletionMode) obj4, this) == coroutineSingletons27) {
                            return coroutineSingletons27;
                        }
                    } else {
                        if (i38 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                default:
                    SessionManager sessionManager2 = (SessionManager) this.L$0;
                    CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i39 = this.label;
                    if (i39 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.L$0 = null;
                        this.label = 1;
                        if (sessionManager2.updateAppToken((String) obj4, this) == coroutineSingletons28) {
                            return coroutineSingletons28;
                        }
                    } else {
                        if (i39 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(Object obj, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(Continuation continuation, Object obj, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.this$0 = obj;
        }
    }

    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId = 2;
        public final Provider analytics;
        public final Provider blockersNavigator;
        public final DoubleCheck boostProvider;
        public final Provider boostSyncer;
        public final Provider flowStarter;
        public final Provider franklinAppService;
        public final Provider ioContext;
        public final InstanceFactory scope;
        public final Provider stringManager;

        public MetroFactory(AndroidClock.MetroFactory metroFactory, DoubleCheck doubleCheck, NoOpNotifierAppModule$ProvideUserJourneyNotifierMetroFactory noOpNotifierAppModule$ProvideUserJourneyNotifierMetroFactory, DoubleCheck doubleCheck2, InstanceFactory instanceFactory, RealFilamentSupportProvider.MetroFactory metroFactory2, AppMessageSyncer.MetroFactory metroFactory3, RealCashVibrator.MetroFactory metroFactory4, DoubleCheck doubleCheck3) {
            this.franklinAppService = metroFactory;
            this.boostProvider = doubleCheck;
            this.stringManager = noOpNotifierAppModule$ProvideUserJourneyNotifierMetroFactory;
            this.flowStarter = doubleCheck2;
            this.scope = instanceFactory;
            this.blockersNavigator = metroFactory2;
            this.boostSyncer = metroFactory3;
            this.analytics = metroFactory4;
            this.ioContext = doubleCheck3;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            Provider provider = this.ioContext;
            Provider provider2 = this.analytics;
            Provider provider3 = this.boostSyncer;
            Provider provider4 = this.blockersNavigator;
            InstanceFactory instanceFactory = this.scope;
            Provider provider5 = this.flowStarter;
            Provider provider6 = this.stringManager;
            DoubleCheck doubleCheck = this.boostProvider;
            Provider provider7 = this.franklinAppService;
            switch (i) {
                case 0:
                    CoroutineScope coroutineScope = (CoroutineScope) instanceFactory.value;
                    AppService appService = (AppService) provider7.invoke();
                    AndroidStringManager androidStringManager = (AndroidStringManager) provider6.invoke();
                    FlowStarter flowStarter = (FlowStarter) provider5.invoke();
                    BlockersDataNavigator blockersDataNavigator = (BlockersDataNavigator) provider4.invoke();
                    RealBoostProvider realBoostProvider = (RealBoostProvider) doubleCheck.getValue();
                    BoostSyncer boostSyncer = (BoostSyncer) provider3.invoke();
                    Analytics analytics = (Analytics) provider2.invoke();
                    CoroutineContext coroutineContext = (CoroutineContext) provider.invoke();
                    coroutineScope.getClass();
                    appService.getClass();
                    androidStringManager.getClass();
                    flowStarter.getClass();
                    blockersDataNavigator.getClass();
                    realBoostProvider.getClass();
                    boostSyncer.getClass();
                    analytics.getClass();
                    coroutineContext.getClass();
                    return new RealBoostSelector(coroutineScope, appService, androidStringManager, flowStarter, blockersDataNavigator, realBoostProvider, boostSyncer, analytics, coroutineContext);
                case 1:
                    CoroutineScope coroutineScope2 = (CoroutineScope) instanceFactory.value;
                    SupportChatApi supportChatApi = (SupportChatApi) provider7.invoke();
                    CoroutineContext coroutineContext2 = (CoroutineContext) provider6.invoke();
                    AndroidClock androidClock = (AndroidClock) provider5.invoke();
                    RealUuidGenerator realUuidGenerator = (RealUuidGenerator) provider4.invoke();
                    Analytics analytics2 = (Analytics) provider3.invoke();
                    RealFileUploadService realFileUploadService = (RealFileUploadService) provider2.invoke();
                    TransactionBodyResolver transactionBodyResolver = (TransactionBodyResolver) provider.invoke();
                    RealRecordedMessagesStore realRecordedMessagesStore = (RealRecordedMessagesStore) doubleCheck.getValue();
                    coroutineScope2.getClass();
                    supportChatApi.getClass();
                    coroutineContext2.getClass();
                    androidClock.getClass();
                    realUuidGenerator.getClass();
                    analytics2.getClass();
                    realFileUploadService.getClass();
                    transactionBodyResolver.getClass();
                    realRecordedMessagesStore.getClass();
                    return new RealPendingMessagesStore(coroutineScope2, supportChatApi, coroutineContext2, androidClock, realUuidGenerator, analytics2, realFileUploadService, transactionBodyResolver, realRecordedMessagesStore);
                default:
                    AndroidClock androidClock2 = (AndroidClock) provider7.invoke();
                    RealUserJourneyRepository realUserJourneyRepository = (RealUserJourneyRepository) doubleCheck.getValue();
                    NoOpUserJourneyNotifier noOpUserJourneyNotifier = (NoOpUserJourneyNotifier) provider6.invoke();
                    AppForegroundStateProvider appForegroundStateProvider = (AppForegroundStateProvider) provider5.invoke();
                    BugsnagClient bugsnagClient = (BugsnagClient) instanceFactory.value;
                    RealJourneyRequestContextProvider realJourneyRequestContextProvider = (RealJourneyRequestContextProvider) provider4.invoke();
                    ErrorReporter errorReporter = (ErrorReporter) provider3.invoke();
                    RealObservabilityMetadataLogger realObservabilityMetadataLogger = (RealObservabilityMetadataLogger) provider2.invoke();
                    CoroutineScope coroutineScope3 = (CoroutineScope) provider.invoke();
                    androidClock2.getClass();
                    realUserJourneyRepository.getClass();
                    noOpUserJourneyNotifier.getClass();
                    appForegroundStateProvider.getClass();
                    bugsnagClient.getClass();
                    realJourneyRequestContextProvider.getClass();
                    errorReporter.getClass();
                    realObservabilityMetadataLogger.getClass();
                    coroutineScope3.getClass();
                    return new RealUserJourneySignalProcessor(androidClock2, realUserJourneyRepository, noOpUserJourneyNotifier, appForegroundStateProvider, bugsnagClient, realJourneyRequestContextProvider, errorReporter, realObservabilityMetadataLogger, coroutineScope3);
            }
        }

        public MetroFactory(InstanceFactory instanceFactory, RealAppMessageManager.MetroFactory metroFactory, LambdaProvider lambdaProvider, LambdaProvider lambdaProvider2, LambdaProvider lambdaProvider3, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, WalletUiFactory$MetroFactory walletUiFactory$MetroFactory, DoubleCheck doubleCheck3) {
            this.scope = instanceFactory;
            this.franklinAppService = metroFactory;
            this.stringManager = lambdaProvider;
            this.flowStarter = lambdaProvider2;
            this.blockersNavigator = lambdaProvider3;
            this.boostSyncer = doubleCheck;
            this.analytics = doubleCheck2;
            this.ioContext = walletUiFactory$MetroFactory;
            this.boostProvider = doubleCheck3;
        }

        public MetroFactory(InstanceFactory instanceFactory, DoubleCheck doubleCheck, LambdaProvider lambdaProvider, DoubleCheck doubleCheck2, RealBrazeManager.MetroFactory metroFactory, DoubleCheck doubleCheck3, DoubleCheck doubleCheck4, DoubleCheck doubleCheck5, LambdaProvider lambdaProvider2) {
            this.scope = instanceFactory;
            this.franklinAppService = doubleCheck;
            this.stringManager = lambdaProvider;
            this.flowStarter = doubleCheck2;
            this.blockersNavigator = metroFactory;
            this.boostProvider = doubleCheck3;
            this.boostSyncer = doubleCheck4;
            this.analytics = doubleCheck5;
            this.ioContext = lambdaProvider2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object trackOfferUpdateComplete(String str, ApiResult apiResult, OfferUpdateType offerUpdateType, ContinuationImpl continuationImpl) {
        RealBoostSelector$trackOfferUpdateComplete$2 realBoostSelector$trackOfferUpdateComplete$2;
        int i;
        OfferRequestStatus offerRequestStatus;
        Analytics analytics;
        if (continuationImpl instanceof RealBoostSelector$trackOfferUpdateComplete$2) {
            realBoostSelector$trackOfferUpdateComplete$2 = (RealBoostSelector$trackOfferUpdateComplete$2) continuationImpl;
            int i2 = realBoostSelector$trackOfferUpdateComplete$2.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realBoostSelector$trackOfferUpdateComplete$2.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realBoostSelector$trackOfferUpdateComplete$2.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realBoostSelector$trackOfferUpdateComplete$2.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (apiResult instanceof ApiResult.Failure.HttpFailure) {
                        offerRequestStatus = OfferRequestStatus.LOGICAL_ERROR;
                    } else if (apiResult instanceof ApiResult.Failure.NetworkFailure) {
                        offerRequestStatus = OfferRequestStatus.NETWORK_ERROR;
                    } else {
                        if (!(apiResult instanceof ApiResult.Success)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        offerRequestStatus = OfferRequestStatus.SUCCESS;
                    }
                    realBoostSelector$trackOfferUpdateComplete$2.L$0 = str;
                    realBoostSelector$trackOfferUpdateComplete$2.L$2 = offerUpdateType;
                    realBoostSelector$trackOfferUpdateComplete$2.L$3 = offerRequestStatus;
                    Analytics analytics2 = this.analytics;
                    realBoostSelector$trackOfferUpdateComplete$2.L$4 = analytics2;
                    realBoostSelector$trackOfferUpdateComplete$2.label = 1;
                    Object offerToken = getOfferToken(str, realBoostSelector$trackOfferUpdateComplete$2);
                    if (offerToken == obj2) {
                        return obj2;
                    }
                    obj = offerToken;
                    analytics = analytics2;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    analytics = realBoostSelector$trackOfferUpdateComplete$2.L$4;
                    OfferRequestStatus offerRequestStatus2 = realBoostSelector$trackOfferUpdateComplete$2.L$3;
                    offerUpdateType = realBoostSelector$trackOfferUpdateComplete$2.L$2;
                    String str2 = realBoostSelector$trackOfferUpdateComplete$2.L$0;
                    SafeTrace.throwOnFailure(obj);
                    offerRequestStatus = offerRequestStatus2;
                    str = str2;
                }
                AppLocation appLocation = AppLocation.Browser;
                analytics.track(new OffersUpdateComplete((String) obj, str, offerUpdateType, offerRequestStatus), null);
                return Unit.INSTANCE;
            }
        }
        realBoostSelector$trackOfferUpdateComplete$2 = new RealBoostSelector$trackOfferUpdateComplete$2(this, continuationImpl);
        Object obj3 = realBoostSelector$trackOfferUpdateComplete$2.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realBoostSelector$trackOfferUpdateComplete$2.label;
        if (i != 0) {
        }
        AppLocation appLocation2 = AppLocation.Browser;
        analytics.track(new OffersUpdateComplete((String) obj3, str, offerUpdateType, offerRequestStatus), null);
        return Unit.INSTANCE;
    }
}
