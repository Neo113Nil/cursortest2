package ru.yandex.video.m3.player.lowlatency.trackselection;

import android.os.SystemClock;
import androidx.media3.common.a;
import com.google.common.collect.ImmutableList;
import defpackage.evu0;
import defpackage.hl51;
import defpackage.ib10;
import defpackage.ip4;
import defpackage.nsb;
import defpackage.o2x0;
import defpackage.qk51;
import defpackage.sk51;
import defpackage.xzz0;
import defpackage.y3c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.webrtc.MediaStreamTrack;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.player.feature.PlaybackFeaturesProvider;
import ru.yandex.video.m3.player.impl.trackselection.SurfaceSizeDependAdaptiveTrackSelection;
import ru.yandex.video.m3.player.lowlatency.BandwidthMeterProvider;
import ru.yandex.video.m3.player.provider.Supplier;
import ru.yandex.video.m3.player.provider.model.StartQuality;
import ru.yandex.video.m3.player.provider.model.SurfaceSize;
import ru.yandex.video.m3.trackselection.DefaultAdaptiveTrackSelection;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 92\u00020\u00012\u00020\u0002:\u00029:B·\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\n\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010 \u001a\u00020\n\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\b\b\u0002\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u001f\u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\nH\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\fH\u0016¢\u0006\u0004\b,\u0010-J/\u00104\u001a\u00020\u001e2\u0006\u0010.\u001a\u00020\u000e2\u0006\u00100\u001a\u00020/2\u000e\u00103\u001a\n\u0012\u0006\b\u0001\u0012\u00020201H\u0016¢\u0006\u0004\b4\u00105R\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u00106R\u0014\u0010 \u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u00107R\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u00106R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u00108¨\u0006;"}, d2 = {"Lru/yandex/video/m3/player/lowlatency/trackselection/LowLatencyAdaptiveTrackSelection;", "Lru/yandex/video/m3/player/impl/trackselection/SurfaceSizeDependAdaptiveTrackSelection;", "Lru/yandex/video/m3/player/lowlatency/BandwidthMeterProvider;", "Lru/yandex/video/m3/player/provider/Supplier;", "Lru/yandex/video/m3/player/provider/model/SurfaceSize;", "surfaceSizeSupplier", "Lxzz0;", "group", "", "tracks", "", "type", "Lip4;", "bandwidthMeter", "", "minDurationForQualityIncreaseMs", "maxDurationForQualityDecreaseMs", "minDurationToRetainAfterDiscardMs", "maxWidthToDiscard", "maxHeightToDiscard", "", "bandwidthFraction", "bufferedFractionToLiveEdgeForQualityIncrease", "", "Lqk51;", "adaptationCheckpoints", "Ly3c;", "clock", "Lru/yandex/video/m3/player/provider/model/StartQuality;", "startQualitySupplier", "", "shouldAllowInterruptingCurrentChunk", "qualityLevelsToDowngradeOnInterrupt", "isSwitchHistoryRuleEnabled", "Lru/yandex/video/m3/player/feature/PlaybackFeaturesProvider;", "featuresProvider", "<init>", "(Lru/yandex/video/m3/player/provider/Supplier;Lxzz0;[IILip4;JJJIIFFLjava/util/List;Ly3c;Lru/yandex/video/m3/player/provider/Supplier;ZIZLru/yandex/video/m3/player/feature/PlaybackFeaturesProvider;)V", "Landroidx/media3/common/a;", "currentFormat", "levelsToDowngrade", "Lzy11;", "forceQualityDowngrade", "(Landroidx/media3/common/a;I)V", "getBandwidthMeter", "()Lip4;", "playbackPositionUs", "Lnsb;", "loadingChunk", "", "Lib10;", "queue", "shouldCancelChunkLoad", "(JLnsb;Ljava/util/List;)Z", "Z", CA20Status.STATUS_USER_I, "Lru/yandex/video/m3/player/feature/PlaybackFeaturesProvider;", "Companion", "Factory", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LowLatencyAdaptiveTrackSelection extends SurfaceSizeDependAdaptiveTrackSelection implements BandwidthMeterProvider {
    private static final double BANDWIDTH_RATIO_THRESHOLD_TO_DOWNGRADE = 0.85d;
    public static final int DEFAULT_QUALITY_LEVELS_TO_DOWNGRADE_ON_INTERRUPT = 4;
    private static final long FORBID_QUALITY_UPGRADE_DURATION_MS = 10000;
    private final PlaybackFeaturesProvider featuresProvider;
    private final boolean isSwitchHistoryRuleEnabled;
    private final int qualityLevelsToDowngradeOnInterrupt;
    private final boolean shouldAllowInterruptingCurrentChunk;
    public static final int $stable = 8;

    public /* synthetic */ LowLatencyAdaptiveTrackSelection(Supplier supplier, xzz0 xzz0Var, int[] iArr, int i, ip4 ip4Var, long j, long j2, long j3, int i2, int i3, float f, float f2, List list, y3c y3cVar, Supplier supplier2, boolean z, int i4, boolean z2, PlaybackFeaturesProvider playbackFeaturesProvider, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(supplier, xzz0Var, iArr, i, ip4Var, j, j2, j3, i2, i3, f, f2, list, y3cVar, (i5 & 16384) != 0 ? null : supplier2, z, i4, z2, (i5 & 262144) != 0 ? PlaybackFeaturesProvider.INSTANCE : playbackFeaturesProvider);
    }

    private final void forceQualityDowngrade(a currentFormat, int levelsToDowngrade) {
        int min = Math.min(indexOf(currentFormat) + levelsToDowngrade, this.length - 1);
        this.selectedIndex = min;
        this.reason = 3;
        for (int i = 0; i < min; i++) {
            excludeTrack(i, 10000L);
        }
    }

    @Override // ru.yandex.video.m3.player.lowlatency.BandwidthMeterProvider
    public ip4 getBandwidthMeter() {
        return this.bandwidthMeter;
    }

    @Override // ru.yandex.video.m3.player.impl.trackselection.SurfaceSizeDependAdaptiveTrackSelection, ru.yandex.video.m3.trackselection.DefaultAdaptiveTrackSelection, defpackage.loo
    public /* bridge */ /* synthetic */ void onDiscontinuity() {
    }

    @Override // ru.yandex.video.m3.player.impl.trackselection.SurfaceSizeDependAdaptiveTrackSelection, ru.yandex.video.m3.trackselection.DefaultAdaptiveTrackSelection, defpackage.loo
    public /* bridge */ /* synthetic */ void onRebuffer() {
    }

    @Override // ru.yandex.video.m3.player.impl.trackselection.SurfaceSizeDependAdaptiveTrackSelection, ru.yandex.video.m3.trackselection.DefaultAdaptiveTrackSelection, defpackage.loo
    public boolean shouldCancelChunkLoad(long playbackPositionUs, nsb loadingChunk, List<? extends ib10> queue) {
        a aVar = loadingChunk.w;
        if (this.featuresProvider.isLowLatency()) {
            String str = aVar.m;
            boolean z = false;
            if (str != null && !evu0.y(str, MediaStreamTrack.VIDEO_TRACK_KIND, false)) {
                return false;
            }
            if (this.shouldAllowInterruptingCurrentChunk) {
                hl51 hl51Var = loadingChunk instanceof hl51 ? (hl51) loadingChunk : null;
                if (hl51Var != null && queue.indexOf(hl51Var) != -1) {
                    int i = aVar.j;
                    double bitrateEstimate = this.bandwidthMeter.getBitrateEstimate() / i;
                    if ((getFormat(this.selectedIndex).j < i) && bitrateEstimate < BANDWIDTH_RATIO_THRESHOLD_TO_DOWNGRADE) {
                        int indexOf = indexOf(aVar);
                        ((o2x0) this.clock).getClass();
                        if (!isTrackExcluded(indexOf, SystemClock.elapsedRealtime())) {
                            z = true;
                        }
                    }
                    if (z) {
                        forceQualityDowngrade(aVar, this.qualityLevelsToDowngradeOnInterrupt);
                    }
                    return z;
                }
            }
        }
        return super.shouldCancelChunkLoad(playbackPositionUs, loadingChunk, queue);
    }

    public LowLatencyAdaptiveTrackSelection(Supplier<SurfaceSize> supplier, xzz0 xzz0Var, int[] iArr, int i, ip4 ip4Var, long j, long j2, long j3, int i2, int i3, float f, float f2, List<qk51> list, y3c y3cVar, Supplier<StartQuality> supplier2, boolean z, int i4, boolean z2, PlaybackFeaturesProvider playbackFeaturesProvider) {
        super(supplier, xzz0Var, iArr, i, ip4Var, j, j2, j3, i2, i3, f, f2, list, y3cVar, supplier2, z2);
        this.shouldAllowInterruptingCurrentChunk = z;
        this.qualityLevelsToDowngradeOnInterrupt = i4;
        this.isSwitchHistoryRuleEnabled = z2;
        this.featuresProvider = playbackFeaturesProvider;
    }

    @Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u007f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J=\u0010#\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001d2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0014¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010%R\u0014\u0010\u0012\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010&R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010%R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010'¨\u0006("}, d2 = {"Lru/yandex/video/m3/player/lowlatency/trackselection/LowLatencyAdaptiveTrackSelection$Factory;", "Lru/yandex/video/m3/player/impl/trackselection/SurfaceSizeDependAdaptiveTrackSelection$Factory;", "Lru/yandex/video/m3/player/provider/Supplier;", "Lru/yandex/video/m3/player/provider/model/SurfaceSize;", "surfaceSizeSupplier", "", "minDurationForQualityIncreaseMs", "maxDurationForQualityDecreaseMs", "minDurationToRetainAfterDiscardMs", "", "bandwidthFraction", "bufferedFractionToLiveEdgeForQualityIncrease", "Ly3c;", "clock", "Lru/yandex/video/m3/player/provider/model/StartQuality;", "startQualitySupplier", "", "shouldAllowInterruptingCurrentChunk", "qualityLevelsToDowngradeOnInterrupt", "isSwitchHistoryRuleEnabled", "Lru/yandex/video/m3/player/feature/PlaybackFeaturesProvider;", "featuresProvider", "<init>", "(Lru/yandex/video/m3/player/provider/Supplier;IIIFFLy3c;Lru/yandex/video/m3/player/provider/Supplier;ZIZLru/yandex/video/m3/player/feature/PlaybackFeaturesProvider;)V", "Lxzz0;", "group", "", "tracks", "type", "Lip4;", "bandwidthMeter", "Lcom/google/common/collect/ImmutableList;", "Lqk51;", "adaptationCheckpoints", "Lsk51;", "createAdaptiveTrackSelection", "(Lxzz0;[IILip4;Lcom/google/common/collect/ImmutableList;)Lsk51;", "Z", CA20Status.STATUS_USER_I, "Lru/yandex/video/m3/player/feature/PlaybackFeaturesProvider;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Factory extends SurfaceSizeDependAdaptiveTrackSelection.Factory {
        public static final int $stable = 8;
        private final PlaybackFeaturesProvider featuresProvider;
        private final boolean isSwitchHistoryRuleEnabled;
        private final int qualityLevelsToDowngradeOnInterrupt;
        private final boolean shouldAllowInterruptingCurrentChunk;

        public /* synthetic */ Factory(Supplier supplier, int i, int i2, int i3, float f, float f2, y3c y3cVar, Supplier supplier2, boolean z, int i4, boolean z2, PlaybackFeaturesProvider playbackFeaturesProvider, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this(supplier, i, i2, i3, f, f2, y3cVar, (i5 & 128) != 0 ? null : supplier2, (i5 & 256) != 0 ? true : z, (i5 & 512) != 0 ? 4 : i4, (i5 & 1024) != 0 ? false : z2, (i5 & 2048) != 0 ? PlaybackFeaturesProvider.INSTANCE : playbackFeaturesProvider);
        }

        @Override // ru.yandex.video.m3.player.impl.trackselection.SurfaceSizeDependAdaptiveTrackSelection.Factory, ru.yandex.video.m3.trackselection.DefaultAdaptiveTrackSelection.Factory, defpackage.rk51
        public sk51 createAdaptiveTrackSelection(xzz0 group, int[] tracks, int type, ip4 bandwidthMeter, ImmutableList<qk51> adaptationCheckpoints) {
            return new LowLatencyAdaptiveTrackSelection(getSurfaceSizeSupplier(), group, tracks, type, bandwidthMeter, getMinDurationForQualityIncreaseMs(), getMaxDurationForQualityDecreaseMs(), getMinDurationToRetainAfterDiscardMs(), ((DefaultAdaptiveTrackSelection.Factory) this).maxWidthToDiscard, ((DefaultAdaptiveTrackSelection.Factory) this).maxHeightToDiscard, getBandwidthFraction(), getBufferedFractionToLiveEdgeForQualityIncrease(), adaptationCheckpoints, getClock(), getStartQualitySupplier(), this.shouldAllowInterruptingCurrentChunk, this.qualityLevelsToDowngradeOnInterrupt, this.isSwitchHistoryRuleEnabled, this.featuresProvider);
        }

        public Factory(Supplier<SurfaceSize> supplier, int i, int i2, int i3, float f, float f2, y3c y3cVar, Supplier<StartQuality> supplier2, boolean z, int i4, boolean z2, PlaybackFeaturesProvider playbackFeaturesProvider) {
            super(supplier, i, i2, i3, f, f2, y3cVar, supplier2, z2);
            this.shouldAllowInterruptingCurrentChunk = z;
            this.qualityLevelsToDowngradeOnInterrupt = i4;
            this.isSwitchHistoryRuleEnabled = z2;
            this.featuresProvider = playbackFeaturesProvider;
        }
    }
}
