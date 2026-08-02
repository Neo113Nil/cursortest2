package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.collection.SimpleArrayMap;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import androidx.lifecycle.DispatchQueue;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.Transition;
import androidx.work.impl.utils.StopWorkRunnable;
import coil3.request.OneShotDisposable;
import com.google.android.gms.internal.mlkit_vision_text_common.zzpc;
import com.google.android.material.R$styleable;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton.TransformationCallbackWrapper;
import com.google.android.material.floatingactionbutton.FloatingActionButtonImpl;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.internal.ViewUtils$$ExternalSyntheticLambda0;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.shape.AbsoluteCornerSize;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.RoundedCornerTreatment;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.google.mlkit.vision.common.zzb;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.withpersona.sdk2.inquiry.shared.ContextUtilsKt;
import com.withpersona.sdk2.inquiry.shared.RetryKt;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.AttachedBehavior {
    public static final /* synthetic */ int $r8$clinit = 0;
    public Behavior behavior;
    public int bottomInset;
    public int fabAlignmentMode;
    public int fabAlignmentModeEndMargin;
    public int fabAnchorMode;
    public final AnonymousClass1 fabAnimationListener;
    public int fabAnimationMode;
    public boolean fabAttached;
    public final int fabOffsetEndMode;
    public final OneShotDisposable fabTransformationCallback;
    public boolean hideOnScroll;
    public int leftInset;
    public final MaterialShapeDrawable materialShapeDrawable;
    public int menuAlignmentMode;
    public boolean menuAnimatingWithFabAlignmentMode;
    public AnimatorSet menuAnimator;
    public AnimatorSet modeAnimator;
    public Integer navigationIconTint;
    public final boolean paddingBottomSystemWindowInsets;
    public final boolean paddingLeftSystemWindowInsets;
    public final boolean paddingRightSystemWindowInsets;
    public int pendingMenuResId;
    public final boolean removeEmbeddedFabElevation;
    public int rightInset;

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$1, reason: invalid class name */
    public final class AnonymousClass1 extends AnimatorListenerAdapter {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ BottomAppBar this$0;

        public /* synthetic */ AnonymousClass1(BottomAppBar bottomAppBar, int i) {
            this.$r8$classId = i;
            this.this$0 = bottomAppBar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            int i = this.$r8$classId;
            BottomAppBar bottomAppBar = this.this$0;
            switch (i) {
                case 1:
                    int i2 = BottomAppBar.$r8$clinit;
                    bottomAppBar.modeAnimator = null;
                    break;
                case 2:
                    int i3 = BottomAppBar.$r8$clinit;
                    bottomAppBar.menuAnimatingWithFabAlignmentMode = false;
                    bottomAppBar.menuAnimator = null;
                    break;
                default:
                    super.onAnimationEnd(animator);
                    break;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            int i = this.$r8$classId;
            BottomAppBar bottomAppBar = this.this$0;
            switch (i) {
                case 0:
                    if (!bottomAppBar.menuAnimatingWithFabAlignmentMode) {
                        bottomAppBar.maybeAnimateMenuView(bottomAppBar.fabAlignmentMode, bottomAppBar.fabAttached);
                        break;
                    }
                    break;
                case 1:
                    int i2 = BottomAppBar.$r8$clinit;
                    break;
                case 2:
                    int i3 = BottomAppBar.$r8$clinit;
                    break;
                default:
                    bottomAppBar.fabAnimationListener.onAnimationStart(animator);
                    View findDependentView = bottomAppBar.findDependentView();
                    FloatingActionButton floatingActionButton = findDependentView instanceof FloatingActionButton ? (FloatingActionButton) findDependentView : null;
                    if (floatingActionButton != null) {
                        floatingActionButton.setTranslationX(bottomAppBar.getFabTranslationX(bottomAppBar.fabAlignmentMode));
                        break;
                    }
                    break;
            }
        }
    }

    public final class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new AbsSavedState.AnonymousClass2(9);
        public int fabAlignmentMode;
        public boolean fabAttached;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.fabAlignmentMode = parcel.readInt();
            this.fabAttached = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.fabAlignmentMode);
            parcel.writeInt(this.fabAttached ? 1 : 0);
        }
    }

    public BottomAppBar(Context context, AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, R.style.Widget_MaterialComponents_BottomAppBar), attributeSet, i);
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        this.materialShapeDrawable = materialShapeDrawable;
        this.pendingMenuResId = 0;
        this.menuAnimatingWithFabAlignmentMode = false;
        this.fabAttached = true;
        this.fabAnimationListener = new AnonymousClass1(this, 0);
        this.fabTransformationCallback = new OneShotDisposable(this, 26);
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = ViewUtils.obtainStyledAttributes(context2, attributeSet, R$styleable.BottomAppBar, i, R.style.Widget_MaterialComponents_BottomAppBar, new int[0]);
        ColorStateList colorStateList = ContextUtilsKt.getColorStateList(context2, obtainStyledAttributes, 1);
        if (obtainStyledAttributes.hasValue(12)) {
            setNavigationIconTint(obtainStyledAttributes.getColor(12, -1));
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        float dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(7, 0);
        float dimensionPixelOffset2 = obtainStyledAttributes.getDimensionPixelOffset(8, 0);
        float dimensionPixelOffset3 = obtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.fabAlignmentMode = obtainStyledAttributes.getInt(3, 0);
        this.fabAnimationMode = obtainStyledAttributes.getInt(6, 0);
        this.fabAnchorMode = obtainStyledAttributes.getInt(5, 1);
        this.removeEmbeddedFabElevation = obtainStyledAttributes.getBoolean(16, true);
        this.menuAlignmentMode = obtainStyledAttributes.getInt(11, 0);
        this.hideOnScroll = obtainStyledAttributes.getBoolean(10, false);
        this.paddingBottomSystemWindowInsets = obtainStyledAttributes.getBoolean(13, false);
        this.paddingLeftSystemWindowInsets = obtainStyledAttributes.getBoolean(14, false);
        this.paddingRightSystemWindowInsets = obtainStyledAttributes.getBoolean(15, false);
        this.fabAlignmentModeEndMargin = obtainStyledAttributes.getDimensionPixelOffset(4, -1);
        boolean z = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        this.fabOffsetEndMode = getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fabOffsetEndMode);
        BottomAppBarTopEdgeTreatment bottomAppBarTopEdgeTreatment = new BottomAppBarTopEdgeTreatment();
        bottomAppBarTopEdgeTreatment.fabCornerSize = -1.0f;
        bottomAppBarTopEdgeTreatment.fabMargin = dimensionPixelOffset;
        bottomAppBarTopEdgeTreatment.roundedCornerRadius = dimensionPixelOffset2;
        bottomAppBarTopEdgeTreatment.setCradleVerticalOffset(dimensionPixelOffset3);
        bottomAppBarTopEdgeTreatment.horizontalOffset = RecyclerView.DECELERATION_RATE;
        RoundedCornerTreatment roundedCornerTreatment = new RoundedCornerTreatment();
        RoundedCornerTreatment roundedCornerTreatment2 = new RoundedCornerTreatment();
        RoundedCornerTreatment roundedCornerTreatment3 = new RoundedCornerTreatment();
        RoundedCornerTreatment roundedCornerTreatment4 = new RoundedCornerTreatment();
        AbsoluteCornerSize absoluteCornerSize = new AbsoluteCornerSize(RecyclerView.DECELERATION_RATE);
        AbsoluteCornerSize absoluteCornerSize2 = new AbsoluteCornerSize(RecyclerView.DECELERATION_RATE);
        AbsoluteCornerSize absoluteCornerSize3 = new AbsoluteCornerSize(RecyclerView.DECELERATION_RATE);
        AbsoluteCornerSize absoluteCornerSize4 = new AbsoluteCornerSize(RecyclerView.DECELERATION_RATE);
        Transition.AnonymousClass1 anonymousClass1 = new Transition.AnonymousClass1();
        Transition.AnonymousClass1 anonymousClass12 = new Transition.AnonymousClass1();
        Transition.AnonymousClass1 anonymousClass13 = new Transition.AnonymousClass1();
        ShapeAppearanceModel shapeAppearanceModel = new ShapeAppearanceModel();
        shapeAppearanceModel.topLeftCorner = roundedCornerTreatment;
        shapeAppearanceModel.topRightCorner = roundedCornerTreatment2;
        shapeAppearanceModel.bottomRightCorner = roundedCornerTreatment3;
        shapeAppearanceModel.bottomLeftCorner = roundedCornerTreatment4;
        shapeAppearanceModel.topLeftCornerSize = absoluteCornerSize;
        shapeAppearanceModel.topRightCornerSize = absoluteCornerSize2;
        shapeAppearanceModel.bottomRightCornerSize = absoluteCornerSize3;
        shapeAppearanceModel.bottomLeftCornerSize = absoluteCornerSize4;
        shapeAppearanceModel.topEdge = bottomAppBarTopEdgeTreatment;
        shapeAppearanceModel.rightEdge = anonymousClass1;
        shapeAppearanceModel.bottomEdge = anonymousClass12;
        shapeAppearanceModel.leftEdge = anonymousClass13;
        materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModel);
        if (z) {
            materialShapeDrawable.setShadowCompatibilityMode(2);
        } else {
            materialShapeDrawable.setShadowCompatibilityMode(1);
            setOutlineAmbientShadowColor(0);
            setOutlineSpotShadowColor(0);
        }
        Paint.Style style = Paint.Style.FILL;
        materialShapeDrawable.setPaintStyle();
        materialShapeDrawable.initializeElevationOverlay(context2);
        materialShapeDrawable.setTintList(colorStateList);
        setElevation(dimensionPixelSize);
        setBackground(materialShapeDrawable);
        zzb zzbVar = new zzb(this);
        TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(attributeSet, R$styleable.Insets, i, R.style.Widget_MaterialComponents_BottomAppBar);
        boolean z2 = obtainStyledAttributes2.getBoolean(4, false);
        boolean z3 = obtainStyledAttributes2.getBoolean(5, false);
        boolean z4 = obtainStyledAttributes2.getBoolean(6, false);
        obtainStyledAttributes2.recycle();
        ViewUtils.doOnApplyWindowInsets(this, new DispatchQueue(z2, z3, z4, zzbVar));
    }

    public static void updateFabAnchorGravity(BottomAppBar bottomAppBar, View view) {
        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) view.getLayoutParams();
        layoutParams.anchorGravity = 17;
        int i = bottomAppBar.fabAnchorMode;
        if (i == 1) {
            layoutParams.anchorGravity = 49;
        }
        if (i == 0) {
            layoutParams.anchorGravity |= 80;
        }
    }

    public final View findDependentView() {
        if (getParent() instanceof CoordinatorLayout) {
            ArrayList arrayList = (ArrayList) ((SimpleArrayMap) ((CoordinatorLayout) getParent()).mChildDag.b).get(this);
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

    public final ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    public final int getActionMenuViewTranslationX(ActionMenuView actionMenuView, int i, boolean z) {
        int i2 = 0;
        if (this.menuAlignmentMode != 1 && (i != 1 || !z)) {
            return 0;
        }
        boolean z2 = getLayoutDirection() == 1;
        int measuredWidth = z2 ? getMeasuredWidth() : 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if ((childAt.getLayoutParams() instanceof Toolbar.LayoutParams) && (((Toolbar.LayoutParams) childAt.getLayoutParams()).gravity & 8388615) == 8388611) {
                measuredWidth = z2 ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        int right = z2 ? actionMenuView.getRight() : actionMenuView.getLeft();
        int i4 = z2 ? this.rightInset : -this.leftInset;
        if (getNavigationIcon() == null) {
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.m3_bottomappbar_horizontal_padding);
            if (!z2) {
                dimensionPixelOffset = -dimensionPixelOffset;
            }
            i2 = dimensionPixelOffset;
        }
        return measuredWidth - ((right + i4) + i2);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    public final CoordinatorLayout.Behavior getBehavior() {
        if (this.behavior == null) {
            this.behavior = new Behavior();
        }
        return this.behavior;
    }

    public final float getFabTranslationX(int i) {
        boolean z = getLayoutDirection() == 1;
        if (i != 1) {
            return RecyclerView.DECELERATION_RATE;
        }
        View findDependentView = findDependentView();
        int i2 = z ? this.leftInset : this.rightInset;
        return ((getMeasuredWidth() / 2) - ((this.fabAlignmentModeEndMargin == -1 || findDependentView == null) ? this.fabOffsetEndMode + i2 : ((findDependentView.getMeasuredWidth() / 2) + this.fabAlignmentModeEndMargin) + i2)) * (z ? -1 : 1);
    }

    public final BottomAppBarTopEdgeTreatment getTopEdgeTreatment() {
        return (BottomAppBarTopEdgeTreatment) this.materialShapeDrawable.getShapeAppearanceModel().topEdge;
    }

    public final boolean isFabVisibleOrWillBeShown() {
        View findDependentView = findDependentView();
        FloatingActionButton floatingActionButton = findDependentView instanceof FloatingActionButton ? (FloatingActionButton) findDependentView : null;
        if (floatingActionButton == null) {
            return false;
        }
        FloatingActionButtonImpl impl = floatingActionButton.getImpl();
        int visibility = impl.view.getVisibility();
        int i = impl.animState;
        if (visibility != 0) {
            if (i != 2) {
                return false;
            }
        } else if (i == 1) {
            return false;
        }
        return true;
    }

    public final void maybeAnimateMenuView(final int i, final boolean z) {
        if (!isLaidOut()) {
            this.menuAnimatingWithFabAlignmentMode = false;
            int i2 = this.pendingMenuResId;
            if (i2 != 0) {
                this.pendingMenuResId = 0;
                getMenu().clear();
                inflateMenu(i2);
                return;
            }
            return;
        }
        AnimatorSet animatorSet = this.menuAnimator;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!isFabVisibleOrWillBeShown()) {
            i = 0;
            z = false;
        }
        final ActionMenuView actionMenuView = getActionMenuView();
        int i3 = 2;
        if (actionMenuView != null) {
            float resolveThemeDuration = MotionUtils.resolveThemeDuration(getContext(), R.attr.motionDurationLong2, EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
            ofFloat.setDuration((long) (0.8f * resolveThemeDuration));
            if (Math.abs(actionMenuView.getTranslationX() - getActionMenuViewTranslationX(actionMenuView, i, z)) > 1.0f) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", RecyclerView.DECELERATION_RATE);
                ofFloat2.setDuration((long) (resolveThemeDuration * 0.2f));
                ofFloat2.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.bottomappbar.BottomAppBar.7
                    public boolean cancelled;

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationCancel(Animator animator) {
                        this.cancelled = true;
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        if (this.cancelled) {
                            return;
                        }
                        BottomAppBar bottomAppBar = BottomAppBar.this;
                        int i4 = bottomAppBar.pendingMenuResId;
                        boolean z2 = i4 != 0;
                        if (i4 != 0) {
                            bottomAppBar.pendingMenuResId = 0;
                            bottomAppBar.getMenu().clear();
                            bottomAppBar.inflateMenu(i4);
                        }
                        bottomAppBar.translateActionMenuView(actionMenuView, i, z, z2);
                    }
                });
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playSequentially(ofFloat2, ofFloat);
                arrayList.add(animatorSet2);
            } else if (actionMenuView.getAlpha() < 1.0f) {
                arrayList.add(ofFloat);
            }
        }
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(arrayList);
        this.menuAnimator = animatorSet3;
        animatorSet3.addListener(new AnonymousClass1(this, i3));
        this.menuAnimator.start();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        RetryKt.setParentAbsoluteElevation(this, this.materialShapeDrawable);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            AnimatorSet animatorSet = this.menuAnimator;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.modeAnimator;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            setCutoutStateAndTranslateFab();
            View findDependentView = findDependentView();
            if (findDependentView != null && findDependentView.isLaidOut()) {
                findDependentView.post(new ViewUtils$$ExternalSyntheticLambda0(findDependentView, 2));
            }
        }
        setActionMenuViewPosition();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mSuperState);
        this.fabAlignmentMode = savedState.fabAlignmentMode;
        this.fabAttached = savedState.fabAttached;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.fabAlignmentMode = this.fabAlignmentMode;
        savedState.fabAttached = this.fabAttached;
        return savedState;
    }

    public final void setActionMenuViewPosition() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.menuAnimator != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        if (isFabVisibleOrWillBeShown()) {
            translateActionMenuView(actionMenuView, this.fabAlignmentMode, this.fabAttached, false);
        } else {
            translateActionMenuView(actionMenuView, 0, false, false);
        }
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        this.materialShapeDrawable.setTintList(colorStateList);
    }

    public void setCradleVerticalOffset(float f) {
        if (f != getTopEdgeTreatment().cradleVerticalOffset) {
            getTopEdgeTreatment().setCradleVerticalOffset(f);
            this.materialShapeDrawable.invalidateSelf();
            setCutoutStateAndTranslateFab();
        }
    }

    public final void setCutoutStateAndTranslateFab() {
        float f;
        getTopEdgeTreatment().horizontalOffset = getFabTranslationX(this.fabAlignmentMode);
        this.materialShapeDrawable.setInterpolation((this.fabAttached && isFabVisibleOrWillBeShown() && this.fabAnchorMode == 1) ? 1.0f : RecyclerView.DECELERATION_RATE);
        View findDependentView = findDependentView();
        if (findDependentView != null) {
            if (this.fabAnchorMode == 1) {
                f = -getTopEdgeTreatment().cradleVerticalOffset;
            } else {
                View findDependentView2 = findDependentView();
                f = findDependentView2 != null ? (-((getMeasuredHeight() + this.bottomInset) - findDependentView2.getMeasuredHeight())) / 2 : 0;
            }
            findDependentView.setTranslationY(f);
            findDependentView.setTranslationX(getFabTranslationX(this.fabAlignmentMode));
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        MaterialShapeDrawable materialShapeDrawable = this.materialShapeDrawable;
        materialShapeDrawable.setElevation(f);
        int shadowOffsetY = materialShapeDrawable.drawableState.shadowCompatRadius - materialShapeDrawable.getShadowOffsetY();
        if (this.behavior == null) {
            this.behavior = new Behavior();
        }
        Behavior behavior = this.behavior;
        behavior.additionalHiddenOffsetY = shadowOffsetY;
        if (behavior.currentState == 1) {
            setTranslationY(behavior.height + shadowOffsetY);
        }
    }

    public void setFabAlignmentMode(int i) {
        setFabAlignmentModeAndReplaceMenu(i, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.android.material.bottomappbar.BottomAppBar$5] */
    public void setFabAlignmentModeAndReplaceMenu(final int i, int i2) {
        this.pendingMenuResId = i2;
        int i3 = 1;
        this.menuAnimatingWithFabAlignmentMode = true;
        maybeAnimateMenuView(i, this.fabAttached);
        if (this.fabAlignmentMode != i && isLaidOut()) {
            AnimatorSet animatorSet = this.modeAnimator;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (this.fabAnimationMode == 1) {
                View findDependentView = findDependentView();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(findDependentView instanceof FloatingActionButton ? (FloatingActionButton) findDependentView : null, "translationX", getFabTranslationX(i));
                ofFloat.setDuration(MotionUtils.resolveThemeDuration(getContext(), R.attr.motionDurationLong2, EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE));
                arrayList.add(ofFloat);
            } else {
                View findDependentView2 = findDependentView();
                FloatingActionButton floatingActionButton = findDependentView2 instanceof FloatingActionButton ? (FloatingActionButton) findDependentView2 : 0;
                if (floatingActionButton != 0) {
                    FloatingActionButtonImpl impl = floatingActionButton.getImpl();
                    int visibility = impl.view.getVisibility();
                    int i4 = impl.animState;
                    if (visibility != 0 ? i4 == 2 : i4 != 1) {
                        floatingActionButton.hide(new zzpc() { // from class: com.google.android.material.bottomappbar.BottomAppBar.5

                            /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$5$1, reason: invalid class name */
                            public final class AnonymousClass1 extends zzpc {
                                @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzpc
                                public final void onShown() {
                                    int i = BottomAppBar.$r8$clinit;
                                }
                            }

                            @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzpc
                            public final void onHidden(FloatingActionButton floatingActionButton2) {
                                int i5 = BottomAppBar.$r8$clinit;
                                floatingActionButton2.setTranslationX(BottomAppBar.this.getFabTranslationX(i));
                                floatingActionButton2.show(new AnonymousClass1(), true);
                            }
                        }, true);
                    }
                }
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(arrayList);
            animatorSet2.setInterpolator(MotionUtils.resolveThemeInterpolator(getContext(), R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.LINEAR_INTERPOLATOR));
            this.modeAnimator = animatorSet2;
            animatorSet2.addListener(new AnonymousClass1(this, i3));
            this.modeAnimator.start();
        }
        this.fabAlignmentMode = i;
    }

    public void setFabAlignmentModeEndMargin(int i) {
        if (this.fabAlignmentModeEndMargin != i) {
            this.fabAlignmentModeEndMargin = i;
            setCutoutStateAndTranslateFab();
        }
    }

    public void setFabAnchorMode(int i) {
        this.fabAnchorMode = i;
        setCutoutStateAndTranslateFab();
        View findDependentView = findDependentView();
        if (findDependentView != null) {
            updateFabAnchorGravity(this, findDependentView);
            findDependentView.requestLayout();
            this.materialShapeDrawable.invalidateSelf();
        }
    }

    public void setFabAnimationMode(int i) {
        this.fabAnimationMode = i;
    }

    public void setFabCradleMargin(float f) {
        if (f != getTopEdgeTreatment().fabMargin) {
            getTopEdgeTreatment().fabMargin = f;
            this.materialShapeDrawable.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f) {
        if (f != getTopEdgeTreatment().roundedCornerRadius) {
            getTopEdgeTreatment().roundedCornerRadius = f;
            this.materialShapeDrawable.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z) {
        this.hideOnScroll = z;
    }

    public void setMenuAlignmentMode(int i) {
        if (this.menuAlignmentMode != i) {
            this.menuAlignmentMode = i;
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                translateActionMenuView(actionMenuView, this.fabAlignmentMode, isFabVisibleOrWillBeShown(), false);
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.navigationIconTint != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.navigationIconTint.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.navigationIconTint = Integer.valueOf(i);
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

    public final void translateActionMenuView(ActionMenuView actionMenuView, int i, boolean z, boolean z2) {
        StopWorkRunnable stopWorkRunnable = new StopWorkRunnable(this, actionMenuView, i, z);
        if (z2) {
            actionMenuView.post(stopWorkRunnable);
        } else {
            stopWorkRunnable.run();
        }
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        public final Rect fabContentRect;
        public final AnonymousClass1 fabLayoutListener;
        public int originalBottomMargin;
        public WeakReference viewRef;

        /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.material.bottomappbar.BottomAppBar$Behavior$1] */
        public Behavior() {
            this.fabLayoutListener = new View.OnLayoutChangeListener() { // from class: com.google.android.material.bottomappbar.BottomAppBar.Behavior.1
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    Behavior behavior = Behavior.this;
                    Rect rect = behavior.fabContentRect;
                    BottomAppBar bottomAppBar = (BottomAppBar) behavior.viewRef.get();
                    if (bottomAppBar != null) {
                        int i9 = bottomAppBar.fabOffsetEndMode;
                        MaterialShapeDrawable materialShapeDrawable = bottomAppBar.materialShapeDrawable;
                        if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                            int height = view.getHeight();
                            if (view instanceof FloatingActionButton) {
                                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                                floatingActionButton.getMeasuredContentRect(rect);
                                int height2 = rect.height();
                                float f = height2;
                                if (f != bottomAppBar.getTopEdgeTreatment().fabDiameter) {
                                    bottomAppBar.getTopEdgeTreatment().fabDiameter = f;
                                    materialShapeDrawable.invalidateSelf();
                                }
                                ShapeAppearanceModel shapeAppearanceModel = floatingActionButton.getImpl().shapeAppearance;
                                shapeAppearanceModel.getClass();
                                float cornerSize = shapeAppearanceModel.topLeftCornerSize.getCornerSize(new RectF(rect));
                                if (cornerSize != bottomAppBar.getTopEdgeTreatment().fabCornerSize) {
                                    bottomAppBar.getTopEdgeTreatment().fabCornerSize = cornerSize;
                                    materialShapeDrawable.invalidateSelf();
                                }
                                height = height2;
                            }
                            CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) view.getLayoutParams();
                            if (behavior.originalBottomMargin == 0) {
                                if (bottomAppBar.fabAnchorMode == 1) {
                                    ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = bottomAppBar.bottomInset + (bottomAppBar.getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fab_bottom_margin) - ((view.getMeasuredHeight() - height) / 2));
                                }
                                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = bottomAppBar.leftInset;
                                ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = bottomAppBar.rightInset;
                                if (view.getLayoutDirection() == 1) {
                                    ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin += i9;
                                } else {
                                    ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin += i9;
                                }
                            }
                            int i10 = BottomAppBar.$r8$clinit;
                            bottomAppBar.setCutoutStateAndTranslateFab();
                            return;
                        }
                    }
                    view.removeOnLayoutChangeListener(this);
                }
            };
            this.fabContentRect = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            this.viewRef = new WeakReference(bottomAppBar);
            int i2 = BottomAppBar.$r8$clinit;
            View findDependentView = bottomAppBar.findDependentView();
            if (findDependentView != null && !findDependentView.isLaidOut()) {
                BottomAppBar.updateFabAnchorGravity(bottomAppBar, findDependentView);
                this.originalBottomMargin = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) findDependentView.getLayoutParams())).bottomMargin;
                if (findDependentView instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) findDependentView;
                    if (bottomAppBar.fabAnchorMode == 0 && bottomAppBar.removeEmbeddedFabElevation) {
                        floatingActionButton.setElevation(RecyclerView.DECELERATION_RATE);
                        floatingActionButton.setCompatElevation(RecyclerView.DECELERATION_RATE);
                    }
                    if (floatingActionButton.getImpl().showMotionSpec == null) {
                        floatingActionButton.setShowMotionSpecResource(R.animator.mtrl_fab_show_motion_spec);
                    }
                    if (floatingActionButton.getImpl().hideMotionSpec == null) {
                        floatingActionButton.setHideMotionSpecResource(R.animator.mtrl_fab_hide_motion_spec);
                    }
                    AnonymousClass1 anonymousClass1 = bottomAppBar.fabAnimationListener;
                    FloatingActionButtonImpl impl = floatingActionButton.getImpl();
                    if (impl.hideListeners == null) {
                        impl.hideListeners = new ArrayList();
                    }
                    impl.hideListeners.add(anonymousClass1);
                    AnonymousClass1 anonymousClass12 = new AnonymousClass1(bottomAppBar, 3);
                    FloatingActionButtonImpl impl2 = floatingActionButton.getImpl();
                    if (impl2.showListeners == null) {
                        impl2.showListeners = new ArrayList();
                    }
                    impl2.showListeners.add(anonymousClass12);
                    OneShotDisposable oneShotDisposable = bottomAppBar.fabTransformationCallback;
                    FloatingActionButtonImpl impl3 = floatingActionButton.getImpl();
                    FloatingActionButton.TransformationCallbackWrapper transformationCallbackWrapper = floatingActionButton.new TransformationCallbackWrapper(oneShotDisposable);
                    if (impl3.transformationCallbacks == null) {
                        impl3.transformationCallbacks = new ArrayList();
                    }
                    impl3.transformationCallbacks.add(transformationCallbackWrapper);
                }
                findDependentView.addOnLayoutChangeListener(this.fabLayoutListener);
                bottomAppBar.setCutoutStateAndTranslateFab();
            }
            coordinatorLayout.onLayoutChild(bottomAppBar, i);
            super.onLayoutChild(coordinatorLayout, bottomAppBar, i);
            return false;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            return bottomAppBar.hideOnScroll && super.onStartNestedScroll(coordinatorLayout, bottomAppBar, view2, view3, i, i2);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.material.bottomappbar.BottomAppBar$Behavior$1] */
        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.fabLayoutListener = new View.OnLayoutChangeListener() { // from class: com.google.android.material.bottomappbar.BottomAppBar.Behavior.1
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    Behavior behavior = Behavior.this;
                    Rect rect = behavior.fabContentRect;
                    BottomAppBar bottomAppBar = (BottomAppBar) behavior.viewRef.get();
                    if (bottomAppBar != null) {
                        int i9 = bottomAppBar.fabOffsetEndMode;
                        MaterialShapeDrawable materialShapeDrawable = bottomAppBar.materialShapeDrawable;
                        if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                            int height = view.getHeight();
                            if (view instanceof FloatingActionButton) {
                                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                                floatingActionButton.getMeasuredContentRect(rect);
                                int height2 = rect.height();
                                float f = height2;
                                if (f != bottomAppBar.getTopEdgeTreatment().fabDiameter) {
                                    bottomAppBar.getTopEdgeTreatment().fabDiameter = f;
                                    materialShapeDrawable.invalidateSelf();
                                }
                                ShapeAppearanceModel shapeAppearanceModel = floatingActionButton.getImpl().shapeAppearance;
                                shapeAppearanceModel.getClass();
                                float cornerSize = shapeAppearanceModel.topLeftCornerSize.getCornerSize(new RectF(rect));
                                if (cornerSize != bottomAppBar.getTopEdgeTreatment().fabCornerSize) {
                                    bottomAppBar.getTopEdgeTreatment().fabCornerSize = cornerSize;
                                    materialShapeDrawable.invalidateSelf();
                                }
                                height = height2;
                            }
                            CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) view.getLayoutParams();
                            if (behavior.originalBottomMargin == 0) {
                                if (bottomAppBar.fabAnchorMode == 1) {
                                    ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = bottomAppBar.bottomInset + (bottomAppBar.getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fab_bottom_margin) - ((view.getMeasuredHeight() - height) / 2));
                                }
                                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = bottomAppBar.leftInset;
                                ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = bottomAppBar.rightInset;
                                if (view.getLayoutDirection() == 1) {
                                    ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin += i9;
                                } else {
                                    ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin += i9;
                                }
                            }
                            int i10 = BottomAppBar.$r8$clinit;
                            bottomAppBar.setCutoutStateAndTranslateFab();
                            return;
                        }
                    }
                    view.removeOnLayoutChangeListener(this);
                }
            };
            this.fabContentRect = new Rect();
        }
    }

    public BottomAppBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bottomAppBarStyle);
    }

    public BottomAppBar(Context context) {
        this(context, null);
    }
}
