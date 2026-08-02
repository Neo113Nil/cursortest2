package com.google.android.material.bottomsheet;

import B.b;
import E3.g;
import E3.k;
import F3.c;
import F3.e;
import G1.a;
import H3.C;
import M0.i;
import O.C0321a;
import O.C0323b;
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
import com.anythink.basead.exoplayer.h.o;
import com.google.android.gms.internal.ads.C2545Eo;
import com.icefishingapp.icefishing.AbstractC4404f;
import com.icefishingapp.icefishing.C5275R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import k3.AbstractC4632a;
import m1.C4726a;
import p3.C4836a;
import u1.h;
import y3.l;

/* loaded from: classes2.dex */
public class BottomSheetBehavior<V extends View> extends b {

    /* renamed from: A, reason: collision with root package name */
    public final e f35830A;

    /* renamed from: B, reason: collision with root package name */
    public final ValueAnimator f35831B;

    /* renamed from: C, reason: collision with root package name */
    public final int f35832C;

    /* renamed from: D, reason: collision with root package name */
    public int f35833D;

    /* renamed from: E, reason: collision with root package name */
    public int f35834E;

    /* renamed from: F, reason: collision with root package name */
    public final float f35835F;

    /* renamed from: G, reason: collision with root package name */
    public int f35836G;

    /* renamed from: H, reason: collision with root package name */
    public final float f35837H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f35838I;
    public boolean J;

    /* renamed from: K, reason: collision with root package name */
    public final boolean f35839K;

    /* renamed from: L, reason: collision with root package name */
    public int f35840L;

    /* renamed from: M, reason: collision with root package name */
    public W.e f35841M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f35842N;

    /* renamed from: O, reason: collision with root package name */
    public int f35843O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f35844P;

    /* renamed from: Q, reason: collision with root package name */
    public final float f35845Q;

    /* renamed from: R, reason: collision with root package name */
    public int f35846R;

    /* renamed from: S, reason: collision with root package name */
    public int f35847S;

    /* renamed from: T, reason: collision with root package name */
    public int f35848T;

    /* renamed from: U, reason: collision with root package name */
    public WeakReference f35849U;

    /* renamed from: V, reason: collision with root package name */
    public WeakReference f35850V;

    /* renamed from: W, reason: collision with root package name */
    public final ArrayList f35851W;

    /* renamed from: X, reason: collision with root package name */
    public VelocityTracker f35852X;
    public int Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f35853Z;

    /* renamed from: a, reason: collision with root package name */
    public final int f35854a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f35855a0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f35856b;

    /* renamed from: b0, reason: collision with root package name */
    public HashMap f35857b0;

    /* renamed from: c, reason: collision with root package name */
    public final float f35858c;

    /* renamed from: c0, reason: collision with root package name */
    public final SparseIntArray f35859c0;

    /* renamed from: d, reason: collision with root package name */
    public final int f35860d;

    /* renamed from: d0, reason: collision with root package name */
    public final c f35861d0;

    /* renamed from: e, reason: collision with root package name */
    public int f35862e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f35863f;

    /* renamed from: g, reason: collision with root package name */
    public int f35864g;

    /* renamed from: h, reason: collision with root package name */
    public final int f35865h;
    public final g i;

    /* renamed from: j, reason: collision with root package name */
    public final ColorStateList f35866j;

    /* renamed from: k, reason: collision with root package name */
    public final int f35867k;

    /* renamed from: l, reason: collision with root package name */
    public final int f35868l;

    /* renamed from: m, reason: collision with root package name */
    public int f35869m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f35870n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f35871o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f35872p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f35873q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f35874r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f35875s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f35876t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f35877u;

    /* renamed from: v, reason: collision with root package name */
    public int f35878v;

    /* renamed from: w, reason: collision with root package name */
    public int f35879w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f35880x;

    /* renamed from: y, reason: collision with root package name */
    public final k f35881y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f35882z;

    public BottomSheetBehavior() {
        this.f35854a = 0;
        this.f35856b = true;
        this.f35867k = -1;
        this.f35868l = -1;
        this.f35830A = new e(this);
        this.f35835F = 0.5f;
        this.f35837H = -1.0f;
        this.f35839K = true;
        this.f35840L = 4;
        this.f35845Q = 0.1f;
        this.f35851W = new ArrayList();
        this.f35853Z = -1;
        this.f35859c0 = new SparseIntArray();
        this.f35861d0 = new c(this, 1);
    }

    public static View v(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap weakHashMap = X.f2054a;
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

    public static int w(int i, int i6, int i9, int i10) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i6, i10);
        if (i9 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i9), 1073741824);
        }
        if (size != 0) {
            i9 = Math.min(size, i9);
        }
        return View.MeasureSpec.makeMeasureSpec(i9, Integer.MIN_VALUE);
    }

    public final void A(int i) {
        if (i == -1) {
            if (this.f35863f) {
                return;
            } else {
                this.f35863f = true;
            }
        } else {
            if (!this.f35863f && this.f35862e == i) {
                return;
            }
            this.f35863f = false;
            this.f35862e = Math.max(0, i);
        }
        I();
    }

    public final void B(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(h.g(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.f35838I && i == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i);
            return;
        }
        int i6 = (i == 6 && this.f35856b && y(i) <= this.f35833D) ? 3 : i;
        WeakReference weakReference = this.f35849U;
        if (weakReference == null || weakReference.get() == null) {
            C(i);
            return;
        }
        View view = (View) this.f35849U.get();
        i iVar = new i(this, view, i6);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = X.f2054a;
            if (view.isAttachedToWindow()) {
                view.post(iVar);
                return;
            }
        }
        iVar.run();
    }

    public final void C(int i) {
        if (this.f35840L == i) {
            return;
        }
        this.f35840L = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z3 = this.f35838I;
        }
        WeakReference weakReference = this.f35849U;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            H(true);
        } else if (i == 6 || i == 5 || i == 4) {
            H(false);
        }
        G(i, true);
        ArrayList arrayList = this.f35851W;
        if (arrayList.size() <= 0) {
            F();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final boolean D(View view, float f3) {
        if (this.J) {
            return true;
        }
        if (view.getTop() < this.f35836G) {
            return false;
        }
        return Math.abs(((f3 * this.f35845Q) + ((float) view.getTop())) - ((float) this.f35836G)) / ((float) t()) > 0.5f;
    }

    public final void E(View view, int i, boolean z3) {
        int y7 = y(i);
        W.e eVar = this.f35841M;
        if (eVar == null || (!z3 ? eVar.s(view.getLeft(), y7, view) : eVar.q(view.getLeft(), y7))) {
            C(i);
            return;
        }
        C(2);
        G(i, true);
        this.f35830A.a(i);
    }

    public final void F() {
        View view;
        int i;
        WeakReference weakReference = this.f35849U;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        X.l(524288, view);
        X.i(0, view);
        X.l(262144, view);
        X.i(0, view);
        X.l(o.f7742d, view);
        X.i(0, view);
        SparseIntArray sparseIntArray = this.f35859c0;
        int i6 = sparseIntArray.get(0, -1);
        if (i6 != -1) {
            X.l(i6, view);
            X.i(0, view);
            sparseIntArray.delete(0);
        }
        if (!this.f35856b && this.f35840L != 6) {
            String string = view.getResources().getString(C5275R.string.bottomsheet_action_expand_halfway);
            a aVar = new a(this, r5, 17);
            ArrayList f3 = X.f(view);
            int i9 = 0;
            while (true) {
                if (i9 >= f3.size()) {
                    int i10 = -1;
                    for (int i11 = 0; i11 < 32 && i10 == -1; i11++) {
                        int i12 = X.f2057d[i11];
                        boolean z3 = true;
                        for (int i13 = 0; i13 < f3.size(); i13++) {
                            z3 &= ((f) f3.get(i13)).a() != i12;
                        }
                        if (z3) {
                            i10 = i12;
                        }
                    }
                    i = i10;
                } else {
                    if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((f) f3.get(i9)).f2403a).getLabel())) {
                        i = ((f) f3.get(i9)).a();
                        break;
                    }
                    i9++;
                }
            }
            if (i != -1) {
                f fVar = new f(null, i, string, aVar, null);
                View.AccessibilityDelegate d2 = X.d(view);
                C0323b c0323b = d2 == null ? null : d2 instanceof C0321a ? ((C0321a) d2).f2060a : new C0323b(d2);
                if (c0323b == null) {
                    c0323b = new C0323b();
                }
                X.o(view, c0323b);
                X.l(fVar.a(), view);
                X.f(view).add(fVar);
                X.i(0, view);
            }
            sparseIntArray.put(0, i);
        }
        if (this.f35838I) {
            int i14 = 5;
            if (this.f35840L != 5) {
                X.m(view, f.f2400l, new a(this, i14, 17));
            }
        }
        int i15 = this.f35840L;
        int i16 = 4;
        int i17 = 3;
        if (i15 == 3) {
            X.m(view, f.f2399k, new a(this, this.f35856b ? 4 : 6, 17));
            return;
        }
        if (i15 == 4) {
            X.m(view, f.f2398j, new a(this, this.f35856b ? 3 : 6, 17));
        } else {
            if (i15 != 6) {
                return;
            }
            X.m(view, f.f2399k, new a(this, i16, 17));
            X.m(view, f.f2398j, new a(this, i17, 17));
        }
    }

    public final void G(int i, boolean z3) {
        g gVar = this.i;
        ValueAnimator valueAnimator = this.f35831B;
        if (i == 2) {
            return;
        }
        boolean z6 = this.f35840L == 3 && (this.f35880x || z());
        if (this.f35882z == z6 || gVar == null) {
            return;
        }
        this.f35882z = z6;
        if (z3 && valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            } else {
                valueAnimator.setFloatValues(gVar.f766n.i, z6 ? s() : 1.0f);
                valueAnimator.start();
                return;
            }
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        float s9 = this.f35882z ? s() : 1.0f;
        E3.f fVar = gVar.f766n;
        if (fVar.i != s9) {
            fVar.i = s9;
            gVar.f770x = true;
            gVar.invalidateSelf();
        }
    }

    public final void H(boolean z3) {
        WeakReference weakReference = this.f35849U;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z3) {
                if (this.f35857b0 != null) {
                    return;
                } else {
                    this.f35857b0 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.f35849U.get() && z3) {
                    this.f35857b0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z3) {
                return;
            }
            this.f35857b0 = null;
        }
    }

    public final void I() {
        View view;
        if (this.f35849U != null) {
            r();
            if (this.f35840L != 4 || (view = (View) this.f35849U.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // B.b
    public final void c(B.e eVar) {
        this.f35849U = null;
        this.f35841M = null;
    }

    @Override // B.b
    public final void e() {
        this.f35849U = null;
        this.f35841M = null;
    }

    @Override // B.b
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i;
        W.e eVar;
        if (!view.isShown() || !this.f35839K) {
            this.f35842N = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.Y = -1;
            this.f35853Z = -1;
            VelocityTracker velocityTracker = this.f35852X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f35852X = null;
            }
        }
        if (this.f35852X == null) {
            this.f35852X = VelocityTracker.obtain();
        }
        this.f35852X.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x9 = (int) motionEvent.getX();
            this.f35853Z = (int) motionEvent.getY();
            if (this.f35840L != 2) {
                WeakReference weakReference = this.f35850V;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.o(x9, this.f35853Z, view2)) {
                    this.Y = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f35855a0 = true;
                }
            }
            this.f35842N = this.Y == -1 && !coordinatorLayout.o(x9, this.f35853Z, view);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f35855a0 = false;
            this.Y = -1;
            if (this.f35842N) {
                this.f35842N = false;
                return false;
            }
        }
        if (this.f35842N || (eVar = this.f35841M) == null || !eVar.r(motionEvent)) {
            WeakReference weakReference2 = this.f35850V;
            View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
            if (actionMasked != 2 || view3 == null || this.f35842N || this.f35840L == 1 || coordinatorLayout.o((int) motionEvent.getX(), (int) motionEvent.getY(), view3) || this.f35841M == null || (i = this.f35853Z) == -1 || Math.abs(i - motionEvent.getY()) <= this.f35841M.f3380b) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r12v3, types: [int[], java.io.Serializable] */
    @Override // B.b
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        int i6 = this.f35868l;
        g gVar = this.i;
        int i9 = 5;
        WeakHashMap weakHashMap = X.f2054a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f35849U == null) {
            this.f35864g = coordinatorLayout.getResources().getDimensionPixelSize(C5275R.dimen.design_bottom_sheet_peek_height_min);
            int i10 = Build.VERSION.SDK_INT;
            boolean z3 = (i10 < 29 || this.f35870n || this.f35863f) ? false : true;
            if (this.f35871o || this.f35872p || this.f35873q || this.f35875s || this.f35876t || this.f35877u || z3) {
                L3.h hVar = new L3.h(this, z3);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                X2.b bVar = new X2.b();
                bVar.f3771a = paddingStart;
                bVar.f3772b = paddingEnd;
                bVar.f3773c = paddingBottom;
                L.u(view, new C4726a(i9, hVar, bVar));
                if (view.isAttachedToWindow()) {
                    J.c(view);
                } else {
                    view.addOnAttachStateChangeListener(new l());
                }
            }
            C2545Eo c2545Eo = new C2545Eo();
            c2545Eo.f24653x = new int[2];
            c2545Eo.f24652w = view;
            if (i10 >= 30) {
                view.setWindowInsetsAnimationCallback(new k0(c2545Eo));
            } else {
                PathInterpolator pathInterpolator = j0.f2091e;
                Object tag = view.getTag(C5275R.id.tag_on_apply_window_listener);
                View.OnApplyWindowInsetsListener i0Var = new i0(view, c2545Eo);
                view.setTag(C5275R.id.tag_window_insets_animation_callback, i0Var);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(i0Var);
                }
            }
            this.f35849U = new WeakReference(view);
            Context context = view.getContext();
            t8.g.E(context, C5275R.attr.motionEasingStandardDecelerateInterpolator, Q.a.b(0.0f, 0.0f, 0.0f, 1.0f));
            t8.g.D(context, C5275R.attr.motionDurationMedium2, 300);
            t8.g.D(context, C5275R.attr.motionDurationShort3, 150);
            t8.g.D(context, C5275R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(C5275R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
            resources.getDimension(C5275R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
            if (gVar != null) {
                view.setBackground(gVar);
                float f3 = this.f35837H;
                if (f3 == -1.0f) {
                    f3 = L.i(view);
                }
                gVar.i(f3);
            } else {
                ColorStateList colorStateList = this.f35866j;
                if (colorStateList != null) {
                    L.q(view, colorStateList);
                }
            }
            F();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.f35841M == null) {
            this.f35841M = new W.e(coordinatorLayout.getContext(), coordinatorLayout, this.f35861d0);
        }
        int top = view.getTop();
        coordinatorLayout.q(i, view);
        this.f35847S = coordinatorLayout.getWidth();
        this.f35848T = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f35846R = height;
        int i11 = this.f35848T;
        int i12 = i11 - height;
        int i13 = this.f35879w;
        if (i12 < i13) {
            if (this.f35874r) {
                if (i6 != -1) {
                    i11 = Math.min(i11, i6);
                }
                this.f35846R = i11;
            } else {
                int i14 = i11 - i13;
                if (i6 != -1) {
                    i14 = Math.min(i14, i6);
                }
                this.f35846R = i14;
            }
        }
        this.f35833D = Math.max(0, this.f35848T - this.f35846R);
        this.f35834E = (int) ((1.0f - this.f35835F) * this.f35848T);
        r();
        int i15 = this.f35840L;
        if (i15 == 3) {
            view.offsetTopAndBottom(x());
        } else if (i15 == 6) {
            view.offsetTopAndBottom(this.f35834E);
        } else if (this.f35838I && i15 == 5) {
            view.offsetTopAndBottom(this.f35848T);
        } else if (i15 == 4) {
            view.offsetTopAndBottom(this.f35836G);
        } else if (i15 == 1 || i15 == 2) {
            view.offsetTopAndBottom(top - view.getTop());
        }
        G(this.f35840L, false);
        this.f35850V = new WeakReference(v(view));
        ArrayList arrayList = this.f35851W;
        if (arrayList.size() <= 0) {
            return true;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // B.b
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i6, int i9) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(w(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i6, this.f35867k, marginLayoutParams.width), w(i9, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f35868l, marginLayoutParams.height));
        return true;
    }

    @Override // B.b
    public final boolean i(View view) {
        WeakReference weakReference = this.f35850V;
        return (weakReference == null || view != weakReference.get() || this.f35840L == 3) ? false : true;
    }

    @Override // B.b
    public final void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i6, int[] iArr, int i9) {
        boolean z3 = this.f35839K;
        if (i9 == 1) {
            return;
        }
        WeakReference weakReference = this.f35850V;
        if (view2 != (weakReference != null ? (View) weakReference.get() : null)) {
            return;
        }
        int top = view.getTop();
        int i10 = top - i6;
        if (i6 > 0) {
            if (i10 < x()) {
                int x9 = top - x();
                iArr[1] = x9;
                WeakHashMap weakHashMap = X.f2054a;
                view.offsetTopAndBottom(-x9);
                C(3);
            } else {
                if (!z3) {
                    return;
                }
                iArr[1] = i6;
                WeakHashMap weakHashMap2 = X.f2054a;
                view.offsetTopAndBottom(-i6);
                C(1);
            }
        } else if (i6 < 0 && !view2.canScrollVertically(-1)) {
            int i11 = this.f35836G;
            if (i10 > i11 && !this.f35838I) {
                int i12 = top - i11;
                iArr[1] = i12;
                WeakHashMap weakHashMap3 = X.f2054a;
                view.offsetTopAndBottom(-i12);
                C(4);
            } else {
                if (!z3) {
                    return;
                }
                iArr[1] = i6;
                WeakHashMap weakHashMap4 = X.f2054a;
                view.offsetTopAndBottom(-i6);
                C(1);
            }
        }
        u(view.getTop());
        this.f35843O = i6;
        this.f35844P = true;
    }

    @Override // B.b
    public final void m(View view, Parcelable parcelable) {
        C4836a c4836a = (C4836a) parcelable;
        int i = this.f35854a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f35862e = c4836a.f39762w;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f35856b = c4836a.f39763x;
            }
            if (i == -1 || (i & 4) == 4) {
                this.f35838I = c4836a.f39764y;
            }
            if (i == -1 || (i & 8) == 8) {
                this.J = c4836a.f39765z;
            }
        }
        int i6 = c4836a.f39761v;
        if (i6 == 1 || i6 == 2) {
            this.f35840L = 4;
        } else {
            this.f35840L = i6;
        }
    }

    @Override // B.b
    public final Parcelable n(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new C4836a(this);
    }

    @Override // B.b
    public final boolean o(int i, int i6, View view) {
        this.f35843O = 0;
        this.f35844P = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r4.getTop() <= r3.f35834E) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        if (java.lang.Math.abs(r5 - r3.f35833D) < java.lang.Math.abs(r5 - r3.f35836G)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0080, code lost:
    
        if (r5 < java.lang.Math.abs(r5 - r3.f35836G)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0090, code lost:
    
        if (java.lang.Math.abs(r5 - r2) < java.lang.Math.abs(r5 - r3.f35836G)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ac, code lost:
    
        if (java.lang.Math.abs(r5 - r3.f35834E) < java.lang.Math.abs(r5 - r3.f35836G)) goto L50;
     */
    @Override // B.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(View view, View view2, int i) {
        float yVelocity;
        int i6 = 3;
        if (view.getTop() == x()) {
            C(3);
            return;
        }
        WeakReference weakReference = this.f35850V;
        if (weakReference != null && view2 == weakReference.get() && this.f35844P) {
            if (this.f35843O > 0) {
                if (!this.f35856b) {
                }
                E(view, i6, false);
                this.f35844P = false;
            }
            if (this.f35838I) {
                VelocityTracker velocityTracker = this.f35852X;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.f35858c);
                    yVelocity = this.f35852X.getYVelocity(this.Y);
                }
                if (D(view, yVelocity)) {
                    i6 = 5;
                    E(view, i6, false);
                    this.f35844P = false;
                }
            }
            if (this.f35843O == 0) {
                int top = view.getTop();
                if (!this.f35856b) {
                    int i9 = this.f35834E;
                    if (top < i9) {
                    }
                    i6 = 6;
                }
            } else {
                if (!this.f35856b) {
                    int top2 = view.getTop();
                }
                i6 = 4;
            }
            E(view, i6, false);
            this.f35844P = false;
        }
    }

    @Override // B.b
    public final boolean q(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.f35840L;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        W.e eVar = this.f35841M;
        if (eVar != null && (this.f35839K || i == 1)) {
            eVar.k(motionEvent);
        }
        if (actionMasked == 0) {
            this.Y = -1;
            this.f35853Z = -1;
            VelocityTracker velocityTracker = this.f35852X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f35852X = null;
            }
        }
        if (this.f35852X == null) {
            this.f35852X = VelocityTracker.obtain();
        }
        this.f35852X.addMovement(motionEvent);
        if (this.f35841M != null && ((this.f35839K || this.f35840L == 1) && actionMasked == 2 && !this.f35842N)) {
            float abs = Math.abs(this.f35853Z - motionEvent.getY());
            W.e eVar2 = this.f35841M;
            if (abs > eVar2.f3380b) {
                eVar2.b(motionEvent.getPointerId(motionEvent.getActionIndex()), view);
            }
        }
        return !this.f35842N;
    }

    public final void r() {
        int t6 = t();
        if (this.f35856b) {
            this.f35836G = Math.max(this.f35848T - t6, this.f35833D);
        } else {
            this.f35836G = this.f35848T - t6;
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
        float f3;
        RoundedCorner roundedCorner2;
        int radius;
        int radius2;
        float f9 = 0.0f;
        if (this.i != null && (weakReference = this.f35849U) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            View view = (View) this.f35849U.get();
            if (z() && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                g gVar = this.i;
                float a9 = gVar.f766n.f736a.f789e.a(gVar.f());
                roundedCorner = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    radius2 = roundedCorner.getRadius();
                    float f10 = radius2;
                    if (f10 > 0.0f && a9 > 0.0f) {
                        f3 = f10 / a9;
                        g gVar2 = this.i;
                        float a10 = gVar2.f766n.f736a.f790f.a(gVar2.f());
                        roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                        if (roundedCorner2 != null) {
                            radius = roundedCorner2.getRadius();
                            float f11 = radius;
                            if (f11 > 0.0f && a10 > 0.0f) {
                                f9 = f11 / a10;
                            }
                        }
                        return Math.max(f3, f9);
                    }
                }
                f3 = 0.0f;
                g gVar22 = this.i;
                float a102 = gVar22.f766n.f736a.f790f.a(gVar22.f());
                roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                if (roundedCorner2 != null) {
                }
                return Math.max(f3, f9);
            }
        }
        return 0.0f;
    }

    public final int t() {
        int i;
        return this.f35863f ? Math.min(Math.max(this.f35864g, this.f35848T - ((this.f35847S * 9) / 16)), this.f35846R) + this.f35878v : (this.f35870n || this.f35871o || (i = this.f35869m) <= 0) ? this.f35862e + this.f35878v : Math.max(this.f35862e, i + this.f35865h);
    }

    public final void u(int i) {
        if (((View) this.f35849U.get()) != null) {
            ArrayList arrayList = this.f35851W;
            if (arrayList.isEmpty()) {
                return;
            }
            int i6 = this.f35836G;
            if (i <= i6 && i6 != x()) {
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
        if (this.f35856b) {
            return this.f35833D;
        }
        return Math.max(this.f35832C, this.f35874r ? 0 : this.f35879w);
    }

    public final int y(int i) {
        if (i == 3) {
            return x();
        }
        if (i == 4) {
            return this.f35836G;
        }
        if (i == 5) {
            return this.f35848T;
        }
        if (i == 6) {
            return this.f35834E;
        }
        throw new IllegalArgumentException(AbstractC4404f.e(i, "Invalid state to get top offset: "));
    }

    public final boolean z() {
        WeakReference weakReference = this.f35849U;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.f35849U.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        int i6 = 1;
        this.f35854a = 0;
        this.f35856b = true;
        this.f35867k = -1;
        this.f35868l = -1;
        this.f35830A = new e(this);
        this.f35835F = 0.5f;
        this.f35837H = -1.0f;
        this.f35839K = true;
        this.f35840L = 4;
        this.f35845Q = 0.1f;
        this.f35851W = new ArrayList();
        this.f35853Z = -1;
        this.f35859c0 = new SparseIntArray();
        this.f35861d0 = new c(this, i6);
        this.f35865h = context.getResources().getDimensionPixelSize(C5275R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4632a.f38629a);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f35866j = O3.b.m(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(21)) {
            this.f35881y = k.b(context, attributeSet, C5275R.attr.bottomSheetStyle, C5275R.style.Widget_Design_BottomSheet_Modal).a();
        }
        k kVar = this.f35881y;
        if (kVar != null) {
            g gVar = new g(kVar);
            this.i = gVar;
            gVar.h(context);
            ColorStateList colorStateList = this.f35866j;
            if (colorStateList != null) {
                this.i.j(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
                this.i.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(s(), 1.0f);
        this.f35831B = ofFloat;
        ofFloat.setDuration(500L);
        this.f35831B.addUpdateListener(new C(i6, this));
        this.f35837H = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f35867k = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.f35868l = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue != null && (i = peekValue.data) == -1) {
            A(i);
        } else {
            A(obtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        boolean z3 = obtainStyledAttributes.getBoolean(8, false);
        if (this.f35838I != z3) {
            this.f35838I = z3;
            if (!z3 && this.f35840L == 5) {
                B(4);
            }
            F();
        }
        this.f35870n = obtainStyledAttributes.getBoolean(13, false);
        boolean z6 = obtainStyledAttributes.getBoolean(6, true);
        if (this.f35856b != z6) {
            this.f35856b = z6;
            if (this.f35849U != null) {
                r();
            }
            C((this.f35856b && this.f35840L == 6) ? 3 : this.f35840L);
            G(this.f35840L, true);
            F();
        }
        this.J = obtainStyledAttributes.getBoolean(12, false);
        this.f35839K = obtainStyledAttributes.getBoolean(4, true);
        this.f35854a = obtainStyledAttributes.getInt(10, 0);
        float f3 = obtainStyledAttributes.getFloat(7, 0.5f);
        if (f3 > 0.0f && f3 < 1.0f) {
            this.f35835F = f3;
            if (this.f35849U != null) {
                this.f35834E = (int) ((1.0f - f3) * this.f35848T);
            }
            TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
            if (peekValue2 != null && peekValue2.type == 16) {
                int i9 = peekValue2.data;
                if (i9 >= 0) {
                    this.f35832C = i9;
                    G(this.f35840L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
                if (dimensionPixelOffset >= 0) {
                    this.f35832C = dimensionPixelOffset;
                    G(this.f35840L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.f35860d = obtainStyledAttributes.getInt(11, 500);
            this.f35871o = obtainStyledAttributes.getBoolean(17, false);
            this.f35872p = obtainStyledAttributes.getBoolean(18, false);
            this.f35873q = obtainStyledAttributes.getBoolean(19, false);
            this.f35874r = obtainStyledAttributes.getBoolean(20, true);
            this.f35875s = obtainStyledAttributes.getBoolean(14, false);
            this.f35876t = obtainStyledAttributes.getBoolean(15, false);
            this.f35877u = obtainStyledAttributes.getBoolean(16, false);
            this.f35880x = obtainStyledAttributes.getBoolean(23, true);
            obtainStyledAttributes.recycle();
            this.f35858c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    @Override // B.b
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i6, int i9, int[] iArr) {
    }
}
