package androidx.recyclerview.widget;

import A.b;
import A.j;
import E.a;
import L.C0063n;
import L.C0064o;
import L.C0066q;
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
    public final int f1610h;

    /* renamed from: i, reason: collision with root package name */
    public final O[] f1611i;

    /* renamed from: j, reason: collision with root package name */
    public final C0066q f1612j;

    /* renamed from: k, reason: collision with root package name */
    public final C0066q f1613k;

    /* renamed from: l, reason: collision with root package name */
    public final int f1614l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f1615m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f1616n = false;

    /* renamed from: o, reason: collision with root package name */
    public final j f1617o;

    /* renamed from: p, reason: collision with root package name */
    public final int f1618p;

    /* renamed from: q, reason: collision with root package name */
    public N f1619q;
    public final boolean r;

    /* renamed from: s, reason: collision with root package name */
    public final b f1620s;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.f1610h = -1;
        this.f1615m = false;
        j jVar = new j(9, false);
        this.f1617o = jVar;
        this.f1618p = 2;
        new Rect();
        new a(11, this);
        this.r = true;
        this.f1620s = new b(3, this);
        C0064o w2 = x.w(context, attributeSet, i2, i3);
        int i4 = w2.f663b;
        if (i4 != 0 && i4 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        a(null);
        if (i4 != this.f1614l) {
            this.f1614l = i4;
            C0066q c0066q = this.f1612j;
            this.f1612j = this.f1613k;
            this.f1613k = c0066q;
            H();
        }
        int i5 = w2.f664c;
        a(null);
        if (i5 != this.f1610h) {
            jVar.f30g = null;
            H();
            this.f1610h = i5;
            new BitSet(this.f1610h);
            this.f1611i = new O[this.f1610h];
            for (int i6 = 0; i6 < this.f1610h; i6++) {
                this.f1611i[i6] = new O(this, i6);
            }
            H();
        }
        boolean z2 = w2.f665d;
        a(null);
        N n2 = this.f1619q;
        if (n2 != null && n2.f581h != z2) {
            n2.f581h = z2;
        }
        this.f1615m = z2;
        H();
        C0063n c0063n = new C0063n(0);
        c0063n.f660b = 0;
        c0063n.f661c = 0;
        this.f1612j = C0066q.a(this, this.f1614l);
        this.f1613k = C0066q.a(this, 1 - this.f1614l);
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
            this.f1619q = (N) parcelable;
            H();
        }
    }

    @Override // L.x
    public final Parcelable C() {
        N n2 = this.f1619q;
        if (n2 != null) {
            N n3 = new N();
            n3.f576c = n2.f576c;
            n3.f574a = n2.f574a;
            n3.f575b = n2.f575b;
            n3.f577d = n2.f577d;
            n3.f578e = n2.f578e;
            n3.f579f = n2.f579f;
            n3.f581h = n2.f581h;
            n3.f582i = n2.f582i;
            n3.f583j = n2.f583j;
            n3.f580g = n2.f580g;
            return n3;
        }
        N n4 = new N();
        n4.f581h = this.f1615m;
        n4.f582i = false;
        n4.f583j = false;
        n4.f578e = 0;
        if (p() > 0) {
            P();
            n4.f574a = 0;
            View N2 = this.f1616n ? N(true) : O(true);
            if (N2 != null) {
                ((y) N2.getLayoutParams()).getClass();
                throw null;
            }
            n4.f575b = -1;
            int i2 = this.f1610h;
            n4.f576c = i2;
            n4.f577d = new int[i2];
            for (int i3 = 0; i3 < this.f1610h; i3++) {
                O o2 = this.f1611i[i3];
                int i4 = o2.f585b;
                if (i4 == Integer.MIN_VALUE) {
                    if (o2.f584a.size() == 0) {
                        i4 = Integer.MIN_VALUE;
                    } else {
                        View view = (View) o2.f584a.get(0);
                        L l2 = (L) view.getLayoutParams();
                        o2.f585b = o2.f588e.f1612j.c(view);
                        l2.getClass();
                        i4 = o2.f585b;
                    }
                }
                if (i4 != Integer.MIN_VALUE) {
                    i4 -= this.f1612j.e();
                }
                n4.f577d[i3] = i4;
            }
        } else {
            n4.f574a = -1;
            n4.f575b = -1;
            n4.f576c = 0;
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
        int i2 = this.f1610h;
        boolean z2 = this.f1616n;
        if (p() == 0 || this.f1618p == 0 || !this.f682e) {
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
        if (this.f1614l == 1) {
            RecyclerView recyclerView = this.f679b;
            Field field = w.x.f3069a;
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
        C0066q c0066q = this.f1612j;
        boolean z2 = !this.r;
        return AbstractC0069a.g(g2, c0066q, O(z2), N(z2), this, this.r);
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
        C0066q c0066q = this.f1612j;
        boolean z2 = !this.r;
        return AbstractC0069a.h(g2, c0066q, O(z2), N(z2), this, this.r);
    }

    public final View N(boolean z2) {
        int e2 = this.f1612j.e();
        int d2 = this.f1612j.d();
        View view = null;
        for (int p2 = p() - 1; p2 >= 0; p2--) {
            View o2 = o(p2);
            int c2 = this.f1612j.c(o2);
            int b2 = this.f1612j.b(o2);
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
        int e2 = this.f1612j.e();
        int d2 = this.f1612j.d();
        int p2 = p();
        View view = null;
        for (int i2 = 0; i2 < p2; i2++) {
            View o2 = o(i2);
            int c2 = this.f1612j.c(o2);
            if (this.f1612j.b(o2) > e2 && c2 < d2) {
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
        if (this.f1619q != null || (recyclerView = this.f679b) == null) {
            return;
        }
        recyclerView.b(str);
    }

    @Override // L.x
    public final boolean b() {
        return this.f1614l == 0;
    }

    @Override // L.x
    public final boolean c() {
        return this.f1614l == 1;
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
        return this.f1614l == 0 ? new L(-2, -1) : new L(-1, -2);
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
        if (this.f1614l == 1) {
            return this.f1610h;
        }
        super.q(d2, g2);
        return 1;
    }

    @Override // L.x
    public final int x(D d2, G g2) {
        if (this.f1614l == 0) {
            return this.f1610h;
        }
        super.x(d2, g2);
        return 1;
    }

    @Override // L.x
    public final boolean y() {
        return this.f1618p != 0;
    }

    @Override // L.x
    public final void z(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f679b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f1620s);
        }
        for (int i2 = 0; i2 < this.f1610h; i2++) {
            O o2 = this.f1611i[i2];
            o2.f584a.clear();
            o2.f585b = Integer.MIN_VALUE;
            o2.f586c = Integer.MIN_VALUE;
        }
        recyclerView.requestLayout();
    }
}
