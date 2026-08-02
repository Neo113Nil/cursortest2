package androidx.drawerlayout.widget;

import O.A0;
import O.L;
import O.X;
import U.h;
import W.e;
import Z.a;
import a0.ViewOnApplyWindowInsetsListenerC0427a;
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
import com.IceFishing.LiveIceFishing.C5248R;
import com.anythink.basead.exoplayer.k.p;
import h.C4548d;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class DrawerLayout extends ViewGroup {

    /* renamed from: W, reason: collision with root package name */
    public static final int[] f4695W = {R.attr.colorPrimaryDark};

    /* renamed from: i0, reason: collision with root package name */
    public static final int[] f4696i0 = {R.attr.layout_gravity};

    /* renamed from: j0, reason: collision with root package name */
    public static final boolean f4697j0;

    /* renamed from: k0, reason: collision with root package name */
    public static final boolean f4698k0;

    /* renamed from: l0, reason: collision with root package name */
    public static final boolean f4699l0;

    /* renamed from: A, reason: collision with root package name */
    public final e f4700A;

    /* renamed from: B, reason: collision with root package name */
    public final f f4701B;

    /* renamed from: C, reason: collision with root package name */
    public final f f4702C;

    /* renamed from: D, reason: collision with root package name */
    public int f4703D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f4704E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f4705F;

    /* renamed from: G, reason: collision with root package name */
    public int f4706G;

    /* renamed from: H, reason: collision with root package name */
    public int f4707H;

    /* renamed from: I, reason: collision with root package name */
    public int f4708I;
    public int J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f4709K;

    /* renamed from: L, reason: collision with root package name */
    public c f4710L;

    /* renamed from: M, reason: collision with root package name */
    public ArrayList f4711M;

    /* renamed from: N, reason: collision with root package name */
    public float f4712N;

    /* renamed from: O, reason: collision with root package name */
    public float f4713O;

    /* renamed from: P, reason: collision with root package name */
    public Drawable f4714P;

    /* renamed from: Q, reason: collision with root package name */
    public WindowInsets f4715Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f4716R;

    /* renamed from: S, reason: collision with root package name */
    public final ArrayList f4717S;

    /* renamed from: T, reason: collision with root package name */
    public Rect f4718T;

    /* renamed from: U, reason: collision with root package name */
    public Matrix f4719U;

    /* renamed from: V, reason: collision with root package name */
    public final n4.c f4720V;

    /* renamed from: n, reason: collision with root package name */
    public final h f4721n;

    /* renamed from: u, reason: collision with root package name */
    public float f4722u;

    /* renamed from: v, reason: collision with root package name */
    public final int f4723v;

    /* renamed from: w, reason: collision with root package name */
    public int f4724w;

    /* renamed from: x, reason: collision with root package name */
    public float f4725x;

    /* renamed from: y, reason: collision with root package name */
    public final Paint f4726y;

    /* renamed from: z, reason: collision with root package name */
    public final e f4727z;

    static {
        int i = Build.VERSION.SDK_INT;
        f4697j0 = true;
        f4698k0 = true;
        f4699l0 = i >= 29;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C5248R.attr.drawerLayoutStyle);
        this.f4721n = new h(1);
        this.f4724w = -1728053248;
        this.f4726y = new Paint();
        this.f4705F = true;
        this.f4706G = 3;
        this.f4707H = 3;
        this.f4708I = 3;
        this.J = 3;
        this.f4720V = new n4.c(17, this);
        setDescendantFocusability(262144);
        float f2 = getResources().getDisplayMetrics().density;
        this.f4723v = (int) ((64.0f * f2) + 0.5f);
        float f9 = f2 * 400.0f;
        f fVar = new f(this, 3);
        this.f4701B = fVar;
        f fVar2 = new f(this, 5);
        this.f4702C = fVar2;
        e eVar = new e(getContext(), this, fVar);
        eVar.f3510b = (int) (eVar.f3510b * 1.0f);
        this.f4727z = eVar;
        eVar.f3524q = 1;
        eVar.f3521n = f9;
        fVar.f4221b = eVar;
        e eVar2 = new e(getContext(), this, fVar2);
        eVar2.f3510b = (int) (1.0f * eVar2.f3510b);
        this.f4700A = eVar2;
        eVar2.f3524q = 2;
        eVar2.f3521n = f9;
        fVar2.f4221b = eVar2;
        setFocusableInTouchMode(true);
        WeakHashMap weakHashMap = X.f2142a;
        setImportantForAccessibility(1);
        X.o(this, new b(this));
        setMotionEventSplittingEnabled(false);
        if (getFitsSystemWindows()) {
            setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC0427a());
            setSystemUiVisibility(1280);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f4695W);
            try {
                this.f4714P = obtainStyledAttributes.getDrawable(0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, a.f3926a, C5248R.attr.drawerLayoutStyle, 0);
        try {
            if (obtainStyledAttributes2.hasValue(0)) {
                this.f4722u = obtainStyledAttributes2.getDimension(0, 0.0f);
            } else {
                this.f4722u = getResources().getDimension(C5248R.dimen.def_drawer_elevation);
            }
            obtainStyledAttributes2.recycle();
            this.f4717S = new ArrayList();
        } catch (Throwable th) {
            obtainStyledAttributes2.recycle();
            throw th;
        }
    }

    public static String k(int i) {
        return (i & 3) == 3 ? "LEFT" : (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    public static boolean l(View view) {
        WeakHashMap weakHashMap = X.f2142a;
        return (view.getImportantForAccessibility() == 4 || view.getImportantForAccessibility() == 2) ? false : true;
    }

    public static boolean m(View view) {
        return ((d) view.getLayoutParams()).f4211a == 0;
    }

    public static boolean n(View view) {
        if (o(view)) {
            return (((d) view.getLayoutParams()).f4214d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public static boolean o(View view) {
        int i = ((d) view.getLayoutParams()).f4211a;
        WeakHashMap weakHashMap = X.f2142a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i, view.getLayoutDirection());
        return ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) ? false : true;
    }

    public static boolean p(View view) {
        if (o(view)) {
            return ((d) view.getLayoutParams()).f4212b > 0.0f;
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
        int i6 = 0;
        boolean z6 = false;
        while (true) {
            arrayList2 = this.f4717S;
            if (i6 >= childCount) {
                break;
            }
            View childAt = getChildAt(i6);
            if (!o(childAt)) {
                arrayList2.add(childAt);
            } else if (n(childAt)) {
                childAt.addFocusables(arrayList, i, i4);
                z6 = true;
            }
            i6++;
        }
        if (!z6) {
            int size = arrayList2.size();
            for (int i9 = 0; i9 < size; i9++) {
                View view = (View) arrayList2.get(i9);
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
            WeakHashMap weakHashMap = X.f2142a;
            view.setImportantForAccessibility(4);
        } else {
            WeakHashMap weakHashMap2 = X.f2142a;
            view.setImportantForAccessibility(1);
        }
        if (f4697j0) {
            return;
        }
        X.o(view, this.f4721n);
    }

    public final void b(View view) {
        if (!o(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        d dVar = (d) view.getLayoutParams();
        if (this.f4705F) {
            dVar.f4212b = 0.0f;
            dVar.f4214d = 0;
        } else {
            dVar.f4214d |= 4;
            if (a(3, view)) {
                this.f4727z.s(-view.getWidth(), view.getTop(), view);
            } else {
                this.f4700A.s(getWidth(), view.getTop(), view);
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
        float f2 = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f2 = Math.max(f2, ((d) getChildAt(i).getLayoutParams()).f4212b);
        }
        this.f4725x = f2;
        boolean g9 = this.f4727z.g();
        boolean g10 = this.f4700A.g();
        if (g9 || g10) {
            WeakHashMap weakHashMap = X.f2142a;
            postInvalidateOnAnimation();
        }
    }

    public final void d(boolean z6) {
        int childCount = getChildCount();
        boolean z9 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            d dVar = (d) childAt.getLayoutParams();
            if (o(childAt) && (!z6 || dVar.f4213c)) {
                z9 |= a(3, childAt) ? this.f4727z.s(-childAt.getWidth(), childAt.getTop(), childAt) : this.f4700A.s(getWidth(), childAt.getTop(), childAt);
                dVar.f4213c = false;
            }
        }
        f fVar = this.f4701B;
        fVar.f4223d.removeCallbacks(fVar.f4222c);
        f fVar2 = this.f4702C;
        fVar2.f4223d.removeCallbacks(fVar2.f4222c);
        if (z9) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean dispatchGenericMotionEvent;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f4725x <= 0.0f) {
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
            if (this.f4718T == null) {
                this.f4718T = new Rect();
            }
            childAt.getHitRect(this.f4718T);
            if (this.f4718T.contains((int) x9, (int) y7) && !m(childAt)) {
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
                        if (this.f4719U == null) {
                            this.f4719U = new Matrix();
                        }
                        matrix.invert(this.f4719U);
                        obtain.transform(this.f4719U);
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
        boolean m9 = m(view);
        int width = getWidth();
        int save = canvas.save();
        int i = 0;
        if (m9) {
            int childCount = getChildCount();
            int i4 = 0;
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
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
        boolean drawChild = super.drawChild(canvas, view, j6);
        canvas.restoreToCount(save);
        float f2 = this.f4725x;
        if (f2 > 0.0f && m9) {
            int i9 = this.f4724w;
            Paint paint = this.f4726y;
            paint.setColor((((int) ((((-16777216) & i9) >>> 24) * f2)) << 24) | (i9 & 16777215));
            canvas.drawRect(i, 0.0f, width, getHeight(), paint);
        }
        return drawChild;
    }

    public final View e(int i) {
        WeakHashMap weakHashMap = X.f2142a;
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
            if ((((d) childAt.getLayoutParams()).f4214d & 1) == 1) {
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
        dVar.f4211a = 0;
        return dVar;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof d) {
            d dVar = (d) layoutParams;
            d dVar2 = new d(dVar);
            dVar2.f4211a = 0;
            dVar2.f4211a = dVar.f4211a;
            return dVar2;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            d dVar3 = new d((ViewGroup.MarginLayoutParams) layoutParams);
            dVar3.f4211a = 0;
            return dVar3;
        }
        d dVar4 = new d(layoutParams);
        dVar4.f4211a = 0;
        return dVar4;
    }

    public float getDrawerElevation() {
        if (f4698k0) {
            return this.f4722u;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f4714P;
    }

    public final int h(int i) {
        WeakHashMap weakHashMap = X.f2142a;
        int layoutDirection = getLayoutDirection();
        if (i == 3) {
            int i4 = this.f4706G;
            if (i4 != 3) {
                return i4;
            }
            int i6 = layoutDirection == 0 ? this.f4708I : this.J;
            if (i6 != 3) {
                return i6;
            }
            return 0;
        }
        if (i == 5) {
            int i9 = this.f4707H;
            if (i9 != 3) {
                return i9;
            }
            int i10 = layoutDirection == 0 ? this.J : this.f4708I;
            if (i10 != 3) {
                return i10;
            }
            return 0;
        }
        if (i == 8388611) {
            int i11 = this.f4708I;
            if (i11 != 3) {
                return i11;
            }
            int i12 = layoutDirection == 0 ? this.f4706G : this.f4707H;
            if (i12 != 3) {
                return i12;
            }
            return 0;
        }
        if (i != 8388613) {
            return 0;
        }
        int i13 = this.J;
        if (i13 != 3) {
            return i13;
        }
        int i14 = layoutDirection == 0 ? this.f4707H : this.f4706G;
        if (i14 != 3) {
            return i14;
        }
        return 0;
    }

    public final int i(View view) {
        if (o(view)) {
            return h(((d) view.getLayoutParams()).f4211a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public final int j(View view) {
        int i = ((d) view.getLayoutParams()).f4211a;
        WeakHashMap weakHashMap = X.f2142a;
        return Gravity.getAbsoluteGravity(i, getLayoutDirection());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4705F = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f4705F = true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f4716R || this.f4714P == null) {
            return;
        }
        WindowInsets windowInsets = this.f4715Q;
        int systemWindowInsetTop = windowInsets != null ? windowInsets.getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.f4714P.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.f4714P.draw(canvas);
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
        boolean z6;
        View h3;
        int actionMasked = motionEvent.getActionMasked();
        e eVar = this.f4727z;
        boolean r9 = eVar.r(motionEvent) | this.f4700A.r(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int length = eVar.f3512d.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        if ((eVar.f3518k & (1 << i)) != 0) {
                            float f2 = eVar.f3514f[i] - eVar.f3512d[i];
                            float f9 = eVar.f3515g[i] - eVar.f3513e[i];
                            float f10 = (f9 * f9) + (f2 * f2);
                            int i4 = eVar.f3510b;
                            if (f10 > i4 * i4) {
                                f fVar = this.f4701B;
                                fVar.f4223d.removeCallbacks(fVar.f4222c);
                                f fVar2 = this.f4702C;
                                fVar2.f4223d.removeCallbacks(fVar2.f4222c);
                                break;
                            }
                        }
                        i++;
                    }
                }
                z6 = false;
            }
            d(true);
            this.f4709K = false;
            z6 = false;
        } else {
            float x9 = motionEvent.getX();
            float y7 = motionEvent.getY();
            this.f4712N = x9;
            this.f4713O = y7;
            z6 = this.f4725x > 0.0f && (h3 = eVar.h((int) x9, (int) y7)) != null && m(h3);
            this.f4709K = false;
        }
        if (!r9 && !z6) {
            int childCount = getChildCount();
            int i6 = 0;
            while (true) {
                if (i6 >= childCount) {
                    if (this.f4709K) {
                        break;
                    }
                    return false;
                }
                if (((d) getChildAt(i6).getLayoutParams()).f4213c) {
                    break;
                }
                i6++;
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
    public final void onLayout(boolean z6, int i, int i4, int i6, int i9) {
        WindowInsets rootWindowInsets;
        float f2;
        int i10;
        boolean z9 = true;
        this.f4704E = true;
        int i11 = i6 - i;
        int childCount = getChildCount();
        int i12 = 0;
        while (i12 < childCount) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (m(childAt)) {
                    int i13 = ((ViewGroup.MarginLayoutParams) dVar).leftMargin;
                    childAt.layout(i13, ((ViewGroup.MarginLayoutParams) dVar).topMargin, childAt.getMeasuredWidth() + i13, childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) dVar).topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a(3, childAt)) {
                        float f9 = measuredWidth;
                        i10 = (-measuredWidth) + ((int) (dVar.f4212b * f9));
                        f2 = (measuredWidth + i10) / f9;
                    } else {
                        float f10 = measuredWidth;
                        f2 = (i11 - r11) / f10;
                        i10 = i11 - ((int) (dVar.f4212b * f10));
                    }
                    boolean z10 = f2 != dVar.f4212b ? z9 : false;
                    int i14 = dVar.f4211a & 112;
                    if (i14 == 16) {
                        int i15 = i9 - i4;
                        int i16 = (i15 - measuredHeight) / 2;
                        int i17 = ((ViewGroup.MarginLayoutParams) dVar).topMargin;
                        if (i16 < i17) {
                            i16 = i17;
                        } else {
                            int i18 = i16 + measuredHeight;
                            int i19 = i15 - ((ViewGroup.MarginLayoutParams) dVar).bottomMargin;
                            if (i18 > i19) {
                                i16 = i19 - measuredHeight;
                            }
                        }
                        childAt.layout(i10, i16, measuredWidth + i10, measuredHeight + i16);
                    } else if (i14 != 80) {
                        int i20 = ((ViewGroup.MarginLayoutParams) dVar).topMargin;
                        childAt.layout(i10, i20, measuredWidth + i10, measuredHeight + i20);
                    } else {
                        int i21 = i9 - i4;
                        childAt.layout(i10, (i21 - ((ViewGroup.MarginLayoutParams) dVar).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i10, i21 - ((ViewGroup.MarginLayoutParams) dVar).bottomMargin);
                    }
                    if (z10) {
                        t(childAt, f2);
                    }
                    int i22 = dVar.f4212b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i22) {
                        childAt.setVisibility(i22);
                    }
                }
            }
            i12++;
            z9 = true;
        }
        if (f4699l0 && (rootWindowInsets = getRootWindowInsets()) != null) {
            G.e i23 = A0.h(null, rootWindowInsets).f2115a.i();
            e eVar = this.f4727z;
            eVar.f3522o = Math.max(eVar.f3523p, i23.f1031a);
            e eVar2 = this.f4700A;
            eVar2.f3522o = Math.max(eVar2.f3523p, i23.f1033c);
        }
        this.f4704E = false;
        this.f4705F = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0048  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i4) {
        boolean z6;
        int childCount;
        int i6;
        int i9;
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
        int i10 = 0;
        if (this.f4715Q != null) {
            WeakHashMap weakHashMap = X.f2142a;
            if (getFitsSystemWindows()) {
                z6 = true;
                WeakHashMap weakHashMap2 = X.f2142a;
                int layoutDirection = getLayoutDirection();
                childCount = getChildCount();
                i6 = 0;
                int i11 = 0;
                int i12 = 0;
                while (i6 < childCount) {
                    View childAt = getChildAt(i6);
                    if (childAt.getVisibility() != 8) {
                        d dVar = (d) childAt.getLayoutParams();
                        if (z6) {
                            int absoluteGravity = Gravity.getAbsoluteGravity(dVar.f4211a, layoutDirection);
                            i9 = 1;
                            if (childAt.getFitsSystemWindows()) {
                                WindowInsets windowInsets = this.f4715Q;
                                if (absoluteGravity == 3) {
                                    windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), i10, windowInsets.getSystemWindowInsetBottom());
                                } else if (absoluteGravity == 5) {
                                    windowInsets = windowInsets.replaceSystemWindowInsets(i10, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                                }
                                childAt.dispatchApplyWindowInsets(windowInsets);
                            } else {
                                WindowInsets windowInsets2 = this.f4715Q;
                                if (absoluteGravity == 3) {
                                    windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), i10, windowInsets2.getSystemWindowInsetBottom());
                                } else if (absoluteGravity == 5) {
                                    windowInsets2 = windowInsets2.replaceSystemWindowInsets(i10, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                                }
                                ((ViewGroup.MarginLayoutParams) dVar).leftMargin = windowInsets2.getSystemWindowInsetLeft();
                                ((ViewGroup.MarginLayoutParams) dVar).topMargin = windowInsets2.getSystemWindowInsetTop();
                                ((ViewGroup.MarginLayoutParams) dVar).rightMargin = windowInsets2.getSystemWindowInsetRight();
                                ((ViewGroup.MarginLayoutParams) dVar).bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                            }
                        } else {
                            i9 = 1;
                        }
                        if (m(childAt)) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) dVar).leftMargin) - ((ViewGroup.MarginLayoutParams) dVar).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) dVar).topMargin) - ((ViewGroup.MarginLayoutParams) dVar).bottomMargin, 1073741824));
                        } else {
                            if (!o(childAt)) {
                                throw new IllegalStateException("Child " + childAt + " at index " + i6 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                            }
                            if (f4698k0) {
                                float i13 = L.i(childAt);
                                float f2 = this.f4722u;
                                if (i13 != f2) {
                                    L.s(childAt, f2);
                                }
                            }
                            int j6 = j(childAt) & 7;
                            int i14 = j6 == 3 ? i9 : i10;
                            if ((i14 != 0 && i11 != 0) || (i14 == 0 && i12 != 0)) {
                                throw new IllegalStateException("Child drawer has absolute gravity " + k(j6) + " but this DrawerLayout already has a drawer view along that edge");
                            }
                            if (i14 != 0) {
                                i11 = i9;
                            } else {
                                i12 = i9;
                            }
                            childAt.measure(ViewGroup.getChildMeasureSpec(i, this.f4723v + ((ViewGroup.MarginLayoutParams) dVar).leftMargin + ((ViewGroup.MarginLayoutParams) dVar).rightMargin, ((ViewGroup.MarginLayoutParams) dVar).width), ViewGroup.getChildMeasureSpec(i4, ((ViewGroup.MarginLayoutParams) dVar).topMargin + ((ViewGroup.MarginLayoutParams) dVar).bottomMargin, ((ViewGroup.MarginLayoutParams) dVar).height));
                            i6++;
                            i10 = 0;
                        }
                    }
                    i6++;
                    i10 = 0;
                }
            }
        }
        z6 = false;
        WeakHashMap weakHashMap22 = X.f2142a;
        int layoutDirection2 = getLayoutDirection();
        childCount = getChildCount();
        i6 = 0;
        int i112 = 0;
        int i122 = 0;
        while (i6 < childCount) {
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
        super.onRestoreInstanceState(eVar.f3390n);
        int i = eVar.f4215v;
        if (i != 0 && (e9 = e(i)) != null) {
            q(e9);
        }
        int i4 = eVar.f4216w;
        if (i4 != 3) {
            s(i4, 3);
        }
        int i6 = eVar.f4217x;
        if (i6 != 3) {
            s(i6, 5);
        }
        int i9 = eVar.f4218y;
        if (i9 != 3) {
            s(i9, 8388611);
        }
        int i10 = eVar.f4219z;
        if (i10 != 3) {
            s(i10, 8388613);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        if (f4698k0) {
            return;
        }
        WeakHashMap weakHashMap = X.f2142a;
        getLayoutDirection();
        getLayoutDirection();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        a0.e eVar = new a0.e(super.onSaveInstanceState());
        eVar.f4215v = 0;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            d dVar = (d) getChildAt(i).getLayoutParams();
            int i4 = dVar.f4214d;
            boolean z6 = i4 == 1;
            boolean z9 = i4 == 2;
            if (z6 || z9) {
                eVar.f4215v = dVar.f4211a;
                break;
            }
        }
        eVar.f4216w = this.f4706G;
        eVar.f4217x = this.f4707H;
        eVar.f4218y = this.f4708I;
        eVar.f4219z = this.J;
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
        e eVar = this.f4727z;
        eVar.k(motionEvent);
        this.f4700A.k(motionEvent);
        int action = motionEvent.getAction() & p.f9259b;
        boolean z6 = false;
        if (action == 0) {
            float x9 = motionEvent.getX();
            float y7 = motionEvent.getY();
            this.f4712N = x9;
            this.f4713O = y7;
            this.f4709K = false;
            return true;
        }
        if (action != 1) {
            if (action != 3) {
                return true;
            }
            d(true);
            this.f4709K = false;
            return true;
        }
        float x10 = motionEvent.getX();
        float y9 = motionEvent.getY();
        View h3 = eVar.h((int) x10, (int) y9);
        if (h3 != null && m(h3)) {
            float f2 = x10 - this.f4712N;
            float f9 = y9 - this.f4713O;
            int i = eVar.f3510b;
            if ((f9 * f9) + (f2 * f2) < i * i) {
                View f10 = f();
                if (f10 != null) {
                }
            }
        }
        z6 = true;
        d(z6);
        return true;
    }

    public final void q(View view) {
        if (!o(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        d dVar = (d) view.getLayoutParams();
        if (this.f4705F) {
            dVar.f4212b = 1.0f;
            dVar.f4214d = 1;
            v(view, true);
            u(view);
        } else {
            dVar.f4214d |= 2;
            if (a(3, view)) {
                this.f4727z.s(0, view.getTop(), view);
            } else {
                this.f4700A.s(getWidth() - view.getWidth(), view.getTop(), view);
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
    public final void requestDisallowInterceptTouchEvent(boolean z6) {
        super.requestDisallowInterceptTouchEvent(z6);
        if (z6) {
            d(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f4704E) {
            return;
        }
        super.requestLayout();
    }

    public final void s(int i, int i4) {
        View e9;
        WeakHashMap weakHashMap = X.f2142a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, getLayoutDirection());
        if (i4 == 3) {
            this.f4706G = i;
        } else if (i4 == 5) {
            this.f4707H = i;
        } else if (i4 == 8388611) {
            this.f4708I = i;
        } else if (i4 == 8388613) {
            this.J = i;
        }
        if (i != 0) {
            (absoluteGravity == 3 ? this.f4727z : this.f4700A).a();
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

    public void setDrawerElevation(float f2) {
        this.f4722u = f2;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (o(childAt)) {
                float f9 = this.f4722u;
                WeakHashMap weakHashMap = X.f2142a;
                L.s(childAt, f9);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(c cVar) {
        ArrayList arrayList;
        c cVar2 = this.f4710L;
        if (cVar2 != null && (arrayList = this.f4711M) != null) {
            arrayList.remove(cVar2);
        }
        if (cVar != null) {
            if (this.f4711M == null) {
                this.f4711M = new ArrayList();
            }
            this.f4711M.add(cVar);
        }
        this.f4710L = cVar;
    }

    public void setDrawerLockMode(int i) {
        s(i, 3);
        s(i, 5);
    }

    public void setScrimColor(int i) {
        this.f4724w = i;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f4714P = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.f4714P = new ColorDrawable(i);
        invalidate();
    }

    public final void t(View view, float f2) {
        d dVar = (d) view.getLayoutParams();
        if (f2 == dVar.f4212b) {
            return;
        }
        dVar.f4212b = f2;
        ArrayList arrayList = this.f4711M;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C4548d c4548d = (C4548d) ((c) this.f4711M.get(size));
                c4548d.getClass();
                c4548d.a(Math.min(1.0f, Math.max(0.0f, f2)));
            }
        }
    }

    public final void u(View view) {
        P.f fVar = P.f.f2331l;
        X.l(fVar.a(), view);
        X.i(0, view);
        if (!n(view) || i(view) == 2) {
            return;
        }
        X.m(view, fVar, this.f4720V);
    }

    public final void v(View view, boolean z6) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((z6 || o(childAt)) && !(z6 && childAt == view)) {
                WeakHashMap weakHashMap = X.f2142a;
                childAt.setImportantForAccessibility(4);
            } else {
                WeakHashMap weakHashMap2 = X.f2142a;
                childAt.setImportantForAccessibility(1);
            }
        }
    }

    public void setStatusBarBackground(int i) {
        this.f4714P = i != 0 ? E.a.b(getContext(), i) : null;
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        d dVar = new d(context, attributeSet);
        dVar.f4211a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f4696i0);
        dVar.f4211a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        return dVar;
    }
}
