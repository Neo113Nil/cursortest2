package com.google.android.material.bottomsheet;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.activity.BackEventCompat;
import androidx.biometric.BiometricFragment;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.ViewDragHelper;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.media3.common.FlagSet;
import androidx.media3.extractor.mkv.Sniffer;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.Transition;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.material.R$styleable;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MaterialBackHandler;
import com.google.android.material.motion.MaterialBottomContainerBackHelper;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.tabs.TabLayout;
import com.google.common.base.Splitter;
import com.squareup.cash.R;
import com.withpersona.sdk2.inquiry.shared.ContextUtilsKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior implements MaterialBackHandler {
    public int activePointerId;
    public final boolean autoExpandOnRequestChildRectangleOffscreen;
    public final ColorStateList backgroundTint;
    public MaterialBottomContainerBackHelper bottomContainerBackHelper;
    public final ArrayList callbacks;
    public int childHeight;
    public final SparseIntArray collapseActionIds;
    public int collapsedOffset;
    public WeakReference currentTouchedScrollChildRef;
    public final SideSheetBehavior.AnonymousClass1 dragCallback;
    public boolean draggable;
    public final boolean draggableOnNestedScroll;
    public boolean draggableOnNestedScrollLastDragIgnored;
    public final float elevation;
    public final SparseIntArray expandActionIds;
    public final SparseIntArray expandHalfwayActionIds;
    public boolean expandedCornersRemoved;
    public final int expandedOffset;
    public boolean fitToContents;
    public int fitToContentsOffset;
    public int gestureInsetBottom;
    public final boolean gestureInsetBottomIgnored;
    public int halfExpandedOffset;
    public final float halfExpandedRatio;
    public final float hideFriction;
    public boolean hideable;
    public boolean ignoreEvents;
    public HashMap importantForAccessibilityMap;
    public int initialY;
    public int insetBottom;
    public int insetTop;
    public final ValueAnimator interpolatorAnimator;
    public int lastNestedScrollDy;
    public final boolean marginLeftSystemWindowInsets;
    public final boolean marginRightSystemWindowInsets;
    public final boolean marginTopSystemWindowInsets;
    public final MaterialShapeDrawable materialShapeDrawable;
    public int maxHeight;
    public final int maxWidth;
    public final float maximumVelocity;
    public final boolean multipleScrollingChildrenSupported;
    public boolean nestedScrolled;
    public final ArrayList nestedScrollingChildrenRef;
    public final boolean paddingBottomSystemWindowInsets;
    public final boolean paddingLeftSystemWindowInsets;
    public final boolean paddingRightSystemWindowInsets;
    public final boolean paddingTopSystemWindowInsets;
    public int parentHeight;
    public int parentWidth;
    public int peekHeight;
    public boolean peekHeightAuto;
    public final int peekHeightGestureInsetBuffer;
    public int peekHeightMin;
    public final int saveFlags;
    public final ShapeAppearanceModel shapeAppearanceModelDefault;
    public final Rect sheetRect;
    public final boolean shouldRemoveExpandedCorners;
    public final int significantVelocityThreshold;
    public boolean skipCollapsed;
    public int state;
    public final Splitter stateSettlingTracker;
    public boolean touchingScrollingChild;
    public boolean updateImportantForAccessibilityOnSiblings;
    public VelocityTracker velocityTracker;
    public ViewDragHelper viewDragHelper;
    public WeakReference viewRef;

    public abstract class BottomSheetCallback {
        public void onLayout(View view) {
        }

        public abstract void onSlide(View view, float f);

        public abstract void onStateChanged(View view, int i);
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        this.saveFlags = 0;
        this.fitToContents = true;
        this.updateImportantForAccessibilityOnSiblings = false;
        this.maxWidth = -1;
        this.maxHeight = -1;
        this.stateSettlingTracker = new Splitter(this);
        this.halfExpandedRatio = 0.5f;
        this.elevation = -1.0f;
        this.draggable = true;
        this.draggableOnNestedScroll = true;
        this.autoExpandOnRequestChildRectangleOffscreen = true;
        this.state = 4;
        this.hideFriction = 0.1f;
        this.nestedScrollingChildrenRef = new ArrayList();
        this.callbacks = new ArrayList();
        this.initialY = -1;
        this.expandHalfwayActionIds = new SparseIntArray();
        this.expandActionIds = new SparseIntArray();
        this.collapseActionIds = new SparseIntArray();
        this.sheetRect = new Rect();
        this.dragCallback = new SideSheetBehavior.AnonymousClass1(this, 1);
        this.peekHeightGestureInsetBuffer = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.BottomSheetBehavior_Layout);
        if (obtainStyledAttributes.hasValue(3)) {
            this.backgroundTint = ContextUtilsKt.getColorStateList(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(24)) {
            this.shapeAppearanceModelDefault = ShapeAppearanceModel.builder(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).build();
        }
        ShapeAppearanceModel shapeAppearanceModel = this.shapeAppearanceModelDefault;
        if (shapeAppearanceModel != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(shapeAppearanceModel);
            this.materialShapeDrawable = materialShapeDrawable;
            materialShapeDrawable.initializeElevationOverlay(context);
            ColorStateList colorStateList = this.backgroundTint;
            if (colorStateList != null) {
                this.materialShapeDrawable.setFillColor(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.materialShapeDrawable.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(calculateInterpolationWithCornersRemoved(), 1.0f);
        this.interpolatorAnimator = ofFloat;
        ofFloat.setDuration(500L);
        this.interpolatorAnimator.addUpdateListener(new TabLayout.AnonymousClass1(this, 2));
        this.elevation = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.maxWidth = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.maxHeight = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(12);
        if (peekValue == null || (i = peekValue.data) != -1) {
            setPeekHeight(obtainStyledAttributes.getDimensionPixelSize(12, -1));
        } else {
            setPeekHeight(i);
        }
        setHideable(obtainStyledAttributes.getBoolean(10, false));
        this.gestureInsetBottomIgnored = obtainStyledAttributes.getBoolean(16, false);
        boolean z = obtainStyledAttributes.getBoolean(8, true);
        if (this.fitToContents != z) {
            this.fitToContents = z;
            if (this.viewRef != null) {
                calculateCollapsedOffset();
            }
            setStateInternal((this.fitToContents && this.state == 6) ? 3 : this.state);
            updateDrawableForTargetState(this.state, true);
            updateAccessibilityActions();
        }
        this.skipCollapsed = obtainStyledAttributes.getBoolean(15, false);
        this.draggable = obtainStyledAttributes.getBoolean(5, true);
        this.draggableOnNestedScroll = obtainStyledAttributes.getBoolean(6, true);
        this.saveFlags = obtainStyledAttributes.getInt(13, 0);
        float f = obtainStyledAttributes.getFloat(9, 0.5f);
        if (f <= RecyclerView.DECELERATION_RATE || f >= 1.0f) {
            a$$ExternalSyntheticBUOutline0.m$3("ratio must be a float value between 0 and 1");
            throw null;
        }
        this.halfExpandedRatio = f;
        if (this.viewRef != null) {
            this.halfExpandedOffset = (int) ((1.0f - f) * this.parentHeight);
        }
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(7);
        if (peekValue2 == null || peekValue2.type != 16) {
            int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(7, 0);
            if (dimensionPixelOffset < 0) {
                a$$ExternalSyntheticBUOutline0.m$3("offset must be greater than or equal to 0");
                throw null;
            }
            this.expandedOffset = dimensionPixelOffset;
            updateDrawableForTargetState(this.state, true);
        } else {
            int i2 = peekValue2.data;
            if (i2 < 0) {
                a$$ExternalSyntheticBUOutline0.m$3("offset must be greater than or equal to 0");
                throw null;
            }
            this.expandedOffset = i2;
            updateDrawableForTargetState(this.state, true);
        }
        this.significantVelocityThreshold = obtainStyledAttributes.getInt(14, 500);
        this.multipleScrollingChildrenSupported = obtainStyledAttributes.getBoolean(11, false);
        this.autoExpandOnRequestChildRectangleOffscreen = obtainStyledAttributes.getBoolean(4, true);
        this.paddingBottomSystemWindowInsets = obtainStyledAttributes.getBoolean(20, false);
        this.paddingLeftSystemWindowInsets = obtainStyledAttributes.getBoolean(21, false);
        this.paddingRightSystemWindowInsets = obtainStyledAttributes.getBoolean(22, false);
        this.paddingTopSystemWindowInsets = obtainStyledAttributes.getBoolean(23, true);
        this.marginLeftSystemWindowInsets = obtainStyledAttributes.getBoolean(17, false);
        this.marginRightSystemWindowInsets = obtainStyledAttributes.getBoolean(18, false);
        this.marginTopSystemWindowInsets = obtainStyledAttributes.getBoolean(19, false);
        this.shouldRemoveExpandedCorners = obtainStyledAttributes.getBoolean(26, true);
        obtainStyledAttributes.recycle();
        this.maximumVelocity = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public static View findScrollingChild(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View findScrollingChild = findScrollingChild(viewGroup.getChildAt(i));
            if (findScrollingChild != null) {
                return findScrollingChild;
            }
        }
        return null;
    }

    public static BottomSheetBehavior from(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.LayoutParams)) {
            a$$ExternalSyntheticBUOutline0.m$3("The view is not a child of CoordinatorLayout");
            return null;
        }
        CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).mBehavior;
        if (behavior instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) behavior;
        }
        a$$ExternalSyntheticBUOutline0.m$3("The view is not associated with BottomSheetBehavior");
        return null;
    }

    public static int getChildMeasureSpec(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, PKIFailureInfo.systemUnavail);
    }

    public final int addAccessibilityActionForState(View view, int i, int i2) {
        return ViewCompat.addAccessibilityAction(view, view.getResources().getString(i), new Sniffer(this, i2, 21));
    }

    public final void addBottomSheetCallback(BottomSheetCallback bottomSheetCallback) {
        ArrayList arrayList = this.callbacks;
        if (arrayList.contains(bottomSheetCallback)) {
            return;
        }
        arrayList.add(bottomSheetCallback);
    }

    public final void calculateCollapsedOffset() {
        int calculatePeekHeight = calculatePeekHeight();
        boolean z = this.fitToContents;
        int i = this.parentHeight;
        if (z) {
            this.collapsedOffset = Math.max(i - calculatePeekHeight, this.fitToContentsOffset);
        } else {
            this.collapsedOffset = i - calculatePeekHeight;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float calculateInterpolationWithCornersRemoved() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        float f;
        RoundedCorner roundedCorner;
        float f2 = RecyclerView.DECELERATION_RATE;
        MaterialShapeDrawable materialShapeDrawable = this.materialShapeDrawable;
        if (materialShapeDrawable != null && (weakReference = this.viewRef) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            View view = (View) this.viewRef.get();
            if (isAtTopOfScreen() && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                float topLeftCornerResolvedSize = materialShapeDrawable.getTopLeftCornerResolvedSize();
                RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner2 != null) {
                    float radius = roundedCorner2.getRadius();
                    if (radius > RecyclerView.DECELERATION_RATE && topLeftCornerResolvedSize > RecyclerView.DECELERATION_RATE) {
                        f = radius / topLeftCornerResolvedSize;
                        float topRightCornerResolvedSize = materialShapeDrawable.getTopRightCornerResolvedSize();
                        roundedCorner = rootWindowInsets.getRoundedCorner(1);
                        if (roundedCorner != null) {
                            float radius2 = roundedCorner.getRadius();
                            if (radius2 > RecyclerView.DECELERATION_RATE && topRightCornerResolvedSize > RecyclerView.DECELERATION_RATE) {
                                f2 = radius2 / topRightCornerResolvedSize;
                            }
                        }
                        return Math.max(f, f2);
                    }
                }
                f = 0.0f;
                float topRightCornerResolvedSize2 = materialShapeDrawable.getTopRightCornerResolvedSize();
                roundedCorner = rootWindowInsets.getRoundedCorner(1);
                if (roundedCorner != null) {
                }
                return Math.max(f, f2);
            }
        }
        return RecyclerView.DECELERATION_RATE;
    }

    public final int calculatePeekHeight() {
        int i;
        int i2;
        int i3;
        if (this.peekHeightAuto) {
            i = Math.min(Math.max(this.peekHeightMin, this.parentHeight - ((this.parentWidth * 9) / 16)), this.childHeight);
            i2 = this.insetBottom;
        } else {
            if (!this.gestureInsetBottomIgnored && !this.paddingBottomSystemWindowInsets && (i3 = this.gestureInsetBottom) > 0) {
                return Math.max(this.peekHeight, i3 + this.peekHeightGestureInsetBuffer);
            }
            i = this.peekHeight;
            i2 = this.insetBottom;
        }
        return i + i2;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public final void cancelBackProgress() {
        MaterialBottomContainerBackHelper materialBottomContainerBackHelper = this.bottomContainerBackHelper;
        if (materialBottomContainerBackHelper == null || materialBottomContainerBackHelper.onCancelBackProgress() == null) {
            return;
        }
        AnimatorSet createResetScaleAnimator = materialBottomContainerBackHelper.createResetScaleAnimator();
        createResetScaleAnimator.setDuration(materialBottomContainerBackHelper.cancelDuration);
        createResetScaleAnimator.start();
    }

    public final void dispatchOnSlide(int i) {
        float f;
        float f2;
        View view = (View) this.viewRef.get();
        if (view != null) {
            ArrayList arrayList = this.callbacks;
            if (arrayList.isEmpty()) {
                return;
            }
            int i2 = this.collapsedOffset;
            if (i > i2 || i2 == getExpandedOffset()) {
                int i3 = this.collapsedOffset;
                f = i3 - i;
                f2 = this.parentHeight - i3;
            } else {
                int i4 = this.collapsedOffset;
                f = i4 - i;
                f2 = i4 - getExpandedOffset();
            }
            float f3 = f / f2;
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                ((BottomSheetCallback) arrayList.get(i5)).onSlide(view, f3);
            }
        }
    }

    public final int getExpandedOffset() {
        if (this.fitToContents) {
            return this.fitToContentsOffset;
        }
        return Math.max(this.expandedOffset, this.paddingTopSystemWindowInsets ? 0 : this.insetTop);
    }

    public final int getTopOffsetForState(int i) {
        if (i == 3) {
            return getExpandedOffset();
        }
        if (i == 4) {
            return this.collapsedOffset;
        }
        if (i == 5) {
            return this.parentHeight;
        }
        if (i == 6) {
            return this.halfExpandedOffset;
        }
        a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Invalid state to get top offset: "));
        return 0;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public final void handleBackInvoked() {
        MaterialBottomContainerBackHelper materialBottomContainerBackHelper = this.bottomContainerBackHelper;
        if (materialBottomContainerBackHelper == null) {
            return;
        }
        int i = materialBottomContainerBackHelper.hideDurationMin;
        int i2 = materialBottomContainerBackHelper.hideDurationMax;
        BackEventCompat backEventCompat = materialBottomContainerBackHelper.backEvent;
        materialBottomContainerBackHelper.backEvent = null;
        if (backEventCompat != null) {
            float f = backEventCompat.progress;
            if (Build.VERSION.SDK_INT >= 34) {
                if (!this.hideable) {
                    AnimatorSet createResetScaleAnimator = materialBottomContainerBackHelper.createResetScaleAnimator();
                    createResetScaleAnimator.setDuration(AnimationUtils.lerp(i2, i, f));
                    createResetScaleAnimator.start();
                    setState(4);
                    return;
                }
                Transition.AnonymousClass3 anonymousClass3 = new Transition.AnonymousClass3(this, r4);
                View view = materialBottomContainerBackHelper.view;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getScaleY() * view.getHeight());
                ofFloat.setInterpolator(new FastOutSlowInInterpolator(0));
                ofFloat.setDuration(AnimationUtils.lerp(i2, i, f));
                ofFloat.addListener(new Transition.AnonymousClass3(materialBottomContainerBackHelper, 7));
                ofFloat.addListener(anonymousClass3);
                ofFloat.start();
                return;
            }
        }
        setState(this.hideable ? 5 : 4);
    }

    public final boolean isAtTopOfScreen() {
        WeakReference weakReference = this.viewRef;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.viewRef.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean isViewScrollingChild(View view) {
        Iterator it = this.nestedScrollingChildrenRef.iterator();
        while (it.hasNext()) {
            if (((WeakReference) it.next()).get() == view) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onAttachedToLayoutParams(CoordinatorLayout.LayoutParams layoutParams) {
        this.viewRef = null;
        this.viewDragHelper = null;
        this.bottomContainerBackHelper = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onDetachedFromLayoutParams() {
        this.viewRef = null;
        this.viewDragHelper = null;
        this.bottomContainerBackHelper = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fb, code lost:
    
        if (r1.get() != null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0121, code lost:
    
        if (r18.isPointInChildBounds(r6, (int) r20.getX(), (int) r20.getY()) != false) goto L85;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        View view2;
        int i;
        ViewDragHelper viewDragHelper;
        if (!view.isShown() || !this.draggable) {
            this.ignoreEvents = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.activePointerId = -1;
            this.initialY = -1;
            this.currentTouchedScrollChildRef = null;
            VelocityTracker velocityTracker = this.velocityTracker;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.velocityTracker = null;
            }
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(motionEvent);
        ArrayList arrayList = this.nestedScrollingChildrenRef;
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.initialY = (int) motionEvent.getY();
            int x2 = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    view2 = (View) ((WeakReference) it.next()).get();
                    if (view2 != null && coordinatorLayout.isPointInChildBounds(view2, x2, y)) {
                        break;
                    }
                }
            }
            view2 = null;
            WeakReference weakReference = new WeakReference(view2);
            this.currentTouchedScrollChildRef = weakReference;
            if (this.state != 2 && weakReference.get() != null) {
                this.activePointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.touchingScrollingChild = true;
            }
            this.ignoreEvents = this.activePointerId == -1 && !coordinatorLayout.isPointInChildBounds(view, x, this.initialY);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.touchingScrollingChild = false;
            this.currentTouchedScrollChildRef = null;
            this.activePointerId = -1;
            if (this.ignoreEvents) {
                this.ignoreEvents = false;
                return false;
            }
        }
        if (this.ignoreEvents || (viewDragHelper = this.viewDragHelper) == null || !viewDragHelper.shouldInterceptTouchEvent(motionEvent)) {
            if (actionMasked == 2) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (((WeakReference) it2.next()).get() != null) {
                        if (!this.ignoreEvents && this.state != 1) {
                            if (this.multipleScrollingChildrenSupported) {
                                WeakReference weakReference2 = this.currentTouchedScrollChildRef;
                                if (weakReference2 != null) {
                                }
                                if (this.viewDragHelper != null || (i = this.initialY) == -1 || Math.abs(i - motionEvent.getY()) <= this.viewDragHelper.mTouchSlop) {
                                    break;
                                }
                            } else {
                                View view3 = arrayList.isEmpty() ? null : (View) ((WeakReference) arrayList.get(0)).get();
                                if (view3 != null) {
                                }
                                if (this.viewDragHelper != null) {
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        int i2 = 0;
        if (this.viewRef == null) {
            this.peekHeightMin = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            boolean z = (this.gestureInsetBottomIgnored || this.peekHeightAuto) ? false : true;
            if (this.paddingBottomSystemWindowInsets || this.paddingLeftSystemWindowInsets || this.paddingRightSystemWindowInsets || this.marginLeftSystemWindowInsets || this.marginRightSystemWindowInsets || this.marginTopSystemWindowInsets || z) {
                ViewUtils.doOnApplyWindowInsets(view, new FlagSet.Builder(this, z, 7));
            }
            ViewCompat.setWindowInsetsAnimationCallback(view, new InsetsAnimationCallback(view));
            this.viewRef = new WeakReference(view);
            this.bottomContainerBackHelper = new MaterialBottomContainerBackHelper(view);
            MaterialShapeDrawable materialShapeDrawable = this.materialShapeDrawable;
            if (materialShapeDrawable != null) {
                view.setBackground(materialShapeDrawable);
                float f = this.elevation;
                if (f == -1.0f) {
                    f = view.getElevation();
                }
                materialShapeDrawable.setElevation(f);
            } else {
                ColorStateList colorStateList = this.backgroundTint;
                if (colorStateList != null) {
                    view.setBackgroundTintList(colorStateList);
                }
            }
            updateAccessibilityActions();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.viewDragHelper == null) {
            this.viewDragHelper = new ViewDragHelper(coordinatorLayout.getContext(), coordinatorLayout, this.dragCallback);
        }
        int top = view.getTop();
        coordinatorLayout.onLayoutChild(view, i);
        this.parentWidth = coordinatorLayout.getWidth();
        this.parentHeight = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.childHeight = height;
        int i3 = this.parentHeight;
        int i4 = i3 - height;
        int i5 = this.insetTop;
        if (i4 < i5) {
            int i6 = this.maxHeight;
            if (this.paddingTopSystemWindowInsets) {
                if (i6 != -1) {
                    i3 = Math.min(i3, i6);
                }
                this.childHeight = i3;
            } else {
                int i7 = i3 - i5;
                if (i6 != -1) {
                    i7 = Math.min(i7, i6);
                }
                this.childHeight = i7;
            }
        }
        this.fitToContentsOffset = Math.max(0, this.parentHeight - this.childHeight);
        this.halfExpandedOffset = (int) ((1.0f - this.halfExpandedRatio) * this.parentHeight);
        calculateCollapsedOffset();
        int i8 = this.state;
        if (i8 == 3) {
            int expandedOffset = getExpandedOffset();
            WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
            view.offsetTopAndBottom(expandedOffset);
        } else if (i8 == 6) {
            int i9 = this.halfExpandedOffset;
            WeakHashMap weakHashMap2 = ViewCompat.sViewPropertyAnimatorMap;
            view.offsetTopAndBottom(i9);
        } else if (this.hideable && i8 == 5) {
            int i10 = this.parentHeight;
            WeakHashMap weakHashMap3 = ViewCompat.sViewPropertyAnimatorMap;
            view.offsetTopAndBottom(i10);
        } else if (i8 == 4) {
            int i11 = this.collapsedOffset;
            WeakHashMap weakHashMap4 = ViewCompat.sViewPropertyAnimatorMap;
            view.offsetTopAndBottom(i11);
        } else if (i8 == 1 || i8 == 2) {
            int top2 = top - view.getTop();
            WeakHashMap weakHashMap5 = ViewCompat.sViewPropertyAnimatorMap;
            view.offsetTopAndBottom(top2);
        }
        updateDrawableForTargetState(this.state, false);
        ArrayList arrayList = this.nestedScrollingChildrenRef;
        arrayList.clear();
        if (this.multipleScrollingChildrenSupported) {
            populateScrollingChildren(view);
        } else {
            arrayList.add(new WeakReference(findScrollingChild(view)));
        }
        while (true) {
            ArrayList arrayList2 = this.callbacks;
            if (i2 >= arrayList2.size()) {
                return true;
            }
            ((BottomSheetCallback) arrayList2.get(i2)).onLayout(view);
            i2++;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.maxWidth, marginLayoutParams.width), getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.maxHeight, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onNestedPreFling(View view) {
        Iterator it = this.nestedScrollingChildrenRef.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (((WeakReference) it.next()).get() != null) {
                if (!isViewScrollingChild(view) || this.state == 3 || this.draggableOnNestedScrollLastDragIgnored) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        boolean isViewScrollingChild;
        if (i3 != 1 && (isViewScrollingChild = isViewScrollingChild(view2))) {
            int top = view.getTop();
            int i4 = top - i2;
            boolean z = this.draggableOnNestedScroll;
            if (i2 > 0) {
                if (!this.nestedScrolled && !z && isViewScrollingChild && view2.canScrollVertically(1)) {
                    this.draggableOnNestedScrollLastDragIgnored = true;
                    return;
                }
                if (i4 < getExpandedOffset()) {
                    int expandedOffset = top - getExpandedOffset();
                    iArr[1] = expandedOffset;
                    WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
                    view.offsetTopAndBottom(-expandedOffset);
                    setStateInternal(3);
                } else {
                    if (!this.draggable) {
                        return;
                    }
                    iArr[1] = i2;
                    WeakHashMap weakHashMap2 = ViewCompat.sViewPropertyAnimatorMap;
                    view.offsetTopAndBottom(-i2);
                    setStateInternal(1);
                }
            } else if (i2 < 0) {
                boolean canScrollVertically = view2.canScrollVertically(-1);
                if (!this.nestedScrolled && !z && isViewScrollingChild && canScrollVertically) {
                    this.draggableOnNestedScrollLastDragIgnored = true;
                    return;
                }
                if (!canScrollVertically) {
                    int i5 = this.collapsedOffset;
                    if (i4 > i5 && !this.hideable) {
                        int i6 = top - i5;
                        iArr[1] = i6;
                        WeakHashMap weakHashMap3 = ViewCompat.sViewPropertyAnimatorMap;
                        view.offsetTopAndBottom(-i6);
                        setStateInternal(4);
                    } else {
                        if (!this.draggable) {
                            return;
                        }
                        iArr[1] = i2;
                        WeakHashMap weakHashMap4 = ViewCompat.sViewPropertyAnimatorMap;
                        view.offsetTopAndBottom(-i2);
                        setStateInternal(1);
                    }
                }
            }
            dispatchOnSlide(view.getTop());
            this.lastNestedScrollDy = i2;
            this.nestedScrolled = true;
            this.draggableOnNestedScrollLastDragIgnored = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
        if (!this.autoExpandOnRequestChildRectangleOffscreen || view.isInTouchMode()) {
            return false;
        }
        int i = this.state;
        if (i != 4 && i != 6) {
            return false;
        }
        Rect rect2 = this.sheetRect;
        if (view.getLocalVisibleRect(rect2)) {
            WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
            WindowInsetsCompat rootWindowInsets = ViewCompat.Api23Impl.getRootWindowInsets(view);
            if (rootWindowInsets != null) {
                rect2.bottom -= rootWindowInsets.mImpl.getInsets(519).bottom;
            }
            if (rect.top >= rect2.top && rect.bottom <= rect2.bottom) {
                return false;
            }
        }
        setState(3);
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onRestoreInstanceState(View view, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        int i = this.saveFlags;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.peekHeight = savedState.peekHeight;
            }
            if (i == -1 || (i & 2) == 2) {
                this.fitToContents = savedState.fitToContents;
            }
            if (i == -1 || (i & 4) == 4) {
                this.hideable = savedState.hideable;
            }
            if (i == -1 || (i & 8) == 8) {
                this.skipCollapsed = savedState.skipCollapsed;
            }
        }
        int i2 = savedState.state;
        if (i2 == 1 || i2 == 2) {
            this.state = 4;
        } else {
            this.state = i2;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final Parcelable onSaveInstanceState(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new SavedState(this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        this.lastNestedScrollDy = 0;
        this.nestedScrolled = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        if (r4.getTop() <= r2.halfExpandedOffset) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006d, code lost:
    
        if (java.lang.Math.abs(r3 - r2.fitToContentsOffset) < java.lang.Math.abs(r3 - r2.collapsedOffset)) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007c, code lost:
    
        if (r3 < java.lang.Math.abs(r3 - r2.collapsedOffset)) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008c, code lost:
    
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.collapsedOffset)) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a8, code lost:
    
        if (java.lang.Math.abs(r3 - r2.halfExpandedOffset) < java.lang.Math.abs(r3 - r2.collapsedOffset)) goto L48;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onStopNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        float yVelocity;
        int i2 = 3;
        if (view.getTop() == getExpandedOffset()) {
            setStateInternal(3);
            return;
        }
        if (isViewScrollingChild(view2) && this.nestedScrolled) {
            if (this.lastNestedScrollDy > 0) {
                if (!this.fitToContents) {
                }
                startSettling(view, i2, false);
                this.nestedScrolled = false;
            }
            if (this.hideable) {
                VelocityTracker velocityTracker = this.velocityTracker;
                if (velocityTracker == null) {
                    yVelocity = RecyclerView.DECELERATION_RATE;
                } else {
                    velocityTracker.computeCurrentVelocity(IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO, this.maximumVelocity);
                    yVelocity = this.velocityTracker.getYVelocity(this.activePointerId);
                }
                if (shouldHide(view, yVelocity)) {
                    i2 = 5;
                    startSettling(view, i2, false);
                    this.nestedScrolled = false;
                }
            }
            if (this.lastNestedScrollDy == 0) {
                int top = view.getTop();
                if (!this.fitToContents) {
                    int i3 = this.halfExpandedOffset;
                    if (top < i3) {
                    }
                    i2 = 6;
                }
            } else {
                if (!this.fitToContents) {
                    int top2 = view.getTop();
                }
                i2 = 4;
            }
            startSettling(view, i2, false);
            this.nestedScrolled = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.state;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        ViewDragHelper viewDragHelper = this.viewDragHelper;
        if (viewDragHelper != null && (this.draggable || i == 1)) {
            viewDragHelper.processTouchEvent(motionEvent);
        }
        if (actionMasked == 0) {
            this.activePointerId = -1;
            this.initialY = -1;
            this.currentTouchedScrollChildRef = null;
            VelocityTracker velocityTracker = this.velocityTracker;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.velocityTracker = null;
            }
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(motionEvent);
        if (this.viewDragHelper != null && ((this.draggable || this.state == 1) && actionMasked == 2 && !this.ignoreEvents)) {
            float abs = Math.abs(this.initialY - motionEvent.getY());
            ViewDragHelper viewDragHelper2 = this.viewDragHelper;
            if (abs > viewDragHelper2.mTouchSlop) {
                viewDragHelper2.captureChildView(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.ignoreEvents;
    }

    public final void populateScrollingChildren(View view) {
        if (view.getVisibility() != 0) {
            return;
        }
        if (view.isNestedScrollingEnabled()) {
            this.nestedScrollingChildrenRef.add(new WeakReference(view));
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                populateScrollingChildren(viewGroup.getChildAt(i));
            }
        }
    }

    public final void setHideable(boolean z) {
        if (this.hideable != z) {
            this.hideable = z;
            if (!z && this.state == 5) {
                setState(4);
            }
            updateAccessibilityActions();
        }
    }

    public final void setPeekHeight(int i) {
        boolean z = this.peekHeightAuto;
        if (i == -1) {
            if (z) {
                return;
            } else {
                this.peekHeightAuto = true;
            }
        } else {
            if (!z && this.peekHeight == i) {
                return;
            }
            this.peekHeightAuto = false;
            this.peekHeight = Math.max(0, i);
        }
        updatePeekHeight();
    }

    public final void setState(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.hideable && i == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i);
            return;
        }
        int i2 = (i == 6 && this.fitToContents && getTopOffsetForState(i) <= this.fitToContentsOffset) ? 3 : i;
        WeakReference weakReference = this.viewRef;
        if (weakReference == null || weakReference.get() == null) {
            setStateInternal(i);
            return;
        }
        View view = (View) this.viewRef.get();
        BiometricFragment.AnonymousClass10 anonymousClass10 = new BiometricFragment.AnonymousClass10(this, view, i2, 4);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
            view.post(anonymousClass10);
        } else {
            anonymousClass10.run();
        }
    }

    public final void setStateInternal(int i) {
        View view;
        if (this.state == i) {
            return;
        }
        this.state = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z = this.hideable;
        }
        WeakReference weakReference = this.viewRef;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = 0;
        if (i == 3) {
            updateImportantForAccessibility(true);
        } else if (i == 6 || i == 5 || i == 4) {
            updateImportantForAccessibility(false);
        }
        updateDrawableForTargetState(i, true);
        while (true) {
            ArrayList arrayList = this.callbacks;
            if (i2 >= arrayList.size()) {
                updateAccessibilityActions();
                return;
            } else {
                ((BottomSheetCallback) arrayList.get(i2)).onStateChanged(view, i);
                i2++;
            }
        }
    }

    public final boolean shouldHide(View view, float f) {
        if (this.skipCollapsed) {
            return true;
        }
        if (view.getTop() < this.collapsedOffset) {
            return false;
        }
        return Math.abs(((f * this.hideFriction) + ((float) view.getTop())) - ((float) this.collapsedOffset)) / ((float) calculatePeekHeight()) > 0.5f;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public final void startBackProgress(BackEventCompat backEventCompat) {
        MaterialBottomContainerBackHelper materialBottomContainerBackHelper = this.bottomContainerBackHelper;
        if (materialBottomContainerBackHelper == null) {
            return;
        }
        materialBottomContainerBackHelper.backEvent = backEventCompat;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r1.settleCapturedViewAt(r3.getLeft(), r0) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0032, code lost:
    
        setStateInternal(2);
        updateDrawableForTargetState(r4, true);
        r2.stateSettlingTracker.continueSettlingToState(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003f, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void startSettling(View view, int i, boolean z) {
        int topOffsetForState = getTopOffsetForState(i);
        ViewDragHelper viewDragHelper = this.viewDragHelper;
        if (viewDragHelper != null) {
            if (!z) {
                int left = view.getLeft();
                viewDragHelper.mCapturedView = view;
                viewDragHelper.mActivePointerId = -1;
                boolean forceSettleCapturedViewAt = viewDragHelper.forceSettleCapturedViewAt(left, topOffsetForState, 0, 0);
                if (!forceSettleCapturedViewAt && viewDragHelper.mDragState == 0 && viewDragHelper.mCapturedView != null) {
                    viewDragHelper.mCapturedView = null;
                }
            }
        }
        setStateInternal(i);
    }

    public final void updateAccessibilityActions() {
        View view;
        WeakReference weakReference = this.viewRef;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        ViewCompat.removeActionWithId(view, PKIFailureInfo.badCertTemplate);
        ViewCompat.notifyViewAccessibilityStateChangedIfNeeded(view, 0);
        ViewCompat.removeActionWithId(view, PKIFailureInfo.signerNotTrusted);
        ViewCompat.notifyViewAccessibilityStateChangedIfNeeded(view, 0);
        ViewCompat.removeActionWithId(view, PKIFailureInfo.transactionIdInUse);
        ViewCompat.notifyViewAccessibilityStateChangedIfNeeded(view, 0);
        SparseIntArray sparseIntArray = this.expandActionIds;
        int i = sparseIntArray.get(0, -1);
        if (i != -1) {
            ViewCompat.removeActionWithId(view, i);
            ViewCompat.notifyViewAccessibilityStateChangedIfNeeded(view, 0);
            sparseIntArray.delete(0);
        }
        SparseIntArray sparseIntArray2 = this.expandHalfwayActionIds;
        int i2 = sparseIntArray2.get(0, -1);
        if (i2 != -1) {
            ViewCompat.removeActionWithId(view, i2);
            ViewCompat.notifyViewAccessibilityStateChangedIfNeeded(view, 0);
            sparseIntArray2.delete(0);
        }
        SparseIntArray sparseIntArray3 = this.collapseActionIds;
        int i3 = sparseIntArray3.get(0, -1);
        if (i3 != -1) {
            ViewCompat.removeActionWithId(view, i3);
            ViewCompat.notifyViewAccessibilityStateChangedIfNeeded(view, 0);
            sparseIntArray3.delete(0);
        }
        if (!this.fitToContents && this.state != 6) {
            sparseIntArray2.put(0, addAccessibilityActionForState(view, R.string.bottomsheet_action_expand_halfway, 6));
        }
        if (this.hideable) {
            int i4 = 5;
            if (this.state != 5) {
                ViewCompat.replaceAccessibilityAction(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DISMISS, null, new Sniffer(this, i4, 21));
            }
        }
        int i5 = this.state;
        if (i5 == 3) {
            if (this.skipCollapsed && this.hideable) {
                return;
            }
            sparseIntArray3.put(0, addAccessibilityActionForState(view, R.string.bottomsheet_action_collapse, 4));
            return;
        }
        if (i5 == 4) {
            sparseIntArray.put(0, addAccessibilityActionForState(view, R.string.bottomsheet_action_expand, 3));
        } else {
            if (i5 != 6) {
                return;
            }
            if (!this.skipCollapsed || !this.hideable) {
                sparseIntArray3.put(0, addAccessibilityActionForState(view, R.string.bottomsheet_action_collapse, 4));
            }
            sparseIntArray.put(0, addAccessibilityActionForState(view, R.string.bottomsheet_action_expand, 3));
        }
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public final void updateBackProgress(BackEventCompat backEventCompat) {
        MaterialBottomContainerBackHelper materialBottomContainerBackHelper = this.bottomContainerBackHelper;
        if (materialBottomContainerBackHelper == null) {
            return;
        }
        if (materialBottomContainerBackHelper.backEvent == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        BackEventCompat backEventCompat2 = materialBottomContainerBackHelper.backEvent;
        materialBottomContainerBackHelper.backEvent = backEventCompat;
        if (backEventCompat2 == null) {
            return;
        }
        materialBottomContainerBackHelper.updateBackProgress(backEventCompat.progress);
    }

    public final void updateDrawableForTargetState(int i, boolean z) {
        MaterialShapeDrawable materialShapeDrawable;
        if (i == 2) {
            return;
        }
        boolean z2 = this.state == 3 && (this.shouldRemoveExpandedCorners || isAtTopOfScreen());
        if (this.expandedCornersRemoved == z2 || (materialShapeDrawable = this.materialShapeDrawable) == null) {
            return;
        }
        this.expandedCornersRemoved = z2;
        ValueAnimator valueAnimator = this.interpolatorAnimator;
        if (!z || valueAnimator == null) {
            if (valueAnimator != null && valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
            materialShapeDrawable.setInterpolation(this.expandedCornersRemoved ? calculateInterpolationWithCornersRemoved() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            valueAnimator.reverse();
        } else {
            valueAnimator.setFloatValues(materialShapeDrawable.drawableState.interpolation, z2 ? calculateInterpolationWithCornersRemoved() : 1.0f);
            valueAnimator.start();
        }
    }

    public final void updateImportantForAccessibility(boolean z) {
        HashMap hashMap;
        WeakReference weakReference = this.viewRef;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.importantForAccessibilityMap != null) {
                    return;
                } else {
                    this.importantForAccessibilityMap = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.viewRef.get()) {
                    if (z) {
                        this.importantForAccessibilityMap.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.updateImportantForAccessibilityOnSiblings) {
                            childAt.setImportantForAccessibility(4);
                        }
                    } else if (this.updateImportantForAccessibilityOnSiblings && (hashMap = this.importantForAccessibilityMap) != null && hashMap.containsKey(childAt)) {
                        childAt.setImportantForAccessibility(((Integer) this.importantForAccessibilityMap.get(childAt)).intValue());
                    }
                }
            }
            if (!z) {
                this.importantForAccessibilityMap = null;
            } else if (this.updateImportantForAccessibilityOnSiblings) {
                ((View) this.viewRef.get()).sendAccessibilityEvent(8);
            }
        }
    }

    public final void updatePeekHeight() {
        View view;
        if (this.viewRef != null) {
            calculateCollapsedOffset();
            if (this.state != 4 || (view = (View) this.viewRef.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    public final class SavedState extends androidx.customview.view.AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new AbsSavedState.AnonymousClass2(10);
        public final boolean fitToContents;
        public final boolean hideable;
        public final int peekHeight;
        public final boolean skipCollapsed;
        public final int state;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.state = parcel.readInt();
            this.peekHeight = parcel.readInt();
            this.fitToContents = parcel.readInt() == 1;
            this.hideable = parcel.readInt() == 1;
            this.skipCollapsed = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.state);
            parcel.writeInt(this.peekHeight);
            parcel.writeInt(this.fitToContents ? 1 : 0);
            parcel.writeInt(this.hideable ? 1 : 0);
            parcel.writeInt(this.skipCollapsed ? 1 : 0);
        }

        public SavedState(BottomSheetBehavior bottomSheetBehavior) {
            super(android.view.AbsSavedState.EMPTY_STATE);
            this.state = bottomSheetBehavior.state;
            this.peekHeight = bottomSheetBehavior.peekHeight;
            this.fitToContents = bottomSheetBehavior.fitToContents;
            this.hideable = bottomSheetBehavior.hideable;
            this.skipCollapsed = bottomSheetBehavior.skipCollapsed;
        }
    }

    public BottomSheetBehavior() {
        this.saveFlags = 0;
        this.fitToContents = true;
        this.updateImportantForAccessibilityOnSiblings = false;
        this.maxWidth = -1;
        this.maxHeight = -1;
        this.stateSettlingTracker = new Splitter(this);
        this.halfExpandedRatio = 0.5f;
        this.elevation = -1.0f;
        this.draggable = true;
        this.draggableOnNestedScroll = true;
        this.autoExpandOnRequestChildRectangleOffscreen = true;
        this.state = 4;
        this.hideFriction = 0.1f;
        this.nestedScrollingChildrenRef = new ArrayList();
        this.callbacks = new ArrayList();
        this.initialY = -1;
        this.expandHalfwayActionIds = new SparseIntArray();
        this.expandActionIds = new SparseIntArray();
        this.collapseActionIds = new SparseIntArray();
        this.sheetRect = new Rect();
        this.dragCallback = new SideSheetBehavior.AnonymousClass1(this, 1);
    }
}
