package androidx.recyclerview.widget;

import D1.h;
import F.i;
import P.f;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.GridView;
import java.util.Arrays;
import java.util.WeakHashMap;
import k0.C0201o;
import k0.C0205t;
import k0.C0206u;
import k0.C0207v;
import k0.K;
import k0.L;
import k0.Q;
import k0.X;
import k0.r;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: E, reason: collision with root package name */
    public boolean f2087E;

    /* renamed from: F, reason: collision with root package name */
    public int f2088F;

    /* renamed from: G, reason: collision with root package name */
    public int[] f2089G;

    /* renamed from: H, reason: collision with root package name */
    public View[] f2090H;

    /* renamed from: I, reason: collision with root package name */
    public final SparseIntArray f2091I;
    public final SparseIntArray J;

    /* renamed from: K, reason: collision with root package name */
    public final i f2092K;

    /* renamed from: L, reason: collision with root package name */
    public final Rect f2093L;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f2087E = false;
        this.f2088F = -1;
        this.f2091I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.f2092K = new i(10);
        this.f2093L = new Rect();
        p1(K.I(context, attributeSet, i, i2).f3381b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, k0.K
    public final boolean D0() {
        return this.f2108z == null && !this.f2087E;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void F0(X x2, C0207v c0207v, C0201o c0201o) {
        int i;
        int i2 = this.f2088F;
        for (int i3 = 0; i3 < this.f2088F && (i = c0207v.f3605d) >= 0 && i < x2.b() && i2 > 0; i3++) {
            c0201o.a(c0207v.f3605d, Math.max(0, c0207v.f3607g));
            this.f2092K.getClass();
            i2--;
            c0207v.f3605d += c0207v.e;
        }
    }

    @Override // k0.K
    public final int J(Q q2, X x2) {
        if (this.f2098p == 0) {
            return this.f2088F;
        }
        if (x2.b() < 1) {
            return 0;
        }
        return l1(x2.b() - 1, q2, x2) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View R0(Q q2, X x2, boolean z2, boolean z3) {
        int i;
        int i2;
        int v2 = v();
        int i3 = 1;
        if (z3) {
            i2 = v() - 1;
            i = -1;
            i3 = -1;
        } else {
            i = v2;
            i2 = 0;
        }
        int b2 = x2.b();
        K0();
        int k2 = this.f2100r.k();
        int g2 = this.f2100r.g();
        View view = null;
        View view2 = null;
        while (i2 != i) {
            View u2 = u(i2);
            int H2 = K.H(u2);
            if (H2 >= 0 && H2 < b2 && m1(H2, q2, x2) == 0) {
                if (((L) u2.getLayoutParams()).f3396a.j()) {
                    if (view2 == null) {
                        view2 = u2;
                    }
                } else {
                    if (this.f2100r.e(u2) < g2 && this.f2100r.b(u2) >= k2) {
                        return u2;
                    }
                    if (view == null) {
                        view = u2;
                    }
                }
            }
            i2 += i3;
        }
        return view != null ? view : view2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00df, code lost:
    
        if (r13 == (r2 > r15)) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0101, code lost:
    
        if (r13 == (r2 > r8)) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0020, code lost:
    
        if (r22.f3384a.f3471c.contains(r3) != false) goto L5;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011a  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, k0.K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View U(View view, int i, Q q2, X x2) {
        View D2;
        int v2;
        int i2;
        int i3;
        View view2;
        View view3;
        int i4;
        Q q3 = q2;
        X x3 = x2;
        RecyclerView recyclerView = this.f3385b;
        View view4 = null;
        if (recyclerView != null) {
            D2 = recyclerView.D(view);
            if (D2 != null) {
            }
        }
        D2 = null;
        if (D2 == null) {
            return null;
        }
        r rVar = (r) D2.getLayoutParams();
        int i5 = rVar.e;
        int i6 = rVar.f3586f + i5;
        if (super.U(view, i, q2, x2) == null) {
            return null;
        }
        if ((J0(i) == 1) != this.f2103u) {
            i3 = v() - 1;
            v2 = -1;
            i2 = -1;
        } else {
            v2 = v();
            i2 = 1;
            i3 = 0;
        }
        boolean z2 = this.f2098p == 1 && W0();
        int l1 = l1(i3, q3, x3);
        int i7 = -1;
        int i8 = -1;
        int i9 = i2;
        int i10 = 0;
        int i11 = 0;
        int i12 = i3;
        View view5 = null;
        while (i12 != v2) {
            int i13 = v2;
            int l12 = l1(i12, q3, x3);
            View u2 = u(i12);
            if (u2 == D2) {
                break;
            }
            if (!u2.hasFocusable() || l12 == l1) {
                r rVar2 = (r) u2.getLayoutParams();
                int i14 = rVar2.e;
                view2 = D2;
                int i15 = rVar2.f3586f + i14;
                if (u2.hasFocusable() && i14 == i5 && i15 == i6) {
                    return u2;
                }
                if (!(u2.hasFocusable() && view4 == null) && (u2.hasFocusable() || view5 != null)) {
                    view3 = view5;
                    int min = Math.min(i15, i6) - Math.max(i14, i5);
                    if (u2.hasFocusable()) {
                        if (min <= i10) {
                            if (min == i10) {
                            }
                        }
                    } else if (view4 == null) {
                        i4 = i10;
                        if (!this.f3386c.y(u2) || !this.f3387d.y(u2)) {
                            if (min <= i11) {
                                if (min == i11) {
                                }
                            }
                            if (u2.hasFocusable()) {
                                int i16 = rVar2.e;
                                i11 = Math.min(i15, i6) - Math.max(i14, i5);
                                i7 = i16;
                                i10 = i4;
                                view5 = u2;
                            } else {
                                int i17 = rVar2.e;
                                i10 = Math.min(i15, i6) - Math.max(i14, i5);
                                i8 = i17;
                                view5 = view3;
                                view4 = u2;
                            }
                            i12 += i9;
                            q3 = q2;
                            x3 = x2;
                            v2 = i13;
                            D2 = view2;
                        }
                        i10 = i4;
                        view5 = view3;
                        i12 += i9;
                        q3 = q2;
                        x3 = x2;
                        v2 = i13;
                        D2 = view2;
                    }
                } else {
                    view3 = view5;
                }
                i4 = i10;
                if (u2.hasFocusable()) {
                }
                i12 += i9;
                q3 = q2;
                x3 = x2;
                v2 = i13;
                D2 = view2;
            } else {
                if (view4 != null) {
                    break;
                }
                view2 = D2;
                view3 = view5;
            }
            i4 = i10;
            i10 = i4;
            view5 = view3;
            i12 += i9;
            q3 = q2;
            x3 = x2;
            v2 = i13;
            D2 = view2;
        }
        return view4 != null ? view4 : view5;
    }

    @Override // k0.K
    public final void W(Q q2, X x2, f fVar) {
        super.W(q2, x2, fVar);
        fVar.h(GridView.class.getName());
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009f, code lost:
    
        r22.f3599b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a1, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v37 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X0(Q q2, X x2, C0207v c0207v, C0206u c0206u) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int w2;
        int i8;
        ?? r8;
        int i9;
        View b2;
        int j = this.f2100r.j();
        boolean z2 = j != 1073741824;
        int i10 = v() > 0 ? this.f2089G[this.f2088F] : 0;
        if (z2) {
            q1();
        }
        boolean z3 = c0207v.e == 1;
        int i11 = this.f2088F;
        if (!z3) {
            i11 = m1(c0207v.f3605d, q2, x2) + n1(c0207v.f3605d, q2, x2);
        }
        int i12 = 0;
        while (i12 < this.f2088F && (i9 = c0207v.f3605d) >= 0 && i9 < x2.b() && i11 > 0) {
            int i13 = c0207v.f3605d;
            int n1 = n1(i13, q2, x2);
            if (n1 > this.f2088F) {
                throw new IllegalArgumentException("Item at position " + i13 + " requires " + n1 + " spans but GridLayoutManager has only " + this.f2088F + " spans.");
            }
            i11 -= n1;
            if (i11 < 0 || (b2 = c0207v.b(q2)) == null) {
                break;
            }
            this.f2090H[i12] = b2;
            i12++;
        }
        if (z3) {
            i3 = 1;
            i2 = i12;
            i = 0;
        } else {
            i = i12 - 1;
            i2 = -1;
            i3 = -1;
        }
        int i14 = 0;
        while (i != i2) {
            View view = this.f2090H[i];
            r rVar = (r) view.getLayoutParams();
            int n12 = n1(K.H(view), q2, x2);
            rVar.f3586f = n12;
            rVar.e = i14;
            i14 += n12;
            i += i3;
        }
        float f2 = RecyclerView.f2111C0;
        int i15 = 0;
        for (int i16 = 0; i16 < i12; i16++) {
            View view2 = this.f2090H[i16];
            if (c0207v.f3609k != null) {
                r8 = 0;
                r8 = 0;
                if (z3) {
                    b(view2, -1, true);
                } else {
                    b(view2, 0, true);
                }
            } else if (z3) {
                r8 = 0;
                b(view2, -1, false);
            } else {
                r8 = 0;
                b(view2, 0, false);
            }
            RecyclerView recyclerView = this.f3385b;
            Rect rect = this.f2093L;
            if (recyclerView == null) {
                rect.set(r8, r8, r8, r8);
            } else {
                rect.set(recyclerView.M(view2));
            }
            o1(view2, j, r8);
            int c2 = this.f2100r.c(view2);
            if (c2 > i15) {
                i15 = c2;
            }
            float d2 = (this.f2100r.d(view2) * 1.0f) / ((r) view2.getLayoutParams()).f3586f;
            if (d2 > f2) {
                f2 = d2;
            }
        }
        if (z2) {
            i1(Math.max(Math.round(f2 * this.f2088F), i10));
            i15 = 0;
            for (int i17 = 0; i17 < i12; i17++) {
                View view3 = this.f2090H[i17];
                o1(view3, 1073741824, true);
                int c3 = this.f2100r.c(view3);
                if (c3 > i15) {
                    i15 = c3;
                }
            }
        }
        for (int i18 = 0; i18 < i12; i18++) {
            View view4 = this.f2090H[i18];
            if (this.f2100r.c(view4) != i15) {
                r rVar2 = (r) view4.getLayoutParams();
                Rect rect2 = rVar2.f3397b;
                int i19 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) rVar2).topMargin + ((ViewGroup.MarginLayoutParams) rVar2).bottomMargin;
                int i20 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) rVar2).leftMargin + ((ViewGroup.MarginLayoutParams) rVar2).rightMargin;
                int k1 = k1(rVar2.e, rVar2.f3586f);
                if (this.f2098p == 1) {
                    i8 = K.w(false, k1, 1073741824, i20, ((ViewGroup.MarginLayoutParams) rVar2).width);
                    w2 = View.MeasureSpec.makeMeasureSpec(i15 - i19, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15 - i20, 1073741824);
                    w2 = K.w(false, k1, 1073741824, i19, ((ViewGroup.MarginLayoutParams) rVar2).height);
                    i8 = makeMeasureSpec;
                }
                if (A0(view4, i8, w2, (L) view4.getLayoutParams())) {
                    view4.measure(i8, w2);
                }
            }
        }
        c0206u.f3598a = i15;
        if (this.f2098p != 1) {
            if (c0207v.f3606f == -1) {
                int i21 = c0207v.f3603b;
                i5 = i21 - i15;
                i4 = i21;
            } else {
                int i22 = c0207v.f3603b;
                i4 = i22 + i15;
                i5 = i22;
            }
            i6 = 0;
            i7 = 0;
        } else if (c0207v.f3606f == -1) {
            i7 = c0207v.f3603b;
            i6 = i7 - i15;
            i5 = 0;
            i4 = 0;
        } else {
            int i23 = c0207v.f3603b;
            i6 = i23;
            i4 = 0;
            i7 = i23 + i15;
            i5 = 0;
        }
        for (int i24 = 0; i24 < i12; i24++) {
            View view5 = this.f2090H[i24];
            r rVar3 = (r) view5.getLayoutParams();
            if (this.f2098p != 1) {
                i6 = G() + this.f2089G[rVar3.e];
                i7 = this.f2100r.d(view5) + i6;
            } else if (W0()) {
                int E2 = E() + this.f2089G[this.f2088F - rVar3.e];
                i4 = E2;
                i5 = E2 - this.f2100r.d(view5);
            } else {
                i5 = E() + this.f2089G[rVar3.e];
                i4 = this.f2100r.d(view5) + i5;
            }
            K.N(view5, i5, i6, i4, i7);
            if (rVar3.f3396a.j() || rVar3.f3396a.m()) {
                c0206u.f3600c = true;
            }
            c0206u.f3601d = view5.hasFocusable() | c0206u.f3601d;
        }
        Arrays.fill(this.f2090H, (Object) null);
    }

    @Override // k0.K
    public final void Y(Q q2, X x2, View view, f fVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof r)) {
            X(view, fVar);
            return;
        }
        r rVar = (r) layoutParams;
        int l1 = l1(rVar.f3396a.c(), q2, x2);
        int i = this.f2098p;
        AccessibilityNodeInfo accessibilityNodeInfo = fVar.f891a;
        if (i == 0) {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(rVar.e, rVar.f3586f, l1, 1, false, false));
        } else {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(l1, 1, rVar.e, rVar.f3586f, false, false));
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void Y0(Q q2, X x2, C0205t c0205t, int i) {
        q1();
        if (x2.b() > 0 && !x2.f3427g) {
            boolean z2 = i == 1;
            int m12 = m1(c0205t.f3595b, q2, x2);
            if (z2) {
                while (m12 > 0) {
                    int i2 = c0205t.f3595b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    c0205t.f3595b = i3;
                    m12 = m1(i3, q2, x2);
                }
            } else {
                int b2 = x2.b() - 1;
                int i4 = c0205t.f3595b;
                while (i4 < b2) {
                    int i5 = i4 + 1;
                    int m13 = m1(i5, q2, x2);
                    if (m13 <= m12) {
                        break;
                    }
                    i4 = i5;
                    m12 = m13;
                }
                c0205t.f3595b = i4;
            }
        }
        j1();
    }

    @Override // k0.K
    public final void Z(int i, int i2) {
        i iVar = this.f2092K;
        iVar.x();
        ((SparseIntArray) iVar.f209c).clear();
    }

    @Override // k0.K
    public final void a0() {
        i iVar = this.f2092K;
        iVar.x();
        ((SparseIntArray) iVar.f209c).clear();
    }

    @Override // k0.K
    public final void b0(int i, int i2) {
        i iVar = this.f2092K;
        iVar.x();
        ((SparseIntArray) iVar.f209c).clear();
    }

    @Override // k0.K
    public final void c0(int i, int i2) {
        i iVar = this.f2092K;
        iVar.x();
        ((SparseIntArray) iVar.f209c).clear();
    }

    @Override // k0.K
    public final void d0(int i, int i2) {
        i iVar = this.f2092K;
        iVar.x();
        ((SparseIntArray) iVar.f209c).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, k0.K
    public final void e0(Q q2, X x2) {
        boolean z2 = x2.f3427g;
        SparseIntArray sparseIntArray = this.J;
        SparseIntArray sparseIntArray2 = this.f2091I;
        if (z2) {
            int v2 = v();
            for (int i = 0; i < v2; i++) {
                r rVar = (r) u(i).getLayoutParams();
                int c2 = rVar.f3396a.c();
                sparseIntArray2.put(c2, rVar.f3586f);
                sparseIntArray.put(c2, rVar.e);
            }
        }
        super.e0(q2, x2);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void e1(boolean z2) {
        if (z2) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.e1(false);
    }

    @Override // k0.K
    public final boolean f(L l2) {
        return l2 instanceof r;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, k0.K
    public final void f0(X x2) {
        super.f0(x2);
        this.f2087E = false;
    }

    public final void i1(int i) {
        int i2;
        int[] iArr = this.f2089G;
        int i3 = this.f2088F;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.f2089G = iArr;
    }

    public final void j1() {
        View[] viewArr = this.f2090H;
        if (viewArr == null || viewArr.length != this.f2088F) {
            this.f2090H = new View[this.f2088F];
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, k0.K
    public final int k(X x2) {
        return H0(x2);
    }

    public final int k1(int i, int i2) {
        if (this.f2098p != 1 || !W0()) {
            int[] iArr = this.f2089G;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f2089G;
        int i3 = this.f2088F;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, k0.K
    public final int l(X x2) {
        return I0(x2);
    }

    public final int l1(int i, Q q2, X x2) {
        boolean z2 = x2.f3427g;
        i iVar = this.f2092K;
        if (!z2) {
            int i2 = this.f2088F;
            iVar.getClass();
            return i.v(i, i2);
        }
        int b2 = q2.b(i);
        if (b2 != -1) {
            int i3 = this.f2088F;
            iVar.getClass();
            return i.v(b2, i3);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    public final int m1(int i, Q q2, X x2) {
        boolean z2 = x2.f3427g;
        i iVar = this.f2092K;
        if (!z2) {
            int i2 = this.f2088F;
            iVar.getClass();
            return i % i2;
        }
        int i3 = this.J.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int b2 = q2.b(i);
        if (b2 != -1) {
            int i4 = this.f2088F;
            iVar.getClass();
            return b2 % i4;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, k0.K
    public final int n(X x2) {
        return H0(x2);
    }

    public final int n1(int i, Q q2, X x2) {
        boolean z2 = x2.f3427g;
        i iVar = this.f2092K;
        if (!z2) {
            iVar.getClass();
            return 1;
        }
        int i2 = this.f2091I.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (q2.b(i) != -1) {
            iVar.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, k0.K
    public final int o(X x2) {
        return I0(x2);
    }

    public final void o1(View view, int i, boolean z2) {
        int i2;
        int i3;
        r rVar = (r) view.getLayoutParams();
        Rect rect = rVar.f3397b;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) rVar).topMargin + ((ViewGroup.MarginLayoutParams) rVar).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) rVar).leftMargin + ((ViewGroup.MarginLayoutParams) rVar).rightMargin;
        int k1 = k1(rVar.e, rVar.f3586f);
        if (this.f2098p == 1) {
            i3 = K.w(false, k1, i, i5, ((ViewGroup.MarginLayoutParams) rVar).width);
            i2 = K.w(true, this.f2100r.l(), this.f3393m, i4, ((ViewGroup.MarginLayoutParams) rVar).height);
        } else {
            int w2 = K.w(false, k1, i, i4, ((ViewGroup.MarginLayoutParams) rVar).height);
            int w3 = K.w(true, this.f2100r.l(), this.f3392l, i5, ((ViewGroup.MarginLayoutParams) rVar).width);
            i2 = w2;
            i3 = w3;
        }
        L l2 = (L) view.getLayoutParams();
        if (z2 ? A0(view, i3, i2, l2) : y0(view, i3, i2, l2)) {
            view.measure(i3, i2);
        }
    }

    public final void p1(int i) {
        if (i == this.f2088F) {
            return;
        }
        this.f2087E = true;
        if (i < 1) {
            throw new IllegalArgumentException(h.e("Span count should be at least 1. Provided ", i));
        }
        this.f2088F = i;
        this.f2092K.x();
        p0();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, k0.K
    public final int q0(int i, Q q2, X x2) {
        q1();
        j1();
        return super.q0(i, q2, x2);
    }

    public final void q1() {
        int D2;
        int G2;
        if (this.f2098p == 1) {
            D2 = this.f3394n - F();
            G2 = E();
        } else {
            D2 = this.f3395o - D();
            G2 = G();
        }
        i1(D2 - G2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, k0.K
    public final L r() {
        return this.f2098p == 0 ? new r(-2, -1) : new r(-1, -2);
    }

    @Override // k0.K
    public final L s(Context context, AttributeSet attributeSet) {
        r rVar = new r(context, attributeSet);
        rVar.e = -1;
        rVar.f3586f = 0;
        return rVar;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, k0.K
    public final int s0(int i, Q q2, X x2) {
        q1();
        j1();
        return super.s0(i, q2, x2);
    }

    @Override // k0.K
    public final L t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            r rVar = new r((ViewGroup.MarginLayoutParams) layoutParams);
            rVar.e = -1;
            rVar.f3586f = 0;
            return rVar;
        }
        r rVar2 = new r(layoutParams);
        rVar2.e = -1;
        rVar2.f3586f = 0;
        return rVar2;
    }

    @Override // k0.K
    public final void v0(Rect rect, int i, int i2) {
        int g2;
        int g3;
        if (this.f2089G == null) {
            super.v0(rect, i, i2);
        }
        int F2 = F() + E();
        int D2 = D() + G();
        if (this.f2098p == 1) {
            int height = rect.height() + D2;
            RecyclerView recyclerView = this.f3385b;
            WeakHashMap weakHashMap = O.K.f747a;
            g3 = K.g(i2, height, recyclerView.getMinimumHeight());
            int[] iArr = this.f2089G;
            g2 = K.g(i, iArr[iArr.length - 1] + F2, this.f3385b.getMinimumWidth());
        } else {
            int width = rect.width() + F2;
            RecyclerView recyclerView2 = this.f3385b;
            WeakHashMap weakHashMap2 = O.K.f747a;
            g2 = K.g(i, width, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.f2089G;
            g3 = K.g(i2, iArr2[iArr2.length - 1] + D2, this.f3385b.getMinimumHeight());
        }
        this.f3385b.setMeasuredDimension(g2, g3);
    }

    @Override // k0.K
    public final int x(Q q2, X x2) {
        if (this.f2098p == 1) {
            return this.f2088F;
        }
        if (x2.b() < 1) {
            return 0;
        }
        return l1(x2.b() - 1, q2, x2) + 1;
    }

    public GridLayoutManager(int i) {
        super(1);
        this.f2087E = false;
        this.f2088F = -1;
        this.f2091I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.f2092K = new i(10);
        this.f2093L = new Rect();
        p1(i);
    }

    public GridLayoutManager() {
        super(1);
        this.f2087E = false;
        this.f2088F = -1;
        this.f2091I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.f2092K = new i(10);
        this.f2093L = new Rect();
        p1(2);
    }
}
