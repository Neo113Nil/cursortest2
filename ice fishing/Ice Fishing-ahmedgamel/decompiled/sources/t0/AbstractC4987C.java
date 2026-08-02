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
import com.google.android.gms.internal.ads.C2817Tl;
import com.google.android.gms.internal.ads.C3404j1;
import com.google.android.gms.internal.ads.C3698oP;
import com.google.android.gms.internal.ads.LP;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l.C4659e;
import m.R0;
import s0.AbstractC4915a;

/* renamed from: t0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4987C {

    /* renamed from: a, reason: collision with root package name */
    public l4.g f40590a;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f40591b;

    /* renamed from: c, reason: collision with root package name */
    public final LP f40592c;

    /* renamed from: d, reason: collision with root package name */
    public final LP f40593d;

    /* renamed from: e, reason: collision with root package name */
    public C5022r f40594e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f40595f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f40596g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f40597h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public int f40598j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f40599k;

    /* renamed from: l, reason: collision with root package name */
    public int f40600l;

    /* renamed from: m, reason: collision with root package name */
    public int f40601m;

    /* renamed from: n, reason: collision with root package name */
    public int f40602n;

    /* renamed from: o, reason: collision with root package name */
    public int f40603o;

    public AbstractC4987C() {
        R0 r02 = new R0(this);
        C4659e c4659e = new C4659e(7, this);
        this.f40592c = new LP(r02);
        this.f40593d = new LP(c4659e);
        this.f40595f = false;
        this.f40596g = false;
        this.f40597h = true;
        this.i = true;
    }

    public static int A(View view) {
        Rect rect = ((C4988D) view.getLayoutParams()).f40605b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int H(View view) {
        return ((C4988D) view.getLayoutParams()).f40604a.b();
    }

    public static C4986B I(Context context, AttributeSet attributeSet, int i, int i4) {
        C4986B c4986b = new C4986B();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4915a.f40281a, i, i4);
        c4986b.f40586a = obtainStyledAttributes.getInt(0, 1);
        c4986b.f40587b = obtainStyledAttributes.getInt(10, 1);
        c4986b.f40588c = obtainStyledAttributes.getBoolean(9, false);
        c4986b.f40589d = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return c4986b;
    }

    public static boolean M(int i, int i4, int i6) {
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        if (i6 > 0 && i != i6) {
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

    public static void N(View view, int i, int i4, int i6, int i9) {
        C4988D c4988d = (C4988D) view.getLayoutParams();
        Rect rect = c4988d.f40605b;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) c4988d).leftMargin, i4 + rect.top + ((ViewGroup.MarginLayoutParams) c4988d).topMargin, (i6 - rect.right) - ((ViewGroup.MarginLayoutParams) c4988d).rightMargin, (i9 - rect.bottom) - ((ViewGroup.MarginLayoutParams) c4988d).bottomMargin);
    }

    public static int g(int i, int i4, int i6) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i4, i6) : size : Math.min(size, Math.max(i4, i6));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r5 == 1073741824) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int w(int i, int i4, int i6, int i9, boolean z6) {
        int max = Math.max(0, i - i6);
        if (z6) {
            if (i9 < 0) {
                if (i9 == -1) {
                    if (i4 != Integer.MIN_VALUE) {
                        if (i4 != 0) {
                        }
                    }
                    i9 = max;
                }
                i4 = 0;
                i9 = 0;
            }
            i4 = 1073741824;
        } else {
            if (i9 < 0) {
                if (i9 != -1) {
                    if (i9 == -2) {
                        if (i4 == Integer.MIN_VALUE || i4 == 1073741824) {
                            i9 = max;
                            i4 = Integer.MIN_VALUE;
                        } else {
                            i9 = max;
                            i4 = 0;
                        }
                    }
                    i4 = 0;
                    i9 = 0;
                }
                i9 = max;
            }
            i4 = 1073741824;
        }
        return View.MeasureSpec.makeMeasureSpec(i9, i4);
    }

    public static int z(View view) {
        Rect rect = ((C4988D) view.getLayoutParams()).f40605b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public final int B() {
        RecyclerView recyclerView = this.f40591b;
        AbstractC5026v adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.a();
        }
        return 0;
    }

    public final int C() {
        RecyclerView recyclerView = this.f40591b;
        WeakHashMap weakHashMap = O.X.f2142a;
        return recyclerView.getLayoutDirection();
    }

    public final int D() {
        RecyclerView recyclerView = this.f40591b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int E() {
        RecyclerView recyclerView = this.f40591b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int F() {
        RecyclerView recyclerView = this.f40591b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int G() {
        RecyclerView recyclerView = this.f40591b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int J(C3698oP c3698oP, C4997M c4997m) {
        RecyclerView recyclerView = this.f40591b;
        if (recyclerView == null || recyclerView.f5183D == null || !e()) {
            return 1;
        }
        return this.f40591b.f5183D.a();
    }

    public final void K(Rect rect, View view) {
        Matrix matrix;
        Rect rect2 = ((C4988D) view.getLayoutParams()).f40605b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f40591b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f40591b.f5182C;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public abstract boolean L();

    public void O(int i) {
        RecyclerView recyclerView = this.f40591b;
        if (recyclerView != null) {
            int f2 = recyclerView.f5236x.f();
            for (int i4 = 0; i4 < f2; i4++) {
                recyclerView.f5236x.e(i4).offsetLeftAndRight(i);
            }
        }
    }

    public void P(int i) {
        RecyclerView recyclerView = this.f40591b;
        if (recyclerView != null) {
            int f2 = recyclerView.f5236x.f();
            for (int i4 = 0; i4 < f2; i4++) {
                recyclerView.f5236x.e(i4).offsetTopAndBottom(i);
            }
        }
    }

    public abstract void R(RecyclerView recyclerView);

    public abstract View S(View view, int i, C3698oP c3698oP, C4997M c4997m);

    public void T(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f40591b;
        C3698oP c3698oP = recyclerView.f5230u;
        if (accessibilityEvent == null) {
            return;
        }
        boolean z6 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f40591b.canScrollVertically(-1) && !this.f40591b.canScrollHorizontally(-1) && !this.f40591b.canScrollHorizontally(1)) {
            z6 = false;
        }
        accessibilityEvent.setScrollable(z6);
        AbstractC5026v abstractC5026v = this.f40591b.f5183D;
        if (abstractC5026v != null) {
            accessibilityEvent.setItemCount(abstractC5026v.a());
        }
    }

    public final void U(View view, P.k kVar) {
        AbstractC5000P I8 = RecyclerView.I(view);
        if (I8 == null || I8.h() || ((ArrayList) this.f40590a.f38918w).contains(I8.f40643a)) {
            return;
        }
        RecyclerView recyclerView = this.f40591b;
        V(recyclerView.f5230u, recyclerView.f5184D0, view, kVar);
    }

    public void V(C3698oP c3698oP, C4997M c4997m, View view, P.k kVar) {
        kVar.j(P.j.a(e() ? H(view) : 0, 1, d() ? H(view) : 0, 1, false));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(View view, int i, boolean z6) {
        int d9;
        AbstractC5000P I8 = RecyclerView.I(view);
        if (z6 || I8.h()) {
            s.k kVar = (s.k) this.f40591b.f5238y.f29152n;
            Z z9 = (Z) kVar.getOrDefault(I8, null);
            if (z9 == null) {
                z9 = Z.a();
                kVar.put(I8, z9);
            }
            z9.f40692a |= 1;
        } else {
            this.f40591b.f5238y.h(I8);
        }
        C4988D c4988d = (C4988D) view.getLayoutParams();
        if (I8.p() || I8.i()) {
            if (I8.i()) {
                I8.f40655n.j(I8);
            } else {
                I8.f40651j &= -33;
            }
            this.f40590a.b(view, i, view.getLayoutParams(), false);
        } else {
            if (view.getParent() == this.f40591b) {
                l4.g gVar = this.f40590a;
                int indexOfChild = ((RecyclerView) ((C4659e) gVar.f38916u).f38688u).indexOfChild(view);
                if (indexOfChild != -1) {
                    C3404j1 c3404j1 = (C3404j1) gVar.f38917v;
                    if (!c3404j1.f(indexOfChild)) {
                        d9 = indexOfChild - c3404j1.d(indexOfChild);
                        if (i == -1) {
                            i = this.f40590a.f();
                        }
                        if (d9 != -1) {
                            throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f40591b.indexOfChild(view) + this.f40591b.y());
                        }
                        if (d9 != i) {
                            AbstractC4987C abstractC4987C = this.f40591b.f5185E;
                            View u6 = abstractC4987C.u(d9);
                            if (u6 == null) {
                                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + d9 + abstractC4987C.f40591b.toString());
                            }
                            abstractC4987C.u(d9);
                            abstractC4987C.f40590a.c(d9);
                            C4988D c4988d2 = (C4988D) u6.getLayoutParams();
                            AbstractC5000P I9 = RecyclerView.I(u6);
                            if (I9.h()) {
                                s.k kVar2 = (s.k) abstractC4987C.f40591b.f5238y.f29152n;
                                Z z10 = (Z) kVar2.getOrDefault(I9, null);
                                if (z10 == null) {
                                    z10 = Z.a();
                                    kVar2.put(I9, z10);
                                }
                                z10.f40692a = 1 | z10.f40692a;
                            } else {
                                abstractC4987C.f40591b.f5238y.h(I9);
                            }
                            abstractC4987C.f40590a.b(u6, i, c4988d2, I9.h());
                        }
                    }
                }
                d9 = -1;
                if (i == -1) {
                }
                if (d9 != -1) {
                }
            } else {
                this.f40590a.a(view, i, false);
                c4988d.f40606c = true;
                C5022r c5022r = this.f40594e;
                if (c5022r != null && c5022r.f40811e) {
                    c5022r.f40808b.getClass();
                    AbstractC5000P I10 = RecyclerView.I(view);
                    if ((I10 != null ? I10.b() : -1) == c5022r.f40807a) {
                        c5022r.f40812f = view;
                    }
                }
            }
        }
        if (c4988d.f40607d) {
            I8.f40643a.invalidate();
            c4988d.f40607d = false;
        }
    }

    public abstract void b0(C3698oP c3698oP, C4997M c4997m);

    public void c(String str) {
        RecyclerView recyclerView = this.f40591b;
        if (recyclerView != null) {
            recyclerView.i(str);
        }
    }

    public abstract void c0(C4997M c4997m);

    public abstract boolean d();

    public abstract boolean e();

    public Parcelable e0() {
        return null;
    }

    public boolean f(C4988D c4988d) {
        return c4988d != null;
    }

    public final void g0(C3698oP c3698oP) {
        for (int v9 = v() - 1; v9 >= 0; v9--) {
            if (!RecyclerView.I(u(v9)).o()) {
                View u6 = u(v9);
                j0(v9);
                c3698oP.f(u6);
            }
        }
    }

    public final void h0(C3698oP c3698oP) {
        ArrayList arrayList;
        int size = ((ArrayList) c3698oP.f33686c).size();
        int i = size - 1;
        while (true) {
            arrayList = (ArrayList) c3698oP.f33686c;
            if (i < 0) {
                break;
            }
            View view = ((AbstractC5000P) arrayList.get(i)).f40643a;
            AbstractC5000P I8 = RecyclerView.I(view);
            if (!I8.o()) {
                I8.n(false);
                if (I8.j()) {
                    this.f40591b.removeDetachedView(view, false);
                }
                AbstractC5030z abstractC5030z = this.f40591b.f5221l0;
                if (abstractC5030z != null) {
                    abstractC5030z.d(I8);
                }
                I8.n(true);
                AbstractC5000P I9 = RecyclerView.I(view);
                I9.f40655n = null;
                I9.f40656o = false;
                I9.f40651j &= -33;
                c3698oP.g(I9);
            }
            i--;
        }
        arrayList.clear();
        ArrayList arrayList2 = (ArrayList) c3698oP.f33687d;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f40591b.invalidate();
        }
    }

    public final void i0(View view, C3698oP c3698oP) {
        l4.g gVar = this.f40590a;
        C4659e c4659e = (C4659e) gVar.f38916u;
        int indexOfChild = ((RecyclerView) c4659e.f38688u).indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((C3404j1) gVar.f38917v).k(indexOfChild)) {
                gVar.v(view);
            }
            c4659e.A(indexOfChild);
        }
        c3698oP.f(view);
    }

    public abstract int j(C4997M c4997m);

    public final void j0(int i) {
        if (u(i) != null) {
            l4.g gVar = this.f40590a;
            int l9 = gVar.l(i);
            C4659e c4659e = (C4659e) gVar.f38916u;
            View childAt = ((RecyclerView) c4659e.f38688u).getChildAt(l9);
            if (childAt == null) {
                return;
            }
            if (((C3404j1) gVar.f38917v).k(l9)) {
                gVar.v(childAt);
            }
            c4659e.A(l9);
        }
    }

    public abstract int k(C4997M c4997m);

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ab, code lost:
    
        if ((r5.bottom - r10) > r2) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean k0(RecyclerView recyclerView, View view, Rect rect, boolean z6, boolean z9) {
        int E8 = E();
        int G2 = G();
        int F8 = this.f40602n - F();
        int D8 = this.f40603o - D();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int width = rect.width() + left;
        int height = rect.height() + top;
        int i = left - E8;
        int min = Math.min(0, i);
        int i4 = top - G2;
        int min2 = Math.min(0, i4);
        int i6 = width - F8;
        int max = Math.max(0, i6);
        int max2 = Math.max(0, height - D8);
        if (C() != 1) {
            if (min == 0) {
                min = Math.min(i, max);
            }
            max = min;
        } else if (max == 0) {
            max = Math.max(min, i6);
        }
        if (min2 == 0) {
            min2 = Math.min(i4, max2);
        }
        int[] iArr = {max, min2};
        int i9 = iArr[0];
        int i10 = iArr[1];
        if (z9) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int E9 = E();
                int G7 = G();
                int F9 = this.f40602n - F();
                int D9 = this.f40603o - D();
                Rect rect2 = this.f40591b.f5178A;
                y(rect2, focusedChild);
                if (rect2.left - i9 < F9) {
                    if (rect2.right - i9 > E9) {
                        if (rect2.top - i10 < D9) {
                        }
                    }
                }
            }
            return false;
        }
        if (i9 != 0 || i10 != 0) {
            if (z6) {
                recyclerView.scrollBy(i9, i10);
                return true;
            }
            recyclerView.Z(i9, i10, false);
            return true;
        }
        return false;
    }

    public abstract int l(C4997M c4997m);

    public final void l0() {
        RecyclerView recyclerView = this.f40591b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract int m(C4997M c4997m);

    public abstract int m0(int i, C3698oP c3698oP, C4997M c4997m);

    public abstract int n(C4997M c4997m);

    public abstract void n0(int i);

    public abstract int o(C4997M c4997m);

    public abstract int o0(int i, C3698oP c3698oP, C4997M c4997m);

    public final void p(C3698oP c3698oP) {
        for (int v9 = v() - 1; v9 >= 0; v9--) {
            View u6 = u(v9);
            AbstractC5000P I8 = RecyclerView.I(u6);
            if (!I8.o()) {
                if (!I8.f() || I8.h() || this.f40591b.f5183D.f40830b) {
                    u(v9);
                    this.f40590a.c(v9);
                    c3698oP.h(u6);
                    this.f40591b.f5238y.h(I8);
                } else {
                    j0(v9);
                    c3698oP.g(I8);
                }
            }
        }
    }

    public final void p0(RecyclerView recyclerView) {
        q0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public View q(int i) {
        int v9 = v();
        for (int i4 = 0; i4 < v9; i4++) {
            View u6 = u(i4);
            AbstractC5000P I8 = RecyclerView.I(u6);
            if (I8 != null && I8.b() == i && !I8.o() && (this.f40591b.f5184D0.f40628g || !I8.h())) {
                return u6;
            }
        }
        return null;
    }

    public final void q0(int i, int i4) {
        this.f40602n = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.f40600l = mode;
        if (mode == 0) {
            int[] iArr = RecyclerView.f5175T0;
        }
        this.f40603o = View.MeasureSpec.getSize(i4);
        int mode2 = View.MeasureSpec.getMode(i4);
        this.f40601m = mode2;
        if (mode2 == 0) {
            int[] iArr2 = RecyclerView.f5175T0;
        }
    }

    public abstract C4988D r();

    public void r0(Rect rect, int i, int i4) {
        int F8 = F() + E() + rect.width();
        int D8 = D() + G() + rect.height();
        RecyclerView recyclerView = this.f40591b;
        WeakHashMap weakHashMap = O.X.f2142a;
        this.f40591b.setMeasuredDimension(g(i, F8, recyclerView.getMinimumWidth()), g(i4, D8, this.f40591b.getMinimumHeight()));
    }

    public C4988D s(Context context, AttributeSet attributeSet) {
        return new C4988D(context, attributeSet);
    }

    public final void s0(int i, int i4) {
        int v9 = v();
        if (v9 == 0) {
            this.f40591b.n(i, i4);
            return;
        }
        int i6 = Integer.MIN_VALUE;
        int i9 = Integer.MAX_VALUE;
        int i10 = Integer.MIN_VALUE;
        int i11 = Integer.MAX_VALUE;
        for (int i12 = 0; i12 < v9; i12++) {
            View u6 = u(i12);
            Rect rect = this.f40591b.f5178A;
            y(rect, u6);
            int i13 = rect.left;
            if (i13 < i11) {
                i11 = i13;
            }
            int i14 = rect.right;
            if (i14 > i6) {
                i6 = i14;
            }
            int i15 = rect.top;
            if (i15 < i9) {
                i9 = i15;
            }
            int i16 = rect.bottom;
            if (i16 > i10) {
                i10 = i16;
            }
        }
        this.f40591b.f5178A.set(i11, i9, i6, i10);
        r0(this.f40591b.f5178A, i, i4);
    }

    public C4988D t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C4988D ? new C4988D((C4988D) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C4988D((ViewGroup.MarginLayoutParams) layoutParams) : new C4988D(layoutParams);
    }

    public final void t0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f40591b = null;
            this.f40590a = null;
            this.f40602n = 0;
            this.f40603o = 0;
        } else {
            this.f40591b = recyclerView;
            this.f40590a = recyclerView.f5236x;
            this.f40602n = recyclerView.getWidth();
            this.f40603o = recyclerView.getHeight();
        }
        this.f40600l = 1073741824;
        this.f40601m = 1073741824;
    }

    public final View u(int i) {
        l4.g gVar = this.f40590a;
        if (gVar != null) {
            return gVar.e(i);
        }
        return null;
    }

    public final boolean u0(View view, int i, int i4, C4988D c4988d) {
        return (!view.isLayoutRequested() && this.f40597h && M(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) c4988d).width) && M(view.getHeight(), i4, ((ViewGroup.MarginLayoutParams) c4988d).height)) ? false : true;
    }

    public final int v() {
        l4.g gVar = this.f40590a;
        if (gVar != null) {
            return gVar.f();
        }
        return 0;
    }

    public boolean v0() {
        return false;
    }

    public final boolean w0(View view, int i, int i4, C4988D c4988d) {
        return (this.f40597h && M(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) c4988d).width) && M(view.getMeasuredHeight(), i4, ((ViewGroup.MarginLayoutParams) c4988d).height)) ? false : true;
    }

    public int x(C3698oP c3698oP, C4997M c4997m) {
        RecyclerView recyclerView = this.f40591b;
        if (recyclerView == null || recyclerView.f5183D == null || !d()) {
            return 1;
        }
        return this.f40591b.f5183D.a();
    }

    public abstract void x0(RecyclerView recyclerView, int i);

    public void y(Rect rect, View view) {
        int[] iArr = RecyclerView.f5175T0;
        C4988D c4988d = (C4988D) view.getLayoutParams();
        Rect rect2 = c4988d.f40605b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c4988d).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c4988d).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c4988d).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c4988d).bottomMargin);
    }

    public final void y0(C5022r c5022r) {
        C5022r c5022r2 = this.f40594e;
        if (c5022r2 != null && c5022r != c5022r2 && c5022r2.f40811e) {
            c5022r2.i();
        }
        this.f40594e = c5022r;
        RecyclerView recyclerView = this.f40591b;
        RunnableC4999O runnableC4999O = recyclerView.f5179A0;
        runnableC4999O.f40641z.removeCallbacks(runnableC4999O);
        runnableC4999O.f40637v.abortAnimation();
        if (c5022r.f40814h) {
            Log.w("RecyclerView", "An instance of " + c5022r.getClass().getSimpleName() + " was started more than once. Each instance of" + c5022r.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        c5022r.f40808b = recyclerView;
        c5022r.f40809c = this;
        int i = c5022r.f40807a;
        if (i == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.f5184D0.f40622a = i;
        c5022r.f40811e = true;
        c5022r.f40810d = true;
        c5022r.f40812f = recyclerView.f5185E.q(i);
        c5022r.f40808b.f5179A0.a();
        c5022r.f40814h = true;
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

    public void i(int i, C2817Tl c2817Tl) {
    }

    public void h(int i, int i4, C4997M c4997m, C2817Tl c2817Tl) {
    }
}
