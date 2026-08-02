package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.Transition;
import androidx.transition.ViewUtils;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.request.OneShotDisposable;
import com.google.android.gms.auth.api.zbc;
import com.google.android.gms.maps.zzah;
import com.google.android.gms.tasks.zzb;
import com.google.android.material.R$styleable;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.squareup.cash.R;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.AttachedBehavior {
    public int animState;
    public boolean animateShowBeforeLayout;
    public boolean animationEnabled;
    public final ExtendedFloatingActionButtonBehavior behavior;
    public int collapsedSize;
    public final ChangeSizeStrategy extendStrategy;
    public int extendedPaddingEnd;
    public int extendedPaddingStart;
    public final HideStrategy hideStrategy;
    public boolean isExtended;
    public boolean isTransforming;
    public int originalHeight;
    public ColorStateList originalTextCsl;
    public int originalWidth;
    public final ShowStrategy showStrategy;
    public final ChangeSizeStrategy shrinkStrategy;
    public static final ViewUtils.AnonymousClass1 WIDTH = new ViewUtils.AnonymousClass1(10, Float.class, "width");
    public static final ViewUtils.AnonymousClass1 HEIGHT = new ViewUtils.AnonymousClass1(11, Float.class, "height");
    public static final ViewUtils.AnonymousClass1 PADDING_START = new ViewUtils.AnonymousClass1(12, Float.class, "paddingStart");
    public static final ViewUtils.AnonymousClass1 PADDING_END = new ViewUtils.AnonymousClass1(13, Float.class, "paddingEnd");

    public final class ChangeSizeStrategy extends BaseMotionStrategy {
        public final boolean extending;
        public final Size size;

        public ChangeSizeStrategy(OneShotDisposable oneShotDisposable, Size size, boolean z) {
            super(ExtendedFloatingActionButton.this, oneShotDisposable);
            this.size = size;
            this.extending = z;
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy
        public final AnimatorSet createAnimator() {
            MotionSpec motionSpec = this.motionSpec;
            if (motionSpec == null) {
                if (this.defaultMotionSpec == null) {
                    this.defaultMotionSpec = MotionSpec.createFromResource(this.context, getDefaultMotionSpecResource());
                }
                motionSpec = this.defaultMotionSpec;
                motionSpec.getClass();
            }
            boolean hasPropertyValues = motionSpec.hasPropertyValues("width");
            Size size = this.size;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            if (hasPropertyValues) {
                PropertyValuesHolder[] propertyValues = motionSpec.getPropertyValues("width");
                propertyValues[0].setFloatValues(extendedFloatingActionButton.getWidth(), size.getWidth());
                motionSpec.setPropertyValues("width", propertyValues);
            }
            if (motionSpec.hasPropertyValues("height")) {
                PropertyValuesHolder[] propertyValues2 = motionSpec.getPropertyValues("height");
                propertyValues2[0].setFloatValues(extendedFloatingActionButton.getHeight(), size.getHeight());
                motionSpec.setPropertyValues("height", propertyValues2);
            }
            if (motionSpec.hasPropertyValues("paddingStart")) {
                PropertyValuesHolder[] propertyValues3 = motionSpec.getPropertyValues("paddingStart");
                propertyValues3[0].setFloatValues(extendedFloatingActionButton.getPaddingStart(), size.getPaddingStart());
                motionSpec.setPropertyValues("paddingStart", propertyValues3);
            }
            if (motionSpec.hasPropertyValues("paddingEnd")) {
                PropertyValuesHolder[] propertyValues4 = motionSpec.getPropertyValues("paddingEnd");
                propertyValues4[0].setFloatValues(extendedFloatingActionButton.getPaddingEnd(), size.getPaddingEnd());
                motionSpec.setPropertyValues("paddingEnd", propertyValues4);
            }
            if (motionSpec.hasPropertyValues("labelOpacity")) {
                PropertyValuesHolder[] propertyValues5 = motionSpec.getPropertyValues("labelOpacity");
                int alpha = Color.alpha(extendedFloatingActionButton.originalTextCsl.getColorForState(extendedFloatingActionButton.getDrawableState(), 0));
                int alpha2 = Color.alpha(extendedFloatingActionButton.getCurrentTextColor());
                float f = RecyclerView.DECELERATION_RATE;
                float f2 = alpha != 0 ? alpha2 / alpha : 0.0f;
                if (this.extending) {
                    f = 1.0f;
                }
                propertyValues5[0].setFloatValues(f2, f);
                motionSpec.setPropertyValues("labelOpacity", propertyValues5);
            }
            return createAnimator(motionSpec);
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy
        public final int getDefaultMotionSpecResource() {
            return this.extending ? R.animator.mtrl_extended_fab_change_size_expand_motion_spec : R.animator.mtrl_extended_fab_change_size_collapse_motion_spec;
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy
        public final void onAnimationEnd() {
            this.tracker.job = null;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.isTransforming = false;
            extendedFloatingActionButton.setHorizontallyScrolling(false);
            ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            Size size = this.size;
            layoutParams.width = size.getLayoutParams().width;
            layoutParams.height = size.getLayoutParams().height;
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy
        public final void onAnimationStart(Animator animator) {
            OneShotDisposable oneShotDisposable = this.tracker;
            Animator animator2 = (Animator) oneShotDisposable.job;
            if (animator2 != null) {
                animator2.cancel();
            }
            oneShotDisposable.job = animator;
            boolean z = this.extending;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.isExtended = z;
            extendedFloatingActionButton.isTransforming = true;
            extendedFloatingActionButton.setHorizontallyScrolling(true);
            extendedFloatingActionButton.updateTooltip();
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy
        public final void performNow() {
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            boolean z = this.extending;
            extendedFloatingActionButton.isExtended = z;
            ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            if (!z) {
                extendedFloatingActionButton.originalWidth = layoutParams.width;
                extendedFloatingActionButton.originalHeight = layoutParams.height;
            }
            Size size = this.size;
            layoutParams.width = size.getLayoutParams().width;
            layoutParams.height = size.getLayoutParams().height;
            if (z) {
                extendedFloatingActionButton.silentlyUpdateTextColor(extendedFloatingActionButton.originalTextCsl);
            } else if (extendedFloatingActionButton.getText() != null && extendedFloatingActionButton.getText() != "") {
                extendedFloatingActionButton.silentlyUpdateTextColor(ColorStateList.valueOf(0));
            }
            extendedFloatingActionButton.setPaddingRelative(size.getPaddingStart(), extendedFloatingActionButton.getPaddingTop(), size.getPaddingEnd(), extendedFloatingActionButton.getPaddingBottom());
            extendedFloatingActionButton.requestLayout();
            extendedFloatingActionButton.updateTooltip();
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy
        public final boolean shouldCancel() {
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            return this.extending == extendedFloatingActionButton.isExtended || extendedFloatingActionButton.icon == null || TextUtils.isEmpty(extendedFloatingActionButton.getText());
        }
    }

    public final class HideStrategy extends BaseMotionStrategy {
        public boolean isCancelled;

        public HideStrategy(OneShotDisposable oneShotDisposable) {
            super(ExtendedFloatingActionButton.this, oneShotDisposable);
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy
        public final int getDefaultMotionSpecResource() {
            return R.animator.mtrl_extended_fab_hide_motion_spec;
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy
        public final void onAnimationCancel() {
            super.onAnimationCancel();
            this.isCancelled = true;
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy
        public final void onAnimationEnd() {
            this.tracker.job = null;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.animState = 0;
            if (this.isCancelled) {
                return;
            }
            extendedFloatingActionButton.setVisibility(8);
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy
        public final void onAnimationStart(Animator animator) {
            OneShotDisposable oneShotDisposable = this.tracker;
            Animator animator2 = (Animator) oneShotDisposable.job;
            if (animator2 != null) {
                animator2.cancel();
            }
            oneShotDisposable.job = animator;
            this.isCancelled = false;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.setVisibility(0);
            extendedFloatingActionButton.animState = 1;
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy
        public final void performNow() {
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy
        public final boolean shouldCancel() {
            ViewUtils.AnonymousClass1 anonymousClass1 = ExtendedFloatingActionButton.WIDTH;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            int visibility = extendedFloatingActionButton.getVisibility();
            int i = extendedFloatingActionButton.animState;
            if (visibility == 0) {
                if (i != 1) {
                    return false;
                }
            } else if (i == 2) {
                return false;
            }
            return true;
        }
    }

    public final class ShowStrategy extends BaseMotionStrategy {
        public ShowStrategy(OneShotDisposable oneShotDisposable) {
            super(ExtendedFloatingActionButton.this, oneShotDisposable);
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy
        public final int getDefaultMotionSpecResource() {
            return R.animator.mtrl_extended_fab_show_motion_spec;
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy
        public final void onAnimationEnd() {
            this.tracker.job = null;
            ExtendedFloatingActionButton.this.animState = 0;
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy
        public final void onAnimationStart(Animator animator) {
            OneShotDisposable oneShotDisposable = this.tracker;
            Animator animator2 = (Animator) oneShotDisposable.job;
            if (animator2 != null) {
                animator2.cancel();
            }
            oneShotDisposable.job = animator;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.setVisibility(0);
            extendedFloatingActionButton.animState = 2;
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy
        public final void performNow() {
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.setVisibility(0);
            extendedFloatingActionButton.setAlpha(1.0f);
            extendedFloatingActionButton.setScaleY(1.0f);
            extendedFloatingActionButton.setScaleX(1.0f);
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy
        public final boolean shouldCancel() {
            ViewUtils.AnonymousClass1 anonymousClass1 = ExtendedFloatingActionButton.WIDTH;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            int visibility = extendedFloatingActionButton.getVisibility();
            int i = extendedFloatingActionButton.animState;
            if (visibility != 0) {
                if (i != 2) {
                    return false;
                }
            } else if (i == 1) {
                return false;
            }
            return true;
        }
    }

    public interface Size {
        int getHeight();

        ViewGroup.LayoutParams getLayoutParams();

        int getPaddingEnd();

        int getPaddingStart();

        int getWidth();
    }

    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, R.style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon), attributeSet, i);
        this.animState = 0;
        this.animationEnabled = true;
        OneShotDisposable oneShotDisposable = new OneShotDisposable(28, false);
        ShowStrategy showStrategy = new ShowStrategy(oneShotDisposable);
        this.showStrategy = showStrategy;
        HideStrategy hideStrategy = new HideStrategy(oneShotDisposable);
        this.hideStrategy = hideStrategy;
        this.isExtended = true;
        this.isTransforming = false;
        this.animateShowBeforeLayout = false;
        Context context2 = getContext();
        this.behavior = new ExtendedFloatingActionButtonBehavior(context2, attributeSet);
        TypedArray obtainStyledAttributes = com.google.android.material.internal.ViewUtils.obtainStyledAttributes(context2, attributeSet, R$styleable.ExtendedFloatingActionButton, i, R.style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon, new int[0]);
        MotionSpec createFromAttribute = MotionSpec.createFromAttribute(context2, obtainStyledAttributes, 5);
        MotionSpec createFromAttribute2 = MotionSpec.createFromAttribute(context2, obtainStyledAttributes, 4);
        MotionSpec createFromAttribute3 = MotionSpec.createFromAttribute(context2, obtainStyledAttributes, 2);
        MotionSpec createFromAttribute4 = MotionSpec.createFromAttribute(context2, obtainStyledAttributes, 6);
        this.collapsedSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        int i2 = obtainStyledAttributes.getInt(3, 1);
        this.extendedPaddingStart = getPaddingStart();
        this.extendedPaddingEnd = getPaddingEnd();
        OneShotDisposable oneShotDisposable2 = new OneShotDisposable(28, false);
        Size zzbVar = new zzb(this, 29);
        Size zbcVar = new zbc(29, this, zzbVar);
        ChangeSizeStrategy changeSizeStrategy = new ChangeSizeStrategy(oneShotDisposable2, i2 != 1 ? i2 != 2 ? new zzah(this, zbcVar, zzbVar, false, 27) : zbcVar : zzbVar, true);
        this.extendStrategy = changeSizeStrategy;
        ChangeSizeStrategy changeSizeStrategy2 = new ChangeSizeStrategy(oneShotDisposable2, new com.google.mlkit.vision.common.zzb(this), false);
        this.shrinkStrategy = changeSizeStrategy2;
        showStrategy.motionSpec = createFromAttribute;
        hideStrategy.motionSpec = createFromAttribute2;
        changeSizeStrategy.motionSpec = createFromAttribute3;
        changeSizeStrategy2.motionSpec = createFromAttribute4;
        obtainStyledAttributes.recycle();
        setShapeAppearanceModel(ShapeAppearanceModel.builder(context2, attributeSet, i, R.style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon, ShapeAppearanceModel.PILL).build());
        this.originalTextCsl = getTextColors();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        if (r5.animateShowBeforeLayout != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void access$400(ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
        BaseMotionStrategy baseMotionStrategy;
        if (i == 0) {
            baseMotionStrategy = extendedFloatingActionButton.showStrategy;
        } else if (i == 1) {
            baseMotionStrategy = extendedFloatingActionButton.hideStrategy;
        } else if (i == 2) {
            baseMotionStrategy = extendedFloatingActionButton.shrinkStrategy;
        } else {
            if (i != 3) {
                a$$ExternalSyntheticBUOutline0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Unknown strategy type: "));
                return;
            }
            baseMotionStrategy = extendedFloatingActionButton.extendStrategy;
        }
        if (baseMotionStrategy.shouldCancel()) {
            return;
        }
        if (extendedFloatingActionButton.animationEnabled) {
            if (!extendedFloatingActionButton.isLaidOut()) {
                int visibility = extendedFloatingActionButton.getVisibility();
                int i2 = extendedFloatingActionButton.animState;
                if (visibility == 0 ? i2 == 1 : i2 != 2) {
                }
            }
            if (i == 2) {
                ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
                if (layoutParams != null) {
                    extendedFloatingActionButton.originalWidth = layoutParams.width;
                    extendedFloatingActionButton.originalHeight = layoutParams.height;
                } else {
                    extendedFloatingActionButton.originalWidth = extendedFloatingActionButton.getWidth();
                    extendedFloatingActionButton.originalHeight = extendedFloatingActionButton.getHeight();
                }
            }
            extendedFloatingActionButton.measure(0, 0);
            AnimatorSet createAnimator = baseMotionStrategy.createAnimator();
            createAnimator.addListener(new Transition.AnonymousClass3(baseMotionStrategy, 5));
            Iterator it = baseMotionStrategy.listeners.iterator();
            while (it.hasNext()) {
                createAnimator.addListener((Animator.AnimatorListener) it.next());
            }
            createAnimator.start();
            return;
        }
        baseMotionStrategy.performNow();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return "com.google.android.material.floatingactionbutton.FloatingActionButton";
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    public final CoordinatorLayout.Behavior getBehavior() {
        return this.behavior;
    }

    public final int getCollapsedSize() {
        int i = this.collapsedSize;
        return i < 0 ? (Math.min(getPaddingStart(), getPaddingEnd()) * 2) + this.iconSize : i;
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.isExtended || !TextUtils.isEmpty(getText()) || this.icon == null) {
            updateTooltip();
        } else {
            this.isExtended = false;
            this.shrinkStrategy.performNow();
        }
    }

    public void setAnimateShowBeforeLayout(boolean z) {
        this.animateShowBeforeLayout = z;
    }

    public void setAnimationEnabled(boolean z) {
        this.animationEnabled = z;
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        updateTooltip();
    }

    public void setCollapsedSize(int i) {
        this.collapsedSize = i;
    }

    @Override // android.view.View
    public void setContentDescription(CharSequence charSequence) {
        super.setContentDescription(charSequence);
        updateTooltip();
    }

    public void setExtendMotionSpec(MotionSpec motionSpec) {
        this.extendStrategy.motionSpec = motionSpec;
    }

    public void setExtendMotionSpecResource(int i) {
        setExtendMotionSpec(MotionSpec.createFromResource(getContext(), i));
    }

    public void setExtended(boolean z) {
        if (this.isExtended == z) {
            return;
        }
        ChangeSizeStrategy changeSizeStrategy = z ? this.extendStrategy : this.shrinkStrategy;
        if (changeSizeStrategy.shouldCancel()) {
            return;
        }
        changeSizeStrategy.performNow();
    }

    public void setHideMotionSpec(MotionSpec motionSpec) {
        this.hideStrategy.motionSpec = motionSpec;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(MotionSpec.createFromResource(getContext(), i));
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        if (!this.isExtended || this.isTransforming) {
            return;
        }
        this.extendedPaddingStart = getPaddingStart();
        this.extendedPaddingEnd = getPaddingEnd();
    }

    @Override // android.widget.TextView, android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        if (!this.isExtended || this.isTransforming) {
            return;
        }
        this.extendedPaddingStart = i;
        this.extendedPaddingEnd = i3;
    }

    public void setShowMotionSpec(MotionSpec motionSpec) {
        this.showStrategy.motionSpec = motionSpec;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(MotionSpec.createFromResource(getContext(), i));
    }

    public void setShrinkMotionSpec(MotionSpec motionSpec) {
        this.shrinkStrategy.motionSpec = motionSpec;
    }

    public void setShrinkMotionSpecResource(int i) {
        setShrinkMotionSpec(MotionSpec.createFromResource(getContext(), i));
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        updateTooltip();
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        super.setTextColor(i);
        this.originalTextCsl = getTextColors();
    }

    public final void silentlyUpdateTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    public final void updateTooltip() {
        CharSequence charSequence;
        if (this.isExtended || !isClickable()) {
            charSequence = null;
        } else {
            charSequence = getText();
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = getContentDescription();
            }
        }
        if (TextUtils.equals(getTooltipText(), charSequence)) {
            return;
        }
        setTooltipText(charSequence);
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        this.originalTextCsl = getTextColors();
    }

    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.Behavior {
        public final boolean autoHideEnabled;
        public final boolean autoShrinkEnabled;
        public Rect tmpRect;

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ExtendedFloatingActionButton_Behavior_Layout);
            this.autoHideEnabled = obtainStyledAttributes.getBoolean(0, false);
            this.autoShrinkEnabled = obtainStyledAttributes.getBoolean(1, true);
            obtainStyledAttributes.recycle();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final /* bridge */ /* synthetic */ boolean getInsetDodgeRect(Rect rect, View view) {
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final void onAttachedToLayoutParams(CoordinatorLayout.LayoutParams layoutParams) {
            if (layoutParams.dodgeInsetEdges == 0) {
                layoutParams.dodgeInsetEdges = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                updateFabVisibilityForAppBarLayout(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.LayoutParams ? ((CoordinatorLayout.LayoutParams) layoutParams).mBehavior instanceof BottomSheetBehavior : false) {
                    updateFabVisibilityForBottomSheet(view2, extendedFloatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            List dependencies = coordinatorLayout.getDependencies(extendedFloatingActionButton);
            int size = dependencies.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view2 = (View) dependencies.get(i2);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.LayoutParams ? ((CoordinatorLayout.LayoutParams) layoutParams).mBehavior instanceof BottomSheetBehavior : false) && updateFabVisibilityForBottomSheet(view2, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (updateFabVisibilityForAppBarLayout(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.onLayoutChild(extendedFloatingActionButton, i);
            return true;
        }

        public final boolean updateFabVisibilityForAppBarLayout(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) extendedFloatingActionButton.getLayoutParams();
            boolean z = this.autoHideEnabled;
            boolean z2 = this.autoShrinkEnabled;
            if ((!z && !z2) || layoutParams.mAnchorId != appBarLayout.getId()) {
                return false;
            }
            if (this.tmpRect == null) {
                this.tmpRect = new Rect();
            }
            Rect rect = this.tmpRect;
            DescendantOffsetUtils.getDescendantRect(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                ExtendedFloatingActionButton.access$400(extendedFloatingActionButton, z2 ? 2 : 1);
            } else {
                ExtendedFloatingActionButton.access$400(extendedFloatingActionButton, z2 ? 3 : 0);
            }
            return true;
        }

        public final boolean updateFabVisibilityForBottomSheet(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) extendedFloatingActionButton.getLayoutParams();
            boolean z = this.autoHideEnabled;
            boolean z2 = this.autoShrinkEnabled;
            if ((!z && !z2) || layoutParams.mAnchorId != view.getId()) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                ExtendedFloatingActionButton.access$400(extendedFloatingActionButton, z2 ? 2 : 1);
            } else {
                ExtendedFloatingActionButton.access$400(extendedFloatingActionButton, z2 ? 3 : 0);
            }
            return true;
        }

        public ExtendedFloatingActionButtonBehavior() {
            this.autoHideEnabled = false;
            this.autoShrinkEnabled = true;
        }
    }

    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.extendedFloatingActionButtonStyle);
    }

    public ExtendedFloatingActionButton(Context context) {
        this(context, null);
    }
}
