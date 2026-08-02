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
import com.google.android.gms.internal.ads.C2817Tl;
import com.google.android.gms.internal.ads.C3698oP;
import com.google.android.gms.internal.ads.C4108w4;
import com.google.android.gms.internal.ads.SO;
import com.google.android.gms.internal.ads.Wv;
import java.util.ArrayList;
import java.util.List;
import t0.AbstractC4987C;
import t0.AbstractC5000P;
import t0.C4986B;
import t0.C4988D;
import t0.C4997M;
import t0.C5020p;
import t0.C5021q;
import t0.C5022r;
import t0.InterfaceC4996L;

/* loaded from: classes.dex */
public class LinearLayoutManager extends AbstractC4987C implements InterfaceC4996L {

    /* renamed from: A, reason: collision with root package name */
    public final C4108w4 f5160A;

    /* renamed from: B, reason: collision with root package name */
    public final SO f5161B;

    /* renamed from: C, reason: collision with root package name */
    public final int f5162C;

    /* renamed from: D, reason: collision with root package name */
    public final int[] f5163D;

    /* renamed from: p, reason: collision with root package name */
    public int f5164p;

    /* renamed from: q, reason: collision with root package name */
    public C5020p f5165q;

    /* renamed from: r, reason: collision with root package name */
    public g f5166r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f5167s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f5168t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f5169u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f5170v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f5171w;

    /* renamed from: x, reason: collision with root package name */
    public int f5172x;

    /* renamed from: y, reason: collision with root package name */
    public int f5173y;

    /* renamed from: z, reason: collision with root package name */
    public C5021q f5174z;

    public LinearLayoutManager(int i) {
        this.f5164p = 1;
        this.f5168t = false;
        this.f5169u = false;
        this.f5170v = false;
        this.f5171w = true;
        this.f5172x = -1;
        this.f5173y = Integer.MIN_VALUE;
        this.f5174z = null;
        this.f5160A = new C4108w4();
        this.f5161B = new SO();
        this.f5162C = 2;
        this.f5163D = new int[2];
        Z0(i);
        c(null);
        if (this.f5168t) {
            this.f5168t = false;
            l0();
        }
    }

    public void A0(C4997M c4997m, int[] iArr) {
        int i;
        int l9 = c4997m.f40622a != -1 ? this.f5166r.l() : 0;
        if (this.f5165q.f40798f == -1) {
            i = 0;
        } else {
            i = l9;
            l9 = 0;
        }
        iArr[0] = l9;
        iArr[1] = i;
    }

    public void B0(C4997M c4997m, C5020p c5020p, C2817Tl c2817Tl) {
        int i = c5020p.f40796d;
        if (i < 0 || i >= c4997m.b()) {
            return;
        }
        c2817Tl.a(i, Math.max(0, c5020p.f40799g));
    }

    public final int C0(C4997M c4997m) {
        if (v() == 0) {
            return 0;
        }
        G0();
        g gVar = this.f5166r;
        boolean z6 = !this.f5171w;
        return h.a(c4997m, gVar, J0(z6), I0(z6), this, this.f5171w);
    }

    public final int D0(C4997M c4997m) {
        if (v() == 0) {
            return 0;
        }
        G0();
        g gVar = this.f5166r;
        boolean z6 = !this.f5171w;
        return h.b(c4997m, gVar, J0(z6), I0(z6), this, this.f5171w, this.f5169u);
    }

    public final int E0(C4997M c4997m) {
        if (v() == 0) {
            return 0;
        }
        G0();
        g gVar = this.f5166r;
        boolean z6 = !this.f5171w;
        return h.c(c4997m, gVar, J0(z6), I0(z6), this, this.f5171w);
    }

    public final int F0(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.f5164p == 1) ? 1 : Integer.MIN_VALUE : this.f5164p == 0 ? 1 : Integer.MIN_VALUE : this.f5164p == 1 ? -1 : Integer.MIN_VALUE : this.f5164p == 0 ? -1 : Integer.MIN_VALUE : (this.f5164p != 1 && S0()) ? -1 : 1 : (this.f5164p != 1 && S0()) ? 1 : -1;
    }

    public final void G0() {
        if (this.f5165q == null) {
            C5020p c5020p = new C5020p();
            c5020p.f40793a = true;
            c5020p.f40800h = 0;
            c5020p.i = 0;
            c5020p.f40802k = null;
            this.f5165q = c5020p;
        }
    }

    public final int H0(C3698oP c3698oP, C5020p c5020p, C4997M c4997m, boolean z6) {
        int i;
        int i4 = c5020p.f40795c;
        int i6 = c5020p.f40799g;
        if (i6 != Integer.MIN_VALUE) {
            if (i4 < 0) {
                c5020p.f40799g = i6 + i4;
            }
            V0(c3698oP, c5020p);
        }
        int i9 = c5020p.f40795c + c5020p.f40800h;
        while (true) {
            if ((!c5020p.f40803l && i9 <= 0) || (i = c5020p.f40796d) < 0 || i >= c4997m.b()) {
                break;
            }
            SO so = this.f5161B;
            so.f28191a = 0;
            so.f28192b = false;
            so.f28193c = false;
            so.f28194d = false;
            T0(c3698oP, c4997m, c5020p, so);
            if (!so.f28192b) {
                int i10 = c5020p.f40794b;
                int i11 = so.f28191a;
                c5020p.f40794b = (c5020p.f40798f * i11) + i10;
                if (!so.f28193c || c5020p.f40802k != null || !c4997m.f40628g) {
                    c5020p.f40795c -= i11;
                    i9 -= i11;
                }
                int i12 = c5020p.f40799g;
                if (i12 != Integer.MIN_VALUE) {
                    int i13 = i12 + i11;
                    c5020p.f40799g = i13;
                    int i14 = c5020p.f40795c;
                    if (i14 < 0) {
                        c5020p.f40799g = i13 + i14;
                    }
                    V0(c3698oP, c5020p);
                }
                if (z6 && so.f28194d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i4 - c5020p.f40795c;
    }

    public final View I0(boolean z6) {
        return this.f5169u ? M0(0, v(), z6) : M0(v() - 1, -1, z6);
    }

    public final View J0(boolean z6) {
        return this.f5169u ? M0(v() - 1, -1, z6) : M0(0, v(), z6);
    }

    public final int K0() {
        View M02 = M0(v() - 1, -1, false);
        if (M02 == null) {
            return -1;
        }
        return AbstractC4987C.H(M02);
    }

    @Override // t0.AbstractC4987C
    public final boolean L() {
        return true;
    }

    public final View L0(int i, int i4) {
        int i6;
        int i9;
        G0();
        if (i4 <= i && i4 >= i) {
            return u(i);
        }
        if (this.f5166r.e(u(i)) < this.f5166r.k()) {
            i6 = 16644;
            i9 = 16388;
        } else {
            i6 = 4161;
            i9 = 4097;
        }
        return this.f5164p == 0 ? this.f40592c.a(i, i4, i6, i9) : this.f40593d.a(i, i4, i6, i9);
    }

    public final View M0(int i, int i4, boolean z6) {
        G0();
        int i6 = z6 ? 24579 : 320;
        return this.f5164p == 0 ? this.f40592c.a(i, i4, i6, 320) : this.f40593d.a(i, i4, i6, 320);
    }

    public View N0(C3698oP c3698oP, C4997M c4997m, int i, int i4, int i6) {
        G0();
        int k9 = this.f5166r.k();
        int g9 = this.f5166r.g();
        int i9 = i4 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i4) {
            View u6 = u(i);
            int H8 = AbstractC4987C.H(u6);
            if (H8 >= 0 && H8 < i6) {
                if (((C4988D) u6.getLayoutParams()).f40604a.h()) {
                    if (view2 == null) {
                        view2 = u6;
                    }
                } else {
                    if (this.f5166r.e(u6) < g9 && this.f5166r.b(u6) >= k9) {
                        return u6;
                    }
                    if (view == null) {
                        view = u6;
                    }
                }
            }
            i += i9;
        }
        return view != null ? view : view2;
    }

    public final int O0(int i, C3698oP c3698oP, C4997M c4997m, boolean z6) {
        int g9;
        int g10 = this.f5166r.g() - i;
        if (g10 <= 0) {
            return 0;
        }
        int i4 = -Y0(-g10, c3698oP, c4997m);
        int i6 = i + i4;
        if (!z6 || (g9 = this.f5166r.g() - i6) <= 0) {
            return i4;
        }
        this.f5166r.o(g9);
        return g9 + i4;
    }

    public final int P0(int i, C3698oP c3698oP, C4997M c4997m, boolean z6) {
        int k9;
        int k10 = i - this.f5166r.k();
        if (k10 <= 0) {
            return 0;
        }
        int i4 = -Y0(k10, c3698oP, c4997m);
        int i6 = i + i4;
        if (!z6 || (k9 = i6 - this.f5166r.k()) <= 0) {
            return i4;
        }
        this.f5166r.o(-k9);
        return i4 - k9;
    }

    public final View Q0() {
        return u(this.f5169u ? 0 : v() - 1);
    }

    public final View R0() {
        return u(this.f5169u ? v() - 1 : 0);
    }

    @Override // t0.AbstractC4987C
    public View S(View view, int i, C3698oP c3698oP, C4997M c4997m) {
        int F02;
        X0();
        if (v() != 0 && (F02 = F0(i)) != Integer.MIN_VALUE) {
            G0();
            b1(F02, (int) (this.f5166r.l() * 0.33333334f), false, c4997m);
            C5020p c5020p = this.f5165q;
            c5020p.f40799g = Integer.MIN_VALUE;
            c5020p.f40793a = false;
            H0(c3698oP, c5020p, c4997m, true);
            View L02 = F02 == -1 ? this.f5169u ? L0(v() - 1, -1) : L0(0, v()) : this.f5169u ? L0(0, v()) : L0(v() - 1, -1);
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

    @Override // t0.AbstractC4987C
    public final void T(AccessibilityEvent accessibilityEvent) {
        super.T(accessibilityEvent);
        if (v() > 0) {
            View M02 = M0(0, v(), false);
            accessibilityEvent.setFromIndex(M02 == null ? -1 : AbstractC4987C.H(M02));
            accessibilityEvent.setToIndex(K0());
        }
    }

    public void T0(C3698oP c3698oP, C4997M c4997m, C5020p c5020p, SO so) {
        int i;
        int i4;
        int i6;
        int i9;
        View b9 = c5020p.b(c3698oP);
        if (b9 == null) {
            so.f28192b = true;
            return;
        }
        C4988D c4988d = (C4988D) b9.getLayoutParams();
        if (c5020p.f40802k == null) {
            if (this.f5169u == (c5020p.f40798f == -1)) {
                b(b9, -1, false);
            } else {
                b(b9, 0, false);
            }
        } else {
            if (this.f5169u == (c5020p.f40798f == -1)) {
                b(b9, -1, true);
            } else {
                b(b9, 0, true);
            }
        }
        C4988D c4988d2 = (C4988D) b9.getLayoutParams();
        Rect J = this.f40591b.J(b9);
        int i10 = J.left + J.right;
        int i11 = J.top + J.bottom;
        int w3 = AbstractC4987C.w(this.f40602n, this.f40600l, F() + E() + ((ViewGroup.MarginLayoutParams) c4988d2).leftMargin + ((ViewGroup.MarginLayoutParams) c4988d2).rightMargin + i10, ((ViewGroup.MarginLayoutParams) c4988d2).width, d());
        int w6 = AbstractC4987C.w(this.f40603o, this.f40601m, D() + G() + ((ViewGroup.MarginLayoutParams) c4988d2).topMargin + ((ViewGroup.MarginLayoutParams) c4988d2).bottomMargin + i11, ((ViewGroup.MarginLayoutParams) c4988d2).height, e());
        if (u0(b9, w3, w6, c4988d2)) {
            b9.measure(w3, w6);
        }
        so.f28191a = this.f5166r.c(b9);
        if (this.f5164p == 1) {
            if (S0()) {
                i9 = this.f40602n - F();
                i = i9 - this.f5166r.d(b9);
            } else {
                i = E();
                i9 = this.f5166r.d(b9) + i;
            }
            if (c5020p.f40798f == -1) {
                i4 = c5020p.f40794b;
                i6 = i4 - so.f28191a;
            } else {
                i6 = c5020p.f40794b;
                i4 = so.f28191a + i6;
            }
        } else {
            int G2 = G();
            int d9 = this.f5166r.d(b9) + G2;
            if (c5020p.f40798f == -1) {
                int i12 = c5020p.f40794b;
                int i13 = i12 - so.f28191a;
                i9 = i12;
                i4 = d9;
                i = i13;
                i6 = G2;
            } else {
                int i14 = c5020p.f40794b;
                int i15 = so.f28191a + i14;
                i = i14;
                i4 = d9;
                i6 = G2;
                i9 = i15;
            }
        }
        AbstractC4987C.N(b9, i, i6, i9, i4);
        if (c4988d.f40604a.h() || c4988d.f40604a.k()) {
            so.f28193c = true;
        }
        so.f28194d = b9.hasFocusable();
    }

    public final void V0(C3698oP c3698oP, C5020p c5020p) {
        if (!c5020p.f40793a || c5020p.f40803l) {
            return;
        }
        int i = c5020p.f40799g;
        int i4 = c5020p.i;
        if (c5020p.f40798f == -1) {
            int v9 = v();
            if (i < 0) {
                return;
            }
            int f2 = (this.f5166r.f() - i) + i4;
            if (this.f5169u) {
                for (int i6 = 0; i6 < v9; i6++) {
                    View u6 = u(i6);
                    if (this.f5166r.e(u6) < f2 || this.f5166r.n(u6) < f2) {
                        W0(c3698oP, 0, i6);
                        return;
                    }
                }
                return;
            }
            int i9 = v9 - 1;
            for (int i10 = i9; i10 >= 0; i10--) {
                View u9 = u(i10);
                if (this.f5166r.e(u9) < f2 || this.f5166r.n(u9) < f2) {
                    W0(c3698oP, i9, i10);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i11 = i - i4;
        int v10 = v();
        if (!this.f5169u) {
            for (int i12 = 0; i12 < v10; i12++) {
                View u10 = u(i12);
                if (this.f5166r.b(u10) > i11 || this.f5166r.m(u10) > i11) {
                    W0(c3698oP, 0, i12);
                    return;
                }
            }
            return;
        }
        int i13 = v10 - 1;
        for (int i14 = i13; i14 >= 0; i14--) {
            View u11 = u(i14);
            if (this.f5166r.b(u11) > i11 || this.f5166r.m(u11) > i11) {
                W0(c3698oP, i13, i14);
                return;
            }
        }
    }

    public final void W0(C3698oP c3698oP, int i, int i4) {
        if (i == i4) {
            return;
        }
        if (i4 <= i) {
            while (i > i4) {
                View u6 = u(i);
                j0(i);
                c3698oP.f(u6);
                i--;
            }
            return;
        }
        for (int i6 = i4 - 1; i6 >= i; i6--) {
            View u9 = u(i6);
            j0(i6);
            c3698oP.f(u9);
        }
    }

    public final void X0() {
        if (this.f5164p == 1 || !S0()) {
            this.f5169u = this.f5168t;
        } else {
            this.f5169u = !this.f5168t;
        }
    }

    public final int Y0(int i, C3698oP c3698oP, C4997M c4997m) {
        if (v() != 0 && i != 0) {
            G0();
            this.f5165q.f40793a = true;
            int i4 = i > 0 ? 1 : -1;
            int abs = Math.abs(i);
            b1(i4, abs, true, c4997m);
            C5020p c5020p = this.f5165q;
            int H02 = H0(c3698oP, c5020p, c4997m, false) + c5020p.f40799g;
            if (H02 >= 0) {
                if (abs > H02) {
                    i = i4 * H02;
                }
                this.f5166r.o(-i);
                this.f5165q.f40801j = i;
                return i;
            }
        }
        return 0;
    }

    public final void Z0(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(Wv.f(i, "invalid orientation:"));
        }
        c(null);
        if (i != this.f5164p || this.f5166r == null) {
            g a9 = g.a(this, i);
            this.f5166r = a9;
            this.f5160A.f35568f = a9;
            this.f5164p = i;
            l0();
        }
    }

    @Override // t0.InterfaceC4996L
    public final PointF a(int i) {
        if (v() == 0) {
            return null;
        }
        int i4 = (i < AbstractC4987C.H(u(0))) != this.f5169u ? -1 : 1;
        return this.f5164p == 0 ? new PointF(i4, 0.0f) : new PointF(0.0f, i4);
    }

    public void a1(boolean z6) {
        c(null);
        if (this.f5170v == z6) {
            return;
        }
        this.f5170v = z6;
        l0();
    }

    /* JADX WARN: Removed duplicated region for block: B:183:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0243  */
    @Override // t0.AbstractC4987C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b0(C3698oP c3698oP, C4997M c4997m) {
        View view;
        View view2;
        C3698oP c3698oP2;
        View N02;
        int i;
        int e9;
        int i4;
        int i6;
        List list;
        int i9;
        int i10;
        int O02;
        int i11;
        View q8;
        int e10;
        int i12;
        int i13;
        LinearLayoutManager linearLayoutManager = this;
        C4997M c4997m2 = c4997m;
        int i14 = -1;
        if (!(linearLayoutManager.f5174z == null && linearLayoutManager.f5172x == -1) && c4997m2.b() == 0) {
            g0(c3698oP);
            return;
        }
        C5021q c5021q = linearLayoutManager.f5174z;
        if (c5021q != null && (i13 = c5021q.f40804n) >= 0) {
            linearLayoutManager.f5172x = i13;
        }
        linearLayoutManager.G0();
        linearLayoutManager.f5165q.f40793a = false;
        linearLayoutManager.X0();
        RecyclerView recyclerView = linearLayoutManager.f40591b;
        if (recyclerView == null || (view = recyclerView.getFocusedChild()) == null || ((ArrayList) linearLayoutManager.f40590a.f38918w).contains(view)) {
            view = null;
        }
        C4108w4 c4108w4 = linearLayoutManager.f5160A;
        if (c4108w4.f35566d && linearLayoutManager.f5172x == -1 && linearLayoutManager.f5174z == null) {
            if (view != null && (linearLayoutManager.f5166r.e(view) >= linearLayoutManager.f5166r.g() || linearLayoutManager.f5166r.b(view) <= linearLayoutManager.f5166r.k())) {
                c4108w4.c(AbstractC4987C.H(view), view);
            }
            c3698oP2 = c3698oP;
        } else {
            c4108w4.d();
            c4108w4.f35564b = linearLayoutManager.f5169u ^ linearLayoutManager.f5170v;
            if (!c4997m2.f40628g && (i = linearLayoutManager.f5172x) != -1) {
                if (i < 0 || i >= c4997m2.b()) {
                    linearLayoutManager.f5172x = -1;
                    linearLayoutManager.f5173y = Integer.MIN_VALUE;
                } else {
                    int i15 = linearLayoutManager.f5172x;
                    c4108w4.f35565c = i15;
                    C5021q c5021q2 = linearLayoutManager.f5174z;
                    if (c5021q2 != null && c5021q2.f40804n >= 0) {
                        boolean z6 = c5021q2.f40806v;
                        c4108w4.f35564b = z6;
                        if (z6) {
                            c4108w4.f35567e = linearLayoutManager.f5166r.g() - linearLayoutManager.f5174z.f40805u;
                        } else {
                            c4108w4.f35567e = linearLayoutManager.f5166r.k() + linearLayoutManager.f5174z.f40805u;
                        }
                    } else if (linearLayoutManager.f5173y == Integer.MIN_VALUE) {
                        View q9 = linearLayoutManager.q(i15);
                        if (q9 == null) {
                            if (linearLayoutManager.v() > 0) {
                                c4108w4.f35564b = (linearLayoutManager.f5172x < AbstractC4987C.H(linearLayoutManager.u(0))) == linearLayoutManager.f5169u;
                            }
                            c4108w4.a();
                        } else if (linearLayoutManager.f5166r.c(q9) > linearLayoutManager.f5166r.l()) {
                            c4108w4.a();
                        } else if (linearLayoutManager.f5166r.e(q9) - linearLayoutManager.f5166r.k() < 0) {
                            c4108w4.f35567e = linearLayoutManager.f5166r.k();
                            c4108w4.f35564b = false;
                        } else if (linearLayoutManager.f5166r.g() - linearLayoutManager.f5166r.b(q9) < 0) {
                            c4108w4.f35567e = linearLayoutManager.f5166r.g();
                            c4108w4.f35564b = true;
                        } else {
                            if (c4108w4.f35564b) {
                                int b9 = linearLayoutManager.f5166r.b(q9);
                                g gVar = linearLayoutManager.f5166r;
                                e9 = (Integer.MIN_VALUE == gVar.f4736a ? 0 : gVar.l() - gVar.f4736a) + b9;
                            } else {
                                e9 = linearLayoutManager.f5166r.e(q9);
                            }
                            c4108w4.f35567e = e9;
                        }
                    } else {
                        boolean z9 = linearLayoutManager.f5169u;
                        c4108w4.f35564b = z9;
                        if (z9) {
                            c4108w4.f35567e = linearLayoutManager.f5166r.g() - linearLayoutManager.f5173y;
                        } else {
                            c4108w4.f35567e = linearLayoutManager.f5166r.k() + linearLayoutManager.f5173y;
                        }
                    }
                    c3698oP2 = c3698oP;
                    c4108w4.f35566d = true;
                }
            }
            if (linearLayoutManager.v() != 0) {
                RecyclerView recyclerView2 = linearLayoutManager.f40591b;
                if (recyclerView2 == null || (view2 = recyclerView2.getFocusedChild()) == null || ((ArrayList) linearLayoutManager.f40590a.f38918w).contains(view2)) {
                    view2 = null;
                }
                if (view2 != null) {
                    C4988D c4988d = (C4988D) view2.getLayoutParams();
                    if (!c4988d.f40604a.h() && c4988d.f40604a.b() >= 0 && c4988d.f40604a.b() < c4997m2.b()) {
                        c4108w4.c(AbstractC4987C.H(view2), view2);
                        c3698oP2 = c3698oP;
                        c4108w4.f35566d = true;
                    }
                }
                if (linearLayoutManager.f5167s == linearLayoutManager.f5170v) {
                    if (c4108w4.f35564b) {
                        if (linearLayoutManager.f5169u) {
                            N02 = linearLayoutManager.N0(c3698oP, c4997m2, 0, linearLayoutManager.v(), c4997m2.b());
                        } else {
                            linearLayoutManager = this;
                            N02 = linearLayoutManager.N0(c3698oP, c4997m, v() - 1, -1, c4997m.b());
                            c3698oP2 = c3698oP;
                            c4997m2 = c4997m;
                            if (N02 != null) {
                                c4108w4.b(AbstractC4987C.H(N02), N02);
                                if (!c4997m2.f40628g && linearLayoutManager.z0() && (linearLayoutManager.f5166r.e(N02) >= linearLayoutManager.f5166r.g() || linearLayoutManager.f5166r.b(N02) < linearLayoutManager.f5166r.k())) {
                                    c4108w4.f35567e = c4108w4.f35564b ? linearLayoutManager.f5166r.g() : linearLayoutManager.f5166r.k();
                                }
                                c4108w4.f35566d = true;
                            }
                            c4108w4.a();
                            c4108w4.f35565c = !linearLayoutManager.f5170v ? c4997m2.b() - 1 : 0;
                            c4108w4.f35566d = true;
                        }
                    } else if (linearLayoutManager.f5169u) {
                        N02 = linearLayoutManager.N0(c3698oP, c4997m, linearLayoutManager.v() - 1, -1, c4997m.b());
                    } else {
                        linearLayoutManager = this;
                        c3698oP2 = c3698oP;
                        c4997m2 = c4997m;
                        N02 = linearLayoutManager.N0(c3698oP2, c4997m2, 0, v(), c4997m.b());
                        if (N02 != null) {
                        }
                        c4108w4.a();
                        c4108w4.f35565c = !linearLayoutManager.f5170v ? c4997m2.b() - 1 : 0;
                        c4108w4.f35566d = true;
                    }
                    linearLayoutManager = this;
                    c3698oP2 = c3698oP;
                    c4997m2 = c4997m;
                    if (N02 != null) {
                    }
                    c4108w4.a();
                    c4108w4.f35565c = !linearLayoutManager.f5170v ? c4997m2.b() - 1 : 0;
                    c4108w4.f35566d = true;
                }
            }
            c3698oP2 = c3698oP;
            c4108w4.a();
            c4108w4.f35565c = !linearLayoutManager.f5170v ? c4997m2.b() - 1 : 0;
            c4108w4.f35566d = true;
        }
        C5020p c5020p = linearLayoutManager.f5165q;
        c5020p.f40798f = c5020p.f40801j >= 0 ? 1 : -1;
        int[] iArr = linearLayoutManager.f5163D;
        iArr[0] = 0;
        iArr[1] = 0;
        linearLayoutManager.A0(c4997m2, iArr);
        int k9 = linearLayoutManager.f5166r.k() + Math.max(0, iArr[0]);
        int h3 = linearLayoutManager.f5166r.h() + Math.max(0, iArr[1]);
        if (c4997m2.f40628g && (i11 = linearLayoutManager.f5172x) != -1 && linearLayoutManager.f5173y != Integer.MIN_VALUE && (q8 = linearLayoutManager.q(i11)) != null) {
            if (linearLayoutManager.f5169u) {
                i12 = linearLayoutManager.f5166r.g() - linearLayoutManager.f5166r.b(q8);
                e10 = linearLayoutManager.f5173y;
            } else {
                e10 = linearLayoutManager.f5166r.e(q8) - linearLayoutManager.f5166r.k();
                i12 = linearLayoutManager.f5173y;
            }
            int i16 = i12 - e10;
            if (i16 > 0) {
                k9 += i16;
            } else {
                h3 -= i16;
            }
        }
        if (!c4108w4.f35564b ? !linearLayoutManager.f5169u : linearLayoutManager.f5169u) {
            i14 = 1;
        }
        linearLayoutManager.U0(c3698oP2, c4997m2, c4108w4, i14);
        p(c3698oP);
        linearLayoutManager.f5165q.f40803l = linearLayoutManager.f5166r.i() == 0 && linearLayoutManager.f5166r.f() == 0;
        linearLayoutManager.f5165q.getClass();
        linearLayoutManager.f5165q.i = 0;
        if (c4108w4.f35564b) {
            linearLayoutManager.d1(c4108w4.f35565c, c4108w4.f35567e);
            C5020p c5020p2 = linearLayoutManager.f5165q;
            c5020p2.f40800h = k9;
            linearLayoutManager.H0(c3698oP2, c5020p2, c4997m2, false);
            C5020p c5020p3 = linearLayoutManager.f5165q;
            i6 = c5020p3.f40794b;
            int i17 = c5020p3.f40796d;
            int i18 = c5020p3.f40795c;
            if (i18 > 0) {
                h3 += i18;
            }
            linearLayoutManager.c1(c4108w4.f35565c, c4108w4.f35567e);
            C5020p c5020p4 = linearLayoutManager.f5165q;
            c5020p4.f40800h = h3;
            c5020p4.f40796d += c5020p4.f40797e;
            linearLayoutManager.H0(c3698oP2, c5020p4, c4997m2, false);
            C5020p c5020p5 = linearLayoutManager.f5165q;
            i4 = c5020p5.f40794b;
            int i19 = c5020p5.f40795c;
            if (i19 > 0) {
                linearLayoutManager.d1(i17, i6);
                C5020p c5020p6 = linearLayoutManager.f5165q;
                c5020p6.f40800h = i19;
                linearLayoutManager.H0(c3698oP2, c5020p6, c4997m2, false);
                i6 = linearLayoutManager.f5165q.f40794b;
            }
        } else {
            linearLayoutManager.c1(c4108w4.f35565c, c4108w4.f35567e);
            C5020p c5020p7 = linearLayoutManager.f5165q;
            c5020p7.f40800h = h3;
            linearLayoutManager.H0(c3698oP2, c5020p7, c4997m2, false);
            C5020p c5020p8 = linearLayoutManager.f5165q;
            i4 = c5020p8.f40794b;
            int i20 = c5020p8.f40796d;
            int i21 = c5020p8.f40795c;
            if (i21 > 0) {
                k9 += i21;
            }
            linearLayoutManager.d1(c4108w4.f35565c, c4108w4.f35567e);
            C5020p c5020p9 = linearLayoutManager.f5165q;
            c5020p9.f40800h = k9;
            c5020p9.f40796d += c5020p9.f40797e;
            linearLayoutManager.H0(c3698oP2, c5020p9, c4997m2, false);
            C5020p c5020p10 = linearLayoutManager.f5165q;
            i6 = c5020p10.f40794b;
            int i22 = c5020p10.f40795c;
            if (i22 > 0) {
                linearLayoutManager.c1(i20, i4);
                C5020p c5020p11 = linearLayoutManager.f5165q;
                c5020p11.f40800h = i22;
                linearLayoutManager.H0(c3698oP2, c5020p11, c4997m2, false);
                i4 = linearLayoutManager.f5165q.f40794b;
            }
        }
        if (linearLayoutManager.v() > 0) {
            if (linearLayoutManager.f5169u ^ linearLayoutManager.f5170v) {
                int O03 = linearLayoutManager.O0(i4, c3698oP2, c4997m2, true);
                i9 = i6 + O03;
                i10 = i4 + O03;
                O02 = linearLayoutManager.P0(i9, c3698oP2, c4997m2, false);
            } else {
                int P02 = linearLayoutManager.P0(i6, c3698oP2, c4997m2, true);
                i9 = i6 + P02;
                i10 = i4 + P02;
                O02 = linearLayoutManager.O0(i10, c3698oP2, c4997m2, false);
            }
            i6 = i9 + O02;
            i4 = i10 + O02;
        }
        if (c4997m2.f40631k && linearLayoutManager.v() != 0 && !c4997m2.f40628g && linearLayoutManager.z0()) {
            List list2 = (List) c3698oP2.f33689f;
            int size = list2.size();
            int H8 = AbstractC4987C.H(linearLayoutManager.u(0));
            int i23 = 0;
            int i24 = 0;
            for (int i25 = 0; i25 < size; i25++) {
                AbstractC5000P abstractC5000P = (AbstractC5000P) list2.get(i25);
                if (!abstractC5000P.h()) {
                    boolean z10 = abstractC5000P.b() < H8;
                    boolean z11 = linearLayoutManager.f5169u;
                    View view3 = abstractC5000P.f40643a;
                    if (z10 != z11) {
                        i23 += linearLayoutManager.f5166r.c(view3);
                    } else {
                        i24 += linearLayoutManager.f5166r.c(view3);
                    }
                }
            }
            linearLayoutManager.f5165q.f40802k = list2;
            if (i23 > 0) {
                linearLayoutManager.d1(AbstractC4987C.H(linearLayoutManager.R0()), i6);
                C5020p c5020p12 = linearLayoutManager.f5165q;
                c5020p12.f40800h = i23;
                c5020p12.f40795c = 0;
                c5020p12.a(null);
                linearLayoutManager.H0(c3698oP2, linearLayoutManager.f5165q, c4997m2, false);
            }
            if (i24 > 0) {
                linearLayoutManager.c1(AbstractC4987C.H(linearLayoutManager.Q0()), i4);
                C5020p c5020p13 = linearLayoutManager.f5165q;
                c5020p13.f40800h = i24;
                c5020p13.f40795c = 0;
                list = null;
                c5020p13.a(null);
                linearLayoutManager.H0(c3698oP2, linearLayoutManager.f5165q, c4997m2, false);
            } else {
                list = null;
            }
            linearLayoutManager.f5165q.f40802k = list;
        }
        if (c4997m2.f40628g) {
            c4108w4.d();
        } else {
            g gVar2 = linearLayoutManager.f5166r;
            gVar2.f4736a = gVar2.l();
        }
        linearLayoutManager.f5167s = linearLayoutManager.f5170v;
    }

    public final void b1(int i, int i4, boolean z6, C4997M c4997m) {
        int k9;
        this.f5165q.f40803l = this.f5166r.i() == 0 && this.f5166r.f() == 0;
        this.f5165q.f40798f = i;
        int[] iArr = this.f5163D;
        iArr[0] = 0;
        iArr[1] = 0;
        A0(c4997m, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        boolean z9 = i == 1;
        C5020p c5020p = this.f5165q;
        int i6 = z9 ? max2 : max;
        c5020p.f40800h = i6;
        if (!z9) {
            max = max2;
        }
        c5020p.i = max;
        if (z9) {
            c5020p.f40800h = this.f5166r.h() + i6;
            View Q02 = Q0();
            C5020p c5020p2 = this.f5165q;
            c5020p2.f40797e = this.f5169u ? -1 : 1;
            int H8 = AbstractC4987C.H(Q02);
            C5020p c5020p3 = this.f5165q;
            c5020p2.f40796d = H8 + c5020p3.f40797e;
            c5020p3.f40794b = this.f5166r.b(Q02);
            k9 = this.f5166r.b(Q02) - this.f5166r.g();
        } else {
            View R02 = R0();
            C5020p c5020p4 = this.f5165q;
            c5020p4.f40800h = this.f5166r.k() + c5020p4.f40800h;
            C5020p c5020p5 = this.f5165q;
            c5020p5.f40797e = this.f5169u ? 1 : -1;
            int H9 = AbstractC4987C.H(R02);
            C5020p c5020p6 = this.f5165q;
            c5020p5.f40796d = H9 + c5020p6.f40797e;
            c5020p6.f40794b = this.f5166r.e(R02);
            k9 = (-this.f5166r.e(R02)) + this.f5166r.k();
        }
        C5020p c5020p7 = this.f5165q;
        c5020p7.f40795c = i4;
        if (z6) {
            c5020p7.f40795c = i4 - k9;
        }
        c5020p7.f40799g = k9;
    }

    @Override // t0.AbstractC4987C
    public final void c(String str) {
        if (this.f5174z == null) {
            super.c(str);
        }
    }

    @Override // t0.AbstractC4987C
    public void c0(C4997M c4997m) {
        this.f5174z = null;
        this.f5172x = -1;
        this.f5173y = Integer.MIN_VALUE;
        this.f5160A.d();
    }

    public final void c1(int i, int i4) {
        this.f5165q.f40795c = this.f5166r.g() - i4;
        C5020p c5020p = this.f5165q;
        c5020p.f40797e = this.f5169u ? -1 : 1;
        c5020p.f40796d = i;
        c5020p.f40798f = 1;
        c5020p.f40794b = i4;
        c5020p.f40799g = Integer.MIN_VALUE;
    }

    @Override // t0.AbstractC4987C
    public final boolean d() {
        return this.f5164p == 0;
    }

    @Override // t0.AbstractC4987C
    public final void d0(Parcelable parcelable) {
        if (parcelable instanceof C5021q) {
            this.f5174z = (C5021q) parcelable;
            l0();
        }
    }

    public final void d1(int i, int i4) {
        this.f5165q.f40795c = i4 - this.f5166r.k();
        C5020p c5020p = this.f5165q;
        c5020p.f40796d = i;
        c5020p.f40797e = this.f5169u ? 1 : -1;
        c5020p.f40798f = -1;
        c5020p.f40794b = i4;
        c5020p.f40799g = Integer.MIN_VALUE;
    }

    @Override // t0.AbstractC4987C
    public final boolean e() {
        return this.f5164p == 1;
    }

    @Override // t0.AbstractC4987C
    public final Parcelable e0() {
        C5021q c5021q = this.f5174z;
        if (c5021q != null) {
            C5021q c5021q2 = new C5021q();
            c5021q2.f40804n = c5021q.f40804n;
            c5021q2.f40805u = c5021q.f40805u;
            c5021q2.f40806v = c5021q.f40806v;
            return c5021q2;
        }
        C5021q c5021q3 = new C5021q();
        if (v() <= 0) {
            c5021q3.f40804n = -1;
            return c5021q3;
        }
        G0();
        boolean z6 = this.f5167s ^ this.f5169u;
        c5021q3.f40806v = z6;
        if (z6) {
            View Q02 = Q0();
            c5021q3.f40805u = this.f5166r.g() - this.f5166r.b(Q02);
            c5021q3.f40804n = AbstractC4987C.H(Q02);
            return c5021q3;
        }
        View R02 = R0();
        c5021q3.f40804n = AbstractC4987C.H(R02);
        c5021q3.f40805u = this.f5166r.e(R02) - this.f5166r.k();
        return c5021q3;
    }

    @Override // t0.AbstractC4987C
    public final void h(int i, int i4, C4997M c4997m, C2817Tl c2817Tl) {
        if (this.f5164p != 0) {
            i = i4;
        }
        if (v() == 0 || i == 0) {
            return;
        }
        G0();
        b1(i > 0 ? 1 : -1, Math.abs(i), true, c4997m);
        B0(c4997m, this.f5165q, c2817Tl);
    }

    @Override // t0.AbstractC4987C
    public final void i(int i, C2817Tl c2817Tl) {
        boolean z6;
        int i4;
        C5021q c5021q = this.f5174z;
        if (c5021q == null || (i4 = c5021q.f40804n) < 0) {
            X0();
            z6 = this.f5169u;
            i4 = this.f5172x;
            if (i4 == -1) {
                i4 = z6 ? i - 1 : 0;
            }
        } else {
            z6 = c5021q.f40806v;
        }
        int i6 = z6 ? -1 : 1;
        for (int i9 = 0; i9 < this.f5162C && i4 >= 0 && i4 < i; i9++) {
            c2817Tl.a(i4, 0);
            i4 += i6;
        }
    }

    @Override // t0.AbstractC4987C
    public final int j(C4997M c4997m) {
        return C0(c4997m);
    }

    @Override // t0.AbstractC4987C
    public int k(C4997M c4997m) {
        return D0(c4997m);
    }

    @Override // t0.AbstractC4987C
    public int l(C4997M c4997m) {
        return E0(c4997m);
    }

    @Override // t0.AbstractC4987C
    public final int m(C4997M c4997m) {
        return C0(c4997m);
    }

    @Override // t0.AbstractC4987C
    public int m0(int i, C3698oP c3698oP, C4997M c4997m) {
        if (this.f5164p == 1) {
            return 0;
        }
        return Y0(i, c3698oP, c4997m);
    }

    @Override // t0.AbstractC4987C
    public int n(C4997M c4997m) {
        return D0(c4997m);
    }

    @Override // t0.AbstractC4987C
    public final void n0(int i) {
        this.f5172x = i;
        this.f5173y = Integer.MIN_VALUE;
        C5021q c5021q = this.f5174z;
        if (c5021q != null) {
            c5021q.f40804n = -1;
        }
        l0();
    }

    @Override // t0.AbstractC4987C
    public int o(C4997M c4997m) {
        return E0(c4997m);
    }

    @Override // t0.AbstractC4987C
    public int o0(int i, C3698oP c3698oP, C4997M c4997m) {
        if (this.f5164p == 0) {
            return 0;
        }
        return Y0(i, c3698oP, c4997m);
    }

    @Override // t0.AbstractC4987C
    public final View q(int i) {
        int v9 = v();
        if (v9 == 0) {
            return null;
        }
        int H8 = i - AbstractC4987C.H(u(0));
        if (H8 >= 0 && H8 < v9) {
            View u6 = u(H8);
            if (AbstractC4987C.H(u6) == i) {
                return u6;
            }
        }
        return super.q(i);
    }

    @Override // t0.AbstractC4987C
    public C4988D r() {
        return new C4988D(-2, -2);
    }

    @Override // t0.AbstractC4987C
    public final boolean v0() {
        if (this.f40601m != 1073741824 && this.f40600l != 1073741824) {
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

    @Override // t0.AbstractC4987C
    public void x0(RecyclerView recyclerView, int i) {
        C5022r c5022r = new C5022r(recyclerView.getContext());
        c5022r.f40807a = i;
        y0(c5022r);
    }

    @Override // t0.AbstractC4987C
    public boolean z0() {
        return this.f5174z == null && this.f5167s == this.f5170v;
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i4) {
        this.f5164p = 1;
        this.f5168t = false;
        this.f5169u = false;
        this.f5170v = false;
        this.f5171w = true;
        this.f5172x = -1;
        this.f5173y = Integer.MIN_VALUE;
        this.f5174z = null;
        this.f5160A = new C4108w4();
        this.f5161B = new SO();
        this.f5162C = 2;
        this.f5163D = new int[2];
        C4986B I8 = AbstractC4987C.I(context, attributeSet, i, i4);
        Z0(I8.f40586a);
        boolean z6 = I8.f40588c;
        c(null);
        if (z6 != this.f5168t) {
            this.f5168t = z6;
            l0();
        }
        a1(I8.f40589d);
    }

    @Override // t0.AbstractC4987C
    public final void R(RecyclerView recyclerView) {
    }

    public void U0(C3698oP c3698oP, C4997M c4997m, C4108w4 c4108w4, int i) {
    }
}
