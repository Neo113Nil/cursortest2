package com.google.android.material.bottomappbar;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import defpackage.bcx;
import defpackage.bg3;
import defpackage.ciq;
import defpackage.efo;
import defpackage.eup;
import defpackage.fxf;
import defpackage.h1b;
import defpackage.h5;
import defpackage.hd3;
import defpackage.id3;
import defpackage.ivf;
import defpackage.ix6;
import defpackage.kd3;
import defpackage.ld3;
import defpackage.md3;
import defpackage.nd3;
import defpackage.od3;
import defpackage.qos;
import defpackage.rvf;
import defpackage.szf;
import defpackage.tk6;
import defpackage.u98;
import defpackage.vdn;
import defpackage.vgo;
import defpackage.wm0;
import defpackage.xk6;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public class BottomAppBar extends Toolbar implements tk6 {
    public static final /* synthetic */ int a1 = 0;
    public Integer D0;
    public final com.google.android.material.shape.a E0;
    public AnimatorSet F0;
    public AnimatorSet G0;
    public int H0;
    public int I0;
    public int J0;
    public final int K0;
    public int L0;
    public int M0;
    public final boolean N0;
    public boolean O0;
    public final boolean P0;
    public final boolean Q0;
    public final boolean R0;
    public boolean S0;
    public boolean T0;
    public Behavior U0;
    public int V0;
    public int W0;
    public int X0;
    public final id3 Y0;
    public final efo Z0;

    public BottomAppBar(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(bg3.p0(context, attributeSet, i, R.style.Widget_MaterialComponents_BottomAppBar), attributeSet, i);
        com.google.android.material.shape.a aVar = new com.google.android.material.shape.a();
        this.E0 = aVar;
        this.S0 = false;
        this.T0 = true;
        this.Y0 = new id3(this, 0);
        this.Z0 = new efo(11, this);
        Context context2 = getContext();
        TypedArray B = bcx.B(context2, attributeSet, vdn.e, i, R.style.Widget_MaterialComponents_BottomAppBar, new int[0]);
        ColorStateList D = ivf.D(context2, B, 1);
        if (B.hasValue(12)) {
            setNavigationIconTint(B.getColor(12, -1));
        }
        int dimensionPixelSize = B.getDimensionPixelSize(2, 0);
        float dimensionPixelOffset = B.getDimensionPixelOffset(7, 0);
        float dimensionPixelOffset2 = B.getDimensionPixelOffset(8, 0);
        float dimensionPixelOffset3 = B.getDimensionPixelOffset(9, 0);
        this.H0 = B.getInt(3, 0);
        this.I0 = B.getInt(6, 0);
        this.J0 = B.getInt(5, 1);
        this.N0 = B.getBoolean(16, true);
        this.M0 = B.getInt(11, 0);
        this.O0 = B.getBoolean(10, false);
        this.P0 = B.getBoolean(13, false);
        this.Q0 = B.getBoolean(14, false);
        this.R0 = B.getBoolean(15, false);
        this.L0 = B.getDimensionPixelOffset(4, -1);
        boolean z = B.getBoolean(0, true);
        B.recycle();
        this.K0 = getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fabOffsetEndMode);
        od3 od3Var = new od3();
        od3Var.r = -1.0f;
        od3Var.n = dimensionPixelOffset;
        od3Var.m = dimensionPixelOffset2;
        od3Var.b0(dimensionPixelOffset3);
        od3Var.q = 0.0f;
        vgo vgoVar = new vgo();
        vgo vgoVar2 = new vgo();
        vgo vgoVar3 = new vgo();
        vgo vgoVar4 = new vgo();
        h5 h5Var = new h5(0.0f);
        h5 h5Var2 = new h5(0.0f);
        h5 h5Var3 = new h5(0.0f);
        h5 h5Var4 = new h5(0.0f);
        h1b h1bVar = new h1b();
        h1b h1bVar2 = new h1b();
        h1b h1bVar3 = new h1b();
        eup eupVar = new eup();
        eupVar.a = vgoVar;
        eupVar.b = vgoVar2;
        eupVar.c = vgoVar3;
        eupVar.d = vgoVar4;
        eupVar.e = h5Var;
        eupVar.f = h5Var2;
        eupVar.g = h5Var3;
        eupVar.h = h5Var4;
        eupVar.i = od3Var;
        eupVar.j = h1bVar;
        eupVar.k = h1bVar2;
        eupVar.l = h1bVar3;
        aVar.setShapeAppearanceModel(eupVar);
        if (z) {
            aVar.v(2);
        } else {
            aVar.v(1);
            if (Build.VERSION.SDK_INT >= 28) {
                setOutlineAmbientShadowColor(0);
                setOutlineSpotShadowColor(0);
            }
        }
        Paint.Style style = Paint.Style.FILL;
        aVar.t();
        aVar.n(context2);
        aVar.setTintList(D);
        setElevation(dimensionPixelSize);
        setBackground(aVar);
        ix6 ix6Var = new ix6(12, this);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, vdn.t, i, R.style.Widget_MaterialComponents_BottomAppBar);
        boolean z2 = obtainStyledAttributes.getBoolean(4, false);
        boolean z3 = obtainStyledAttributes.getBoolean(5, false);
        boolean z4 = obtainStyledAttributes.getBoolean(6, false);
        obtainStyledAttributes.recycle();
        fxf.w(this, new u98(z2, z3, z4, ix6Var));
    }

    public static void L(BottomAppBar bottomAppBar, View view) {
        xk6 xk6Var = (xk6) view.getLayoutParams();
        xk6Var.d = 17;
        int i = bottomAppBar.J0;
        if (i == 1) {
            xk6Var.d = 49;
        }
        if (i == 0) {
            xk6Var.d |= 80;
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return this.V0;
    }

    private int getFabAlignmentAnimationDuration() {
        return szf.p0(getContext(), R.attr.motionDurationLong2, 300);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationX() {
        return E(this.H0);
    }

    private float getFabTranslationY() {
        if (this.J0 == 1) {
            return -getTopEdgeTreatment().p;
        }
        return C() != null ? (-((getMeasuredHeight() + getBottomInset()) - r0.getMeasuredHeight())) / 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return this.X0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return this.W0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public od3 getTopEdgeTreatment() {
        return (od3) this.E0.b.a.i;
    }

    public final View C() {
        if (getParent() instanceof CoordinatorLayout) {
            ArrayList arrayList = (ArrayList) ((ciq) ((CoordinatorLayout) getParent()).b.b).get(this);
            List<View> arrayList2 = arrayList == null ? null : new ArrayList(arrayList);
            if (arrayList2 == null) {
                arrayList2 = Collections.EMPTY_LIST;
            }
            for (View view : arrayList2) {
                if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                    return view;
                }
            }
        }
        return null;
    }

    public final int D(ActionMenuView actionMenuView, int i, boolean z) {
        int i2 = 0;
        if (this.M0 != 1 && (i != 1 || !z)) {
            return 0;
        }
        boolean z2 = getLayoutDirection() == 1;
        int measuredWidth = z2 ? getMeasuredWidth() : 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if ((childAt.getLayoutParams() instanceof qos) && (((qos) childAt.getLayoutParams()).a & 8388615) == 8388611) {
                measuredWidth = z2 ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        int right = z2 ? actionMenuView.getRight() : actionMenuView.getLeft();
        int i4 = z2 ? this.W0 : -this.X0;
        if (getNavigationIcon() == null) {
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.m3_bottomappbar_horizontal_padding);
            if (!z2) {
                dimensionPixelOffset = -dimensionPixelOffset;
            }
            i2 = dimensionPixelOffset;
        }
        return measuredWidth - ((right + i4) + i2);
    }

    public final float E(int i) {
        boolean z = getLayoutDirection() == 1;
        if (i != 1) {
            return 0.0f;
        }
        View C = C();
        int i2 = z ? this.X0 : this.W0;
        return ((getMeasuredWidth() / 2) - ((this.L0 == -1 || C == null) ? this.K0 + i2 : ((C.getMeasuredWidth() / 2) + this.L0) + i2)) * (z ? -1 : 1);
    }

    public final boolean F() {
        View C = C();
        FloatingActionButton floatingActionButton = C instanceof FloatingActionButton ? (FloatingActionButton) C : null;
        return floatingActionButton != null && floatingActionButton.j();
    }

    public final void G(int i, boolean z) {
        if (!isLaidOut()) {
            this.S0 = false;
            return;
        }
        AnimatorSet animatorSet = this.G0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!F()) {
            i = 0;
            z = false;
        }
        ActionMenuView actionMenuView = getActionMenuView();
        int i2 = 2;
        if (actionMenuView != null) {
            float fabAlignmentAnimationDuration = getFabAlignmentAnimationDuration();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
            ofFloat.setDuration((long) (0.8f * fabAlignmentAnimationDuration));
            if (Math.abs(actionMenuView.getTranslationX() - D(actionMenuView, i, z)) > 1.0f) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
                ofFloat2.setDuration((long) (fabAlignmentAnimationDuration * 0.2f));
                ofFloat2.addListener(new ld3(this, actionMenuView, i, z));
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playSequentially(ofFloat2, ofFloat);
                arrayList.add(animatorSet2);
            } else if (actionMenuView.getAlpha() < 1.0f) {
                arrayList.add(ofFloat);
            }
        }
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(arrayList);
        this.G0 = animatorSet3;
        animatorSet3.addListener(new id3(this, i2));
        this.G0.start();
    }

    public final void H() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.G0 != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        if (F()) {
            K(actionMenuView, this.H0, this.T0, false);
        } else {
            K(actionMenuView, 0, false, false);
        }
    }

    public final void I() {
        getTopEdgeTreatment().q = getFabTranslationX();
        this.E0.s((this.T0 && F() && this.J0 == 1) ? 1.0f : 0.0f);
        View C = C();
        if (C != null) {
            C.setTranslationY(getFabTranslationY());
            C.setTranslationX(getFabTranslationX());
        }
    }

    public final void J(int i) {
        float f = i;
        if (f != getTopEdgeTreatment().o) {
            getTopEdgeTreatment().o = f;
            this.E0.invalidateSelf();
        }
    }

    public final void K(ActionMenuView actionMenuView, int i, boolean z, boolean z2) {
        md3 md3Var = new md3(this, actionMenuView, i, z);
        if (z2) {
            actionMenuView.post(md3Var);
        } else {
            md3Var.run();
        }
    }

    public ColorStateList getBackgroundTint() {
        return this.E0.b.f;
    }

    @Override // defpackage.tk6
    @NonNull
    public Behavior getBehavior() {
        if (this.U0 == null) {
            this.U0 = new Behavior();
        }
        return this.U0;
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().p;
    }

    public int getFabAlignmentMode() {
        return this.H0;
    }

    public int getFabAlignmentModeEndMargin() {
        return this.L0;
    }

    public int getFabAnchorMode() {
        return this.J0;
    }

    public int getFabAnimationMode() {
        return this.I0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().n;
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().m;
    }

    public boolean getHideOnScroll() {
        return this.O0;
    }

    public int getMenuAlignmentMode() {
        return this.M0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        rvf.K(this, this.E0);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            AnimatorSet animatorSet = this.G0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.F0;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            I();
            View C = C();
            if (C != null && C.isLaidOut()) {
                C.post(new hd3(C, 0));
            }
        }
        H();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof nd3)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        nd3 nd3Var = (nd3) parcelable;
        super.onRestoreInstanceState(nd3Var.a);
        this.H0 = nd3Var.c;
        this.T0 = nd3Var.d;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final Parcelable onSaveInstanceState() {
        nd3 nd3Var = new nd3(super.onSaveInstanceState());
        nd3Var.c = this.H0;
        nd3Var.d = this.T0;
        return nd3Var;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        this.E0.setTintList(colorStateList);
    }

    public void setCradleVerticalOffset(float f) {
        if (f != getCradleVerticalOffset()) {
            getTopEdgeTreatment().b0(f);
            this.E0.invalidateSelf();
            I();
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        com.google.android.material.shape.a aVar = this.E0;
        aVar.q(f);
        getBehavior().setAdditionalHiddenOffsetY(this, aVar.b.p - aVar.j());
    }

    public void setFabAlignmentMode(int i) {
        int i2 = 1;
        this.S0 = true;
        G(i, this.T0);
        if (this.H0 != i && isLaidOut()) {
            AnimatorSet animatorSet = this.F0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (this.I0 == 1) {
                View C = C();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(C instanceof FloatingActionButton ? (FloatingActionButton) C : null, "translationX", E(i));
                ofFloat.setDuration(getFabAlignmentAnimationDuration());
                arrayList.add(ofFloat);
            } else {
                View C2 = C();
                FloatingActionButton floatingActionButton = C2 instanceof FloatingActionButton ? (FloatingActionButton) C2 : null;
                if (floatingActionButton != null && !floatingActionButton.i()) {
                    floatingActionButton.h(new kd3(this, i), true);
                }
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(arrayList);
            animatorSet2.setInterpolator(szf.q0(getContext(), R.attr.motionEasingEmphasizedInterpolator, wm0.a));
            this.F0 = animatorSet2;
            animatorSet2.addListener(new id3(this, i2));
            this.F0.start();
        }
        this.H0 = i;
    }

    public void setFabAlignmentModeEndMargin(int i) {
        if (this.L0 != i) {
            this.L0 = i;
            I();
        }
    }

    public void setFabAnchorMode(int i) {
        this.J0 = i;
        I();
        View C = C();
        if (C != null) {
            L(this, C);
            C.requestLayout();
            this.E0.invalidateSelf();
        }
    }

    public void setFabAnimationMode(int i) {
        this.I0 = i;
    }

    public void setFabCornerSize(float f) {
        if (f != getTopEdgeTreatment().r) {
            getTopEdgeTreatment().r = f;
            this.E0.invalidateSelf();
        }
    }

    public void setFabCradleMargin(float f) {
        if (f != getFabCradleMargin()) {
            getTopEdgeTreatment().n = f;
            this.E0.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f) {
        if (f != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().m = f;
            this.E0.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z) {
        this.O0 = z;
    }

    public void setMenuAlignmentMode(int i) {
        if (this.M0 != i) {
            this.M0 = i;
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                K(actionMenuView, this.H0, F(), false);
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.D0 != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.D0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.D0 = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        @NonNull
        private final Rect fabContentRect;
        private final View.OnLayoutChangeListener fabLayoutListener;
        private int originalBottomMargin;
        private WeakReference<BottomAppBar> viewRef;

        public Behavior() {
            this.fabLayoutListener = new a(this);
            this.fabContentRect = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, defpackage.uk6
        public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull BottomAppBar bottomAppBar, int i) {
            this.viewRef = new WeakReference<>(bottomAppBar);
            int i2 = BottomAppBar.a1;
            View C = bottomAppBar.C();
            if (C != null && !C.isLaidOut()) {
                BottomAppBar.L(bottomAppBar, C);
                this.originalBottomMargin = ((ViewGroup.MarginLayoutParams) ((xk6) C.getLayoutParams())).bottomMargin;
                if (C instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) C;
                    if (bottomAppBar.J0 == 0 && bottomAppBar.N0) {
                        floatingActionButton.setElevation(0.0f);
                        floatingActionButton.setCompatElevation(0.0f);
                    }
                    if (floatingActionButton.getShowMotionSpec() == null) {
                        floatingActionButton.setShowMotionSpecResource(R.animator.mtrl_fab_show_motion_spec);
                    }
                    if (floatingActionButton.getHideMotionSpec() == null) {
                        floatingActionButton.setHideMotionSpecResource(R.animator.mtrl_fab_hide_motion_spec);
                    }
                    floatingActionButton.c(bottomAppBar.Y0);
                    floatingActionButton.d(new id3(bottomAppBar, 3));
                    floatingActionButton.e(bottomAppBar.Z0);
                }
                C.addOnLayoutChangeListener(this.fabLayoutListener);
                bottomAppBar.I();
            }
            coordinatorLayout.B(i, bottomAppBar);
            return super.onLayoutChild(coordinatorLayout, (CoordinatorLayout) bottomAppBar, i);
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, defpackage.uk6
        public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull BottomAppBar bottomAppBar, @NonNull View view, @NonNull View view2, int i, int i2) {
            return bottomAppBar.getHideOnScroll() && super.onStartNestedScroll(coordinatorLayout, (CoordinatorLayout) bottomAppBar, view, view2, i, i2);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.fabLayoutListener = new a(this);
            this.fabContentRect = new Rect();
        }
    }

    public BottomAppBar(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bottomAppBarStyle);
    }

    public BottomAppBar(@NonNull Context context) {
        this(context, null);
    }
}
