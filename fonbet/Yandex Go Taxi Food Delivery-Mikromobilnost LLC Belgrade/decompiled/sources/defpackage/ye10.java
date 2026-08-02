package defpackage;

import android.util.Pair;

/* loaded from: classes10.dex */
public final class ye10 {
    public final xe10 a;
    public final Object b;
    public final xyl0[] c;
    public boolean d;
    public boolean e;
    public boolean f;
    public ze10 g;
    public boolean h;
    public final boolean[] i;
    public final iyi0[] j;
    public final x001 k;
    public final jg10 l;
    public ye10 m;
    public yzz0 n;
    public y001 o;
    public long p;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [m3c] */
    public ye10(iyi0[] iyi0VarArr, long j, x001 x001Var, au1 au1Var, jg10 jg10Var, ze10 ze10Var, y001 y001Var) {
        this.j = iyi0VarArr;
        this.p = j;
        this.k = x001Var;
        this.l = jg10Var;
        sf10 sf10Var = ze10Var.a;
        this.b = sf10Var.a;
        this.g = ze10Var;
        this.n = yzz0.d;
        this.o = y001Var;
        this.c = new xyl0[iyi0VarArr.length];
        this.i = new boolean[iyi0VarArr.length];
        long j2 = ze10Var.b;
        long j3 = ze10Var.d;
        boolean z = ze10Var.f;
        jg10Var.getClass();
        Object obj = sf10Var.a;
        int i = kzc0.k;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        sf10 a = sf10Var.a(pair.second);
        hg10 hg10Var = (hg10) jg10Var.d.get(obj2);
        hg10Var.getClass();
        jg10Var.g.add(hg10Var);
        gg10 gg10Var = (gg10) jg10Var.f.get(hg10Var);
        if (gg10Var != null) {
            gg10Var.a.enable(gg10Var.b);
        }
        hg10Var.c.add(a);
        oy00 createPeriod = hg10Var.a.createPeriod(a, au1Var, j2);
        jg10Var.c.put(createPeriod, hg10Var);
        jg10Var.c();
        this.a = j3 != -9223372036854775807L ? new m3c(createPeriod, !z, 0L, j3) : createPeriod;
    }

    public final long a(y001 y001Var, long j, boolean z, boolean[] zArr) {
        iyi0[] iyi0VarArr;
        xyl0[] xyl0VarArr;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= y001Var.a) {
                break;
            }
            if (z || !y001Var.a(this.o, i)) {
                z2 = false;
            }
            this.i[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            iyi0VarArr = this.j;
            int length = iyi0VarArr.length;
            xyl0VarArr = this.c;
            if (i2 >= length) {
                break;
            }
            if (iyi0VarArr[i2].getTrackType() == -2) {
                xyl0VarArr[i2] = null;
            }
            i2++;
        }
        b();
        this.o = y001Var;
        c();
        long k = this.a.k(y001Var.c, this.i, this.c, zArr, j);
        for (int i3 = 0; i3 < iyi0VarArr.length; i3++) {
            if (iyi0VarArr[i3].getTrackType() == -2 && this.o.b(i3)) {
                xyl0VarArr[i3] = new dxn();
            }
        }
        this.f = false;
        for (int i4 = 0; i4 < xyl0VarArr.length; i4++) {
            if (xyl0VarArr[i4] != null) {
                d6z.x(y001Var.b(i4));
                if (iyi0VarArr[i4].getTrackType() != -2) {
                    this.f = true;
                }
            } else {
                d6z.x(y001Var.c[i4] == null);
            }
        }
        return k;
    }

    public final void b() {
        if (this.m != null) {
            return;
        }
        int i = 0;
        while (true) {
            y001 y001Var = this.o;
            if (i >= y001Var.a) {
                return;
            }
            boolean b = y001Var.b(i);
            loo looVar = this.o.c[i];
            if (b && looVar != null) {
                looVar.disable();
            }
            i++;
        }
    }

    public final void c() {
        if (this.m != null) {
            return;
        }
        int i = 0;
        while (true) {
            y001 y001Var = this.o;
            if (i >= y001Var.a) {
                return;
            }
            boolean b = y001Var.b(i);
            loo looVar = this.o.c[i];
            if (b && looVar != null) {
                looVar.enable();
            }
            i++;
        }
    }

    public final long d() {
        if (!this.e) {
            return this.g.b;
        }
        long g = this.f ? this.a.g() : Long.MIN_VALUE;
        return g == Long.MIN_VALUE ? this.g.e : g;
    }

    public final long e() {
        return this.g.b + this.p;
    }

    public final void f(float f, a9z0 a9z0Var, boolean z) {
        this.e = true;
        this.n = this.a.getTrackGroups();
        y001 j = j(f, a9z0Var, z);
        ze10 ze10Var = this.g;
        long j2 = ze10Var.b;
        long j3 = ze10Var.e;
        if (j3 != -9223372036854775807L && j2 >= j3) {
            j2 = Math.max(0L, j3 - 1);
        }
        long a = a(j, j2, false, new boolean[this.j.length]);
        long j4 = this.p;
        ze10 ze10Var2 = this.g;
        this.p = (ze10Var2.b - a) + j4;
        this.g = ze10Var2.b(a);
    }

    public final boolean g() {
        if (this.e) {
            return !this.f || this.a.g() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean h() {
        if (this.e) {
            return g() || d() - this.g.b >= -9223372036854775807L;
        }
        return false;
    }

    public final void i() {
        b();
        xe10 xe10Var = this.a;
        try {
            boolean z = xe10Var instanceof m3c;
            jg10 jg10Var = this.l;
            if (z) {
                jg10Var.f(((m3c) xe10Var).a);
            } else {
                jg10Var.f(xe10Var);
            }
        } catch (RuntimeException e) {
            lk91.f("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final y001 j(float f, a9z0 a9z0Var, boolean z) {
        loo[] looVarArr;
        yzz0 yzz0Var = this.n;
        sf10 sf10Var = this.g.a;
        x001 x001Var = this.k;
        iyi0[] iyi0VarArr = this.j;
        y001 selectTracks = x001Var.selectTracks(iyi0VarArr, yzz0Var, sf10Var, a9z0Var);
        int i = 0;
        while (true) {
            int i2 = selectTracks.a;
            looVarArr = selectTracks.c;
            if (i >= i2) {
                break;
            }
            if (selectTracks.b(i)) {
                if (looVarArr[i] == null && iyi0VarArr[i].getTrackType() != -2) {
                    r4 = false;
                }
                d6z.x(r4);
            } else {
                d6z.x(looVarArr[i] == null);
            }
            i++;
        }
        for (loo looVar : looVarArr) {
            if (looVar != null) {
                looVar.onPlaybackSpeed(f);
                looVar.onPlayWhenReadyChanged(z);
            }
        }
        return selectTracks;
    }

    public final void k() {
        xe10 xe10Var = this.a;
        if (xe10Var instanceof m3c) {
            long j = this.g.d;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            m3c m3cVar = (m3c) xe10Var;
            m3cVar.x = 0L;
            m3cVar.y = j;
        }
    }
}
