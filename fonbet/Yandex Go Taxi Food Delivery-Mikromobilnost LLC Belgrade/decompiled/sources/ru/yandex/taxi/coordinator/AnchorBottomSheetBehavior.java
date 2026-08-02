package ru.yandex.taxi.coordinator;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.b;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a62;
import defpackage.c4i0;
import defpackage.c62;
import defpackage.e62;
import defpackage.g191;
import defpackage.jl40;
import defpackage.joe;
import defpackage.mrg0;
import defpackage.n290;
import defpackage.nwt0;
import defpackage.ny61;
import defpackage.owt0;
import defpackage.oyr;
import defpackage.qru;
import defpackage.sor;
import defpackage.t52;
import defpackage.unr0;
import defpackage.v52;
import defpackage.w52;
import defpackage.xby;
import defpackage.y52;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior;
import ru.yandex.taxi.design.utils.c;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\b\u000b\f\r\u000e\u000e\u000f\u0010\u0011B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u0012"}, d2 = {"Lru/yandex/taxi/coordinator/AnchorBottomSheetBehavior;", "Landroid/view/View;", CA20Status.STATUS_CERTIFICATE_V, "Landroidx/coordinatorlayout/widget/CoordinatorLayout$a;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "t52", "v52", "a62", "c62", "SavedState", "y52", "w52", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public class AnchorBottomSheetBehavior<V extends View> extends CoordinatorLayout.a {
    public int A;
    public boolean B;
    public boolean C;
    public final boolean D;
    public int E;
    public androidx.customview.widget.a F;
    public boolean G;
    public float H;
    public float I;
    public boolean J;
    public int K;
    public WeakReference L;
    public WeakReference M;
    public t52 N;
    public int O;
    public int P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public y52 T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean Z;
    public int a;
    public boolean a0;
    public boolean b;
    public boolean b0;
    public int c;
    public boolean c0;
    public boolean d0;
    public boolean e0;
    public final qru f0;
    public boolean g0;
    public a62 h0;
    public final int i0;
    public final sor j0;
    public final nwt0 k0;
    public boolean l0;
    public boolean m0;
    public int n0;
    public StackTraceElement[] o0;
    public joe p0;
    public v52 q0;
    public final int[] r0;
    public final e62 s0;
    public int[] w;
    public int x;
    public int y;
    public int z;

    public AnchorBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        this.w = new int[]{0};
        this.B = true;
        this.E = 6;
        this.R = true;
        this.V = true;
        this.W = true;
        this.Z = true;
        this.a0 = true;
        this.f0 = new qru();
        sor sorVar = new sor();
        this.j0 = sorVar;
        nwt0 nwt0Var = new nwt0(sorVar);
        this.k0 = nwt0Var;
        this.r0 = new int[2];
        this.s0 = new e62(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c4i0.AnchorBottomSheetBehavior_Layout, 0, 0);
        TypedValue peekValue = obtainStyledAttributes.peekValue(c4i0.AnchorBottomSheetBehavior_Layout_bottomSheetPeekHeight);
        if (peekValue == null || (i = peekValue.data) != -1) {
            M(obtainStyledAttributes.getDimensionPixelSize(c4i0.AnchorBottomSheetBehavior_Layout_bottomSheetPeekHeight, -1), false);
        } else {
            M(i, false);
        }
        this.C = obtainStyledAttributes.getBoolean(c4i0.AnchorBottomSheetBehavior_Layout_bottomSheetHideable, false);
        this.D = obtainStyledAttributes.getBoolean(c4i0.AnchorBottomSheetBehavior_Layout_bottomSheetSkipCollapsed, false);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, c4i0.AnchorBottomSheetBehavior_Layout, 0, 0);
        this.w[0] = (int) obtainStyledAttributes2.getDimension(c4i0.AnchorBottomSheetBehavior_Layout_bottomSheetAnchorOffset, 0.0f);
        this.E = obtainStyledAttributes2.getInt(c4i0.AnchorBottomSheetBehavior_Layout_bottomSheetDefaultState, this.E);
        obtainStyledAttributes2.recycle();
        this.i0 = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
        nwt0Var.u = new owt0();
    }

    public static void E(int i, View view) {
        WeakHashMap weakHashMap = b.a;
        view.offsetTopAndBottom(i);
    }

    public final float A(int i) {
        int i2 = this.A;
        int i3 = i > i2 ? this.K - i2 : i2 - this.z;
        if (i3 != 0) {
            return (i2 - i) / i3;
        }
        if (this.g0 && i2 == this.z) {
            return 0.0f;
        }
        return (i == this.K || i == i2) ? 1.0f : 0.0f;
    }

    public final void B(float f, float f2, View view) {
        int top = view.getTop();
        ArrayList arrayList = new ArrayList(this.w.length + 3);
        if (this.V) {
            arrayList.add(new w52(3, 0, this.z));
        }
        int length = this.w.length;
        for (int i = 0; i < length; i++) {
            arrayList.add(new w52(6, i, w(i)));
        }
        if (this.W) {
            arrayList.add(new w52(4, 0, this.A));
        }
        if (this.C && (this.Z || this.D)) {
            arrayList.add(new w52(5, 0, this.K));
        }
        w52 w52Var = (w52) arrayList.get(0);
        w52 w52Var2 = (w52) unr0.k(1, arrayList);
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            w52 w52Var3 = (w52) it.next();
            if (top >= w52Var3.c()) {
                w52Var = w52Var3;
            }
            if (top <= w52Var3.c()) {
                w52Var2 = w52Var3;
                break;
            }
        }
        w52 w52Var4 = w52Var;
        if (!jl40.l(w52Var4, w52Var2)) {
            int c = top - w52Var4.c();
            int c2 = w52Var2.c() - top;
            int c3 = w52Var2.c() - w52Var4.c();
            w52Var4 = c > c2 ? F(w52Var2, w52Var4, f, -f2, c2, c3) : F(w52Var4, w52Var2, f, f2, c, c3);
        }
        int c4 = w52Var4.c();
        w52 w52Var5 = w52Var4;
        int b = w52Var5.b();
        if (b == 6) {
            int a = w52Var5.a();
            this.x = a;
            w(a);
        }
        C(view, b, c4, f2, false);
    }

    public final void C(View view, int i, int i2, float f, boolean z) {
        View view2;
        int i3;
        int i4;
        a62 a62Var = this.h0;
        if (this.c0 && a62Var != null && a62Var.c == i2 && a62Var.b == i) {
            return;
        }
        androidx.customview.widget.a aVar = this.F;
        boolean z2 = this.l0;
        nwt0 nwt0Var = this.k0;
        if (z2) {
            nwt0Var.c();
            nwt0Var.a = f;
            nwt0Var.u.i = i2;
        }
        if (!this.l0 && (aVar == null || !aVar.t(view.getLeft(), i2, view))) {
            Q(i, false);
            return;
        }
        if (this.l0) {
            int max = Math.max(this.K, this.z);
            int min = Math.min(this.z, this.K);
            int min2 = Math.min(Math.max(view.getTop(), min), max);
            nwt0Var.g = max;
            nwt0Var.h = min;
            nwt0Var.g(min2);
            nwt0Var.h();
        }
        if (!this.m0 || this.n0 == 0) {
            view2 = view;
            i3 = i;
            i4 = i2;
            N(i3, view2, z);
        } else {
            a62 a62Var2 = this.h0;
            if (a62Var2 != null && view != null) {
                view.removeCallbacks(a62Var2);
            }
            view2 = view;
            i3 = i;
            i4 = i2;
            this.h0 = new n290(view2, i3, i4, Math.max(this.z, i2 - this.n0), new g191(this));
            Q(2, z);
        }
        a62 a62Var3 = this.h0;
        if (a62Var3 == null) {
            StackTraceElement[] stackTraceElementArr = this.o0;
            if (stackTraceElementArr == null) {
                xby.d.w(new IllegalArgumentException(oyr.i(i3, "currentSettling action doesn't init. Error while animate to state: ")));
            } else {
                xby.d.x(new IllegalStateException(oyr.i(i3, "Missing action, error while animate to state: ")), "Stacktrace: " + stackTraceElementArr);
            }
        } else {
            view2.postOnAnimation(a62Var3);
        }
        a62 a62Var4 = this.h0;
        if (a62Var4 != null) {
            a62Var4.c = i4;
        }
    }

    public final boolean D(int i) {
        switch (i) {
            case 1:
            case 2:
                return false;
            case 3:
            case 4:
            case 6:
            case 7:
                return true;
            case 5:
                return this.C;
            default:
                xby.d.x(new IllegalStateException(oyr.i(i, "Missed case: ")), "Add missed case to switch");
                return false;
        }
    }

    public final w52 F(w52 w52Var, w52 w52Var2, float f, float f2, int i, int i2) {
        androidx.customview.widget.a aVar = this.F;
        boolean z = this.e0 && Math.abs(f) > Math.abs(f2);
        if (aVar != null && f2 >= aVar.n) {
            if (f2 >= (1.0f - ((i * 2.0f) / i2)) * this.i0 && !z) {
                return w52Var2;
            }
        }
        return w52Var;
    }

    public final void G(int i, boolean z) {
        H(0, z, i);
    }

    public final int H(int i, boolean z, int... iArr) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        int length = copyOf.length;
        for (int i2 = 0; i2 < length; i2++) {
            copyOf[i2] = Math.max(this.z, copyOf[i2]);
        }
        return I(i, z, Arrays.copyOf(copyOf, copyOf.length));
    }

    public final int I(int i, boolean z, int... iArr) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        int i2 = copyOf[i];
        if (copyOf.length > 1) {
            Arrays.sort(copyOf);
        }
        int binarySearch = Arrays.binarySearch(copyOf, 0, copyOf.length, i2);
        if (!Arrays.equals(this.w, copyOf) || this.x != binarySearch) {
            this.w = copyOf;
            this.x = binarySearch;
            if (z && y() == 6) {
                WeakReference weakReference = this.L;
                N(6, weakReference != null ? (View) weakReference.get() : null, true);
                P(6, true, true);
            }
        }
        return this.x;
    }

    public final void J(boolean z) {
        joe joeVar = this.p0;
        if (z == (joeVar != null)) {
            return;
        }
        if (joeVar != null) {
            joeVar.a();
            this.p0 = null;
        }
        if (z) {
            this.p0 = new joe();
        }
    }

    public final void K(int i, boolean z) {
        this.y = i;
        this.b0 = z;
        if (z) {
            this.z = i;
        } else {
            this.z = Math.max(i, this.z);
        }
    }

    public final void L(View view) {
        if (view == null) {
            return;
        }
        WeakReference weakReference = this.M;
        if (weakReference == null || ((View) weakReference.get()) != view) {
            this.M = new WeakReference(c.o(view));
        }
    }

    public final void M(int i, boolean z) {
        boolean z2 = this.b;
        if (i == -1) {
            if (z2) {
                return;
            } else {
                this.b = true;
            }
        } else {
            if (!z2 && this.a == i) {
                return;
            }
            this.b = false;
            this.a = Math.max(0, i);
            this.A = this.K - i;
        }
        if (this.L == null || y() != 4) {
            return;
        }
        WeakReference weakReference = this.L;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view == null || !z) {
            return;
        }
        N(4, view, true);
        P(4, true, true);
    }

    public final void N(int i, View view, boolean z) {
        a62 a62Var = this.h0;
        if (a62Var != null && view != null) {
            view.removeCallbacks(a62Var);
        }
        this.h0 = this.l0 ? new c62(this, view, i, 0) : new c62(this, view, i, 1);
        Q(2, z);
    }

    public final void O(int i) {
        P(i, true, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        if (r1.isLayoutRequested() == true) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P(int i, boolean z, boolean z2) {
        boolean z3;
        if (!D(i)) {
            xby.d.x(new IllegalArgumentException(oyr.i(i, "Illegal state argument: ")), "Unexpected card state passed");
            return;
        }
        this.S = false;
        WeakReference weakReference = this.L;
        if (weakReference == null) {
            this.E = i;
            return;
        }
        View view = (View) weakReference.get();
        if (view == null) {
            return;
        }
        y52 y52Var = this.T;
        if (y52Var != null) {
            view.removeCallbacks(y52Var);
            this.T = null;
        }
        if (i == this.E) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent != null) {
            z3 = true;
        }
        z3 = false;
        if (view.isInLayout() || (view.isAttachedToWindow() && z3)) {
            y52 y52Var2 = new y52(this, z, view, i, z2);
            this.T = y52Var2;
            view.post(y52Var2);
        } else if (z) {
            S(i, view, z2);
        } else {
            Q(i, false);
        }
    }

    public final void Q(int i, boolean z) {
        View view;
        this.U = z;
        a62 a62Var = this.h0;
        if (a62Var != null && i != 2 && (view = a62Var.a) != null) {
            view.removeCallbacks(a62Var);
            this.o0 = Thread.currentThread().getStackTrace();
            this.h0 = null;
        }
        if (this.E == i) {
            return;
        }
        this.E = i;
        WeakReference weakReference = this.L;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        t52 t52Var = this.N;
        if (view2 == null || t52Var == null) {
            return;
        }
        t52Var.d(i, this.S);
    }

    public final void R(boolean z) {
        G(this.z, z);
    }

    public final void S(int i, View view, boolean z) {
        int i2;
        if (i == 4) {
            i2 = this.A;
        } else if (i == 3 || i == 7) {
            i2 = this.z;
        } else if (i == 6) {
            i2 = w(this.x);
        } else {
            if (!this.C || i != 5) {
                ny61.g(oyr.i(i, "Illegal state argument: "));
                return;
            }
            i2 = this.K;
        }
        C(view, i, i2, 0.0f, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0084, code lost:
    
        if (java.lang.Math.abs(r8) <= java.lang.Math.abs(r6.d)) goto L40;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        RecyclerView.e layoutManager;
        androidx.customview.widget.a aVar = this.F;
        if (aVar != null && u()) {
            if (!view.isShown()) {
                this.G = true;
                return false;
            }
            joe joeVar = this.p0;
            if (joeVar != null) {
                joeVar.b(motionEvent, aVar);
            }
            int actionMasked = motionEvent.getActionMasked();
            if (this.G && (actionMasked == 1 || actionMasked == 3)) {
                this.G = false;
                return false;
            }
            if (actionMasked == 0) {
                this.O = -1;
            }
            if (this.e0) {
                qru qruVar = this.f0;
                qruVar.getClass();
                int action = motionEvent.getAction();
                if (action == 0) {
                    qruVar.a = motionEvent.getX();
                    qruVar.b = motionEvent.getY();
                    qruVar.c = 0.0f;
                    qruVar.d = 0.0f;
                } else if (action == 2) {
                    qruVar.c = motionEvent.getX() - qruVar.a;
                    qruVar.d = motionEvent.getY() - qruVar.b;
                }
                float f = qruVar.c;
                if (f != 0.0f) {
                    if (qruVar.d != 0.0f) {
                    }
                }
            }
            WeakReference weakReference = this.M;
            View view2 = weakReference != null ? (View) weakReference.get() : null;
            if (actionMasked == 0) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                this.P = y;
                if (view2 != null && coordinatorLayout.isPointInChildBounds(view2, x, y)) {
                    this.O = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.Q = true;
                    if ((view2 instanceof RecyclerView) && (layoutManager = ((RecyclerView) view2).getLayoutManager()) != null) {
                        this.R = layoutManager.J();
                    }
                }
                this.G = this.O == -1 && !coordinatorLayout.isPointInChildBounds(view, x, this.P);
            } else if (actionMasked == 1 || actionMasked == 3) {
                this.Q = false;
                this.R = true;
                this.O = -1;
            }
            if (this.p0 != null && actionMasked == 2 && this.O == -1) {
                this.O = motionEvent.getPointerId(motionEvent.getActionIndex());
            }
            boolean z = Math.abs(((float) this.P) - motionEvent.getY()) > ((float) aVar.b);
            if ((!this.G && aVar.s(motionEvent)) || (actionMasked == 2 && view2 != null && this.E != 1 && ((!coordinatorLayout.isPointInChildBounds(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || !this.R) && z))) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i) {
        int top;
        int top2;
        int i2;
        View view2;
        boolean z = false;
        if (coordinatorLayout.getHeight() == 0 || coordinatorLayout.getWidth() == 0) {
            return false;
        }
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        WeakReference weakReference = this.M;
        View view3 = weakReference != null ? (View) weakReference.get() : null;
        if (this.J && this.d0 && this.E == 1 && view3 != null && view3 != view && (view instanceof ViewParent)) {
            ViewParent parent = view3.getParent();
            while (true) {
                if (parent == null) {
                    break;
                }
                if (parent == view) {
                    z = true;
                    break;
                }
                parent = parent.getParent();
            }
        }
        int[] iArr = this.r0;
        if (z) {
            view3.getLocationInWindow(iArr);
            top = iArr[1];
        } else {
            top = view.getTop();
        }
        coordinatorLayout.onLayoutChild(view, i);
        this.K = coordinatorLayout.getHeight();
        int width = coordinatorLayout.getWidth();
        if (z) {
            view3.getLocationInWindow(iArr);
            top2 = iArr[1];
        } else {
            top2 = view.getTop();
        }
        if (this.b) {
            if (this.c == 0) {
                this.c = coordinatorLayout.getResources().getDimensionPixelSize(mrg0.bottom_sheet_peek_height_min);
            }
            int i3 = this.c;
            int i4 = this.K;
            i2 = Math.max(i3, i4 - ((width * width) / i4));
        } else {
            i2 = this.a;
        }
        if (!this.b0) {
            this.z = Math.max(this.y, this.K - view.getHeight());
        }
        int max = Math.max(this.K - i2, this.z);
        this.A = max;
        int i5 = this.E;
        if (i5 == 3 || i5 == 7) {
            E(this.z, view);
        } else if (this.C && i5 == 5) {
            E(this.K, view);
        } else if (i5 == 4) {
            E(max, view);
        } else if (i5 == 1 || i5 == 2) {
            E(top - top2, view);
        } else if (i5 == 6) {
            E(w(this.x), view);
        }
        if (this.F == null) {
            this.F = new androidx.customview.widget.a(coordinatorLayout.getContext(), coordinatorLayout, this.s0);
        }
        a62 a62Var = this.h0;
        if (this.c0 && this.E == 2 && a62Var != null && (view2 = a62Var.a) != null) {
            S(a62Var.b, view2, true);
        }
        this.L = new WeakReference(view);
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final boolean k(float f, float f2, View view) {
        this.H = f;
        this.I = f2;
        WeakReference weakReference = this.M;
        return (weakReference == null || !jl40.l(view, weakReference.get()) || this.E == 3) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final void l(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        this.S = true;
        WeakReference weakReference = this.M;
        View view3 = weakReference != null ? (View) weakReference.get() : null;
        if (jl40.l(view2, view3) && i3 != 1) {
            int top = view.getTop();
            int i4 = top - i2;
            if (i2 > 0) {
                int i5 = this.z;
                if (i4 >= i5 || !this.B) {
                    iArr[1] = i2;
                    if (this.V || i4 > w(0)) {
                        E(-i2, view);
                    }
                    Q(1, false);
                } else {
                    int i6 = top - i5;
                    iArr[1] = i6;
                    E(-i6, view);
                    Q(3, false);
                }
            } else if (i2 < 0 && !view2.canScrollVertically(-1)) {
                int i7 = this.A;
                if (i4 <= i7 || (this.C && this.Z)) {
                    iArr[1] = i2;
                    if (this.W || i4 < w(this.w.length - 1)) {
                        E(-i2, view);
                    }
                    Q(1, false);
                } else {
                    int i8 = top - i7;
                    iArr[1] = i8;
                    E(-i8, view);
                    Q(4, false);
                }
            }
            v(view.getTop(), view3);
            this.J = true;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final void n(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        WeakReference weakReference = this.M;
        if (jl40.l(view2, weakReference != null ? (View) weakReference.get() : null) && i5 == 1) {
            return;
        }
        super.n(coordinatorLayout, view, view2, i, i2, i3, i4, i5, iArr);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final void p(View view, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        if (savedState.getSuperState() == null) {
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        }
        if (savedState.getState() == 1 || savedState.getState() == 2) {
            this.E = 4;
        } else {
            this.E = savedState.getState();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final Parcelable q(View view) {
        return new SavedState(AbsSavedState.EMPTY_STATE, this.E);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final boolean r(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        this.H = 0.0f;
        this.I = 0.0f;
        this.J = false;
        return u() && (i & 2) != 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final void s(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        if (view.getTop() == this.z && this.p0 == null && this.B) {
            Q(3, false);
            return;
        }
        WeakReference weakReference = this.M;
        if (weakReference != null && jl40.l(view2, weakReference.get()) && this.J) {
            B(this.H, -this.I, view);
            this.J = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final boolean t(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        androidx.customview.widget.a aVar;
        int i;
        if (!u() || !view.isShown()) {
            return false;
        }
        androidx.customview.widget.a aVar2 = this.F;
        joe joeVar = this.p0;
        if (joeVar != null && aVar2 != null) {
            joeVar.c(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.E == 1 && actionMasked == 0) {
            return true;
        }
        if (actionMasked == 2 && !this.V && motionEvent.getY() <= w(0)) {
            E(w(0) - view.getTop(), view);
            return true;
        }
        if (aVar2 != null && ((aVar = this.F) == null || (i = aVar.c) == -1 || motionEvent.findPointerIndex(i) != -1)) {
            aVar2.l(motionEvent);
        }
        if (actionMasked == 0) {
            this.O = -1;
        }
        if (actionMasked == 2 && !this.G && aVar2 != null) {
            this.S = true;
            if (Math.abs(this.P - motionEvent.getY()) > aVar2.b) {
                aVar2.c(motionEvent.getPointerId(motionEvent.getActionIndex()), view);
            }
        }
        return !this.G;
    }

    public final boolean u() {
        WeakReference weakReference = this.L;
        return (weakReference == null || !this.a0 || ((View) weakReference.get()) == null || this.E == 7) ? false : true;
    }

    public final void v(int i, View view) {
        WeakReference weakReference = this.L;
        if (weakReference == null) {
            return;
        }
        View view2 = (View) weakReference.get();
        t52 t52Var = this.N;
        if (view2 == null || t52Var == null) {
            return;
        }
        t52Var.f(view2, A(i), this.U, view);
    }

    public final int w(int i) {
        return Math.max(Math.min(this.w[i], y() == 2 ? this.K : this.A), this.z);
    }

    public final float x() {
        int i = this.A - this.z;
        if (i <= 0) {
            return 0.0f;
        }
        return (r0 - w(this.x)) / i;
    }

    public final int y() {
        y52 y52Var = this.T;
        if (y52Var != null) {
            return y52Var.a();
        }
        a62 a62Var = this.h0;
        int i = this.E;
        return (i != 2 || a62Var == null) ? i : a62Var.b;
    }

    public final float z() {
        View view;
        WeakReference weakReference = this.L;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return 0.0f;
        }
        return A(view.getTop());
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0014\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0004\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\u0012\n\u0004\b\f\u0010\u0013\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lru/yandex/taxi/coordinator/AnchorBottomSheetBehavior$SavedState;", "Landroidx/customview/view/AbsSavedState;", "Landroid/os/Parcel;", "source", "<init>", "(Landroid/os/Parcel;)V", "Ljava/lang/ClassLoader;", "loader", "(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V", "Landroid/os/Parcelable;", "superState", "", ClidProvider.STATE, "(Landroid/os/Parcelable;I)V", "out", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", CA20Status.STATUS_USER_I, "getState", "()I", "getState$annotations", "()V", "Companion", "ru/yandex/taxi/coordinator/a", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static class SavedState extends androidx.customview.view.AbsSavedState {
        private final int state;
        public static final a Companion = new a();
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior$SavedState$Companion$CREATOR$1
            @Override // android.os.Parcelable.Creator
            public AnchorBottomSheetBehavior.SavedState createFromParcel(Parcel parcel) {
                return new AnchorBottomSheetBehavior.SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public AnchorBottomSheetBehavior.SavedState[] newArray(int size) {
                return new AnchorBottomSheetBehavior.SavedState[size];
            }
        };

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.state = parcel.readInt();
        }

        public static /* synthetic */ void getState$annotations() {
        }

        public final int getState() {
            return this.state;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel out, int flags) {
            super.writeToParcel(out, flags);
            out.writeInt(this.state);
        }

        public SavedState(Parcel parcel) {
            this(parcel, (ClassLoader) null);
        }

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.state = i;
        }
    }

    public AnchorBottomSheetBehavior() {
        this.w = new int[]{0};
        this.B = true;
        this.E = 6;
        this.R = true;
        this.V = true;
        this.W = true;
        this.Z = true;
        this.a0 = true;
        this.f0 = new qru();
        sor sorVar = new sor();
        this.j0 = sorVar;
        this.k0 = new nwt0(sorVar);
        this.r0 = new int[2];
        this.s0 = new e62(this);
    }
}
