package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import defpackage.bcx;
import defpackage.bg3;
import defpackage.bnd;
import defpackage.cy7;
import defpackage.es6;
import defpackage.eup;
import defpackage.h0c;
import defpackage.i0c;
import defpackage.j0c;
import defpackage.jzi;
import defpackage.k0c;
import defpackage.k5r;
import defpackage.l0c;
import defpackage.le;
import defpackage.mb4;
import defpackage.rp7;
import defpackage.tk6;
import defpackage.ts2;
import defpackage.uk6;
import defpackage.vdn;
import defpackage.xiu;
import defpackage.xk6;
import defpackage.xq0;
import defpackage.zei;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements tk6 {
    public static final mb4 H0 = new mb4(Float.class, CameraProperty.WIDTH, 7);
    public static final mb4 I0 = new mb4(Float.class, CameraProperty.HEIGHT, 8);
    public static final mb4 J0 = new mb4(Float.class, "paddingStart", 9);
    public static final mb4 K0 = new mb4(Float.class, "paddingEnd", 10);
    public final ExtendedFloatingActionButtonBehavior A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public ColorStateList E0;
    public int F0;
    public int G0;
    public int I;
    public boolean J;
    public final h0c K;
    public final h0c L;
    public final k0c v0;
    public final i0c w0;
    public final int x0;
    public int y0;
    public int z0;

    public ExtendedFloatingActionButton(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(bg3.p0(context, attributeSet, i, R.style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon), attributeSet, i);
        this.I = 0;
        this.J = true;
        jzi jziVar = new jzi();
        k0c k0cVar = new k0c(this, jziVar);
        this.v0 = k0cVar;
        i0c i0cVar = new i0c(this, jziVar);
        this.w0 = i0cVar;
        this.B0 = true;
        this.C0 = false;
        this.D0 = false;
        Context context2 = getContext();
        this.A0 = new ExtendedFloatingActionButtonBehavior(context2, attributeSet);
        TypedArray B = bcx.B(context2, attributeSet, vdn.n, i, R.style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon, new int[0]);
        zei a = zei.a(context2, B, 5);
        zei a2 = zei.a(context2, B, 4);
        zei a3 = zei.a(context2, B, 2);
        zei a4 = zei.a(context2, B, 6);
        this.x0 = B.getDimensionPixelSize(0, -1);
        int i2 = B.getInt(3, 1);
        this.y0 = getPaddingStart();
        this.z0 = getPaddingEnd();
        jzi jziVar2 = new jzi();
        l0c rp7Var = new rp7(this);
        l0c xiuVar = new xiu(this, rp7Var, false, 25);
        es6 es6Var = new es6();
        es6Var.c = this;
        es6Var.a = xiuVar;
        es6Var.b = rp7Var;
        boolean z = true;
        if (i2 != 1) {
            rp7Var = i2 != 2 ? es6Var : xiuVar;
            z = true;
        }
        h0c h0cVar = new h0c(this, jziVar2, rp7Var, z);
        this.L = h0cVar;
        h0c h0cVar2 = new h0c(this, jziVar2, new bnd(29, this), false);
        this.K = h0cVar2;
        k0cVar.f = a;
        i0cVar.f = a2;
        h0cVar.f = a3;
        h0cVar2.f = a4;
        B.recycle();
        setShapeAppearanceModel(eup.d(context2, attributeSet, i, R.style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon, eup.m).e());
        this.E0 = getTextColors();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
    
        if (r5.D0 != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void k(ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
        ts2 ts2Var;
        if (i == 0) {
            ts2Var = extendedFloatingActionButton.v0;
        } else if (i == 1) {
            ts2Var = extendedFloatingActionButton.w0;
        } else if (i == 2) {
            ts2Var = extendedFloatingActionButton.K;
        } else {
            if (i != 3) {
                extendedFloatingActionButton.getClass();
                xq0.q(k5r.i(i, "Unknown strategy type: "));
                return;
            }
            ts2Var = extendedFloatingActionButton.L;
        }
        if (ts2Var.r()) {
            return;
        }
        if (extendedFloatingActionButton.J) {
            if (!extendedFloatingActionButton.isLaidOut()) {
                int visibility = extendedFloatingActionButton.getVisibility();
                int i2 = extendedFloatingActionButton.I;
                if (visibility == 0 ? i2 == 1 : i2 != 2) {
                }
            }
            if (!extendedFloatingActionButton.isInEditMode()) {
                if (i == 2) {
                    ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
                    if (layoutParams != null) {
                        extendedFloatingActionButton.F0 = layoutParams.width;
                        extendedFloatingActionButton.G0 = layoutParams.height;
                    } else {
                        extendedFloatingActionButton.F0 = extendedFloatingActionButton.getWidth();
                        extendedFloatingActionButton.G0 = extendedFloatingActionButton.getHeight();
                    }
                }
                extendedFloatingActionButton.measure(0, 0);
                AnimatorSet b = ts2Var.b();
                b.addListener(new le(6, ts2Var));
                Iterator it = ((ArrayList) ts2Var.c).iterator();
                while (it.hasNext()) {
                    b.addListener((Animator.AnimatorListener) it.next());
                }
                b.start();
                return;
            }
        }
        ts2Var.p();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "com.google.android.material.floatingactionbutton.FloatingActionButton";
    }

    @Override // defpackage.tk6
    @NonNull
    public uk6 getBehavior() {
        return this.A0;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    public int getCollapsedSize() {
        int i = this.x0;
        if (i >= 0) {
            return i;
        }
        return getIconSize() + (Math.min(getPaddingStart(), getPaddingEnd()) * 2);
    }

    public zei getExtendMotionSpec() {
        return (zei) this.L.f;
    }

    public zei getHideMotionSpec() {
        return (zei) this.w0.f;
    }

    public zei getShowMotionSpec() {
        return (zei) this.v0.f;
    }

    public zei getShrinkMotionSpec() {
        return (zei) this.K.f;
    }

    public final void l(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.B0 && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.B0 = false;
            this.K.p();
        }
    }

    public void setAnimateShowBeforeLayout(boolean z) {
        this.D0 = z;
    }

    public void setAnimationEnabled(boolean z) {
        this.J = z;
    }

    public void setExtendMotionSpec(zei zeiVar) {
        this.L.f = zeiVar;
    }

    public void setExtendMotionSpecResource(int i) {
        setExtendMotionSpec(zei.b(getContext(), i));
    }

    public void setExtended(boolean z) {
        if (this.B0 == z) {
            return;
        }
        h0c h0cVar = z ? this.L : this.K;
        if (h0cVar.r()) {
            return;
        }
        h0cVar.p();
    }

    public void setHideMotionSpec(zei zeiVar) {
        this.w0.f = zeiVar;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(zei.b(getContext(), i));
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        if (!this.B0 || this.C0) {
            return;
        }
        this.y0 = getPaddingStart();
        this.z0 = getPaddingEnd();
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        if (!this.B0 || this.C0) {
            return;
        }
        this.y0 = i;
        this.z0 = i3;
    }

    public void setShowMotionSpec(zei zeiVar) {
        this.v0.f = zeiVar;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(zei.b(getContext(), i));
    }

    public void setShrinkMotionSpec(zei zeiVar) {
        this.K.f = zeiVar;
    }

    public void setShrinkMotionSpecResource(int i) {
        setShrinkMotionSpec(zei.b(getContext(), i));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        super.setTextColor(i);
        this.E0 = getTextColors();
    }

    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends uk6 {
        private static final boolean AUTO_HIDE_DEFAULT = false;
        private static final boolean AUTO_SHRINK_DEFAULT = true;
        private boolean autoHideEnabled;
        private boolean autoShrinkEnabled;
        private j0c internalAutoHideCallback;
        private j0c internalAutoShrinkCallback;
        private Rect tmpRect;

        public ExtendedFloatingActionButtonBehavior(@NonNull Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vdn.o);
            this.autoHideEnabled = obtainStyledAttributes.getBoolean(0, false);
            this.autoShrinkEnabled = obtainStyledAttributes.getBoolean(1, true);
            obtainStyledAttributes.recycle();
        }

        private static boolean isBottomSheet(@NonNull View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof xk6) {
                return ((xk6) layoutParams).a instanceof BottomSheetBehavior;
            }
            return false;
        }

        private boolean shouldUpdateVisibility(@NonNull View view, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.autoHideEnabled || this.autoShrinkEnabled) && ((xk6) extendedFloatingActionButton.getLayoutParams()).f == view.getId();
        }

        private boolean updateFabVisibilityForAppBarLayout(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!shouldUpdateVisibility(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.tmpRect == null) {
                this.tmpRect = new Rect();
            }
            Rect rect = this.tmpRect;
            cy7.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                shrinkOrHide(extendedFloatingActionButton);
                return true;
            }
            extendOrShow(extendedFloatingActionButton);
            return true;
        }

        private boolean updateFabVisibilityForBottomSheet(@NonNull View view, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!shouldUpdateVisibility(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((xk6) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                shrinkOrHide(extendedFloatingActionButton);
                return true;
            }
            extendOrShow(extendedFloatingActionButton);
            return true;
        }

        public void extendOrShow(@NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
            ExtendedFloatingActionButton.k(extendedFloatingActionButton, this.autoShrinkEnabled ? 3 : 0);
        }

        public boolean isAutoHideEnabled() {
            return this.autoHideEnabled;
        }

        public boolean isAutoShrinkEnabled() {
            return this.autoShrinkEnabled;
        }

        @Override // defpackage.uk6
        public void onAttachedToLayoutParams(@NonNull xk6 xk6Var) {
            if (xk6Var.h == 0) {
                xk6Var.h = 80;
            }
        }

        @Override // defpackage.uk6
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                updateFabVisibilityForAppBarLayout(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            }
            if (!isBottomSheet(view)) {
                return false;
            }
            updateFabVisibilityForBottomSheet(view, extendedFloatingActionButton);
            return false;
        }

        @Override // defpackage.uk6
        public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
            List u = coordinatorLayout.u(extendedFloatingActionButton);
            int size = u.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = (View) u.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (isBottomSheet(view) && updateFabVisibilityForBottomSheet(view, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (updateFabVisibilityForAppBarLayout(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.B(i, extendedFloatingActionButton);
            return true;
        }

        public void setAutoHideEnabled(boolean z) {
            this.autoHideEnabled = z;
        }

        public void setAutoShrinkEnabled(boolean z) {
            this.autoShrinkEnabled = z;
        }

        public void shrinkOrHide(@NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
            ExtendedFloatingActionButton.k(extendedFloatingActionButton, this.autoShrinkEnabled ? 2 : 1);
        }

        @Override // defpackage.uk6
        public boolean getInsetDodgeRect(@NonNull CoordinatorLayout coordinatorLayout, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton, @NonNull Rect rect) {
            return super.getInsetDodgeRect(coordinatorLayout, (View) extendedFloatingActionButton, rect);
        }

        public ExtendedFloatingActionButtonBehavior() {
            this.autoHideEnabled = false;
            this.autoShrinkEnabled = true;
        }

        public void setInternalAutoHideCallback(j0c j0cVar) {
        }

        public void setInternalAutoShrinkCallback(j0c j0cVar) {
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(@NonNull ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        this.E0 = getTextColors();
    }

    public ExtendedFloatingActionButton(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.extendedFloatingActionButtonStyle);
    }

    public ExtendedFloatingActionButton(@NonNull Context context) {
        this(context, null);
    }
}
