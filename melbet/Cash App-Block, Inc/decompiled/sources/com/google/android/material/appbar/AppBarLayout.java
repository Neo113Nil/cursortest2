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
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.collection.SimpleArrayMap;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import com.fillr.m1;
import com.google.android.material.R$styleable;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.CollapsingTextHelper;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.search.SearchBar;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.google.zxing.Result;
import com.knotapi.knot.ui.views.KnotSpinnerView$$ExternalSyntheticLambda3;
import com.squareup.cash.R;
import com.withpersona.sdk2.inquiry.selfie.SelfieUtilsKt;
import com.withpersona.sdk2.inquiry.shared.ContextUtilsKt;
import com.withpersona.sdk2.inquiry.shared.RetryKt;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes4.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.AttachedBehavior {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final float appBarElevation;
    public int backgroundOriginalColor;
    public Behavior behavior;
    public int currentOffset;
    public int downPreScrollRange;
    public int downScrollRange;
    public boolean haveChildWithInterpolator;
    public WindowInsetsCompat lastInsets;
    public boolean liftOnScroll;
    public ColorStateList liftOnScrollColor;
    public ValueAnimator liftOnScrollColorAnimator;
    public final long liftOnScrollColorDuration;
    public final TimeInterpolator liftOnScrollColorInterpolator;
    public ValueAnimator.AnimatorUpdateListener liftOnScrollColorUpdateListener;
    public final ArrayList liftOnScrollListeners;
    public WeakReference liftOnScrollTargetView;
    public int liftOnScrollTargetViewId;
    public final LinkedHashSet liftProgressListeners;
    public boolean liftable;
    public boolean liftableOverride;
    public boolean lifted;
    public ArrayList listeners;
    public int pendingAction;
    public Drawable statusBarForeground;
    public Integer statusBarForegroundOriginalColor;
    public int[] tmpStatesArray;
    public int totalScrollRange;

    public interface OnOffsetChangedListener {
    }

    public AppBarLayout(Context context, AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, R.style.Widget_Design_AppBarLayout), attributeSet, i);
        this.totalScrollRange = -1;
        this.downPreScrollRange = -1;
        this.downScrollRange = -1;
        this.pendingAction = 0;
        this.liftOnScrollListeners = new ArrayList();
        this.liftProgressListeners = new LinkedHashSet();
        Context context2 = getContext();
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        Context context3 = getContext();
        TypedArray obtainStyledAttributes = ViewUtils.obtainStyledAttributes(context3, attributeSet, ViewUtilsLollipop.STATE_LIST_ANIM_ATTRS, i, R.style.Widget_Design_AppBarLayout, new int[0]);
        try {
            if (obtainStyledAttributes.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, obtainStyledAttributes.getResourceId(0, 0)));
            }
            obtainStyledAttributes.recycle();
            TypedArray obtainStyledAttributes2 = ViewUtils.obtainStyledAttributes(context2, attributeSet, R$styleable.AppBarLayout, i, R.style.Widget_Design_AppBarLayout, new int[0]);
            this.liftOnScrollColor = ContextUtilsKt.getColorStateList(context2, obtainStyledAttributes2, 6);
            this.liftOnScrollColorDuration = MotionUtils.resolveThemeDuration(context2, R.attr.motionDurationMedium2, getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            this.liftOnScrollColorInterpolator = MotionUtils.resolveThemeInterpolator(context2, R.attr.motionEasingStandardInterpolator, AnimationUtils.LINEAR_INTERPOLATOR);
            if (obtainStyledAttributes2.hasValue(4)) {
                this.pendingAction = obtainStyledAttributes2.getBoolean(4, false) ? 1 : 2;
                requestLayout();
            }
            if (obtainStyledAttributes2.hasValue(3)) {
                ViewUtilsLollipop.setDefaultAppBarLayoutStateListAnimator(this, obtainStyledAttributes2.getDimensionPixelSize(3, 0));
            }
            setBackground(obtainStyledAttributes2.getDrawable(0));
            if (obtainStyledAttributes2.hasValue(2)) {
                setKeyboardNavigationCluster(obtainStyledAttributes2.getBoolean(2, false));
            }
            if (obtainStyledAttributes2.hasValue(1)) {
                setTouchscreenBlocksFocus(obtainStyledAttributes2.getBoolean(1, false));
            }
            this.appBarElevation = getResources().getDimension(R.dimen.design_appbar_elevation);
            this.liftOnScroll = obtainStyledAttributes2.getBoolean(5, false);
            this.liftOnScrollTargetViewId = obtainStyledAttributes2.getResourceId(7, -1);
            setStatusBarForeground(obtainStyledAttributes2.getDrawable(8));
            obtainStyledAttributes2.recycle();
            m1 m1Var = new m1(this, 29);
            WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
            ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(this, m1Var);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            LayoutParams layoutParams2 = new LayoutParams((LinearLayout.LayoutParams) layoutParams);
            layoutParams2.scrollFlags = 1;
            return layoutParams2;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            LayoutParams layoutParams3 = new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            layoutParams3.scrollFlags = 1;
            return layoutParams3;
        }
        LayoutParams layoutParams4 = new LayoutParams(layoutParams);
        layoutParams4.scrollFlags = 1;
        return layoutParams4;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.statusBarForeground == null || getTopInset() <= 0) {
            return;
        }
        int save = canvas.save();
        canvas.translate(RecyclerView.DECELERATION_RATE, -this.currentOffset);
        this.statusBarForeground.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.statusBarForeground;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    public final CoordinatorLayout.Behavior getBehavior() {
        Behavior behavior = new Behavior();
        this.behavior = behavior;
        return behavior;
    }

    public final int getDownNestedPreScrollRange() {
        int i;
        int minimumHeight;
        int i2 = this.downPreScrollRange;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i4 = layoutParams.scrollFlags;
                if ((i4 & 5) != 5) {
                    if (i3 > 0) {
                        break;
                    }
                } else {
                    int i5 = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
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
        this.downPreScrollRange = max;
        return max;
    }

    public final int getDownNestedScrollRange() {
        int i = this.downScrollRange;
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
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + childAt.getMeasuredHeight();
                int i4 = layoutParams.scrollFlags;
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
        this.downScrollRange = max;
        return max;
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

    public final int getTopInset() {
        WindowInsetsCompat windowInsetsCompat = this.lastInsets;
        if (windowInsetsCompat != null) {
            return windowInsetsCompat.getSystemWindowInsetTop();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.totalScrollRange;
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
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i4 = layoutParams.scrollFlags;
                if ((i4 & 1) == 0) {
                    break;
                }
                int i5 = measuredHeight + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + i3;
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
        this.totalScrollRange = max;
        return max;
    }

    public final void invalidateScrollRanges() {
        Behavior behavior = this.behavior;
        BaseBehavior.SavedState saveScrollState = (behavior == null || this.totalScrollRange == -1 || this.pendingAction != 0) ? null : behavior.saveScrollState(AbsSavedState.EMPTY_STATE, this);
        this.totalScrollRange = -1;
        this.downPreScrollRange = -1;
        this.downScrollRange = -1;
        if (saveScrollState != null) {
            Behavior behavior2 = this.behavior;
            if (behavior2.savedState != null) {
                return;
            }
            behavior2.savedState = saveScrollState;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        RetryKt.setParentAbsoluteElevation(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        if (this.tmpStatesArray == null) {
            this.tmpStatesArray = new int[4];
        }
        int[] iArr = this.tmpStatesArray;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.liftable;
        int i2 = R.attr.state_liftable;
        if (!z) {
            i2 = -R.attr.state_liftable;
        }
        iArr[0] = i2;
        int i3 = R.attr.state_lifted;
        if (!z || !this.lifted) {
            i3 = -R.attr.state_lifted;
        }
        iArr[1] = i3;
        int i4 = R.attr.state_collapsible;
        if (!z) {
            i4 = -R.attr.state_collapsible;
        }
        iArr[2] = i4;
        int i5 = R.attr.state_collapsed;
        if (!z || !this.lifted) {
            i5 = -R.attr.state_collapsed;
        }
        iArr[3] = i5;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.liftOnScrollTargetView;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.liftOnScrollTargetView = null;
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
                    WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
                    childAt2.offsetTopAndBottom(topInset);
                }
            }
        }
        invalidateScrollRanges();
        this.haveChildWithInterpolator = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            }
            if (((LayoutParams) getChildAt(i5).getLayoutParams()).scrollInterpolator != null) {
                this.haveChildWithInterpolator = true;
                break;
            }
            i5++;
        }
        Drawable drawable = this.statusBarForeground;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.liftableOverride) {
            return;
        }
        if (!this.liftOnScroll) {
            int childCount3 = getChildCount();
            int i6 = 0;
            while (true) {
                if (i6 >= childCount3) {
                    z2 = false;
                    break;
                }
                int i7 = ((LayoutParams) getChildAt(i6).getLayoutParams()).scrollFlags;
                if ((i7 & 1) == 1 && (i7 & 10) != 0) {
                    break;
                } else {
                    i6++;
                }
            }
        }
        if (this.liftable != z2) {
            this.liftable = z2;
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
                    measuredHeight = MathUtils.clamp(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i2));
                } else if (mode == 0) {
                    measuredHeight += getTopInset();
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        invalidateScrollRanges();
    }

    public final void onOffsetChanged(int i) {
        this.currentOffset = i;
        if (!willNotDraw()) {
            postInvalidateOnAnimation();
        }
        ArrayList arrayList = this.listeners;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                OnOffsetChangedListener onOffsetChangedListener = (OnOffsetChangedListener) this.listeners.get(i2);
                if (onOffsetChangedListener != null) {
                    CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
                    collapsingToolbarLayout.currentOffset = i;
                    CollapsingTextHelper collapsingTextHelper = collapsingToolbarLayout.collapsingSubtitleHelper;
                    CollapsingTextHelper collapsingTextHelper2 = collapsingToolbarLayout.collapsingTitleHelper;
                    WindowInsetsCompat windowInsetsCompat = collapsingToolbarLayout.lastInsets;
                    int systemWindowInsetTop = windowInsetsCompat != null ? windowInsetsCompat.getSystemWindowInsetTop() : 0;
                    int childCount = collapsingToolbarLayout.getChildCount();
                    for (int i3 = 0; i3 < childCount; i3++) {
                        View childAt = collapsingToolbarLayout.getChildAt(i3);
                        CollapsingToolbarLayout.LayoutParams layoutParams = (CollapsingToolbarLayout.LayoutParams) childAt.getLayoutParams();
                        ViewOffsetHelper viewOffsetHelper = CollapsingToolbarLayout.getViewOffsetHelper(childAt);
                        int i4 = layoutParams.collapseMode;
                        if (i4 == 1) {
                            viewOffsetHelper.setTopAndBottomOffset(MathUtils.clamp(-i, 0, ((collapsingToolbarLayout.getHeight() - CollapsingToolbarLayout.getViewOffsetHelper(childAt).layoutTop) - childAt.getHeight()) - ((FrameLayout.LayoutParams) ((CollapsingToolbarLayout.LayoutParams) childAt.getLayoutParams())).bottomMargin));
                        } else if (i4 == 2) {
                            viewOffsetHelper.setTopAndBottomOffset(Math.round((-i) * layoutParams.parallaxMult));
                        }
                    }
                    collapsingToolbarLayout.updateScrimVisibility();
                    if (collapsingToolbarLayout.statusBarScrim != null && systemWindowInsetTop > 0) {
                        collapsingToolbarLayout.postInvalidateOnAnimation();
                    }
                    int height = collapsingToolbarLayout.getHeight();
                    int minimumHeight = (height - collapsingToolbarLayout.getMinimumHeight()) - systemWindowInsetTop;
                    int scrimVisibleHeightTrigger = height - collapsingToolbarLayout.getScrimVisibleHeightTrigger();
                    int i5 = collapsingToolbarLayout.currentOffset + minimumHeight;
                    float f = minimumHeight;
                    float abs = Math.abs(i) / f;
                    float f2 = scrimVisibleHeightTrigger / f;
                    float min = Math.min(1.0f, f2);
                    collapsingTextHelper2.fadeModeStartFraction = min;
                    collapsingTextHelper2.fadeModeThresholdFraction = CameraState$Type$EnumUnboxingLocalUtility.m(1.0f, min, 0.5f, min);
                    collapsingTextHelper2.currentOffsetY = i5;
                    collapsingTextHelper2.setExpansionFraction(abs);
                    float min2 = Math.min(1.0f, f2);
                    collapsingTextHelper.fadeModeStartFraction = min2;
                    collapsingTextHelper.fadeModeThresholdFraction = CameraState$Type$EnumUnboxingLocalUtility.m(1.0f, min2, 0.5f, min2);
                    collapsingTextHelper.currentOffsetY = i5;
                    collapsingTextHelper.setExpansionFraction(abs);
                }
            }
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        final MaterialShapeDrawable materialShapeDrawable;
        ColorStateList colorStateList;
        Context context = getContext();
        if (drawable instanceof MaterialShapeDrawable) {
            materialShapeDrawable = (MaterialShapeDrawable) drawable;
        } else {
            ColorStateList colorStateListOrNull = SelfieUtilsKt.getColorStateListOrNull(drawable);
            if (colorStateListOrNull == null) {
                materialShapeDrawable = null;
            } else {
                MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable();
                materialShapeDrawable2.setFillColor(colorStateListOrNull);
                materialShapeDrawable = materialShapeDrawable2;
            }
        }
        if (materialShapeDrawable != null && (colorStateList = materialShapeDrawable.drawableState.fillColor) != null) {
            this.backgroundOriginalColor = colorStateList.getDefaultColor();
            final ColorStateList colorStateList2 = this.liftOnScrollColor;
            if (colorStateList2 != null) {
                final Integer colorOrNull = MaterialColors.getColorOrNull(getContext(), R.attr.colorSurface);
                this.liftOnScrollColorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.AppBarLayout$$ExternalSyntheticLambda0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Integer num;
                        AppBarLayout appBarLayout = AppBarLayout.this;
                        LinkedHashSet linkedHashSet = appBarLayout.liftProgressListeners;
                        ArrayList arrayList = appBarLayout.liftOnScrollListeners;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        int layer = MaterialColors.layer(floatValue, appBarLayout.backgroundOriginalColor, colorStateList2.getDefaultColor());
                        ColorStateList valueOf = ColorStateList.valueOf(layer);
                        MaterialShapeDrawable materialShapeDrawable3 = materialShapeDrawable;
                        materialShapeDrawable3.setFillColor(valueOf);
                        if (appBarLayout.statusBarForeground != null && (num = appBarLayout.statusBarForegroundOriginalColor) != null && num.equals(colorOrNull)) {
                            appBarLayout.statusBarForeground.setTint(layer);
                        }
                        if (!arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (it.next() != null) {
                                    a$$ExternalSyntheticBUOutline0.m$1();
                                    return;
                                } else if (materialShapeDrawable3.drawableState.fillColor != null) {
                                    throw null;
                                }
                            }
                        }
                        if (linkedHashSet.isEmpty()) {
                            return;
                        }
                        Iterator it2 = linkedHashSet.iterator();
                        while (it2.hasNext()) {
                            SearchBar searchBar = SearchBar.this;
                            ColorStateList colorStateList3 = searchBar.liftOnScrollColor;
                            if (colorStateList3 != null) {
                                searchBar.backgroundShape.setFillColor(ColorStateList.valueOf(MaterialColors.layer(floatValue, searchBar.backgroundColor, colorStateList3.getDefaultColor())));
                            }
                        }
                    }
                };
            } else {
                materialShapeDrawable.initializeElevationOverlay(context);
                this.liftOnScrollColorUpdateListener = new KnotSpinnerView$$ExternalSyntheticLambda3(3, this, materialShapeDrawable);
            }
            drawable = materialShapeDrawable;
        }
        super.setBackground(drawable);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof MaterialShapeDrawable) {
            ((MaterialShapeDrawable) background).setElevation(f);
        }
    }

    public void setExpanded(boolean z, boolean z2) {
        this.pendingAction = (z ? 1 : 2) | (z2 ? 4 : 0) | 8;
        requestLayout();
    }

    public void setLiftOnScroll(boolean z) {
        this.liftOnScroll = z;
    }

    public void setLiftOnScrollColor(ColorStateList colorStateList) {
        if (this.liftOnScrollColor != colorStateList) {
            this.liftOnScrollColor = colorStateList;
            setBackground(getBackground());
        }
    }

    public void setLiftOnScrollTargetView(View view) {
        this.liftOnScrollTargetViewId = -1;
        if (view != null) {
            this.liftOnScrollTargetView = new WeakReference(view);
            return;
        }
        WeakReference weakReference = this.liftOnScrollTargetView;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.liftOnScrollTargetView = null;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.liftOnScrollTargetViewId = i;
        WeakReference weakReference = this.liftOnScrollTargetView;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.liftOnScrollTargetView = null;
    }

    public void setLiftableOverrideEnabled(boolean z) {
        this.liftableOverride = z;
    }

    public final boolean setLiftedState(boolean z) {
        if (this.liftableOverride || this.lifted == z) {
            return false;
        }
        this.lifted = z;
        refreshDrawableState();
        if (!(getBackground() instanceof MaterialShapeDrawable)) {
            return true;
        }
        ColorStateList colorStateList = this.liftOnScrollColor;
        float f = RecyclerView.DECELERATION_RATE;
        if (colorStateList != null) {
            float f2 = z ? 0.0f : 1.0f;
            if (z) {
                f = 1.0f;
            }
            startLiftOnScrollColorAnimation(f2, f);
            return true;
        }
        if (!this.liftOnScroll) {
            return true;
        }
        float f3 = this.appBarElevation;
        float f4 = z ? 0.0f : f3;
        if (z) {
            f = f3;
        }
        startLiftOnScrollColorAnimation(f4, f);
        return true;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("AppBarLayout is always vertical and does not support horizontal orientation");
        }
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.statusBarForeground;
        if (drawable2 != drawable) {
            Integer num = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.statusBarForeground = mutate;
            if (mutate instanceof MaterialShapeDrawable) {
                num = Integer.valueOf(((MaterialShapeDrawable) mutate).resolvedTintColor);
            } else {
                ColorStateList colorStateListOrNull = SelfieUtilsKt.getColorStateListOrNull(mutate);
                if (colorStateListOrNull != null) {
                    num = Integer.valueOf(colorStateListOrNull.getDefaultColor());
                }
            }
            this.statusBarForegroundOriginalColor = num;
            Drawable drawable3 = this.statusBarForeground;
            boolean z = false;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.statusBarForeground.setState(getDrawableState());
                }
                this.statusBarForeground.setLayoutDirection(getLayoutDirection());
                this.statusBarForeground.setVisible(getVisibility() == 0, false);
                this.statusBarForeground.setCallback(this);
            }
            if (this.statusBarForeground != null && getTopInset() > 0) {
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
        setStatusBarForeground(DimensionKt.getDrawable(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        ViewUtilsLollipop.setDefaultAppBarLayoutStateListAnimator(this, f);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.statusBarForeground;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    public final boolean shouldLift(View view) {
        int i;
        if (this.liftOnScrollTargetView == null && (i = this.liftOnScrollTargetViewId) != -1) {
            View findViewById = view != null ? view.findViewById(i) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.liftOnScrollTargetViewId);
            }
            if (findViewById != null) {
                this.liftOnScrollTargetView = new WeakReference(findViewById);
            }
        }
        WeakReference weakReference = this.liftOnScrollTargetView;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    public final void startLiftOnScrollColorAnimation(float f, float f2) {
        ValueAnimator valueAnimator = this.liftOnScrollColorAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        this.liftOnScrollColorAnimator = ofFloat;
        ofFloat.setDuration(this.liftOnScrollColorDuration);
        this.liftOnScrollColorAnimator.setInterpolator(this.liftOnScrollColorInterpolator);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.liftOnScrollColorUpdateListener;
        if (animatorUpdateListener != null) {
            this.liftOnScrollColorAnimator.addUpdateListener(animatorUpdateListener);
        }
        this.liftOnScrollColorAnimator.start();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.statusBarForeground;
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class BaseBehavior<T extends AppBarLayout> extends HeaderBehavior {
        public WeakReference lastNestedScrollingChildRef;
        public int lastStartedType;
        public ValueAnimator offsetAnimator;
        public int offsetDelta;
        public SavedState savedState;

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$2, reason: invalid class name */
        public final class AnonymousClass2 extends AccessibilityDelegateCompat {
            public final /* synthetic */ BaseBehavior this$0;
            public final /* synthetic */ AppBarLayout val$appBarLayout;
            public final /* synthetic */ CoordinatorLayout val$coordinatorLayout;

            public AnonymousClass2(CoordinatorLayout coordinatorLayout, BaseBehavior baseBehavior, AppBarLayout appBarLayout) {
                this.this$0 = baseBehavior;
                this.val$appBarLayout = appBarLayout;
                this.val$coordinatorLayout = coordinatorLayout;
            }

            @Override // androidx.core.view.AccessibilityDelegateCompat
            public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                this.mOriginalDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.unwrap());
                accessibilityNodeInfoCompat.setClassName(ScrollView.class.getName());
                AppBarLayout appBarLayout = this.val$appBarLayout;
                if (appBarLayout.getTotalScrollRange() == 0) {
                    return;
                }
                CoordinatorLayout coordinatorLayout = this.val$coordinatorLayout;
                BaseBehavior baseBehavior = this.this$0;
                View access$000 = BaseBehavior.access$000(baseBehavior, coordinatorLayout);
                if (access$000 == null) {
                    return;
                }
                int childCount = appBarLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    if (((LayoutParams) appBarLayout.getChildAt(i).getLayoutParams()).scrollFlags != 0) {
                        if (baseBehavior.getTopBottomOffsetForScrollingSibling() != (-appBarLayout.getTotalScrollRange())) {
                            accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                            accessibilityNodeInfoCompat.setScrollable(true);
                        }
                        if (baseBehavior.getTopBottomOffsetForScrollingSibling() != 0) {
                            if (!access$000.canScrollVertically(-1)) {
                                accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                                accessibilityNodeInfoCompat.setScrollable(true);
                                return;
                            } else {
                                if ((-appBarLayout.getDownNestedPreScrollRange()) != 0) {
                                    accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                                    accessibilityNodeInfoCompat.setScrollable(true);
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    }
                }
            }

            @Override // androidx.core.view.AccessibilityDelegateCompat
            public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
                AppBarLayout appBarLayout = this.val$appBarLayout;
                if (i == 4096) {
                    appBarLayout.setExpanded(false);
                    return true;
                }
                if (i != 8192) {
                    return super.performAccessibilityAction(view, i, bundle);
                }
                BaseBehavior baseBehavior = this.this$0;
                if (baseBehavior.getTopBottomOffsetForScrollingSibling() != 0) {
                    CoordinatorLayout coordinatorLayout = this.val$coordinatorLayout;
                    View access$000 = BaseBehavior.access$000(baseBehavior, coordinatorLayout);
                    if (!access$000.canScrollVertically(-1)) {
                        appBarLayout.setExpanded(true);
                        return true;
                    }
                    int i2 = -appBarLayout.getDownNestedPreScrollRange();
                    if (i2 != 0) {
                        baseBehavior.onNestedPreScroll(coordinatorLayout, this.val$appBarLayout, access$000, i2, new int[]{0, 0});
                        return true;
                    }
                }
                return false;
            }
        }

        public BaseBehavior() {
            this.activePointerId = -1;
            this.touchSlop = -1;
        }

        public static View access$000(BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (((CoordinatorLayout.LayoutParams) childAt.getLayoutParams()).mBehavior instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        public static View findFirstScrollingChild(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof NestedScrollingChild) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        public static void updateAppBarLayoutDrawableState(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, boolean z) {
            View view;
            boolean z2;
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    view = null;
                    break;
                }
                view = appBarLayout.getChildAt(i3);
                if (abs >= view.getTop() && abs <= view.getBottom()) {
                    break;
                } else {
                    i3++;
                }
            }
            if (view != null) {
                int i4 = ((LayoutParams) view.getLayoutParams()).scrollFlags;
                if ((i4 & 1) != 0) {
                    int minimumHeight = view.getMinimumHeight();
                    z2 = true;
                    if (i2 > 0) {
                    }
                }
            }
            z2 = false;
            if (appBarLayout.liftOnScroll) {
                z2 = appBarLayout.shouldLift(findFirstScrollingChild(coordinatorLayout));
            }
            boolean liftedState = appBarLayout.setLiftedState(z2);
            if (!z) {
                if (liftedState) {
                    ArrayList arrayList = (ArrayList) ((SimpleArrayMap) coordinatorLayout.mChildDag.b).get(appBarLayout);
                    List arrayList2 = arrayList != null ? new ArrayList(arrayList) : null;
                    if (arrayList2 == null) {
                        arrayList2 = Collections.EMPTY_LIST;
                    }
                    int size = arrayList2.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) ((View) arrayList2.get(i5)).getLayoutParams()).mBehavior;
                        if (behavior instanceof ScrollingViewBehavior) {
                            if (((ScrollingViewBehavior) behavior).overlayTop == 0) {
                                return;
                            }
                        }
                    }
                    return;
                }
                return;
            }
            if (appBarLayout.getBackground() != null) {
                appBarLayout.getBackground().jumpToCurrentState();
            }
            if (appBarLayout.getForeground() != null) {
                appBarLayout.getForeground().jumpToCurrentState();
            }
            if (appBarLayout.getStateListAnimator() != null) {
                appBarLayout.getStateListAnimator().jumpToCurrentState();
            }
        }

        public final void animateOffsetTo(final CoordinatorLayout coordinatorLayout, final AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(getTopBottomOffsetForScrollingSibling() - i);
            float abs2 = Math.abs(RecyclerView.DECELERATION_RATE);
            int round = abs2 > RecyclerView.DECELERATION_RATE ? Math.round((abs / abs2) * 1000.0f) * 3 : (int) (((abs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
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
                valueAnimator2.setInterpolator(AnimationUtils.DECELERATE_INTERPOLATOR);
                this.offsetAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.AppBarLayout.BaseBehavior.1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        this.setHeaderTopBottomOffset(coordinatorLayout, appBarLayout, ((Integer) valueAnimator3.getAnimatedValue()).intValue());
                    }
                });
            } else {
                valueAnimator.cancel();
            }
            this.offsetAnimator.setDuration(Math.min(round, 600));
            this.offsetAnimator.setIntValues(topBottomOffsetForScrollingSibling, i);
            this.offsetAnimator.start();
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public final int getTopBottomOffsetForScrollingSibling() {
            return getTopAndBottomOffset() + this.offsetDelta;
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.onLayoutChild(coordinatorLayout, appBarLayout, i);
            int i2 = appBarLayout.pendingAction;
            SavedState savedState = this.savedState;
            if (savedState == null || (i2 & 8) != 0) {
                if (i2 != 0) {
                    boolean z = (i2 & 4) != 0;
                    if ((i2 & 2) != 0) {
                        int i3 = -appBarLayout.getTotalScrollRange();
                        if (z) {
                            animateOffsetTo(coordinatorLayout, appBarLayout, i3);
                        } else {
                            setHeaderTopBottomOffset(coordinatorLayout, appBarLayout, i3);
                        }
                    } else if ((i2 & 1) != 0) {
                        if (z) {
                            animateOffsetTo(coordinatorLayout, appBarLayout, 0);
                        } else {
                            setHeaderTopBottomOffset(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (savedState.fullyScrolled) {
                setHeaderTopBottomOffset(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else if (savedState.fullyExpanded) {
                setHeaderTopBottomOffset(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(savedState.firstVisibleChildIndex);
                int i4 = -childAt.getBottom();
                setHeaderTopBottomOffset(coordinatorLayout, appBarLayout, this.savedState.firstVisibleChildAtMinimumHeight ? appBarLayout.getTopInset() + childAt.getMinimumHeight() + i4 : Math.round(childAt.getHeight() * this.savedState.firstVisibleChildPercentageShown) + i4);
            }
            appBarLayout.pendingAction = 0;
            this.savedState = null;
            int clamp = MathUtils.clamp(getTopAndBottomOffset(), -appBarLayout.getTotalScrollRange(), 0);
            ViewOffsetHelper viewOffsetHelper = this.viewOffsetHelper;
            if (viewOffsetHelper != null) {
                viewOffsetHelper.setTopAndBottomOffset(clamp);
            } else {
                this.tempTopBottomOffset = clamp;
            }
            updateAppBarLayoutDrawableState(coordinatorLayout, appBarLayout, getTopAndBottomOffset(), 0, true);
            appBarLayout.onOffsetChanged(getTopAndBottomOffset());
            WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
            if (ViewCompat.Api29Impl.getAccessibilityDelegate(coordinatorLayout) != null) {
                return true;
            }
            ViewCompat.setAccessibilityDelegate(coordinatorLayout, new AnonymousClass2(coordinatorLayout, this, appBarLayout));
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) appBarLayout.getLayoutParams())).height != -2) {
                return false;
            }
            coordinatorLayout.onMeasureChild(appBarLayout, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0));
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onNestedPreScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int[] iArr) {
            AppBarLayout appBarLayout2;
            int i2;
            int i3;
            if (i != 0) {
                if (i < 0) {
                    i2 = -appBarLayout.getTotalScrollRange();
                    i3 = appBarLayout.getDownNestedPreScrollRange() + i2;
                } else {
                    i2 = -appBarLayout.getTotalScrollRange();
                    i3 = 0;
                }
                int i4 = i2;
                int i5 = i3;
                if (i4 != i5) {
                    appBarLayout2 = appBarLayout;
                    iArr[1] = setHeaderTopBottomOffset(coordinatorLayout, appBarLayout2, getTopBottomOffsetForScrollingSibling() - i, i4, i5);
                    if (appBarLayout2.liftOnScroll) {
                        return;
                    }
                    appBarLayout2.setLiftedState(appBarLayout2.shouldLift(view));
                    return;
                }
            }
            appBarLayout2 = appBarLayout;
            if (appBarLayout2.liftOnScroll) {
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
            BaseBehavior<T> baseBehavior;
            CoordinatorLayout coordinatorLayout2;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i3 < 0) {
                baseBehavior = this;
                coordinatorLayout2 = coordinatorLayout;
                iArr[1] = baseBehavior.setHeaderTopBottomOffset(coordinatorLayout2, appBarLayout, getTopBottomOffsetForScrollingSibling() - i3, -appBarLayout.getDownNestedScrollRange(), 0);
            } else {
                baseBehavior = this;
                coordinatorLayout2 = coordinatorLayout;
            }
            if (i3 == 0) {
                WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
                if (ViewCompat.Api29Impl.getAccessibilityDelegate(coordinatorLayout2) != null) {
                    return;
                }
                ViewCompat.setAccessibilityDelegate(coordinatorLayout2, new AnonymousClass2(coordinatorLayout2, baseBehavior, appBarLayout));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final void onRestoreInstanceState(View view, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                this.savedState = (SavedState) parcelable;
            } else {
                this.savedState = null;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final Parcelable onSaveInstanceState(View view) {
            android.view.AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            SavedState saveScrollState = saveScrollState(absSavedState, (AppBarLayout) view);
            return saveScrollState == null ? absSavedState : saveScrollState;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            ValueAnimator valueAnimator;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            boolean z = (i & 2) != 0 && (appBarLayout.liftOnScroll || appBarLayout.lifted || (appBarLayout.getTotalScrollRange() != 0 && coordinatorLayout.getHeight() - view2.getHeight() <= appBarLayout.getHeight()));
            if (z && (valueAnimator = this.offsetAnimator) != null) {
                valueAnimator.cancel();
            }
            this.lastNestedScrollingChildRef = null;
            this.lastStartedType = i2;
            return z;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final void onStopNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.lastStartedType == 0 || i == 1) {
                snapToChildIfNeeded(coordinatorLayout, appBarLayout);
                if (appBarLayout.liftOnScroll) {
                    appBarLayout.setLiftedState(appBarLayout.shouldLift(view2));
                }
            }
            this.lastNestedScrollingChildRef = new WeakReference(view2);
        }

        public final SavedState saveScrollState(Parcelable parcelable, AppBarLayout appBarLayout) {
            int topAndBottomOffset = getTopAndBottomOffset();
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + topAndBottomOffset;
                if (childAt.getTop() + topAndBottomOffset <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbsSavedState.EMPTY_STATE;
                    }
                    SavedState savedState = new SavedState(parcelable);
                    boolean z = topAndBottomOffset == 0;
                    savedState.fullyExpanded = z;
                    savedState.fullyScrolled = !z && (-topAndBottomOffset) >= appBarLayout.getTotalScrollRange();
                    savedState.firstVisibleChildIndex = i;
                    savedState.firstVisibleChildAtMinimumHeight = bottom == appBarLayout.getTopInset() + childAt.getMinimumHeight();
                    savedState.firstVisibleChildPercentageShown = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return null;
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public final int setHeaderTopBottomOffset(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            int i4;
            boolean z;
            int i5;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int topBottomOffsetForScrollingSibling = getTopBottomOffsetForScrollingSibling();
            int i6 = 0;
            if (i2 == 0 || topBottomOffsetForScrollingSibling < i2 || topBottomOffsetForScrollingSibling > i3) {
                this.offsetDelta = 0;
            } else {
                int clamp = MathUtils.clamp(i, i2, i3);
                if (topBottomOffsetForScrollingSibling != clamp) {
                    if (appBarLayout.haveChildWithInterpolator) {
                        int abs = Math.abs(clamp);
                        int childCount = appBarLayout.getChildCount();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= childCount) {
                                break;
                            }
                            View childAt = appBarLayout.getChildAt(i7);
                            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                            Interpolator interpolator = layoutParams.scrollInterpolator;
                            if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                                i7++;
                            } else if (interpolator != null) {
                                int i8 = layoutParams.scrollFlags;
                                if ((i8 & 1) != 0) {
                                    i5 = childAt.getHeight() + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                                    if ((i8 & 2) != 0) {
                                        i5 -= childAt.getMinimumHeight();
                                    }
                                } else {
                                    i5 = 0;
                                }
                                if (childAt.getFitsSystemWindows()) {
                                    i5 -= appBarLayout.getTopInset();
                                }
                                if (i5 > 0) {
                                    float f = i5;
                                    i4 = (childAt.getTop() + Math.round(interpolator.getInterpolation((abs - childAt.getTop()) / f) * f)) * Integer.signum(clamp);
                                }
                            }
                        }
                    }
                    i4 = clamp;
                    ViewOffsetHelper viewOffsetHelper = this.viewOffsetHelper;
                    if (viewOffsetHelper != null) {
                        z = viewOffsetHelper.setTopAndBottomOffset(i4);
                    } else {
                        this.tempTopBottomOffset = i4;
                        z = false;
                    }
                    int i9 = topBottomOffsetForScrollingSibling - clamp;
                    this.offsetDelta = clamp - i4;
                    int i10 = 1;
                    if (z) {
                        int i11 = 0;
                        while (i11 < appBarLayout.getChildCount()) {
                            LayoutParams layoutParams2 = (LayoutParams) appBarLayout.getChildAt(i11).getLayoutParams();
                            Result result = layoutParams2.scrollEffect;
                            if (result != null && (layoutParams2.scrollFlags & i10) != 0) {
                                View childAt2 = appBarLayout.getChildAt(i11);
                                float topAndBottomOffset = getTopAndBottomOffset();
                                Rect rect = (Rect) result.resultMetadata;
                                Rect rect2 = (Rect) result.text;
                                childAt2.getDrawingRect(rect2);
                                appBarLayout.offsetDescendantRectToMyCoords(childAt2, rect2);
                                rect2.offset(0, -appBarLayout.getTopInset());
                                float abs2 = rect2.top - Math.abs(topAndBottomOffset);
                                if (abs2 <= RecyclerView.DECELERATION_RATE) {
                                    float clamp2 = 1.0f - MathUtils.clamp(Math.abs(abs2 / rect2.height()), RecyclerView.DECELERATION_RATE, 1.0f);
                                    float height = (-abs2) - ((rect2.height() * 0.3f) * (1.0f - (clamp2 * clamp2)));
                                    childAt2.setTranslationY(height);
                                    childAt2.getDrawingRect(rect);
                                    rect.offset(0, (int) (-height));
                                    if (height >= rect.height()) {
                                        childAt2.setAlpha(RecyclerView.DECELERATION_RATE);
                                    } else {
                                        childAt2.setAlpha(1.0f);
                                    }
                                    childAt2.setClipBounds(rect);
                                } else {
                                    childAt2.setClipBounds(null);
                                    childAt2.setTranslationY(RecyclerView.DECELERATION_RATE);
                                    childAt2.setAlpha(1.0f);
                                }
                            }
                            i11++;
                            i10 = 1;
                        }
                    }
                    if (!z && appBarLayout.haveChildWithInterpolator) {
                        coordinatorLayout.dispatchDependentViewsChanged(appBarLayout);
                    }
                    appBarLayout.onOffsetChanged(getTopAndBottomOffset());
                    updateAppBarLayoutDrawableState(coordinatorLayout, appBarLayout, clamp, clamp < topBottomOffsetForScrollingSibling ? -1 : 1, false);
                    i6 = i9;
                }
            }
            WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
            if (ViewCompat.Api29Impl.getAccessibilityDelegate(coordinatorLayout) != null) {
                return i6;
            }
            ViewCompat.setAccessibilityDelegate(coordinatorLayout, new AnonymousClass2(coordinatorLayout, this, appBarLayout));
            return i6;
        }

        public final void snapToChildIfNeeded(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int paddingTop = appBarLayout.getPaddingTop() + appBarLayout.getTopInset();
            int topBottomOffsetForScrollingSibling = getTopBottomOffsetForScrollingSibling() - paddingTop;
            int childCount = appBarLayout.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    i = -1;
                    break;
                }
                View childAt = appBarLayout.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if ((layoutParams.scrollFlags & 32) == 32) {
                    top -= ((LinearLayout.LayoutParams) layoutParams).topMargin;
                    bottom += ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                }
                int i2 = -topBottomOffsetForScrollingSibling;
                if (top <= i2 && bottom >= i2) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                View childAt2 = appBarLayout.getChildAt(i);
                LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                int i3 = layoutParams2.scrollFlags;
                if ((i3 & 17) == 17) {
                    int i4 = -childAt2.getTop();
                    int i5 = -childAt2.getBottom();
                    if (i == 0 && appBarLayout.getFitsSystemWindows() && childAt2.getFitsSystemWindows()) {
                        i4 -= appBarLayout.getTopInset();
                    }
                    if ((i3 & 2) == 2) {
                        i5 += childAt2.getMinimumHeight();
                    } else if ((i3 & 5) == 5) {
                        int minimumHeight = childAt2.getMinimumHeight() + i5;
                        if (topBottomOffsetForScrollingSibling < minimumHeight) {
                            i4 = minimumHeight;
                        } else {
                            i5 = minimumHeight;
                        }
                    }
                    if ((i3 & 32) == 32) {
                        i4 += ((LinearLayout.LayoutParams) layoutParams2).topMargin;
                        i5 -= ((LinearLayout.LayoutParams) layoutParams2).bottomMargin;
                    }
                    if (topBottomOffsetForScrollingSibling < (i5 + i4) / 2) {
                        i4 = i5;
                    }
                    animateOffsetTo(coordinatorLayout, appBarLayout, MathUtils.clamp(i4 + paddingTop, -appBarLayout.getTotalScrollRange(), 0));
                }
            }
        }

        public final class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new AnonymousClass1();
            public boolean firstVisibleChildAtMinimumHeight;
            public int firstVisibleChildIndex;
            public float firstVisibleChildPercentageShown;
            public boolean fullyExpanded;
            public boolean fullyScrolled;

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.fullyScrolled = parcel.readByte() != 0;
                this.fullyExpanded = parcel.readByte() != 0;
                this.firstVisibleChildIndex = parcel.readInt();
                this.firstVisibleChildPercentageShown = parcel.readFloat();
                this.firstVisibleChildAtMinimumHeight = parcel.readByte() != 0;
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeByte(this.fullyScrolled ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.fullyExpanded ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.firstVisibleChildIndex);
                parcel.writeFloat(this.firstVisibleChildPercentageShown);
                parcel.writeByte(this.firstVisibleChildAtMinimumHeight ? (byte) 1 : (byte) 0);
            }

            /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$SavedState$1, reason: invalid class name */
            public final class AnonymousClass1 implements Parcelable.ClassLoaderCreator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    return new SavedState(parcel, null);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new SavedState[i];
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new SavedState(parcel, classLoader);
                }
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.activePointerId = -1;
            this.touchSlop = -1;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final /* bridge */ /* synthetic */ void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
            onNestedPreScroll(coordinatorLayout, (AppBarLayout) view, view2, i2, iArr);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    public static class ScrollingViewBehavior extends HeaderScrollingViewBehavior {
        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ScrollingViewBehavior_Layout);
            this.overlayTop = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }

        public static AppBarLayout findFirstDependency(List list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = (View) list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean layoutDependsOn(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) view2.getLayoutParams()).mBehavior;
            if (behavior instanceof BaseBehavior) {
                int bottom = (((view2.getBottom() - view.getTop()) + ((BaseBehavior) behavior).offsetDelta) + this.verticalLayoutGap) - getOverlapPixelsForOffset(view2);
                WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
                view.offsetTopAndBottom(bottom);
            }
            if (!(view2 instanceof AppBarLayout)) {
                return false;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            if (!appBarLayout.liftOnScroll) {
                return false;
            }
            appBarLayout.setLiftedState(appBarLayout.shouldLift(view));
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                ViewCompat.setAccessibilityDelegate(coordinatorLayout, null);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout findFirstDependency = findFirstDependency(coordinatorLayout.getDependencies(view));
            if (findFirstDependency != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                int width = coordinatorLayout.getWidth();
                int height = coordinatorLayout.getHeight();
                Rect rect3 = this.tempRect1;
                rect3.set(0, 0, width, height);
                if (!rect3.contains(rect2)) {
                    findFirstDependency.setExpanded(false, !z);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior() {
        }
    }

    public void setExpanded(boolean z) {
        setExpanded(z, isLaidOut());
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateLayoutParams(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateLayoutParams(layoutParams);
    }

    public static class LayoutParams extends LinearLayout.LayoutParams {
        public final Result scrollEffect;
        public int scrollFlags;
        public final Interpolator scrollInterpolator;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.scrollFlags = 1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AppBarLayout_Layout);
            this.scrollFlags = obtainStyledAttributes.getInt(1, 0);
            this.scrollEffect = obtainStyledAttributes.getInt(0, 0) != 1 ? null : new Result(4);
            if (obtainStyledAttributes.hasValue(2)) {
                this.scrollInterpolator = android.view.animation.AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(2, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public LayoutParams() {
            super(-1, -2);
            this.scrollFlags = 1;
        }
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.appBarLayoutStyle);
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }
}
