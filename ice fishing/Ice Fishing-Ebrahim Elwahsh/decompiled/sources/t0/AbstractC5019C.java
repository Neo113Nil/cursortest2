package t0;

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
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.ads.BP;
import com.google.android.gms.internal.ads.C2830Vl;
import com.google.android.gms.internal.ads.C3288h1;
import g1.C4523c;
import g1.C4524d;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m.Q0;
import s0.AbstractC4987a;

/* renamed from: t0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5019C {

    /* renamed from: a, reason: collision with root package name */
    public Q0 f40562a;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f40563b;

    /* renamed from: c, reason: collision with root package name */
    public final S0.c f40564c;

    /* renamed from: d, reason: collision with root package name */
    public final S0.c f40565d;

    /* renamed from: e, reason: collision with root package name */
    public C5056s f40566e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f40567f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f40568g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f40569h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public int f40570j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f40571k;

    /* renamed from: l, reason: collision with root package name */
    public int f40572l;

    /* renamed from: m, reason: collision with root package name */
    public int f40573m;

    /* renamed from: n, reason: collision with root package name */
    public int f40574n;

    /* renamed from: o, reason: collision with root package name */
    public int f40575o;

    public AbstractC5019C() {
        C4523c c4523c = new C4523c(29, this);
        C4524d c4524d = new C4524d(29, this);
        this.f40564c = new S0.c(c4523c);
        this.f40565d = new S0.c(c4524d);
        this.f40567f = false;
        this.f40568g = false;
        this.f40569h = true;
        this.i = true;
    }

    public static int A(View view) {
        Rect rect = ((C5020D) view.getLayoutParams()).f40577b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int H(View view) {
        return ((C5020D) view.getLayoutParams()).f40576a.b();
    }

    public static C5018B I(Context context, AttributeSet attributeSet, int i, int i4) {
        C5018B c5018b = new C5018B();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4987a.f40414a, i, i4);
        c5018b.f40558a = obtainStyledAttributes.getInt(0, 1);
        c5018b.f40559b = obtainStyledAttributes.getInt(10, 1);
        c5018b.f40560c = obtainStyledAttributes.getBoolean(9, false);
        c5018b.f40561d = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return c5018b;
    }

    public static boolean M(int i, int i4, int i9) {
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        if (i9 > 0 && i != i9) {
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

    public static void N(View view, int i, int i4, int i9, int i10) {
        C5020D c5020d = (C5020D) view.getLayoutParams();
        Rect rect = c5020d.f40577b;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) c5020d).leftMargin, i4 + rect.top + ((ViewGroup.MarginLayoutParams) c5020d).topMargin, (i9 - rect.right) - ((ViewGroup.MarginLayoutParams) c5020d).rightMargin, (i10 - rect.bottom) - ((ViewGroup.MarginLayoutParams) c5020d).bottomMargin);
    }

    public static int g(int i, int i4, int i9) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i4, i9) : size : Math.min(size, Math.max(i4, i9));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r5 == 1073741824) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int w(int i, int i4, int i9, int i10, boolean z8) {
        int max = Math.max(0, i - i9);
        if (z8) {
            if (i10 < 0) {
                if (i10 == -1) {
                    if (i4 != Integer.MIN_VALUE) {
                        if (i4 != 0) {
                        }
                    }
                    i10 = max;
                }
                i4 = 0;
                i10 = 0;
            }
            i4 = 1073741824;
        } else {
            if (i10 < 0) {
                if (i10 != -1) {
                    if (i10 == -2) {
                        if (i4 == Integer.MIN_VALUE || i4 == 1073741824) {
                            i10 = max;
                            i4 = Integer.MIN_VALUE;
                        } else {
                            i10 = max;
                            i4 = 0;
                        }
                    }
                    i4 = 0;
                    i10 = 0;
                }
                i10 = max;
            }
            i4 = 1073741824;
        }
        return View.MeasureSpec.makeMeasureSpec(i10, i4);
    }

    public static int z(View view) {
        Rect rect = ((C5020D) view.getLayoutParams()).f40577b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public final int B() {
        RecyclerView recyclerView = this.f40563b;
        AbstractC5059v adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.a();
        }
        return 0;
    }

    public final int C() {
        RecyclerView recyclerView = this.f40563b;
        WeakHashMap weakHashMap = O.X.f2240a;
        return recyclerView.getLayoutDirection();
    }

    public final int D() {
        RecyclerView recyclerView = this.f40563b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int E() {
        RecyclerView recyclerView = this.f40563b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int F() {
        RecyclerView recyclerView = this.f40563b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int G() {
        RecyclerView recyclerView = this.f40563b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int J(BP bp, C5029M c5029m) {
        RecyclerView recyclerView = this.f40563b;
        if (recyclerView == null || recyclerView.f5328D == null || !e()) {
            return 1;
        }
        return this.f40563b.f5328D.a();
    }

    public final void K(Rect rect, View view) {
        Matrix matrix;
        Rect rect2 = ((C5020D) view.getLayoutParams()).f40577b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f40563b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f40563b.f5327C;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public abstract boolean L();

    public void O(int i) {
        RecyclerView recyclerView = this.f40563b;
        if (recyclerView != null) {
            int e6 = recyclerView.f5382x.e();
            for (int i4 = 0; i4 < e6; i4++) {
                recyclerView.f5382x.d(i4).offsetLeftAndRight(i);
            }
        }
    }

    public void P(int i) {
        RecyclerView recyclerView = this.f40563b;
        if (recyclerView != null) {
            int e6 = recyclerView.f5382x.e();
            for (int i4 = 0; i4 < e6; i4++) {
                recyclerView.f5382x.d(i4).offsetTopAndBottom(i);
            }
        }
    }

    public abstract void R(RecyclerView recyclerView);

    public abstract View S(View view, int i, BP bp, C5029M c5029m);

    public void T(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f40563b;
        BP bp = recyclerView.f5376u;
        if (accessibilityEvent == null) {
            return;
        }
        boolean z8 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f40563b.canScrollVertically(-1) && !this.f40563b.canScrollHorizontally(-1) && !this.f40563b.canScrollHorizontally(1)) {
            z8 = false;
        }
        accessibilityEvent.setScrollable(z8);
        AbstractC5059v abstractC5059v = this.f40563b.f5328D;
        if (abstractC5059v != null) {
            accessibilityEvent.setItemCount(abstractC5059v.a());
        }
    }

    public final void U(View view, P.k kVar) {
        AbstractC5032P I2 = RecyclerView.I(view);
        if (I2 == null || I2.h() || ((ArrayList) this.f40562a.f39327d).contains(I2.f40615a)) {
            return;
        }
        RecyclerView recyclerView = this.f40563b;
        V(recyclerView.f5376u, recyclerView.f5339I0, view, kVar);
    }

    public void V(BP bp, C5029M c5029m, View view, P.k kVar) {
        kVar.j(P.j.a(e() ? H(view) : 0, 1, d() ? H(view) : 0, 1, false));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(View view, int i, boolean z8) {
        int d2;
        AbstractC5032P I2 = RecyclerView.I(view);
        if (z8 || I2.h()) {
            s.k kVar = (s.k) this.f40563b.f5384y.f2891u;
            Z z9 = (Z) kVar.getOrDefault(I2, null);
            if (z9 == null) {
                z9 = Z.a();
                kVar.put(I2, z9);
            }
            z9.f40664a |= 1;
        } else {
            this.f40563b.f5384y.o(I2);
        }
        C5020D c5020d = (C5020D) view.getLayoutParams();
        if (I2.p() || I2.i()) {
            if (I2.i()) {
                I2.f40627n.j(I2);
            } else {
                I2.f40623j &= -33;
            }
            this.f40562a.b(view, i, view.getLayoutParams(), false);
        } else {
            if (view.getParent() == this.f40563b) {
                Q0 q02 = this.f40562a;
                int indexOfChild = ((RecyclerView) ((C4524d) q02.f39325b).f37858u).indexOfChild(view);
                if (indexOfChild != -1) {
                    C3288h1 c3288h1 = (C3288h1) q02.f39326c;
                    if (!c3288h1.f(indexOfChild)) {
                        d2 = indexOfChild - c3288h1.d(indexOfChild);
                        if (i == -1) {
                            i = this.f40562a.e();
                        }
                        if (d2 != -1) {
                            throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f40563b.indexOfChild(view) + this.f40563b.y());
                        }
                        if (d2 != i) {
                            AbstractC5019C abstractC5019C = this.f40563b.f5330E;
                            View u7 = abstractC5019C.u(d2);
                            if (u7 == null) {
                                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + d2 + abstractC5019C.f40563b.toString());
                            }
                            abstractC5019C.u(d2);
                            abstractC5019C.f40562a.c(d2);
                            C5020D c5020d2 = (C5020D) u7.getLayoutParams();
                            AbstractC5032P I8 = RecyclerView.I(u7);
                            if (I8.h()) {
                                s.k kVar2 = (s.k) abstractC5019C.f40563b.f5384y.f2891u;
                                Z z10 = (Z) kVar2.getOrDefault(I8, null);
                                if (z10 == null) {
                                    z10 = Z.a();
                                    kVar2.put(I8, z10);
                                }
                                z10.f40664a = 1 | z10.f40664a;
                            } else {
                                abstractC5019C.f40563b.f5384y.o(I8);
                            }
                            abstractC5019C.f40562a.b(u7, i, c5020d2, I8.h());
                        }
                    }
                }
                d2 = -1;
                if (i == -1) {
                }
                if (d2 != -1) {
                }
            } else {
                this.f40562a.a(view, i, false);
                c5020d.f40578c = true;
                C5056s c5056s = this.f40566e;
                if (c5056s != null && c5056s.f40783e) {
                    c5056s.f40780b.getClass();
                    AbstractC5032P I9 = RecyclerView.I(view);
                    if ((I9 != null ? I9.b() : -1) == c5056s.f40779a) {
                        c5056s.f40784f = view;
                    }
                }
            }
        }
        if (c5020d.f40579d) {
            I2.f40615a.invalidate();
            c5020d.f40579d = false;
        }
    }

    public abstract void b0(BP bp, C5029M c5029m);

    public void c(String str) {
        RecyclerView recyclerView = this.f40563b;
        if (recyclerView != null) {
            recyclerView.i(str);
        }
    }

    public abstract void c0(C5029M c5029m);

    public abstract boolean d();

    public abstract boolean e();

    public Parcelable e0() {
        return null;
    }

    public boolean f(C5020D c5020d) {
        return c5020d != null;
    }

    public final void g0(BP bp) {
        for (int v6 = v() - 1; v6 >= 0; v6--) {
            if (!RecyclerView.I(u(v6)).o()) {
                View u7 = u(v6);
                j0(v6);
                bp.f(u7);
            }
        }
    }

    public final void h0(BP bp) {
        ArrayList arrayList;
        int size = ((ArrayList) bp.f24037c).size();
        int i = size - 1;
        while (true) {
            arrayList = (ArrayList) bp.f24037c;
            if (i < 0) {
                break;
            }
            View view = ((AbstractC5032P) arrayList.get(i)).f40615a;
            AbstractC5032P I2 = RecyclerView.I(view);
            if (!I2.o()) {
                I2.n(false);
                if (I2.j()) {
                    this.f40563b.removeDetachedView(view, false);
                }
                AbstractC5063z abstractC5063z = this.f40563b.f5372q0;
                if (abstractC5063z != null) {
                    abstractC5063z.d(I2);
                }
                I2.n(true);
                AbstractC5032P I8 = RecyclerView.I(view);
                I8.f40627n = null;
                I8.f40628o = false;
                I8.f40623j &= -33;
                bp.g(I8);
            }
            i--;
        }
        arrayList.clear();
        ArrayList arrayList2 = (ArrayList) bp.f24038d;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f40563b.invalidate();
        }
    }

    public final void i0(View view, BP bp) {
        Q0 q02 = this.f40562a;
        C4524d c4524d = (C4524d) q02.f39325b;
        int indexOfChild = ((RecyclerView) c4524d.f37858u).indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((C3288h1) q02.f39326c).l(indexOfChild)) {
                q02.s(view);
            }
            c4524d.H(indexOfChild);
        }
        bp.f(view);
    }

    public abstract int j(C5029M c5029m);

    public final void j0(int i) {
        if (u(i) != null) {
            Q0 q02 = this.f40562a;
            int j9 = q02.j(i);
            C4524d c4524d = (C4524d) q02.f39325b;
            View childAt = ((RecyclerView) c4524d.f37858u).getChildAt(j9);
            if (childAt == null) {
                return;
            }
            if (((C3288h1) q02.f39326c).l(j9)) {
                q02.s(childAt);
            }
            c4524d.H(j9);
        }
    }

    public abstract int k(C5029M c5029m);

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ab, code lost:
    
        if ((r5.bottom - r10) > r2) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean k0(RecyclerView recyclerView, View view, Rect rect, boolean z8, boolean z9) {
        int E8 = E();
        int G7 = G();
        int F8 = this.f40574n - F();
        int D8 = this.f40575o - D();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int width = rect.width() + left;
        int height = rect.height() + top;
        int i = left - E8;
        int min = Math.min(0, i);
        int i4 = top - G7;
        int min2 = Math.min(0, i4);
        int i9 = width - F8;
        int max = Math.max(0, i9);
        int max2 = Math.max(0, height - D8);
        if (C() != 1) {
            if (min == 0) {
                min = Math.min(i, max);
            }
            max = min;
        } else if (max == 0) {
            max = Math.max(min, i9);
        }
        if (min2 == 0) {
            min2 = Math.min(i4, max2);
        }
        int[] iArr = {max, min2};
        int i10 = iArr[0];
        int i11 = iArr[1];
        if (z9) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int E9 = E();
                int G8 = G();
                int F9 = this.f40574n - F();
                int D9 = this.f40575o - D();
                Rect rect2 = this.f40563b.f5323A;
                y(rect2, focusedChild);
                if (rect2.left - i10 < F9) {
                    if (rect2.right - i10 > E9) {
                        if (rect2.top - i11 < D9) {
                        }
                    }
                }
            }
            return false;
        }
        if (i10 != 0 || i11 != 0) {
            if (z8) {
                recyclerView.scrollBy(i10, i11);
                return true;
            }
            recyclerView.Z(i10, i11, false);
            return true;
        }
        return false;
    }

    public abstract int l(C5029M c5029m);

    public final void l0() {
        RecyclerView recyclerView = this.f40563b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract int m(C5029M c5029m);

    public abstract int m0(int i, BP bp, C5029M c5029m);

    public abstract int n(C5029M c5029m);

    public abstract void n0(int i);

    public abstract int o(C5029M c5029m);

    public abstract int o0(int i, BP bp, C5029M c5029m);

    public final void p(BP bp) {
        for (int v6 = v() - 1; v6 >= 0; v6--) {
            View u7 = u(v6);
            AbstractC5032P I2 = RecyclerView.I(u7);
            if (!I2.o()) {
                if (!I2.f() || I2.h() || this.f40563b.f5328D.f40800b) {
                    u(v6);
                    this.f40562a.c(v6);
                    bp.h(u7);
                    this.f40563b.f5384y.o(I2);
                } else {
                    j0(v6);
                    bp.g(I2);
                }
            }
        }
    }

    public final void p0(RecyclerView recyclerView) {
        q0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public View q(int i) {
        int v6 = v();
        for (int i4 = 0; i4 < v6; i4++) {
            View u7 = u(i4);
            AbstractC5032P I2 = RecyclerView.I(u7);
            if (I2 != null && I2.b() == i && !I2.o() && (this.f40563b.f5339I0.f40600g || !I2.h())) {
                return u7;
            }
        }
        return null;
    }

    public final void q0(int i, int i4) {
        this.f40574n = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.f40572l = mode;
        if (mode == 0) {
            int[] iArr = RecyclerView.f5320Y0;
        }
        this.f40575o = View.MeasureSpec.getSize(i4);
        int mode2 = View.MeasureSpec.getMode(i4);
        this.f40573m = mode2;
        if (mode2 == 0) {
            int[] iArr2 = RecyclerView.f5320Y0;
        }
    }

    public abstract C5020D r();

    public void r0(Rect rect, int i, int i4) {
        int F8 = F() + E() + rect.width();
        int D8 = D() + G() + rect.height();
        RecyclerView recyclerView = this.f40563b;
        WeakHashMap weakHashMap = O.X.f2240a;
        this.f40563b.setMeasuredDimension(g(i, F8, recyclerView.getMinimumWidth()), g(i4, D8, this.f40563b.getMinimumHeight()));
    }

    public C5020D s(Context context, AttributeSet attributeSet) {
        return new C5020D(context, attributeSet);
    }

    public final void s0(int i, int i4) {
        int v6 = v();
        if (v6 == 0) {
            this.f40563b.n(i, i4);
            return;
        }
        int i9 = Integer.MIN_VALUE;
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MIN_VALUE;
        int i12 = Integer.MAX_VALUE;
        for (int i13 = 0; i13 < v6; i13++) {
            View u7 = u(i13);
            Rect rect = this.f40563b.f5323A;
            y(rect, u7);
            int i14 = rect.left;
            if (i14 < i12) {
                i12 = i14;
            }
            int i15 = rect.right;
            if (i15 > i9) {
                i9 = i15;
            }
            int i16 = rect.top;
            if (i16 < i10) {
                i10 = i16;
            }
            int i17 = rect.bottom;
            if (i17 > i11) {
                i11 = i17;
            }
        }
        this.f40563b.f5323A.set(i12, i10, i9, i11);
        r0(this.f40563b.f5323A, i, i4);
    }

    public C5020D t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C5020D ? new C5020D((C5020D) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C5020D((ViewGroup.MarginLayoutParams) layoutParams) : new C5020D(layoutParams);
    }

    public final void t0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f40563b = null;
            this.f40562a = null;
            this.f40574n = 0;
            this.f40575o = 0;
        } else {
            this.f40563b = recyclerView;
            this.f40562a = recyclerView.f5382x;
            this.f40574n = recyclerView.getWidth();
            this.f40575o = recyclerView.getHeight();
        }
        this.f40572l = 1073741824;
        this.f40573m = 1073741824;
    }

    public final View u(int i) {
        Q0 q02 = this.f40562a;
        if (q02 != null) {
            return q02.d(i);
        }
        return null;
    }

    public final boolean u0(View view, int i, int i4, C5020D c5020d) {
        return (!view.isLayoutRequested() && this.f40569h && M(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) c5020d).width) && M(view.getHeight(), i4, ((ViewGroup.MarginLayoutParams) c5020d).height)) ? false : true;
    }

    public final int v() {
        Q0 q02 = this.f40562a;
        if (q02 != null) {
            return q02.e();
        }
        return 0;
    }

    public boolean v0() {
        return false;
    }

    public final boolean w0(View view, int i, int i4, C5020D c5020d) {
        return (this.f40569h && M(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) c5020d).width) && M(view.getMeasuredHeight(), i4, ((ViewGroup.MarginLayoutParams) c5020d).height)) ? false : true;
    }

    public int x(BP bp, C5029M c5029m) {
        RecyclerView recyclerView = this.f40563b;
        if (recyclerView == null || recyclerView.f5328D == null || !d()) {
            return 1;
        }
        return this.f40563b.f5328D.a();
    }

    public abstract void x0(RecyclerView recyclerView, int i);

    public void y(Rect rect, View view) {
        int[] iArr = RecyclerView.f5320Y0;
        C5020D c5020d = (C5020D) view.getLayoutParams();
        Rect rect2 = c5020d.f40577b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c5020d).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c5020d).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c5020d).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c5020d).bottomMargin);
    }

    public final void y0(C5056s c5056s) {
        C5056s c5056s2 = this.f40566e;
        if (c5056s2 != null && c5056s != c5056s2 && c5056s2.f40783e) {
            c5056s2.i();
        }
        this.f40566e = c5056s;
        RecyclerView recyclerView = this.f40563b;
        RunnableC5031O runnableC5031O = recyclerView.f5333F0;
        runnableC5031O.f40613z.removeCallbacks(runnableC5031O);
        runnableC5031O.f40609v.abortAnimation();
        if (c5056s.f40786h) {
            Log.w("RecyclerView", "An instance of " + c5056s.getClass().getSimpleName() + " was started more than once. Each instance of" + c5056s.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        c5056s.f40780b = recyclerView;
        c5056s.f40781c = this;
        int i = c5056s.f40779a;
        if (i == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.f5339I0.f40594a = i;
        c5056s.f40783e = true;
        c5056s.f40782d = true;
        c5056s.f40784f = recyclerView.f5330E.q(i);
        c5056s.f40780b.f5333F0.a();
        c5056s.f40786h = true;
    }

    public boolean z0() {
        return false;
    }

    public void X() {
    }

    public void Q(RecyclerView recyclerView) {
    }

    public void d0(Parcelable parcelable) {
    }

    public void f0(int i) {
    }

    public void W(int i, int i4) {
    }

    public void Y(int i, int i4) {
    }

    public void Z(int i, int i4) {
    }

    public void a0(int i, int i4) {
    }

    public void i(int i, C2830Vl c2830Vl) {
    }

    public void h(int i, int i4, C5029M c5029m, C2830Vl c2830Vl) {
    }
}
