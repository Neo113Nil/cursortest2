package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class yon {
    public c1t a;
    public RecyclerView b;
    public final atn c;
    public final atn d;
    public i7g e;
    public boolean f;
    public boolean g;
    public final boolean h;
    public boolean i;
    public int j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;

    public yon() {
        awc awcVar = new awc(this);
        z6n z6nVar = new z6n(2, this);
        this.c = new atn(awcVar);
        this.d = new atn(z6nVar);
        this.f = false;
        this.g = false;
        this.h = true;
        this.i = true;
    }

    public static int A(int i, int i2, int i3) {
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
    public static int R(boolean z, int i, int i2, int i3, int i4) {
        int max = Math.max(0, i - i3);
        if (z) {
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

    public static int T(View view) {
        return view.getBottom() + ((zon) view.getLayoutParams()).b.bottom;
    }

    public static int V(View view) {
        return view.getLeft() - ((zon) view.getLayoutParams()).b.left;
    }

    public static int W(View view) {
        Rect rect = ((zon) view.getLayoutParams()).b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public static int X(View view) {
        Rect rect = ((zon) view.getLayoutParams()).b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int Y(View view) {
        return view.getRight() + ((zon) view.getLayoutParams()).b.right;
    }

    public static int Z(View view) {
        return view.getTop() - ((zon) view.getLayoutParams()).b.top;
    }

    public static int f0(View view) {
        return ((zon) view.getLayoutParams()).a.d();
    }

    public static xon g0(Context context, AttributeSet attributeSet, int i, int i2) {
        xon xonVar = new xon();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jen.a, i, i2);
        xonVar.a = obtainStyledAttributes.getInt(0, 1);
        xonVar.b = obtainStyledAttributes.getInt(10, 1);
        xonVar.c = obtainStyledAttributes.getBoolean(9, false);
        xonVar.d = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return xonVar;
    }

    public static boolean m0(int i, int i2, int i3) {
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

    public abstract int D(kpn kpnVar);

    public abstract int E(kpn kpnVar);

    public abstract void E0(amh amhVar, kpn kpnVar);

    public abstract int F(kpn kpnVar);

    public abstract void F0(kpn kpnVar);

    public abstract int G(kpn kpnVar);

    public void G0(amh amhVar, kpn kpnVar, int i, int i2) {
        this.b.A(i, i2);
    }

    public abstract int H(kpn kpnVar);

    public abstract int I(kpn kpnVar);

    public Parcelable I0() {
        return null;
    }

    public final void J(amh amhVar) {
        for (int Q = Q() - 1; Q >= 0; Q--) {
            View P = P(Q);
            opn b0 = RecyclerView.b0(P);
            if (b0.r()) {
                if (RecyclerView.k1) {
                    Log.d("RecyclerView", "ignoring view " + b0);
                }
            } else if (!b0.i() || b0.k() || this.b.m.b) {
                K(Q);
                amhVar.k(P);
                this.b.g.r(b0);
            } else {
                P0(Q);
                amhVar.j(b0);
            }
        }
    }

    public void K(int i) {
        P(i);
        this.a.h(i);
    }

    public boolean K0(int i, Bundle bundle) {
        RecyclerView recyclerView = this.b;
        return L0(recyclerView.c, recyclerView.N0, i, bundle);
    }

    public View L(int i) {
        int Q = Q();
        for (int i2 = 0; i2 < Q; i2++) {
            View P = P(i2);
            opn b0 = RecyclerView.b0(P);
            if (b0 != null && b0.d() == i && !b0.r() && (this.b.N0.g || !b0.k())) {
                return P;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean L0(amh amhVar, kpn kpnVar, int i, Bundle bundle) {
        int e0;
        int c0;
        float f;
        if (this.b != null) {
            int i2 = this.o;
            int i3 = this.n;
            Rect rect = new Rect();
            if (this.b.getMatrix().isIdentity() && this.b.getGlobalVisibleRect(rect)) {
                i2 = rect.height();
                i3 = rect.width();
            }
            if (i != 4096) {
                if (i != 8192) {
                    e0 = 0;
                    c0 = 0;
                } else {
                    e0 = this.b.canScrollVertically(-1) ? -((i2 - e0()) - b0()) : 0;
                    if (this.b.canScrollHorizontally(-1)) {
                        c0 = -((i3 - c0()) - d0());
                    }
                    c0 = 0;
                }
                if (e0 == 0 || c0 != 0) {
                    if (bundle != null) {
                        f = bundle.getFloat("androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT", 1.0f);
                        if (f < 0.0f) {
                            if (RecyclerView.j1) {
                                xq0.x(ouj.m("attempting to use ACTION_ARGUMENT_SCROLL_AMOUNT_FLOAT with a negative value (", f, ")"));
                                return false;
                            }
                        }
                    } else {
                        f = 1.0f;
                    }
                    if (Float.compare(f, Float.POSITIVE_INFINITY) != 0) {
                        if (Float.compare(1.0f, f) != 0 && Float.compare(0.0f, f) != 0) {
                            c0 = (int) (c0 * f);
                            e0 = (int) (e0 * f);
                        }
                        this.b.B0(c0, e0, true);
                        return true;
                    }
                    RecyclerView recyclerView = this.b;
                    qon qonVar = recyclerView.m;
                    if (qonVar != null) {
                        if (i == 4096) {
                            recyclerView.C0(qonVar.c() - 1);
                            return true;
                        }
                        if (i != 8192) {
                            return true;
                        }
                        recyclerView.C0(0);
                        return true;
                    }
                }
            } else {
                e0 = this.b.canScrollVertically(1) ? (i2 - e0()) - b0() : 0;
                if (this.b.canScrollHorizontally(1)) {
                    c0 = (i3 - c0()) - d0();
                    if (e0 == 0) {
                    }
                    if (bundle != null) {
                    }
                    if (Float.compare(f, Float.POSITIVE_INFINITY) != 0) {
                    }
                }
                c0 = 0;
                if (e0 == 0) {
                }
                if (bundle != null) {
                }
                if (Float.compare(f, Float.POSITIVE_INFINITY) != 0) {
                }
            }
        }
        return false;
    }

    public abstract zon M();

    public void M0(amh amhVar) {
        for (int Q = Q() - 1; Q >= 0; Q--) {
            if (!RecyclerView.b0(P(Q)).r()) {
                View P = P(Q);
                P0(Q);
                amhVar.i(P);
            }
        }
    }

    public zon N(Context context, AttributeSet attributeSet) {
        return new zon(context, attributeSet);
    }

    public final void N0(amh amhVar) {
        ArrayList arrayList;
        int size = ((ArrayList) amhVar.d).size();
        int i = size - 1;
        while (true) {
            arrayList = (ArrayList) amhVar.d;
            if (i < 0) {
                break;
            }
            View view = ((opn) arrayList.get(i)).a;
            opn b0 = RecyclerView.b0(view);
            if (!b0.r()) {
                b0.q(false);
                if (b0.m()) {
                    this.b.removeDetachedView(view, false);
                }
                von vonVar = this.b.v0;
                if (vonVar != null) {
                    vonVar.d(b0);
                }
                b0.q(true);
                opn b02 = RecyclerView.b0(view);
                b02.n = null;
                b02.o = false;
                b02.j &= -33;
                amhVar.j(b02);
            }
            i--;
        }
        arrayList.clear();
        ArrayList arrayList2 = (ArrayList) amhVar.e;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.b.invalidate();
        }
    }

    public zon O(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof zon ? new zon((zon) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new zon((ViewGroup.MarginLayoutParams) layoutParams) : new zon(layoutParams);
    }

    public void O0(View view) {
        c1t c1tVar = this.a;
        g8c g8cVar = (g8c) c1tVar.c;
        int i = c1tVar.b;
        if (i == 1) {
            xq0.q("Cannot call removeView(At) within removeView(At)");
            return;
        }
        if (i == 2) {
            xq0.q("Cannot call removeView(At) within removeViewIfHidden");
            return;
        }
        try {
            c1tVar.b = 1;
            c1tVar.f = view;
            int indexOfChild = ((RecyclerView) g8cVar.a).indexOfChild(view);
            if (indexOfChild < 0) {
                c1tVar.b = 0;
                c1tVar.f = null;
                return;
            }
            if (((au1) c1tVar.d).P(indexOfChild)) {
                c1tVar.t(view);
            }
            g8cVar.r(indexOfChild);
            c1tVar.b = 0;
            c1tVar.f = null;
        } catch (Throwable th) {
            c1tVar.b = 0;
            c1tVar.f = null;
            throw th;
        }
    }

    public final View P(int i) {
        c1t c1tVar = this.a;
        if (c1tVar != null) {
            return c1tVar.k(i);
        }
        return null;
    }

    public void P0(int i) {
        if (P(i) != null) {
            c1t c1tVar = this.a;
            g8c g8cVar = (g8c) c1tVar.c;
            int i2 = c1tVar.b;
            if (i2 == 1) {
                xq0.q("Cannot call removeView(At) within removeView(At)");
                return;
            }
            if (i2 == 2) {
                xq0.q("Cannot call removeView(At) within removeViewIfHidden");
                return;
            }
            try {
                int m = c1tVar.m(i);
                View childAt = ((RecyclerView) g8cVar.a).getChildAt(m);
                if (childAt == null) {
                    c1tVar.b = 0;
                    c1tVar.f = null;
                    return;
                }
                c1tVar.b = 1;
                c1tVar.f = childAt;
                if (((au1) c1tVar.d).P(m)) {
                    c1tVar.t(childAt);
                }
                g8cVar.r(m);
                c1tVar.b = 0;
                c1tVar.f = null;
            } catch (Throwable th) {
                c1tVar.b = 0;
                c1tVar.f = null;
                throw th;
            }
        }
    }

    public final int Q() {
        c1t c1tVar = this.a;
        if (c1tVar != null) {
            return c1tVar.l();
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ad, code lost:
    
        if ((r5.bottom - r10) > r2) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean Q0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        int c0 = c0();
        int e0 = e0();
        int d0 = this.n - d0();
        int b0 = this.o - b0();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int width = rect.width() + left;
        int height = rect.height() + top;
        int i = left - c0;
        int min = Math.min(0, i);
        int i2 = top - e0;
        int min2 = Math.min(0, i2);
        int i3 = width - d0;
        int max = Math.max(0, i3);
        int max2 = Math.max(0, height - b0);
        if (this.b.getLayoutDirection() != 1) {
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
        if (z2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int c02 = c0();
                int e02 = e0();
                int d02 = this.n - d0();
                int b02 = this.o - b0();
                Rect rect2 = this.b.j;
                U(rect2, focusedChild);
                if (rect2.left - i4 < d02) {
                    if (rect2.right - i4 > c02) {
                        if (rect2.top - i5 < b02) {
                        }
                    }
                }
            }
            return false;
        }
        if (i4 != 0 || i5 != 0) {
            if (z) {
                recyclerView.scrollBy(i4, i5);
                return true;
            }
            recyclerView.B0(i4, i5, false);
            return true;
        }
        return false;
    }

    public final void R0() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public int S(amh amhVar, kpn kpnVar) {
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || recyclerView.m == null || !x()) {
            return 1;
        }
        return this.b.m.c();
    }

    public abstract int S0(int i, amh amhVar, kpn kpnVar);

    public abstract void T0(int i);

    public void U(Rect rect, View view) {
        boolean z = RecyclerView.j1;
        zon zonVar = (zon) view.getLayoutParams();
        Rect rect2 = zonVar.b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) zonVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) zonVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) zonVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) zonVar).bottomMargin);
    }

    public abstract int U0(int i, amh amhVar, kpn kpnVar);

    public final void V0(RecyclerView recyclerView) {
        W0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public final void W0(int i, int i2) {
        this.n = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.l = mode;
        if (mode == 0 && !RecyclerView.n1) {
            this.n = 0;
        }
        this.o = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.m = mode2;
        if (mode2 != 0 || RecyclerView.n1) {
            return;
        }
        this.o = 0;
    }

    public void X0(Rect rect, int i, int i2) {
        int d0 = d0() + c0() + rect.width();
        int b0 = b0() + e0() + rect.height();
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = wdu.a;
        this.b.setMeasuredDimension(A(i, d0, recyclerView.getMinimumWidth()), A(i2, b0, this.b.getMinimumHeight()));
    }

    public final void Y0(int i, int i2) {
        int Q = Q();
        if (Q == 0) {
            this.b.A(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < Q; i7++) {
            View P = P(i7);
            Rect rect = this.b.j;
            U(rect, P);
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
        this.b.j.set(i6, i4, i3, i5);
        X0(this.b.j, i, i2);
    }

    public final void Z0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.b = null;
            this.a = null;
            this.n = 0;
            this.o = 0;
        } else {
            this.b = recyclerView;
            this.a = recyclerView.f;
            this.n = recyclerView.getWidth();
            this.o = recyclerView.getHeight();
        }
        this.l = 1073741824;
        this.m = 1073741824;
    }

    public final int a0() {
        RecyclerView recyclerView = this.b;
        qon adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.c();
        }
        return 0;
    }

    public final boolean a1(View view, int i, int i2, zon zonVar) {
        return (!view.isLayoutRequested() && this.h && m0(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) zonVar).width) && m0(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) zonVar).height)) ? false : true;
    }

    public int b0() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public boolean b1() {
        return false;
    }

    public int c0() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final boolean c1(View view, int i, int i2, zon zonVar) {
        return (this.h && m0(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) zonVar).width) && m0(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) zonVar).height)) ? false : true;
    }

    public int d0() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public abstract void d1(RecyclerView recyclerView, int i);

    public int e0() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public final void e1(i7g i7gVar) {
        i7g i7gVar2 = this.e;
        if (i7gVar2 != null && i7gVar != i7gVar2 && i7gVar2.e) {
            i7gVar2.k();
        }
        this.e = i7gVar;
        RecyclerView recyclerView = this.b;
        npn npnVar = recyclerView.K0;
        npnVar.g.removeCallbacks(npnVar);
        npnVar.c.abortAnimation();
        if (i7gVar.h) {
            Log.w("RecyclerView", "An instance of " + i7gVar.getClass().getSimpleName() + " was started more than once. Each instance of" + i7gVar.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        i7gVar.b = recyclerView;
        i7gVar.c = this;
        int i = i7gVar.a;
        if (i == -1) {
            xq0.x("Invalid target position");
            return;
        }
        recyclerView.N0.a = i;
        i7gVar.e = true;
        i7gVar.d = true;
        i7gVar.f = recyclerView.n.L(i);
        i7gVar.b.K0.b();
        i7gVar.h = true;
    }

    public boolean f1() {
        return false;
    }

    public int h0(amh amhVar, kpn kpnVar) {
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || recyclerView.m == null || !y()) {
            return 1;
        }
        return this.b.m.c();
    }

    public int i0(amh amhVar, kpn kpnVar) {
        return 0;
    }

    public final void j0(Rect rect, View view) {
        Matrix matrix;
        Rect rect2 = ((zon) view.getLayoutParams()).b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.b.l;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public abstract boolean k0();

    public boolean l0() {
        return false;
    }

    public void n0(View view, int i, int i2, int i3, int i4) {
        zon zonVar = (zon) view.getLayoutParams();
        Rect rect = zonVar.b;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) zonVar).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) zonVar).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) zonVar).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) zonVar).bottomMargin);
    }

    public void o0(View view) {
        zon zonVar = (zon) view.getLayoutParams();
        Rect c0 = this.b.c0(view);
        int i = c0.left + c0.right;
        int i2 = c0.top + c0.bottom;
        int R = R(x(), this.n, this.l, d0() + c0() + ((ViewGroup.MarginLayoutParams) zonVar).leftMargin + ((ViewGroup.MarginLayoutParams) zonVar).rightMargin + i, ((ViewGroup.MarginLayoutParams) zonVar).width);
        int R2 = R(y(), this.o, this.m, b0() + e0() + ((ViewGroup.MarginLayoutParams) zonVar).topMargin + ((ViewGroup.MarginLayoutParams) zonVar).bottomMargin + i2, ((ViewGroup.MarginLayoutParams) zonVar).height);
        if (a1(view, R, R2, zonVar)) {
            view.measure(R, R2);
        }
    }

    public void p0(int i) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            int l = recyclerView.f.l();
            for (int i2 = 0; i2 < l; i2++) {
                recyclerView.f.k(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void q0(int i) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            int l = recyclerView.f.l();
            for (int i2 = 0; i2 < l; i2++) {
                recyclerView.f.k(i2).offsetTopAndBottom(i);
            }
        }
    }

    public View t(int i) {
        return P(i);
    }

    public abstract void t0(RecyclerView recyclerView, amh amhVar);

    public final void u(View view, int i, boolean z) {
        opn b0 = RecyclerView.b0(view);
        if (z || b0.k()) {
            ciq ciqVar = (ciq) this.b.g.b;
            veu veuVar = (veu) ciqVar.get(b0);
            if (veuVar == null) {
                veuVar = veu.a();
                ciqVar.put(b0, veuVar);
            }
            veuVar.a |= 1;
        } else {
            this.b.g.r(b0);
        }
        zon zonVar = (zon) view.getLayoutParams();
        if (b0.s() || b0.l()) {
            if (b0.l()) {
                b0.n.m(b0);
            } else {
                b0.j &= -33;
            }
            this.a.g(view, i, view.getLayoutParams(), false);
        } else {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.b;
            c1t c1tVar = this.a;
            if (parent == recyclerView) {
                au1 au1Var = (au1) c1tVar.d;
                int indexOfChild = ((RecyclerView) ((g8c) c1tVar.c).a).indexOfChild(view);
                int C = (indexOfChild == -1 || au1Var.L(indexOfChild)) ? -1 : indexOfChild - au1Var.C(indexOfChild);
                if (i == -1) {
                    i = this.a.l();
                }
                if (C == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.b.indexOfChild(view) + this.b.M());
                }
                if (C != i) {
                    yon yonVar = this.b.n;
                    View P = yonVar.P(C);
                    if (P == null) {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + C + yonVar.b.toString());
                    }
                    yonVar.K(C);
                    zon zonVar2 = (zon) P.getLayoutParams();
                    opn b02 = RecyclerView.b0(P);
                    boolean k = b02.k();
                    RecyclerView recyclerView2 = yonVar.b;
                    if (k) {
                        ciq ciqVar2 = (ciq) recyclerView2.g.b;
                        veu veuVar2 = (veu) ciqVar2.get(b02);
                        if (veuVar2 == null) {
                            veuVar2 = veu.a();
                            ciqVar2.put(b02, veuVar2);
                        }
                        veuVar2.a = 1 | veuVar2.a;
                    } else {
                        recyclerView2.g.r(b02);
                    }
                    yonVar.a.g(P, i, zonVar2, b02.k());
                }
            } else {
                c1tVar.f(view, i, false);
                zonVar.c = true;
                i7g i7gVar = this.e;
                if (i7gVar != null && i7gVar.e) {
                    i7gVar.b.getClass();
                    if (RecyclerView.Z(view) == i7gVar.a) {
                        i7gVar.f = view;
                        if (RecyclerView.k1) {
                            Log.d("RecyclerView", "smooth scroll target view has been attached");
                        }
                    }
                }
            }
        }
        if (zonVar.d) {
            if (RecyclerView.k1) {
                Log.d("RecyclerView", "consuming pending invalidate on child " + zonVar.a);
            }
            b0.a.invalidate();
            zonVar.d = false;
        }
    }

    public abstract View u0(View view, int i, amh amhVar, kpn kpnVar);

    public void v(String str) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.u(str);
        }
    }

    public void v0(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.b;
        amh amhVar = recyclerView.c;
        if (accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.b.canScrollVertically(-1) && !this.b.canScrollHorizontally(-1) && !this.b.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        qon qonVar = this.b.m;
        if (qonVar != null) {
            accessibilityEvent.setItemCount(qonVar.c());
        }
    }

    public void w(Rect rect, View view) {
        RecyclerView recyclerView = this.b;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.c0(view));
        }
    }

    public void w0(amh amhVar, kpn kpnVar, vb vbVar) {
        if (this.b.canScrollVertically(-1) || this.b.canScrollHorizontally(-1)) {
            vbVar.a(RemoteCameraConfig.Notification.ID);
            vbVar.w(true);
            vbVar.j(67108864, true);
        }
        if (this.b.canScrollVertically(1) || this.b.canScrollHorizontally(1)) {
            vbVar.a(4096);
            vbVar.w(true);
            vbVar.j(67108864, true);
        }
        vbVar.p(tb.b(h0(amhVar, kpnVar), S(amhVar, kpnVar), i0(amhVar, kpnVar)));
    }

    public abstract boolean x();

    public void x0(amh amhVar, kpn kpnVar, View view, vb vbVar) {
        vbVar.q(ub.d(false, y() ? f0(view) : 0, 1, x() ? f0(view) : 0, 1));
    }

    public abstract boolean y();

    public final void y0(View view, vb vbVar) {
        opn b0 = RecyclerView.b0(view);
        if (b0 == null || b0.k()) {
            return;
        }
        c1t c1tVar = this.a;
        if (((ArrayList) c1tVar.e).contains(b0.a)) {
            return;
        }
        RecyclerView recyclerView = this.b;
        x0(recyclerView.c, recyclerView.N0, view, vbVar);
    }

    public boolean z(zon zonVar) {
        return zonVar != null;
    }

    public void A0() {
    }

    public void r0() {
    }

    public void H0(Parcelable parcelable) {
    }

    public void J0(int i) {
    }

    public void s0(RecyclerView recyclerView) {
    }

    public void B0(int i, int i2) {
    }

    public void C(int i, ll4 ll4Var) {
    }

    public void C0(int i, int i2) {
    }

    public void D0(int i, int i2) {
    }

    public void z0(int i, int i2) {
    }

    public void B(int i, int i2, kpn kpnVar, ll4 ll4Var) {
    }
}
