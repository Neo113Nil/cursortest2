package androidx.coordinatorlayout.widget;

import A.a;
import B.b;
import B.c;
import B.e;
import B.f;
import B.h;
import B.i;
import B.j;
import N.d;
import O.A0;
import O.C0344t;
import O.InterfaceC0343s;
import O.J;
import O.L;
import O.X;
import O.r;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.icefishing.icefishingbigwin.C5275R;
import g1.C4523c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.WeakHashMap;
import s.k;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements r, InterfaceC0343s {

    /* renamed from: M, reason: collision with root package name */
    public static final String f4659M;

    /* renamed from: N, reason: collision with root package name */
    public static final Class[] f4660N;

    /* renamed from: O, reason: collision with root package name */
    public static final ThreadLocal f4661O;

    /* renamed from: P, reason: collision with root package name */
    public static final i f4662P;

    /* renamed from: Q, reason: collision with root package name */
    public static final d f4663Q;

    /* renamed from: A, reason: collision with root package name */
    public boolean f4664A;

    /* renamed from: B, reason: collision with root package name */
    public final int[] f4665B;

    /* renamed from: C, reason: collision with root package name */
    public View f4666C;

    /* renamed from: D, reason: collision with root package name */
    public View f4667D;

    /* renamed from: E, reason: collision with root package name */
    public f f4668E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f4669F;

    /* renamed from: G, reason: collision with root package name */
    public A0 f4670G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f4671H;

    /* renamed from: I, reason: collision with root package name */
    public Drawable f4672I;
    public ViewGroup.OnHierarchyChangeListener J;

    /* renamed from: K, reason: collision with root package name */
    public C4523c f4673K;

    /* renamed from: L, reason: collision with root package name */
    public final C0344t f4674L;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f4675n;

    /* renamed from: u, reason: collision with root package name */
    public final S0.i f4676u;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f4677v;

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList f4678w;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f4679x;

    /* renamed from: y, reason: collision with root package name */
    public final int[] f4680y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f4681z;

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        f4659M = r02 != null ? r02.getName() : null;
        f4662P = new i(0);
        f4660N = new Class[]{Context.class, AttributeSet.class};
        f4661O = new ThreadLocal();
        f4663Q = new d(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C5275R.attr.coordinatorLayoutStyle);
        this.f4675n = new ArrayList();
        this.f4676u = new S0.i();
        this.f4677v = new ArrayList();
        this.f4678w = new ArrayList();
        this.f4679x = new int[2];
        this.f4680y = new int[2];
        this.f4674L = new C0344t();
        int[] iArr = a.f4a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, C5275R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, C5275R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f4665B = intArray;
            float f3 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i = 0; i < length; i++) {
                this.f4665B[i] = (int) (r2[i] * f3);
            }
        }
        this.f4672I = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        w();
        super.setOnHierarchyChangeListener(new B.d(this));
        WeakHashMap weakHashMap = X.f2054a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static Rect g() {
        Rect rect = (Rect) f4663Q.a();
        return rect == null ? new Rect() : rect;
    }

    public static void l(int i, Rect rect, Rect rect2, e eVar, int i6, int i9) {
        int i10 = eVar.f73c;
        if (i10 == 0) {
            i10 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, i);
        int i11 = eVar.f74d;
        if ((i11 & 7) == 0) {
            i11 |= 8388611;
        }
        if ((i11 & 112) == 0) {
            i11 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i11, i);
        int i12 = absoluteGravity & 7;
        int i13 = absoluteGravity & 112;
        int i14 = absoluteGravity2 & 7;
        int i15 = absoluteGravity2 & 112;
        int width = i14 != 1 ? i14 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i15 != 16 ? i15 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i12 == 1) {
            width -= i6 / 2;
        } else if (i12 != 5) {
            width -= i6;
        }
        if (i13 == 16) {
            height -= i9 / 2;
        } else if (i13 != 80) {
            height -= i9;
        }
        rect2.set(width, height, i6 + width, i9 + height);
    }

    public static e n(View view) {
        e eVar = (e) view.getLayoutParams();
        if (!eVar.f72b) {
            c cVar = null;
            for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                cVar = (c) cls.getAnnotation(c.class);
                if (cVar != null) {
                    break;
                }
            }
            if (cVar != null) {
                try {
                    b bVar = (b) cVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    b bVar2 = eVar.f71a;
                    if (bVar2 != bVar) {
                        if (bVar2 != null) {
                            bVar2.e();
                        }
                        eVar.f71a = bVar;
                        eVar.f72b = true;
                        if (bVar != null) {
                            bVar.c(eVar);
                        }
                    }
                } catch (Exception e9) {
                    Log.e("CoordinatorLayout", "Default behavior class " + cVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e9);
                }
            }
            eVar.f72b = true;
        }
        return eVar;
    }

    public static void u(int i, View view) {
        e eVar = (e) view.getLayoutParams();
        int i6 = eVar.i;
        if (i6 != i) {
            WeakHashMap weakHashMap = X.f2054a;
            view.offsetLeftAndRight(i - i6);
            eVar.i = i;
        }
    }

    public static void v(int i, View view) {
        e eVar = (e) view.getLayoutParams();
        int i6 = eVar.f79j;
        if (i6 != i) {
            WeakHashMap weakHashMap = X.f2054a;
            view.offsetTopAndBottom(i - i6);
            eVar.f79j = i;
        }
    }

    @Override // O.r
    public final void a(int i, View view) {
        C0344t c0344t = this.f4674L;
        if (i == 1) {
            c0344t.f2134b = 0;
        } else {
            c0344t.f2133a = 0;
        }
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            e eVar = (e) childAt.getLayoutParams();
            if (eVar.a(i)) {
                b bVar = eVar.f71a;
                if (bVar != null) {
                    bVar.p(childAt, view, i);
                }
                if (i == 0) {
                    eVar.f82m = false;
                } else if (i == 1) {
                    eVar.f83n = false;
                }
            }
        }
        this.f4667D = null;
    }

    @Override // O.InterfaceC0343s
    public final void b(View view, int i, int i6, int i9, int i10, int i11, int[] iArr) {
        b bVar;
        int childCount = getChildCount();
        int i12 = 0;
        int i13 = 0;
        boolean z3 = false;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(i11) && (bVar = eVar.f71a) != null) {
                    int[] iArr2 = this.f4679x;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    bVar.k(this, childAt, i6, i9, i10, iArr2);
                    i12 = i9 > 0 ? Math.max(i12, iArr2[0]) : Math.min(i12, iArr2[0]);
                    i13 = i10 > 0 ? Math.max(i13, iArr2[1]) : Math.min(i13, iArr2[1]);
                    z3 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i12;
        iArr[1] = iArr[1] + i13;
        if (z3) {
            p(1);
        }
    }

    @Override // O.r
    public final void c(View view, int i, int i6, int i9, int i10, int i11) {
        b(view, i, i6, i9, i10, 0, this.f4680y);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof e) && super.checkLayoutParams(layoutParams);
    }

    @Override // O.r
    public final boolean d(View view, View view2, int i, int i6) {
        int childCount = getChildCount();
        boolean z3 = false;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                b bVar = eVar.f71a;
                if (bVar != null) {
                    boolean o6 = bVar.o(i, i6, childAt);
                    z3 |= o6;
                    if (i6 == 0) {
                        eVar.f82m = o6;
                    } else if (i6 == 1) {
                        eVar.f83n = o6;
                    }
                } else if (i6 == 0) {
                    eVar.f82m = false;
                } else if (i6 == 1) {
                    eVar.f83n = false;
                }
            }
        }
        return z3;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j6) {
        b bVar = ((e) view.getLayoutParams()).f71a;
        if (bVar != null) {
            bVar.getClass();
        }
        return super.drawChild(canvas, view, j6);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f4672I;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // O.r
    public final void e(View view, View view2, int i, int i6) {
        C0344t c0344t = this.f4674L;
        if (i6 == 1) {
            c0344t.f2134b = i;
        } else {
            c0344t.f2133a = i;
        }
        this.f4667D = view2;
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            ((e) getChildAt(i9).getLayoutParams()).getClass();
        }
    }

    @Override // O.r
    public final void f(View view, int i, int i6, int[] iArr, int i9) {
        b bVar;
        int childCount = getChildCount();
        boolean z3 = false;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(i9) && (bVar = eVar.f71a) != null) {
                    int[] iArr2 = this.f4679x;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    bVar.j(this, childAt, view, i, i6, iArr2, i9);
                    i10 = i > 0 ? Math.max(i10, iArr2[0]) : Math.min(i10, iArr2[0]);
                    i11 = i6 > 0 ? Math.max(i11, iArr2[1]) : Math.min(i11, iArr2[1]);
                    z3 = true;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
        if (z3) {
            p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        s();
        return Collections.unmodifiableList(this.f4675n);
    }

    public final A0 getLastWindowInsets() {
        return this.f4670G;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0344t c0344t = this.f4674L;
        return c0344t.f2134b | c0344t.f2133a;
    }

    public Drawable getStatusBarBackground() {
        return this.f4672I;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void h(e eVar, Rect rect, int i, int i6) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i6) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin));
        rect.set(max, max2, i + max, i6 + max2);
    }

    public final void i(View view, Rect rect, boolean z3) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z3) {
            k(rect, view);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final ArrayList j(View view) {
        k kVar = (k) this.f4676u.f2789v;
        int i = kVar.f40440v;
        ArrayList arrayList = null;
        for (int i6 = 0; i6 < i; i6++) {
            ArrayList arrayList2 = (ArrayList) kVar.l(i6);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(kVar.h(i6));
            }
        }
        ArrayList arrayList3 = this.f4678w;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void k(Rect rect, View view) {
        ThreadLocal threadLocal = j.f90a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = j.f90a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        j.a(this, view, matrix);
        ThreadLocal threadLocal3 = j.f91b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final int m(int i) {
        int[] iArr = this.f4665B;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        }
        if (i >= 0 && i < iArr.length) {
            return iArr[i];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
        return 0;
    }

    public final boolean o(int i, int i6, View view) {
        d dVar = f4663Q;
        Rect g4 = g();
        k(g4, view);
        try {
            return g4.contains(i, i6);
        } finally {
            g4.setEmpty();
            dVar.c(g4);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t(false);
        if (this.f4669F) {
            if (this.f4668E == null) {
                this.f4668E = new f(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f4668E);
        }
        if (this.f4670G == null) {
            WeakHashMap weakHashMap = X.f2054a;
            if (getFitsSystemWindows()) {
                J.c(this);
            }
        }
        this.f4664A = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t(false);
        if (this.f4669F && this.f4668E != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f4668E);
        }
        View view = this.f4667D;
        if (view != null) {
            a(0, view);
        }
        this.f4664A = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f4671H || this.f4672I == null) {
            return;
        }
        A0 a02 = this.f4670G;
        int d2 = a02 != null ? a02.d() : 0;
        if (d2 > 0) {
            this.f4672I.setBounds(0, 0, getWidth(), d2);
            this.f4672I.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            t(true);
        }
        boolean r9 = r(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return r9;
        }
        t(true);
        return r9;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i6, int i9, int i10) {
        b bVar;
        WeakHashMap weakHashMap = X.f2054a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.f4675n;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            View view = (View) arrayList.get(i11);
            if (view.getVisibility() != 8 && ((bVar = ((e) view.getLayoutParams()).f71a) == null || !bVar.g(this, view, layoutDirection))) {
                q(layoutDirection, view);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i6) {
        boolean z3;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        b bVar;
        int i15;
        View view;
        ArrayList arrayList;
        int i16;
        int i17;
        int i18;
        boolean z6;
        int i19;
        int i20;
        int i21;
        int max;
        CoordinatorLayout coordinatorLayout = this;
        coordinatorLayout.s();
        int childCount = coordinatorLayout.getChildCount();
        int i22 = 0;
        loop0: while (true) {
            if (i22 >= childCount) {
                z3 = false;
                break;
            }
            View childAt = coordinatorLayout.getChildAt(i22);
            k kVar = (k) coordinatorLayout.f4676u.f2789v;
            int i23 = kVar.f40440v;
            for (int i24 = 0; i24 < i23; i24++) {
                ArrayList arrayList2 = (ArrayList) kVar.l(i24);
                if (arrayList2 != null && arrayList2.contains(childAt)) {
                    z3 = true;
                    break loop0;
                }
            }
            i22++;
        }
        if (z3 != coordinatorLayout.f4669F) {
            if (z3) {
                if (coordinatorLayout.f4664A) {
                    if (coordinatorLayout.f4668E == null) {
                        coordinatorLayout.f4668E = new f(coordinatorLayout);
                    }
                    coordinatorLayout.getViewTreeObserver().addOnPreDrawListener(coordinatorLayout.f4668E);
                }
                coordinatorLayout.f4669F = true;
            } else {
                if (coordinatorLayout.f4664A && coordinatorLayout.f4668E != null) {
                    coordinatorLayout.getViewTreeObserver().removeOnPreDrawListener(coordinatorLayout.f4668E);
                }
                coordinatorLayout.f4669F = false;
            }
        }
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        WeakHashMap weakHashMap = X.f2054a;
        int layoutDirection = coordinatorLayout.getLayoutDirection();
        boolean z9 = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i6);
        int size2 = View.MeasureSpec.getSize(i6);
        int i25 = paddingLeft + paddingRight;
        int i26 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        boolean z10 = coordinatorLayout.f4670G != null && coordinatorLayout.getFitsSystemWindows();
        ArrayList arrayList3 = coordinatorLayout.f4675n;
        int size3 = arrayList3.size();
        int i27 = 0;
        int i28 = 0;
        while (i27 < size3) {
            View view2 = (View) arrayList3.get(i27);
            int i29 = suggestedMinimumWidth;
            if (view2.getVisibility() == 8) {
                arrayList = arrayList3;
                i12 = size3;
                i19 = paddingLeft;
                i17 = paddingRight;
                suggestedMinimumWidth = i29;
                z6 = false;
                i21 = i27;
            } else {
                e eVar = (e) view2.getLayoutParams();
                int i30 = eVar.f75e;
                if (i30 < 0 || mode == 0) {
                    i9 = suggestedMinimumHeight;
                } else {
                    int m4 = coordinatorLayout.m(i30);
                    int i31 = eVar.f73c;
                    if (i31 == 0) {
                        i31 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i31, layoutDirection) & 7;
                    i9 = suggestedMinimumHeight;
                    if ((absoluteGravity == 3 && !z9) || (absoluteGravity == 5 && z9)) {
                        max = Math.max(0, (size - paddingRight) - m4);
                    } else if ((absoluteGravity == 5 && !z9) || (absoluteGravity == 3 && z9)) {
                        max = Math.max(0, m4 - paddingLeft);
                    }
                    int i32 = size3;
                    i11 = max;
                    i10 = i32;
                    if (z10 || view2.getFitsSystemWindows()) {
                        i12 = i10;
                        i13 = i;
                        i14 = i6;
                    } else {
                        i12 = i10;
                        int c9 = coordinatorLayout.f4670G.c() + coordinatorLayout.f4670G.b();
                        int a9 = coordinatorLayout.f4670G.a() + coordinatorLayout.f4670G.d();
                        i13 = View.MeasureSpec.makeMeasureSpec(size - c9, mode);
                        i14 = View.MeasureSpec.makeMeasureSpec(size2 - a9, mode2);
                    }
                    bVar = eVar.f71a;
                    if (bVar == null) {
                        ArrayList arrayList4 = arrayList3;
                        int i33 = i13;
                        arrayList = arrayList4;
                        z6 = false;
                        i17 = paddingRight;
                        i18 = i9;
                        i19 = paddingLeft;
                        i20 = i29;
                        i21 = i27;
                        int i34 = i14;
                        boolean h9 = bVar.h(this, view2, i33, i11, i34);
                        view = view2;
                        i13 = i33;
                        i16 = i11;
                        i15 = i34;
                        if (h9) {
                            coordinatorLayout = this;
                            int max2 = Math.max(i20, view.getMeasuredWidth() + i25 + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
                            int max3 = Math.max(i18, view.getMeasuredHeight() + i26 + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
                            i28 = View.combineMeasuredStates(i28, view.getMeasuredState());
                            suggestedMinimumWidth = max2;
                            suggestedMinimumHeight = max3;
                        }
                    } else {
                        int i35 = i11;
                        i15 = i14;
                        view = view2;
                        arrayList = arrayList3;
                        i16 = i35;
                        i17 = paddingRight;
                        i18 = i9;
                        z6 = false;
                        i19 = paddingLeft;
                        i20 = i29;
                        i21 = i27;
                    }
                    coordinatorLayout = this;
                    coordinatorLayout.measureChildWithMargins(view, i13, i16, i15, 0);
                    int max22 = Math.max(i20, view.getMeasuredWidth() + i25 + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
                    int max32 = Math.max(i18, view.getMeasuredHeight() + i26 + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
                    i28 = View.combineMeasuredStates(i28, view.getMeasuredState());
                    suggestedMinimumWidth = max22;
                    suggestedMinimumHeight = max32;
                }
                i10 = size3;
                i11 = 0;
                if (z10) {
                }
                i12 = i10;
                i13 = i;
                i14 = i6;
                bVar = eVar.f71a;
                if (bVar == null) {
                }
                coordinatorLayout = this;
                coordinatorLayout.measureChildWithMargins(view, i13, i16, i15, 0);
                int max222 = Math.max(i20, view.getMeasuredWidth() + i25 + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
                int max322 = Math.max(i18, view.getMeasuredHeight() + i26 + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
                i28 = View.combineMeasuredStates(i28, view.getMeasuredState());
                suggestedMinimumWidth = max222;
                suggestedMinimumHeight = max322;
            }
            i27 = i21 + 1;
            arrayList3 = arrayList;
            size3 = i12;
            paddingLeft = i19;
            paddingRight = i17;
        }
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i, (-16777216) & i28), View.resolveSizeAndState(suggestedMinimumHeight, i6, i28 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f3, float f9, boolean z3) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(0)) {
                    b bVar = eVar.f71a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f3, float f9) {
        b bVar;
        int childCount = getChildCount();
        boolean z3 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(0) && (bVar = eVar.f71a) != null) {
                    z3 |= bVar.i(view);
                }
            }
        }
        return z3;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i6, int[] iArr) {
        f(view, i, i6, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i6, int i9, int i10) {
        c(view, i, i6, i9, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        e(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.f3267n);
        SparseArray sparseArray = hVar.f88v;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            b bVar = n(childAt).f71a;
            if (id != -1 && bVar != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                bVar.m(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable n9;
        h hVar = new h(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            b bVar = ((e) childAt.getLayoutParams()).f71a;
            if (id != -1 && bVar != null && (n9 = bVar.n(childAt)) != null) {
                sparseArray.append(id, n9);
            }
        }
        hVar.f88v = sparseArray;
        return hVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return d(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        a(0, view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r3 != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z3;
        boolean q8;
        MotionEvent motionEvent2;
        int actionMasked = motionEvent.getActionMasked();
        if (this.f4666C == null) {
            z3 = r(motionEvent, 1);
        } else {
            z3 = false;
        }
        b bVar = ((e) this.f4666C.getLayoutParams()).f71a;
        if (bVar != null) {
            q8 = bVar.q(this.f4666C, motionEvent);
            motionEvent2 = null;
            if (this.f4666C != null) {
                q8 |= super.onTouchEvent(motionEvent);
            } else if (z3) {
                long uptimeMillis = SystemClock.uptimeMillis();
                motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEvent2);
            }
            if (motionEvent2 != null) {
                motionEvent2.recycle();
            }
            if (actionMasked == 1 && actionMasked != 3) {
                return q8;
            }
            t(false);
            return q8;
        }
        q8 = false;
        motionEvent2 = null;
        if (this.f4666C != null) {
        }
        if (motionEvent2 != null) {
        }
        if (actionMasked == 1) {
        }
        t(false);
        return q8;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0047 A[EDGE_INSN: B:117:0x0047->B:9:0x0047 BREAK  A[LOOP:2: B:109:0x02ad->B:115:0x02c4], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(int i) {
        Rect rect;
        int i6;
        Rect rect2;
        int i9;
        int i10;
        boolean z3;
        boolean z6;
        int width;
        int i11;
        int i12;
        int i13;
        int height;
        int i14;
        int i15;
        int i16;
        int i17;
        ArrayList arrayList;
        Rect rect3;
        Rect rect4;
        int i18;
        d dVar;
        int i19;
        b bVar;
        WeakHashMap weakHashMap = X.f2054a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList2 = this.f4675n;
        int size = arrayList2.size();
        Rect g4 = g();
        Rect g9 = g();
        Rect g10 = g();
        int i20 = 0;
        while (true) {
            d dVar2 = f4663Q;
            if (i20 >= size) {
                Rect rect5 = g9;
                Rect rect6 = g10;
                g4.setEmpty();
                dVar2.c(g4);
                rect5.setEmpty();
                dVar2.c(rect5);
                rect6.setEmpty();
                dVar2.c(rect6);
                return;
            }
            View view = (View) arrayList2.get(i20);
            e eVar = (e) view.getLayoutParams();
            if (i == 0 && view.getVisibility() == 8) {
                rect = g9;
                rect2 = g10;
                i6 = i20;
                i10 = size;
            } else {
                int i21 = 0;
                while (i21 < i20) {
                    if (eVar.f81l == ((View) arrayList2.get(i21))) {
                        e eVar2 = (e) view.getLayoutParams();
                        if (eVar2.f80k != null) {
                            rect3 = g9;
                            Rect g11 = g();
                            Rect g12 = g();
                            Rect rect7 = g10;
                            Rect g13 = g();
                            i17 = i21;
                            k(g11, eVar2.f80k);
                            i(view, g12, false);
                            i18 = i20;
                            int measuredWidth = view.getMeasuredWidth();
                            d dVar3 = dVar2;
                            int measuredHeight = view.getMeasuredHeight();
                            dVar = dVar3;
                            arrayList = arrayList2;
                            l(layoutDirection, g11, g13, eVar2, measuredWidth, measuredHeight);
                            i19 = size;
                            rect4 = rect7;
                            boolean z9 = (g13.left == g12.left && g13.top == g12.top) ? false : true;
                            h(eVar2, g13, measuredWidth, measuredHeight);
                            int i22 = g13.left - g12.left;
                            int i23 = g13.top - g12.top;
                            if (i22 != 0) {
                                WeakHashMap weakHashMap2 = X.f2054a;
                                view.offsetLeftAndRight(i22);
                            }
                            if (i23 != 0) {
                                WeakHashMap weakHashMap3 = X.f2054a;
                                view.offsetTopAndBottom(i23);
                            }
                            if (z9 && (bVar = eVar2.f71a) != null) {
                                bVar.d(this, view, eVar2.f80k);
                            }
                            g11.setEmpty();
                            dVar.c(g11);
                            g12.setEmpty();
                            dVar.c(g12);
                            g13.setEmpty();
                            dVar.c(g13);
                            dVar2 = dVar;
                            i21 = i17 + 1;
                            g9 = rect3;
                            i20 = i18;
                            arrayList2 = arrayList;
                            size = i19;
                            g10 = rect4;
                        }
                    }
                    i17 = i21;
                    arrayList = arrayList2;
                    rect3 = g9;
                    rect4 = g10;
                    i18 = i20;
                    dVar = dVar2;
                    i19 = size;
                    dVar2 = dVar;
                    i21 = i17 + 1;
                    g9 = rect3;
                    i20 = i18;
                    arrayList2 = arrayList;
                    size = i19;
                    g10 = rect4;
                }
                ArrayList arrayList3 = arrayList2;
                rect = g9;
                Rect rect8 = g10;
                i6 = i20;
                N.c cVar = dVar2;
                int i24 = size;
                i(view, rect, true);
                if (eVar.f77g != 0 && !rect.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(eVar.f77g, layoutDirection);
                    int i25 = absoluteGravity & 112;
                    if (i25 == 48) {
                        g4.top = Math.max(g4.top, rect.bottom);
                    } else if (i25 == 80) {
                        g4.bottom = Math.max(g4.bottom, getHeight() - rect.top);
                    }
                    int i26 = absoluteGravity & 7;
                    if (i26 == 3) {
                        g4.left = Math.max(g4.left, rect.right);
                    } else if (i26 == 5) {
                        g4.right = Math.max(g4.right, getWidth() - rect.left);
                    }
                }
                if (eVar.f78h != 0 && view.getVisibility() == 0) {
                    WeakHashMap weakHashMap4 = X.f2054a;
                    if (view.isLaidOut() && view.getWidth() > 0 && view.getHeight() > 0) {
                        e eVar3 = (e) view.getLayoutParams();
                        b bVar2 = eVar3.f71a;
                        Rect g14 = g();
                        Rect g15 = g();
                        g15.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                        if (bVar2 == null || !bVar2.a(view)) {
                            g14.set(g15);
                        } else if (!g15.contains(g14)) {
                            throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + g14.toShortString() + " | Bounds:" + g15.toShortString());
                        }
                        g15.setEmpty();
                        cVar.c(g15);
                        if (!g14.isEmpty()) {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(eVar3.f78h, layoutDirection);
                            if ((absoluteGravity2 & 48) != 48 || (i15 = (g14.top - ((ViewGroup.MarginLayoutParams) eVar3).topMargin) - eVar3.f79j) >= (i16 = g4.top)) {
                                z3 = false;
                            } else {
                                v(i16 - i15, view);
                                z3 = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - g14.bottom) - ((ViewGroup.MarginLayoutParams) eVar3).bottomMargin) + eVar3.f79j) < (i14 = g4.bottom)) {
                                v(height - i14, view);
                                z3 = true;
                            }
                            if (!z3) {
                                v(0, view);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i12 = (g14.left - ((ViewGroup.MarginLayoutParams) eVar3).leftMargin) - eVar3.i) >= (i13 = g4.left)) {
                                z6 = false;
                            } else {
                                u(i13 - i12, view);
                                z6 = true;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - g14.right) - ((ViewGroup.MarginLayoutParams) eVar3).rightMargin) + eVar3.i) < (i11 = g4.right)) {
                                u(width - i11, view);
                                z6 = true;
                            }
                            if (!z6) {
                                u(0, view);
                            }
                            g14.setEmpty();
                            cVar.c(g14);
                            if (i == 2) {
                                rect2 = rect8;
                                rect2.set(((e) view.getLayoutParams()).f84o);
                                if (rect2.equals(rect)) {
                                    arrayList2 = arrayList3;
                                    i10 = i24;
                                } else {
                                    ((e) view.getLayoutParams()).f84o.set(rect);
                                }
                            } else {
                                rect2 = rect8;
                            }
                            i9 = i6 + 1;
                            i10 = i24;
                            while (true) {
                                arrayList2 = arrayList3;
                                if (i9 < i10) {
                                    break;
                                }
                                View view2 = (View) arrayList2.get(i9);
                                b bVar3 = ((e) view2.getLayoutParams()).f71a;
                                if (bVar3 != null) {
                                    bVar3.b(view2);
                                }
                                i9++;
                                arrayList3 = arrayList2;
                            }
                        } else {
                            g14.setEmpty();
                            cVar.c(g14);
                        }
                    }
                }
                if (i == 2) {
                }
                i9 = i6 + 1;
                i10 = i24;
                while (true) {
                    arrayList2 = arrayList3;
                    if (i9 < i10) {
                    }
                    i9++;
                    arrayList3 = arrayList2;
                }
            }
            i20 = i6 + 1;
            size = i10;
            g10 = rect2;
            g9 = rect;
        }
    }

    public final void q(int i, View view) {
        Rect g4;
        Rect g9;
        e eVar = (e) view.getLayoutParams();
        View view2 = eVar.f80k;
        if (view2 == null && eVar.f76f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        d dVar = f4663Q;
        if (view2 != null) {
            g4 = g();
            g9 = g();
            try {
                k(g4, view2);
                e eVar2 = (e) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                l(i, g4, g9, eVar2, measuredWidth, measuredHeight);
                h(eVar2, g9, measuredWidth, measuredHeight);
                view.layout(g9.left, g9.top, g9.right, g9.bottom);
                return;
            } finally {
                g4.setEmpty();
                dVar.c(g4);
                g9.setEmpty();
                dVar.c(g9);
            }
        }
        int i6 = eVar.f75e;
        if (i6 < 0) {
            e eVar3 = (e) view.getLayoutParams();
            g4 = g();
            g4.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) eVar3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) eVar3).bottomMargin);
            if (this.f4670G != null) {
                WeakHashMap weakHashMap = X.f2054a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    g4.left = this.f4670G.b() + g4.left;
                    g4.top = this.f4670G.d() + g4.top;
                    g4.right -= this.f4670G.c();
                    g4.bottom -= this.f4670G.a();
                }
            }
            g9 = g();
            int i9 = eVar3.f73c;
            if ((i9 & 7) == 0) {
                i9 |= 8388611;
            }
            if ((i9 & 112) == 0) {
                i9 |= 48;
            }
            Gravity.apply(i9, view.getMeasuredWidth(), view.getMeasuredHeight(), g4, g9, i);
            view.layout(g9.left, g9.top, g9.right, g9.bottom);
            return;
        }
        e eVar4 = (e) view.getLayoutParams();
        int i10 = eVar4.f73c;
        if (i10 == 0) {
            i10 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, i);
        int i11 = absoluteGravity & 7;
        int i12 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i == 1) {
            i6 = width - i6;
        }
        int m4 = m(i6) - measuredWidth2;
        if (i11 == 1) {
            m4 += measuredWidth2 / 2;
        } else if (i11 == 5) {
            m4 += measuredWidth2;
        }
        int i13 = i12 != 16 ? i12 != 80 ? 0 : measuredHeight2 : measuredHeight2 / 2;
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar4).leftMargin, Math.min(m4, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) eVar4).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar4).topMargin, Math.min(i13, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) eVar4).bottomMargin));
        view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
    }

    public final boolean r(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f4677v;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i6 = childCount - 1; i6 >= 0; i6--) {
            arrayList.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i6) : i6));
        }
        i iVar = f4662P;
        if (iVar != null) {
            Collections.sort(arrayList, iVar);
        }
        int size = arrayList.size();
        MotionEvent motionEvent2 = null;
        boolean z3 = false;
        for (int i9 = 0; i9 < size; i9++) {
            View view = (View) arrayList.get(i9);
            b bVar = ((e) view.getLayoutParams()).f71a;
            if (z3 && actionMasked != 0) {
                if (bVar != null) {
                    if (motionEvent2 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i == 0) {
                        bVar.f(this, view, motionEvent2);
                    } else if (i == 1) {
                        bVar.q(view, motionEvent2);
                    }
                }
            } else if (!z3 && bVar != null) {
                if (i == 0) {
                    z3 = bVar.f(this, view, motionEvent);
                } else if (i == 1) {
                    z3 = bVar.q(view, motionEvent);
                }
                if (z3) {
                    this.f4666C = view;
                }
            }
        }
        arrayList.clear();
        return z3;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z3) {
        b bVar = ((e) view.getLayoutParams()).f71a;
        if (bVar != null) {
            bVar.l(this, view);
        }
        return super.requestChildRectangleOnScreen(view, rect, z3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z3) {
        super.requestDisallowInterceptTouchEvent(z3);
        if (!z3 || this.f4681z) {
            return;
        }
        t(false);
        this.f4681z = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0144, code lost:
    
        throw new java.lang.IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s() {
        N.c cVar;
        ArrayList arrayList = this.f4675n;
        arrayList.clear();
        S0.i iVar = this.f4676u;
        k kVar = (k) iVar.f2789v;
        int i = kVar.f40440v;
        int i6 = 0;
        while (true) {
            cVar = (N.c) iVar.f2788u;
            if (i6 >= i) {
                break;
            }
            ArrayList arrayList2 = (ArrayList) kVar.l(i6);
            if (arrayList2 != null) {
                arrayList2.clear();
                cVar.c(arrayList2);
            }
            i6++;
        }
        kVar.clear();
        int childCount = getChildCount();
        int i9 = 0;
        loop1: while (true) {
            k kVar2 = (k) iVar.f2789v;
            if (i9 >= childCount) {
                ArrayList arrayList3 = (ArrayList) iVar.f2790w;
                arrayList3.clear();
                HashSet hashSet = (HashSet) iVar.f2791x;
                hashSet.clear();
                int i10 = kVar2.f40440v;
                for (int i11 = 0; i11 < i10; i11++) {
                    iVar.a(kVar2.h(i11), arrayList3, hashSet);
                }
                arrayList.addAll(arrayList3);
                Collections.reverse(arrayList);
                return;
            }
            View childAt = getChildAt(i9);
            e n9 = n(childAt);
            int i12 = n9.f76f;
            if (i12 == -1) {
                n9.f81l = null;
                n9.f80k = null;
            } else {
                View view = n9.f80k;
                if (view != null && view.getId() == i12) {
                    View view2 = n9.f80k;
                    for (ViewParent parent = view2.getParent(); parent != this; parent = parent.getParent()) {
                        if (parent == null || parent == childAt) {
                            n9.f81l = null;
                            n9.f80k = null;
                        } else {
                            if (parent instanceof View) {
                                view2 = parent;
                            }
                        }
                    }
                    n9.f81l = view2;
                }
                View findViewById = findViewById(i12);
                n9.f80k = findViewById;
                if (findViewById == null) {
                    if (!isInEditMode()) {
                        throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + getResources().getResourceName(i12) + " to anchor view " + childAt);
                    }
                    n9.f81l = null;
                    n9.f80k = null;
                } else if (findViewById != this) {
                    for (ViewParent parent2 = findViewById.getParent(); parent2 != this && parent2 != null; parent2 = parent2.getParent()) {
                        if (parent2 != childAt) {
                            if (parent2 instanceof View) {
                                findViewById = parent2;
                            }
                        } else {
                            if (!isInEditMode()) {
                                throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                            }
                            n9.f81l = null;
                            n9.f80k = null;
                        }
                    }
                    n9.f81l = findViewById;
                } else {
                    if (!isInEditMode()) {
                        throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                    }
                    n9.f81l = null;
                    n9.f80k = null;
                }
            }
            if (!kVar2.containsKey(childAt)) {
                kVar2.put(childAt, null);
            }
            for (int i13 = 0; i13 < childCount; i13++) {
                if (i13 != i9) {
                    View childAt2 = getChildAt(i13);
                    if (childAt2 != n9.f81l) {
                        WeakHashMap weakHashMap = X.f2054a;
                        int layoutDirection = getLayoutDirection();
                        int absoluteGravity = Gravity.getAbsoluteGravity(((e) childAt2.getLayoutParams()).f77g, layoutDirection);
                        if (absoluteGravity == 0 || (Gravity.getAbsoluteGravity(n9.f78h, layoutDirection) & absoluteGravity) != absoluteGravity) {
                            b bVar = n9.f71a;
                            if (bVar != null) {
                                bVar.b(childAt);
                            }
                        }
                    }
                    if (!kVar2.containsKey(childAt2) && !kVar2.containsKey(childAt2)) {
                        kVar2.put(childAt2, null);
                    }
                    if (!kVar2.containsKey(childAt2) || !kVar2.containsKey(childAt)) {
                        break loop1;
                    }
                    ArrayList arrayList4 = (ArrayList) kVar2.getOrDefault(childAt2, null);
                    if (arrayList4 == null) {
                        arrayList4 = (ArrayList) cVar.a();
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        kVar2.put(childAt2, arrayList4);
                    }
                    arrayList4.add(childAt);
                }
            }
            i9++;
        }
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z3) {
        super.setFitsSystemWindows(z3);
        w();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.J = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f4672I;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f4672I = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f4672I.setState(getDrawableState());
                }
                Drawable drawable3 = this.f4672I;
                WeakHashMap weakHashMap = X.f2054a;
                H.b.b(drawable3, getLayoutDirection());
                this.f4672I.setVisible(getVisibility() == 0, false);
                this.f4672I.setCallback(this);
            }
            WeakHashMap weakHashMap2 = X.f2054a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? E.a.b(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z3 = i == 0;
        Drawable drawable = this.f4672I;
        if (drawable == null || drawable.isVisible() == z3) {
            return;
        }
        this.f4672I.setVisible(z3, false);
    }

    public final void t(boolean z3) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            b bVar = ((e) childAt.getLayoutParams()).f71a;
            if (bVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z3) {
                    bVar.f(this, childAt, obtain);
                } else {
                    bVar.q(childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i6 = 0; i6 < childCount; i6++) {
            ((e) getChildAt(i6).getLayoutParams()).getClass();
        }
        this.f4666C = null;
        this.f4681z = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f4672I;
    }

    public final void w() {
        WeakHashMap weakHashMap = X.f2054a;
        if (!getFitsSystemWindows()) {
            L.u(this, null);
            return;
        }
        if (this.f4673K == null) {
            this.f4673K = new C4523c(1, this);
        }
        L.u(this, this.f4673K);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }
}
