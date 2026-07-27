package androidx.recyclerview.widget;

import E.a;
import E0.h;
import L.C0064o;
import L.C0065p;
import L.C0066q;
import L.G;
import L.x;
import L.y;
import a.AbstractC0069a;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* loaded from: classes.dex */
public class LinearLayoutManager extends x {

    /* renamed from: h, reason: collision with root package name */
    public final int f1547h;

    /* renamed from: i, reason: collision with root package name */
    public a f1548i;

    /* renamed from: j, reason: collision with root package name */
    public final C0066q f1549j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f1550k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f1551l = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1552m = false;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f1553n = true;

    /* renamed from: o, reason: collision with root package name */
    public C0065p f1554o = null;

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.f1547h = 1;
        this.f1550k = false;
        C0064o c0064o = new C0064o(0);
        c0064o.f663b = -1;
        c0064o.f664c = Integer.MIN_VALUE;
        c0064o.f665d = false;
        c0064o.f666e = false;
        C0064o w2 = x.w(context, attributeSet, i2, i3);
        int i4 = w2.f663b;
        if (i4 != 0 && i4 != 1) {
            throw new IllegalArgumentException(h.e("invalid orientation:", i4));
        }
        a(null);
        if (i4 != this.f1547h || this.f1549j == null) {
            this.f1549j = C0066q.a(this, i4);
            this.f1547h = i4;
            H();
        }
        boolean z2 = w2.f665d;
        a(null);
        if (z2 != this.f1550k) {
            this.f1550k = z2;
            H();
        }
        Q(w2.f666e);
    }

    @Override // L.x
    public final void A(AccessibilityEvent accessibilityEvent) {
        super.A(accessibilityEvent);
        if (p() > 0) {
            View P2 = P(0, p(), false);
            if (P2 != null) {
                ((y) P2.getLayoutParams()).getClass();
                throw null;
            }
            accessibilityEvent.setFromIndex(-1);
            View P3 = P(p() - 1, -1, false);
            if (P3 == null) {
                accessibilityEvent.setToIndex(-1);
            } else {
                ((y) P3.getLayoutParams()).getClass();
                throw null;
            }
        }
    }

    @Override // L.x
    public final void B(Parcelable parcelable) {
        if (parcelable instanceof C0065p) {
            this.f1554o = (C0065p) parcelable;
            H();
        }
    }

    @Override // L.x
    public final Parcelable C() {
        C0065p c0065p = this.f1554o;
        if (c0065p != null) {
            C0065p c0065p2 = new C0065p();
            c0065p2.f667a = c0065p.f667a;
            c0065p2.f668b = c0065p.f668b;
            c0065p2.f669c = c0065p.f669c;
            return c0065p2;
        }
        C0065p c0065p3 = new C0065p();
        if (p() <= 0) {
            c0065p3.f667a = -1;
            return c0065p3;
        }
        M();
        boolean z2 = this.f1551l;
        c0065p3.f669c = z2;
        if (!z2) {
            x.v(o(z2 ? p() - 1 : 0));
            throw null;
        }
        View o2 = o(z2 ? 0 : p() - 1);
        c0065p3.f668b = this.f1549j.d() - this.f1549j.b(o2);
        x.v(o2);
        throw null;
    }

    public final int J(G g2) {
        if (p() == 0) {
            return 0;
        }
        M();
        C0066q c0066q = this.f1549j;
        boolean z2 = !this.f1553n;
        return AbstractC0069a.g(g2, c0066q, O(z2), N(z2), this, this.f1553n);
    }

    public final void K(G g2) {
        if (p() == 0) {
            return;
        }
        M();
        boolean z2 = !this.f1553n;
        View O2 = O(z2);
        View N2 = N(z2);
        if (p() == 0 || g2.a() == 0 || O2 == null || N2 == null) {
            return;
        }
        ((y) O2.getLayoutParams()).getClass();
        throw null;
    }

    public final int L(G g2) {
        if (p() == 0) {
            return 0;
        }
        M();
        C0066q c0066q = this.f1549j;
        boolean z2 = !this.f1553n;
        return AbstractC0069a.h(g2, c0066q, O(z2), N(z2), this, this.f1553n);
    }

    public final void M() {
        if (this.f1548i == null) {
            this.f1548i = new a(7);
        }
    }

    public final View N(boolean z2) {
        return this.f1551l ? P(0, p(), z2) : P(p() - 1, -1, z2);
    }

    public final View O(boolean z2) {
        return this.f1551l ? P(p() - 1, -1, z2) : P(0, p(), z2);
    }

    public final View P(int i2, int i3, boolean z2) {
        M();
        int i4 = z2 ? 24579 : 320;
        return this.f1547h == 0 ? this.f680c.q(i2, i3, i4, 320) : this.f681d.q(i2, i3, i4, 320);
    }

    public void Q(boolean z2) {
        a(null);
        if (this.f1552m == z2) {
            return;
        }
        this.f1552m = z2;
        H();
    }

    @Override // L.x
    public final void a(String str) {
        RecyclerView recyclerView;
        if (this.f1554o != null || (recyclerView = this.f679b) == null) {
            return;
        }
        recyclerView.b(str);
    }

    @Override // L.x
    public final boolean b() {
        return this.f1547h == 0;
    }

    @Override // L.x
    public final boolean c() {
        return this.f1547h == 1;
    }

    @Override // L.x
    public final int f(G g2) {
        return J(g2);
    }

    @Override // L.x
    public final void g(G g2) {
        K(g2);
    }

    @Override // L.x
    public final int h(G g2) {
        return L(g2);
    }

    @Override // L.x
    public final int i(G g2) {
        return J(g2);
    }

    @Override // L.x
    public final void j(G g2) {
        K(g2);
    }

    @Override // L.x
    public final int k(G g2) {
        return L(g2);
    }

    @Override // L.x
    public y l() {
        return new y(-2, -2);
    }

    @Override // L.x
    public final boolean y() {
        return true;
    }

    @Override // L.x
    public final void z(RecyclerView recyclerView) {
    }
}
