package ru.yandex.video.m3.player.parameters;

import android.os.Looper;
import defpackage.jl40;
import defpackage.qv10;
import defpackage.tls;
import defpackage.unr0;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.player.parameters.PlayerDelegateParameters;
import ru.yandex.video.m3.player.provider.TrackSelectionRestrictionsProvider;
import ru.yandex.video.m3.player.provider.drm.DrmTypeConsumer;
import ru.yandex.video.m3.player.report.builder.ReportBuilder;
import ru.yandex.video.m3.player.scaling.ScalingMode;
import ru.yandex.video.m3.player.tracking.StrmEventLogger;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b<\b\u0007\u0018\u00002\u00020\u0001:\u0001eBÛ\u0001\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u000e\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u000e\u0012\u0006\u0010\u001b\u001a\u00020\u000e\u0012\u0006\u0010\u001c\u001a\u00020\u0014\u0012\u0006\u0010\u001d\u001a\u00020\u000e\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00120\u001e\u0012\b\u0010 \u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010!\u001a\u00020\u000e\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010#\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b&\u0010'J#\u0010,\u001a\u00020\u00002\u0014\b\u0002\u0010+\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0(¢\u0006\u0004\b,\u0010-J\u001a\u0010/\u001a\u00020\u000e2\b\u0010.\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0014H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0012H\u0016¢\u0006\u0004\b3\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010A\u001a\u0004\bB\u0010CR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010D\u001a\u0004\bE\u0010FR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010G\u001a\u0004\bH\u0010IR\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010G\u001a\u0004\bJ\u0010IR\u0017\u0010\u0011\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0011\u0010G\u001a\u0004\bK\u0010IR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010L\u001a\u0004\bM\u00104R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010N\u001a\u0004\bO\u00102R\u0017\u0010\u0016\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0016\u0010G\u001a\u0004\bP\u0010IR\u0017\u0010\u0017\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0017\u0010N\u001a\u0004\bQ\u00102R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010R\u001a\u0004\bS\u0010TR\u0017\u0010\u001a\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u001a\u0010G\u001a\u0004\bU\u0010IR\u0017\u0010\u001b\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u001b\u0010G\u001a\u0004\bV\u0010IR\u0017\u0010\u001c\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u001c\u0010N\u001a\u0004\bW\u00102R\u0017\u0010\u001d\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u001d\u0010G\u001a\u0004\bX\u0010IR\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00120\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010Y\u001a\u0004\bZ\u0010[R\u0019\u0010 \u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b \u0010\\\u001a\u0004\b]\u0010^R\u001a\u0010!\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010G\u001a\u0004\b_\u0010IR\u001c\u0010\"\u001a\u0004\u0018\u00010\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010\\\u001a\u0004\b`\u0010^R\u001c\u0010#\u001a\u0004\u0018\u00010\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010\\\u001a\u0004\ba\u0010^R\u001c\u0010%\u001a\u0004\u0018\u00010$8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010b\u001a\u0004\bc\u0010d¨\u0006f"}, d2 = {"Lru/yandex/video/m3/player/parameters/PlayerDelegateParameters;", "", "Lru/yandex/video/m3/player/provider/drm/DrmTypeConsumer;", "drmTypeConsumer", "Landroid/os/Looper;", "exoPlayerLooper", "Lru/yandex/video/m3/player/provider/TrackSelectionRestrictionsProvider;", "trackSelectionRestrictionsProvider", "Lru/yandex/video/m3/player/scaling/ScalingMode;", "videoScalingMode", "Lru/yandex/video/m3/player/report/builder/ReportBuilder;", "reportBuilder", "Lru/yandex/video/m3/player/tracking/StrmEventLogger;", "strmEventLogger", "", "useMultiplatformBandwidthEstimator", "useMultiplatformBandwidthEstimatorWithPlatformSync", "enableCodecTelemetryReportLogger", "", "codecRecoverStrategy", "", "codecRecoverStrategyAttempts", "shouldTryInitCodecsWithRetries", "initCodecRetriesCount", "", "initCodecTimeoutMs", "disableTooEarlyMediaCodecNativeReleaseReturnWorkaround", "useSurfaceControl", "codecTelemetryReportLoggerRecordsCount", "useIncrementalCodecInitTimeout", "", "modelsNeedsSetOutputSurfaceWorkaround", "enableAsyncDecoderQueue", "disableCodecReuseInCaseOfCodecProfileOrLevelUpgrade", "enableUseLastBandwidthEstimate", "ignoreSeekOnSamePosition", "Lru/yandex/video/m3/player/parameters/StuckStalledConfig;", "stuckStalledConfig", "<init>", "(Lru/yandex/video/m3/player/provider/drm/DrmTypeConsumer;Landroid/os/Looper;Lru/yandex/video/m3/player/provider/TrackSelectionRestrictionsProvider;Lru/yandex/video/m3/player/scaling/ScalingMode;Lru/yandex/video/m3/player/report/builder/ReportBuilder;Lru/yandex/video/m3/player/tracking/StrmEventLogger;ZZZLjava/lang/String;IZIJZZIZLjava/util/List;Ljava/lang/Boolean;ZLjava/lang/Boolean;Ljava/lang/Boolean;Lru/yandex/video/m3/player/parameters/StuckStalledConfig;)V", "Lkotlin/Function1;", "Lru/yandex/video/m3/player/parameters/PlayerDelegateParameters$Builder;", "Lzy11;", "builderAction", "copy", "(Ltls;)Lru/yandex/video/m3/player/parameters/PlayerDelegateParameters;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lru/yandex/video/m3/player/provider/drm/DrmTypeConsumer;", "getDrmTypeConsumer", "()Lru/yandex/video/m3/player/provider/drm/DrmTypeConsumer;", "Landroid/os/Looper;", "getExoPlayerLooper", "()Landroid/os/Looper;", "Lru/yandex/video/m3/player/provider/TrackSelectionRestrictionsProvider;", "getTrackSelectionRestrictionsProvider", "()Lru/yandex/video/m3/player/provider/TrackSelectionRestrictionsProvider;", "Lru/yandex/video/m3/player/scaling/ScalingMode;", "getVideoScalingMode", "()Lru/yandex/video/m3/player/scaling/ScalingMode;", "Lru/yandex/video/m3/player/report/builder/ReportBuilder;", "getReportBuilder", "()Lru/yandex/video/m3/player/report/builder/ReportBuilder;", "Lru/yandex/video/m3/player/tracking/StrmEventLogger;", "getStrmEventLogger", "()Lru/yandex/video/m3/player/tracking/StrmEventLogger;", "Z", "getUseMultiplatformBandwidthEstimator", "()Z", "getUseMultiplatformBandwidthEstimatorWithPlatformSync", "getEnableCodecTelemetryReportLogger", "Ljava/lang/String;", "getCodecRecoverStrategy", CA20Status.STATUS_USER_I, "getCodecRecoverStrategyAttempts", "getShouldTryInitCodecsWithRetries", "getInitCodecRetriesCount", "J", "getInitCodecTimeoutMs", "()J", "getDisableTooEarlyMediaCodecNativeReleaseReturnWorkaround", "getUseSurfaceControl", "getCodecTelemetryReportLoggerRecordsCount", "getUseIncrementalCodecInitTimeout", "Ljava/util/List;", "getModelsNeedsSetOutputSurfaceWorkaround", "()Ljava/util/List;", "Ljava/lang/Boolean;", "getEnableAsyncDecoderQueue", "()Ljava/lang/Boolean;", "getDisableCodecReuseInCaseOfCodecProfileOrLevelUpgrade$video_player_internalRelease", "getEnableUseLastBandwidthEstimate$video_player_internalRelease", "getIgnoreSeekOnSamePosition$video_player_internalRelease", "Lru/yandex/video/m3/player/parameters/StuckStalledConfig;", "getStuckStalledConfig$video_player_internalRelease", "()Lru/yandex/video/m3/player/parameters/StuckStalledConfig;", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PlayerDelegateParameters {
    public static final int $stable = 8;
    private final String codecRecoverStrategy;
    private final int codecRecoverStrategyAttempts;
    private final int codecTelemetryReportLoggerRecordsCount;
    private final boolean disableCodecReuseInCaseOfCodecProfileOrLevelUpgrade;
    private final boolean disableTooEarlyMediaCodecNativeReleaseReturnWorkaround;
    private final DrmTypeConsumer drmTypeConsumer;
    private final Boolean enableAsyncDecoderQueue;
    private final boolean enableCodecTelemetryReportLogger;
    private final Boolean enableUseLastBandwidthEstimate;
    private final Looper exoPlayerLooper;
    private final Boolean ignoreSeekOnSamePosition;
    private final int initCodecRetriesCount;
    private final long initCodecTimeoutMs;
    private final List<String> modelsNeedsSetOutputSurfaceWorkaround;
    private final ReportBuilder reportBuilder;
    private final boolean shouldTryInitCodecsWithRetries;
    private final StrmEventLogger strmEventLogger;
    private final StuckStalledConfig stuckStalledConfig;
    private final TrackSelectionRestrictionsProvider trackSelectionRestrictionsProvider;
    private final boolean useIncrementalCodecInitTimeout;
    private final boolean useMultiplatformBandwidthEstimator;
    private final boolean useMultiplatformBandwidthEstimatorWithPlatformSync;
    private final boolean useSurfaceControl;
    private final ScalingMode videoScalingMode;

    private PlayerDelegateParameters(DrmTypeConsumer drmTypeConsumer, Looper looper, TrackSelectionRestrictionsProvider trackSelectionRestrictionsProvider, ScalingMode scalingMode, ReportBuilder reportBuilder, StrmEventLogger strmEventLogger, boolean z, boolean z2, boolean z3, String str, int i, boolean z4, int i2, long j, boolean z5, boolean z6, int i3, boolean z7, List<String> list, Boolean bool, boolean z8, Boolean bool2, Boolean bool3, StuckStalledConfig stuckStalledConfig) {
        this.drmTypeConsumer = drmTypeConsumer;
        this.exoPlayerLooper = looper;
        this.trackSelectionRestrictionsProvider = trackSelectionRestrictionsProvider;
        this.videoScalingMode = scalingMode;
        this.reportBuilder = reportBuilder;
        this.strmEventLogger = strmEventLogger;
        this.useMultiplatformBandwidthEstimator = z;
        this.useMultiplatformBandwidthEstimatorWithPlatformSync = z2;
        this.enableCodecTelemetryReportLogger = z3;
        this.codecRecoverStrategy = str;
        this.codecRecoverStrategyAttempts = i;
        this.shouldTryInitCodecsWithRetries = z4;
        this.initCodecRetriesCount = i2;
        this.initCodecTimeoutMs = j;
        this.disableTooEarlyMediaCodecNativeReleaseReturnWorkaround = z5;
        this.useSurfaceControl = z6;
        this.codecTelemetryReportLoggerRecordsCount = i3;
        this.useIncrementalCodecInitTimeout = z7;
        this.modelsNeedsSetOutputSurfaceWorkaround = list;
        this.enableAsyncDecoderQueue = bool;
        this.disableCodecReuseInCaseOfCodecProfileOrLevelUpgrade = z8;
        this.enableUseLastBandwidthEstimate = bool2;
        this.ignoreSeekOnSamePosition = bool3;
        this.stuckStalledConfig = stuckStalledConfig;
    }

    public static /* synthetic */ PlayerDelegateParameters copy$default(PlayerDelegateParameters playerDelegateParameters, tls tlsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.player.parameters.PlayerDelegateParameters$copy$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((PlayerDelegateParameters.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(PlayerDelegateParameters.Builder builder) {
                }
            };
        }
        return playerDelegateParameters.copy(tlsVar);
    }

    public final PlayerDelegateParameters copy(tls builderAction) {
        Builder builder = new Builder(this);
        builderAction.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!PlayerDelegateParameters.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        PlayerDelegateParameters playerDelegateParameters = (PlayerDelegateParameters) other;
        return jl40.l(this.drmTypeConsumer, playerDelegateParameters.drmTypeConsumer) && jl40.l(this.exoPlayerLooper, playerDelegateParameters.exoPlayerLooper) && jl40.l(this.trackSelectionRestrictionsProvider, playerDelegateParameters.trackSelectionRestrictionsProvider) && this.videoScalingMode == playerDelegateParameters.videoScalingMode && jl40.l(this.reportBuilder, playerDelegateParameters.reportBuilder) && jl40.l(this.strmEventLogger, playerDelegateParameters.strmEventLogger) && this.useMultiplatformBandwidthEstimator == playerDelegateParameters.useMultiplatformBandwidthEstimator && this.useMultiplatformBandwidthEstimatorWithPlatformSync == playerDelegateParameters.useMultiplatformBandwidthEstimatorWithPlatformSync && this.enableCodecTelemetryReportLogger == playerDelegateParameters.enableCodecTelemetryReportLogger && jl40.l(this.codecRecoverStrategy, playerDelegateParameters.codecRecoverStrategy) && this.codecRecoverStrategyAttempts == playerDelegateParameters.codecRecoverStrategyAttempts && this.shouldTryInitCodecsWithRetries == playerDelegateParameters.shouldTryInitCodecsWithRetries && this.initCodecRetriesCount == playerDelegateParameters.initCodecRetriesCount && this.initCodecTimeoutMs == playerDelegateParameters.initCodecTimeoutMs && this.disableTooEarlyMediaCodecNativeReleaseReturnWorkaround == playerDelegateParameters.disableTooEarlyMediaCodecNativeReleaseReturnWorkaround && this.useSurfaceControl == playerDelegateParameters.useSurfaceControl && this.codecTelemetryReportLoggerRecordsCount == playerDelegateParameters.codecTelemetryReportLoggerRecordsCount && this.useIncrementalCodecInitTimeout == playerDelegateParameters.useIncrementalCodecInitTimeout && jl40.l(this.modelsNeedsSetOutputSurfaceWorkaround, playerDelegateParameters.modelsNeedsSetOutputSurfaceWorkaround) && jl40.l(this.enableAsyncDecoderQueue, playerDelegateParameters.enableAsyncDecoderQueue) && this.disableCodecReuseInCaseOfCodecProfileOrLevelUpgrade == playerDelegateParameters.disableCodecReuseInCaseOfCodecProfileOrLevelUpgrade && jl40.l(this.enableUseLastBandwidthEstimate, playerDelegateParameters.enableUseLastBandwidthEstimate) && jl40.l(this.ignoreSeekOnSamePosition, playerDelegateParameters.ignoreSeekOnSamePosition) && jl40.l(this.stuckStalledConfig, playerDelegateParameters.stuckStalledConfig);
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

    /* renamed from: getDisableCodecReuseInCaseOfCodecProfileOrLevelUpgrade$video_player_internalRelease, reason: from getter */
    public final boolean getDisableCodecReuseInCaseOfCodecProfileOrLevelUpgrade() {
        return this.disableCodecReuseInCaseOfCodecProfileOrLevelUpgrade;
    }

    public final boolean getDisableTooEarlyMediaCodecNativeReleaseReturnWorkaround() {
        return this.disableTooEarlyMediaCodecNativeReleaseReturnWorkaround;
    }

    public final DrmTypeConsumer getDrmTypeConsumer() {
        return this.drmTypeConsumer;
    }

    public final Boolean getEnableAsyncDecoderQueue() {
        return this.enableAsyncDecoderQueue;
    }

    public final boolean getEnableCodecTelemetryReportLogger() {
        return this.enableCodecTelemetryReportLogger;
    }

    /* renamed from: getEnableUseLastBandwidthEstimate$video_player_internalRelease, reason: from getter */
    public final Boolean getEnableUseLastBandwidthEstimate() {
        return this.enableUseLastBandwidthEstimate;
    }

    public final Looper getExoPlayerLooper() {
        return this.exoPlayerLooper;
    }

    /* renamed from: getIgnoreSeekOnSamePosition$video_player_internalRelease, reason: from getter */
    public final Boolean getIgnoreSeekOnSamePosition() {
        return this.ignoreSeekOnSamePosition;
    }

    public final int getInitCodecRetriesCount() {
        return this.initCodecRetriesCount;
    }

    public final long getInitCodecTimeoutMs() {
        return this.initCodecTimeoutMs;
    }

    public final List<String> getModelsNeedsSetOutputSurfaceWorkaround() {
        return this.modelsNeedsSetOutputSurfaceWorkaround;
    }

    public final ReportBuilder getReportBuilder() {
        return this.reportBuilder;
    }

    public final boolean getShouldTryInitCodecsWithRetries() {
        return this.shouldTryInitCodecsWithRetries;
    }

    public final StrmEventLogger getStrmEventLogger() {
        return this.strmEventLogger;
    }

    /* renamed from: getStuckStalledConfig$video_player_internalRelease, reason: from getter */
    public final StuckStalledConfig getStuckStalledConfig() {
        return this.stuckStalledConfig;
    }

    public final TrackSelectionRestrictionsProvider getTrackSelectionRestrictionsProvider() {
        return this.trackSelectionRestrictionsProvider;
    }

    public final boolean getUseIncrementalCodecInitTimeout() {
        return this.useIncrementalCodecInitTimeout;
    }

    public final boolean getUseMultiplatformBandwidthEstimator() {
        return this.useMultiplatformBandwidthEstimator;
    }

    public final boolean getUseMultiplatformBandwidthEstimatorWithPlatformSync() {
        return this.useMultiplatformBandwidthEstimatorWithPlatformSync;
    }

    public final boolean getUseSurfaceControl() {
        return this.useSurfaceControl;
    }

    public final ScalingMode getVideoScalingMode() {
        return this.videoScalingMode;
    }

    public int hashCode() {
        int hashCode = (this.videoScalingMode.hashCode() + ((this.trackSelectionRestrictionsProvider.hashCode() + ((this.exoPlayerLooper.hashCode() + (this.drmTypeConsumer.hashCode() * 31)) * 31)) * 31)) * 31;
        ReportBuilder reportBuilder = this.reportBuilder;
        int hashCode2 = (hashCode + (reportBuilder != null ? reportBuilder.hashCode() : 0)) * 31;
        StrmEventLogger strmEventLogger = this.strmEventLogger;
        int c = unr0.c(unr0.e((unr0.e(unr0.e(qv10.c((unr0.e((unr0.b(unr0.e(unr0.e(unr0.e((hashCode2 + (strmEventLogger != null ? strmEventLogger.hashCode() : 0)) * 31, 31, this.useMultiplatformBandwidthEstimator), 31, this.useMultiplatformBandwidthEstimatorWithPlatformSync), 31, this.enableCodecTelemetryReportLogger), 31, this.codecRecoverStrategy) + this.codecRecoverStrategyAttempts) * 31, 31, this.shouldTryInitCodecsWithRetries) + this.initCodecRetriesCount) * 31, 31, this.initCodecTimeoutMs), 31, this.disableTooEarlyMediaCodecNativeReleaseReturnWorkaround), 31, this.useSurfaceControl) + this.codecTelemetryReportLoggerRecordsCount) * 31, 31, this.useIncrementalCodecInitTimeout), 31, this.modelsNeedsSetOutputSurfaceWorkaround);
        Boolean bool = this.enableAsyncDecoderQueue;
        int e = unr0.e((c + (bool != null ? bool.hashCode() : 0)) * 31, 31, this.disableCodecReuseInCaseOfCodecProfileOrLevelUpgrade);
        Boolean bool2 = this.enableUseLastBandwidthEstimate;
        int hashCode3 = (e + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Boolean bool3 = this.ignoreSeekOnSamePosition;
        int hashCode4 = (hashCode3 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
        StuckStalledConfig stuckStalledConfig = this.stuckStalledConfig;
        return hashCode4 + (stuckStalledConfig != null ? stuckStalledConfig.hashCode() : 0);
    }

    public String toString() {
        return "PlayerDelegateParameters(drmTypeConsumer=" + this.drmTypeConsumer + ", exoPlayerLooper=" + this.exoPlayerLooper + ", trackSelectionRestrictionsProvider=" + this.trackSelectionRestrictionsProvider + ", videoScalingMode=" + this.videoScalingMode + ", reportBuilder=" + this.reportBuilder + ", strmEventLogger=" + this.strmEventLogger + ", useMultiplatformBandwidthEstimator=" + this.useMultiplatformBandwidthEstimator + ", useMultiplatformBandwidthEstimatorWithPlatformSync=" + this.useMultiplatformBandwidthEstimatorWithPlatformSync + ", enableCodecTelemetryReportLogger=" + this.enableCodecTelemetryReportLogger + ", codecRecoverStrategy='" + this.codecRecoverStrategy + "', codecRecoverStrategyAttempts=" + this.codecRecoverStrategyAttempts + ", shouldTryInitCodecsWithRetries=" + this.shouldTryInitCodecsWithRetries + ", initCodecRetriesCount=" + this.initCodecRetriesCount + ", initCodecTimeoutMs=" + this.initCodecTimeoutMs + ", disableTooEarlyMediaCodecNativeReleaseReturnWorkaround=" + this.disableTooEarlyMediaCodecNativeReleaseReturnWorkaround + ", useSurfaceControl=" + this.useSurfaceControl + ", codecTelemetryReportLoggerRecordsCount=" + this.codecTelemetryReportLoggerRecordsCount + ", useIncrementalCodecInitTimeout=" + this.useIncrementalCodecInitTimeout + ", modelsNeedsSetOutputSurfaceWorkaround=" + this.modelsNeedsSetOutputSurfaceWorkaround + ", enableAsyncDecoderQueue=" + this.enableAsyncDecoderQueue + ", disableCodecReuseInCaseOfCodecProfileOrLevelUpgrade=" + this.disableCodecReuseInCaseOfCodecProfileOrLevelUpgrade + ", enableUseLastBandwidthEstimate=" + this.enableUseLastBandwidthEstimate + ", ignoreSeekOnSamePosition=" + this.ignoreSeekOnSamePosition + ", stuckStalledConfig=" + this.stuckStalledConfig + ')';
    }

    public /* synthetic */ PlayerDelegateParameters(DrmTypeConsumer drmTypeConsumer, Looper looper, TrackSelectionRestrictionsProvider trackSelectionRestrictionsProvider, ScalingMode scalingMode, ReportBuilder reportBuilder, StrmEventLogger strmEventLogger, boolean z, boolean z2, boolean z3, String str, int i, boolean z4, int i2, long j, boolean z5, boolean z6, int i3, boolean z7, List list, Boolean bool, boolean z8, Boolean bool2, Boolean bool3, StuckStalledConfig stuckStalledConfig, DefaultConstructorMarker defaultConstructorMarker) {
        this(drmTypeConsumer, looper, trackSelectionRestrictionsProvider, scalingMode, reportBuilder, strmEventLogger, z, z2, z3, str, i, z4, i2, j, z5, z6, i3, z7, list, bool, z8, bool2, bool3, stuckStalledConfig);
    }

    @Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B'\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\r\u0010u\u001a\u00020\u0003H\u0000¢\u0006\u0002\bvR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0080\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001e\u0010%\u001a\u0004\u0018\u00010\u001fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001e\u0010,\u001a\u0004\u0018\u00010\u001fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b-\u0010!\"\u0004\b.\u0010#R\u001e\u0010/\u001a\u0004\u0018\u00010\u001fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b0\u0010!\"\u0004\b1\u0010#R\u001e\u00102\u001a\u0004\u0018\u00010\u001fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b3\u0010!\"\u0004\b4\u0010#R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001e\u00109\u001a\u0004\u0018\u00010\u001fX\u0080\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b:\u0010!\"\u0004\b;\u0010#R\u001e\u0010<\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b=\u0010\u0017\"\u0004\b>\u0010\u0019R\u001e\u0010?\u001a\u0004\u0018\u00010@X\u0086\u000e¢\u0006\u0010\n\u0002\u0010E\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010F\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u001c\u0010L\u001a\u0004\u0018\u00010MX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u001e\u0010R\u001a\u0004\u0018\u00010\u001fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\bS\u0010!\"\u0004\bT\u0010#R\u001c\u0010U\u001a\u0004\u0018\u00010VX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u001c\u0010[\u001a\u0004\u0018\u00010\\X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\u001e\u0010e\u001a\u0004\u0018\u00010\u001fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\bf\u0010!\"\u0004\bg\u0010#R\u001e\u0010h\u001a\u0004\u0018\u00010\u001fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\bi\u0010!\"\u0004\bj\u0010#R\u001e\u0010k\u001a\u0004\u0018\u00010\u001fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\bl\u0010!\"\u0004\bm\u0010#R\u001e\u0010n\u001a\u0004\u0018\u00010\u001fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\bo\u0010!\"\u0004\bp\u0010#R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bq\u0010r\"\u0004\bs\u0010t¨\u0006w"}, d2 = {"Lru/yandex/video/m3/player/parameters/PlayerDelegateParameters$Builder;", "", "playerDelegateParameters", "Lru/yandex/video/m3/player/parameters/PlayerDelegateParameters;", "(Lru/yandex/video/m3/player/parameters/PlayerDelegateParameters;)V", "drmTypeConsumer", "Lru/yandex/video/m3/player/provider/drm/DrmTypeConsumer;", "exoPlayerLooper", "Landroid/os/Looper;", "trackSelectionRestrictionsProvider", "Lru/yandex/video/m3/player/provider/TrackSelectionRestrictionsProvider;", "videoScalingMode", "Lru/yandex/video/m3/player/scaling/ScalingMode;", "(Lru/yandex/video/m3/player/provider/drm/DrmTypeConsumer;Landroid/os/Looper;Lru/yandex/video/m3/player/provider/TrackSelectionRestrictionsProvider;Lru/yandex/video/m3/player/scaling/ScalingMode;)V", "codecRecoverStrategy", "", "getCodecRecoverStrategy", "()Ljava/lang/String;", "setCodecRecoverStrategy", "(Ljava/lang/String;)V", "codecRecoverStrategyAttempts", "", "getCodecRecoverStrategyAttempts", "()Ljava/lang/Integer;", "setCodecRecoverStrategyAttempts", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "codecTelemetryReportLoggerRecordsCount", "getCodecTelemetryReportLoggerRecordsCount", "setCodecTelemetryReportLoggerRecordsCount", "disableCodecReuseInCaseOfCodecProfileOrLevelUpgrade", "", "getDisableCodecReuseInCaseOfCodecProfileOrLevelUpgrade$video_player_internalRelease", "()Ljava/lang/Boolean;", "setDisableCodecReuseInCaseOfCodecProfileOrLevelUpgrade$video_player_internalRelease", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "disableTooEarlyMediaCodecNativeReleaseReturnWorkaround", "getDisableTooEarlyMediaCodecNativeReleaseReturnWorkaround", "setDisableTooEarlyMediaCodecNativeReleaseReturnWorkaround", "getDrmTypeConsumer", "()Lru/yandex/video/m3/player/provider/drm/DrmTypeConsumer;", "setDrmTypeConsumer", "(Lru/yandex/video/m3/player/provider/drm/DrmTypeConsumer;)V", "enableAsyncDecoderQueue", "getEnableAsyncDecoderQueue", "setEnableAsyncDecoderQueue", "enableCodecTelemetryReportLogger", "getEnableCodecTelemetryReportLogger", "setEnableCodecTelemetryReportLogger", "enableUseLastBandwidthEstimate", "getEnableUseLastBandwidthEstimate", "setEnableUseLastBandwidthEstimate", "getExoPlayerLooper", "()Landroid/os/Looper;", "setExoPlayerLooper", "(Landroid/os/Looper;)V", "ignoreSeekOnSamePosition", "getIgnoreSeekOnSamePosition$video_player_internalRelease", "setIgnoreSeekOnSamePosition$video_player_internalRelease", "initCodecRetriesCount", "getInitCodecRetriesCount", "setInitCodecRetriesCount", "initCodecTimeoutMs", "", "getInitCodecTimeoutMs", "()Ljava/lang/Long;", "setInitCodecTimeoutMs", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "modelsNeedsSetOutputSurfaceWorkaround", "", "getModelsNeedsSetOutputSurfaceWorkaround", "()Ljava/util/List;", "setModelsNeedsSetOutputSurfaceWorkaround", "(Ljava/util/List;)V", "reportBuilder", "Lru/yandex/video/m3/player/report/builder/ReportBuilder;", "getReportBuilder", "()Lru/yandex/video/m3/player/report/builder/ReportBuilder;", "setReportBuilder", "(Lru/yandex/video/m3/player/report/builder/ReportBuilder;)V", "shouldTryInitCodecsWithRetries", "getShouldTryInitCodecsWithRetries", "setShouldTryInitCodecsWithRetries", "strmEventLogger", "Lru/yandex/video/m3/player/tracking/StrmEventLogger;", "getStrmEventLogger", "()Lru/yandex/video/m3/player/tracking/StrmEventLogger;", "setStrmEventLogger", "(Lru/yandex/video/m3/player/tracking/StrmEventLogger;)V", "stuckStalledConfig", "Lru/yandex/video/m3/player/parameters/StuckStalledConfig;", "getStuckStalledConfig$video_player_internalRelease", "()Lru/yandex/video/m3/player/parameters/StuckStalledConfig;", "setStuckStalledConfig$video_player_internalRelease", "(Lru/yandex/video/m3/player/parameters/StuckStalledConfig;)V", "getTrackSelectionRestrictionsProvider", "()Lru/yandex/video/m3/player/provider/TrackSelectionRestrictionsProvider;", "setTrackSelectionRestrictionsProvider", "(Lru/yandex/video/m3/player/provider/TrackSelectionRestrictionsProvider;)V", "useIncrementalCodecInitTimeout", "getUseIncrementalCodecInitTimeout", "setUseIncrementalCodecInitTimeout", "useMultiplatformBandwidthEstimator", "getUseMultiplatformBandwidthEstimator", "setUseMultiplatformBandwidthEstimator", "useMultiplatformBandwidthEstimatorWithPlatformSync", "getUseMultiplatformBandwidthEstimatorWithPlatformSync", "setUseMultiplatformBandwidthEstimatorWithPlatformSync", "useSurfaceControl", "getUseSurfaceControl", "setUseSurfaceControl", "getVideoScalingMode", "()Lru/yandex/video/m3/player/scaling/ScalingMode;", "setVideoScalingMode", "(Lru/yandex/video/m3/player/scaling/ScalingMode;)V", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private String codecRecoverStrategy;
        private Integer codecRecoverStrategyAttempts;
        private Integer codecTelemetryReportLoggerRecordsCount;
        private Boolean disableCodecReuseInCaseOfCodecProfileOrLevelUpgrade;
        private Boolean disableTooEarlyMediaCodecNativeReleaseReturnWorkaround;
        private DrmTypeConsumer drmTypeConsumer;
        private Boolean enableAsyncDecoderQueue;
        private Boolean enableCodecTelemetryReportLogger;
        private Boolean enableUseLastBandwidthEstimate;
        private Looper exoPlayerLooper;
        private Boolean ignoreSeekOnSamePosition;
        private Integer initCodecRetriesCount;
        private Long initCodecTimeoutMs;
        private List<String> modelsNeedsSetOutputSurfaceWorkaround;
        private ReportBuilder reportBuilder;
        private Boolean shouldTryInitCodecsWithRetries;
        private StrmEventLogger strmEventLogger;
        private StuckStalledConfig stuckStalledConfig;
        private TrackSelectionRestrictionsProvider trackSelectionRestrictionsProvider;
        private Boolean useIncrementalCodecInitTimeout;
        private Boolean useMultiplatformBandwidthEstimator;
        private Boolean useMultiplatformBandwidthEstimatorWithPlatformSync;
        private Boolean useSurfaceControl;
        private ScalingMode videoScalingMode;

        public Builder(PlayerDelegateParameters playerDelegateParameters) {
            this(playerDelegateParameters.getDrmTypeConsumer(), playerDelegateParameters.getExoPlayerLooper(), playerDelegateParameters.getTrackSelectionRestrictionsProvider(), playerDelegateParameters.getVideoScalingMode());
            this.reportBuilder = playerDelegateParameters.getReportBuilder();
            this.strmEventLogger = playerDelegateParameters.getStrmEventLogger();
            this.useMultiplatformBandwidthEstimator = Boolean.valueOf(playerDelegateParameters.getUseMultiplatformBandwidthEstimator());
            this.useMultiplatformBandwidthEstimatorWithPlatformSync = Boolean.valueOf(playerDelegateParameters.getUseMultiplatformBandwidthEstimatorWithPlatformSync());
            this.enableCodecTelemetryReportLogger = Boolean.valueOf(playerDelegateParameters.getEnableCodecTelemetryReportLogger());
            this.codecRecoverStrategy = playerDelegateParameters.getCodecRecoverStrategy();
            this.codecRecoverStrategyAttempts = Integer.valueOf(playerDelegateParameters.getCodecRecoverStrategyAttempts());
            this.shouldTryInitCodecsWithRetries = Boolean.valueOf(playerDelegateParameters.getShouldTryInitCodecsWithRetries());
            this.initCodecRetriesCount = Integer.valueOf(playerDelegateParameters.getInitCodecRetriesCount());
            this.initCodecTimeoutMs = Long.valueOf(playerDelegateParameters.getInitCodecTimeoutMs());
            this.useIncrementalCodecInitTimeout = Boolean.valueOf(playerDelegateParameters.getUseIncrementalCodecInitTimeout());
            this.disableTooEarlyMediaCodecNativeReleaseReturnWorkaround = Boolean.valueOf(playerDelegateParameters.getDisableTooEarlyMediaCodecNativeReleaseReturnWorkaround());
            this.useSurfaceControl = Boolean.valueOf(playerDelegateParameters.getUseSurfaceControl());
            this.codecTelemetryReportLoggerRecordsCount = Integer.valueOf(playerDelegateParameters.getCodecTelemetryReportLoggerRecordsCount());
            this.modelsNeedsSetOutputSurfaceWorkaround = playerDelegateParameters.getModelsNeedsSetOutputSurfaceWorkaround();
            this.enableAsyncDecoderQueue = playerDelegateParameters.getEnableAsyncDecoderQueue();
            this.disableCodecReuseInCaseOfCodecProfileOrLevelUpgrade = Boolean.valueOf(playerDelegateParameters.getDisableCodecReuseInCaseOfCodecProfileOrLevelUpgrade());
            this.enableUseLastBandwidthEstimate = playerDelegateParameters.getEnableUseLastBandwidthEstimate();
        }

        public final PlayerDelegateParameters build$video_player_internalRelease() {
            DrmTypeConsumer drmTypeConsumer = this.drmTypeConsumer;
            Looper looper = this.exoPlayerLooper;
            TrackSelectionRestrictionsProvider trackSelectionRestrictionsProvider = this.trackSelectionRestrictionsProvider;
            ScalingMode scalingMode = this.videoScalingMode;
            ReportBuilder reportBuilder = this.reportBuilder;
            StrmEventLogger strmEventLogger = this.strmEventLogger;
            Boolean bool = this.useMultiplatformBandwidthEstimator;
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            Boolean bool2 = this.useMultiplatformBandwidthEstimatorWithPlatformSync;
            boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : false;
            Boolean bool3 = this.enableCodecTelemetryReportLogger;
            boolean booleanValue3 = bool3 != null ? bool3.booleanValue() : false;
            String str = this.codecRecoverStrategy;
            if (str == null) {
                str = "DEFAULT";
            }
            Integer num = this.codecRecoverStrategyAttempts;
            int intValue = num != null ? num.intValue() : 3;
            Boolean bool4 = this.shouldTryInitCodecsWithRetries;
            boolean booleanValue4 = bool4 != null ? bool4.booleanValue() : true;
            Integer num2 = this.initCodecRetriesCount;
            int intValue2 = num2 != null ? num2.intValue() : 1;
            Long l = this.initCodecTimeoutMs;
            long longValue = l != null ? l.longValue() : 50L;
            Boolean bool5 = this.disableTooEarlyMediaCodecNativeReleaseReturnWorkaround;
            boolean booleanValue5 = bool5 != null ? bool5.booleanValue() : false;
            Boolean bool6 = this.useSurfaceControl;
            boolean booleanValue6 = bool6 != null ? bool6.booleanValue() : false;
            Integer num3 = this.codecTelemetryReportLoggerRecordsCount;
            int intValue3 = num3 != null ? num3.intValue() : 50;
            Boolean bool7 = this.useIncrementalCodecInitTimeout;
            boolean booleanValue7 = bool7 != null ? bool7.booleanValue() : false;
            List list = this.modelsNeedsSetOutputSurfaceWorkaround;
            if (list == null) {
                list = EmptyList.a;
            }
            List list2 = list;
            Boolean bool8 = this.enableAsyncDecoderQueue;
            Boolean bool9 = this.disableCodecReuseInCaseOfCodecProfileOrLevelUpgrade;
            return new PlayerDelegateParameters(drmTypeConsumer, looper, trackSelectionRestrictionsProvider, scalingMode, reportBuilder, strmEventLogger, booleanValue, booleanValue2, booleanValue3, str, intValue, booleanValue4, intValue2, longValue, booleanValue5, booleanValue6, intValue3, booleanValue7, list2, bool8, bool9 != null ? bool9.booleanValue() : false, this.enableUseLastBandwidthEstimate, this.ignoreSeekOnSamePosition, this.stuckStalledConfig, null);
        }

        public final String getCodecRecoverStrategy() {
            return this.codecRecoverStrategy;
        }

        public final Integer getCodecRecoverStrategyAttempts() {
            return this.codecRecoverStrategyAttempts;
        }

        public final Integer getCodecTelemetryReportLoggerRecordsCount() {
            return this.codecTelemetryReportLoggerRecordsCount;
        }

        /* renamed from: getDisableCodecReuseInCaseOfCodecProfileOrLevelUpgrade$video_player_internalRelease, reason: from getter */
        public final Boolean getDisableCodecReuseInCaseOfCodecProfileOrLevelUpgrade() {
            return this.disableCodecReuseInCaseOfCodecProfileOrLevelUpgrade;
        }

        public final Boolean getDisableTooEarlyMediaCodecNativeReleaseReturnWorkaround() {
            return this.disableTooEarlyMediaCodecNativeReleaseReturnWorkaround;
        }

        public final DrmTypeConsumer getDrmTypeConsumer() {
            return this.drmTypeConsumer;
        }

        public final Boolean getEnableAsyncDecoderQueue() {
            return this.enableAsyncDecoderQueue;
        }

        public final Boolean getEnableCodecTelemetryReportLogger() {
            return this.enableCodecTelemetryReportLogger;
        }

        public final Boolean getEnableUseLastBandwidthEstimate() {
            return this.enableUseLastBandwidthEstimate;
        }

        public final Looper getExoPlayerLooper() {
            return this.exoPlayerLooper;
        }

        /* renamed from: getIgnoreSeekOnSamePosition$video_player_internalRelease, reason: from getter */
        public final Boolean getIgnoreSeekOnSamePosition() {
            return this.ignoreSeekOnSamePosition;
        }

        public final Integer getInitCodecRetriesCount() {
            return this.initCodecRetriesCount;
        }

        public final Long getInitCodecTimeoutMs() {
            return this.initCodecTimeoutMs;
        }

        public final List<String> getModelsNeedsSetOutputSurfaceWorkaround() {
            return this.modelsNeedsSetOutputSurfaceWorkaround;
        }

        public final ReportBuilder getReportBuilder() {
            return this.reportBuilder;
        }

        public final Boolean getShouldTryInitCodecsWithRetries() {
            return this.shouldTryInitCodecsWithRetries;
        }

        public final StrmEventLogger getStrmEventLogger() {
            return this.strmEventLogger;
        }

        /* renamed from: getStuckStalledConfig$video_player_internalRelease, reason: from getter */
        public final StuckStalledConfig getStuckStalledConfig() {
            return this.stuckStalledConfig;
        }

        public final TrackSelectionRestrictionsProvider getTrackSelectionRestrictionsProvider() {
            return this.trackSelectionRestrictionsProvider;
        }

        public final Boolean getUseIncrementalCodecInitTimeout() {
            return this.useIncrementalCodecInitTimeout;
        }

        public final Boolean getUseMultiplatformBandwidthEstimator() {
            return this.useMultiplatformBandwidthEstimator;
        }

        public final Boolean getUseMultiplatformBandwidthEstimatorWithPlatformSync() {
            return this.useMultiplatformBandwidthEstimatorWithPlatformSync;
        }

        public final Boolean getUseSurfaceControl() {
            return this.useSurfaceControl;
        }

        public final ScalingMode getVideoScalingMode() {
            return this.videoScalingMode;
        }

        public final void setCodecRecoverStrategy(String str) {
            this.codecRecoverStrategy = str;
        }

        public final void setCodecRecoverStrategyAttempts(Integer num) {
            this.codecRecoverStrategyAttempts = num;
        }

        public final void setCodecTelemetryReportLoggerRecordsCount(Integer num) {
            this.codecTelemetryReportLoggerRecordsCount = num;
        }

        public final void setDisableCodecReuseInCaseOfCodecProfileOrLevelUpgrade$video_player_internalRelease(Boolean bool) {
            this.disableCodecReuseInCaseOfCodecProfileOrLevelUpgrade = bool;
        }

        public final void setDisableTooEarlyMediaCodecNativeReleaseReturnWorkaround(Boolean bool) {
            this.disableTooEarlyMediaCodecNativeReleaseReturnWorkaround = bool;
        }

        public final void setDrmTypeConsumer(DrmTypeConsumer drmTypeConsumer) {
            this.drmTypeConsumer = drmTypeConsumer;
        }

        public final void setEnableAsyncDecoderQueue(Boolean bool) {
            this.enableAsyncDecoderQueue = bool;
        }

        public final void setEnableCodecTelemetryReportLogger(Boolean bool) {
            this.enableCodecTelemetryReportLogger = bool;
        }

        public final void setEnableUseLastBandwidthEstimate(Boolean bool) {
            this.enableUseLastBandwidthEstimate = bool;
        }

        public final void setExoPlayerLooper(Looper looper) {
            this.exoPlayerLooper = looper;
        }

        public final void setIgnoreSeekOnSamePosition$video_player_internalRelease(Boolean bool) {
            this.ignoreSeekOnSamePosition = bool;
        }

        public final void setInitCodecRetriesCount(Integer num) {
            this.initCodecRetriesCount = num;
        }

        public final void setInitCodecTimeoutMs(Long l) {
            this.initCodecTimeoutMs = l;
        }

        public final void setModelsNeedsSetOutputSurfaceWorkaround(List<String> list) {
            this.modelsNeedsSetOutputSurfaceWorkaround = list;
        }

        public final void setReportBuilder(ReportBuilder reportBuilder) {
            this.reportBuilder = reportBuilder;
        }

        public final void setShouldTryInitCodecsWithRetries(Boolean bool) {
            this.shouldTryInitCodecsWithRetries = bool;
        }

        public final void setStrmEventLogger(StrmEventLogger strmEventLogger) {
            this.strmEventLogger = strmEventLogger;
        }

        public final void setStuckStalledConfig$video_player_internalRelease(StuckStalledConfig stuckStalledConfig) {
            this.stuckStalledConfig = stuckStalledConfig;
        }

        public final void setTrackSelectionRestrictionsProvider(TrackSelectionRestrictionsProvider trackSelectionRestrictionsProvider) {
            this.trackSelectionRestrictionsProvider = trackSelectionRestrictionsProvider;
        }

        public final void setUseIncrementalCodecInitTimeout(Boolean bool) {
            this.useIncrementalCodecInitTimeout = bool;
        }

        public final void setUseMultiplatformBandwidthEstimator(Boolean bool) {
            this.useMultiplatformBandwidthEstimator = bool;
        }

        public final void setUseMultiplatformBandwidthEstimatorWithPlatformSync(Boolean bool) {
            this.useMultiplatformBandwidthEstimatorWithPlatformSync = bool;
        }

        public final void setUseSurfaceControl(Boolean bool) {
            this.useSurfaceControl = bool;
        }

        public final void setVideoScalingMode(ScalingMode scalingMode) {
            this.videoScalingMode = scalingMode;
        }

        public Builder(DrmTypeConsumer drmTypeConsumer, Looper looper, TrackSelectionRestrictionsProvider trackSelectionRestrictionsProvider, ScalingMode scalingMode) {
            this.drmTypeConsumer = drmTypeConsumer;
            this.exoPlayerLooper = looper;
            this.trackSelectionRestrictionsProvider = trackSelectionRestrictionsProvider;
            this.videoScalingMode = scalingMode;
        }
    }
}
