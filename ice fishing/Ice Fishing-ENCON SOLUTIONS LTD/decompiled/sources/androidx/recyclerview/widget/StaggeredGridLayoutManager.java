package androidx.recyclerview.widget;

import J1.l;
import L.b;
import P.C;
import P.C0064m;
import P.C0065n;
import P.F;
import P.K;
import P.M;
import P.N;
import P.w;
import P.x;
import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.lang.reflect.Field;
import java.util.BitSet;
import m0.j;
import u0.AbstractC1050a;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends w {

    /* renamed from: h, reason: collision with root package name */
    public final int f2583h;

    /* renamed from: i, reason: collision with root package name */
    public final N[] f2584i;

    /* renamed from: j, reason: collision with root package name */
    public final b f2585j;

    /* renamed from: k, reason: collision with root package name */
    public final b f2586k;

    /* renamed from: l, reason: collision with root package name */
    public final int f2587l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f2588m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f2589n = false;

    /* renamed from: o, reason: collision with root package name */
    public final l f2590o;

    /* renamed from: p, reason: collision with root package name */
    public final int f2591p;

    /* renamed from: q, reason: collision with root package name */
    public M f2592q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f2593r;

    /* renamed from: s, reason: collision with root package name */
    public final C.b f2594s;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.f2583h = -1;
        this.f2588m = false;
        l lVar = new l();
        this.f2590o = lVar;
        this.f2591p = 2;
        new Rect();
        new j(16, this);
        this.f2593r = true;
        this.f2594s = new C.b(6, this);
        C0065n w2 = w.w(context, attributeSet, i2, i3);
        int i4 = w2.f1358b;
        if (i4 != 0 && i4 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        a(null);
        if (i4 != this.f2587l) {
            this.f2587l = i4;
            b bVar = this.f2585j;
            this.f2585j = this.f2586k;
            this.f2586k = bVar;
            H();
        }
        int i5 = w2.f1359c;
        a(null);
        if (i5 != this.f2583h) {
            lVar.f893a = null;
            H();
            this.f2583h = i5;
            new BitSet(this.f2583h);
            this.f2584i = new N[this.f2583h];
            for (int i6 = 0; i6 < this.f2583h; i6++) {
                this.f2584i[i6] = new N(this, i6);
            }
            H();
        }
        boolean z2 = w2.f1360d;
        a(null);
        M m2 = this.f2592q;
        if (m2 != null && m2.f1285h != z2) {
            m2.f1285h = z2;
        }
        this.f2588m = z2;
        H();
        C0064m c0064m = new C0064m(0);
        c0064m.f1355b = 0;
        c0064m.f1356c = 0;
        this.f2585j = b.a(this, this.f2587l);
        this.f2586k = b.a(this, 1 - this.f2587l);
    }

    @Override // P.w
    public final void A(AccessibilityEvent accessibilityEvent) {
        super.A(accessibilityEvent);
        if (p() > 0) {
            View O2 = O(false);
            View N2 = N(false);
            if (O2 == null || N2 == null) {
                return;
            }
            ((x) O2.getLayoutParams()).getClass();
            throw null;
        }
    }

    @Override // P.w
    public final void B(Parcelable parcelable) {
        if (parcelable instanceof M) {
            this.f2592q = (M) parcelable;
            H();
        }
    }

    @Override // P.w
    public final Parcelable C() {
        M m2 = this.f2592q;
        if (m2 != null) {
            M m3 = new M();
            m3.f1280c = m2.f1280c;
            m3.f1278a = m2.f1278a;
            m3.f1279b = m2.f1279b;
            m3.f1281d = m2.f1281d;
            m3.f1282e = m2.f1282e;
            m3.f1283f = m2.f1283f;
            m3.f1285h = m2.f1285h;
            m3.f1286i = m2.f1286i;
            m3.f1287j = m2.f1287j;
            m3.f1284g = m2.f1284g;
            return m3;
        }
        M m4 = new M();
        m4.f1285h = this.f2588m;
        m4.f1286i = false;
        m4.f1287j = false;
        m4.f1282e = 0;
        if (p() > 0) {
            P();
            m4.f1278a = 0;
            View N2 = this.f2589n ? N(true) : O(true);
            if (N2 != null) {
                ((x) N2.getLayoutParams()).getClass();
                throw null;
            }
            m4.f1279b = -1;
            int i2 = this.f2583h;
            m4.f1280c = i2;
            m4.f1281d = new int[i2];
            for (int i3 = 0; i3 < this.f2583h; i3++) {
                N n2 = this.f2584i[i3];
                int i4 = n2.f1289b;
                if (i4 == Integer.MIN_VALUE) {
                    if (n2.f1288a.size() == 0) {
                        i4 = Integer.MIN_VALUE;
                    } else {
                        View view = (View) n2.f1288a.get(0);
                        K k2 = (K) view.getLayoutParams();
                        n2.f1289b = n2.f1292e.f2585j.c(view);
                        k2.getClass();
                        i4 = n2.f1289b;
                    }
                }
                if (i4 != Integer.MIN_VALUE) {
                    i4 -= this.f2585j.e();
                }
                m4.f1281d[i3] = i4;
            }
        } else {
            m4.f1278a = -1;
            m4.f1279b = -1;
            m4.f1280c = 0;
        }
        return m4;
    }

    @Override // P.w
    public final void D(int i2) {
        if (i2 == 0) {
            J();
        }
    }

    public final boolean J() {
        int i2 = this.f2583h;
        boolean z2 = this.f2589n;
        if (p() == 0 || this.f2591p == 0 || !this.f1376e) {
            return false;
        }
        if (z2) {
            Q();
            P();
        } else {
            P();
            Q();
        }
        int p2 = p();
        int i3 = p2 - 1;
        new BitSet(i2).set(0, i2, true);
        if (this.f2587l == 1) {
            RecyclerView recyclerView = this.f1373b;
            Field field = y.x.f8596a;
            if (recyclerView.getLayoutDirection() != 1) {
            }
        }
        if (z2) {
            p2 = -1;
        } else {
            i3 = 0;
        }
        if (i3 == p2) {
            return false;
        }
        ((K) o(i3).getLayoutParams()).getClass();
        throw null;
    }

    public final int K(F f2) {
        if (p() == 0) {
            return 0;
        }
        b bVar = this.f2585j;
        boolean z2 = !this.f2593r;
        return AbstractC1050a.h(f2, bVar, O(z2), N(z2), this, this.f2593r);
    }

    public final void L(F f2) {
        if (p() == 0) {
            return;
        }
        boolean z2 = !this.f2593r;
        View O2 = O(z2);
        View N2 = N(z2);
        if (p() == 0 || f2.a() == 0 || O2 == null || N2 == null) {
            return;
        }
        ((x) O2.getLayoutParams()).getClass();
        throw null;
    }

    public final int M(F f2) {
        if (p() == 0) {
            return 0;
        }
        b bVar = this.f2585j;
        boolean z2 = !this.f2593r;
        return AbstractC1050a.i(f2, bVar, O(z2), N(z2), this, this.f2593r);
    }

    public final View N(boolean z2) {
        int e2 = this.f2585j.e();
        int d2 = this.f2585j.d();
        View view = null;
        for (int p2 = p() - 1; p2 >= 0; p2--) {
            View o2 = o(p2);
            int c2 = this.f2585j.c(o2);
            int b2 = this.f2585j.b(o2);
            if (b2 > e2 && c2 < d2) {
                if (b2 <= d2 || !z2) {
                    return o2;
                }
                if (view == null) {
                    view = o2;
                }
            }
        }
        return view;
    }

    public final View O(boolean z2) {
        int e2 = this.f2585j.e();
        int d2 = this.f2585j.d();
        int p2 = p();
        View view = null;
        for (int i2 = 0; i2 < p2; i2++) {
            View o2 = o(i2);
            int c2 = this.f2585j.c(o2);
            if (this.f2585j.b(o2) > e2 && c2 < d2) {
                if (c2 >= e2 || !z2) {
                    return o2;
                }
                if (view == null) {
                    view = o2;
                }
            }
        }
        return view;
    }

    public final void P() {
        if (p() == 0) {
            return;
        }
        w.v(o(0));
        throw null;
    }

    public final void Q() {
        int p2 = p();
        if (p2 == 0) {
            return;
        }
        w.v(o(p2 - 1));
        throw null;
    }

    @Override // P.w
    public final void a(String str) {
        RecyclerView recyclerView;
        if (this.f2592q != null || (recyclerView = this.f1373b) == null) {
            return;
        }
        recyclerView.b(str);
    }

    @Override // P.w
    public final boolean b() {
        return this.f2587l == 0;
    }

    @Override // P.w
    public final boolean c() {
        return this.f2587l == 1;
    }

    @Override // P.w
    public final boolean d(x xVar) {
        return xVar instanceof K;
    }

    @Override // P.w
    public final int f(F f2) {
        return K(f2);
    }

    @Override // P.w
    public final void g(F f2) {
        L(f2);
    }

    @Override // P.w
    public final int h(F f2) {
        return M(f2);
    }

    @Override // P.w
    public final int i(F f2) {
        return K(f2);
    }

    @Override // P.w
    public final void j(F f2) {
        L(f2);
    }

    @Override // P.w
    public final int k(F f2) {
        return M(f2);
    }

    @Override // P.w
    public final x l() {
        return this.f2587l == 0 ? new K(-2, -1) : new K(-1, -2);
    }

    @Override // P.w
    public final x m(Context context, AttributeSet attributeSet) {
        return new K(context, attributeSet);
    }

    @Override // P.w
    public final x n(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new K((ViewGroup.MarginLayoutParams) layoutParams) : new K(layoutParams);
    }

    @Override // P.w
    public final int q(C c2, F f2) {
        if (this.f2587l == 1) {
            return this.f2583h;
        }
        super.q(c2, f2);
        return 1;
    }

    @Override // P.w
    public final int x(C c2, F f2) {
        if (this.f2587l == 0) {
            return this.f2583h;
        }
        super.x(c2, f2);
        return 1;
    }

    @Override // P.w
    public final boolean y() {
        return this.f2591p != 0;
    }

    @Override // P.w
    public final void z(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f1373b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f2594s);
        }
        for (int i2 = 0; i2 < this.f2583h; i2++) {
            N n2 = this.f2584i[i2];
            n2.f1288a.clear();
            n2.f1289b = Integer.MIN_VALUE;
            n2.f1290c = Integer.MIN_VALUE;
        }
        recyclerView.requestLayout();
    }
}
