package androidx.coordinatorlayout.widget;

import A.a;
import A3.o;
import B.b;
import B.c;
import B.e;
import B.f;
import B.g;
import B.h;
import I0.j;
import N.d;
import O.A0;
import O.C0349t;
import O.InterfaceC0348s;
import O.J;
import O.L;
import O.X;
import O.r;
import S0.i;
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
import com.IceFishing.LiveIceFishing.C5248R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.WeakHashMap;
import s.k;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements r, InterfaceC0348s {

    /* renamed from: M, reason: collision with root package name */
    public static final String f4627M;

    /* renamed from: N, reason: collision with root package name */
    public static final Class[] f4628N;

    /* renamed from: O, reason: collision with root package name */
    public static final ThreadLocal f4629O;

    /* renamed from: P, reason: collision with root package name */
    public static final o f4630P;

    /* renamed from: Q, reason: collision with root package name */
    public static final d f4631Q;

    /* renamed from: A, reason: collision with root package name */
    public boolean f4632A;

    /* renamed from: B, reason: collision with root package name */
    public final int[] f4633B;

    /* renamed from: C, reason: collision with root package name */
    public View f4634C;

    /* renamed from: D, reason: collision with root package name */
    public View f4635D;

    /* renamed from: E, reason: collision with root package name */
    public f f4636E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f4637F;

    /* renamed from: G, reason: collision with root package name */
    public A0 f4638G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f4639H;

    /* renamed from: I, reason: collision with root package name */
    public Drawable f4640I;
    public ViewGroup.OnHierarchyChangeListener J;

    /* renamed from: K, reason: collision with root package name */
    public j f4641K;

    /* renamed from: L, reason: collision with root package name */
    public final C0349t f4642L;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f4643n;

    /* renamed from: u, reason: collision with root package name */
    public final i f4644u;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f4645v;

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList f4646w;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f4647x;

    /* renamed from: y, reason: collision with root package name */
    public final int[] f4648y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f4649z;

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        f4627M = r02 != null ? r02.getName() : null;
        f4630P = new o(1);
        f4628N = new Class[]{Context.class, AttributeSet.class};
        f4629O = new ThreadLocal();
        f4631Q = new d(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C5248R.attr.coordinatorLayoutStyle);
        this.f4643n = new ArrayList();
        this.f4644u = new i();
        this.f4645v = new ArrayList();
        this.f4646w = new ArrayList();
        this.f4647x = new int[2];
        this.f4648y = new int[2];
        this.f4642L = new C0349t();
        int[] iArr = a.f4a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, C5248R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, C5248R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f4633B = intArray;
            float f2 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i = 0; i < length; i++) {
                this.f4633B[i] = (int) (r2[i] * f2);
            }
        }
        this.f4640I = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        w();
        super.setOnHierarchyChangeListener(new B.d(this));
        WeakHashMap weakHashMap = X.f2142a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static Rect g() {
        Rect rect = (Rect) f4631Q.a();
        return rect == null ? new Rect() : rect;
    }

    public static void l(int i, Rect rect, Rect rect2, e eVar, int i4, int i6) {
        int i9 = eVar.f231c;
        if (i9 == 0) {
            i9 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i9, i);
        int i10 = eVar.f232d;
        if ((i10 & 7) == 0) {
            i10 |= 8388611;
        }
        if ((i10 & 112) == 0) {
            i10 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i10, i);
        int i11 = absoluteGravity & 7;
        int i12 = absoluteGravity & 112;
        int i13 = absoluteGravity2 & 7;
        int i14 = absoluteGravity2 & 112;
        int width = i13 != 1 ? i13 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i14 != 16 ? i14 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i11 == 1) {
            width -= i4 / 2;
        } else if (i11 != 5) {
            width -= i4;
        }
        if (i12 == 16) {
            height -= i6 / 2;
        } else if (i12 != 80) {
            height -= i6;
        }
        rect2.set(width, height, i4 + width, i6 + height);
    }

    public static e n(View view) {
        e eVar = (e) view.getLayoutParams();
        if (!eVar.f230b) {
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
                    b bVar2 = eVar.f229a;
                    if (bVar2 != bVar) {
                        if (bVar2 != null) {
                            bVar2.e();
                        }
                        eVar.f229a = bVar;
                        eVar.f230b = true;
                        if (bVar != null) {
                            bVar.c(eVar);
                        }
                    }
                } catch (Exception e9) {
                    Log.e("CoordinatorLayout", "Default behavior class " + cVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e9);
                }
            }
            eVar.f230b = true;
        }
        return eVar;
    }

    public static void u(int i, View view) {
        e eVar = (e) view.getLayoutParams();
        int i4 = eVar.i;
        if (i4 != i) {
            WeakHashMap weakHashMap = X.f2142a;
            view.offsetLeftAndRight(i - i4);
            eVar.i = i;
        }
    }

    public static void v(int i, View view) {
        e eVar = (e) view.getLayoutParams();
        int i4 = eVar.f237j;
        if (i4 != i) {
            WeakHashMap weakHashMap = X.f2142a;
            view.offsetTopAndBottom(i - i4);
            eVar.f237j = i;
        }
    }

    @Override // O.r
    public final void a(int i, View view) {
        C0349t c0349t = this.f4642L;
        if (i == 1) {
            c0349t.f2222b = 0;
        } else {
            c0349t.f2221a = 0;
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            e eVar = (e) childAt.getLayoutParams();
            if (eVar.a(i)) {
                b bVar = eVar.f229a;
                if (bVar != null) {
                    bVar.p(childAt, view, i);
                }
                if (i == 0) {
                    eVar.f240m = false;
                } else if (i == 1) {
                    eVar.f241n = false;
                }
            }
        }
        this.f4635D = null;
    }

    @Override // O.InterfaceC0348s
    public final void b(View view, int i, int i4, int i6, int i9, int i10, int[] iArr) {
        b bVar;
        int childCount = getChildCount();
        int i11 = 0;
        int i12 = 0;
        boolean z6 = false;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(i10) && (bVar = eVar.f229a) != null) {
                    int[] iArr2 = this.f4647x;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    bVar.k(this, childAt, i4, i6, i9, iArr2);
                    i11 = i6 > 0 ? Math.max(i11, iArr2[0]) : Math.min(i11, iArr2[0]);
                    i12 = i9 > 0 ? Math.max(i12, iArr2[1]) : Math.min(i12, iArr2[1]);
                    z6 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i11;
        iArr[1] = iArr[1] + i12;
        if (z6) {
            p(1);
        }
    }

    @Override // O.r
    public final void c(View view, int i, int i4, int i6, int i9, int i10) {
        b(view, i, i4, i6, i9, 0, this.f4648y);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof e) && super.checkLayoutParams(layoutParams);
    }

    @Override // O.r
    public final boolean d(View view, View view2, int i, int i4) {
        int childCount = getChildCount();
        boolean z6 = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                b bVar = eVar.f229a;
                if (bVar != null) {
                    boolean o4 = bVar.o(i, i4, childAt);
                    z6 |= o4;
                    if (i4 == 0) {
                        eVar.f240m = o4;
                    } else if (i4 == 1) {
                        eVar.f241n = o4;
                    }
                } else if (i4 == 0) {
                    eVar.f240m = false;
                } else if (i4 == 1) {
                    eVar.f241n = false;
                }
            }
        }
        return z6;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j6) {
        b bVar = ((e) view.getLayoutParams()).f229a;
        if (bVar != null) {
            bVar.getClass();
        }
        return super.drawChild(canvas, view, j6);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f4640I;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // O.r
    public final void e(View view, View view2, int i, int i4) {
        C0349t c0349t = this.f4642L;
        if (i4 == 1) {
            c0349t.f2222b = i;
        } else {
            c0349t.f2221a = i;
        }
        this.f4635D = view2;
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            ((e) getChildAt(i6).getLayoutParams()).getClass();
        }
    }

    @Override // O.r
    public final void f(View view, int i, int i4, int[] iArr, int i6) {
        b bVar;
        int childCount = getChildCount();
        boolean z6 = false;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(i6) && (bVar = eVar.f229a) != null) {
                    int[] iArr2 = this.f4647x;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    bVar.j(this, childAt, view, i, i4, iArr2, i6);
                    i9 = i > 0 ? Math.max(i9, iArr2[0]) : Math.min(i9, iArr2[0]);
                    i10 = i4 > 0 ? Math.max(i10, iArr2[1]) : Math.min(i10, iArr2[1]);
                    z6 = true;
                }
            }
        }
        iArr[0] = i9;
        iArr[1] = i10;
        if (z6) {
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
        return Collections.unmodifiableList(this.f4643n);
    }

    public final A0 getLastWindowInsets() {
        return this.f4638G;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0349t c0349t = this.f4642L;
        return c0349t.f2222b | c0349t.f2221a;
    }

    public Drawable getStatusBarBackground() {
        return this.f4640I;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void h(e eVar, Rect rect, int i, int i4) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i4) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin));
        rect.set(max, max2, i + max, i4 + max2);
    }

    public final void i(View view, Rect rect, boolean z6) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z6) {
            k(rect, view);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final ArrayList j(View view) {
        k kVar = (k) this.f4644u.f2918v;
        int i = kVar.f40276v;
        ArrayList arrayList = null;
        for (int i4 = 0; i4 < i; i4++) {
            ArrayList arrayList2 = (ArrayList) kVar.l(i4);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(kVar.h(i4));
            }
        }
        ArrayList arrayList3 = this.f4646w;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void k(Rect rect, View view) {
        ThreadLocal threadLocal = h.f246a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = h.f246a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        h.a(this, view, matrix);
        ThreadLocal threadLocal3 = h.f247b;
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
        int[] iArr = this.f4633B;
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

    public final boolean o(int i, int i4, View view) {
        d dVar = f4631Q;
        Rect g9 = g();
        k(g9, view);
        try {
            return g9.contains(i, i4);
        } finally {
            g9.setEmpty();
            dVar.c(g9);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t(false);
        if (this.f4637F) {
            if (this.f4636E == null) {
                this.f4636E = new f(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f4636E);
        }
        if (this.f4638G == null) {
            WeakHashMap weakHashMap = X.f2142a;
            if (getFitsSystemWindows()) {
                J.c(this);
            }
        }
        this.f4632A = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t(false);
        if (this.f4637F && this.f4636E != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f4636E);
        }
        View view = this.f4635D;
        if (view != null) {
            a(0, view);
        }
        this.f4632A = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f4639H || this.f4640I == null) {
            return;
        }
        A0 a02 = this.f4638G;
        int d9 = a02 != null ? a02.d() : 0;
        if (d9 > 0) {
            this.f4640I.setBounds(0, 0, getWidth(), d9);
            this.f4640I.draw(canvas);
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
    public final void onLayout(boolean z6, int i, int i4, int i6, int i9) {
        b bVar;
        WeakHashMap weakHashMap = X.f2142a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.f4643n;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view = (View) arrayList.get(i10);
            if (view.getVisibility() != 8 && ((bVar = ((e) view.getLayoutParams()).f229a) == null || !bVar.g(this, view, layoutDirection))) {
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
    public final void onMeasure(int i, int i4) {
        boolean z6;
        int i6;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        b bVar;
        int i14;
        View view;
        ArrayList arrayList;
        int i15;
        int i16;
        int i17;
        boolean z9;
        int i18;
        int i19;
        int i20;
        int max;
        CoordinatorLayout coordinatorLayout = this;
        coordinatorLayout.s();
        int childCount = coordinatorLayout.getChildCount();
        int i21 = 0;
        loop0: while (true) {
            if (i21 >= childCount) {
                z6 = false;
                break;
            }
            View childAt = coordinatorLayout.getChildAt(i21);
            k kVar = (k) coordinatorLayout.f4644u.f2918v;
            int i22 = kVar.f40276v;
            for (int i23 = 0; i23 < i22; i23++) {
                ArrayList arrayList2 = (ArrayList) kVar.l(i23);
                if (arrayList2 != null && arrayList2.contains(childAt)) {
                    z6 = true;
                    break loop0;
                }
            }
            i21++;
        }
        if (z6 != coordinatorLayout.f4637F) {
            if (z6) {
                if (coordinatorLayout.f4632A) {
                    if (coordinatorLayout.f4636E == null) {
                        coordinatorLayout.f4636E = new f(coordinatorLayout);
                    }
                    coordinatorLayout.getViewTreeObserver().addOnPreDrawListener(coordinatorLayout.f4636E);
                }
                coordinatorLayout.f4637F = true;
            } else {
                if (coordinatorLayout.f4632A && coordinatorLayout.f4636E != null) {
                    coordinatorLayout.getViewTreeObserver().removeOnPreDrawListener(coordinatorLayout.f4636E);
                }
                coordinatorLayout.f4637F = false;
            }
        }
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        WeakHashMap weakHashMap = X.f2142a;
        int layoutDirection = coordinatorLayout.getLayoutDirection();
        boolean z10 = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i4);
        int size2 = View.MeasureSpec.getSize(i4);
        int i24 = paddingLeft + paddingRight;
        int i25 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        boolean z11 = coordinatorLayout.f4638G != null && coordinatorLayout.getFitsSystemWindows();
        ArrayList arrayList3 = coordinatorLayout.f4643n;
        int size3 = arrayList3.size();
        int i26 = 0;
        int i27 = 0;
        while (i26 < size3) {
            View view2 = (View) arrayList3.get(i26);
            int i28 = suggestedMinimumWidth;
            if (view2.getVisibility() == 8) {
                arrayList = arrayList3;
                i11 = size3;
                i18 = paddingLeft;
                i16 = paddingRight;
                suggestedMinimumWidth = i28;
                z9 = false;
                i20 = i26;
            } else {
                e eVar = (e) view2.getLayoutParams();
                int i29 = eVar.f233e;
                if (i29 < 0 || mode == 0) {
                    i6 = suggestedMinimumHeight;
                } else {
                    int m9 = coordinatorLayout.m(i29);
                    int i30 = eVar.f231c;
                    if (i30 == 0) {
                        i30 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i30, layoutDirection) & 7;
                    i6 = suggestedMinimumHeight;
                    if ((absoluteGravity == 3 && !z10) || (absoluteGravity == 5 && z10)) {
                        max = Math.max(0, (size - paddingRight) - m9);
                    } else if ((absoluteGravity == 5 && !z10) || (absoluteGravity == 3 && z10)) {
                        max = Math.max(0, m9 - paddingLeft);
                    }
                    int i31 = size3;
                    i10 = max;
                    i9 = i31;
                    if (z11 || view2.getFitsSystemWindows()) {
                        i11 = i9;
                        i12 = i;
                        i13 = i4;
                    } else {
                        i11 = i9;
                        int c9 = coordinatorLayout.f4638G.c() + coordinatorLayout.f4638G.b();
                        int a9 = coordinatorLayout.f4638G.a() + coordinatorLayout.f4638G.d();
                        i12 = View.MeasureSpec.makeMeasureSpec(size - c9, mode);
                        i13 = View.MeasureSpec.makeMeasureSpec(size2 - a9, mode2);
                    }
                    bVar = eVar.f229a;
                    if (bVar == null) {
                        ArrayList arrayList4 = arrayList3;
                        int i32 = i12;
                        arrayList = arrayList4;
                        z9 = false;
                        i16 = paddingRight;
                        i17 = i6;
                        i18 = paddingLeft;
                        i19 = i28;
                        i20 = i26;
                        int i33 = i13;
                        boolean h3 = bVar.h(this, view2, i32, i10, i33);
                        view = view2;
                        i12 = i32;
                        i15 = i10;
                        i14 = i33;
                        if (h3) {
                            coordinatorLayout = this;
                            int max2 = Math.max(i19, view.getMeasuredWidth() + i24 + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
                            int max3 = Math.max(i17, view.getMeasuredHeight() + i25 + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
                            i27 = View.combineMeasuredStates(i27, view.getMeasuredState());
                            suggestedMinimumWidth = max2;
                            suggestedMinimumHeight = max3;
                        }
                    } else {
                        int i34 = i10;
                        i14 = i13;
                        view = view2;
                        arrayList = arrayList3;
                        i15 = i34;
                        i16 = paddingRight;
                        i17 = i6;
                        z9 = false;
                        i18 = paddingLeft;
                        i19 = i28;
                        i20 = i26;
                    }
                    coordinatorLayout = this;
                    coordinatorLayout.measureChildWithMargins(view, i12, i15, i14, 0);
                    int max22 = Math.max(i19, view.getMeasuredWidth() + i24 + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
                    int max32 = Math.max(i17, view.getMeasuredHeight() + i25 + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
                    i27 = View.combineMeasuredStates(i27, view.getMeasuredState());
                    suggestedMinimumWidth = max22;
                    suggestedMinimumHeight = max32;
                }
                i9 = size3;
                i10 = 0;
                if (z11) {
                }
                i11 = i9;
                i12 = i;
                i13 = i4;
                bVar = eVar.f229a;
                if (bVar == null) {
                }
                coordinatorLayout = this;
                coordinatorLayout.measureChildWithMargins(view, i12, i15, i14, 0);
                int max222 = Math.max(i19, view.getMeasuredWidth() + i24 + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
                int max322 = Math.max(i17, view.getMeasuredHeight() + i25 + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
                i27 = View.combineMeasuredStates(i27, view.getMeasuredState());
                suggestedMinimumWidth = max222;
                suggestedMinimumHeight = max322;
            }
            i26 = i20 + 1;
            arrayList3 = arrayList;
            size3 = i11;
            paddingLeft = i18;
            paddingRight = i16;
        }
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i, (-16777216) & i27), View.resolveSizeAndState(suggestedMinimumHeight, i4, i27 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f9, boolean z6) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(0)) {
                    b bVar = eVar.f229a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f9) {
        b bVar;
        int childCount = getChildCount();
        boolean z6 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(0) && (bVar = eVar.f229a) != null) {
                    z6 |= bVar.i(view);
                }
            }
        }
        return z6;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i4, int[] iArr) {
        f(view, i, i4, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i4, int i6, int i9) {
        c(view, i, i4, i6, i9, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        e(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.f3390n);
        SparseArray sparseArray = gVar.f245v;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            b bVar = n(childAt).f229a;
            if (id != -1 && bVar != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                bVar.m(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable n9;
        g gVar = new g(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            b bVar = ((e) childAt.getLayoutParams()).f229a;
            if (id != -1 && bVar != null && (n9 = bVar.n(childAt)) != null) {
                sparseArray.append(id, n9);
            }
        }
        gVar.f245v = sparseArray;
        return gVar;
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
        boolean z6;
        boolean q8;
        MotionEvent motionEvent2;
        int actionMasked = motionEvent.getActionMasked();
        if (this.f4634C == null) {
            z6 = r(motionEvent, 1);
        } else {
            z6 = false;
        }
        b bVar = ((e) this.f4634C.getLayoutParams()).f229a;
        if (bVar != null) {
            q8 = bVar.q(this.f4634C, motionEvent);
            motionEvent2 = null;
            if (this.f4634C != null) {
                q8 |= super.onTouchEvent(motionEvent);
            } else if (z6) {
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
        if (this.f4634C != null) {
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
        int i4;
        Rect rect2;
        int i6;
        int i9;
        boolean z6;
        boolean z9;
        int width;
        int i10;
        int i11;
        int i12;
        int height;
        int i13;
        int i14;
        int i15;
        int i16;
        ArrayList arrayList;
        Rect rect3;
        Rect rect4;
        int i17;
        d dVar;
        int i18;
        b bVar;
        WeakHashMap weakHashMap = X.f2142a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList2 = this.f4643n;
        int size = arrayList2.size();
        Rect g9 = g();
        Rect g10 = g();
        Rect g11 = g();
        int i19 = 0;
        while (true) {
            d dVar2 = f4631Q;
            if (i19 >= size) {
                Rect rect5 = g10;
                Rect rect6 = g11;
                g9.setEmpty();
                dVar2.c(g9);
                rect5.setEmpty();
                dVar2.c(rect5);
                rect6.setEmpty();
                dVar2.c(rect6);
                return;
            }
            View view = (View) arrayList2.get(i19);
            e eVar = (e) view.getLayoutParams();
            if (i == 0 && view.getVisibility() == 8) {
                rect = g10;
                rect2 = g11;
                i4 = i19;
                i9 = size;
            } else {
                int i20 = 0;
                while (i20 < i19) {
                    if (eVar.f239l == ((View) arrayList2.get(i20))) {
                        e eVar2 = (e) view.getLayoutParams();
                        if (eVar2.f238k != null) {
                            rect3 = g10;
                            Rect g12 = g();
                            Rect g13 = g();
                            Rect rect7 = g11;
                            Rect g14 = g();
                            i16 = i20;
                            k(g12, eVar2.f238k);
                            i(view, g13, false);
                            i17 = i19;
                            int measuredWidth = view.getMeasuredWidth();
                            d dVar3 = dVar2;
                            int measuredHeight = view.getMeasuredHeight();
                            dVar = dVar3;
                            arrayList = arrayList2;
                            l(layoutDirection, g12, g14, eVar2, measuredWidth, measuredHeight);
                            i18 = size;
                            rect4 = rect7;
                            boolean z10 = (g14.left == g13.left && g14.top == g13.top) ? false : true;
                            h(eVar2, g14, measuredWidth, measuredHeight);
                            int i21 = g14.left - g13.left;
                            int i22 = g14.top - g13.top;
                            if (i21 != 0) {
                                WeakHashMap weakHashMap2 = X.f2142a;
                                view.offsetLeftAndRight(i21);
                            }
                            if (i22 != 0) {
                                WeakHashMap weakHashMap3 = X.f2142a;
                                view.offsetTopAndBottom(i22);
                            }
                            if (z10 && (bVar = eVar2.f229a) != null) {
                                bVar.d(this, view, eVar2.f238k);
                            }
                            g12.setEmpty();
                            dVar.c(g12);
                            g13.setEmpty();
                            dVar.c(g13);
                            g14.setEmpty();
                            dVar.c(g14);
                            dVar2 = dVar;
                            i20 = i16 + 1;
                            g10 = rect3;
                            i19 = i17;
                            arrayList2 = arrayList;
                            size = i18;
                            g11 = rect4;
                        }
                    }
                    i16 = i20;
                    arrayList = arrayList2;
                    rect3 = g10;
                    rect4 = g11;
                    i17 = i19;
                    dVar = dVar2;
                    i18 = size;
                    dVar2 = dVar;
                    i20 = i16 + 1;
                    g10 = rect3;
                    i19 = i17;
                    arrayList2 = arrayList;
                    size = i18;
                    g11 = rect4;
                }
                ArrayList arrayList3 = arrayList2;
                rect = g10;
                Rect rect8 = g11;
                i4 = i19;
                N.c cVar = dVar2;
                int i23 = size;
                i(view, rect, true);
                if (eVar.f235g != 0 && !rect.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(eVar.f235g, layoutDirection);
                    int i24 = absoluteGravity & 112;
                    if (i24 == 48) {
                        g9.top = Math.max(g9.top, rect.bottom);
                    } else if (i24 == 80) {
                        g9.bottom = Math.max(g9.bottom, getHeight() - rect.top);
                    }
                    int i25 = absoluteGravity & 7;
                    if (i25 == 3) {
                        g9.left = Math.max(g9.left, rect.right);
                    } else if (i25 == 5) {
                        g9.right = Math.max(g9.right, getWidth() - rect.left);
                    }
                }
                if (eVar.f236h != 0 && view.getVisibility() == 0) {
                    WeakHashMap weakHashMap4 = X.f2142a;
                    if (view.isLaidOut() && view.getWidth() > 0 && view.getHeight() > 0) {
                        e eVar3 = (e) view.getLayoutParams();
                        b bVar2 = eVar3.f229a;
                        Rect g15 = g();
                        Rect g16 = g();
                        g16.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                        if (bVar2 == null || !bVar2.a(view)) {
                            g15.set(g16);
                        } else if (!g16.contains(g15)) {
                            throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + g15.toShortString() + " | Bounds:" + g16.toShortString());
                        }
                        g16.setEmpty();
                        cVar.c(g16);
                        if (!g15.isEmpty()) {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(eVar3.f236h, layoutDirection);
                            if ((absoluteGravity2 & 48) != 48 || (i14 = (g15.top - ((ViewGroup.MarginLayoutParams) eVar3).topMargin) - eVar3.f237j) >= (i15 = g9.top)) {
                                z6 = false;
                            } else {
                                v(i15 - i14, view);
                                z6 = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - g15.bottom) - ((ViewGroup.MarginLayoutParams) eVar3).bottomMargin) + eVar3.f237j) < (i13 = g9.bottom)) {
                                v(height - i13, view);
                                z6 = true;
                            }
                            if (!z6) {
                                v(0, view);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i11 = (g15.left - ((ViewGroup.MarginLayoutParams) eVar3).leftMargin) - eVar3.i) >= (i12 = g9.left)) {
                                z9 = false;
                            } else {
                                u(i12 - i11, view);
                                z9 = true;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - g15.right) - ((ViewGroup.MarginLayoutParams) eVar3).rightMargin) + eVar3.i) < (i10 = g9.right)) {
                                u(width - i10, view);
                                z9 = true;
                            }
                            if (!z9) {
                                u(0, view);
                            }
                            g15.setEmpty();
                            cVar.c(g15);
                            if (i == 2) {
                                rect2 = rect8;
                                rect2.set(((e) view.getLayoutParams()).f242o);
                                if (rect2.equals(rect)) {
                                    arrayList2 = arrayList3;
                                    i9 = i23;
                                } else {
                                    ((e) view.getLayoutParams()).f242o.set(rect);
                                }
                            } else {
                                rect2 = rect8;
                            }
                            i6 = i4 + 1;
                            i9 = i23;
                            while (true) {
                                arrayList2 = arrayList3;
                                if (i6 < i9) {
                                    break;
                                }
                                View view2 = (View) arrayList2.get(i6);
                                b bVar3 = ((e) view2.getLayoutParams()).f229a;
                                if (bVar3 != null) {
                                    bVar3.b(view2);
                                }
                                i6++;
                                arrayList3 = arrayList2;
                            }
                        } else {
                            g15.setEmpty();
                            cVar.c(g15);
                        }
                    }
                }
                if (i == 2) {
                }
                i6 = i4 + 1;
                i9 = i23;
                while (true) {
                    arrayList2 = arrayList3;
                    if (i6 < i9) {
                    }
                    i6++;
                    arrayList3 = arrayList2;
                }
            }
            i19 = i4 + 1;
            size = i9;
            g11 = rect2;
            g10 = rect;
        }
    }

    public final void q(int i, View view) {
        Rect g9;
        Rect g10;
        e eVar = (e) view.getLayoutParams();
        View view2 = eVar.f238k;
        if (view2 == null && eVar.f234f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        d dVar = f4631Q;
        if (view2 != null) {
            g9 = g();
            g10 = g();
            try {
                k(g9, view2);
                e eVar2 = (e) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                l(i, g9, g10, eVar2, measuredWidth, measuredHeight);
                h(eVar2, g10, measuredWidth, measuredHeight);
                view.layout(g10.left, g10.top, g10.right, g10.bottom);
                return;
            } finally {
                g9.setEmpty();
                dVar.c(g9);
                g10.setEmpty();
                dVar.c(g10);
            }
        }
        int i4 = eVar.f233e;
        if (i4 < 0) {
            e eVar3 = (e) view.getLayoutParams();
            g9 = g();
            g9.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) eVar3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) eVar3).bottomMargin);
            if (this.f4638G != null) {
                WeakHashMap weakHashMap = X.f2142a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    g9.left = this.f4638G.b() + g9.left;
                    g9.top = this.f4638G.d() + g9.top;
                    g9.right -= this.f4638G.c();
                    g9.bottom -= this.f4638G.a();
                }
            }
            g10 = g();
            int i6 = eVar3.f231c;
            if ((i6 & 7) == 0) {
                i6 |= 8388611;
            }
            if ((i6 & 112) == 0) {
                i6 |= 48;
            }
            Gravity.apply(i6, view.getMeasuredWidth(), view.getMeasuredHeight(), g9, g10, i);
            view.layout(g10.left, g10.top, g10.right, g10.bottom);
            return;
        }
        e eVar4 = (e) view.getLayoutParams();
        int i9 = eVar4.f231c;
        if (i9 == 0) {
            i9 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i9, i);
        int i10 = absoluteGravity & 7;
        int i11 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i == 1) {
            i4 = width - i4;
        }
        int m9 = m(i4) - measuredWidth2;
        if (i10 == 1) {
            m9 += measuredWidth2 / 2;
        } else if (i10 == 5) {
            m9 += measuredWidth2;
        }
        int i12 = i11 != 16 ? i11 != 80 ? 0 : measuredHeight2 : measuredHeight2 / 2;
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar4).leftMargin, Math.min(m9, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) eVar4).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar4).topMargin, Math.min(i12, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) eVar4).bottomMargin));
        view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
    }

    public final boolean r(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f4645v;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            arrayList.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i4) : i4));
        }
        o oVar = f4630P;
        if (oVar != null) {
            Collections.sort(arrayList, oVar);
        }
        int size = arrayList.size();
        MotionEvent motionEvent2 = null;
        boolean z6 = false;
        for (int i6 = 0; i6 < size; i6++) {
            View view = (View) arrayList.get(i6);
            b bVar = ((e) view.getLayoutParams()).f229a;
            if (z6 && actionMasked != 0) {
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
            } else if (!z6 && bVar != null) {
                if (i == 0) {
                    z6 = bVar.f(this, view, motionEvent);
                } else if (i == 1) {
                    z6 = bVar.q(view, motionEvent);
                }
                if (z6) {
                    this.f4634C = view;
                }
            }
        }
        arrayList.clear();
        return z6;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z6) {
        b bVar = ((e) view.getLayoutParams()).f229a;
        if (bVar != null) {
            bVar.l(this, view);
        }
        return super.requestChildRectangleOnScreen(view, rect, z6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z6) {
        super.requestDisallowInterceptTouchEvent(z6);
        if (!z6 || this.f4649z) {
            return;
        }
        t(false);
        this.f4649z = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0144, code lost:
    
        throw new java.lang.IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s() {
        N.c cVar;
        ArrayList arrayList = this.f4643n;
        arrayList.clear();
        i iVar = this.f4644u;
        k kVar = (k) iVar.f2918v;
        int i = kVar.f40276v;
        int i4 = 0;
        while (true) {
            cVar = (N.c) iVar.f2917u;
            if (i4 >= i) {
                break;
            }
            ArrayList arrayList2 = (ArrayList) kVar.l(i4);
            if (arrayList2 != null) {
                arrayList2.clear();
                cVar.c(arrayList2);
            }
            i4++;
        }
        kVar.clear();
        int childCount = getChildCount();
        int i6 = 0;
        loop1: while (true) {
            k kVar2 = (k) iVar.f2918v;
            if (i6 >= childCount) {
                ArrayList arrayList3 = (ArrayList) iVar.f2919w;
                arrayList3.clear();
                HashSet hashSet = (HashSet) iVar.f2920x;
                hashSet.clear();
                int i9 = kVar2.f40276v;
                for (int i10 = 0; i10 < i9; i10++) {
                    iVar.a(kVar2.h(i10), arrayList3, hashSet);
                }
                arrayList.addAll(arrayList3);
                Collections.reverse(arrayList);
                return;
            }
            View childAt = getChildAt(i6);
            e n9 = n(childAt);
            int i11 = n9.f234f;
            if (i11 == -1) {
                n9.f239l = null;
                n9.f238k = null;
            } else {
                View view = n9.f238k;
                if (view != null && view.getId() == i11) {
                    View view2 = n9.f238k;
                    for (ViewParent parent = view2.getParent(); parent != this; parent = parent.getParent()) {
                        if (parent == null || parent == childAt) {
                            n9.f239l = null;
                            n9.f238k = null;
                        } else {
                            if (parent instanceof View) {
                                view2 = parent;
                            }
                        }
                    }
                    n9.f239l = view2;
                }
                View findViewById = findViewById(i11);
                n9.f238k = findViewById;
                if (findViewById == null) {
                    if (!isInEditMode()) {
                        throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + getResources().getResourceName(i11) + " to anchor view " + childAt);
                    }
                    n9.f239l = null;
                    n9.f238k = null;
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
                            n9.f239l = null;
                            n9.f238k = null;
                        }
                    }
                    n9.f239l = findViewById;
                } else {
                    if (!isInEditMode()) {
                        throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                    }
                    n9.f239l = null;
                    n9.f238k = null;
                }
            }
            if (!kVar2.containsKey(childAt)) {
                kVar2.put(childAt, null);
            }
            for (int i12 = 0; i12 < childCount; i12++) {
                if (i12 != i6) {
                    View childAt2 = getChildAt(i12);
                    if (childAt2 != n9.f239l) {
                        WeakHashMap weakHashMap = X.f2142a;
                        int layoutDirection = getLayoutDirection();
                        int absoluteGravity = Gravity.getAbsoluteGravity(((e) childAt2.getLayoutParams()).f235g, layoutDirection);
                        if (absoluteGravity == 0 || (Gravity.getAbsoluteGravity(n9.f236h, layoutDirection) & absoluteGravity) != absoluteGravity) {
                            b bVar = n9.f229a;
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
            i6++;
        }
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z6) {
        super.setFitsSystemWindows(z6);
        w();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.J = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f4640I;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f4640I = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f4640I.setState(getDrawableState());
                }
                Drawable drawable3 = this.f4640I;
                WeakHashMap weakHashMap = X.f2142a;
                H.b.b(drawable3, getLayoutDirection());
                this.f4640I.setVisible(getVisibility() == 0, false);
                this.f4640I.setCallback(this);
            }
            WeakHashMap weakHashMap2 = X.f2142a;
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
        boolean z6 = i == 0;
        Drawable drawable = this.f4640I;
        if (drawable == null || drawable.isVisible() == z6) {
            return;
        }
        this.f4640I.setVisible(z6, false);
    }

    public final void t(boolean z6) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            b bVar = ((e) childAt.getLayoutParams()).f229a;
            if (bVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z6) {
                    bVar.f(this, childAt, obtain);
                } else {
                    bVar.q(childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            ((e) getChildAt(i4).getLayoutParams()).getClass();
        }
        this.f4634C = null;
        this.f4649z = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f4640I;
    }

    public final void w() {
        WeakHashMap weakHashMap = X.f2142a;
        if (!getFitsSystemWindows()) {
            L.u(this, null);
            return;
        }
        if (this.f4641K == null) {
            this.f4641K = new j(2, this);
        }
        L.u(this, this.f4641K);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }
}
