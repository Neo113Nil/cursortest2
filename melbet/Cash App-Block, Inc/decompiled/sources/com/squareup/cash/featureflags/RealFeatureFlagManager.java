package com.squareup.cash.featureflags;

import android.content.Context;
import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import androidx.compose.runtime.AbstractApplier;
import androidx.lifecycle.Lifecycle;
import androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1;
import androidx.room.util.DBUtil;
import androidx.work.impl.WorkLauncherImpl;
import app.cash.badging.backend.Badger$collect$3;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.cdp.api.CashCDP;
import app.cash.cdp.backend.android.AndroidDeviceInfoProvider;
import app.cash.cdp.backend.android.AndroidOperatingSystemInfoProvider;
import app.cash.cdp.backend.android.AndroidSessionIdProvider;
import app.cash.cdp.backend.android.CashApplicationInfoProvider;
import app.cash.cdp.backend.jvm.RealEventConsumer;
import app.cash.cdp.integration.CdpModule$Companion$$ExternalSyntheticLambda1;
import app.cash.cdp.integration.CdpModule$Companion$provideCashCDP$1;
import app.cash.cdp.persistence.repository.PersistedEventRepository;
import app.cash.molecule.PlatformKt;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import app.cash.passcode.backend.RealAppLockState;
import app.cash.sqldelight.SimpleQuery;
import app.cash.sqldelight.db.SqlDriver;
import app.cash.trifle.Trifle;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.ImageLoader$Builder;
import coil3.memory.MemoryCacheService;
import com.google.android.gms.dynamite.zzf;
import com.squareup.cash.CashApp$onCreate$1;
import com.squareup.cash.android.AndroidModule$Companion$$ExternalSyntheticLambda0;
import com.squareup.cash.appforeground.AppForegroundStateProvider;
import com.squareup.cash.attribution.wrappers.AppsFlyerClient;
import com.squareup.cash.boost.backend.RealBoostSelector;
import com.squareup.cash.data.contacts.RealContactRepository$contacts$$inlined$map$1;
import com.squareup.cash.data.contacts.RealContactSync$setup$1$1$invokeSuspend$$inlined$map$2;
import com.squareup.cash.db.StorageLinkQueries$$ExternalSyntheticLambda8;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.Instrument$Adapter;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.deviceintegrity.RealDeviceIntegrityAttester;
import com.squareup.cash.e2ee.trifle.RealTrifleService;
import com.squareup.cash.featureflags.FeatureFlag$JsonFeatureFlag;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.formview.components.FormCashtag$8$invokeSuspend$$inlined$map$1;
import com.squareup.cash.gps.backend.real.AndroidLocationProvider;
import com.squareup.cash.gps.backend.real.RealGpsLocationManager;
import com.squareup.cash.gps.backend.real.RealNetworkEnvironmentCollector;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.keystore.RealKeyStoreProvider;
import com.squareup.cash.localization.RealLocaleAssetProvider$MetroFactory;
import com.squareup.cash.localization.RealLocaleManager;
import com.squareup.cash.localization.RealRegionProvider$1$1$1;
import com.squareup.cash.mri.android.RealMRIFactory;
import com.squareup.cash.music.views.MusicViewFactory$MetroFactory;
import com.squareup.cash.observability.backend.api.BugsnagClient;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.permissions.PermissionChecker;
import com.squareup.cash.profilemigration.real.RealMigratedSyncValueBugsnagMetadata;
import com.squareup.cash.session.backend.RealSessionInitiator;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.treehouse.flags.RawFlagsService;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.moshi.Moshi;
import com.squareup.protos.cash.compass.api.CompassService;
import com.squareup.protos.cash.semaphore.api.SemaphoreService;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.common.FeatureFlag;
import com.squareup.protos.franklin.common.FeatureFlagSource;
import com.squareup.util.ForcedLazyKt$forcedLazy$1;
import com.squareup.util.android.RealBackupService;
import com.squareup.util.coroutines.Signal;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.Teardown;
import com.squareup.util.coroutines.android.IoActivitySetupTeardown;
import com.squareup.util.workmanager.AndroidWorkManager;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.ReadonlySharedFlow;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import kotlinx.coroutines.flow.StateFlowImpl;
import papa.SafeTrace;
import retrofit2.OkHttpCall;

/* loaded from: classes.dex */
public final class RealFeatureFlagManager implements FeatureFlagManager, IoActivitySetupTeardown, RawFlagsService {
    public final AppService appService;
    public final BugsnagClient bugsnagClient;
    public final AndroidClock clock;
    public volatile Map currentSelectedOptions;
    public final InstrumentQueries featureFlagQueries;
    public Map featureFlagSources;
    public final ReadonlySharedFlow featureFlagsFlow;
    public final JobImpl featureFlagsQueried;
    public final ConcurrentLinkedQueue interceptors;
    public final CoroutineContext ioContext;
    public final EmptyList localFlags;
    public final EmptyList localOnlyFlags;
    public final RealMigratedSyncValueBugsnagMetadata migratedSyncValueBugsnagMetadata;
    public final Moshi moshi;
    public final InstrumentQueries profileQueries;
    public final int sdkVersion;
    public final SemaphoreService semaphoreService;
    public final SessionManager sessionManager;
    public final Signal signOutSignal;
    public final StateFlowImpl syncStatus;
    public final ProductionSyncValueMigrationBypass syncValueMigrationBypass;

    /* renamed from: com.squareup.cash.featureflags.RealFeatureFlagManager$2, reason: invalid class name */
    public final class AnonymousClass2 extends SuspendLambda implements Function2 {
        public final /* synthetic */ int $r8$classId;
        public int label;
        public final /* synthetic */ RealFeatureFlagManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass2(RealFeatureFlagManager realFeatureFlagManager, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.this$0 = realFeatureFlagManager;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            int i = this.$r8$classId;
            RealFeatureFlagManager realFeatureFlagManager = this.this$0;
            switch (i) {
                case 0:
                    return new AnonymousClass2(realFeatureFlagManager, continuation, 0);
                case 1:
                    return new AnonymousClass2(realFeatureFlagManager, continuation, 1);
                default:
                    return new AnonymousClass2(realFeatureFlagManager, continuation, 2);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            CoroutineScope coroutineScope = (CoroutineScope) obj;
            Continuation continuation = (Continuation) obj2;
            switch (this.$r8$classId) {
            }
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = this.$r8$classId;
            RealFeatureFlagManager realFeatureFlagManager = this.this$0;
            Continuation continuation = null;
            int i2 = 1;
            switch (i) {
                case 0:
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i3 = this.label;
                    if (i3 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        ReadonlySharedFlow readonlySharedFlow = realFeatureFlagManager.featureFlagsFlow;
                        this.label = 1;
                        if (FlowKt.first(readonlySharedFlow, this) == coroutineSingletons) {
                            break;
                        }
                    } else if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    realFeatureFlagManager.featureFlagsQueried.complete$1();
                    break;
                case 1:
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i4 = this.label;
                    if (i4 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        int i5 = 2;
                        int i6 = 0;
                        Flow debounce = FlowKt.debounce(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new Badger$collect$3(i5, continuation, i2), new RealContactSync$setup$1$1$invokeSuspend$$inlined$map$2(PlatformKt.getOnAuthenticated(realFeatureFlagManager.sessionManager), i5)), new AppLockMonitor$special$$inlined$map$2(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new Badger$collect$3(i5, continuation, i5), FlowKt.distinctUntilChanged(DBUtil.mapToOneOrNull(DBUtil.toFlow(realFeatureFlagManager.profileQueries.profileToken()), realFeatureFlagManager.ioContext))), 12), new RealFeatureFlagManager$setup$1$1$5(3, continuation, i6), i6), 500L);
                        RealBoostSelector.AnonymousClass1 anonymousClass1 = new RealBoostSelector.AnonymousClass1(realFeatureFlagManager, continuation, 14);
                        this.label = 1;
                        if (FlowKt.collectLatest(debounce, anonymousClass1, this) == coroutineSingletons2) {
                            break;
                        }
                    } else if (i4 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                default:
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i7 = this.label;
                    if (i7 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        ReadonlySharedFlow readonlySharedFlow2 = realFeatureFlagManager.featureFlagsFlow;
                        RealRegionProvider$1$1$1 realRegionProvider$1$1$1 = new RealRegionProvider$1$1$1(realFeatureFlagManager, 18);
                        this.label = 1;
                        if (readonlySharedFlow2.$$delegate_0.collect(realRegionProvider$1$1$1, this) == coroutineSingletons3) {
                            break;
                        }
                    } else if (i7 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
            }
            return Unit.INSTANCE;
        }
    }

    public final class FlagValue {
        public final boolean isDefaultValue;
        public final Object value;

        public FlagValue(Object obj, boolean z) {
            this.value = obj;
            this.isDefaultValue = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FlagValue)) {
                return false;
            }
            FlagValue flagValue = (FlagValue) obj;
            return Intrinsics.areEqual(this.value, flagValue.value) && this.isDefaultValue == flagValue.isDefaultValue;
        }

        public final int hashCode() {
            Object obj = this.value;
            return Boolean.hashCode(this.isDefaultValue) + ((obj == null ? 0 : obj.hashCode()) * 31);
        }

        public final String toString() {
            return "FlagValue(value=" + this.value + ", isDefaultValue=" + this.isDefaultValue + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class SyncStatus {
        public static final /* synthetic */ SyncStatus[] $VALUES;
        public static final SyncStatus FAILURE;
        public static final SyncStatus IN_PROGRESS;
        public static final SyncStatus NOT_STARTED;
        public static final SyncStatus SUCCESS;

        static {
            SyncStatus syncStatus = new SyncStatus("NOT_STARTED", 0);
            NOT_STARTED = syncStatus;
            SyncStatus syncStatus2 = new SyncStatus("IN_PROGRESS", 1);
            IN_PROGRESS = syncStatus2;
            SyncStatus syncStatus3 = new SyncStatus("SUCCESS", 2);
            SUCCESS = syncStatus3;
            SyncStatus syncStatus4 = new SyncStatus("FAILURE", 3);
            FAILURE = syncStatus4;
            $VALUES = new SyncStatus[]{syncStatus, syncStatus2, syncStatus3, syncStatus4};
        }

        public static SyncStatus valueOf(String str) {
            return (SyncStatus) Enum.valueOf(SyncStatus.class, str);
        }

        public static SyncStatus[] values() {
            return (SyncStatus[]) $VALUES.clone();
        }
    }

    public RealFeatureFlagManager(AppService appService, SemaphoreService semaphoreService, CoroutineContext coroutineContext, Signal signal, SessionManager sessionManager, LocalFeatureFlagProvider$Empty localFeatureFlagProvider$Empty, CashAccountDatabaseImpl cashAccountDatabaseImpl, Moshi moshi, RealMigratedSyncValueBugsnagMetadata realMigratedSyncValueBugsnagMetadata, ProductionSyncValueMigrationBypass productionSyncValueMigrationBypass, BugsnagClient bugsnagClient, InternalArcadeFlagsManager$Factory$Impl internalArcadeFlagsManager$Factory$Impl, AndroidClock androidClock, CoroutineScope coroutineScope, int i) {
        this.appService = appService;
        this.semaphoreService = semaphoreService;
        this.ioContext = coroutineContext;
        this.signOutSignal = signal;
        this.sessionManager = sessionManager;
        this.moshi = moshi;
        this.migratedSyncValueBugsnagMetadata = realMigratedSyncValueBugsnagMetadata;
        this.syncValueMigrationBypass = productionSyncValueMigrationBypass;
        this.bugsnagClient = bugsnagClient;
        this.clock = androidClock;
        this.sdkVersion = i;
        InstrumentQueries instrumentQueries = cashAccountDatabaseImpl.featureFlagsQueries;
        this.featureFlagQueries = instrumentQueries;
        this.profileQueries = cashAccountDatabaseImpl.profileQueries;
        this.localFlags = LocalFeatureFlagProvider$Empty.localFlags;
        this.localOnlyFlags = LocalFeatureFlagProvider$Empty.localOnlyFlags;
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        this.currentSelectedOptions = emptyMap;
        this.featureFlagSources = emptyMap;
        this.featureFlagsQueried = JobKt.Job$default();
        this.interceptors = new ConcurrentLinkedQueue();
        this.syncStatus = FlowKt.MutableStateFlow(SyncStatus.NOT_STARTED);
        SqlDriver sqlDriver = instrumentQueries.driver;
        StorageLinkQueries$$ExternalSyntheticLambda8 storageLinkQueries$$ExternalSyntheticLambda8 = new StorageLinkQueries$$ExternalSyntheticLambda8((Object) instrumentQueries, 21);
        sqlDriver.getClass();
        this.featureFlagsFlow = FlowKt.shareIn(new FinishSetupTileBadgeCounter(11, FlowKt.flowOn(DBUtil.toFlow(new SimpleQuery(-778560343, new String[]{"featureFlags"}, sqlDriver, "FeatureFlags.sq", "selectAll", "SELECT flag\nFROM featureFlags", storageLinkQueries$$ExternalSyntheticLambda8)), coroutineContext), this), coroutineScope, new StartedWhileSubscribed(0L, Long.MAX_VALUE), 1);
        Continuation continuation = null;
        JobKt.launch$default(coroutineScope, null, null, new AnonymousClass2(this, continuation, 0), 3);
        int i2 = 2;
        JobKt.launch$default(coroutineScope, coroutineContext, null, new CashApp$onCreate$1(this, continuation, i2), 2);
        JobKt.launch$default(coroutineScope, null, CoroutineStart.UNDISPATCHED, new AnonymousClass2(this, continuation, i2), 1);
        CoroutineScope coroutineScope2 = (CoroutineScope) internalArcadeFlagsManager$Factory$Impl.delegateFactory.scope.value;
        coroutineScope2.getClass();
        OkHttpCall.AnonymousClass1 anonymousClass1 = new OkHttpCall.AnonymousClass1(this, coroutineScope2);
        if (((AtomicBoolean) anonymousClass1.this$0).getAndSet(true)) {
            return;
        }
        JobKt.launch$default(coroutineScope2, null, null, new RealBoostSelector.AnonymousClass1(anonymousClass1, continuation, 13), 3);
    }

    public static final String access$selected_option_label(RealFeatureFlagManager realFeatureFlagManager, FeatureFlag featureFlag) {
        Object obj;
        Iterator<T> it = featureFlag.options.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((FeatureFlag.Option) obj).value, featureFlag.selected_option_value)) {
                break;
            }
        }
        FeatureFlag.Option option = (FeatureFlag.Option) obj;
        if (option != null) {
            return option.label;
        }
        return null;
    }

    public final FeatureFlag$Option currentExperimentValue(AbstractApplier abstractApplier, boolean z) {
        FeatureFlagManager.CurrentlySelectedOption currentlySelectedOption = (FeatureFlagManager.CurrentlySelectedOption) this.currentSelectedOptions.get((String) abstractApplier.root);
        FlagValue option = currentlySelectedOption != null ? getOption(abstractApplier, currentlySelectedOption.label, currentlySelectedOption.value) : new FlagValue((FeatureFlag$Option) abstractApplier.current, true);
        String identifier = ((FeatureFlag$Option) option.value).getIdentifier();
        Iterator it = this.interceptors.iterator();
        while (it.hasNext()) {
            FeatureFlagInterceptor featureFlagInterceptor = (FeatureFlagInterceptor) it.next();
            String str = (String) abstractApplier.root;
            featureFlagInterceptor.intercept(str, identifier, z && this.featureFlagSources.get(str) == FeatureFlagSource.AMPLITUDE, option.isDefaultValue, (FeatureFlagSource) this.featureFlagSources.get((String) abstractApplier.root));
        }
        return (FeatureFlag$Option) option.value;
    }

    public final FeatureFlag$Option currentValue(AbstractApplier abstractApplier) {
        abstractApplier.getClass();
        return currentExperimentValue(abstractApplier, true);
    }

    @Override // com.squareup.cash.treehouse.flags.RawFlagsService
    public final Flow encodedClientDataFeatureFlags() {
        InstrumentQueries instrumentQueries = this.featureFlagQueries;
        SqlDriver sqlDriver = instrumentQueries.driver;
        StorageLinkQueries$$ExternalSyntheticLambda8 storageLinkQueries$$ExternalSyntheticLambda8 = new StorageLinkQueries$$ExternalSyntheticLambda8((Object) instrumentQueries, 21);
        sqlDriver.getClass();
        return new FormCashtag$8$invokeSuspend$$inlined$map$1(new RealContactRepository$contacts$$inlined$map$1(DBUtil.mapToList(DBUtil.toFlow(new SimpleQuery(-778560343, new String[]{"featureFlags"}, sqlDriver, "FeatureFlags.sq", "selectAll", "SELECT flag\nFROM featureFlags", storageLinkQueries$$ExternalSyntheticLambda8)), this.ioContext), 14), 4);
    }

    @Override // com.squareup.cash.treehouse.flags.RawFlagsService
    public final String get(String str, boolean z) {
        FeatureFlagManager.CurrentlySelectedOption currentlySelectedOption = (FeatureFlagManager.CurrentlySelectedOption) this.currentSelectedOptions.get(str);
        String str2 = currentlySelectedOption != null ? currentlySelectedOption.value : null;
        Iterator it = this.interceptors.iterator();
        while (it.hasNext()) {
            ((FeatureFlagInterceptor) it.next()).intercept(str, str2 == null ? "" : str2, z && this.featureFlagSources.get(str) == FeatureFlagSource.AMPLITUDE, str2 != null, (FeatureFlagSource) this.featureFlagSources.get(str));
        }
        return str2;
    }

    public final FlagValue getOption(AbstractApplier abstractApplier, String str, String str2) {
        FeatureFlag$Option featureFlag$Option;
        boolean z;
        boolean z2 = true;
        if (abstractApplier instanceof FeatureFlag$JsonFeatureFlag) {
            try {
                Object fromJson = this.moshi.adapter(((FeatureFlag$JsonFeatureFlag) abstractApplier).f1132type).fromJson(str2);
                fromJson.getClass();
                featureFlag$Option = new FeatureFlag$JsonFeatureFlag.Options(str, fromJson);
            } catch (Exception unused) {
                featureFlag$Option = (FeatureFlag$JsonFeatureFlag.Options) ((FeatureFlag$Option) ((FeatureFlag$JsonFeatureFlag) abstractApplier).current);
                z = true;
            }
        } else {
            featureFlag$Option = abstractApplier.getOption(str, str2);
        }
        z = false;
        FeatureFlag$Option featureFlag$Option2 = featureFlag$Option == null ? (FeatureFlag$Option) abstractApplier.current : featureFlag$Option;
        if (!z && featureFlag$Option != null) {
            z2 = false;
        }
        return new FlagValue(featureFlag$Option2, z2);
    }

    public final FeatureFlag$Option peekCurrentValue(AbstractApplier abstractApplier) {
        abstractApplier.getClass();
        return currentExperimentValue(abstractApplier, false);
    }

    public final RealFeatureFlagManager$values$$inlined$map$1 peekValues(AbstractApplier abstractApplier) {
        abstractApplier.getClass();
        return new RealFeatureFlagManager$values$$inlined$map$1(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(FlowKt.distinctUntilChanged(new FlowUtil$createFlow$$inlined$map$1(this.featureFlagsFlow, abstractApplier, this, 2)), new RealFeatureFlagManager$experimentValues$2(this, abstractApplier, false, null), 3), 1);
    }

    @Override // com.squareup.util.coroutines.SetupTeardown
    public final Teardown setup(CoroutineScope coroutineScope, Object obj) {
        coroutineScope.getClass();
        ((Lifecycle) obj).getClass();
        JobKt.launch$default(coroutineScope, null, null, new AnonymousClass2(this, null, 1), 3);
        return StateFlowKt.noOpTeardown;
    }

    public final RealFeatureFlagManager$values$$inlined$map$1 values(AbstractApplier abstractApplier) {
        abstractApplier.getClass();
        return new RealFeatureFlagManager$values$$inlined$map$1(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(FlowKt.distinctUntilChanged(new FlowUtil$createFlow$$inlined$map$1(this.featureFlagsFlow, abstractApplier, this, 2)), new RealFeatureFlagManager$experimentValues$2(this, abstractApplier, true, null), 3), 0);
    }

    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId = 2;
        public final Provider appService;
        public final Factory arcadeFeatureFlagsManager;
        public final Provider bugsnagClient;
        public final Provider cashDatabase;
        public final Provider clock;
        public final Provider ioContext;
        public final Provider migratedSyncValueBugsnagMetadata;
        public final Provider moshi;
        public final Provider scope;
        public final Provider sdkVersion;
        public final Provider semaphoreService;
        public final Provider sessionManager;
        public final Provider signOutSignal;

        public MetroFactory(DoubleCheck doubleCheck, LambdaProvider lambdaProvider, LambdaProvider lambdaProvider2, DoubleCheck doubleCheck2, LambdaProvider lambdaProvider3, LambdaProvider lambdaProvider4, LambdaProvider lambdaProvider5, LambdaProvider lambdaProvider6, LambdaProvider lambdaProvider7, LambdaProvider lambdaProvider8, DoubleCheck doubleCheck3, RealKeyStoreProvider.MetroFactory metroFactory, DoubleCheck doubleCheck4) {
            this.appService = doubleCheck;
            this.ioContext = lambdaProvider;
            this.signOutSignal = lambdaProvider2;
            this.sessionManager = doubleCheck2;
            this.cashDatabase = lambdaProvider3;
            this.moshi = lambdaProvider4;
            this.migratedSyncValueBugsnagMetadata = lambdaProvider5;
            this.bugsnagClient = lambdaProvider6;
            this.clock = lambdaProvider7;
            this.sdkVersion = lambdaProvider8;
            this.semaphoreService = doubleCheck3;
            this.arcadeFeatureFlagsManager = metroFactory;
            this.scope = doubleCheck4;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v4, types: [kotlin.Lazy] */
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            Provider provider = this.scope;
            Provider provider2 = this.sdkVersion;
            Provider provider3 = this.clock;
            Provider provider4 = this.bugsnagClient;
            Provider provider5 = this.migratedSyncValueBugsnagMetadata;
            Provider provider6 = this.moshi;
            Factory factory = this.arcadeFeatureFlagsManager;
            Provider provider7 = this.cashDatabase;
            Provider provider8 = this.sessionManager;
            Provider provider9 = this.signOutSignal;
            Provider provider10 = this.semaphoreService;
            Provider provider11 = this.ioContext;
            Provider provider12 = this.appService;
            switch (i) {
                case 0:
                    AppService appService = (AppService) provider12.invoke();
                    SemaphoreService semaphoreService = (SemaphoreService) ((DoubleCheck) provider10).getValue();
                    CoroutineContext coroutineContext = (CoroutineContext) provider11.invoke();
                    Signal signal = (Signal) provider9.invoke();
                    SessionManager sessionManager = (SessionManager) provider8.invoke();
                    LocalFeatureFlagProvider$Empty localFeatureFlagProvider$Empty = LocalFeatureFlagProvider$Empty.INSTANCE;
                    CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) provider7.invoke();
                    Moshi moshi = (Moshi) provider6.invoke();
                    RealMigratedSyncValueBugsnagMetadata realMigratedSyncValueBugsnagMetadata = (RealMigratedSyncValueBugsnagMetadata) provider5.invoke();
                    ProductionSyncValueMigrationBypass productionSyncValueMigrationBypass = new ProductionSyncValueMigrationBypass();
                    BugsnagClient bugsnagClient = (BugsnagClient) provider4.invoke();
                    InternalArcadeFlagsManager$Factory$Impl internalArcadeFlagsManager$Factory$Impl = (InternalArcadeFlagsManager$Factory$Impl) ((InstanceFactory) factory).value;
                    AndroidClock androidClock = (AndroidClock) provider3.invoke();
                    CoroutineScope coroutineScope = (CoroutineScope) ((InstanceFactory) provider).value;
                    int intValue = ((Number) provider2.invoke()).intValue();
                    appService.getClass();
                    semaphoreService.getClass();
                    coroutineContext.getClass();
                    signal.getClass();
                    sessionManager.getClass();
                    cashAccountDatabaseImpl.getClass();
                    moshi.getClass();
                    realMigratedSyncValueBugsnagMetadata.getClass();
                    bugsnagClient.getClass();
                    internalArcadeFlagsManager$Factory$Impl.getClass();
                    androidClock.getClass();
                    coroutineScope.getClass();
                    return new RealFeatureFlagManager(appService, semaphoreService, coroutineContext, signal, sessionManager, localFeatureFlagProvider$Empty, cashAccountDatabaseImpl, moshi, realMigratedSyncValueBugsnagMetadata, productionSyncValueMigrationBypass, bugsnagClient, internalArcadeFlagsManager$Factory$Impl, androidClock, coroutineScope, intValue);
                case 1:
                    Context context = (Context) provider12.invoke();
                    CoroutineScope coroutineScope2 = (CoroutineScope) ((InstanceFactory) factory).value;
                    AndroidWorkManager androidWorkManager = (AndroidWorkManager) provider11.invoke();
                    CoroutineContext coroutineContext2 = (CoroutineContext) provider9.invoke();
                    SessionManager sessionManager2 = (SessionManager) provider8.invoke();
                    String str = (String) provider7.invoke();
                    AndroidDeviceInfoProvider androidDeviceInfoProvider = (AndroidDeviceInfoProvider) provider6.invoke();
                    AndroidOperatingSystemInfoProvider androidOperatingSystemInfoProvider = (AndroidOperatingSystemInfoProvider) provider5.invoke();
                    AndroidModule$Companion$$ExternalSyntheticLambda0 androidModule$Companion$$ExternalSyntheticLambda0 = (AndroidModule$Companion$$ExternalSyntheticLambda0) provider4.invoke();
                    AndroidSessionIdProvider androidSessionIdProvider = (AndroidSessionIdProvider) provider3.invoke();
                    Moshi moshi2 = (Moshi) provider2.invoke();
                    AppsFlyerClient appsFlyerClient = (AppsFlyerClient) ((DoubleCheck) provider10).getValue();
                    PersistedEventRepository persistedEventRepository = (PersistedEventRepository) provider.invoke();
                    context.getClass();
                    coroutineScope2.getClass();
                    androidWorkManager.getClass();
                    coroutineContext2.getClass();
                    sessionManager2.getClass();
                    str.getClass();
                    androidDeviceInfoProvider.getClass();
                    androidOperatingSystemInfoProvider.getClass();
                    androidModule$Companion$$ExternalSyntheticLambda0.getClass();
                    androidSessionIdProvider.getClass();
                    moshi2.getClass();
                    appsFlyerClient.getClass();
                    persistedEventRepository.getClass();
                    return new CashCDP(new MemoryCacheService(androidWorkManager, 22), new RealEventConsumer(new ImageLoader$Builder(new CdpModule$Companion$provideCashCDP$1(sessionManager2), androidDeviceInfoProvider, androidOperatingSystemInfoProvider, new CashApplicationInfoProvider(context), new Trifle(9), new zzf(9), new CdpModule$Companion$$ExternalSyntheticLambda1(str, 0), new WorkLauncherImpl(context), androidSessionIdProvider, new OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0(appsFlyerClient, 3)), persistedEventRepository, new WorkLauncherImpl(moshi2), androidModule$Companion$$ExternalSyntheticLambda0, coroutineScope2, coroutineContext2));
                case 2:
                    Analytics analytics = (Analytics) provider12.invoke();
                    ErrorReporter errorReporter = (ErrorReporter) provider11.invoke();
                    PermissionChecker permissionChecker = (PermissionChecker) provider9.invoke();
                    CompassService compassService = (CompassService) provider8.invoke();
                    AndroidLocationProvider androidLocationProvider = (AndroidLocationProvider) provider7.invoke();
                    RealNetworkEnvironmentCollector realNetworkEnvironmentCollector = (RealNetworkEnvironmentCollector) provider6.invoke();
                    AndroidClock androidClock2 = (AndroidClock) provider5.invoke();
                    RealUuidGenerator realUuidGenerator = (RealUuidGenerator) provider4.invoke();
                    SessionManager sessionManager3 = (SessionManager) provider3.invoke();
                    AppForegroundStateProvider appForegroundStateProvider = (AppForegroundStateProvider) provider2.invoke();
                    ForcedLazyKt$forcedLazy$1 forcedLazyKt$forcedLazy$1 = (ForcedLazyKt$forcedLazy$1) provider10.invoke();
                    Instrument$Adapter instrument$Adapter = (Instrument$Adapter) ((RealKeyStoreProvider.MetroFactory) factory).invoke();
                    FeatureFlagManager featureFlagManager = (FeatureFlagManager) provider.invoke();
                    analytics.getClass();
                    errorReporter.getClass();
                    permissionChecker.getClass();
                    compassService.getClass();
                    androidLocationProvider.getClass();
                    realNetworkEnvironmentCollector.getClass();
                    androidClock2.getClass();
                    realUuidGenerator.getClass();
                    sessionManager3.getClass();
                    appForegroundStateProvider.getClass();
                    forcedLazyKt$forcedLazy$1.getClass();
                    featureFlagManager.getClass();
                    return new RealGpsLocationManager(analytics, errorReporter, permissionChecker, compassService, androidLocationProvider, realNetworkEnvironmentCollector, androidClock2, realUuidGenerator, sessionManager3, appForegroundStateProvider, forcedLazyKt$forcedLazy$1, instrument$Adapter, featureFlagManager);
                default:
                    Analytics analytics2 = (Analytics) provider12.invoke();
                    AppService appService2 = (AppService) provider11.invoke();
                    RealBackupService realBackupService = (RealBackupService) ((LambdaProvider) provider10).lambda.invoke();
                    CoroutineContext coroutineContext3 = (CoroutineContext) provider9.invoke();
                    RealLoginFeatureFlagsHandler realLoginFeatureFlagsHandler = (RealLoginFeatureFlagsHandler) provider8.invoke();
                    Signal signal2 = (Signal) provider7.invoke();
                    RealDeviceIntegrityAttester realDeviceIntegrityAttester = (RealDeviceIntegrityAttester) ((RealAppLockState.MetroFactory) factory).invoke();
                    SessionManager sessionManager4 = (SessionManager) provider6.invoke();
                    provider5.getClass();
                    DoubleCheck doubleCheck = provider5 instanceof Lazy ? (Lazy) provider5 : new DoubleCheck(provider5);
                    RealLocaleManager realLocaleManager = (RealLocaleManager) provider4.invoke();
                    RealMRIFactory realMRIFactory = (RealMRIFactory) provider3.invoke();
                    ErrorReporter errorReporter2 = (ErrorReporter) provider2.invoke();
                    SampleStrategy sampleStrategy = (SampleStrategy) provider.invoke();
                    analytics2.getClass();
                    appService2.getClass();
                    realBackupService.getClass();
                    coroutineContext3.getClass();
                    realLoginFeatureFlagsHandler.getClass();
                    signal2.getClass();
                    sessionManager4.getClass();
                    realLocaleManager.getClass();
                    realMRIFactory.getClass();
                    errorReporter2.getClass();
                    sampleStrategy.getClass();
                    return new RealSessionInitiator(analytics2, appService2, realBackupService, coroutineContext3, realLoginFeatureFlagsHandler, signal2, realDeviceIntegrityAttester, sessionManager4, doubleCheck, realLocaleManager, realMRIFactory, errorReporter2, sampleStrategy);
            }
        }

        public MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, LambdaProvider lambdaProvider, LambdaProvider lambdaProvider2, RealTrifleService.MetroFactory metroFactory, DoubleCheck doubleCheck3, RealAppLockState.MetroFactory metroFactory2, LambdaProvider lambdaProvider3, DoubleCheck doubleCheck4, LambdaProvider lambdaProvider4, DoubleCheck doubleCheck5, LambdaProvider lambdaProvider5, MusicViewFactory$MetroFactory musicViewFactory$MetroFactory) {
            this.appService = doubleCheck;
            this.ioContext = doubleCheck2;
            this.semaphoreService = lambdaProvider;
            this.signOutSignal = lambdaProvider2;
            this.sessionManager = metroFactory;
            this.cashDatabase = doubleCheck3;
            this.arcadeFeatureFlagsManager = metroFactory2;
            this.moshi = lambdaProvider3;
            this.migratedSyncValueBugsnagMetadata = doubleCheck4;
            this.bugsnagClient = lambdaProvider4;
            this.clock = doubleCheck5;
            this.sdkVersion = lambdaProvider5;
            this.scope = musicViewFactory$MetroFactory;
        }

        public MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, LambdaProvider lambdaProvider, DoubleCheck doubleCheck3, LambdaProvider lambdaProvider2, DoubleCheck doubleCheck4, LambdaProvider lambdaProvider3, RealLocaleAssetProvider$MetroFactory realLocaleAssetProvider$MetroFactory, LambdaProvider lambdaProvider4, InstanceFactory instanceFactory, LambdaProvider lambdaProvider5, InstanceFactory instanceFactory2, LambdaProvider lambdaProvider6) {
            this.appService = doubleCheck;
            this.semaphoreService = doubleCheck2;
            this.ioContext = lambdaProvider;
            this.signOutSignal = doubleCheck3;
            this.sessionManager = lambdaProvider2;
            this.cashDatabase = doubleCheck4;
            this.moshi = lambdaProvider3;
            this.migratedSyncValueBugsnagMetadata = realLocaleAssetProvider$MetroFactory;
            this.bugsnagClient = lambdaProvider4;
            this.arcadeFeatureFlagsManager = instanceFactory;
            this.clock = lambdaProvider5;
            this.scope = instanceFactory2;
            this.sdkVersion = lambdaProvider6;
        }

        public MetroFactory(DoubleCheck doubleCheck, InstanceFactory instanceFactory, LambdaProvider lambdaProvider, LambdaProvider lambdaProvider2, LambdaProvider lambdaProvider3, DoubleCheck doubleCheck2, LambdaProvider lambdaProvider4, LambdaProvider lambdaProvider5, LambdaProvider lambdaProvider6, LambdaProvider lambdaProvider7, LambdaProvider lambdaProvider8, DoubleCheck doubleCheck3, PersistedEventRepository.MetroFactory metroFactory) {
            this.appService = doubleCheck;
            this.arcadeFeatureFlagsManager = instanceFactory;
            this.ioContext = lambdaProvider;
            this.signOutSignal = lambdaProvider2;
            this.sessionManager = lambdaProvider3;
            this.cashDatabase = doubleCheck2;
            this.moshi = lambdaProvider4;
            this.migratedSyncValueBugsnagMetadata = lambdaProvider5;
            this.bugsnagClient = lambdaProvider6;
            this.clock = lambdaProvider7;
            this.sdkVersion = lambdaProvider8;
            this.semaphoreService = doubleCheck3;
            this.scope = metroFactory;
        }
    }

    @Override // com.squareup.cash.treehouse.flags.RawFlagsService
    public final String get(String str) {
        return get(str, false);
    }
}
