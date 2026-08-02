package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.a0;
import androidx.datastore.preferences.protobuf.v;
import defpackage.a1c;
import defpackage.awf;
import defpackage.l1j;
import defpackage.lrv;
import defpackage.s9h;
import defpackage.wvs;
import java.nio.charset.Charset;
import java.util.List;

/* loaded from: classes.dex */
final class i implements q0 {
    public final h a;
    public int b;
    public int c;
    public int d = 0;

    public i(h hVar) {
        Charset charset = u.a;
        this.a = hVar;
        hVar.b = this;
    }

    public static void T(int i) {
        if ((i & 3) != 0) {
            throw v.e();
        }
    }

    public static void U(int i) {
        if ((i & 7) != 0) {
            throw v.e();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public final void A(List list) {
        int u;
        if (list instanceof t) {
            l1j.f();
            return;
        }
        int i = this.b & 7;
        h hVar = this.a;
        if (i == 2) {
            int v = hVar.v();
            T(v);
            int b = hVar.b() + v;
            do {
                list.add(Integer.valueOf(hVar.j()));
            } while (hVar.b() < b);
            return;
        }
        if (i != 5) {
            throw v.b();
        }
        do {
            list.add(Integer.valueOf(hVar.j()));
            if (hVar.c()) {
                return;
            } else {
                u = hVar.u();
            }
        } while (u == this.b);
        this.d = u;
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public final long B() {
        R(0);
        return this.a.r();
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public final String C() {
        R(2);
        return this.a.s();
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public final int D() {
        int i = this.d;
        if (i != 0) {
            this.b = i;
            this.d = 0;
        } else {
            this.b = this.a.u();
        }
        int i2 = this.b;
        if (i2 == 0 || i2 == this.c) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public final void E(List list) {
        P(list, false);
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public final void F(List list) {
        int u;
        if (list instanceof q) {
            l1j.f();
            return;
        }
        int i = this.b & 7;
        h hVar = this.a;
        if (i == 2) {
            int v = hVar.v();
            T(v);
            int b = hVar.b() + v;
            do {
                list.add(Float.valueOf(hVar.l()));
            } while (hVar.b() < b);
            return;
        }
        if (i != 5) {
            throw v.b();
        }
        do {
            list.add(Float.valueOf(hVar.l()));
            if (hVar.c()) {
                return;
            } else {
                u = hVar.u();
            }
        } while (u == this.b);
        this.d = u;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0059, code lost:
    
        r10.put(r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005c, code lost:
    
        r1.d(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x005f, code lost:
    
        return;
     */
    @Override // androidx.datastore.preferences.protobuf.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G(s9h s9hVar, a0.a aVar, a1c a1cVar) {
        R(2);
        h hVar = this.a;
        int e = hVar.e(hVar.v());
        Object obj = aVar.c;
        Object obj2 = "";
        Object obj3 = obj;
        while (true) {
            try {
                int D = D();
                if (D == Integer.MAX_VALUE || hVar.c()) {
                    break;
                }
                if (D == 1) {
                    obj2 = M(aVar.a, null, null);
                } else if (D != 2) {
                    try {
                        if (!S()) {
                            throw new v("Unable to parse map entry.");
                        }
                    } catch (v.a unused) {
                        if (!S()) {
                            throw new v("Unable to parse map entry.");
                        }
                    }
                } else {
                    obj3 = M(aVar.b, obj.getClass(), a1cVar);
                }
            } catch (Throwable th) {
                hVar.d(e);
                throw th;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public final int H() {
        R(5);
        return this.a.o();
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public final void I(List list) {
        int u;
        if ((this.b & 7) != 2) {
            throw v.b();
        }
        do {
            list.add(o());
            h hVar = this.a;
            if (hVar.c()) {
                return;
            } else {
                u = hVar.u();
            }
        } while (u == this.b);
        this.d = u;
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public final void J(List list) {
        int u;
        if (list instanceof l) {
            l1j.f();
            return;
        }
        int i = this.b & 7;
        h hVar = this.a;
        if (i == 1) {
            do {
                list.add(Double.valueOf(hVar.h()));
                if (hVar.c()) {
                    return;
                } else {
                    u = hVar.u();
                }
            } while (u == this.b);
            this.d = u;
            return;
        }
        if (i != 2) {
            throw v.b();
        }
        int v = hVar.v();
        U(v);
        int b = hVar.b() + v;
        do {
            list.add(Double.valueOf(hVar.h()));
        } while (hVar.b() < b);
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public final long K() {
        R(0);
        return this.a.n();
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public final String L() {
        R(2);
        return this.a.t();
    }

    public final Object M(lrv lrvVar, Class cls, a1c a1cVar) {
        switch (lrvVar.ordinal()) {
            case 0:
                return Double.valueOf(readDouble());
            case 1:
                return Float.valueOf(readFloat());
            case 2:
                return Long.valueOf(K());
            case 3:
                return Long.valueOf(t());
            case 4:
                return Integer.valueOf(p());
            case 5:
                return Long.valueOf(a());
            case 6:
                return Integer.valueOf(v());
            case 7:
                return Boolean.valueOf(d());
            case 8:
                return L();
            case 9:
            default:
                wvs.p("unsupported field type.");
                return null;
            case 10:
                R(2);
                return O(n0.c.a(cls), a1cVar);
            case 11:
                return o();
            case 12:
                return Integer.valueOf(g());
            case 13:
                return Integer.valueOf(k());
            case 14:
                return Integer.valueOf(H());
            case 15:
                return Long.valueOf(e());
            case 16:
                return Integer.valueOf(l());
            case 17:
                return Long.valueOf(B());
        }
    }

    public final Object N(r0 r0Var, a1c a1cVar) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            Object c = r0Var.c();
            r0Var.d(c, this, a1cVar);
            r0Var.a(c);
            if (this.b == this.c) {
                return c;
            }
            throw v.e();
        } finally {
            this.c = i;
        }
    }

    public final Object O(r0 r0Var, a1c a1cVar) {
        h hVar = this.a;
        int v = hVar.v();
        if (hVar.a >= 100) {
            throw new v("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int e = hVar.e(v);
        Object c = r0Var.c();
        hVar.a++;
        r0Var.d(c, this, a1cVar);
        r0Var.a(c);
        hVar.a(0);
        hVar.a--;
        hVar.d(e);
        return c;
    }

    public final void P(List list, boolean z) {
        int u;
        int u2;
        if ((this.b & 7) != 2) {
            throw v.b();
        }
        boolean z2 = list instanceof awf;
        h hVar = this.a;
        if (!z2 || z) {
            do {
                list.add(z ? L() : C());
                if (hVar.c()) {
                    return;
                } else {
                    u = hVar.u();
                }
            } while (u == this.b);
            this.d = u;
            return;
        }
        awf awfVar = (awf) list;
        do {
            awfVar.J(o());
            if (hVar.c()) {
                return;
            } else {
                u2 = hVar.u();
            }
        } while (u2 == this.b);
        this.d = u2;
    }

    public final void Q(int i) {
        if (this.a.b() != i) {
            throw v.f();
        }
    }

    public final void R(int i) {
        if ((this.b & 7) != i) {
            throw v.b();
        }
    }

    public final boolean S() {
        int i;
        h hVar = this.a;
        if (hVar.c() || (i = this.b) == this.c) {
            return false;
        }
        return hVar.x(i);
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public final long a() {
        R(1);
        return this.a.k();
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public final void b(List list) {
        int u;
        if (list instanceof t) {
            l1j.f();
            return;
        }
        int i = this.b & 7;
        h hVar = this.a;
        if (i == 2) {
            int v = hVar.v();
            T(v);
            int b = hVar.b() + v;
            do {
                list.add(Integer.valueOf(hVar.o()));
            } while (hVar.b() < b);
            return;
        }
        if (i != 5) {
            throw v.b();
        }
        do {
            list.add(Integer.valueOf(hVar.o()));
            if (hVar.c()) {
                return;
            } else {
                u = hVar.u();
            }
        } while (u == this.b);
        this.d = u;
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public final void c(List list) {
        int u;
        if (list instanceof y) {
            l1j.f();
            return;
        }
        int i = this.b & 7;
        h hVar = this.a;
        if (i == 0) {
            do {
                list.add(Long.valueOf(hVar.r()));
                if (hVar.c()) {
                    return;
                } else {
                    u = hVar.u();
                }
            } while (u == this.b);
            this.d = u;
            return;
        }
        if (i != 2) {
            throw v.b();
        }
        int b = hVar.b() + hVar.v();
        do {
            list.add(Long.valueOf(hVar.r()));
        } while (hVar.b() < b);
        Q(b);
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public final boolean d() {
        R(0);
        return this.a.f();
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public final long e() {
        R(1);
        return this.a.p();
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public final void f(List list) {
        int u;
        if (list instanceof y) {
            l1j.f();
            return;
        }
        int i = this.b & 7;
        h hVar = this.a;
        if (i == 0) {
            do {
                list.add(Long.valueOf(hVar.w()));
                if (hVar.c()) {
                    return;
                } else {
                    u = hVar.u();
                }
            } while (u == this.b);
            this.d = u;
            return;
        }
        if (i != 2) {
            throw v.b();
        }
        int b = hVar.b() + hVar.v();
        do {
            list.add(Long.valueOf(hVar.w()));
        } while (hVar.b() < b);
        Q(b);
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public final int g() {
        R(0);
        return this.a.v();
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public final int getTag() {
        return this.b;
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public final void h(List list) {
        int u;
        if (list instanceof y) {
            l1j.f();
            return;
        }
        int i = this.b & 7;
        h hVar = this.a;
        if (i == 0) {
            do {
                list.add(Long.valueOf(hVar.n()));
                if (hVar.c()) {
                    return;
                } else {
                    u = hVar.u();
                }
            } while (u == this.b);
            this.d = u;
            return;
        }
        if (i != 2) {
            throw v.b();
        }
        int b = hVar.b() + hVar.v();
        do {
            list.add(Long.valueOf(hVar.n()));
        } while (hVar.b() < b);
        Q(b);
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public final void i(List list) {
        int u;
        if (list instanceof t) {
            l1j.f();
            return;
        }
        int i = this.b & 7;
        h hVar = this.a;
        if (i == 0) {
            do {
                list.add(Integer.valueOf(hVar.i()));
                if (hVar.c()) {
                    return;
                } else {
                    u = hVar.u();
                }
            } while (u == this.b);
            this.d = u;
            return;
        }
        if (i != 2) {
            throw v.b();
        }
        int b = hVar.b() + hVar.v();
        do {
            list.add(Integer.valueOf(hVar.i()));
        } while (hVar.b() < b);
        Q(b);
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public final Object j(r0 r0Var, a1c a1cVar) {
        R(3);
        return N(r0Var, a1cVar);
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public final int k() {
        R(0);
        return this.a.i();
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public final int l() {
        R(0);
        return this.a.q();
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public final void m(List list) {
        int u;
        if (list instanceof e) {
            l1j.f();
            return;
        }
        int i = this.b & 7;
        h hVar = this.a;
        if (i == 0) {
            do {
                list.add(Boolean.valueOf(hVar.f()));
                if (hVar.c()) {
                    return;
                } else {
                    u = hVar.u();
                }
            } while (u == this.b);
            this.d = u;
            return;
        }
        if (i != 2) {
            throw v.b();
        }
        int b = hVar.b() + hVar.v();
        do {
            list.add(Boolean.valueOf(hVar.f()));
        } while (hVar.b() < b);
        Q(b);
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public final void n(List list) {
        P(list, true);
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public final g o() {
        R(2);
        return this.a.g();
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public final int p() {
        R(0);
        return this.a.m();
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public final Object q(r0 r0Var, a1c a1cVar) {
        R(2);
        return O(r0Var, a1cVar);
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public final void r(List list) {
        int u;
        if (list instanceof y) {
            l1j.f();
            return;
        }
        int i = this.b & 7;
        h hVar = this.a;
        if (i == 1) {
            do {
                list.add(Long.valueOf(hVar.k()));
                if (hVar.c()) {
                    return;
                } else {
                    u = hVar.u();
                }
            } while (u == this.b);
            this.d = u;
            return;
        }
        if (i != 2) {
            throw v.b();
        }
        int v = hVar.v();
        U(v);
        int b = hVar.b() + v;
        do {
            list.add(Long.valueOf(hVar.k()));
        } while (hVar.b() < b);
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public final double readDouble() {
        R(1);
        return this.a.h();
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public final float readFloat() {
        R(5);
        return this.a.l();
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public final void s(List list) {
        int u;
        if (list instanceof t) {
            l1j.f();
            return;
        }
        int i = this.b & 7;
        h hVar = this.a;
        if (i == 0) {
            do {
                list.add(Integer.valueOf(hVar.q()));
                if (hVar.c()) {
                    return;
                } else {
                    u = hVar.u();
                }
            } while (u == this.b);
            this.d = u;
            return;
        }
        if (i != 2) {
            throw v.b();
        }
        int b = hVar.b() + hVar.v();
        do {
            list.add(Integer.valueOf(hVar.q()));
        } while (hVar.b() < b);
        Q(b);
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public final long t() {
        R(0);
        return this.a.w();
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public final void u(List list) {
        int u;
        if (list instanceof t) {
            l1j.f();
            return;
        }
        int i = this.b & 7;
        h hVar = this.a;
        if (i == 0) {
            do {
                list.add(Integer.valueOf(hVar.v()));
                if (hVar.c()) {
                    return;
                } else {
                    u = hVar.u();
                }
            } while (u == this.b);
            this.d = u;
            return;
        }
        if (i != 2) {
            throw v.b();
        }
        int b = hVar.b() + hVar.v();
        do {
            list.add(Integer.valueOf(hVar.v()));
        } while (hVar.b() < b);
        Q(b);
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public final int v() {
        R(5);
        return this.a.j();
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public final void w(List list, r0 r0Var, a1c a1cVar) {
        int u;
        int i = this.b;
        if ((i & 7) != 3) {
            throw v.b();
        }
        do {
            list.add(N(r0Var, a1cVar));
            h hVar = this.a;
            if (hVar.c() || this.d != 0) {
                return;
            } else {
                u = hVar.u();
            }
        } while (u == i);
        this.d = u;
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public final void x(List list) {
        int u;
        if (list instanceof y) {
            l1j.f();
            return;
        }
        int i = this.b & 7;
        h hVar = this.a;
        if (i == 1) {
            do {
                list.add(Long.valueOf(hVar.p()));
                if (hVar.c()) {
                    return;
                } else {
                    u = hVar.u();
                }
            } while (u == this.b);
            this.d = u;
            return;
        }
        if (i != 2) {
            throw v.b();
        }
        int v = hVar.v();
        U(v);
        int b = hVar.b() + v;
        do {
            list.add(Long.valueOf(hVar.p()));
        } while (hVar.b() < b);
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public final void y(List list) {
        int u;
        if (list instanceof t) {
            l1j.f();
            return;
        }
        int i = this.b & 7;
        h hVar = this.a;
        if (i == 0) {
            do {
                list.add(Integer.valueOf(hVar.m()));
                if (hVar.c()) {
                    return;
                } else {
                    u = hVar.u();
                }
            } while (u == this.b);
            this.d = u;
            return;
        }
        if (i != 2) {
            throw v.b();
        }
        int b = hVar.b() + hVar.v();
        do {
            list.add(Integer.valueOf(hVar.m()));
        } while (hVar.b() < b);
        Q(b);
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public final void z(List list, r0 r0Var, a1c a1cVar) {
        int u;
        int i = this.b;
        if ((i & 7) != 2) {
            throw v.b();
        }
        do {
            list.add(O(r0Var, a1cVar));
            h hVar = this.a;
            if (hVar.c() || this.d != 0) {
                return;
            } else {
                u = hVar.u();
            }
        } while (u == i);
        this.d = u;
    }
}
