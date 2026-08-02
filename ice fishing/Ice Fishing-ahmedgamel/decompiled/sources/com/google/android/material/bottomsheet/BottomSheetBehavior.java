package com.google.android.material.bottomsheet;

import A3.q;
import A3.r;
import B.b;
import G3.g;
import G3.k;
import H3.c;
import H3.e;
import I1.a;
import M.h;
import M0.i;
import N3.C;
import O.C0326a;
import O.C0328b;
import O.J;
import O.L;
import O.X;
import O.i0;
import O.j0;
import O.k0;
import P.f;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.AbsSavedState;
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
import com.IceFishing.LiveIceFishing.C5248R;
import com.anythink.basead.exoplayer.h.o;
import com.google.android.gms.internal.ads.C2582Fo;
import com.google.android.gms.internal.ads.Wv;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import m3.AbstractC4742a;
import r3.C4907a;

/* loaded from: classes2.dex */
public class BottomSheetBehavior<V extends View> extends b {

    /* renamed from: A, reason: collision with root package name */
    public final e f36598A;

    /* renamed from: B, reason: collision with root package name */
    public final ValueAnimator f36599B;

    /* renamed from: C, reason: collision with root package name */
    public final int f36600C;

    /* renamed from: D, reason: collision with root package name */
    public int f36601D;

    /* renamed from: E, reason: collision with root package name */
    public int f36602E;

    /* renamed from: F, reason: collision with root package name */
    public final float f36603F;

    /* renamed from: G, reason: collision with root package name */
    public int f36604G;

    /* renamed from: H, reason: collision with root package name */
    public final float f36605H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f36606I;
    public boolean J;

    /* renamed from: K, reason: collision with root package name */
    public final boolean f36607K;

    /* renamed from: L, reason: collision with root package name */
    public int f36608L;

    /* renamed from: M, reason: collision with root package name */
    public W.e f36609M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f36610N;

    /* renamed from: O, reason: collision with root package name */
    public int f36611O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f36612P;

    /* renamed from: Q, reason: collision with root package name */
    public final float f36613Q;

    /* renamed from: R, reason: collision with root package name */
    public int f36614R;

    /* renamed from: S, reason: collision with root package name */
    public int f36615S;

    /* renamed from: T, reason: collision with root package name */
    public int f36616T;

    /* renamed from: U, reason: collision with root package name */
    public WeakReference f36617U;

    /* renamed from: V, reason: collision with root package name */
    public WeakReference f36618V;

    /* renamed from: W, reason: collision with root package name */
    public final ArrayList f36619W;

    /* renamed from: X, reason: collision with root package name */
    public VelocityTracker f36620X;
    public int Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f36621Z;

    /* renamed from: a, reason: collision with root package name */
    public final int f36622a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f36623a0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f36624b;

    /* renamed from: b0, reason: collision with root package name */
    public HashMap f36625b0;

    /* renamed from: c, reason: collision with root package name */
    public final float f36626c;

    /* renamed from: c0, reason: collision with root package name */
    public final SparseIntArray f36627c0;

    /* renamed from: d, reason: collision with root package name */
    public final int f36628d;

    /* renamed from: d0, reason: collision with root package name */
    public final c f36629d0;

    /* renamed from: e, reason: collision with root package name */
    public int f36630e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f36631f;

    /* renamed from: g, reason: collision with root package name */
    public int f36632g;

    /* renamed from: h, reason: collision with root package name */
    public final int f36633h;
    public final g i;

    /* renamed from: j, reason: collision with root package name */
    public final ColorStateList f36634j;

    /* renamed from: k, reason: collision with root package name */
    public final int f36635k;

    /* renamed from: l, reason: collision with root package name */
    public final int f36636l;

    /* renamed from: m, reason: collision with root package name */
    public int f36637m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f36638n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f36639o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f36640p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f36641q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f36642r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f36643s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f36644t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f36645u;

    /* renamed from: v, reason: collision with root package name */
    public int f36646v;

    /* renamed from: w, reason: collision with root package name */
    public int f36647w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f36648x;

    /* renamed from: y, reason: collision with root package name */
    public final k f36649y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f36650z;

    public BottomSheetBehavior() {
        this.f36622a = 0;
        this.f36624b = true;
        this.f36635k = -1;
        this.f36636l = -1;
        this.f36598A = new e(this);
        this.f36603F = 0.5f;
        this.f36605H = -1.0f;
        this.f36607K = true;
        this.f36608L = 4;
        this.f36613Q = 0.1f;
        this.f36619W = new ArrayList();
        this.f36621Z = -1;
        this.f36627c0 = new SparseIntArray();
        this.f36629d0 = new c(this, 1);
    }

    public static View v(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap weakHashMap = X.f2142a;
        if (L.p(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View v9 = v(viewGroup.getChildAt(i));
            if (v9 != null) {
                return v9;
            }
        }
        return null;
    }

    public static int w(int i, int i4, int i6, int i9) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i4, i9);
        if (i6 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i6), 1073741824);
        }
        if (size != 0) {
            i6 = Math.min(size, i6);
        }
        return View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
    }

    public final void A(int i) {
        if (i == -1) {
            if (this.f36631f) {
                return;
            } else {
                this.f36631f = true;
            }
        } else {
            if (!this.f36631f && this.f36630e == i) {
                return;
            }
            this.f36631f = false;
            this.f36630e = Math.max(0, i);
        }
        I();
    }

    public final void B(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(Wv.i(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.f36606I && i == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i);
            return;
        }
        int i4 = (i == 6 && this.f36624b && y(i) <= this.f36601D) ? 3 : i;
        WeakReference weakReference = this.f36617U;
        if (weakReference == null || weakReference.get() == null) {
            C(i);
            return;
        }
        View view = (View) this.f36617U.get();
        i iVar = new i(this, view, i4);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = X.f2142a;
            if (view.isAttachedToWindow()) {
                view.post(iVar);
                return;
            }
        }
        iVar.run();
    }

    public final void C(int i) {
        if (this.f36608L == i) {
            return;
        }
        this.f36608L = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z6 = this.f36606I;
        }
        WeakReference weakReference = this.f36617U;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            H(true);
        } else if (i == 6 || i == 5 || i == 4) {
            H(false);
        }
        G(i, true);
        ArrayList arrayList = this.f36619W;
        if (arrayList.size() <= 0) {
            F();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final boolean D(View view, float f2) {
        if (this.J) {
            return true;
        }
        if (view.getTop() < this.f36604G) {
            return false;
        }
        return Math.abs(((f2 * this.f36613Q) + ((float) view.getTop())) - ((float) this.f36604G)) / ((float) t()) > 0.5f;
    }

    public final void E(View view, int i, boolean z6) {
        int y7 = y(i);
        W.e eVar = this.f36609M;
        if (eVar == null || (!z6 ? eVar.s(view.getLeft(), y7, view) : eVar.q(view.getLeft(), y7))) {
            C(i);
            return;
        }
        C(2);
        G(i, true);
        this.f36598A.a(i);
    }

    public final void F() {
        View view;
        int i;
        WeakReference weakReference = this.f36617U;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        X.l(524288, view);
        X.i(0, view);
        X.l(262144, view);
        X.i(0, view);
        X.l(o.f8528d, view);
        X.i(0, view);
        SparseIntArray sparseIntArray = this.f36627c0;
        int i4 = sparseIntArray.get(0, -1);
        if (i4 != -1) {
            X.l(i4, view);
            X.i(0, view);
            sparseIntArray.delete(0);
        }
        if (!this.f36624b && this.f36608L != 6) {
            String string = view.getResources().getString(C5248R.string.bottomsheet_action_expand_halfway);
            a aVar = new a(this, r5, 17);
            ArrayList f2 = X.f(view);
            int i6 = 0;
            while (true) {
                if (i6 >= f2.size()) {
                    int i9 = -1;
                    for (int i10 = 0; i10 < 32 && i9 == -1; i10++) {
                        int i11 = X.f2145d[i10];
                        boolean z6 = true;
                        for (int i12 = 0; i12 < f2.size(); i12++) {
                            z6 &= ((f) f2.get(i12)).a() != i11;
                        }
                        if (z6) {
                            i9 = i11;
                        }
                    }
                    i = i9;
                } else {
                    if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((f) f2.get(i6)).f2334a).getLabel())) {
                        i = ((f) f2.get(i6)).a();
                        break;
                    }
                    i6++;
                }
            }
            if (i != -1) {
                f fVar = new f(null, i, string, aVar, null);
                View.AccessibilityDelegate d9 = X.d(view);
                C0328b c0328b = d9 == null ? null : d9 instanceof C0326a ? ((C0326a) d9).f2148a : new C0328b(d9);
                if (c0328b == null) {
                    c0328b = new C0328b();
                }
                X.o(view, c0328b);
                X.l(fVar.a(), view);
                X.f(view).add(fVar);
                X.i(0, view);
            }
            sparseIntArray.put(0, i);
        }
        if (this.f36606I) {
            int i13 = 5;
            if (this.f36608L != 5) {
                X.m(view, f.f2331l, new a(this, i13, 17));
            }
        }
        int i14 = this.f36608L;
        int i15 = 4;
        int i16 = 3;
        if (i14 == 3) {
            X.m(view, f.f2330k, new a(this, this.f36624b ? 4 : 6, 17));
            return;
        }
        if (i14 == 4) {
            X.m(view, f.f2329j, new a(this, this.f36624b ? 3 : 6, 17));
        } else {
            if (i14 != 6) {
                return;
            }
            X.m(view, f.f2330k, new a(this, i15, 17));
            X.m(view, f.f2329j, new a(this, i16, 17));
        }
    }

    public final void G(int i, boolean z6) {
        g gVar = this.i;
        ValueAnimator valueAnimator = this.f36599B;
        if (i == 2) {
            return;
        }
        boolean z9 = this.f36608L == 3 && (this.f36648x || z());
        if (this.f36650z == z9 || gVar == null) {
            return;
        }
        this.f36650z = z9;
        if (z6 && valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            } else {
                valueAnimator.setFloatValues(gVar.f1108n.i, z9 ? s() : 1.0f);
                valueAnimator.start();
                return;
            }
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        float s9 = this.f36650z ? s() : 1.0f;
        G3.f fVar = gVar.f1108n;
        if (fVar.i != s9) {
            fVar.i = s9;
            gVar.f1112x = true;
            gVar.invalidateSelf();
        }
    }

    public final void H(boolean z6) {
        WeakReference weakReference = this.f36617U;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z6) {
                if (this.f36625b0 != null) {
                    return;
                } else {
                    this.f36625b0 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.f36617U.get() && z6) {
                    this.f36625b0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z6) {
                return;
            }
            this.f36625b0 = null;
        }
    }

    public final void I() {
        View view;
        if (this.f36617U != null) {
            r();
            if (this.f36608L != 4 || (view = (View) this.f36617U.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // B.b
    public final void c(B.e eVar) {
        this.f36617U = null;
        this.f36609M = null;
    }

    @Override // B.b
    public final void e() {
        this.f36617U = null;
        this.f36609M = null;
    }

    @Override // B.b
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i;
        W.e eVar;
        if (!view.isShown() || !this.f36607K) {
            this.f36610N = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.Y = -1;
            this.f36621Z = -1;
            VelocityTracker velocityTracker = this.f36620X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f36620X = null;
            }
        }
        if (this.f36620X == null) {
            this.f36620X = VelocityTracker.obtain();
        }
        this.f36620X.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x9 = (int) motionEvent.getX();
            this.f36621Z = (int) motionEvent.getY();
            if (this.f36608L != 2) {
                WeakReference weakReference = this.f36618V;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.o(x9, this.f36621Z, view2)) {
                    this.Y = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f36623a0 = true;
                }
            }
            this.f36610N = this.Y == -1 && !coordinatorLayout.o(x9, this.f36621Z, view);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f36623a0 = false;
            this.Y = -1;
            if (this.f36610N) {
                this.f36610N = false;
                return false;
            }
        }
        if (this.f36610N || (eVar = this.f36609M) == null || !eVar.r(motionEvent)) {
            WeakReference weakReference2 = this.f36618V;
            View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
            if (actionMasked != 2 || view3 == null || this.f36610N || this.f36608L == 1 || coordinatorLayout.o((int) motionEvent.getX(), (int) motionEvent.getY(), view3) || this.f36609M == null || (i = this.f36621Z) == -1 || Math.abs(i - motionEvent.getY()) <= this.f36609M.f3510b) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [int[], java.io.Serializable] */
    @Override // B.b
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        int i4 = this.f36636l;
        g gVar = this.i;
        int i6 = 1;
        WeakHashMap weakHashMap = X.f2142a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f36617U == null) {
            this.f36632g = coordinatorLayout.getResources().getDimensionPixelSize(C5248R.dimen.design_bottom_sheet_peek_height_min);
            int i9 = Build.VERSION.SDK_INT;
            boolean z6 = (i9 < 29 || this.f36638n || this.f36631f) ? false : true;
            if (this.f36639o || this.f36640p || this.f36641q || this.f36643s || this.f36644t || this.f36645u || z6) {
                h hVar = new h(this, z6);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                r rVar = new r();
                rVar.f184a = paddingStart;
                rVar.f185b = paddingEnd;
                rVar.f186c = paddingBottom;
                L.u(view, new S0.c(i6, hVar, rVar));
                if (view.isAttachedToWindow()) {
                    J.c(view);
                } else {
                    view.addOnAttachStateChangeListener(new q());
                }
            }
            C2582Fo c2582Fo = new C2582Fo();
            c2582Fo.f25638x = new int[2];
            c2582Fo.f25637w = view;
            if (i9 >= 30) {
                view.setWindowInsetsAnimationCallback(new k0(c2582Fo));
            } else {
                PathInterpolator pathInterpolator = j0.f2179e;
                Object tag = view.getTag(C5248R.id.tag_on_apply_window_listener);
                View.OnApplyWindowInsetsListener i0Var = new i0(view, c2582Fo);
                view.setTag(C5248R.id.tag_window_insets_animation_callback, i0Var);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(i0Var);
                }
            }
            this.f36617U = new WeakReference(view);
            Context context = view.getContext();
            C.S(context, C5248R.attr.motionEasingStandardDecelerateInterpolator, Q.a.b(0.0f, 0.0f, 0.0f, 1.0f));
            C.R(context, C5248R.attr.motionDurationMedium2, 300);
            C.R(context, C5248R.attr.motionDurationShort3, 150);
            C.R(context, C5248R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(C5248R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
            resources.getDimension(C5248R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
            if (gVar != null) {
                view.setBackground(gVar);
                float f2 = this.f36605H;
                if (f2 == -1.0f) {
                    f2 = L.i(view);
                }
                gVar.i(f2);
            } else {
                ColorStateList colorStateList = this.f36634j;
                if (colorStateList != null) {
                    L.q(view, colorStateList);
                }
            }
            F();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.f36609M == null) {
            this.f36609M = new W.e(coordinatorLayout.getContext(), coordinatorLayout, this.f36629d0);
        }
        int top = view.getTop();
        coordinatorLayout.q(i, view);
        this.f36615S = coordinatorLayout.getWidth();
        this.f36616T = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f36614R = height;
        int i10 = this.f36616T;
        int i11 = i10 - height;
        int i12 = this.f36647w;
        if (i11 < i12) {
            if (this.f36642r) {
                if (i4 != -1) {
                    i10 = Math.min(i10, i4);
                }
                this.f36614R = i10;
            } else {
                int i13 = i10 - i12;
                if (i4 != -1) {
                    i13 = Math.min(i13, i4);
                }
                this.f36614R = i13;
            }
        }
        this.f36601D = Math.max(0, this.f36616T - this.f36614R);
        this.f36602E = (int) ((1.0f - this.f36603F) * this.f36616T);
        r();
        int i14 = this.f36608L;
        if (i14 == 3) {
            view.offsetTopAndBottom(x());
        } else if (i14 == 6) {
            view.offsetTopAndBottom(this.f36602E);
        } else if (this.f36606I && i14 == 5) {
            view.offsetTopAndBottom(this.f36616T);
        } else if (i14 == 4) {
            view.offsetTopAndBottom(this.f36604G);
        } else if (i14 == 1 || i14 == 2) {
            view.offsetTopAndBottom(top - view.getTop());
        }
        G(this.f36608L, false);
        this.f36618V = new WeakReference(v(view));
        ArrayList arrayList = this.f36619W;
        if (arrayList.size() <= 0) {
            return true;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // B.b
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i4, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(w(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i4, this.f36635k, marginLayoutParams.width), w(i6, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f36636l, marginLayoutParams.height));
        return true;
    }

    @Override // B.b
    public final boolean i(View view) {
        WeakReference weakReference = this.f36618V;
        return (weakReference == null || view != weakReference.get() || this.f36608L == 3) ? false : true;
    }

    @Override // B.b
    public final void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i4, int[] iArr, int i6) {
        boolean z6 = this.f36607K;
        if (i6 == 1) {
            return;
        }
        WeakReference weakReference = this.f36618V;
        if (view2 != (weakReference != null ? (View) weakReference.get() : null)) {
            return;
        }
        int top = view.getTop();
        int i9 = top - i4;
        if (i4 > 0) {
            if (i9 < x()) {
                int x9 = top - x();
                iArr[1] = x9;
                WeakHashMap weakHashMap = X.f2142a;
                view.offsetTopAndBottom(-x9);
                C(3);
            } else {
                if (!z6) {
                    return;
                }
                iArr[1] = i4;
                WeakHashMap weakHashMap2 = X.f2142a;
                view.offsetTopAndBottom(-i4);
                C(1);
            }
        } else if (i4 < 0 && !view2.canScrollVertically(-1)) {
            int i10 = this.f36604G;
            if (i9 > i10 && !this.f36606I) {
                int i11 = top - i10;
                iArr[1] = i11;
                WeakHashMap weakHashMap3 = X.f2142a;
                view.offsetTopAndBottom(-i11);
                C(4);
            } else {
                if (!z6) {
                    return;
                }
                iArr[1] = i4;
                WeakHashMap weakHashMap4 = X.f2142a;
                view.offsetTopAndBottom(-i4);
                C(1);
            }
        }
        u(view.getTop());
        this.f36611O = i4;
        this.f36612P = true;
    }

    @Override // B.b
    public final void m(View view, Parcelable parcelable) {
        C4907a c4907a = (C4907a) parcelable;
        int i = this.f36622a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f36630e = c4907a.f40215w;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f36624b = c4907a.f40216x;
            }
            if (i == -1 || (i & 4) == 4) {
                this.f36606I = c4907a.f40217y;
            }
            if (i == -1 || (i & 8) == 8) {
                this.J = c4907a.f40218z;
            }
        }
        int i4 = c4907a.f40214v;
        if (i4 == 1 || i4 == 2) {
            this.f36608L = 4;
        } else {
            this.f36608L = i4;
        }
    }

    @Override // B.b
    public final Parcelable n(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new C4907a(this);
    }

    @Override // B.b
    public final boolean o(int i, int i4, View view) {
        this.f36611O = 0;
        this.f36612P = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r4.getTop() <= r3.f36602E) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        if (java.lang.Math.abs(r5 - r3.f36601D) < java.lang.Math.abs(r5 - r3.f36604G)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0080, code lost:
    
        if (r5 < java.lang.Math.abs(r5 - r3.f36604G)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0090, code lost:
    
        if (java.lang.Math.abs(r5 - r2) < java.lang.Math.abs(r5 - r3.f36604G)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ac, code lost:
    
        if (java.lang.Math.abs(r5 - r3.f36602E) < java.lang.Math.abs(r5 - r3.f36604G)) goto L50;
     */
    @Override // B.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(View view, View view2, int i) {
        float yVelocity;
        int i4 = 3;
        if (view.getTop() == x()) {
            C(3);
            return;
        }
        WeakReference weakReference = this.f36618V;
        if (weakReference != null && view2 == weakReference.get() && this.f36612P) {
            if (this.f36611O > 0) {
                if (!this.f36624b) {
                }
                E(view, i4, false);
                this.f36612P = false;
            }
            if (this.f36606I) {
                VelocityTracker velocityTracker = this.f36620X;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.f36626c);
                    yVelocity = this.f36620X.getYVelocity(this.Y);
                }
                if (D(view, yVelocity)) {
                    i4 = 5;
                    E(view, i4, false);
                    this.f36612P = false;
                }
            }
            if (this.f36611O == 0) {
                int top = view.getTop();
                if (!this.f36624b) {
                    int i6 = this.f36602E;
                    if (top < i6) {
                    }
                    i4 = 6;
                }
            } else {
                if (!this.f36624b) {
                    int top2 = view.getTop();
                }
                i4 = 4;
            }
            E(view, i4, false);
            this.f36612P = false;
        }
    }

    @Override // B.b
    public final boolean q(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.f36608L;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        W.e eVar = this.f36609M;
        if (eVar != null && (this.f36607K || i == 1)) {
            eVar.k(motionEvent);
        }
        if (actionMasked == 0) {
            this.Y = -1;
            this.f36621Z = -1;
            VelocityTracker velocityTracker = this.f36620X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f36620X = null;
            }
        }
        if (this.f36620X == null) {
            this.f36620X = VelocityTracker.obtain();
        }
        this.f36620X.addMovement(motionEvent);
        if (this.f36609M != null && ((this.f36607K || this.f36608L == 1) && actionMasked == 2 && !this.f36610N)) {
            float abs = Math.abs(this.f36621Z - motionEvent.getY());
            W.e eVar2 = this.f36609M;
            if (abs > eVar2.f3510b) {
                eVar2.b(motionEvent.getPointerId(motionEvent.getActionIndex()), view);
            }
        }
        return !this.f36610N;
    }

    public final void r() {
        int t6 = t();
        if (this.f36624b) {
            this.f36604G = Math.max(this.f36616T - t6, this.f36601D);
        } else {
            this.f36604G = this.f36616T - t6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float s() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        RoundedCorner roundedCorner;
        float f2;
        RoundedCorner roundedCorner2;
        int radius;
        int radius2;
        float f9 = 0.0f;
        if (this.i != null && (weakReference = this.f36617U) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            View view = (View) this.f36617U.get();
            if (z() && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                g gVar = this.i;
                float a9 = gVar.f1108n.f1078a.f1131e.a(gVar.f());
                roundedCorner = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    radius2 = roundedCorner.getRadius();
                    float f10 = radius2;
                    if (f10 > 0.0f && a9 > 0.0f) {
                        f2 = f10 / a9;
                        g gVar2 = this.i;
                        float a10 = gVar2.f1108n.f1078a.f1132f.a(gVar2.f());
                        roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                        if (roundedCorner2 != null) {
                            radius = roundedCorner2.getRadius();
                            float f11 = radius;
                            if (f11 > 0.0f && a10 > 0.0f) {
                                f9 = f11 / a10;
                            }
                        }
                        return Math.max(f2, f9);
                    }
                }
                f2 = 0.0f;
                g gVar22 = this.i;
                float a102 = gVar22.f1108n.f1078a.f1132f.a(gVar22.f());
                roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                if (roundedCorner2 != null) {
                }
                return Math.max(f2, f9);
            }
        }
        return 0.0f;
    }

    public final int t() {
        int i;
        return this.f36631f ? Math.min(Math.max(this.f36632g, this.f36616T - ((this.f36615S * 9) / 16)), this.f36614R) + this.f36646v : (this.f36638n || this.f36639o || (i = this.f36637m) <= 0) ? this.f36630e + this.f36646v : Math.max(this.f36630e, i + this.f36633h);
    }

    public final void u(int i) {
        if (((View) this.f36617U.get()) != null) {
            ArrayList arrayList = this.f36619W;
            if (arrayList.isEmpty()) {
                return;
            }
            int i4 = this.f36604G;
            if (i <= i4 && i4 != x()) {
                x();
            }
            if (arrayList.size() <= 0) {
                return;
            }
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final int x() {
        if (this.f36624b) {
            return this.f36601D;
        }
        return Math.max(this.f36600C, this.f36642r ? 0 : this.f36647w);
    }

    public final int y(int i) {
        if (i == 3) {
            return x();
        }
        if (i == 4) {
            return this.f36604G;
        }
        if (i == 5) {
            return this.f36616T;
        }
        if (i == 6) {
            return this.f36602E;
        }
        throw new IllegalArgumentException(Wv.f(i, "Invalid state to get top offset: "));
    }

    public final boolean z() {
        WeakReference weakReference = this.f36617U;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.f36617U.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        int i4 = 1;
        this.f36622a = 0;
        this.f36624b = true;
        this.f36635k = -1;
        this.f36636l = -1;
        this.f36598A = new e(this);
        this.f36603F = 0.5f;
        this.f36605H = -1.0f;
        this.f36607K = true;
        this.f36608L = 4;
        this.f36613Q = 0.1f;
        this.f36619W = new ArrayList();
        this.f36621Z = -1;
        this.f36627c0 = new SparseIntArray();
        this.f36629d0 = new c(this, i4);
        this.f36633h = context.getResources().getDimensionPixelSize(C5248R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4742a.f39418a);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f36634j = com.bumptech.glide.f.j(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(21)) {
            this.f36649y = k.b(context, attributeSet, C5248R.attr.bottomSheetStyle, C5248R.style.Widget_Design_BottomSheet_Modal).a();
        }
        k kVar = this.f36649y;
        if (kVar != null) {
            g gVar = new g(kVar);
            this.i = gVar;
            gVar.h(context);
            ColorStateList colorStateList = this.f36634j;
            if (colorStateList != null) {
                this.i.j(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
                this.i.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(s(), 1.0f);
        this.f36599B = ofFloat;
        ofFloat.setDuration(500L);
        this.f36599B.addUpdateListener(new J3.C(i4, this));
        this.f36605H = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f36635k = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.f36636l = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue != null && (i = peekValue.data) == -1) {
            A(i);
        } else {
            A(obtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        boolean z6 = obtainStyledAttributes.getBoolean(8, false);
        if (this.f36606I != z6) {
            this.f36606I = z6;
            if (!z6 && this.f36608L == 5) {
                B(4);
            }
            F();
        }
        this.f36638n = obtainStyledAttributes.getBoolean(13, false);
        boolean z9 = obtainStyledAttributes.getBoolean(6, true);
        if (this.f36624b != z9) {
            this.f36624b = z9;
            if (this.f36617U != null) {
                r();
            }
            C((this.f36624b && this.f36608L == 6) ? 3 : this.f36608L);
            G(this.f36608L, true);
            F();
        }
        this.J = obtainStyledAttributes.getBoolean(12, false);
        this.f36607K = obtainStyledAttributes.getBoolean(4, true);
        this.f36622a = obtainStyledAttributes.getInt(10, 0);
        float f2 = obtainStyledAttributes.getFloat(7, 0.5f);
        if (f2 > 0.0f && f2 < 1.0f) {
            this.f36603F = f2;
            if (this.f36617U != null) {
                this.f36602E = (int) ((1.0f - f2) * this.f36616T);
            }
            TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
            if (peekValue2 != null && peekValue2.type == 16) {
                int i6 = peekValue2.data;
                if (i6 >= 0) {
                    this.f36600C = i6;
                    G(this.f36608L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
                if (dimensionPixelOffset >= 0) {
                    this.f36600C = dimensionPixelOffset;
                    G(this.f36608L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.f36628d = obtainStyledAttributes.getInt(11, 500);
            this.f36639o = obtainStyledAttributes.getBoolean(17, false);
            this.f36640p = obtainStyledAttributes.getBoolean(18, false);
            this.f36641q = obtainStyledAttributes.getBoolean(19, false);
            this.f36642r = obtainStyledAttributes.getBoolean(20, true);
            this.f36643s = obtainStyledAttributes.getBoolean(14, false);
            this.f36644t = obtainStyledAttributes.getBoolean(15, false);
            this.f36645u = obtainStyledAttributes.getBoolean(16, false);
            this.f36648x = obtainStyledAttributes.getBoolean(23, true);
            obtainStyledAttributes.recycle();
            this.f36626c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    @Override // B.b
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i4, int i6, int[] iArr) {
    }
}
