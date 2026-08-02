package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.search.SearchBar;
import com.google.android.material.shape.a;
import defpackage.bcx;
import defpackage.bg3;
import defpackage.btn;
import defpackage.ciq;
import defpackage.hyf;
import defpackage.ivf;
import defpackage.kqv;
import defpackage.kyi;
import defpackage.mi;
import defpackage.ndu;
import defpackage.ngg;
import defpackage.oud;
import defpackage.qne;
import defpackage.qxp;
import defpackage.rvf;
import defpackage.szf;
import defpackage.tk6;
import defpackage.tt0;
import defpackage.uk6;
import defpackage.up0;
import defpackage.vdn;
import defpackage.vp0;
import defpackage.wdu;
import defpackage.wm0;
import defpackage.wp0;
import defpackage.xk6;
import defpackage.xq0;
import defpackage.y2x;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.WeakHashMap;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public class AppBarLayout extends LinearLayout implements tk6 {
    public static final /* synthetic */ int B = 0;
    public Behavior A;
    public int a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public int f;
    public kqv g;
    public ArrayList h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public ColorStateList m;
    public int n;
    public WeakReference o;
    public ValueAnimator p;
    public ValueAnimator.AnimatorUpdateListener q;
    public final ArrayList r;
    public final LinkedHashSet s;
    public final long t;
    public final TimeInterpolator u;
    public int[] v;
    public int w;
    public Drawable x;
    public Integer y;
    public final float z;

    public AppBarLayout(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(bg3.p0(context, attributeSet, i, R.style.Widget_Design_AppBarLayout), attributeSet, i);
        this.b = -1;
        this.c = -1;
        this.d = -1;
        this.f = 0;
        this.r = new ArrayList();
        this.s = new LinkedHashSet();
        Context context2 = getContext();
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        Context context3 = getContext();
        TypedArray B2 = bcx.B(context3, attributeSet, tt0.o, i, R.style.Widget_Design_AppBarLayout, new int[0]);
        try {
            if (B2.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, B2.getResourceId(0, 0)));
            }
            B2.recycle();
            TypedArray B3 = bcx.B(context2, attributeSet, vdn.a, i, R.style.Widget_Design_AppBarLayout, new int[0]);
            this.m = ivf.D(context2, B3, 6);
            this.t = szf.p0(context2, R.attr.motionDurationMedium2, getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            this.u = szf.q0(context2, R.attr.motionEasingStandardInterpolator, wm0.a);
            if (B3.hasValue(4)) {
                f(B3.getBoolean(4, false), false, false);
            }
            if (B3.hasValue(3)) {
                tt0.L(this, B3.getDimensionPixelSize(3, 0));
            }
            setBackground(B3.getDrawable(0));
            if (Build.VERSION.SDK_INT >= 26) {
                if (B3.hasValue(2)) {
                    setKeyboardNavigationCluster(B3.getBoolean(2, false));
                }
                if (B3.hasValue(1)) {
                    setTouchscreenBlocksFocus(B3.getBoolean(1, false));
                }
            }
            this.z = getResources().getDimension(R.dimen.design_appbar_elevation);
            this.l = B3.getBoolean(5, false);
            this.n = B3.getResourceId(7, -1);
            setStatusBarForeground(B3.getDrawable(8));
            B3.recycle();
            qxp qxpVar = new qxp(this);
            WeakHashMap weakHashMap = wdu.a;
            ndu.n(this, qxpVar);
        } catch (Throwable th) {
            B2.recycle();
            throw th;
        }
    }

    public static vp0 c(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            vp0 vp0Var = new vp0((LinearLayout.LayoutParams) layoutParams);
            vp0Var.a = 1;
            return vp0Var;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            vp0 vp0Var2 = new vp0((ViewGroup.MarginLayoutParams) layoutParams);
            vp0Var2.a = 1;
            return vp0Var2;
        }
        vp0 vp0Var3 = new vp0(layoutParams);
        vp0Var3.a = 1;
        return vp0Var3;
    }

    public final void a(wp0 wp0Var) {
        if (this.h == null) {
            this.h = new ArrayList();
        }
        if (wp0Var == null || this.h.contains(wp0Var)) {
            return;
        }
        this.h.add(wp0Var);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final vp0 generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        vp0 vp0Var = new vp0(context, attributeSet);
        vp0Var.a = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vdn.b);
        vp0Var.a = obtainStyledAttributes.getInt(1, 0);
        vp0Var.b = obtainStyledAttributes.getInt(0, 0) != 1 ? null : new qne(4);
        if (obtainStyledAttributes.hasValue(2)) {
            vp0Var.c = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(2, 0));
        }
        obtainStyledAttributes.recycle();
        return vp0Var;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof vp0;
    }

    public final void d() {
        Behavior behavior = this.A;
        e saveScrollState = (behavior == null || this.b == -1 || this.f != 0) ? null : behavior.saveScrollState(androidx.customview.view.a.b, this);
        this.b = -1;
        this.c = -1;
        this.d = -1;
        if (saveScrollState != null) {
            this.A.restoreScrollState(saveScrollState, false);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.x == null || getTopInset() <= 0) {
            return;
        }
        int save = canvas.save();
        canvas.translate(0.0f, -this.a);
        this.x.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.x;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final void e(int i) {
        this.a = i;
        if (!willNotDraw()) {
            postInvalidateOnAnimation();
        }
        ArrayList arrayList = this.h;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                wp0 wp0Var = (wp0) this.h.get(i2);
                if (wp0Var != null) {
                    wp0Var.a(this, i);
                }
            }
        }
    }

    public final void f(boolean z, boolean z2, boolean z3) {
        this.f = (z ? 1 : 2) | (z2 ? 4 : 0) | (z3 ? 8 : 0);
        requestLayout();
    }

    public final boolean g(boolean z) {
        if (this.i || this.k == z) {
            return false;
        }
        this.k = z;
        refreshDrawableState();
        if (!(getBackground() instanceof com.google.android.material.shape.a)) {
            return true;
        }
        if (this.m != null) {
            i(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
            return true;
        }
        if (!this.l) {
            return true;
        }
        float f = this.z;
        i(z ? 0.0f : f, z ? f : 0.0f);
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        vp0 vp0Var = new vp0(-1, -2);
        vp0Var.a = 1;
        return vp0Var;
    }

    @Override // defpackage.tk6
    @NonNull
    public uk6 getBehavior() {
        Behavior behavior = new Behavior();
        this.A = behavior;
        return behavior;
    }

    public int getDownNestedPreScrollRange() {
        int i;
        int minimumHeight;
        int i2 = this.c;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                vp0 vp0Var = (vp0) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i4 = vp0Var.a;
                if ((i4 & 5) != 5) {
                    if (i3 > 0) {
                        break;
                    }
                } else {
                    int i5 = ((LinearLayout.LayoutParams) vp0Var).topMargin + ((LinearLayout.LayoutParams) vp0Var).bottomMargin;
                    if ((i4 & 8) != 0) {
                        minimumHeight = childAt.getMinimumHeight();
                    } else if ((i4 & 2) != 0) {
                        minimumHeight = measuredHeight - childAt.getMinimumHeight();
                    } else {
                        i = i5 + measuredHeight;
                        if (childCount == 0 && childAt.getFitsSystemWindows()) {
                            i = Math.min(i, measuredHeight - getTopInset());
                        }
                        i3 += i;
                    }
                    i = minimumHeight + i5;
                    if (childCount == 0) {
                        i = Math.min(i, measuredHeight - getTopInset());
                    }
                    i3 += i;
                }
            }
        }
        int max = Math.max(0, i3);
        this.c = max;
        return max;
    }

    public int getDownNestedScrollRange() {
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                vp0 vp0Var = (vp0) childAt.getLayoutParams();
                int measuredHeight = ((LinearLayout.LayoutParams) vp0Var).topMargin + ((LinearLayout.LayoutParams) vp0Var).bottomMargin + childAt.getMeasuredHeight();
                int i4 = vp0Var.a;
                if ((i4 & 1) == 0) {
                    break;
                }
                i3 += measuredHeight;
                if ((i4 & 2) != 0) {
                    i3 -= childAt.getMinimumHeight();
                    break;
                }
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.d = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.n;
    }

    public com.google.android.material.shape.a getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof com.google.android.material.shape.a) {
            return (com.google.android.material.shape.a) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int minimumHeight = getMinimumHeight();
        if (minimumHeight != 0) {
            int i = (minimumHeight * 2) + topInset;
            return i < getHeight() ? i : minimumHeight + topInset;
        }
        int childCount = getChildCount();
        int minimumHeight2 = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
        if (minimumHeight2 == 0) {
            return getHeight() / 3;
        }
        int i2 = (minimumHeight2 * 2) + topInset;
        return i2 < getHeight() ? i2 : minimumHeight2 + topInset;
    }

    public int getPendingAction() {
        return this.f;
    }

    public Drawable getStatusBarForeground() {
        return this.x;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        kqv kqvVar = this.g;
        if (kqvVar != null) {
            return kqvVar.d();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.b;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                vp0 vp0Var = (vp0) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i4 = vp0Var.a;
                if ((i4 & 1) == 0) {
                    break;
                }
                int i5 = measuredHeight + ((LinearLayout.LayoutParams) vp0Var).topMargin + ((LinearLayout.LayoutParams) vp0Var).bottomMargin + i3;
                if (i2 == 0 && childAt.getFitsSystemWindows()) {
                    i5 -= getTopInset();
                }
                i3 = i5;
                if ((i4 & 2) != 0) {
                    i3 -= childAt.getMinimumHeight();
                    break;
                }
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.b = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    public final boolean h(View view) {
        int i;
        if (this.o == null && (i = this.n) != -1) {
            View findViewById = view != null ? view.findViewById(i) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.n);
            }
            if (findViewById != null) {
                this.o = new WeakReference(findViewById);
            }
        }
        WeakReference weakReference = this.o;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    public final void i(float f, float f2) {
        ValueAnimator valueAnimator = this.p;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        this.p = ofFloat;
        ofFloat.setDuration(this.t);
        this.p.setInterpolator(this.u);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.q;
        if (animatorUpdateListener != null) {
            this.p.addUpdateListener(animatorUpdateListener);
        }
        this.p.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        rvf.L(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        if (this.v == null) {
            this.v = new int[4];
        }
        int[] iArr = this.v;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.j;
        int i2 = R.attr.state_liftable;
        if (!z) {
            i2 = -R.attr.state_liftable;
        }
        iArr[0] = i2;
        int i3 = R.attr.state_lifted;
        if (!z || !this.k) {
            i3 = -R.attr.state_lifted;
        }
        iArr[1] = i3;
        int i4 = R.attr.state_collapsible;
        if (!z) {
            i4 = -R.attr.state_collapsible;
        }
        iArr[2] = i4;
        int i5 = R.attr.state_collapsed;
        if (!z || !this.k) {
            i5 = -R.attr.state_collapsed;
        }
        iArr[3] = i5;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.o;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.o = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int topInset = getTopInset();
                for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt2 = getChildAt(childCount);
                    WeakHashMap weakHashMap = wdu.a;
                    childAt2.offsetTopAndBottom(topInset);
                }
            }
        }
        d();
        this.e = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            }
            if (((vp0) getChildAt(i5).getLayoutParams()).c != null) {
                this.e = true;
                break;
            }
            i5++;
        }
        Drawable drawable = this.x;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.i) {
            return;
        }
        if (!this.l) {
            int childCount3 = getChildCount();
            int i6 = 0;
            while (true) {
                if (i6 >= childCount3) {
                    z2 = false;
                    break;
                }
                int i7 = ((vp0) getChildAt(i6).getLayoutParams()).a;
                if ((i7 & 1) == 1 && (i7 & 10) != 0) {
                    break;
                } else {
                    i6++;
                }
            }
        }
        if (this.j != z2) {
            this.j = z2;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int measuredHeight = getMeasuredHeight();
                if (mode == Integer.MIN_VALUE) {
                    measuredHeight = hyf.y(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i2));
                } else if (mode == 0) {
                    measuredHeight += getTopInset();
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        d();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        final com.google.android.material.shape.a aVar;
        ColorStateList colorStateList;
        Context context = getContext();
        final Integer num = null;
        if (drawable instanceof com.google.android.material.shape.a) {
            aVar = (com.google.android.material.shape.a) drawable;
        } else {
            ColorStateList n = mi.n(drawable);
            if (n == null) {
                aVar = null;
            } else {
                com.google.android.material.shape.a aVar2 = new com.google.android.material.shape.a();
                aVar2.r(n);
                aVar = aVar2;
            }
        }
        if (aVar != null && (colorStateList = aVar.b.d) != null) {
            this.w = colorStateList.getDefaultColor();
            final ColorStateList colorStateList2 = this.m;
            if (colorStateList2 != null) {
                Context context2 = getContext();
                TypedValue C = ngg.C(context2, R.attr.colorSurface);
                if (C != null) {
                    int i = C.resourceId;
                    num = Integer.valueOf(i != 0 ? context2.getColor(i) : C.data);
                }
                this.q = new ValueAnimator.AnimatorUpdateListener() { // from class: tp0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Integer num2;
                        AppBarLayout appBarLayout = AppBarLayout.this;
                        LinkedHashSet linkedHashSet = appBarLayout.s;
                        ArrayList arrayList = appBarLayout.r;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        int W = qgg.W(appBarLayout.w, floatValue, colorStateList2.getDefaultColor());
                        ColorStateList valueOf = ColorStateList.valueOf(W);
                        a aVar3 = aVar;
                        aVar3.r(valueOf);
                        if (appBarLayout.x != null && (num2 = appBarLayout.y) != null && num2.equals(num)) {
                            appBarLayout.x.setTint(W);
                        }
                        if (!arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (it.next() != null) {
                                    l1j.f();
                                    return;
                                } else if (aVar3.b.d != null) {
                                    throw null;
                                }
                            }
                        }
                        if (linkedHashSet.isEmpty()) {
                            return;
                        }
                        Iterator it2 = linkedHashSet.iterator();
                        while (it2.hasNext()) {
                            SearchBar searchBar = ((fzo) it2.next()).a;
                            ColorStateList colorStateList3 = searchBar.I0;
                            if (colorStateList3 != null) {
                                searchBar.U0.r(ColorStateList.valueOf(qgg.W(searchBar.G0, floatValue, colorStateList3.getDefaultColor())));
                            }
                        }
                    }
                };
            } else {
                aVar.n(context);
                this.q = new up0(0, this, aVar);
            }
            drawable = aVar;
        }
        super.setBackground(drawable);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof com.google.android.material.shape.a) {
            ((com.google.android.material.shape.a) background).q(f);
        }
    }

    public void setExpanded(boolean z) {
        f(z, isLaidOut(), true);
    }

    public void setLiftOnScroll(boolean z) {
        this.l = z;
    }

    public void setLiftOnScrollColor(ColorStateList colorStateList) {
        if (this.m != colorStateList) {
            this.m = colorStateList;
            setBackground(getBackground());
        }
    }

    public void setLiftOnScrollTargetView(View view) {
        this.n = -1;
        if (view != null) {
            this.o = new WeakReference(view);
            return;
        }
        WeakReference weakReference = this.o;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.o = null;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.n = i;
        WeakReference weakReference = this.o;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.o = null;
    }

    public void setLiftableOverrideEnabled(boolean z) {
        this.i = z;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
        } else {
            xq0.x("AppBarLayout is always vertical and does not support horizontal orientation");
        }
    }

    public void setPendingAction(int i) {
        this.f = i;
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.x;
        if (drawable2 != drawable) {
            Integer num = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.x = mutate;
            if (mutate instanceof com.google.android.material.shape.a) {
                num = Integer.valueOf(((com.google.android.material.shape.a) mutate).v);
            } else {
                ColorStateList n = mi.n(mutate);
                if (n != null) {
                    num = Integer.valueOf(n.getDefaultColor());
                }
            }
            this.y = num;
            Drawable drawable3 = this.x;
            boolean z = false;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.x.setState(getDrawableState());
                }
                this.x.setLayoutDirection(getLayoutDirection());
                this.x.setVisible(getVisibility() == 0, false);
                this.x.setCallback(this);
            }
            if (this.x != null && getTopInset() > 0) {
                z = true;
            }
            setWillNotDraw(!z);
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(y2x.w(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        tt0.L(this, f);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.x;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.x;
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        @Override // defpackage.mfu
        public /* bridge */ /* synthetic */ int getLeftAndRightOffset() {
            return super.getLeftAndRightOffset();
        }

        @Override // defpackage.mfu
        public /* bridge */ /* synthetic */ int getTopAndBottomOffset() {
            return super.getTopAndBottomOffset();
        }

        @Override // defpackage.mfu
        public /* bridge */ /* synthetic */ boolean isHorizontalOffsetEnabled() {
            return super.isHorizontalOffsetEnabled();
        }

        @Override // defpackage.mfu
        public /* bridge */ /* synthetic */ boolean isVerticalOffsetEnabled() {
            return super.isVerticalOffsetEnabled();
        }

        @Override // defpackage.oud, defpackage.uk6
        public /* bridge */ /* synthetic */ boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
            return super.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, int i) {
            return super.onLayoutChild(coordinatorLayout, (CoordinatorLayout) appBarLayout, i);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, int i, int i2, int i3, int i4) {
            return super.onMeasureChild(coordinatorLayout, (CoordinatorLayout) appBarLayout, i, i2, i3, i4);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onNestedPreScroll(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
            super.onNestedPreScroll(coordinatorLayout, (CoordinatorLayout) appBarLayout, view, i, i2, iArr, i3);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onNestedScroll(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            super.onNestedScroll(coordinatorLayout, (CoordinatorLayout) appBarLayout, view, i, i2, i3, i4, i5, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, Parcelable parcelable) {
            super.onRestoreInstanceState(coordinatorLayout, (CoordinatorLayout) appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout) {
            return super.onSaveInstanceState(coordinatorLayout, (CoordinatorLayout) appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull View view, View view2, int i, int i2) {
            return super.onStartNestedScroll(coordinatorLayout, (CoordinatorLayout) appBarLayout, view, view2, i, i2);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onStopNestedScroll(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, View view, int i) {
            super.onStopNestedScroll(coordinatorLayout, (CoordinatorLayout) appBarLayout, view, i);
        }

        @Override // defpackage.oud, defpackage.uk6
        public /* bridge */ /* synthetic */ boolean onTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
            return super.onTouchEvent(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void setDragCallback(c cVar) {
            super.setDragCallback(cVar);
        }

        @Override // defpackage.mfu
        public /* bridge */ /* synthetic */ void setHorizontalOffsetEnabled(boolean z) {
            super.setHorizontalOffsetEnabled(z);
        }

        @Override // defpackage.mfu
        public /* bridge */ /* synthetic */ boolean setLeftAndRightOffset(int i) {
            return super.setLeftAndRightOffset(i);
        }

        @Override // defpackage.mfu
        public /* bridge */ /* synthetic */ boolean setTopAndBottomOffset(int i) {
            return super.setTopAndBottomOffset(i);
        }

        @Override // defpackage.mfu
        public /* bridge */ /* synthetic */ void setVerticalOffsetEnabled(boolean z) {
            super.setVerticalOffsetEnabled(z);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class BaseBehavior<T extends AppBarLayout> extends oud {
        private static final int MAX_OFFSET_ANIMATION_DURATION = 600;
        private WeakReference<View> lastNestedScrollingChildRef;
        private int lastStartedType;
        private ValueAnimator offsetAnimator;
        private int offsetDelta;
        private c onDragCallback;
        private e savedState;

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(0);
        }

        private void addAccessibilityDelegateIfNeeded(CoordinatorLayout coordinatorLayout, @NonNull T t) {
            if (wdu.f(coordinatorLayout) != null) {
                return;
            }
            wdu.q(coordinatorLayout, new b(coordinatorLayout, this, t));
        }

        private void animateOffsetTo(CoordinatorLayout coordinatorLayout, @NonNull T t, int i, float f) {
            int abs = Math.abs(getTopBottomOffsetForScrollingSibling() - i);
            float abs2 = Math.abs(f);
            animateOffsetWithDuration(coordinatorLayout, t, i, abs2 > 0.0f ? Math.round((abs / abs2) * 1000.0f) * 3 : (int) (((abs / t.getHeight()) + 1.0f) * 150.0f));
        }

        private void animateOffsetWithDuration(CoordinatorLayout coordinatorLayout, T t, int i, int i2) {
            int topBottomOffsetForScrollingSibling = getTopBottomOffsetForScrollingSibling();
            ValueAnimator valueAnimator = this.offsetAnimator;
            if (topBottomOffsetForScrollingSibling == i) {
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.offsetAnimator.cancel();
                return;
            }
            if (valueAnimator == null) {
                ValueAnimator valueAnimator2 = new ValueAnimator();
                this.offsetAnimator = valueAnimator2;
                valueAnimator2.setInterpolator(wm0.e);
                this.offsetAnimator.addUpdateListener(new a(coordinatorLayout, this, t));
            } else {
                valueAnimator.cancel();
            }
            this.offsetAnimator.setDuration(Math.min(i2, MAX_OFFSET_ANIMATION_DURATION));
            this.offsetAnimator.setIntValues(topBottomOffsetForScrollingSibling, i);
            this.offsetAnimator.start();
        }

        private int calculateSnapOffset(int i, int i2, int i3) {
            return i < (i2 + i3) / 2 ? i2 : i3;
        }

        private boolean canScrollChildren(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t, @NonNull View view) {
            return t.getTotalScrollRange() != 0 && coordinatorLayout.getHeight() - view.getHeight() <= t.getHeight();
        }

        private static boolean checkFlag(int i, int i2) {
            return (i & i2) == i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean childrenHaveScrollFlags(AppBarLayout appBarLayout) {
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (((vp0) appBarLayout.getChildAt(i).getLayoutParams()).a != 0) {
                    return true;
                }
            }
            return false;
        }

        private View findFirstScrollingChild(@NonNull CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof kyi) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        private static View getAppBarChildOnOffset(@NonNull AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        private int getChildIndexOnOffset(@NonNull T t, int i) {
            int childCount = t.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = t.getChildAt(i2);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                vp0 vp0Var = (vp0) childAt.getLayoutParams();
                if (checkFlag(vp0Var.a, 32)) {
                    top -= ((LinearLayout.LayoutParams) vp0Var).topMargin;
                    bottom += ((LinearLayout.LayoutParams) vp0Var).bottomMargin;
                }
                int i3 = -i;
                if (top <= i3 && bottom >= i3) {
                    return i2;
                }
            }
            return -1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public View getChildWithScrollingBehavior(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (((xk6) childAt.getLayoutParams()).a instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        private int interpolateOffset(@NonNull T t, int i) {
            int abs = Math.abs(i);
            int childCount = t.getChildCount();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                View childAt = t.getChildAt(i3);
                vp0 vp0Var = (vp0) childAt.getLayoutParams();
                Interpolator interpolator = vp0Var.c;
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i3++;
                } else if (interpolator != null) {
                    int i4 = vp0Var.a;
                    if ((i4 & 1) != 0) {
                        i2 = childAt.getHeight() + ((LinearLayout.LayoutParams) vp0Var).topMargin + ((LinearLayout.LayoutParams) vp0Var).bottomMargin;
                        if ((i4 & 2) != 0) {
                            i2 -= childAt.getMinimumHeight();
                        }
                    }
                    if (childAt.getFitsSystemWindows()) {
                        i2 -= t.getTopInset();
                    }
                    if (i2 > 0) {
                        float f = i2;
                        return (childAt.getTop() + Math.round(interpolator.getInterpolation((abs - childAt.getTop()) / f) * f)) * Integer.signum(i);
                    }
                }
            }
            return i;
        }

        private boolean shouldJumpElevationState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t) {
            ArrayList arrayList = (ArrayList) ((ciq) coordinatorLayout.b.b).get(t);
            List arrayList2 = arrayList == null ? null : new ArrayList(arrayList);
            if (arrayList2 == null) {
                arrayList2 = Collections.EMPTY_LIST;
            }
            int size = arrayList2.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                uk6 uk6Var = ((xk6) ((View) arrayList2.get(i)).getLayoutParams()).a;
                if (!(uk6Var instanceof ScrollingViewBehavior)) {
                    i++;
                } else if (((ScrollingViewBehavior) uk6Var).getOverlayTop() != 0) {
                    return true;
                }
            }
            return false;
        }

        private void snapToChildIfNeeded(CoordinatorLayout coordinatorLayout, @NonNull T t) {
            int paddingTop = t.getPaddingTop() + t.getTopInset();
            int topBottomOffsetForScrollingSibling = getTopBottomOffsetForScrollingSibling() - paddingTop;
            int childIndexOnOffset = getChildIndexOnOffset(t, topBottomOffsetForScrollingSibling);
            if (childIndexOnOffset >= 0) {
                View childAt = t.getChildAt(childIndexOnOffset);
                vp0 vp0Var = (vp0) childAt.getLayoutParams();
                int i = vp0Var.a;
                if ((i & 17) == 17) {
                    int i2 = -childAt.getTop();
                    int i3 = -childAt.getBottom();
                    if (childIndexOnOffset == 0 && t.getFitsSystemWindows() && childAt.getFitsSystemWindows()) {
                        i2 -= t.getTopInset();
                    }
                    if (checkFlag(i, 2)) {
                        i3 += childAt.getMinimumHeight();
                    } else if (checkFlag(i, 5)) {
                        int minimumHeight = childAt.getMinimumHeight() + i3;
                        if (topBottomOffsetForScrollingSibling < minimumHeight) {
                            i2 = minimumHeight;
                        } else {
                            i3 = minimumHeight;
                        }
                    }
                    if (checkFlag(i, 32)) {
                        i2 += ((LinearLayout.LayoutParams) vp0Var).topMargin;
                        i3 -= ((LinearLayout.LayoutParams) vp0Var).bottomMargin;
                    }
                    animateOffsetTo(coordinatorLayout, t, hyf.y(calculateSnapOffset(topBottomOffsetForScrollingSibling, i3, i2) + paddingTop, -t.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        private void updateAppBarLayoutDrawableState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t, int i, int i2, boolean z) {
            View appBarChildOnOffset = getAppBarChildOnOffset(t, i);
            boolean z2 = false;
            if (appBarChildOnOffset != null) {
                int i3 = ((vp0) appBarChildOnOffset.getLayoutParams()).a;
                if ((i3 & 1) != 0) {
                    int minimumHeight = appBarChildOnOffset.getMinimumHeight();
                    if (i2 <= 0 || (i3 & 12) == 0 ? !((i3 & 2) == 0 || (-i) < (appBarChildOnOffset.getBottom() - minimumHeight) - t.getTopInset()) : (-i) >= (appBarChildOnOffset.getBottom() - minimumHeight) - t.getTopInset()) {
                        z2 = true;
                    }
                }
            }
            if (t.l) {
                z2 = t.h(findFirstScrollingChild(coordinatorLayout));
            }
            boolean g = t.g(z2);
            if (z || (g && shouldJumpElevationState(coordinatorLayout, t))) {
                if (t.getBackground() != null) {
                    t.getBackground().jumpToCurrentState();
                }
                if (t.getForeground() != null) {
                    t.getForeground().jumpToCurrentState();
                }
                if (t.getStateListAnimator() != null) {
                    t.getStateListAnimator().jumpToCurrentState();
                }
            }
        }

        @Override // defpackage.oud
        public boolean canDragView(T t) {
            c cVar = this.onDragCallback;
            if (cVar != null) {
                ((btn) cVar).getClass();
                t.getClass();
                return false;
            }
            WeakReference<View> weakReference = this.lastNestedScrollingChildRef;
            if (weakReference == null) {
                return true;
            }
            View view = weakReference.get();
            return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
        }

        @Override // defpackage.oud
        public int getMaxDragOffset(@NonNull T t) {
            return t.getTopInset() + (-t.getDownNestedScrollRange());
        }

        @Override // defpackage.oud
        public int getTopBottomOffsetForScrollingSibling() {
            return getTopAndBottomOffset() + this.offsetDelta;
        }

        public boolean isOffsetAnimatorRunning() {
            ValueAnimator valueAnimator = this.offsetAnimator;
            return valueAnimator != null && valueAnimator.isRunning();
        }

        @Override // defpackage.oud
        public void onFlingFinished(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t) {
            snapToChildIfNeeded(coordinatorLayout, t);
            if (t.l) {
                t.g(t.h(findFirstScrollingChild(coordinatorLayout)));
            }
        }

        @Override // defpackage.mfu, defpackage.uk6
        public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t, int i) {
            super.onLayoutChild(coordinatorLayout, (View) t, i);
            int pendingAction = t.getPendingAction();
            e eVar = this.savedState;
            if (eVar == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i2 = -t.getUpNestedPreScrollRange();
                        if (z) {
                            animateOffsetTo(coordinatorLayout, t, i2, 0.0f);
                        } else {
                            setHeaderTopBottomOffset(coordinatorLayout, t, i2);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z) {
                            animateOffsetTo(coordinatorLayout, t, 0, 0.0f);
                        } else {
                            setHeaderTopBottomOffset(coordinatorLayout, t, 0);
                        }
                    }
                }
            } else if (eVar.c) {
                setHeaderTopBottomOffset(coordinatorLayout, t, -t.getTotalScrollRange());
            } else if (eVar.d) {
                setHeaderTopBottomOffset(coordinatorLayout, t, 0);
            } else {
                View childAt = t.getChildAt(eVar.e);
                int i3 = -childAt.getBottom();
                setHeaderTopBottomOffset(coordinatorLayout, t, this.savedState.g ? t.getTopInset() + childAt.getMinimumHeight() + i3 : Math.round(childAt.getHeight() * this.savedState.f) + i3);
            }
            t.f = 0;
            this.savedState = null;
            setTopAndBottomOffset(hyf.y(getTopAndBottomOffset(), -t.getTotalScrollRange(), 0));
            updateAppBarLayoutDrawableState(coordinatorLayout, t, getTopAndBottomOffset(), 0, true);
            t.e(getTopAndBottomOffset());
            addAccessibilityDelegateIfNeeded(coordinatorLayout, t);
            return true;
        }

        @Override // defpackage.uk6
        public boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t, int i, int i2, int i3, int i4) {
            if (((ViewGroup.MarginLayoutParams) ((xk6) t.getLayoutParams())).height != -2) {
                return super.onMeasureChild(coordinatorLayout, (View) t, i, i2, i3, i4);
            }
            coordinatorLayout.C(t, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
        @Override // defpackage.uk6
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, @NonNull T t, View view, int i, int i2, int[] iArr, int i3) {
            T t2;
            int i4;
            int i5;
            if (i2 != 0) {
                if (i2 < 0) {
                    i4 = -t.getTotalScrollRange();
                    i5 = t.getDownNestedPreScrollRange() + i4;
                } else {
                    i4 = -t.getUpNestedPreScrollRange();
                    i5 = 0;
                }
                int i6 = i4;
                int i7 = i5;
                if (i6 != i7) {
                    t2 = t;
                    iArr[1] = scroll(coordinatorLayout, t2, i2, i6, i7);
                    if (t2.l) {
                        return;
                    }
                    t2.g(t2.h(view));
                    return;
                }
            }
            t2 = t;
            if (t2.l) {
            }
        }

        @Override // defpackage.uk6
        public void onNestedScroll(CoordinatorLayout coordinatorLayout, @NonNull T t, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            CoordinatorLayout coordinatorLayout2;
            T t2;
            int i6;
            if (i4 < 0) {
                coordinatorLayout2 = coordinatorLayout;
                t2 = t;
                i6 = i4;
                iArr[1] = scroll(coordinatorLayout2, t2, i6, -t.getDownNestedScrollRange(), 0);
            } else {
                coordinatorLayout2 = coordinatorLayout;
                t2 = t;
                i6 = i4;
            }
            if (i6 == 0) {
                addAccessibilityDelegateIfNeeded(coordinatorLayout2, t2);
            }
        }

        @Override // defpackage.uk6
        public void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t, Parcelable parcelable) {
            if (parcelable instanceof e) {
                restoreScrollState((e) parcelable, true);
                super.onRestoreInstanceState(coordinatorLayout, (View) t, this.savedState.a);
            } else {
                super.onRestoreInstanceState(coordinatorLayout, (View) t, parcelable);
                this.savedState = null;
            }
        }

        @Override // defpackage.uk6
        public Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t) {
            Parcelable onSaveInstanceState = super.onSaveInstanceState(coordinatorLayout, (View) t);
            e saveScrollState = saveScrollState(onSaveInstanceState, t);
            return saveScrollState == null ? onSaveInstanceState : saveScrollState;
        }

        @Override // defpackage.uk6
        public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t, @NonNull View view, View view2, int i, int i2) {
            ValueAnimator valueAnimator;
            boolean z = (i & 2) != 0 && (t.l || t.k || canScrollChildren(coordinatorLayout, t, view));
            if (z && (valueAnimator = this.offsetAnimator) != null) {
                valueAnimator.cancel();
            }
            this.lastNestedScrollingChildRef = null;
            this.lastStartedType = i2;
            return z;
        }

        @Override // defpackage.uk6
        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, @NonNull T t, View view, int i) {
            if (this.lastStartedType == 0 || i == 1) {
                snapToChildIfNeeded(coordinatorLayout, t);
                if (t.l) {
                    t.g(t.h(view));
                }
            }
            this.lastNestedScrollingChildRef = new WeakReference<>(view);
        }

        public void restoreScrollState(e eVar, boolean z) {
            if (this.savedState == null || z) {
                this.savedState = eVar;
            }
        }

        public e saveScrollState(Parcelable parcelable, @NonNull T t) {
            int topAndBottomOffset = getTopAndBottomOffset();
            int childCount = t.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = t.getChildAt(i);
                int bottom = childAt.getBottom() + topAndBottomOffset;
                if (childAt.getTop() + topAndBottomOffset <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = androidx.customview.view.a.b;
                    }
                    e eVar = new e(parcelable);
                    boolean z = topAndBottomOffset == 0;
                    eVar.d = z;
                    eVar.c = !z && (-topAndBottomOffset) >= t.getTotalScrollRange();
                    eVar.e = i;
                    eVar.g = bottom == t.getTopInset() + childAt.getMinimumHeight();
                    eVar.f = bottom / childAt.getHeight();
                    return eVar;
                }
            }
            return null;
        }

        public void setDragCallback(c cVar) {
            this.onDragCallback = cVar;
        }

        @Override // defpackage.oud
        public int setHeaderTopBottomOffset(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t, int i, int i2, int i3) {
            int topBottomOffsetForScrollingSibling = getTopBottomOffsetForScrollingSibling();
            int i4 = 0;
            if (i2 == 0 || topBottomOffsetForScrollingSibling < i2 || topBottomOffsetForScrollingSibling > i3) {
                this.offsetDelta = 0;
            } else {
                int y = hyf.y(i, i2, i3);
                if (topBottomOffsetForScrollingSibling != y) {
                    int interpolateOffset = t.e ? interpolateOffset(t, y) : y;
                    boolean topAndBottomOffset = setTopAndBottomOffset(interpolateOffset);
                    int i5 = topBottomOffsetForScrollingSibling - y;
                    this.offsetDelta = y - interpolateOffset;
                    if (topAndBottomOffset) {
                        for (int i6 = 0; i6 < t.getChildCount(); i6++) {
                            vp0 vp0Var = (vp0) t.getChildAt(i6).getLayoutParams();
                            qne qneVar = vp0Var.b;
                            if (qneVar != null && (vp0Var.a & 1) != 0) {
                                View childAt = t.getChildAt(i6);
                                float topAndBottomOffset2 = getTopAndBottomOffset();
                                Rect rect = (Rect) qneVar.b;
                                Rect rect2 = (Rect) qneVar.a;
                                childAt.getDrawingRect(rect2);
                                t.offsetDescendantRectToMyCoords(childAt, rect2);
                                rect2.offset(0, -t.getTopInset());
                                float abs = rect2.top - Math.abs(topAndBottomOffset2);
                                if (abs <= 0.0f) {
                                    float x = 1.0f - hyf.x(Math.abs(abs / rect2.height()), 0.0f, 1.0f);
                                    float height = (-abs) - ((rect2.height() * 0.3f) * (1.0f - (x * x)));
                                    childAt.setTranslationY(height);
                                    childAt.getDrawingRect(rect);
                                    rect.offset(0, (int) (-height));
                                    if (height >= rect.height()) {
                                        childAt.setAlpha(0.0f);
                                    } else {
                                        childAt.setAlpha(1.0f);
                                    }
                                    childAt.setClipBounds(rect);
                                } else {
                                    childAt.setClipBounds(null);
                                    childAt.setTranslationY(0.0f);
                                    childAt.setAlpha(1.0f);
                                }
                            }
                        }
                    }
                    if (!topAndBottomOffset && t.e) {
                        coordinatorLayout.s(t);
                    }
                    t.e(getTopAndBottomOffset());
                    updateAppBarLayoutDrawableState(coordinatorLayout, t, y, y < topBottomOffsetForScrollingSibling ? -1 : 1, false);
                    i4 = i5;
                }
            }
            addAccessibilityDelegateIfNeeded(coordinatorLayout, t);
            return i4;
        }

        public BaseBehavior() {
        }

        @Override // defpackage.oud
        public int getScrollRangeForDragFling(@NonNull T t) {
            return t.getTotalScrollRange();
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return c(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return c(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        vp0 vp0Var = new vp0(-1, -2);
        vp0Var.a = 1;
        return vp0Var;
    }

    public static class ScrollingViewBehavior extends g {
        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vdn.K);
            setOverlayTop(obtainStyledAttributes.getDimensionPixelSize(0, 0));
            obtainStyledAttributes.recycle();
        }

        private static int getAppBarLayoutOffset(@NonNull AppBarLayout appBarLayout) {
            uk6 uk6Var = ((xk6) appBarLayout.getLayoutParams()).a;
            if (uk6Var instanceof BaseBehavior) {
                return ((BaseBehavior) uk6Var).getTopBottomOffsetForScrollingSibling();
            }
            return 0;
        }

        private void offsetChildAsNeeded(@NonNull View view, @NonNull View view2) {
            uk6 uk6Var = ((xk6) view2.getLayoutParams()).a;
            if (uk6Var instanceof BaseBehavior) {
                int verticalLayoutGap = (getVerticalLayoutGap() + (((BaseBehavior) uk6Var).offsetDelta + (view2.getBottom() - view.getTop()))) - getOverlapPixelsForOffset(view2);
                WeakHashMap weakHashMap = wdu.a;
                view.offsetTopAndBottom(verticalLayoutGap);
            }
        }

        private void updateLiftedStateIfNeeded(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.l) {
                    appBarLayout.g(appBarLayout.h(view));
                }
            }
        }

        @Override // com.google.android.material.appbar.g
        public AppBarLayout findFirstDependency(@NonNull List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // defpackage.mfu
        public /* bridge */ /* synthetic */ int getLeftAndRightOffset() {
            return super.getLeftAndRightOffset();
        }

        @Override // com.google.android.material.appbar.g
        public float getOverlapRatioForOffset(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int appBarLayoutOffset = getAppBarLayoutOffset(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + appBarLayoutOffset > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (appBarLayoutOffset / i) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // com.google.android.material.appbar.g
        public int getScrollRange(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : view.getMeasuredHeight();
        }

        @Override // defpackage.mfu
        public /* bridge */ /* synthetic */ int getTopAndBottomOffset() {
            return super.getTopAndBottomOffset();
        }

        @Override // defpackage.mfu
        public /* bridge */ /* synthetic */ boolean isHorizontalOffsetEnabled() {
            return super.isHorizontalOffsetEnabled();
        }

        @Override // defpackage.mfu
        public /* bridge */ /* synthetic */ boolean isVerticalOffsetEnabled() {
            return super.isVerticalOffsetEnabled();
        }

        @Override // defpackage.uk6
        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // defpackage.uk6
        public boolean onDependentViewChanged(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
            offsetChildAsNeeded(view, view2);
            updateLiftedStateIfNeeded(view, view2);
            return false;
        }

        @Override // defpackage.uk6
        public void onDependentViewRemoved(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
            if (view2 instanceof AppBarLayout) {
                wdu.q(coordinatorLayout, null);
            }
        }

        @Override // defpackage.mfu, defpackage.uk6
        public /* bridge */ /* synthetic */ boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i) {
            super.onLayoutChild(coordinatorLayout, view, i);
            return true;
        }

        @Override // com.google.android.material.appbar.g, defpackage.uk6
        public /* bridge */ /* synthetic */ boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i, int i2, int i3, int i4) {
            return super.onMeasureChild(coordinatorLayout, view, i, i2, i3, i4);
        }

        @Override // defpackage.uk6
        public boolean onRequestChildRectangleOnScreen(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull Rect rect, boolean z) {
            AppBarLayout findFirstDependency = findFirstDependency((List<View>) coordinatorLayout.u(view));
            if (findFirstDependency != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                Rect rect3 = this.tempRect1;
                rect3.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect3.contains(rect2)) {
                    findFirstDependency.f(false, !z, true);
                    return true;
                }
            }
            return false;
        }

        @Override // defpackage.mfu
        public /* bridge */ /* synthetic */ void setHorizontalOffsetEnabled(boolean z) {
            super.setHorizontalOffsetEnabled(z);
        }

        @Override // defpackage.mfu
        public /* bridge */ /* synthetic */ boolean setLeftAndRightOffset(int i) {
            return super.setLeftAndRightOffset(i);
        }

        @Override // defpackage.mfu
        public /* bridge */ /* synthetic */ boolean setTopAndBottomOffset(int i) {
            return super.setTopAndBottomOffset(i);
        }

        @Override // defpackage.mfu
        public /* bridge */ /* synthetic */ void setVerticalOffsetEnabled(boolean z) {
            super.setVerticalOffsetEnabled(z);
        }

        public ScrollingViewBehavior() {
        }

        @Override // com.google.android.material.appbar.g
        public /* bridge */ /* synthetic */ View findFirstDependency(@NonNull List list) {
            return findFirstDependency((List<View>) list);
        }
    }

    public AppBarLayout(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.appBarLayoutStyle);
    }

    public AppBarLayout(@NonNull Context context) {
        this(context, null);
    }
}
