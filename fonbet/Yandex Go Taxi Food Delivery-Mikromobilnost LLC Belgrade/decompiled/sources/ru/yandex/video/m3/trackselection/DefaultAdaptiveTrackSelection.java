package ru.yandex.video.m3.trackselection;

import android.os.SystemClock;
import androidx.media3.common.a;
import com.google.common.collect.ImmutableList;
import defpackage.eab1;
import defpackage.ib10;
import defpackage.ip4;
import defpackage.jb10;
import defpackage.jxi;
import defpackage.nsb;
import defpackage.o2x0;
import defpackage.qk51;
import defpackage.rk51;
import defpackage.sk51;
import defpackage.xzz0;
import defpackage.y3c;
import java.util.List;
import ru.yandex.video.m3.player.provider.StartQualityProvider;
import ru.yandex.video.m3.player.provider.Supplier;
import ru.yandex.video.m3.player.provider.model.StartQuality;
import ru.yandex.video.m3.trackselection.adapter.StartQualityProviderToStartQualitySupplierAdapter;

/* loaded from: classes7.dex */
public class DefaultAdaptiveTrackSelection extends sk51 {
    private static final String TAG = "CustomAdaptiveTrackSelection";
    private final Supplier<StartQuality> startQualitySupplier;

    @jxi
    public DefaultAdaptiveTrackSelection(StartQualityProvider startQualityProvider, xzz0 xzz0Var, int[] iArr, int i, ip4 ip4Var, long j, long j2, long j3, int i2, int i3, float f, float f2, List<qk51> list, y3c y3cVar) {
        super(xzz0Var, iArr, i, ip4Var, j, j2, j3, i2, i3, f, f2, list, y3cVar);
        this.startQualitySupplier = StartQualityProviderToStartQualitySupplierAdapter.INSTANCE.createStartQualitySupplierOrNull(startQualityProvider);
    }

    private int findIndexWithConstraints(int i) {
        int i2 = this.length - 1;
        int i3 = Integer.MIN_VALUE;
        for (int i4 = 0; i4 < this.length; i4++) {
            int i5 = getFormat(i4).v;
            if (i3 <= i5 && i >= i5) {
                i2 = i4;
                i3 = i5;
            }
        }
        return i2;
    }

    public boolean isQualityDowngradePossible(a aVar, a aVar2, long j) {
        return aVar.j >= aVar2.j || j < this.maxDurationForQualityDecreaseUs;
    }

    public boolean isQualityUpgradeImpossible(a aVar, a aVar2, long j, long j2) {
        return aVar.j > aVar2.j && j < j2;
    }

    @Override // defpackage.loo
    public /* bridge */ /* synthetic */ void onDiscontinuity() {
    }

    @Override // defpackage.loo
    public /* bridge */ /* synthetic */ void onRebuffer() {
    }

    @Override // defpackage.loo
    public /* bridge */ /* synthetic */ boolean shouldCancelChunkLoad(long j, nsb nsbVar, List list) {
        return false;
    }

    @Override // defpackage.sk51, defpackage.loo
    public void updateSelectedTrack(long j, long j2, long j3, List<? extends ib10> list, jb10[] jb10VarArr) {
        ((o2x0) this.clock).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long nextChunkDurationUs = getNextChunkDurationUs(jb10VarArr, list);
        this.bandwidthMeter.getTimeToFirstByteEstimateUs();
        int i = this.reason;
        if (i == 0) {
            this.reason = 1;
            Supplier<StartQuality> supplier = this.startQualitySupplier;
            if (supplier == null || supplier.getValue() == null) {
                this.selectedIndex = determineIdealSelectedIndex(elapsedRealtime, nextChunkDurationUs);
                return;
            } else {
                this.selectedIndex = findIndexWithConstraints(this.startQualitySupplier.getValue().getHeight());
                return;
            }
        }
        int i2 = this.selectedIndex;
        int indexOf = list.isEmpty() ? -1 : indexOf(((ib10) eab1.c(list)).w);
        if (indexOf != -1) {
            i = ((ib10) eab1.c(list)).x;
            i2 = indexOf;
        }
        int determineIdealSelectedIndex = determineIdealSelectedIndex(elapsedRealtime, nextChunkDurationUs);
        if (!isTrackExcluded(i2, elapsedRealtime)) {
            a format = getFormat(i2);
            a format2 = getFormat(determineIdealSelectedIndex);
            if (isQualityUpgradeImpossible(format2, format, j2, minDurationForQualityIncreaseUs(j3, nextChunkDurationUs)) || !isQualityDowngradePossible(format2, format, j2)) {
                determineIdealSelectedIndex = i2;
            }
        }
        if (determineIdealSelectedIndex != i2) {
            i = 3;
        }
        this.reason = i;
        this.selectedIndex = determineIdealSelectedIndex;
    }

    public static class Factory extends rk51 {
        private final float bandwidthFraction;
        private final float bufferedFractionToLiveEdgeForQualityIncrease;
        private final y3c clock;
        private final int maxDurationForQualityDecreaseMs;
        protected final int maxHeightToDiscard;
        protected final int maxWidthToDiscard;
        private final int minDurationForQualityIncreaseMs;
        private final int minDurationToRetainAfterDiscardMs;
        private final Supplier<StartQuality> startQualitySupplier;

        @jxi
        public Factory(int i, int i2, int i3, int i4, int i5, float f, float f2, y3c y3cVar, StartQualityProvider startQualityProvider) {
            this.minDurationForQualityIncreaseMs = i;
            this.maxDurationForQualityDecreaseMs = i2;
            this.minDurationToRetainAfterDiscardMs = i3;
            this.maxWidthToDiscard = i4;
            this.maxHeightToDiscard = i5;
            this.bandwidthFraction = f;
            this.bufferedFractionToLiveEdgeForQualityIncrease = f2;
            this.clock = y3cVar;
            this.startQualitySupplier = StartQualityProviderToStartQualitySupplierAdapter.INSTANCE.createStartQualitySupplierOrNull(startQualityProvider);
        }

        @Override // defpackage.rk51
        public sk51 createAdaptiveTrackSelection(xzz0 xzz0Var, int[] iArr, int i, ip4 ip4Var, ImmutableList<qk51> immutableList) {
            return new DefaultAdaptiveTrackSelection(this.startQualitySupplier, xzz0Var, iArr, i, ip4Var, this.minDurationForQualityIncreaseMs, this.maxDurationForQualityDecreaseMs, this.minDurationToRetainAfterDiscardMs, this.maxWidthToDiscard, this.maxHeightToDiscard, this.bandwidthFraction, this.bufferedFractionToLiveEdgeForQualityIncrease, immutableList, this.clock);
        }

        public Factory(int i, int i2, int i3, float f, Supplier<StartQuality> supplier) {
            this(i, i2, i3, sk51.DEFAULT_MAX_WIDTH_TO_DISCARD, sk51.DEFAULT_MAX_HEIGHT_TO_DISCARD, f, 0.75f, y3c.a, supplier);
        }

        public Factory(int i, int i2, int i3, int i4, int i5, float f, Supplier<StartQuality> supplier) {
            this(i, i2, i3, i4, i5, f, 0.75f, y3c.a, supplier);
        }

        public Factory(int i, int i2, int i3, float f, float f2, y3c y3cVar, Supplier<StartQuality> supplier) {
            this(i, i2, i3, sk51.DEFAULT_MAX_WIDTH_TO_DISCARD, sk51.DEFAULT_MAX_HEIGHT_TO_DISCARD, f, f2, y3cVar, supplier);
        }

        public Factory(int i, int i2, int i3, int i4, int i5, float f, float f2, y3c y3cVar, Supplier<StartQuality> supplier) {
            this.minDurationForQualityIncreaseMs = i;
            this.maxDurationForQualityDecreaseMs = i2;
            this.minDurationToRetainAfterDiscardMs = i3;
            this.maxWidthToDiscard = i4;
            this.maxHeightToDiscard = i5;
            this.bandwidthFraction = f;
            this.bufferedFractionToLiveEdgeForQualityIncrease = f2;
            this.clock = y3cVar;
            this.startQualitySupplier = supplier;
        }

        @jxi
        public Factory(StartQualityProvider startQualityProvider) {
            this(10000, 25000, 25000, 0.7f, startQualityProvider);
        }

        @jxi
        public Factory(int i, int i2, int i3, float f, StartQualityProvider startQualityProvider) {
            this(i, i2, i3, sk51.DEFAULT_MAX_WIDTH_TO_DISCARD, sk51.DEFAULT_MAX_HEIGHT_TO_DISCARD, f, 0.75f, y3c.a, startQualityProvider);
        }

        @jxi
        public Factory(int i, int i2, int i3, int i4, int i5, float f, StartQualityProvider startQualityProvider) {
            this(i, i2, i3, i4, i5, f, 0.75f, y3c.a, startQualityProvider);
        }

        @jxi
        public Factory(int i, int i2, int i3, float f, float f2, y3c y3cVar, StartQualityProvider startQualityProvider) {
            this(i, i2, i3, sk51.DEFAULT_MAX_WIDTH_TO_DISCARD, sk51.DEFAULT_MAX_HEIGHT_TO_DISCARD, f, f2, y3cVar, startQualityProvider);
        }

        public Factory(Supplier<StartQuality> supplier) {
            this(10000, 25000, 25000, 0.7f, supplier);
        }
    }

    public DefaultAdaptiveTrackSelection(Supplier<StartQuality> supplier, xzz0 xzz0Var, int[] iArr, int i, ip4 ip4Var, long j, long j2, long j3, int i2, int i3, float f, float f2, List<qk51> list, y3c y3cVar) {
        super(xzz0Var, iArr, i, ip4Var, j, j2, j3, i2, i3, f, f2, list, y3cVar);
        this.startQualitySupplier = supplier;
    }
}
