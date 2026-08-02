package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
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
import androidx.annotation.NonNull;
import defpackage.c9n;
import defpackage.ciq;
import defpackage.den;
import defpackage.dhm;
import defpackage.dl4;
import defpackage.e7o;
import defpackage.ehm;
import defpackage.g06;
import defpackage.jj4;
import defpackage.kqv;
import defpackage.ldu;
import defpackage.myi;
import defpackage.ndu;
import defpackage.nyi;
import defpackage.peu;
import defpackage.tk6;
import defpackage.uk6;
import defpackage.vk6;
import defpackage.wdu;
import defpackage.wk6;
import defpackage.wp4;
import defpackage.xk6;
import defpackage.xq0;
import defpackage.yk6;
import defpackage.znk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.WeakHashMap;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements myi, nyi {
    public static final String t;
    public static final Class[] u;
    public static final ThreadLocal v;
    public static final dl4 w;
    public static final ehm x;
    public final ArrayList a;
    public final g06 b;
    public final ArrayList c;
    public Paint d;
    public final int[] e;
    public final int[] f;
    public boolean g;
    public boolean h;
    public final int[] i;
    public View j;
    public View k;
    public wp4 l;
    public boolean m;
    public kqv n;
    public boolean o;
    public Drawable p;
    public ViewGroup.OnHierarchyChangeListener q;
    public znk r;
    public final c9n s;

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        t = r0 != null ? r0.getName() : null;
        w = new dl4(15);
        u = new Class[]{Context.class, AttributeSet.class};
        v = new ThreadLocal();
        x = new ehm(12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CoordinatorLayout(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2;
        CoordinatorLayout coordinatorLayout;
        this.a = new ArrayList();
        this.b = new g06(11);
        this.c = new ArrayList();
        this.e = new int[2];
        this.f = new int[2];
        this.s = new c9n(9, (byte) (0 == true ? 1 : 0));
        int[] iArr = den.a;
        TypedArray obtainStyledAttributes = i == 0 ? context.obtainStyledAttributes(attributeSet, iArr, 0, R.style.Widget_Support_CoordinatorLayout) : context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        if (i == 0) {
            coordinatorLayout = this;
            context2 = context;
            wdu.p(coordinatorLayout, context2, iArr, attributeSet, obtainStyledAttributes, 0, R.style.Widget_Support_CoordinatorLayout);
        } else {
            context2 = context;
            coordinatorLayout = this;
            wdu.p(coordinatorLayout, context2, iArr, attributeSet, obtainStyledAttributes, i, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context2.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            coordinatorLayout.i = intArray;
            float f = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i2 = 0; i2 < length; i2++) {
                coordinatorLayout.i[i2] = (int) (r13[i2] * f);
            }
        }
        coordinatorLayout.p = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        J();
        super.setOnHierarchyChangeListener(new wk6(this));
        WeakHashMap weakHashMap = wdu.a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static void H(int i, View view) {
        xk6 xk6Var = (xk6) view.getLayoutParams();
        int i2 = xk6Var.i;
        if (i2 != i) {
            WeakHashMap weakHashMap = wdu.a;
            view.offsetLeftAndRight(i - i2);
            xk6Var.i = i;
        }
    }

    public static void I(int i, View view) {
        xk6 xk6Var = (xk6) view.getLayoutParams();
        int i2 = xk6Var.j;
        if (i2 != i) {
            WeakHashMap weakHashMap = wdu.a;
            view.offsetTopAndBottom(i - i2);
            xk6Var.j = i;
        }
    }

    public static Rect p() {
        Rect rect = (Rect) x.f();
        return rect == null ? new Rect() : rect;
    }

    public static void w(int i, Rect rect, Rect rect2, xk6 xk6Var, int i2, int i3) {
        int i4 = xk6Var.c;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = xk6Var.d;
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

    /* JADX WARN: Multi-variable type inference failed */
    public static xk6 y(View view) {
        xk6 xk6Var = (xk6) view.getLayoutParams();
        if (!xk6Var.b) {
            if (view instanceof tk6) {
                uk6 behavior = ((tk6) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                xk6Var.b(behavior);
                xk6Var.b = true;
                return xk6Var;
            }
            vk6 vk6Var = null;
            for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                vk6Var = (vk6) cls.getAnnotation(vk6.class);
                if (vk6Var != null) {
                    break;
                }
            }
            if (vk6Var != null) {
                try {
                    xk6Var.b((uk6) vk6Var.value().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception e) {
                    Log.e("CoordinatorLayout", "Default behavior class " + vk6Var.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                }
            }
            xk6Var.b = true;
        }
        return xk6Var;
    }

    public final void A(int i) {
        int i2;
        Rect rect;
        int i3;
        ArrayList arrayList;
        boolean z;
        boolean z2;
        boolean z3;
        int width;
        int i4;
        int i5;
        int i6;
        int height;
        int i7;
        int i8;
        int i9;
        ArrayList arrayList2;
        xk6 xk6Var;
        int i10;
        int i11;
        Rect rect2;
        int i12;
        View view;
        uk6 uk6Var;
        WeakHashMap weakHashMap = wdu.a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList3 = this.a;
        int size = arrayList3.size();
        Rect p = p();
        Rect p2 = p();
        Rect p3 = p();
        int i13 = 0;
        while (true) {
            ehm ehmVar = x;
            if (i13 >= size) {
                Rect rect3 = p3;
                p.setEmpty();
                ehmVar.c(p);
                p2.setEmpty();
                ehmVar.c(p2);
                rect3.setEmpty();
                ehmVar.c(rect3);
                return;
            }
            View view2 = (View) arrayList3.get(i13);
            xk6 xk6Var2 = (xk6) view2.getLayoutParams();
            if (i != 0 || view2.getVisibility() != 8) {
                int i14 = 0;
                while (i14 < i13) {
                    if (xk6Var2.l == ((View) arrayList3.get(i14))) {
                        xk6 xk6Var3 = (xk6) view2.getLayoutParams();
                        if (xk6Var3.k != null) {
                            Rect p4 = p();
                            Rect p5 = p();
                            xk6 xk6Var4 = xk6Var2;
                            Rect p6 = p();
                            v(p4, xk6Var3.k);
                            t(view2, p5, false);
                            int measuredWidth = view2.getMeasuredWidth();
                            View view3 = view2;
                            int measuredHeight = view3.getMeasuredHeight();
                            arrayList2 = arrayList3;
                            xk6Var = xk6Var4;
                            i10 = i14;
                            layoutDirection = layoutDirection;
                            i12 = i13;
                            view = view3;
                            w(layoutDirection, p4, p6, xk6Var3, measuredWidth, measuredHeight);
                            i11 = size;
                            rect2 = p3;
                            boolean z4 = (p6.left == p5.left && p6.top == p5.top) ? false : true;
                            q(xk6Var3, p6, measuredWidth, measuredHeight);
                            int i15 = p6.left - p5.left;
                            int i16 = p6.top - p5.top;
                            if (i15 != 0) {
                                WeakHashMap weakHashMap2 = wdu.a;
                                view.offsetLeftAndRight(i15);
                            }
                            if (i16 != 0) {
                                WeakHashMap weakHashMap3 = wdu.a;
                                view.offsetTopAndBottom(i16);
                            }
                            if (z4 && (uk6Var = xk6Var3.a) != null) {
                                uk6Var.onDependentViewChanged(this, view, xk6Var3.k);
                            }
                            p4.setEmpty();
                            ehmVar.c(p4);
                            p5.setEmpty();
                            ehmVar.c(p5);
                            p6.setEmpty();
                            ehmVar.c(p6);
                            i14 = i10 + 1;
                            xk6Var2 = xk6Var;
                            view2 = view;
                            arrayList3 = arrayList2;
                            size = i11;
                            i13 = i12;
                            p3 = rect2;
                        }
                    }
                    arrayList2 = arrayList3;
                    xk6Var = xk6Var2;
                    i10 = i14;
                    i11 = size;
                    rect2 = p3;
                    i12 = i13;
                    view = view2;
                    i14 = i10 + 1;
                    xk6Var2 = xk6Var;
                    view2 = view;
                    arrayList3 = arrayList2;
                    size = i11;
                    i13 = i12;
                    p3 = rect2;
                }
                ArrayList arrayList4 = arrayList3;
                xk6 xk6Var5 = xk6Var2;
                int i17 = size;
                Rect rect4 = p3;
                i2 = i13;
                View view4 = view2;
                t(view4, p2, true);
                if (xk6Var5.g != 0 && !p2.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(xk6Var5.g, layoutDirection);
                    int i18 = absoluteGravity & 112;
                    if (i18 == 48) {
                        p.top = Math.max(p.top, p2.bottom);
                    } else if (i18 == 80) {
                        p.bottom = Math.max(p.bottom, getHeight() - p2.top);
                    }
                    int i19 = absoluteGravity & 7;
                    if (i19 == 3) {
                        p.left = Math.max(p.left, p2.right);
                    } else if (i19 == 5) {
                        p.right = Math.max(p.right, getWidth() - p2.left);
                    }
                }
                if (xk6Var5.h != 0 && view4.getVisibility() == 0) {
                    WeakHashMap weakHashMap4 = wdu.a;
                    if (view4.isLaidOut() && view4.getWidth() > 0 && view4.getHeight() > 0) {
                        xk6 xk6Var6 = (xk6) view4.getLayoutParams();
                        uk6 uk6Var2 = xk6Var6.a;
                        Rect p7 = p();
                        Rect p8 = p();
                        p8.set(view4.getLeft(), view4.getTop(), view4.getRight(), view4.getBottom());
                        if (uk6Var2 == null || !uk6Var2.getInsetDodgeRect(this, view4, p7)) {
                            p7.set(p8);
                        } else if (!p8.contains(p7)) {
                            jj4.k("Rect should be within the child's bounds. Rect:", p7.toShortString(), " | Bounds:", p8.toShortString());
                            return;
                        }
                        p8.setEmpty();
                        ehmVar.c(p8);
                        if (p7.isEmpty()) {
                            p7.setEmpty();
                            ehmVar.c(p7);
                        } else {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(xk6Var6.h, layoutDirection);
                            if ((absoluteGravity2 & 48) != 48 || (i8 = (p7.top - ((ViewGroup.MarginLayoutParams) xk6Var6).topMargin) - xk6Var6.j) >= (i9 = p.top)) {
                                z2 = false;
                            } else {
                                I(i9 - i8, view4);
                                z2 = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - p7.bottom) - ((ViewGroup.MarginLayoutParams) xk6Var6).bottomMargin) + xk6Var6.j) < (i7 = p.bottom)) {
                                I(height - i7, view4);
                                z2 = true;
                            }
                            if (!z2) {
                                I(0, view4);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i5 = (p7.left - ((ViewGroup.MarginLayoutParams) xk6Var6).leftMargin) - xk6Var6.i) >= (i6 = p.left)) {
                                z3 = false;
                            } else {
                                H(i6 - i5, view4);
                                z3 = true;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - p7.right) - ((ViewGroup.MarginLayoutParams) xk6Var6).rightMargin) + xk6Var6.i) < (i4 = p.right)) {
                                H(width - i4, view4);
                                z3 = true;
                            }
                            if (!z3) {
                                H(0, view4);
                            }
                            p7.setEmpty();
                            ehmVar.c(p7);
                        }
                    }
                }
                if (i != 2) {
                    rect = rect4;
                    rect.set(((xk6) view4.getLayoutParams()).q);
                    if (rect.equals(p2)) {
                        arrayList = arrayList4;
                        i3 = i17;
                    } else {
                        ((xk6) view4.getLayoutParams()).q.set(p2);
                    }
                } else {
                    rect = rect4;
                }
                int i20 = i2 + 1;
                i3 = i17;
                while (true) {
                    arrayList = arrayList4;
                    if (i20 >= i3) {
                        break;
                    }
                    View view5 = (View) arrayList.get(i20);
                    xk6 xk6Var7 = (xk6) view5.getLayoutParams();
                    uk6 uk6Var3 = xk6Var7.a;
                    if (uk6Var3 != null && uk6Var3.layoutDependsOn(this, view5, view4)) {
                        if (i == 0 && xk6Var7.p) {
                            xk6Var7.p = false;
                        } else {
                            if (i != 2) {
                                z = uk6Var3.onDependentViewChanged(this, view5, view4);
                            } else {
                                uk6Var3.onDependentViewRemoved(this, view5, view4);
                                z = true;
                            }
                            if (i == 1) {
                                xk6Var7.p = z;
                            }
                        }
                    }
                    i20++;
                    arrayList4 = arrayList;
                }
            } else {
                arrayList = arrayList3;
                i3 = size;
                rect = p3;
                i2 = i13;
            }
            i13 = i2 + 1;
            p3 = rect;
            size = i3;
            arrayList3 = arrayList;
        }
    }

    public final void B(int i, View view) {
        Rect p;
        Rect p2;
        xk6 xk6Var = (xk6) view.getLayoutParams();
        View view2 = xk6Var.k;
        if (view2 == null && xk6Var.f != -1) {
            xq0.q("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
            return;
        }
        ehm ehmVar = x;
        if (view2 != null) {
            p = p();
            p2 = p();
            try {
                v(p, view2);
                xk6 xk6Var2 = (xk6) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                w(i, p, p2, xk6Var2, measuredWidth, measuredHeight);
                q(xk6Var2, p2, measuredWidth, measuredHeight);
                view.layout(p2.left, p2.top, p2.right, p2.bottom);
                return;
            } finally {
                p.setEmpty();
                ehmVar.c(p);
                p2.setEmpty();
                ehmVar.c(p2);
            }
        }
        int i2 = xk6Var.e;
        if (i2 < 0) {
            xk6 xk6Var3 = (xk6) view.getLayoutParams();
            p = p();
            p.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) xk6Var3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) xk6Var3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) xk6Var3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) xk6Var3).bottomMargin);
            if (this.n != null) {
                WeakHashMap weakHashMap = wdu.a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    p.left = this.n.b() + p.left;
                    p.top = this.n.d() + p.top;
                    p.right -= this.n.c();
                    p.bottom -= this.n.a();
                }
            }
            p2 = p();
            int i3 = xk6Var3.c;
            if ((i3 & 7) == 0) {
                i3 |= 8388611;
            }
            if ((i3 & 112) == 0) {
                i3 |= 48;
            }
            Gravity.apply(i3, view.getMeasuredWidth(), view.getMeasuredHeight(), p, p2, i);
            view.layout(p2.left, p2.top, p2.right, p2.bottom);
            return;
        }
        xk6 xk6Var4 = (xk6) view.getLayoutParams();
        int i4 = xk6Var4.c;
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
        int x2 = x(i2) - measuredWidth2;
        if (i5 == 1) {
            x2 += measuredWidth2 / 2;
        } else if (i5 == 5) {
            x2 += measuredWidth2;
        }
        int i7 = i6 != 16 ? i6 != 80 ? 0 : measuredHeight2 : measuredHeight2 / 2;
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) xk6Var4).leftMargin, Math.min(x2, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) xk6Var4).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) xk6Var4).topMargin, Math.min(i7, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) xk6Var4).bottomMargin));
        view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
    }

    public final void C(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    public final boolean D(uk6 uk6Var, View view, MotionEvent motionEvent, int i) {
        if (i == 0) {
            return uk6Var.onInterceptTouchEvent(this, view, motionEvent);
        }
        if (i == 1) {
            return uk6Var.onTouchEvent(this, view, motionEvent);
        }
        e7o.e();
        return false;
    }

    public final boolean E(MotionEvent motionEvent, int i) {
        boolean z;
        boolean blocksInteractionBelow;
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.c;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            arrayList.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        dl4 dl4Var = w;
        if (dl4Var != null) {
            Collections.sort(arrayList, dl4Var);
        }
        int size = arrayList.size();
        MotionEvent motionEvent2 = null;
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (i3 < size) {
            View view = (View) arrayList.get(i3);
            xk6 xk6Var = (xk6) view.getLayoutParams();
            uk6 uk6Var = xk6Var.a;
            if (!(z2 || z3) || actionMasked == 0) {
                if (!z3 && !z2 && uk6Var != null) {
                    z2 = D(uk6Var, view, motionEvent, i);
                    if (z2) {
                        this.j = view;
                        if (actionMasked != 3 && actionMasked != 1) {
                            for (int i4 = 0; i4 < i3; i4++) {
                                View view2 = (View) arrayList.get(i4);
                                uk6 uk6Var2 = ((xk6) view2.getLayoutParams()).a;
                                if (uk6Var2 != null) {
                                    if (motionEvent2 == null) {
                                        motionEvent2 = MotionEvent.obtain(motionEvent);
                                        motionEvent2.setAction(3);
                                    }
                                    D(uk6Var2, view2, motionEvent2, i);
                                }
                            }
                        }
                    }
                }
                uk6 uk6Var3 = xk6Var.a;
                if (uk6Var3 == null) {
                    xk6Var.m = false;
                }
                boolean z4 = xk6Var.m;
                if (z4) {
                    blocksInteractionBelow = true;
                } else {
                    blocksInteractionBelow = (uk6Var3 != null ? uk6Var3.blocksInteractionBelow(this, view) : false) | z4;
                    xk6Var.m = blocksInteractionBelow;
                }
                z = blocksInteractionBelow && !z4;
                if (blocksInteractionBelow && !z) {
                    break;
                }
            } else {
                if (uk6Var != null) {
                    if (motionEvent2 == null) {
                        motionEvent2 = MotionEvent.obtain(motionEvent);
                        motionEvent2.setAction(3);
                    }
                    D(uk6Var, view, motionEvent2, i);
                }
                z = z3;
            }
            i3++;
            z3 = z;
        }
        arrayList.clear();
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        return z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f5, code lost:
    
        if ((android.view.Gravity.getAbsoluteGravity(r8.h, r12) & r13) == r13) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F() {
        ArrayList arrayList = this.a;
        arrayList.clear();
        g06 g06Var = this.b;
        ciq ciqVar = (ciq) g06Var.b;
        dhm dhmVar = (dhm) g06Var.a;
        ciq ciqVar2 = (ciq) g06Var.b;
        int i = ciqVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) ciqVar.j(i2);
            if (arrayList2 != null) {
                arrayList2.clear();
                dhmVar.c(arrayList2);
            }
        }
        ciqVar.clear();
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            xk6 y = y(childAt);
            int i4 = y.f;
            if (i4 == -1) {
                y.l = null;
                y.k = null;
            } else {
                View view = y.k;
                if (view != null && view.getId() == i4) {
                    View view2 = y.k;
                    for (ViewParent parent = view2.getParent(); parent != this; parent = parent.getParent()) {
                        if (parent == null || parent == childAt) {
                            y.l = null;
                            y.k = null;
                        } else {
                            if (parent instanceof View) {
                                view2 = parent;
                            }
                        }
                    }
                    y.l = view2;
                }
                View findViewById = findViewById(i4);
                y.k = findViewById;
                if (findViewById != null) {
                    if (findViewById != this) {
                        for (ViewParent parent2 = findViewById.getParent(); parent2 != this && parent2 != null; parent2 = parent2.getParent()) {
                            if (parent2 != childAt) {
                                if (parent2 instanceof View) {
                                    findViewById = parent2;
                                }
                            } else if (!isInEditMode()) {
                                xq0.q("Anchor must not be a descendant of the anchored view");
                                return;
                            } else {
                                y.l = null;
                                y.k = null;
                            }
                        }
                        y.l = findViewById;
                    } else if (!isInEditMode()) {
                        xq0.q("View can not be anchored to the the parent CoordinatorLayout");
                        return;
                    } else {
                        y.l = null;
                        y.k = null;
                    }
                } else if (!isInEditMode()) {
                    e7o.l("Could not find CoordinatorLayout descendant view with id ", getResources().getResourceName(i4), " to anchor view ", childAt);
                    return;
                } else {
                    y.l = null;
                    y.k = null;
                }
            }
            if (!ciqVar2.containsKey(childAt)) {
                ciqVar2.put(childAt, null);
            }
            for (int i5 = 0; i5 < childCount; i5++) {
                if (i5 != i3) {
                    View childAt2 = getChildAt(i5);
                    if (childAt2 != y.l) {
                        WeakHashMap weakHashMap = wdu.a;
                        int layoutDirection = getLayoutDirection();
                        int absoluteGravity = Gravity.getAbsoluteGravity(((xk6) childAt2.getLayoutParams()).g, layoutDirection);
                        if (absoluteGravity != 0) {
                        }
                        uk6 uk6Var = y.a;
                        if (uk6Var == null) {
                            continue;
                        } else if (!uk6Var.layoutDependsOn(this, childAt, childAt2)) {
                            continue;
                        }
                    }
                    if (!ciqVar2.containsKey(childAt2) && !ciqVar2.containsKey(childAt2)) {
                        ciqVar2.put(childAt2, null);
                    }
                    if (!ciqVar2.containsKey(childAt2) || !ciqVar2.containsKey(childAt)) {
                        xq0.x("All nodes must be present in the graph before being added as an edge");
                        return;
                    }
                    ArrayList arrayList3 = (ArrayList) ciqVar2.get(childAt2);
                    if (arrayList3 == null) {
                        arrayList3 = (ArrayList) dhmVar.f();
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        ciqVar2.put(childAt2, arrayList3);
                    }
                    arrayList3.add(childAt);
                }
            }
        }
        ArrayList arrayList4 = (ArrayList) g06Var.c;
        arrayList4.clear();
        HashSet hashSet = (HashSet) g06Var.d;
        hashSet.clear();
        int i6 = ciqVar2.c;
        for (int i7 = 0; i7 < i6; i7++) {
            g06Var.q(ciqVar2.f(i7), arrayList4, hashSet);
        }
        arrayList.addAll(arrayList4);
        Collections.reverse(arrayList);
    }

    public final void G() {
        View view = this.j;
        if (view != null) {
            uk6 uk6Var = ((xk6) view.getLayoutParams()).a;
            if (uk6Var != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                uk6Var.onTouchEvent(this, this.j, obtain);
                obtain.recycle();
            }
            this.j = null;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ((xk6) getChildAt(i).getLayoutParams()).m = false;
        }
        this.g = false;
    }

    public final void J() {
        WeakHashMap weakHashMap = wdu.a;
        if (!getFitsSystemWindows()) {
            ndu.n(this, null);
            return;
        }
        if (this.r == null) {
            this.r = new znk(19, this);
        }
        ndu.n(this, this.r);
        setSystemUiVisibility(1280);
    }

    @Override // defpackage.myi
    public final void c(int i, View view) {
        c9n c9nVar = this.s;
        if (i == 1) {
            c9nVar.c = 0;
        } else {
            c9nVar.b = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            xk6 xk6Var = (xk6) childAt.getLayoutParams();
            if (xk6Var.a(i)) {
                uk6 uk6Var = xk6Var.a;
                if (uk6Var != null) {
                    uk6Var.onStopNestedScroll(this, childAt, view, i);
                }
                if (i == 0) {
                    xk6Var.n = false;
                } else if (i == 1) {
                    xk6Var.o = false;
                }
                xk6Var.p = false;
            }
        }
        this.k = null;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof xk6) && super.checkLayoutParams(layoutParams);
    }

    @Override // defpackage.myi
    public final void d(View view, View view2, int i, int i2) {
        uk6 uk6Var;
        View view3;
        View view4;
        int i3;
        int i4;
        c9n c9nVar = this.s;
        if (i2 == 1) {
            c9nVar.c = i;
        } else {
            c9nVar.b = i;
        }
        this.k = view2;
        int childCount = getChildCount();
        int i5 = 0;
        while (i5 < childCount) {
            View childAt = getChildAt(i5);
            xk6 xk6Var = (xk6) childAt.getLayoutParams();
            if (xk6Var.a(i2) && (uk6Var = xk6Var.a) != null) {
                view3 = view;
                view4 = view2;
                i3 = i;
                i4 = i2;
                uk6Var.onNestedScrollAccepted(this, childAt, view3, view4, i3, i4);
            } else {
                view3 = view;
                view4 = view2;
                i3 = i;
                i4 = i2;
            }
            i5++;
            view = view3;
            view2 = view4;
            i = i3;
            i2 = i4;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        xk6 xk6Var = (xk6) view.getLayoutParams();
        uk6 uk6Var = xk6Var.a;
        if (uk6Var != null) {
            float scrimOpacity = uk6Var.getScrimOpacity(this, view);
            if (scrimOpacity > 0.0f) {
                if (this.d == null) {
                    this.d = new Paint();
                }
                this.d.setColor(xk6Var.a.getScrimColor(this, view));
                Paint paint = this.d;
                int round = Math.round(scrimOpacity * 255.0f);
                if (round < 0) {
                    round = 0;
                } else if (round > 255) {
                    round = 255;
                }
                paint.setAlpha(round);
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.d);
                canvas.restoreToCount(save);
                return super.drawChild(canvas, view, j);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.p;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // defpackage.myi
    public final void g(View view, int i, int i2, int[] iArr, int i3) {
        uk6 uk6Var;
        int childCount = getChildCount();
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                xk6 xk6Var = (xk6) childAt.getLayoutParams();
                if (xk6Var.a(i3) && (uk6Var = xk6Var.a) != null) {
                    int[] iArr2 = this.e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    uk6Var.onNestedPreScroll(this, childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.e;
                    i4 = i > 0 ? Math.max(i4, iArr3[0]) : Math.min(i4, iArr3[0]);
                    i5 = i2 > 0 ? Math.max(i5, iArr3[1]) : Math.min(i5, iArr3[1]);
                    z = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z) {
            A(1);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new xk6(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof xk6 ? new xk6((xk6) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new xk6((ViewGroup.MarginLayoutParams) layoutParams) : new xk6(layoutParams);
    }

    public final List<View> getDependencySortedChildren() {
        F();
        return Collections.unmodifiableList(this.a);
    }

    public final kqv getLastWindowInsets() {
        return this.n;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        c9n c9nVar = this.s;
        return c9nVar.c | c9nVar.b;
    }

    public Drawable getStatusBarBackground() {
        return this.p;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    @Override // defpackage.nyi
    public final void h(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        uk6 uk6Var;
        int childCount = getChildCount();
        boolean z = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                xk6 xk6Var = (xk6) childAt.getLayoutParams();
                if (xk6Var.a(i5) && (uk6Var = xk6Var.a) != null) {
                    int[] iArr2 = this.e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    uk6Var.onNestedScroll(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    int[] iArr3 = this.e;
                    i6 = i3 > 0 ? Math.max(i6, iArr3[0]) : Math.min(i6, iArr3[0]);
                    i7 = i4 > 0 ? Math.max(i7, iArr3[1]) : Math.min(i7, iArr3[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + i6;
        iArr[1] = iArr[1] + i7;
        if (z) {
            A(1);
        }
    }

    @Override // defpackage.myi
    public final void k(View view, int i, int i2, int i3, int i4, int i5) {
        h(view, i, i2, i3, i4, 0, this.f);
    }

    @Override // defpackage.myi
    public final boolean o(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                xk6 xk6Var = (xk6) childAt.getLayoutParams();
                uk6 uk6Var = xk6Var.a;
                if (uk6Var != null) {
                    boolean onStartNestedScroll = uk6Var.onStartNestedScroll(this, childAt, view, view2, i, i2);
                    z |= onStartNestedScroll;
                    if (i2 == 0) {
                        xk6Var.n = onStartNestedScroll;
                    } else if (i2 == 1) {
                        xk6Var.o = onStartNestedScroll;
                    }
                } else if (i2 == 0) {
                    xk6Var.n = false;
                } else if (i2 == 1) {
                    xk6Var.o = false;
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        G();
        int i = 1;
        if (this.m) {
            if (this.l == null) {
                this.l = new wp4(this, i);
            }
            getViewTreeObserver().addOnPreDrawListener(this.l);
        }
        if (this.n == null) {
            WeakHashMap weakHashMap = wdu.a;
            if (getFitsSystemWindows()) {
                ldu.c(this);
            }
        }
        this.h = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        G();
        if (this.m && this.l != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.l);
        }
        View view = this.k;
        if (view != null) {
            c(0, view);
        }
        this.h = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.o || this.p == null) {
            return;
        }
        kqv kqvVar = this.n;
        int d = kqvVar != null ? kqvVar.d() : 0;
        if (d > 0) {
            this.p.setBounds(0, 0, getWidth(), d);
            this.p.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            G();
        }
        boolean E = E(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return E;
        }
        this.j = null;
        G();
        return E;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        uk6 uk6Var;
        WeakHashMap weakHashMap = wdu.a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList.get(i5);
            if (view.getVisibility() != 8 && ((uk6Var = ((xk6) view.getLayoutParams()).a) == null || !uk6Var.onLayoutChild(this, view, layoutDirection))) {
                B(layoutDirection, view);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0193  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        uk6 uk6Var;
        int i10;
        int i11;
        ArrayList arrayList;
        int i12;
        int i13;
        int i14;
        boolean z2;
        int i15;
        int i16;
        View view;
        int i17;
        int i18;
        int max;
        CoordinatorLayout coordinatorLayout = this;
        coordinatorLayout.F();
        int childCount = coordinatorLayout.getChildCount();
        int i19 = 0;
        loop0: while (true) {
            i3 = 1;
            if (i19 >= childCount) {
                z = false;
                break;
            }
            View childAt = coordinatorLayout.getChildAt(i19);
            ciq ciqVar = (ciq) coordinatorLayout.b.b;
            int i20 = ciqVar.c;
            for (int i21 = 0; i21 < i20; i21++) {
                ArrayList arrayList2 = (ArrayList) ciqVar.j(i21);
                if (arrayList2 != null && arrayList2.contains(childAt)) {
                    z = true;
                    break loop0;
                }
            }
            i19++;
        }
        if (z != coordinatorLayout.m) {
            boolean z3 = coordinatorLayout.h;
            if (z) {
                if (z3) {
                    if (coordinatorLayout.l == null) {
                        coordinatorLayout.l = new wp4(coordinatorLayout, i3);
                    }
                    coordinatorLayout.getViewTreeObserver().addOnPreDrawListener(coordinatorLayout.l);
                }
                coordinatorLayout.m = true;
            } else {
                if (z3 && coordinatorLayout.l != null) {
                    coordinatorLayout.getViewTreeObserver().removeOnPreDrawListener(coordinatorLayout.l);
                }
                coordinatorLayout.m = false;
            }
        }
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        WeakHashMap weakHashMap = wdu.a;
        int layoutDirection = coordinatorLayout.getLayoutDirection();
        boolean z4 = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i22 = paddingLeft + paddingRight;
        int i23 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        boolean z5 = coordinatorLayout.n != null && coordinatorLayout.getFitsSystemWindows();
        ArrayList arrayList3 = coordinatorLayout.a;
        int size3 = arrayList3.size();
        int i24 = 0;
        int i25 = 0;
        while (i24 < size3) {
            View view2 = (View) arrayList3.get(i24);
            int i26 = suggestedMinimumWidth;
            if (view2.getVisibility() == 8) {
                arrayList = arrayList3;
                i7 = size3;
                i17 = i24;
                i13 = paddingLeft;
                i10 = layoutDirection;
                suggestedMinimumWidth = i26;
                z2 = false;
                i16 = paddingRight;
            } else {
                xk6 xk6Var = (xk6) view2.getLayoutParams();
                int i27 = xk6Var.e;
                if (i27 < 0 || mode == 0) {
                    i4 = suggestedMinimumHeight;
                } else {
                    int x2 = coordinatorLayout.x(i27);
                    int i28 = xk6Var.c;
                    if (i28 == 0) {
                        i28 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i28, layoutDirection) & 7;
                    i4 = suggestedMinimumHeight;
                    if ((absoluteGravity == 3 && !z4) || (absoluteGravity == 5 && z4)) {
                        max = Math.max(0, (size - paddingRight) - x2);
                    } else if ((absoluteGravity == 5 && !z4) || (absoluteGravity == 3 && z4)) {
                        max = Math.max(0, x2 - paddingLeft);
                    }
                    int i29 = size3;
                    i6 = max;
                    i5 = i29;
                    if (z5 || view2.getFitsSystemWindows()) {
                        i7 = i5;
                        i8 = i;
                        i9 = i2;
                    } else {
                        i7 = i5;
                        int c = coordinatorLayout.n.c() + coordinatorLayout.n.b();
                        int a = coordinatorLayout.n.a() + coordinatorLayout.n.d();
                        i8 = View.MeasureSpec.makeMeasureSpec(size - c, mode);
                        i9 = View.MeasureSpec.makeMeasureSpec(size2 - a, mode2);
                    }
                    uk6Var = xk6Var.a;
                    if (uk6Var == null) {
                        int i30 = i4;
                        i10 = layoutDirection;
                        i11 = i30;
                        z2 = false;
                        i13 = paddingLeft;
                        i14 = i26;
                        i16 = paddingRight;
                        i18 = i25;
                        arrayList = arrayList3;
                        int i31 = i8;
                        i17 = i24;
                        int i32 = i9;
                        boolean onMeasureChild = uk6Var.onMeasureChild(this, view2, i31, i6, i32, 0);
                        view = view2;
                        i8 = i31;
                        i12 = i6;
                        i15 = i32;
                        if (onMeasureChild) {
                            coordinatorLayout = this;
                            int max2 = Math.max(i14, view.getMeasuredWidth() + i22 + ((ViewGroup.MarginLayoutParams) xk6Var).leftMargin + ((ViewGroup.MarginLayoutParams) xk6Var).rightMargin);
                            int max3 = Math.max(i11, view.getMeasuredHeight() + i23 + ((ViewGroup.MarginLayoutParams) xk6Var).topMargin + ((ViewGroup.MarginLayoutParams) xk6Var).bottomMargin);
                            i25 = View.combineMeasuredStates(i18, view.getMeasuredState());
                            suggestedMinimumWidth = max2;
                            suggestedMinimumHeight = max3;
                        }
                    } else {
                        int i33 = i4;
                        i10 = layoutDirection;
                        i11 = i33;
                        arrayList = arrayList3;
                        i12 = i6;
                        i13 = paddingLeft;
                        i14 = i26;
                        z2 = false;
                        i15 = i9;
                        i16 = paddingRight;
                        view = view2;
                        i17 = i24;
                        i18 = i25;
                    }
                    coordinatorLayout = this;
                    coordinatorLayout.measureChildWithMargins(view, i8, i12, i15, 0);
                    int max22 = Math.max(i14, view.getMeasuredWidth() + i22 + ((ViewGroup.MarginLayoutParams) xk6Var).leftMargin + ((ViewGroup.MarginLayoutParams) xk6Var).rightMargin);
                    int max32 = Math.max(i11, view.getMeasuredHeight() + i23 + ((ViewGroup.MarginLayoutParams) xk6Var).topMargin + ((ViewGroup.MarginLayoutParams) xk6Var).bottomMargin);
                    i25 = View.combineMeasuredStates(i18, view.getMeasuredState());
                    suggestedMinimumWidth = max22;
                    suggestedMinimumHeight = max32;
                }
                i5 = size3;
                i6 = 0;
                if (z5) {
                }
                i7 = i5;
                i8 = i;
                i9 = i2;
                uk6Var = xk6Var.a;
                if (uk6Var == null) {
                }
                coordinatorLayout = this;
                coordinatorLayout.measureChildWithMargins(view, i8, i12, i15, 0);
                int max222 = Math.max(i14, view.getMeasuredWidth() + i22 + ((ViewGroup.MarginLayoutParams) xk6Var).leftMargin + ((ViewGroup.MarginLayoutParams) xk6Var).rightMargin);
                int max322 = Math.max(i11, view.getMeasuredHeight() + i23 + ((ViewGroup.MarginLayoutParams) xk6Var).topMargin + ((ViewGroup.MarginLayoutParams) xk6Var).bottomMargin);
                i25 = View.combineMeasuredStates(i18, view.getMeasuredState());
                suggestedMinimumWidth = max222;
                suggestedMinimumHeight = max322;
            }
            i24 = i17 + 1;
            paddingLeft = i13;
            paddingRight = i16;
            size3 = i7;
            layoutDirection = i10;
            arrayList3 = arrayList;
        }
        int i34 = i25;
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i, (-16777216) & i34), View.resolveSizeAndState(suggestedMinimumHeight, i2, i34 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        uk6 uk6Var;
        View view2;
        float f3;
        float f4;
        boolean z2;
        int childCount = getChildCount();
        int i = 0;
        boolean z3 = false;
        while (i < childCount) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                xk6 xk6Var = (xk6) childAt.getLayoutParams();
                if (xk6Var.a(0) && (uk6Var = xk6Var.a) != null) {
                    view2 = view;
                    f3 = f;
                    f4 = f2;
                    z2 = z;
                    z3 |= uk6Var.onNestedFling(this, childAt, view2, f3, f4, z2);
                    i++;
                    view = view2;
                    f = f3;
                    f2 = f4;
                    z = z2;
                }
            }
            view2 = view;
            f3 = f;
            f4 = f2;
            z2 = z;
            i++;
            view = view2;
            f = f3;
            f2 = f4;
            z = z2;
        }
        if (z3) {
            A(1);
        }
        return z3;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        uk6 uk6Var;
        View view2;
        float f3;
        float f4;
        int childCount = getChildCount();
        int i = 0;
        boolean z = false;
        while (i < childCount) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                xk6 xk6Var = (xk6) childAt.getLayoutParams();
                if (xk6Var.a(0) && (uk6Var = xk6Var.a) != null) {
                    view2 = view;
                    f3 = f;
                    f4 = f2;
                    z |= uk6Var.onNestedPreFling(this, childAt, view2, f3, f4);
                    i++;
                    view = view2;
                    f = f3;
                    f2 = f4;
                }
            }
            view2 = view;
            f3 = f;
            f4 = f2;
            i++;
            view = view2;
            f = f3;
            f2 = f4;
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        g(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        k(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        d(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof yk6)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        yk6 yk6Var = (yk6) parcelable;
        super.onRestoreInstanceState(yk6Var.a);
        SparseArray sparseArray = yk6Var.c;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            uk6 uk6Var = y(childAt).a;
            if (id != -1 && uk6Var != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                uk6Var.onRestoreInstanceState(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState;
        yk6 yk6Var = new yk6(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            uk6 uk6Var = ((xk6) childAt.getLayoutParams()).a;
            if (id != -1 && uk6Var != null && (onSaveInstanceState = uk6Var.onSaveInstanceState(this, childAt)) != null) {
                sparseArray.append(id, onSaveInstanceState);
            }
        }
        yk6Var.c = sparseArray;
        return yk6Var;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return o(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        c(0, view);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean E;
        int actionMasked = motionEvent.getActionMasked();
        View view = this.j;
        boolean z = false;
        if (view != null) {
            uk6 uk6Var = ((xk6) view.getLayoutParams()).a;
            E = uk6Var != null ? uk6Var.onTouchEvent(this, this.j, motionEvent) : false;
        } else {
            E = E(motionEvent, 1);
            if (actionMasked != 0 && E) {
                z = true;
            }
        }
        if (this.j == null || actionMasked == 3) {
            E |= super.onTouchEvent(motionEvent);
        } else if (z) {
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setAction(3);
            super.onTouchEvent(obtain);
            obtain.recycle();
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return E;
        }
        this.j = null;
        G();
        return E;
    }

    public final void q(xk6 xk6Var, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) xk6Var).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) xk6Var).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) xk6Var).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) xk6Var).bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        uk6 uk6Var = ((xk6) view.getLayoutParams()).a;
        if (uk6Var == null || !uk6Var.onRequestChildRectangleOnScreen(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.g) {
            return;
        }
        if (this.j == null) {
            int childCount = getChildCount();
            MotionEvent motionEvent = null;
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                uk6 uk6Var = ((xk6) childAt.getLayoutParams()).a;
                if (uk6Var != null) {
                    if (motionEvent == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    uk6Var.onInterceptTouchEvent(this, childAt, motionEvent);
                }
            }
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        }
        G();
        this.g = true;
    }

    public final void s(View view) {
        ArrayList arrayList = (ArrayList) ((ciq) this.b.b).get(view);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View view2 = (View) arrayList.get(i);
            uk6 uk6Var = ((xk6) view2.getLayoutParams()).a;
            if (uk6Var != null) {
                uk6Var.onDependentViewChanged(this, view2, view);
            }
        }
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        J();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.q = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.p = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.p.setState(getDrawableState());
                }
                Drawable drawable3 = this.p;
                WeakHashMap weakHashMap = wdu.a;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.p.setVisible(getVisibility() == 0, false);
                this.p.setCallback(this);
            }
            WeakHashMap weakHashMap2 = wdu.a;
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
        Drawable drawable = this.p;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.p.setVisible(z, false);
    }

    public final void t(View view, Rect rect, boolean z) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            v(rect, view);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final List u(View view) {
        ciq ciqVar = (ciq) this.b.b;
        int i = ciqVar.c;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) ciqVar.j(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(ciqVar.f(i2));
            }
        }
        return arrayList == null ? Collections.EMPTY_LIST : arrayList;
    }

    public final void v(Rect rect, View view) {
        ThreadLocal threadLocal = peu.a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = peu.a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        peu.a(this, view, matrix);
        ThreadLocal threadLocal3 = peu.b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.p;
    }

    public final int x(int i) {
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

    public final boolean z(View view, int i, int i2) {
        ehm ehmVar = x;
        Rect p = p();
        v(p, view);
        try {
            return p.contains(i, i2);
        } finally {
            p.setEmpty();
            ehmVar.c(p);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new xk6(getContext(), attributeSet);
    }

    public CoordinatorLayout(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.coordinatorLayoutStyle);
    }

    public CoordinatorLayout(@NonNull Context context) {
        this(context, null);
    }
}
