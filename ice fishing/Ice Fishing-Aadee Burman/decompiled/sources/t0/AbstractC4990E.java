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
import com.google.android.gms.internal.ads.C2780Sl;
import com.google.android.gms.internal.ads.C3381j1;
import com.google.android.gms.internal.ads.C3675oP;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l.C4648e;
import s0.AbstractC4965a;

/* renamed from: t0.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4990E {

    /* renamed from: a, reason: collision with root package name */
    public j4.g f40537a;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f40538b;

    /* renamed from: c, reason: collision with root package name */
    public final m8.i f40539c;

    /* renamed from: d, reason: collision with root package name */
    public final m8.i f40540d;

    /* renamed from: e, reason: collision with root package name */
    public C5024s f40541e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f40542f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f40543g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f40544h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public int f40545j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f40546k;

    /* renamed from: l, reason: collision with root package name */
    public int f40547l;

    /* renamed from: m, reason: collision with root package name */
    public int f40548m;

    /* renamed from: n, reason: collision with root package name */
    public int f40549n;

    /* renamed from: o, reason: collision with root package name */
    public int f40550o;

    public AbstractC4990E() {
        C4988C c4988c = new C4988C(0, this);
        C4648e c4648e = new C4648e(7, this);
        this.f40539c = new m8.i(c4988c);
        this.f40540d = new m8.i(c4648e);
        this.f40542f = false;
        this.f40543g = false;
        this.f40544h = true;
        this.i = true;
    }

    public static int A(View view) {
        Rect rect = ((C4991F) view.getLayoutParams()).f40552b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int H(View view) {
        return ((C4991F) view.getLayoutParams()).f40551a.b();
    }

    public static C4989D I(Context context, AttributeSet attributeSet, int i, int i6) {
        C4989D c4989d = new C4989D();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4965a.f40442a, i, i6);
        c4989d.f40533a = obtainStyledAttributes.getInt(0, 1);
        c4989d.f40534b = obtainStyledAttributes.getInt(10, 1);
        c4989d.f40535c = obtainStyledAttributes.getBoolean(9, false);
        c4989d.f40536d = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return c4989d;
    }

    public static boolean M(int i, int i6, int i9) {
        int mode = View.MeasureSpec.getMode(i6);
        int size = View.MeasureSpec.getSize(i6);
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

    public static void N(View view, int i, int i6, int i9, int i10) {
        C4991F c4991f = (C4991F) view.getLayoutParams();
        Rect rect = c4991f.f40552b;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) c4991f).leftMargin, i6 + rect.top + ((ViewGroup.MarginLayoutParams) c4991f).topMargin, (i9 - rect.right) - ((ViewGroup.MarginLayoutParams) c4991f).rightMargin, (i10 - rect.bottom) - ((ViewGroup.MarginLayoutParams) c4991f).bottomMargin);
    }

    public static int g(int i, int i6, int i9) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i6, i9) : size : Math.min(size, Math.max(i6, i9));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r5 == 1073741824) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int w(int i, int i6, int i9, int i10, boolean z3) {
        int max = Math.max(0, i - i9);
        if (z3) {
            if (i10 < 0) {
                if (i10 == -1) {
                    if (i6 != Integer.MIN_VALUE) {
                        if (i6 != 0) {
                        }
                    }
                    i10 = max;
                }
                i6 = 0;
                i10 = 0;
            }
            i6 = 1073741824;
        } else {
            if (i10 < 0) {
                if (i10 != -1) {
                    if (i10 == -2) {
                        if (i6 == Integer.MIN_VALUE || i6 == 1073741824) {
                            i10 = max;
                            i6 = Integer.MIN_VALUE;
                        } else {
                            i10 = max;
                            i6 = 0;
                        }
                    }
                    i6 = 0;
                    i10 = 0;
                }
                i10 = max;
            }
            i6 = 1073741824;
        }
        return View.MeasureSpec.makeMeasureSpec(i10, i6);
    }

    public static int z(View view) {
        Rect rect = ((C4991F) view.getLayoutParams()).f40552b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public final int B() {
        RecyclerView recyclerView = this.f40538b;
        AbstractC5027v adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.a();
        }
        return 0;
    }

    public final int C() {
        RecyclerView recyclerView = this.f40538b;
        WeakHashMap weakHashMap = O.X.f2054a;
        return recyclerView.getLayoutDirection();
    }

    public final int D() {
        RecyclerView recyclerView = this.f40538b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int E() {
        RecyclerView recyclerView = this.f40538b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int F() {
        RecyclerView recyclerView = this.f40538b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int G() {
        RecyclerView recyclerView = this.f40538b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int J(C3675oP c3675oP, C5000O c5000o) {
        RecyclerView recyclerView = this.f40538b;
        if (recyclerView == null || recyclerView.f5216D == null || !e()) {
            return 1;
        }
        return this.f40538b.f5216D.a();
    }

    public final void K(Rect rect, View view) {
        Matrix matrix;
        Rect rect2 = ((C4991F) view.getLayoutParams()).f40552b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f40538b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f40538b.f5215C;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public abstract boolean L();

    public void O(int i) {
        RecyclerView recyclerView = this.f40538b;
        if (recyclerView != null) {
            int g4 = recyclerView.f5270x.g();
            for (int i6 = 0; i6 < g4; i6++) {
                recyclerView.f5270x.f(i6).offsetLeftAndRight(i);
            }
        }
    }

    public void P(int i) {
        RecyclerView recyclerView = this.f40538b;
        if (recyclerView != null) {
            int g4 = recyclerView.f5270x.g();
            for (int i6 = 0; i6 < g4; i6++) {
                recyclerView.f5270x.f(i6).offsetTopAndBottom(i);
            }
        }
    }

    public abstract void R(RecyclerView recyclerView);

    public abstract View S(View view, int i, C3675oP c3675oP, C5000O c5000o);

    public void T(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f40538b;
        C3675oP c3675oP = recyclerView.f5264u;
        if (accessibilityEvent == null) {
            return;
        }
        boolean z3 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f40538b.canScrollVertically(-1) && !this.f40538b.canScrollHorizontally(-1) && !this.f40538b.canScrollHorizontally(1)) {
            z3 = false;
        }
        accessibilityEvent.setScrollable(z3);
        AbstractC5027v abstractC5027v = this.f40538b.f5216D;
        if (abstractC5027v != null) {
            accessibilityEvent.setItemCount(abstractC5027v.a());
        }
    }

    public final void U(View view, P.k kVar) {
        AbstractC5003S I8 = RecyclerView.I(view);
        if (I8 == null || I8.h() || ((ArrayList) this.f40537a.f38406w).contains(I8.f40590a)) {
            return;
        }
        RecyclerView recyclerView = this.f40538b;
        V(recyclerView.f5264u, recyclerView.f5227I0, view, kVar);
    }

    public void V(C3675oP c3675oP, C5000O c5000o, View view, P.k kVar) {
        kVar.j(P.j.a(e() ? H(view) : 0, 1, d() ? H(view) : 0, 1, false));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(View view, int i, boolean z3) {
        int c9;
        AbstractC5003S I8 = RecyclerView.I(view);
        if (z3 || I8.h()) {
            s.k kVar = (s.k) this.f40538b.f5272y.f38706n;
            b0 b0Var = (b0) kVar.getOrDefault(I8, null);
            if (b0Var == null) {
                b0Var = b0.a();
                kVar.put(I8, b0Var);
            }
            b0Var.f40645a |= 1;
        } else {
            this.f40538b.f5272y.d(I8);
        }
        C4991F c4991f = (C4991F) view.getLayoutParams();
        if (I8.p() || I8.i()) {
            if (I8.i()) {
                I8.f40602n.j(I8);
            } else {
                I8.f40598j &= -33;
            }
            this.f40537a.b(view, i, view.getLayoutParams(), false);
        } else {
            if (view.getParent() == this.f40538b) {
                j4.g gVar = this.f40537a;
                int indexOfChild = ((RecyclerView) ((C4648e) gVar.f38404u).f38761u).indexOfChild(view);
                if (indexOfChild != -1) {
                    C3381j1 c3381j1 = (C3381j1) gVar.f38405v;
                    if (!c3381j1.e(indexOfChild)) {
                        c9 = indexOfChild - c3381j1.c(indexOfChild);
                        if (i == -1) {
                            i = this.f40537a.g();
                        }
                        if (c9 != -1) {
                            throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f40538b.indexOfChild(view) + this.f40538b.y());
                        }
                        if (c9 != i) {
                            AbstractC4990E abstractC4990E = this.f40538b.f5218E;
                            View u3 = abstractC4990E.u(c9);
                            if (u3 == null) {
                                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + c9 + abstractC4990E.f40538b.toString());
                            }
                            abstractC4990E.u(c9);
                            abstractC4990E.f40537a.c(c9);
                            C4991F c4991f2 = (C4991F) u3.getLayoutParams();
                            AbstractC5003S I9 = RecyclerView.I(u3);
                            if (I9.h()) {
                                s.k kVar2 = (s.k) abstractC4990E.f40538b.f5272y.f38706n;
                                b0 b0Var2 = (b0) kVar2.getOrDefault(I9, null);
                                if (b0Var2 == null) {
                                    b0Var2 = b0.a();
                                    kVar2.put(I9, b0Var2);
                                }
                                b0Var2.f40645a = 1 | b0Var2.f40645a;
                            } else {
                                abstractC4990E.f40538b.f5272y.d(I9);
                            }
                            abstractC4990E.f40537a.b(u3, i, c4991f2, I9.h());
                        }
                    }
                }
                c9 = -1;
                if (i == -1) {
                }
                if (c9 != -1) {
                }
            } else {
                this.f40537a.a(view, i, false);
                c4991f.f40553c = true;
                C5024s c5024s = this.f40541e;
                if (c5024s != null && c5024s.f40761e) {
                    c5024s.f40758b.getClass();
                    AbstractC5003S I10 = RecyclerView.I(view);
                    if ((I10 != null ? I10.b() : -1) == c5024s.f40757a) {
                        c5024s.f40762f = view;
                    }
                }
            }
        }
        if (c4991f.f40554d) {
            I8.f40590a.invalidate();
            c4991f.f40554d = false;
        }
    }

    public abstract void b0(C3675oP c3675oP, C5000O c5000o);

    public void c(String str) {
        RecyclerView recyclerView = this.f40538b;
        if (recyclerView != null) {
            recyclerView.i(str);
        }
    }

    public abstract void c0(C5000O c5000o);

    public abstract boolean d();

    public abstract boolean e();

    public Parcelable e0() {
        return null;
    }

    public boolean f(C4991F c4991f) {
        return c4991f != null;
    }

    public final void g0(C3675oP c3675oP) {
        for (int v9 = v() - 1; v9 >= 0; v9--) {
            if (!RecyclerView.I(u(v9)).o()) {
                View u3 = u(v9);
                j0(v9);
                c3675oP.f(u3);
            }
        }
    }

    public final void h0(C3675oP c3675oP) {
        ArrayList arrayList;
        int size = ((ArrayList) c3675oP.f32899c).size();
        int i = size - 1;
        while (true) {
            arrayList = (ArrayList) c3675oP.f32899c;
            if (i < 0) {
                break;
            }
            View view = ((AbstractC5003S) arrayList.get(i)).f40590a;
            AbstractC5003S I8 = RecyclerView.I(view);
            if (!I8.o()) {
                I8.n(false);
                if (I8.j()) {
                    this.f40538b.removeDetachedView(view, false);
                }
                AbstractC5031z abstractC5031z = this.f40538b.f5260q0;
                if (abstractC5031z != null) {
                    abstractC5031z.d(I8);
                }
                I8.n(true);
                AbstractC5003S I9 = RecyclerView.I(view);
                I9.f40602n = null;
                I9.f40603o = false;
                I9.f40598j &= -33;
                c3675oP.g(I9);
            }
            i--;
        }
        arrayList.clear();
        ArrayList arrayList2 = (ArrayList) c3675oP.f32900d;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f40538b.invalidate();
        }
    }

    public final void i0(View view, C3675oP c3675oP) {
        j4.g gVar = this.f40537a;
        C4648e c4648e = (C4648e) gVar.f38404u;
        int indexOfChild = ((RecyclerView) c4648e.f38761u).indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((C3381j1) gVar.f38405v).n(indexOfChild)) {
                gVar.v(view);
            }
            c4648e.o(indexOfChild);
        }
        c3675oP.f(view);
    }

    public abstract int j(C5000O c5000o);

    public final void j0(int i) {
        if (u(i) != null) {
            j4.g gVar = this.f40537a;
            int l9 = gVar.l(i);
            C4648e c4648e = (C4648e) gVar.f38404u;
            View childAt = ((RecyclerView) c4648e.f38761u).getChildAt(l9);
            if (childAt == null) {
                return;
            }
            if (((C3381j1) gVar.f38405v).n(l9)) {
                gVar.v(childAt);
            }
            c4648e.o(l9);
        }
    }

    public abstract int k(C5000O c5000o);

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ab, code lost:
    
        if ((r5.bottom - r10) > r2) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean k0(RecyclerView recyclerView, View view, Rect rect, boolean z3, boolean z6) {
        int E8 = E();
        int G7 = G();
        int F8 = this.f40549n - F();
        int D8 = this.f40550o - D();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int width = rect.width() + left;
        int height = rect.height() + top;
        int i = left - E8;
        int min = Math.min(0, i);
        int i6 = top - G7;
        int min2 = Math.min(0, i6);
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
            min2 = Math.min(i6, max2);
        }
        int[] iArr = {max, min2};
        int i10 = iArr[0];
        int i11 = iArr[1];
        if (z6) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int E9 = E();
                int G8 = G();
                int F9 = this.f40549n - F();
                int D9 = this.f40550o - D();
                Rect rect2 = this.f40538b.f5211A;
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
            if (z3) {
                recyclerView.scrollBy(i10, i11);
                return true;
            }
            recyclerView.Z(i10, i11, false);
            return true;
        }
        return false;
    }

    public abstract int l(C5000O c5000o);

    public final void l0() {
        RecyclerView recyclerView = this.f40538b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract int m(C5000O c5000o);

    public abstract int m0(int i, C3675oP c3675oP, C5000O c5000o);

    public abstract int n(C5000O c5000o);

    public abstract void n0(int i);

    public abstract int o(C5000O c5000o);

    public abstract int o0(int i, C3675oP c3675oP, C5000O c5000o);

    public final void p(C3675oP c3675oP) {
        for (int v9 = v() - 1; v9 >= 0; v9--) {
            View u3 = u(v9);
            AbstractC5003S I8 = RecyclerView.I(u3);
            if (!I8.o()) {
                if (!I8.f() || I8.h() || this.f40538b.f5216D.f40778b) {
                    u(v9);
                    this.f40537a.c(v9);
                    c3675oP.h(u3);
                    this.f40538b.f5272y.d(I8);
                } else {
                    j0(v9);
                    c3675oP.g(I8);
                }
            }
        }
    }

    public final void p0(RecyclerView recyclerView) {
        q0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public View q(int i) {
        int v9 = v();
        for (int i6 = 0; i6 < v9; i6++) {
            View u3 = u(i6);
            AbstractC5003S I8 = RecyclerView.I(u3);
            if (I8 != null && I8.b() == i && !I8.o() && (this.f40538b.f5227I0.f40575g || !I8.h())) {
                return u3;
            }
        }
        return null;
    }

    public final void q0(int i, int i6) {
        this.f40549n = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.f40547l = mode;
        if (mode == 0) {
            int[] iArr = RecyclerView.f5208Y0;
        }
        this.f40550o = View.MeasureSpec.getSize(i6);
        int mode2 = View.MeasureSpec.getMode(i6);
        this.f40548m = mode2;
        if (mode2 == 0) {
            int[] iArr2 = RecyclerView.f5208Y0;
        }
    }

    public abstract C4991F r();

    public void r0(Rect rect, int i, int i6) {
        int F8 = F() + E() + rect.width();
        int D8 = D() + G() + rect.height();
        RecyclerView recyclerView = this.f40538b;
        WeakHashMap weakHashMap = O.X.f2054a;
        this.f40538b.setMeasuredDimension(g(i, F8, recyclerView.getMinimumWidth()), g(i6, D8, this.f40538b.getMinimumHeight()));
    }

    public C4991F s(Context context, AttributeSet attributeSet) {
        return new C4991F(context, attributeSet);
    }

    public final void s0(int i, int i6) {
        int v9 = v();
        if (v9 == 0) {
            this.f40538b.n(i, i6);
            return;
        }
        int i9 = Integer.MIN_VALUE;
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MIN_VALUE;
        int i12 = Integer.MAX_VALUE;
        for (int i13 = 0; i13 < v9; i13++) {
            View u3 = u(i13);
            Rect rect = this.f40538b.f5211A;
            y(rect, u3);
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
        this.f40538b.f5211A.set(i12, i10, i9, i11);
        r0(this.f40538b.f5211A, i, i6);
    }

    public C4991F t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C4991F ? new C4991F((C4991F) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C4991F((ViewGroup.MarginLayoutParams) layoutParams) : new C4991F(layoutParams);
    }

    public final void t0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f40538b = null;
            this.f40537a = null;
            this.f40549n = 0;
            this.f40550o = 0;
        } else {
            this.f40538b = recyclerView;
            this.f40537a = recyclerView.f5270x;
            this.f40549n = recyclerView.getWidth();
            this.f40550o = recyclerView.getHeight();
        }
        this.f40547l = 1073741824;
        this.f40548m = 1073741824;
    }

    public final View u(int i) {
        j4.g gVar = this.f40537a;
        if (gVar != null) {
            return gVar.f(i);
        }
        return null;
    }

    public final boolean u0(View view, int i, int i6, C4991F c4991f) {
        return (!view.isLayoutRequested() && this.f40544h && M(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) c4991f).width) && M(view.getHeight(), i6, ((ViewGroup.MarginLayoutParams) c4991f).height)) ? false : true;
    }

    public final int v() {
        j4.g gVar = this.f40537a;
        if (gVar != null) {
            return gVar.g();
        }
        return 0;
    }

    public boolean v0() {
        return false;
    }

    public final boolean w0(View view, int i, int i6, C4991F c4991f) {
        return (this.f40544h && M(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) c4991f).width) && M(view.getMeasuredHeight(), i6, ((ViewGroup.MarginLayoutParams) c4991f).height)) ? false : true;
    }

    public int x(C3675oP c3675oP, C5000O c5000o) {
        RecyclerView recyclerView = this.f40538b;
        if (recyclerView == null || recyclerView.f5216D == null || !d()) {
            return 1;
        }
        return this.f40538b.f5216D.a();
    }

    public abstract void x0(RecyclerView recyclerView, int i);

    public void y(Rect rect, View view) {
        int[] iArr = RecyclerView.f5208Y0;
        C4991F c4991f = (C4991F) view.getLayoutParams();
        Rect rect2 = c4991f.f40552b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c4991f).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c4991f).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c4991f).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c4991f).bottomMargin);
    }

    public final void y0(C5024s c5024s) {
        C5024s c5024s2 = this.f40541e;
        if (c5024s2 != null && c5024s != c5024s2 && c5024s2.f40761e) {
            c5024s2.i();
        }
        this.f40541e = c5024s;
        RecyclerView recyclerView = this.f40538b;
        RunnableC5002Q runnableC5002Q = recyclerView.f5221F0;
        runnableC5002Q.f40588z.removeCallbacks(runnableC5002Q);
        runnableC5002Q.f40584v.abortAnimation();
        if (c5024s.f40764h) {
            Log.w("RecyclerView", "An instance of " + c5024s.getClass().getSimpleName() + " was started more than once. Each instance of" + c5024s.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        c5024s.f40758b = recyclerView;
        c5024s.f40759c = this;
        int i = c5024s.f40757a;
        if (i == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.f5227I0.f40569a = i;
        c5024s.f40761e = true;
        c5024s.f40760d = true;
        c5024s.f40762f = recyclerView.f5218E.q(i);
        c5024s.f40758b.f5221F0.a();
        c5024s.f40764h = true;
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

    public void W(int i, int i6) {
    }

    public void Y(int i, int i6) {
    }

    public void Z(int i, int i6) {
    }

    public void a0(int i, int i6) {
    }

    public void i(int i, C2780Sl c2780Sl) {
    }

    public void h(int i, int i6, C5000O c5000o, C2780Sl c2780Sl) {
    }
}
