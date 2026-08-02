package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class kk extends au2 {
    public final yk2 g;
    public final long h;
    public final long i;
    public final long j;
    public final int k;
    public final int l;
    public final float m;
    public final float n;
    public final yde o;
    public final dzr p;
    public float q;
    public int r;
    public int s;
    public long t;
    public dih u;

    public kk(xvs xvsVar, int[] iArr, yk2 yk2Var, long j, long j2, long j3, yde ydeVar) {
        super(0, xvsVar, iArr);
        if (j3 < j) {
            vq1.n0("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j3 = j;
        }
        this.g = yk2Var;
        this.h = j * 1000;
        this.i = j2 * 1000;
        this.j = j3 * 1000;
        this.k = 1279;
        this.l = 719;
        this.m = 0.7f;
        this.n = 0.75f;
        this.o = yde.v(ydeVar);
        this.p = dzr.a;
        this.q = 1.0f;
        this.s = 0;
        this.t = -9223372036854775807L;
    }

    public static void w(ArrayList arrayList, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            tde tdeVar = (tde) arrayList.get(i);
            if (tdeVar != null) {
                tdeVar.a(new jk(j, jArr[i]));
            }
        }
    }

    public static long y(List list) {
        if (!list.isEmpty()) {
            dih dihVar = (dih) ild.x(list);
            long j = dihVar.g;
            if (j != -9223372036854775807L) {
                long j2 = dihVar.h;
                if (j2 != -9223372036854775807L) {
                    return j2 - j;
                }
            }
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.zsb
    public final int b() {
        return this.r;
    }

    @Override // defpackage.au2, defpackage.zsb
    public final void g() {
        this.u = null;
    }

    @Override // defpackage.au2, defpackage.zsb
    public final void i(float f) {
        this.q = f;
    }

    @Override // defpackage.zsb
    public final Object j() {
        return null;
    }

    @Override // defpackage.zsb
    public final void m(long j, long j2, long j3, List list, eih[] eihVarArr) {
        long y;
        this.p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i = this.r;
        if (i >= eihVarArr.length || !eihVarArr[i].next()) {
            int length = eihVarArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    y = y(list);
                    break;
                }
                eih eihVar = eihVarArr[i2];
                if (eihVar.next()) {
                    y = eihVar.c() - eihVar.b();
                    break;
                }
                i2++;
            }
        } else {
            eih eihVar2 = eihVarArr[this.r];
            y = eihVar2.c() - eihVar2.b();
        }
        int i3 = this.s;
        if (i3 == 0) {
            this.s = 1;
            this.r = x(elapsedRealtime, y);
            return;
        }
        int i4 = this.r;
        int o = list.isEmpty() ? -1 : o(((dih) ild.x(list)).d);
        if (o != -1) {
            i3 = ((dih) ild.x(list)).e;
            i4 = o;
        }
        int x = x(elapsedRealtime, y);
        if (x != i4 && !a(i4, elapsedRealtime)) {
            dsc[] dscVarArr = this.d;
            dsc dscVar = dscVarArr[i4];
            dsc dscVar2 = dscVarArr[x];
            long j4 = this.h;
            if (j3 != -9223372036854775807L) {
                j4 = Math.min((long) ((y != -9223372036854775807L ? j3 - y : j3) * this.n), j4);
            }
            int i5 = dscVar2.j;
            int i6 = dscVar.j;
            if ((i5 > i6 && j2 < j4) || (i5 < i6 && j2 >= this.i)) {
                x = i4;
            }
        }
        if (x != i4) {
            i3 = 3;
        }
        this.s = i3;
        this.r = x;
    }

    @Override // defpackage.au2, defpackage.zsb
    public final void q() {
        this.t = -9223372036854775807L;
        this.u = null;
    }

    @Override // defpackage.zsb
    public final int t() {
        return this.s;
    }

    @Override // defpackage.au2, defpackage.zsb
    public final int v(List list, long j) {
        int i;
        int i2;
        this.p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.t;
        if (j2 != -9223372036854775807L && elapsedRealtime - j2 < 1000 && (list.isEmpty() || ((dih) ild.x(list)).equals(this.u))) {
            return list.size();
        }
        this.t = elapsedRealtime;
        this.u = list.isEmpty() ? null : (dih) ild.x(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long K = dvt.K(this.q, ((dih) list.get(size - 1)).g - j);
        long j3 = this.j;
        if (K >= j3) {
            dsc dscVar = this.d[x(elapsedRealtime, y(list))];
            for (int i3 = 0; i3 < size; i3++) {
                dih dihVar = (dih) list.get(i3);
                dsc dscVar2 = dihVar.d;
                if (dvt.K(this.q, dihVar.g - j) >= j3 && dscVar2.j < dscVar.j && (i = dscVar2.v) != -1 && i <= this.l && (i2 = dscVar2.u) != -1 && i2 <= this.k && i < dscVar.v) {
                    return i3;
                }
            }
        }
        return size;
    }

    public final int x(long j, long j2) {
        long j3;
        yk2 yk2Var = this.g;
        long d = (long) (yk2Var.d() * this.m);
        long b = yk2Var.b();
        if (b == -9223372036854775807L || j2 == -9223372036854775807L) {
            j3 = (long) (d / this.q);
        } else {
            float f = j2;
            j3 = (long) ((d * Math.max((f / this.q) - b, 0.0f)) / f);
        }
        yde ydeVar = this.o;
        if (!ydeVar.isEmpty()) {
            int i = 1;
            while (i < ydeVar.size() - 1 && ((jk) ydeVar.get(i)).a < j3) {
                i++;
            }
            jk jkVar = (jk) ydeVar.get(i - 1);
            jk jkVar2 = (jk) ydeVar.get(i);
            long j4 = jkVar.a;
            long j5 = jkVar.b;
            j3 = ((long) (((j3 - j4) / (jkVar2.a - j4)) * (jkVar2.b - j5))) + j5;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.b; i3++) {
            if (j == Long.MIN_VALUE || !a(i3, j)) {
                if (this.d[i3].j <= j3) {
                    return i3;
                }
                i2 = i3;
            }
        }
        return i2;
    }
}
