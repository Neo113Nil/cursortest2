package k0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import j0.AbstractC0176a;
import java.util.ArrayList;
import java.util.WeakHashMap;
import r.C0342j;

/* loaded from: classes.dex */
public abstract class K {

    /* renamed from: a, reason: collision with root package name */
    public C0190d f3384a;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f3385b;

    /* renamed from: c, reason: collision with root package name */
    public final F.i f3386c;

    /* renamed from: d, reason: collision with root package name */
    public final F.i f3387d;
    public C0209x e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3388f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3389g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f3390h;
    public final boolean i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3391k;

    /* renamed from: l, reason: collision with root package name */
    public int f3392l;

    /* renamed from: m, reason: collision with root package name */
    public int f3393m;

    /* renamed from: n, reason: collision with root package name */
    public int f3394n;

    /* renamed from: o, reason: collision with root package name */
    public int f3395o;

    public K() {
        I i = new I(this, 0);
        I i2 = new I(this, 1);
        this.f3386c = new F.i(i);
        this.f3387d = new F.i(i2);
        this.f3388f = false;
        this.f3389g = false;
        this.f3390h = true;
        this.i = true;
    }

    public static int A(View view) {
        Rect rect = ((L) view.getLayoutParams()).f3397b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int H(View view) {
        return ((L) view.getLayoutParams()).f3396a.c();
    }

    public static J I(Context context, AttributeSet attributeSet, int i, int i2) {
        J j = new J();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0176a.f3308a, i, i2);
        j.f3380a = obtainStyledAttributes.getInt(0, 1);
        j.f3381b = obtainStyledAttributes.getInt(10, 1);
        j.f3382c = obtainStyledAttributes.getBoolean(9, false);
        j.f3383d = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return j;
    }

    public static boolean M(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    public static void N(View view, int i, int i2, int i3, int i4) {
        L l2 = (L) view.getLayoutParams();
        Rect rect = l2.f3397b;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) l2).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) l2).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) l2).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) l2).bottomMargin);
    }

    public static int g(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r6 == 1073741824) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int w(boolean z2, int i, int i2, int i3, int i4) {
        int max = Math.max(0, i - i3);
        if (z2) {
            if (i4 < 0) {
                if (i4 == -1) {
                    if (i2 != Integer.MIN_VALUE) {
                        if (i2 != 0) {
                        }
                    }
                    i4 = max;
                }
                i2 = 0;
                i4 = 0;
            }
            i2 = 1073741824;
        } else {
            if (i4 < 0) {
                if (i4 != -1) {
                    if (i4 == -2) {
                        if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
                            i4 = max;
                            i2 = Integer.MIN_VALUE;
                        } else {
                            i4 = max;
                            i2 = 0;
                        }
                    }
                    i2 = 0;
                    i4 = 0;
                }
                i4 = max;
            }
            i2 = 1073741824;
        }
        return View.MeasureSpec.makeMeasureSpec(i4, i2);
    }

    public static int z(View view) {
        Rect rect = ((L) view.getLayoutParams()).f3397b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public final boolean A0(View view, int i, int i2, L l2) {
        return (this.f3390h && M(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) l2).width) && M(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) l2).height)) ? false : true;
    }

    public final int B() {
        RecyclerView recyclerView = this.f3385b;
        C adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.a();
        }
        return 0;
    }

    public abstract void B0(RecyclerView recyclerView, int i);

    public final int C() {
        RecyclerView recyclerView = this.f3385b;
        WeakHashMap weakHashMap = O.K.f747a;
        return recyclerView.getLayoutDirection();
    }

    public final void C0(C0209x c0209x) {
        C0209x c0209x2 = this.e;
        if (c0209x2 != null && c0209x != c0209x2 && c0209x2.e) {
            c0209x2.i();
        }
        this.e = c0209x;
        RecyclerView recyclerView = this.f3385b;
        a0 a0Var = recyclerView.f2146d0;
        a0Var.f3442g.removeCallbacks(a0Var);
        a0Var.f3439c.abortAnimation();
        if (c0209x.f3620h) {
            Log.w("RecyclerView", "An instance of " + c0209x.getClass().getSimpleName() + " was started more than once. Each instance of" + c0209x.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        c0209x.f3615b = recyclerView;
        c0209x.f3616c = this;
        int i = c0209x.f3614a;
        if (i == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.f2151g0.f3422a = i;
        c0209x.e = true;
        c0209x.f3617d = true;
        c0209x.f3618f = recyclerView.f2162n.q(i);
        c0209x.f3615b.f2146d0.b();
        c0209x.f3620h = true;
    }

    public final int D() {
        RecyclerView recyclerView = this.f3385b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public boolean D0() {
        return false;
    }

    public final int E() {
        RecyclerView recyclerView = this.f3385b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int F() {
        RecyclerView recyclerView = this.f3385b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int G() {
        RecyclerView recyclerView = this.f3385b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int J(Q q2, X x2) {
        return -1;
    }

    public final void K(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((L) view.getLayoutParams()).f3397b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f3385b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f3385b.f2158l;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public abstract boolean L();

    public void O(View view) {
        L l2 = (L) view.getLayoutParams();
        Rect M2 = this.f3385b.M(view);
        int i = M2.left + M2.right;
        int i2 = M2.top + M2.bottom;
        int w2 = w(d(), this.f3394n, this.f3392l, F() + E() + ((ViewGroup.MarginLayoutParams) l2).leftMargin + ((ViewGroup.MarginLayoutParams) l2).rightMargin + i, ((ViewGroup.MarginLayoutParams) l2).width);
        int w3 = w(e(), this.f3395o, this.f3393m, D() + G() + ((ViewGroup.MarginLayoutParams) l2).topMargin + ((ViewGroup.MarginLayoutParams) l2).bottomMargin + i2, ((ViewGroup.MarginLayoutParams) l2).height);
        if (y0(view, w2, w3, l2)) {
            view.measure(w2, w3);
        }
    }

    public void P(int i) {
        RecyclerView recyclerView = this.f3385b;
        if (recyclerView != null) {
            int e = recyclerView.f2148f.e();
            for (int i2 = 0; i2 < e; i2++) {
                recyclerView.f2148f.d(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void Q(int i) {
        RecyclerView recyclerView = this.f3385b;
        if (recyclerView != null) {
            int e = recyclerView.f2148f.e();
            for (int i2 = 0; i2 < e; i2++) {
                recyclerView.f2148f.d(i2).offsetTopAndBottom(i);
            }
        }
    }

    public void R() {
    }

    public void S(RecyclerView recyclerView) {
    }

    public abstract void T(RecyclerView recyclerView);

    public abstract View U(View view, int i, Q q2, X x2);

    public void V(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f3385b;
        Q q2 = recyclerView.f2143c;
        if (accessibilityEvent == null) {
            return;
        }
        boolean z2 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f3385b.canScrollVertically(-1) && !this.f3385b.canScrollHorizontally(-1) && !this.f3385b.canScrollHorizontally(1)) {
            z2 = false;
        }
        accessibilityEvent.setScrollable(z2);
        C c2 = this.f3385b.f2160m;
        if (c2 != null) {
            accessibilityEvent.setItemCount(c2.a());
        }
    }

    public void W(Q q2, X x2, P.f fVar) {
        boolean canScrollVertically = this.f3385b.canScrollVertically(-1);
        AccessibilityNodeInfo accessibilityNodeInfo = fVar.f891a;
        if (canScrollVertically || this.f3385b.canScrollHorizontally(-1)) {
            fVar.a(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (this.f3385b.canScrollVertically(1) || this.f3385b.canScrollHorizontally(1)) {
            fVar.a(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(J(q2, x2), x(q2, x2), false, 0));
    }

    public final void X(View view, P.f fVar) {
        b0 L2 = RecyclerView.L(view);
        if (L2 == null || L2.j() || this.f3384a.f3471c.contains(L2.f3449a)) {
            return;
        }
        RecyclerView recyclerView = this.f3385b;
        Y(recyclerView.f2143c, recyclerView.f2151g0, view, fVar);
    }

    public void Y(Q q2, X x2, View view, P.f fVar) {
    }

    public void Z(int i, int i2) {
    }

    public void a0() {
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(View view, int i, boolean z2) {
        int b2;
        b0 L2 = RecyclerView.L(view);
        if (z2 || L2.j()) {
            C0342j c0342j = (C0342j) this.f3385b.f2150g.f208b;
            l0 l0Var = (l0) c0342j.get(L2);
            if (l0Var == null) {
                l0Var = l0.a();
                c0342j.put(L2, l0Var);
            }
            l0Var.f3541a |= 1;
        } else {
            this.f3385b.f2150g.G(L2);
        }
        L l2 = (L) view.getLayoutParams();
        if (L2.r() || L2.k()) {
            if (L2.k()) {
                L2.f3459n.l(L2);
            } else {
                L2.j &= -33;
            }
            this.f3384a.b(view, i, view.getLayoutParams(), false);
        } else {
            if (view.getParent() == this.f3385b) {
                C0190d c0190d = this.f3384a;
                int indexOfChild = c0190d.f3469a.f3369a.indexOfChild(view);
                if (indexOfChild != -1) {
                    C0189c c0189c = c0190d.f3470b;
                    if (!c0189c.d(indexOfChild)) {
                        b2 = indexOfChild - c0189c.b(indexOfChild);
                        if (i == -1) {
                            i = this.f3384a.e();
                        }
                        if (b2 != -1) {
                            StringBuilder sb = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                            sb.append(this.f3385b.indexOfChild(view));
                            throw new IllegalStateException(D1.h.d(this.f3385b, sb));
                        }
                        if (b2 != i) {
                            K k2 = this.f3385b.f2162n;
                            View u2 = k2.u(b2);
                            if (u2 == null) {
                                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + b2 + k2.f3385b.toString());
                            }
                            k2.u(b2);
                            k2.f3384a.c(b2);
                            L l3 = (L) u2.getLayoutParams();
                            b0 L3 = RecyclerView.L(u2);
                            if (L3.j()) {
                                C0342j c0342j2 = (C0342j) k2.f3385b.f2150g.f208b;
                                l0 l0Var2 = (l0) c0342j2.get(L3);
                                if (l0Var2 == null) {
                                    l0Var2 = l0.a();
                                    c0342j2.put(L3, l0Var2);
                                }
                                l0Var2.f3541a = 1 | l0Var2.f3541a;
                            } else {
                                k2.f3385b.f2150g.G(L3);
                            }
                            k2.f3384a.b(u2, i, l3, L3.j());
                        }
                    }
                }
                b2 = -1;
                if (i == -1) {
                }
                if (b2 != -1) {
                }
            } else {
                this.f3384a.a(view, i, false);
                l2.f3398c = true;
                C0209x c0209x = this.e;
                if (c0209x != null && c0209x.e) {
                    c0209x.f3615b.getClass();
                    b0 L4 = RecyclerView.L(view);
                    if ((L4 != null ? L4.c() : -1) == c0209x.f3614a) {
                        c0209x.f3618f = view;
                        if (RecyclerView.f2109A0) {
                            Log.d("RecyclerView", "smooth scroll target view has been attached");
                        }
                    }
                }
            }
        }
        if (l2.f3399d) {
            if (RecyclerView.f2109A0) {
                Log.d("RecyclerView", "consuming pending invalidate on child " + l2.f3396a);
            }
            L2.f3449a.invalidate();
            l2.f3399d = false;
        }
    }

    public void b0(int i, int i2) {
    }

    public void c(String str) {
        RecyclerView recyclerView = this.f3385b;
        if (recyclerView != null) {
            recyclerView.k(str);
        }
    }

    public void c0(int i, int i2) {
    }

    public abstract boolean d();

    public void d0(int i, int i2) {
    }

    public abstract boolean e();

    public abstract void e0(Q q2, X x2);

    public boolean f(L l2) {
        return l2 != null;
    }

    public abstract void f0(X x2);

    public void g0(Q q2, X x2, int i, int i2) {
        this.f3385b.q(i, i2);
    }

    public void h(int i, int i2, X x2, C0201o c0201o) {
    }

    public void h0(Parcelable parcelable) {
    }

    public void i(int i, C0201o c0201o) {
    }

    public Parcelable i0() {
        return null;
    }

    public abstract int j(X x2);

    public void j0(int i) {
    }

    public abstract int k(X x2);

    public final void k0(Q q2) {
        for (int v2 = v() - 1; v2 >= 0; v2--) {
            if (!RecyclerView.L(u(v2)).q()) {
                View u2 = u(v2);
                n0(v2);
                q2.h(u2);
            }
        }
    }

    public abstract int l(X x2);

    public final void l0(Q q2) {
        ArrayList arrayList;
        int size = q2.f3407a.size();
        int i = size - 1;
        while (true) {
            arrayList = q2.f3407a;
            if (i < 0) {
                break;
            }
            View view = ((b0) arrayList.get(i)).f3449a;
            b0 L2 = RecyclerView.L(view);
            if (!L2.q()) {
                L2.p(false);
                if (L2.l()) {
                    this.f3385b.removeDetachedView(view, false);
                }
                G g2 = this.f3385b.f2127L;
                if (g2 != null) {
                    g2.d(L2);
                }
                L2.p(true);
                b0 L3 = RecyclerView.L(view);
                L3.f3459n = null;
                L3.f3460o = false;
                L3.j &= -33;
                q2.i(L3);
            }
            i--;
        }
        arrayList.clear();
        ArrayList arrayList2 = q2.f3408b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f3385b.invalidate();
        }
    }

    public abstract int m(X x2);

    public final void m0(View view, Q q2) {
        C0190d c0190d = this.f3384a;
        B b2 = c0190d.f3469a;
        int i = c0190d.f3472d;
        if (i == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            c0190d.f3472d = 1;
            c0190d.e = view;
            int indexOfChild = b2.f3369a.indexOfChild(view);
            if (indexOfChild >= 0) {
                if (c0190d.f3470b.f(indexOfChild)) {
                    c0190d.j(view);
                }
                b2.h(indexOfChild);
            }
            c0190d.f3472d = 0;
            c0190d.e = null;
            q2.h(view);
        } catch (Throwable th) {
            c0190d.f3472d = 0;
            c0190d.e = null;
            throw th;
        }
    }

    public abstract int n(X x2);

    public final void n0(int i) {
        if (u(i) != null) {
            C0190d c0190d = this.f3384a;
            B b2 = c0190d.f3469a;
            int i2 = c0190d.f3472d;
            if (i2 == 1) {
                throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
            }
            if (i2 == 2) {
                throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
            }
            try {
                int f2 = c0190d.f(i);
                View childAt = b2.f3369a.getChildAt(f2);
                if (childAt != null) {
                    c0190d.f3472d = 1;
                    c0190d.e = childAt;
                    if (c0190d.f3470b.f(f2)) {
                        c0190d.j(childAt);
                    }
                    b2.h(f2);
                }
            } finally {
                c0190d.f3472d = 0;
                c0190d.e = null;
            }
        }
    }

    public abstract int o(X x2);

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ab, code lost:
    
        if ((r5.bottom - r10) > r2) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean o0(RecyclerView recyclerView, View view, Rect rect, boolean z2, boolean z3) {
        int E2 = E();
        int G2 = G();
        int F2 = this.f3394n - F();
        int D2 = this.f3395o - D();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int width = rect.width() + left;
        int height = rect.height() + top;
        int i = left - E2;
        int min = Math.min(0, i);
        int i2 = top - G2;
        int min2 = Math.min(0, i2);
        int i3 = width - F2;
        int max = Math.max(0, i3);
        int max2 = Math.max(0, height - D2);
        if (C() != 1) {
            if (min == 0) {
                min = Math.min(i, max);
            }
            max = min;
        } else if (max == 0) {
            max = Math.max(min, i3);
        }
        if (min2 == 0) {
            min2 = Math.min(i2, max2);
        }
        int[] iArr = {max, min2};
        int i4 = iArr[0];
        int i5 = iArr[1];
        if (z3) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int E3 = E();
                int G3 = G();
                int F3 = this.f3394n - F();
                int D3 = this.f3395o - D();
                Rect rect2 = this.f3385b.j;
                y(focusedChild, rect2);
                if (rect2.left - i4 < F3) {
                    if (rect2.right - i4 > E3) {
                        if (rect2.top - i5 < D3) {
                        }
                    }
                }
            }
            return false;
        }
        if (i4 != 0 || i5 != 0) {
            if (z2) {
                recyclerView.scrollBy(i4, i5);
            } else {
                recyclerView.h0(i4, i5, false);
            }
            return true;
        }
        return false;
    }

    public final void p(Q q2) {
        for (int v2 = v() - 1; v2 >= 0; v2--) {
            View u2 = u(v2);
            b0 L2 = RecyclerView.L(u2);
            if (L2.q()) {
                if (RecyclerView.f2109A0) {
                    Log.d("RecyclerView", "ignoring view " + L2);
                }
            } else if (!L2.h() || L2.j() || this.f3385b.f2160m.f3371b) {
                u(v2);
                this.f3384a.c(v2);
                q2.j(u2);
                this.f3385b.f2150g.G(L2);
            } else {
                n0(v2);
                q2.i(L2);
            }
        }
    }

    public final void p0() {
        RecyclerView recyclerView = this.f3385b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public View q(int i) {
        int v2 = v();
        for (int i2 = 0; i2 < v2; i2++) {
            View u2 = u(i2);
            b0 L2 = RecyclerView.L(u2);
            if (L2 != null && L2.c() == i && !L2.q() && (this.f3385b.f2151g0.f3427g || !L2.j())) {
                return u2;
            }
        }
        return null;
    }

    public abstract int q0(int i, Q q2, X x2);

    public abstract L r();

    public abstract void r0(int i);

    public L s(Context context, AttributeSet attributeSet) {
        return new L(context, attributeSet);
    }

    public abstract int s0(int i, Q q2, X x2);

    public L t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof L ? new L((L) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new L((ViewGroup.MarginLayoutParams) layoutParams) : new L(layoutParams);
    }

    public final void t0(RecyclerView recyclerView) {
        u0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public final View u(int i) {
        C0190d c0190d = this.f3384a;
        if (c0190d != null) {
            return c0190d.d(i);
        }
        return null;
    }

    public final void u0(int i, int i2) {
        this.f3394n = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.f3392l = mode;
        if (mode == 0 && !RecyclerView.f2112D0) {
            this.f3394n = 0;
        }
        this.f3395o = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.f3393m = mode2;
        if (mode2 != 0 || RecyclerView.f2112D0) {
            return;
        }
        this.f3395o = 0;
    }

    public final int v() {
        C0190d c0190d = this.f3384a;
        if (c0190d != null) {
            return c0190d.e();
        }
        return 0;
    }

    public void v0(Rect rect, int i, int i2) {
        int F2 = F() + E() + rect.width();
        int D2 = D() + G() + rect.height();
        RecyclerView recyclerView = this.f3385b;
        WeakHashMap weakHashMap = O.K.f747a;
        this.f3385b.setMeasuredDimension(g(i, F2, recyclerView.getMinimumWidth()), g(i2, D2, this.f3385b.getMinimumHeight()));
    }

    public final void w0(int i, int i2) {
        int v2 = v();
        if (v2 == 0) {
            this.f3385b.q(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < v2; i7++) {
            View u2 = u(i7);
            Rect rect = this.f3385b.j;
            y(u2, rect);
            int i8 = rect.left;
            if (i8 < i6) {
                i6 = i8;
            }
            int i9 = rect.right;
            if (i9 > i3) {
                i3 = i9;
            }
            int i10 = rect.top;
            if (i10 < i4) {
                i4 = i10;
            }
            int i11 = rect.bottom;
            if (i11 > i5) {
                i5 = i11;
            }
        }
        this.f3385b.j.set(i6, i4, i3, i5);
        v0(this.f3385b.j, i, i2);
    }

    public int x(Q q2, X x2) {
        return -1;
    }

    public final void x0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f3385b = null;
            this.f3384a = null;
            this.f3394n = 0;
            this.f3395o = 0;
        } else {
            this.f3385b = recyclerView;
            this.f3384a = recyclerView.f2148f;
            this.f3394n = recyclerView.getWidth();
            this.f3395o = recyclerView.getHeight();
        }
        this.f3392l = 1073741824;
        this.f3393m = 1073741824;
    }

    public void y(View view, Rect rect) {
        boolean z2 = RecyclerView.z0;
        L l2 = (L) view.getLayoutParams();
        Rect rect2 = l2.f3397b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) l2).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) l2).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) l2).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) l2).bottomMargin);
    }

    public final boolean y0(View view, int i, int i2, L l2) {
        return (!view.isLayoutRequested() && this.f3390h && M(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) l2).width) && M(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) l2).height)) ? false : true;
    }

    public boolean z0() {
        return false;
    }
}
