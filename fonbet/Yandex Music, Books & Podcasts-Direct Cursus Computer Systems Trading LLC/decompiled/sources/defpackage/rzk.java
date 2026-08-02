package defpackage;

import android.os.SystemClock;
import java.util.List;

/* loaded from: classes.dex */
public final class rzk {
    public static final uvh u = new uvh(new Object());
    public final sis a;
    public final uvh b;
    public final long c;
    public final long d;
    public final int e;
    public final pqb f;
    public final boolean g;
    public final yvs h;
    public final c1t i;
    public final List j;
    public final uvh k;
    public final boolean l;
    public final int m;
    public final int n;
    public final p0l o;
    public final boolean p;
    public volatile long q;
    public volatile long r;
    public volatile long s;
    public volatile long t;

    public rzk(sis sisVar, uvh uvhVar, long j, long j2, int i, pqb pqbVar, boolean z, yvs yvsVar, c1t c1tVar, List list, uvh uvhVar2, boolean z2, int i2, int i3, p0l p0lVar, long j3, long j4, long j5, long j6, boolean z3) {
        this.a = sisVar;
        this.b = uvhVar;
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = pqbVar;
        this.g = z;
        this.h = yvsVar;
        this.i = c1tVar;
        this.j = list;
        this.k = uvhVar2;
        this.l = z2;
        this.m = i2;
        this.n = i3;
        this.o = p0lVar;
        this.q = j3;
        this.r = j4;
        this.s = j5;
        this.t = j6;
        this.p = z3;
    }

    public static rzk j(c1t c1tVar) {
        mis misVar = sis.a;
        yvs yvsVar = yvs.d;
        qsn qsnVar = qsn.e;
        p0l p0lVar = p0l.d;
        uvh uvhVar = u;
        return new rzk(misVar, uvhVar, -9223372036854775807L, 0L, 1, null, false, yvsVar, c1tVar, qsnVar, uvhVar, false, 1, 0, p0lVar, 0L, 0L, 0L, 0L, false);
    }

    public final rzk a() {
        return new rzk(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, k(), SystemClock.elapsedRealtime(), this.p);
    }

    public final rzk b(boolean z) {
        return new rzk(this.a, this.b, this.c, this.d, this.e, this.f, z, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final rzk c(uvh uvhVar) {
        return new rzk(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, uvhVar, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final rzk d(uvh uvhVar, long j, long j2, long j3, long j4, yvs yvsVar, c1t c1tVar, List list) {
        return new rzk(this.a, uvhVar, j2, j3, this.e, this.f, this.g, yvsVar, c1tVar, list, this.k, this.l, this.m, this.n, this.o, this.q, j4, j, SystemClock.elapsedRealtime(), this.p);
    }

    public final rzk e(int i, int i2, boolean z) {
        return new rzk(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, z, i, i2, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final rzk f(pqb pqbVar) {
        return new rzk(this.a, this.b, this.c, this.d, this.e, pqbVar, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final rzk g(p0l p0lVar) {
        return new rzk(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, p0lVar, this.q, this.r, this.s, this.t, this.p);
    }

    public final rzk h(int i) {
        return new rzk(this.a, this.b, this.c, this.d, i, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final rzk i(sis sisVar) {
        return new rzk(sisVar, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final long k() {
        long j;
        long j2;
        if (!l()) {
            return this.s;
        }
        do {
            j = this.t;
            j2 = this.s;
        } while (j != this.t);
        return dvt.Y(dvt.m0(j2) + ((long) ((SystemClock.elapsedRealtime() - j) * this.o.a)));
    }

    public final boolean l() {
        return this.e == 3 && this.l && this.n == 0;
    }
}
