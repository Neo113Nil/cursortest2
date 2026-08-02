package com.google.android.material.sidesheet;

import android.R;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.shape.a;
import com.google.android.material.sidesheet.SideSheetBehavior;
import defpackage.ac;
import defpackage.ccq;
import defpackage.cfq;
import defpackage.dfi;
import defpackage.dfq;
import defpackage.dlh;
import defpackage.efq;
import defpackage.eup;
import defpackage.geu;
import defpackage.h5;
import defpackage.heu;
import defpackage.hrg;
import defpackage.ic;
import defpackage.ivf;
import defpackage.iz7;
import defpackage.jrb;
import defpackage.k5c;
import defpackage.k5r;
import defpackage.l1j;
import defpackage.le;
import defpackage.lwf;
import defpackage.nch;
import defpackage.ndu;
import defpackage.no0;
import defpackage.odh;
import defpackage.pdh;
import defpackage.qb;
import defpackage.ri2;
import defpackage.su4;
import defpackage.uk6;
import defpackage.vdn;
import defpackage.wdu;
import defpackage.wm0;
import defpackage.wxo;
import defpackage.xbq;
import defpackage.xk6;
import defpackage.xq0;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public class SideSheetBehavior<V extends View> extends uk6 implements nch {
    private static final int DEFAULT_ACCESSIBILITY_PANE_TITLE = 2131956324;
    private static final int DEF_STYLE_RES = 2132018949;
    private static final float HIDE_FRICTION = 0.1f;
    private static final float HIDE_THRESHOLD = 0.5f;
    private static final int NO_MAX_SIZE = -1;
    static final int SIGNIFICANT_VEL_THRESHOLD = 500;
    private ColorStateList backgroundTint;
    private int childWidth;
    private WeakReference<View> coplanarSiblingViewRef;
    private float elevation;
    private boolean ignoreEvents;
    private int initialX;
    private int innerMargin;
    private a materialShapeDrawable;
    private float maximumVelocity;
    private int parentInnerEdge;
    private int parentWidth;
    private eup shapeAppearanceModel;
    private ccq sheetDelegate;
    private pdh sideContainerBackHelper;
    private VelocityTracker velocityTracker;
    private heu viewDragHelper;
    private WeakReference<V> viewRef;
    private final dfq stateSettlingTracker = new dfq(this);
    private boolean draggable = true;
    private int state = 5;
    private int lastStableState = 5;
    private float hideFriction = HIDE_FRICTION;
    private int coplanarSiblingViewId = -1;

    @NonNull
    private final Set<efq> callbacks = new LinkedHashSet();
    private final geu dragCallback = new wxo(1, this);

    public SideSheetBehavior(@NonNull Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vdn.P);
        if (obtainStyledAttributes.hasValue(3)) {
            this.backgroundTint = ivf.D(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.shapeAppearanceModel = eup.c(context, attributeSet, 0, DEF_STYLE_RES).e();
        }
        if (obtainStyledAttributes.hasValue(5)) {
            setCoplanarSiblingViewId(obtainStyledAttributes.getResourceId(5, -1));
        }
        createMaterialShapeDrawableIfNeeded(context);
        this.elevation = obtainStyledAttributes.getDimension(2, -1.0f);
        setDraggable(obtainStyledAttributes.getBoolean(4, true));
        obtainStyledAttributes.recycle();
        this.maximumVelocity = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    private int calculateCurrentOffset(int i, V v) {
        int i2 = this.state;
        if (i2 == 1 || i2 == 2) {
            return i - this.sheetDelegate.h(v);
        }
        if (i2 == 3) {
            return 0;
        }
        if (i2 == 5) {
            return this.sheetDelegate.e();
        }
        dlh.d(this.state, "Unexpected value: ");
        return 0;
    }

    private float calculateDragDistance(float f, float f2) {
        return Math.abs(f - f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int calculateTargetStateOnViewReleased(@NonNull View view, float f, float f2) {
        if (isExpandingOutwards(f)) {
            return 3;
        }
        if (shouldHide(view, f)) {
            if (!this.sheetDelegate.m(f, f2) && !this.sheetDelegate.l(view)) {
                return 3;
            }
        } else {
            if (f != 0.0f && Math.abs(f) > Math.abs(f2)) {
                return 5;
            }
            int left = view.getLeft();
            if (Math.abs(left - getExpandedOffset()) < Math.abs(left - this.sheetDelegate.e())) {
                return 3;
            }
        }
        return 5;
    }

    private void clearCoplanarSiblingView() {
        WeakReference<View> weakReference = this.coplanarSiblingViewRef;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.coplanarSiblingViewRef = null;
    }

    private ic createAccessibilityViewCommandForState(int i) {
        return new jrb(this, i, 6);
    }

    private void createMaterialShapeDrawableIfNeeded(@NonNull Context context) {
        if (this.shapeAppearanceModel == null) {
            return;
        }
        a aVar = new a(this.shapeAppearanceModel);
        this.materialShapeDrawable = aVar;
        aVar.n(context);
        ColorStateList colorStateList = this.backgroundTint;
        if (colorStateList != null) {
            this.materialShapeDrawable.r(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.materialShapeDrawable.setTint(typedValue.data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchOnSlide(@NonNull View view, int i) {
        if (this.callbacks.isEmpty()) {
            return;
        }
        this.sheetDelegate.b(i);
        Iterator<efq> it = this.callbacks.iterator();
        if (it.hasNext()) {
            throw hrg.j(it);
        }
    }

    private void ensureAccessibilityPaneTitleIsSet(View view) {
        if (wdu.g(view) == null) {
            wdu.r(view, view.getResources().getString(DEFAULT_ACCESSIBILITY_PANE_TITLE));
        }
    }

    @NonNull
    public static <V extends View> SideSheetBehavior<V> from(@NonNull V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (!(layoutParams instanceof xk6)) {
            xq0.x("The view is not a child of CoordinatorLayout");
            return null;
        }
        uk6 uk6Var = ((xk6) layoutParams).a;
        if (uk6Var instanceof SideSheetBehavior) {
            return (SideSheetBehavior) uk6Var;
        }
        xq0.x("The view is not associated with SideSheetBehavior");
        return null;
    }

    private int getChildMeasureSpec(int i, int i2, int i3, int i4) {
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
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    private ValueAnimator.AnimatorUpdateListener getCoplanarFinishAnimatorUpdateListener() {
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        final View coplanarSiblingView = getCoplanarSiblingView();
        if (coplanarSiblingView == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) coplanarSiblingView.getLayoutParams()) == null) {
            return null;
        }
        final int c = this.sheetDelegate.c(marginLayoutParams);
        return new ValueAnimator.AnimatorUpdateListener() { // from class: bfq
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SideSheetBehavior.this.lambda$getCoplanarFinishAnimatorUpdateListener$1(marginLayoutParams, c, coplanarSiblingView, valueAnimator);
            }
        };
    }

    private int getGravityFromSheetEdge() {
        ccq ccqVar = this.sheetDelegate;
        return (ccqVar == null || ccqVar.j() == 0) ? 5 : 3;
    }

    private xk6 getViewLayoutParams() {
        V v;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || (v = weakReference.get()) == null || !(v.getLayoutParams() instanceof xk6)) {
            return null;
        }
        return (xk6) v.getLayoutParams();
    }

    private boolean hasLeftMargin() {
        xk6 viewLayoutParams = getViewLayoutParams();
        return viewLayoutParams != null && ((ViewGroup.MarginLayoutParams) viewLayoutParams).leftMargin > 0;
    }

    private boolean hasRightMargin() {
        xk6 viewLayoutParams = getViewLayoutParams();
        return viewLayoutParams != null && ((ViewGroup.MarginLayoutParams) viewLayoutParams).rightMargin > 0;
    }

    private boolean isDraggedFarEnough(@NonNull MotionEvent motionEvent) {
        return shouldHandleDraggingWithHelper() && calculateDragDistance((float) this.initialX, motionEvent.getX()) > ((float) this.viewDragHelper.b);
    }

    private boolean isExpandingOutwards(float f) {
        return this.sheetDelegate.k(f);
    }

    private boolean isLayingOut(@NonNull V v) {
        ViewParent parent = v.getParent();
        return parent != null && parent.isLayoutRequested() && v.isAttachedToWindow();
    }

    private boolean isSettling(View view, int i, boolean z) {
        int outerEdgeOffsetForState = getOuterEdgeOffsetForState(i);
        heu viewDragHelper = getViewDragHelper();
        if (viewDragHelper != null) {
            if (!z) {
                int top = view.getTop();
                viewDragHelper.s = view;
                viewDragHelper.c = -1;
                boolean i2 = viewDragHelper.i(outerEdgeOffsetForState, top, 0, 0);
                if (!i2 && viewDragHelper.a == 0 && viewDragHelper.s != null) {
                    viewDragHelper.s = null;
                }
                if (i2) {
                    return true;
                }
            } else if (viewDragHelper.q(outerEdgeOffsetForState, view.getTop())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$createAccessibilityViewCommandForState$2(int i, View view, ac acVar) {
        setState(i);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getCoplanarFinishAnimatorUpdateListener$1(ViewGroup.MarginLayoutParams marginLayoutParams, int i, View view, ValueAnimator valueAnimator) {
        this.sheetDelegate.o(marginLayoutParams, wm0.c(i, valueAnimator.getAnimatedFraction(), 0));
        view.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setState$0(int i) {
        V v = this.viewRef.get();
        if (v != null) {
            startSettling(v, i, false);
        }
    }

    private void maybeAssignCoplanarSiblingViewBasedId(@NonNull CoordinatorLayout coordinatorLayout) {
        int i;
        View findViewById;
        if (this.coplanarSiblingViewRef != null || (i = this.coplanarSiblingViewId) == -1 || (findViewById = coordinatorLayout.findViewById(i)) == null) {
            return;
        }
        this.coplanarSiblingViewRef = new WeakReference<>(findViewById);
    }

    private void replaceAccessibilityActionForState(V v, qb qbVar, int i) {
        wdu.o(v, qbVar, null, createAccessibilityViewCommandForState(i));
    }

    private void resetVelocity() {
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.velocityTracker = null;
        }
    }

    private void runAfterLayout(@NonNull V v, Runnable runnable) {
        if (isLayingOut(v)) {
            v.post(runnable);
        } else {
            runnable.run();
        }
    }

    private void setSheetEdge(int i) {
        ccq ccqVar = this.sheetDelegate;
        if (ccqVar == null || ccqVar.j() != i) {
            if (i == 0) {
                this.sheetDelegate = new lwf(this, 1);
                if (this.shapeAppearanceModel == null || hasRightMargin()) {
                    return;
                }
                iz7 h = this.shapeAppearanceModel.h();
                h.f = new h5(0.0f);
                h.g = new h5(0.0f);
                updateMaterialShapeDrawable(h.e());
                return;
            }
            if (i != 1) {
                xq0.x(dfi.c(i, "Invalid sheet edge position value: ", ". Must be 0 or 1."));
                return;
            }
            this.sheetDelegate = new lwf(this, 0);
            if (this.shapeAppearanceModel == null || hasLeftMargin()) {
                return;
            }
            iz7 h2 = this.shapeAppearanceModel.h();
            h2.e = new h5(0.0f);
            h2.h = new h5(0.0f);
            updateMaterialShapeDrawable(h2.e());
        }
    }

    private boolean shouldHandleDraggingWithHelper() {
        if (this.viewDragHelper != null) {
            return this.draggable || this.state == 1;
        }
        return false;
    }

    private boolean shouldInterceptTouchEvent(@NonNull V v) {
        return (v.isShown() || wdu.g(v) != null) && this.draggable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startSettling(View view, int i, boolean z) {
        if (!isSettling(view, i, z)) {
            setStateInternal(i);
        } else {
            setStateInternal(2);
            this.stateSettlingTracker.a(i);
        }
    }

    private void updateAccessibilityActions() {
        V v;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        wdu.n(SQLiteDatabase.OPEN_PRIVATECACHE, v);
        wdu.k(0, v);
        wdu.n(1048576, v);
        wdu.k(0, v);
        if (this.state != 5) {
            replaceAccessibilityActionForState(v, qb.m, 5);
        }
        if (this.state != 3) {
            replaceAccessibilityActionForState(v, qb.k, 3);
        }
    }

    private void updateCoplanarSiblingBackProgress() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        V v = this.viewRef.get();
        View coplanarSiblingView = getCoplanarSiblingView();
        if (coplanarSiblingView == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) coplanarSiblingView.getLayoutParams()) == null) {
            return;
        }
        this.sheetDelegate.o(marginLayoutParams, (int) ((v.getScaleX() * this.childWidth) + this.innerMargin));
        coplanarSiblingView.requestLayout();
    }

    private void updateMaterialShapeDrawable(@NonNull eup eupVar) {
        a aVar = this.materialShapeDrawable;
        if (aVar != null) {
            aVar.setShapeAppearanceModel(eupVar);
        }
    }

    private void updateSheetVisibility(@NonNull View view) {
        int i = this.state == 5 ? 4 : 0;
        if (view.getVisibility() != i) {
            view.setVisibility(i);
        }
    }

    public /* synthetic */ void addCallback(@NonNull xbq xbqVar) {
        if (xbqVar == null) {
            addCallback((efq) null);
        } else {
            l1j.f();
        }
    }

    @Override // defpackage.nch
    public void cancelBackProgress() {
        pdh pdhVar = this.sideContainerBackHelper;
        if (pdhVar == null) {
            return;
        }
        View view = (View) pdhVar.e;
        if (pdhVar.c() == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(pdhVar.c);
        animatorSet.start();
    }

    public void expand() {
        setState(3);
    }

    public pdh getBackHelper() {
        return this.sideContainerBackHelper;
    }

    public int getChildWidth() {
        return this.childWidth;
    }

    public View getCoplanarSiblingView() {
        WeakReference<View> weakReference = this.coplanarSiblingViewRef;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public int getExpandedOffset() {
        return this.sheetDelegate.d();
    }

    public float getHideFriction() {
        return this.hideFriction;
    }

    public float getHideThreshold() {
        return HIDE_THRESHOLD;
    }

    public int getInnerMargin() {
        return this.innerMargin;
    }

    public int getLastStableState() {
        return this.lastStableState;
    }

    public int getOuterEdgeOffsetForState(int i) {
        if (i == 3) {
            return getExpandedOffset();
        }
        if (i == 5) {
            return this.sheetDelegate.e();
        }
        xq0.x(k5r.i(i, "Invalid state to get outer edge offset: "));
        return 0;
    }

    public int getParentInnerEdge() {
        return this.parentInnerEdge;
    }

    public int getParentWidth() {
        return this.parentWidth;
    }

    public int getSignificantVelocityThreshold() {
        return SIGNIFICANT_VEL_THRESHOLD;
    }

    public int getState() {
        return this.state;
    }

    public heu getViewDragHelper() {
        return this.viewDragHelper;
    }

    public float getXVelocity() {
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.maximumVelocity);
        return this.velocityTracker.getXVelocity();
    }

    @Override // defpackage.nch
    public void handleBackInvoked() {
        int i;
        pdh pdhVar = this.sideContainerBackHelper;
        if (pdhVar == null) {
            return;
        }
        ri2 ri2Var = (ri2) pdhVar.f;
        pdhVar.f = null;
        if (ri2Var == null || Build.VERSION.SDK_INT < 34) {
            setState(5);
            return;
        }
        int gravityFromSheetEdge = getGravityFromSheetEdge();
        le leVar = new le(11, this);
        ValueAnimator.AnimatorUpdateListener coplanarFinishAnimatorUpdateListener = getCoplanarFinishAnimatorUpdateListener();
        View view = (View) pdhVar.e;
        boolean z = ri2Var.d == 0;
        boolean z2 = (Gravity.getAbsoluteGravity(gravityFromSheetEdge, view.getLayoutDirection()) & 3) == 3;
        float scaleX = view.getScaleX() * view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            i = z2 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
        } else {
            i = 0;
        }
        float f = scaleX + i;
        Property property = View.TRANSLATION_X;
        if (z2) {
            f = -f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, f);
        if (coplanarFinishAnimatorUpdateListener != null) {
            ofFloat.addUpdateListener(coplanarFinishAnimatorUpdateListener);
        }
        ofFloat.setInterpolator(new k5c(1));
        ofFloat.setDuration(wm0.c(pdhVar.a, ri2Var.c, pdhVar.b));
        ofFloat.addListener(new odh(pdhVar, z, gravityFromSheetEdge));
        ofFloat.addListener(leVar);
        ofFloat.start();
    }

    public void hide() {
        setState(5);
    }

    public boolean isDraggable() {
        return this.draggable;
    }

    @Override // defpackage.uk6
    public void onAttachedToLayoutParams(@NonNull xk6 xk6Var) {
        super.onAttachedToLayoutParams(xk6Var);
        this.viewRef = null;
        this.viewDragHelper = null;
        this.sideContainerBackHelper = null;
    }

    @Override // defpackage.uk6
    public void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.viewRef = null;
        this.viewDragHelper = null;
        this.sideContainerBackHelper = null;
    }

    @Override // defpackage.uk6
    public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
        heu heuVar;
        if (!shouldInterceptTouchEvent(v)) {
            this.ignoreEvents = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            resetVelocity();
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.initialX = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.ignoreEvents) {
            this.ignoreEvents = false;
            return false;
        }
        return (this.ignoreEvents || (heuVar = this.viewDragHelper) == null || !heuVar.r(motionEvent)) ? false : true;
    }

    @Override // defpackage.uk6
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
        if (coordinatorLayout.getFitsSystemWindows() && !v.getFitsSystemWindows()) {
            v.setFitsSystemWindows(true);
        }
        if (this.viewRef == null) {
            this.viewRef = new WeakReference<>(v);
            this.sideContainerBackHelper = new pdh(v);
            a aVar = this.materialShapeDrawable;
            if (aVar != null) {
                v.setBackground(aVar);
                a aVar2 = this.materialShapeDrawable;
                float f = this.elevation;
                if (f == -1.0f) {
                    f = v.getElevation();
                }
                aVar2.q(f);
            } else {
                ColorStateList colorStateList = this.backgroundTint;
                if (colorStateList != null) {
                    WeakHashMap weakHashMap = wdu.a;
                    ndu.j(v, colorStateList);
                }
            }
            updateSheetVisibility(v);
            updateAccessibilityActions();
            if (v.getImportantForAccessibility() == 0) {
                v.setImportantForAccessibility(1);
            }
            ensureAccessibilityPaneTitleIsSet(v);
        }
        setSheetEdge(v, i);
        if (this.viewDragHelper == null) {
            this.viewDragHelper = new heu(coordinatorLayout.getContext(), coordinatorLayout, this.dragCallback);
        }
        int h = this.sheetDelegate.h(v);
        coordinatorLayout.B(i, v);
        this.parentWidth = coordinatorLayout.getWidth();
        this.parentInnerEdge = this.sheetDelegate.i(coordinatorLayout);
        this.childWidth = v.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        this.innerMargin = marginLayoutParams != null ? this.sheetDelegate.a(marginLayoutParams) : 0;
        int calculateCurrentOffset = calculateCurrentOffset(h, v);
        WeakHashMap weakHashMap2 = wdu.a;
        v.offsetLeftAndRight(calculateCurrentOffset);
        maybeAssignCoplanarSiblingViewBasedId(coordinatorLayout);
        Iterator<efq> it = this.callbacks.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                l1j.f();
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.uk6
    public boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        v.measure(getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, -1, marginLayoutParams.width), getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, -1, marginLayoutParams.height));
        return true;
    }

    @Override // defpackage.uk6
    public void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull Parcelable parcelable) {
        cfq cfqVar = (cfq) parcelable;
        Parcelable parcelable2 = cfqVar.a;
        if (parcelable2 != null) {
            super.onRestoreInstanceState(coordinatorLayout, v, parcelable2);
        }
        int i = cfqVar.c;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.state = i;
        this.lastStableState = i;
    }

    @Override // defpackage.uk6
    @NonNull
    public Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v) {
        return new cfq(super.onSaveInstanceState(coordinatorLayout, v), this);
    }

    @Override // defpackage.uk6
    public boolean onTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.state == 1 && actionMasked == 0) {
            return true;
        }
        if (shouldHandleDraggingWithHelper()) {
            this.viewDragHelper.k(motionEvent);
        }
        if (actionMasked == 0) {
            resetVelocity();
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(motionEvent);
        if (shouldHandleDraggingWithHelper() && actionMasked == 2 && !this.ignoreEvents && isDraggedFarEnough(motionEvent)) {
            this.viewDragHelper.b(motionEvent.getPointerId(motionEvent.getActionIndex()), v);
        }
        return !this.ignoreEvents;
    }

    public /* synthetic */ void removeCallback(@NonNull xbq xbqVar) {
        if (xbqVar == null) {
            removeCallback((efq) null);
        } else {
            l1j.f();
        }
    }

    public void setCoplanarSiblingView(View view) {
        this.coplanarSiblingViewId = -1;
        if (view == null) {
            clearCoplanarSiblingView();
            return;
        }
        this.coplanarSiblingViewRef = new WeakReference<>(view);
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference != null) {
            V v = weakReference.get();
            if (v.isLaidOut()) {
                v.requestLayout();
            }
        }
    }

    public void setCoplanarSiblingViewId(int i) {
        this.coplanarSiblingViewId = i;
        clearCoplanarSiblingView();
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference != null) {
            V v = weakReference.get();
            if (i == -1 || !v.isLaidOut()) {
                return;
            }
            v.requestLayout();
        }
    }

    public void setDraggable(boolean z) {
        this.draggable = z;
    }

    public void setHideFriction(float f) {
        this.hideFriction = f;
    }

    public void setState(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(su4.o(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || weakReference.get() == null) {
            setStateInternal(i);
        } else {
            runAfterLayout(this.viewRef.get(), new no0(this, i, 4));
        }
    }

    public void setStateInternal(int i) {
        V v;
        if (this.state == i) {
            return;
        }
        this.state = i;
        if (i == 3 || i == 5) {
            this.lastStableState = i;
        }
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        updateSheetVisibility(v);
        Iterator<efq> it = this.callbacks.iterator();
        if (it.hasNext()) {
            throw hrg.j(it);
        }
        updateAccessibilityActions();
    }

    public boolean shouldHide(@NonNull View view, float f) {
        return this.sheetDelegate.n(view, f);
    }

    public boolean shouldSkipSmoothAnimation() {
        return true;
    }

    @Override // defpackage.nch
    public void startBackProgress(@NonNull ri2 ri2Var) {
        pdh pdhVar = this.sideContainerBackHelper;
        if (pdhVar == null) {
            return;
        }
        pdhVar.f = ri2Var;
    }

    @Override // defpackage.nch
    public void updateBackProgress(@NonNull ri2 ri2Var) {
        pdh pdhVar = this.sideContainerBackHelper;
        if (pdhVar == null) {
            return;
        }
        int gravityFromSheetEdge = getGravityFromSheetEdge();
        if (((ri2) pdhVar.f) == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        ri2 ri2Var2 = (ri2) pdhVar.f;
        pdhVar.f = ri2Var;
        if (ri2Var2 != null) {
            pdhVar.f(ri2Var.c, gravityFromSheetEdge, ri2Var.d == 0);
        }
        updateCoplanarSiblingBackProgress();
    }

    public void addCallback(@NonNull efq efqVar) {
        this.callbacks.add(efqVar);
    }

    public void removeCallback(@NonNull efq efqVar) {
        this.callbacks.remove(efqVar);
    }

    private void setSheetEdge(@NonNull V v, int i) {
        setSheetEdge(Gravity.getAbsoluteGravity(((xk6) v.getLayoutParams()).c, i) == 3 ? 1 : 0);
    }

    public SideSheetBehavior() {
    }
}
