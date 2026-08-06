package androidx.recyclerview.widget;

import C1.a;
import L.b;
import P.C0065n;
import P.C0066o;
import P.F;
import P.w;
import P.x;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import m0.j;
import u0.AbstractC1050a;

/* loaded from: classes.dex */
public class LinearLayoutManager extends w {

    /* renamed from: h, reason: collision with root package name */
    public final int f2520h;

    /* renamed from: i, reason: collision with root package name */
    public j f2521i;

    /* renamed from: j, reason: collision with root package name */
    public final b f2522j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f2523k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f2524l = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2525m = false;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f2526n = true;

    /* renamed from: o, reason: collision with root package name */
    public C0066o f2527o = null;

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.f2520h = 1;
        this.f2523k = false;
        C0065n c0065n = new C0065n(0);
        c0065n.f1358b = -1;
        c0065n.f1359c = Integer.MIN_VALUE;
        c0065n.f1360d = false;
        c0065n.f1361e = false;
        C0065n w2 = w.w(context, attributeSet, i2, i3);
        int i4 = w2.f1358b;
        if (i4 != 0 && i4 != 1) {
            throw new IllegalArgumentException(a.f(i4, "invalid orientation:"));
        }
        a(null);
        if (i4 != this.f2520h || this.f2522j == null) {
            this.f2522j = b.a(this, i4);
            this.f2520h = i4;
            H();
        }
        boolean z2 = w2.f1360d;
        a(null);
        if (z2 != this.f2523k) {
            this.f2523k = z2;
            H();
        }
        Q(w2.f1361e);
    }

    @Override // P.w
    public final void A(AccessibilityEvent accessibilityEvent) {
        super.A(accessibilityEvent);
        if (p() > 0) {
            View P2 = P(0, p(), false);
            if (P2 != null) {
                ((x) P2.getLayoutParams()).getClass();
                throw null;
            }
            accessibilityEvent.setFromIndex(-1);
            View P3 = P(p() - 1, -1, false);
            if (P3 == null) {
                accessibilityEvent.setToIndex(-1);
            } else {
                ((x) P3.getLayoutParams()).getClass();
                throw null;
            }
        }
    }

    @Override // P.w
    public final void B(Parcelable parcelable) {
        if (parcelable instanceof C0066o) {
            this.f2527o = (C0066o) parcelable;
            H();
        }
    }

    @Override // P.w
    public final Parcelable C() {
        C0066o c0066o = this.f2527o;
        if (c0066o != null) {
            C0066o c0066o2 = new C0066o();
            c0066o2.f1362a = c0066o.f1362a;
            c0066o2.f1363b = c0066o.f1363b;
            c0066o2.f1364c = c0066o.f1364c;
            return c0066o2;
        }
        C0066o c0066o3 = new C0066o();
        if (p() <= 0) {
            c0066o3.f1362a = -1;
            return c0066o3;
        }
        M();
        boolean z2 = this.f2524l;
        c0066o3.f1364c = z2;
        if (!z2) {
            w.v(o(z2 ? p() - 1 : 0));
            throw null;
        }
        View o2 = o(z2 ? 0 : p() - 1);
        c0066o3.f1363b = this.f2522j.d() - this.f2522j.b(o2);
        w.v(o2);
        throw null;
    }

    public final int J(F f2) {
        if (p() == 0) {
            return 0;
        }
        M();
        b bVar = this.f2522j;
        boolean z2 = !this.f2526n;
        return AbstractC1050a.h(f2, bVar, O(z2), N(z2), this, this.f2526n);
    }

    public final void K(F f2) {
        if (p() == 0) {
            return;
        }
        M();
        boolean z2 = !this.f2526n;
        View O2 = O(z2);
        View N2 = N(z2);
        if (p() == 0 || f2.a() == 0 || O2 == null || N2 == null) {
            return;
        }
        ((x) O2.getLayoutParams()).getClass();
        throw null;
    }

    public final int L(F f2) {
        if (p() == 0) {
            return 0;
        }
        M();
        b bVar = this.f2522j;
        boolean z2 = !this.f2526n;
        return AbstractC1050a.i(f2, bVar, O(z2), N(z2), this, this.f2526n);
    }

    public final void M() {
        if (this.f2521i == null) {
            this.f2521i = new j(12, false);
        }
    }

    public final View N(boolean z2) {
        return this.f2524l ? P(0, p(), z2) : P(p() - 1, -1, z2);
    }

    public final View O(boolean z2) {
        return this.f2524l ? P(p() - 1, -1, z2) : P(0, p(), z2);
    }

    public final View P(int i2, int i3, boolean z2) {
        M();
        int i4 = z2 ? 24579 : 320;
        return this.f2520h == 0 ? this.f1374c.p(i2, i3, i4, 320) : this.f1375d.p(i2, i3, i4, 320);
    }

    public void Q(boolean z2) {
        a(null);
        if (this.f2525m == z2) {
            return;
        }
        this.f2525m = z2;
        H();
    }

    @Override // P.w
    public final void a(String str) {
        RecyclerView recyclerView;
        if (this.f2527o != null || (recyclerView = this.f1373b) == null) {
            return;
        }
        recyclerView.b(str);
    }

    @Override // P.w
    public final boolean b() {
        return this.f2520h == 0;
    }

    @Override // P.w
    public final boolean c() {
        return this.f2520h == 1;
    }

    @Override // P.w
    public final int f(F f2) {
        return J(f2);
    }

    @Override // P.w
    public final void g(F f2) {
        K(f2);
    }

    @Override // P.w
    public final int h(F f2) {
        return L(f2);
    }

    @Override // P.w
    public final int i(F f2) {
        return J(f2);
    }

    @Override // P.w
    public final void j(F f2) {
        K(f2);
    }

    @Override // P.w
    public final int k(F f2) {
        return L(f2);
    }

    @Override // P.w
    public x l() {
        return new x(-2, -2);
    }

    @Override // P.w
    public final boolean y() {
        return true;
    }

    @Override // P.w
    public final void z(RecyclerView recyclerView) {
    }
}
