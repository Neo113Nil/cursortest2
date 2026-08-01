package com.google.android.material.bottomsheet;

import B.c;
import B0.f;
import B0.k;
import D1.h;
import L0.m;
import M0.b;
import M0.i;
import O.B;
import O.C0025a;
import O.C0026b;
import O.C0028d;
import O.K;
import O.S;
import O.T;
import O.U;
import P.d;
import S0.g;
import U.e;
import a.AbstractC0078a;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.PathInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import b.C0106b;
import b0.C0117a;
import com.lumenpath.harispro.hrnavigator.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import u0.AbstractC0358a;
import v0.AbstractC0360a;

/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends c implements b {

    /* renamed from: A, reason: collision with root package name */
    public final k f2366A;

    /* renamed from: B, reason: collision with root package name */
    public final ValueAnimator f2367B;

    /* renamed from: C, reason: collision with root package name */
    public final int f2368C;

    /* renamed from: D, reason: collision with root package name */
    public int f2369D;

    /* renamed from: E, reason: collision with root package name */
    public int f2370E;

    /* renamed from: F, reason: collision with root package name */
    public final float f2371F;

    /* renamed from: G, reason: collision with root package name */
    public int f2372G;

    /* renamed from: H, reason: collision with root package name */
    public final float f2373H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f2374I;
    public boolean J;

    /* renamed from: K, reason: collision with root package name */
    public final boolean f2375K;

    /* renamed from: L, reason: collision with root package name */
    public int f2376L;

    /* renamed from: M, reason: collision with root package name */
    public e f2377M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f2378N;

    /* renamed from: O, reason: collision with root package name */
    public int f2379O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f2380P;

    /* renamed from: Q, reason: collision with root package name */
    public final float f2381Q;

    /* renamed from: R, reason: collision with root package name */
    public int f2382R;

    /* renamed from: S, reason: collision with root package name */
    public int f2383S;

    /* renamed from: T, reason: collision with root package name */
    public int f2384T;

    /* renamed from: U, reason: collision with root package name */
    public WeakReference f2385U;

    /* renamed from: V, reason: collision with root package name */
    public WeakReference f2386V;

    /* renamed from: W, reason: collision with root package name */
    public final ArrayList f2387W;

    /* renamed from: X, reason: collision with root package name */
    public VelocityTracker f2388X;

    /* renamed from: Y, reason: collision with root package name */
    public i f2389Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f2390Z;

    /* renamed from: a, reason: collision with root package name */
    public final int f2391a;

    /* renamed from: a0, reason: collision with root package name */
    public int f2392a0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2393b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f2394b0;

    /* renamed from: c, reason: collision with root package name */
    public final float f2395c;

    /* renamed from: c0, reason: collision with root package name */
    public HashMap f2396c0;

    /* renamed from: d, reason: collision with root package name */
    public final int f2397d;

    /* renamed from: d0, reason: collision with root package name */
    public final SparseIntArray f2398d0;
    public int e;

    /* renamed from: e0, reason: collision with root package name */
    public final f f2399e0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2400f;

    /* renamed from: g, reason: collision with root package name */
    public int f2401g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2402h;
    public final g i;
    public final ColorStateList j;

    /* renamed from: k, reason: collision with root package name */
    public final int f2403k;

    /* renamed from: l, reason: collision with root package name */
    public final int f2404l;

    /* renamed from: m, reason: collision with root package name */
    public int f2405m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f2406n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f2407o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f2408p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f2409q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f2410r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f2411s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f2412t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f2413u;

    /* renamed from: v, reason: collision with root package name */
    public int f2414v;

    /* renamed from: w, reason: collision with root package name */
    public int f2415w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f2416x;

    /* renamed from: y, reason: collision with root package name */
    public final S0.k f2417y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f2418z;

    public BottomSheetBehavior() {
        this.f2391a = 0;
        this.f2393b = true;
        this.f2403k = -1;
        this.f2404l = -1;
        this.f2366A = new k(this);
        this.f2371F = 0.5f;
        this.f2373H = -1.0f;
        this.f2375K = true;
        this.f2376L = 4;
        this.f2381Q = 0.1f;
        this.f2387W = new ArrayList();
        this.f2392a0 = -1;
        this.f2398d0 = new SparseIntArray();
        this.f2399e0 = new f(0, this);
    }

    public static BottomSheetBehavior A(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof B.f)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        c cVar = ((B.f) layoutParams).f12a;
        if (cVar instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) cVar;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    public static int B(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    public static View z(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap weakHashMap = K.f747a;
        if (B.h(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View z2 = z(viewGroup.getChildAt(i));
                if (z2 != null) {
                    return z2;
                }
            }
        }
        return null;
    }

    public final int C() {
        if (this.f2393b) {
            return this.f2369D;
        }
        return Math.max(this.f2368C, this.f2410r ? 0 : this.f2415w);
    }

    public final int D(int i) {
        if (i == 3) {
            return C();
        }
        if (i == 4) {
            return this.f2372G;
        }
        if (i == 5) {
            return this.f2384T;
        }
        if (i == 6) {
            return this.f2370E;
        }
        throw new IllegalArgumentException(h.e("Invalid state to get top offset: ", i));
    }

    public final boolean E() {
        WeakReference weakReference = this.f2385U;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        int[] iArr = new int[2];
        ((View) this.f2385U.get()).getLocationOnScreen(iArr);
        return iArr[1] == 0;
    }

    public final void F(boolean z2) {
        if (this.f2374I != z2) {
            this.f2374I = z2;
            if (!z2 && this.f2376L == 5) {
                H(4);
            }
            L();
        }
    }

    public final void G(int i) {
        if (i == -1) {
            if (this.f2400f) {
                return;
            } else {
                this.f2400f = true;
            }
        } else {
            if (!this.f2400f && this.e == i) {
                return;
            }
            this.f2400f = false;
            this.e = Math.max(0, i);
        }
        O();
    }

    public final void H(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(h.h(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.f2374I && i == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i);
            return;
        }
        int i2 = (i == 6 && this.f2393b && D(i) <= this.f2369D) ? 3 : i;
        WeakReference weakReference = this.f2385U;
        if (weakReference == null || weakReference.get() == null) {
            I(i);
            return;
        }
        View view = (View) this.f2385U.get();
        B0.b bVar = new B0.b(this, view, i2);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = K.f747a;
            if (view.isAttachedToWindow()) {
                view.post(bVar);
                return;
            }
        }
        bVar.run();
    }

    public final void I(int i) {
        View view;
        if (this.f2376L == i) {
            return;
        }
        this.f2376L = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z2 = this.f2374I;
        }
        WeakReference weakReference = this.f2385U;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = 0;
        if (i == 3) {
            N(true);
        } else if (i == 6 || i == 5 || i == 4) {
            N(false);
        }
        M(i, true);
        while (true) {
            ArrayList arrayList = this.f2387W;
            if (i2 >= arrayList.size()) {
                L();
                return;
            } else {
                ((B0.h) arrayList.get(i2)).c(view, i);
                i2++;
            }
        }
    }

    public final boolean J(View view, float f2) {
        if (this.J) {
            return true;
        }
        if (view.getTop() < this.f2372G) {
            return false;
        }
        return Math.abs(((f2 * this.f2381Q) + ((float) view.getTop())) - ((float) this.f2372G)) / ((float) x()) > 0.5f;
    }

    public final void K(View view, int i, boolean z2) {
        int D2 = D(i);
        e eVar = this.f2377M;
        if (eVar == null || (!z2 ? eVar.u(view, view.getLeft(), D2) : eVar.s(view.getLeft(), D2))) {
            I(i);
            return;
        }
        I(2);
        M(i, true);
        this.f2366A.a(i);
    }

    public final void L() {
        View view;
        int i;
        WeakReference weakReference = this.f2385U;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        K.i(view, 524288);
        K.g(view, 0);
        K.i(view, 262144);
        K.g(view, 0);
        K.i(view, 1048576);
        K.g(view, 0);
        SparseIntArray sparseIntArray = this.f2398d0;
        int i2 = sparseIntArray.get(0, -1);
        if (i2 != -1) {
            K.i(view, i2);
            K.g(view, 0);
            sparseIntArray.delete(0);
        }
        if (!this.f2393b && this.f2376L != 6) {
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            B0.g gVar = new B0.g(this, 6);
            ArrayList e = K.e(view);
            int i3 = 0;
            while (true) {
                if (i3 >= e.size()) {
                    int i4 = -1;
                    for (int i5 = 0; i5 < 32 && i4 == -1; i5++) {
                        int i6 = K.f750d[i5];
                        boolean z2 = true;
                        for (int i7 = 0; i7 < e.size(); i7++) {
                            z2 &= ((d) e.get(i7)).a() != i6;
                        }
                        if (z2) {
                            i4 = i6;
                        }
                    }
                    i = i4;
                } else {
                    if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((d) e.get(i3)).f887a).getLabel())) {
                        i = ((d) e.get(i3)).a();
                        break;
                    }
                    i3++;
                }
            }
            if (i != -1) {
                d dVar = new d(null, i, string, gVar, null);
                View.AccessibilityDelegate c2 = K.c(view);
                C0026b c0026b = c2 == null ? null : c2 instanceof C0025a ? ((C0025a) c2).f783a : new C0026b(c2);
                if (c0026b == null) {
                    c0026b = new C0026b();
                }
                K.l(view, c0026b);
                K.i(view, dVar.a());
                K.e(view).add(dVar);
                K.g(view, 0);
            }
            sparseIntArray.put(0, i);
        }
        if (this.f2374I && this.f2376L != 5) {
            K.j(view, d.j, new B0.g(this, 5));
        }
        int i8 = this.f2376L;
        if (i8 == 3) {
            K.j(view, d.i, new B0.g(this, this.f2393b ? 4 : 6));
            return;
        }
        if (i8 == 4) {
            K.j(view, d.f884h, new B0.g(this, this.f2393b ? 3 : 6));
        } else {
            if (i8 != 6) {
                return;
            }
            K.j(view, d.i, new B0.g(this, 4));
            K.j(view, d.f884h, new B0.g(this, 3));
        }
    }

    public final void M(int i, boolean z2) {
        g gVar = this.i;
        ValueAnimator valueAnimator = this.f2367B;
        if (i == 2) {
            return;
        }
        boolean z3 = this.f2376L == 3 && (this.f2416x || E());
        if (this.f2418z == z3 || gVar == null) {
            return;
        }
        this.f2418z = z3;
        if (!z2 || valueAnimator == null) {
            if (valueAnimator != null && valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
            gVar.n(this.f2418z ? w() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            valueAnimator.reverse();
        } else {
            valueAnimator.setFloatValues(gVar.f1076a.i, z3 ? w() : 1.0f);
            valueAnimator.start();
        }
    }

    public final void N(boolean z2) {
        WeakReference weakReference = this.f2385U;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z2) {
                if (this.f2396c0 != null) {
                    return;
                } else {
                    this.f2396c0 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.f2385U.get() && z2) {
                    this.f2396c0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z2) {
                return;
            }
            this.f2396c0 = null;
        }
    }

    public final void O() {
        View view;
        if (this.f2385U != null) {
            v();
            if (this.f2376L != 4 || (view = (View) this.f2385U.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // M0.b
    public final void a() {
        i iVar = this.f2389Y;
        if (iVar == null) {
            return;
        }
        C0106b c0106b = iVar.f609f;
        iVar.f609f = null;
        if (c0106b == null || Build.VERSION.SDK_INT < 34) {
            H(this.f2374I ? 5 : 4);
            return;
        }
        boolean z2 = this.f2374I;
        int i = iVar.f608d;
        int i2 = iVar.f607c;
        float f2 = c0106b.f2266c;
        if (!z2) {
            AnimatorSet a2 = iVar.a();
            a2.setDuration(AbstractC0360a.c(i2, i, f2));
            a2.start();
            H(4);
            return;
        }
        B0.c cVar = new B0.c(0, this);
        View view = iVar.f606b;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getScaleY() * view.getHeight());
        ofFloat.setInterpolator(new C0117a(1));
        ofFloat.setDuration(AbstractC0360a.c(i2, i, f2));
        ofFloat.addListener(new B0.c(1, iVar));
        ofFloat.addListener(cVar);
        ofFloat.start();
    }

    @Override // M0.b
    public final void b(C0106b c0106b) {
        i iVar = this.f2389Y;
        if (iVar == null) {
            return;
        }
        if (iVar.f609f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        C0106b c0106b2 = iVar.f609f;
        iVar.f609f = c0106b;
        if (c0106b2 == null) {
            return;
        }
        iVar.b(c0106b.f2266c);
    }

    @Override // M0.b
    public final void c(C0106b c0106b) {
        i iVar = this.f2389Y;
        if (iVar == null) {
            return;
        }
        iVar.f609f = c0106b;
    }

    @Override // M0.b
    public final void d() {
        i iVar = this.f2389Y;
        if (iVar == null) {
            return;
        }
        if (iVar.f609f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        C0106b c0106b = iVar.f609f;
        iVar.f609f = null;
        if (c0106b == null) {
            return;
        }
        AnimatorSet a2 = iVar.a();
        a2.setDuration(iVar.e);
        a2.start();
    }

    @Override // B.c
    public final void g(B.f fVar) {
        this.f2385U = null;
        this.f2377M = null;
        this.f2389Y = null;
    }

    @Override // B.c
    public final void i() {
        this.f2385U = null;
        this.f2377M = null;
        this.f2389Y = null;
    }

    @Override // B.c
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i;
        e eVar;
        if (!view.isShown() || !this.f2375K) {
            this.f2378N = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2390Z = -1;
            this.f2392a0 = -1;
            VelocityTracker velocityTracker = this.f2388X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f2388X = null;
            }
        }
        if (this.f2388X == null) {
            this.f2388X = VelocityTracker.obtain();
        }
        this.f2388X.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x2 = (int) motionEvent.getX();
            this.f2392a0 = (int) motionEvent.getY();
            if (this.f2376L != 2) {
                WeakReference weakReference = this.f2386V;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.o(view2, x2, this.f2392a0)) {
                    this.f2390Z = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f2394b0 = true;
                }
            }
            this.f2378N = this.f2390Z == -1 && !coordinatorLayout.o(view, x2, this.f2392a0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f2394b0 = false;
            this.f2390Z = -1;
            if (this.f2378N) {
                this.f2378N = false;
                return false;
            }
        }
        if (!this.f2378N && (eVar = this.f2377M) != null && eVar.t(motionEvent)) {
            return true;
        }
        WeakReference weakReference2 = this.f2386V;
        View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
        return (actionMasked != 2 || view3 == null || this.f2378N || this.f2376L == 1 || coordinatorLayout.o(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f2377M == null || (i = this.f2392a0) == -1 || Math.abs(((float) i) - motionEvent.getY()) <= ((float) this.f2377M.f1175b)) ? false : true;
    }

    @Override // B.c
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, int i) {
        int i2 = this.f2404l;
        g gVar = this.i;
        WeakHashMap weakHashMap = K.f747a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        int i3 = 0;
        if (this.f2385U == null) {
            this.f2401g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            int i4 = Build.VERSION.SDK_INT;
            boolean z2 = (i4 < 29 || this.f2406n || this.f2400f) ? false : true;
            if (this.f2407o || this.f2408p || this.f2409q || this.f2411s || this.f2412t || this.f2413u || z2) {
                m.d(view, new B0.e(this, z2));
            }
            C0028d c0028d = new C0028d(view);
            if (i4 >= 30) {
                view.setWindowInsetsAnimationCallback(new U(c0028d));
            } else {
                PathInterpolator pathInterpolator = T.e;
                Object tag = view.getTag(R.id.tag_on_apply_window_listener);
                View.OnApplyWindowInsetsListener s2 = new S(view, c0028d);
                view.setTag(R.id.tag_window_insets_animation_callback, s2);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(s2);
                }
            }
            this.f2385U = new WeakReference(view);
            this.f2389Y = new i(view);
            if (gVar != null) {
                view.setBackground(gVar);
                float f2 = this.f2373H;
                if (f2 == -1.0f) {
                    f2 = B.e(view);
                }
                gVar.l(f2);
            } else {
                ColorStateList colorStateList = this.j;
                if (colorStateList != null) {
                    B.i(view, colorStateList);
                }
            }
            L();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.f2377M == null) {
            this.f2377M = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f2399e0);
        }
        int top = view.getTop();
        coordinatorLayout.q(view, i);
        this.f2383S = coordinatorLayout.getWidth();
        this.f2384T = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f2382R = height;
        int i5 = this.f2384T;
        int i6 = i5 - height;
        int i7 = this.f2415w;
        if (i6 < i7) {
            if (this.f2410r) {
                if (i2 != -1) {
                    i5 = Math.min(i5, i2);
                }
                this.f2382R = i5;
            } else {
                int i8 = i5 - i7;
                if (i2 != -1) {
                    i8 = Math.min(i8, i2);
                }
                this.f2382R = i8;
            }
        }
        this.f2369D = Math.max(0, this.f2384T - this.f2382R);
        this.f2370E = (int) ((1.0f - this.f2371F) * this.f2384T);
        v();
        int i9 = this.f2376L;
        if (i9 == 3) {
            view.offsetTopAndBottom(C());
        } else if (i9 == 6) {
            view.offsetTopAndBottom(this.f2370E);
        } else if (this.f2374I && i9 == 5) {
            view.offsetTopAndBottom(this.f2384T);
        } else if (i9 == 4) {
            view.offsetTopAndBottom(this.f2372G);
        } else if (i9 == 1 || i9 == 2) {
            view.offsetTopAndBottom(top - view.getTop());
        }
        M(this.f2376L, false);
        this.f2386V = new WeakReference(z(view));
        while (true) {
            ArrayList arrayList = this.f2387W;
            if (i3 >= arrayList.size()) {
                return true;
            }
            ((B0.h) arrayList.get(i3)).a(view);
            i3++;
        }
    }

    @Override // B.c
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(B(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.f2403k, marginLayoutParams.width), B(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f2404l, marginLayoutParams.height));
        return true;
    }

    @Override // B.c
    public final boolean m(View view) {
        WeakReference weakReference = this.f2386V;
        return (weakReference == null || view != weakReference.get() || this.f2376L == 3) ? false : true;
    }

    @Override // B.c
    public final void n(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        boolean z2 = this.f2375K;
        if (i3 == 1) {
            return;
        }
        WeakReference weakReference = this.f2386V;
        if (view2 != (weakReference != null ? (View) weakReference.get() : null)) {
            return;
        }
        int top = view.getTop();
        int i4 = top - i2;
        if (i2 > 0) {
            if (i4 < C()) {
                int C2 = top - C();
                iArr[1] = C2;
                WeakHashMap weakHashMap = K.f747a;
                view.offsetTopAndBottom(-C2);
                I(3);
            } else {
                if (!z2) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap weakHashMap2 = K.f747a;
                view.offsetTopAndBottom(-i2);
                I(1);
            }
        } else if (i2 < 0 && !view2.canScrollVertically(-1)) {
            int i5 = this.f2372G;
            if (i4 > i5 && !this.f2374I) {
                int i6 = top - i5;
                iArr[1] = i6;
                WeakHashMap weakHashMap3 = K.f747a;
                view.offsetTopAndBottom(-i6);
                I(4);
            } else {
                if (!z2) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap weakHashMap4 = K.f747a;
                view.offsetTopAndBottom(-i2);
                I(1);
            }
        }
        y(view.getTop());
        this.f2379O = i2;
        this.f2380P = true;
    }

    @Override // B.c
    public final void o(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
    }

    @Override // B.c
    public final void q(View view, Parcelable parcelable) {
        B0.i iVar = (B0.i) parcelable;
        int i = this.f2391a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.e = iVar.f49d;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f2393b = iVar.e;
            }
            if (i == -1 || (i & 4) == 4) {
                this.f2374I = iVar.f50f;
            }
            if (i == -1 || (i & 8) == 8) {
                this.J = iVar.f51g;
            }
        }
        int i2 = iVar.f48c;
        if (i2 == 1 || i2 == 2) {
            this.f2376L = 4;
        } else {
            this.f2376L = i2;
        }
    }

    @Override // B.c
    public final Parcelable r(View view) {
        return new B0.i(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // B.c
    public final boolean s(View view, int i, int i2) {
        this.f2379O = 0;
        this.f2380P = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r4.getTop() <= r3.f2370E) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        if (java.lang.Math.abs(r5 - r3.f2369D) < java.lang.Math.abs(r5 - r3.f2372G)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0080, code lost:
    
        if (r5 < java.lang.Math.abs(r5 - r3.f2372G)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0090, code lost:
    
        if (java.lang.Math.abs(r5 - r2) < java.lang.Math.abs(r5 - r3.f2372G)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ac, code lost:
    
        if (java.lang.Math.abs(r5 - r3.f2370E) < java.lang.Math.abs(r5 - r3.f2372G)) goto L50;
     */
    @Override // B.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(View view, View view2, int i) {
        float yVelocity;
        int i2 = 3;
        if (view.getTop() == C()) {
            I(3);
            return;
        }
        WeakReference weakReference = this.f2386V;
        if (weakReference != null && view2 == weakReference.get() && this.f2380P) {
            if (this.f2379O > 0) {
                if (!this.f2393b) {
                }
                K(view, i2, false);
                this.f2380P = false;
            }
            if (this.f2374I) {
                VelocityTracker velocityTracker = this.f2388X;
                if (velocityTracker == null) {
                    yVelocity = RecyclerView.f2111C0;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.f2395c);
                    yVelocity = this.f2388X.getYVelocity(this.f2390Z);
                }
                if (J(view, yVelocity)) {
                    i2 = 5;
                    K(view, i2, false);
                    this.f2380P = false;
                }
            }
            if (this.f2379O == 0) {
                int top = view.getTop();
                if (!this.f2393b) {
                    int i3 = this.f2370E;
                    if (top < i3) {
                    }
                    i2 = 6;
                }
            } else {
                if (!this.f2393b) {
                    int top2 = view.getTop();
                }
                i2 = 4;
            }
            K(view, i2, false);
            this.f2380P = false;
        }
    }

    @Override // B.c
    public final boolean u(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.f2376L;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        e eVar = this.f2377M;
        if (eVar != null && (this.f2375K || i == 1)) {
            eVar.m(motionEvent);
        }
        if (actionMasked == 0) {
            this.f2390Z = -1;
            this.f2392a0 = -1;
            VelocityTracker velocityTracker = this.f2388X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f2388X = null;
            }
        }
        if (this.f2388X == null) {
            this.f2388X = VelocityTracker.obtain();
        }
        this.f2388X.addMovement(motionEvent);
        if (this.f2377M != null && ((this.f2375K || this.f2376L == 1) && actionMasked == 2 && !this.f2378N)) {
            float abs = Math.abs(this.f2392a0 - motionEvent.getY());
            e eVar2 = this.f2377M;
            if (abs > eVar2.f1175b) {
                eVar2.c(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f2378N;
    }

    public final void v() {
        int x2 = x();
        if (this.f2393b) {
            this.f2372G = Math.max(this.f2384T - x2, this.f2369D);
        } else {
            this.f2372G = this.f2384T - x2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float w() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        RoundedCorner roundedCorner;
        float f2;
        RoundedCorner roundedCorner2;
        int radius;
        int radius2;
        g gVar = this.i;
        float f3 = RecyclerView.f2111C0;
        if (gVar != null && (weakReference = this.f2385U) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            View view = (View) this.f2385U.get();
            if (E() && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                float h2 = this.i.h();
                roundedCorner = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    radius2 = roundedCorner.getRadius();
                    float f4 = radius2;
                    if (f4 > RecyclerView.f2111C0 && h2 > RecyclerView.f2111C0) {
                        f2 = f4 / h2;
                        g gVar2 = this.i;
                        float a2 = gVar2.f1076a.f1062a.f1109f.a(gVar2.g());
                        roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                        if (roundedCorner2 != null) {
                            radius = roundedCorner2.getRadius();
                            float f5 = radius;
                            if (f5 > RecyclerView.f2111C0 && a2 > RecyclerView.f2111C0) {
                                f3 = f5 / a2;
                            }
                        }
                        return Math.max(f2, f3);
                    }
                }
                f2 = 0.0f;
                g gVar22 = this.i;
                float a22 = gVar22.f1076a.f1062a.f1109f.a(gVar22.g());
                roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                if (roundedCorner2 != null) {
                }
                return Math.max(f2, f3);
            }
        }
        return RecyclerView.f2111C0;
    }

    public final int x() {
        int i;
        return this.f2400f ? Math.min(Math.max(this.f2401g, this.f2384T - ((this.f2383S * 9) / 16)), this.f2382R) + this.f2414v : (this.f2406n || this.f2407o || (i = this.f2405m) <= 0) ? this.e + this.f2414v : Math.max(this.e, i + this.f2402h);
    }

    public final void y(int i) {
        View view = (View) this.f2385U.get();
        if (view != null) {
            ArrayList arrayList = this.f2387W;
            if (arrayList.isEmpty()) {
                return;
            }
            int i2 = this.f2372G;
            if (i <= i2 && i2 != C()) {
                C();
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                ((B0.h) arrayList.get(i3)).b(view);
            }
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        int i2 = 0;
        this.f2391a = 0;
        this.f2393b = true;
        this.f2403k = -1;
        this.f2404l = -1;
        this.f2366A = new k(this);
        this.f2371F = 0.5f;
        this.f2373H = -1.0f;
        this.f2375K = true;
        this.f2376L = 4;
        this.f2381Q = 0.1f;
        this.f2387W = new ArrayList();
        this.f2392a0 = -1;
        this.f2398d0 = new SparseIntArray();
        this.f2399e0 = new f(i2, this);
        this.f2402h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0358a.f4441c);
        if (obtainStyledAttributes.hasValue(3)) {
            this.j = AbstractC0078a.B(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(21)) {
            this.f2417y = S0.k.b(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
        }
        S0.k kVar = this.f2417y;
        if (kVar != null) {
            g gVar = new g(kVar);
            this.i = gVar;
            gVar.j(context);
            ColorStateList colorStateList = this.j;
            if (colorStateList != null) {
                this.i.m(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.i.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(w(), 1.0f);
        this.f2367B = ofFloat;
        ofFloat.setDuration(500L);
        this.f2367B.addUpdateListener(new B0.d(i2, this));
        this.f2373H = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f2403k = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.f2404l = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue != null && (i = peekValue.data) == -1) {
            G(i);
        } else {
            G(obtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        F(obtainStyledAttributes.getBoolean(8, false));
        this.f2406n = obtainStyledAttributes.getBoolean(13, false);
        boolean z2 = obtainStyledAttributes.getBoolean(6, true);
        if (this.f2393b != z2) {
            this.f2393b = z2;
            if (this.f2385U != null) {
                v();
            }
            I((this.f2393b && this.f2376L == 6) ? 3 : this.f2376L);
            M(this.f2376L, true);
            L();
        }
        this.J = obtainStyledAttributes.getBoolean(12, false);
        this.f2375K = obtainStyledAttributes.getBoolean(4, true);
        this.f2391a = obtainStyledAttributes.getInt(10, 0);
        float f2 = obtainStyledAttributes.getFloat(7, 0.5f);
        if (f2 > RecyclerView.f2111C0 && f2 < 1.0f) {
            this.f2371F = f2;
            if (this.f2385U != null) {
                this.f2370E = (int) ((1.0f - f2) * this.f2384T);
            }
            TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
            if (peekValue2 != null && peekValue2.type == 16) {
                int i3 = peekValue2.data;
                if (i3 >= 0) {
                    this.f2368C = i3;
                    M(this.f2376L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
                if (dimensionPixelOffset >= 0) {
                    this.f2368C = dimensionPixelOffset;
                    M(this.f2376L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.f2397d = obtainStyledAttributes.getInt(11, 500);
            this.f2407o = obtainStyledAttributes.getBoolean(17, false);
            this.f2408p = obtainStyledAttributes.getBoolean(18, false);
            this.f2409q = obtainStyledAttributes.getBoolean(19, false);
            this.f2410r = obtainStyledAttributes.getBoolean(20, true);
            this.f2411s = obtainStyledAttributes.getBoolean(14, false);
            this.f2412t = obtainStyledAttributes.getBoolean(15, false);
            this.f2413u = obtainStyledAttributes.getBoolean(16, false);
            this.f2416x = obtainStyledAttributes.getBoolean(23, true);
            obtainStyledAttributes.recycle();
            this.f2395c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }
}
