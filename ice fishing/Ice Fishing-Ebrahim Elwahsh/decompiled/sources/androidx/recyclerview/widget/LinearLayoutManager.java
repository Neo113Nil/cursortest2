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
import com.google.android.gms.internal.ads.BP;
import com.google.android.gms.internal.ads.C2830Vl;
import com.google.android.gms.internal.ads.C3203fP;
import com.google.android.gms.internal.ads.C3990u4;
import com.google.android.gms.internal.ads.CL;
import java.util.ArrayList;
import java.util.List;
import t0.AbstractC5019C;
import t0.AbstractC5032P;
import t0.C5018B;
import t0.C5020D;
import t0.C5029M;
import t0.C5054q;
import t0.C5055r;
import t0.C5056s;
import t0.InterfaceC5028L;

/* loaded from: classes.dex */
public class LinearLayoutManager extends AbstractC5019C implements InterfaceC5028L {

    /* renamed from: A, reason: collision with root package name */
    public final C3990u4 f5305A;

    /* renamed from: B, reason: collision with root package name */
    public final C3203fP f5306B;

    /* renamed from: C, reason: collision with root package name */
    public final int f5307C;

    /* renamed from: D, reason: collision with root package name */
    public final int[] f5308D;

    /* renamed from: p, reason: collision with root package name */
    public int f5309p;

    /* renamed from: q, reason: collision with root package name */
    public C5054q f5310q;

    /* renamed from: r, reason: collision with root package name */
    public g f5311r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f5312s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f5313t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f5314u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f5315v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f5316w;

    /* renamed from: x, reason: collision with root package name */
    public int f5317x;

    /* renamed from: y, reason: collision with root package name */
    public int f5318y;

    /* renamed from: z, reason: collision with root package name */
    public C5055r f5319z;

    public LinearLayoutManager(int i) {
        this.f5309p = 1;
        this.f5313t = false;
        this.f5314u = false;
        this.f5315v = false;
        this.f5316w = true;
        this.f5317x = -1;
        this.f5318y = Integer.MIN_VALUE;
        this.f5319z = null;
        this.f5305A = new C3990u4();
        this.f5306B = new C3203fP();
        this.f5307C = 2;
        this.f5308D = new int[2];
        Z0(i);
        c(null);
        if (this.f5313t) {
            this.f5313t = false;
            l0();
        }
    }

    public void A0(C5029M c5029m, int[] iArr) {
        int i;
        int l9 = c5029m.f40594a != -1 ? this.f5311r.l() : 0;
        if (this.f5310q.f40770f == -1) {
            i = 0;
        } else {
            i = l9;
            l9 = 0;
        }
        iArr[0] = l9;
        iArr[1] = i;
    }

    public void B0(C5029M c5029m, C5054q c5054q, C2830Vl c2830Vl) {
        int i = c5054q.f40768d;
        if (i < 0 || i >= c5029m.b()) {
            return;
        }
        c2830Vl.a(i, Math.max(0, c5054q.f40771g));
    }

    public final int C0(C5029M c5029m) {
        if (v() == 0) {
            return 0;
        }
        G0();
        g gVar = this.f5311r;
        boolean z8 = !this.f5316w;
        return com.bumptech.glide.g.E(c5029m, gVar, J0(z8), I0(z8), this, this.f5316w);
    }

    public final int D0(C5029M c5029m) {
        if (v() == 0) {
            return 0;
        }
        G0();
        g gVar = this.f5311r;
        boolean z8 = !this.f5316w;
        return com.bumptech.glide.g.F(c5029m, gVar, J0(z8), I0(z8), this, this.f5316w, this.f5314u);
    }

    public final int E0(C5029M c5029m) {
        if (v() == 0) {
            return 0;
        }
        G0();
        g gVar = this.f5311r;
        boolean z8 = !this.f5316w;
        return com.bumptech.glide.g.G(c5029m, gVar, J0(z8), I0(z8), this, this.f5316w);
    }

    public final int F0(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.f5309p == 1) ? 1 : Integer.MIN_VALUE : this.f5309p == 0 ? 1 : Integer.MIN_VALUE : this.f5309p == 1 ? -1 : Integer.MIN_VALUE : this.f5309p == 0 ? -1 : Integer.MIN_VALUE : (this.f5309p != 1 && S0()) ? -1 : 1 : (this.f5309p != 1 && S0()) ? 1 : -1;
    }

    public final void G0() {
        if (this.f5310q == null) {
            C5054q c5054q = new C5054q();
            c5054q.f40765a = true;
            c5054q.f40772h = 0;
            c5054q.i = 0;
            c5054q.f40774k = null;
            this.f5310q = c5054q;
        }
    }

    public final int H0(BP bp, C5054q c5054q, C5029M c5029m, boolean z8) {
        int i;
        int i4 = c5054q.f40767c;
        int i9 = c5054q.f40771g;
        if (i9 != Integer.MIN_VALUE) {
            if (i4 < 0) {
                c5054q.f40771g = i9 + i4;
            }
            V0(bp, c5054q);
        }
        int i10 = c5054q.f40767c + c5054q.f40772h;
        while (true) {
            if ((!c5054q.f40775l && i10 <= 0) || (i = c5054q.f40768d) < 0 || i >= c5029m.b()) {
                break;
            }
            C3203fP c3203fP = this.f5306B;
            c3203fP.f30698a = 0;
            c3203fP.f30699b = false;
            c3203fP.f30700c = false;
            c3203fP.f30701d = false;
            T0(bp, c5029m, c5054q, c3203fP);
            if (!c3203fP.f30699b) {
                int i11 = c5054q.f40766b;
                int i12 = c3203fP.f30698a;
                c5054q.f40766b = (c5054q.f40770f * i12) + i11;
                if (!c3203fP.f30700c || c5054q.f40774k != null || !c5029m.f40600g) {
                    c5054q.f40767c -= i12;
                    i10 -= i12;
                }
                int i13 = c5054q.f40771g;
                if (i13 != Integer.MIN_VALUE) {
                    int i14 = i13 + i12;
                    c5054q.f40771g = i14;
                    int i15 = c5054q.f40767c;
                    if (i15 < 0) {
                        c5054q.f40771g = i14 + i15;
                    }
                    V0(bp, c5054q);
                }
                if (z8 && c3203fP.f30701d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i4 - c5054q.f40767c;
    }

    public final View I0(boolean z8) {
        return this.f5314u ? M0(0, v(), z8) : M0(v() - 1, -1, z8);
    }

    public final View J0(boolean z8) {
        return this.f5314u ? M0(v() - 1, -1, z8) : M0(0, v(), z8);
    }

    public final int K0() {
        View M02 = M0(v() - 1, -1, false);
        if (M02 == null) {
            return -1;
        }
        return AbstractC5019C.H(M02);
    }

    @Override // t0.AbstractC5019C
    public final boolean L() {
        return true;
    }

    public final View L0(int i, int i4) {
        int i9;
        int i10;
        G0();
        if (i4 <= i && i4 >= i) {
            return u(i);
        }
        if (this.f5311r.e(u(i)) < this.f5311r.k()) {
            i9 = 16644;
            i10 = 16388;
        } else {
            i9 = 4161;
            i10 = 4097;
        }
        return this.f5309p == 0 ? this.f40564c.t(i, i4, i9, i10) : this.f40565d.t(i, i4, i9, i10);
    }

    public final View M0(int i, int i4, boolean z8) {
        G0();
        int i9 = z8 ? 24579 : 320;
        return this.f5309p == 0 ? this.f40564c.t(i, i4, i9, 320) : this.f40565d.t(i, i4, i9, 320);
    }

    public View N0(BP bp, C5029M c5029m, int i, int i4, int i9) {
        G0();
        int k6 = this.f5311r.k();
        int g9 = this.f5311r.g();
        int i10 = i4 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i4) {
            View u7 = u(i);
            int H6 = AbstractC5019C.H(u7);
            if (H6 >= 0 && H6 < i9) {
                if (((C5020D) u7.getLayoutParams()).f40576a.h()) {
                    if (view2 == null) {
                        view2 = u7;
                    }
                } else {
                    if (this.f5311r.e(u7) < g9 && this.f5311r.b(u7) >= k6) {
                        return u7;
                    }
                    if (view == null) {
                        view = u7;
                    }
                }
            }
            i += i10;
        }
        return view != null ? view : view2;
    }

    public final int O0(int i, BP bp, C5029M c5029m, boolean z8) {
        int g9;
        int g10 = this.f5311r.g() - i;
        if (g10 <= 0) {
            return 0;
        }
        int i4 = -Y0(-g10, bp, c5029m);
        int i9 = i + i4;
        if (!z8 || (g9 = this.f5311r.g() - i9) <= 0) {
            return i4;
        }
        this.f5311r.o(g9);
        return g9 + i4;
    }

    public final int P0(int i, BP bp, C5029M c5029m, boolean z8) {
        int k6;
        int k9 = i - this.f5311r.k();
        if (k9 <= 0) {
            return 0;
        }
        int i4 = -Y0(k9, bp, c5029m);
        int i9 = i + i4;
        if (!z8 || (k6 = i9 - this.f5311r.k()) <= 0) {
            return i4;
        }
        this.f5311r.o(-k6);
        return i4 - k6;
    }

    public final View Q0() {
        return u(this.f5314u ? 0 : v() - 1);
    }

    public final View R0() {
        return u(this.f5314u ? v() - 1 : 0);
    }

    @Override // t0.AbstractC5019C
    public View S(View view, int i, BP bp, C5029M c5029m) {
        int F02;
        X0();
        if (v() != 0 && (F02 = F0(i)) != Integer.MIN_VALUE) {
            G0();
            b1(F02, (int) (this.f5311r.l() * 0.33333334f), false, c5029m);
            C5054q c5054q = this.f5310q;
            c5054q.f40771g = Integer.MIN_VALUE;
            c5054q.f40765a = false;
            H0(bp, c5054q, c5029m, true);
            View L02 = F02 == -1 ? this.f5314u ? L0(v() - 1, -1) : L0(0, v()) : this.f5314u ? L0(0, v()) : L0(v() - 1, -1);
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

    @Override // t0.AbstractC5019C
    public final void T(AccessibilityEvent accessibilityEvent) {
        super.T(accessibilityEvent);
        if (v() > 0) {
            View M02 = M0(0, v(), false);
            accessibilityEvent.setFromIndex(M02 == null ? -1 : AbstractC5019C.H(M02));
            accessibilityEvent.setToIndex(K0());
        }
    }

    public void T0(BP bp, C5029M c5029m, C5054q c5054q, C3203fP c3203fP) {
        int i;
        int i4;
        int i9;
        int i10;
        View b9 = c5054q.b(bp);
        if (b9 == null) {
            c3203fP.f30699b = true;
            return;
        }
        C5020D c5020d = (C5020D) b9.getLayoutParams();
        if (c5054q.f40774k == null) {
            if (this.f5314u == (c5054q.f40770f == -1)) {
                b(b9, -1, false);
            } else {
                b(b9, 0, false);
            }
        } else {
            if (this.f5314u == (c5054q.f40770f == -1)) {
                b(b9, -1, true);
            } else {
                b(b9, 0, true);
            }
        }
        C5020D c5020d2 = (C5020D) b9.getLayoutParams();
        Rect J = this.f40563b.J(b9);
        int i11 = J.left + J.right;
        int i12 = J.top + J.bottom;
        int w9 = AbstractC5019C.w(this.f40574n, this.f40572l, F() + E() + ((ViewGroup.MarginLayoutParams) c5020d2).leftMargin + ((ViewGroup.MarginLayoutParams) c5020d2).rightMargin + i11, ((ViewGroup.MarginLayoutParams) c5020d2).width, d());
        int w10 = AbstractC5019C.w(this.f40575o, this.f40573m, D() + G() + ((ViewGroup.MarginLayoutParams) c5020d2).topMargin + ((ViewGroup.MarginLayoutParams) c5020d2).bottomMargin + i12, ((ViewGroup.MarginLayoutParams) c5020d2).height, e());
        if (u0(b9, w9, w10, c5020d2)) {
            b9.measure(w9, w10);
        }
        c3203fP.f30698a = this.f5311r.c(b9);
        if (this.f5309p == 1) {
            if (S0()) {
                i10 = this.f40574n - F();
                i = i10 - this.f5311r.d(b9);
            } else {
                i = E();
                i10 = this.f5311r.d(b9) + i;
            }
            if (c5054q.f40770f == -1) {
                i4 = c5054q.f40766b;
                i9 = i4 - c3203fP.f30698a;
            } else {
                i9 = c5054q.f40766b;
                i4 = c3203fP.f30698a + i9;
            }
        } else {
            int G7 = G();
            int d2 = this.f5311r.d(b9) + G7;
            if (c5054q.f40770f == -1) {
                int i13 = c5054q.f40766b;
                int i14 = i13 - c3203fP.f30698a;
                i10 = i13;
                i4 = d2;
                i = i14;
                i9 = G7;
            } else {
                int i15 = c5054q.f40766b;
                int i16 = c3203fP.f30698a + i15;
                i = i15;
                i4 = d2;
                i9 = G7;
                i10 = i16;
            }
        }
        AbstractC5019C.N(b9, i, i9, i10, i4);
        if (c5020d.f40576a.h() || c5020d.f40576a.k()) {
            c3203fP.f30700c = true;
        }
        c3203fP.f30701d = b9.hasFocusable();
    }

    public final void V0(BP bp, C5054q c5054q) {
        if (!c5054q.f40765a || c5054q.f40775l) {
            return;
        }
        int i = c5054q.f40771g;
        int i4 = c5054q.i;
        if (c5054q.f40770f == -1) {
            int v6 = v();
            if (i < 0) {
                return;
            }
            int f6 = (this.f5311r.f() - i) + i4;
            if (this.f5314u) {
                for (int i9 = 0; i9 < v6; i9++) {
                    View u7 = u(i9);
                    if (this.f5311r.e(u7) < f6 || this.f5311r.n(u7) < f6) {
                        W0(bp, 0, i9);
                        return;
                    }
                }
                return;
            }
            int i10 = v6 - 1;
            for (int i11 = i10; i11 >= 0; i11--) {
                View u9 = u(i11);
                if (this.f5311r.e(u9) < f6 || this.f5311r.n(u9) < f6) {
                    W0(bp, i10, i11);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i12 = i - i4;
        int v9 = v();
        if (!this.f5314u) {
            for (int i13 = 0; i13 < v9; i13++) {
                View u10 = u(i13);
                if (this.f5311r.b(u10) > i12 || this.f5311r.m(u10) > i12) {
                    W0(bp, 0, i13);
                    return;
                }
            }
            return;
        }
        int i14 = v9 - 1;
        for (int i15 = i14; i15 >= 0; i15--) {
            View u11 = u(i15);
            if (this.f5311r.b(u11) > i12 || this.f5311r.m(u11) > i12) {
                W0(bp, i14, i15);
                return;
            }
        }
    }

    public final void W0(BP bp, int i, int i4) {
        if (i == i4) {
            return;
        }
        if (i4 <= i) {
            while (i > i4) {
                View u7 = u(i);
                j0(i);
                bp.f(u7);
                i--;
            }
            return;
        }
        for (int i9 = i4 - 1; i9 >= i; i9--) {
            View u9 = u(i9);
            j0(i9);
            bp.f(u9);
        }
    }

    public final void X0() {
        if (this.f5309p == 1 || !S0()) {
            this.f5314u = this.f5313t;
        } else {
            this.f5314u = !this.f5313t;
        }
    }

    public final int Y0(int i, BP bp, C5029M c5029m) {
        if (v() != 0 && i != 0) {
            G0();
            this.f5310q.f40765a = true;
            int i4 = i > 0 ? 1 : -1;
            int abs = Math.abs(i);
            b1(i4, abs, true, c5029m);
            C5054q c5054q = this.f5310q;
            int H02 = H0(bp, c5054q, c5029m, false) + c5054q.f40771g;
            if (H02 >= 0) {
                if (abs > H02) {
                    i = i4 * H02;
                }
                this.f5311r.o(-i);
                this.f5310q.f40773j = i;
                return i;
            }
        }
        return 0;
    }

    public final void Z0(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(CL.i(i, "invalid orientation:"));
        }
        c(null);
        if (i != this.f5309p || this.f5311r == null) {
            g a9 = g.a(this, i);
            this.f5311r = a9;
            this.f5305A.f34533f = a9;
            this.f5309p = i;
            l0();
        }
    }

    @Override // t0.InterfaceC5028L
    public final PointF a(int i) {
        if (v() == 0) {
            return null;
        }
        int i4 = (i < AbstractC5019C.H(u(0))) != this.f5314u ? -1 : 1;
        return this.f5309p == 0 ? new PointF(i4, 0.0f) : new PointF(0.0f, i4);
    }

    public void a1(boolean z8) {
        c(null);
        if (this.f5315v == z8) {
            return;
        }
        this.f5315v = z8;
        l0();
    }

    /* JADX WARN: Removed duplicated region for block: B:183:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0243  */
    @Override // t0.AbstractC5019C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b0(BP bp, C5029M c5029m) {
        View view;
        View view2;
        BP bp2;
        View N02;
        int i;
        int e6;
        int i4;
        int i9;
        List list;
        int i10;
        int i11;
        int O02;
        int i12;
        View q6;
        int e9;
        int i13;
        int i14;
        LinearLayoutManager linearLayoutManager = this;
        C5029M c5029m2 = c5029m;
        int i15 = -1;
        if (!(linearLayoutManager.f5319z == null && linearLayoutManager.f5317x == -1) && c5029m2.b() == 0) {
            g0(bp);
            return;
        }
        C5055r c5055r = linearLayoutManager.f5319z;
        if (c5055r != null && (i14 = c5055r.f40776n) >= 0) {
            linearLayoutManager.f5317x = i14;
        }
        linearLayoutManager.G0();
        linearLayoutManager.f5310q.f40765a = false;
        linearLayoutManager.X0();
        RecyclerView recyclerView = linearLayoutManager.f40563b;
        if (recyclerView == null || (view = recyclerView.getFocusedChild()) == null || ((ArrayList) linearLayoutManager.f40562a.f39327d).contains(view)) {
            view = null;
        }
        C3990u4 c3990u4 = linearLayoutManager.f5305A;
        if (c3990u4.f34531d && linearLayoutManager.f5317x == -1 && linearLayoutManager.f5319z == null) {
            if (view != null && (linearLayoutManager.f5311r.e(view) >= linearLayoutManager.f5311r.g() || linearLayoutManager.f5311r.b(view) <= linearLayoutManager.f5311r.k())) {
                c3990u4.c(AbstractC5019C.H(view), view);
            }
            bp2 = bp;
        } else {
            c3990u4.d();
            c3990u4.f34529b = linearLayoutManager.f5314u ^ linearLayoutManager.f5315v;
            if (!c5029m2.f40600g && (i = linearLayoutManager.f5317x) != -1) {
                if (i < 0 || i >= c5029m2.b()) {
                    linearLayoutManager.f5317x = -1;
                    linearLayoutManager.f5318y = Integer.MIN_VALUE;
                } else {
                    int i16 = linearLayoutManager.f5317x;
                    c3990u4.f34530c = i16;
                    C5055r c5055r2 = linearLayoutManager.f5319z;
                    if (c5055r2 != null && c5055r2.f40776n >= 0) {
                        boolean z8 = c5055r2.f40778v;
                        c3990u4.f34529b = z8;
                        if (z8) {
                            c3990u4.f34532e = linearLayoutManager.f5311r.g() - linearLayoutManager.f5319z.f40777u;
                        } else {
                            c3990u4.f34532e = linearLayoutManager.f5311r.k() + linearLayoutManager.f5319z.f40777u;
                        }
                    } else if (linearLayoutManager.f5318y == Integer.MIN_VALUE) {
                        View q9 = linearLayoutManager.q(i16);
                        if (q9 == null) {
                            if (linearLayoutManager.v() > 0) {
                                c3990u4.f34529b = (linearLayoutManager.f5317x < AbstractC5019C.H(linearLayoutManager.u(0))) == linearLayoutManager.f5314u;
                            }
                            c3990u4.a();
                        } else if (linearLayoutManager.f5311r.c(q9) > linearLayoutManager.f5311r.l()) {
                            c3990u4.a();
                        } else if (linearLayoutManager.f5311r.e(q9) - linearLayoutManager.f5311r.k() < 0) {
                            c3990u4.f34532e = linearLayoutManager.f5311r.k();
                            c3990u4.f34529b = false;
                        } else if (linearLayoutManager.f5311r.g() - linearLayoutManager.f5311r.b(q9) < 0) {
                            c3990u4.f34532e = linearLayoutManager.f5311r.g();
                            c3990u4.f34529b = true;
                        } else {
                            if (c3990u4.f34529b) {
                                int b9 = linearLayoutManager.f5311r.b(q9);
                                g gVar = linearLayoutManager.f5311r;
                                e6 = (Integer.MIN_VALUE == gVar.f4883a ? 0 : gVar.l() - gVar.f4883a) + b9;
                            } else {
                                e6 = linearLayoutManager.f5311r.e(q9);
                            }
                            c3990u4.f34532e = e6;
                        }
                    } else {
                        boolean z9 = linearLayoutManager.f5314u;
                        c3990u4.f34529b = z9;
                        if (z9) {
                            c3990u4.f34532e = linearLayoutManager.f5311r.g() - linearLayoutManager.f5318y;
                        } else {
                            c3990u4.f34532e = linearLayoutManager.f5311r.k() + linearLayoutManager.f5318y;
                        }
                    }
                    bp2 = bp;
                    c3990u4.f34531d = true;
                }
            }
            if (linearLayoutManager.v() != 0) {
                RecyclerView recyclerView2 = linearLayoutManager.f40563b;
                if (recyclerView2 == null || (view2 = recyclerView2.getFocusedChild()) == null || ((ArrayList) linearLayoutManager.f40562a.f39327d).contains(view2)) {
                    view2 = null;
                }
                if (view2 != null) {
                    C5020D c5020d = (C5020D) view2.getLayoutParams();
                    if (!c5020d.f40576a.h() && c5020d.f40576a.b() >= 0 && c5020d.f40576a.b() < c5029m2.b()) {
                        c3990u4.c(AbstractC5019C.H(view2), view2);
                        bp2 = bp;
                        c3990u4.f34531d = true;
                    }
                }
                if (linearLayoutManager.f5312s == linearLayoutManager.f5315v) {
                    if (c3990u4.f34529b) {
                        if (linearLayoutManager.f5314u) {
                            N02 = linearLayoutManager.N0(bp, c5029m2, 0, linearLayoutManager.v(), c5029m2.b());
                        } else {
                            linearLayoutManager = this;
                            N02 = linearLayoutManager.N0(bp, c5029m, v() - 1, -1, c5029m.b());
                            bp2 = bp;
                            c5029m2 = c5029m;
                            if (N02 != null) {
                                c3990u4.b(AbstractC5019C.H(N02), N02);
                                if (!c5029m2.f40600g && linearLayoutManager.z0() && (linearLayoutManager.f5311r.e(N02) >= linearLayoutManager.f5311r.g() || linearLayoutManager.f5311r.b(N02) < linearLayoutManager.f5311r.k())) {
                                    c3990u4.f34532e = c3990u4.f34529b ? linearLayoutManager.f5311r.g() : linearLayoutManager.f5311r.k();
                                }
                                c3990u4.f34531d = true;
                            }
                            c3990u4.a();
                            c3990u4.f34530c = !linearLayoutManager.f5315v ? c5029m2.b() - 1 : 0;
                            c3990u4.f34531d = true;
                        }
                    } else if (linearLayoutManager.f5314u) {
                        N02 = linearLayoutManager.N0(bp, c5029m, linearLayoutManager.v() - 1, -1, c5029m.b());
                    } else {
                        linearLayoutManager = this;
                        bp2 = bp;
                        c5029m2 = c5029m;
                        N02 = linearLayoutManager.N0(bp2, c5029m2, 0, v(), c5029m.b());
                        if (N02 != null) {
                        }
                        c3990u4.a();
                        c3990u4.f34530c = !linearLayoutManager.f5315v ? c5029m2.b() - 1 : 0;
                        c3990u4.f34531d = true;
                    }
                    linearLayoutManager = this;
                    bp2 = bp;
                    c5029m2 = c5029m;
                    if (N02 != null) {
                    }
                    c3990u4.a();
                    c3990u4.f34530c = !linearLayoutManager.f5315v ? c5029m2.b() - 1 : 0;
                    c3990u4.f34531d = true;
                }
            }
            bp2 = bp;
            c3990u4.a();
            c3990u4.f34530c = !linearLayoutManager.f5315v ? c5029m2.b() - 1 : 0;
            c3990u4.f34531d = true;
        }
        C5054q c5054q = linearLayoutManager.f5310q;
        c5054q.f40770f = c5054q.f40773j >= 0 ? 1 : -1;
        int[] iArr = linearLayoutManager.f5308D;
        iArr[0] = 0;
        iArr[1] = 0;
        linearLayoutManager.A0(c5029m2, iArr);
        int k6 = linearLayoutManager.f5311r.k() + Math.max(0, iArr[0]);
        int h9 = linearLayoutManager.f5311r.h() + Math.max(0, iArr[1]);
        if (c5029m2.f40600g && (i12 = linearLayoutManager.f5317x) != -1 && linearLayoutManager.f5318y != Integer.MIN_VALUE && (q6 = linearLayoutManager.q(i12)) != null) {
            if (linearLayoutManager.f5314u) {
                i13 = linearLayoutManager.f5311r.g() - linearLayoutManager.f5311r.b(q6);
                e9 = linearLayoutManager.f5318y;
            } else {
                e9 = linearLayoutManager.f5311r.e(q6) - linearLayoutManager.f5311r.k();
                i13 = linearLayoutManager.f5318y;
            }
            int i17 = i13 - e9;
            if (i17 > 0) {
                k6 += i17;
            } else {
                h9 -= i17;
            }
        }
        if (!c3990u4.f34529b ? !linearLayoutManager.f5314u : linearLayoutManager.f5314u) {
            i15 = 1;
        }
        linearLayoutManager.U0(bp2, c5029m2, c3990u4, i15);
        p(bp);
        linearLayoutManager.f5310q.f40775l = linearLayoutManager.f5311r.i() == 0 && linearLayoutManager.f5311r.f() == 0;
        linearLayoutManager.f5310q.getClass();
        linearLayoutManager.f5310q.i = 0;
        if (c3990u4.f34529b) {
            linearLayoutManager.d1(c3990u4.f34530c, c3990u4.f34532e);
            C5054q c5054q2 = linearLayoutManager.f5310q;
            c5054q2.f40772h = k6;
            linearLayoutManager.H0(bp2, c5054q2, c5029m2, false);
            C5054q c5054q3 = linearLayoutManager.f5310q;
            i9 = c5054q3.f40766b;
            int i18 = c5054q3.f40768d;
            int i19 = c5054q3.f40767c;
            if (i19 > 0) {
                h9 += i19;
            }
            linearLayoutManager.c1(c3990u4.f34530c, c3990u4.f34532e);
            C5054q c5054q4 = linearLayoutManager.f5310q;
            c5054q4.f40772h = h9;
            c5054q4.f40768d += c5054q4.f40769e;
            linearLayoutManager.H0(bp2, c5054q4, c5029m2, false);
            C5054q c5054q5 = linearLayoutManager.f5310q;
            i4 = c5054q5.f40766b;
            int i20 = c5054q5.f40767c;
            if (i20 > 0) {
                linearLayoutManager.d1(i18, i9);
                C5054q c5054q6 = linearLayoutManager.f5310q;
                c5054q6.f40772h = i20;
                linearLayoutManager.H0(bp2, c5054q6, c5029m2, false);
                i9 = linearLayoutManager.f5310q.f40766b;
            }
        } else {
            linearLayoutManager.c1(c3990u4.f34530c, c3990u4.f34532e);
            C5054q c5054q7 = linearLayoutManager.f5310q;
            c5054q7.f40772h = h9;
            linearLayoutManager.H0(bp2, c5054q7, c5029m2, false);
            C5054q c5054q8 = linearLayoutManager.f5310q;
            i4 = c5054q8.f40766b;
            int i21 = c5054q8.f40768d;
            int i22 = c5054q8.f40767c;
            if (i22 > 0) {
                k6 += i22;
            }
            linearLayoutManager.d1(c3990u4.f34530c, c3990u4.f34532e);
            C5054q c5054q9 = linearLayoutManager.f5310q;
            c5054q9.f40772h = k6;
            c5054q9.f40768d += c5054q9.f40769e;
            linearLayoutManager.H0(bp2, c5054q9, c5029m2, false);
            C5054q c5054q10 = linearLayoutManager.f5310q;
            i9 = c5054q10.f40766b;
            int i23 = c5054q10.f40767c;
            if (i23 > 0) {
                linearLayoutManager.c1(i21, i4);
                C5054q c5054q11 = linearLayoutManager.f5310q;
                c5054q11.f40772h = i23;
                linearLayoutManager.H0(bp2, c5054q11, c5029m2, false);
                i4 = linearLayoutManager.f5310q.f40766b;
            }
        }
        if (linearLayoutManager.v() > 0) {
            if (linearLayoutManager.f5314u ^ linearLayoutManager.f5315v) {
                int O03 = linearLayoutManager.O0(i4, bp2, c5029m2, true);
                i10 = i9 + O03;
                i11 = i4 + O03;
                O02 = linearLayoutManager.P0(i10, bp2, c5029m2, false);
            } else {
                int P02 = linearLayoutManager.P0(i9, bp2, c5029m2, true);
                i10 = i9 + P02;
                i11 = i4 + P02;
                O02 = linearLayoutManager.O0(i11, bp2, c5029m2, false);
            }
            i9 = i10 + O02;
            i4 = i11 + O02;
        }
        if (c5029m2.f40603k && linearLayoutManager.v() != 0 && !c5029m2.f40600g && linearLayoutManager.z0()) {
            List list2 = (List) bp2.f24040f;
            int size = list2.size();
            int H6 = AbstractC5019C.H(linearLayoutManager.u(0));
            int i24 = 0;
            int i25 = 0;
            for (int i26 = 0; i26 < size; i26++) {
                AbstractC5032P abstractC5032P = (AbstractC5032P) list2.get(i26);
                if (!abstractC5032P.h()) {
                    boolean z10 = abstractC5032P.b() < H6;
                    boolean z11 = linearLayoutManager.f5314u;
                    View view3 = abstractC5032P.f40615a;
                    if (z10 != z11) {
                        i24 += linearLayoutManager.f5311r.c(view3);
                    } else {
                        i25 += linearLayoutManager.f5311r.c(view3);
                    }
                }
            }
            linearLayoutManager.f5310q.f40774k = list2;
            if (i24 > 0) {
                linearLayoutManager.d1(AbstractC5019C.H(linearLayoutManager.R0()), i9);
                C5054q c5054q12 = linearLayoutManager.f5310q;
                c5054q12.f40772h = i24;
                c5054q12.f40767c = 0;
                c5054q12.a(null);
                linearLayoutManager.H0(bp2, linearLayoutManager.f5310q, c5029m2, false);
            }
            if (i25 > 0) {
                linearLayoutManager.c1(AbstractC5019C.H(linearLayoutManager.Q0()), i4);
                C5054q c5054q13 = linearLayoutManager.f5310q;
                c5054q13.f40772h = i25;
                c5054q13.f40767c = 0;
                list = null;
                c5054q13.a(null);
                linearLayoutManager.H0(bp2, linearLayoutManager.f5310q, c5029m2, false);
            } else {
                list = null;
            }
            linearLayoutManager.f5310q.f40774k = list;
        }
        if (c5029m2.f40600g) {
            c3990u4.d();
        } else {
            g gVar2 = linearLayoutManager.f5311r;
            gVar2.f4883a = gVar2.l();
        }
        linearLayoutManager.f5312s = linearLayoutManager.f5315v;
    }

    public final void b1(int i, int i4, boolean z8, C5029M c5029m) {
        int k6;
        this.f5310q.f40775l = this.f5311r.i() == 0 && this.f5311r.f() == 0;
        this.f5310q.f40770f = i;
        int[] iArr = this.f5308D;
        iArr[0] = 0;
        iArr[1] = 0;
        A0(c5029m, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        boolean z9 = i == 1;
        C5054q c5054q = this.f5310q;
        int i9 = z9 ? max2 : max;
        c5054q.f40772h = i9;
        if (!z9) {
            max = max2;
        }
        c5054q.i = max;
        if (z9) {
            c5054q.f40772h = this.f5311r.h() + i9;
            View Q02 = Q0();
            C5054q c5054q2 = this.f5310q;
            c5054q2.f40769e = this.f5314u ? -1 : 1;
            int H6 = AbstractC5019C.H(Q02);
            C5054q c5054q3 = this.f5310q;
            c5054q2.f40768d = H6 + c5054q3.f40769e;
            c5054q3.f40766b = this.f5311r.b(Q02);
            k6 = this.f5311r.b(Q02) - this.f5311r.g();
        } else {
            View R02 = R0();
            C5054q c5054q4 = this.f5310q;
            c5054q4.f40772h = this.f5311r.k() + c5054q4.f40772h;
            C5054q c5054q5 = this.f5310q;
            c5054q5.f40769e = this.f5314u ? 1 : -1;
            int H8 = AbstractC5019C.H(R02);
            C5054q c5054q6 = this.f5310q;
            c5054q5.f40768d = H8 + c5054q6.f40769e;
            c5054q6.f40766b = this.f5311r.e(R02);
            k6 = (-this.f5311r.e(R02)) + this.f5311r.k();
        }
        C5054q c5054q7 = this.f5310q;
        c5054q7.f40767c = i4;
        if (z8) {
            c5054q7.f40767c = i4 - k6;
        }
        c5054q7.f40771g = k6;
    }

    @Override // t0.AbstractC5019C
    public final void c(String str) {
        if (this.f5319z == null) {
            super.c(str);
        }
    }

    @Override // t0.AbstractC5019C
    public void c0(C5029M c5029m) {
        this.f5319z = null;
        this.f5317x = -1;
        this.f5318y = Integer.MIN_VALUE;
        this.f5305A.d();
    }

    public final void c1(int i, int i4) {
        this.f5310q.f40767c = this.f5311r.g() - i4;
        C5054q c5054q = this.f5310q;
        c5054q.f40769e = this.f5314u ? -1 : 1;
        c5054q.f40768d = i;
        c5054q.f40770f = 1;
        c5054q.f40766b = i4;
        c5054q.f40771g = Integer.MIN_VALUE;
    }

    @Override // t0.AbstractC5019C
    public final boolean d() {
        return this.f5309p == 0;
    }

    @Override // t0.AbstractC5019C
    public final void d0(Parcelable parcelable) {
        if (parcelable instanceof C5055r) {
            this.f5319z = (C5055r) parcelable;
            l0();
        }
    }

    public final void d1(int i, int i4) {
        this.f5310q.f40767c = i4 - this.f5311r.k();
        C5054q c5054q = this.f5310q;
        c5054q.f40768d = i;
        c5054q.f40769e = this.f5314u ? 1 : -1;
        c5054q.f40770f = -1;
        c5054q.f40766b = i4;
        c5054q.f40771g = Integer.MIN_VALUE;
    }

    @Override // t0.AbstractC5019C
    public final boolean e() {
        return this.f5309p == 1;
    }

    @Override // t0.AbstractC5019C
    public final Parcelable e0() {
        C5055r c5055r = this.f5319z;
        if (c5055r != null) {
            C5055r c5055r2 = new C5055r();
            c5055r2.f40776n = c5055r.f40776n;
            c5055r2.f40777u = c5055r.f40777u;
            c5055r2.f40778v = c5055r.f40778v;
            return c5055r2;
        }
        C5055r c5055r3 = new C5055r();
        if (v() <= 0) {
            c5055r3.f40776n = -1;
            return c5055r3;
        }
        G0();
        boolean z8 = this.f5312s ^ this.f5314u;
        c5055r3.f40778v = z8;
        if (z8) {
            View Q02 = Q0();
            c5055r3.f40777u = this.f5311r.g() - this.f5311r.b(Q02);
            c5055r3.f40776n = AbstractC5019C.H(Q02);
            return c5055r3;
        }
        View R02 = R0();
        c5055r3.f40776n = AbstractC5019C.H(R02);
        c5055r3.f40777u = this.f5311r.e(R02) - this.f5311r.k();
        return c5055r3;
    }

    @Override // t0.AbstractC5019C
    public final void h(int i, int i4, C5029M c5029m, C2830Vl c2830Vl) {
        if (this.f5309p != 0) {
            i = i4;
        }
        if (v() == 0 || i == 0) {
            return;
        }
        G0();
        b1(i > 0 ? 1 : -1, Math.abs(i), true, c5029m);
        B0(c5029m, this.f5310q, c2830Vl);
    }

    @Override // t0.AbstractC5019C
    public final void i(int i, C2830Vl c2830Vl) {
        boolean z8;
        int i4;
        C5055r c5055r = this.f5319z;
        if (c5055r == null || (i4 = c5055r.f40776n) < 0) {
            X0();
            z8 = this.f5314u;
            i4 = this.f5317x;
            if (i4 == -1) {
                i4 = z8 ? i - 1 : 0;
            }
        } else {
            z8 = c5055r.f40778v;
        }
        int i9 = z8 ? -1 : 1;
        for (int i10 = 0; i10 < this.f5307C && i4 >= 0 && i4 < i; i10++) {
            c2830Vl.a(i4, 0);
            i4 += i9;
        }
    }

    @Override // t0.AbstractC5019C
    public final int j(C5029M c5029m) {
        return C0(c5029m);
    }

    @Override // t0.AbstractC5019C
    public int k(C5029M c5029m) {
        return D0(c5029m);
    }

    @Override // t0.AbstractC5019C
    public int l(C5029M c5029m) {
        return E0(c5029m);
    }

    @Override // t0.AbstractC5019C
    public final int m(C5029M c5029m) {
        return C0(c5029m);
    }

    @Override // t0.AbstractC5019C
    public int m0(int i, BP bp, C5029M c5029m) {
        if (this.f5309p == 1) {
            return 0;
        }
        return Y0(i, bp, c5029m);
    }

    @Override // t0.AbstractC5019C
    public int n(C5029M c5029m) {
        return D0(c5029m);
    }

    @Override // t0.AbstractC5019C
    public final void n0(int i) {
        this.f5317x = i;
        this.f5318y = Integer.MIN_VALUE;
        C5055r c5055r = this.f5319z;
        if (c5055r != null) {
            c5055r.f40776n = -1;
        }
        l0();
    }

    @Override // t0.AbstractC5019C
    public int o(C5029M c5029m) {
        return E0(c5029m);
    }

    @Override // t0.AbstractC5019C
    public int o0(int i, BP bp, C5029M c5029m) {
        if (this.f5309p == 0) {
            return 0;
        }
        return Y0(i, bp, c5029m);
    }

    @Override // t0.AbstractC5019C
    public final View q(int i) {
        int v6 = v();
        if (v6 == 0) {
            return null;
        }
        int H6 = i - AbstractC5019C.H(u(0));
        if (H6 >= 0 && H6 < v6) {
            View u7 = u(H6);
            if (AbstractC5019C.H(u7) == i) {
                return u7;
            }
        }
        return super.q(i);
    }

    @Override // t0.AbstractC5019C
    public C5020D r() {
        return new C5020D(-2, -2);
    }

    @Override // t0.AbstractC5019C
    public final boolean v0() {
        if (this.f40573m != 1073741824 && this.f40572l != 1073741824) {
            int v6 = v();
            for (int i = 0; i < v6; i++) {
                ViewGroup.LayoutParams layoutParams = u(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // t0.AbstractC5019C
    public void x0(RecyclerView recyclerView, int i) {
        C5056s c5056s = new C5056s(recyclerView.getContext());
        c5056s.f40779a = i;
        y0(c5056s);
    }

    @Override // t0.AbstractC5019C
    public boolean z0() {
        return this.f5319z == null && this.f5312s == this.f5315v;
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i4) {
        this.f5309p = 1;
        this.f5313t = false;
        this.f5314u = false;
        this.f5315v = false;
        this.f5316w = true;
        this.f5317x = -1;
        this.f5318y = Integer.MIN_VALUE;
        this.f5319z = null;
        this.f5305A = new C3990u4();
        this.f5306B = new C3203fP();
        this.f5307C = 2;
        this.f5308D = new int[2];
        C5018B I2 = AbstractC5019C.I(context, attributeSet, i, i4);
        Z0(I2.f40558a);
        boolean z8 = I2.f40560c;
        c(null);
        if (z8 != this.f5313t) {
            this.f5313t = z8;
            l0();
        }
        a1(I2.f40561d);
    }

    @Override // t0.AbstractC5019C
    public final void R(RecyclerView recyclerView) {
    }

    public void U0(BP bp, C5029M c5029m, C3990u4 c3990u4, int i) {
    }
}
