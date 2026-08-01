package androidx.drawerlayout.widget;

import O.A0;
import O.L;
import O.X;
import U.h;
import W.e;
import Z.a;
import a0.ViewOnApplyWindowInsetsListenerC0423a;
import a0.b;
import a0.c;
import a0.d;
import a0.f;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import com.anythink.basead.exoplayer.k.p;
import com.icefishinggame.icefishinggamemultigames.C5275R;
import g1.C4522b;
import h.C4544d;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class DrawerLayout extends ViewGroup {

    /* renamed from: W, reason: collision with root package name */
    public static final int[] f4727W = {R.attr.colorPrimaryDark};

    /* renamed from: n0, reason: collision with root package name */
    public static final int[] f4728n0 = {R.attr.layout_gravity};

    /* renamed from: o0, reason: collision with root package name */
    public static final boolean f4729o0;

    /* renamed from: p0, reason: collision with root package name */
    public static final boolean f4730p0;

    /* renamed from: q0, reason: collision with root package name */
    public static final boolean f4731q0;

    /* renamed from: A, reason: collision with root package name */
    public final e f4732A;

    /* renamed from: B, reason: collision with root package name */
    public final f f4733B;

    /* renamed from: C, reason: collision with root package name */
    public final f f4734C;

    /* renamed from: D, reason: collision with root package name */
    public int f4735D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f4736E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f4737F;

    /* renamed from: G, reason: collision with root package name */
    public int f4738G;

    /* renamed from: H, reason: collision with root package name */
    public int f4739H;

    /* renamed from: I, reason: collision with root package name */
    public int f4740I;
    public int J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f4741K;

    /* renamed from: L, reason: collision with root package name */
    public c f4742L;

    /* renamed from: M, reason: collision with root package name */
    public ArrayList f4743M;

    /* renamed from: N, reason: collision with root package name */
    public float f4744N;

    /* renamed from: O, reason: collision with root package name */
    public float f4745O;

    /* renamed from: P, reason: collision with root package name */
    public Drawable f4746P;

    /* renamed from: Q, reason: collision with root package name */
    public WindowInsets f4747Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f4748R;

    /* renamed from: S, reason: collision with root package name */
    public final ArrayList f4749S;

    /* renamed from: T, reason: collision with root package name */
    public Rect f4750T;

    /* renamed from: U, reason: collision with root package name */
    public Matrix f4751U;

    /* renamed from: V, reason: collision with root package name */
    public final C4522b f4752V;

    /* renamed from: n, reason: collision with root package name */
    public final h f4753n;

    /* renamed from: u, reason: collision with root package name */
    public float f4754u;

    /* renamed from: v, reason: collision with root package name */
    public final int f4755v;

    /* renamed from: w, reason: collision with root package name */
    public int f4756w;

    /* renamed from: x, reason: collision with root package name */
    public float f4757x;

    /* renamed from: y, reason: collision with root package name */
    public final Paint f4758y;

    /* renamed from: z, reason: collision with root package name */
    public final e f4759z;

    static {
        int i = Build.VERSION.SDK_INT;
        f4729o0 = true;
        f4730p0 = true;
        f4731q0 = i >= 29;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C5275R.attr.drawerLayoutStyle);
        this.f4753n = new h(1);
        this.f4756w = -1728053248;
        this.f4758y = new Paint();
        this.f4737F = true;
        this.f4738G = 3;
        this.f4739H = 3;
        this.f4740I = 3;
        this.J = 3;
        this.f4752V = new C4522b(10, this);
        setDescendantFocusability(262144);
        float f3 = getResources().getDisplayMetrics().density;
        this.f4755v = (int) ((64.0f * f3) + 0.5f);
        float f9 = f3 * 400.0f;
        f fVar = new f(this, 3);
        this.f4733B = fVar;
        f fVar2 = new f(this, 5);
        this.f4734C = fVar2;
        e eVar = new e(getContext(), this, fVar);
        eVar.f3380b = (int) (eVar.f3380b * 1.0f);
        this.f4759z = eVar;
        eVar.f3394q = 1;
        eVar.f3391n = f9;
        fVar.f4244b = eVar;
        e eVar2 = new e(getContext(), this, fVar2);
        eVar2.f3380b = (int) (1.0f * eVar2.f3380b);
        this.f4732A = eVar2;
        eVar2.f3394q = 2;
        eVar2.f3391n = f9;
        fVar2.f4244b = eVar2;
        setFocusableInTouchMode(true);
        WeakHashMap weakHashMap = X.f2054a;
        setImportantForAccessibility(1);
        X.o(this, new b(this));
        setMotionEventSplittingEnabled(false);
        if (getFitsSystemWindows()) {
            setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC0423a());
            setSystemUiVisibility(1280);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f4727W);
            try {
                this.f4746P = obtainStyledAttributes.getDrawable(0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, a.f3982a, C5275R.attr.drawerLayoutStyle, 0);
        try {
            if (obtainStyledAttributes2.hasValue(0)) {
                this.f4754u = obtainStyledAttributes2.getDimension(0, 0.0f);
            } else {
                this.f4754u = getResources().getDimension(C5275R.dimen.def_drawer_elevation);
            }
            obtainStyledAttributes2.recycle();
            this.f4749S = new ArrayList();
        } catch (Throwable th) {
            obtainStyledAttributes2.recycle();
            throw th;
        }
    }

    public static String k(int i) {
        return (i & 3) == 3 ? "LEFT" : (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    public static boolean l(View view) {
        WeakHashMap weakHashMap = X.f2054a;
        return (view.getImportantForAccessibility() == 4 || view.getImportantForAccessibility() == 2) ? false : true;
    }

    public static boolean m(View view) {
        return ((d) view.getLayoutParams()).f4234a == 0;
    }

    public static boolean n(View view) {
        if (o(view)) {
            return (((d) view.getLayoutParams()).f4237d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public static boolean o(View view) {
        int i = ((d) view.getLayoutParams()).f4234a;
        WeakHashMap weakHashMap = X.f2054a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i, view.getLayoutDirection());
        return ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) ? false : true;
    }

    public static boolean p(View view) {
        if (o(view)) {
            return ((d) view.getLayoutParams()).f4235b > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public final boolean a(int i, View view) {
        return (j(view) & i) == i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i6) {
        ArrayList arrayList2;
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        int i9 = 0;
        boolean z3 = false;
        while (true) {
            arrayList2 = this.f4749S;
            if (i9 >= childCount) {
                break;
            }
            View childAt = getChildAt(i9);
            if (!o(childAt)) {
                arrayList2.add(childAt);
            } else if (n(childAt)) {
                childAt.addFocusables(arrayList, i, i6);
                z3 = true;
            }
            i9++;
        }
        if (!z3) {
            int size = arrayList2.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = (View) arrayList2.get(i10);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i, i6);
                }
            }
        }
        arrayList2.clear();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (f() != null || o(view)) {
            WeakHashMap weakHashMap = X.f2054a;
            view.setImportantForAccessibility(4);
        } else {
            WeakHashMap weakHashMap2 = X.f2054a;
            view.setImportantForAccessibility(1);
        }
        if (f4729o0) {
            return;
        }
        X.o(view, this.f4753n);
    }

    public final void b(View view) {
        if (!o(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        d dVar = (d) view.getLayoutParams();
        if (this.f4737F) {
            dVar.f4235b = 0.0f;
            dVar.f4237d = 0;
        } else {
            dVar.f4237d |= 4;
            if (a(3, view)) {
                this.f4759z.s(-view.getWidth(), view.getTop(), view);
            } else {
                this.f4732A.s(getWidth(), view.getTop(), view);
            }
        }
        invalidate();
    }

    public final void c() {
        View e9 = e(8388611);
        if (e9 != null) {
            b(e9);
        } else {
            throw new IllegalArgumentException("No drawer view found with gravity " + k(8388611));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof d) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        int childCount = getChildCount();
        float f3 = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f3 = Math.max(f3, ((d) getChildAt(i).getLayoutParams()).f4235b);
        }
        this.f4757x = f3;
        boolean g4 = this.f4759z.g();
        boolean g9 = this.f4732A.g();
        if (g4 || g9) {
            WeakHashMap weakHashMap = X.f2054a;
            postInvalidateOnAnimation();
        }
    }

    public final void d(boolean z3) {
        int childCount = getChildCount();
        boolean z6 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            d dVar = (d) childAt.getLayoutParams();
            if (o(childAt) && (!z3 || dVar.f4236c)) {
                z6 |= a(3, childAt) ? this.f4759z.s(-childAt.getWidth(), childAt.getTop(), childAt) : this.f4732A.s(getWidth(), childAt.getTop(), childAt);
                dVar.f4236c = false;
            }
        }
        f fVar = this.f4733B;
        fVar.f4246d.removeCallbacks(fVar.f4245c);
        f fVar2 = this.f4734C;
        fVar2.f4246d.removeCallbacks(fVar2.f4245c);
        if (z6) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean dispatchGenericMotionEvent;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f4757x <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x9 = motionEvent.getX();
        float y7 = motionEvent.getY();
        for (int i = childCount - 1; i >= 0; i--) {
            View childAt = getChildAt(i);
            if (this.f4750T == null) {
                this.f4750T = new Rect();
            }
            childAt.getHitRect(this.f4750T);
            if (this.f4750T.contains((int) x9, (int) y7) && !m(childAt)) {
                if (childAt.getMatrix().isIdentity()) {
                    float scrollX = getScrollX() - childAt.getLeft();
                    float scrollY = getScrollY() - childAt.getTop();
                    motionEvent.offsetLocation(scrollX, scrollY);
                    dispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEvent);
                    motionEvent.offsetLocation(-scrollX, -scrollY);
                } else {
                    float scrollX2 = getScrollX() - childAt.getLeft();
                    float scrollY2 = getScrollY() - childAt.getTop();
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(scrollX2, scrollY2);
                    Matrix matrix = childAt.getMatrix();
                    if (!matrix.isIdentity()) {
                        if (this.f4751U == null) {
                            this.f4751U = new Matrix();
                        }
                        matrix.invert(this.f4751U);
                        obtain.transform(this.f4751U);
                    }
                    dispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(obtain);
                    obtain.recycle();
                }
                if (dispatchGenericMotionEvent) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j6) {
        Drawable background;
        int height = getHeight();
        boolean m4 = m(view);
        int width = getWidth();
        int save = canvas.save();
        int i = 0;
        if (m4) {
            int childCount = getChildCount();
            int i6 = 0;
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = getChildAt(i9);
                if (childAt != view && childAt.getVisibility() == 0 && (background = childAt.getBackground()) != null && background.getOpacity() == -1 && o(childAt) && childAt.getHeight() >= height) {
                    if (a(3, childAt)) {
                        int right = childAt.getRight();
                        if (right > i6) {
                            i6 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i6, 0, width, getHeight());
            i = i6;
        }
        boolean drawChild = super.drawChild(canvas, view, j6);
        canvas.restoreToCount(save);
        float f3 = this.f4757x;
        if (f3 > 0.0f && m4) {
            int i10 = this.f4756w;
            Paint paint = this.f4758y;
            paint.setColor((((int) ((((-16777216) & i10) >>> 24) * f3)) << 24) | (i10 & 16777215));
            canvas.drawRect(i, 0.0f, width, getHeight(), paint);
        }
        return drawChild;
    }

    public final View e(int i) {
        WeakHashMap weakHashMap = X.f2054a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection()) & 7;
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if ((j(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    public final View f() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((d) childAt.getLayoutParams()).f4237d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    public final View g() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (o(childAt) && p(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        d dVar = new d(-1, -1);
        dVar.f4234a = 0;
        return dVar;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof d) {
            d dVar = (d) layoutParams;
            d dVar2 = new d(dVar);
            dVar2.f4234a = 0;
            dVar2.f4234a = dVar.f4234a;
            return dVar2;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            d dVar3 = new d((ViewGroup.MarginLayoutParams) layoutParams);
            dVar3.f4234a = 0;
            return dVar3;
        }
        d dVar4 = new d(layoutParams);
        dVar4.f4234a = 0;
        return dVar4;
    }

    public float getDrawerElevation() {
        if (f4730p0) {
            return this.f4754u;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f4746P;
    }

    public final int h(int i) {
        WeakHashMap weakHashMap = X.f2054a;
        int layoutDirection = getLayoutDirection();
        if (i == 3) {
            int i6 = this.f4738G;
            if (i6 != 3) {
                return i6;
            }
            int i9 = layoutDirection == 0 ? this.f4740I : this.J;
            if (i9 != 3) {
                return i9;
            }
            return 0;
        }
        if (i == 5) {
            int i10 = this.f4739H;
            if (i10 != 3) {
                return i10;
            }
            int i11 = layoutDirection == 0 ? this.J : this.f4740I;
            if (i11 != 3) {
                return i11;
            }
            return 0;
        }
        if (i == 8388611) {
            int i12 = this.f4740I;
            if (i12 != 3) {
                return i12;
            }
            int i13 = layoutDirection == 0 ? this.f4738G : this.f4739H;
            if (i13 != 3) {
                return i13;
            }
            return 0;
        }
        if (i != 8388613) {
            return 0;
        }
        int i14 = this.J;
        if (i14 != 3) {
            return i14;
        }
        int i15 = layoutDirection == 0 ? this.f4739H : this.f4738G;
        if (i15 != 3) {
            return i15;
        }
        return 0;
    }

    public final int i(View view) {
        if (o(view)) {
            return h(((d) view.getLayoutParams()).f4234a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public final int j(View view) {
        int i = ((d) view.getLayoutParams()).f4234a;
        WeakHashMap weakHashMap = X.f2054a;
        return Gravity.getAbsoluteGravity(i, getLayoutDirection());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4737F = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f4737F = true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f4748R || this.f4746P == null) {
            return;
        }
        WindowInsets windowInsets = this.f4747Q;
        int systemWindowInsetTop = windowInsets != null ? windowInsets.getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.f4746P.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.f4746P.draw(canvas);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        if (r0 != 3) goto L19;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z3;
        View h9;
        int actionMasked = motionEvent.getActionMasked();
        e eVar = this.f4759z;
        boolean r9 = eVar.r(motionEvent) | this.f4732A.r(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int length = eVar.f3382d.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        if ((eVar.f3388k & (1 << i)) != 0) {
                            float f3 = eVar.f3384f[i] - eVar.f3382d[i];
                            float f9 = eVar.f3385g[i] - eVar.f3383e[i];
                            float f10 = (f9 * f9) + (f3 * f3);
                            int i6 = eVar.f3380b;
                            if (f10 > i6 * i6) {
                                f fVar = this.f4733B;
                                fVar.f4246d.removeCallbacks(fVar.f4245c);
                                f fVar2 = this.f4734C;
                                fVar2.f4246d.removeCallbacks(fVar2.f4245c);
                                break;
                            }
                        }
                        i++;
                    }
                }
                z3 = false;
            }
            d(true);
            this.f4741K = false;
            z3 = false;
        } else {
            float x9 = motionEvent.getX();
            float y7 = motionEvent.getY();
            this.f4744N = x9;
            this.f4745O = y7;
            z3 = this.f4757x > 0.0f && (h9 = eVar.h((int) x9, (int) y7)) != null && m(h9);
            this.f4741K = false;
        }
        if (!r9 && !z3) {
            int childCount = getChildCount();
            int i9 = 0;
            while (true) {
                if (i9 >= childCount) {
                    if (this.f4741K) {
                        break;
                    }
                    return false;
                }
                if (((d) getChildAt(i9).getLayoutParams()).f4236c) {
                    break;
                }
                i9++;
            }
        }
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || g() == null) {
            return super.onKeyDown(i, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View g4 = g();
        if (g4 != null && i(g4) == 0) {
            d(false);
        }
        return g4 != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i6, int i9, int i10) {
        WindowInsets rootWindowInsets;
        float f3;
        int i11;
        boolean z6 = true;
        this.f4736E = true;
        int i12 = i9 - i;
        int childCount = getChildCount();
        int i13 = 0;
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (m(childAt)) {
                    int i14 = ((ViewGroup.MarginLayoutParams) dVar).leftMargin;
                    childAt.layout(i14, ((ViewGroup.MarginLayoutParams) dVar).topMargin, childAt.getMeasuredWidth() + i14, childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) dVar).topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a(3, childAt)) {
                        float f9 = measuredWidth;
                        i11 = (-measuredWidth) + ((int) (dVar.f4235b * f9));
                        f3 = (measuredWidth + i11) / f9;
                    } else {
                        float f10 = measuredWidth;
                        f3 = (i12 - r11) / f10;
                        i11 = i12 - ((int) (dVar.f4235b * f10));
                    }
                    boolean z9 = f3 != dVar.f4235b ? z6 : false;
                    int i15 = dVar.f4234a & 112;
                    if (i15 == 16) {
                        int i16 = i10 - i6;
                        int i17 = (i16 - measuredHeight) / 2;
                        int i18 = ((ViewGroup.MarginLayoutParams) dVar).topMargin;
                        if (i17 < i18) {
                            i17 = i18;
                        } else {
                            int i19 = i17 + measuredHeight;
                            int i20 = i16 - ((ViewGroup.MarginLayoutParams) dVar).bottomMargin;
                            if (i19 > i20) {
                                i17 = i20 - measuredHeight;
                            }
                        }
                        childAt.layout(i11, i17, measuredWidth + i11, measuredHeight + i17);
                    } else if (i15 != 80) {
                        int i21 = ((ViewGroup.MarginLayoutParams) dVar).topMargin;
                        childAt.layout(i11, i21, measuredWidth + i11, measuredHeight + i21);
                    } else {
                        int i22 = i10 - i6;
                        childAt.layout(i11, (i22 - ((ViewGroup.MarginLayoutParams) dVar).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i11, i22 - ((ViewGroup.MarginLayoutParams) dVar).bottomMargin);
                    }
                    if (z9) {
                        t(childAt, f3);
                    }
                    int i23 = dVar.f4235b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i23) {
                        childAt.setVisibility(i23);
                    }
                }
            }
            i13++;
            z6 = true;
        }
        if (f4731q0 && (rootWindowInsets = getRootWindowInsets()) != null) {
            G.e i24 = A0.h(null, rootWindowInsets).f2027a.i();
            e eVar = this.f4759z;
            eVar.f3392o = Math.max(eVar.f3393p, i24.f1005a);
            e eVar2 = this.f4732A;
            eVar2.f3392o = Math.max(eVar2.f3393p, i24.f1007c);
        }
        this.f4736E = false;
        this.f4737F = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0048  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i6) {
        boolean z3;
        int childCount;
        int i9;
        int i10;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i6);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i6);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode == 0) {
                size = 300;
            }
            if (mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        int i11 = 0;
        if (this.f4747Q != null) {
            WeakHashMap weakHashMap = X.f2054a;
            if (getFitsSystemWindows()) {
                z3 = true;
                WeakHashMap weakHashMap2 = X.f2054a;
                int layoutDirection = getLayoutDirection();
                childCount = getChildCount();
                i9 = 0;
                int i12 = 0;
                int i13 = 0;
                while (i9 < childCount) {
                    View childAt = getChildAt(i9);
                    if (childAt.getVisibility() != 8) {
                        d dVar = (d) childAt.getLayoutParams();
                        if (z3) {
                            int absoluteGravity = Gravity.getAbsoluteGravity(dVar.f4234a, layoutDirection);
                            i10 = 1;
                            if (childAt.getFitsSystemWindows()) {
                                WindowInsets windowInsets = this.f4747Q;
                                if (absoluteGravity == 3) {
                                    windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), i11, windowInsets.getSystemWindowInsetBottom());
                                } else if (absoluteGravity == 5) {
                                    windowInsets = windowInsets.replaceSystemWindowInsets(i11, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                                }
                                childAt.dispatchApplyWindowInsets(windowInsets);
                            } else {
                                WindowInsets windowInsets2 = this.f4747Q;
                                if (absoluteGravity == 3) {
                                    windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), i11, windowInsets2.getSystemWindowInsetBottom());
                                } else if (absoluteGravity == 5) {
                                    windowInsets2 = windowInsets2.replaceSystemWindowInsets(i11, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                                }
                                ((ViewGroup.MarginLayoutParams) dVar).leftMargin = windowInsets2.getSystemWindowInsetLeft();
                                ((ViewGroup.MarginLayoutParams) dVar).topMargin = windowInsets2.getSystemWindowInsetTop();
                                ((ViewGroup.MarginLayoutParams) dVar).rightMargin = windowInsets2.getSystemWindowInsetRight();
                                ((ViewGroup.MarginLayoutParams) dVar).bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                            }
                        } else {
                            i10 = 1;
                        }
                        if (m(childAt)) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) dVar).leftMargin) - ((ViewGroup.MarginLayoutParams) dVar).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) dVar).topMargin) - ((ViewGroup.MarginLayoutParams) dVar).bottomMargin, 1073741824));
                        } else {
                            if (!o(childAt)) {
                                throw new IllegalStateException("Child " + childAt + " at index " + i9 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                            }
                            if (f4730p0) {
                                float i14 = L.i(childAt);
                                float f3 = this.f4754u;
                                if (i14 != f3) {
                                    L.s(childAt, f3);
                                }
                            }
                            int j6 = j(childAt) & 7;
                            int i15 = j6 == 3 ? i10 : i11;
                            if ((i15 != 0 && i12 != 0) || (i15 == 0 && i13 != 0)) {
                                throw new IllegalStateException("Child drawer has absolute gravity " + k(j6) + " but this DrawerLayout already has a drawer view along that edge");
                            }
                            if (i15 != 0) {
                                i12 = i10;
                            } else {
                                i13 = i10;
                            }
                            childAt.measure(ViewGroup.getChildMeasureSpec(i, this.f4755v + ((ViewGroup.MarginLayoutParams) dVar).leftMargin + ((ViewGroup.MarginLayoutParams) dVar).rightMargin, ((ViewGroup.MarginLayoutParams) dVar).width), ViewGroup.getChildMeasureSpec(i6, ((ViewGroup.MarginLayoutParams) dVar).topMargin + ((ViewGroup.MarginLayoutParams) dVar).bottomMargin, ((ViewGroup.MarginLayoutParams) dVar).height));
                            i9++;
                            i11 = 0;
                        }
                    }
                    i9++;
                    i11 = 0;
                }
            }
        }
        z3 = false;
        WeakHashMap weakHashMap22 = X.f2054a;
        int layoutDirection2 = getLayoutDirection();
        childCount = getChildCount();
        i9 = 0;
        int i122 = 0;
        int i132 = 0;
        while (i9 < childCount) {
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        View e9;
        if (!(parcelable instanceof a0.e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a0.e eVar = (a0.e) parcelable;
        super.onRestoreInstanceState(eVar.f3267n);
        int i = eVar.f4238v;
        if (i != 0 && (e9 = e(i)) != null) {
            q(e9);
        }
        int i6 = eVar.f4239w;
        if (i6 != 3) {
            s(i6, 3);
        }
        int i9 = eVar.f4240x;
        if (i9 != 3) {
            s(i9, 5);
        }
        int i10 = eVar.f4241y;
        if (i10 != 3) {
            s(i10, 8388611);
        }
        int i11 = eVar.f4242z;
        if (i11 != 3) {
            s(i11, 8388613);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        if (f4730p0) {
            return;
        }
        WeakHashMap weakHashMap = X.f2054a;
        getLayoutDirection();
        getLayoutDirection();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        a0.e eVar = new a0.e(super.onSaveInstanceState());
        eVar.f4238v = 0;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            d dVar = (d) getChildAt(i).getLayoutParams();
            int i6 = dVar.f4237d;
            boolean z3 = i6 == 1;
            boolean z6 = i6 == 2;
            if (z3 || z6) {
                eVar.f4238v = dVar.f4234a;
                break;
            }
        }
        eVar.f4239w = this.f4738G;
        eVar.f4240x = this.f4739H;
        eVar.f4241y = this.f4740I;
        eVar.f4242z = this.J;
        return eVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        if (i(r7) != 2) goto L21;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        e eVar = this.f4759z;
        eVar.k(motionEvent);
        this.f4732A.k(motionEvent);
        int action = motionEvent.getAction() & p.f8473b;
        boolean z3 = false;
        if (action == 0) {
            float x9 = motionEvent.getX();
            float y7 = motionEvent.getY();
            this.f4744N = x9;
            this.f4745O = y7;
            this.f4741K = false;
            return true;
        }
        if (action != 1) {
            if (action != 3) {
                return true;
            }
            d(true);
            this.f4741K = false;
            return true;
        }
        float x10 = motionEvent.getX();
        float y9 = motionEvent.getY();
        View h9 = eVar.h((int) x10, (int) y9);
        if (h9 != null && m(h9)) {
            float f3 = x10 - this.f4744N;
            float f9 = y9 - this.f4745O;
            int i = eVar.f3380b;
            if ((f9 * f9) + (f3 * f3) < i * i) {
                View f10 = f();
                if (f10 != null) {
                }
            }
        }
        z3 = true;
        d(z3);
        return true;
    }

    public final void q(View view) {
        if (!o(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        d dVar = (d) view.getLayoutParams();
        if (this.f4737F) {
            dVar.f4235b = 1.0f;
            dVar.f4237d = 1;
            v(view, true);
            u(view);
        } else {
            dVar.f4237d |= 2;
            if (a(3, view)) {
                this.f4759z.s(0, view.getTop(), view);
            } else {
                this.f4732A.s(getWidth() - view.getWidth(), view.getTop(), view);
            }
        }
        invalidate();
    }

    public final void r() {
        View e9 = e(8388611);
        if (e9 != null) {
            q(e9);
        } else {
            throw new IllegalArgumentException("No drawer view found with gravity " + k(8388611));
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z3) {
        super.requestDisallowInterceptTouchEvent(z3);
        if (z3) {
            d(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f4736E) {
            return;
        }
        super.requestLayout();
    }

    public final void s(int i, int i6) {
        View e9;
        WeakHashMap weakHashMap = X.f2054a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i6, getLayoutDirection());
        if (i6 == 3) {
            this.f4738G = i;
        } else if (i6 == 5) {
            this.f4739H = i;
        } else if (i6 == 8388611) {
            this.f4740I = i;
        } else if (i6 == 8388613) {
            this.J = i;
        }
        if (i != 0) {
            (absoluteGravity == 3 ? this.f4759z : this.f4732A).a();
        }
        if (i != 1) {
            if (i == 2 && (e9 = e(absoluteGravity)) != null) {
                q(e9);
                return;
            }
            return;
        }
        View e10 = e(absoluteGravity);
        if (e10 != null) {
            b(e10);
        }
    }

    public void setDrawerElevation(float f3) {
        this.f4754u = f3;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (o(childAt)) {
                float f9 = this.f4754u;
                WeakHashMap weakHashMap = X.f2054a;
                L.s(childAt, f9);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(c cVar) {
        ArrayList arrayList;
        c cVar2 = this.f4742L;
        if (cVar2 != null && (arrayList = this.f4743M) != null) {
            arrayList.remove(cVar2);
        }
        if (cVar != null) {
            if (this.f4743M == null) {
                this.f4743M = new ArrayList();
            }
            this.f4743M.add(cVar);
        }
        this.f4742L = cVar;
    }

    public void setDrawerLockMode(int i) {
        s(i, 3);
        s(i, 5);
    }

    public void setScrimColor(int i) {
        this.f4756w = i;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f4746P = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.f4746P = new ColorDrawable(i);
        invalidate();
    }

    public final void t(View view, float f3) {
        d dVar = (d) view.getLayoutParams();
        if (f3 == dVar.f4235b) {
            return;
        }
        dVar.f4235b = f3;
        ArrayList arrayList = this.f4743M;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C4544d c4544d = (C4544d) ((c) this.f4743M.get(size));
                c4544d.getClass();
                c4544d.a(Math.min(1.0f, Math.max(0.0f, f3)));
            }
        }
    }

    public final void u(View view) {
        P.f fVar = P.f.f2400l;
        X.l(fVar.a(), view);
        X.i(0, view);
        if (!n(view) || i(view) == 2) {
            return;
        }
        X.m(view, fVar, this.f4752V);
    }

    public final void v(View view, boolean z3) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((z3 || o(childAt)) && !(z3 && childAt == view)) {
                WeakHashMap weakHashMap = X.f2054a;
                childAt.setImportantForAccessibility(4);
            } else {
                WeakHashMap weakHashMap2 = X.f2054a;
                childAt.setImportantForAccessibility(1);
            }
        }
    }

    public void setStatusBarBackground(int i) {
        this.f4746P = i != 0 ? E.a.b(getContext(), i) : null;
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        d dVar = new d(context, attributeSet);
        dVar.f4234a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f4728n0);
        dVar.f4234a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        return dVar;
    }
}
