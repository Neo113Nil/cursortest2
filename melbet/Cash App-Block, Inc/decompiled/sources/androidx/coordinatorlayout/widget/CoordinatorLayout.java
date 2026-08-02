package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.camera.view.PreviewView;
import androidx.collection.SimpleArrayMap;
import androidx.coordinatorlayout.R$styleable;
import androidx.core.util.Pools$SimplePool;
import androidx.core.util.Pools$SynchronizedPool;
import androidx.core.view.NestedScrollingParent2;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bumptech.glide.request.SingleRequest;
import com.bumptech.glide.request.target.ViewTarget$SizeDeterminer;
import com.fillr.n;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public class CoordinatorLayout extends ViewGroup implements NestedScrollingParent2, NestedScrollingParent3 {
    public static final Class[] CONSTRUCTOR_PARAMS;
    public static final ViewPager.AnonymousClass1 TOP_SORTED_CHILDREN_COMPARATOR;
    public static final String WIDGET_PACKAGE_NAME;
    public static final ThreadLocal sConstructors;
    public static final Pools$SynchronizedPool sRectPool;
    public PreviewView.AnonymousClass1 mApplyWindowInsetsListener;
    public final int[] mBehaviorConsumed;
    public View mBehaviorTouchView;
    public final n mChildDag;
    public final ArrayList mDependencySortedChildren;
    public boolean mDisallowInterceptReset;
    public boolean mDrawStatusBarBackground;
    public boolean mIsAttachedToWindow;
    public final int[] mKeyTriggeredScrollConsumed;
    public final int[] mKeylines;
    public WindowInsetsCompat mLastInsets;
    public boolean mNeedsPreDrawListener;
    public final NestedScrollingParentHelper mNestedScrollingParentHelper;
    public View mNestedScrollingTarget;
    public final int[] mNestedScrollingV2ConsumedCompat;
    public ViewGroup.OnHierarchyChangeListener mOnHierarchyChangeListener;
    public OnPreDrawListener mOnPreDrawListener;
    public Drawable mStatusBarBackground;
    public final ArrayList mTempList1;

    public interface AttachedBehavior {
        Behavior getBehavior();
    }

    public abstract class Behavior {
        public boolean getInsetDodgeRect(Rect rect, View view) {
            return false;
        }

        public boolean layoutDependsOn(View view, View view2) {
            return false;
        }

        public void onAttachedToLayoutParams(LayoutParams layoutParams) {
        }

        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, View view) {
        }

        public void onDetachedFromLayoutParams() {
        }

        public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
            return false;
        }

        public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            return false;
        }

        public boolean onNestedPreFling(View view) {
            return false;
        }

        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        }

        public void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
            iArr[0] = iArr[0] + i2;
            iArr[1] = iArr[1] + i3;
        }

        public boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            return false;
        }

        public void onRestoreInstanceState(View view, Parcelable parcelable) {
        }

        public Parcelable onSaveInstanceState(View view) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            return false;
        }

        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        }

        public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface DefaultBehavior {
        Class value();
    }

    public final class HierarchyChangeListener implements ViewGroup.OnHierarchyChangeListener {
        public HierarchyChangeListener() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.mOnHierarchyChangeListener;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            coordinatorLayout.onChildViewsChanged(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.mOnHierarchyChangeListener;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public final class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new AbsSavedState.AnonymousClass2(4);
        public SparseArray behaviorStates;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.behaviorStates = new SparseArray(readInt);
            for (int i = 0; i < readInt; i++) {
                this.behaviorStates.append(iArr[i], readParcelableArray[i]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            SparseArray sparseArray = this.behaviorStates;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.behaviorStates.keyAt(i2);
                parcelableArr[i2] = (Parcelable) this.behaviorStates.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        WIDGET_PACKAGE_NAME = r0 != null ? r0.getName() : null;
        TOP_SORTED_CHILDREN_COMPARATOR = new ViewPager.AnonymousClass1(7);
        CONSTRUCTOR_PARAMS = new Class[]{Context.class, AttributeSet.class};
        sConstructors = new ThreadLocal();
        sRectPool = new Pools$SynchronizedPool(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        CoordinatorLayout coordinatorLayout;
        Context context2;
        this.mDependencySortedChildren = new ArrayList();
        this.mChildDag = new n(5);
        this.mTempList1 = new ArrayList();
        this.mBehaviorConsumed = new int[2];
        this.mNestedScrollingV2ConsumedCompat = new int[2];
        this.mKeyTriggeredScrollConsumed = new int[2];
        this.mNestedScrollingParentHelper = new NestedScrollingParentHelper();
        int[] iArr = R$styleable.CoordinatorLayout;
        TypedArray obtainStyledAttributes = i == 0 ? context.obtainStyledAttributes(attributeSet, iArr, 0, R.style.Widget_Support_CoordinatorLayout) : context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        if (i == 0) {
            WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
            coordinatorLayout = this;
            context2 = context;
            ViewCompat.Api29Impl.saveAttributeDataForStyleable(coordinatorLayout, context2, iArr, attributeSet, obtainStyledAttributes, 0, R.style.Widget_Support_CoordinatorLayout);
        } else {
            coordinatorLayout = this;
            context2 = context;
            WeakHashMap weakHashMap2 = ViewCompat.sViewPropertyAnimatorMap;
            ViewCompat.Api29Impl.saveAttributeDataForStyleable(coordinatorLayout, context2, iArr, attributeSet, obtainStyledAttributes, i, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context2.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            coordinatorLayout.mKeylines = intArray;
            float f = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i2 = 0; i2 < length; i2++) {
                coordinatorLayout.mKeylines[i2] = (int) (r10[i2] * f);
            }
        }
        coordinatorLayout.mStatusBarBackground = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        coordinatorLayout.setupForInsets();
        super.setOnHierarchyChangeListener(coordinatorLayout.new HierarchyChangeListener());
        if (coordinatorLayout.getImportantForAccessibility() == 0) {
            coordinatorLayout.setImportantForAccessibility(1);
        }
    }

    public static Rect acquireTempRect() {
        Rect rect = (Rect) sRectPool.acquire();
        return rect == null ? new Rect() : rect;
    }

    public static void getDesiredAnchoredChildRectWithoutConstraints(int i, Rect rect, Rect rect2, LayoutParams layoutParams, int i2, int i3) {
        int i4 = layoutParams.gravity;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = layoutParams.anchorGravity;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & 112) == 0) {
            i5 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        int width = i8 != 1 ? i8 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i9 != 16 ? i9 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i6 == 1) {
            width -= i2 / 2;
        } else if (i6 != 5) {
            width -= i2;
        }
        if (i7 == 16) {
            height -= i3 / 2;
        } else if (i7 != 80) {
            height -= i3;
        }
        rect2.set(width, height, i2 + width, i3 + height);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static LayoutParams getResolvedLayoutParams(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!layoutParams.mBehaviorResolved) {
            if (view instanceof AttachedBehavior) {
                Behavior behavior = ((AttachedBehavior) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                layoutParams.setBehavior(behavior);
                layoutParams.mBehaviorResolved = true;
                return layoutParams;
            }
            DefaultBehavior defaultBehavior = null;
            for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                defaultBehavior = (DefaultBehavior) cls.getAnnotation(DefaultBehavior.class);
                if (defaultBehavior != null) {
                    break;
                }
            }
            if (defaultBehavior != null) {
                try {
                    layoutParams.setBehavior((Behavior) defaultBehavior.value().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception e) {
                    Log.e("CoordinatorLayout", "Default behavior class " + defaultBehavior.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                }
            }
            layoutParams.mBehaviorResolved = true;
        }
        return layoutParams;
    }

    public static void setInsetOffsetX(View view, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i2 = layoutParams.mInsetOffsetX;
        if (i2 != i) {
            WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
            view.offsetLeftAndRight(i - i2);
            layoutParams.mInsetOffsetX = i;
        }
    }

    public static void setInsetOffsetY(View view, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i2 = layoutParams.mInsetOffsetY;
        if (i2 != i) {
            WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
            view.offsetTopAndBottom(i - i2);
            layoutParams.mInsetOffsetY = i;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public final void constrainChildRect(LayoutParams layoutParams, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    public final void dispatchDependentViewsChanged(View view) {
        ArrayList arrayList = (ArrayList) ((SimpleArrayMap) this.mChildDag.b).get(view);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View view2 = (View) arrayList.get(i);
            Behavior behavior = ((LayoutParams) view2.getLayoutParams()).mBehavior;
            if (behavior != null) {
                behavior.onDependentViewChanged(this, view2, view);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean dispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        if (!dispatchKeyEvent && keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                return keyEvent.isAltPressed() ? moveVertically(-getHeight()) : moveVertically(-((int) (getHeight() * 0.2f)));
            }
            if (keyCode == 20) {
                return keyEvent.isAltPressed() ? moveVertically(getHeight()) : moveVertically((int) (getHeight() * 0.2f));
            }
            if (keyCode == 62) {
                return keyEvent.isShiftPressed() ? moveVertically(-getFullContentHeight()) : moveVertically(getFullContentHeight() - getHeight());
            }
            if (keyCode == 92) {
                return moveVertically(-getHeight());
            }
            if (keyCode == 93) {
                return moveVertically(getHeight());
            }
            if (keyCode == 122) {
                return moveVertically(-getFullContentHeight());
            }
            if (keyCode == 123) {
                return moveVertically(getFullContentHeight() - getHeight());
            }
        }
        return dispatchKeyEvent;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        Behavior behavior = ((LayoutParams) view.getLayoutParams()).mBehavior;
        if (behavior != null) {
            behavior.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.mStatusBarBackground;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public final void getChildRect(View view, Rect rect, boolean z) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            getDescendantRect(rect, view);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final List getDependencies(View view) {
        SimpleArrayMap simpleArrayMap = (SimpleArrayMap) this.mChildDag.b;
        int i = simpleArrayMap.size;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) simpleArrayMap.valueAt(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(simpleArrayMap.keyAt(i2));
            }
        }
        return arrayList == null ? Collections.EMPTY_LIST : arrayList;
    }

    public final void getDescendantRect(Rect rect, View view) {
        ThreadLocal threadLocal = ViewGroupUtils.sMatrix;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = ViewGroupUtils.sMatrix;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        ViewGroupUtils.offsetDescendantMatrix(this, view, matrix);
        ThreadLocal threadLocal3 = ViewGroupUtils.sRectF;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final int getFullContentHeight() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            i += childAt.getHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        return i;
    }

    public final int getKeyline(int i) {
        int[] iArr = this.mKeylines;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        }
        if (i >= 0 && i < iArr.length) {
            return iArr[i];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
        return 0;
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.mNestedScrollingParentHelper.getNestedScrollAxes();
    }

    @Override // android.view.View
    public final int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public final int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final boolean isPointInChildBounds(View view, int i, int i2) {
        Pools$SynchronizedPool pools$SynchronizedPool = sRectPool;
        Rect acquireTempRect = acquireTempRect();
        getDescendantRect(acquireTempRect, view);
        try {
            return acquireTempRect.contains(i, i2);
        } finally {
            acquireTempRect.setEmpty();
            pools$SynchronizedPool.release(acquireTempRect);
        }
    }

    public final boolean moveVertically(int i) {
        View view;
        View view2 = this;
        while (true) {
            if (view2 == null) {
                view = null;
                break;
            }
            if (view2.isFocused()) {
                view = view2;
                break;
            }
            view2 = view2 instanceof ViewGroup ? ((ViewGroup) view2).getFocusedChild() : null;
        }
        onStartNestedScroll(this, view, 2, 1);
        onNestedPreScroll(view, 0, i, this.mKeyTriggeredScrollConsumed, 1);
        int[] iArr = this.mKeyTriggeredScrollConsumed;
        int i2 = iArr[1];
        iArr[0] = 0;
        iArr[1] = 0;
        onNestedScroll(view, 0, i2, 0, i, 1, iArr);
        onStopNestedScroll(view, 1);
        return iArr[1] > 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        resetTouchBehaviors();
        if (this.mNeedsPreDrawListener) {
            if (this.mOnPreDrawListener == null) {
                this.mOnPreDrawListener = new OnPreDrawListener(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.mOnPreDrawListener);
        }
        if (this.mLastInsets == null) {
            WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
            if (getFitsSystemWindows()) {
                requestApplyInsets();
            }
        }
        this.mIsAttachedToWindow = true;
    }

    public final void onChildViewsChanged(int i) {
        int i2;
        Rect rect;
        int i3;
        ArrayList arrayList;
        boolean z;
        boolean z2;
        boolean z3;
        int width;
        int i4;
        int i5;
        int i6;
        int height;
        int i7;
        int i8;
        int i9;
        int i10;
        ArrayList arrayList2;
        int i11;
        Rect rect2;
        int i12;
        View view;
        LayoutParams layoutParams;
        Behavior behavior;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList3 = this.mDependencySortedChildren;
        int size = arrayList3.size();
        Rect acquireTempRect = acquireTempRect();
        Rect acquireTempRect2 = acquireTempRect();
        Rect acquireTempRect3 = acquireTempRect();
        int i13 = 0;
        while (true) {
            Pools$SynchronizedPool pools$SynchronizedPool = sRectPool;
            if (i13 >= size) {
                Rect rect3 = acquireTempRect3;
                acquireTempRect.setEmpty();
                pools$SynchronizedPool.release(acquireTempRect);
                acquireTempRect2.setEmpty();
                pools$SynchronizedPool.release(acquireTempRect2);
                rect3.setEmpty();
                pools$SynchronizedPool.release(rect3);
                return;
            }
            View view2 = (View) arrayList3.get(i13);
            LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
            if (i != 0 || view2.getVisibility() != 8) {
                int i14 = 0;
                while (i14 < i13) {
                    if (layoutParams2.mAnchorDirectChild == ((View) arrayList3.get(i14))) {
                        LayoutParams layoutParams3 = (LayoutParams) view2.getLayoutParams();
                        if (layoutParams3.mAnchorView != null) {
                            Rect acquireTempRect4 = acquireTempRect();
                            Rect acquireTempRect5 = acquireTempRect();
                            LayoutParams layoutParams4 = layoutParams2;
                            Rect acquireTempRect6 = acquireTempRect();
                            getDescendantRect(acquireTempRect4, layoutParams3.mAnchorView);
                            getChildRect(view2, acquireTempRect5, false);
                            int measuredWidth = view2.getMeasuredWidth();
                            View view3 = view2;
                            int measuredHeight = view3.getMeasuredHeight();
                            i10 = i14;
                            layoutDirection = layoutDirection;
                            arrayList2 = arrayList3;
                            layoutParams = layoutParams4;
                            i12 = i13;
                            view = view3;
                            getDesiredAnchoredChildRectWithoutConstraints(layoutDirection, acquireTempRect4, acquireTempRect6, layoutParams3, measuredWidth, measuredHeight);
                            i11 = size;
                            rect2 = acquireTempRect3;
                            boolean z4 = (acquireTempRect6.left == acquireTempRect5.left && acquireTempRect6.top == acquireTempRect5.top) ? false : true;
                            constrainChildRect(layoutParams3, acquireTempRect6, measuredWidth, measuredHeight);
                            int i15 = acquireTempRect6.left - acquireTempRect5.left;
                            int i16 = acquireTempRect6.top - acquireTempRect5.top;
                            if (i15 != 0) {
                                WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
                                view.offsetLeftAndRight(i15);
                            }
                            if (i16 != 0) {
                                WeakHashMap weakHashMap2 = ViewCompat.sViewPropertyAnimatorMap;
                                view.offsetTopAndBottom(i16);
                            }
                            if (z4 && (behavior = layoutParams3.mBehavior) != null) {
                                behavior.onDependentViewChanged(this, view, layoutParams3.mAnchorView);
                            }
                            acquireTempRect4.setEmpty();
                            pools$SynchronizedPool.release(acquireTempRect4);
                            acquireTempRect5.setEmpty();
                            pools$SynchronizedPool.release(acquireTempRect5);
                            acquireTempRect6.setEmpty();
                            pools$SynchronizedPool.release(acquireTempRect6);
                            i14 = i10 + 1;
                            layoutParams2 = layoutParams;
                            view2 = view;
                            arrayList3 = arrayList2;
                            size = i11;
                            i13 = i12;
                            acquireTempRect3 = rect2;
                        }
                    }
                    i10 = i14;
                    arrayList2 = arrayList3;
                    i11 = size;
                    rect2 = acquireTempRect3;
                    i12 = i13;
                    view = view2;
                    layoutParams = layoutParams2;
                    i14 = i10 + 1;
                    layoutParams2 = layoutParams;
                    view2 = view;
                    arrayList3 = arrayList2;
                    size = i11;
                    i13 = i12;
                    acquireTempRect3 = rect2;
                }
                ArrayList arrayList4 = arrayList3;
                int i17 = size;
                Rect rect4 = acquireTempRect3;
                i2 = i13;
                View view4 = view2;
                LayoutParams layoutParams5 = layoutParams2;
                getChildRect(view4, acquireTempRect2, true);
                if (layoutParams5.insetEdge != 0 && !acquireTempRect2.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(layoutParams5.insetEdge, layoutDirection);
                    int i18 = absoluteGravity & 112;
                    if (i18 == 48) {
                        acquireTempRect.top = Math.max(acquireTempRect.top, acquireTempRect2.bottom);
                    } else if (i18 == 80) {
                        acquireTempRect.bottom = Math.max(acquireTempRect.bottom, getHeight() - acquireTempRect2.top);
                    }
                    int i19 = absoluteGravity & 7;
                    if (i19 == 3) {
                        acquireTempRect.left = Math.max(acquireTempRect.left, acquireTempRect2.right);
                    } else if (i19 == 5) {
                        acquireTempRect.right = Math.max(acquireTempRect.right, getWidth() - acquireTempRect2.left);
                    }
                }
                if (layoutParams5.dodgeInsetEdges != 0 && view4.getVisibility() == 0 && view4.isLaidOut() && view4.getWidth() > 0 && view4.getHeight() > 0) {
                    LayoutParams layoutParams6 = (LayoutParams) view4.getLayoutParams();
                    Behavior behavior2 = layoutParams6.mBehavior;
                    Rect acquireTempRect7 = acquireTempRect();
                    Rect acquireTempRect8 = acquireTempRect();
                    acquireTempRect8.set(view4.getLeft(), view4.getTop(), view4.getRight(), view4.getBottom());
                    if (behavior2 == null || !behavior2.getInsetDodgeRect(acquireTempRect7, view4)) {
                        acquireTempRect7.set(acquireTempRect8);
                    } else if (!acquireTempRect8.contains(acquireTempRect7)) {
                        LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Rect should be within the child's bounds. Rect:", acquireTempRect7.toShortString(), " | Bounds:", acquireTempRect8.toShortString());
                        return;
                    }
                    acquireTempRect8.setEmpty();
                    pools$SynchronizedPool.release(acquireTempRect8);
                    if (acquireTempRect7.isEmpty()) {
                        acquireTempRect7.setEmpty();
                        pools$SynchronizedPool.release(acquireTempRect7);
                    } else {
                        int absoluteGravity2 = Gravity.getAbsoluteGravity(layoutParams6.dodgeInsetEdges, layoutDirection);
                        if ((absoluteGravity2 & 48) != 48 || (i8 = (acquireTempRect7.top - ((ViewGroup.MarginLayoutParams) layoutParams6).topMargin) - layoutParams6.mInsetOffsetY) >= (i9 = acquireTempRect.top)) {
                            z2 = false;
                        } else {
                            setInsetOffsetY(view4, i9 - i8);
                            z2 = true;
                        }
                        if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - acquireTempRect7.bottom) - ((ViewGroup.MarginLayoutParams) layoutParams6).bottomMargin) + layoutParams6.mInsetOffsetY) < (i7 = acquireTempRect.bottom)) {
                            setInsetOffsetY(view4, height - i7);
                            z2 = true;
                        }
                        if (!z2) {
                            setInsetOffsetY(view4, 0);
                        }
                        if ((absoluteGravity2 & 3) != 3 || (i5 = (acquireTempRect7.left - ((ViewGroup.MarginLayoutParams) layoutParams6).leftMargin) - layoutParams6.mInsetOffsetX) >= (i6 = acquireTempRect.left)) {
                            z3 = false;
                        } else {
                            setInsetOffsetX(view4, i6 - i5);
                            z3 = true;
                        }
                        if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - acquireTempRect7.right) - ((ViewGroup.MarginLayoutParams) layoutParams6).rightMargin) + layoutParams6.mInsetOffsetX) < (i4 = acquireTempRect.right)) {
                            setInsetOffsetX(view4, width - i4);
                            z3 = true;
                        }
                        if (!z3) {
                            setInsetOffsetX(view4, 0);
                        }
                        acquireTempRect7.setEmpty();
                        pools$SynchronizedPool.release(acquireTempRect7);
                    }
                }
                if (i != 2) {
                    rect = rect4;
                    rect.set(((LayoutParams) view4.getLayoutParams()).mLastChildRect);
                    if (rect.equals(acquireTempRect2)) {
                        arrayList = arrayList4;
                        i3 = i17;
                    } else {
                        ((LayoutParams) view4.getLayoutParams()).mLastChildRect.set(acquireTempRect2);
                    }
                } else {
                    rect = rect4;
                }
                int i20 = i2 + 1;
                i3 = i17;
                while (true) {
                    arrayList = arrayList4;
                    if (i20 >= i3) {
                        break;
                    }
                    View view5 = (View) arrayList.get(i20);
                    LayoutParams layoutParams7 = (LayoutParams) view5.getLayoutParams();
                    Behavior behavior3 = layoutParams7.mBehavior;
                    if (behavior3 != null && behavior3.layoutDependsOn(view5, view4)) {
                        if (i == 0 && layoutParams7.mDidChangeAfterNestedScroll) {
                            layoutParams7.mDidChangeAfterNestedScroll = false;
                        } else {
                            if (i != 2) {
                                z = behavior3.onDependentViewChanged(this, view5, view4);
                            } else {
                                behavior3.onDependentViewRemoved(this, view4);
                                z = true;
                            }
                            if (i == 1) {
                                layoutParams7.mDidChangeAfterNestedScroll = z;
                            }
                        }
                    }
                    i20++;
                    arrayList4 = arrayList;
                }
            } else {
                arrayList = arrayList3;
                i3 = size;
                rect = acquireTempRect3;
                i2 = i13;
            }
            i13 = i2 + 1;
            acquireTempRect3 = rect;
            size = i3;
            arrayList3 = arrayList;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        resetTouchBehaviors();
        if (this.mNeedsPreDrawListener && this.mOnPreDrawListener != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.mOnPreDrawListener);
        }
        View view = this.mNestedScrollingTarget;
        if (view != null) {
            onStopNestedScroll(view, 0);
        }
        this.mIsAttachedToWindow = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.mDrawStatusBarBackground || this.mStatusBarBackground == null) {
            return;
        }
        WindowInsetsCompat windowInsetsCompat = this.mLastInsets;
        int systemWindowInsetTop = windowInsetsCompat != null ? windowInsetsCompat.getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.mStatusBarBackground.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.mStatusBarBackground.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            resetTouchBehaviors();
        }
        boolean performIntercept = performIntercept(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return performIntercept;
        }
        this.mBehaviorTouchView = null;
        resetTouchBehaviors();
        return performIntercept;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Behavior behavior;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.mDependencySortedChildren;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList.get(i5);
            if (view.getVisibility() != 8 && ((behavior = ((LayoutParams) view.getLayoutParams()).mBehavior) == null || !behavior.onLayoutChild(this, view, layoutDirection))) {
                onLayoutChild(view, layoutDirection);
            }
        }
    }

    public final void onLayoutChild(View view, int i) {
        Rect acquireTempRect;
        Rect acquireTempRect2;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        View view2 = layoutParams.mAnchorView;
        if (view2 == null && layoutParams.mAnchorId != -1) {
            a$$ExternalSyntheticBUOutline0.m$1("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
            return;
        }
        Pools$SynchronizedPool pools$SynchronizedPool = sRectPool;
        if (view2 != null) {
            acquireTempRect = acquireTempRect();
            acquireTempRect2 = acquireTempRect();
            try {
                getDescendantRect(acquireTempRect, view2);
                LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                getDesiredAnchoredChildRectWithoutConstraints(i, acquireTempRect, acquireTempRect2, layoutParams2, measuredWidth, measuredHeight);
                constrainChildRect(layoutParams2, acquireTempRect2, measuredWidth, measuredHeight);
                view.layout(acquireTempRect2.left, acquireTempRect2.top, acquireTempRect2.right, acquireTempRect2.bottom);
                return;
            } finally {
                acquireTempRect.setEmpty();
                pools$SynchronizedPool.release(acquireTempRect);
                acquireTempRect2.setEmpty();
                pools$SynchronizedPool.release(acquireTempRect2);
            }
        }
        int i2 = layoutParams.keyline;
        if (i2 < 0) {
            LayoutParams layoutParams3 = (LayoutParams) view.getLayoutParams();
            acquireTempRect = acquireTempRect();
            acquireTempRect.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin);
            if (this.mLastInsets != null) {
                WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    acquireTempRect.left = this.mLastInsets.getSystemWindowInsetLeft() + acquireTempRect.left;
                    acquireTempRect.top = this.mLastInsets.getSystemWindowInsetTop() + acquireTempRect.top;
                    acquireTempRect.right -= this.mLastInsets.getSystemWindowInsetRight();
                    acquireTempRect.bottom -= this.mLastInsets.getSystemWindowInsetBottom();
                }
            }
            acquireTempRect2 = acquireTempRect();
            int i3 = layoutParams3.gravity;
            if ((i3 & 7) == 0) {
                i3 |= 8388611;
            }
            if ((i3 & 112) == 0) {
                i3 |= 48;
            }
            Gravity.apply(i3, view.getMeasuredWidth(), view.getMeasuredHeight(), acquireTempRect, acquireTempRect2, i);
            view.layout(acquireTempRect2.left, acquireTempRect2.top, acquireTempRect2.right, acquireTempRect2.bottom);
            return;
        }
        LayoutParams layoutParams4 = (LayoutParams) view.getLayoutParams();
        int i4 = layoutParams4.gravity;
        if (i4 == 0) {
            i4 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = absoluteGravity & 7;
        int i6 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i == 1) {
            i2 = width - i2;
        }
        int keyline = getKeyline(i2) - measuredWidth2;
        if (i5 == 1) {
            keyline += measuredWidth2 / 2;
        } else if (i5 == 5) {
            keyline += measuredWidth2;
        }
        int i7 = i6 != 16 ? i6 != 80 ? 0 : measuredHeight2 : measuredHeight2 / 2;
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams4).leftMargin, Math.min(keyline, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) layoutParams4).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin, Math.min(i7, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin));
        view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02d5  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        boolean z;
        boolean z2;
        int size;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Behavior behavior;
        int i9;
        int i10;
        int i11;
        int i12;
        LayoutParams layoutParams;
        View view;
        int i13;
        int i14;
        ArrayList arrayList;
        int i15;
        int i16;
        int i17;
        int max;
        View childAt;
        int layoutDirection;
        int absoluteGravity;
        Behavior behavior2;
        CoordinatorLayout coordinatorLayout = this;
        ArrayList arrayList2 = coordinatorLayout.mDependencySortedChildren;
        arrayList2.clear();
        n nVar = coordinatorLayout.mChildDag;
        SimpleArrayMap simpleArrayMap = (SimpleArrayMap) nVar.b;
        SimpleArrayMap simpleArrayMap2 = (SimpleArrayMap) nVar.b;
        Pools$SimplePool pools$SimplePool = (Pools$SimplePool) nVar.a;
        int i18 = simpleArrayMap.size;
        for (int i19 = 0; i19 < i18; i19++) {
            ArrayList arrayList3 = (ArrayList) simpleArrayMap.valueAt(i19);
            if (arrayList3 != null) {
                arrayList3.clear();
                pools$SimplePool.release(arrayList3);
            }
        }
        simpleArrayMap.clear();
        int childCount = coordinatorLayout.getChildCount();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt2 = coordinatorLayout.getChildAt(i20);
            LayoutParams resolvedLayoutParams = getResolvedLayoutParams(childAt2);
            int i21 = resolvedLayoutParams.mAnchorId;
            if (i21 == -1) {
                resolvedLayoutParams.mAnchorDirectChild = null;
                resolvedLayoutParams.mAnchorView = null;
            } else {
                View view2 = resolvedLayoutParams.mAnchorView;
                if (view2 != null && view2.getId() == i21) {
                    View view3 = resolvedLayoutParams.mAnchorView;
                    for (ViewParent parent = view3.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                        if (parent == null || parent == childAt2) {
                            resolvedLayoutParams.mAnchorDirectChild = null;
                            resolvedLayoutParams.mAnchorView = null;
                        } else {
                            if (parent instanceof View) {
                                view3 = parent;
                            }
                        }
                    }
                    resolvedLayoutParams.mAnchorDirectChild = view3;
                }
                View findViewById = coordinatorLayout.findViewById(i21);
                resolvedLayoutParams.mAnchorView = findViewById;
                if (findViewById == null) {
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m$1("Could not find CoordinatorLayout descendant view with id ", coordinatorLayout.getResources().getResourceName(i21), " to anchor view ", childAt2);
                    return;
                }
                if (findViewById == coordinatorLayout) {
                    a$$ExternalSyntheticBUOutline0.m$1("View can not be anchored to the the parent CoordinatorLayout");
                    return;
                }
                for (ViewParent parent2 = findViewById.getParent(); parent2 != coordinatorLayout && parent2 != null; parent2 = parent2.getParent()) {
                    if (parent2 == childAt2) {
                        a$$ExternalSyntheticBUOutline0.m$1("Anchor must not be a descendant of the anchored view");
                        return;
                    } else {
                        if (parent2 instanceof View) {
                            findViewById = parent2;
                        }
                    }
                }
                resolvedLayoutParams.mAnchorDirectChild = findViewById;
            }
            if (!simpleArrayMap2.containsKey(childAt2)) {
                simpleArrayMap2.put(childAt2, null);
            }
            for (int i22 = 0; i22 < childCount; i22++) {
                if (i22 != i20 && ((childAt = coordinatorLayout.getChildAt(i22)) == resolvedLayoutParams.mAnchorDirectChild || (((absoluteGravity = Gravity.getAbsoluteGravity(((LayoutParams) childAt.getLayoutParams()).insetEdge, (layoutDirection = coordinatorLayout.getLayoutDirection()))) != 0 && (Gravity.getAbsoluteGravity(resolvedLayoutParams.dodgeInsetEdges, layoutDirection) & absoluteGravity) == absoluteGravity) || ((behavior2 = resolvedLayoutParams.mBehavior) != null && behavior2.layoutDependsOn(childAt2, childAt))))) {
                    if (!simpleArrayMap.containsKey(childAt) && !simpleArrayMap2.containsKey(childAt)) {
                        simpleArrayMap2.put(childAt, null);
                    }
                    if (!simpleArrayMap.containsKey(childAt) || !simpleArrayMap.containsKey(childAt2)) {
                        a$$ExternalSyntheticBUOutline0.m$3("All nodes must be present in the graph before being added as an edge");
                        return;
                    }
                    ArrayList arrayList4 = (ArrayList) simpleArrayMap.get(childAt);
                    if (arrayList4 == null) {
                        arrayList4 = (ArrayList) pools$SimplePool.acquire();
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        simpleArrayMap.put(childAt, arrayList4);
                    }
                    arrayList4.add(childAt2);
                }
            }
        }
        ArrayList arrayList5 = (ArrayList) nVar.c;
        arrayList5.clear();
        HashSet hashSet = (HashSet) nVar.d;
        hashSet.clear();
        int i23 = simpleArrayMap.size;
        for (int i24 = 0; i24 < i23; i24++) {
            nVar.dfs(simpleArrayMap.keyAt(i24), arrayList5, hashSet);
        }
        arrayList2.addAll(arrayList5);
        Collections.reverse(arrayList2);
        int childCount2 = coordinatorLayout.getChildCount();
        int i25 = 0;
        loop6: while (true) {
            if (i25 >= childCount2) {
                z = false;
                break;
            }
            View childAt3 = coordinatorLayout.getChildAt(i25);
            int i26 = simpleArrayMap2.size;
            for (int i27 = 0; i27 < i26; i27++) {
                ArrayList arrayList6 = (ArrayList) simpleArrayMap2.valueAt(i27);
                if (arrayList6 != null && arrayList6.contains(childAt3)) {
                    z = true;
                    break loop6;
                }
            }
            i25++;
        }
        if (z != coordinatorLayout.mNeedsPreDrawListener) {
            boolean z3 = coordinatorLayout.mIsAttachedToWindow;
            if (z) {
                if (z3) {
                    if (coordinatorLayout.mOnPreDrawListener == null) {
                        coordinatorLayout.mOnPreDrawListener = new OnPreDrawListener(coordinatorLayout);
                    }
                    coordinatorLayout.getViewTreeObserver().addOnPreDrawListener(coordinatorLayout.mOnPreDrawListener);
                }
                coordinatorLayout.mNeedsPreDrawListener = true;
            } else {
                if (z3 && coordinatorLayout.mOnPreDrawListener != null) {
                    coordinatorLayout.getViewTreeObserver().removeOnPreDrawListener(coordinatorLayout.mOnPreDrawListener);
                }
                coordinatorLayout.mNeedsPreDrawListener = false;
            }
        }
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        int layoutDirection2 = coordinatorLayout.getLayoutDirection();
        boolean z4 = layoutDirection2 == 1;
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size3 = View.MeasureSpec.getSize(i2);
        int i28 = paddingLeft + paddingRight;
        int i29 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        if (coordinatorLayout.mLastInsets != null) {
            WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
            if (coordinatorLayout.getFitsSystemWindows()) {
                z2 = true;
                int i30 = suggestedMinimumHeight;
                int i31 = 0;
                int i32 = suggestedMinimumWidth;
                i3 = 0;
                for (size = arrayList2.size(); i3 < size; size = i4) {
                    View view4 = (View) arrayList2.get(i3);
                    int i33 = i3;
                    int i34 = i32;
                    if (view4.getVisibility() == 8) {
                        i4 = size;
                        arrayList = arrayList2;
                        i13 = paddingLeft;
                        i12 = layoutDirection2;
                        i32 = i34;
                        i16 = paddingRight;
                    } else {
                        LayoutParams layoutParams2 = (LayoutParams) view4.getLayoutParams();
                        int i35 = layoutParams2.keyline;
                        if (i35 < 0 || mode == 0) {
                            i4 = size;
                        } else {
                            int keyline = coordinatorLayout.getKeyline(i35);
                            int i36 = layoutParams2.gravity;
                            if (i36 == 0) {
                                i36 = 8388661;
                            }
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(i36, layoutDirection2) & 7;
                            i4 = size;
                            if ((absoluteGravity2 == 3 && !z4) || (absoluteGravity2 == 5 && z4)) {
                                max = Math.max(0, (size2 - paddingRight) - keyline);
                            } else if ((absoluteGravity2 == 5 && !z4) || (absoluteGravity2 == 3 && z4)) {
                                max = Math.max(0, keyline - paddingLeft);
                            }
                            i5 = i31;
                            i6 = max;
                            if (z2) {
                                WeakHashMap weakHashMap2 = ViewCompat.sViewPropertyAnimatorMap;
                                if (!view4.getFitsSystemWindows()) {
                                    int systemWindowInsetRight = coordinatorLayout.mLastInsets.getSystemWindowInsetRight() + coordinatorLayout.mLastInsets.getSystemWindowInsetLeft();
                                    int systemWindowInsetBottom = coordinatorLayout.mLastInsets.getSystemWindowInsetBottom() + coordinatorLayout.mLastInsets.getSystemWindowInsetTop();
                                    i7 = View.MeasureSpec.makeMeasureSpec(size2 - systemWindowInsetRight, mode);
                                    i8 = View.MeasureSpec.makeMeasureSpec(size3 - systemWindowInsetBottom, mode2);
                                    behavior = layoutParams2.mBehavior;
                                    if (behavior != null) {
                                        int i37 = i30;
                                        int i38 = i8;
                                        i13 = paddingLeft;
                                        i14 = i5;
                                        arrayList = arrayList2;
                                        i15 = i34;
                                        i16 = paddingRight;
                                        i17 = i37;
                                        i12 = layoutDirection2;
                                        layoutParams = layoutParams2;
                                        boolean onMeasureChild = behavior.onMeasureChild(this, view4, i7, i6, i38);
                                        view = view4;
                                        i10 = i7;
                                        i11 = i6;
                                        i9 = i38;
                                        if (onMeasureChild) {
                                            coordinatorLayout = this;
                                            i32 = Math.max(i15, view.getMeasuredWidth() + i28 + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                                            int max2 = Math.max(i17, view.getMeasuredHeight() + i29 + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                                            i31 = View.combineMeasuredStates(i14, view.getMeasuredState());
                                            i30 = max2;
                                        }
                                    } else {
                                        int i39 = i6;
                                        i9 = i8;
                                        i10 = i7;
                                        i11 = i39;
                                        i12 = layoutDirection2;
                                        layoutParams = layoutParams2;
                                        view = view4;
                                        i13 = paddingLeft;
                                        i14 = i5;
                                        arrayList = arrayList2;
                                        i15 = i34;
                                        i16 = paddingRight;
                                        i17 = i30;
                                    }
                                    coordinatorLayout = this;
                                    coordinatorLayout.measureChildWithMargins(view, i10, i11, i9, 0);
                                    i32 = Math.max(i15, view.getMeasuredWidth() + i28 + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                                    int max22 = Math.max(i17, view.getMeasuredHeight() + i29 + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                                    i31 = View.combineMeasuredStates(i14, view.getMeasuredState());
                                    i30 = max22;
                                }
                            }
                            i7 = i;
                            i8 = i2;
                            behavior = layoutParams2.mBehavior;
                            if (behavior != null) {
                            }
                            coordinatorLayout = this;
                            coordinatorLayout.measureChildWithMargins(view, i10, i11, i9, 0);
                            i32 = Math.max(i15, view.getMeasuredWidth() + i28 + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                            int max222 = Math.max(i17, view.getMeasuredHeight() + i29 + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                            i31 = View.combineMeasuredStates(i14, view.getMeasuredState());
                            i30 = max222;
                        }
                        i5 = i31;
                        i6 = 0;
                        if (z2) {
                        }
                        i7 = i;
                        i8 = i2;
                        behavior = layoutParams2.mBehavior;
                        if (behavior != null) {
                        }
                        coordinatorLayout = this;
                        coordinatorLayout.measureChildWithMargins(view, i10, i11, i9, 0);
                        i32 = Math.max(i15, view.getMeasuredWidth() + i28 + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                        int max2222 = Math.max(i17, view.getMeasuredHeight() + i29 + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                        i31 = View.combineMeasuredStates(i14, view.getMeasuredState());
                        i30 = max2222;
                    }
                    i3 = i33 + 1;
                    arrayList2 = arrayList;
                    paddingLeft = i13;
                    paddingRight = i16;
                    layoutDirection2 = i12;
                }
                int i40 = i31;
                coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(i32, i, (-16777216) & i40), View.resolveSizeAndState(i30, i2, i40 << 16));
            }
        }
        z2 = false;
        int i302 = suggestedMinimumHeight;
        int i312 = 0;
        int i322 = suggestedMinimumWidth;
        i3 = 0;
        while (i3 < size) {
        }
        int i402 = i312;
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(i322, i, (-16777216) & i402), View.resolveSizeAndState(i302, i2, i402 << 16));
    }

    public final void onMeasureChild(View view, int i, int i2, int i3) {
        measureChildWithMargins(view, i, i2, i3, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.isNestedScrollAccepted(0)) {
                    Behavior behavior = layoutParams.mBehavior;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        Behavior behavior;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.isNestedScrollAccepted(0) && (behavior = layoutParams.mBehavior) != null) {
                    z |= behavior.onNestedPreFling(view);
                }
            }
        }
        return z;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        Behavior behavior;
        int childCount = getChildCount();
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.isNestedScrollAccepted(i3) && (behavior = layoutParams.mBehavior) != null) {
                    int[] iArr2 = this.mBehaviorConsumed;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    behavior.onNestedPreScroll(this, childAt, view, i, i2, iArr2, i3);
                    i4 = i > 0 ? Math.max(i4, iArr2[0]) : Math.min(i4, iArr2[0]);
                    i5 = i2 > 0 ? Math.max(i5, iArr2[1]) : Math.min(i5, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z) {
            onChildViewsChanged(1);
        }
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        Behavior behavior;
        int childCount = getChildCount();
        int i6 = 0;
        int i7 = 0;
        boolean z = false;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.isNestedScrollAccepted(i5) && (behavior = layoutParams.mBehavior) != null) {
                    int[] iArr2 = this.mBehaviorConsumed;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    behavior.onNestedScroll(this, childAt, i2, i3, i4, iArr2);
                    i6 = i3 > 0 ? Math.max(i6, iArr2[0]) : Math.min(i6, iArr2[0]);
                    i7 = i4 > 0 ? Math.max(i7, iArr2[1]) : Math.min(i7, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + i6;
        iArr[1] = iArr[1] + i7;
        if (z) {
            onChildViewsChanged(1);
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        NestedScrollingParentHelper nestedScrollingParentHelper = this.mNestedScrollingParentHelper;
        if (i2 == 1) {
            nestedScrollingParentHelper.mNestedScrollAxesNonTouch = i;
        } else {
            nestedScrollingParentHelper.mNestedScrollAxesTouch = i;
        }
        this.mNestedScrollingTarget = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ((LayoutParams) getChildAt(i3).getLayoutParams()).getClass();
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mSuperState);
        SparseArray sparseArray = savedState.behaviorStates;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            Behavior behavior = getResolvedLayoutParams(childAt).mBehavior;
            if (id != -1 && behavior != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                behavior.onRestoreInstanceState(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            Behavior behavior = ((LayoutParams) childAt.getLayoutParams()).mBehavior;
            if (id != -1 && behavior != null && (onSaveInstanceState = behavior.onSaveInstanceState(childAt)) != null) {
                sparseArray.append(id, onSaveInstanceState);
            }
        }
        savedState.behaviorStates = sparseArray;
        return savedState;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                Behavior behavior = layoutParams.mBehavior;
                if (behavior != null) {
                    boolean onStartNestedScroll = behavior.onStartNestedScroll(this, childAt, view, view2, i, i2);
                    z |= onStartNestedScroll;
                    if (i2 == 0) {
                        layoutParams.mDidAcceptNestedScrollTouch = onStartNestedScroll;
                    } else if (i2 == 1) {
                        layoutParams.mDidAcceptNestedScrollNonTouch = onStartNestedScroll;
                    }
                } else if (i2 == 0) {
                    layoutParams.mDidAcceptNestedScrollTouch = false;
                } else if (i2 == 1) {
                    layoutParams.mDidAcceptNestedScrollNonTouch = false;
                }
            }
        }
        return z;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void onStopNestedScroll(View view, int i) {
        NestedScrollingParentHelper nestedScrollingParentHelper = this.mNestedScrollingParentHelper;
        if (i == 1) {
            nestedScrollingParentHelper.mNestedScrollAxesNonTouch = 0;
        } else {
            nestedScrollingParentHelper.mNestedScrollAxesTouch = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (layoutParams.isNestedScrollAccepted(i)) {
                Behavior behavior = layoutParams.mBehavior;
                if (behavior != null) {
                    behavior.onStopNestedScroll(this, childAt, view, i);
                }
                if (i == 0) {
                    layoutParams.mDidAcceptNestedScrollTouch = false;
                } else if (i == 1) {
                    layoutParams.mDidAcceptNestedScrollNonTouch = false;
                }
                layoutParams.mDidChangeAfterNestedScroll = false;
            }
        }
        this.mNestedScrollingTarget = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean performIntercept;
        int actionMasked = motionEvent.getActionMasked();
        View view = this.mBehaviorTouchView;
        boolean z = false;
        if (view != null) {
            Behavior behavior = ((LayoutParams) view.getLayoutParams()).mBehavior;
            performIntercept = behavior != null ? behavior.onTouchEvent(this, this.mBehaviorTouchView, motionEvent) : false;
        } else {
            performIntercept = performIntercept(motionEvent, 1);
            if (actionMasked != 0 && performIntercept) {
                z = true;
            }
        }
        if (this.mBehaviorTouchView == null || actionMasked == 3) {
            performIntercept |= super.onTouchEvent(motionEvent);
        } else if (z) {
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setAction(3);
            super.onTouchEvent(obtain);
            obtain.recycle();
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return performIntercept;
        }
        this.mBehaviorTouchView = null;
        resetTouchBehaviors();
        return performIntercept;
    }

    public final boolean performEvent(Behavior behavior, View view, MotionEvent motionEvent, int i) {
        if (i == 0) {
            return behavior.onInterceptTouchEvent(this, view, motionEvent);
        }
        if (i == 1) {
            return behavior.onTouchEvent(this, view, motionEvent);
        }
        Path$$ExternalSyntheticBUOutline0.m$3();
        return false;
    }

    public final boolean performIntercept(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.mTempList1;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            arrayList.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        ViewPager.AnonymousClass1 anonymousClass1 = TOP_SORTED_CHILDREN_COMPARATOR;
        if (anonymousClass1 != null) {
            Collections.sort(arrayList, anonymousClass1);
        }
        int size = arrayList.size();
        MotionEvent motionEvent2 = null;
        boolean z = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) arrayList.get(i3);
            Behavior behavior = ((LayoutParams) view.getLayoutParams()).mBehavior;
            if (z && actionMasked != 0) {
                if (behavior != null) {
                    if (motionEvent2 == null) {
                        motionEvent2 = MotionEvent.obtain(motionEvent);
                        motionEvent2.setAction(3);
                    }
                    performEvent(behavior, view, motionEvent2, i);
                }
            } else if (!z && behavior != null && (z = performEvent(behavior, view, motionEvent, i))) {
                this.mBehaviorTouchView = view;
                if (actionMasked != 3 && actionMasked != 1) {
                    for (int i4 = 0; i4 < i3; i4++) {
                        View view2 = (View) arrayList.get(i4);
                        Behavior behavior2 = ((LayoutParams) view2.getLayoutParams()).mBehavior;
                        if (behavior2 != null) {
                            if (motionEvent2 == null) {
                                motionEvent2 = MotionEvent.obtain(motionEvent);
                                motionEvent2.setAction(3);
                            }
                            performEvent(behavior2, view2, motionEvent2, i);
                        }
                    }
                }
            }
        }
        arrayList.clear();
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        Behavior behavior = ((LayoutParams) view.getLayoutParams()).mBehavior;
        if (behavior == null || !behavior.onRequestChildRectangleOnScreen(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.mDisallowInterceptReset) {
            return;
        }
        if (this.mBehaviorTouchView == null) {
            int childCount = getChildCount();
            MotionEvent motionEvent = null;
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                Behavior behavior = ((LayoutParams) childAt.getLayoutParams()).mBehavior;
                if (behavior != null) {
                    if (motionEvent == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 0);
                    }
                    behavior.onInterceptTouchEvent(this, childAt, motionEvent);
                }
            }
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        }
        resetTouchBehaviors();
        this.mDisallowInterceptReset = true;
    }

    public final void resetTouchBehaviors() {
        View view = this.mBehaviorTouchView;
        if (view != null) {
            Behavior behavior = ((LayoutParams) view.getLayoutParams()).mBehavior;
            if (behavior != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 0);
                behavior.onTouchEvent(this, this.mBehaviorTouchView, obtain);
                obtain.recycle();
            }
            this.mBehaviorTouchView = null;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ((LayoutParams) getChildAt(i).getLayoutParams()).getClass();
        }
        this.mDisallowInterceptReset = false;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        setupForInsets();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.mOnHierarchyChangeListener = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.mStatusBarBackground;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.mStatusBarBackground = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.mStatusBarBackground.setState(getDrawableState());
                }
                this.mStatusBarBackground.setLayoutDirection(getLayoutDirection());
                this.mStatusBarBackground.setVisible(getVisibility() == 0, false);
                this.mStatusBarBackground.setCallback(this);
            }
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? getContext().getDrawable(i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.mStatusBarBackground;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.mStatusBarBackground.setVisible(z, false);
    }

    public final void setupForInsets() {
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        if (!getFitsSystemWindows()) {
            ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(this, null);
            return;
        }
        if (this.mApplyWindowInsetsListener == null) {
            this.mApplyWindowInsetsListener = new PreviewView.AnonymousClass1(this, false);
        }
        ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(this, this.mApplyWindowInsetsListener);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mStatusBarBackground;
    }

    public final class OnPreDrawListener implements ViewTreeObserver.OnPreDrawListener {
        public final /* synthetic */ int $r8$classId = 0;
        public final Object this$0;

        public OnPreDrawListener(ViewTarget$SizeDeterminer viewTarget$SizeDeterminer) {
            this.this$0 = new WeakReference(viewTarget$SizeDeterminer);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            int i = this.$r8$classId;
            Object obj = this.this$0;
            switch (i) {
                case 0:
                    ((CoordinatorLayout) obj).onChildViewsChanged(0);
                    break;
                default:
                    if (Log.isLoggable("ViewTarget", 2)) {
                        Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                    }
                    ViewTarget$SizeDeterminer viewTarget$SizeDeterminer = (ViewTarget$SizeDeterminer) ((WeakReference) obj).get();
                    if (viewTarget$SizeDeterminer != null) {
                        ArrayList arrayList = viewTarget$SizeDeterminer.cbs;
                        View view = viewTarget$SizeDeterminer.view;
                        if (!arrayList.isEmpty()) {
                            int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
                            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                            int targetDimen = viewTarget$SizeDeterminer.getTargetDimen(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
                            int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
                            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                            int targetDimen2 = viewTarget$SizeDeterminer.getTargetDimen(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
                            if ((targetDimen > 0 || targetDimen == Integer.MIN_VALUE) && (targetDimen2 > 0 || targetDimen2 == Integer.MIN_VALUE)) {
                                Iterator it = new ArrayList(arrayList).iterator();
                                while (it.hasNext()) {
                                    ((SingleRequest) it.next()).onSizeReady(targetDimen, targetDimen2);
                                }
                                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                                if (viewTreeObserver.isAlive()) {
                                    viewTreeObserver.removeOnPreDrawListener(viewTarget$SizeDeterminer.layoutListener);
                                }
                                viewTarget$SizeDeterminer.layoutListener = null;
                                arrayList.clear();
                                break;
                            }
                        }
                    }
                    break;
            }
            return true;
        }

        public OnPreDrawListener(CoordinatorLayout coordinatorLayout) {
            this.this$0 = coordinatorLayout;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        onNestedScrollAccepted(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return onStartNestedScroll(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        onNestedPreScroll(view, i, i2, iArr, 0);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        onNestedScroll(view, i, i2, i3, i4, 0, this.mNestedScrollingV2ConsumedCompat);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        onNestedScroll(view, i, i2, i3, i4, 0);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.coordinatorLayoutStyle);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    public final class LayoutParams extends ViewGroup.MarginLayoutParams {
        public int anchorGravity;
        public int dodgeInsetEdges;
        public final int gravity;
        public int insetEdge;
        public final int keyline;
        public View mAnchorDirectChild;
        public final int mAnchorId;
        public View mAnchorView;
        public Behavior mBehavior;
        public boolean mBehaviorResolved;
        public boolean mDidAcceptNestedScrollNonTouch;
        public boolean mDidAcceptNestedScrollTouch;
        public boolean mDidChangeAfterNestedScroll;
        public int mInsetOffsetX;
        public int mInsetOffsetY;
        public final Rect mLastChildRect;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.mBehaviorResolved = false;
            this.gravity = 0;
            this.anchorGravity = 0;
            this.keyline = -1;
            this.mAnchorId = -1;
            this.insetEdge = 0;
            this.dodgeInsetEdges = 0;
            this.mLastChildRect = new Rect();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.CoordinatorLayout_Layout);
            this.gravity = obtainStyledAttributes.getInteger(0, 0);
            this.mAnchorId = obtainStyledAttributes.getResourceId(1, -1);
            this.anchorGravity = obtainStyledAttributes.getInteger(2, 0);
            this.keyline = obtainStyledAttributes.getInteger(6, -1);
            this.insetEdge = obtainStyledAttributes.getInt(5, 0);
            this.dodgeInsetEdges = obtainStyledAttributes.getInt(4, 0);
            boolean hasValue = obtainStyledAttributes.hasValue(3);
            this.mBehaviorResolved = hasValue;
            if (hasValue) {
                String string2 = obtainStyledAttributes.getString(3);
                String str = CoordinatorLayout.WIDGET_PACKAGE_NAME;
                Behavior behavior = null;
                if (!TextUtils.isEmpty(string2)) {
                    if (string2.startsWith(".")) {
                        string2 = context.getPackageName() + string2;
                    } else if (string2.indexOf(46) < 0) {
                        String str2 = CoordinatorLayout.WIDGET_PACKAGE_NAME;
                        if (!TextUtils.isEmpty(str2)) {
                            string2 = str2 + '.' + string2;
                        }
                    }
                    try {
                        ThreadLocal threadLocal = CoordinatorLayout.sConstructors;
                        Map map = (Map) threadLocal.get();
                        if (map == null) {
                            map = new HashMap();
                            threadLocal.set(map);
                        }
                        Constructor<?> constructor = (Constructor) map.get(string2);
                        if (constructor == null) {
                            constructor = Class.forName(string2, false, context.getClassLoader()).getConstructor(CoordinatorLayout.CONSTRUCTOR_PARAMS);
                            constructor.setAccessible(true);
                            map.put(string2, constructor);
                        }
                        behavior = (Behavior) constructor.newInstance(context, attributeSet);
                    } catch (Exception e) {
                        OptionalProvider$$ExternalSyntheticLambda0.m("Could not inflate Behavior subclass ".concat(string2), (Throwable) e);
                        throw null;
                    }
                }
                this.mBehavior = behavior;
            }
            obtainStyledAttributes.recycle();
            Behavior behavior2 = this.mBehavior;
            if (behavior2 != null) {
                behavior2.onAttachedToLayoutParams(this);
            }
        }

        public final boolean isNestedScrollAccepted(int i) {
            if (i == 0) {
                return this.mDidAcceptNestedScrollTouch;
            }
            if (i != 1) {
                return false;
            }
            return this.mDidAcceptNestedScrollNonTouch;
        }

        public final void setBehavior(Behavior behavior) {
            Behavior behavior2 = this.mBehavior;
            if (behavior2 != behavior) {
                if (behavior2 != null) {
                    behavior2.onDetachedFromLayoutParams();
                }
                this.mBehavior = behavior;
                this.mBehaviorResolved = true;
                if (behavior != null) {
                    behavior.onAttachedToLayoutParams(this);
                }
            }
        }

        public LayoutParams(int i) {
            super(i, -2);
            this.mBehaviorResolved = false;
            this.gravity = 0;
            this.anchorGravity = 0;
            this.keyline = -1;
            this.mAnchorId = -1;
            this.insetEdge = 0;
            this.dodgeInsetEdges = 0;
            this.mLastChildRect = new Rect();
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.mBehaviorResolved = false;
            this.gravity = 0;
            this.anchorGravity = 0;
            this.keyline = -1;
            this.mAnchorId = -1;
            this.insetEdge = 0;
            this.dodgeInsetEdges = 0;
            this.mLastChildRect = new Rect();
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.mBehaviorResolved = false;
            this.gravity = 0;
            this.anchorGravity = 0;
            this.keyline = -1;
            this.mAnchorId = -1;
            this.insetEdge = 0;
            this.dodgeInsetEdges = 0;
            this.mLastChildRect = new Rect();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.mBehaviorResolved = false;
            this.gravity = 0;
            this.anchorGravity = 0;
            this.keyline = -1;
            this.mAnchorId = -1;
            this.insetEdge = 0;
            this.dodgeInsetEdges = 0;
            this.mLastChildRect = new Rect();
        }
    }
}
