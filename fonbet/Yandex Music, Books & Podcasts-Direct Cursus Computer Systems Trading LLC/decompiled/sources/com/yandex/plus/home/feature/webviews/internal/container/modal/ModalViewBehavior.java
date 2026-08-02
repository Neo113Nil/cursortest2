package com.yandex.plus.home.feature.webviews.internal.container.modal;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.yandex.passport.data.network.l;
import defpackage.eup;
import defpackage.fxf;
import defpackage.hyf;
import defpackage.ivf;
import defpackage.k5r;
import defpackage.ndu;
import defpackage.qb;
import defpackage.uk6;
import defpackage.vdn;
import defpackage.wdu;
import defpackage.xk6;
import defpackage.xq0;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public class ModalViewBehavior<V extends View> extends uk6 {
    public static final int AUTO_CALCULATED_SETTLE_DURATION = -1;
    private static final int CORNER_ANIMATION_DURATION = 500;
    private static final int DEF_STYLE_RES = 2132018771;
    private static final float HIDE_FRICTION = 0.1f;
    private static final int NO_MAX_SIZE = -1;
    public static final int PEEK_HEIGHT_AUTO = -1;
    public static final int SAVE_ALL = -1;
    public static final int SAVE_FIT_TO_CONTENTS = 2;
    public static final int SAVE_HIDEABLE = 4;
    public static final int SAVE_NONE = 0;
    public static final int SAVE_PEEK_HEIGHT = 1;
    public static final int SAVE_SKIP_COLLAPSED = 8;
    private static final int SIGNIFICANT_VEL_THRESHOLD = 500;
    public static final int STATE_COLLAPSED = 4;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_EXPANDED = 3;
    public static final int STATE_HALF_EXPANDED = 6;
    public static final int STATE_HIDDEN = 5;
    public static final int STATE_SETTLING = 2;
    private static final String TAG = "BottomSheetBehavior";
    int activePointerId;

    @NonNull
    private final ArrayList<e> callbacks;
    private int childHeight;
    int collapsedOffset;
    private float downwardScrollFriction;
    private final j dragCallback;
    private boolean draggable;
    float elevation;
    int expandedOffset;
    private boolean fitToContents;
    int fitToContentsOffset;
    private int gestureInsetBottom;
    private boolean gestureInsetBottomIgnored;
    int halfExpandedOffset;
    float halfExpandedRatio;
    private float hideThreshold;
    boolean hideable;
    private boolean ignoreEvents;
    private Map<View, Integer> importantForAccessibilityMap;
    private int initialX;
    private int initialY;
    private ValueAnimator interpolatorAnimator;
    private boolean isScrollVertically;
    private boolean isShapeExpanded;
    private int lastNestedScrollDy;
    private com.google.android.material.shape.a materialShapeDrawable;
    private int maxHeight;
    private int maxWidth;
    private float maximumVelocity;
    private boolean nestedScrolled;
    WeakReference<View> nestedScrollingChildRef;
    int parentHeight;
    int parentWidth;
    private int peekHeight;
    private boolean peekHeightAuto;
    private int peekHeightGestureInsetBuffer;
    private int peekHeightMin;
    private int saveFlags;
    private int settleDurationOverride;
    private h settleRunnable;
    private eup shapeAppearanceModelDefault;
    private boolean shapeThemingEnabled;
    private boolean skipCollapsed;
    private int state;
    private int touchSlop;
    boolean touchingScrollingChild;
    private boolean updateImportantForAccessibilityOnSiblings;
    private VelocityTracker velocityTracker;
    k viewDragHelper;
    WeakReference<V> viewRef;

    public ModalViewBehavior(@NonNull Context context, AttributeSet attributeSet) {
        int i;
        this.saveFlags = 0;
        this.fitToContents = true;
        this.updateImportantForAccessibilityOnSiblings = false;
        this.maxWidth = -1;
        this.maxHeight = -1;
        this.settleRunnable = null;
        this.halfExpandedRatio = 0.5f;
        this.elevation = -1.0f;
        this.hideThreshold = 0.0f;
        this.downwardScrollFriction = 1.0f;
        this.settleDurationOverride = -1;
        this.draggable = true;
        this.state = 4;
        this.callbacks = new ArrayList<>();
        this.touchSlop = 0;
        this.isScrollVertically = false;
        this.dragCallback = new c(this);
        this.peekHeightGestureInsetBuffer = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vdn.f);
        this.shapeThemingEnabled = obtainStyledAttributes.hasValue(22);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        if (hasValue) {
            createMaterialShapeDrawable(context, attributeSet, hasValue, ivf.D(context, obtainStyledAttributes, 3));
        } else {
            createMaterialShapeDrawable(context, attributeSet, hasValue);
        }
        createShapeValueAnimator();
        this.elevation = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(0, -1));
        }
        if (obtainStyledAttributes.hasValue(1)) {
            setMaxHeight(obtainStyledAttributes.getDimensionPixelSize(1, -1));
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(10);
        if (peekValue == null || (i = peekValue.data) != -1) {
            setPeekHeight(obtainStyledAttributes.getDimensionPixelSize(10, -1));
        } else {
            setPeekHeight(i);
        }
        setHideable(obtainStyledAttributes.getBoolean(9, false));
        setGestureInsetBottomIgnored(obtainStyledAttributes.getBoolean(14, false));
        setFitToContents(obtainStyledAttributes.getBoolean(7, true));
        setSkipCollapsed(obtainStyledAttributes.getBoolean(13, false));
        setDraggable(obtainStyledAttributes.getBoolean(4, true));
        setSaveFlags(obtainStyledAttributes.getInt(11, 0));
        setHalfExpandedRatio(obtainStyledAttributes.getFloat(8, 0.5f));
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(6);
        if (peekValue2 == null || peekValue2.type != 16) {
            setExpandedOffset(obtainStyledAttributes.getDimensionPixelOffset(6, 0));
        } else {
            setExpandedOffset(peekValue2.data);
        }
        obtainStyledAttributes.recycle();
        this.maximumVelocity = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        this.touchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    private void addAccessibilityActionForState(V v, qb qbVar, int i) {
        wdu.o(v, qbVar, null, new d(this, i));
    }

    private void calculateCollapsedOffset() {
        int calculatePeekHeight = calculatePeekHeight();
        boolean z = this.fitToContents;
        int i = this.parentHeight;
        if (z) {
            this.collapsedOffset = Math.max(i - calculatePeekHeight, this.fitToContentsOffset);
        } else {
            this.collapsedOffset = i - calculatePeekHeight;
        }
    }

    private void calculateHalfExpandedOffset() {
        this.halfExpandedOffset = (int) ((1.0f - this.halfExpandedRatio) * this.parentHeight);
    }

    private int calculatePeekHeight() {
        int i;
        return this.peekHeightAuto ? Math.min(Math.max(this.peekHeightMin, this.parentHeight - ((this.parentWidth * 9) / 16)), this.childHeight) : (this.gestureInsetBottomIgnored || (i = this.gestureInsetBottom) <= 0) ? this.peekHeight : Math.max(this.peekHeight, i + this.peekHeightGestureInsetBuffer);
    }

    private void createMaterialShapeDrawable(@NonNull Context context, AttributeSet attributeSet, boolean z, ColorStateList colorStateList) {
        if (this.shapeThemingEnabled) {
            this.shapeAppearanceModelDefault = eup.c(context, attributeSet, R.attr.bottomSheetStyle, DEF_STYLE_RES).e();
            com.google.android.material.shape.a aVar = new com.google.android.material.shape.a(this.shapeAppearanceModelDefault);
            this.materialShapeDrawable = aVar;
            aVar.n(context);
            if (z && colorStateList != null) {
                this.materialShapeDrawable.r(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
            this.materialShapeDrawable.setTint(typedValue.data);
        }
    }

    private void createShapeValueAnimator() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.interpolatorAnimator = ofFloat;
        ofFloat.setDuration(500L);
        this.interpolatorAnimator.addUpdateListener(new b(this));
    }

    @NonNull
    public static <V extends View> ModalViewBehavior<V> from(@NonNull V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (!(layoutParams instanceof xk6)) {
            xq0.x("The view is not a child of CoordinatorLayout");
            return null;
        }
        uk6 uk6Var = ((xk6) layoutParams).a;
        if (uk6Var instanceof ModalViewBehavior) {
            return (ModalViewBehavior) uk6Var;
        }
        xq0.x("The view is not associated with BottomSheetBehavior");
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

    private float getYVelocity() {
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.maximumVelocity);
        return this.velocityTracker.getYVelocity(this.activePointerId);
    }

    private void reset() {
        this.activePointerId = -1;
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.velocityTracker = null;
        }
    }

    private void restoreOptionalState(@NonNull g gVar) {
        int i = this.saveFlags;
        if (i == 0) {
            return;
        }
        if (i == -1 || (i & 1) == 1) {
            this.peekHeight = gVar.d;
        }
        if (i == -1 || (i & 2) == 2) {
            this.fitToContents = gVar.e;
        }
        if (i == -1 || (i & 4) == 4) {
            this.hideable = gVar.f;
        }
        if (i == -1 || (i & 8) == 8) {
            this.skipCollapsed = gVar.g;
        }
    }

    private void setSystemGestureInsets(@NonNull View view) {
        if (Build.VERSION.SDK_INT < 29 || isGestureInsetBottomIgnored() || this.peekHeightAuto) {
            return;
        }
        fxf.w(view, new l(this));
    }

    private void settleToStatePendingLayout(int i) {
        V v = this.viewRef.get();
        if (v == null) {
            return;
        }
        ViewParent parent = v.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = wdu.a;
            if (v.isAttachedToWindow()) {
                v.post(new a(this, v, i));
                return;
            }
        }
        settleToState(v, i);
    }

    private boolean shouldHandleDraggingWithHelper() {
        if (this.viewDragHelper != null) {
            return this.draggable || this.state == 1;
        }
        return false;
    }

    private void updateAccessibilityActions() {
        V v;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        wdu.n(524288, v);
        wdu.k(0, v);
        wdu.n(SQLiteDatabase.OPEN_PRIVATECACHE, v);
        wdu.k(0, v);
        wdu.n(1048576, v);
        wdu.k(0, v);
        if (this.hideable && this.state != 5) {
            addAccessibilityActionForState(v, qb.m, 5);
        }
        int i = this.state;
        if (i == 3) {
            addAccessibilityActionForState(v, qb.l, this.fitToContents ? 4 : 6);
            return;
        }
        if (i == 4) {
            addAccessibilityActionForState(v, qb.k, this.fitToContents ? 3 : 6);
        } else {
            if (i != 6) {
                return;
            }
            addAccessibilityActionForState(v, qb.l, 4);
            addAccessibilityActionForState(v, qb.k, 3);
        }
    }

    private void updateDrawableForTargetState(int i) {
        ValueAnimator valueAnimator;
        if (i == 2) {
            return;
        }
        boolean z = i == 3;
        if (this.isShapeExpanded != z) {
            this.isShapeExpanded = z;
            if (this.materialShapeDrawable == null || (valueAnimator = this.interpolatorAnimator) == null) {
                return;
            }
            if (valueAnimator.isRunning()) {
                this.interpolatorAnimator.reverse();
                return;
            }
            float f = z ? 0.0f : 1.0f;
            this.interpolatorAnimator.setFloatValues(1.0f - f, f);
            this.interpolatorAnimator.start();
        }
    }

    private void updateImportantForAccessibility(boolean z) {
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
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
                            WeakHashMap weakHashMap = wdu.a;
                            childAt.setImportantForAccessibility(4);
                        }
                    } else if (this.updateImportantForAccessibilityOnSiblings && (map = this.importantForAccessibilityMap) != null && map.containsKey(childAt)) {
                        int intValue = this.importantForAccessibilityMap.get(childAt).intValue();
                        WeakHashMap weakHashMap2 = wdu.a;
                        childAt.setImportantForAccessibility(intValue);
                    }
                }
            }
            if (z) {
                return;
            }
            this.importantForAccessibilityMap = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePeekHeight(boolean z) {
        V v;
        if (this.viewRef != null) {
            calculateCollapsedOffset();
            if (this.state != 4 || (v = this.viewRef.get()) == null) {
                return;
            }
            if (z) {
                settleToStatePendingLayout(this.state);
            } else {
                v.requestLayout();
            }
        }
    }

    public void addBottomSheetCallback(@NonNull e eVar) {
        if (this.callbacks.contains(eVar)) {
            return;
        }
        this.callbacks.add(eVar);
    }

    public void disableShapeAnimations() {
        this.interpolatorAnimator = null;
    }

    public void dispatchOnSlide(int i) {
        if (this.viewRef.get() == null || this.callbacks.isEmpty()) {
            return;
        }
        int i2 = this.collapsedOffset;
        if (i <= i2 && i2 != getExpandedOffset()) {
            getExpandedOffset();
        }
        for (int i3 = 0; i3 < this.callbacks.size(); i3++) {
            this.callbacks.get(i3).getClass();
        }
    }

    public View findScrollingChild(View view) {
        WeakHashMap weakHashMap = wdu.a;
        if (ndu.i(view)) {
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

    public float getDownwardScrollFriction() {
        return this.downwardScrollFriction;
    }

    public int getExpandedOffset() {
        return this.fitToContents ? this.fitToContentsOffset : this.expandedOffset;
    }

    public float getHalfExpandedRatio() {
        return this.halfExpandedRatio;
    }

    public float getHideThreshold() {
        return this.hideThreshold;
    }

    public int getMaxHeight() {
        return this.maxHeight;
    }

    public int getMaxWidth() {
        return this.maxWidth;
    }

    public int getPeekHeight() {
        if (this.peekHeightAuto) {
            return -1;
        }
        return this.peekHeight;
    }

    public int getPeekHeightMin() {
        return this.peekHeightMin;
    }

    public int getSaveFlags() {
        return this.saveFlags;
    }

    public int getSettleDurationOverride() {
        return this.settleDurationOverride;
    }

    public boolean getSkipCollapsed() {
        return this.skipCollapsed;
    }

    public int getState() {
        return this.state;
    }

    public boolean isDraggable() {
        return this.draggable;
    }

    public boolean isFitToContents() {
        return this.fitToContents;
    }

    public boolean isGestureInsetBottomIgnored() {
        return this.gestureInsetBottomIgnored;
    }

    public boolean isHideable() {
        return this.hideable;
    }

    @Override // defpackage.uk6
    public void onAttachedToLayoutParams(@NonNull xk6 xk6Var) {
        super.onAttachedToLayoutParams(xk6Var);
        this.viewRef = null;
        this.viewDragHelper = null;
    }

    @Override // defpackage.uk6
    public void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.viewRef = null;
        this.viewDragHelper = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
    
        if (r3 != 3) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x020b A[EDGE_INSN: B:91:0x020b->B:82:0x020b BREAK  A[LOOP:0: B:54:0x0135->B:59:0x0202], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01c7  */
    @Override // defpackage.uk6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
        k kVar;
        boolean z;
        float f;
        int i;
        View f2;
        boolean z2 = false;
        boolean z3 = true;
        if (!v.isShown() || !this.draggable) {
            this.ignoreEvents = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            reset();
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    float abs = Math.abs(this.initialX - motionEvent.getX());
                    float abs2 = Math.abs(this.initialY - motionEvent.getY());
                    this.isScrollVertically = abs2 > abs && abs2 > ((float) this.touchSlop);
                }
            }
            this.touchingScrollingChild = false;
            this.activePointerId = -1;
            if (this.ignoreEvents) {
                this.ignoreEvents = false;
                return false;
            }
            this.isScrollVertically = false;
        } else {
            this.initialX = (int) motionEvent.getX();
            this.initialY = (int) motionEvent.getY();
            if (this.state != 2) {
                WeakReference<View> weakReference = this.nestedScrollingChildRef;
                View view = weakReference != null ? weakReference.get() : null;
                if (view != null && coordinatorLayout.z(view, this.initialX, this.initialY)) {
                    this.activePointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.touchingScrollingChild = true;
                }
            }
            this.ignoreEvents = this.activePointerId == -1 && !coordinatorLayout.z(v, this.initialX, this.initialY);
        }
        if (!this.ignoreEvents && (kVar = this.viewDragHelper) != null) {
            j jVar = kVar.r;
            int actionMasked2 = motionEvent.getActionMasked();
            int actionIndex = motionEvent.getActionIndex();
            if (actionMasked2 == 0) {
                kVar.a();
            }
            if (kVar.m == null) {
                kVar.m = VelocityTracker.obtain();
            }
            kVar.m.addMovement(motionEvent);
            if (actionMasked2 != 0) {
                if (actionMasked2 != 1) {
                    if (actionMasked2 != 2) {
                        if (actionMasked2 != 3) {
                            if (actionMasked2 == 5) {
                                int pointerId = motionEvent.getPointerId(actionIndex);
                                float x = motionEvent.getX(actionIndex);
                                float y = motionEvent.getY(actionIndex);
                                kVar.j(x, y, pointerId);
                                int i2 = kVar.b;
                                if (i2 == 0) {
                                    int i3 = kVar.i[pointerId];
                                } else if (i2 == 2 && (f2 = kVar.f((int) x, (int) y)) == kVar.s) {
                                    kVar.m(pointerId, f2);
                                }
                            } else if (actionMasked2 == 6) {
                                kVar.c(motionEvent.getPointerId(actionIndex));
                            }
                        }
                    } else if (kVar.e != null && kVar.f != null) {
                        int pointerCount = motionEvent.getPointerCount();
                        int i4 = 0;
                        while (i4 < pointerCount) {
                            int pointerId2 = motionEvent.getPointerId(i4);
                            if (kVar.h(pointerId2)) {
                                float x2 = motionEvent.getX(i4);
                                float y2 = motionEvent.getY(i4);
                                float f3 = x2 - kVar.e[pointerId2];
                                float f4 = y2 - kVar.f[pointerId2];
                                View f5 = kVar.f((int) x2, (int) y2);
                                if (f5 != null) {
                                    jVar.getClass();
                                    ModalViewBehavior modalViewBehavior = ((c) jVar).a;
                                    if (((modalViewBehavior.hideable ? modalViewBehavior.parentHeight : modalViewBehavior.collapsedOffset) <= 0 || Math.abs(f4) <= ((float) kVar.c)) ? z2 : z3) {
                                        z = z3;
                                        if (!z) {
                                            f5.getLeft();
                                            c cVar = (c) jVar;
                                            cVar.getClass();
                                            f5.getLeft();
                                            int top = f5.getTop();
                                            int i5 = ((int) f4) + top;
                                            ModalViewBehavior modalViewBehavior2 = cVar.a;
                                            f = f4;
                                            i = pointerCount;
                                            int y3 = hyf.y(i5, modalViewBehavior2.getExpandedOffset(), modalViewBehavior2.hideable ? modalViewBehavior2.parentHeight : modalViewBehavior2.collapsedOffset);
                                            ModalViewBehavior modalViewBehavior3 = ((c) jVar).a;
                                            int i6 = modalViewBehavior3.hideable ? modalViewBehavior3.parentHeight : modalViewBehavior3.collapsedOffset;
                                            if (i6 != 0) {
                                                if (i6 > 0 && y3 == top) {
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                        } else {
                                            f = f4;
                                            i = pointerCount;
                                        }
                                        Math.abs(f3);
                                        Math.abs(f);
                                        int i7 = kVar.i[pointerId2];
                                        Math.abs(f);
                                        Math.abs(f3);
                                        int i8 = kVar.i[pointerId2];
                                        Math.abs(f3);
                                        Math.abs(f);
                                        int i9 = kVar.i[pointerId2];
                                        Math.abs(f);
                                        Math.abs(f3);
                                        int i10 = kVar.i[pointerId2];
                                        if (kVar.b == 1) {
                                            break;
                                        }
                                        if (z && kVar.m(pointerId2, f5)) {
                                            break;
                                        }
                                    }
                                }
                                z = z2;
                                if (!z) {
                                }
                                Math.abs(f3);
                                Math.abs(f);
                                int i72 = kVar.i[pointerId2];
                                Math.abs(f);
                                Math.abs(f3);
                                int i82 = kVar.i[pointerId2];
                                Math.abs(f3);
                                Math.abs(f);
                                int i92 = kVar.i[pointerId2];
                                Math.abs(f);
                                Math.abs(f3);
                                int i102 = kVar.i[pointerId2];
                                if (kVar.b == 1) {
                                }
                            } else {
                                i = pointerCount;
                            }
                            i4++;
                            pointerCount = i;
                            z2 = false;
                            z3 = true;
                        }
                        kVar.k(motionEvent);
                    }
                }
                kVar.a();
            } else {
                float x3 = motionEvent.getX();
                float y4 = motionEvent.getY();
                int pointerId3 = motionEvent.getPointerId(0);
                kVar.j(x3, y4, pointerId3);
                View f6 = kVar.f((int) x3, (int) y4);
                if (f6 == kVar.s && kVar.b == 2) {
                    kVar.m(pointerId3, f6);
                }
                int i11 = kVar.i[pointerId3];
            }
            if (kVar.b == 1 && this.isScrollVertically) {
                return true;
            }
        }
        WeakReference<View> weakReference2 = this.nestedScrollingChildRef;
        View view2 = weakReference2 != null ? weakReference2.get() : null;
        return (actionMasked != 2 || view2 == null || this.ignoreEvents || this.state == 1 || coordinatorLayout.z(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.viewDragHelper == null || !this.isScrollVertically || Math.abs(((float) this.initialY) - motionEvent.getY()) <= ((float) this.viewDragHelper.c)) ? false : true;
    }

    @Override // defpackage.uk6
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
        com.google.android.material.shape.a aVar;
        WeakHashMap weakHashMap = wdu.a;
        if (coordinatorLayout.getFitsSystemWindows() && !v.getFitsSystemWindows()) {
            v.setFitsSystemWindows(true);
        }
        if (this.viewRef == null) {
            this.peekHeightMin = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            setSystemGestureInsets(v);
            this.viewRef = new WeakReference<>(v);
            if (this.shapeThemingEnabled && (aVar = this.materialShapeDrawable) != null) {
                v.setBackground(aVar);
            }
            com.google.android.material.shape.a aVar2 = this.materialShapeDrawable;
            if (aVar2 != null) {
                float f = this.elevation;
                if (f == -1.0f) {
                    f = ndu.f(v);
                }
                aVar2.q(f);
                boolean z = this.state == 3;
                this.isShapeExpanded = z;
                this.materialShapeDrawable.s(z ? 0.0f : 1.0f);
            }
            updateAccessibilityActions();
            if (v.getImportantForAccessibility() == 0) {
                v.setImportantForAccessibility(1);
            }
        }
        if (this.viewDragHelper == null) {
            this.viewDragHelper = new k(coordinatorLayout.getContext(), coordinatorLayout, this.dragCallback);
        }
        k kVar = this.viewDragHelper;
        int i2 = this.settleDurationOverride;
        kVar.getClass();
        if (i2 < 0) {
            i2 = -1;
        }
        kVar.a = i2;
        int top = v.getTop();
        coordinatorLayout.B(i, v);
        this.parentWidth = coordinatorLayout.getWidth();
        this.parentHeight = coordinatorLayout.getHeight();
        int height = v.getHeight();
        this.childHeight = height;
        int i3 = this.parentHeight;
        if (i3 <= height) {
            int i4 = this.maxHeight;
            if (i4 != -1) {
                i3 = Math.min(i3, i4);
            }
            this.childHeight = i3;
        }
        this.fitToContentsOffset = Math.max(0, this.parentHeight - this.childHeight);
        calculateHalfExpandedOffset();
        calculateCollapsedOffset();
        int i5 = this.state;
        if (i5 == 3) {
            v.offsetTopAndBottom(getExpandedOffset());
        } else if (i5 == 6) {
            v.offsetTopAndBottom(this.halfExpandedOffset);
        } else if (this.hideable && i5 == 5) {
            v.offsetTopAndBottom(this.parentHeight);
        } else if (i5 == 4) {
            v.offsetTopAndBottom(this.collapsedOffset);
        } else if (i5 == 1 || i5 == 2) {
            v.offsetTopAndBottom(top - v.getTop());
        }
        this.nestedScrollingChildRef = new WeakReference<>(findScrollingChild(v));
        return true;
    }

    @Override // defpackage.uk6
    public boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        v.measure(getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.maxWidth, marginLayoutParams.width), getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, this.maxHeight, marginLayoutParams.height));
        return true;
    }

    @Override // defpackage.uk6
    public boolean onNestedPreFling(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, float f, float f2) {
        WeakReference<View> weakReference = this.nestedScrollingChildRef;
        return weakReference != null && view == weakReference.get() && (this.state != 3 || super.onNestedPreFling(coordinatorLayout, v, view, f, f2));
    }

    @Override // defpackage.uk6
    public void onNestedPreScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, @NonNull int[] iArr, int i3) {
        if (i3 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.nestedScrollingChildRef;
        if (view != (weakReference != null ? weakReference.get() : null)) {
            return;
        }
        int top = v.getTop();
        int i4 = top - i2;
        if (i2 > 0) {
            if (i4 < getExpandedOffset()) {
                int expandedOffset = top - getExpandedOffset();
                iArr[1] = expandedOffset;
                int i5 = -expandedOffset;
                WeakHashMap weakHashMap = wdu.a;
                v.offsetTopAndBottom(i5);
                setStateInternal(3);
            } else {
                if (!this.draggable) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap weakHashMap2 = wdu.a;
                v.offsetTopAndBottom(-i2);
                setStateInternal(1);
            }
        } else if (i2 < 0 && !view.canScrollVertically(-1)) {
            int i6 = this.collapsedOffset;
            if (i4 > i6 && !this.hideable) {
                int i7 = top - i6;
                iArr[1] = i7;
                int i8 = -i7;
                WeakHashMap weakHashMap3 = wdu.a;
                v.offsetTopAndBottom(i8);
                setStateInternal(4);
            } else {
                if (!this.draggable) {
                    return;
                }
                int round = Math.round(i2 * this.downwardScrollFriction);
                iArr[1] = round;
                WeakHashMap weakHashMap4 = wdu.a;
                v.offsetTopAndBottom(-round);
                setStateInternal(1);
            }
        }
        dispatchOnSlide(v.getTop());
        this.lastNestedScrollDy = i2;
        this.nestedScrolled = true;
    }

    @Override // defpackage.uk6
    public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, int i3, int i4, int i5, @NonNull int[] iArr) {
    }

    @Override // defpackage.uk6
    public void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull Parcelable parcelable) {
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, v, gVar.a);
        restoreOptionalState(gVar);
        int i = gVar.c;
        if (i == 1 || i == 2) {
            this.state = 4;
        } else {
            this.state = i;
        }
    }

    @Override // defpackage.uk6
    @NonNull
    public Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v) {
        return new g(super.onSaveInstanceState(coordinatorLayout, v), this);
    }

    @Override // defpackage.uk6
    public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i, int i2) {
        this.lastNestedScrollDy = 0;
        this.nestedScrolled = false;
        return (i & 2) != 0;
    }

    @Override // defpackage.uk6
    public void onStopNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i) {
        int i2;
        int i3 = 3;
        if (v.getTop() == getExpandedOffset()) {
            setStateInternal(3);
            return;
        }
        WeakReference<View> weakReference = this.nestedScrollingChildRef;
        if (weakReference != null && view == weakReference.get() && this.nestedScrolled) {
            if (this.lastNestedScrollDy > 0) {
                if (this.fitToContents) {
                    i2 = this.fitToContentsOffset;
                } else {
                    int top = v.getTop();
                    int i4 = this.halfExpandedOffset;
                    if (top > i4) {
                        i3 = 6;
                        i2 = i4;
                    } else {
                        i2 = this.expandedOffset;
                    }
                }
            } else if (this.hideable && shouldHide(v, getYVelocity())) {
                i2 = this.parentHeight;
                i3 = 5;
            } else if (this.lastNestedScrollDy == 0) {
                int top2 = v.getTop();
                if (!this.fitToContents) {
                    int i5 = this.halfExpandedOffset;
                    if (top2 < i5) {
                        if (top2 < Math.abs(top2 - this.collapsedOffset)) {
                            i2 = this.expandedOffset;
                        } else {
                            i2 = this.halfExpandedOffset;
                        }
                    } else if (Math.abs(top2 - i5) < Math.abs(top2 - this.collapsedOffset)) {
                        i2 = this.halfExpandedOffset;
                    } else {
                        i2 = this.collapsedOffset;
                        i3 = 4;
                    }
                    i3 = 6;
                } else if (Math.abs(top2 - this.fitToContentsOffset) < Math.abs(top2 - this.collapsedOffset)) {
                    i2 = this.fitToContentsOffset;
                } else {
                    i2 = this.collapsedOffset;
                    i3 = 4;
                }
            } else {
                if (this.fitToContents) {
                    i2 = this.collapsedOffset;
                } else {
                    int top3 = v.getTop();
                    if (Math.abs(top3 - this.halfExpandedOffset) < Math.abs(top3 - this.collapsedOffset)) {
                        i2 = this.halfExpandedOffset;
                        i3 = 6;
                    } else {
                        i2 = this.collapsedOffset;
                    }
                }
                i3 = 4;
            }
            startSettlingAnimation(v, i3, i2, false);
            this.nestedScrolled = false;
        }
    }

    @Override // defpackage.uk6
    public boolean onTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
        boolean z;
        int i;
        int i2 = 0;
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.state == 1 && actionMasked == 0) {
            return true;
        }
        if (shouldHandleDraggingWithHelper()) {
            k kVar = this.viewDragHelper;
            kVar.getClass();
            j jVar = kVar.r;
            int actionMasked2 = motionEvent.getActionMasked();
            int actionIndex = motionEvent.getActionIndex();
            if (actionMasked2 == 0) {
                kVar.a();
            }
            if (kVar.m == null) {
                kVar.m = VelocityTracker.obtain();
            }
            kVar.m.addMovement(motionEvent);
            if (actionMasked2 == 0) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                int pointerId = motionEvent.getPointerId(0);
                View f = kVar.f((int) x, (int) y);
                kVar.j(x, y, pointerId);
                kVar.m(pointerId, f);
                int i3 = kVar.i[pointerId];
            } else if (actionMasked2 == 1) {
                if (kVar.b == 1) {
                    kVar.i();
                }
                kVar.a();
            } else if (actionMasked2 != 2) {
                if (actionMasked2 == 3) {
                    if (kVar.b == 1) {
                        kVar.e(0.0f, 0.0f);
                    }
                    kVar.a();
                } else if (actionMasked2 == 5) {
                    int pointerId2 = motionEvent.getPointerId(actionIndex);
                    float x2 = motionEvent.getX(actionIndex);
                    float y2 = motionEvent.getY(actionIndex);
                    kVar.j(x2, y2, pointerId2);
                    if (kVar.b == 0) {
                        kVar.m(pointerId2, kVar.f((int) x2, (int) y2));
                        int i4 = kVar.i[pointerId2];
                    } else {
                        int i5 = (int) x2;
                        int i6 = (int) y2;
                        View view = kVar.s;
                        if (view != null && i5 >= view.getLeft() && i5 < view.getRight() && i6 >= view.getTop() && i6 < view.getBottom()) {
                            i2 = 1;
                        }
                        if (i2 != 0) {
                            kVar.m(pointerId2, kVar.s);
                        }
                    }
                } else if (actionMasked2 == 6) {
                    int pointerId3 = motionEvent.getPointerId(actionIndex);
                    if (kVar.b == 1 && pointerId3 == kVar.d) {
                        int pointerCount = motionEvent.getPointerCount();
                        while (true) {
                            if (i2 >= pointerCount) {
                                i = -1;
                                break;
                            }
                            int pointerId4 = motionEvent.getPointerId(i2);
                            if (pointerId4 != kVar.d) {
                                View f2 = kVar.f((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                                View view2 = kVar.s;
                                if (f2 == view2 && kVar.m(pointerId4, view2)) {
                                    i = kVar.d;
                                    break;
                                }
                            }
                            i2++;
                        }
                        if (i == -1) {
                            kVar.i();
                        }
                    }
                    kVar.c(pointerId3);
                }
            } else if (kVar.b != 1) {
                int pointerCount2 = motionEvent.getPointerCount();
                for (int i7 = 0; i7 < pointerCount2; i7++) {
                    int pointerId5 = motionEvent.getPointerId(i7);
                    if (kVar.h(pointerId5)) {
                        float x3 = motionEvent.getX(i7);
                        float y3 = motionEvent.getY(i7);
                        float f3 = x3 - kVar.e[pointerId5];
                        float f4 = y3 - kVar.f[pointerId5];
                        Math.abs(f3);
                        Math.abs(f4);
                        int i8 = kVar.i[pointerId5];
                        Math.abs(f4);
                        Math.abs(f3);
                        int i9 = kVar.i[pointerId5];
                        Math.abs(f3);
                        Math.abs(f4);
                        int i10 = kVar.i[pointerId5];
                        Math.abs(f4);
                        Math.abs(f3);
                        int i11 = kVar.i[pointerId5];
                        if (kVar.b == 1) {
                            break;
                        }
                        View f5 = kVar.f((int) x3, (int) y3);
                        if (f5 != null) {
                            jVar.getClass();
                            ModalViewBehavior modalViewBehavior = ((c) jVar).a;
                            if ((modalViewBehavior.hideable ? modalViewBehavior.parentHeight : modalViewBehavior.collapsedOffset) > 0 && Math.abs(f4) > kVar.c) {
                                z = true;
                                if (z && kVar.m(pointerId5, f5)) {
                                    break;
                                }
                            }
                        }
                        z = false;
                        if (z) {
                            break;
                            break;
                        }
                        continue;
                    }
                }
                kVar.k(motionEvent);
            } else if (kVar.h(kVar.d)) {
                int findPointerIndex = motionEvent.findPointerIndex(kVar.d);
                float x4 = motionEvent.getX(findPointerIndex);
                float y4 = motionEvent.getY(findPointerIndex);
                float[] fArr = kVar.g;
                int i12 = kVar.d;
                int i13 = (int) (x4 - fArr[i12]);
                int i14 = (int) (y4 - kVar.h[i12]);
                kVar.s.getLeft();
                int top = kVar.s.getTop() + i14;
                int left = kVar.s.getLeft();
                int top2 = kVar.s.getTop();
                if (i13 != 0) {
                    View view3 = kVar.s;
                    ((c) jVar).getClass();
                    int left2 = view3.getLeft();
                    View view4 = kVar.s;
                    int i15 = left2 - left;
                    WeakHashMap weakHashMap = wdu.a;
                    view4.offsetLeftAndRight(i15);
                }
                if (i14 != 0) {
                    ModalViewBehavior modalViewBehavior2 = ((c) jVar).a;
                    top = hyf.y(top, modalViewBehavior2.getExpandedOffset(), modalViewBehavior2.hideable ? modalViewBehavior2.parentHeight : modalViewBehavior2.collapsedOffset);
                    WeakHashMap weakHashMap2 = wdu.a;
                    kVar.s.offsetTopAndBottom(top - top2);
                }
                if (i13 != 0 || i14 != 0) {
                    ((c) jVar).a.dispatchOnSlide(top);
                }
                kVar.k(motionEvent);
            }
        }
        if (actionMasked == 0) {
            reset();
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(motionEvent);
        if (shouldHandleDraggingWithHelper() && actionMasked == 2 && !this.ignoreEvents) {
            float abs = Math.abs(this.initialY - motionEvent.getY());
            k kVar2 = this.viewDragHelper;
            if (abs > kVar2.c) {
                kVar2.b(motionEvent.getPointerId(motionEvent.getActionIndex()), v);
            }
        }
        return !this.ignoreEvents;
    }

    public void removeBottomSheetCallback(@NonNull e eVar) {
        this.callbacks.remove(eVar);
    }

    @Deprecated
    public void setBottomSheetCallback(e eVar) {
        Log.w(TAG, "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
        this.callbacks.clear();
        if (eVar != null) {
            this.callbacks.add(eVar);
        }
    }

    public void setDownwardScrollFriction(float f) {
        this.downwardScrollFriction = f;
    }

    public void setDraggable(boolean z) {
        this.draggable = z;
    }

    public void setExpandedOffset(int i) {
        if (i >= 0) {
            this.expandedOffset = i;
        } else {
            xq0.x("offset must be greater than or equal to 0");
        }
    }

    public void setFitToContents(boolean z) {
        if (this.fitToContents == z) {
            return;
        }
        this.fitToContents = z;
        if (this.viewRef != null) {
            calculateCollapsedOffset();
        }
        setStateInternal((this.fitToContents && this.state == 6) ? 3 : this.state);
        updateAccessibilityActions();
    }

    public void setGestureInsetBottomIgnored(boolean z) {
        this.gestureInsetBottomIgnored = z;
    }

    public void setHalfExpandedRatio(float f) {
        if (f <= 0.0f || f >= 1.0f) {
            xq0.x("ratio must be a float value between 0 and 1");
            return;
        }
        this.halfExpandedRatio = f;
        if (this.viewRef != null) {
            calculateHalfExpandedOffset();
        }
    }

    public void setHideThreshold(float f) {
        this.hideThreshold = f;
    }

    public void setHideable(boolean z) {
        if (this.hideable != z) {
            this.hideable = z;
            if (!z && this.state == 5) {
                setState(4);
            }
            updateAccessibilityActions();
        }
    }

    public void setMaxHeight(int i) {
        this.maxHeight = i;
    }

    public void setMaxWidth(int i) {
        this.maxWidth = i;
    }

    public final void setPeekHeight(int i, boolean z) {
        boolean z2 = this.peekHeightAuto;
        if (i == -1) {
            if (z2) {
                return;
            } else {
                this.peekHeightAuto = true;
            }
        } else {
            if (!z2 && this.peekHeight == i) {
                return;
            }
            this.peekHeightAuto = false;
            this.peekHeight = Math.max(0, i);
        }
        updatePeekHeight(z);
    }

    public void setSaveFlags(int i) {
        this.saveFlags = i;
    }

    public void setSettleDurationOverride(int i) {
        this.settleDurationOverride = i;
    }

    public void setSkipCollapsed(boolean z) {
        this.skipCollapsed = z;
    }

    public void setState(int i) {
        if (i == this.state) {
            return;
        }
        if (this.viewRef != null) {
            settleToStatePendingLayout(i);
            return;
        }
        if (i == 4 || i == 3 || i == 6 || (this.hideable && i == 5)) {
            this.state = i;
        }
    }

    public void setStateInternal(int i) {
        if (this.state == i) {
            return;
        }
        this.state = i;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        if (i == 3) {
            updateImportantForAccessibility(true);
        } else if (i == 6 || i == 5 || i == 4) {
            updateImportantForAccessibility(false);
        }
        updateDrawableForTargetState(i);
        for (int i2 = 0; i2 < this.callbacks.size(); i2++) {
            com.yandex.plus.home.feature.webviews.internal.container.g gVar = ((com.yandex.plus.home.feature.webviews.internal.container.e) this.callbacks.get(i2)).a;
            com.yandex.plus.home.feature.webviews.internal.container.c cVar = gVar.y;
            switch (i) {
                case 1:
                    cVar.r();
                    break;
                case 2:
                    cVar.r();
                    break;
                case 3:
                    cVar.t();
                    break;
                case 4:
                case 6:
                    gVar.C.setState(3);
                    break;
                case 5:
                    cVar.r();
                    gVar.z.invoke();
                    break;
            }
        }
        updateAccessibilityActions();
    }

    public void setUpdateImportantForAccessibilityOnSiblings(boolean z) {
        this.updateImportantForAccessibilityOnSiblings = z;
    }

    public void settleToState(@NonNull View view, int i) {
        int i2;
        int i3;
        if (i == 4) {
            i2 = this.collapsedOffset;
        } else if (i == 6) {
            i2 = this.halfExpandedOffset;
            if (this.fitToContents && i2 <= (i3 = this.fitToContentsOffset)) {
                i = 3;
                i2 = i3;
            }
        } else if (i == 3) {
            i2 = getExpandedOffset();
        } else {
            if (!this.hideable || i != 5) {
                xq0.x(k5r.i(i, "Illegal state argument: "));
                return;
            }
            i2 = this.parentHeight;
        }
        startSettlingAnimation(view, i, i2, false);
    }

    public boolean shouldHide(@NonNull View view, float f) {
        if ((f * HIDE_FRICTION) + view.getTop() > (view.getHeight() * this.hideThreshold) + this.expandedOffset) {
            return this.skipCollapsed || view.getTop() > this.collapsedOffset;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0055, code lost:
    
        r4.settleRunnable = new com.yandex.plus.home.feature.webviews.internal.container.modal.h(r4, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x005c, code lost:
    
        r7 = r4.settleRunnable;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0060, code lost:
    
        if (r7.b != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0062, code lost:
    
        r7.c = r6;
        r6 = defpackage.wdu.a;
        r5.postOnAnimation(r7);
        r4.settleRunnable.b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006f, code lost:
    
        r7.c = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0071, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0048, code lost:
    
        if (r7 != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
    
        if (r0.g(r8, r7, (int) r0.m.getXVelocity(r0.d), (int) r0.m.getYVelocity(r0.d)) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004a, code lost:
    
        setStateInternal(2);
        updateDrawableForTargetState(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0053, code lost:
    
        if (r4.settleRunnable != null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void startSettlingAnimation(View view, int i, int i2, boolean z) {
        k kVar = this.viewDragHelper;
        if (kVar != null) {
            if (z) {
                int left = view.getLeft();
                if (!kVar.t) {
                    xq0.q("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
                    return;
                }
            } else {
                int left2 = view.getLeft();
                kVar.s = view;
                kVar.d = -1;
                boolean g = kVar.g(left2, i2, 0, 0);
                if (!g && kVar.b == 0 && kVar.s != null) {
                    kVar.s = null;
                }
            }
        }
        setStateInternal(i);
    }

    public void setPeekHeight(int i) {
        setPeekHeight(i, false);
    }

    private void createMaterialShapeDrawable(@NonNull Context context, AttributeSet attributeSet, boolean z) {
        createMaterialShapeDrawable(context, attributeSet, z, null);
    }

    public ModalViewBehavior() {
        this.saveFlags = 0;
        this.fitToContents = true;
        this.updateImportantForAccessibilityOnSiblings = false;
        this.maxWidth = -1;
        this.maxHeight = -1;
        this.settleRunnable = null;
        this.halfExpandedRatio = 0.5f;
        this.elevation = -1.0f;
        this.hideThreshold = 0.0f;
        this.downwardScrollFriction = 1.0f;
        this.settleDurationOverride = -1;
        this.draggable = true;
        this.state = 4;
        this.callbacks = new ArrayList<>();
        this.touchSlop = 0;
        this.isScrollVertically = false;
        this.dragCallback = new c(this);
    }
}
