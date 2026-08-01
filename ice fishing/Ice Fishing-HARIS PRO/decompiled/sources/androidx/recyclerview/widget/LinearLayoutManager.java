package androidx.recyclerview.widget;

import D1.h;
import V.g;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import h0.f;
import java.util.List;
import k0.C0201o;
import k0.C0205t;
import k0.C0206u;
import k0.C0207v;
import k0.C0208w;
import k0.C0209x;
import k0.J;
import k0.K;
import k0.L;
import k0.Q;
import k0.W;
import k0.X;
import k0.b0;

/* loaded from: classes.dex */
public class LinearLayoutManager extends K implements W {

    /* renamed from: A, reason: collision with root package name */
    public final C0205t f2094A;

    /* renamed from: B, reason: collision with root package name */
    public final C0206u f2095B;

    /* renamed from: C, reason: collision with root package name */
    public final int f2096C;

    /* renamed from: D, reason: collision with root package name */
    public final int[] f2097D;

    /* renamed from: p, reason: collision with root package name */
    public int f2098p;

    /* renamed from: q, reason: collision with root package name */
    public C0207v f2099q;

    /* renamed from: r, reason: collision with root package name */
    public g f2100r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2101s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f2102t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2103u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2104v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f2105w;

    /* renamed from: x, reason: collision with root package name */
    public int f2106x;

    /* renamed from: y, reason: collision with root package name */
    public int f2107y;

    /* renamed from: z, reason: collision with root package name */
    public C0208w f2108z;

    public LinearLayoutManager(int i) {
        this.f2098p = 1;
        this.f2102t = false;
        this.f2103u = false;
        this.f2104v = false;
        this.f2105w = true;
        this.f2106x = -1;
        this.f2107y = Integer.MIN_VALUE;
        this.f2108z = null;
        this.f2094A = new C0205t();
        this.f2095B = new C0206u();
        this.f2096C = 2;
        this.f2097D = new int[2];
        d1(i);
        c(null);
        if (this.f2102t) {
            this.f2102t = false;
            p0();
        }
    }

    @Override // k0.K
    public void B0(RecyclerView recyclerView, int i) {
        C0209x c0209x = new C0209x(recyclerView.getContext());
        c0209x.f3614a = i;
        C0(c0209x);
    }

    @Override // k0.K
    public boolean D0() {
        return this.f2108z == null && this.f2101s == this.f2104v;
    }

    public void E0(X x2, int[] iArr) {
        int i;
        int l2 = x2.f3422a != -1 ? this.f2100r.l() : 0;
        if (this.f2099q.f3606f == -1) {
            i = 0;
        } else {
            i = l2;
            l2 = 0;
        }
        iArr[0] = l2;
        iArr[1] = i;
    }

    public void F0(X x2, C0207v c0207v, C0201o c0201o) {
        int i = c0207v.f3605d;
        if (i < 0 || i >= x2.b()) {
            return;
        }
        c0201o.a(i, Math.max(0, c0207v.f3607g));
    }

    public final int G0(X x2) {
        if (v() == 0) {
            return 0;
        }
        K0();
        g gVar = this.f2100r;
        boolean z2 = !this.f2105w;
        return f.g(x2, gVar, N0(z2), M0(z2), this, this.f2105w);
    }

    public final int H0(X x2) {
        if (v() == 0) {
            return 0;
        }
        K0();
        g gVar = this.f2100r;
        boolean z2 = !this.f2105w;
        return f.h(x2, gVar, N0(z2), M0(z2), this, this.f2105w, this.f2103u);
    }

    public final int I0(X x2) {
        if (v() == 0) {
            return 0;
        }
        K0();
        g gVar = this.f2100r;
        boolean z2 = !this.f2105w;
        return f.i(x2, gVar, N0(z2), M0(z2), this, this.f2105w);
    }

    public final int J0(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.f2098p == 1) ? 1 : Integer.MIN_VALUE : this.f2098p == 0 ? 1 : Integer.MIN_VALUE : this.f2098p == 1 ? -1 : Integer.MIN_VALUE : this.f2098p == 0 ? -1 : Integer.MIN_VALUE : (this.f2098p != 1 && W0()) ? -1 : 1 : (this.f2098p != 1 && W0()) ? 1 : -1;
    }

    public final void K0() {
        if (this.f2099q == null) {
            C0207v c0207v = new C0207v();
            c0207v.f3602a = true;
            c0207v.f3608h = 0;
            c0207v.i = 0;
            c0207v.f3609k = null;
            this.f2099q = c0207v;
        }
    }

    @Override // k0.K
    public final boolean L() {
        return true;
    }

    public final int L0(Q q2, C0207v c0207v, X x2, boolean z2) {
        int i;
        int i2 = c0207v.f3604c;
        int i3 = c0207v.f3607g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                c0207v.f3607g = i3 + i2;
            }
            Z0(q2, c0207v);
        }
        int i4 = c0207v.f3604c + c0207v.f3608h;
        while (true) {
            if ((!c0207v.f3610l && i4 <= 0) || (i = c0207v.f3605d) < 0 || i >= x2.b()) {
                break;
            }
            C0206u c0206u = this.f2095B;
            c0206u.f3598a = 0;
            c0206u.f3599b = false;
            c0206u.f3600c = false;
            c0206u.f3601d = false;
            X0(q2, x2, c0207v, c0206u);
            if (!c0206u.f3599b) {
                int i5 = c0207v.f3603b;
                int i6 = c0206u.f3598a;
                c0207v.f3603b = (c0207v.f3606f * i6) + i5;
                if (!c0206u.f3600c || c0207v.f3609k != null || !x2.f3427g) {
                    c0207v.f3604c -= i6;
                    i4 -= i6;
                }
                int i7 = c0207v.f3607g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    c0207v.f3607g = i8;
                    int i9 = c0207v.f3604c;
                    if (i9 < 0) {
                        c0207v.f3607g = i8 + i9;
                    }
                    Z0(q2, c0207v);
                }
                if (z2 && c0206u.f3601d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - c0207v.f3604c;
    }

    public final View M0(boolean z2) {
        return this.f2103u ? Q0(0, v(), z2) : Q0(v() - 1, -1, z2);
    }

    public final View N0(boolean z2) {
        return this.f2103u ? Q0(v() - 1, -1, z2) : Q0(0, v(), z2);
    }

    public final int O0() {
        View Q02 = Q0(v() - 1, -1, false);
        if (Q02 == null) {
            return -1;
        }
        return K.H(Q02);
    }

    public final View P0(int i, int i2) {
        int i3;
        int i4;
        K0();
        if (i2 <= i && i2 >= i) {
            return u(i);
        }
        if (this.f2100r.e(u(i)) < this.f2100r.k()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.f2098p == 0 ? this.f3386c.u(i, i2, i3, i4) : this.f3387d.u(i, i2, i3, i4);
    }

    public final View Q0(int i, int i2, boolean z2) {
        K0();
        int i3 = z2 ? 24579 : 320;
        return this.f2098p == 0 ? this.f3386c.u(i, i2, i3, 320) : this.f3387d.u(i, i2, i3, 320);
    }

    public View R0(Q q2, X x2, boolean z2, boolean z3) {
        int i;
        int i2;
        int i3;
        K0();
        int v2 = v();
        if (z3) {
            i2 = v() - 1;
            i = -1;
            i3 = -1;
        } else {
            i = v2;
            i2 = 0;
            i3 = 1;
        }
        int b2 = x2.b();
        int k2 = this.f2100r.k();
        int g2 = this.f2100r.g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i2 != i) {
            View u2 = u(i2);
            int H2 = K.H(u2);
            int e = this.f2100r.e(u2);
            int b3 = this.f2100r.b(u2);
            if (H2 >= 0 && H2 < b2) {
                if (!((L) u2.getLayoutParams()).f3396a.j()) {
                    boolean z4 = b3 <= k2 && e < k2;
                    boolean z5 = e >= g2 && b3 > g2;
                    if (!z4 && !z5) {
                        return u2;
                    }
                    if (z2) {
                        if (!z5) {
                            if (view != null) {
                            }
                            view = u2;
                        }
                        view2 = u2;
                    } else {
                        if (!z4) {
                            if (view != null) {
                            }
                            view = u2;
                        }
                        view2 = u2;
                    }
                } else if (view3 == null) {
                    view3 = u2;
                }
            }
            i2 += i3;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    public final int S0(int i, Q q2, X x2, boolean z2) {
        int g2;
        int g3 = this.f2100r.g() - i;
        if (g3 <= 0) {
            return 0;
        }
        int i2 = -c1(-g3, q2, x2);
        int i3 = i + i2;
        if (!z2 || (g2 = this.f2100r.g() - i3) <= 0) {
            return i2;
        }
        this.f2100r.p(g2);
        return g2 + i2;
    }

    @Override // k0.K
    public final void T(RecyclerView recyclerView) {
    }

    public final int T0(int i, Q q2, X x2, boolean z2) {
        int k2;
        int k3 = i - this.f2100r.k();
        if (k3 <= 0) {
            return 0;
        }
        int i2 = -c1(k3, q2, x2);
        int i3 = i + i2;
        if (!z2 || (k2 = i3 - this.f2100r.k()) <= 0) {
            return i2;
        }
        this.f2100r.p(-k2);
        return i2 - k2;
    }

    @Override // k0.K
    public View U(View view, int i, Q q2, X x2) {
        int J02;
        b1();
        if (v() == 0 || (J02 = J0(i)) == Integer.MIN_VALUE) {
            return null;
        }
        K0();
        f1(J02, (int) (this.f2100r.l() * 0.33333334f), false, x2);
        C0207v c0207v = this.f2099q;
        c0207v.f3607g = Integer.MIN_VALUE;
        c0207v.f3602a = false;
        L0(q2, c0207v, x2, true);
        View P02 = J02 == -1 ? this.f2103u ? P0(v() - 1, -1) : P0(0, v()) : this.f2103u ? P0(0, v()) : P0(v() - 1, -1);
        View V02 = J02 == -1 ? V0() : U0();
        if (!V02.hasFocusable()) {
            return P02;
        }
        if (P02 == null) {
            return null;
        }
        return V02;
    }

    public final View U0() {
        return u(this.f2103u ? 0 : v() - 1);
    }

    @Override // k0.K
    public final void V(AccessibilityEvent accessibilityEvent) {
        super.V(accessibilityEvent);
        if (v() > 0) {
            View Q02 = Q0(0, v(), false);
            accessibilityEvent.setFromIndex(Q02 == null ? -1 : K.H(Q02));
            accessibilityEvent.setToIndex(O0());
        }
    }

    public final View V0() {
        return u(this.f2103u ? v() - 1 : 0);
    }

    public final boolean W0() {
        return C() == 1;
    }

    public void X0(Q q2, X x2, C0207v c0207v, C0206u c0206u) {
        int i;
        int i2;
        int i3;
        int i4;
        View b2 = c0207v.b(q2);
        if (b2 == null) {
            c0206u.f3599b = true;
            return;
        }
        L l2 = (L) b2.getLayoutParams();
        if (c0207v.f3609k == null) {
            if (this.f2103u == (c0207v.f3606f == -1)) {
                b(b2, -1, false);
            } else {
                b(b2, 0, false);
            }
        } else {
            if (this.f2103u == (c0207v.f3606f == -1)) {
                b(b2, -1, true);
            } else {
                b(b2, 0, true);
            }
        }
        O(b2);
        c0206u.f3598a = this.f2100r.c(b2);
        if (this.f2098p == 1) {
            if (W0()) {
                i4 = this.f3394n - F();
                i = i4 - this.f2100r.d(b2);
            } else {
                i = E();
                i4 = this.f2100r.d(b2) + i;
            }
            if (c0207v.f3606f == -1) {
                i2 = c0207v.f3603b;
                i3 = i2 - c0206u.f3598a;
            } else {
                i3 = c0207v.f3603b;
                i2 = c0206u.f3598a + i3;
            }
        } else {
            int G2 = G();
            int d2 = this.f2100r.d(b2) + G2;
            if (c0207v.f3606f == -1) {
                int i5 = c0207v.f3603b;
                int i6 = i5 - c0206u.f3598a;
                i4 = i5;
                i2 = d2;
                i = i6;
                i3 = G2;
            } else {
                int i7 = c0207v.f3603b;
                int i8 = c0206u.f3598a + i7;
                i = i7;
                i2 = d2;
                i3 = G2;
                i4 = i8;
            }
        }
        K.N(b2, i, i3, i4, i2);
        if (l2.f3396a.j() || l2.f3396a.m()) {
            c0206u.f3600c = true;
        }
        c0206u.f3601d = b2.hasFocusable();
    }

    public void Y0(Q q2, X x2, C0205t c0205t, int i) {
    }

    public final void Z0(Q q2, C0207v c0207v) {
        if (!c0207v.f3602a || c0207v.f3610l) {
            return;
        }
        int i = c0207v.f3607g;
        int i2 = c0207v.i;
        if (c0207v.f3606f == -1) {
            int v2 = v();
            if (i < 0) {
                return;
            }
            int f2 = (this.f2100r.f() - i) + i2;
            if (this.f2103u) {
                for (int i3 = 0; i3 < v2; i3++) {
                    View u2 = u(i3);
                    if (this.f2100r.e(u2) < f2 || this.f2100r.o(u2) < f2) {
                        a1(q2, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = v2 - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View u3 = u(i5);
                if (this.f2100r.e(u3) < f2 || this.f2100r.o(u3) < f2) {
                    a1(q2, i4, i5);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i6 = i - i2;
        int v3 = v();
        if (!this.f2103u) {
            for (int i7 = 0; i7 < v3; i7++) {
                View u4 = u(i7);
                if (this.f2100r.b(u4) > i6 || this.f2100r.n(u4) > i6) {
                    a1(q2, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = v3 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View u5 = u(i9);
            if (this.f2100r.b(u5) > i6 || this.f2100r.n(u5) > i6) {
                a1(q2, i8, i9);
                return;
            }
        }
    }

    @Override // k0.W
    public final PointF a(int i) {
        if (v() == 0) {
            return null;
        }
        int i2 = (i < K.H(u(0))) != this.f2103u ? -1 : 1;
        return this.f2098p == 0 ? new PointF(i2, RecyclerView.f2111C0) : new PointF(RecyclerView.f2111C0, i2);
    }

    public final void a1(Q q2, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                View u2 = u(i);
                n0(i);
                q2.h(u2);
                i--;
            }
            return;
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            View u3 = u(i3);
            n0(i3);
            q2.h(u3);
        }
    }

    public final void b1() {
        if (this.f2098p == 1 || !W0()) {
            this.f2103u = this.f2102t;
        } else {
            this.f2103u = !this.f2102t;
        }
    }

    @Override // k0.K
    public final void c(String str) {
        if (this.f2108z == null) {
            super.c(str);
        }
    }

    public final int c1(int i, Q q2, X x2) {
        if (v() == 0 || i == 0) {
            return 0;
        }
        K0();
        this.f2099q.f3602a = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        f1(i2, abs, true, x2);
        C0207v c0207v = this.f2099q;
        int L02 = L0(q2, c0207v, x2, false) + c0207v.f3607g;
        if (L02 < 0) {
            return 0;
        }
        if (abs > L02) {
            i = i2 * L02;
        }
        this.f2100r.p(-i);
        this.f2099q.j = i;
        return i;
    }

    @Override // k0.K
    public final boolean d() {
        return this.f2098p == 0;
    }

    public final void d1(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(h.e("invalid orientation:", i));
        }
        c(null);
        if (i != this.f2098p || this.f2100r == null) {
            g a2 = g.a(this, i);
            this.f2100r = a2;
            this.f2094A.f3594a = a2;
            this.f2098p = i;
            p0();
        }
    }

    @Override // k0.K
    public final boolean e() {
        return this.f2098p == 1;
    }

    @Override // k0.K
    public void e0(Q q2, X x2) {
        View focusedChild;
        View focusedChild2;
        View R02;
        int i;
        int i2;
        int i3;
        List list;
        int i4;
        int i5;
        int S02;
        int i6;
        View q3;
        int e;
        int i7;
        int i8;
        int i9 = -1;
        if (!(this.f2108z == null && this.f2106x == -1) && x2.b() == 0) {
            k0(q2);
            return;
        }
        C0208w c0208w = this.f2108z;
        if (c0208w != null && (i8 = c0208w.f3611a) >= 0) {
            this.f2106x = i8;
        }
        K0();
        this.f2099q.f3602a = false;
        b1();
        RecyclerView recyclerView = this.f3385b;
        if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f3384a.f3471c.contains(focusedChild)) {
            focusedChild = null;
        }
        C0205t c0205t = this.f2094A;
        if (!c0205t.e || this.f2106x != -1 || this.f2108z != null) {
            c0205t.d();
            c0205t.f3597d = this.f2103u ^ this.f2104v;
            if (!x2.f3427g && (i = this.f2106x) != -1) {
                if (i < 0 || i >= x2.b()) {
                    this.f2106x = -1;
                    this.f2107y = Integer.MIN_VALUE;
                } else {
                    int i10 = this.f2106x;
                    c0205t.f3595b = i10;
                    C0208w c0208w2 = this.f2108z;
                    if (c0208w2 != null && c0208w2.f3611a >= 0) {
                        boolean z2 = c0208w2.f3613c;
                        c0205t.f3597d = z2;
                        if (z2) {
                            c0205t.f3596c = this.f2100r.g() - this.f2108z.f3612b;
                        } else {
                            c0205t.f3596c = this.f2100r.k() + this.f2108z.f3612b;
                        }
                    } else if (this.f2107y == Integer.MIN_VALUE) {
                        View q4 = q(i10);
                        if (q4 == null) {
                            if (v() > 0) {
                                c0205t.f3597d = (this.f2106x < K.H(u(0))) == this.f2103u;
                            }
                            c0205t.a();
                        } else if (this.f2100r.c(q4) > this.f2100r.l()) {
                            c0205t.a();
                        } else if (this.f2100r.e(q4) - this.f2100r.k() < 0) {
                            c0205t.f3596c = this.f2100r.k();
                            c0205t.f3597d = false;
                        } else if (this.f2100r.g() - this.f2100r.b(q4) < 0) {
                            c0205t.f3596c = this.f2100r.g();
                            c0205t.f3597d = true;
                        } else {
                            c0205t.f3596c = c0205t.f3597d ? this.f2100r.m() + this.f2100r.b(q4) : this.f2100r.e(q4);
                        }
                    } else {
                        boolean z3 = this.f2103u;
                        c0205t.f3597d = z3;
                        if (z3) {
                            c0205t.f3596c = this.f2100r.g() - this.f2107y;
                        } else {
                            c0205t.f3596c = this.f2100r.k() + this.f2107y;
                        }
                    }
                    c0205t.e = true;
                }
            }
            if (v() != 0) {
                RecyclerView recyclerView2 = this.f3385b;
                if (recyclerView2 == null || (focusedChild2 = recyclerView2.getFocusedChild()) == null || this.f3384a.f3471c.contains(focusedChild2)) {
                    focusedChild2 = null;
                }
                if (focusedChild2 != null) {
                    L l2 = (L) focusedChild2.getLayoutParams();
                    if (!l2.f3396a.j() && l2.f3396a.c() >= 0 && l2.f3396a.c() < x2.b()) {
                        c0205t.c(focusedChild2, K.H(focusedChild2));
                        c0205t.e = true;
                    }
                }
                boolean z4 = this.f2101s;
                boolean z5 = this.f2104v;
                if (z4 == z5 && (R02 = R0(q2, x2, c0205t.f3597d, z5)) != null) {
                    c0205t.b(R02, K.H(R02));
                    if (!x2.f3427g && D0()) {
                        int e2 = this.f2100r.e(R02);
                        int b2 = this.f2100r.b(R02);
                        int k2 = this.f2100r.k();
                        int g2 = this.f2100r.g();
                        boolean z6 = b2 <= k2 && e2 < k2;
                        boolean z7 = e2 >= g2 && b2 > g2;
                        if (z6 || z7) {
                            if (c0205t.f3597d) {
                                k2 = g2;
                            }
                            c0205t.f3596c = k2;
                        }
                    }
                    c0205t.e = true;
                }
            }
            c0205t.a();
            c0205t.f3595b = this.f2104v ? x2.b() - 1 : 0;
            c0205t.e = true;
        } else if (focusedChild != null && (this.f2100r.e(focusedChild) >= this.f2100r.g() || this.f2100r.b(focusedChild) <= this.f2100r.k())) {
            c0205t.c(focusedChild, K.H(focusedChild));
        }
        C0207v c0207v = this.f2099q;
        c0207v.f3606f = c0207v.j >= 0 ? 1 : -1;
        int[] iArr = this.f2097D;
        iArr[0] = 0;
        iArr[1] = 0;
        E0(x2, iArr);
        int k3 = this.f2100r.k() + Math.max(0, iArr[0]);
        int h2 = this.f2100r.h() + Math.max(0, iArr[1]);
        if (x2.f3427g && (i6 = this.f2106x) != -1 && this.f2107y != Integer.MIN_VALUE && (q3 = q(i6)) != null) {
            if (this.f2103u) {
                i7 = this.f2100r.g() - this.f2100r.b(q3);
                e = this.f2107y;
            } else {
                e = this.f2100r.e(q3) - this.f2100r.k();
                i7 = this.f2107y;
            }
            int i11 = i7 - e;
            if (i11 > 0) {
                k3 += i11;
            } else {
                h2 -= i11;
            }
        }
        if (!c0205t.f3597d ? !this.f2103u : this.f2103u) {
            i9 = 1;
        }
        Y0(q2, x2, c0205t, i9);
        p(q2);
        this.f2099q.f3610l = this.f2100r.i() == 0 && this.f2100r.f() == 0;
        this.f2099q.getClass();
        this.f2099q.i = 0;
        if (c0205t.f3597d) {
            h1(c0205t.f3595b, c0205t.f3596c);
            C0207v c0207v2 = this.f2099q;
            c0207v2.f3608h = k3;
            L0(q2, c0207v2, x2, false);
            C0207v c0207v3 = this.f2099q;
            i3 = c0207v3.f3603b;
            int i12 = c0207v3.f3605d;
            int i13 = c0207v3.f3604c;
            if (i13 > 0) {
                h2 += i13;
            }
            g1(c0205t.f3595b, c0205t.f3596c);
            C0207v c0207v4 = this.f2099q;
            c0207v4.f3608h = h2;
            c0207v4.f3605d += c0207v4.e;
            L0(q2, c0207v4, x2, false);
            C0207v c0207v5 = this.f2099q;
            i2 = c0207v5.f3603b;
            int i14 = c0207v5.f3604c;
            if (i14 > 0) {
                h1(i12, i3);
                C0207v c0207v6 = this.f2099q;
                c0207v6.f3608h = i14;
                L0(q2, c0207v6, x2, false);
                i3 = this.f2099q.f3603b;
            }
        } else {
            g1(c0205t.f3595b, c0205t.f3596c);
            C0207v c0207v7 = this.f2099q;
            c0207v7.f3608h = h2;
            L0(q2, c0207v7, x2, false);
            C0207v c0207v8 = this.f2099q;
            i2 = c0207v8.f3603b;
            int i15 = c0207v8.f3605d;
            int i16 = c0207v8.f3604c;
            if (i16 > 0) {
                k3 += i16;
            }
            h1(c0205t.f3595b, c0205t.f3596c);
            C0207v c0207v9 = this.f2099q;
            c0207v9.f3608h = k3;
            c0207v9.f3605d += c0207v9.e;
            L0(q2, c0207v9, x2, false);
            C0207v c0207v10 = this.f2099q;
            int i17 = c0207v10.f3603b;
            int i18 = c0207v10.f3604c;
            if (i18 > 0) {
                g1(i15, i2);
                C0207v c0207v11 = this.f2099q;
                c0207v11.f3608h = i18;
                L0(q2, c0207v11, x2, false);
                i2 = this.f2099q.f3603b;
            }
            i3 = i17;
        }
        if (v() > 0) {
            if (this.f2103u ^ this.f2104v) {
                int S03 = S0(i2, q2, x2, true);
                i4 = i3 + S03;
                i5 = i2 + S03;
                S02 = T0(i4, q2, x2, false);
            } else {
                int T02 = T0(i3, q2, x2, true);
                i4 = i3 + T02;
                i5 = i2 + T02;
                S02 = S0(i5, q2, x2, false);
            }
            i3 = i4 + S02;
            i2 = i5 + S02;
        }
        if (x2.f3429k && v() != 0 && !x2.f3427g && D0()) {
            List list2 = q2.f3410d;
            int size = list2.size();
            int H2 = K.H(u(0));
            int i19 = 0;
            int i20 = 0;
            for (int i21 = 0; i21 < size; i21++) {
                b0 b0Var = (b0) list2.get(i21);
                if (!b0Var.j()) {
                    boolean z8 = b0Var.c() < H2;
                    boolean z9 = this.f2103u;
                    View view = b0Var.f3449a;
                    if (z8 != z9) {
                        i19 += this.f2100r.c(view);
                    } else {
                        i20 += this.f2100r.c(view);
                    }
                }
            }
            this.f2099q.f3609k = list2;
            if (i19 > 0) {
                h1(K.H(V0()), i3);
                C0207v c0207v12 = this.f2099q;
                c0207v12.f3608h = i19;
                c0207v12.f3604c = 0;
                c0207v12.a(null);
                L0(q2, this.f2099q, x2, false);
            }
            if (i20 > 0) {
                g1(K.H(U0()), i2);
                C0207v c0207v13 = this.f2099q;
                c0207v13.f3608h = i20;
                c0207v13.f3604c = 0;
                list = null;
                c0207v13.a(null);
                L0(q2, this.f2099q, x2, false);
            } else {
                list = null;
            }
            this.f2099q.f3609k = list;
        }
        if (x2.f3427g) {
            c0205t.d();
        } else {
            g gVar = this.f2100r;
            gVar.f1210a = gVar.l();
        }
        this.f2101s = this.f2104v;
    }

    public void e1(boolean z2) {
        c(null);
        if (this.f2104v == z2) {
            return;
        }
        this.f2104v = z2;
        p0();
    }

    @Override // k0.K
    public void f0(X x2) {
        this.f2108z = null;
        this.f2106x = -1;
        this.f2107y = Integer.MIN_VALUE;
        this.f2094A.d();
    }

    public final void f1(int i, int i2, boolean z2, X x2) {
        int k2;
        this.f2099q.f3610l = this.f2100r.i() == 0 && this.f2100r.f() == 0;
        this.f2099q.f3606f = i;
        int[] iArr = this.f2097D;
        iArr[0] = 0;
        iArr[1] = 0;
        E0(x2, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        boolean z3 = i == 1;
        C0207v c0207v = this.f2099q;
        int i3 = z3 ? max2 : max;
        c0207v.f3608h = i3;
        if (!z3) {
            max = max2;
        }
        c0207v.i = max;
        if (z3) {
            c0207v.f3608h = this.f2100r.h() + i3;
            View U02 = U0();
            C0207v c0207v2 = this.f2099q;
            c0207v2.e = this.f2103u ? -1 : 1;
            int H2 = K.H(U02);
            C0207v c0207v3 = this.f2099q;
            c0207v2.f3605d = H2 + c0207v3.e;
            c0207v3.f3603b = this.f2100r.b(U02);
            k2 = this.f2100r.b(U02) - this.f2100r.g();
        } else {
            View V02 = V0();
            C0207v c0207v4 = this.f2099q;
            c0207v4.f3608h = this.f2100r.k() + c0207v4.f3608h;
            C0207v c0207v5 = this.f2099q;
            c0207v5.e = this.f2103u ? 1 : -1;
            int H3 = K.H(V02);
            C0207v c0207v6 = this.f2099q;
            c0207v5.f3605d = H3 + c0207v6.e;
            c0207v6.f3603b = this.f2100r.e(V02);
            k2 = (-this.f2100r.e(V02)) + this.f2100r.k();
        }
        C0207v c0207v7 = this.f2099q;
        c0207v7.f3604c = i2;
        if (z2) {
            c0207v7.f3604c = i2 - k2;
        }
        c0207v7.f3607g = k2;
    }

    public final void g1(int i, int i2) {
        this.f2099q.f3604c = this.f2100r.g() - i2;
        C0207v c0207v = this.f2099q;
        c0207v.e = this.f2103u ? -1 : 1;
        c0207v.f3605d = i;
        c0207v.f3606f = 1;
        c0207v.f3603b = i2;
        c0207v.f3607g = Integer.MIN_VALUE;
    }

    @Override // k0.K
    public final void h(int i, int i2, X x2, C0201o c0201o) {
        if (this.f2098p != 0) {
            i = i2;
        }
        if (v() == 0 || i == 0) {
            return;
        }
        K0();
        f1(i > 0 ? 1 : -1, Math.abs(i), true, x2);
        F0(x2, this.f2099q, c0201o);
    }

    @Override // k0.K
    public final void h0(Parcelable parcelable) {
        if (parcelable instanceof C0208w) {
            C0208w c0208w = (C0208w) parcelable;
            this.f2108z = c0208w;
            if (this.f2106x != -1) {
                c0208w.f3611a = -1;
            }
            p0();
        }
    }

    public final void h1(int i, int i2) {
        this.f2099q.f3604c = i2 - this.f2100r.k();
        C0207v c0207v = this.f2099q;
        c0207v.f3605d = i;
        c0207v.e = this.f2103u ? 1 : -1;
        c0207v.f3606f = -1;
        c0207v.f3603b = i2;
        c0207v.f3607g = Integer.MIN_VALUE;
    }

    @Override // k0.K
    public final void i(int i, C0201o c0201o) {
        boolean z2;
        int i2;
        C0208w c0208w = this.f2108z;
        if (c0208w == null || (i2 = c0208w.f3611a) < 0) {
            b1();
            z2 = this.f2103u;
            i2 = this.f2106x;
            if (i2 == -1) {
                i2 = z2 ? i - 1 : 0;
            }
        } else {
            z2 = c0208w.f3613c;
        }
        int i3 = z2 ? -1 : 1;
        for (int i4 = 0; i4 < this.f2096C && i2 >= 0 && i2 < i; i4++) {
            c0201o.a(i2, 0);
            i2 += i3;
        }
    }

    @Override // k0.K
    public final Parcelable i0() {
        C0208w c0208w = this.f2108z;
        if (c0208w != null) {
            C0208w c0208w2 = new C0208w();
            c0208w2.f3611a = c0208w.f3611a;
            c0208w2.f3612b = c0208w.f3612b;
            c0208w2.f3613c = c0208w.f3613c;
            return c0208w2;
        }
        C0208w c0208w3 = new C0208w();
        if (v() > 0) {
            K0();
            boolean z2 = this.f2101s ^ this.f2103u;
            c0208w3.f3613c = z2;
            if (z2) {
                View U02 = U0();
                c0208w3.f3612b = this.f2100r.g() - this.f2100r.b(U02);
                c0208w3.f3611a = K.H(U02);
            } else {
                View V02 = V0();
                c0208w3.f3611a = K.H(V02);
                c0208w3.f3612b = this.f2100r.e(V02) - this.f2100r.k();
            }
        } else {
            c0208w3.f3611a = -1;
        }
        return c0208w3;
    }

    @Override // k0.K
    public final int j(X x2) {
        return G0(x2);
    }

    @Override // k0.K
    public int k(X x2) {
        return H0(x2);
    }

    @Override // k0.K
    public int l(X x2) {
        return I0(x2);
    }

    @Override // k0.K
    public final int m(X x2) {
        return G0(x2);
    }

    @Override // k0.K
    public int n(X x2) {
        return H0(x2);
    }

    @Override // k0.K
    public int o(X x2) {
        return I0(x2);
    }

    @Override // k0.K
    public final View q(int i) {
        int v2 = v();
        if (v2 == 0) {
            return null;
        }
        int H2 = i - K.H(u(0));
        if (H2 >= 0 && H2 < v2) {
            View u2 = u(H2);
            if (K.H(u2) == i) {
                return u2;
            }
        }
        return super.q(i);
    }

    @Override // k0.K
    public int q0(int i, Q q2, X x2) {
        if (this.f2098p == 1) {
            return 0;
        }
        return c1(i, q2, x2);
    }

    @Override // k0.K
    public L r() {
        return new L(-2, -2);
    }

    @Override // k0.K
    public final void r0(int i) {
        this.f2106x = i;
        this.f2107y = Integer.MIN_VALUE;
        C0208w c0208w = this.f2108z;
        if (c0208w != null) {
            c0208w.f3611a = -1;
        }
        p0();
    }

    @Override // k0.K
    public int s0(int i, Q q2, X x2) {
        if (this.f2098p == 0) {
            return 0;
        }
        return c1(i, q2, x2);
    }

    @Override // k0.K
    public final boolean z0() {
        if (this.f3393m == 1073741824 || this.f3392l == 1073741824) {
            return false;
        }
        int v2 = v();
        for (int i = 0; i < v2; i++) {
            ViewGroup.LayoutParams layoutParams = u(i).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                return true;
            }
        }
        return false;
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f2098p = 1;
        this.f2102t = false;
        this.f2103u = false;
        this.f2104v = false;
        this.f2105w = true;
        this.f2106x = -1;
        this.f2107y = Integer.MIN_VALUE;
        this.f2108z = null;
        this.f2094A = new C0205t();
        this.f2095B = new C0206u();
        this.f2096C = 2;
        this.f2097D = new int[2];
        J I2 = K.I(context, attributeSet, i, i2);
        d1(I2.f3380a);
        boolean z2 = I2.f3382c;
        c(null);
        if (z2 != this.f2102t) {
            this.f2102t = z2;
            p0();
        }
        e1(I2.f3383d);
    }
}
