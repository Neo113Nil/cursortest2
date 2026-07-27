package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.emoji2.text.g;
import com.bumptech.glide.h;
import com.google.android.gms.internal.ads.C2780Sl;
import com.google.android.gms.internal.ads.C3675oP;
import com.google.android.gms.internal.ads.C4085w4;
import com.google.android.gms.internal.ads.SO;
import com.icefishing.icefishinglive2.AbstractC4404f;
import java.util.ArrayList;
import java.util.List;
import t0.AbstractC4990E;
import t0.AbstractC5003S;
import t0.C4989D;
import t0.C4991F;
import t0.C5000O;
import t0.C5022q;
import t0.C5023r;
import t0.C5024s;
import t0.InterfaceC4999N;

/* loaded from: classes.dex */
public class LinearLayoutManager extends AbstractC4990E implements InterfaceC4999N {

    /* renamed from: A, reason: collision with root package name */
    public final C4085w4 f5193A;

    /* renamed from: B, reason: collision with root package name */
    public final SO f5194B;

    /* renamed from: C, reason: collision with root package name */
    public final int f5195C;

    /* renamed from: D, reason: collision with root package name */
    public final int[] f5196D;

    /* renamed from: p, reason: collision with root package name */
    public int f5197p;

    /* renamed from: q, reason: collision with root package name */
    public C5022q f5198q;

    /* renamed from: r, reason: collision with root package name */
    public g f5199r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f5200s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f5201t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f5202u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f5203v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f5204w;

    /* renamed from: x, reason: collision with root package name */
    public int f5205x;

    /* renamed from: y, reason: collision with root package name */
    public int f5206y;

    /* renamed from: z, reason: collision with root package name */
    public C5023r f5207z;

    public LinearLayoutManager(int i) {
        this.f5197p = 1;
        this.f5201t = false;
        this.f5202u = false;
        this.f5203v = false;
        this.f5204w = true;
        this.f5205x = -1;
        this.f5206y = Integer.MIN_VALUE;
        this.f5207z = null;
        this.f5193A = new C4085w4();
        this.f5194B = new SO();
        this.f5195C = 2;
        this.f5196D = new int[2];
        Z0(i);
        c(null);
        if (this.f5201t) {
            this.f5201t = false;
            l0();
        }
    }

    public void A0(C5000O c5000o, int[] iArr) {
        int i;
        int l9 = c5000o.f40569a != -1 ? this.f5199r.l() : 0;
        if (this.f5198q.f40748f == -1) {
            i = 0;
        } else {
            i = l9;
            l9 = 0;
        }
        iArr[0] = l9;
        iArr[1] = i;
    }

    public void B0(C5000O c5000o, C5022q c5022q, C2780Sl c2780Sl) {
        int i = c5022q.f40746d;
        if (i < 0 || i >= c5000o.b()) {
            return;
        }
        c2780Sl.a(i, Math.max(0, c5022q.f40749g));
    }

    public final int C0(C5000O c5000o) {
        if (v() == 0) {
            return 0;
        }
        G0();
        g gVar = this.f5199r;
        boolean z3 = !this.f5204w;
        return h.a(c5000o, gVar, J0(z3), I0(z3), this, this.f5204w);
    }

    public final int D0(C5000O c5000o) {
        if (v() == 0) {
            return 0;
        }
        G0();
        g gVar = this.f5199r;
        boolean z3 = !this.f5204w;
        return h.b(c5000o, gVar, J0(z3), I0(z3), this, this.f5204w, this.f5202u);
    }

    public final int E0(C5000O c5000o) {
        if (v() == 0) {
            return 0;
        }
        G0();
        g gVar = this.f5199r;
        boolean z3 = !this.f5204w;
        return h.c(c5000o, gVar, J0(z3), I0(z3), this, this.f5204w);
    }

    public final int F0(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.f5197p == 1) ? 1 : Integer.MIN_VALUE : this.f5197p == 0 ? 1 : Integer.MIN_VALUE : this.f5197p == 1 ? -1 : Integer.MIN_VALUE : this.f5197p == 0 ? -1 : Integer.MIN_VALUE : (this.f5197p != 1 && S0()) ? -1 : 1 : (this.f5197p != 1 && S0()) ? 1 : -1;
    }

    public final void G0() {
        if (this.f5198q == null) {
            C5022q c5022q = new C5022q();
            c5022q.f40743a = true;
            c5022q.f40750h = 0;
            c5022q.i = 0;
            c5022q.f40752k = null;
            this.f5198q = c5022q;
        }
    }

    public final int H0(C3675oP c3675oP, C5022q c5022q, C5000O c5000o, boolean z3) {
        int i;
        int i6 = c5022q.f40745c;
        int i9 = c5022q.f40749g;
        if (i9 != Integer.MIN_VALUE) {
            if (i6 < 0) {
                c5022q.f40749g = i9 + i6;
            }
            V0(c3675oP, c5022q);
        }
        int i10 = c5022q.f40745c + c5022q.f40750h;
        while (true) {
            if ((!c5022q.f40753l && i10 <= 0) || (i = c5022q.f40746d) < 0 || i >= c5000o.b()) {
                break;
            }
            SO so = this.f5194B;
            so.f27478a = 0;
            so.f27479b = false;
            so.f27480c = false;
            so.f27481d = false;
            T0(c3675oP, c5000o, c5022q, so);
            if (!so.f27479b) {
                int i11 = c5022q.f40744b;
                int i12 = so.f27478a;
                c5022q.f40744b = (c5022q.f40748f * i12) + i11;
                if (!so.f27480c || c5022q.f40752k != null || !c5000o.f40575g) {
                    c5022q.f40745c -= i12;
                    i10 -= i12;
                }
                int i13 = c5022q.f40749g;
                if (i13 != Integer.MIN_VALUE) {
                    int i14 = i13 + i12;
                    c5022q.f40749g = i14;
                    int i15 = c5022q.f40745c;
                    if (i15 < 0) {
                        c5022q.f40749g = i14 + i15;
                    }
                    V0(c3675oP, c5022q);
                }
                if (z3 && so.f27481d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i6 - c5022q.f40745c;
    }

    public final View I0(boolean z3) {
        return this.f5202u ? M0(0, v(), z3) : M0(v() - 1, -1, z3);
    }

    public final View J0(boolean z3) {
        return this.f5202u ? M0(v() - 1, -1, z3) : M0(0, v(), z3);
    }

    public final int K0() {
        View M02 = M0(v() - 1, -1, false);
        if (M02 == null) {
            return -1;
        }
        return AbstractC4990E.H(M02);
    }

    @Override // t0.AbstractC4990E
    public final boolean L() {
        return true;
    }

    public final View L0(int i, int i6) {
        int i9;
        int i10;
        G0();
        if (i6 <= i && i6 >= i) {
            return u(i);
        }
        if (this.f5199r.e(u(i)) < this.f5199r.k()) {
            i9 = 16644;
            i10 = 16388;
        } else {
            i9 = 4161;
            i10 = 4097;
        }
        return this.f5197p == 0 ? this.f40539c.a(i, i6, i9, i10) : this.f40540d.a(i, i6, i9, i10);
    }

    public final View M0(int i, int i6, boolean z3) {
        G0();
        int i9 = z3 ? 24579 : 320;
        return this.f5197p == 0 ? this.f40539c.a(i, i6, i9, 320) : this.f40540d.a(i, i6, i9, 320);
    }

    public View N0(C3675oP c3675oP, C5000O c5000o, int i, int i6, int i9) {
        G0();
        int k9 = this.f5199r.k();
        int g4 = this.f5199r.g();
        int i10 = i6 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i6) {
            View u3 = u(i);
            int H8 = AbstractC4990E.H(u3);
            if (H8 >= 0 && H8 < i9) {
                if (((C4991F) u3.getLayoutParams()).f40551a.h()) {
                    if (view2 == null) {
                        view2 = u3;
                    }
                } else {
                    if (this.f5199r.e(u3) < g4 && this.f5199r.b(u3) >= k9) {
                        return u3;
                    }
                    if (view == null) {
                        view = u3;
                    }
                }
            }
            i += i10;
        }
        return view != null ? view : view2;
    }

    public final int O0(int i, C3675oP c3675oP, C5000O c5000o, boolean z3) {
        int g4;
        int g9 = this.f5199r.g() - i;
        if (g9 <= 0) {
            return 0;
        }
        int i6 = -Y0(-g9, c3675oP, c5000o);
        int i9 = i + i6;
        if (!z3 || (g4 = this.f5199r.g() - i9) <= 0) {
            return i6;
        }
        this.f5199r.o(g4);
        return g4 + i6;
    }

    public final int P0(int i, C3675oP c3675oP, C5000O c5000o, boolean z3) {
        int k9;
        int k10 = i - this.f5199r.k();
        if (k10 <= 0) {
            return 0;
        }
        int i6 = -Y0(k10, c3675oP, c5000o);
        int i9 = i + i6;
        if (!z3 || (k9 = i9 - this.f5199r.k()) <= 0) {
            return i6;
        }
        this.f5199r.o(-k9);
        return i6 - k9;
    }

    public final View Q0() {
        return u(this.f5202u ? 0 : v() - 1);
    }

    public final View R0() {
        return u(this.f5202u ? v() - 1 : 0);
    }

    @Override // t0.AbstractC4990E
    public View S(View view, int i, C3675oP c3675oP, C5000O c5000o) {
        int F02;
        X0();
        if (v() != 0 && (F02 = F0(i)) != Integer.MIN_VALUE) {
            G0();
            b1(F02, (int) (this.f5199r.l() * 0.33333334f), false, c5000o);
            C5022q c5022q = this.f5198q;
            c5022q.f40749g = Integer.MIN_VALUE;
            c5022q.f40743a = false;
            H0(c3675oP, c5022q, c5000o, true);
            View L02 = F02 == -1 ? this.f5202u ? L0(v() - 1, -1) : L0(0, v()) : this.f5202u ? L0(0, v()) : L0(v() - 1, -1);
            View R02 = F02 == -1 ? R0() : Q0();
            if (!R02.hasFocusable()) {
                return L02;
            }
            if (L02 != null) {
                return R02;
            }
        }
        return null;
    }

    public final boolean S0() {
        return C() == 1;
    }

    @Override // t0.AbstractC4990E
    public final void T(AccessibilityEvent accessibilityEvent) {
        super.T(accessibilityEvent);
        if (v() > 0) {
            View M02 = M0(0, v(), false);
            accessibilityEvent.setFromIndex(M02 == null ? -1 : AbstractC4990E.H(M02));
            accessibilityEvent.setToIndex(K0());
        }
    }

    public void T0(C3675oP c3675oP, C5000O c5000o, C5022q c5022q, SO so) {
        int i;
        int i6;
        int i9;
        int i10;
        View b9 = c5022q.b(c3675oP);
        if (b9 == null) {
            so.f27479b = true;
            return;
        }
        C4991F c4991f = (C4991F) b9.getLayoutParams();
        if (c5022q.f40752k == null) {
            if (this.f5202u == (c5022q.f40748f == -1)) {
                b(b9, -1, false);
            } else {
                b(b9, 0, false);
            }
        } else {
            if (this.f5202u == (c5022q.f40748f == -1)) {
                b(b9, -1, true);
            } else {
                b(b9, 0, true);
            }
        }
        C4991F c4991f2 = (C4991F) b9.getLayoutParams();
        Rect J = this.f40538b.J(b9);
        int i11 = J.left + J.right;
        int i12 = J.top + J.bottom;
        int w6 = AbstractC4990E.w(this.f40549n, this.f40547l, F() + E() + ((ViewGroup.MarginLayoutParams) c4991f2).leftMargin + ((ViewGroup.MarginLayoutParams) c4991f2).rightMargin + i11, ((ViewGroup.MarginLayoutParams) c4991f2).width, d());
        int w9 = AbstractC4990E.w(this.f40550o, this.f40548m, D() + G() + ((ViewGroup.MarginLayoutParams) c4991f2).topMargin + ((ViewGroup.MarginLayoutParams) c4991f2).bottomMargin + i12, ((ViewGroup.MarginLayoutParams) c4991f2).height, e());
        if (u0(b9, w6, w9, c4991f2)) {
            b9.measure(w6, w9);
        }
        so.f27478a = this.f5199r.c(b9);
        if (this.f5197p == 1) {
            if (S0()) {
                i10 = this.f40549n - F();
                i = i10 - this.f5199r.d(b9);
            } else {
                i = E();
                i10 = this.f5199r.d(b9) + i;
            }
            if (c5022q.f40748f == -1) {
                i6 = c5022q.f40744b;
                i9 = i6 - so.f27478a;
            } else {
                i9 = c5022q.f40744b;
                i6 = so.f27478a + i9;
            }
        } else {
            int G7 = G();
            int d2 = this.f5199r.d(b9) + G7;
            if (c5022q.f40748f == -1) {
                int i13 = c5022q.f40744b;
                int i14 = i13 - so.f27478a;
                i10 = i13;
                i6 = d2;
                i = i14;
                i9 = G7;
            } else {
                int i15 = c5022q.f40744b;
                int i16 = so.f27478a + i15;
                i = i15;
                i6 = d2;
                i9 = G7;
                i10 = i16;
            }
        }
        AbstractC4990E.N(b9, i, i9, i10, i6);
        if (c4991f.f40551a.h() || c4991f.f40551a.k()) {
            so.f27480c = true;
        }
        so.f27481d = b9.hasFocusable();
    }

    public final void V0(C3675oP c3675oP, C5022q c5022q) {
        if (!c5022q.f40743a || c5022q.f40753l) {
            return;
        }
        int i = c5022q.f40749g;
        int i6 = c5022q.i;
        if (c5022q.f40748f == -1) {
            int v9 = v();
            if (i < 0) {
                return;
            }
            int f3 = (this.f5199r.f() - i) + i6;
            if (this.f5202u) {
                for (int i9 = 0; i9 < v9; i9++) {
                    View u3 = u(i9);
                    if (this.f5199r.e(u3) < f3 || this.f5199r.n(u3) < f3) {
                        W0(c3675oP, 0, i9);
                        return;
                    }
                }
                return;
            }
            int i10 = v9 - 1;
            for (int i11 = i10; i11 >= 0; i11--) {
                View u6 = u(i11);
                if (this.f5199r.e(u6) < f3 || this.f5199r.n(u6) < f3) {
                    W0(c3675oP, i10, i11);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i12 = i - i6;
        int v10 = v();
        if (!this.f5202u) {
            for (int i13 = 0; i13 < v10; i13++) {
                View u9 = u(i13);
                if (this.f5199r.b(u9) > i12 || this.f5199r.m(u9) > i12) {
                    W0(c3675oP, 0, i13);
                    return;
                }
            }
            return;
        }
        int i14 = v10 - 1;
        for (int i15 = i14; i15 >= 0; i15--) {
            View u10 = u(i15);
            if (this.f5199r.b(u10) > i12 || this.f5199r.m(u10) > i12) {
                W0(c3675oP, i14, i15);
                return;
            }
        }
    }

    public final void W0(C3675oP c3675oP, int i, int i6) {
        if (i == i6) {
            return;
        }
        if (i6 <= i) {
            while (i > i6) {
                View u3 = u(i);
                j0(i);
                c3675oP.f(u3);
                i--;
            }
            return;
        }
        for (int i9 = i6 - 1; i9 >= i; i9--) {
            View u6 = u(i9);
            j0(i9);
            c3675oP.f(u6);
        }
    }

    public final void X0() {
        if (this.f5197p == 1 || !S0()) {
            this.f5202u = this.f5201t;
        } else {
            this.f5202u = !this.f5201t;
        }
    }

    public final int Y0(int i, C3675oP c3675oP, C5000O c5000o) {
        if (v() != 0 && i != 0) {
            G0();
            this.f5198q.f40743a = true;
            int i6 = i > 0 ? 1 : -1;
            int abs = Math.abs(i);
            b1(i6, abs, true, c5000o);
            C5022q c5022q = this.f5198q;
            int H02 = H0(c3675oP, c5022q, c5000o, false) + c5022q.f40749g;
            if (H02 >= 0) {
                if (abs > H02) {
                    i = i6 * H02;
                }
                this.f5199r.o(-i);
                this.f5198q.f40751j = i;
                return i;
            }
        }
        return 0;
    }

    public final void Z0(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(AbstractC4404f.e(i, "invalid orientation:"));
        }
        c(null);
        if (i != this.f5197p || this.f5199r == null) {
            g a9 = g.a(this, i);
            this.f5199r = a9;
            this.f5193A.f34799f = a9;
            this.f5197p = i;
            l0();
        }
    }

    @Override // t0.InterfaceC4999N
    public final PointF a(int i) {
        if (v() == 0) {
            return null;
        }
        int i6 = (i < AbstractC4990E.H(u(0))) != this.f5202u ? -1 : 1;
        return this.f5197p == 0 ? new PointF(i6, 0.0f) : new PointF(0.0f, i6);
    }

    public void a1(boolean z3) {
        c(null);
        if (this.f5203v == z3) {
            return;
        }
        this.f5203v = z3;
        l0();
    }

    /* JADX WARN: Removed duplicated region for block: B:183:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0243  */
    @Override // t0.AbstractC4990E
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b0(C3675oP c3675oP, C5000O c5000o) {
        View view;
        View view2;
        C3675oP c3675oP2;
        View N02;
        int i;
        int e9;
        int i6;
        int i9;
        List list;
        int i10;
        int i11;
        int O02;
        int i12;
        View q8;
        int e10;
        int i13;
        int i14;
        LinearLayoutManager linearLayoutManager = this;
        C5000O c5000o2 = c5000o;
        int i15 = -1;
        if (!(linearLayoutManager.f5207z == null && linearLayoutManager.f5205x == -1) && c5000o2.b() == 0) {
            g0(c3675oP);
            return;
        }
        C5023r c5023r = linearLayoutManager.f5207z;
        if (c5023r != null && (i14 = c5023r.f40754n) >= 0) {
            linearLayoutManager.f5205x = i14;
        }
        linearLayoutManager.G0();
        linearLayoutManager.f5198q.f40743a = false;
        linearLayoutManager.X0();
        RecyclerView recyclerView = linearLayoutManager.f40538b;
        if (recyclerView == null || (view = recyclerView.getFocusedChild()) == null || ((ArrayList) linearLayoutManager.f40537a.f38406w).contains(view)) {
            view = null;
        }
        C4085w4 c4085w4 = linearLayoutManager.f5193A;
        if (c4085w4.f34797d && linearLayoutManager.f5205x == -1 && linearLayoutManager.f5207z == null) {
            if (view != null && (linearLayoutManager.f5199r.e(view) >= linearLayoutManager.f5199r.g() || linearLayoutManager.f5199r.b(view) <= linearLayoutManager.f5199r.k())) {
                c4085w4.c(AbstractC4990E.H(view), view);
            }
            c3675oP2 = c3675oP;
        } else {
            c4085w4.d();
            c4085w4.f34795b = linearLayoutManager.f5202u ^ linearLayoutManager.f5203v;
            if (!c5000o2.f40575g && (i = linearLayoutManager.f5205x) != -1) {
                if (i < 0 || i >= c5000o2.b()) {
                    linearLayoutManager.f5205x = -1;
                    linearLayoutManager.f5206y = Integer.MIN_VALUE;
                } else {
                    int i16 = linearLayoutManager.f5205x;
                    c4085w4.f34796c = i16;
                    C5023r c5023r2 = linearLayoutManager.f5207z;
                    if (c5023r2 != null && c5023r2.f40754n >= 0) {
                        boolean z3 = c5023r2.f40756v;
                        c4085w4.f34795b = z3;
                        if (z3) {
                            c4085w4.f34798e = linearLayoutManager.f5199r.g() - linearLayoutManager.f5207z.f40755u;
                        } else {
                            c4085w4.f34798e = linearLayoutManager.f5199r.k() + linearLayoutManager.f5207z.f40755u;
                        }
                    } else if (linearLayoutManager.f5206y == Integer.MIN_VALUE) {
                        View q9 = linearLayoutManager.q(i16);
                        if (q9 == null) {
                            if (linearLayoutManager.v() > 0) {
                                c4085w4.f34795b = (linearLayoutManager.f5205x < AbstractC4990E.H(linearLayoutManager.u(0))) == linearLayoutManager.f5202u;
                            }
                            c4085w4.a();
                        } else if (linearLayoutManager.f5199r.c(q9) > linearLayoutManager.f5199r.l()) {
                            c4085w4.a();
                        } else if (linearLayoutManager.f5199r.e(q9) - linearLayoutManager.f5199r.k() < 0) {
                            c4085w4.f34798e = linearLayoutManager.f5199r.k();
                            c4085w4.f34795b = false;
                        } else if (linearLayoutManager.f5199r.g() - linearLayoutManager.f5199r.b(q9) < 0) {
                            c4085w4.f34798e = linearLayoutManager.f5199r.g();
                            c4085w4.f34795b = true;
                        } else {
                            if (c4085w4.f34795b) {
                                int b9 = linearLayoutManager.f5199r.b(q9);
                                g gVar = linearLayoutManager.f5199r;
                                e9 = (Integer.MIN_VALUE == gVar.f4768a ? 0 : gVar.l() - gVar.f4768a) + b9;
                            } else {
                                e9 = linearLayoutManager.f5199r.e(q9);
                            }
                            c4085w4.f34798e = e9;
                        }
                    } else {
                        boolean z6 = linearLayoutManager.f5202u;
                        c4085w4.f34795b = z6;
                        if (z6) {
                            c4085w4.f34798e = linearLayoutManager.f5199r.g() - linearLayoutManager.f5206y;
                        } else {
                            c4085w4.f34798e = linearLayoutManager.f5199r.k() + linearLayoutManager.f5206y;
                        }
                    }
                    c3675oP2 = c3675oP;
                    c4085w4.f34797d = true;
                }
            }
            if (linearLayoutManager.v() != 0) {
                RecyclerView recyclerView2 = linearLayoutManager.f40538b;
                if (recyclerView2 == null || (view2 = recyclerView2.getFocusedChild()) == null || ((ArrayList) linearLayoutManager.f40537a.f38406w).contains(view2)) {
                    view2 = null;
                }
                if (view2 != null) {
                    C4991F c4991f = (C4991F) view2.getLayoutParams();
                    if (!c4991f.f40551a.h() && c4991f.f40551a.b() >= 0 && c4991f.f40551a.b() < c5000o2.b()) {
                        c4085w4.c(AbstractC4990E.H(view2), view2);
                        c3675oP2 = c3675oP;
                        c4085w4.f34797d = true;
                    }
                }
                if (linearLayoutManager.f5200s == linearLayoutManager.f5203v) {
                    if (c4085w4.f34795b) {
                        if (linearLayoutManager.f5202u) {
                            N02 = linearLayoutManager.N0(c3675oP, c5000o2, 0, linearLayoutManager.v(), c5000o2.b());
                        } else {
                            linearLayoutManager = this;
                            N02 = linearLayoutManager.N0(c3675oP, c5000o, v() - 1, -1, c5000o.b());
                            c3675oP2 = c3675oP;
                            c5000o2 = c5000o;
                            if (N02 != null) {
                                c4085w4.b(AbstractC4990E.H(N02), N02);
                                if (!c5000o2.f40575g && linearLayoutManager.z0() && (linearLayoutManager.f5199r.e(N02) >= linearLayoutManager.f5199r.g() || linearLayoutManager.f5199r.b(N02) < linearLayoutManager.f5199r.k())) {
                                    c4085w4.f34798e = c4085w4.f34795b ? linearLayoutManager.f5199r.g() : linearLayoutManager.f5199r.k();
                                }
                                c4085w4.f34797d = true;
                            }
                            c4085w4.a();
                            c4085w4.f34796c = !linearLayoutManager.f5203v ? c5000o2.b() - 1 : 0;
                            c4085w4.f34797d = true;
                        }
                    } else if (linearLayoutManager.f5202u) {
                        N02 = linearLayoutManager.N0(c3675oP, c5000o, linearLayoutManager.v() - 1, -1, c5000o.b());
                    } else {
                        linearLayoutManager = this;
                        c3675oP2 = c3675oP;
                        c5000o2 = c5000o;
                        N02 = linearLayoutManager.N0(c3675oP2, c5000o2, 0, v(), c5000o.b());
                        if (N02 != null) {
                        }
                        c4085w4.a();
                        c4085w4.f34796c = !linearLayoutManager.f5203v ? c5000o2.b() - 1 : 0;
                        c4085w4.f34797d = true;
                    }
                    linearLayoutManager = this;
                    c3675oP2 = c3675oP;
                    c5000o2 = c5000o;
                    if (N02 != null) {
                    }
                    c4085w4.a();
                    c4085w4.f34796c = !linearLayoutManager.f5203v ? c5000o2.b() - 1 : 0;
                    c4085w4.f34797d = true;
                }
            }
            c3675oP2 = c3675oP;
            c4085w4.a();
            c4085w4.f34796c = !linearLayoutManager.f5203v ? c5000o2.b() - 1 : 0;
            c4085w4.f34797d = true;
        }
        C5022q c5022q = linearLayoutManager.f5198q;
        c5022q.f40748f = c5022q.f40751j >= 0 ? 1 : -1;
        int[] iArr = linearLayoutManager.f5196D;
        iArr[0] = 0;
        iArr[1] = 0;
        linearLayoutManager.A0(c5000o2, iArr);
        int k9 = linearLayoutManager.f5199r.k() + Math.max(0, iArr[0]);
        int h9 = linearLayoutManager.f5199r.h() + Math.max(0, iArr[1]);
        if (c5000o2.f40575g && (i12 = linearLayoutManager.f5205x) != -1 && linearLayoutManager.f5206y != Integer.MIN_VALUE && (q8 = linearLayoutManager.q(i12)) != null) {
            if (linearLayoutManager.f5202u) {
                i13 = linearLayoutManager.f5199r.g() - linearLayoutManager.f5199r.b(q8);
                e10 = linearLayoutManager.f5206y;
            } else {
                e10 = linearLayoutManager.f5199r.e(q8) - linearLayoutManager.f5199r.k();
                i13 = linearLayoutManager.f5206y;
            }
            int i17 = i13 - e10;
            if (i17 > 0) {
                k9 += i17;
            } else {
                h9 -= i17;
            }
        }
        if (!c4085w4.f34795b ? !linearLayoutManager.f5202u : linearLayoutManager.f5202u) {
            i15 = 1;
        }
        linearLayoutManager.U0(c3675oP2, c5000o2, c4085w4, i15);
        p(c3675oP);
        linearLayoutManager.f5198q.f40753l = linearLayoutManager.f5199r.i() == 0 && linearLayoutManager.f5199r.f() == 0;
        linearLayoutManager.f5198q.getClass();
        linearLayoutManager.f5198q.i = 0;
        if (c4085w4.f34795b) {
            linearLayoutManager.d1(c4085w4.f34796c, c4085w4.f34798e);
            C5022q c5022q2 = linearLayoutManager.f5198q;
            c5022q2.f40750h = k9;
            linearLayoutManager.H0(c3675oP2, c5022q2, c5000o2, false);
            C5022q c5022q3 = linearLayoutManager.f5198q;
            i9 = c5022q3.f40744b;
            int i18 = c5022q3.f40746d;
            int i19 = c5022q3.f40745c;
            if (i19 > 0) {
                h9 += i19;
            }
            linearLayoutManager.c1(c4085w4.f34796c, c4085w4.f34798e);
            C5022q c5022q4 = linearLayoutManager.f5198q;
            c5022q4.f40750h = h9;
            c5022q4.f40746d += c5022q4.f40747e;
            linearLayoutManager.H0(c3675oP2, c5022q4, c5000o2, false);
            C5022q c5022q5 = linearLayoutManager.f5198q;
            i6 = c5022q5.f40744b;
            int i20 = c5022q5.f40745c;
            if (i20 > 0) {
                linearLayoutManager.d1(i18, i9);
                C5022q c5022q6 = linearLayoutManager.f5198q;
                c5022q6.f40750h = i20;
                linearLayoutManager.H0(c3675oP2, c5022q6, c5000o2, false);
                i9 = linearLayoutManager.f5198q.f40744b;
            }
        } else {
            linearLayoutManager.c1(c4085w4.f34796c, c4085w4.f34798e);
            C5022q c5022q7 = linearLayoutManager.f5198q;
            c5022q7.f40750h = h9;
            linearLayoutManager.H0(c3675oP2, c5022q7, c5000o2, false);
            C5022q c5022q8 = linearLayoutManager.f5198q;
            i6 = c5022q8.f40744b;
            int i21 = c5022q8.f40746d;
            int i22 = c5022q8.f40745c;
            if (i22 > 0) {
                k9 += i22;
            }
            linearLayoutManager.d1(c4085w4.f34796c, c4085w4.f34798e);
            C5022q c5022q9 = linearLayoutManager.f5198q;
            c5022q9.f40750h = k9;
            c5022q9.f40746d += c5022q9.f40747e;
            linearLayoutManager.H0(c3675oP2, c5022q9, c5000o2, false);
            C5022q c5022q10 = linearLayoutManager.f5198q;
            i9 = c5022q10.f40744b;
            int i23 = c5022q10.f40745c;
            if (i23 > 0) {
                linearLayoutManager.c1(i21, i6);
                C5022q c5022q11 = linearLayoutManager.f5198q;
                c5022q11.f40750h = i23;
                linearLayoutManager.H0(c3675oP2, c5022q11, c5000o2, false);
                i6 = linearLayoutManager.f5198q.f40744b;
            }
        }
        if (linearLayoutManager.v() > 0) {
            if (linearLayoutManager.f5202u ^ linearLayoutManager.f5203v) {
                int O03 = linearLayoutManager.O0(i6, c3675oP2, c5000o2, true);
                i10 = i9 + O03;
                i11 = i6 + O03;
                O02 = linearLayoutManager.P0(i10, c3675oP2, c5000o2, false);
            } else {
                int P02 = linearLayoutManager.P0(i9, c3675oP2, c5000o2, true);
                i10 = i9 + P02;
                i11 = i6 + P02;
                O02 = linearLayoutManager.O0(i11, c3675oP2, c5000o2, false);
            }
            i9 = i10 + O02;
            i6 = i11 + O02;
        }
        if (c5000o2.f40578k && linearLayoutManager.v() != 0 && !c5000o2.f40575g && linearLayoutManager.z0()) {
            List list2 = (List) c3675oP2.f32902f;
            int size = list2.size();
            int H8 = AbstractC4990E.H(linearLayoutManager.u(0));
            int i24 = 0;
            int i25 = 0;
            for (int i26 = 0; i26 < size; i26++) {
                AbstractC5003S abstractC5003S = (AbstractC5003S) list2.get(i26);
                if (!abstractC5003S.h()) {
                    boolean z9 = abstractC5003S.b() < H8;
                    boolean z10 = linearLayoutManager.f5202u;
                    View view3 = abstractC5003S.f40590a;
                    if (z9 != z10) {
                        i24 += linearLayoutManager.f5199r.c(view3);
                    } else {
                        i25 += linearLayoutManager.f5199r.c(view3);
                    }
                }
            }
            linearLayoutManager.f5198q.f40752k = list2;
            if (i24 > 0) {
                linearLayoutManager.d1(AbstractC4990E.H(linearLayoutManager.R0()), i9);
                C5022q c5022q12 = linearLayoutManager.f5198q;
                c5022q12.f40750h = i24;
                c5022q12.f40745c = 0;
                c5022q12.a(null);
                linearLayoutManager.H0(c3675oP2, linearLayoutManager.f5198q, c5000o2, false);
            }
            if (i25 > 0) {
                linearLayoutManager.c1(AbstractC4990E.H(linearLayoutManager.Q0()), i6);
                C5022q c5022q13 = linearLayoutManager.f5198q;
                c5022q13.f40750h = i25;
                c5022q13.f40745c = 0;
                list = null;
                c5022q13.a(null);
                linearLayoutManager.H0(c3675oP2, linearLayoutManager.f5198q, c5000o2, false);
            } else {
                list = null;
            }
            linearLayoutManager.f5198q.f40752k = list;
        }
        if (c5000o2.f40575g) {
            c4085w4.d();
        } else {
            g gVar2 = linearLayoutManager.f5199r;
            gVar2.f4768a = gVar2.l();
        }
        linearLayoutManager.f5200s = linearLayoutManager.f5203v;
    }

    public final void b1(int i, int i6, boolean z3, C5000O c5000o) {
        int k9;
        this.f5198q.f40753l = this.f5199r.i() == 0 && this.f5199r.f() == 0;
        this.f5198q.f40748f = i;
        int[] iArr = this.f5196D;
        iArr[0] = 0;
        iArr[1] = 0;
        A0(c5000o, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        boolean z6 = i == 1;
        C5022q c5022q = this.f5198q;
        int i9 = z6 ? max2 : max;
        c5022q.f40750h = i9;
        if (!z6) {
            max = max2;
        }
        c5022q.i = max;
        if (z6) {
            c5022q.f40750h = this.f5199r.h() + i9;
            View Q02 = Q0();
            C5022q c5022q2 = this.f5198q;
            c5022q2.f40747e = this.f5202u ? -1 : 1;
            int H8 = AbstractC4990E.H(Q02);
            C5022q c5022q3 = this.f5198q;
            c5022q2.f40746d = H8 + c5022q3.f40747e;
            c5022q3.f40744b = this.f5199r.b(Q02);
            k9 = this.f5199r.b(Q02) - this.f5199r.g();
        } else {
            View R02 = R0();
            C5022q c5022q4 = this.f5198q;
            c5022q4.f40750h = this.f5199r.k() + c5022q4.f40750h;
            C5022q c5022q5 = this.f5198q;
            c5022q5.f40747e = this.f5202u ? 1 : -1;
            int H9 = AbstractC4990E.H(R02);
            C5022q c5022q6 = this.f5198q;
            c5022q5.f40746d = H9 + c5022q6.f40747e;
            c5022q6.f40744b = this.f5199r.e(R02);
            k9 = (-this.f5199r.e(R02)) + this.f5199r.k();
        }
        C5022q c5022q7 = this.f5198q;
        c5022q7.f40745c = i6;
        if (z3) {
            c5022q7.f40745c = i6 - k9;
        }
        c5022q7.f40749g = k9;
    }

    @Override // t0.AbstractC4990E
    public final void c(String str) {
        if (this.f5207z == null) {
            super.c(str);
        }
    }

    @Override // t0.AbstractC4990E
    public void c0(C5000O c5000o) {
        this.f5207z = null;
        this.f5205x = -1;
        this.f5206y = Integer.MIN_VALUE;
        this.f5193A.d();
    }

    public final void c1(int i, int i6) {
        this.f5198q.f40745c = this.f5199r.g() - i6;
        C5022q c5022q = this.f5198q;
        c5022q.f40747e = this.f5202u ? -1 : 1;
        c5022q.f40746d = i;
        c5022q.f40748f = 1;
        c5022q.f40744b = i6;
        c5022q.f40749g = Integer.MIN_VALUE;
    }

    @Override // t0.AbstractC4990E
    public final boolean d() {
        return this.f5197p == 0;
    }

    @Override // t0.AbstractC4990E
    public final void d0(Parcelable parcelable) {
        if (parcelable instanceof C5023r) {
            this.f5207z = (C5023r) parcelable;
            l0();
        }
    }

    public final void d1(int i, int i6) {
        this.f5198q.f40745c = i6 - this.f5199r.k();
        C5022q c5022q = this.f5198q;
        c5022q.f40746d = i;
        c5022q.f40747e = this.f5202u ? 1 : -1;
        c5022q.f40748f = -1;
        c5022q.f40744b = i6;
        c5022q.f40749g = Integer.MIN_VALUE;
    }

    @Override // t0.AbstractC4990E
    public final boolean e() {
        return this.f5197p == 1;
    }

    @Override // t0.AbstractC4990E
    public final Parcelable e0() {
        C5023r c5023r = this.f5207z;
        if (c5023r != null) {
            C5023r c5023r2 = new C5023r();
            c5023r2.f40754n = c5023r.f40754n;
            c5023r2.f40755u = c5023r.f40755u;
            c5023r2.f40756v = c5023r.f40756v;
            return c5023r2;
        }
        C5023r c5023r3 = new C5023r();
        if (v() <= 0) {
            c5023r3.f40754n = -1;
            return c5023r3;
        }
        G0();
        boolean z3 = this.f5200s ^ this.f5202u;
        c5023r3.f40756v = z3;
        if (z3) {
            View Q02 = Q0();
            c5023r3.f40755u = this.f5199r.g() - this.f5199r.b(Q02);
            c5023r3.f40754n = AbstractC4990E.H(Q02);
            return c5023r3;
        }
        View R02 = R0();
        c5023r3.f40754n = AbstractC4990E.H(R02);
        c5023r3.f40755u = this.f5199r.e(R02) - this.f5199r.k();
        return c5023r3;
    }

    @Override // t0.AbstractC4990E
    public final void h(int i, int i6, C5000O c5000o, C2780Sl c2780Sl) {
        if (this.f5197p != 0) {
            i = i6;
        }
        if (v() == 0 || i == 0) {
            return;
        }
        G0();
        b1(i > 0 ? 1 : -1, Math.abs(i), true, c5000o);
        B0(c5000o, this.f5198q, c2780Sl);
    }

    @Override // t0.AbstractC4990E
    public final void i(int i, C2780Sl c2780Sl) {
        boolean z3;
        int i6;
        C5023r c5023r = this.f5207z;
        if (c5023r == null || (i6 = c5023r.f40754n) < 0) {
            X0();
            z3 = this.f5202u;
            i6 = this.f5205x;
            if (i6 == -1) {
                i6 = z3 ? i - 1 : 0;
            }
        } else {
            z3 = c5023r.f40756v;
        }
        int i9 = z3 ? -1 : 1;
        for (int i10 = 0; i10 < this.f5195C && i6 >= 0 && i6 < i; i10++) {
            c2780Sl.a(i6, 0);
            i6 += i9;
        }
    }

    @Override // t0.AbstractC4990E
    public final int j(C5000O c5000o) {
        return C0(c5000o);
    }

    @Override // t0.AbstractC4990E
    public int k(C5000O c5000o) {
        return D0(c5000o);
    }

    @Override // t0.AbstractC4990E
    public int l(C5000O c5000o) {
        return E0(c5000o);
    }

    @Override // t0.AbstractC4990E
    public final int m(C5000O c5000o) {
        return C0(c5000o);
    }

    @Override // t0.AbstractC4990E
    public int m0(int i, C3675oP c3675oP, C5000O c5000o) {
        if (this.f5197p == 1) {
            return 0;
        }
        return Y0(i, c3675oP, c5000o);
    }

    @Override // t0.AbstractC4990E
    public int n(C5000O c5000o) {
        return D0(c5000o);
    }

    @Override // t0.AbstractC4990E
    public final void n0(int i) {
        this.f5205x = i;
        this.f5206y = Integer.MIN_VALUE;
        C5023r c5023r = this.f5207z;
        if (c5023r != null) {
            c5023r.f40754n = -1;
        }
        l0();
    }

    @Override // t0.AbstractC4990E
    public int o(C5000O c5000o) {
        return E0(c5000o);
    }

    @Override // t0.AbstractC4990E
    public int o0(int i, C3675oP c3675oP, C5000O c5000o) {
        if (this.f5197p == 0) {
            return 0;
        }
        return Y0(i, c3675oP, c5000o);
    }

    @Override // t0.AbstractC4990E
    public final View q(int i) {
        int v9 = v();
        if (v9 == 0) {
            return null;
        }
        int H8 = i - AbstractC4990E.H(u(0));
        if (H8 >= 0 && H8 < v9) {
            View u3 = u(H8);
            if (AbstractC4990E.H(u3) == i) {
                return u3;
            }
        }
        return super.q(i);
    }

    @Override // t0.AbstractC4990E
    public C4991F r() {
        return new C4991F(-2, -2);
    }

    @Override // t0.AbstractC4990E
    public final boolean v0() {
        if (this.f40548m != 1073741824 && this.f40547l != 1073741824) {
            int v9 = v();
            for (int i = 0; i < v9; i++) {
                ViewGroup.LayoutParams layoutParams = u(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // t0.AbstractC4990E
    public void x0(RecyclerView recyclerView, int i) {
        C5024s c5024s = new C5024s(recyclerView.getContext());
        c5024s.f40757a = i;
        y0(c5024s);
    }

    @Override // t0.AbstractC4990E
    public boolean z0() {
        return this.f5207z == null && this.f5200s == this.f5203v;
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i6) {
        this.f5197p = 1;
        this.f5201t = false;
        this.f5202u = false;
        this.f5203v = false;
        this.f5204w = true;
        this.f5205x = -1;
        this.f5206y = Integer.MIN_VALUE;
        this.f5207z = null;
        this.f5193A = new C4085w4();
        this.f5194B = new SO();
        this.f5195C = 2;
        this.f5196D = new int[2];
        C4989D I8 = AbstractC4990E.I(context, attributeSet, i, i6);
        Z0(I8.f40533a);
        boolean z3 = I8.f40535c;
        c(null);
        if (z3 != this.f5201t) {
            this.f5201t = z3;
            l0();
        }
        a1(I8.f40536d);
    }

    @Override // t0.AbstractC4990E
    public final void R(RecyclerView recyclerView) {
    }

    public void U0(C3675oP c3675oP, C5000O c5000o, C4085w4 c4085w4, int i) {
    }
}
