package androidx.drawerlayout.widget;

import I0.j;
import O.A0;
import O.L;
import O.X;
import U.h;
import W.e;
import Z.a;
import a0.ViewOnApplyWindowInsetsListenerC0416a;
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
import com.icefishing.icefishingliveapp.C5284R;
import h.C4545d;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class DrawerLayout extends ViewGroup {

    /* renamed from: W, reason: collision with root package name */
    public static final int[] f4842W = {R.attr.colorPrimaryDark};

    /* renamed from: n0, reason: collision with root package name */
    public static final int[] f4843n0 = {R.attr.layout_gravity};

    /* renamed from: o0, reason: collision with root package name */
    public static final boolean f4844o0;

    /* renamed from: p0, reason: collision with root package name */
    public static final boolean f4845p0;

    /* renamed from: q0, reason: collision with root package name */
    public static final boolean f4846q0;

    /* renamed from: A, reason: collision with root package name */
    public final e f4847A;

    /* renamed from: B, reason: collision with root package name */
    public final f f4848B;

    /* renamed from: C, reason: collision with root package name */
    public final f f4849C;

    /* renamed from: D, reason: collision with root package name */
    public int f4850D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f4851E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f4852F;

    /* renamed from: G, reason: collision with root package name */
    public int f4853G;

    /* renamed from: H, reason: collision with root package name */
    public int f4854H;

    /* renamed from: I, reason: collision with root package name */
    public int f4855I;
    public int J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f4856K;

    /* renamed from: L, reason: collision with root package name */
    public c f4857L;

    /* renamed from: M, reason: collision with root package name */
    public ArrayList f4858M;

    /* renamed from: N, reason: collision with root package name */
    public float f4859N;

    /* renamed from: O, reason: collision with root package name */
    public float f4860O;

    /* renamed from: P, reason: collision with root package name */
    public Drawable f4861P;

    /* renamed from: Q, reason: collision with root package name */
    public WindowInsets f4862Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f4863R;

    /* renamed from: S, reason: collision with root package name */
    public final ArrayList f4864S;

    /* renamed from: T, reason: collision with root package name */
    public Rect f4865T;

    /* renamed from: U, reason: collision with root package name */
    public Matrix f4866U;

    /* renamed from: V, reason: collision with root package name */
    public final j f4867V;

    /* renamed from: n, reason: collision with root package name */
    public final h f4868n;

    /* renamed from: u, reason: collision with root package name */
    public float f4869u;

    /* renamed from: v, reason: collision with root package name */
    public final int f4870v;

    /* renamed from: w, reason: collision with root package name */
    public int f4871w;

    /* renamed from: x, reason: collision with root package name */
    public float f4872x;

    /* renamed from: y, reason: collision with root package name */
    public final Paint f4873y;

    /* renamed from: z, reason: collision with root package name */
    public final e f4874z;

    static {
        int i = Build.VERSION.SDK_INT;
        f4844o0 = true;
        f4845p0 = true;
        f4846q0 = i >= 29;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C5284R.attr.drawerLayoutStyle);
        this.f4868n = new h(1);
        this.f4871w = -1728053248;
        this.f4873y = new Paint();
        this.f4852F = true;
        this.f4853G = 3;
        this.f4854H = 3;
        this.f4855I = 3;
        this.J = 3;
        this.f4867V = new j(15, this);
        setDescendantFocusability(262144);
        float f6 = getResources().getDisplayMetrics().density;
        this.f4870v = (int) ((64.0f * f6) + 0.5f);
        float f9 = f6 * 400.0f;
        f fVar = new f(this, 3);
        this.f4848B = fVar;
        f fVar2 = new f(this, 5);
        this.f4849C = fVar2;
        e eVar = new e(getContext(), this, fVar);
        eVar.f3392b = (int) (eVar.f3392b * 1.0f);
        this.f4874z = eVar;
        eVar.f3406q = 1;
        eVar.f3403n = f9;
        fVar.f4293b = eVar;
        e eVar2 = new e(getContext(), this, fVar2);
        eVar2.f3392b = (int) (1.0f * eVar2.f3392b);
        this.f4847A = eVar2;
        eVar2.f3406q = 2;
        eVar2.f3403n = f9;
        fVar2.f4293b = eVar2;
        setFocusableInTouchMode(true);
        WeakHashMap weakHashMap = X.f2240a;
        setImportantForAccessibility(1);
        X.o(this, new b(this));
        setMotionEventSplittingEnabled(false);
        if (getFitsSystemWindows()) {
            setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC0416a());
            setSystemUiVisibility(1280);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f4842W);
            try {
                this.f4861P = obtainStyledAttributes.getDrawable(0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, a.f4059a, C5284R.attr.drawerLayoutStyle, 0);
        try {
            if (obtainStyledAttributes2.hasValue(0)) {
                this.f4869u = obtainStyledAttributes2.getDimension(0, 0.0f);
            } else {
                this.f4869u = getResources().getDimension(C5284R.dimen.def_drawer_elevation);
            }
            obtainStyledAttributes2.recycle();
            this.f4864S = new ArrayList();
        } catch (Throwable th) {
            obtainStyledAttributes2.recycle();
            throw th;
        }
    }

    public static String k(int i) {
        return (i & 3) == 3 ? "LEFT" : (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    public static boolean l(View view) {
        WeakHashMap weakHashMap = X.f2240a;
        return (view.getImportantForAccessibility() == 4 || view.getImportantForAccessibility() == 2) ? false : true;
    }

    public static boolean m(View view) {
        return ((d) view.getLayoutParams()).f4283a == 0;
    }

    public static boolean n(View view) {
        if (o(view)) {
            return (((d) view.getLayoutParams()).f4286d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public static boolean o(View view) {
        int i = ((d) view.getLayoutParams()).f4283a;
        WeakHashMap weakHashMap = X.f2240a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i, view.getLayoutDirection());
        return ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) ? false : true;
    }

    public static boolean p(View view) {
        if (o(view)) {
            return ((d) view.getLayoutParams()).f4284b > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public final boolean a(int i, View view) {
        return (j(view) & i) == i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i4) {
        ArrayList arrayList2;
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        int i9 = 0;
        boolean z8 = false;
        while (true) {
            arrayList2 = this.f4864S;
            if (i9 >= childCount) {
                break;
            }
            View childAt = getChildAt(i9);
            if (!o(childAt)) {
                arrayList2.add(childAt);
            } else if (n(childAt)) {
                childAt.addFocusables(arrayList, i, i4);
                z8 = true;
            }
            i9++;
        }
        if (!z8) {
            int size = arrayList2.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = (View) arrayList2.get(i10);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i, i4);
                }
            }
        }
        arrayList2.clear();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (f() != null || o(view)) {
            WeakHashMap weakHashMap = X.f2240a;
            view.setImportantForAccessibility(4);
        } else {
            WeakHashMap weakHashMap2 = X.f2240a;
            view.setImportantForAccessibility(1);
        }
        if (f4844o0) {
            return;
        }
        X.o(view, this.f4868n);
    }

    public final void b(View view) {
        if (!o(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        d dVar = (d) view.getLayoutParams();
        if (this.f4852F) {
            dVar.f4284b = 0.0f;
            dVar.f4286d = 0;
        } else {
            dVar.f4286d |= 4;
            if (a(3, view)) {
                this.f4874z.s(-view.getWidth(), view.getTop(), view);
            } else {
                this.f4847A.s(getWidth(), view.getTop(), view);
            }
        }
        invalidate();
    }

    public final void c() {
        View e6 = e(8388611);
        if (e6 != null) {
            b(e6);
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
        float f6 = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f6 = Math.max(f6, ((d) getChildAt(i).getLayoutParams()).f4284b);
        }
        this.f4872x = f6;
        boolean g9 = this.f4874z.g();
        boolean g10 = this.f4847A.g();
        if (g9 || g10) {
            WeakHashMap weakHashMap = X.f2240a;
            postInvalidateOnAnimation();
        }
    }

    public final void d(boolean z8) {
        int childCount = getChildCount();
        boolean z9 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            d dVar = (d) childAt.getLayoutParams();
            if (o(childAt) && (!z8 || dVar.f4285c)) {
                z9 |= a(3, childAt) ? this.f4874z.s(-childAt.getWidth(), childAt.getTop(), childAt) : this.f4847A.s(getWidth(), childAt.getTop(), childAt);
                dVar.f4285c = false;
            }
        }
        f fVar = this.f4848B;
        fVar.f4295d.removeCallbacks(fVar.f4294c);
        f fVar2 = this.f4849C;
        fVar2.f4295d.removeCallbacks(fVar2.f4294c);
        if (z9) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean dispatchGenericMotionEvent;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f4872x <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x3 = motionEvent.getX();
        float y6 = motionEvent.getY();
        for (int i = childCount - 1; i >= 0; i--) {
            View childAt = getChildAt(i);
            if (this.f4865T == null) {
                this.f4865T = new Rect();
            }
            childAt.getHitRect(this.f4865T);
            if (this.f4865T.contains((int) x3, (int) y6) && !m(childAt)) {
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
                        if (this.f4866U == null) {
                            this.f4866U = new Matrix();
                        }
                        matrix.invert(this.f4866U);
                        obtain.transform(this.f4866U);
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
    public final boolean drawChild(Canvas canvas, View view, long j9) {
        Drawable background;
        int height = getHeight();
        boolean m8 = m(view);
        int width = getWidth();
        int save = canvas.save();
        int i = 0;
        if (m8) {
            int childCount = getChildCount();
            int i4 = 0;
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = getChildAt(i9);
                if (childAt != view && childAt.getVisibility() == 0 && (background = childAt.getBackground()) != null && background.getOpacity() == -1 && o(childAt) && childAt.getHeight() >= height) {
                    if (a(3, childAt)) {
                        int right = childAt.getRight();
                        if (right > i4) {
                            i4 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i4, 0, width, getHeight());
            i = i4;
        }
        boolean drawChild = super.drawChild(canvas, view, j9);
        canvas.restoreToCount(save);
        float f6 = this.f4872x;
        if (f6 > 0.0f && m8) {
            int i10 = this.f4871w;
            Paint paint = this.f4873y;
            paint.setColor((((int) ((((-16777216) & i10) >>> 24) * f6)) << 24) | (i10 & 16777215));
            canvas.drawRect(i, 0.0f, width, getHeight(), paint);
        }
        return drawChild;
    }

    public final View e(int i) {
        WeakHashMap weakHashMap = X.f2240a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection()) & 7;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
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
            if ((((d) childAt.getLayoutParams()).f4286d & 1) == 1) {
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
        dVar.f4283a = 0;
        return dVar;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof d) {
            d dVar = (d) layoutParams;
            d dVar2 = new d(dVar);
            dVar2.f4283a = 0;
            dVar2.f4283a = dVar.f4283a;
            return dVar2;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            d dVar3 = new d((ViewGroup.MarginLayoutParams) layoutParams);
            dVar3.f4283a = 0;
            return dVar3;
        }
        d dVar4 = new d(layoutParams);
        dVar4.f4283a = 0;
        return dVar4;
    }

    public float getDrawerElevation() {
        if (f4845p0) {
            return this.f4869u;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f4861P;
    }

    public final int h(int i) {
        WeakHashMap weakHashMap = X.f2240a;
        int layoutDirection = getLayoutDirection();
        if (i == 3) {
            int i4 = this.f4853G;
            if (i4 != 3) {
                return i4;
            }
            int i9 = layoutDirection == 0 ? this.f4855I : this.J;
            if (i9 != 3) {
                return i9;
            }
            return 0;
        }
        if (i == 5) {
            int i10 = this.f4854H;
            if (i10 != 3) {
                return i10;
            }
            int i11 = layoutDirection == 0 ? this.J : this.f4855I;
            if (i11 != 3) {
                return i11;
            }
            return 0;
        }
        if (i == 8388611) {
            int i12 = this.f4855I;
            if (i12 != 3) {
                return i12;
            }
            int i13 = layoutDirection == 0 ? this.f4853G : this.f4854H;
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
        int i15 = layoutDirection == 0 ? this.f4854H : this.f4853G;
        if (i15 != 3) {
            return i15;
        }
        return 0;
    }

    public final int i(View view) {
        if (o(view)) {
            return h(((d) view.getLayoutParams()).f4283a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public final int j(View view) {
        int i = ((d) view.getLayoutParams()).f4283a;
        WeakHashMap weakHashMap = X.f2240a;
        return Gravity.getAbsoluteGravity(i, getLayoutDirection());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4852F = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f4852F = true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f4863R || this.f4861P == null) {
            return;
        }
        WindowInsets windowInsets = this.f4862Q;
        int systemWindowInsetTop = windowInsets != null ? windowInsets.getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.f4861P.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.f4861P.draw(canvas);
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
        boolean z8;
        View h9;
        int actionMasked = motionEvent.getActionMasked();
        e eVar = this.f4874z;
        boolean r9 = eVar.r(motionEvent) | this.f4847A.r(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int length = eVar.f3394d.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        if ((eVar.f3400k & (1 << i)) != 0) {
                            float f6 = eVar.f3396f[i] - eVar.f3394d[i];
                            float f9 = eVar.f3397g[i] - eVar.f3395e[i];
                            float f10 = (f9 * f9) + (f6 * f6);
                            int i4 = eVar.f3392b;
                            if (f10 > i4 * i4) {
                                f fVar = this.f4848B;
                                fVar.f4295d.removeCallbacks(fVar.f4294c);
                                f fVar2 = this.f4849C;
                                fVar2.f4295d.removeCallbacks(fVar2.f4294c);
                                break;
                            }
                        }
                        i++;
                    }
                }
                z8 = false;
            }
            d(true);
            this.f4856K = false;
            z8 = false;
        } else {
            float x3 = motionEvent.getX();
            float y6 = motionEvent.getY();
            this.f4859N = x3;
            this.f4860O = y6;
            z8 = this.f4872x > 0.0f && (h9 = eVar.h((int) x3, (int) y6)) != null && m(h9);
            this.f4856K = false;
        }
        if (!r9 && !z8) {
            int childCount = getChildCount();
            int i9 = 0;
            while (true) {
                if (i9 >= childCount) {
                    if (this.f4856K) {
                        break;
                    }
                    return false;
                }
                if (((d) getChildAt(i9).getLayoutParams()).f4285c) {
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
        View g9 = g();
        if (g9 != null && i(g9) == 0) {
            d(false);
        }
        return g9 != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i, int i4, int i9, int i10) {
        WindowInsets rootWindowInsets;
        float f6;
        int i11;
        boolean z9 = true;
        this.f4851E = true;
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
                        i11 = (-measuredWidth) + ((int) (dVar.f4284b * f9));
                        f6 = (measuredWidth + i11) / f9;
                    } else {
                        float f10 = measuredWidth;
                        f6 = (i12 - r11) / f10;
                        i11 = i12 - ((int) (dVar.f4284b * f10));
                    }
                    boolean z10 = f6 != dVar.f4284b ? z9 : false;
                    int i15 = dVar.f4283a & 112;
                    if (i15 == 16) {
                        int i16 = i10 - i4;
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
                        int i22 = i10 - i4;
                        childAt.layout(i11, (i22 - ((ViewGroup.MarginLayoutParams) dVar).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i11, i22 - ((ViewGroup.MarginLayoutParams) dVar).bottomMargin);
                    }
                    if (z10) {
                        t(childAt, f6);
                    }
                    int i23 = dVar.f4284b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i23) {
                        childAt.setVisibility(i23);
                    }
                }
            }
            i13++;
            z9 = true;
        }
        if (f4846q0 && (rootWindowInsets = getRootWindowInsets()) != null) {
            G.e i24 = A0.h(null, rootWindowInsets).f2213a.i();
            e eVar = this.f4874z;
            eVar.f3404o = Math.max(eVar.f3405p, i24.f1151a);
            e eVar2 = this.f4847A;
            eVar2.f3404o = Math.max(eVar2.f3405p, i24.f1153c);
        }
        this.f4851E = false;
        this.f4852F = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0048  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i4) {
        boolean z8;
        int childCount;
        int i9;
        int i10;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i4);
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
        if (this.f4862Q != null) {
            WeakHashMap weakHashMap = X.f2240a;
            if (getFitsSystemWindows()) {
                z8 = true;
                WeakHashMap weakHashMap2 = X.f2240a;
                int layoutDirection = getLayoutDirection();
                childCount = getChildCount();
                i9 = 0;
                int i12 = 0;
                int i13 = 0;
                while (i9 < childCount) {
                    View childAt = getChildAt(i9);
                    if (childAt.getVisibility() != 8) {
                        d dVar = (d) childAt.getLayoutParams();
                        if (z8) {
                            int absoluteGravity = Gravity.getAbsoluteGravity(dVar.f4283a, layoutDirection);
                            i10 = 1;
                            if (childAt.getFitsSystemWindows()) {
                                WindowInsets windowInsets = this.f4862Q;
                                if (absoluteGravity == 3) {
                                    windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), i11, windowInsets.getSystemWindowInsetBottom());
                                } else if (absoluteGravity == 5) {
                                    windowInsets = windowInsets.replaceSystemWindowInsets(i11, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                                }
                                childAt.dispatchApplyWindowInsets(windowInsets);
                            } else {
                                WindowInsets windowInsets2 = this.f4862Q;
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
                            if (f4845p0) {
                                float i14 = L.i(childAt);
                                float f6 = this.f4869u;
                                if (i14 != f6) {
                                    L.s(childAt, f6);
                                }
                            }
                            int j9 = j(childAt) & 7;
                            int i15 = j9 == 3 ? i10 : i11;
                            if ((i15 != 0 && i12 != 0) || (i15 == 0 && i13 != 0)) {
                                throw new IllegalStateException("Child drawer has absolute gravity " + k(j9) + " but this DrawerLayout already has a drawer view along that edge");
                            }
                            if (i15 != 0) {
                                i12 = i10;
                            } else {
                                i13 = i10;
                            }
                            childAt.measure(ViewGroup.getChildMeasureSpec(i, this.f4870v + ((ViewGroup.MarginLayoutParams) dVar).leftMargin + ((ViewGroup.MarginLayoutParams) dVar).rightMargin, ((ViewGroup.MarginLayoutParams) dVar).width), ViewGroup.getChildMeasureSpec(i4, ((ViewGroup.MarginLayoutParams) dVar).topMargin + ((ViewGroup.MarginLayoutParams) dVar).bottomMargin, ((ViewGroup.MarginLayoutParams) dVar).height));
                            i9++;
                            i11 = 0;
                        }
                    }
                    i9++;
                    i11 = 0;
                }
            }
        }
        z8 = false;
        WeakHashMap weakHashMap22 = X.f2240a;
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
        View e6;
        if (!(parcelable instanceof a0.e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a0.e eVar = (a0.e) parcelable;
        super.onRestoreInstanceState(eVar.f3318n);
        int i = eVar.f4287v;
        if (i != 0 && (e6 = e(i)) != null) {
            q(e6);
        }
        int i4 = eVar.f4288w;
        if (i4 != 3) {
            s(i4, 3);
        }
        int i9 = eVar.f4289x;
        if (i9 != 3) {
            s(i9, 5);
        }
        int i10 = eVar.f4290y;
        if (i10 != 3) {
            s(i10, 8388611);
        }
        int i11 = eVar.f4291z;
        if (i11 != 3) {
            s(i11, 8388613);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        if (f4845p0) {
            return;
        }
        WeakHashMap weakHashMap = X.f2240a;
        getLayoutDirection();
        getLayoutDirection();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        a0.e eVar = new a0.e(super.onSaveInstanceState());
        eVar.f4287v = 0;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            d dVar = (d) getChildAt(i).getLayoutParams();
            int i4 = dVar.f4286d;
            boolean z8 = i4 == 1;
            boolean z9 = i4 == 2;
            if (z8 || z9) {
                eVar.f4287v = dVar.f4283a;
                break;
            }
        }
        eVar.f4288w = this.f4853G;
        eVar.f4289x = this.f4854H;
        eVar.f4290y = this.f4855I;
        eVar.f4291z = this.J;
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
        e eVar = this.f4874z;
        eVar.k(motionEvent);
        this.f4847A.k(motionEvent);
        int action = motionEvent.getAction() & p.f8630b;
        boolean z8 = false;
        if (action == 0) {
            float x3 = motionEvent.getX();
            float y6 = motionEvent.getY();
            this.f4859N = x3;
            this.f4860O = y6;
            this.f4856K = false;
            return true;
        }
        if (action != 1) {
            if (action != 3) {
                return true;
            }
            d(true);
            this.f4856K = false;
            return true;
        }
        float x9 = motionEvent.getX();
        float y8 = motionEvent.getY();
        View h9 = eVar.h((int) x9, (int) y8);
        if (h9 != null && m(h9)) {
            float f6 = x9 - this.f4859N;
            float f9 = y8 - this.f4860O;
            int i = eVar.f3392b;
            if ((f9 * f9) + (f6 * f6) < i * i) {
                View f10 = f();
                if (f10 != null) {
                }
            }
        }
        z8 = true;
        d(z8);
        return true;
    }

    public final void q(View view) {
        if (!o(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        d dVar = (d) view.getLayoutParams();
        if (this.f4852F) {
            dVar.f4284b = 1.0f;
            dVar.f4286d = 1;
            v(view, true);
            u(view);
        } else {
            dVar.f4286d |= 2;
            if (a(3, view)) {
                this.f4874z.s(0, view.getTop(), view);
            } else {
                this.f4847A.s(getWidth() - view.getWidth(), view.getTop(), view);
            }
        }
        invalidate();
    }

    public final void r() {
        View e6 = e(8388611);
        if (e6 != null) {
            q(e6);
        } else {
            throw new IllegalArgumentException("No drawer view found with gravity " + k(8388611));
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z8) {
        super.requestDisallowInterceptTouchEvent(z8);
        if (z8) {
            d(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f4851E) {
            return;
        }
        super.requestLayout();
    }

    public final void s(int i, int i4) {
        View e6;
        WeakHashMap weakHashMap = X.f2240a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, getLayoutDirection());
        if (i4 == 3) {
            this.f4853G = i;
        } else if (i4 == 5) {
            this.f4854H = i;
        } else if (i4 == 8388611) {
            this.f4855I = i;
        } else if (i4 == 8388613) {
            this.J = i;
        }
        if (i != 0) {
            (absoluteGravity == 3 ? this.f4874z : this.f4847A).a();
        }
        if (i != 1) {
            if (i == 2 && (e6 = e(absoluteGravity)) != null) {
                q(e6);
                return;
            }
            return;
        }
        View e9 = e(absoluteGravity);
        if (e9 != null) {
            b(e9);
        }
    }

    public void setDrawerElevation(float f6) {
        this.f4869u = f6;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (o(childAt)) {
                float f9 = this.f4869u;
                WeakHashMap weakHashMap = X.f2240a;
                L.s(childAt, f9);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(c cVar) {
        ArrayList arrayList;
        c cVar2 = this.f4857L;
        if (cVar2 != null && (arrayList = this.f4858M) != null) {
            arrayList.remove(cVar2);
        }
        if (cVar != null) {
            if (this.f4858M == null) {
                this.f4858M = new ArrayList();
            }
            this.f4858M.add(cVar);
        }
        this.f4857L = cVar;
    }

    public void setDrawerLockMode(int i) {
        s(i, 3);
        s(i, 5);
    }

    public void setScrimColor(int i) {
        this.f4871w = i;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f4861P = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.f4861P = new ColorDrawable(i);
        invalidate();
    }

    public final void t(View view, float f6) {
        d dVar = (d) view.getLayoutParams();
        if (f6 == dVar.f4284b) {
            return;
        }
        dVar.f4284b = f6;
        ArrayList arrayList = this.f4858M;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C4545d c4545d = (C4545d) ((c) this.f4858M.get(size));
                c4545d.getClass();
                c4545d.a(Math.min(1.0f, Math.max(0.0f, f6)));
            }
        }
    }

    public final void u(View view) {
        P.f fVar = P.f.f2666l;
        X.l(fVar.a(), view);
        X.i(0, view);
        if (!n(view) || i(view) == 2) {
            return;
        }
        X.m(view, fVar, this.f4867V);
    }

    public final void v(View view, boolean z8) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((z8 || o(childAt)) && !(z8 && childAt == view)) {
                WeakHashMap weakHashMap = X.f2240a;
                childAt.setImportantForAccessibility(4);
            } else {
                WeakHashMap weakHashMap2 = X.f2240a;
                childAt.setImportantForAccessibility(1);
            }
        }
    }

    public void setStatusBarBackground(int i) {
        this.f4861P = i != 0 ? E.a.b(getContext(), i) : null;
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        d dVar = new d(context, attributeSet);
        dVar.f4283a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f4843n0);
        dVar.f4283a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        return dVar;
    }
}
