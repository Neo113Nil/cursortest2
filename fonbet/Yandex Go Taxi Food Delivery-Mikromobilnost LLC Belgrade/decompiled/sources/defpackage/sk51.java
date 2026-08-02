package defpackage;

import android.os.SystemClock;
import androidx.media3.common.a;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: classes10.dex */
public class sk51 extends yb5 {
    public static final float DEFAULT_BANDWIDTH_FRACTION = 0.7f;
    public static final float DEFAULT_BUFFERED_FRACTION_TO_LIVE_EDGE_FOR_QUALITY_INCREASE = 0.75f;
    public static final int DEFAULT_MAX_DURATION_FOR_QUALITY_DECREASE_MS = 25000;
    public static final int DEFAULT_MAX_HEIGHT_TO_DISCARD = 719;
    public static final int DEFAULT_MAX_WIDTH_TO_DISCARD = 1279;
    public static final int DEFAULT_MIN_DURATION_FOR_QUALITY_INCREASE_MS = 10000;
    public static final int DEFAULT_MIN_DURATION_TO_RETAIN_AFTER_DISCARD_MS = 25000;
    private static final long MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS = 1000;
    private static final String TAG = "YAdaptiveTrackSelection";
    private final ImmutableList<qk51> adaptationCheckpoints;
    private final float bandwidthFraction;
    protected final ip4 bandwidthMeter;
    private final float bufferedFractionToLiveEdgeForQualityIncrease;
    protected final y3c clock;
    private ib10 lastBufferEvaluationMediaChunk;
    private long lastBufferEvaluationMs;
    private long latestBitrateEstimate;
    protected final long maxDurationForQualityDecreaseUs;
    private final int maxHeightToDiscard;
    private final int maxWidthToDiscard;
    private final long minDurationForQualityIncreaseUs;
    private final long minDurationToRetainAfterDiscardUs;
    private float playbackSpeed;
    protected int reason;
    protected int selectedIndex;

    public sk51(xzz0 xzz0Var, int[] iArr, int i, ip4 ip4Var, long j, long j2, long j3, int i2, int i3, float f, float f2, List list, y3c y3cVar) {
        super(i, xzz0Var, iArr);
        long j4;
        if (j3 < j) {
            lk91.j("Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j4 = j;
        } else {
            j4 = j3;
        }
        this.bandwidthMeter = ip4Var;
        this.minDurationForQualityIncreaseUs = j * 1000;
        this.maxDurationForQualityDecreaseUs = j2 * 1000;
        this.minDurationToRetainAfterDiscardUs = j4 * 1000;
        this.maxWidthToDiscard = i2;
        this.maxHeightToDiscard = i3;
        this.bandwidthFraction = f;
        this.bufferedFractionToLiveEdgeForQualityIncrease = f2;
        this.adaptationCheckpoints = ImmutableList.l(list);
        this.clock = y3cVar;
        this.playbackSpeed = 1.0f;
        this.reason = 0;
        this.lastBufferEvaluationMs = -9223372036854775807L;
        this.latestBitrateEstimate = -2147483647L;
    }

    public static long a(List list) {
        if (!list.isEmpty()) {
            ib10 ib10Var = (ib10) eab1.c(list);
            long j = ib10Var.z;
            if (j != -9223372036854775807L) {
                long j2 = ib10Var.A;
                if (j2 != -9223372036854775807L) {
                    return j2 - j;
                }
            }
        }
        return -9223372036854775807L;
    }

    public boolean canSelectFormat(a aVar, int i, long j) {
        return ((long) i) <= j;
    }

    public int determineIdealSelectedIndex(long j, long j2) {
        long j3;
        long bitrateEstimate = this.bandwidthMeter.getBitrateEstimate();
        this.latestBitrateEstimate = bitrateEstimate;
        long j4 = (long) (bitrateEstimate * this.bandwidthFraction);
        long timeToFirstByteEstimateUs = this.bandwidthMeter.getTimeToFirstByteEstimateUs();
        if (timeToFirstByteEstimateUs == -9223372036854775807L || j2 == -9223372036854775807L) {
            j3 = (long) (j4 / this.playbackSpeed);
        } else {
            float f = j2;
            j3 = (long) ((j4 * Math.max((f / this.playbackSpeed) - timeToFirstByteEstimateUs, 0.0f)) / f);
        }
        if (!this.adaptationCheckpoints.isEmpty()) {
            int i = 1;
            while (i < this.adaptationCheckpoints.size() - 1 && this.adaptationCheckpoints.get(i).a < j3) {
                i++;
            }
            qk51 qk51Var = this.adaptationCheckpoints.get(i - 1);
            qk51 qk51Var2 = this.adaptationCheckpoints.get(i);
            long j5 = qk51Var.a;
            float f2 = (j3 - j5) / (qk51Var2.a - j5);
            j3 = ((long) (f2 * (qk51Var2.b - r2))) + qk51Var.b;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.length; i3++) {
            if (j == Long.MIN_VALUE || !isTrackExcluded(i3, j)) {
                a format = getFormat(i3);
                if (canSelectFormat(format, format.j, j3)) {
                    return i3;
                }
                i2 = i3;
            }
        }
        return i2;
    }

    @Override // defpackage.yb5, defpackage.loo
    public void disable() {
        this.lastBufferEvaluationMediaChunk = null;
    }

    @Override // defpackage.yb5, defpackage.loo
    public void enable() {
        this.lastBufferEvaluationMs = -9223372036854775807L;
        this.lastBufferEvaluationMediaChunk = null;
    }

    @Override // defpackage.yb5, defpackage.loo
    public int evaluateQueueSize(long j, List<? extends ib10> list) {
        int i;
        int i2;
        ((o2x0) this.clock).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!shouldEvaluateQueueSize(elapsedRealtime, list)) {
            return list.size();
        }
        this.lastBufferEvaluationMs = elapsedRealtime;
        this.lastBufferEvaluationMediaChunk = list.isEmpty() ? null : (ib10) eab1.c(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long H = tw21.H(this.playbackSpeed, list.get(size - 1).z - j);
        long minDurationToRetainAfterDiscardUs = getMinDurationToRetainAfterDiscardUs();
        if (H >= minDurationToRetainAfterDiscardUs) {
            a format = getFormat(determineIdealSelectedIndex(elapsedRealtime, a(list)));
            for (int i3 = 0; i3 < size; i3++) {
                ib10 ib10Var = list.get(i3);
                a aVar = ib10Var.w;
                if (tw21.H(this.playbackSpeed, ib10Var.z - j) >= minDurationToRetainAfterDiscardUs && aVar.j < format.j && (i = aVar.v) != -1 && i <= this.maxHeightToDiscard && (i2 = aVar.u) != -1 && i2 <= this.maxWidthToDiscard && i < format.v) {
                    return i3;
                }
            }
        }
        return size;
    }

    public long getLatestBitrateEstimate() {
        return this.latestBitrateEstimate;
    }

    public long getMinDurationToRetainAfterDiscardUs() {
        return this.minDurationToRetainAfterDiscardUs;
    }

    public long getNextChunkDurationUs(jb10[] jb10VarArr, List<? extends ib10> list) {
        int i = this.selectedIndex;
        if (i < jb10VarArr.length && jb10VarArr[i].next()) {
            jb10 jb10Var = jb10VarArr[this.selectedIndex];
            return jb10Var.a() - jb10Var.c();
        }
        for (jb10 jb10Var2 : jb10VarArr) {
            if (jb10Var2.next()) {
                return jb10Var2.a() - jb10Var2.c();
            }
        }
        return a(list);
    }

    @Override // defpackage.loo
    public int getSelectedIndex() {
        return Math.max(this.selectedIndex, 0);
    }

    @Override // defpackage.loo
    public Object getSelectionData() {
        return null;
    }

    @Override // defpackage.loo
    public int getSelectionReason() {
        return this.reason;
    }

    public long minDurationForQualityIncreaseUs(long j, long j2) {
        if (j == -9223372036854775807L) {
            return this.minDurationForQualityIncreaseUs;
        }
        if (j2 != -9223372036854775807L) {
            j -= j2;
        }
        return Math.min((long) (j * this.bufferedFractionToLiveEdgeForQualityIncrease), this.minDurationForQualityIncreaseUs);
    }

    @Override // defpackage.yb5, defpackage.loo
    public void onPlaybackSpeed(float f) {
        this.playbackSpeed = f;
    }

    public boolean shouldEvaluateQueueSize(long j, List<? extends ib10> list) {
        long j2 = this.lastBufferEvaluationMs;
        if (j2 == -9223372036854775807L || j - j2 >= 1000) {
            return true;
        }
        return (list.isEmpty() || ((ib10) eab1.c(list)).equals(this.lastBufferEvaluationMediaChunk)) ? false : true;
    }

    @Override // defpackage.loo
    public void updateSelectedTrack(long j, long j2, long j3, List list, jb10[] jb10VarArr) {
        ((o2x0) this.clock).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long nextChunkDurationUs = getNextChunkDurationUs(jb10VarArr, list);
        int i = this.reason;
        if (i == 0) {
            this.reason = 1;
            this.selectedIndex = determineIdealSelectedIndex(elapsedRealtime, nextChunkDurationUs);
            return;
        }
        int i2 = this.selectedIndex;
        int indexOf = list.isEmpty() ? -1 : indexOf(((ib10) eab1.c(list)).w);
        if (indexOf != -1) {
            i = ((ib10) eab1.c(list)).x;
            i2 = indexOf;
        }
        int determineIdealSelectedIndex = determineIdealSelectedIndex(elapsedRealtime, nextChunkDurationUs);
        if (determineIdealSelectedIndex != i2 && !isTrackExcluded(i2, elapsedRealtime)) {
            a format = getFormat(i2);
            a format2 = getFormat(determineIdealSelectedIndex);
            long minDurationForQualityIncreaseUs = minDurationForQualityIncreaseUs(j3, nextChunkDurationUs);
            int i3 = format2.j;
            int i4 = format.j;
            if ((i3 > i4 && j2 < minDurationForQualityIncreaseUs) || (i3 < i4 && j2 >= this.maxDurationForQualityDecreaseUs)) {
                determineIdealSelectedIndex = i2;
            }
        }
        if (determineIdealSelectedIndex != i2) {
            i = 3;
        }
        this.reason = i;
        this.selectedIndex = determineIdealSelectedIndex;
    }
}
