package androidx.recyclerview.widget;

import A.b;
import A.j;
import E.a;
import L.C0038n;
import L.C0039o;
import L.C0041q;
import L.D;
import L.G;
import L.L;
import L.N;
import L.O;
import L.x;
import L.y;
import a.AbstractC0069a;
import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.lang.reflect.Field;
import java.util.BitSet;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends x {

    /* renamed from: h, reason: collision with root package name */
    public final int f1618h;

    /* renamed from: i, reason: collision with root package name */
    public final O[] f1619i;

    /* renamed from: j, reason: collision with root package name */
    public final C0041q f1620j;

    /* renamed from: k, reason: collision with root package name */
    public final C0041q f1621k;

    /* renamed from: l, reason: collision with root package name */
    public final int f1622l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f1623m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f1624n = false;

    /* renamed from: o, reason: collision with root package name */
    public final j f1625o;

    /* renamed from: p, reason: collision with root package name */
    public final int f1626p;

    /* renamed from: q, reason: collision with root package name */
    public N f1627q;
    public final boolean r;

    /* renamed from: s, reason: collision with root package name */
    public final b f1628s;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.f1618h = -1;
        this.f1623m = false;
        j jVar = new j(9, false);
        this.f1625o = jVar;
        this.f1626p = 2;
        new Rect();
        new a(11, this);
        this.r = true;
        this.f1628s = new b(3, this);
        C0039o w2 = x.w(context, attributeSet, i2, i3);
        int i4 = w2.f585b;
        if (i4 != 0 && i4 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        a(null);
        if (i4 != this.f1622l) {
            this.f1622l = i4;
            C0041q c0041q = this.f1620j;
            this.f1620j = this.f1621k;
            this.f1621k = c0041q;
            H();
        }
        int i5 = w2.f586c;
        a(null);
        if (i5 != this.f1618h) {
            jVar.f30f = null;
            H();
            this.f1618h = i5;
            new BitSet(this.f1618h);
            this.f1619i = new O[this.f1618h];
            for (int i6 = 0; i6 < this.f1618h; i6++) {
                this.f1619i[i6] = new O(this, i6);
            }
            H();
        }
        boolean z2 = w2.f587d;
        a(null);
        N n2 = this.f1627q;
        if (n2 != null && n2.f503h != z2) {
            n2.f503h = z2;
        }
        this.f1623m = z2;
        H();
        C0038n c0038n = new C0038n(0);
        c0038n.f582b = 0;
        c0038n.f583c = 0;
        this.f1620j = C0041q.a(this, this.f1622l);
        this.f1621k = C0041q.a(this, 1 - this.f1622l);
    }

    @Override // L.x
    public final void A(AccessibilityEvent accessibilityEvent) {
        super.A(accessibilityEvent);
        if (p() > 0) {
            View O2 = O(false);
            View N2 = N(false);
            if (O2 == null || N2 == null) {
                return;
            }
            ((y) O2.getLayoutParams()).getClass();
            throw null;
        }
    }

    @Override // L.x
    public final void B(Parcelable parcelable) {
        if (parcelable instanceof N) {
            this.f1627q = (N) parcelable;
            H();
        }
    }

    @Override // L.x
    public final Parcelable C() {
        N n2 = this.f1627q;
        if (n2 != null) {
            N n3 = new N();
            n3.f498c = n2.f498c;
            n3.f496a = n2.f496a;
            n3.f497b = n2.f497b;
            n3.f499d = n2.f499d;
            n3.f500e = n2.f500e;
            n3.f501f = n2.f501f;
            n3.f503h = n2.f503h;
            n3.f504i = n2.f504i;
            n3.f505j = n2.f505j;
            n3.f502g = n2.f502g;
            return n3;
        }
        N n4 = new N();
        n4.f503h = this.f1623m;
        n4.f504i = false;
        n4.f505j = false;
        n4.f500e = 0;
        if (p() > 0) {
            P();
            n4.f496a = 0;
            View N2 = this.f1624n ? N(true) : O(true);
            if (N2 != null) {
                ((y) N2.getLayoutParams()).getClass();
                throw null;
            }
            n4.f497b = -1;
            int i2 = this.f1618h;
            n4.f498c = i2;
            n4.f499d = new int[i2];
            for (int i3 = 0; i3 < this.f1618h; i3++) {
                O o2 = this.f1619i[i3];
                int i4 = o2.f507b;
                if (i4 == Integer.MIN_VALUE) {
                    if (o2.f506a.size() == 0) {
                        i4 = Integer.MIN_VALUE;
                    } else {
                        View view = (View) o2.f506a.get(0);
                        L l2 = (L) view.getLayoutParams();
                        o2.f507b = o2.f510e.f1620j.c(view);
                        l2.getClass();
                        i4 = o2.f507b;
                    }
                }
                if (i4 != Integer.MIN_VALUE) {
                    i4 -= this.f1620j.e();
                }
                n4.f499d[i3] = i4;
            }
        } else {
            n4.f496a = -1;
            n4.f497b = -1;
            n4.f498c = 0;
        }
        return n4;
    }

    @Override // L.x
    public final void D(int i2) {
        if (i2 == 0) {
            J();
        }
    }

    public final boolean J() {
        int i2 = this.f1618h;
        boolean z2 = this.f1624n;
        if (p() == 0 || this.f1626p == 0 || !this.f604e) {
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
        if (this.f1622l == 1) {
            RecyclerView recyclerView = this.f601b;
            Field field = w.x.f3074a;
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
        ((L) o(i3).getLayoutParams()).getClass();
        throw null;
    }

    public final int K(G g2) {
        if (p() == 0) {
            return 0;
        }
        C0041q c0041q = this.f1620j;
        boolean z2 = !this.r;
        return AbstractC0069a.g(g2, c0041q, O(z2), N(z2), this, this.r);
    }

    public final void L(G g2) {
        if (p() == 0) {
            return;
        }
        boolean z2 = !this.r;
        View O2 = O(z2);
        View N2 = N(z2);
        if (p() == 0 || g2.a() == 0 || O2 == null || N2 == null) {
            return;
        }
        ((y) O2.getLayoutParams()).getClass();
        throw null;
    }

    public final int M(G g2) {
        if (p() == 0) {
            return 0;
        }
        C0041q c0041q = this.f1620j;
        boolean z2 = !this.r;
        return AbstractC0069a.h(g2, c0041q, O(z2), N(z2), this, this.r);
    }

    public final View N(boolean z2) {
        int e2 = this.f1620j.e();
        int d2 = this.f1620j.d();
        View view = null;
        for (int p2 = p() - 1; p2 >= 0; p2--) {
            View o2 = o(p2);
            int c2 = this.f1620j.c(o2);
            int b2 = this.f1620j.b(o2);
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
        int e2 = this.f1620j.e();
        int d2 = this.f1620j.d();
        int p2 = p();
        View view = null;
        for (int i2 = 0; i2 < p2; i2++) {
            View o2 = o(i2);
            int c2 = this.f1620j.c(o2);
            if (this.f1620j.b(o2) > e2 && c2 < d2) {
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
        x.v(o(0));
        throw null;
    }

    public final void Q() {
        int p2 = p();
        if (p2 == 0) {
            return;
        }
        x.v(o(p2 - 1));
        throw null;
    }

    @Override // L.x
    public final void a(String str) {
        RecyclerView recyclerView;
        if (this.f1627q != null || (recyclerView = this.f601b) == null) {
            return;
        }
        recyclerView.b(str);
    }

    @Override // L.x
    public final boolean b() {
        return this.f1622l == 0;
    }

    @Override // L.x
    public final boolean c() {
        return this.f1622l == 1;
    }

    @Override // L.x
    public final boolean d(y yVar) {
        return yVar instanceof L;
    }

    @Override // L.x
    public final int f(G g2) {
        return K(g2);
    }

    @Override // L.x
    public final void g(G g2) {
        L(g2);
    }

    @Override // L.x
    public final int h(G g2) {
        return M(g2);
    }

    @Override // L.x
    public final int i(G g2) {
        return K(g2);
    }

    @Override // L.x
    public final void j(G g2) {
        L(g2);
    }

    @Override // L.x
    public final int k(G g2) {
        return M(g2);
    }

    @Override // L.x
    public final y l() {
        return this.f1622l == 0 ? new L(-2, -1) : new L(-1, -2);
    }

    @Override // L.x
    public final y m(Context context, AttributeSet attributeSet) {
        return new L(context, attributeSet);
    }

    @Override // L.x
    public final y n(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new L((ViewGroup.MarginLayoutParams) layoutParams) : new L(layoutParams);
    }

    @Override // L.x
    public final int q(D d2, G g2) {
        if (this.f1622l == 1) {
            return this.f1618h;
        }
        super.q(d2, g2);
        return 1;
    }

    @Override // L.x
    public final int x(D d2, G g2) {
        if (this.f1622l == 0) {
            return this.f1618h;
        }
        super.x(d2, g2);
        return 1;
    }

    @Override // L.x
    public final boolean y() {
        return this.f1626p != 0;
    }

    @Override // L.x
    public final void z(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f601b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f1628s);
        }
        for (int i2 = 0; i2 < this.f1618h; i2++) {
            O o2 = this.f1619i[i2];
            o2.f506a.clear();
            o2.f507b = Integer.MIN_VALUE;
            o2.f508c = Integer.MIN_VALUE;
        }
        recyclerView.requestLayout();
    }
}
