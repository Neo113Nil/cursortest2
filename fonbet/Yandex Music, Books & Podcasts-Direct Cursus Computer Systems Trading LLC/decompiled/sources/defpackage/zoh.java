package defpackage;

import android.util.Pair;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zoh {
    public final uj7 c;
    public final hzr d;
    public final g3a e;
    public long f;
    public int g;
    public boolean h;
    public xoh i;
    public xoh j;
    public xoh k;
    public xoh l;
    public xoh m;
    public int n;
    public Object o;
    public long p;
    public final ois a = new ois();
    public final ris b = new ris();
    public ArrayList q = new ArrayList();

    public zoh(uj7 uj7Var, hzr hzrVar, g3a g3aVar) {
        this.c = uj7Var;
        this.d = hzrVar;
        this.e = g3aVar;
    }

    public static uvh p(sis sisVar, Object obj, long j, long j2, ris risVar, ois oisVar) {
        sisVar.g(obj, oisVar);
        sisVar.n(oisVar.c, risVar);
        int b = sisVar.b(obj);
        Object obj2 = obj;
        while (true) {
            int i = oisVar.g.a;
            if (i == 0) {
                break;
            }
            if ((i == 1 && oisVar.g(0)) || !oisVar.h(oisVar.g.d)) {
                break;
            }
            long j3 = 0;
            if (oisVar.c(0L) != -1) {
                break;
            }
            if (oisVar.d != 0) {
                int i2 = i - (oisVar.g(i + (-1)) ? 2 : 1);
                for (int i3 = 0; i3 <= i2; i3++) {
                    j3 += oisVar.g.a(i3).i;
                }
                if (oisVar.d > j3) {
                    break;
                }
            }
            if (b > risVar.o) {
                break;
            }
            sisVar.f(b, oisVar, true);
            obj2 = oisVar.b;
            obj2.getClass();
            b++;
        }
        sisVar.g(obj2, oisVar);
        int c = oisVar.c(j);
        return c == -1 ? new uvh(obj2, j2, oisVar.b(j)) : new uvh(obj2, c, oisVar.f(c), j2, -1);
    }

    public final xoh a() {
        xoh xohVar = this.i;
        if (xohVar == null) {
            return null;
        }
        if (xohVar == this.j) {
            this.j = xohVar.m;
        }
        if (xohVar == this.k) {
            this.k = xohVar.m;
        }
        xohVar.i();
        int i = this.n - 1;
        this.n = i;
        if (i == 0) {
            this.l = null;
            xoh xohVar2 = this.i;
            this.o = xohVar2.b;
            this.p = xohVar2.g.a.d;
        }
        this.i = this.i.m;
        m();
        return this.i;
    }

    public final void b() {
        if (this.n == 0) {
            return;
        }
        xoh xohVar = this.i;
        vq1.B(xohVar);
        this.o = xohVar.b;
        this.p = xohVar.g.a.d;
        while (xohVar != null) {
            xohVar.i();
            xohVar = xohVar.m;
        }
        this.i = null;
        this.l = null;
        this.j = null;
        this.k = null;
        this.n = 0;
        m();
    }

    public final yoh c(sis sisVar, xoh xohVar, long j) {
        Object obj;
        long j2;
        long j3;
        long j4;
        yoh yohVar = xohVar.g;
        uvh uvhVar = yohVar.a;
        long j5 = yohVar.c;
        int d = sisVar.d(sisVar.b(uvhVar.a), this.a, this.b, this.g, this.h);
        if (d == -1) {
            return null;
        }
        ois oisVar = this.a;
        int i = sisVar.f(d, oisVar, true).c;
        Object obj2 = oisVar.b;
        obj2.getClass();
        long j6 = uvhVar.d;
        long j7 = 0;
        if (sisVar.m(i, this.b, 0L).n == d) {
            Pair j8 = sisVar.j(this.b, this.a, i, -9223372036854775807L, Math.max(0L, j));
            if (j8 == null) {
                return null;
            }
            Object obj3 = j8.first;
            long longValue = ((Long) j8.second).longValue();
            xoh xohVar2 = xohVar.m;
            if (xohVar2 == null || !xohVar2.b.equals(obj3)) {
                long r = r(obj3);
                if (r == -1) {
                    r = this.f;
                    this.f = 1 + r;
                }
                j6 = r;
            } else {
                j6 = xohVar2.g.a.d;
            }
            obj = obj3;
            j2 = longValue;
            j7 = -9223372036854775807L;
        } else {
            obj = obj2;
            j2 = 0;
        }
        uvh p = p(sisVar, obj, j2, j6, this.b, this.a);
        if (j7 != -9223372036854775807L && j5 != -9223372036854775807L) {
            int i2 = sisVar.g(uvhVar.a, oisVar).g.a;
            int i3 = oisVar.g.d;
            boolean z = i2 > 0 && oisVar.h(i3) && (i2 > 1 || oisVar.d(i3) != Long.MIN_VALUE);
            if (p.b() && z) {
                j3 = j2;
                j4 = j5;
                return e(sisVar, p, j4, j3);
            }
            if (z) {
                j3 = j5;
                j4 = j7;
                return e(sisVar, p, j4, j3);
            }
        }
        j3 = j2;
        j4 = j7;
        return e(sisVar, p, j4, j3);
    }

    public final yoh d(sis sisVar, xoh xohVar, long j) {
        ois oisVar;
        sis sisVar2;
        yoh yohVar = xohVar.g;
        long j2 = (xohVar.p + yohVar.e) - j;
        if (yohVar.h) {
            return c(sisVar, xohVar, j2);
        }
        uvh uvhVar = yohVar.a;
        Object obj = uvhVar.a;
        int i = uvhVar.e;
        ois oisVar2 = this.a;
        sisVar.g(obj, oisVar2);
        boolean z = yohVar.g;
        if (!uvhVar.b()) {
            if (i != -1 && oisVar2.g(i)) {
                return c(sisVar, xohVar, j2);
            }
            int f = oisVar2.f(i);
            boolean z2 = oisVar2.h(i) && oisVar2.e(i, f) == 3;
            if (f != oisVar2.g.a(i).b && !z2) {
                return f(sisVar, uvhVar.a, uvhVar.e, f, yohVar.e, uvhVar.d, z);
            }
            sisVar.g(obj, oisVar2);
            long d = oisVar2.d(i);
            return g(sisVar, uvhVar.a, d == Long.MIN_VALUE ? oisVar2.d : oisVar2.g.a(i).i + d, yohVar.e, uvhVar.d, false);
        }
        int i2 = uvhVar.b;
        int i3 = oisVar2.g.a(i2).b;
        if (i3 == -1) {
            return null;
        }
        int a = oisVar2.g.a(i2).a(uvhVar.c);
        if (a < i3) {
            return f(sisVar, uvhVar.a, i2, a, yohVar.c, uvhVar.d, z);
        }
        long j3 = yohVar.c;
        if (j3 == -9223372036854775807L) {
            Pair j4 = sisVar.j(this.b, oisVar2, oisVar2.c, -9223372036854775807L, Math.max(0L, j2));
            oisVar = oisVar2;
            sisVar2 = sisVar;
            if (j4 == null) {
                return null;
            }
            j3 = ((Long) j4.second).longValue();
        } else {
            oisVar = oisVar2;
            sisVar2 = sisVar;
        }
        int i4 = uvhVar.b;
        sisVar2.g(obj, oisVar);
        long d2 = oisVar.d(i4);
        return g(sisVar, uvhVar.a, Math.max(d2 == Long.MIN_VALUE ? oisVar.d : oisVar.g.a(i4).i + d2, j3), yohVar.c, uvhVar.d, z);
    }

    public final yoh e(sis sisVar, uvh uvhVar, long j, long j2) {
        sisVar.g(uvhVar.a, this.a);
        boolean b = uvhVar.b();
        Object obj = uvhVar.a;
        return b ? f(sisVar, obj, uvhVar.b, uvhVar.c, j, uvhVar.d, false) : g(sisVar, obj, j2, j, uvhVar.d, false);
    }

    public final yoh f(sis sisVar, Object obj, int i, int i2, long j, long j2, boolean z) {
        uvh uvhVar = new uvh(obj, i, i2, j2, -1);
        ois oisVar = this.a;
        long a = sisVar.g(obj, oisVar).a(i, i2);
        long j3 = i2 == oisVar.f(i) ? oisVar.g.b : 0L;
        boolean h = oisVar.h(i);
        if (a != -9223372036854775807L && j3 >= a) {
            j3 = Math.max(0L, a - 1);
        }
        return new yoh(uvhVar, j3, j, -9223372036854775807L, a, z, h, false, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final yoh g(sis sisVar, Object obj, long j, long j2, long j3, boolean z) {
        boolean z2;
        boolean z3;
        long j4;
        long j5;
        long j6;
        long j7 = j;
        ois oisVar = this.a;
        sisVar.g(obj, oisVar);
        int b = oisVar.b(j7);
        boolean z4 = b != -1 && oisVar.g(b);
        if (b == -1) {
            lj ljVar = oisVar.g;
            if (ljVar.a > 0 && oisVar.h(ljVar.d)) {
                z3 = true;
            }
            z3 = false;
        } else {
            if (oisVar.h(b) && oisVar.d(b) == oisVar.d) {
                jj a = oisVar.g.a(b);
                int i = a.b;
                if (i != -1) {
                    for (int i2 = 0; i2 < i; i2++) {
                        int i3 = a.f[i2];
                        if (i3 != 0 && i3 != 1) {
                        }
                    }
                    z2 = false;
                    if (!z2) {
                        z3 = true;
                        b = -1;
                    }
                }
                z2 = true;
                if (!z2) {
                }
            }
            z3 = false;
        }
        uvh uvhVar = new uvh(obj, j3, b);
        boolean z5 = !uvhVar.b() && b == -1;
        boolean k = k(sisVar, uvhVar);
        boolean j8 = j(sisVar, uvhVar, z5);
        boolean z6 = (b == -1 || !oisVar.h(b) || z4) ? false : true;
        if (b == -1 || z4) {
            if (!z3) {
                j4 = -9223372036854775807L;
                j6 = (j4 != -9223372036854775807L || j4 == Long.MIN_VALUE) ? oisVar.d : j4;
                if (j6 != -9223372036854775807L && j7 >= j6) {
                    j7 = Math.max(0L, j6 - ((j8 && z3) ? 0 : 1));
                }
                return new yoh(uvhVar, j7, j2, j4, j6, z, z6, z5, k, j8);
            }
            j5 = oisVar.d;
        } else {
            j5 = oisVar.d(b);
        }
        j4 = j5;
        if (j4 != -9223372036854775807L) {
        }
        if (j6 != -9223372036854775807L) {
            j7 = Math.max(0L, j6 - ((j8 && z3) ? 0 : 1));
        }
        return new yoh(uvhVar, j7, j2, j4, j6, z, z6, z5, k, j8);
    }

    public final xoh h() {
        return this.k;
    }

    public final yoh i(sis sisVar, yoh yohVar) {
        uvh uvhVar = yohVar.a;
        boolean b = uvhVar.b();
        int i = uvhVar.e;
        boolean z = false;
        boolean z2 = !b && i == -1;
        int i2 = uvhVar.b;
        boolean k = k(sisVar, uvhVar);
        boolean j = j(sisVar, uvhVar, z2);
        Object obj = uvhVar.a;
        ois oisVar = this.a;
        sisVar.g(obj, oisVar);
        long d = (uvhVar.b() || i == -1) ? -9223372036854775807L : oisVar.d(i);
        long a = uvhVar.b() ? oisVar.a(i2, uvhVar.c) : (d == -9223372036854775807L || d == Long.MIN_VALUE) ? oisVar.d : d;
        if (uvhVar.b()) {
            z = oisVar.h(i2);
        } else if (i != -1 && oisVar.h(i)) {
            z = true;
        }
        return new yoh(uvhVar, yohVar.b, yohVar.c, d, a, yohVar.f, z, z2, k, j);
    }

    public final boolean j(sis sisVar, uvh uvhVar, boolean z) {
        int b = sisVar.b(uvhVar.a);
        if (!sisVar.m(sisVar.f(b, this.a, false).c, this.b, 0L).i) {
            if (sisVar.d(b, this.a, this.b, this.g, this.h) == -1 && z) {
                return true;
            }
        }
        return false;
    }

    public final boolean k(sis sisVar, uvh uvhVar) {
        boolean z = !uvhVar.b() && uvhVar.e == -1;
        Object obj = uvhVar.a;
        if (z) {
            if (sisVar.m(sisVar.g(obj, this.a).c, this.b, 0L).o == sisVar.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void l() {
        xoh xohVar = this.m;
        if (xohVar == null || xohVar.h()) {
            this.m = null;
            for (int i = 0; i < this.q.size(); i++) {
                xoh xohVar2 = (xoh) this.q.get(i);
                if (!xohVar2.h()) {
                    this.m = xohVar2;
                    return;
                }
            }
        }
    }

    public final void m() {
        tde u = yde.u();
        for (xoh xohVar = this.i; xohVar != null; xohVar = xohVar.m) {
            u.a(xohVar.g.a);
        }
        xoh xohVar2 = this.j;
        this.d.e(new cy1(20, this, u, xohVar2 == null ? null : xohVar2.g.a));
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [ahp, java.lang.Object] */
    public final void n(long j) {
        xoh xohVar = this.l;
        if (xohVar != null) {
            vq1.A(xohVar.m == null);
            if (xohVar.e) {
                xohVar.a.t(j - xohVar.p);
            }
        }
    }

    public final int o(xoh xohVar) {
        vq1.B(xohVar);
        int i = 0;
        if (xohVar.equals(this.l)) {
            return 0;
        }
        this.l = xohVar;
        while (true) {
            xohVar = xohVar.m;
            if (xohVar == null) {
                break;
            }
            if (xohVar == this.j) {
                xoh xohVar2 = this.i;
                this.j = xohVar2;
                this.k = xohVar2;
                i = 3;
            }
            if (xohVar == this.k) {
                this.k = this.j;
                i |= 2;
            }
            xohVar.i();
            this.n--;
        }
        xoh xohVar3 = this.l;
        xohVar3.getClass();
        if (xohVar3.m != null) {
            xohVar3.b();
            xohVar3.m = null;
            xohVar3.c();
        }
        m();
        return i;
    }

    public final uvh q(sis sisVar, Object obj, long j) {
        long r;
        int b;
        Object obj2 = obj;
        ois oisVar = this.a;
        int i = sisVar.g(obj2, oisVar).c;
        Object obj3 = this.o;
        if (obj3 == null || (b = sisVar.b(obj3)) == -1 || sisVar.f(b, oisVar, false).c != i) {
            xoh xohVar = this.i;
            while (true) {
                if (xohVar == null) {
                    xoh xohVar2 = this.i;
                    while (true) {
                        if (xohVar2 != null) {
                            int b2 = sisVar.b(xohVar2.b);
                            if (b2 != -1 && sisVar.f(b2, oisVar, false).c == i) {
                                r = xohVar2.g.a.d;
                                break;
                            }
                            xohVar2 = xohVar2.m;
                        } else {
                            r = r(obj2);
                            if (r == -1) {
                                r = this.f;
                                this.f = 1 + r;
                                if (this.i == null) {
                                    this.o = obj2;
                                    this.p = r;
                                }
                            }
                        }
                    }
                } else {
                    if (xohVar.b.equals(obj2)) {
                        r = xohVar.g.a.d;
                        break;
                    }
                    xohVar = xohVar.m;
                }
            }
        } else {
            r = this.p;
        }
        sisVar.g(obj2, oisVar);
        int i2 = oisVar.c;
        ris risVar = this.b;
        sisVar.n(i2, risVar);
        boolean z = false;
        for (int b3 = sisVar.b(obj); b3 >= risVar.n; b3--) {
            sisVar.f(b3, oisVar, true);
            boolean z2 = oisVar.g.a > 0;
            z |= z2;
            if (oisVar.c(oisVar.d) != -1) {
                obj2 = oisVar.b;
                obj2.getClass();
            }
            if (z && (!z2 || oisVar.d != 0)) {
                break;
            }
        }
        return p(sisVar, obj2, j, r, this.b, this.a);
    }

    public final long r(Object obj) {
        for (int i = 0; i < this.q.size(); i++) {
            xoh xohVar = (xoh) this.q.get(i);
            if (xohVar.b.equals(obj)) {
                return xohVar.g.a.d;
            }
        }
        return -1L;
    }

    public final int s(sis sisVar) {
        sis sisVar2;
        xoh xohVar;
        xoh xohVar2 = this.i;
        if (xohVar2 == null) {
            return 0;
        }
        int b = sisVar.b(xohVar2.b);
        while (true) {
            sisVar2 = sisVar;
            b = sisVar2.d(b, this.a, this.b, this.g, this.h);
            while (true) {
                xohVar = xohVar2.m;
                if (xohVar == null || xohVar2.g.h) {
                    break;
                }
                xohVar2 = xohVar;
            }
            if (b == -1 || xohVar == null || sisVar2.b(xohVar.b) != b) {
                break;
            }
            xohVar2 = xohVar;
            sisVar = sisVar2;
        }
        int o = o(xohVar2);
        xohVar2.g = i(sisVar2, xohVar2.g);
        return o;
    }

    public final int t(sis sisVar, long j, long j2, long j3) {
        yoh yohVar;
        xoh xohVar = this.i;
        xoh xohVar2 = null;
        while (true) {
            boolean z = false;
            if (xohVar == null) {
                return 0;
            }
            yoh yohVar2 = xohVar.g;
            if (xohVar2 == null) {
                yohVar = i(sisVar, yohVar2);
            } else {
                yoh d = d(sisVar, xohVar2, j);
                if (d == null || yohVar2.b != d.b || !yohVar2.a.equals(d.a)) {
                    break;
                }
                yohVar = d;
            }
            long j4 = yohVar.e;
            xohVar.g = yohVar.a(yohVar2.c);
            long j5 = yohVar2.e;
            if (j5 != -9223372036854775807L && j5 != j4) {
                xohVar.k();
                long j6 = j4 == -9223372036854775807L ? Long.MAX_VALUE : xohVar.p + j4;
                int i = (xohVar != this.j || xohVar.g.g || (j2 != Long.MIN_VALUE && j2 < j6)) ? 0 : 1;
                if (xohVar == this.k && (j3 == Long.MIN_VALUE || j3 >= j6)) {
                    z = true;
                }
                int o = o(xohVar);
                return o != 0 ? o : z ? i | 2 : i;
            }
            xohVar2 = xohVar;
            xohVar = xohVar.m;
        }
        return o(xohVar2);
    }
}
