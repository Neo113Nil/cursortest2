package ru.yandex.video.m3.player.impl.trackselection;

import android.os.SystemClock;
import androidx.media3.common.a;
import com.google.common.collect.ImmutableList;
import defpackage.h5z0;
import defpackage.ib10;
import defpackage.ip4;
import defpackage.jb10;
import defpackage.nsb;
import defpackage.o2x0;
import defpackage.oyr;
import defpackage.qk51;
import defpackage.sk51;
import defpackage.xzz0;
import defpackage.y3c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.video.m3.data.Size;
import ru.yandex.video.m3.data.SizeKt;
import ru.yandex.video.m3.player.impl.utils.SystemTimeProvider;
import ru.yandex.video.m3.player.provider.Supplier;
import ru.yandex.video.m3.player.provider.model.StartQuality;
import ru.yandex.video.m3.player.provider.model.SurfaceSize;
import ru.yandex.video.m3.player.tracks.CappingProvider;
import ru.yandex.video.m3.trackselection.DefaultAdaptiveTrackSelection;

@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002:\u0001TB\u009f\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\n\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\n2\u0006\u0010&\u001a\u00020\u000eH\u0002¢\u0006\u0004\b'\u0010(J\u0015\u0010+\u001a\u00020*2\u0006\u0010)\u001a\u00020\n¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020*¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b0\u00101J'\u00105\u001a\u00020\u001e2\u0006\u00102\u001a\u00020\"2\u0006\u00103\u001a\u00020\"2\u0006\u00104\u001a\u00020\u000eH\u0014¢\u0006\u0004\b5\u00106J/\u00108\u001a\u00020\u001e2\u0006\u00102\u001a\u00020\"2\u0006\u00103\u001a\u00020\"2\u0006\u00104\u001a\u00020\u000e2\u0006\u00107\u001a\u00020\u000eH\u0014¢\u0006\u0004\b8\u00109J'\u0010<\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\"2\u0006\u0010:\u001a\u00020\n2\u0006\u0010;\u001a\u00020\u000eH\u0014¢\u0006\u0004\b<\u0010=JG\u0010F\u001a\u00020*2\u0006\u0010>\u001a\u00020\u000e2\u0006\u00104\u001a\u00020\u000e2\u0006\u0010?\u001a\u00020\u000e2\u000e\u0010B\u001a\n\u0012\u0006\b\u0001\u0012\u00020A0@2\u000e\u0010E\u001a\n\u0012\u0006\b\u0001\u0012\u00020D0CH\u0016¢\u0006\u0004\bF\u0010GR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010HR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010IR\u0016\u0010J\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010L\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010N\u001a\u00020\u000e8\u0002X\u0082D¢\u0006\u0006\n\u0004\bN\u0010MR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010R\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010S¨\u0006U"}, d2 = {"Lru/yandex/video/m3/player/impl/trackselection/SurfaceSizeDependAdaptiveTrackSelection;", "Lru/yandex/video/m3/trackselection/DefaultAdaptiveTrackSelection;", "Lru/yandex/video/m3/player/tracks/CappingProvider;", "Lru/yandex/video/m3/player/provider/Supplier;", "Lru/yandex/video/m3/player/provider/model/SurfaceSize;", "surfaceSizeSupplier", "Lxzz0;", "group", "", "tracks", "", "type", "Lip4;", "bandwidthMeter", "", "minDurationForQualityIncreaseMs", "maxDurationForQualityDecreaseMs", "minDurationToRetainAfterDiscardMs", "maxWidthToDiscard", "maxHeightToDiscard", "", "bandwidthFraction", "bufferedFractionToLiveEdgeForQualityIncrease", "", "Lqk51;", "adaptationCheckpoints", "Ly3c;", "clock", "Lru/yandex/video/m3/player/provider/model/StartQuality;", "startQualitySupplier", "", "isSwitchHistoryRuleEnabled", "<init>", "(Lru/yandex/video/m3/player/provider/Supplier;Lxzz0;[IILip4;JJJIIFFLjava/util/List;Ly3c;Lru/yandex/video/m3/player/provider/Supplier;Z)V", "Landroidx/media3/common/a;", "format", "canSelectFormatBySurfaceSizeRestriction", "(Landroidx/media3/common/a;)Z", "nowMs", "determineFormatIndexForUnlimitedConnection", "(J)I", "index", "Lzy11;", "lockSelectedIndex", "(I)V", "unlockTrackSelection", "()V", "Lru/yandex/video/m3/data/Size;", "getCapping", "()Lru/yandex/video/m3/data/Size;", "selectedFormat", "currentFormat", "bufferedDurationUs", "isQualityDowngradePossible", "(Landroidx/media3/common/a;Landroidx/media3/common/a;J)Z", "minDurationForQualityIncreaseUs", "isQualityUpgradeImpossible", "(Landroidx/media3/common/a;Landroidx/media3/common/a;JJ)Z", "trackBitrate", "effectiveBitrate", "canSelectFormat", "(Landroidx/media3/common/a;IJ)Z", "playbackPositionUs", "availableDurationUs", "", "Lib10;", "queue", "", "Ljb10;", "mediaChunkIterators", "updateSelectedTrack", "(JJJLjava/util/List;[Ljb10;)V", "Lru/yandex/video/m3/player/provider/Supplier;", "Z", "lastSelectionBitrate", CA20Status.STATUS_USER_I, "lastSelectionDowngradeTimestamp", "J", "qualityUpgradeAfterDowngradeMs", "Lru/yandex/video/m3/player/impl/utils/SystemTimeProvider;", "systemTimeProvider", "Lru/yandex/video/m3/player/impl/utils/SystemTimeProvider;", "lockedSelectionIndex", "Ljava/lang/Integer;", "Factory", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public class SurfaceSizeDependAdaptiveTrackSelection extends DefaultAdaptiveTrackSelection implements CappingProvider {
    public static final int $stable = 8;
    private final boolean isSwitchHistoryRuleEnabled;
    private int lastSelectionBitrate;
    private long lastSelectionDowngradeTimestamp;
    private Integer lockedSelectionIndex;
    private final long qualityUpgradeAfterDowngradeMs;
    private final Supplier<SurfaceSize> surfaceSizeSupplier;
    private final SystemTimeProvider systemTimeProvider;

    public SurfaceSizeDependAdaptiveTrackSelection(Supplier<SurfaceSize> supplier, xzz0 xzz0Var, int[] iArr, int i, ip4 ip4Var, long j, long j2, long j3, int i2, int i3, float f, float f2, List<qk51> list, y3c y3cVar, Supplier<StartQuality> supplier2, boolean z) {
        super(supplier2, xzz0Var, iArr, i, ip4Var, j, j2, j3, i2, i3, f, f2, list, y3cVar);
        this.surfaceSizeSupplier = supplier;
        this.isSwitchHistoryRuleEnabled = z;
        this.lastSelectionBitrate = -1;
        this.lastSelectionDowngradeTimestamp = -1L;
        this.qualityUpgradeAfterDowngradeMs = 10000L;
        this.systemTimeProvider = new SystemTimeProvider();
    }

    private final boolean canSelectFormatBySurfaceSizeRestriction(a format) {
        SurfaceSize value = this.surfaceSizeSupplier.getValue();
        int i = format.v;
        int i2 = format.u;
        if (i <= value.getHeight() && i2 <= value.getWidth()) {
            return true;
        }
        h5z0.a.a("Can not select format " + i2 + 'x' + format.v + " surface " + value.getWidth() + 'x' + value.getHeight(), new Object[0]);
        return false;
    }

    private final int determineFormatIndexForUnlimitedConnection(long nowMs) {
        int i = this.length;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (nowMs == Long.MIN_VALUE || !isTrackExcluded(i3, nowMs)) {
                a format = getFormat(i3);
                if (canSelectFormat(format, format.j, ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED)) {
                    return i3;
                }
                i2 = i3;
            }
        }
        return i2;
    }

    @Override // defpackage.sk51
    public boolean canSelectFormat(a format, int trackBitrate, long effectiveBitrate) {
        if (canSelectFormatBySurfaceSizeRestriction(format)) {
            return super.canSelectFormat(format, trackBitrate, effectiveBitrate);
        }
        return false;
    }

    @Override // ru.yandex.video.m3.player.tracks.CappingProvider
    public Size getCapping() {
        a format = getFormat(determineFormatIndexForUnlimitedConnection(this.systemTimeProvider.elapsedRealtime()));
        return SizeKt.Size$default(format.u, format.v, null, 4, null);
    }

    @Override // ru.yandex.video.m3.trackselection.DefaultAdaptiveTrackSelection
    public boolean isQualityDowngradePossible(a selectedFormat, a currentFormat, long bufferedDurationUs) {
        if (canSelectFormatBySurfaceSizeRestriction(currentFormat)) {
            return super.isQualityDowngradePossible(selectedFormat, currentFormat, bufferedDurationUs);
        }
        h5z0.a.a("current format can not be select by surface size restriction. DowngradePossible!", new Object[0]);
        return true;
    }

    @Override // ru.yandex.video.m3.trackselection.DefaultAdaptiveTrackSelection
    public boolean isQualityUpgradeImpossible(a selectedFormat, a currentFormat, long bufferedDurationUs, long minDurationForQualityIncreaseUs) {
        if (!this.isSwitchHistoryRuleEnabled || selectedFormat.j <= currentFormat.j || this.systemTimeProvider.elapsedRealtime() - this.lastSelectionDowngradeTimestamp >= this.qualityUpgradeAfterDowngradeMs) {
            return super.isQualityUpgradeImpossible(selectedFormat, currentFormat, bufferedDurationUs, minDurationForQualityIncreaseUs);
        }
        return true;
    }

    public final void lockSelectedIndex(int index) {
        if (index < 0) {
            h5z0.a.d(oyr.i(index, "lockSelectedIndex() called with index = "), new Object[0]);
            return;
        }
        Integer valueOf = Integer.valueOf(index);
        this.lockedSelectionIndex = valueOf;
        this.selectedIndex = valueOf.intValue();
    }

    @Override // ru.yandex.video.m3.trackselection.DefaultAdaptiveTrackSelection, defpackage.loo
    public /* bridge */ /* synthetic */ void onDiscontinuity() {
    }

    @Override // ru.yandex.video.m3.trackselection.DefaultAdaptiveTrackSelection, defpackage.loo
    public /* bridge */ /* synthetic */ void onRebuffer() {
    }

    @Override // ru.yandex.video.m3.trackselection.DefaultAdaptiveTrackSelection, defpackage.loo
    public /* bridge */ /* synthetic */ boolean shouldCancelChunkLoad(long j, nsb nsbVar, List list) {
        return false;
    }

    public final void unlockTrackSelection() {
        this.lockedSelectionIndex = null;
    }

    @Override // ru.yandex.video.m3.trackselection.DefaultAdaptiveTrackSelection, defpackage.sk51, defpackage.loo
    public void updateSelectedTrack(long playbackPositionUs, long bufferedDurationUs, long availableDurationUs, List<? extends ib10> queue, jb10[] mediaChunkIterators) {
        if (this.lockedSelectionIndex != null) {
            return;
        }
        super.updateSelectedTrack(playbackPositionUs, bufferedDurationUs, availableDurationUs, queue, mediaChunkIterators);
        a format = getFormat(this.selectedIndex);
        if (this.reason == 1 && !canSelectFormatBySurfaceSizeRestriction(format)) {
            ((o2x0) this.clock).getClass();
            int determineIdealSelectedIndex = determineIdealSelectedIndex(SystemClock.elapsedRealtime(), getNextChunkDurationUs(mediaChunkIterators, queue));
            this.selectedIndex = determineIdealSelectedIndex;
            format = getFormat(determineIdealSelectedIndex);
        }
        int i = format.j;
        if (i < this.lastSelectionBitrate) {
            this.lastSelectionDowngradeTimestamp = this.systemTimeProvider.elapsedRealtime();
        }
        this.lastSelectionBitrate = i;
    }

    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0010\u0018\u00002\u00020\u0001Ba\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J=\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00192\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0014¢\u0006\u0004\b\u001f\u0010 R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b'\u0010&R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b(\u0010&R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b,\u0010+R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b.\u0010/R\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010!\u001a\u0004\b0\u0010#R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00101¨\u00062"}, d2 = {"Lru/yandex/video/m3/player/impl/trackselection/SurfaceSizeDependAdaptiveTrackSelection$Factory;", "Lru/yandex/video/m3/trackselection/DefaultAdaptiveTrackSelection$Factory;", "Lru/yandex/video/m3/player/provider/Supplier;", "Lru/yandex/video/m3/player/provider/model/SurfaceSize;", "surfaceSizeSupplier", "", "minDurationForQualityIncreaseMs", "maxDurationForQualityDecreaseMs", "minDurationToRetainAfterDiscardMs", "", "bandwidthFraction", "bufferedFractionToLiveEdgeForQualityIncrease", "Ly3c;", "clock", "Lru/yandex/video/m3/player/provider/model/StartQuality;", "startQualitySupplier", "", "isSwitchHistoryRuleEnabled", "<init>", "(Lru/yandex/video/m3/player/provider/Supplier;IIIFFLy3c;Lru/yandex/video/m3/player/provider/Supplier;Z)V", "Lxzz0;", "group", "", "tracks", "type", "Lip4;", "bandwidthMeter", "Lcom/google/common/collect/ImmutableList;", "Lqk51;", "adaptationCheckpoints", "Lsk51;", "createAdaptiveTrackSelection", "(Lxzz0;[IILip4;Lcom/google/common/collect/ImmutableList;)Lsk51;", "Lru/yandex/video/m3/player/provider/Supplier;", "getSurfaceSizeSupplier", "()Lru/yandex/video/m3/player/provider/Supplier;", CA20Status.STATUS_USER_I, "getMinDurationForQualityIncreaseMs", "()I", "getMaxDurationForQualityDecreaseMs", "getMinDurationToRetainAfterDiscardMs", "F", "getBandwidthFraction", "()F", "getBufferedFractionToLiveEdgeForQualityIncrease", "Ly3c;", "getClock", "()Ly3c;", "getStartQualitySupplier", "Z", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class Factory extends DefaultAdaptiveTrackSelection.Factory {
        public static final int $stable = 8;
        private final float bandwidthFraction;
        private final float bufferedFractionToLiveEdgeForQualityIncrease;
        private final y3c clock;
        private final boolean isSwitchHistoryRuleEnabled;
        private final int maxDurationForQualityDecreaseMs;
        private final int minDurationForQualityIncreaseMs;
        private final int minDurationToRetainAfterDiscardMs;
        private final Supplier<StartQuality> startQualitySupplier;
        private final Supplier<SurfaceSize> surfaceSizeSupplier;

        public /* synthetic */ Factory(Supplier supplier, int i, int i2, int i3, float f, float f2, y3c y3cVar, Supplier supplier2, boolean z, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(supplier, i, i2, i3, f, f2, y3cVar, (i4 & 128) != 0 ? null : supplier2, (i4 & 256) != 0 ? false : z);
        }

        @Override // ru.yandex.video.m3.trackselection.DefaultAdaptiveTrackSelection.Factory, defpackage.rk51
        public sk51 createAdaptiveTrackSelection(xzz0 group, int[] tracks, int type, ip4 bandwidthMeter, ImmutableList<qk51> adaptationCheckpoints) {
            return new SurfaceSizeDependAdaptiveTrackSelection(this.surfaceSizeSupplier, group, tracks, type, bandwidthMeter, this.minDurationForQualityIncreaseMs, this.maxDurationForQualityDecreaseMs, this.minDurationToRetainAfterDiscardMs, ((DefaultAdaptiveTrackSelection.Factory) this).maxWidthToDiscard, ((DefaultAdaptiveTrackSelection.Factory) this).maxHeightToDiscard, this.bandwidthFraction, this.bufferedFractionToLiveEdgeForQualityIncrease, adaptationCheckpoints, this.clock, this.startQualitySupplier, this.isSwitchHistoryRuleEnabled);
        }

        public final float getBandwidthFraction() {
            return this.bandwidthFraction;
        }

        public final float getBufferedFractionToLiveEdgeForQualityIncrease() {
            return this.bufferedFractionToLiveEdgeForQualityIncrease;
        }

        public final y3c getClock() {
            return this.clock;
        }

        public final int getMaxDurationForQualityDecreaseMs() {
            return this.maxDurationForQualityDecreaseMs;
        }

        public final int getMinDurationForQualityIncreaseMs() {
            return this.minDurationForQualityIncreaseMs;
        }

        public final int getMinDurationToRetainAfterDiscardMs() {
            return this.minDurationToRetainAfterDiscardMs;
        }

        public final Supplier<StartQuality> getStartQualitySupplier() {
            return this.startQualitySupplier;
        }

        public final Supplier<SurfaceSize> getSurfaceSizeSupplier() {
            return this.surfaceSizeSupplier;
        }

        public Factory(Supplier<SurfaceSize> supplier, int i, int i2, int i3, float f, float f2, y3c y3cVar, Supplier<StartQuality> supplier2, boolean z) {
            super(i, i2, i3, f, f2, y3cVar, supplier2);
            this.surfaceSizeSupplier = supplier;
            this.minDurationForQualityIncreaseMs = i;
            this.maxDurationForQualityDecreaseMs = i2;
            this.minDurationToRetainAfterDiscardMs = i3;
            this.bandwidthFraction = f;
            this.bufferedFractionToLiveEdgeForQualityIncrease = f2;
            this.clock = y3cVar;
            this.startQualitySupplier = supplier2;
            this.isSwitchHistoryRuleEnabled = z;
        }
    }

    public /* synthetic */ SurfaceSizeDependAdaptiveTrackSelection(Supplier supplier, xzz0 xzz0Var, int[] iArr, int i, ip4 ip4Var, long j, long j2, long j3, int i2, int i3, float f, float f2, List list, y3c y3cVar, Supplier supplier2, boolean z, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(supplier, xzz0Var, iArr, i, ip4Var, j, j2, j3, i2, i3, f, f2, list, y3cVar, (i4 & 16384) != 0 ? null : supplier2, (i4 & 32768) != 0 ? false : z);
    }
}
