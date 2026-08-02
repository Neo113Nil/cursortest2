package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import defpackage.bcx;
import defpackage.bg3;
import defpackage.cy7;
import defpackage.dtb;
import defpackage.e0;
import defpackage.e0c;
import defpackage.efo;
import defpackage.eup;
import defpackage.fjc;
import defpackage.fvp;
import defpackage.fxf;
import defpackage.g8c;
import defpackage.gjc;
import defpackage.id3;
import defpackage.ijc;
import defpackage.ir0;
import defpackage.ivf;
import defpackage.leo;
import defpackage.ljc;
import defpackage.mjc;
import defpackage.mr0;
import defpackage.piu;
import defpackage.pt0;
import defpackage.rvf;
import defpackage.tk6;
import defpackage.uk6;
import defpackage.v2c;
import defpackage.vdn;
import defpackage.wdu;
import defpackage.xk6;
import defpackage.xq0;
import defpackage.yc3;
import defpackage.zei;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public class FloatingActionButton extends piu implements dtb, fvp, tk6 {
    public ColorStateList b;
    public PorterDuff.Mode c;
    public ColorStateList d;
    public PorterDuff.Mode e;
    public ColorStateList f;
    public int g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public final Rect l;
    public final Rect m;
    public final mr0 n;
    public final e0 o;
    public mjc p;

    public FloatingActionButton(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(bg3.p0(context, attributeSet, i, R.style.Widget_Design_FloatingActionButton), attributeSet, i);
        ColorStateList colorStateList;
        Drawable drawable;
        Drawable drawable2;
        this.l = new Rect();
        this.m = new Rect();
        Context context2 = getContext();
        TypedArray B = bcx.B(context2, attributeSet, vdn.p, i, R.style.Widget_Design_FloatingActionButton, new int[0]);
        this.b = ivf.D(context2, B, 1);
        this.c = fxf.L(B.getInt(2, -1), null);
        this.f = ivf.D(context2, B, 12);
        this.g = B.getInt(7, -1);
        this.h = B.getDimensionPixelSize(6, 0);
        int dimensionPixelSize = B.getDimensionPixelSize(3, 0);
        float dimension = B.getDimension(4, 0.0f);
        float dimension2 = B.getDimension(9, 0.0f);
        float dimension3 = B.getDimension(11, 0.0f);
        this.k = B.getBoolean(16, false);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.mtrl_fab_min_touch_target);
        setMaxImageSize(B.getDimensionPixelSize(10, 0));
        zei a = zei.a(context2, B, 15);
        zei a2 = zei.a(context2, B, 8);
        eup e = eup.d(context2, attributeSet, i, R.style.Widget_Design_FloatingActionButton, eup.m).e();
        boolean z = B.getBoolean(5, false);
        setEnabled(B.getBoolean(0, true));
        B.recycle();
        mr0 mr0Var = new mr0(this);
        this.n = mr0Var;
        mr0Var.b(attributeSet, i);
        this.o = new e0(this);
        getImpl().h(e);
        mjc impl = getImpl();
        ColorStateList colorStateList2 = this.b;
        PorterDuff.Mode mode = this.c;
        ColorStateList colorStateList3 = this.f;
        FloatingActionButton floatingActionButton = impl.v;
        eup eupVar = impl.a;
        eupVar.getClass();
        ljc ljcVar = new ljc(eupVar);
        impl.b = ljcVar;
        ljcVar.setTintList(colorStateList2);
        if (mode != null) {
            impl.b.setTintMode(mode);
        }
        impl.b.n(floatingActionButton.getContext());
        if (dimensionPixelSize > 0) {
            Context context3 = floatingActionButton.getContext();
            eup eupVar2 = impl.a;
            eupVar2.getClass();
            yc3 yc3Var = new yc3(eupVar2);
            int color = context3.getColor(R.color.design_fab_stroke_top_outer_color);
            int color2 = context3.getColor(R.color.design_fab_stroke_top_inner_color);
            colorStateList = colorStateList3;
            int color3 = context3.getColor(R.color.design_fab_stroke_end_inner_color);
            int color4 = context3.getColor(R.color.design_fab_stroke_end_outer_color);
            yc3Var.i = color;
            yc3Var.j = color2;
            yc3Var.k = color3;
            yc3Var.l = color4;
            float f = dimensionPixelSize;
            if (yc3Var.h != f) {
                yc3Var.h = f;
                yc3Var.b.setStrokeWidth(f * 1.3333f);
                yc3Var.n = true;
                yc3Var.invalidateSelf();
            }
            if (colorStateList2 != null) {
                yc3Var.m = colorStateList2.getColorForState(yc3Var.getState(), yc3Var.m);
            }
            yc3Var.p = colorStateList2;
            yc3Var.n = true;
            yc3Var.invalidateSelf();
            impl.d = yc3Var;
            yc3 yc3Var2 = impl.d;
            yc3Var2.getClass();
            ljc ljcVar2 = impl.b;
            ljcVar2.getClass();
            drawable2 = new LayerDrawable(new Drawable[]{yc3Var2, ljcVar2});
            drawable = null;
        } else {
            colorStateList = colorStateList3;
            drawable = null;
            impl.d = null;
            drawable2 = impl.b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(leo.b(colorStateList), drawable2, drawable);
        impl.c = rippleDrawable;
        impl.e = rippleDrawable;
        getImpl().k = dimensionPixelSize2;
        mjc impl2 = getImpl();
        if (impl2.h != dimension) {
            impl2.h = dimension;
            impl2.e(dimension, impl2.i, impl2.j);
        }
        mjc impl3 = getImpl();
        if (impl3.i != dimension2) {
            impl3.i = dimension2;
            impl3.e(impl3.h, dimension2, impl3.j);
        }
        mjc impl4 = getImpl();
        if (impl4.j != dimension3) {
            impl4.j = dimension3;
            impl4.e(impl4.h, impl4.i, dimension3);
        }
        getImpl().n = a;
        getImpl().o = a2;
        getImpl().f = z;
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private mjc getImpl() {
        if (this.p == null) {
            this.p = new mjc(this, new g8c(this));
        }
        return this.p;
    }

    public final void c(id3 id3Var) {
        mjc impl = getImpl();
        if (impl.t == null) {
            impl.t = new ArrayList();
        }
        impl.t.add(id3Var);
    }

    public final void d(id3 id3Var) {
        mjc impl = getImpl();
        if (impl.s == null) {
            impl.s = new ArrayList();
        }
        impl.s.add(id3Var);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
    }

    public final void e(efo efoVar) {
        mjc impl = getImpl();
        gjc gjcVar = new gjc(this, efoVar);
        if (impl.u == null) {
            impl.u = new ArrayList();
        }
        impl.u.add(gjcVar);
    }

    public final void f(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        int i = rect.left;
        Rect rect2 = this.l;
        rect.left = i + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    public final int g(int i) {
        int i2 = this.h;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        return i != -1 ? i != 1 ? resources.getDimensionPixelSize(R.dimen.design_fab_size_normal) : resources.getDimensionPixelSize(R.dimen.design_fab_size_mini) : Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? g(1) : g(0);
    }

    @Override // android.widget.ImageButton, android.widget.ImageView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "com.google.android.material.floatingactionbutton.FloatingActionButton";
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.b;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.c;
    }

    @Override // defpackage.tk6
    @NonNull
    public uk6 getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().v.getElevation();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().i;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().j;
    }

    public Drawable getContentBackground() {
        return getImpl().e;
    }

    public int getCustomSize() {
        return this.h;
    }

    public int getExpandedComponentIdHint() {
        return this.o.c;
    }

    public zei getHideMotionSpec() {
        return getImpl().o;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f;
    }

    @NonNull
    public eup getShapeAppearanceModel() {
        eup eupVar = getImpl().a;
        eupVar.getClass();
        return eupVar;
    }

    public zei getShowMotionSpec() {
        return getImpl().n;
    }

    public int getSize() {
        return this.g;
    }

    public int getSizeDimension() {
        return g(this.g);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.d;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.e;
    }

    public boolean getUseCompatPadding() {
        return this.k;
    }

    public final void h(fjc fjcVar, boolean z) {
        mjc impl = getImpl();
        pt0 pt0Var = fjcVar == null ? null : new pt0((Object) this, (Object) fjcVar, false);
        FloatingActionButton floatingActionButton = impl.v;
        FloatingActionButton floatingActionButton2 = impl.v;
        int visibility = floatingActionButton.getVisibility();
        int i = impl.r;
        if (visibility == 0) {
            if (i == 1) {
                return;
            }
        } else if (i != 2) {
            return;
        }
        Animator animator = impl.m;
        if (animator != null) {
            animator.cancel();
        }
        if (!floatingActionButton2.isLaidOut() || floatingActionButton2.isInEditMode()) {
            floatingActionButton2.a(z ? 8 : 4, z);
            if (pt0Var != null) {
                ((fjc) pt0Var.a).a((FloatingActionButton) pt0Var.b);
                return;
            }
            return;
        }
        zei zeiVar = impl.o;
        AnimatorSet b = zeiVar != null ? impl.b(zeiVar, 0.0f, 0.0f, 0.0f) : impl.c(0.0f, 0.4f, 0.4f, mjc.E, mjc.F);
        b.addListener(new ijc(impl, z, pt0Var));
        ArrayList arrayList = impl.t;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                b.addListener((Animator.AnimatorListener) it.next());
            }
        }
        b.start();
    }

    public final boolean i() {
        mjc impl = getImpl();
        int visibility = impl.v.getVisibility();
        int i = impl.r;
        if (visibility == 0) {
            if (i != 1) {
                return false;
            }
        } else if (i == 2) {
            return false;
        }
        return true;
    }

    public final boolean j() {
        mjc impl = getImpl();
        int visibility = impl.v.getVisibility();
        int i = impl.r;
        if (visibility != 0) {
            if (i != 2) {
                return false;
            }
        } else if (i == 1) {
            return false;
        }
        return true;
    }

    public final void k() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.d;
        if (colorStateList == null) {
            drawable.clearColorFilter();
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.e;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(ir0.c(colorForState, mode));
    }

    public final void l(fjc fjcVar, boolean z) {
        mjc impl = getImpl();
        pt0 pt0Var = fjcVar == null ? null : new pt0((Object) this, (Object) fjcVar, false);
        FloatingActionButton floatingActionButton = impl.v;
        Matrix matrix = impl.A;
        FloatingActionButton floatingActionButton2 = impl.v;
        int visibility = floatingActionButton.getVisibility();
        int i = impl.r;
        if (visibility != 0) {
            if (i == 2) {
                return;
            }
        } else if (i != 1) {
            return;
        }
        Animator animator = impl.m;
        if (animator != null) {
            animator.cancel();
        }
        boolean z2 = impl.n == null;
        if (!floatingActionButton2.isLaidOut() || floatingActionButton2.isInEditMode()) {
            floatingActionButton.a(0, z);
            floatingActionButton.setAlpha(1.0f);
            floatingActionButton.setScaleY(1.0f);
            floatingActionButton.setScaleX(1.0f);
            impl.p = 1.0f;
            impl.a(1.0f, matrix);
            floatingActionButton2.setImageMatrix(matrix);
            if (pt0Var != null) {
                ((fjc) pt0Var.a).b();
                return;
            }
            return;
        }
        if (floatingActionButton.getVisibility() != 0) {
            floatingActionButton.setAlpha(0.0f);
            floatingActionButton.setScaleY(z2 ? 0.4f : 0.0f);
            floatingActionButton.setScaleX(z2 ? 0.4f : 0.0f);
            float f = z2 ? 0.4f : 0.0f;
            impl.p = f;
            impl.a(f, matrix);
            floatingActionButton2.setImageMatrix(matrix);
        }
        zei zeiVar = impl.n;
        AnimatorSet b = zeiVar != null ? impl.b(zeiVar, 1.0f, 1.0f, 1.0f) : impl.c(1.0f, 1.0f, 1.0f, mjc.C, mjc.D);
        b.addListener(new v2c(impl, z, pt0Var));
        ArrayList arrayList = impl.s;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                b.addListener((Animator.AnimatorListener) it.next());
            }
        }
        b.start();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        mjc impl = getImpl();
        ljc ljcVar = impl.b;
        if (ljcVar != null) {
            rvf.K(impl.v, ljcVar);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().v.getViewTreeObserver();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.i = (sizeDimension - this.j) / 2;
        getImpl().i();
        int min = Math.min(View.resolveSize(sizeDimension, i), View.resolveSize(sizeDimension, i2));
        Rect rect = this.l;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof e0c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        e0c e0cVar = (e0c) parcelable;
        super.onRestoreInstanceState(e0cVar.a);
        Bundle bundle = (Bundle) e0cVar.c.get("expandableWidgetHelper");
        bundle.getClass();
        e0 e0Var = this.o;
        e0Var.getClass();
        e0Var.b = bundle.getBoolean("expanded", false);
        e0Var.c = bundle.getInt("expandedComponentIdHint", 0);
        if (e0Var.b) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) e0Var.d;
            ViewParent parent = floatingActionButton.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).s(floatingActionButton);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        e0c e0cVar = new e0c(onSaveInstanceState);
        e0 e0Var = this.o;
        e0Var.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", e0Var.b);
        bundle.putInt("expandedComponentIdHint", e0Var.c);
        e0cVar.c.put("expandableWidgetHelper", bundle);
        return e0cVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            Rect rect = this.m;
            f(rect);
            mjc mjcVar = this.p;
            int i = -(mjcVar.f ? Math.max((mjcVar.k - mjcVar.v.getSizeDimension()) / 2, 0) : 0);
            rect.inset(i, i);
            if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.b != colorStateList) {
            this.b = colorStateList;
            mjc impl = getImpl();
            ljc ljcVar = impl.b;
            if (ljcVar != null) {
                ljcVar.setTintList(colorStateList);
            }
            yc3 yc3Var = impl.d;
            if (yc3Var != null) {
                if (colorStateList != null) {
                    yc3Var.m = colorStateList.getColorForState(yc3Var.getState(), yc3Var.m);
                }
                yc3Var.p = colorStateList;
                yc3Var.n = true;
                yc3Var.invalidateSelf();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.c != mode) {
            this.c = mode;
            ljc ljcVar = getImpl().b;
            if (ljcVar != null) {
                ljcVar.setTintMode(mode);
            }
        }
    }

    public void setCompatElevation(float f) {
        mjc impl = getImpl();
        if (impl.h != f) {
            impl.h = f;
            impl.e(f, impl.i, impl.j);
        }
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        mjc impl = getImpl();
        if (impl.i != f) {
            impl.i = f;
            impl.e(impl.h, f, impl.j);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        mjc impl = getImpl();
        if (impl.j != f) {
            impl.j = f;
            impl.e(impl.h, impl.i, f);
        }
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(int i) {
        if (i < 0) {
            xq0.x("Custom size must be non-negative");
        } else if (i != this.h) {
            this.h = i;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        ljc ljcVar = getImpl().b;
        if (ljcVar != null) {
            ljcVar.q(f);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().f) {
            getImpl().f = z;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i) {
        this.o.c = i;
    }

    public void setHideMotionSpec(zei zeiVar) {
        getImpl().o = zeiVar;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(zei.b(getContext(), i));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            mjc impl = getImpl();
            float f = impl.p;
            impl.p = f;
            Matrix matrix = impl.A;
            impl.a(f, matrix);
            impl.v.setImageMatrix(matrix);
            if (this.d != null) {
                k();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.n.c(i);
        k();
    }

    public void setMaxImageSize(int i) {
        this.j = i;
        mjc impl = getImpl();
        if (impl.q != i) {
            impl.q = i;
            float f = impl.p;
            impl.p = f;
            Matrix matrix = impl.A;
            impl.a(f, matrix);
            impl.v.setImageMatrix(matrix);
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f != colorStateList) {
            this.f = colorStateList;
            mjc impl = getImpl();
            ColorStateList colorStateList2 = this.f;
            RippleDrawable rippleDrawable = impl.c;
            if (rippleDrawable != null) {
                rippleDrawable.setColor(leo.b(colorStateList2));
            } else if (rippleDrawable != null) {
                rippleDrawable.setTintList(leo.b(colorStateList2));
            }
        }
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        super.setScaleX(f);
        getImpl().f();
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        super.setScaleY(f);
        getImpl().f();
    }

    public void setShadowPaddingEnabled(boolean z) {
        mjc impl = getImpl();
        impl.g = z;
        impl.i();
    }

    @Override // defpackage.fvp
    public void setShapeAppearanceModel(@NonNull eup eupVar) {
        getImpl().h(eupVar);
    }

    public void setShowMotionSpec(zei zeiVar) {
        getImpl().n = zeiVar;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(zei.b(getContext(), i));
    }

    public void setSize(int i) {
        this.h = 0;
        if (i != this.g) {
            this.g = i;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.d != colorStateList) {
            this.d = colorStateList;
            k();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.e != mode) {
            this.e = mode;
            k();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().g();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().g();
    }

    @Override // android.view.View
    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().g();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.k != z) {
            this.k = z;
            getImpl().i();
        }
    }

    @Override // defpackage.piu, android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ boolean getInsetDodgeRect(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton, @NonNull Rect rect) {
            return super.getInsetDodgeRect(coordinatorLayout, floatingActionButton, rect);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ boolean isAutoHideEnabled() {
            return super.isAutoHideEnabled();
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior, defpackage.uk6
        public /* bridge */ /* synthetic */ void onAttachedToLayoutParams(@NonNull xk6 xk6Var) {
            super.onAttachedToLayoutParams(xk6Var);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton, View view) {
            return super.onDependentViewChanged(coordinatorLayout, floatingActionButton, view);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton, int i) {
            return super.onLayoutChild(coordinatorLayout, floatingActionButton, i);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ void setAutoHideEnabled(boolean z) {
            super.setAutoHideEnabled(z);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ void setInternalAutoHideListener(fjc fjcVar) {
            super.setInternalAutoHideListener(fjcVar);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class BaseBehavior<T extends FloatingActionButton> extends uk6 {
        private static final boolean AUTO_HIDE_DEFAULT = true;
        private boolean autoHideEnabled;
        private fjc internalAutoHideListener;
        private Rect tmpRect;

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vdn.q);
            this.autoHideEnabled = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }

        private boolean ignoreUpdateVisibility(@NonNull View view, @NonNull FloatingActionButton floatingActionButton) {
            return (this.autoHideEnabled && ((xk6) floatingActionButton.getLayoutParams()).f == view.getId() && floatingActionButton.getUserSetVisibility() == 0) ? false : true;
        }

        private static boolean isBottomSheet(@NonNull View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof xk6) {
                return ((xk6) layoutParams).a instanceof BottomSheetBehavior;
            }
            return false;
        }

        private void offsetIfNeeded(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton) {
            Rect rect = floatingActionButton.l;
            if (rect.centerX() <= 0 || rect.centerY() <= 0) {
                return;
            }
            xk6 xk6Var = (xk6) floatingActionButton.getLayoutParams();
            int i = 0;
            int i2 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) xk6Var).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) xk6Var).leftMargin ? -rect.left : 0;
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) xk6Var).bottomMargin) {
                i = rect.bottom;
            } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) xk6Var).topMargin) {
                i = -rect.top;
            }
            if (i != 0) {
                WeakHashMap weakHashMap = wdu.a;
                floatingActionButton.offsetTopAndBottom(i);
            }
            if (i2 != 0) {
                WeakHashMap weakHashMap2 = wdu.a;
                floatingActionButton.offsetLeftAndRight(i2);
            }
        }

        private boolean updateFabVisibilityForAppBarLayout(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull FloatingActionButton floatingActionButton) {
            if (ignoreUpdateVisibility(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.tmpRect == null) {
                this.tmpRect = new Rect();
            }
            Rect rect = this.tmpRect;
            cy7.a(coordinatorLayout, appBarLayout, rect);
            int i = rect.bottom;
            int minimumHeightForVisibleOverlappingContent = appBarLayout.getMinimumHeightForVisibleOverlappingContent();
            fjc fjcVar = this.internalAutoHideListener;
            if (i <= minimumHeightForVisibleOverlappingContent) {
                floatingActionButton.h(fjcVar, false);
                return true;
            }
            floatingActionButton.l(fjcVar, false);
            return true;
        }

        private boolean updateFabVisibilityForBottomSheet(@NonNull View view, @NonNull FloatingActionButton floatingActionButton) {
            if (ignoreUpdateVisibility(view, floatingActionButton)) {
                return false;
            }
            xk6 xk6Var = (xk6) floatingActionButton.getLayoutParams();
            int top = view.getTop();
            int height = (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) xk6Var).topMargin;
            fjc fjcVar = this.internalAutoHideListener;
            if (top < height) {
                floatingActionButton.h(fjcVar, false);
                return true;
            }
            floatingActionButton.l(fjcVar, false);
            return true;
        }

        @Override // defpackage.uk6
        public boolean getInsetDodgeRect(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton, @NonNull Rect rect) {
            Rect rect2 = floatingActionButton.l;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        public boolean isAutoHideEnabled() {
            return this.autoHideEnabled;
        }

        @Override // defpackage.uk6
        public void onAttachedToLayoutParams(@NonNull xk6 xk6Var) {
            if (xk6Var.h == 0) {
                xk6Var.h = 80;
            }
        }

        @Override // defpackage.uk6
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                updateFabVisibilityForAppBarLayout(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            }
            if (!isBottomSheet(view)) {
                return false;
            }
            updateFabVisibilityForBottomSheet(view, floatingActionButton);
            return false;
        }

        @Override // defpackage.uk6
        public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton, int i) {
            List u = coordinatorLayout.u(floatingActionButton);
            int size = u.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = (View) u.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (isBottomSheet(view) && updateFabVisibilityForBottomSheet(view, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (updateFabVisibilityForAppBarLayout(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.B(i, floatingActionButton);
            offsetIfNeeded(coordinatorLayout, floatingActionButton);
            return true;
        }

        public void setAutoHideEnabled(boolean z) {
            this.autoHideEnabled = z;
        }

        public void setInternalAutoHideListener(fjc fjcVar) {
            this.internalAutoHideListener = fjcVar;
        }

        public BaseBehavior() {
            this.autoHideEnabled = true;
        }
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    public FloatingActionButton(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.floatingActionButtonStyle);
    }

    public FloatingActionButton(@NonNull Context context) {
        this(context, null);
    }
}
