package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.amh;
import defpackage.csb;
import defpackage.e7g;
import defpackage.f7g;
import defpackage.g7g;
import defpackage.gc9;
import defpackage.i7g;
import defpackage.jpn;
import defpackage.k5r;
import defpackage.kpn;
import defpackage.ll4;
import defpackage.opn;
import defpackage.qb;
import defpackage.qgg;
import defpackage.qon;
import defpackage.vb;
import defpackage.xon;
import defpackage.xq0;
import defpackage.yon;
import defpackage.zon;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class LinearLayoutManager extends yon implements jpn {
    public final csb A;
    public final e7g B;
    public final int C;
    public final int[] D;
    public int p;
    public f7g q;
    public gc9 r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public final boolean w;
    public int x;
    public int y;
    public g7g z;

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.p = 1;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.z = null;
        this.A = new csb();
        this.B = new e7g();
        this.C = 2;
        this.D = new int[2];
        xon g0 = yon.g0(context, attributeSet, i, i2);
        J1(g0.a);
        boolean z = g0.c;
        v(null);
        if (z != this.t) {
            this.t = z;
            R0();
        }
        K1(g0.d);
    }

    public final View A1() {
        return P(this.u ? Q() - 1 : 0);
    }

    @Override // defpackage.yon
    public final void B(int i, int i2, kpn kpnVar, ll4 ll4Var) {
        if (this.p != 0) {
            i = i2;
        }
        if (Q() == 0 || i == 0) {
            return;
        }
        m1();
        L1(i > 0 ? 1 : -1, Math.abs(i), true, kpnVar);
        h1(kpnVar, this.q, ll4Var);
    }

    public final boolean B1() {
        return this.b.getLayoutDirection() == 1;
    }

    @Override // defpackage.yon
    public final void C(int i, ll4 ll4Var) {
        boolean z;
        int i2;
        g7g g7gVar = this.z;
        if (g7gVar == null || (i2 = g7gVar.a) < 0) {
            G1();
            z = this.u;
            i2 = this.x;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = g7gVar.c;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.C && i2 >= 0 && i2 < i; i4++) {
            ll4Var.b(i2, 0);
            i2 += i3;
        }
    }

    public void C1(amh amhVar, kpn kpnVar, f7g f7gVar, e7g e7gVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int d;
        View b = f7gVar.b(amhVar);
        if (b == null) {
            e7gVar.b = true;
            return;
        }
        zon zonVar = (zon) b.getLayoutParams();
        List list = f7gVar.k;
        boolean z = this.u;
        int i5 = f7gVar.f;
        if (list == null) {
            if (z == (i5 == -1)) {
                u(b, -1, false);
            } else {
                u(b, 0, false);
            }
        } else {
            if (z == (i5 == -1)) {
                u(b, -1, true);
            } else {
                u(b, 0, true);
            }
        }
        o0(b);
        e7gVar.a = this.r.c(b);
        if (this.p == 1) {
            if (B1()) {
                d = this.n - d0();
                i3 = d - this.r.d(b);
            } else {
                i3 = c0();
                d = this.r.d(b) + i3;
            }
            int i6 = f7gVar.f;
            int i7 = f7gVar.b;
            int i8 = e7gVar.a;
            if (i6 == -1) {
                i4 = i7 - i8;
                i = i7;
            } else {
                i = i8 + i7;
                i4 = i7;
            }
            i2 = d;
        } else {
            int e0 = e0();
            int d2 = this.r.d(b) + e0;
            int i9 = f7gVar.f;
            int i10 = f7gVar.b;
            int i11 = e7gVar.a;
            if (i9 == -1) {
                int i12 = i10 - i11;
                i2 = i10;
                i = d2;
                i3 = i12;
            } else {
                int i13 = i10 + i11;
                i = d2;
                i2 = i13;
                i3 = i10;
            }
            i4 = e0;
        }
        n0(b, i3, i4, i2, i);
        if (zonVar.a.k() || zonVar.a.n()) {
            e7gVar.c = true;
        }
        e7gVar.d = b.hasFocusable();
    }

    @Override // defpackage.yon
    public final int D(kpn kpnVar) {
        return i1(kpnVar);
    }

    @Override // defpackage.yon
    public int E(kpn kpnVar) {
        return j1(kpnVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v14 */
    @Override // defpackage.yon
    public void E0(amh amhVar, kpn kpnVar) {
        View view;
        View view2;
        View w1;
        int i;
        int e;
        int i2;
        int i3;
        ?? r4;
        List list;
        int i4;
        int i5;
        int x1;
        int i6;
        View L;
        int e2;
        int i7;
        int i8;
        int i9 = -1;
        if (!(this.z == null && this.x == -1) && kpnVar.b() == 0) {
            M0(amhVar);
            return;
        }
        g7g g7gVar = this.z;
        if (g7gVar != null && (i8 = g7gVar.a) >= 0) {
            this.x = i8;
        }
        m1();
        boolean z = false;
        this.q.a = false;
        G1();
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || (view = recyclerView.getFocusedChild()) == null || ((ArrayList) this.a.e).contains(view)) {
            view = null;
        }
        csb csbVar = this.A;
        if (!csbVar.e || this.x != -1 || this.z != null) {
            csbVar.f();
            csbVar.d = this.u ^ this.v;
            if (!kpnVar.g && (i = this.x) != -1) {
                if (i < 0 || i >= kpnVar.b()) {
                    this.x = -1;
                    this.y = Integer.MIN_VALUE;
                } else {
                    int i10 = this.x;
                    csbVar.b = i10;
                    g7g g7gVar2 = this.z;
                    if (g7gVar2 != null && g7gVar2.a >= 0) {
                        boolean z2 = g7gVar2.c;
                        csbVar.d = z2;
                        gc9 gc9Var = this.r;
                        if (z2) {
                            csbVar.c = gc9Var.g() - this.z.b;
                        } else {
                            csbVar.c = gc9Var.n() + this.z.b;
                        }
                    } else if (this.y == Integer.MIN_VALUE) {
                        View L2 = L(i10);
                        if (L2 == null) {
                            if (Q() > 0) {
                                csbVar.d = (this.x < yon.f0(P(0))) == this.u;
                            }
                            csbVar.b();
                        } else if (this.r.c(L2) > this.r.o()) {
                            csbVar.b();
                        } else {
                            int e3 = this.r.e(L2) - this.r.n();
                            gc9 gc9Var2 = this.r;
                            if (e3 < 0) {
                                csbVar.c = gc9Var2.n();
                                csbVar.d = false;
                            } else if (gc9Var2.g() - this.r.b(L2) < 0) {
                                csbVar.c = this.r.g();
                                csbVar.d = true;
                            } else {
                                boolean z3 = csbVar.d;
                                gc9 gc9Var3 = this.r;
                                if (z3) {
                                    int b = gc9Var3.b(L2);
                                    gc9 gc9Var4 = this.r;
                                    e = (Integer.MIN_VALUE == gc9Var4.a ? 0 : gc9Var4.o() - gc9Var4.a) + b;
                                } else {
                                    e = gc9Var3.e(L2);
                                }
                                csbVar.c = e;
                            }
                        }
                    } else {
                        boolean z4 = this.u;
                        csbVar.d = z4;
                        gc9 gc9Var5 = this.r;
                        if (z4) {
                            csbVar.c = gc9Var5.g() - this.y;
                        } else {
                            csbVar.c = gc9Var5.n() + this.y;
                        }
                    }
                    csbVar.e = true;
                }
            }
            if (Q() != 0) {
                RecyclerView recyclerView2 = this.b;
                if (recyclerView2 == null || (view2 = recyclerView2.getFocusedChild()) == null || ((ArrayList) this.a.e).contains(view2)) {
                    view2 = null;
                }
                if (view2 != null) {
                    zon zonVar = (zon) view2.getLayoutParams();
                    if (!zonVar.a.k() && zonVar.a.d() >= 0 && zonVar.a.d() < kpnVar.b()) {
                        csbVar.c(yon.f0(view2), view2);
                        csbVar.e = true;
                    }
                }
                boolean z5 = this.s;
                boolean z6 = this.v;
                if (z5 == z6 && (w1 = w1(amhVar, kpnVar, csbVar.d, z6)) != null) {
                    int f0 = yon.f0(w1);
                    boolean z7 = csbVar.d;
                    gc9 gc9Var6 = (gc9) csbVar.f;
                    if (z7) {
                        int b2 = gc9Var6.b(w1);
                        gc9 gc9Var7 = (gc9) csbVar.f;
                        csbVar.c = (Integer.MIN_VALUE == gc9Var7.a ? 0 : gc9Var7.o() - gc9Var7.a) + b2;
                    } else {
                        csbVar.c = gc9Var6.e(w1);
                    }
                    csbVar.b = f0;
                    if (!kpnVar.g && f1()) {
                        int e4 = this.r.e(w1);
                        int b3 = this.r.b(w1);
                        int n = this.r.n();
                        int g = this.r.g();
                        boolean z8 = b3 <= n && e4 < n;
                        boolean z9 = e4 >= g && b3 > g;
                        if (z8 || z9) {
                            if (csbVar.d) {
                                n = g;
                            }
                            csbVar.c = n;
                        }
                    }
                    csbVar.e = true;
                }
            }
            csbVar.b();
            csbVar.b = this.v ? kpnVar.b() - 1 : 0;
            csbVar.e = true;
        } else if (view != null && (this.r.e(view) >= this.r.g() || this.r.b(view) <= this.r.n())) {
            csbVar.c(yon.f0(view), view);
        }
        f7g f7gVar = this.q;
        f7gVar.f = f7gVar.j >= 0 ? 1 : -1;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        g1(kpnVar, iArr);
        int n2 = this.r.n() + Math.max(0, iArr[0]);
        int h = this.r.h() + Math.max(0, iArr[1]);
        if (kpnVar.g && (i6 = this.x) != -1 && this.y != Integer.MIN_VALUE && (L = L(i6)) != null) {
            boolean z10 = this.u;
            gc9 gc9Var8 = this.r;
            if (z10) {
                i7 = gc9Var8.g() - this.r.b(L);
                e2 = this.y;
            } else {
                e2 = gc9Var8.e(L) - this.r.n();
                i7 = this.y;
            }
            int i11 = i7 - e2;
            if (i11 > 0) {
                n2 += i11;
            } else {
                h -= i11;
            }
        }
        boolean z11 = csbVar.d;
        boolean z12 = this.u;
        if (!z11 ? !z12 : z12) {
            i9 = 1;
        }
        D1(amhVar, kpnVar, csbVar, i9);
        J(amhVar);
        this.q.l = this.r.j() == 0 && this.r.f() == 0;
        this.q.getClass();
        this.q.i = 0;
        boolean z13 = csbVar.d;
        int i12 = csbVar.b;
        if (z13) {
            N1(i12, csbVar.c);
            f7g f7gVar2 = this.q;
            f7gVar2.h = n2;
            n1(amhVar, f7gVar2, kpnVar, false);
            f7g f7gVar3 = this.q;
            i3 = f7gVar3.b;
            int i13 = f7gVar3.d;
            int i14 = f7gVar3.c;
            if (i14 > 0) {
                h += i14;
            }
            M1(csbVar.b, csbVar.c);
            f7g f7gVar4 = this.q;
            f7gVar4.h = h;
            f7gVar4.d += f7gVar4.e;
            n1(amhVar, f7gVar4, kpnVar, false);
            f7g f7gVar5 = this.q;
            i2 = f7gVar5.b;
            int i15 = f7gVar5.c;
            if (i15 > 0) {
                N1(i13, i3);
                f7g f7gVar6 = this.q;
                f7gVar6.h = i15;
                n1(amhVar, f7gVar6, kpnVar, false);
                i3 = this.q.b;
            }
        } else {
            M1(i12, csbVar.c);
            f7g f7gVar7 = this.q;
            f7gVar7.h = h;
            n1(amhVar, f7gVar7, kpnVar, false);
            f7g f7gVar8 = this.q;
            i2 = f7gVar8.b;
            int i16 = f7gVar8.d;
            int i17 = f7gVar8.c;
            if (i17 > 0) {
                n2 += i17;
            }
            N1(csbVar.b, csbVar.c);
            f7g f7gVar9 = this.q;
            f7gVar9.h = n2;
            f7gVar9.d += f7gVar9.e;
            n1(amhVar, f7gVar9, kpnVar, false);
            f7g f7gVar10 = this.q;
            int i18 = f7gVar10.b;
            int i19 = f7gVar10.c;
            if (i19 > 0) {
                M1(i16, i2);
                f7g f7gVar11 = this.q;
                f7gVar11.h = i19;
                n1(amhVar, f7gVar11, kpnVar, false);
                i2 = this.q.b;
            }
            i3 = i18;
        }
        if (Q() > 0) {
            if (this.u ^ this.v) {
                int x12 = x1(i2, amhVar, kpnVar, true);
                i4 = i3 + x12;
                i5 = i2 + x12;
                x1 = y1(i4, amhVar, kpnVar, false);
            } else {
                int y1 = y1(i3, amhVar, kpnVar, true);
                i4 = i3 + y1;
                i5 = i2 + y1;
                x1 = x1(i5, amhVar, kpnVar, false);
            }
            i3 = i4 + x1;
            i2 = i5 + x1;
        }
        if (kpnVar.k && Q() != 0 && !kpnVar.g && f1()) {
            List list2 = amhVar.a;
            int size = list2.size();
            int f02 = yon.f0(P(0));
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            while (i20 < size) {
                opn opnVar = (opn) list2.get(i20);
                boolean k = opnVar.k();
                View view3 = opnVar.a;
                if (!k) {
                    boolean z14 = opnVar.d() < f02 ? true : z;
                    boolean z15 = this.u;
                    gc9 gc9Var9 = this.r;
                    if (z14 != z15) {
                        i21 += gc9Var9.c(view3);
                    } else {
                        i22 += gc9Var9.c(view3);
                    }
                }
                i20++;
                z = false;
            }
            this.q.k = list2;
            if (i21 > 0) {
                N1(yon.f0(A1()), i3);
                f7g f7gVar12 = this.q;
                f7gVar12.h = i21;
                r4 = 0;
                f7gVar12.c = 0;
                f7gVar12.a(null);
                n1(amhVar, this.q, kpnVar, false);
            } else {
                r4 = 0;
            }
            if (i22 > 0) {
                M1(yon.f0(z1()), i2);
                f7g f7gVar13 = this.q;
                f7gVar13.h = i22;
                f7gVar13.c = r4;
                list = null;
                f7gVar13.a(null);
                n1(amhVar, this.q, kpnVar, r4);
            } else {
                list = null;
            }
            this.q.k = list;
        }
        if (kpnVar.g) {
            csbVar.f();
        } else {
            gc9 gc9Var10 = this.r;
            gc9Var10.a = gc9Var10.o();
        }
        this.s = this.v;
    }

    public final void E1(amh amhVar, f7g f7gVar) {
        if (!f7gVar.a || f7gVar.l) {
            return;
        }
        int i = f7gVar.g;
        int i2 = f7gVar.i;
        if (f7gVar.f == -1) {
            int Q = Q();
            if (i < 0) {
                return;
            }
            int f = (this.r.f() - i) + i2;
            if (this.u) {
                for (int i3 = 0; i3 < Q; i3++) {
                    View P = P(i3);
                    if (this.r.e(P) < f || this.r.q(P) < f) {
                        F1(amhVar, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = Q - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View P2 = P(i5);
                if (this.r.e(P2) < f || this.r.q(P2) < f) {
                    F1(amhVar, i4, i5);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i6 = i - i2;
        int Q2 = Q();
        if (!this.u) {
            for (int i7 = 0; i7 < Q2; i7++) {
                View P3 = P(i7);
                if (this.r.b(P3) > i6 || this.r.p(P3) > i6) {
                    F1(amhVar, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = Q2 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View P4 = P(i9);
            if (this.r.b(P4) > i6 || this.r.p(P4) > i6) {
                F1(amhVar, i8, i9);
                return;
            }
        }
    }

    @Override // defpackage.yon
    public int F(kpn kpnVar) {
        return k1(kpnVar);
    }

    @Override // defpackage.yon
    public void F0(kpn kpnVar) {
        this.z = null;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.A.f();
    }

    public final void F1(amh amhVar, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                View P = P(i);
                P0(i);
                amhVar.i(P);
                i--;
            }
            return;
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            View P2 = P(i3);
            P0(i3);
            amhVar.i(P2);
        }
    }

    @Override // defpackage.yon
    public final int G(kpn kpnVar) {
        return i1(kpnVar);
    }

    public final void G1() {
        if (this.p == 1 || !B1()) {
            this.u = this.t;
        } else {
            this.u = !this.t;
        }
    }

    @Override // defpackage.yon
    public int H(kpn kpnVar) {
        return j1(kpnVar);
    }

    @Override // defpackage.yon
    public final void H0(Parcelable parcelable) {
        if (parcelable instanceof g7g) {
            g7g g7gVar = (g7g) parcelable;
            this.z = g7gVar;
            if (this.x != -1) {
                g7gVar.a = -1;
            }
            R0();
        }
    }

    public final int H1(int i, amh amhVar, kpn kpnVar) {
        if (Q() != 0 && i != 0) {
            m1();
            this.q.a = true;
            int i2 = i > 0 ? 1 : -1;
            int abs = Math.abs(i);
            L1(i2, abs, true, kpnVar);
            f7g f7gVar = this.q;
            int n1 = n1(amhVar, f7gVar, kpnVar, false) + f7gVar.g;
            if (n1 >= 0) {
                if (abs > n1) {
                    i = i2 * n1;
                }
                this.r.r(-i);
                this.q.j = i;
                return i;
            }
        }
        return 0;
    }

    @Override // defpackage.yon
    public int I(kpn kpnVar) {
        return k1(kpnVar);
    }

    @Override // defpackage.yon
    public final Parcelable I0() {
        g7g g7gVar = this.z;
        if (g7gVar != null) {
            g7g g7gVar2 = new g7g();
            g7gVar2.a = g7gVar.a;
            g7gVar2.b = g7gVar.b;
            g7gVar2.c = g7gVar.c;
            return g7gVar2;
        }
        g7g g7gVar3 = new g7g();
        if (Q() <= 0) {
            g7gVar3.a = -1;
            return g7gVar3;
        }
        m1();
        boolean z = this.s ^ this.u;
        g7gVar3.c = z;
        if (z) {
            View z1 = z1();
            g7gVar3.b = this.r.g() - this.r.b(z1);
            g7gVar3.a = yon.f0(z1);
            return g7gVar3;
        }
        View A1 = A1();
        g7gVar3.a = yon.f0(A1);
        g7gVar3.b = this.r.e(A1) - this.r.n();
        return g7gVar3;
    }

    public final void I1(int i, int i2) {
        this.x = i;
        this.y = i2;
        g7g g7gVar = this.z;
        if (g7gVar != null) {
            g7gVar.a = -1;
        }
        R0();
    }

    public final void J1(int i) {
        if (i != 0 && i != 1) {
            xq0.x(k5r.i(i, "invalid orientation:"));
            return;
        }
        v(null);
        if (i != this.p || this.r == null) {
            gc9 a = gc9.a(this, i);
            this.r = a;
            this.A.f = a;
            this.p = i;
            R0();
        }
    }

    @Override // defpackage.yon
    public boolean K0(int i, Bundle bundle) {
        int min;
        if (super.K0(i, bundle)) {
            return true;
        }
        if (i == 16908343 && bundle != null) {
            if (this.p == 1) {
                int i2 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
                if (i2 < 0) {
                    return false;
                }
                RecyclerView recyclerView = this.b;
                min = Math.min(i2, h0(recyclerView.c, recyclerView.N0) - 1);
            } else {
                int i3 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                if (i3 < 0) {
                    return false;
                }
                RecyclerView recyclerView2 = this.b;
                min = Math.min(i3, S(recyclerView2.c, recyclerView2.N0) - 1);
            }
            if (min >= 0) {
                I1(min, 0);
                return true;
            }
        }
        return false;
    }

    public void K1(boolean z) {
        v(null);
        if (this.v == z) {
            return;
        }
        this.v = z;
        R0();
    }

    @Override // defpackage.yon
    public final View L(int i) {
        int Q = Q();
        if (Q == 0) {
            return null;
        }
        int f0 = i - yon.f0(P(0));
        if (f0 >= 0 && f0 < Q) {
            View P = P(f0);
            if (yon.f0(P) == i) {
                return P;
            }
        }
        return super.L(i);
    }

    public final void L1(int i, int i2, boolean z, kpn kpnVar) {
        int n;
        this.q.l = this.r.j() == 0 && this.r.f() == 0;
        this.q.f = i;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        g1(kpnVar, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        boolean z2 = i == 1;
        f7g f7gVar = this.q;
        int i3 = z2 ? max2 : max;
        f7gVar.h = i3;
        if (!z2) {
            max = max2;
        }
        f7gVar.i = max;
        if (z2) {
            f7gVar.h = this.r.h() + i3;
            View z1 = z1();
            f7g f7gVar2 = this.q;
            f7gVar2.e = this.u ? -1 : 1;
            int f0 = yon.f0(z1);
            f7g f7gVar3 = this.q;
            f7gVar2.d = f0 + f7gVar3.e;
            f7gVar3.b = this.r.b(z1);
            n = this.r.b(z1) - this.r.g();
        } else {
            View A1 = A1();
            f7g f7gVar4 = this.q;
            f7gVar4.h = this.r.n() + f7gVar4.h;
            f7g f7gVar5 = this.q;
            f7gVar5.e = this.u ? 1 : -1;
            int f02 = yon.f0(A1);
            f7g f7gVar6 = this.q;
            f7gVar5.d = f02 + f7gVar6.e;
            f7gVar6.b = this.r.e(A1);
            n = (-this.r.e(A1)) + this.r.n();
        }
        f7g f7gVar7 = this.q;
        f7gVar7.c = i2;
        if (z) {
            f7gVar7.c = i2 - n;
        }
        f7gVar7.g = n;
    }

    @Override // defpackage.yon
    public zon M() {
        return new zon(-2, -2);
    }

    public final void M1(int i, int i2) {
        this.q.c = this.r.g() - i2;
        f7g f7gVar = this.q;
        f7gVar.e = this.u ? -1 : 1;
        f7gVar.d = i;
        f7gVar.f = 1;
        f7gVar.b = i2;
        f7gVar.g = Integer.MIN_VALUE;
    }

    public final void N1(int i, int i2) {
        this.q.c = i2 - this.r.n();
        f7g f7gVar = this.q;
        f7gVar.d = i;
        f7gVar.e = this.u ? 1 : -1;
        f7gVar.f = -1;
        f7gVar.b = i2;
        f7gVar.g = Integer.MIN_VALUE;
    }

    @Override // defpackage.yon
    public int S0(int i, amh amhVar, kpn kpnVar) {
        if (this.p == 1) {
            return 0;
        }
        return H1(i, amhVar, kpnVar);
    }

    @Override // defpackage.yon
    public final void T0(int i) {
        this.x = i;
        this.y = Integer.MIN_VALUE;
        g7g g7gVar = this.z;
        if (g7gVar != null) {
            g7gVar.a = -1;
        }
        R0();
    }

    @Override // defpackage.yon
    public int U0(int i, amh amhVar, kpn kpnVar) {
        if (this.p == 0) {
            return 0;
        }
        return H1(i, amhVar, kpnVar);
    }

    @Override // defpackage.yon
    public final boolean b1() {
        if (this.m != 1073741824 && this.l != 1073741824) {
            int Q = Q();
            for (int i = 0; i < Q; i++) {
                ViewGroup.LayoutParams layoutParams = P(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.jpn
    public final PointF c(int i) {
        if (Q() == 0) {
            return null;
        }
        int i2 = (i < yon.f0(P(0))) != this.u ? -1 : 1;
        return this.p == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    @Override // defpackage.yon
    public void d1(RecyclerView recyclerView, int i) {
        i7g i7gVar = new i7g(recyclerView.getContext());
        i7gVar.a = i;
        e1(i7gVar);
    }

    public int f() {
        return o1();
    }

    @Override // defpackage.yon
    public boolean f1() {
        return this.z == null && this.s == this.v;
    }

    public void g1(kpn kpnVar, int[] iArr) {
        int i;
        int o = kpnVar.a != -1 ? this.r.o() : 0;
        if (this.q.f == -1) {
            i = 0;
        } else {
            i = o;
            o = 0;
        }
        iArr[0] = o;
        iArr[1] = i;
    }

    public void h1(kpn kpnVar, f7g f7gVar, ll4 ll4Var) {
        int i = f7gVar.d;
        if (i < 0 || i >= kpnVar.b()) {
            return;
        }
        ll4Var.b(i, Math.max(0, f7gVar.g));
    }

    public final int i1(kpn kpnVar) {
        if (Q() == 0) {
            return 0;
        }
        m1();
        gc9 gc9Var = this.r;
        boolean z = !this.w;
        return qgg.F(kpnVar, gc9Var, q1(z), p1(z), this, this.w);
    }

    public final int j1(kpn kpnVar) {
        if (Q() == 0) {
            return 0;
        }
        m1();
        gc9 gc9Var = this.r;
        boolean z = !this.w;
        return qgg.G(kpnVar, gc9Var, q1(z), p1(z), this, this.w, this.u);
    }

    @Override // defpackage.yon
    public final boolean k0() {
        return true;
    }

    public final int k1(kpn kpnVar) {
        if (Q() == 0) {
            return 0;
        }
        m1();
        gc9 gc9Var = this.r;
        boolean z = !this.w;
        return qgg.H(kpnVar, gc9Var, q1(z), p1(z), this, this.w);
    }

    public int l() {
        return t1();
    }

    @Override // defpackage.yon
    public final boolean l0() {
        return this.t;
    }

    public final int l1(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.p == 1) ? 1 : Integer.MIN_VALUE : this.p == 0 ? 1 : Integer.MIN_VALUE : this.p == 1 ? -1 : Integer.MIN_VALUE : this.p == 0 ? -1 : Integer.MIN_VALUE : (this.p != 1 && B1()) ? -1 : 1 : (this.p != 1 && B1()) ? 1 : -1;
    }

    public final void m1() {
        if (this.q == null) {
            f7g f7gVar = new f7g();
            f7gVar.a = true;
            f7gVar.h = 0;
            f7gVar.i = 0;
            f7gVar.k = null;
            this.q = f7gVar;
        }
    }

    public final int n1(amh amhVar, f7g f7gVar, kpn kpnVar, boolean z) {
        int i;
        int i2 = f7gVar.c;
        int i3 = f7gVar.g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                f7gVar.g = i3 + i2;
            }
            E1(amhVar, f7gVar);
        }
        int i4 = f7gVar.c + f7gVar.h;
        while (true) {
            if ((!f7gVar.l && i4 <= 0) || (i = f7gVar.d) < 0 || i >= kpnVar.b()) {
                break;
            }
            e7g e7gVar = this.B;
            e7gVar.a = 0;
            e7gVar.b = false;
            e7gVar.c = false;
            e7gVar.d = false;
            C1(amhVar, kpnVar, f7gVar, e7gVar);
            if (!e7gVar.b) {
                int i5 = f7gVar.b;
                int i6 = e7gVar.a;
                f7gVar.b = (f7gVar.f * i6) + i5;
                if (!e7gVar.c || f7gVar.k != null || !kpnVar.g) {
                    f7gVar.c -= i6;
                    i4 -= i6;
                }
                int i7 = f7gVar.g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    f7gVar.g = i8;
                    int i9 = f7gVar.c;
                    if (i9 < 0) {
                        f7gVar.g = i8 + i9;
                    }
                    E1(amhVar, f7gVar);
                }
                if (z && e7gVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - f7gVar.c;
    }

    public int o() {
        return r1();
    }

    public final int o1() {
        View v1 = v1(0, Q(), true, false);
        if (v1 == null) {
            return -1;
        }
        return yon.f0(v1);
    }

    public int p() {
        return s1();
    }

    public final View p1(boolean z) {
        return this.u ? v1(0, Q(), z, true) : v1(Q() - 1, -1, z, true);
    }

    public final View q1(boolean z) {
        return this.u ? v1(Q() - 1, -1, z, true) : v1(0, Q(), z, true);
    }

    public final int r1() {
        View v1 = v1(0, Q(), false, true);
        if (v1 == null) {
            return -1;
        }
        return yon.f0(v1);
    }

    public final int s1() {
        View v1 = v1(Q() - 1, -1, true, false);
        if (v1 == null) {
            return -1;
        }
        return yon.f0(v1);
    }

    public final int t1() {
        View v1 = v1(Q() - 1, -1, false, true);
        if (v1 == null) {
            return -1;
        }
        return yon.f0(v1);
    }

    @Override // defpackage.yon
    public View u0(View view, int i, amh amhVar, kpn kpnVar) {
        int l1;
        G1();
        if (Q() != 0 && (l1 = l1(i)) != Integer.MIN_VALUE) {
            m1();
            L1(l1, (int) (this.r.o() * 0.33333334f), false, kpnVar);
            f7g f7gVar = this.q;
            f7gVar.g = Integer.MIN_VALUE;
            f7gVar.a = false;
            n1(amhVar, f7gVar, kpnVar, true);
            boolean z = this.u;
            View u1 = l1 == -1 ? z ? u1(Q() - 1, -1) : u1(0, Q()) : z ? u1(0, Q()) : u1(Q() - 1, -1);
            View A1 = l1 == -1 ? A1() : z1();
            if (!A1.hasFocusable()) {
                return u1;
            }
            if (u1 != null) {
                return A1;
            }
        }
        return null;
    }

    public final View u1(int i, int i2) {
        int i3;
        int i4;
        m1();
        if (i2 <= i && i2 >= i) {
            return P(i);
        }
        if (this.r.e(P(i)) < this.r.n()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.p == 0 ? this.c.E(i, i2, i3, i4) : this.d.E(i, i2, i3, i4);
    }

    @Override // defpackage.yon
    public final void v(String str) {
        if (this.z == null) {
            super.v(str);
        }
    }

    @Override // defpackage.yon
    public final void v0(AccessibilityEvent accessibilityEvent) {
        super.v0(accessibilityEvent);
        if (Q() > 0) {
            accessibilityEvent.setFromIndex(r1());
            accessibilityEvent.setToIndex(t1());
        }
    }

    public final View v1(int i, int i2, boolean z, boolean z2) {
        m1();
        int i3 = z ? 24579 : 320;
        int i4 = z2 ? 320 : 0;
        return this.p == 0 ? this.c.E(i, i2, i3, i4) : this.d.E(i, i2, i3, i4);
    }

    @Override // defpackage.yon
    public void w0(amh amhVar, kpn kpnVar, vb vbVar) {
        super.w0(amhVar, kpnVar, vbVar);
        qon qonVar = this.b.m;
        if (qonVar == null || qonVar.c() <= 0) {
            return;
        }
        vbVar.b(qb.n);
    }

    public View w1(amh amhVar, kpn kpnVar, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        m1();
        int Q = Q();
        if (z2) {
            i2 = Q() - 1;
            i = -1;
            i3 = -1;
        } else {
            i = Q;
            i2 = 0;
            i3 = 1;
        }
        int b = kpnVar.b();
        int n = this.r.n();
        int g = this.r.g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i2 != i) {
            View P = P(i2);
            int f0 = yon.f0(P);
            int e = this.r.e(P);
            int b2 = this.r.b(P);
            if (f0 >= 0 && f0 < b) {
                if (!((zon) P.getLayoutParams()).a.k()) {
                    boolean z3 = b2 <= n && e < n;
                    boolean z4 = e >= g && b2 > g;
                    if (!z3 && !z4) {
                        return P;
                    }
                    if (z) {
                        if (!z4) {
                            if (view != null) {
                            }
                            view = P;
                        }
                        view2 = P;
                    } else {
                        if (!z3) {
                            if (view != null) {
                            }
                            view = P;
                        }
                        view2 = P;
                    }
                } else if (view3 == null) {
                    view3 = P;
                }
            }
            i2 += i3;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    @Override // defpackage.yon
    public boolean x() {
        return this.p == 0;
    }

    public final int x1(int i, amh amhVar, kpn kpnVar, boolean z) {
        int g;
        int g2 = this.r.g() - i;
        if (g2 <= 0) {
            return 0;
        }
        int i2 = -H1(-g2, amhVar, kpnVar);
        int i3 = i + i2;
        if (!z || (g = this.r.g() - i3) <= 0) {
            return i2;
        }
        this.r.r(g);
        return g + i2;
    }

    @Override // defpackage.yon
    public boolean y() {
        return this.p == 1;
    }

    public final int y1(int i, amh amhVar, kpn kpnVar, boolean z) {
        int n;
        int n2 = i - this.r.n();
        if (n2 <= 0) {
            return 0;
        }
        int i2 = -H1(n2, amhVar, kpnVar);
        int i3 = i + i2;
        if (!z || (n = i3 - this.r.n()) <= 0) {
            return i2;
        }
        this.r.r(-n);
        return i2 - n;
    }

    public final View z1() {
        return P(this.u ? 0 : Q() - 1);
    }

    @Override // defpackage.yon
    public void t0(RecyclerView recyclerView, amh amhVar) {
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        this.p = 1;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.z = null;
        this.A = new csb();
        this.B = new e7g();
        this.C = 2;
        this.D = new int[2];
        J1(i);
        v(null);
        if (z == this.t) {
            return;
        }
        this.t = z;
        R0();
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    public void D1(amh amhVar, kpn kpnVar, csb csbVar, int i) {
    }
}
