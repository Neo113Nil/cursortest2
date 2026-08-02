package defpackage;

import android.os.SystemClock;
import androidx.media3.common.a;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public final class r80 extends yb5 {
    public final ip4 a;
    public final long b;
    public final long c;
    public final long d;
    public final int e;
    public final int f;
    public final float g;
    public final float h;
    public final ImmutableList i;
    public final o2x0 j;
    public float k;
    public int l;
    public int m;
    public long n;
    public ib10 o;

    public r80(xzz0 xzz0Var, int[] iArr, ip4 ip4Var, long j, long j2, long j3, ImmutableList immutableList) {
        super(0, xzz0Var, iArr);
        if (j3 < j) {
            lk91.j("Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j3 = j;
        }
        this.a = ip4Var;
        this.b = j * 1000;
        this.c = j2 * 1000;
        this.d = j3 * 1000;
        this.e = sk51.DEFAULT_MAX_WIDTH_TO_DISCARD;
        this.f = sk51.DEFAULT_MAX_HEIGHT_TO_DISCARD;
        this.g = 0.7f;
        this.h = 0.75f;
        this.i = ImmutableList.l(immutableList);
        this.j = y3c.a;
        this.k = 1.0f;
        this.m = 0;
        this.n = -9223372036854775807L;
    }

    public static void a(long[] jArr, ArrayList arrayList) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            ImmutableList.a aVar = (ImmutableList.a) arrayList.get(i);
            if (aVar != null) {
                aVar.a(new p80(j, jArr[i]));
            }
        }
    }

    public static long c(List list) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public final int b(long j, long j2) {
        long j3;
        ip4 ip4Var = this.a;
        long bitrateEstimate = (long) (ip4Var.getBitrateEstimate() * this.g);
        long timeToFirstByteEstimateUs = ip4Var.getTimeToFirstByteEstimateUs();
        if (timeToFirstByteEstimateUs == -9223372036854775807L || j2 == -9223372036854775807L) {
            j3 = (long) (bitrateEstimate / this.k);
        } else {
            float f = j2;
            j3 = (long) ((bitrateEstimate * Math.max((f / this.k) - timeToFirstByteEstimateUs, 0.0f)) / f);
        }
        ImmutableList immutableList = this.i;
        if (!immutableList.isEmpty()) {
            int i = 1;
            while (i < immutableList.size() - 1 && ((p80) immutableList.get(i)).a < j3) {
                i++;
            }
            p80 p80Var = (p80) immutableList.get(i - 1);
            p80 p80Var2 = (p80) immutableList.get(i);
            long j4 = p80Var.a;
            long j5 = p80Var.b;
            j3 = ((long) (((j3 - j4) / (p80Var2.a - j4)) * (p80Var2.b - j5))) + j5;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.length; i3++) {
            if (j == Long.MIN_VALUE || !isTrackExcluded(i3, j)) {
                if (getFormat(i3).j <= j3) {
                    return i3;
                }
                i2 = i3;
            }
        }
        return i2;
    }

    @Override // defpackage.yb5, defpackage.loo
    public final void disable() {
        this.o = null;
    }

    @Override // defpackage.yb5, defpackage.loo
    public final void enable() {
        this.n = -9223372036854775807L;
        this.o = null;
    }

    @Override // defpackage.yb5, defpackage.loo
    public final int evaluateQueueSize(long j, List list) {
        int i;
        int i2;
        this.j.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.n;
        if (j2 != -9223372036854775807L && elapsedRealtime - j2 < 1000 && (list.isEmpty() || ((ib10) eab1.c(list)).equals(this.o))) {
            return list.size();
        }
        this.n = elapsedRealtime;
        this.o = list.isEmpty() ? null : (ib10) eab1.c(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long H = tw21.H(this.k, ((ib10) list.get(size - 1)).z - j);
        long j3 = this.d;
        if (H >= j3) {
            a format = getFormat(b(elapsedRealtime, c(list)));
            for (int i3 = 0; i3 < size; i3++) {
                ib10 ib10Var = (ib10) list.get(i3);
                a aVar = ib10Var.w;
                if (tw21.H(this.k, ib10Var.z - j) >= j3 && aVar.j < format.j && (i = aVar.v) != -1 && i <= this.f && (i2 = aVar.u) != -1 && i2 <= this.e && i < format.v) {
                    return i3;
                }
            }
        }
        return size;
    }

    @Override // defpackage.loo
    public final int getSelectedIndex() {
        return this.l;
    }

    @Override // defpackage.loo
    public final Object getSelectionData() {
        return null;
    }

    @Override // defpackage.loo
    public final int getSelectionReason() {
        return this.m;
    }

    @Override // defpackage.yb5, defpackage.loo
    public final void onPlaybackSpeed(float f) {
        this.k = f;
    }

    @Override // defpackage.loo
    public final void updateSelectedTrack(long j, long j2, long j3, List list, jb10[] jb10VarArr) {
        long c;
        this.j.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i = this.l;
        if (i >= jb10VarArr.length || !jb10VarArr[i].next()) {
            int length = jb10VarArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    c = c(list);
                    break;
                }
                jb10 jb10Var = jb10VarArr[i2];
                if (jb10Var.next()) {
                    c = jb10Var.a() - jb10Var.c();
                    break;
                }
                i2++;
            }
        } else {
            jb10 jb10Var2 = jb10VarArr[this.l];
            c = jb10Var2.a() - jb10Var2.c();
        }
        int i3 = this.m;
        if (i3 == 0) {
            this.m = 1;
            this.l = b(elapsedRealtime, c);
            return;
        }
        int i4 = this.l;
        int indexOf = list.isEmpty() ? -1 : indexOf(((ib10) eab1.c(list)).w);
        if (indexOf != -1) {
            i3 = ((ib10) eab1.c(list)).x;
            i4 = indexOf;
        }
        int b = b(elapsedRealtime, c);
        if (b != i4 && !isTrackExcluded(i4, elapsedRealtime)) {
            a format = getFormat(i4);
            a format2 = getFormat(b);
            long j4 = this.b;
            if (j3 != -9223372036854775807L) {
                j4 = Math.min((long) ((c != -9223372036854775807L ? j3 - c : j3) * this.h), j4);
            }
            int i5 = format2.j;
            int i6 = format.j;
            if ((i5 > i6 && j2 < j4) || (i5 < i6 && j2 >= this.c)) {
                b = i4;
            }
        }
        if (b != i4) {
            i3 = 3;
        }
        this.m = i3;
        this.l = b;
    }
}
