package com.squareup.cash.session.backend;

import android.content.SharedPreferences;
import androidx.room.RoomDatabase$closeBarrier$1;
import app.cash.local.worker.LocalActivitySetupTeardown;
import app.cash.sqldelight.coroutines.FlowQuery$asFlow$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.boost.backend.RealBoostSelector;
import com.squareup.cash.db.SessionQueries;
import com.squareup.cash.db.db.CashAppDatabaseImpl;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.investing.backend.real.RealEntityPriceRefresher;
import com.squareup.cash.investing.backend.real.metrics.RealInvestingMetrics;
import com.squareup.cash.keystore.RealMessageSigner;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.onboarding.backend.RealOnboardingFlowTokenManager;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.storage.AndroidFileSaver$save$2;
import com.squareup.cash.tabprovider.real.RealTabProvider$setup$1$5;
import com.squareup.cash.treehouse.activity.HostActivityDataBridge$setNativeQueryToken$2;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.moshi.Moshi;
import com.squareup.protos.cash.marketdata.server.InvestingMetricsService;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.util.coroutines.CoroutinesKt$until$2;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.internal.InstanceFactory;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class DoubleWriteSessionManager implements SessionManager {
    public final CoroutineContext ioDispatcher;
    public final Moshi moshi;
    public final StateFlowImpl onboardedAccountStatus;
    public final SharedPreferences prefs;
    public final RealSessionManager primary;
    public DbSessionManager secondary;
    public final DbSessionManager$Factory$Impl secondaryFactory;
    public final MutexImpl secondaryLock;
    public final SessionQueries sessionQueries;
    public final StateFlowImpl sessionState;
    public final RoomDatabase$closeBarrier$1 writeToSecondary;

    public DoubleWriteSessionManager(RealSessionManager realSessionManager, DbSessionManager$Factory$Impl dbSessionManager$Factory$Impl, CashAppDatabaseImpl cashAppDatabaseImpl, SharedPreferences sharedPreferences, Moshi moshi, CoroutineContext coroutineContext, DoubleWriteExperimentForwarder doubleWriteExperimentForwarder) {
        RoomDatabase$closeBarrier$1 roomDatabase$closeBarrier$1 = new RoomDatabase$closeBarrier$1(0, doubleWriteExperimentForwarder, DoubleWriteExperimentForwarder.class, "enabled", "enabled()Z", 0, 5);
        this.primary = realSessionManager;
        this.secondaryFactory = dbSessionManager$Factory$Impl;
        this.prefs = sharedPreferences;
        this.moshi = moshi;
        this.ioDispatcher = coroutineContext;
        this.writeToSecondary = roomDatabase$closeBarrier$1;
        this.sessionQueries = cashAppDatabaseImpl.sessionQueries;
        this.secondaryLock = new MutexImpl();
        this.sessionState = realSessionManager._sessionState;
        this.onboardedAccountStatus = realSessionManager.onboardedAccountStatus;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|(1:(3:(1:(5:15|16|17|18|19)(2:12|13))(10:24|25|26|27|28|29|(2:31|32)|33|18|19)|22|23)(1:37))(3:51|(1:53)|32)|38|39|(7:41|(2:43|(1:45)(2:46|28))|29|(0)|33|18|19)(1:47)|32))|54|6|(0)(0)|38|39|(0)(0)|32) */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d6, code lost:
    
        if (r11.invoke(r10, r0) == r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a5, code lost:
    
        r11 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a6, code lost:
    
        r10 = r12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0084 A[Catch: all -> 0x00a5, TryCatch #0 {all -> 0x00a5, blocks: (B:28:0x009e, B:29:0x00a8, B:39:0x0076, B:41:0x0084, B:43:0x0088, B:47:0x00c4), top: B:38:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c4 A[Catch: all -> 0x00a5, TRY_LEAVE, TryCatch #0 {all -> 0x00a5, blocks: (B:28:0x009e, B:29:0x00a8, B:39:0x0076, B:41:0x0084, B:43:0x0088, B:47:0x00c4), top: B:38:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r2v8, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r4v6, types: [kotlinx.coroutines.sync.Mutex] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object conditionalDoubleWrite(Function2 function2, ContinuationImpl continuationImpl) {
        DoubleWriteSessionManager$conditionalDoubleWrite$1 doubleWriteSessionManager$conditionalDoubleWrite$1;
        int i;
        MutexImpl mutexImpl;
        int i2;
        Mutex mutex;
        Object createSecondaryManager;
        Function2 function22;
        int i3;
        DoubleWriteSessionManager doubleWriteSessionManager;
        AndroidFileSaver$save$2 androidFileSaver$save$2;
        if (continuationImpl instanceof DoubleWriteSessionManager$conditionalDoubleWrite$1) {
            doubleWriteSessionManager$conditionalDoubleWrite$1 = (DoubleWriteSessionManager$conditionalDoubleWrite$1) continuationImpl;
            int i4 = doubleWriteSessionManager$conditionalDoubleWrite$1.label;
            if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                doubleWriteSessionManager$conditionalDoubleWrite$1.label = i4 - PKIFailureInfo.systemUnavail;
                Object obj = doubleWriteSessionManager$conditionalDoubleWrite$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = doubleWriteSessionManager$conditionalDoubleWrite$1.label;
                int i5 = 0;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    doubleWriteSessionManager$conditionalDoubleWrite$1.L$0 = function2;
                    mutexImpl = this.secondaryLock;
                    doubleWriteSessionManager$conditionalDoubleWrite$1.L$1 = mutexImpl;
                    doubleWriteSessionManager$conditionalDoubleWrite$1.I$0 = 0;
                    doubleWriteSessionManager$conditionalDoubleWrite$1.label = 1;
                    if (mutexImpl.lock(doubleWriteSessionManager$conditionalDoubleWrite$1) != coroutineSingletons) {
                        i2 = 0;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2) {
                        i5 = doubleWriteSessionManager$conditionalDoubleWrite$1.I$1;
                        i3 = doubleWriteSessionManager$conditionalDoubleWrite$1.I$0;
                        doubleWriteSessionManager = doubleWriteSessionManager$conditionalDoubleWrite$1.L$2;
                        ?? r4 = doubleWriteSessionManager$conditionalDoubleWrite$1.L$1;
                        function22 = doubleWriteSessionManager$conditionalDoubleWrite$1.L$0;
                        try {
                            SafeTrace.throwOnFailure(obj);
                            createSecondaryManager = obj;
                            mutexImpl = r4;
                            doubleWriteSessionManager.secondary = (DbSessionManager) createSecondaryManager;
                            i2 = i3;
                            function2 = function22;
                            androidFileSaver$save$2 = new AndroidFileSaver$save$2(function2, this, continuation, 27);
                            doubleWriteSessionManager$conditionalDoubleWrite$1.L$0 = null;
                            doubleWriteSessionManager$conditionalDoubleWrite$1.L$1 = mutexImpl;
                            doubleWriteSessionManager$conditionalDoubleWrite$1.L$2 = null;
                            doubleWriteSessionManager$conditionalDoubleWrite$1.I$0 = i2;
                            doubleWriteSessionManager$conditionalDoubleWrite$1.I$1 = i5;
                            doubleWriteSessionManager$conditionalDoubleWrite$1.label = 3;
                            if (JobKt.coroutineScope(androidFileSaver$save$2, doubleWriteSessionManager$conditionalDoubleWrite$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            mutex = mutexImpl;
                            mutex.unlock(null);
                            return Unit.INSTANCE;
                        } catch (Throwable th) {
                            th = th;
                            mutex = r4;
                        }
                    } else {
                        if (i != 3 && i != 4) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mutex = doubleWriteSessionManager$conditionalDoubleWrite$1.L$1;
                        try {
                            SafeTrace.throwOnFailure(obj);
                            mutex.unlock(null);
                            return Unit.INSTANCE;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    mutex.unlock(null);
                    throw th;
                }
                int i6 = doubleWriteSessionManager$conditionalDoubleWrite$1.I$0;
                ?? r2 = doubleWriteSessionManager$conditionalDoubleWrite$1.L$1;
                Function2 function23 = doubleWriteSessionManager$conditionalDoubleWrite$1.L$0;
                SafeTrace.throwOnFailure(obj);
                mutexImpl = r2;
                i2 = i6;
                function2 = function23;
                if (!((Boolean) this.writeToSecondary.invoke()).booleanValue()) {
                    if (this.secondary == null) {
                        doubleWriteSessionManager$conditionalDoubleWrite$1.L$0 = function2;
                        doubleWriteSessionManager$conditionalDoubleWrite$1.L$1 = mutexImpl;
                        doubleWriteSessionManager$conditionalDoubleWrite$1.L$2 = this;
                        doubleWriteSessionManager$conditionalDoubleWrite$1.I$0 = i2;
                        doubleWriteSessionManager$conditionalDoubleWrite$1.I$1 = 0;
                        doubleWriteSessionManager$conditionalDoubleWrite$1.label = 2;
                        createSecondaryManager = createSecondaryManager(doubleWriteSessionManager$conditionalDoubleWrite$1);
                        if (createSecondaryManager != coroutineSingletons) {
                            function22 = function2;
                            i3 = i2;
                            doubleWriteSessionManager = this;
                            doubleWriteSessionManager.secondary = (DbSessionManager) createSecondaryManager;
                            i2 = i3;
                            function2 = function22;
                        }
                    }
                    androidFileSaver$save$2 = new AndroidFileSaver$save$2(function2, this, continuation, 27);
                    doubleWriteSessionManager$conditionalDoubleWrite$1.L$0 = null;
                    doubleWriteSessionManager$conditionalDoubleWrite$1.L$1 = mutexImpl;
                    doubleWriteSessionManager$conditionalDoubleWrite$1.L$2 = null;
                    doubleWriteSessionManager$conditionalDoubleWrite$1.I$0 = i2;
                    doubleWriteSessionManager$conditionalDoubleWrite$1.I$1 = i5;
                    doubleWriteSessionManager$conditionalDoubleWrite$1.label = 3;
                    if (JobKt.coroutineScope(androidFileSaver$save$2, doubleWriteSessionManager$conditionalDoubleWrite$1) == coroutineSingletons) {
                    }
                    mutex = mutexImpl;
                    mutex.unlock(null);
                    return Unit.INSTANCE;
                }
                this.secondary = null;
                RealSessionManager realSessionManager = this.primary;
                doubleWriteSessionManager$conditionalDoubleWrite$1.L$0 = null;
                doubleWriteSessionManager$conditionalDoubleWrite$1.L$1 = mutexImpl;
                doubleWriteSessionManager$conditionalDoubleWrite$1.I$0 = i2;
                doubleWriteSessionManager$conditionalDoubleWrite$1.I$1 = 0;
                doubleWriteSessionManager$conditionalDoubleWrite$1.label = 4;
                return coroutineSingletons;
            }
        }
        doubleWriteSessionManager$conditionalDoubleWrite$1 = new DoubleWriteSessionManager$conditionalDoubleWrite$1(this, continuationImpl);
        Object obj2 = doubleWriteSessionManager$conditionalDoubleWrite$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = doubleWriteSessionManager$conditionalDoubleWrite$1.label;
        int i52 = 0;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        if (!((Boolean) this.writeToSecondary.invoke()).booleanValue()) {
        }
        return coroutineSingletons2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createSecondaryManager(ContinuationImpl continuationImpl) {
        DoubleWriteSessionManager$createSecondaryManager$1 doubleWriteSessionManager$createSecondaryManager$1;
        int i;
        if (continuationImpl instanceof DoubleWriteSessionManager$createSecondaryManager$1) {
            doubleWriteSessionManager$createSecondaryManager$1 = (DoubleWriteSessionManager$createSecondaryManager$1) continuationImpl;
            int i2 = doubleWriteSessionManager$createSecondaryManager$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                doubleWriteSessionManager$createSecondaryManager$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = doubleWriteSessionManager$createSecondaryManager$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = doubleWriteSessionManager$createSecondaryManager$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    doubleWriteSessionManager$createSecondaryManager$1.label = 1;
                    obj = SessionParsingErrorFactory.access$getMigratedPrefsSessionState(this.prefs, this.moshi, this.sessionQueries, this.ioDispatcher, doubleWriteSessionManager$createSecondaryManager$1);
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
                com.squareup.cash.db.Session session = (com.squareup.cash.db.Session) obj;
                DbSessionManager$Factory$Impl dbSessionManager$Factory$Impl = this.secondaryFactory;
                dbSessionManager$Factory$Impl.getClass();
                session.getClass();
                LocalActivitySetupTeardown.MetroFactory metroFactory = dbSessionManager$Factory$Impl.delegateFactory;
                CashAppDatabaseImpl cashAppDatabaseImpl = (CashAppDatabaseImpl) metroFactory.appForegroundStateProvider.invoke();
                RealOnboardingFlowTokenManager realOnboardingFlowTokenManager = (RealOnboardingFlowTokenManager) metroFactory.sessionManager.invoke();
                Analytics analytics = (Analytics) metroFactory.syncValueReader.invoke();
                ErrorReporter errorReporter = (ErrorReporter) metroFactory.shortlinkHandler.invoke();
                DefaultScheduler defaultScheduler = Dispatchers.Default;
                DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
                CoroutineScope coroutineScope = (CoroutineScope) metroFactory.ioDispatcher.invoke();
                cashAppDatabaseImpl.getClass();
                realOnboardingFlowTokenManager.getClass();
                analytics.getClass();
                errorReporter.getClass();
                defaultIoScheduler.getClass();
                coroutineScope.getClass();
                return new DbSessionManager(cashAppDatabaseImpl, realOnboardingFlowTokenManager, analytics, errorReporter, session, defaultIoScheduler, coroutineScope);
            }
        }
        doubleWriteSessionManager$createSecondaryManager$1 = new DoubleWriteSessionManager$createSecondaryManager$1(this, continuationImpl);
        Object obj2 = doubleWriteSessionManager$createSecondaryManager$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = doubleWriteSessionManager$createSecondaryManager$1.label;
        if (i != 0) {
        }
        com.squareup.cash.db.Session session2 = (com.squareup.cash.db.Session) obj2;
        DbSessionManager$Factory$Impl dbSessionManager$Factory$Impl2 = this.secondaryFactory;
        dbSessionManager$Factory$Impl2.getClass();
        session2.getClass();
        LocalActivitySetupTeardown.MetroFactory metroFactory2 = dbSessionManager$Factory$Impl2.delegateFactory;
        CashAppDatabaseImpl cashAppDatabaseImpl2 = (CashAppDatabaseImpl) metroFactory2.appForegroundStateProvider.invoke();
        RealOnboardingFlowTokenManager realOnboardingFlowTokenManager2 = (RealOnboardingFlowTokenManager) metroFactory2.sessionManager.invoke();
        Analytics analytics2 = (Analytics) metroFactory2.syncValueReader.invoke();
        ErrorReporter errorReporter2 = (ErrorReporter) metroFactory2.shortlinkHandler.invoke();
        DefaultScheduler defaultScheduler2 = Dispatchers.Default;
        DefaultIoScheduler defaultIoScheduler2 = DefaultIoScheduler.INSTANCE;
        CoroutineScope coroutineScope2 = (CoroutineScope) metroFactory2.ioDispatcher.invoke();
        cashAppDatabaseImpl2.getClass();
        realOnboardingFlowTokenManager2.getClass();
        analytics2.getClass();
        errorReporter2.getClass();
        defaultIoScheduler2.getClass();
        coroutineScope2.getClass();
        return new DbSessionManager(cashAppDatabaseImpl2, realOnboardingFlowTokenManager2, analytics2, errorReporter2, session2, defaultIoScheduler2, coroutineScope2);
    }

    @Override // com.squareup.cash.session.backend.SessionManager
    public final Object delete(SessionManager.DeletionMode deletionMode, ContinuationImpl continuationImpl) {
        Object conditionalDoubleWrite = conditionalDoubleWrite(new RealBoostSelector.AnonymousClass1(deletionMode, (Continuation) null, 28), continuationImpl);
        return conditionalDoubleWrite == CoroutineSingletons.COROUTINE_SUSPENDED ? conditionalDoubleWrite : Unit.INSTANCE;
    }

    @Override // com.squareup.cash.session.backend.SessionManager
    public final StateFlow getOnboardedAccountStatus() {
        return this.onboardedAccountStatus;
    }

    @Override // com.squareup.cash.session.backend.SessionManager
    public final StateFlow getSessionState() {
        return this.sessionState;
    }

    @Override // com.squareup.cash.session.backend.SessionManager
    public final Object updateActiveAccountToken(String str, ContinuationImpl continuationImpl) {
        Object conditionalDoubleWrite = conditionalDoubleWrite(new HostActivityDataBridge$setNativeQueryToken$2(str, null, 1), continuationImpl);
        return conditionalDoubleWrite == CoroutineSingletons.COROUTINE_SUSPENDED ? conditionalDoubleWrite : Unit.INSTANCE;
    }

    @Override // com.squareup.cash.session.backend.SessionManager
    public final Object updateAppToken(String str, ContinuationImpl continuationImpl) {
        Object conditionalDoubleWrite = conditionalDoubleWrite(new RealBoostSelector.AnonymousClass1(str, (Continuation) null, 29), continuationImpl);
        return conditionalDoubleWrite == CoroutineSingletons.COROUTINE_SUSPENDED ? conditionalDoubleWrite : Unit.INSTANCE;
    }

    @Override // com.squareup.cash.session.backend.SessionManager
    public final Object updateOnboardedState(boolean z, ContinuationImpl continuationImpl) {
        Object conditionalDoubleWrite = conditionalDoubleWrite(new RealTabProvider$setup$1$5((Continuation) null), continuationImpl);
        return conditionalDoubleWrite == CoroutineSingletons.COROUTINE_SUSPENDED ? conditionalDoubleWrite : Unit.INSTANCE;
    }

    @Override // com.squareup.cash.session.backend.SessionManager
    public final Object updateSession(ResponseContext responseContext, String str, Exception exc, Continuation continuation) {
        Object conditionalDoubleWrite = conditionalDoubleWrite(new FlowQuery$asFlow$1(responseContext, str, exc, (Continuation) null, 9), (ContinuationImpl) continuation);
        return conditionalDoubleWrite == CoroutineSingletons.COROUTINE_SUSPENDED ? conditionalDoubleWrite : Unit.INSTANCE;
    }

    @Override // com.squareup.cash.session.backend.SessionManager
    public final Object updateSessionFinishAccountSwitchCall(ContinuationImpl continuationImpl) {
        Object conditionalDoubleWrite = conditionalDoubleWrite(new RealTabProvider$setup$1$5(7), continuationImpl);
        return conditionalDoubleWrite == CoroutineSingletons.COROUTINE_SUSPENDED ? conditionalDoubleWrite : Unit.INSTANCE;
    }

    @Override // com.squareup.cash.session.backend.SessionManager
    public final Object updateSessionForAccountSwitchOnboarding(String str, ContinuationImpl continuationImpl) {
        Object conditionalDoubleWrite = conditionalDoubleWrite(new HostActivityDataBridge$setNativeQueryToken$2(str, null, 2), continuationImpl);
        return conditionalDoubleWrite == CoroutineSingletons.COROUTINE_SUSPENDED ? conditionalDoubleWrite : Unit.INSTANCE;
    }

    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId = 1;
        public final Provider cashAppDatabase;
        public final Provider doubleWriteExperimentForwarder;
        public final Provider moshi;
        public final Provider prefs;
        public final DoubleCheck primary;
        public final InstanceFactory secondaryFactory;

        public MetroFactory(RealMessageSigner.MetroFactory metroFactory, DoubleCheck doubleCheck, LambdaProvider lambdaProvider, DoubleCheck doubleCheck2, LambdaProvider lambdaProvider2, InstanceFactory instanceFactory) {
            this.cashAppDatabase = metroFactory;
            this.primary = doubleCheck;
            this.prefs = lambdaProvider;
            this.moshi = doubleCheck2;
            this.doubleWriteExperimentForwarder = lambdaProvider2;
            this.secondaryFactory = instanceFactory;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            InstanceFactory instanceFactory = this.secondaryFactory;
            Provider provider = this.doubleWriteExperimentForwarder;
            Provider provider2 = this.moshi;
            Provider provider3 = this.prefs;
            DoubleCheck doubleCheck = this.primary;
            Provider provider4 = this.cashAppDatabase;
            switch (i) {
                case 0:
                    RealSessionManager realSessionManager = (RealSessionManager) doubleCheck.getValue();
                    DbSessionManager$Factory$Impl dbSessionManager$Factory$Impl = (DbSessionManager$Factory$Impl) instanceFactory.value;
                    CashAppDatabaseImpl cashAppDatabaseImpl = (CashAppDatabaseImpl) provider4.invoke();
                    SharedPreferences sharedPreferences = (SharedPreferences) provider3.invoke();
                    Moshi moshi = (Moshi) provider2.invoke();
                    DefaultScheduler defaultScheduler = Dispatchers.Default;
                    DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
                    DoubleWriteExperimentForwarder doubleWriteExperimentForwarder = (DoubleWriteExperimentForwarder) provider.invoke();
                    realSessionManager.getClass();
                    dbSessionManager$Factory$Impl.getClass();
                    cashAppDatabaseImpl.getClass();
                    sharedPreferences.getClass();
                    moshi.getClass();
                    defaultIoScheduler.getClass();
                    doubleWriteExperimentForwarder.getClass();
                    return new DoubleWriteSessionManager(realSessionManager, dbSessionManager$Factory$Impl, cashAppDatabaseImpl, sharedPreferences, moshi, defaultIoScheduler, doubleWriteExperimentForwarder);
                default:
                    LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) provider4.invoke();
                    InvestingMetricsService investingMetricsService = (InvestingMetricsService) doubleCheck.getValue();
                    AndroidClock androidClock = (AndroidClock) provider3.invoke();
                    RealEntityPriceRefresher realEntityPriceRefresher = (RealEntityPriceRefresher) provider2.invoke();
                    CoroutineContext coroutineContext = (CoroutineContext) provider.invoke();
                    CoroutineScope coroutineScope = (CoroutineScope) instanceFactory.value;
                    factory.getClass();
                    investingMetricsService.getClass();
                    androidClock.getClass();
                    realEntityPriceRefresher.getClass();
                    coroutineContext.getClass();
                    coroutineScope.getClass();
                    return new RealInvestingMetrics(factory, investingMetricsService, androidClock, realEntityPriceRefresher, coroutineContext, coroutineScope);
            }
        }

        public MetroFactory(DoubleCheck doubleCheck, InstanceFactory instanceFactory, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, DoubleCheck doubleCheck4, DoubleCheck doubleCheck5) {
            this.primary = doubleCheck;
            this.secondaryFactory = instanceFactory;
            this.cashAppDatabase = doubleCheck2;
            this.prefs = doubleCheck3;
            this.moshi = doubleCheck4;
            this.doubleWriteExperimentForwarder = doubleCheck5;
        }
    }

    @Override // com.squareup.cash.session.backend.SessionManager
    public final Object updateSession(Session session, String str, ContinuationImpl continuationImpl) {
        Object conditionalDoubleWrite = conditionalDoubleWrite(new CoroutinesKt$until$2(session, str, (Continuation) null, 4), continuationImpl);
        return conditionalDoubleWrite == CoroutineSingletons.COROUTINE_SUSPENDED ? conditionalDoubleWrite : Unit.INSTANCE;
    }
}
