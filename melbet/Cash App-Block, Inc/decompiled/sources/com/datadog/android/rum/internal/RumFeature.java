package com.datadog.android.rum.internal;

import android.app.ActivityManager;
import android.app.Application;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.extractor.text.CueEncoder;
import androidx.room.CoroutinesRoom;
import androidx.room.util.DBUtil;
import androidx.transition.Transition;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.q4$$ExternalSyntheticLambda0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.svg.internal.AndroidSvg;
import com.android.volley.toolbox.HurlStack;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.bumptech.glide.GlideBuilder$1;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.feature.FeatureEventReceiver;
import com.datadog.android.api.feature.StorageBackedFeature;
import com.datadog.android.api.net.RequestFactory;
import com.datadog.android.api.storage.DataWriter;
import com.datadog.android.api.storage.FeatureStorageConfiguration;
import com.datadog.android.api.storage.NoOpDataWriter;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.event.EventMapper;
import com.datadog.android.event.NoOpEventMapper;
import com.datadog.android.internal.system.BuildSdkVersionProvider;
import com.datadog.android.internal.system.BuildSdkVersionProvider$Companion$DEFAULT$1;
import com.datadog.android.rum.GlobalRumMonitor;
import com.datadog.android.rum.RumErrorSource$EnumUnboxingLocalUtility;
import com.datadog.android.rum.RumSessionListener;
import com.datadog.android.rum.configuration.SlowFramesConfiguration;
import com.datadog.android.rum.internal.anr.ANRDetectorRunnable;
import com.datadog.android.rum.internal.domain.InfoProvider;
import com.datadog.android.rum.internal.domain.RumDataWriter;
import com.datadog.android.rum.internal.domain.battery.DefaultBatteryInfoProvider;
import com.datadog.android.rum.internal.domain.display.DefaultDisplayInfoProvider;
import com.datadog.android.rum.internal.domain.event.RumEventMapper;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import com.datadog.android.rum.internal.instrumentation.MainLooperLongTaskStrategy;
import com.datadog.android.rum.internal.instrumentation.UserActionTrackingStrategyApi29;
import com.datadog.android.rum.internal.instrumentation.UserActionTrackingStrategyLegacy;
import com.datadog.android.rum.internal.instrumentation.gestures.DatadogGesturesTracker;
import com.datadog.android.rum.internal.metric.slowframes.DefaultSlowFramesListener;
import com.datadog.android.rum.internal.net.RumRequestFactory;
import com.datadog.android.rum.internal.startup.RumAppStartupDetectorImpl;
import com.datadog.android.rum.internal.thread.NoOpScheduledExecutorService;
import com.datadog.android.rum.internal.tracking.JetpackViewAttributesProvider;
import com.datadog.android.rum.internal.tracking.NoOpInteractionPredicate;
import com.datadog.android.rum.internal.tracking.UserActionTrackingStrategy;
import com.datadog.android.rum.internal.vitals.AggregatingVitalMonitor;
import com.datadog.android.rum.internal.vitals.CPUVitalReader;
import com.datadog.android.rum.internal.vitals.FPSVitalListener;
import com.datadog.android.rum.internal.vitals.FrameStateListener;
import com.datadog.android.rum.internal.vitals.FrameStatesAggregator;
import com.datadog.android.rum.internal.vitals.MemoryVitalReader;
import com.datadog.android.rum.internal.vitals.NoOpVitalMonitor;
import com.datadog.android.rum.internal.vitals.VitalMonitor;
import com.datadog.android.rum.internal.vitals.VitalReader;
import com.datadog.android.rum.internal.vitals.VitalReaderRunnable;
import com.datadog.android.rum.metric.interactiontonextview.LastInteractionIdentifier;
import com.datadog.android.rum.metric.interactiontonextview.TimeBasedInteractionIdentifier;
import com.datadog.android.rum.metric.networksettled.InitialResourceIdentifier;
import com.datadog.android.rum.metric.networksettled.TimeBasedInitialResourceIdentifier;
import com.datadog.android.rum.tracking.ActionTrackingStrategy;
import com.datadog.android.rum.tracking.ActivityViewTrackingStrategy;
import com.datadog.android.rum.tracking.TrackingStrategy;
import com.datadog.android.rum.tracking.ViewTrackingStrategy;
import com.datadog.android.trace.internal.DatadogTracerAdapter;
import com.fillr.e;
import com.fillr.n;
import com.google.android.filament.Box;
import com.google.android.gms.internal.mlkit_vision_common.zzho;
import com.google.android.gms.tasks.zzb;
import com.google.mlkit.vision.text.zzd;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import xyz.block.protos.genie.BinaryOp;
import xyz.block.protos.genie.CreateSessionRequest;
import xyz.block.protos.genie.ErrorCode;

/* loaded from: classes4.dex */
public final class RumFeature implements StorageBackedFeature, FeatureEventReceiver {
    public static final Configuration DEFAULT_RUM_CONFIG;
    public final GlideBuilder$1 accessibilitySnapshotManager;
    public UserActionTrackingStrategy actionTrackingStrategy;
    public ExecutorService anrDetectorExecutorService;
    public ANRDetectorRunnable anrDetectorRunnable;
    public Context appContext;
    public final String applicationId;
    public boolean backgroundEventTracking;
    public InfoProvider batteryInfoProvider;
    public final BuildSdkVersionProvider buildSdkVersionProvider;
    public final Configuration configuration;
    public VitalMonitor cpuVitalMonitor;
    public DataWriter dataWriter;
    public InfoProvider displayInfoProvider;
    public VitalMonitor frameRateVitalMonitor;
    public InitialResourceIdentifier initialResourceIdentifier;
    public final AtomicBoolean initialized;
    public HurlStack insightsCollector;
    public LastInteractionIdentifier lastInteractionIdentifier;
    public final Lazy lateCrashEventHandler$delegate;
    public final Function1 lateCrashReporterFactory;
    public TrackingStrategy longTaskTrackingStrategy;
    public VitalMonitor memoryVitalMonitor;
    public final String name;
    public final Lazy requestFactory$delegate;
    public RumAppStartupDetectorImpl rumAppStartupDetector;
    public final LinkedHashSet rumContextUpdateReceivers;
    public float sampleRate;
    public final InternalSdkCore sdkCore;
    public RumSessionListener sessionListener;
    public DefaultSlowFramesListener slowFramesListener;
    public final FeatureStorageConfiguration storageConfiguration;
    public float telemetryConfigurationSampleRate;
    public float telemetrySampleRate;
    public boolean trackFrustrations;
    public ViewTrackingStrategy viewTrackingStrategy;
    public ScheduledExecutorService vitalExecutorService;

    /* renamed from: com.datadog.android.rum.internal.RumFeature$1, reason: invalid class name */
    public final class AnonymousClass1 extends Lambda implements Function1 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1(1);

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            InternalSdkCore internalSdkCore = (InternalSdkCore) obj;
            internalSdkCore.getClass();
            return new DatadogLateCrashReporter(internalSdkCore);
        }
    }

    public final class Configuration {
        public final EventMapper actionEventMapper;
        public final Map additionalConfig;
        public final boolean backgroundEventTracking;
        public final ActionTrackingStrategy composeActionTrackingStrategy;
        public final EventMapper errorEventMapper;
        public final InitialResourceIdentifier initialResourceIdentifier;
        public final HurlStack insightsCollector;
        public final NoOpInteractionPredicate interactionPredicate;
        public final TimeBasedInteractionIdentifier lastInteractionIdentifier;
        public final EventMapper longTaskEventMapper;
        public final TrackingStrategy longTaskTrackingStrategy;
        public final EventMapper resourceEventMapper;
        public final float sampleRate;
        public final RumSessionListener sessionListener;
        public final EventMapper telemetryConfigurationMapper;
        public final float telemetryConfigurationSampleRate;
        public final float telemetrySampleRate;
        public final List touchTargetExtraAttributesProviders;
        public final boolean trackFrustrations;
        public final boolean trackNonFatalAnrs;
        public final EventMapper viewEventMapper;
        public final ViewTrackingStrategy viewTrackingStrategy;
        public final EventMapper vitalAppLaunchEventMapper;
        public final EventMapper vitalOperationStepEventMapper;
        public final int vitalsMonitorUpdateFrequency;

        public Configuration(float f, float f2, float f3, List list, NoOpInteractionPredicate noOpInteractionPredicate, ViewTrackingStrategy viewTrackingStrategy, TrackingStrategy trackingStrategy, EventMapper eventMapper, EventMapper eventMapper2, EventMapper eventMapper3, EventMapper eventMapper4, EventMapper eventMapper5, EventMapper eventMapper6, EventMapper eventMapper7, EventMapper eventMapper8, boolean z, boolean z2, boolean z3, int i, RumSessionListener rumSessionListener, InitialResourceIdentifier initialResourceIdentifier, TimeBasedInteractionIdentifier timeBasedInteractionIdentifier, ActionTrackingStrategy actionTrackingStrategy, Map map, HurlStack hurlStack) {
            list.getClass();
            if (i == 0) {
                throw null;
            }
            map.getClass();
            this.sampleRate = f;
            this.telemetrySampleRate = f2;
            this.telemetryConfigurationSampleRate = f3;
            this.touchTargetExtraAttributesProviders = list;
            this.interactionPredicate = noOpInteractionPredicate;
            this.viewTrackingStrategy = viewTrackingStrategy;
            this.longTaskTrackingStrategy = trackingStrategy;
            this.viewEventMapper = eventMapper;
            this.errorEventMapper = eventMapper2;
            this.resourceEventMapper = eventMapper3;
            this.actionEventMapper = eventMapper4;
            this.longTaskEventMapper = eventMapper5;
            this.vitalOperationStepEventMapper = eventMapper6;
            this.vitalAppLaunchEventMapper = eventMapper7;
            this.telemetryConfigurationMapper = eventMapper8;
            this.backgroundEventTracking = z;
            this.trackFrustrations = z2;
            this.trackNonFatalAnrs = z3;
            this.vitalsMonitorUpdateFrequency = i;
            this.sessionListener = rumSessionListener;
            this.initialResourceIdentifier = initialResourceIdentifier;
            this.lastInteractionIdentifier = timeBasedInteractionIdentifier;
            this.composeActionTrackingStrategy = actionTrackingStrategy;
            this.additionalConfig = map;
            this.insightsCollector = hurlStack;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v8, types: [com.datadog.android.rum.tracking.TrackingStrategy] */
        public static Configuration copy$default(Configuration configuration, float f, float f2, float f3, List list, NoOpInteractionPredicate noOpInteractionPredicate, MainLooperLongTaskStrategy mainLooperLongTaskStrategy, int i) {
            configuration.getClass();
            float f4 = (i & 2) != 0 ? configuration.sampleRate : f;
            float f5 = (i & 4) != 0 ? configuration.telemetrySampleRate : f2;
            float f6 = (i & 8) != 0 ? configuration.telemetryConfigurationSampleRate : f3;
            configuration.getClass();
            List list2 = (i & 32) != 0 ? configuration.touchTargetExtraAttributesProviders : list;
            NoOpInteractionPredicate noOpInteractionPredicate2 = (i & 64) != 0 ? configuration.interactionPredicate : noOpInteractionPredicate;
            ViewTrackingStrategy viewTrackingStrategy = (i & 128) != 0 ? configuration.viewTrackingStrategy : null;
            MainLooperLongTaskStrategy mainLooperLongTaskStrategy2 = (i & 256) != 0 ? configuration.longTaskTrackingStrategy : mainLooperLongTaskStrategy;
            EventMapper eventMapper = configuration.viewEventMapper;
            EventMapper eventMapper2 = configuration.errorEventMapper;
            EventMapper eventMapper3 = configuration.resourceEventMapper;
            EventMapper eventMapper4 = configuration.actionEventMapper;
            EventMapper eventMapper5 = configuration.longTaskEventMapper;
            EventMapper eventMapper6 = configuration.vitalOperationStepEventMapper;
            EventMapper eventMapper7 = configuration.vitalAppLaunchEventMapper;
            EventMapper eventMapper8 = configuration.telemetryConfigurationMapper;
            boolean z = (i & PKIFailureInfo.unsupportedVersion) != 0 ? configuration.backgroundEventTracking : true;
            boolean z2 = (i & PKIFailureInfo.transactionIdInUse) != 0 ? configuration.trackFrustrations : true;
            boolean z3 = configuration.trackNonFatalAnrs;
            int i2 = (i & PKIFailureInfo.badCertTemplate) != 0 ? configuration.vitalsMonitorUpdateFrequency : 4;
            RumSessionListener rumSessionListener = configuration.sessionListener;
            InitialResourceIdentifier initialResourceIdentifier = configuration.initialResourceIdentifier;
            TimeBasedInteractionIdentifier timeBasedInteractionIdentifier = configuration.lastInteractionIdentifier;
            configuration.getClass();
            ActionTrackingStrategy actionTrackingStrategy = configuration.composeActionTrackingStrategy;
            Map map = configuration.additionalConfig;
            configuration.getClass();
            configuration.getClass();
            configuration.getClass();
            configuration.getClass();
            HurlStack hurlStack = configuration.insightsCollector;
            configuration.getClass();
            list2.getClass();
            if (i2 == 0) {
                throw null;
            }
            map.getClass();
            return new Configuration(f4, f5, f6, list2, noOpInteractionPredicate2, viewTrackingStrategy, mainLooperLongTaskStrategy2, eventMapper, eventMapper2, eventMapper3, eventMapper4, eventMapper5, eventMapper6, eventMapper7, eventMapper8, z, z2, z3, i2, rumSessionListener, initialResourceIdentifier, timeBasedInteractionIdentifier, actionTrackingStrategy, map, hurlStack);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Configuration) {
                Configuration configuration = (Configuration) obj;
                if (Float.compare(this.sampleRate, configuration.sampleRate) == 0 && Float.compare(this.telemetrySampleRate, configuration.telemetrySampleRate) == 0 && Float.compare(this.telemetryConfigurationSampleRate, configuration.telemetryConfigurationSampleRate) == 0 && Intrinsics.areEqual(this.touchTargetExtraAttributesProviders, configuration.touchTargetExtraAttributesProviders) && this.interactionPredicate.equals(configuration.interactionPredicate) && Intrinsics.areEqual(this.viewTrackingStrategy, configuration.viewTrackingStrategy) && Intrinsics.areEqual(this.longTaskTrackingStrategy, configuration.longTaskTrackingStrategy) && this.viewEventMapper.equals(configuration.viewEventMapper) && this.errorEventMapper.equals(configuration.errorEventMapper) && this.resourceEventMapper.equals(configuration.resourceEventMapper) && this.actionEventMapper.equals(configuration.actionEventMapper) && this.longTaskEventMapper.equals(configuration.longTaskEventMapper) && this.vitalOperationStepEventMapper.equals(configuration.vitalOperationStepEventMapper) && this.vitalAppLaunchEventMapper.equals(configuration.vitalAppLaunchEventMapper) && this.telemetryConfigurationMapper.equals(configuration.telemetryConfigurationMapper) && this.backgroundEventTracking == configuration.backgroundEventTracking && this.trackFrustrations == configuration.trackFrustrations && this.trackNonFatalAnrs == configuration.trackNonFatalAnrs && this.vitalsMonitorUpdateFrequency == configuration.vitalsMonitorUpdateFrequency && this.sessionListener.equals(configuration.sessionListener) && this.initialResourceIdentifier.equals(configuration.initialResourceIdentifier) && this.lastInteractionIdentifier.equals(configuration.lastInteractionIdentifier)) {
                    SlowFramesConfiguration slowFramesConfiguration = SlowFramesConfiguration.DEFAULT;
                    return slowFramesConfiguration.equals(slowFramesConfiguration) && this.composeActionTrackingStrategy.equals(configuration.composeActionTrackingStrategy) && Intrinsics.areEqual(this.additionalConfig, configuration.additionalConfig) && this.insightsCollector == configuration.insightsCollector;
                }
            }
            return false;
        }

        public final int hashCode() {
            int m = Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(CameraState$Type$EnumUnboxingLocalUtility.m(this.telemetryConfigurationSampleRate, CameraState$Type$EnumUnboxingLocalUtility.m(this.telemetrySampleRate, Float.hashCode(this.sampleRate) * 31, 31), 31), 31, true), 961, this.touchTargetExtraAttributesProviders);
            ViewTrackingStrategy viewTrackingStrategy = this.viewTrackingStrategy;
            int hashCode = (m + (viewTrackingStrategy == null ? 0 : viewTrackingStrategy.hashCode())) * 31;
            TrackingStrategy trackingStrategy = this.longTaskTrackingStrategy;
            return this.insightsCollector.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(CameraState$Type$EnumUnboxingLocalUtility.m((this.composeActionTrackingStrategy.hashCode() + ((SlowFramesConfiguration.DEFAULT.hashCode() + Recorder$$ExternalSyntheticOutline2.m((this.initialResourceIdentifier.hashCode() + ((this.sessionListener.hashCode() + Thread$State$EnumUnboxingLocalUtility.m(this.vitalsMonitorUpdateFrequency, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.telemetryConfigurationMapper.hashCode() + ((this.vitalAppLaunchEventMapper.hashCode() + ((this.vitalOperationStepEventMapper.hashCode() + ((this.longTaskEventMapper.hashCode() + ((this.actionEventMapper.hashCode() + ((this.resourceEventMapper.hashCode() + ((this.errorEventMapper.hashCode() + ((this.viewEventMapper.hashCode() + ((hashCode + (trackingStrategy == null ? 0 : trackingStrategy.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.backgroundEventTracking), 31, this.trackFrustrations), 31, this.trackNonFatalAnrs), 31)) * 31)) * 31, 31, this.lastInteractionIdentifier.timeThresholdInNanoSeconds)) * 31)) * 31, this.additionalConfig, 31), 961, true), 31, false), 31, false);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Configuration(customEndpointUrl=null, sampleRate=", this.sampleRate, ", telemetrySampleRate=", this.telemetrySampleRate, ", telemetryConfigurationSampleRate=");
            m.append(this.telemetryConfigurationSampleRate);
            m.append(", userActionTracking=true, touchTargetExtraAttributesProviders=");
            m.append(this.touchTargetExtraAttributesProviders);
            m.append(", interactionPredicate=");
            m.append(this.interactionPredicate);
            m.append(", viewTrackingStrategy=");
            m.append(this.viewTrackingStrategy);
            m.append(", longTaskTrackingStrategy=");
            m.append(this.longTaskTrackingStrategy);
            m.append(", viewEventMapper=");
            m.append(this.viewEventMapper);
            m.append(", errorEventMapper=");
            m.append(this.errorEventMapper);
            m.append(", resourceEventMapper=");
            m.append(this.resourceEventMapper);
            m.append(", actionEventMapper=");
            m.append(this.actionEventMapper);
            m.append(", longTaskEventMapper=");
            m.append(this.longTaskEventMapper);
            m.append(", vitalOperationStepEventMapper=");
            m.append(this.vitalOperationStepEventMapper);
            m.append(", vitalAppLaunchEventMapper=");
            m.append(this.vitalAppLaunchEventMapper);
            m.append(", telemetryConfigurationMapper=");
            m.append(this.telemetryConfigurationMapper);
            m.append(", backgroundEventTracking=");
            m.append(this.backgroundEventTracking);
            m.append(", trackFrustrations=");
            re$$ExternalSyntheticOutline0.m(m, this.trackFrustrations, ", trackNonFatalAnrs=", this.trackNonFatalAnrs, ", vitalsMonitorUpdateFrequency=");
            int i = this.vitalsMonitorUpdateFrequency;
            m.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "NEVER" : "RARE" : "AVERAGE" : "FREQUENT");
            m.append(", sessionListener=");
            m.append(this.sessionListener);
            m.append(", initialResourceIdentifier=");
            m.append(this.initialResourceIdentifier);
            m.append(", lastInteractionIdentifier=");
            m.append(this.lastInteractionIdentifier);
            m.append(", slowFramesConfiguration=");
            m.append(SlowFramesConfiguration.DEFAULT);
            m.append(", composeActionTrackingStrategy=");
            m.append(this.composeActionTrackingStrategy);
            m.append(", additionalConfig=");
            m.append(this.additionalConfig);
            m.append(", trackAnonymousUser=true, rumSessionTypeOverride=");
            m.append("null");
            m.append(", collectAccessibility=false, disableJankStats=false, insightsCollector=");
            m.append(this.insightsCollector);
            m.append(")");
            return m.toString();
        }
    }

    static {
        EmptyList emptyList = EmptyList.INSTANCE;
        NoOpInteractionPredicate noOpInteractionPredicate = new NoOpInteractionPredicate();
        ActivityViewTrackingStrategy activityViewTrackingStrategy = new ActivityViewTrackingStrategy();
        MainLooperLongTaskStrategy mainLooperLongTaskStrategy = new MainLooperLongTaskStrategy(100L);
        NoOpEventMapper noOpEventMapper = new NoOpEventMapper();
        NoOpEventMapper noOpEventMapper2 = new NoOpEventMapper();
        NoOpEventMapper noOpEventMapper3 = new NoOpEventMapper();
        NoOpEventMapper noOpEventMapper4 = new NoOpEventMapper();
        NoOpEventMapper noOpEventMapper5 = new NoOpEventMapper();
        NoOpEventMapper noOpEventMapper6 = new NoOpEventMapper();
        NoOpEventMapper noOpEventMapper7 = new NoOpEventMapper();
        NoOpEventMapper noOpEventMapper8 = new NoOpEventMapper();
        BuildSdkVersionProvider.Companion.getClass();
        boolean z = !BuildSdkVersionProvider.Companion.DEFAULT.isAtLeastR;
        NoOpRumSessionListener noOpRumSessionListener = new NoOpRumSessionListener();
        TimeBasedInitialResourceIdentifier timeBasedInitialResourceIdentifier = new TimeBasedInitialResourceIdentifier();
        TimeBasedInteractionIdentifier timeBasedInteractionIdentifier = new TimeBasedInteractionIdentifier();
        ErrorCode.Companion companion = new ErrorCode.Companion();
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        DEFAULT_RUM_CONFIG = new Configuration(100.0f, 20.0f, 20.0f, emptyList, noOpInteractionPredicate, activityViewTrackingStrategy, mainLooperLongTaskStrategy, noOpEventMapper, noOpEventMapper2, noOpEventMapper3, noOpEventMapper4, noOpEventMapper5, noOpEventMapper6, noOpEventMapper7, noOpEventMapper8, false, true, z, 2, noOpRumSessionListener, timeBasedInitialResourceIdentifier, timeBasedInteractionIdentifier, companion, emptyMap, new HurlStack(29));
    }

    public RumFeature(InternalSdkCore internalSdkCore, String str, Configuration configuration) {
        BuildSdkVersionProvider.Companion.getClass();
        BuildSdkVersionProvider$Companion$DEFAULT$1 buildSdkVersionProvider$Companion$DEFAULT$1 = BuildSdkVersionProvider.Companion.DEFAULT;
        str.getClass();
        configuration.getClass();
        this.sdkCore = internalSdkCore;
        this.applicationId = str;
        this.configuration = configuration;
        this.lateCrashReporterFactory = AnonymousClass1.INSTANCE;
        this.buildSdkVersionProvider = buildSdkVersionProvider$Companion$DEFAULT$1;
        this.dataWriter = new NoOpDataWriter();
        final int i = 0;
        this.initialized = new AtomicBoolean(false);
        this.viewTrackingStrategy = new e();
        this.actionTrackingStrategy = new GlideBuilder$1();
        final int i2 = 1;
        this.longTaskTrackingStrategy = new zzd(i2);
        this.cpuVitalMonitor = new NoOpVitalMonitor();
        this.memoryVitalMonitor = new NoOpVitalMonitor();
        this.frameRateVitalMonitor = new NoOpVitalMonitor();
        new AtomicReference(null);
        this.sessionListener = new NoOpRumSessionListener();
        this.vitalExecutorService = new NoOpScheduledExecutorService(0);
        this.initialResourceIdentifier = new CreateSessionRequest.Platform.Companion();
        this.lastInteractionIdentifier = new BinaryOp.Operator.Companion();
        this.accessibilitySnapshotManager = new GlideBuilder$1();
        this.batteryInfoProvider = new Transition.AnonymousClass1();
        this.displayInfoProvider = new CueEncoder(28);
        this.rumContextUpdateReceivers = new LinkedHashSet();
        this.insightsCollector = new HurlStack(29);
        this.lateCrashEventHandler$delegate = LazyKt.lazy(new Function0(this) { // from class: com.datadog.android.rum.internal.RumFeature$requestFactory$2
            public final /* synthetic */ RumFeature this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                RumFeature rumFeature = this.this$0;
                switch (i3) {
                    case 0:
                        rumFeature.configuration.getClass();
                        InternalSdkCore internalSdkCore2 = rumFeature.sdkCore;
                        return new RumRequestFactory(new n.b(new zzb(internalSdkCore2.getInternalLogger()), 11), internalSdkCore2.getInternalLogger());
                    default:
                        Function1 function1 = rumFeature.lateCrashReporterFactory;
                        InternalSdkCore internalSdkCore3 = rumFeature.sdkCore;
                        internalSdkCore3.getClass();
                        return (LateCrashReporter) function1.invoke(internalSdkCore3);
                }
            }
        });
        this.name = "rum";
        this.requestFactory$delegate = LazyKt.lazy(new Function0(this) { // from class: com.datadog.android.rum.internal.RumFeature$requestFactory$2
            public final /* synthetic */ RumFeature this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                RumFeature rumFeature = this.this$0;
                switch (i3) {
                    case 0:
                        rumFeature.configuration.getClass();
                        InternalSdkCore internalSdkCore2 = rumFeature.sdkCore;
                        return new RumRequestFactory(new n.b(new zzb(internalSdkCore2.getInternalLogger()), 11), internalSdkCore2.getInternalLogger());
                    default:
                        Function1 function1 = rumFeature.lateCrashReporterFactory;
                        InternalSdkCore internalSdkCore3 = rumFeature.sdkCore;
                        internalSdkCore3.getClass();
                        return (LateCrashReporter) function1.invoke(internalSdkCore3);
                }
            }
        });
        this.storageConfiguration = new FeatureStorageConfiguration(500, 524288L, 4194304L, 86400000L);
    }

    public final void consumeLastFatalAnr$dd_sdk_android_rum_release(ExecutorService executorService) {
        Object obj;
        InternalSdkCore internalSdkCore = this.sdkCore;
        executorService.getClass();
        Context context = this.appContext;
        ApplicationExitInfo applicationExitInfo = null;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appContext");
            throw null;
        }
        Object systemService = context.getSystemService("activity");
        systemService.getClass();
        try {
            List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) systemService).getHistoricalProcessExitReasons(null, 0, 0);
            historicalProcessExitReasons.getClass();
            Iterator<T> it = historicalProcessExitReasons.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (a$$ExternalSyntheticBUOutline0.m(obj).getReason() == 6) {
                        break;
                    }
                }
            }
            applicationExitInfo = a$$ExternalSyntheticBUOutline0.m(obj);
        } catch (RuntimeException e) {
            DBUtil.log$default(internalSdkCore.getInternalLogger(), 5, InternalLogger.Target.MAINTAINER, RumFeature$onInitialize$1.INSTANCE$9, e, false, 48);
        }
        if (applicationExitInfo == null) {
            return;
        }
        zzho.executeSafe(executorService, "Send fatal ANR", internalSdkCore.getInternalLogger(), new q4$$ExternalSyntheticLambda0(20, this, applicationExitInfo));
    }

    @Override // com.datadog.android.api.feature.Feature
    public final String getName() {
        return this.name;
    }

    @Override // com.datadog.android.api.feature.StorageBackedFeature
    public final RequestFactory getRequestFactory() {
        return (RequestFactory) this.requestFactory$delegate.getValue();
    }

    @Override // com.datadog.android.api.feature.StorageBackedFeature
    public final FeatureStorageConfiguration getStorageConfiguration() {
        return this.storageConfiguration;
    }

    public final void initializeVitalMonitor(VitalReader vitalReader, VitalMonitor vitalMonitor, long j) {
        ScheduledExecutorService scheduledExecutorService = this.vitalExecutorService;
        InternalSdkCore internalSdkCore = this.sdkCore;
        VitalReaderRunnable vitalReaderRunnable = new VitalReaderRunnable(internalSdkCore, vitalReader, vitalMonitor, scheduledExecutorService, j);
        internalSdkCore.setContextUpdateReceiver(vitalReaderRunnable);
        this.rumContextUpdateReceivers.add(vitalReaderRunnable);
        zzho.scheduleSafe(this.vitalExecutorService, "Vitals monitoring", j, this.sdkCore.getInternalLogger(), vitalReaderRunnable);
    }

    @Override // com.datadog.android.api.feature.Feature
    public final void onInitialize(Context context) {
        float f;
        FPSVitalListener fPSVitalListener;
        context.getClass();
        this.appContext = context;
        Configuration configuration = this.configuration;
        configuration.getClass();
        this.initialResourceIdentifier = configuration.initialResourceIdentifier;
        this.lastInteractionIdentifier = configuration.lastInteractionIdentifier;
        this.insightsCollector = configuration.insightsCollector;
        InternalSdkCore internalSdkCore = this.sdkCore;
        internalSdkCore.getClass();
        this.dataWriter = new RumDataWriter(new Box(2, new RumEventMapper(configuration.viewEventMapper, configuration.errorEventMapper, configuration.resourceEventMapper, configuration.actionEventMapper, configuration.longTaskEventMapper, configuration.vitalOperationStepEventMapper, configuration.vitalAppLaunchEventMapper, configuration.telemetryConfigurationMapper, internalSdkCore.getInternalLogger()), new RumEventSerializer(internalSdkCore.getInternalLogger())), new CoroutinesRoom.Companion(28), internalSdkCore);
        boolean isDeveloperModeEnabled = internalSdkCore.isDeveloperModeEnabled();
        InternalLogger.Target target = InternalLogger.Target.USER;
        if (isDeveloperModeEnabled) {
            DBUtil.log$default(internalSdkCore.getInternalLogger(), 3, target, RumFeature$onInitialize$1.INSTANCE, null, false, 56);
            f = 100.0f;
        } else {
            f = configuration.sampleRate;
        }
        this.sampleRate = f;
        this.telemetrySampleRate = configuration.telemetrySampleRate;
        this.telemetryConfigurationSampleRate = configuration.telemetryConfigurationSampleRate;
        this.backgroundEventTracking = configuration.backgroundEventTracking;
        this.trackFrustrations = configuration.trackFrustrations;
        this.batteryInfoProvider = new DefaultBatteryInfoProvider(context, internalSdkCore.getTimeProvider());
        this.displayInfoProvider = new DefaultDisplayInfoProvider(context, internalSdkCore.getInternalLogger());
        ViewTrackingStrategy viewTrackingStrategy = configuration.viewTrackingStrategy;
        if (viewTrackingStrategy != null) {
            this.viewTrackingStrategy = viewTrackingStrategy;
        }
        DatadogGesturesTracker datadogGesturesTracker = new DatadogGesturesTracker((JetpackViewAttributesProvider[]) ArraysKt___ArraysJvmKt.plus((JetpackViewAttributesProvider[]) configuration.touchTargetExtraAttributesProviders.toArray(new JetpackViewAttributesProvider[0]), new JetpackViewAttributesProvider[]{new JetpackViewAttributesProvider()}), configuration.interactionPredicate, configuration.composeActionTrackingStrategy, internalSdkCore.getInternalLogger());
        this.actionTrackingStrategy = ((BuildSdkVersionProvider$Companion$DEFAULT$1) this.buildSdkVersionProvider).isAtLeastQ ? new UserActionTrackingStrategyApi29(datadogGesturesTracker) : new UserActionTrackingStrategyLegacy(datadogGesturesTracker);
        TrackingStrategy trackingStrategy = configuration.longTaskTrackingStrategy;
        if (trackingStrategy != null) {
            this.longTaskTrackingStrategy = trackingStrategy;
        }
        int i = configuration.vitalsMonitorUpdateFrequency;
        if (i != 4) {
            this.vitalExecutorService = internalSdkCore.createScheduledExecutorService("rum-vital");
        }
        if (i != 4) {
            this.cpuVitalMonitor = new AggregatingVitalMonitor();
            initializeVitalMonitor(new CPUVitalReader(internalSdkCore.getInternalLogger()), this.cpuVitalMonitor, RumErrorSource$EnumUnboxingLocalUtility.getPeriodInMs(i));
        }
        if (i != 4) {
            this.memoryVitalMonitor = new AggregatingVitalMonitor();
            initializeVitalMonitor(new MemoryVitalReader(internalSdkCore.getInternalLogger()), this.memoryVitalMonitor, RumErrorSource$EnumUnboxingLocalUtility.getPeriodInMs(i));
        }
        Application application = context instanceof Application ? (Application) context : null;
        DBUtil.log$default(internalSdkCore.getInternalLogger(), 3, target, RumFeature$onInitialize$1.INSTANCE$10, null, false, 56);
        DefaultSlowFramesListener defaultSlowFramesListener = new DefaultSlowFramesListener(new Box(internalSdkCore.getInternalLogger(), 5), this.insightsCollector, internalSdkCore.getTimeProvider());
        this.slowFramesListener = defaultSlowFramesListener;
        if (i == 4) {
            fPSVitalListener = null;
        } else {
            AggregatingVitalMonitor aggregatingVitalMonitor = new AggregatingVitalMonitor();
            this.frameRateVitalMonitor = aggregatingVitalMonitor;
            fPSVitalListener = new FPSVitalListener(aggregatingVitalMonitor);
        }
        int i2 = 1;
        FrameStatesAggregator frameStatesAggregator = new FrameStatesAggregator(ArraysKt___ArraysKt.filterNotNull(new FrameStateListener[]{defaultSlowFramesListener, fPSVitalListener}), internalSdkCore.getInternalLogger());
        if (application != null) {
            application.registerActivityLifecycleCallbacks(frameStatesAggregator);
        }
        if (configuration.trackNonFatalAnrs) {
            ANRDetectorRunnable aNRDetectorRunnable = new ANRDetectorRunnable(internalSdkCore, new Handler(Looper.getMainLooper()));
            ExecutorService createSingleThreadExecutorService = internalSdkCore.createSingleThreadExecutorService("rum-anr-detection");
            this.anrDetectorExecutorService = createSingleThreadExecutorService;
            zzho.executeSafe(createSingleThreadExecutorService, "ANR detection", internalSdkCore.getInternalLogger(), aNRDetectorRunnable);
            this.anrDetectorRunnable = aNRDetectorRunnable;
        }
        this.actionTrackingStrategy.register(internalSdkCore, context);
        this.viewTrackingStrategy.register(internalSdkCore, context);
        this.longTaskTrackingStrategy.register(internalSdkCore, context);
        this.sessionListener = configuration.sessionListener;
        Context context2 = this.appContext;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appContext");
            throw null;
        }
        Context applicationContext = context2.getApplicationContext();
        applicationContext.getClass();
        AndroidSvg androidSvg = new AndroidSvg(this);
        BuildSdkVersionProvider.Companion.getClass();
        BuildSdkVersionProvider.Companion companion = BuildSdkVersionProvider.Companion.$$INSTANCE;
        this.rumAppStartupDetector = new RumAppStartupDetectorImpl((Application) applicationContext, new DatadogTracerAdapter.AnonymousClass1(internalSdkCore, i2), androidSvg);
        internalSdkCore.setEventReceiver(this.name, this);
        this.initialized.set(true);
    }

    @Override // com.datadog.android.api.feature.Feature
    public final void onStop() {
        this.sdkCore.removeEventReceiver(this.name);
        Iterator it = this.rumContextUpdateReceivers.iterator();
        while (it.hasNext()) {
            this.sdkCore.removeContextUpdateReceiver((VitalReaderRunnable) it.next());
        }
        this.rumContextUpdateReceivers.clear();
        Context context = this.appContext;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appContext");
            throw null;
        }
        this.actionTrackingStrategy.unregister(context);
        this.viewTrackingStrategy.unregister(context);
        this.longTaskTrackingStrategy.unregister(context);
        this.dataWriter = new NoOpDataWriter();
        this.viewTrackingStrategy = new e();
        this.actionTrackingStrategy = new GlideBuilder$1();
        this.longTaskTrackingStrategy = new zzd(1);
        this.cpuVitalMonitor = new NoOpVitalMonitor();
        this.memoryVitalMonitor = new NoOpVitalMonitor();
        this.frameRateVitalMonitor = new NoOpVitalMonitor();
        this.vitalExecutorService.shutdownNow();
        ExecutorService executorService = this.anrDetectorExecutorService;
        if (executorService != null) {
            executorService.shutdownNow();
        }
        ANRDetectorRunnable aNRDetectorRunnable = this.anrDetectorRunnable;
        if (aNRDetectorRunnable != null) {
            aNRDetectorRunnable.shouldStop = true;
        }
        this.vitalExecutorService = new NoOpScheduledExecutorService(0);
        this.sessionListener = new NoOpRumSessionListener();
        this.configuration.getClass();
        this.batteryInfoProvider.cleanup();
        this.batteryInfoProvider = new Transition.AnonymousClass1();
        this.displayInfoProvider.cleanup();
        this.displayInfoProvider = new CueEncoder(28);
        RumAppStartupDetectorImpl rumAppStartupDetectorImpl = this.rumAppStartupDetector;
        if (rumAppStartupDetectorImpl != null) {
            rumAppStartupDetectorImpl.application.unregisterActivityLifecycleCallbacks(rumAppStartupDetectorImpl);
        }
        this.rumAppStartupDetector = null;
        LinkedHashMap linkedHashMap = GlobalRumMonitor.registeredMonitors;
        InternalSdkCore internalSdkCore = this.sdkCore;
        internalSdkCore.getClass();
        LinkedHashMap linkedHashMap2 = GlobalRumMonitor.registeredMonitors;
        synchronized (linkedHashMap2) {
        }
        this.initialized.set(false);
    }
}
