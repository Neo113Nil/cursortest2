package ru.yandex.video.m3.ab.config;

import defpackage.jl40;
import defpackage.oo31;
import defpackage.unr0;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.ab.config.features.CodecInitializationConfig;
import ru.yandex.video.m3.ab.config.internal.InternalAbFlags;
import ru.yandex.video.m3.ab.config.internal.features.CodecInitializationRemoteFlag;
import ru.yandex.video.m3.ab.config.service.BooleanServiceFlag;
import ru.yandex.video.m3.ab.config.service.EnableHevcServiceFlag;
import ru.yandex.video.m3.ab.config.service.EnableNotDetachingEngineFromPlayingPlayerInListSDK;
import ru.yandex.video.m3.ab.config.service.IntServiceFlag;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b4\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b!\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010l\u001a\u00020\b2\b\u0010m\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010n\u001a\u00020\u000eH\u0016J\b\u0010o\u001a\u00020\u0003H\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0011\u0010\u001a\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0010R\u0011\u0010\u001c\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0010R\u0014\u0010\u001e\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\nR\u0011\u0010 \u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\nR\u0011\u0010\"\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\nR\u0011\u0010$\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\nR\u0015\u0010&\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010)\u001a\u0004\b'\u0010(R\u0011\u0010*\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\nR\u0011\u0010,\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\nR\u0011\u0010.\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\nR\u0011\u00100\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\nR\u0011\u00102\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\nR\u0011\u00104\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\nR\u0011\u00106\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\nR\u0011\u00108\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\nR\u0011\u0010:\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b;\u0010\u0010R\u0011\u0010<\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b=\u0010\u0010R\u0011\u0010>\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b?\u0010\nR\u0011\u0010@\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bA\u0010\nR\u0011\u0010B\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bC\u0010\nR\u0011\u0010D\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\bE\u0010\u0010R\u0017\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00030G¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u0011\u0010J\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bK\u0010\nR\u0011\u0010L\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\bM\u0010\u0010R\u0011\u0010N\u001a\u00020O¢\u0006\b\n\u0000\u001a\u0004\bP\u0010QR\u0011\u0010R\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bS\u0010\nR\u0011\u0010T\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bU\u0010\nR\u0011\u0010V\u001a\u00020O¢\u0006\b\n\u0000\u001a\u0004\bW\u0010QR\u0011\u0010X\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bY\u0010\nR\u0011\u0010Z\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b[\u0010\nR\u0011\u0010\\\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b]\u0010\u0010R\u0011\u0010^\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b_\u0010\nR\u0015\u0010`\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010)\u001a\u0004\ba\u0010(R\u0011\u0010b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bc\u0010\nR\u0011\u0010d\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\be\u0010\nR\u0011\u0010f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bg\u0010\nR\u0011\u0010h\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bi\u0010\nR\u0011\u0010j\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bk\u0010\n¨\u0006p"}, d2 = {"Lru/yandex/video/m3/ab/config/AbFlags;", "", Constants.KEY_SERVICE, "", "internalAbFlags", "Lru/yandex/video/m3/ab/config/internal/InternalAbFlags;", "(Ljava/lang/String;Lru/yandex/video/m3/ab/config/internal/InternalAbFlags;)V", "addAAExperimentMarkerToLogs", "", "getAddAAExperimentMarkerToLogs", "()Z", "addFallbackToAVCInListSDK", "getAddFallbackToAVCInListSDK", "backwardEngineInListSDK", "", "getBackwardEngineInListSDK", "()I", "codecInitializationConfig", "Lru/yandex/video/m3/ab/config/features/CodecInitializationConfig;", "getCodecInitializationConfig", "()Lru/yandex/video/m3/ab/config/features/CodecInitializationConfig;", "codecRecoverStrategy", "getCodecRecoverStrategy", "()Ljava/lang/String;", "codecRecoverStrategyAttempts", "getCodecRecoverStrategyAttempts", "codecTelemetryReportLoggerRecordsCount", "getCodecTelemetryReportLoggerRecordsCount", "degradationStepsMonoBitrateInListSDK", "getDegradationStepsMonoBitrateInListSDK", "disableCodecReuseInCaseOfCodecProfileOrLevelUpgrade", "getDisableCodecReuseInCaseOfCodecProfileOrLevelUpgrade$video_player_internalRelease", "disableRetryOnConnectionFailureInListSDK", "getDisableRetryOnConnectionFailureInListSDK", "disableTooEarlyMediaCodecNativeReleaseReturnWorkaround", "getDisableTooEarlyMediaCodecNativeReleaseReturnWorkaround", "doRetryForStreamResetException", "getDoRetryForStreamResetException", "enableAsyncDecoderQueue", "getEnableAsyncDecoderQueue", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "enableBroadcastReceiverForDebugViewInListSDK", "getEnableBroadcastReceiverForDebugViewInListSDK", "enableCodecTelemetryReportLogger", "getEnableCodecTelemetryReportLogger", "enableDebugViewInListSDK", "getEnableDebugViewInListSDK", "enableHevc", "getEnableHevc", "enableNotDetachingEngineFromPlayingPlayerInListSDK", "getEnableNotDetachingEngineFromPlayingPlayerInListSDK", "enableOptimizedPlayerRelease", "getEnableOptimizedPlayerRelease", "enableSelectMonoBitrateInListSDK", "getEnableSelectMonoBitrateInListSDK", "enableSurfaceCappingInListSDK", "getEnableSurfaceCappingInListSDK", "exceptionCountToDisablePoolIncreasingInListSDK", "getExceptionCountToDisablePoolIncreasingInListSDK", "forwardEngineInListSDK", "getForwardEngineInListSDK", "ignoreMaxHeightWithService", "getIgnoreMaxHeightWithService", "ignoreMinHeightWithService", "getIgnoreMinHeightWithService", "ignoreSeekOnSamePosition", "getIgnoreSeekOnSamePosition", "maxPoolSizeInListSDK", "getMaxPoolSizeInListSDK", "modelsNeedsSetOutputSurfaceWorkaround", "", "getModelsNeedsSetOutputSurfaceWorkaround", "()Ljava/util/List;", "performPlayerReleaseOnScope", "getPerformPlayerReleaseOnScope", "preloadCountInListSDK", "getPreloadCountInListSDK", "stuckStalledAlarmPeriodMs", "", "getStuckStalledAlarmPeriodMs", "()J", "stuckStalledEnabled", "getStuckStalledEnabled", "stuckStalledFatalOnlyIfShouldContinueLoadingIsFalse", "getStuckStalledFatalOnlyIfShouldContinueLoadingIsFalse", "stuckStalledMinimumBufferForAlertMs", "getStuckStalledMinimumBufferForAlertMs", "stuckStalledProduceJustNonFatalErrors", "getStuckStalledProduceJustNonFatalErrors", "stuckStalledWatchOnlySeekStalled", "getStuckStalledWatchOnlySeekStalled", "targetPoolSizeInListSDK", "getTargetPoolSizeInListSDK", "useDataSourceFactoryCreatorInListSDK", "getUseDataSourceFactoryCreatorInListSDK", "useLastBandwidthEstimate", "getUseLastBandwidthEstimate", "useMultiplatformBandwidthEstimator", "getUseMultiplatformBandwidthEstimator", "useMultiplatformBandwidthEstimatorWithPlatformSync", "getUseMultiplatformBandwidthEstimatorWithPlatformSync", "useNewAsyncLogLogicInEventTracker", "getUseNewAsyncLogLogicInEventTracker", "useNewLogicForAutoPlayDecisionWhileRecover", "getUseNewLogicForAutoPlayDecisionWhileRecover", "useSurfaceControl", "getUseSurfaceControl", "equals", "other", "hashCode", "toString", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AbFlags {
    public static final int $stable = 8;
    private final boolean addAAExperimentMarkerToLogs;
    private final boolean addFallbackToAVCInListSDK;
    private final int backwardEngineInListSDK;
    private final CodecInitializationConfig codecInitializationConfig;
    private final String codecRecoverStrategy;
    private final int codecRecoverStrategyAttempts;
    private final int codecTelemetryReportLoggerRecordsCount;
    private final int degradationStepsMonoBitrateInListSDK;
    private final boolean disableCodecReuseInCaseOfCodecProfileOrLevelUpgrade;
    private final boolean disableRetryOnConnectionFailureInListSDK;
    private final boolean disableTooEarlyMediaCodecNativeReleaseReturnWorkaround;
    private final boolean doRetryForStreamResetException;
    private final Boolean enableAsyncDecoderQueue;
    private final boolean enableBroadcastReceiverForDebugViewInListSDK;
    private final boolean enableCodecTelemetryReportLogger;
    private final boolean enableDebugViewInListSDK;
    private final boolean enableHevc;
    private final boolean enableNotDetachingEngineFromPlayingPlayerInListSDK;
    private final boolean enableOptimizedPlayerRelease;
    private final boolean enableSelectMonoBitrateInListSDK;
    private final boolean enableSurfaceCappingInListSDK;
    private final int exceptionCountToDisablePoolIncreasingInListSDK;
    private final int forwardEngineInListSDK;
    private final boolean ignoreMaxHeightWithService;
    private final boolean ignoreMinHeightWithService;
    private final boolean ignoreSeekOnSamePosition;
    private final int maxPoolSizeInListSDK;
    private final List<String> modelsNeedsSetOutputSurfaceWorkaround;
    private final boolean performPlayerReleaseOnScope;
    private final int preloadCountInListSDK;
    private final long stuckStalledAlarmPeriodMs;
    private final boolean stuckStalledEnabled;
    private final boolean stuckStalledFatalOnlyIfShouldContinueLoadingIsFalse;
    private final long stuckStalledMinimumBufferForAlertMs;
    private final boolean stuckStalledProduceJustNonFatalErrors;
    private final boolean stuckStalledWatchOnlySeekStalled;
    private final int targetPoolSizeInListSDK;
    private final boolean useDataSourceFactoryCreatorInListSDK;
    private final Boolean useLastBandwidthEstimate;
    private final boolean useMultiplatformBandwidthEstimator;
    private final boolean useMultiplatformBandwidthEstimatorWithPlatformSync;
    private final boolean useNewAsyncLogLogicInEventTracker;
    private final boolean useNewLogicForAutoPlayDecisionWhileRecover;
    private final boolean useSurfaceControl;

    /* JADX WARN: Multi-variable type inference failed */
    public AbFlags(String str, InternalAbFlags internalAbFlags) {
        Boolean addAAExperimentMarkerToLogs = internalAbFlags.getAddAAExperimentMarkerToLogs();
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object[] objArr9 = 0;
        Object[] objArr10 = 0;
        Object[] objArr11 = 0;
        Object[] objArr12 = 0;
        Object[] objArr13 = 0;
        Object[] objArr14 = 0;
        Object[] objArr15 = 0;
        this.addAAExperimentMarkerToLogs = addAAExperimentMarkerToLogs != null ? addAAExperimentMarkerToLogs.booleanValue() : false;
        Boolean enableOptimizedPlayerRelease = internalAbFlags.getEnableOptimizedPlayerRelease();
        this.enableOptimizedPlayerRelease = enableOptimizedPlayerRelease != null ? enableOptimizedPlayerRelease.booleanValue() : true;
        EnableHevcServiceFlag enableHevcWithService = internalAbFlags.getEnableHevcWithService();
        Object[] objArr16 = 0;
        Object[] objArr17 = 0;
        Object[] objArr18 = 0;
        Object[] objArr19 = 0;
        Object[] objArr20 = 0;
        Object[] objArr21 = 0;
        Object[] objArr22 = 0;
        this.enableHevc = (enableHevcWithService == null ? new EnableHevcServiceFlag(objArr15 == true ? 1 : 0, objArr14 == true ? 1 : 0, r3, 0 == true ? 1 : 0) : enableHevcWithService).getFlagValue$video_player_internalRelease(str).booleanValue();
        BooleanServiceFlag ignoreMaxHeightWithService = internalAbFlags.getIgnoreMaxHeightWithService();
        this.ignoreMaxHeightWithService = (ignoreMaxHeightWithService == null ? new BooleanServiceFlag(objArr13 == true ? 1 : 0, objArr12 == true ? 1 : 0, r3, objArr22 == true ? 1 : 0) : ignoreMaxHeightWithService).getFlagValue$video_player_internalRelease(str).booleanValue();
        BooleanServiceFlag ignoreMinHeightWithService = internalAbFlags.getIgnoreMinHeightWithService();
        this.ignoreMinHeightWithService = (ignoreMinHeightWithService == null ? new BooleanServiceFlag(objArr11 == true ? 1 : 0, objArr10 == true ? 1 : 0, r3, objArr21 == true ? 1 : 0) : ignoreMinHeightWithService).getFlagValue$video_player_internalRelease(str).booleanValue();
        BooleanServiceFlag enableSurfaceCappingInListSDK = internalAbFlags.getEnableSurfaceCappingInListSDK();
        this.enableSurfaceCappingInListSDK = (enableSurfaceCappingInListSDK == null ? new BooleanServiceFlag(objArr9 == true ? 1 : 0, objArr8 == true ? 1 : 0, r3, objArr20 == true ? 1 : 0) : enableSurfaceCappingInListSDK).getFlagValue$video_player_internalRelease(str).booleanValue();
        BooleanServiceFlag enableSelectMonoBitrateInListSDK = internalAbFlags.getEnableSelectMonoBitrateInListSDK();
        this.enableSelectMonoBitrateInListSDK = (enableSelectMonoBitrateInListSDK == null ? new BooleanServiceFlag(objArr7 == true ? 1 : 0, objArr6 == true ? 1 : 0, r3, objArr19 == true ? 1 : 0) : enableSelectMonoBitrateInListSDK).getFlagValue$video_player_internalRelease(str).booleanValue();
        IntServiceFlag degradationStepsMonoBitrateInListSDK = internalAbFlags.getDegradationStepsMonoBitrateInListSDK();
        this.degradationStepsMonoBitrateInListSDK = (degradationStepsMonoBitrateInListSDK == null ? new IntServiceFlag(objArr5 == true ? 1 : 0, objArr4 == true ? 1 : 0, r3, objArr18 == true ? 1 : 0) : degradationStepsMonoBitrateInListSDK).getFlagValue$video_player_internalRelease(str).intValue();
        IntServiceFlag preloadCountInListSDK = internalAbFlags.getPreloadCountInListSDK();
        this.preloadCountInListSDK = (preloadCountInListSDK == null ? new IntServiceFlag(4, objArr3 == true ? 1 : 0, 2, objArr17 == true ? 1 : 0) : preloadCountInListSDK).getFlagValue$video_player_internalRelease(str).intValue();
        EnableNotDetachingEngineFromPlayingPlayerInListSDK enableNotDetachingEngineFromPlayingPlayerInListSDK = internalAbFlags.getEnableNotDetachingEngineFromPlayingPlayerInListSDK();
        this.enableNotDetachingEngineFromPlayingPlayerInListSDK = (enableNotDetachingEngineFromPlayingPlayerInListSDK == null ? new EnableNotDetachingEngineFromPlayingPlayerInListSDK(objArr2 == true ? 1 : 0, objArr == true ? 1 : 0, r3, objArr16 == true ? 1 : 0) : enableNotDetachingEngineFromPlayingPlayerInListSDK).getFlagValue$video_player_internalRelease(str).booleanValue();
        Boolean disableRetryOnConnectionFailureInListSDK = internalAbFlags.getDisableRetryOnConnectionFailureInListSDK();
        this.disableRetryOnConnectionFailureInListSDK = disableRetryOnConnectionFailureInListSDK != null ? disableRetryOnConnectionFailureInListSDK.booleanValue() : false;
        Boolean addFallbackToAVCInListSDK = internalAbFlags.getAddFallbackToAVCInListSDK();
        this.addFallbackToAVCInListSDK = addFallbackToAVCInListSDK != null ? addFallbackToAVCInListSDK.booleanValue() : false;
        Boolean enableDebugViewInListSDK = internalAbFlags.getEnableDebugViewInListSDK();
        this.enableDebugViewInListSDK = enableDebugViewInListSDK != null ? enableDebugViewInListSDK.booleanValue() : false;
        Boolean enableBroadcastReceiverForDebugViewInListSDK = internalAbFlags.getEnableBroadcastReceiverForDebugViewInListSDK();
        this.enableBroadcastReceiverForDebugViewInListSDK = enableBroadcastReceiverForDebugViewInListSDK != null ? enableBroadcastReceiverForDebugViewInListSDK.booleanValue() : false;
        Integer targetPoolSizeInListSDK = internalAbFlags.getTargetPoolSizeInListSDK();
        this.targetPoolSizeInListSDK = targetPoolSizeInListSDK != null ? targetPoolSizeInListSDK.intValue() : 2;
        Integer maxPoolSizeInListSDK = internalAbFlags.getMaxPoolSizeInListSDK();
        this.maxPoolSizeInListSDK = maxPoolSizeInListSDK != null ? maxPoolSizeInListSDK.intValue() : 2;
        Integer exceptionCountToDisablePoolIncreasingInListSDK = internalAbFlags.getExceptionCountToDisablePoolIncreasingInListSDK();
        this.exceptionCountToDisablePoolIncreasingInListSDK = exceptionCountToDisablePoolIncreasingInListSDK != null ? exceptionCountToDisablePoolIncreasingInListSDK.intValue() : 0;
        Integer forwardEngineInListSDK = internalAbFlags.getForwardEngineInListSDK();
        this.forwardEngineInListSDK = forwardEngineInListSDK != null ? forwardEngineInListSDK.intValue() : 2;
        Integer backwardEngineInListSDK = internalAbFlags.getBackwardEngineInListSDK();
        this.backwardEngineInListSDK = backwardEngineInListSDK != null ? backwardEngineInListSDK.intValue() : 0;
        Boolean useDataSourceFactoryCreatorInListSDK = internalAbFlags.getUseDataSourceFactoryCreatorInListSDK();
        this.useDataSourceFactoryCreatorInListSDK = useDataSourceFactoryCreatorInListSDK != null ? useDataSourceFactoryCreatorInListSDK.booleanValue() : false;
        Boolean useNewAsyncLogLogicInEventTracker = internalAbFlags.getUseNewAsyncLogLogicInEventTracker();
        this.useNewAsyncLogLogicInEventTracker = useNewAsyncLogLogicInEventTracker != null ? useNewAsyncLogLogicInEventTracker.booleanValue() : true;
        Boolean useMultiplatformBandwidthEstimator = internalAbFlags.getUseMultiplatformBandwidthEstimator();
        this.useMultiplatformBandwidthEstimator = useMultiplatformBandwidthEstimator != null ? useMultiplatformBandwidthEstimator.booleanValue() : false;
        Boolean useMultiplatformBandwidthEstimatorWithPlatformSync = internalAbFlags.getUseMultiplatformBandwidthEstimatorWithPlatformSync();
        this.useMultiplatformBandwidthEstimatorWithPlatformSync = useMultiplatformBandwidthEstimatorWithPlatformSync != null ? useMultiplatformBandwidthEstimatorWithPlatformSync.booleanValue() : false;
        Boolean enableCodecTelemetryReportLogger = internalAbFlags.getEnableCodecTelemetryReportLogger();
        this.enableCodecTelemetryReportLogger = enableCodecTelemetryReportLogger != null ? enableCodecTelemetryReportLogger.booleanValue() : false;
        Integer codecTelemetryReportLoggerRecordsCount = internalAbFlags.getCodecTelemetryReportLoggerRecordsCount();
        this.codecTelemetryReportLoggerRecordsCount = codecTelemetryReportLoggerRecordsCount != null ? codecTelemetryReportLoggerRecordsCount.intValue() : 50;
        String codecRecoverStrategy = internalAbFlags.getCodecRecoverStrategy();
        this.codecRecoverStrategy = codecRecoverStrategy == null ? "DEFAULT" : codecRecoverStrategy;
        Integer codecRecoverStrategyAttempts = internalAbFlags.getCodecRecoverStrategyAttempts();
        this.codecRecoverStrategyAttempts = codecRecoverStrategyAttempts != null ? codecRecoverStrategyAttempts.intValue() : 3;
        CodecInitializationRemoteFlag codecInitializationRemoteFlag = internalAbFlags.getCodecInitializationRemoteFlag();
        this.codecInitializationConfig = new CodecInitializationConfig(codecInitializationRemoteFlag == null ? new CodecInitializationRemoteFlag(false, 0, 0L, false, 15, (DefaultConstructorMarker) null) : codecInitializationRemoteFlag);
        Boolean disableTooEarlyMediaCodecNativeReleaseReturnWorkaround = internalAbFlags.getDisableTooEarlyMediaCodecNativeReleaseReturnWorkaround();
        this.disableTooEarlyMediaCodecNativeReleaseReturnWorkaround = disableTooEarlyMediaCodecNativeReleaseReturnWorkaround != null ? disableTooEarlyMediaCodecNativeReleaseReturnWorkaround.booleanValue() : true;
        Boolean useSurfaceControl = internalAbFlags.getUseSurfaceControl();
        this.useSurfaceControl = useSurfaceControl != null ? useSurfaceControl.booleanValue() : false;
        Boolean doRetryForStreamResetException = internalAbFlags.getDoRetryForStreamResetException();
        this.doRetryForStreamResetException = doRetryForStreamResetException != null ? doRetryForStreamResetException.booleanValue() : false;
        Boolean performPlayerReleaseOnScope = internalAbFlags.getPerformPlayerReleaseOnScope();
        this.performPlayerReleaseOnScope = performPlayerReleaseOnScope != null ? performPlayerReleaseOnScope.booleanValue() : false;
        Boolean useNewLogicForAutoPlayDecisionWhileRecover = internalAbFlags.getUseNewLogicForAutoPlayDecisionWhileRecover();
        this.useNewLogicForAutoPlayDecisionWhileRecover = useNewLogicForAutoPlayDecisionWhileRecover != null ? useNewLogicForAutoPlayDecisionWhileRecover.booleanValue() : false;
        List<String> modelsNeedsSetOutputSurfaceWorkaround = internalAbFlags.getModelsNeedsSetOutputSurfaceWorkaround();
        this.modelsNeedsSetOutputSurfaceWorkaround = modelsNeedsSetOutputSurfaceWorkaround == null ? EmptyList.a : modelsNeedsSetOutputSurfaceWorkaround;
        Boolean enableAsyncDecoderQueue = internalAbFlags.getEnableAsyncDecoderQueue();
        this.enableAsyncDecoderQueue = enableAsyncDecoderQueue == null ? null : enableAsyncDecoderQueue;
        Boolean disableCodecReuseInCaseOfCodecProfileOrLevelUpgrade = internalAbFlags.getDisableCodecReuseInCaseOfCodecProfileOrLevelUpgrade();
        this.disableCodecReuseInCaseOfCodecProfileOrLevelUpgrade = disableCodecReuseInCaseOfCodecProfileOrLevelUpgrade != null ? disableCodecReuseInCaseOfCodecProfileOrLevelUpgrade.booleanValue() : false;
        Boolean useLastBandwidthEstimate = internalAbFlags.getUseLastBandwidthEstimate();
        this.useLastBandwidthEstimate = useLastBandwidthEstimate != null ? useLastBandwidthEstimate : null;
        this.ignoreSeekOnSamePosition = internalAbFlags.getIgnoreSeekOnSamePosition();
        this.stuckStalledEnabled = internalAbFlags.getStuckStalledEnabled();
        this.stuckStalledMinimumBufferForAlertMs = internalAbFlags.getStuckStalledMinimumBufferForAlertMs();
        this.stuckStalledAlarmPeriodMs = internalAbFlags.getStuckStalledAlarmPeriodMs();
        this.stuckStalledFatalOnlyIfShouldContinueLoadingIsFalse = internalAbFlags.getStuckStalledFatalOnlyIfShouldContinueLoadingIsFalse();
        this.stuckStalledProduceJustNonFatalErrors = internalAbFlags.getStuckStalledProduceJustNonFatalErrors();
        this.stuckStalledWatchOnlySeekStalled = internalAbFlags.getStuckStalledWatchOnlySeekStalled();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!AbFlags.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        AbFlags abFlags = (AbFlags) other;
        return this.addAAExperimentMarkerToLogs == abFlags.addAAExperimentMarkerToLogs && this.enableOptimizedPlayerRelease == abFlags.enableOptimizedPlayerRelease && this.enableHevc == abFlags.enableHevc && this.ignoreMaxHeightWithService == abFlags.ignoreMaxHeightWithService && this.ignoreMinHeightWithService == abFlags.ignoreMinHeightWithService && this.enableSurfaceCappingInListSDK == abFlags.enableSurfaceCappingInListSDK && this.enableSelectMonoBitrateInListSDK == abFlags.enableSelectMonoBitrateInListSDK && this.degradationStepsMonoBitrateInListSDK == abFlags.degradationStepsMonoBitrateInListSDK && this.preloadCountInListSDK == abFlags.preloadCountInListSDK && this.enableNotDetachingEngineFromPlayingPlayerInListSDK == abFlags.enableNotDetachingEngineFromPlayingPlayerInListSDK && this.disableRetryOnConnectionFailureInListSDK == abFlags.disableRetryOnConnectionFailureInListSDK && this.addFallbackToAVCInListSDK == abFlags.addFallbackToAVCInListSDK && this.enableDebugViewInListSDK == abFlags.enableDebugViewInListSDK && this.enableBroadcastReceiverForDebugViewInListSDK == abFlags.enableBroadcastReceiverForDebugViewInListSDK && this.targetPoolSizeInListSDK == abFlags.targetPoolSizeInListSDK && this.maxPoolSizeInListSDK == abFlags.maxPoolSizeInListSDK && this.exceptionCountToDisablePoolIncreasingInListSDK == abFlags.exceptionCountToDisablePoolIncreasingInListSDK && this.forwardEngineInListSDK == abFlags.forwardEngineInListSDK && this.backwardEngineInListSDK == abFlags.backwardEngineInListSDK && this.useDataSourceFactoryCreatorInListSDK == abFlags.useDataSourceFactoryCreatorInListSDK && this.useNewAsyncLogLogicInEventTracker == abFlags.useNewAsyncLogLogicInEventTracker && this.useMultiplatformBandwidthEstimator == abFlags.useMultiplatformBandwidthEstimator && this.useMultiplatformBandwidthEstimatorWithPlatformSync == abFlags.useMultiplatformBandwidthEstimatorWithPlatformSync && this.enableCodecTelemetryReportLogger == abFlags.enableCodecTelemetryReportLogger && this.codecTelemetryReportLoggerRecordsCount == abFlags.codecTelemetryReportLoggerRecordsCount && this.codecRecoverStrategyAttempts == abFlags.codecRecoverStrategyAttempts && this.disableTooEarlyMediaCodecNativeReleaseReturnWorkaround == abFlags.disableTooEarlyMediaCodecNativeReleaseReturnWorkaround && this.useSurfaceControl == abFlags.useSurfaceControl && this.doRetryForStreamResetException == abFlags.doRetryForStreamResetException && this.performPlayerReleaseOnScope == abFlags.performPlayerReleaseOnScope && this.useNewLogicForAutoPlayDecisionWhileRecover == abFlags.useNewLogicForAutoPlayDecisionWhileRecover && jl40.l(this.enableAsyncDecoderQueue, abFlags.enableAsyncDecoderQueue) && this.disableCodecReuseInCaseOfCodecProfileOrLevelUpgrade == abFlags.disableCodecReuseInCaseOfCodecProfileOrLevelUpgrade && jl40.l(this.useLastBandwidthEstimate, abFlags.useLastBandwidthEstimate) && jl40.l(this.codecRecoverStrategy, abFlags.codecRecoverStrategy) && jl40.l(this.codecInitializationConfig, abFlags.codecInitializationConfig) && jl40.l(this.modelsNeedsSetOutputSurfaceWorkaround, abFlags.modelsNeedsSetOutputSurfaceWorkaround);
    }

    public final boolean getAddAAExperimentMarkerToLogs() {
        return this.addAAExperimentMarkerToLogs;
    }

    public final boolean getAddFallbackToAVCInListSDK() {
        return this.addFallbackToAVCInListSDK;
    }

    public final int getBackwardEngineInListSDK() {
        return this.backwardEngineInListSDK;
    }

    public final CodecInitializationConfig getCodecInitializationConfig() {
        return this.codecInitializationConfig;
    }

    public final String getCodecRecoverStrategy() {
        return this.codecRecoverStrategy;
    }

    public final int getCodecRecoverStrategyAttempts() {
        return this.codecRecoverStrategyAttempts;
    }

    public final int getCodecTelemetryReportLoggerRecordsCount() {
        return this.codecTelemetryReportLoggerRecordsCount;
    }

    public final int getDegradationStepsMonoBitrateInListSDK() {
        return this.degradationStepsMonoBitrateInListSDK;
    }

    /* renamed from: getDisableCodecReuseInCaseOfCodecProfileOrLevelUpgrade$video_player_internalRelease, reason: from getter */
    public final boolean getDisableCodecReuseInCaseOfCodecProfileOrLevelUpgrade() {
        return this.disableCodecReuseInCaseOfCodecProfileOrLevelUpgrade;
    }

    public final boolean getDisableRetryOnConnectionFailureInListSDK() {
        return this.disableRetryOnConnectionFailureInListSDK;
    }

    public final boolean getDisableTooEarlyMediaCodecNativeReleaseReturnWorkaround() {
        return this.disableTooEarlyMediaCodecNativeReleaseReturnWorkaround;
    }

    public final boolean getDoRetryForStreamResetException() {
        return this.doRetryForStreamResetException;
    }

    public final Boolean getEnableAsyncDecoderQueue() {
        return this.enableAsyncDecoderQueue;
    }

    public final boolean getEnableBroadcastReceiverForDebugViewInListSDK() {
        return this.enableBroadcastReceiverForDebugViewInListSDK;
    }

    public final boolean getEnableCodecTelemetryReportLogger() {
        return this.enableCodecTelemetryReportLogger;
    }

    public final boolean getEnableDebugViewInListSDK() {
        return this.enableDebugViewInListSDK;
    }

    public final boolean getEnableHevc() {
        return this.enableHevc;
    }

    public final boolean getEnableNotDetachingEngineFromPlayingPlayerInListSDK() {
        return this.enableNotDetachingEngineFromPlayingPlayerInListSDK;
    }

    public final boolean getEnableOptimizedPlayerRelease() {
        return this.enableOptimizedPlayerRelease;
    }

    public final boolean getEnableSelectMonoBitrateInListSDK() {
        return this.enableSelectMonoBitrateInListSDK;
    }

    public final boolean getEnableSurfaceCappingInListSDK() {
        return this.enableSurfaceCappingInListSDK;
    }

    public final int getExceptionCountToDisablePoolIncreasingInListSDK() {
        return this.exceptionCountToDisablePoolIncreasingInListSDK;
    }

    public final int getForwardEngineInListSDK() {
        return this.forwardEngineInListSDK;
    }

    public final boolean getIgnoreMaxHeightWithService() {
        return this.ignoreMaxHeightWithService;
    }

    public final boolean getIgnoreMinHeightWithService() {
        return this.ignoreMinHeightWithService;
    }

    public final boolean getIgnoreSeekOnSamePosition() {
        return this.ignoreSeekOnSamePosition;
    }

    public final int getMaxPoolSizeInListSDK() {
        return this.maxPoolSizeInListSDK;
    }

    public final List<String> getModelsNeedsSetOutputSurfaceWorkaround() {
        return this.modelsNeedsSetOutputSurfaceWorkaround;
    }

    public final boolean getPerformPlayerReleaseOnScope() {
        return this.performPlayerReleaseOnScope;
    }

    public final int getPreloadCountInListSDK() {
        return this.preloadCountInListSDK;
    }

    public final long getStuckStalledAlarmPeriodMs() {
        return this.stuckStalledAlarmPeriodMs;
    }

    public final boolean getStuckStalledEnabled() {
        return this.stuckStalledEnabled;
    }

    public final boolean getStuckStalledFatalOnlyIfShouldContinueLoadingIsFalse() {
        return this.stuckStalledFatalOnlyIfShouldContinueLoadingIsFalse;
    }

    public final long getStuckStalledMinimumBufferForAlertMs() {
        return this.stuckStalledMinimumBufferForAlertMs;
    }

    public final boolean getStuckStalledProduceJustNonFatalErrors() {
        return this.stuckStalledProduceJustNonFatalErrors;
    }

    public final boolean getStuckStalledWatchOnlySeekStalled() {
        return this.stuckStalledWatchOnlySeekStalled;
    }

    public final int getTargetPoolSizeInListSDK() {
        return this.targetPoolSizeInListSDK;
    }

    public final boolean getUseDataSourceFactoryCreatorInListSDK() {
        return this.useDataSourceFactoryCreatorInListSDK;
    }

    public final Boolean getUseLastBandwidthEstimate() {
        return this.useLastBandwidthEstimate;
    }

    public final boolean getUseMultiplatformBandwidthEstimator() {
        return this.useMultiplatformBandwidthEstimator;
    }

    public final boolean getUseMultiplatformBandwidthEstimatorWithPlatformSync() {
        return this.useMultiplatformBandwidthEstimatorWithPlatformSync;
    }

    public final boolean getUseNewAsyncLogLogicInEventTracker() {
        return this.useNewAsyncLogLogicInEventTracker;
    }

    public final boolean getUseNewLogicForAutoPlayDecisionWhileRecover() {
        return this.useNewLogicForAutoPlayDecisionWhileRecover;
    }

    public final boolean getUseSurfaceControl() {
        return this.useSurfaceControl;
    }

    public int hashCode() {
        int e = unr0.e(unr0.e(unr0.e(unr0.e(unr0.e((((unr0.e(unr0.e(unr0.e(unr0.e(unr0.e((((((((((unr0.e(unr0.e(unr0.e(unr0.e(unr0.e((((unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(Boolean.hashCode(this.addAAExperimentMarkerToLogs) * 31, 31, this.enableOptimizedPlayerRelease), 31, this.enableHevc), 31, this.ignoreMaxHeightWithService), 31, this.ignoreMinHeightWithService), 31, this.enableSurfaceCappingInListSDK), 31, this.enableSelectMonoBitrateInListSDK) + this.degradationStepsMonoBitrateInListSDK) * 31) + this.preloadCountInListSDK) * 31, 31, this.enableNotDetachingEngineFromPlayingPlayerInListSDK), 31, this.disableRetryOnConnectionFailureInListSDK), 31, this.addFallbackToAVCInListSDK), 31, this.enableDebugViewInListSDK), 31, this.enableBroadcastReceiverForDebugViewInListSDK) + this.targetPoolSizeInListSDK) * 31) + this.maxPoolSizeInListSDK) * 31) + this.exceptionCountToDisablePoolIncreasingInListSDK) * 31) + this.forwardEngineInListSDK) * 31) + this.backwardEngineInListSDK) * 31, 31, this.useDataSourceFactoryCreatorInListSDK), 31, this.useNewAsyncLogLogicInEventTracker), 31, this.useMultiplatformBandwidthEstimator), 31, this.useMultiplatformBandwidthEstimatorWithPlatformSync), 31, this.enableCodecTelemetryReportLogger) + this.codecTelemetryReportLoggerRecordsCount) * 31) + this.codecRecoverStrategyAttempts) * 31, 31, this.disableTooEarlyMediaCodecNativeReleaseReturnWorkaround), 31, this.useSurfaceControl), 31, this.doRetryForStreamResetException), 31, this.performPlayerReleaseOnScope), 31, this.useNewLogicForAutoPlayDecisionWhileRecover);
        Boolean bool = this.enableAsyncDecoderQueue;
        int e2 = unr0.e((e + (bool != null ? bool.hashCode() : 0)) * 31, 31, this.disableCodecReuseInCaseOfCodecProfileOrLevelUpgrade);
        Boolean bool2 = this.useLastBandwidthEstimate;
        return this.modelsNeedsSetOutputSurfaceWorkaround.hashCode() + ((this.codecInitializationConfig.hashCode() + unr0.b((e2 + (bool2 != null ? bool2.hashCode() : 0)) * 31, 31, this.codecRecoverStrategy)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AbFlags(addAAExperimentMarkerToLogs=");
        sb.append(this.addAAExperimentMarkerToLogs);
        sb.append(", enableOptimizedPlayerRelease=");
        sb.append(this.enableOptimizedPlayerRelease);
        sb.append(", enableHevc=");
        sb.append(this.enableHevc);
        sb.append(", ignoreMaxHeightWithService=");
        sb.append(this.ignoreMaxHeightWithService);
        sb.append(", ignoreMinHeightWithService=");
        sb.append(this.ignoreMinHeightWithService);
        sb.append(", enableSurfaceCappingInListSDK=");
        sb.append(this.enableSurfaceCappingInListSDK);
        sb.append(", enableSelectMonoBitrateInListSDK=");
        sb.append(this.enableSelectMonoBitrateInListSDK);
        sb.append(", degradationStepsMonoBitrateInListSDK=");
        sb.append(this.degradationStepsMonoBitrateInListSDK);
        sb.append(", preloadCountInListSDK=");
        sb.append(this.preloadCountInListSDK);
        sb.append(", enableNotDetachingEngineFromPlayingPlayerInListSDK=");
        sb.append(this.enableNotDetachingEngineFromPlayingPlayerInListSDK);
        sb.append(", disableRetryOnConnectionFailureInListSDK=");
        sb.append(this.disableRetryOnConnectionFailureInListSDK);
        sb.append(", addFallbackToAVCInListSDK=");
        sb.append(this.addFallbackToAVCInListSDK);
        sb.append(", enableDebugViewInListSDK=");
        sb.append(this.enableDebugViewInListSDK);
        sb.append(", enableBroadcastReceiverForDebugViewInListSDK=");
        sb.append(this.enableBroadcastReceiverForDebugViewInListSDK);
        sb.append(", targetPoolSizeInListSDK=");
        sb.append(this.targetPoolSizeInListSDK);
        sb.append(", maxPoolSizeInListSDK=");
        sb.append(this.maxPoolSizeInListSDK);
        sb.append(", exceptionCountToDisablePoolIncreasingInListSDK=");
        sb.append(this.exceptionCountToDisablePoolIncreasingInListSDK);
        sb.append(", forwardEngineInListSDK=");
        sb.append(this.forwardEngineInListSDK);
        sb.append(", backwardEngineInListSDK=");
        sb.append(this.backwardEngineInListSDK);
        sb.append(", useDataSourceFactoryCreatorInListSDK=");
        sb.append(this.useDataSourceFactoryCreatorInListSDK);
        sb.append(", useNewAsyncLogLogicInEventTracker=");
        sb.append(this.useNewAsyncLogLogicInEventTracker);
        sb.append(", useMultiplatformBandwidthEstimator=");
        sb.append(this.useMultiplatformBandwidthEstimator);
        sb.append(", useMultiplatformBandwidthEstimatorWithPlatformSync=");
        sb.append(this.useMultiplatformBandwidthEstimatorWithPlatformSync);
        sb.append(", enableCodecTelemetryReportLogger=");
        sb.append(this.enableCodecTelemetryReportLogger);
        sb.append(", codecTelemetryReportLoggerRecordsCount=");
        sb.append(this.codecTelemetryReportLoggerRecordsCount);
        sb.append(", codecRecoverStrategy='");
        sb.append(this.codecRecoverStrategy);
        sb.append("', codecRecoverStrategyAttempts=");
        sb.append(this.codecRecoverStrategyAttempts);
        sb.append(", codecInitializationConfig=");
        sb.append(this.codecInitializationConfig);
        sb.append(", disableTooEarlyMediaCodecNativeReleaseReturnWorkaround=");
        sb.append(this.disableTooEarlyMediaCodecNativeReleaseReturnWorkaround);
        sb.append(", useSurfaceControl=");
        sb.append(this.useSurfaceControl);
        sb.append(", doRetryForStreamResetException=");
        sb.append(this.doRetryForStreamResetException);
        sb.append(", performPlayerReleaseOnScope=");
        sb.append(this.performPlayerReleaseOnScope);
        sb.append(", useNewLogicForAutoPlayDecisionWhileRecover=");
        sb.append(this.useNewLogicForAutoPlayDecisionWhileRecover);
        sb.append(", modelsNeedsSetOutputSurfaceWorkaround=");
        sb.append(this.modelsNeedsSetOutputSurfaceWorkaround);
        sb.append(", enableAsyncDecoderQueue=");
        sb.append(this.enableAsyncDecoderQueue);
        sb.append(", disableCodecReuseInCaseOfCodecProfileOrLevelUpgrade=");
        sb.append(this.disableCodecReuseInCaseOfCodecProfileOrLevelUpgrade);
        sb.append(", useLastBandwidthEstimate=");
        return oo31.i(sb, this.useLastBandwidthEstimate, ')');
    }
}
