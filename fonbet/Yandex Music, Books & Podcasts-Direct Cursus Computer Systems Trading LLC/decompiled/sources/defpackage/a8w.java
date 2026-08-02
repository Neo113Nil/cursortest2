package defpackage;

import android.os.SystemClock;
import java.util.List;

/* loaded from: classes.dex */
public class a8w extends au2 {
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

    public a8w(xvs xvsVar, int[] iArr, yk2 yk2Var, long j, long j2, long j3, List list) {
        super(0, xvsVar, iArr);
        if (j3 < j) {
            vq1.n0("YAdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
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
        this.o = yde.v(list);
        this.p = dzr.a;
        this.q = 1.0f;
        this.s = 0;
        this.t = -9223372036854775807L;
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
        return Math.max(this.r, 0);
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
    public void m(long j, long j2, long j3, List list, eih[] eihVarArr) {
        this.p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long z = z(eihVarArr, list);
        int i = this.s;
        if (i == 0) {
            this.s = 1;
            this.r = x(elapsedRealtime, z);
            return;
        }
        int i2 = this.r;
        int o = list.isEmpty() ? -1 : o(((dih) ild.x(list)).d);
        if (o != -1) {
            i = ((dih) ild.x(list)).e;
            i2 = o;
        }
        int x = x(elapsedRealtime, z);
        if (x != i2 && !a(i2, elapsedRealtime)) {
            dsc[] dscVarArr = this.d;
            dsc dscVar = dscVarArr[i2];
            dsc dscVar2 = dscVarArr[x];
            long j4 = this.h;
            if (j3 != -9223372036854775807L) {
                j4 = Math.min((long) ((z != -9223372036854775807L ? j3 - z : j3) * this.n), j4);
            }
            int i3 = dscVar2.j;
            int i4 = dscVar.j;
            if ((i3 > i4 && j2 < j4) || (i3 < i4 && j2 >= this.i)) {
                x = i2;
            }
        }
        if (x != i2) {
            i = 3;
        }
        this.s = i;
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

    public boolean w(dsc dscVar, int i, long j) {
        return ((long) i) <= j;
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
            while (i < ydeVar.size() - 1 && ((z7w) ydeVar.get(i)).a < j3) {
                i++;
            }
            z7w z7wVar = (z7w) ydeVar.get(i - 1);
            z7w z7wVar2 = (z7w) ydeVar.get(i);
            long j4 = z7wVar.a;
            long j5 = z7wVar.b;
            j3 = ((long) (((j3 - j4) / (z7wVar2.a - j4)) * (z7wVar2.b - j5))) + j5;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.b; i3++) {
            if (j == Long.MIN_VALUE || !a(i3, j)) {
                dsc dscVar = this.d[i3];
                if (w(dscVar, dscVar.j, j3)) {
                    return i3;
                }
                i2 = i3;
            }
        }
        return i2;
    }

    public final long z(eih[] eihVarArr, List list) {
        int i = this.r;
        if (i < eihVarArr.length && eihVarArr[i].next()) {
            eih eihVar = eihVarArr[this.r];
            return eihVar.c() - eihVar.b();
        }
        for (eih eihVar2 : eihVarArr) {
            if (eihVar2.next()) {
                return eihVar2.c() - eihVar2.b();
            }
        }
        return y(list);
    }
}
