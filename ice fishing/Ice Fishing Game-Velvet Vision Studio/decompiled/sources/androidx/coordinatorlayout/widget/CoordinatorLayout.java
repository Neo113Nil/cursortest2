package androidx.coordinatorlayout.widget;

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
import com.gamericefishpro.space.R;
import com.gamericefishpro.space.c4.c;
import com.gamericefishpro.space.d4.b0;
import com.gamericefishpro.space.d4.d0;
import com.gamericefishpro.space.d4.l0;
import com.gamericefishpro.space.d4.m;
import com.gamericefishpro.space.d4.n;
import com.gamericefishpro.space.d4.o;
import com.gamericefishpro.space.d4.o1;
import com.gamericefishpro.space.o3.a;
import com.gamericefishpro.space.p3.b;
import com.gamericefishpro.space.p3.d;
import com.gamericefishpro.space.p3.e;
import com.gamericefishpro.space.p3.f;
import com.gamericefishpro.space.t.r0;
import com.gamericefishpro.space.u6.i;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements m, n {
    public static final String M;
    public static final Class[] N;
    public static final ThreadLocal O;
    public static final com.gamericefishpro.space.fa.m P;
    public static final c Q;
    public boolean A;
    public final int[] B;
    public View C;
    public View D;
    public d E;
    public boolean F;
    public o1 G;
    public boolean H;
    public Drawable I;
    public ViewGroup.OnHierarchyChangeListener J;
    public com.gamericefishpro.space.m.d K;
    public final o L;
    public final ArrayList d;
    public final i e;
    public final ArrayList i;
    public final ArrayList v;
    public final int[] w;
    public final int[] y;
    public boolean z;

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        M = r0 != null ? r0.getName() : null;
        P = new com.gamericefishpro.space.fa.m(3);
        N = new Class[]{Context.class, AttributeSet.class};
        O = new ThreadLocal();
        Q = new c();
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.d = new ArrayList();
        this.e = new i(5);
        this.i = new ArrayList();
        this.v = new ArrayList();
        this.w = new int[2];
        this.y = new int[2];
        this.L = new o();
        int[] iArr = a.a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.B = intArray;
            float f = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i = 0; i < length; i++) {
                int[] iArr2 = this.B;
                iArr2[i] = (int) (iArr2[i] * f);
            }
        }
        this.I = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        w();
        super.setOnHierarchyChangeListener(new com.gamericefishpro.space.a4.c(this));
        Field field = l0.a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static Rect d() {
        Rect rect = (Rect) Q.a();
        return rect == null ? new Rect() : rect;
    }

    public static void l(int i, Rect rect, Rect rect2, com.gamericefishpro.space.p3.c cVar, int i2, int i3) {
        int iWidth;
        int iHeight;
        int i4 = cVar.c;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = cVar.d;
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
        if (i8 != 1) {
            iWidth = i8 != 5 ? rect.left : rect.right;
        } else {
            iWidth = rect.left + (rect.width() / 2);
        }
        if (i9 != 16) {
            iHeight = i9 != 80 ? rect.top : rect.bottom;
        } else {
            iHeight = rect.top + (rect.height() / 2);
        }
        if (i6 == 1) {
            iWidth -= i2 / 2;
        } else if (i6 != 5) {
            iWidth -= i2;
        }
        if (i7 == 16) {
            iHeight -= i3 / 2;
        } else if (i7 != 80) {
            iHeight -= i3;
        }
        rect2.set(iWidth, iHeight, i2 + iWidth, i3 + iHeight);
    }

    public static com.gamericefishpro.space.p3.c n(View view) {
        com.gamericefishpro.space.p3.c cVar = (com.gamericefishpro.space.p3.c) view.getLayoutParams();
        if (!cVar.b) {
            b bVar = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                bVar = (b) superclass.getAnnotation(b.class);
                if (bVar != null) {
                    break;
                }
            }
            if (bVar != null) {
                try {
                    com.gamericefishpro.space.p3.a aVar = (com.gamericefishpro.space.p3.a) bVar.value().getDeclaredConstructor(null).newInstance(null);
                    com.gamericefishpro.space.p3.a aVar2 = cVar.a;
                    if (aVar2 != aVar) {
                        if (aVar2 != null) {
                            aVar2.e();
                        }
                        cVar.a = aVar;
                        cVar.b = true;
                        if (aVar != null) {
                            aVar.c(cVar);
                        }
                    }
                } catch (Exception e) {
                    Log.e("CoordinatorLayout", "Default behavior class " + bVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                }
            }
            cVar.b = true;
        }
        return cVar;
    }

    public static void u(View view, int i) {
        com.gamericefishpro.space.p3.c cVar = (com.gamericefishpro.space.p3.c) view.getLayoutParams();
        int i2 = cVar.i;
        if (i2 != i) {
            Field field = l0.a;
            view.offsetLeftAndRight(i - i2);
            cVar.i = i;
        }
    }

    public static void v(View view, int i) {
        com.gamericefishpro.space.p3.c cVar = (com.gamericefishpro.space.p3.c) view.getLayoutParams();
        int i2 = cVar.j;
        if (i2 != i) {
            Field field = l0.a;
            view.offsetTopAndBottom(i - i2);
            cVar.j = i;
        }
    }

    @Override // com.gamericefishpro.space.d4.m
    public final void a(View view, View view2, int i, int i2) {
        o oVar = this.L;
        if (i2 == 1) {
            oVar.b = i;
        } else {
            oVar.a = i;
        }
        this.D = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ((com.gamericefishpro.space.p3.c) getChildAt(i3).getLayoutParams()).getClass();
        }
    }

    @Override // com.gamericefishpro.space.d4.m
    public final void b(View view, int i) {
        o oVar = this.L;
        if (i == 1) {
            oVar.b = 0;
        } else {
            oVar.a = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            com.gamericefishpro.space.p3.c cVar = (com.gamericefishpro.space.p3.c) childAt.getLayoutParams();
            if (cVar.a(i)) {
                com.gamericefishpro.space.p3.a aVar = cVar.a;
                if (aVar != null) {
                    aVar.p(childAt, view, i);
                }
                if (i == 0) {
                    cVar.m = false;
                } else if (i == 1) {
                    cVar.n = false;
                }
            }
        }
        this.D = null;
    }

    @Override // com.gamericefishpro.space.d4.m
    public final void c(View view, int i, int i2, int[] iArr, int i3) {
        com.gamericefishpro.space.p3.a aVar;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                com.gamericefishpro.space.p3.c cVar = (com.gamericefishpro.space.p3.c) childAt.getLayoutParams();
                if (cVar.a(i3) && (aVar = cVar.a) != null) {
                    int[] iArr2 = this.w;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    aVar.j(this, childAt, view, i, i2, iArr2, i3);
                    iMax = i > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i2 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z) {
            p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof com.gamericefishpro.space.p3.c) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        com.gamericefishpro.space.p3.a aVar = ((com.gamericefishpro.space.p3.c) view.getLayoutParams()).a;
        if (aVar != null) {
            aVar.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.I;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    public final void e(com.gamericefishpro.space.p3.c cVar, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) cVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) cVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) cVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) cVar).bottomMargin));
        rect.set(iMax, iMax2, i + iMax, i2 + iMax2);
    }

    @Override // com.gamericefishpro.space.d4.n
    public final void f(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        com.gamericefishpro.space.p3.a aVar;
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        boolean z = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                com.gamericefishpro.space.p3.c cVar = (com.gamericefishpro.space.p3.c) childAt.getLayoutParams();
                if (cVar.a(i5) && (aVar = cVar.a) != null) {
                    int[] iArr2 = this.w;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    aVar.k(this, childAt, i2, i3, i4, iArr2);
                    iMax = i3 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i4 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z) {
            p(1);
        }
    }

    @Override // com.gamericefishpro.space.d4.m
    public final void g(View view, int i, int i2, int i3, int i4, int i5) {
        f(view, i, i2, i3, i4, 0, this.y);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new com.gamericefishpro.space.p3.c();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new com.gamericefishpro.space.p3.c(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        s();
        return Collections.unmodifiableList(this.d);
    }

    public final o1 getLastWindowInsets() {
        return this.G;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        o oVar = this.L;
        return oVar.b | oVar.a;
    }

    public Drawable getStatusBarBackground() {
        return this.I;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    @Override // com.gamericefishpro.space.d4.m
    public final boolean h(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                com.gamericefishpro.space.p3.c cVar = (com.gamericefishpro.space.p3.c) childAt.getLayoutParams();
                com.gamericefishpro.space.p3.a aVar = cVar.a;
                if (aVar != null) {
                    boolean zO = aVar.o(childAt, i, i2);
                    z |= zO;
                    if (i2 == 0) {
                        cVar.m = zO;
                    } else if (i2 == 1) {
                        cVar.n = zO;
                    }
                } else if (i2 == 0) {
                    cVar.m = false;
                } else if (i2 == 1) {
                    cVar.n = false;
                }
            }
        }
        return z;
    }

    public final void i(View view, Rect rect, boolean z) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            k(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final ArrayList j(View view) {
        r0 r0Var = (r0) this.e.b;
        int i = r0Var.i;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) r0Var.i(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(r0Var.f(i2));
            }
        }
        ArrayList arrayList3 = this.v;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void k(View view, Rect rect) {
        ThreadLocal threadLocal = f.a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = f.a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        f.a(this, view, matrix);
        ThreadLocal threadLocal3 = f.b;
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
        int[] iArr = this.B;
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
        c cVar = Q;
        Rect rectD = d();
        k(view, rectD);
        try {
            return rectD.contains(i, i2);
        } finally {
            rectD.setEmpty();
            cVar.c(rectD);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t(false);
        if (this.F) {
            if (this.E == null) {
                this.E = new d(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.E);
        }
        if (this.G == null) {
            Field field = l0.a;
            if (getFitsSystemWindows()) {
                b0.c(this);
            }
        }
        this.A = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t(false);
        if (this.F && this.E != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.E);
        }
        View view = this.D;
        if (view != null) {
            b(view, 0);
        }
        this.A = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.H || this.I == null) {
            return;
        }
        o1 o1Var = this.G;
        int iA = o1Var != null ? o1Var.a() : 0;
        if (iA > 0) {
            this.I.setBounds(0, 0, getWidth(), iA);
            this.I.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            t(true);
        }
        boolean zR = r(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zR;
        }
        t(true);
        return zR;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        com.gamericefishpro.space.p3.a aVar;
        Field field = l0.a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList.get(i5);
            if (view.getVisibility() != 8 && ((aVar = ((com.gamericefishpro.space.p3.c) view.getLayoutParams()).a) == null || !aVar.g(this, view, layoutDirection))) {
                q(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x012e  */
    /* JADX WARN: Code duplicated, block: B:73:0x016b  */
    /* JADX WARN: Code duplicated, block: B:76:0x0175  */
    /* JADX WARN: Code duplicated, block: B:79:0x0194  */
    /* JADX WARN: Code duplicated, block: B:80:0x0197  */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        int i5;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        com.gamericefishpro.space.p3.a aVar;
        int i6;
        int i7;
        boolean z2;
        int i8;
        int i9;
        ArrayList arrayList;
        int i10;
        View view;
        int i11;
        boolean zH;
        int iMax;
        CoordinatorLayout coordinatorLayout = this;
        coordinatorLayout.s();
        int childCount = coordinatorLayout.getChildCount();
        int i12 = 0;
        loop0: while (true) {
            if (i12 >= childCount) {
                z = false;
                break;
            }
            View childAt = coordinatorLayout.getChildAt(i12);
            r0 r0Var = (r0) coordinatorLayout.e.b;
            int i13 = r0Var.i;
            for (int i14 = 0; i14 < i13; i14++) {
                ArrayList arrayList2 = (ArrayList) r0Var.i(i14);
                if (arrayList2 != null && arrayList2.contains(childAt)) {
                    z = true;
                    break loop0;
                }
            }
            i12++;
        }
        if (z != coordinatorLayout.F) {
            if (z) {
                if (coordinatorLayout.A) {
                    if (coordinatorLayout.E == null) {
                        coordinatorLayout.E = new d(coordinatorLayout);
                    }
                    coordinatorLayout.getViewTreeObserver().addOnPreDrawListener(coordinatorLayout.E);
                }
                coordinatorLayout.F = true;
            } else {
                if (coordinatorLayout.A && coordinatorLayout.E != null) {
                    coordinatorLayout.getViewTreeObserver().removeOnPreDrawListener(coordinatorLayout.E);
                }
                coordinatorLayout.F = false;
            }
        }
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        Field field = l0.a;
        int layoutDirection = coordinatorLayout.getLayoutDirection();
        boolean z3 = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i15 = paddingLeft + paddingRight;
        int i16 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        boolean z4 = coordinatorLayout.G != null && coordinatorLayout.getFitsSystemWindows();
        ArrayList arrayList3 = coordinatorLayout.d;
        int size3 = arrayList3.size();
        int i17 = 0;
        int iCombineMeasuredStates = 0;
        while (i17 < size3) {
            View view2 = (View) arrayList3.get(i17);
            int i18 = suggestedMinimumWidth;
            if (view2.getVisibility() == 8) {
                arrayList = arrayList3;
                i4 = size3;
                i11 = i17;
                i6 = paddingLeft;
                suggestedMinimumWidth = i18;
                z2 = false;
                i8 = paddingRight;
            } else {
                com.gamericefishpro.space.p3.c cVar = (com.gamericefishpro.space.p3.c) view2.getLayoutParams();
                int i19 = cVar.e;
                if (i19 < 0 || mode == 0) {
                    i3 = suggestedMinimumHeight;
                } else {
                    int iM = coordinatorLayout.m(i19);
                    int i20 = cVar.c;
                    if (i20 == 0) {
                        i20 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i20, layoutDirection) & 7;
                    i3 = suggestedMinimumHeight;
                    if ((absoluteGravity != 3 || z3) && !(absoluteGravity == 5 && z3)) {
                        if ((absoluteGravity == 5 && !z3) || (absoluteGravity == 3 && z3)) {
                            iMax = Math.max(0, iM - paddingLeft);
                        }
                        if (z4 || view2.getFitsSystemWindows()) {
                            iMakeMeasureSpec = i;
                            iMakeMeasureSpec2 = i2;
                        } else {
                            int i21 = coordinatorLayout.G.a.l().c + coordinatorLayout.G.a.l().a;
                            int iA = coordinatorLayout.G.a.l().d + coordinatorLayout.G.a();
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - i21, mode);
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iA, mode2);
                        }
                        aVar = cVar.a;
                        if (aVar != null) {
                            z2 = false;
                            i6 = paddingLeft;
                            i7 = i18;
                            i8 = paddingRight;
                            i9 = i3;
                            arrayList = arrayList3;
                            int i22 = iMakeMeasureSpec;
                            i11 = i17;
                            int i23 = iMakeMeasureSpec2;
                            zH = aVar.h(this, view2, i22, i5, i23);
                            view = view2;
                            iMakeMeasureSpec = i22;
                            i10 = i23;
                            if (zH) {
                                coordinatorLayout = this;
                            }
                            int iMax2 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) cVar).leftMargin + ((ViewGroup.MarginLayoutParams) cVar).rightMargin);
                            int iMax3 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) cVar).topMargin + ((ViewGroup.MarginLayoutParams) cVar).bottomMargin);
                            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                            suggestedMinimumWidth = iMax2;
                            suggestedMinimumHeight = iMax3;
                        } else {
                            i6 = paddingLeft;
                            i7 = i18;
                            z2 = false;
                            i8 = paddingRight;
                            i9 = i3;
                            arrayList = arrayList3;
                            i10 = iMakeMeasureSpec2;
                            view = view2;
                            i11 = i17;
                        }
                        coordinatorLayout = this;
                        coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i5, i10, 0);
                        int iMax4 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) cVar).leftMargin + ((ViewGroup.MarginLayoutParams) cVar).rightMargin);
                        int iMax5 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) cVar).topMargin + ((ViewGroup.MarginLayoutParams) cVar).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                        suggestedMinimumWidth = iMax4;
                        suggestedMinimumHeight = iMax5;
                    } else {
                        iMax = Math.max(0, (size - paddingRight) - iM);
                    }
                    int i24 = size3;
                    i5 = iMax;
                    i4 = i24;
                    if (z4) {
                        iMakeMeasureSpec = i;
                        iMakeMeasureSpec2 = i2;
                    } else {
                        iMakeMeasureSpec = i;
                        iMakeMeasureSpec2 = i2;
                    }
                    aVar = cVar.a;
                    if (aVar != null) {
                        z2 = false;
                        i6 = paddingLeft;
                        i7 = i18;
                        i8 = paddingRight;
                        i9 = i3;
                        arrayList = arrayList3;
                        int i25 = iMakeMeasureSpec;
                        i11 = i17;
                        int i26 = iMakeMeasureSpec2;
                        zH = aVar.h(this, view2, i25, i5, i26);
                        view = view2;
                        iMakeMeasureSpec = i25;
                        i10 = i26;
                        if (zH) {
                            coordinatorLayout = this;
                        }
                        int iMax6 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) cVar).leftMargin + ((ViewGroup.MarginLayoutParams) cVar).rightMargin);
                        int iMax7 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) cVar).topMargin + ((ViewGroup.MarginLayoutParams) cVar).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                        suggestedMinimumWidth = iMax6;
                        suggestedMinimumHeight = iMax7;
                    } else {
                        i6 = paddingLeft;
                        i7 = i18;
                        z2 = false;
                        i8 = paddingRight;
                        i9 = i3;
                        arrayList = arrayList3;
                        i10 = iMakeMeasureSpec2;
                        view = view2;
                        i11 = i17;
                    }
                    coordinatorLayout = this;
                    coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i5, i10, 0);
                    int iMax8 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) cVar).leftMargin + ((ViewGroup.MarginLayoutParams) cVar).rightMargin);
                    int iMax9 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) cVar).topMargin + ((ViewGroup.MarginLayoutParams) cVar).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    suggestedMinimumWidth = iMax8;
                    suggestedMinimumHeight = iMax9;
                }
                i4 = size3;
                i5 = 0;
                if (z4) {
                    iMakeMeasureSpec = i;
                    iMakeMeasureSpec2 = i2;
                } else {
                    iMakeMeasureSpec = i;
                    iMakeMeasureSpec2 = i2;
                }
                aVar = cVar.a;
                if (aVar != null) {
                    z2 = false;
                    i6 = paddingLeft;
                    i7 = i18;
                    i8 = paddingRight;
                    i9 = i3;
                    arrayList = arrayList3;
                    int i27 = iMakeMeasureSpec;
                    i11 = i17;
                    int i28 = iMakeMeasureSpec2;
                    zH = aVar.h(this, view2, i27, i5, i28);
                    view = view2;
                    iMakeMeasureSpec = i27;
                    i10 = i28;
                    if (zH) {
                        coordinatorLayout = this;
                    }
                    int iMax10 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) cVar).leftMargin + ((ViewGroup.MarginLayoutParams) cVar).rightMargin);
                    int iMax11 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) cVar).topMargin + ((ViewGroup.MarginLayoutParams) cVar).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    suggestedMinimumWidth = iMax10;
                    suggestedMinimumHeight = iMax11;
                } else {
                    i6 = paddingLeft;
                    i7 = i18;
                    z2 = false;
                    i8 = paddingRight;
                    i9 = i3;
                    arrayList = arrayList3;
                    i10 = iMakeMeasureSpec2;
                    view = view2;
                    i11 = i17;
                }
                coordinatorLayout = this;
                coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i5, i10, 0);
                int iMax12 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) cVar).leftMargin + ((ViewGroup.MarginLayoutParams) cVar).rightMargin);
                int iMax13 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) cVar).topMargin + ((ViewGroup.MarginLayoutParams) cVar).bottomMargin);
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                suggestedMinimumWidth = iMax12;
                suggestedMinimumHeight = iMax13;
            }
            i17 = i11 + 1;
            paddingLeft = i6;
            paddingRight = i8;
            size3 = i4;
            arrayList3 = arrayList;
        }
        int i29 = iCombineMeasuredStates;
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i, (-16777216) & i29), View.resolveSizeAndState(suggestedMinimumHeight, i2, i29 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                com.gamericefishpro.space.p3.c cVar = (com.gamericefishpro.space.p3.c) childAt.getLayoutParams();
                if (cVar.a(0)) {
                    com.gamericefishpro.space.p3.a aVar = cVar.a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        com.gamericefishpro.space.p3.a aVar;
        int childCount = getChildCount();
        boolean zI = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                com.gamericefishpro.space.p3.c cVar = (com.gamericefishpro.space.p3.c) childAt.getLayoutParams();
                if (cVar.a(0) && (aVar = cVar.a) != null) {
                    zI |= aVar.i(view);
                }
            }
        }
        return zI;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        c(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        g(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        a(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.d);
        SparseArray sparseArray = eVar.i;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            com.gamericefishpro.space.p3.a aVar = n(childAt).a;
            if (id != -1 && aVar != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                aVar.m(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableN;
        e eVar = new e(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            com.gamericefishpro.space.p3.a aVar = ((com.gamericefishpro.space.p3.c) childAt.getLayoutParams()).a;
            if (id != -1 && aVar != null && (parcelableN = aVar.n(childAt)) != null) {
                sparseArray.append(id, parcelableN);
            }
        }
        eVar.i = sparseArray;
        return eVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return h(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        b(view, 0);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0035 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015 A[PHI: r3
      0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0022, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zR;
        boolean zQ;
        MotionEvent motionEventObtain;
        int actionMasked = motionEvent.getActionMasked();
        if (this.C == null) {
            zR = r(motionEvent, 1);
            if (!zR) {
                zQ = false;
            }
            motionEventObtain = null;
            if (this.C == null) {
                zQ |= super.onTouchEvent(motionEvent);
            } else if (zR) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEventObtain);
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
            if (actionMasked == 1 && actionMasked != 3) {
                return zQ;
            }
            t(false);
            return zQ;
        }
        zR = false;
        com.gamericefishpro.space.p3.a aVar = ((com.gamericefishpro.space.p3.c) this.C.getLayoutParams()).a;
        if (aVar != null) {
            zQ = aVar.q(this.C, motionEvent);
        } else {
            zQ = false;
        }
        motionEventObtain = null;
        if (this.C == null) {
            zQ |= super.onTouchEvent(motionEvent);
        } else if (zR) {
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            motionEventObtain = MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 3, 0.0f, 0.0f, 0);
            super.onTouchEvent(motionEventObtain);
        }
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
        if (actionMasked == 1) {
        }
        t(false);
        return zQ;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x026c  */
    /* JADX WARN: Code duplicated, block: B:33:0x00de  */
    public final void p(int i) {
        int i2;
        Rect rect;
        int i3;
        ArrayList arrayList;
        boolean z;
        boolean z2;
        int width;
        int i4;
        int i5;
        int i6;
        int height;
        int i7;
        int i8;
        int i9;
        com.gamericefishpro.space.p3.c cVar;
        int i10;
        View view;
        com.gamericefishpro.space.p3.a aVar;
        Field field = l0.a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList2 = this.d;
        int size = arrayList2.size();
        Rect rectD = d();
        Rect rectD2 = d();
        Rect rectD3 = d();
        int i11 = 0;
        while (true) {
            c cVar2 = Q;
            if (i11 >= size) {
                Rect rect2 = rectD3;
                rectD.setEmpty();
                cVar2.c(rectD);
                rectD2.setEmpty();
                cVar2.c(rectD2);
                rect2.setEmpty();
                cVar2.c(rect2);
                return;
            }
            View view2 = (View) arrayList2.get(i11);
            com.gamericefishpro.space.p3.c cVar3 = (com.gamericefishpro.space.p3.c) view2.getLayoutParams();
            if (i == 0 && view2.getVisibility() == 8) {
                arrayList = arrayList2;
                i3 = size;
                rect = rectD3;
                i2 = i11;
            } else {
                int i12 = 0;
                while (i12 < i11) {
                    if (cVar3.l == ((View) arrayList2.get(i12))) {
                        com.gamericefishpro.space.p3.c cVar4 = (com.gamericefishpro.space.p3.c) view2.getLayoutParams();
                        if (cVar4.k != null) {
                            Rect rectD4 = d();
                            Rect rectD5 = d();
                            com.gamericefishpro.space.p3.c cVar5 = cVar3;
                            Rect rectD6 = d();
                            k(cVar4.k, rectD4);
                            i(view2, rectD5, false);
                            int measuredWidth = view2.getMeasuredWidth();
                            View view3 = view2;
                            int measuredHeight = view3.getMeasuredHeight();
                            cVar = cVar5;
                            i10 = i12;
                            layoutDirection = layoutDirection;
                            view = view3;
                            l(layoutDirection, rectD4, rectD6, cVar4, measuredWidth, measuredHeight);
                            boolean z3 = (rectD6.left == rectD5.left && rectD6.top == rectD5.top) ? false : true;
                            e(cVar4, rectD6, measuredWidth, measuredHeight);
                            int i13 = rectD6.left - rectD5.left;
                            int i14 = rectD6.top - rectD5.top;
                            if (i13 != 0) {
                                Field field2 = l0.a;
                                view.offsetLeftAndRight(i13);
                            }
                            if (i14 != 0) {
                                Field field3 = l0.a;
                                view.offsetTopAndBottom(i14);
                            }
                            if (z3 && (aVar = cVar4.a) != null) {
                                aVar.d(this, view, cVar4.k);
                            }
                            rectD4.setEmpty();
                            cVar2.c(rectD4);
                            rectD5.setEmpty();
                            cVar2.c(rectD5);
                            rectD6.setEmpty();
                            cVar2.c(rectD6);
                        } else {
                            cVar = cVar3;
                            i10 = i12;
                            view = view2;
                        }
                    } else {
                        cVar = cVar3;
                        i10 = i12;
                        view = view2;
                    }
                    i12 = i10 + 1;
                    cVar3 = cVar;
                    view2 = view;
                    arrayList2 = arrayList2;
                    size = size;
                    i11 = i11;
                    rectD3 = rectD3;
                }
                ArrayList arrayList3 = arrayList2;
                com.gamericefishpro.space.p3.c cVar6 = cVar3;
                int i15 = size;
                Rect rect3 = rectD3;
                i2 = i11;
                View view4 = view2;
                i(view4, rectD2, true);
                if (cVar6.g != 0 && !rectD2.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(cVar6.g, layoutDirection);
                    int i16 = absoluteGravity & 112;
                    if (i16 == 48) {
                        rectD.top = Math.max(rectD.top, rectD2.bottom);
                    } else if (i16 == 80) {
                        rectD.bottom = Math.max(rectD.bottom, getHeight() - rectD2.top);
                    }
                    int i17 = absoluteGravity & 7;
                    if (i17 == 3) {
                        rectD.left = Math.max(rectD.left, rectD2.right);
                    } else if (i17 == 5) {
                        rectD.right = Math.max(rectD.right, getWidth() - rectD2.left);
                    }
                }
                if (cVar6.h != 0 && view4.getVisibility() == 0) {
                    Field field4 = l0.a;
                    if (view4.isLaidOut() && view4.getWidth() > 0 && view4.getHeight() > 0) {
                        com.gamericefishpro.space.p3.c cVar7 = (com.gamericefishpro.space.p3.c) view4.getLayoutParams();
                        com.gamericefishpro.space.p3.a aVar2 = cVar7.a;
                        Rect rectD7 = d();
                        Rect rectD8 = d();
                        rectD8.set(view4.getLeft(), view4.getTop(), view4.getRight(), view4.getBottom());
                        if (aVar2 == null || !aVar2.a(view4)) {
                            rectD7.set(rectD8);
                        } else if (!rectD8.contains(rectD7)) {
                            throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectD7.toShortString() + " | Bounds:" + rectD8.toShortString());
                        }
                        rectD8.setEmpty();
                        cVar2.c(rectD8);
                        if (rectD7.isEmpty()) {
                            rectD7.setEmpty();
                            cVar2.c(rectD7);
                        } else {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(cVar7.h, layoutDirection);
                            if ((absoluteGravity2 & 48) != 48 || (i8 = (rectD7.top - ((ViewGroup.MarginLayoutParams) cVar7).topMargin) - cVar7.j) >= (i9 = rectD.top)) {
                                z = false;
                            } else {
                                v(view4, i9 - i8);
                                z = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - rectD7.bottom) - ((ViewGroup.MarginLayoutParams) cVar7).bottomMargin) + cVar7.j) < (i7 = rectD.bottom)) {
                                v(view4, height - i7);
                                z = true;
                            }
                            if (!z) {
                                v(view4, 0);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i5 = (rectD7.left - ((ViewGroup.MarginLayoutParams) cVar7).leftMargin) - cVar7.i) >= (i6 = rectD.left)) {
                                z2 = false;
                            } else {
                                u(view4, i6 - i5);
                                z2 = true;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - rectD7.right) - ((ViewGroup.MarginLayoutParams) cVar7).rightMargin) + cVar7.i) < (i4 = rectD.right)) {
                                u(view4, width - i4);
                                z2 = true;
                            }
                            if (!z2) {
                                u(view4, 0);
                            }
                            rectD7.setEmpty();
                            cVar2.c(rectD7);
                        }
                    }
                }
                if (i != 2) {
                    rect = rect3;
                    rect.set(((com.gamericefishpro.space.p3.c) view4.getLayoutParams()).o);
                    if (rect.equals(rectD2)) {
                        arrayList = arrayList3;
                        i3 = i15;
                    } else {
                        ((com.gamericefishpro.space.p3.c) view4.getLayoutParams()).o.set(rectD2);
                    }
                } else {
                    rect = rect3;
                }
                int i18 = i2 + 1;
                i3 = i15;
                while (true) {
                    arrayList = arrayList3;
                    if (i18 < i3) {
                        View view5 = (View) arrayList.get(i18);
                        com.gamericefishpro.space.p3.a aVar3 = ((com.gamericefishpro.space.p3.c) view5.getLayoutParams()).a;
                        if (aVar3 != null) {
                            aVar3.b(view5);
                        }
                        i18++;
                        arrayList3 = arrayList;
                    }
                }
            }
            i11 = i2 + 1;
            size = i3;
            rectD3 = rect;
            arrayList2 = arrayList;
        }
    }

    public final void q(View view, int i) {
        int i2;
        com.gamericefishpro.space.p3.c cVar = (com.gamericefishpro.space.p3.c) view.getLayoutParams();
        View view2 = cVar.k;
        if (view2 == null && cVar.f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        c cVar2 = Q;
        if (view2 != null) {
            Rect rectD = d();
            Rect rectD2 = d();
            try {
                k(view2, rectD);
                com.gamericefishpro.space.p3.c cVar3 = (com.gamericefishpro.space.p3.c) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                l(i, rectD, rectD2, cVar3, measuredWidth, measuredHeight);
                e(cVar3, rectD2, measuredWidth, measuredHeight);
                view.layout(rectD2.left, rectD2.top, rectD2.right, rectD2.bottom);
                return;
            } finally {
                rectD.setEmpty();
                cVar2.c(rectD);
                rectD2.setEmpty();
                cVar2.c(rectD2);
            }
        }
        int i3 = cVar.e;
        if (i3 < 0) {
            com.gamericefishpro.space.p3.c cVar4 = (com.gamericefishpro.space.p3.c) view.getLayoutParams();
            Rect rectD3 = d();
            rectD3.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) cVar4).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) cVar4).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) cVar4).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) cVar4).bottomMargin);
            if (this.G != null) {
                Field field = l0.a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rectD3.left = this.G.a.l().a + rectD3.left;
                    rectD3.top = this.G.a() + rectD3.top;
                    rectD3.right -= this.G.a.l().c;
                    rectD3.bottom -= this.G.a.l().d;
                }
            }
            Rect rectD4 = d();
            int i4 = cVar4.c;
            if ((i4 & 7) == 0) {
                i4 |= 8388611;
            }
            if ((i4 & 112) == 0) {
                i4 |= 48;
            }
            Gravity.apply(i4, view.getMeasuredWidth(), view.getMeasuredHeight(), rectD3, rectD4, i);
            view.layout(rectD4.left, rectD4.top, rectD4.right, rectD4.bottom);
            rectD3.setEmpty();
            cVar2.c(rectD3);
            rectD4.setEmpty();
            cVar2.c(rectD4);
            return;
        }
        com.gamericefishpro.space.p3.c cVar5 = (com.gamericefishpro.space.p3.c) view.getLayoutParams();
        int i5 = cVar5.c;
        if (i5 == 0) {
            i5 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i == 1) {
            i3 = width - i3;
        }
        int iM = m(i3) - measuredWidth2;
        if (i6 == 1) {
            iM += measuredWidth2 / 2;
        } else if (i6 == 5) {
            iM += measuredWidth2;
        }
        if (i7 != 16) {
            i2 = i7 != 80 ? 0 : measuredHeight2;
        } else {
            i2 = measuredHeight2 / 2;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) cVar5).leftMargin, Math.min(iM, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) cVar5).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) cVar5).topMargin, Math.min(i2, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) cVar5).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    public final boolean r(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.i;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        com.gamericefishpro.space.fa.m mVar = P;
        if (mVar != null) {
            Collections.sort(arrayList, mVar);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zF = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) arrayList.get(i3);
            com.gamericefishpro.space.p3.a aVar = ((com.gamericefishpro.space.p3.c) view.getLayoutParams()).a;
            if (zF && actionMasked != 0) {
                if (aVar != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i == 0) {
                        aVar.f(this, view, motionEventObtain);
                    } else if (i == 1) {
                        aVar.q(view, motionEventObtain);
                    }
                }
            } else if (!zF && aVar != null) {
                if (i == 0) {
                    zF = aVar.f(this, view, motionEvent);
                } else if (i == 1) {
                    zF = aVar.q(view, motionEvent);
                }
                if (zF) {
                    this.C = view;
                }
            }
        }
        arrayList.clear();
        return zF;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        com.gamericefishpro.space.p3.a aVar = ((com.gamericefishpro.space.p3.c) view.getLayoutParams()).a;
        if (aVar != null) {
            aVar.l(this, view);
        }
        return super.requestChildRectangleOnScreen(view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.z) {
            return;
        }
        t(false);
        this.z = true;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x007c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x007e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0084  */
    /* JADX WARN: Code duplicated, block: B:37:0x0091  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:38:0x0095
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void s() {
        /*
            Method dump skipped, instruction units count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.s():void");
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        w();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.J = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.I;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.I = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.I.setState(getDrawableState());
                }
                Drawable drawable3 = this.I;
                Field field = l0.a;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.I.setVisible(getVisibility() == 0, false);
                this.I.setCallback(this);
            }
            Field field2 = l0.a;
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
        boolean z = i == 0;
        Drawable drawable = this.I;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.I.setVisible(z, false);
    }

    public final void t(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            com.gamericefishpro.space.p3.a aVar = ((com.gamericefishpro.space.p3.c) childAt.getLayoutParams()).a;
            if (aVar != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    aVar.f(this, childAt, motionEventObtain);
                } else {
                    aVar.q(childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((com.gamericefishpro.space.p3.c) getChildAt(i2).getLayoutParams()).getClass();
        }
        this.C = null;
        this.z = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.I;
    }

    public final void w() {
        Field field = l0.a;
        if (!getFitsSystemWindows()) {
            d0.i(this, null);
            return;
        }
        if (this.K == null) {
            this.K = new com.gamericefishpro.space.m.d(17, this);
        }
        d0.i(this, this.K);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof com.gamericefishpro.space.p3.c) {
            return new com.gamericefishpro.space.p3.c((com.gamericefishpro.space.p3.c) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new com.gamericefishpro.space.p3.c((ViewGroup.MarginLayoutParams) layoutParams) : new com.gamericefishpro.space.p3.c(layoutParams);
    }
}
