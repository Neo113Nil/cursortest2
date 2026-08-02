package app.cash.badging.backend;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.datastore.core.DataStoreImpl$data$1;
import androidx.lifecycle.Lifecycle;
import androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1;
import androidx.room.util.DBUtil;
import app.cash.api.ApiResult;
import app.cash.badging.api.Badger2;
import app.cash.badging.backend.BadgerError;
import app.cash.local.backend.BuyerIntentManager;
import app.cash.local.backend.real.BuyerIntentSyncManager;
import app.cash.local.backend.real.CalculateLineItemsManager;
import app.cash.local.backend.real.RealCartBuilderManager;
import app.cash.local.backend.real.RealLocalBrandRepository;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.local.navigation.api.RealCashLocalNavigatorHelper;
import app.cash.local.primitives.MarketingMessageBadging;
import app.cash.local.service.LocalService;
import app.cash.local.views.LocalViewFactory;
import app.cash.molecule.PlatformKt;
import app.cash.passcode.backend.RealAppLockState;
import app.cash.passcode.flows.RealPasscodeFlowStarter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.ComponentRegistry;
import coil3.Extras;
import coil3.RealImageLoader;
import com.fillr.featuretoggle.UnleashContext;
import com.google.crypto.tink.KeysetHandle;
import com.nimbusds.jose.jca.JCAContext;
import com.squareup.cash.activity.backend.loader.RealActivitiesCacheManager;
import com.squareup.cash.activity.presenters.DefaultActivityItemEventHandler$Factory$Impl;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter$Factory$Impl;
import com.squareup.cash.appmessages.AppMessageSyncer;
import com.squareup.cash.arcade.ArcadeModule$ProvideHapticVibratorMetroFactory;
import com.squareup.cash.attribution.DeferredDeepLinkStateModule$Companion$$ExternalSyntheticLambda0;
import com.squareup.cash.attribution.ProductionAttributionEventEmitter;
import com.squareup.cash.attribution.deeplink.DeepLinkCompletableNavigator;
import com.squareup.cash.attribution.deeplink.RealDeepLinkAttributionWorker;
import com.squareup.cash.badging.db.BadgeCountQueries$ForGroupQuery;
import com.squareup.cash.bitcoin.formatter.RealBitcoinFormatter;
import com.squareup.cash.blockers.analytics.RealFlowTokenGenerator;
import com.squareup.cash.blockers.flowlistener.BlockerFlowListener;
import com.squareup.cash.blockers.treehouse.TreehouseFlows;
import com.squareup.cash.braze.RealBrazeConfigurator;
import com.squareup.cash.clientsync.CustomerStreamingSubscriber;
import com.squareup.cash.clientsync.RealExponentialBackoff;
import com.squareup.cash.clientsync.errors.RealClientSyncErrorReporter;
import com.squareup.cash.clientsync.flags.RealClientSyncFlags;
import com.squareup.cash.clientsync.logging.RealClientSyncLogger;
import com.squareup.cash.clientsync.persistence.ClientSyncTransactor;
import com.squareup.cash.clientsync.persistence.FlaggedSyncEntityStore;
import com.squareup.cash.clientsync.persistence.SqlComponentMigrationStore;
import com.squareup.cash.clientsync.persistence.SyncEntityStore;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.clientsync.syncer.RealClientSyncer;
import com.squareup.cash.clipboard.RealClipboardObserver;
import com.squareup.cash.crypto.address.RealCryptoInvoiceParser;
import com.squareup.cash.crypto.backend.profile.RealBitcoinProfileRepo;
import com.squareup.cash.crypto.navigation.CryptoFlowStarter;
import com.squareup.cash.data.TemporaryStorage;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealBlockersDescriptorNavigator;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.profile.RealJurisdictionConfigManager;
import com.squareup.cash.db.StorageLinkQueries$$ExternalSyntheticLambda8;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.e2ee.trifle.RealTrifleService;
import com.squareup.cash.eligibility.backend.real.RealFeatureEligibilityRepository;
import com.squareup.cash.family.activity.presenters.FamilySharedActivityCache$Factory$Impl;
import com.squareup.cash.family.familyhub.backend.real.RealDependentCustomerTokenRepository;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealSessionFlags;
import com.squareup.cash.fillr.real.FillrInitializer;
import com.squareup.cash.gcl.RealGlobalConfigManager;
import com.squareup.cash.growtools.presenters.manager.activity.GrowToolsActivityItemEventDecorator$Factory$Impl;
import com.squareup.cash.growtools.presenters.manager.activity.GrowToolsActivitySearchRequestHandler$Factory$Impl;
import com.squareup.cash.growtools.presenters.manager.activity.RealGrowToolsActivityPresenterFactory;
import com.squareup.cash.history.backend.real.RealLegacyActivityEntityManager;
import com.squareup.cash.instruments.backend.real.RealBalanceSnapshotManager;
import com.squareup.cash.instruments.backend.real.RealInstrumentManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.keystore.AttestedKeyService;
import com.squareup.cash.money.navigation.real.RealMoneyNavigatorHelper;
import com.squareup.cash.money.views.MoneyUiFactory;
import com.squareup.cash.mri.android.RealMRIFactory;
import com.squareup.cash.mri.android.RealSignalsCollector;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.observability.backend.real.sampling.FeatureFlaggedSamplingStrategy$Factory$Impl;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.paymentpad.presenters.RealLowDiskSpaceAlertManager;
import com.squareup.cash.payments.RealPaymentInitiator;
import com.squareup.cash.payments.backend.api.OfflineManager;
import com.squareup.cash.payments.common.RealPaymentListener;
import com.squareup.cash.payments.presenters.RealBitcoinPaymentManager;
import com.squareup.cash.pools.presenters.PoolsPresenterFactory;
import com.squareup.cash.profile.views.AddAliasSheet$Factory$Impl;
import com.squareup.cash.profile.views.AppMessagesOptionsView$Factory$Impl;
import com.squareup.cash.profile.views.MooncakeAddressSheet$Factory$Impl;
import com.squareup.cash.profile.views.PaymentNotificationOptionsView$Factory$Impl;
import com.squareup.cash.profile.views.ProfileCropView$Factory$Impl;
import com.squareup.cash.recipients.data.RealCustomerStore;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.retro.views.RetroUiFactory;
import com.squareup.cash.savings.presenters.SavingsFullScreenActivityPresenter$Factory$Impl;
import com.squareup.cash.savings.presenters.SavingsRouteInterstitialPresenter$Factory$Impl;
import com.squareup.cash.savings.presenters.SavingsScreenPresenter$Factory$Impl;
import com.squareup.cash.savings.presenters.SavingsUpsellCardPresenter$Factory$Impl;
import com.squareup.cash.savings.presenters.TransferInPresenter$Factory$Impl;
import com.squareup.cash.savings.presenters.TransferOutPresenter$Factory$Impl;
import com.squareup.cash.savings.presenters.TransferringPresenter$Factory$Impl;
import com.squareup.cash.securitysignals.backend.RealScreenRecordingDetector;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.storage.Storage;
import com.squareup.cash.support.backend.api.transaction.SupportTransactionMapper;
import com.squareup.cash.support.backend.real.RealSupportViewedArticlesStore;
import com.squareup.cash.support.navigation.RealSupportNavigator;
import com.squareup.cash.taptopay.backend.real.RealTapToPayErrorReporter;
import com.squareup.cash.taptopay.backend.real.RealTapToPayRepository;
import com.squareup.cash.treehouse.badging.RawBadgingService;
import com.squareup.cash.ui.BroadwayModule$ProvideBroadwayMetroFactory;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.work.session.RealCurrentUserSetter;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.activity.api.v1.ActivityClientService;
import com.squareup.protos.cash.badging.api.BadgeCounts;
import com.squareup.protos.cash.badging.api.BadgingApp;
import com.squareup.protos.cash.badging.api.GetBadgeCountsClientRequest;
import com.squareup.protos.cash.badging.api.GetBadgeCountsClientResponse;
import com.squareup.protos.cash.cashbusinessaccounts.api.v1.C4BClientService;
import com.squareup.protos.cash.cashbusinesspayments.api.v1beta1.CashBusinessPaymentsClientService;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.util.android.AndroidPackageManager;
import com.squareup.util.coroutines.Signal;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.Teardown;
import com.squareup.workflow1.internal.SubtreeManager;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.sync.MutexImpl;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import retrofit2.OkHttpCall;
import retrofit2.Retrofit;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class RealBadger2 implements Badger2, InternalBadger, RawBadgingService {
    public final BadgingApp appService;
    public final LocalTabContentQueries badgeCountQueries;
    public final LocalTabContentQueries badgeGroupQueries;
    public final LocalTabContentQueries badgeQueries;
    public final Extras.Key badgingWorkEnqueuer;
    public final AndroidClock clock;
    public final ErrorReporter errorReporter;
    public final CoroutineContext ioContext;
    public final SessionManager sessionManager;
    public final MutexImpl countRefreshMutex = new MutexImpl();
    public final SharedFlowImpl workCheckTrigger = FlowKt.MutableSharedFlow(1, 1, BufferOverflow.DROP_OLDEST);

    public RealBadger2(CashAccountDatabaseImpl cashAccountDatabaseImpl, BadgingApp badgingApp, Extras.Key key, AndroidClock androidClock, ErrorReporter errorReporter, CoroutineContext coroutineContext, SessionManager sessionManager) {
        this.appService = badgingApp;
        this.badgingWorkEnqueuer = key;
        this.clock = androidClock;
        this.errorReporter = errorReporter;
        this.ioContext = coroutineContext;
        this.sessionManager = sessionManager;
        this.badgeCountQueries = cashAccountDatabaseImpl.badgeCountQueries;
        this.badgeGroupQueries = cashAccountDatabaseImpl.badgeGroupQueries;
        this.badgeQueries = cashAccountDatabaseImpl.badgeQueries;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0059, code lost:
    
        if (r13 != r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x009f, code lost:
    
        if (kotlinx.coroutines.JobKt.m4182delayVtjQ1oo(r6, r0) == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a1, code lost:
    
        r12 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a3, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x009f -> B:11:0x003d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void access$launchBadgeCountRefresh(RealBadger2 realBadger2, ContinuationImpl continuationImpl) {
        RealBadger2$launchBadgeCountRefresh$1 realBadger2$launchBadgeCountRefresh$1;
        int i;
        int i2;
        Duration[] durationArr;
        Duration[] durationArr2;
        if (continuationImpl instanceof RealBadger2$launchBadgeCountRefresh$1) {
            realBadger2$launchBadgeCountRefresh$1 = (RealBadger2$launchBadgeCountRefresh$1) continuationImpl;
            int i3 = realBadger2$launchBadgeCountRefresh$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                realBadger2$launchBadgeCountRefresh$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj = realBadger2$launchBadgeCountRefresh$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realBadger2$launchBadgeCountRefresh$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    i2 = 0;
                } else if (i == 1) {
                    i2 = realBadger2$launchBadgeCountRefresh$1.I$0;
                    SafeTrace.throwOnFailure(obj);
                    if (((Boolean) obj).booleanValue()) {
                        i2 = 0;
                    } else {
                        durationArr = RealBadger2Kt.retryDelaysByFailureCount;
                        durationArr.getClass();
                        i2 = RangesKt___RangesKt.coerceIn(i2 + 1, new IntRange(0, durationArr.length - 1, 1));
                    }
                    durationArr2 = RealBadger2Kt.retryDelaysByFailureCount;
                    long j = durationArr2[i2].rawValue;
                    Timber.Forest.i(Recorder$$ExternalSyntheticOutline1.m("Next badge count refresh in ", i2, Duration.m4177toStringimpl(j), ". Failure count: ", "."), new Object[0]);
                    realBadger2$launchBadgeCountRefresh$1.I$0 = i2;
                    realBadger2$launchBadgeCountRefresh$1.label = 2;
                } else if (i != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return;
                } else {
                    i2 = realBadger2$launchBadgeCountRefresh$1.I$0;
                    SafeTrace.throwOnFailure(obj);
                }
                List plus = CollectionsKt.plus((Iterable) MarketingMessageBadging.GROUP_NAMES, (Collection) CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"ACTIVITY", "PROFILE"}));
                realBadger2$launchBadgeCountRefresh$1.I$0 = i2;
                realBadger2$launchBadgeCountRefresh$1.label = 1;
                obj = realBadger2.refreshCounts(plus, realBadger2$launchBadgeCountRefresh$1);
            }
        }
        realBadger2$launchBadgeCountRefresh$1 = new RealBadger2$launchBadgeCountRefresh$1(realBadger2, continuationImpl);
        Object obj3 = realBadger2$launchBadgeCountRefresh$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realBadger2$launchBadgeCountRefresh$1.label;
        if (i != 0) {
        }
        List plus2 = CollectionsKt.plus((Iterable) MarketingMessageBadging.GROUP_NAMES, (Collection) CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"ACTIVITY", "PROFILE"}));
        realBadger2$launchBadgeCountRefresh$1.I$0 = i2;
        realBadger2$launchBadgeCountRefresh$1.label = 1;
        obj3 = realBadger2.refreshCounts(plus2, realBadger2$launchBadgeCountRefresh$1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.collectLatest(r9, r0, r1) != r2) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0070, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        if (r0.emit(r9, r1) == r2) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$scheduleBadgeClearingWork(RealBadger2 realBadger2, ContinuationImpl continuationImpl) {
        RealBadger2$scheduleBadgeClearingWork$1 realBadger2$scheduleBadgeClearingWork$1;
        int i;
        SharedFlowImpl sharedFlowImpl = realBadger2.workCheckTrigger;
        if (continuationImpl instanceof RealBadger2$scheduleBadgeClearingWork$1) {
            realBadger2$scheduleBadgeClearingWork$1 = (RealBadger2$scheduleBadgeClearingWork$1) continuationImpl;
            int i2 = realBadger2$scheduleBadgeClearingWork$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realBadger2$scheduleBadgeClearingWork$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realBadger2$scheduleBadgeClearingWork$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realBadger2$scheduleBadgeClearingWork$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Unit unit = Unit.INSTANCE;
                    realBadger2$scheduleBadgeClearingWork$1.label = 1;
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
                Duration.Companion companion = Duration.Companion;
                int i3 = 0;
                Flow distinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.flowOn(new RealBadger2$scheduleBadgeClearingWork$$inlined$map$1(FlowKt.m4195debounceHG0u8IE(sharedFlowImpl, DurationKt.toDuration(50, DurationUnit.MILLISECONDS)), realBadger2, i3), realBadger2.ioContext));
                RealBadger2$scheduleBadgeClearingWork$3 realBadger2$scheduleBadgeClearingWork$3 = new RealBadger2$scheduleBadgeClearingWork$3(realBadger2, continuation, i3);
                realBadger2$scheduleBadgeClearingWork$1.label = 2;
            }
        }
        realBadger2$scheduleBadgeClearingWork$1 = new RealBadger2$scheduleBadgeClearingWork$1(realBadger2, continuationImpl);
        Object obj2 = realBadger2$scheduleBadgeClearingWork$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realBadger2$scheduleBadgeClearingWork$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        Duration.Companion companion2 = Duration.Companion;
        int i32 = 0;
        Flow distinctUntilChanged2 = FlowKt.distinctUntilChanged(FlowKt.flowOn(new RealBadger2$scheduleBadgeClearingWork$$inlined$map$1(FlowKt.m4195debounceHG0u8IE(sharedFlowImpl, DurationKt.toDuration(50, DurationUnit.MILLISECONDS)), realBadger2, i32), realBadger2.ioContext));
        RealBadger2$scheduleBadgeClearingWork$3 realBadger2$scheduleBadgeClearingWork$32 = new RealBadger2$scheduleBadgeClearingWork$3(realBadger2, continuation2, i32);
        realBadger2$scheduleBadgeClearingWork$1.label = 2;
    }

    public static final void access$updateCounts(RealBadger2 realBadger2, BadgeCounts badgeCounts) {
        realBadger2.getClass();
        int i = 0;
        if (Intrinsics.areEqual(badgeCounts.customer_token, PlatformKt.activeAccountToken(realBadger2.sessionManager))) {
            realBadger2.badgeCountQueries.transactionWithWrapper(new RealBadger2$$ExternalSyntheticLambda0(i, badgeCounts, realBadger2));
        } else {
            Timber.Forest.w("Customer token of badge count does not match our current token.", new Object[0]);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        if (r6.workCheckTrigger.emit(r7, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        if (kotlinx.coroutines.JobKt.withContext(r6.ioContext, r8, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object clear(Badger2.Badge[] badgeArr, ContinuationImpl continuationImpl) {
        RealBadger2$clear$1 realBadger2$clear$1;
        int i;
        if (continuationImpl instanceof RealBadger2$clear$1) {
            realBadger2$clear$1 = (RealBadger2$clear$1) continuationImpl;
            int i2 = realBadger2$clear$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realBadger2$clear$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realBadger2$clear$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realBadger2$clear$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealBadger2$clear$2 realBadger2$clear$2 = new RealBadger2$clear$2(this, badgeArr, continuation, 0);
                    realBadger2$clear$1.label = 1;
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
                Unit unit = Unit.INSTANCE;
                realBadger2$clear$1.label = 2;
            }
        }
        realBadger2$clear$1 = new RealBadger2$clear$1(this, continuationImpl);
        Object obj2 = realBadger2$clear$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realBadger2$clear$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        Unit unit2 = Unit.INSTANCE;
        realBadger2$clear$1.label = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0099 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0088 -> B:10:0x0089). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object countFor(List list, ContinuationImpl continuationImpl) {
        RealBadger2$countFor$1 realBadger2$countFor$1;
        int i;
        int i2;
        Iterator it;
        Map map;
        int i3;
        if (continuationImpl instanceof RealBadger2$countFor$1) {
            realBadger2$countFor$1 = (RealBadger2$countFor$1) continuationImpl;
            int i4 = realBadger2$countFor$1.label;
            if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                realBadger2$countFor$1.label = i4 - PKIFailureInfo.systemUnavail;
                Object obj = realBadger2$countFor$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realBadger2$countFor$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    List list2 = list;
                    int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                    if (mapCapacity < 16) {
                        mapCapacity = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
                    i2 = 0;
                    it = list2.iterator();
                    map = linkedHashMap;
                    i3 = 0;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = realBadger2$countFor$1.I$1;
                    i2 = realBadger2$countFor$1.I$0;
                    Object next = realBadger2$countFor$1.L$9;
                    map = realBadger2$countFor$1.L$8;
                    it = realBadger2$countFor$1.L$5;
                    Map map2 = realBadger2$countFor$1.L$4;
                    SafeTrace.throwOnFailure(obj);
                    map.put(next, new Integer(((Number) obj).intValue()));
                    map = map2;
                    if (it.hasNext()) {
                        next = it.next();
                        FlowUtil$createFlow$$inlined$map$1 countFor = countFor((String) next);
                        Map map3 = map;
                        realBadger2$countFor$1.L$4 = map3;
                        realBadger2$countFor$1.L$5 = it;
                        realBadger2$countFor$1.L$8 = map3;
                        realBadger2$countFor$1.L$9 = next;
                        realBadger2$countFor$1.I$0 = i2;
                        realBadger2$countFor$1.I$1 = i3;
                        realBadger2$countFor$1.label = 1;
                        obj = FlowKt.first(countFor, realBadger2$countFor$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        map2 = map;
                        map.put(next, new Integer(((Number) obj).intValue()));
                        map = map2;
                        if (it.hasNext()) {
                            return map;
                        }
                    }
                }
            }
        }
        realBadger2$countFor$1 = new RealBadger2$countFor$1(this, continuationImpl);
        Object obj2 = realBadger2$countFor$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realBadger2$countFor$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009f A[Catch: all -> 0x00b7, TryCatch #3 {all -> 0x00b7, blocks: (B:30:0x0099, B:32:0x009f, B:34:0x00a9, B:40:0x00b9, B:44:0x00d7, B:46:0x00db, B:48:0x00ee, B:49:0x00f3, B:55:0x007c, B:58:0x0085), top: B:54:0x007c }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d7 A[Catch: all -> 0x00b7, TryCatch #3 {all -> 0x00b7, blocks: (B:30:0x0099, B:32:0x009f, B:34:0x00a9, B:40:0x00b9, B:44:0x00d7, B:46:0x00db, B:48:0x00ee, B:49:0x00f3, B:55:0x007c, B:58:0x0085), top: B:54:0x007c }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v15, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r12v9, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v11, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r4v3, types: [kotlinx.coroutines.sync.Mutex] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object refreshCounts(List list, ContinuationImpl continuationImpl) {
        RealBadger2$refreshCounts$1 realBadger2$refreshCounts$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        MutexImpl mutexImpl;
        int i2;
        Object badgeCountsClient;
        int i3;
        Object obj;
        int i4;
        ?? r12;
        ApiResult apiResult;
        MutexImpl mutexImpl2;
        try {
            try {
                if (continuationImpl instanceof RealBadger2$refreshCounts$1) {
                    realBadger2$refreshCounts$1 = (RealBadger2$refreshCounts$1) continuationImpl;
                    int i5 = realBadger2$refreshCounts$1.label;
                    if ((i5 & PKIFailureInfo.systemUnavail) != 0) {
                        realBadger2$refreshCounts$1.label = i5 - PKIFailureInfo.systemUnavail;
                        Object obj2 = realBadger2$refreshCounts$1.result;
                        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = realBadger2$refreshCounts$1.label;
                        boolean z = true;
                        Continuation continuation = null;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj2);
                            realBadger2$refreshCounts$1.L$0 = list;
                            mutexImpl = this.countRefreshMutex;
                            realBadger2$refreshCounts$1.L$1 = mutexImpl;
                            realBadger2$refreshCounts$1.I$0 = 0;
                            realBadger2$refreshCounts$1.label = 1;
                            if (mutexImpl.lock(realBadger2$refreshCounts$1) != coroutineSingletons) {
                                i2 = 0;
                            }
                            return coroutineSingletons;
                        }
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                r12 = realBadger2$refreshCounts$1.L$1;
                                List list2 = realBadger2$refreshCounts$1.L$0;
                                try {
                                    SafeTrace.throwOnFailure(obj2);
                                    mutexImpl2 = r12;
                                    mutexImpl = mutexImpl2;
                                    r12 = mutexImpl;
                                    Boolean valueOf = Boolean.valueOf(z);
                                    r12.unlock(null);
                                    return valueOf;
                                } catch (Throwable th) {
                                    th = th;
                                    r12.unlock(null);
                                    throw th;
                                }
                            }
                            i4 = realBadger2$refreshCounts$1.I$1;
                            int i6 = realBadger2$refreshCounts$1.I$0;
                            ?? r4 = realBadger2$refreshCounts$1.L$1;
                            List list3 = realBadger2$refreshCounts$1.L$0;
                            try {
                                SafeTrace.throwOnFailure(obj2);
                                obj = obj2;
                                mutexImpl = r4;
                                i3 = i6;
                                apiResult = (ApiResult) obj;
                                if (!(apiResult instanceof ApiResult.Success)) {
                                    BadgeCounts badgeCounts = ((GetBadgeCountsClientResponse) ((ApiResult.Success) apiResult).response).badge_count;
                                    if (badgeCounts != null) {
                                        CoroutineContext coroutineContext = this.ioContext;
                                        RealBadger2$clear$2 realBadger2$clear$2 = new RealBadger2$clear$2(this, badgeCounts, continuation, 21);
                                        realBadger2$refreshCounts$1.L$0 = null;
                                        realBadger2$refreshCounts$1.L$1 = mutexImpl;
                                        realBadger2$refreshCounts$1.I$0 = i3;
                                        realBadger2$refreshCounts$1.I$1 = i4;
                                        realBadger2$refreshCounts$1.label = 3;
                                        if (JobKt.withContext(coroutineContext, realBadger2$clear$2, realBadger2$refreshCounts$1) != coroutineSingletons) {
                                            mutexImpl2 = mutexImpl;
                                            mutexImpl = mutexImpl2;
                                        }
                                        return coroutineSingletons;
                                    }
                                    this.errorReporter.report(BadgerError.NullBadgeCount.INSTANCE, ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                                } else {
                                    if (!(apiResult instanceof ApiResult.Failure)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    Timber.Forest.e("Failed to refresh badge counts.", new Object[0]);
                                    z = false;
                                }
                                r12 = mutexImpl;
                                Boolean valueOf2 = Boolean.valueOf(z);
                                r12.unlock(null);
                                return valueOf2;
                            } catch (Throwable th2) {
                                th = th2;
                                r12 = r4;
                                r12.unlock(null);
                                throw th;
                            }
                        }
                        int i7 = realBadger2$refreshCounts$1.I$0;
                        ?? r2 = realBadger2$refreshCounts$1.L$1;
                        List list4 = realBadger2$refreshCounts$1.L$0;
                        SafeTrace.throwOnFailure(obj2);
                        mutexImpl = r2;
                        i2 = i7;
                        list = list4;
                        BadgingApp badgingApp = this.appService;
                        GetBadgeCountsClientRequest getBadgeCountsClientRequest = new GetBadgeCountsClientRequest(list, ByteString.EMPTY);
                        realBadger2$refreshCounts$1.L$0 = null;
                        realBadger2$refreshCounts$1.L$1 = mutexImpl;
                        realBadger2$refreshCounts$1.I$0 = i2;
                        realBadger2$refreshCounts$1.I$1 = 0;
                        realBadger2$refreshCounts$1.label = 2;
                        badgeCountsClient = badgingApp.getBadgeCountsClient(getBadgeCountsClientRequest, realBadger2$refreshCounts$1);
                        if (badgeCountsClient != coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        i3 = i2;
                        obj = badgeCountsClient;
                        i4 = 0;
                        apiResult = (ApiResult) obj;
                        if (!(apiResult instanceof ApiResult.Success)) {
                        }
                        r12 = mutexImpl;
                        Boolean valueOf22 = Boolean.valueOf(z);
                        r12.unlock(null);
                        return valueOf22;
                    }
                }
                GetBadgeCountsClientRequest getBadgeCountsClientRequest2 = new GetBadgeCountsClientRequest(list, ByteString.EMPTY);
                realBadger2$refreshCounts$1.L$0 = null;
                realBadger2$refreshCounts$1.L$1 = mutexImpl;
                realBadger2$refreshCounts$1.I$0 = i2;
                realBadger2$refreshCounts$1.I$1 = 0;
                realBadger2$refreshCounts$1.label = 2;
                badgeCountsClient = badgingApp.getBadgeCountsClient(getBadgeCountsClientRequest2, realBadger2$refreshCounts$1);
                if (badgeCountsClient != coroutineSingletons) {
                }
            } catch (Throwable th3) {
                th = th3;
                r12 = mutexImpl;
                r12.unlock(null);
                throw th;
            }
            BadgingApp badgingApp2 = this.appService;
        } catch (Throwable th4) {
            th = th4;
            r12 = mutexImpl;
            r12.unlock(null);
            throw th;
        }
        realBadger2$refreshCounts$1 = new RealBadger2$refreshCounts$1(this, continuationImpl);
        Object obj22 = realBadger2$refreshCounts$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realBadger2$refreshCounts$1.label;
        boolean z2 = true;
        Continuation continuation2 = null;
        if (i != 0) {
        }
    }

    @Override // com.squareup.util.coroutines.SetupTeardown
    public final Teardown setup(CoroutineScope coroutineScope, Object obj) {
        coroutineScope.getClass();
        ((Lifecycle) obj).getClass();
        JobKt.launch$default(coroutineScope, null, CoroutineStart.DEFAULT, new DataStoreImpl$data$1(null, this), 1);
        return StateFlowKt.noOpTeardown;
    }

    @Override // com.squareup.cash.treehouse.badging.RawBadgingService
    public final Object updateBadgeCounts(ByteString byteString, Continuation continuation) {
        Object withContext = JobKt.withContext(this.ioContext, new RealBadger2$clear$2(this, byteString, (Continuation) null, 22), continuation);
        return withContext == CoroutineSingletons.COROUTINE_SUSPENDED ? withContext : Unit.INSTANCE;
    }

    public final Object updateBadgingInfo(List list, ContinuationImpl continuationImpl) {
        Object withContext = JobKt.withContext(this.ioContext, new RealBadger2$clear$2(this, list, (Continuation) null, 23), continuationImpl);
        return withContext == CoroutineSingletons.COROUTINE_SUSPENDED ? withContext : Unit.INSTANCE;
    }

    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public final Provider accountDatabase;
        public final Provider appService;
        public final Provider badgingWorkEnqueuer;
        public final Provider clock;
        public final Provider errorReporter;
        public final Provider ioContext;
        public final Provider sessionManager;

        public MetroFactory(LambdaProvider lambdaProvider, RealAppLockState.MetroFactory metroFactory, RealGlobalConfigManager.MetroFactory metroFactory2, DoubleCheck doubleCheck, AppMessageSyncer.MetroFactory metroFactory3, TreehouseFlows.MetroFactory metroFactory4, TreehouseFlows.MetroFactory metroFactory5) {
            this.$r8$classId = 13;
            this.badgingWorkEnqueuer = lambdaProvider;
            this.accountDatabase = metroFactory;
            this.clock = metroFactory2;
            this.appService = doubleCheck;
            this.errorReporter = metroFactory3;
            this.ioContext = metroFactory4;
            this.sessionManager = metroFactory5;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            Provider provider = this.badgingWorkEnqueuer;
            Provider provider2 = this.sessionManager;
            Provider provider3 = this.ioContext;
            Provider provider4 = this.errorReporter;
            Provider provider5 = this.clock;
            Provider provider6 = this.accountDatabase;
            Provider provider7 = this.appService;
            switch (i) {
                case 0:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) provider6.invoke();
                    BadgingApp badgingApp = (BadgingApp) ((DoubleCheck) provider7).getValue();
                    Extras.Key key = (Extras.Key) ((RealPasscodeFlowStarter.MetroFactory) provider).invoke();
                    AndroidClock androidClock = (AndroidClock) provider5.invoke();
                    ErrorReporter errorReporter = (ErrorReporter) provider4.invoke();
                    CoroutineContext coroutineContext = (CoroutineContext) provider3.invoke();
                    SessionManager sessionManager = (SessionManager) provider2.invoke();
                    cashAccountDatabaseImpl.getClass();
                    badgingApp.getClass();
                    androidClock.getClass();
                    errorReporter.getClass();
                    coroutineContext.getClass();
                    sessionManager.getClass();
                    return new RealBadger2(cashAccountDatabaseImpl, badgingApp, key, androidClock, errorReporter, coroutineContext, sessionManager);
                case 1:
                    LocalService localService = (LocalService) provider6.invoke();
                    RealLocalBrandRepository realLocalBrandRepository = (RealLocalBrandRepository) ((RealPasscodeFlowStarter.MetroFactory) provider7).invoke();
                    Analytics analytics = (Analytics) provider5.invoke();
                    SessionManager sessionManager2 = (SessionManager) provider4.invoke();
                    CalculateLineItemsManager calculateLineItemsManager = (CalculateLineItemsManager) provider3.invoke();
                    BuyerIntentSyncManager buyerIntentSyncManager = (BuyerIntentSyncManager) provider2.invoke();
                    BuyerIntentManager buyerIntentManager = (BuyerIntentManager) provider.invoke();
                    localService.getClass();
                    analytics.getClass();
                    sessionManager2.getClass();
                    calculateLineItemsManager.getClass();
                    buyerIntentSyncManager.getClass();
                    buyerIntentManager.getClass();
                    return new RealCartBuilderManager(localService, realLocalBrandRepository, analytics, sessionManager2, calculateLineItemsManager, buyerIntentSyncManager, buyerIntentManager);
                case 2:
                    ComponentRegistry.Builder builder = (ComponentRegistry.Builder) ((RealSessionFlags.MetroFactory) provider7).invoke();
                    SharedFlow sharedFlow = (SharedFlow) provider6.invoke();
                    DeferredDeepLinkStateModule$Companion$$ExternalSyntheticLambda0 deferredDeepLinkStateModule$Companion$$ExternalSyntheticLambda0 = (DeferredDeepLinkStateModule$Companion$$ExternalSyntheticLambda0) provider5.invoke();
                    Flow flow = (Flow) ((InstanceFactory) provider).value;
                    RealAppLockState realAppLockState = (RealAppLockState) provider4.invoke();
                    DeepLinkCompletableNavigator deepLinkCompletableNavigator = (DeepLinkCompletableNavigator) provider3.invoke();
                    SessionManager sessionManager3 = (SessionManager) provider2.invoke();
                    sharedFlow.getClass();
                    deferredDeepLinkStateModule$Companion$$ExternalSyntheticLambda0.getClass();
                    flow.getClass();
                    realAppLockState.getClass();
                    deepLinkCompletableNavigator.getClass();
                    sessionManager3.getClass();
                    return new RealDeepLinkAttributionWorker(builder, sharedFlow, deferredDeepLinkStateModule$Companion$$ExternalSyntheticLambda0, flow, realAppLockState, deepLinkCompletableNavigator, sessionManager3);
                case 3:
                    RealDependentCustomerTokenRepository realDependentCustomerTokenRepository = (RealDependentCustomerTokenRepository) provider6.invoke();
                    FamilySharedActivityCache$Factory$Impl familySharedActivityCache$Factory$Impl = (FamilySharedActivityCache$Factory$Impl) provider5.invoke();
                    RealActivityEmbeddedPresenter$Factory$Impl realActivityEmbeddedPresenter$Factory$Impl = (RealActivityEmbeddedPresenter$Factory$Impl) provider4.invoke();
                    AndroidStringManager androidStringManager = (AndroidStringManager) provider3.invoke();
                    ActivityClientService activityClientService = (ActivityClientService) provider2.invoke();
                    JCAContext jCAContext = (JCAContext) ((ArcadeModule$ProvideHapticVibratorMetroFactory) provider7).invoke();
                    DefaultActivityItemEventHandler$Factory$Impl defaultActivityItemEventHandler$Factory$Impl = (DefaultActivityItemEventHandler$Factory$Impl) provider.invoke();
                    realDependentCustomerTokenRepository.getClass();
                    familySharedActivityCache$Factory$Impl.getClass();
                    realActivityEmbeddedPresenter$Factory$Impl.getClass();
                    androidStringManager.getClass();
                    activityClientService.getClass();
                    defaultActivityItemEventHandler$Factory$Impl.getClass();
                    return new SubtreeManager(realDependentCustomerTokenRepository, familySharedActivityCache$Factory$Impl, realActivityEmbeddedPresenter$Factory$Impl, androidStringManager, activityClientService, jCAContext, defaultActivityItemEventHandler$Factory$Impl);
                case 4:
                    RealBrazeConfigurator.MetroFactory metroFactory = (RealBrazeConfigurator.MetroFactory) provider7;
                    RealClientSyncer realClientSyncer = (RealClientSyncer) provider6.invoke();
                    ErrorReporter errorReporter2 = (ErrorReporter) provider5.invoke();
                    FeatureFlaggedSamplingStrategy$Factory$Impl featureFlaggedSamplingStrategy$Factory$Impl = (FeatureFlaggedSamplingStrategy$Factory$Impl) ((InstanceFactory) provider).value;
                    Duration.Companion companion = Duration.Companion;
                    DurationUnit durationUnit = DurationUnit.SECONDS;
                    RealExponentialBackoff realExponentialBackoff = new RealExponentialBackoff(DurationKt.toDuration(1, durationUnit), DurationKt.toDuration(10, durationUnit), Random.Default);
                    AndroidClock androidClock2 = (AndroidClock) provider4.invoke();
                    CoroutineContext coroutineContext2 = (CoroutineContext) provider3.invoke();
                    StateFlow stateFlow = (StateFlow) provider2.invoke();
                    realClientSyncer.getClass();
                    errorReporter2.getClass();
                    featureFlaggedSamplingStrategy$Factory$Impl.getClass();
                    androidClock2.getClass();
                    coroutineContext2.getClass();
                    stateFlow.getClass();
                    return new CustomerStreamingSubscriber(metroFactory, realClientSyncer, errorReporter2, featureFlaggedSamplingStrategy$Factory$Impl, realExponentialBackoff, androidClock2, coroutineContext2, stateFlow);
                case 5:
                    SyncEntityStore syncEntityStore = (SyncEntityStore) ((TemporaryStorage.MetroFactory) provider7).invoke();
                    SyncEntityStore syncEntityStore2 = (SyncEntityStore) ((RealBrazeConfigurator.MetroFactory) provider).invoke();
                    SqlComponentMigrationStore sqlComponentMigrationStore = (SqlComponentMigrationStore) provider6.invoke();
                    RealClientSyncErrorReporter realClientSyncErrorReporter = (RealClientSyncErrorReporter) provider5.invoke();
                    RealClientSyncFlags realClientSyncFlags = (RealClientSyncFlags) provider4.invoke();
                    RealClientSyncLogger realClientSyncLogger = (RealClientSyncLogger) provider3.invoke();
                    ClientSyncTransactor clientSyncTransactor = (ClientSyncTransactor) provider2.invoke();
                    sqlComponentMigrationStore.getClass();
                    realClientSyncErrorReporter.getClass();
                    realClientSyncFlags.getClass();
                    realClientSyncLogger.getClass();
                    clientSyncTransactor.getClass();
                    return new FlaggedSyncEntityStore(syncEntityStore, syncEntityStore2, sqlComponentMigrationStore, realClientSyncErrorReporter, realClientSyncFlags, realClientSyncLogger, clientSyncTransactor);
                case 6:
                    AndroidPackageManager androidPackageManager = (AndroidPackageManager) provider6.invoke();
                    Analytics analytics2 = (Analytics) provider5.invoke();
                    ProductionAttributionEventEmitter productionAttributionEventEmitter = (ProductionAttributionEventEmitter) provider4.invoke();
                    FeatureFlagManager featureFlagManager = (FeatureFlagManager) provider3.invoke();
                    BlockerFlowListener blockerFlowListener = (BlockerFlowListener) provider2.invoke();
                    RealJurisdictionConfigManager realJurisdictionConfigManager = (RealJurisdictionConfigManager) ((LocalViewFactory.MetroFactory) provider7).invoke();
                    ErrorReporter errorReporter3 = (ErrorReporter) provider.invoke();
                    androidPackageManager.getClass();
                    analytics2.getClass();
                    productionAttributionEventEmitter.getClass();
                    featureFlagManager.getClass();
                    blockerFlowListener.getClass();
                    errorReporter3.getClass();
                    return new RealBlockersDescriptorNavigator(androidPackageManager, analytics2, productionAttributionEventEmitter, featureFlagManager, blockerFlowListener, realJurisdictionConfigManager, errorReporter3);
                case 7:
                    SessionManager sessionManager4 = (SessionManager) provider6.invoke();
                    CashAccountDatabaseImpl cashAccountDatabaseImpl2 = (CashAccountDatabaseImpl) provider5.invoke();
                    CoroutineContext coroutineContext3 = (CoroutineContext) provider4.invoke();
                    C4BClientService c4BClientService = (C4BClientService) ((DoubleCheck) provider7).getValue();
                    AndroidClock androidClock3 = (AndroidClock) provider3.invoke();
                    Analytics analytics3 = (Analytics) provider2.invoke();
                    Signal signal = (Signal) provider.invoke();
                    sessionManager4.getClass();
                    cashAccountDatabaseImpl2.getClass();
                    coroutineContext3.getClass();
                    c4BClientService.getClass();
                    androidClock3.getClass();
                    analytics3.getClass();
                    signal.getClass();
                    return new RealFeatureEligibilityRepository(sessionManager4, cashAccountDatabaseImpl2, coroutineContext3, c4BClientService, androidClock3, analytics3, signal);
                case 8:
                    SessionManager sessionManager5 = (SessionManager) provider6.invoke();
                    GrowToolsActivitySearchRequestHandler$Factory$Impl growToolsActivitySearchRequestHandler$Factory$Impl = (GrowToolsActivitySearchRequestHandler$Factory$Impl) ((InstanceFactory) provider7).value;
                    RealActivitiesCacheManager realActivitiesCacheManager = (RealActivitiesCacheManager) provider5.invoke();
                    GrowToolsActivityItemEventDecorator$Factory$Impl growToolsActivityItemEventDecorator$Factory$Impl = (GrowToolsActivityItemEventDecorator$Factory$Impl) ((InstanceFactory) provider).value;
                    DefaultActivityItemEventHandler$Factory$Impl defaultActivityItemEventHandler$Factory$Impl2 = (DefaultActivityItemEventHandler$Factory$Impl) provider4.invoke();
                    AndroidStringManager androidStringManager2 = (AndroidStringManager) provider3.invoke();
                    RealActivityEmbeddedPresenter$Factory$Impl realActivityEmbeddedPresenter$Factory$Impl2 = (RealActivityEmbeddedPresenter$Factory$Impl) provider2.invoke();
                    sessionManager5.getClass();
                    growToolsActivitySearchRequestHandler$Factory$Impl.getClass();
                    realActivitiesCacheManager.getClass();
                    growToolsActivityItemEventDecorator$Factory$Impl.getClass();
                    defaultActivityItemEventHandler$Factory$Impl2.getClass();
                    androidStringManager2.getClass();
                    realActivityEmbeddedPresenter$Factory$Impl2.getClass();
                    return new RealGrowToolsActivityPresenterFactory(sessionManager5, growToolsActivitySearchRequestHandler$Factory$Impl, realActivitiesCacheManager, growToolsActivityItemEventDecorator$Factory$Impl, defaultActivityItemEventHandler$Factory$Impl2, androidStringManager2, realActivityEmbeddedPresenter$Factory$Impl2);
                case 9:
                    AppService appService = (AppService) provider6.invoke();
                    FillrInitializer.MetroFactory metroFactory2 = (FillrInitializer.MetroFactory) provider7;
                    CoroutineContext coroutineContext4 = (CoroutineContext) provider5.invoke();
                    CashAccountDatabaseImpl cashAccountDatabaseImpl3 = (CashAccountDatabaseImpl) provider4.invoke();
                    RealCustomerStore realCustomerStore = (RealCustomerStore) provider3.invoke();
                    CoroutineContext coroutineContext5 = (CoroutineContext) provider2.invoke();
                    CoroutineScope coroutineScope = (CoroutineScope) ((InstanceFactory) provider).value;
                    appService.getClass();
                    coroutineContext4.getClass();
                    cashAccountDatabaseImpl3.getClass();
                    realCustomerStore.getClass();
                    coroutineContext5.getClass();
                    coroutineScope.getClass();
                    return new RealLegacyActivityEntityManager(appService, metroFactory2, coroutineContext4, cashAccountDatabaseImpl3, realCustomerStore, coroutineContext5, coroutineScope);
                case 10:
                    RealSignalsCollector realSignalsCollector = (RealSignalsCollector) ((LambdaProvider) provider7).lambda.invoke();
                    OkHttpCall.AnonymousClass1 anonymousClass1 = (OkHttpCall.AnonymousClass1) ((RetroUiFactory.MetroFactory) provider).invoke();
                    AttestedKeyService.Factory factory = (AttestedKeyService.Factory) provider6.invoke();
                    ErrorReporter errorReporter4 = (ErrorReporter) provider5.invoke();
                    FeatureFlagManager featureFlagManager2 = (FeatureFlagManager) provider4.invoke();
                    CoroutineContext coroutineContext6 = (CoroutineContext) provider3.invoke();
                    boolean booleanValue = ((Boolean) provider2.invoke()).booleanValue();
                    realSignalsCollector.getClass();
                    factory.getClass();
                    errorReporter4.getClass();
                    featureFlagManager2.getClass();
                    coroutineContext6.getClass();
                    return new RealMRIFactory(realSignalsCollector, anonymousClass1, factory, errorReporter4, featureFlagManager2, coroutineContext6, booleanValue);
                case 11:
                    FeatureFlagManager featureFlagManager3 = (FeatureFlagManager) ((DoubleCheck) provider7).getValue();
                    AndroidClock androidClock4 = (AndroidClock) ((LambdaProvider) provider6).lambda.invoke();
                    Storage storage = (Storage) ((DoubleCheck) provider5).getValue();
                    RealImageLoader realImageLoader = (RealImageLoader) ((DoubleCheck) provider4).getValue();
                    RealObservabilityManager realObservabilityManager = (RealObservabilityManager) ((LambdaProvider) provider3).lambda.invoke();
                    CoroutineContext coroutineContext7 = (CoroutineContext) ((LambdaProvider) provider2).lambda.invoke();
                    KeyValue keyValue = (KeyValue) ((RealCurrentUserSetter.MetroFactory) provider).invoke();
                    featureFlagManager3.getClass();
                    androidClock4.getClass();
                    storage.getClass();
                    realImageLoader.getClass();
                    realObservabilityManager.getClass();
                    coroutineContext7.getClass();
                    return new RealLowDiskSpaceAlertManager(featureFlagManager3, androidClock4, storage, realImageLoader, realObservabilityManager, coroutineContext7, keyValue);
                case 12:
                    CryptoFlowStarter cryptoFlowStarter = (CryptoFlowStarter) ((RealAppLockState.MetroFactory) provider7).invoke();
                    FlowStarter flowStarter = (FlowStarter) provider6.invoke();
                    OfflineManager offlineManager = (OfflineManager) provider5.invoke();
                    RealBalanceSnapshotManager realBalanceSnapshotManager = (RealBalanceSnapshotManager) provider4.invoke();
                    RealInstrumentManager realInstrumentManager = (RealInstrumentManager) provider3.invoke();
                    AppConfigManager appConfigManager = (AppConfigManager) provider2.invoke();
                    RealUuidGenerator realUuidGenerator = (RealUuidGenerator) provider.invoke();
                    flowStarter.getClass();
                    offlineManager.getClass();
                    realBalanceSnapshotManager.getClass();
                    realInstrumentManager.getClass();
                    appConfigManager.getClass();
                    realUuidGenerator.getClass();
                    return new RealPaymentInitiator(cryptoFlowStarter, flowStarter, offlineManager, realBalanceSnapshotManager, realInstrumentManager, appConfigManager, realUuidGenerator);
                case 13:
                    AndroidStringManager androidStringManager3 = (AndroidStringManager) ((LambdaProvider) provider).lambda.invoke();
                    CryptoFlowStarter cryptoFlowStarter2 = (CryptoFlowStarter) provider6.invoke();
                    RealCryptoInvoiceParser realCryptoInvoiceParser = (RealCryptoInvoiceParser) provider5.invoke();
                    Analytics analytics4 = (Analytics) ((DoubleCheck) provider7).getValue();
                    RealClipboardObserver realClipboardObserver = (RealClipboardObserver) provider4.invoke();
                    RealBitcoinFormatter realBitcoinFormatter = (RealBitcoinFormatter) provider3.invoke();
                    RealBitcoinProfileRepo realBitcoinProfileRepo = (RealBitcoinProfileRepo) provider2.invoke();
                    androidStringManager3.getClass();
                    cryptoFlowStarter2.getClass();
                    realCryptoInvoiceParser.getClass();
                    analytics4.getClass();
                    realClipboardObserver.getClass();
                    realBitcoinFormatter.getClass();
                    realBitcoinProfileRepo.getClass();
                    return new RealBitcoinPaymentManager(androidStringManager3, cryptoFlowStarter2, realCryptoInvoiceParser, analytics4, realClipboardObserver, realBitcoinFormatter, realBitcoinProfileRepo);
                case 14:
                    AddAliasSheet$Factory$Impl addAliasSheet$Factory$Impl = (AddAliasSheet$Factory$Impl) ((InstanceFactory) provider4).value;
                    MooncakeAddressSheet$Factory$Impl mooncakeAddressSheet$Factory$Impl = (MooncakeAddressSheet$Factory$Impl) ((InstanceFactory) provider3).value;
                    ProfileCropView$Factory$Impl profileCropView$Factory$Impl = (ProfileCropView$Factory$Impl) ((InstanceFactory) provider2).value;
                    AppMessagesOptionsView$Factory$Impl appMessagesOptionsView$Factory$Impl = (AppMessagesOptionsView$Factory$Impl) ((InstanceFactory) provider7).value;
                    PaymentNotificationOptionsView$Factory$Impl paymentNotificationOptionsView$Factory$Impl = (PaymentNotificationOptionsView$Factory$Impl) ((InstanceFactory) provider).value;
                    RealImageLoader realImageLoader2 = (RealImageLoader) provider6.invoke();
                    RealCashVibrator realCashVibrator = (RealCashVibrator) provider5.invoke();
                    addAliasSheet$Factory$Impl.getClass();
                    mooncakeAddressSheet$Factory$Impl.getClass();
                    profileCropView$Factory$Impl.getClass();
                    appMessagesOptionsView$Factory$Impl.getClass();
                    paymentNotificationOptionsView$Factory$Impl.getClass();
                    realImageLoader2.getClass();
                    realCashVibrator.getClass();
                    return new MoneyUiFactory(addAliasSheet$Factory$Impl, mooncakeAddressSheet$Factory$Impl, profileCropView$Factory$Impl, appMessagesOptionsView$Factory$Impl, paymentNotificationOptionsView$Factory$Impl, realImageLoader2, realCashVibrator);
                case 15:
                    SavingsScreenPresenter$Factory$Impl savingsScreenPresenter$Factory$Impl = (SavingsScreenPresenter$Factory$Impl) ((InstanceFactory) provider5).value;
                    SavingsFullScreenActivityPresenter$Factory$Impl savingsFullScreenActivityPresenter$Factory$Impl = (SavingsFullScreenActivityPresenter$Factory$Impl) ((InstanceFactory) provider4).value;
                    TransferInPresenter$Factory$Impl transferInPresenter$Factory$Impl = (TransferInPresenter$Factory$Impl) ((InstanceFactory) provider3).value;
                    TransferOutPresenter$Factory$Impl transferOutPresenter$Factory$Impl = (TransferOutPresenter$Factory$Impl) ((InstanceFactory) provider2).value;
                    TransferringPresenter$Factory$Impl transferringPresenter$Factory$Impl = (TransferringPresenter$Factory$Impl) ((InstanceFactory) provider7).value;
                    SavingsUpsellCardPresenter$Factory$Impl savingsUpsellCardPresenter$Factory$Impl = (SavingsUpsellCardPresenter$Factory$Impl) provider6.invoke();
                    SavingsRouteInterstitialPresenter$Factory$Impl savingsRouteInterstitialPresenter$Factory$Impl = (SavingsRouteInterstitialPresenter$Factory$Impl) ((InstanceFactory) provider).value;
                    savingsScreenPresenter$Factory$Impl.getClass();
                    savingsFullScreenActivityPresenter$Factory$Impl.getClass();
                    transferInPresenter$Factory$Impl.getClass();
                    transferOutPresenter$Factory$Impl.getClass();
                    transferringPresenter$Factory$Impl.getClass();
                    savingsUpsellCardPresenter$Factory$Impl.getClass();
                    savingsRouteInterstitialPresenter$Factory$Impl.getClass();
                    return new PoolsPresenterFactory(savingsScreenPresenter$Factory$Impl, savingsFullScreenActivityPresenter$Factory$Impl, transferInPresenter$Factory$Impl, transferOutPresenter$Factory$Impl, transferringPresenter$Factory$Impl, savingsUpsellCardPresenter$Factory$Impl, savingsRouteInterstitialPresenter$Factory$Impl, 4);
                case 16:
                    Analytics analytics5 = (Analytics) provider6.invoke();
                    RealSupportViewedArticlesStore realSupportViewedArticlesStore = (RealSupportViewedArticlesStore) ((RealTrifleService.MetroFactory) provider7).invoke();
                    RealFlowTokenGenerator realFlowTokenGenerator = (RealFlowTokenGenerator) provider5.invoke();
                    FeatureFlagManager featureFlagManager4 = (FeatureFlagManager) provider4.invoke();
                    SessionManager sessionManager6 = (SessionManager) provider3.invoke();
                    SupportTransactionMapper supportTransactionMapper = (SupportTransactionMapper) provider2.invoke();
                    SyncValueReader syncValueReader = (SyncValueReader) provider.invoke();
                    analytics5.getClass();
                    realFlowTokenGenerator.getClass();
                    featureFlagManager4.getClass();
                    sessionManager6.getClass();
                    supportTransactionMapper.getClass();
                    syncValueReader.getClass();
                    return new RealSupportNavigator(analytics5, realSupportViewedArticlesStore, realFlowTokenGenerator, featureFlagManager4, sessionManager6, supportTransactionMapper, syncValueReader);
                case 17:
                    UnleashContext unleashContext = (UnleashContext) ((BroadwayModule$ProvideBroadwayMetroFactory) provider7).invoke();
                    RealMRIFactory realMRIFactory = (RealMRIFactory) provider6.invoke();
                    CashBusinessPaymentsClientService cashBusinessPaymentsClientService = (CashBusinessPaymentsClientService) provider5.invoke();
                    RealScreenRecordingDetector realScreenRecordingDetector = (RealScreenRecordingDetector) ((InstanceFactory) provider).value;
                    SyncValueReader syncValueReader2 = (SyncValueReader) provider4.invoke();
                    RealTapToPayErrorReporter realTapToPayErrorReporter = (RealTapToPayErrorReporter) provider3.invoke();
                    boolean booleanValue2 = ((Boolean) provider2.invoke()).booleanValue();
                    realMRIFactory.getClass();
                    cashBusinessPaymentsClientService.getClass();
                    realScreenRecordingDetector.getClass();
                    syncValueReader2.getClass();
                    realTapToPayErrorReporter.getClass();
                    return new RealTapToPayRepository(unleashContext, realMRIFactory, cashBusinessPaymentsClientService, realScreenRecordingDetector, syncValueReader2, realTapToPayErrorReporter, booleanValue2);
                default:
                    KeysetHandle keysetHandle = (KeysetHandle) ((RealBrazeConfigurator.MetroFactory) provider7).invoke();
                    RealPaymentListener realPaymentListener = (RealPaymentListener) provider6.invoke();
                    RealMoneyNavigatorHelper realMoneyNavigatorHelper = (RealMoneyNavigatorHelper) provider5.invoke();
                    SyncValueReader syncValueReader3 = (SyncValueReader) provider4.invoke();
                    FeatureFlagManager featureFlagManager5 = (FeatureFlagManager) provider3.invoke();
                    ErrorReporter errorReporter5 = (ErrorReporter) provider2.invoke();
                    RealCashLocalNavigatorHelper realCashLocalNavigatorHelper = (RealCashLocalNavigatorHelper) provider.invoke();
                    realPaymentListener.getClass();
                    realMoneyNavigatorHelper.getClass();
                    syncValueReader3.getClass();
                    featureFlagManager5.getClass();
                    errorReporter5.getClass();
                    realCashLocalNavigatorHelper.getClass();
                    return new Retrofit.Builder(keysetHandle, realPaymentListener, realMoneyNavigatorHelper, syncValueReader3, featureFlagManager5, errorReporter5, realCashLocalNavigatorHelper);
            }
        }

        public MetroFactory(LambdaProvider lambdaProvider, DoubleCheck doubleCheck, LambdaProvider lambdaProvider2, DoubleCheck doubleCheck2, LambdaProvider lambdaProvider3, DoubleCheck doubleCheck3, DoubleCheck doubleCheck4) {
            this.$r8$classId = 7;
            this.accountDatabase = lambdaProvider;
            this.clock = doubleCheck;
            this.errorReporter = lambdaProvider2;
            this.appService = doubleCheck2;
            this.ioContext = lambdaProvider3;
            this.sessionManager = doubleCheck3;
            this.badgingWorkEnqueuer = doubleCheck4;
        }

        public MetroFactory(LambdaProvider lambdaProvider, InstanceFactory instanceFactory, DoubleCheck doubleCheck, InstanceFactory instanceFactory2, InstanceFactory instanceFactory3, LambdaProvider lambdaProvider2, InstanceFactory instanceFactory4) {
            this.$r8$classId = 8;
            this.accountDatabase = lambdaProvider;
            this.appService = instanceFactory;
            this.clock = doubleCheck;
            this.badgingWorkEnqueuer = instanceFactory2;
            this.errorReporter = instanceFactory3;
            this.ioContext = lambdaProvider2;
            this.sessionManager = instanceFactory4;
        }

        public /* synthetic */ MetroFactory(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, int i) {
            this.$r8$classId = i;
            this.appService = provider;
            this.accountDatabase = provider2;
            this.clock = provider3;
            this.errorReporter = provider4;
            this.ioContext = provider5;
            this.sessionManager = provider6;
            this.badgingWorkEnqueuer = provider7;
        }

        public /* synthetic */ MetroFactory(Provider provider, Factory factory, Provider provider2, Provider provider3, DoubleCheck doubleCheck, Provider provider4, Provider provider5, int i) {
            this.$r8$classId = i;
            this.appService = provider;
            this.badgingWorkEnqueuer = factory;
            this.accountDatabase = provider2;
            this.clock = provider3;
            this.errorReporter = doubleCheck;
            this.ioContext = provider4;
            this.sessionManager = provider5;
        }

        public /* synthetic */ MetroFactory(Provider provider, Object obj, Factory factory, Provider provider2, Provider provider3, Factory factory2, Provider provider4, int i) {
            this.$r8$classId = i;
            this.accountDatabase = provider;
            this.clock = (Provider) obj;
            this.errorReporter = factory;
            this.ioContext = provider2;
            this.sessionManager = provider3;
            this.appService = factory2;
            this.badgingWorkEnqueuer = provider4;
        }

        public MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, RealPasscodeFlowStarter.MetroFactory metroFactory, LambdaProvider lambdaProvider, LambdaProvider lambdaProvider2, LambdaProvider lambdaProvider3, LambdaProvider lambdaProvider4) {
            this.$r8$classId = 0;
            this.accountDatabase = doubleCheck;
            this.appService = doubleCheck2;
            this.badgingWorkEnqueuer = metroFactory;
            this.clock = lambdaProvider;
            this.errorReporter = lambdaProvider2;
            this.ioContext = lambdaProvider3;
            this.sessionManager = lambdaProvider4;
        }

        public /* synthetic */ MetroFactory(DoubleCheck doubleCheck, Factory factory, Provider provider, Provider provider2, Provider provider3, Provider provider4, Object obj, int i) {
            this.$r8$classId = i;
            this.accountDatabase = doubleCheck;
            this.appService = factory;
            this.clock = provider;
            this.errorReporter = provider2;
            this.ioContext = provider3;
            this.sessionManager = provider4;
            this.badgingWorkEnqueuer = (Provider) obj;
        }

        public /* synthetic */ MetroFactory(Factory factory, Provider provider, Provider provider2, InstanceFactory instanceFactory, Provider provider3, Provider provider4, Provider provider5, int i) {
            this.$r8$classId = i;
            this.appService = factory;
            this.accountDatabase = provider;
            this.clock = provider2;
            this.badgingWorkEnqueuer = instanceFactory;
            this.errorReporter = provider3;
            this.ioContext = provider4;
            this.sessionManager = provider5;
        }

        public MetroFactory(InstanceFactory instanceFactory, InstanceFactory instanceFactory2, InstanceFactory instanceFactory3, InstanceFactory instanceFactory4, InstanceFactory instanceFactory5, DoubleCheck doubleCheck, LambdaProvider lambdaProvider) {
            this.$r8$classId = 14;
            this.errorReporter = instanceFactory;
            this.ioContext = instanceFactory2;
            this.sessionManager = instanceFactory3;
            this.appService = instanceFactory4;
            this.badgingWorkEnqueuer = instanceFactory5;
            this.accountDatabase = doubleCheck;
            this.clock = lambdaProvider;
        }

        public MetroFactory(InstanceFactory instanceFactory, InstanceFactory instanceFactory2, InstanceFactory instanceFactory3, InstanceFactory instanceFactory4, InstanceFactory instanceFactory5, InstanceFactory instanceFactory6, InstanceFactory instanceFactory7) {
            this.$r8$classId = 15;
            this.clock = instanceFactory;
            this.errorReporter = instanceFactory2;
            this.ioContext = instanceFactory3;
            this.sessionManager = instanceFactory4;
            this.appService = instanceFactory5;
            this.accountDatabase = instanceFactory6;
            this.badgingWorkEnqueuer = instanceFactory7;
        }
    }

    public final FlowUtil$createFlow$$inlined$map$1 countFor(String str) {
        str.getClass();
        LocalTabContentQueries localTabContentQueries = this.badgeCountQueries;
        localTabContentQueries.getClass();
        return DBUtil.mapToOneOrDefault(DBUtil.toFlow(new BadgeCountQueries$ForGroupQuery(localTabContentQueries, str, new StorageLinkQueries$$ExternalSyntheticLambda8(localTabContentQueries, 1))), 0, this.ioContext);
    }
}
