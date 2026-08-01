package androidx.coordinatorlayout.widget;

import A.a;
import B.b;
import B.d;
import B.e;
import B.f;
import B.g;
import B.i;
import B.j;
import B.k;
import B.l;
import N.c;
import O.AbstractC0049z;
import O.B;
import O.C0038n;
import O.InterfaceC0036l;
import O.InterfaceC0037m;
import O.K;
import O.j0;
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
import androidx.recyclerview.widget.RecyclerView;
import com.lumenpath.harispro.hrnavigator.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.WeakHashMap;
import r.C0342j;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC0036l, InterfaceC0037m {

    /* renamed from: t, reason: collision with root package name */
    public static final String f1902t;

    /* renamed from: u, reason: collision with root package name */
    public static final Class[] f1903u;

    /* renamed from: v, reason: collision with root package name */
    public static final ThreadLocal f1904v;

    /* renamed from: w, reason: collision with root package name */
    public static final j f1905w;

    /* renamed from: x, reason: collision with root package name */
    public static final c f1906x;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1907a;

    /* renamed from: b, reason: collision with root package name */
    public final k f1908b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1909c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f1910d;
    public final int[] e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f1911f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1912g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1913h;
    public final int[] i;
    public View j;

    /* renamed from: k, reason: collision with root package name */
    public View f1914k;

    /* renamed from: l, reason: collision with root package name */
    public g f1915l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1916m;

    /* renamed from: n, reason: collision with root package name */
    public j0 f1917n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1918o;

    /* renamed from: p, reason: collision with root package name */
    public Drawable f1919p;

    /* renamed from: q, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f1920q;

    /* renamed from: r, reason: collision with root package name */
    public b f1921r;

    /* renamed from: s, reason: collision with root package name */
    public final C0038n f1922s;

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        f1902t = r02 != null ? r02.getName() : null;
        f1905w = new j(0);
        f1903u = new Class[]{Context.class, AttributeSet.class};
        f1904v = new ThreadLocal();
        f1906x = new c(12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.f1907a = new ArrayList();
        this.f1908b = new k(0);
        this.f1909c = new ArrayList();
        this.f1910d = new ArrayList();
        this.e = new int[2];
        this.f1911f = new int[2];
        this.f1922s = new C0038n();
        int[] iArr = a.f0a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.i = intArray;
            float f2 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i = 0; i < length; i++) {
                this.i[i] = (int) (r3[i] * f2);
            }
        }
        this.f1919p = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        w();
        super.setOnHierarchyChangeListener(new e(this));
        WeakHashMap weakHashMap = K.f747a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static Rect d() {
        Rect rect = (Rect) f1906x.a();
        return rect == null ? new Rect() : rect;
    }

    public static void l(int i, Rect rect, Rect rect2, f fVar, int i2, int i3) {
        int i4 = fVar.f14c;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = fVar.f15d;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & 112) == 0) {
            i5 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        int width = i8 != 1 ? i8 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i9 != 16 ? i9 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i6 == 1) {
            width -= i2 / 2;
        } else if (i6 != 5) {
            width -= i2;
        }
        if (i7 == 16) {
            height -= i3 / 2;
        } else if (i7 != 80) {
            height -= i3;
        }
        rect2.set(width, height, i2 + width, i3 + height);
    }

    public static f n(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.f13b) {
            d dVar = null;
            for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                dVar = (d) cls.getAnnotation(d.class);
                if (dVar != null) {
                    break;
                }
            }
            if (dVar != null) {
                try {
                    B.c cVar = (B.c) dVar.value().getDeclaredConstructor(null).newInstance(null);
                    B.c cVar2 = fVar.f12a;
                    if (cVar2 != cVar) {
                        if (cVar2 != null) {
                            cVar2.i();
                        }
                        fVar.f12a = cVar;
                        fVar.f13b = true;
                        if (cVar != null) {
                            cVar.g(fVar);
                        }
                    }
                } catch (Exception e) {
                    Log.e("CoordinatorLayout", "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                }
            }
            fVar.f13b = true;
        }
        return fVar;
    }

    public static void u(View view, int i) {
        f fVar = (f) view.getLayoutParams();
        int i2 = fVar.i;
        if (i2 != i) {
            WeakHashMap weakHashMap = K.f747a;
            view.offsetLeftAndRight(i - i2);
            fVar.i = i;
        }
    }

    public static void v(View view, int i) {
        f fVar = (f) view.getLayoutParams();
        int i2 = fVar.j;
        if (i2 != i) {
            WeakHashMap weakHashMap = K.f747a;
            view.offsetTopAndBottom(i - i2);
            fVar.j = i;
        }
    }

    @Override // O.InterfaceC0036l
    public final void a(View view, View view2, int i, int i2) {
        C0038n c0038n = this.f1922s;
        if (i2 == 1) {
            c0038n.f826b = i;
        } else {
            c0038n.f825a = i;
        }
        this.f1914k = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ((f) getChildAt(i3).getLayoutParams()).getClass();
        }
    }

    @Override // O.InterfaceC0037m
    public final void b(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        B.c cVar;
        int childCount = getChildCount();
        boolean z2 = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(i5) && (cVar = fVar.f12a) != null) {
                    int[] iArr2 = this.e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.o(this, childAt, i2, i3, i4, iArr2);
                    i6 = i3 > 0 ? Math.max(i6, iArr2[0]) : Math.min(i6, iArr2[0]);
                    i7 = i4 > 0 ? Math.max(i7, iArr2[1]) : Math.min(i7, iArr2[1]);
                    z2 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i6;
        iArr[1] = iArr[1] + i7;
        if (z2) {
            p(1);
        }
    }

    @Override // O.InterfaceC0036l
    public final void c(View view, int i, int i2, int i3, int i4, int i5) {
        b(view, i, i2, i3, i4, 0, this.f1911f);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        B.c cVar = ((f) view.getLayoutParams()).f12a;
        if (cVar != null) {
            cVar.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1919p;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // O.InterfaceC0036l
    public final void e(View view, int i) {
        C0038n c0038n = this.f1922s;
        if (i == 1) {
            c0038n.f826b = 0;
        } else {
            c0038n.f825a = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.a(i)) {
                B.c cVar = fVar.f12a;
                if (cVar != null) {
                    cVar.t(childAt, view, i);
                }
                if (i == 0) {
                    fVar.f21m = false;
                } else if (i == 1) {
                    fVar.f22n = false;
                }
            }
        }
        this.f1914k = null;
    }

    @Override // O.InterfaceC0036l
    public final void f(View view, int i, int i2, int[] iArr, int i3) {
        B.c cVar;
        int childCount = getChildCount();
        boolean z2 = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(i3) && (cVar = fVar.f12a) != null) {
                    int[] iArr2 = this.e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.n(this, childAt, view, i, i2, iArr2, i3);
                    i4 = i > 0 ? Math.max(i4, iArr2[0]) : Math.min(i4, iArr2[0]);
                    i5 = i2 > 0 ? Math.max(i5, iArr2[1]) : Math.min(i5, iArr2[1]);
                    z2 = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z2) {
            p(1);
        }
    }

    @Override // O.InterfaceC0036l
    public final boolean g(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                B.c cVar = fVar.f12a;
                if (cVar != null) {
                    boolean s2 = cVar.s(childAt, i, i2);
                    z2 |= s2;
                    if (i2 == 0) {
                        fVar.f21m = s2;
                    } else if (i2 == 1) {
                        fVar.f22n = s2;
                    }
                } else if (i2 == 0) {
                    fVar.f21m = false;
                } else if (i2 == 1) {
                    fVar.f22n = false;
                }
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        s();
        return Collections.unmodifiableList(this.f1907a);
    }

    public final j0 getLastWindowInsets() {
        return this.f1917n;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0038n c0038n = this.f1922s;
        return c0038n.f826b | c0038n.f825a;
    }

    public Drawable getStatusBarBackground() {
        return this.f1919p;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void h(f fVar, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    public final void i(View view, Rect rect, boolean z2) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z2) {
            k(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final ArrayList j(View view) {
        C0342j c0342j = (C0342j) this.f1908b.f29b;
        int i = c0342j.f4322c;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) c0342j.i(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c0342j.f(i2));
            }
        }
        ArrayList arrayList3 = this.f1910d;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void k(View view, Rect rect) {
        ThreadLocal threadLocal = l.f32a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = l.f32a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        l.a(this, view, matrix);
        ThreadLocal threadLocal3 = l.f33b;
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
        int[] iArr = this.i;
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

    public final boolean o(View view, int i, int i2) {
        c cVar = f1906x;
        Rect d2 = d();
        k(view, d2);
        try {
            return d2.contains(i, i2);
        } finally {
            d2.setEmpty();
            cVar.c(d2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t(false);
        if (this.f1916m) {
            if (this.f1915l == null) {
                this.f1915l = new g(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f1915l);
        }
        if (this.f1917n == null) {
            WeakHashMap weakHashMap = K.f747a;
            if (getFitsSystemWindows()) {
                AbstractC0049z.c(this);
            }
        }
        this.f1913h = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t(false);
        if (this.f1916m && this.f1915l != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f1915l);
        }
        View view = this.f1914k;
        if (view != null) {
            e(view, 0);
        }
        this.f1913h = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f1918o || this.f1919p == null) {
            return;
        }
        j0 j0Var = this.f1917n;
        int d2 = j0Var != null ? j0Var.d() : 0;
        if (d2 > 0) {
            this.f1919p.setBounds(0, 0, getWidth(), d2);
            this.f1919p.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            t(true);
        }
        boolean r2 = r(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            t(true);
        }
        return r2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        B.c cVar;
        WeakHashMap weakHashMap = K.f747a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.f1907a;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList.get(i5);
            if (view.getVisibility() != 8 && ((cVar = ((f) view.getLayoutParams()).f12a) == null || !cVar.k(this, view, layoutDirection))) {
                q(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0186, code lost:
    
        if (r0.l(r32, r20, r25, r8, r26) == false) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0189  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        B.c cVar;
        int i9;
        ArrayList arrayList;
        int i10;
        boolean z3;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z4;
        int max;
        s();
        int childCount = getChildCount();
        int i17 = 0;
        loop0: while (true) {
            if (i17 >= childCount) {
                z2 = false;
                break;
            }
            View childAt = getChildAt(i17);
            C0342j c0342j = (C0342j) this.f1908b.f29b;
            int i18 = c0342j.f4322c;
            for (int i19 = 0; i19 < i18; i19++) {
                ArrayList arrayList2 = (ArrayList) c0342j.i(i19);
                if (arrayList2 != null && arrayList2.contains(childAt)) {
                    z2 = true;
                    break loop0;
                }
            }
            i17++;
        }
        if (z2 != this.f1916m) {
            if (z2) {
                if (this.f1913h) {
                    if (this.f1915l == null) {
                        this.f1915l = new g(this);
                    }
                    getViewTreeObserver().addOnPreDrawListener(this.f1915l);
                }
                this.f1916m = true;
            } else {
                if (this.f1913h && this.f1915l != null) {
                    getViewTreeObserver().removeOnPreDrawListener(this.f1915l);
                }
                this.f1916m = false;
            }
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        WeakHashMap weakHashMap = K.f747a;
        int layoutDirection = getLayoutDirection();
        boolean z5 = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i20 = paddingLeft + paddingRight;
        int i21 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        boolean z6 = this.f1917n != null && getFitsSystemWindows();
        ArrayList arrayList3 = this.f1907a;
        int size3 = arrayList3.size();
        int i22 = suggestedMinimumWidth;
        int i23 = suggestedMinimumHeight;
        int i24 = 0;
        int i25 = 0;
        while (i25 < size3) {
            View view = (View) arrayList3.get(i25);
            if (view.getVisibility() == 8) {
                i14 = i25;
                i9 = size3;
                arrayList = arrayList3;
                i12 = paddingLeft;
                i15 = paddingRight;
                i10 = layoutDirection;
                z4 = true;
                z3 = false;
            } else {
                f fVar = (f) view.getLayoutParams();
                int i26 = fVar.e;
                if (i26 < 0 || mode == 0) {
                    i3 = i24;
                    i4 = i25;
                } else {
                    int m2 = m(i26);
                    i3 = i24;
                    int i27 = fVar.f14c;
                    if (i27 == 0) {
                        i27 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i27, layoutDirection) & 7;
                    i4 = i25;
                    if ((absoluteGravity == 3 && !z5) || (absoluteGravity == 5 && z5)) {
                        max = Math.max(0, (size - paddingRight) - m2);
                    } else if ((absoluteGravity == 5 && !z5) || (absoluteGravity == 3 && z5)) {
                        max = Math.max(0, m2 - paddingLeft);
                    }
                    i5 = max;
                    if (z6 || view.getFitsSystemWindows()) {
                        i6 = i23;
                        i7 = i;
                        i8 = i2;
                    } else {
                        int c2 = this.f1917n.c() + this.f1917n.b();
                        i6 = i23;
                        int a2 = this.f1917n.a() + this.f1917n.d();
                        i7 = View.MeasureSpec.makeMeasureSpec(size - c2, mode);
                        i8 = View.MeasureSpec.makeMeasureSpec(size2 - a2, mode2);
                    }
                    cVar = fVar.f12a;
                    if (cVar == null) {
                        int i28 = i3;
                        i14 = i4;
                        z3 = false;
                        i12 = paddingLeft;
                        i13 = i28;
                        int i29 = i6;
                        i15 = paddingRight;
                        i16 = i29;
                        i10 = layoutDirection;
                        i11 = i22;
                        i9 = size3;
                        arrayList = arrayList3;
                    } else {
                        i9 = size3;
                        arrayList = arrayList3;
                        i10 = layoutDirection;
                        z3 = false;
                        i11 = i22;
                        int i30 = i4;
                        i12 = paddingLeft;
                        i13 = i3;
                        i14 = i30;
                        int i31 = i6;
                        i15 = paddingRight;
                        i16 = i31;
                    }
                    measureChildWithMargins(view, i7, i5, i8, 0);
                    int max2 = Math.max(i11, view.getMeasuredWidth() + i20 + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                    int max3 = Math.max(i16, view.getMeasuredHeight() + i21 + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                    i22 = max2;
                    i24 = View.combineMeasuredStates(i13, view.getMeasuredState());
                    i23 = max3;
                    z4 = true;
                }
                i5 = 0;
                if (z6) {
                }
                i6 = i23;
                i7 = i;
                i8 = i2;
                cVar = fVar.f12a;
                if (cVar == null) {
                }
                measureChildWithMargins(view, i7, i5, i8, 0);
                int max22 = Math.max(i11, view.getMeasuredWidth() + i20 + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                int max32 = Math.max(i16, view.getMeasuredHeight() + i21 + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                i22 = max22;
                i24 = View.combineMeasuredStates(i13, view.getMeasuredState());
                i23 = max32;
                z4 = true;
            }
            i25 = i14 + 1;
            paddingLeft = i12;
            paddingRight = i15;
            layoutDirection = i10;
            size3 = i9;
            arrayList3 = arrayList;
        }
        int i32 = i24;
        setMeasuredDimension(View.resolveSizeAndState(i22, i, (-16777216) & i32), View.resolveSizeAndState(i23, i2, i32 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(0)) {
                    B.c cVar = fVar.f12a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        B.c cVar;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(0) && (cVar = fVar.f12a) != null) {
                    z2 |= cVar.m(view);
                }
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        f(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        c(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        a(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.f1147a);
        SparseArray sparseArray = iVar.f26c;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            B.c cVar = n(childAt).f12a;
            if (id != -1 && cVar != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                cVar.q(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable r2;
        i iVar = new i(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            B.c cVar = ((f) childAt.getLayoutParams()).f12a;
            if (id != -1 && cVar != null && (r2 = cVar.r(childAt)) != null) {
                sparseArray.append(id, r2);
            }
        }
        iVar.f26c = sparseArray;
        return iVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return g(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        e(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r3 != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        boolean u2;
        MotionEvent motionEvent2;
        int actionMasked = motionEvent.getActionMasked();
        if (this.j == null) {
            z2 = r(motionEvent, 1);
        } else {
            z2 = false;
        }
        B.c cVar = ((f) this.j.getLayoutParams()).f12a;
        if (cVar != null) {
            u2 = cVar.u(this.j, motionEvent);
            motionEvent2 = null;
            if (this.j != null) {
                u2 |= super.onTouchEvent(motionEvent);
            } else if (z2) {
                long uptimeMillis = SystemClock.uptimeMillis();
                motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, RecyclerView.f2111C0, RecyclerView.f2111C0, 0);
                super.onTouchEvent(motionEvent2);
            }
            if (motionEvent2 != null) {
                motionEvent2.recycle();
            }
            if (actionMasked != 1 || actionMasked == 3) {
                t(false);
            }
            return u2;
        }
        u2 = false;
        motionEvent2 = null;
        if (this.j != null) {
        }
        if (motionEvent2 != null) {
        }
        if (actionMasked != 1) {
        }
        t(false);
        return u2;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x004b A[EDGE_INSN: B:114:0x004b->B:9:0x004b BREAK  A[LOOP:2: B:106:0x02db->B:112:0x02f2], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(int i) {
        int i2;
        Rect rect;
        int i3;
        Rect rect2;
        int i4;
        Rect rect3;
        int i5;
        int i6;
        ArrayList arrayList;
        boolean z2;
        int i7;
        int i8;
        int width;
        int i9;
        int i10;
        int i11;
        int height;
        int i12;
        int i13;
        int i14;
        f fVar;
        int i15;
        c cVar;
        int i16;
        Rect rect4;
        Rect rect5;
        Rect rect6;
        ArrayList arrayList2;
        int i17;
        B.c cVar2;
        int i18 = i;
        WeakHashMap weakHashMap = K.f747a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList3 = this.f1907a;
        int size = arrayList3.size();
        Rect d2 = d();
        Rect d3 = d();
        Rect d4 = d();
        int i19 = 0;
        while (true) {
            c cVar3 = f1906x;
            if (i19 >= size) {
                Rect rect7 = d4;
                Rect rect8 = d3;
                Rect rect9 = d2;
                rect9.setEmpty();
                cVar3.c(rect9);
                rect8.setEmpty();
                cVar3.c(rect8);
                rect7.setEmpty();
                cVar3.c(rect7);
                return;
            }
            View view = (View) arrayList3.get(i19);
            f fVar2 = (f) view.getLayoutParams();
            if (i18 == 0 && view.getVisibility() == 8) {
                i4 = i18;
                i3 = layoutDirection;
                i2 = i19;
                rect3 = d4;
                rect = d3;
                rect2 = d2;
                arrayList = arrayList3;
                i6 = size;
            } else {
                int i20 = 0;
                while (i20 < i19) {
                    if (fVar2.f20l == ((View) arrayList3.get(i20))) {
                        f fVar3 = (f) view.getLayoutParams();
                        if (fVar3.f19k != null) {
                            Rect d5 = d();
                            Rect d6 = d();
                            arrayList2 = arrayList3;
                            Rect d7 = d();
                            k(fVar3.f19k, d5);
                            i(view, d6, false);
                            i17 = size;
                            int measuredWidth = view.getMeasuredWidth();
                            int measuredHeight = view.getMeasuredHeight();
                            fVar = fVar2;
                            cVar = cVar3;
                            i16 = i19;
                            i15 = layoutDirection;
                            rect4 = d4;
                            rect5 = d3;
                            rect6 = d2;
                            l(layoutDirection, d5, d7, fVar3, measuredWidth, measuredHeight);
                            boolean z3 = (d7.left == d6.left && d7.top == d6.top) ? false : true;
                            h(fVar3, d7, measuredWidth, measuredHeight);
                            int i21 = d7.left - d6.left;
                            int i22 = d7.top - d6.top;
                            if (i21 != 0) {
                                WeakHashMap weakHashMap2 = K.f747a;
                                view.offsetLeftAndRight(i21);
                            }
                            if (i22 != 0) {
                                WeakHashMap weakHashMap3 = K.f747a;
                                view.offsetTopAndBottom(i22);
                            }
                            if (z3 && (cVar2 = fVar3.f12a) != null) {
                                cVar2.h(this, view, fVar3.f19k);
                            }
                            d5.setEmpty();
                            cVar.c(d5);
                            d6.setEmpty();
                            cVar.c(d6);
                            d7.setEmpty();
                            cVar.c(d7);
                            i20++;
                            cVar3 = cVar;
                            size = i17;
                            arrayList3 = arrayList2;
                            layoutDirection = i15;
                            fVar2 = fVar;
                            i19 = i16;
                            d4 = rect4;
                            d3 = rect5;
                            d2 = rect6;
                        }
                    }
                    fVar = fVar2;
                    i15 = layoutDirection;
                    cVar = cVar3;
                    i16 = i19;
                    rect4 = d4;
                    rect5 = d3;
                    rect6 = d2;
                    arrayList2 = arrayList3;
                    i17 = size;
                    i20++;
                    cVar3 = cVar;
                    size = i17;
                    arrayList3 = arrayList2;
                    layoutDirection = i15;
                    fVar2 = fVar;
                    i19 = i16;
                    d4 = rect4;
                    d3 = rect5;
                    d2 = rect6;
                }
                f fVar4 = fVar2;
                int i23 = layoutDirection;
                N.b bVar = cVar3;
                i2 = i19;
                Rect rect10 = d4;
                rect = d3;
                Rect rect11 = d2;
                ArrayList arrayList4 = arrayList3;
                int i24 = size;
                i(view, rect, true);
                if (fVar4.f17g == 0 || rect.isEmpty()) {
                    i3 = i23;
                    rect2 = rect11;
                } else {
                    i3 = i23;
                    int absoluteGravity = Gravity.getAbsoluteGravity(fVar4.f17g, i3);
                    int i25 = absoluteGravity & 112;
                    if (i25 == 48) {
                        rect2 = rect11;
                        rect2.top = Math.max(rect2.top, rect.bottom);
                    } else if (i25 != 80) {
                        rect2 = rect11;
                    } else {
                        rect2 = rect11;
                        rect2.bottom = Math.max(rect2.bottom, getHeight() - rect.top);
                    }
                    int i26 = absoluteGravity & 7;
                    if (i26 == 3) {
                        rect2.left = Math.max(rect2.left, rect.right);
                    } else if (i26 == 5) {
                        rect2.right = Math.max(rect2.right, getWidth() - rect.left);
                    }
                }
                if (fVar4.f18h != 0 && view.getVisibility() == 0) {
                    WeakHashMap weakHashMap4 = K.f747a;
                    if (view.isLaidOut() && view.getWidth() > 0 && view.getHeight() > 0) {
                        f fVar5 = (f) view.getLayoutParams();
                        B.c cVar4 = fVar5.f12a;
                        Rect d8 = d();
                        Rect d9 = d();
                        d9.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                        if (cVar4 == null || !cVar4.e(view)) {
                            d8.set(d9);
                        } else if (!d9.contains(d8)) {
                            throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + d8.toShortString() + " | Bounds:" + d9.toShortString());
                        }
                        d9.setEmpty();
                        bVar.c(d9);
                        if (!d8.isEmpty()) {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(fVar5.f18h, i3);
                            if ((absoluteGravity2 & 48) != 48 || (i13 = (d8.top - ((ViewGroup.MarginLayoutParams) fVar5).topMargin) - fVar5.j) >= (i14 = rect2.top)) {
                                z2 = false;
                            } else {
                                v(view, i14 - i13);
                                z2 = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - d8.bottom) - ((ViewGroup.MarginLayoutParams) fVar5).bottomMargin) + fVar5.j) < (i12 = rect2.bottom)) {
                                v(view, height - i12);
                                z2 = true;
                            }
                            if (z2) {
                                i7 = 0;
                            } else {
                                i7 = 0;
                                v(view, 0);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i10 = (d8.left - ((ViewGroup.MarginLayoutParams) fVar5).leftMargin) - fVar5.i) >= (i11 = rect2.left)) {
                                i8 = i7;
                            } else {
                                u(view, i11 - i10);
                                i8 = 1;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - d8.right) - ((ViewGroup.MarginLayoutParams) fVar5).rightMargin) + fVar5.i) < (i9 = rect2.right)) {
                                u(view, width - i9);
                                i8 = 1;
                            }
                            if (i8 == 0) {
                                u(view, i7);
                            }
                            d8.setEmpty();
                            bVar.c(d8);
                            i4 = i;
                            if (i4 == 2) {
                                rect3 = rect10;
                                rect3.set(((f) view.getLayoutParams()).f23o);
                                if (rect3.equals(rect)) {
                                    i6 = i24;
                                    arrayList = arrayList4;
                                } else {
                                    ((f) view.getLayoutParams()).f23o.set(rect);
                                }
                            } else {
                                rect3 = rect10;
                            }
                            i5 = i2 + 1;
                            i6 = i24;
                            while (true) {
                                arrayList = arrayList4;
                                if (i5 < i6) {
                                    break;
                                }
                                View view2 = (View) arrayList.get(i5);
                                B.c cVar5 = ((f) view2.getLayoutParams()).f12a;
                                if (cVar5 != null) {
                                    cVar5.f(view2);
                                }
                                i5++;
                                arrayList4 = arrayList;
                            }
                        } else {
                            d8.setEmpty();
                            bVar.c(d8);
                        }
                    }
                }
                i4 = i;
                if (i4 == 2) {
                }
                i5 = i2 + 1;
                i6 = i24;
                while (true) {
                    arrayList = arrayList4;
                    if (i5 < i6) {
                    }
                    i5++;
                    arrayList4 = arrayList;
                }
            }
            size = i6;
            i19 = i2 + 1;
            d3 = rect;
            i18 = i4;
            d4 = rect3;
            arrayList3 = arrayList;
            d2 = rect2;
            layoutDirection = i3;
        }
    }

    public final void q(View view, int i) {
        Rect d2;
        Rect d3;
        f fVar = (f) view.getLayoutParams();
        View view2 = fVar.f19k;
        if (view2 == null && fVar.f16f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        c cVar = f1906x;
        if (view2 != null) {
            d2 = d();
            d3 = d();
            try {
                k(view2, d2);
                f fVar2 = (f) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                l(i, d2, d3, fVar2, measuredWidth, measuredHeight);
                h(fVar2, d3, measuredWidth, measuredHeight);
                view.layout(d3.left, d3.top, d3.right, d3.bottom);
                return;
            } finally {
                d2.setEmpty();
                cVar.c(d2);
                d3.setEmpty();
                cVar.c(d3);
            }
        }
        int i2 = fVar.e;
        if (i2 < 0) {
            f fVar3 = (f) view.getLayoutParams();
            d2 = d();
            d2.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar3).bottomMargin);
            if (this.f1917n != null) {
                WeakHashMap weakHashMap = K.f747a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    d2.left = this.f1917n.b() + d2.left;
                    d2.top = this.f1917n.d() + d2.top;
                    d2.right -= this.f1917n.c();
                    d2.bottom -= this.f1917n.a();
                }
            }
            d3 = d();
            int i3 = fVar3.f14c;
            if ((i3 & 7) == 0) {
                i3 |= 8388611;
            }
            if ((i3 & 112) == 0) {
                i3 |= 48;
            }
            Gravity.apply(i3, view.getMeasuredWidth(), view.getMeasuredHeight(), d2, d3, i);
            view.layout(d3.left, d3.top, d3.right, d3.bottom);
            return;
        }
        f fVar4 = (f) view.getLayoutParams();
        int i4 = fVar4.f14c;
        if (i4 == 0) {
            i4 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = absoluteGravity & 7;
        int i6 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i == 1) {
            i2 = width - i2;
        }
        int m2 = m(i2) - measuredWidth2;
        if (i5 == 1) {
            m2 += measuredWidth2 / 2;
        } else if (i5 == 5) {
            m2 += measuredWidth2;
        }
        int i7 = i6 != 16 ? i6 != 80 ? 0 : measuredHeight2 : measuredHeight2 / 2;
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar4).leftMargin, Math.min(m2, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) fVar4).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar4).topMargin, Math.min(i7, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) fVar4).bottomMargin));
        view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
    }

    public final boolean r(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f1909c;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            arrayList.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        j jVar = f1905w;
        if (jVar != null) {
            Collections.sort(arrayList, jVar);
        }
        int size = arrayList.size();
        MotionEvent motionEvent2 = null;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) arrayList.get(i3);
            B.c cVar = ((f) view.getLayoutParams()).f12a;
            if (z2 && actionMasked != 0) {
                if (cVar != null) {
                    if (motionEvent2 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, RecyclerView.f2111C0, RecyclerView.f2111C0, 0);
                    }
                    if (i == 0) {
                        cVar.j(this, view, motionEvent2);
                    } else if (i == 1) {
                        cVar.u(view, motionEvent2);
                    }
                }
            } else if (!z2 && cVar != null) {
                if (i == 0) {
                    z2 = cVar.j(this, view, motionEvent);
                } else if (i == 1) {
                    z2 = cVar.u(view, motionEvent);
                }
                if (z2) {
                    this.j = view;
                }
            }
        }
        arrayList.clear();
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        B.c cVar = ((f) view.getLayoutParams()).f12a;
        if (cVar != null) {
            cVar.p(this, view);
        }
        return super.requestChildRectangleOnScreen(view, rect, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
        if (!z2 || this.f1912g) {
            return;
        }
        t(false);
        this.f1912g = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0144, code lost:
    
        throw new java.lang.IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s() {
        N.b bVar;
        ArrayList arrayList = this.f1907a;
        arrayList.clear();
        k kVar = this.f1908b;
        C0342j c0342j = (C0342j) kVar.f29b;
        int i = c0342j.f4322c;
        int i2 = 0;
        while (true) {
            bVar = (N.b) kVar.f28a;
            if (i2 >= i) {
                break;
            }
            ArrayList arrayList2 = (ArrayList) c0342j.i(i2);
            if (arrayList2 != null) {
                arrayList2.clear();
                bVar.c(arrayList2);
            }
            i2++;
        }
        c0342j.clear();
        int childCount = getChildCount();
        int i3 = 0;
        loop1: while (true) {
            C0342j c0342j2 = (C0342j) kVar.f29b;
            if (i3 >= childCount) {
                ArrayList arrayList3 = (ArrayList) kVar.f30c;
                arrayList3.clear();
                HashSet hashSet = (HashSet) kVar.f31d;
                hashSet.clear();
                int i4 = c0342j2.f4322c;
                for (int i5 = 0; i5 < i4; i5++) {
                    kVar.c(c0342j2.f(i5), arrayList3, hashSet);
                }
                arrayList.addAll(arrayList3);
                Collections.reverse(arrayList);
                return;
            }
            View childAt = getChildAt(i3);
            f n2 = n(childAt);
            int i6 = n2.f16f;
            if (i6 == -1) {
                n2.f20l = null;
                n2.f19k = null;
            } else {
                View view = n2.f19k;
                if (view != null && view.getId() == i6) {
                    View view2 = n2.f19k;
                    for (ViewParent parent = view2.getParent(); parent != this; parent = parent.getParent()) {
                        if (parent == null || parent == childAt) {
                            n2.f20l = null;
                            n2.f19k = null;
                        } else {
                            if (parent instanceof View) {
                                view2 = parent;
                            }
                        }
                    }
                    n2.f20l = view2;
                }
                View findViewById = findViewById(i6);
                n2.f19k = findViewById;
                if (findViewById == null) {
                    if (!isInEditMode()) {
                        throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + getResources().getResourceName(i6) + " to anchor view " + childAt);
                    }
                    n2.f20l = null;
                    n2.f19k = null;
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
                            n2.f20l = null;
                            n2.f19k = null;
                        }
                    }
                    n2.f20l = findViewById;
                } else {
                    if (!isInEditMode()) {
                        throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                    }
                    n2.f20l = null;
                    n2.f19k = null;
                }
            }
            if (!c0342j2.containsKey(childAt)) {
                c0342j2.put(childAt, null);
            }
            for (int i7 = 0; i7 < childCount; i7++) {
                if (i7 != i3) {
                    View childAt2 = getChildAt(i7);
                    if (childAt2 != n2.f20l) {
                        WeakHashMap weakHashMap = K.f747a;
                        int layoutDirection = getLayoutDirection();
                        int absoluteGravity = Gravity.getAbsoluteGravity(((f) childAt2.getLayoutParams()).f17g, layoutDirection);
                        if (absoluteGravity == 0 || (Gravity.getAbsoluteGravity(n2.f18h, layoutDirection) & absoluteGravity) != absoluteGravity) {
                            B.c cVar = n2.f12a;
                            if (cVar != null) {
                                cVar.f(childAt);
                            }
                        }
                    }
                    if (!c0342j2.containsKey(childAt2) && !c0342j2.containsKey(childAt2)) {
                        c0342j2.put(childAt2, null);
                    }
                    if (!c0342j2.containsKey(childAt2) || !c0342j2.containsKey(childAt)) {
                        break loop1;
                    }
                    ArrayList arrayList4 = (ArrayList) c0342j2.get(childAt2);
                    if (arrayList4 == null) {
                        arrayList4 = (ArrayList) bVar.a();
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        c0342j2.put(childAt2, arrayList4);
                    }
                    arrayList4.add(childAt);
                }
            }
            i3++;
        }
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z2) {
        super.setFitsSystemWindows(z2);
        w();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f1920q = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f1919p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f1919p = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f1919p.setState(getDrawableState());
                }
                Drawable drawable3 = this.f1919p;
                WeakHashMap weakHashMap = K.f747a;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.f1919p.setVisible(getVisibility() == 0, false);
                this.f1919p.setCallback(this);
            }
            WeakHashMap weakHashMap2 = K.f747a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? getContext().getDrawable(i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z2 = i == 0;
        Drawable drawable = this.f1919p;
        if (drawable == null || drawable.isVisible() == z2) {
            return;
        }
        this.f1919p.setVisible(z2, false);
    }

    public final void t(boolean z2) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            B.c cVar = ((f) childAt.getLayoutParams()).f12a;
            if (cVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, RecyclerView.f2111C0, RecyclerView.f2111C0, 0);
                if (z2) {
                    cVar.j(this, childAt, obtain);
                } else {
                    cVar.u(childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((f) getChildAt(i2).getLayoutParams()).getClass();
        }
        this.j = null;
        this.f1912g = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1919p;
    }

    public final void w() {
        WeakHashMap weakHashMap = K.f747a;
        if (!getFitsSystemWindows()) {
            B.l(this, null);
            return;
        }
        if (this.f1921r == null) {
            this.f1921r = new b(0, this);
        }
        B.l(this, this.f1921r);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof f ? new f((f) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new f((ViewGroup.MarginLayoutParams) layoutParams) : new f(layoutParams);
    }
}
