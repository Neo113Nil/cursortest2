package com.google.android.material.carousel;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.view.PreviewView$$ExternalSyntheticLambda0;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.material.R$styleable;
import com.squareup.cash.R;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class CarouselLayoutManager extends RecyclerView.LayoutManager implements RecyclerView.SmoothScroller.ScrollVectorProvider {
    public final MultiBrowseCarouselStrategy carouselStrategy;
    public CarouselOrientationHelper orientationHelper;
    public final View.OnLayoutChangeListener recyclerViewSizeChangeListener;

    public final class DebugItemDecoration extends RecyclerView.ItemDecoration {
        public final List keylines;
        public final Paint linePaint;

        public DebugItemDecoration() {
            Paint paint = new Paint();
            this.linePaint = paint;
            this.keylines = Collections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
            Canvas canvas2;
            super.onDrawOver(canvas, recyclerView, state);
            float dimension = recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width);
            Paint paint = this.linePaint;
            paint.setStrokeWidth(dimension);
            Iterator it = this.keylines.iterator();
            while (it.hasNext()) {
                ((KeylineState$Keyline) it.next()).getClass();
                paint.setColor(ColorUtils.blendARGB(RecyclerView.DECELERATION_RATE, -65281, -16776961));
                if (((CarouselLayoutManager) recyclerView.mLayout).isHorizontal()) {
                    canvas2 = canvas;
                    canvas2.drawLine(RecyclerView.DECELERATION_RATE, ((CarouselLayoutManager) recyclerView.mLayout).orientationHelper.getParentTop(), RecyclerView.DECELERATION_RATE, ((CarouselLayoutManager) recyclerView.mLayout).orientationHelper.getParentBottom(), paint);
                } else {
                    canvas2 = canvas;
                    canvas2.drawLine(((CarouselLayoutManager) recyclerView.mLayout).orientationHelper.getParentLeft(), RecyclerView.DECELERATION_RATE, ((CarouselLayoutManager) recyclerView.mLayout).orientationHelper.getParentRight(), RecyclerView.DECELERATION_RATE, paint);
                }
                canvas = canvas2;
            }
        }
    }

    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        new DebugItemDecoration();
        this.recyclerViewSizeChangeListener = new PreviewView$$ExternalSyntheticLambda0(this, 3);
        this.carouselStrategy = new MultiBrowseCarouselStrategy();
        requestLayout();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.Carousel);
            obtainStyledAttributes.getInt(0, 0);
            requestLayout();
            setOrientation(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
        }
    }

    public final float addEnd(float f, float f2) {
        return isLayoutRtl() ? f - f2 : f + f2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollHorizontally() {
        return isHorizontal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollVertically() {
        return !isHorizontal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollExtent(RecyclerView.State state) {
        getChildCount();
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollOffset(RecyclerView.State state) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollRange(RecyclerView.State state) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    public final PointF computeScrollVectorForPosition(int i) {
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollExtent(RecyclerView.State state) {
        getChildCount();
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollOffset(RecyclerView.State state) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollRange(RecyclerView.State state) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void getDecoratedBoundsWithMargins(Rect rect, View view) {
        RecyclerView.getDecoratedBoundsWithMarginsInt(rect, view);
        rect.centerY();
        if (isHorizontal()) {
            rect.centerX();
        }
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean isAutoMeasureEnabled() {
        return true;
    }

    public final boolean isHorizontal() {
        return this.orientationHelper.orientation == 0;
    }

    public final boolean isLayoutRtl() {
        return isHorizontal() && this.mRecyclerView.getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onAttachedToWindow(RecyclerView recyclerView) {
        Context context = recyclerView.getContext();
        MultiBrowseCarouselStrategy multiBrowseCarouselStrategy = this.carouselStrategy;
        float f = multiBrowseCarouselStrategy.smallSizeMin;
        if (f <= RecyclerView.DECELERATION_RATE) {
            f = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        multiBrowseCarouselStrategy.smallSizeMin = f;
        float f2 = multiBrowseCarouselStrategy.smallSizeMax;
        if (f2 <= RecyclerView.DECELERATION_RATE) {
            f2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        multiBrowseCarouselStrategy.smallSizeMax = f2;
        requestLayout();
        recyclerView.addOnLayoutChangeListener(this.recyclerViewSizeChangeListener);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onDetachedFromWindow(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.recyclerViewSizeChangeListener);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x002f, code lost:
    
        if (r7 == 1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0039, code lost:
    
        if (isLayoutRtl() != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x003d, code lost:
    
        if (r7 == 1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0046, code lost:
    
        if (isLayoutRtl() != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View onFocusSearchFailed(View view, int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        char c;
        if (getChildCount() != 0) {
            int i2 = this.orientationHelper.orientation;
            if (i != 1) {
                if (i != 2) {
                    if (i == 17) {
                        if (i2 == 0) {
                        }
                        c = 0;
                    } else if (i != 33) {
                        if (i != 66) {
                            if (i != 130) {
                                CameraState$Type$EnumUnboxingLocalUtility.m(i, "Unknown focus request:", "CarouselLayoutManager");
                            }
                            c = 0;
                        } else {
                            if (i2 == 0) {
                            }
                            c = 0;
                        }
                    }
                    if (c != 0) {
                        if (c == 65535) {
                            if (RecyclerView.LayoutManager.getPosition(view) != 0) {
                                int position = RecyclerView.LayoutManager.getPosition(getChildAt(0)) - 1;
                                if (position < 0 || position >= getItemCount()) {
                                    return getChildAt(isLayoutRtl() ? getChildCount() - 1 : 0);
                                }
                                this.orientationHelper.getParentStart();
                                throw null;
                            }
                        } else if (RecyclerView.LayoutManager.getPosition(view) != getItemCount() - 1) {
                            int position2 = RecyclerView.LayoutManager.getPosition(getChildAt(getChildCount() - 1)) + 1;
                            if (position2 < 0 || position2 >= getItemCount()) {
                                return getChildAt(isLayoutRtl() ? 0 : getChildCount() - 1);
                            }
                            this.orientationHelper.getParentStart();
                            throw null;
                        }
                    }
                }
                c = 1;
                if (c != 0) {
                }
            }
            c = 65535;
            if (c != 0) {
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(RecyclerView.LayoutManager.getPosition(getChildAt(0)));
            accessibilityEvent.setToIndex(RecyclerView.LayoutManager.getPosition(getChildAt(getChildCount() - 1)));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsAdded(int i, int i2) {
        getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsChanged() {
        getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsRemoved(int i, int i2) {
        getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (state.getItemCount() > 0) {
            if ((isHorizontal() ? this.mWidth : this.mHeight) > RecyclerView.DECELERATION_RATE) {
                isLayoutRtl();
                recycler.getViewForPosition(0);
                a$$ExternalSyntheticBUOutline0.m$1("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
                return;
            }
        }
        removeAndRecycleAllViews(recycler);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutCompleted(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return;
        }
        RecyclerView.LayoutManager.getPosition(getChildAt(0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (!isHorizontal() || getChildCount() == 0 || i == 0) {
            return 0;
        }
        recycler.getViewForPosition(0);
        a$$ExternalSyntheticBUOutline0.m$1("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void scrollToPosition(int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (!canScrollVertically() || getChildCount() == 0 || i == 0) {
            return 0;
        }
        recycler.getViewForPosition(0);
        a$$ExternalSyntheticBUOutline0.m$1("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        return 0;
    }

    public final void setOrientation(int i) {
        CarouselOrientationHelper carouselOrientationHelper;
        if (i != 0 && i != 1) {
            a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "invalid orientation:"));
            return;
        }
        assertNotInLayoutOrScroll(null);
        CarouselOrientationHelper carouselOrientationHelper2 = this.orientationHelper;
        if (carouselOrientationHelper2 == null || i != carouselOrientationHelper2.orientation) {
            if (i == 0) {
                carouselOrientationHelper = new CarouselOrientationHelper() { // from class: com.google.android.material.carousel.CarouselOrientationHelper.2
                    {
                        super(0);
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final int getParentBottom() {
                        CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
                        return carouselLayoutManager.mHeight - carouselLayoutManager.getPaddingBottom();
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final int getParentLeft() {
                        return 0;
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final int getParentRight() {
                        return CarouselLayoutManager.this.mWidth;
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final int getParentStart() {
                        CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
                        if (carouselLayoutManager.isLayoutRtl()) {
                            return carouselLayoutManager.mWidth;
                        }
                        return 0;
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final int getParentTop() {
                        return CarouselLayoutManager.this.getPaddingTop();
                    }
                };
            } else {
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$3("invalid orientation");
                    return;
                }
                carouselOrientationHelper = new CarouselOrientationHelper() { // from class: com.google.android.material.carousel.CarouselOrientationHelper.1
                    {
                        super(1);
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final int getParentBottom() {
                        return CarouselLayoutManager.this.mHeight;
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final int getParentLeft() {
                        return CarouselLayoutManager.this.getPaddingLeft();
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final int getParentRight() {
                        CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
                        return carouselLayoutManager.mWidth - carouselLayoutManager.getPaddingRight();
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final int getParentStart() {
                        return 0;
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final int getParentTop() {
                        return 0;
                    }
                };
            }
            this.orientationHelper = carouselOrientationHelper;
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this, recyclerView.getContext());
        anonymousClass1.mTargetPosition = i;
        startSmoothScroll(anonymousClass1);
    }

    /* renamed from: com.google.android.material.carousel.CarouselLayoutManager$1, reason: invalid class name */
    public final class AnonymousClass1 extends LinearSmoothScroller {
        public final /* synthetic */ int $r8$classId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CarouselLayoutManager carouselLayoutManager, Context context) {
            super(context);
            this.$r8$classId = 0;
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int calculateDxToMakeVisible(View view, int i) {
            switch (this.$r8$classId) {
                case 0:
                    return 0;
                default:
                    return super.calculateDxToMakeVisible(view, i);
            }
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int calculateDyToMakeVisible(View view, int i) {
            switch (this.$r8$classId) {
                case 0:
                    return 0;
                default:
                    return super.calculateDyToMakeVisible(view, i);
            }
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            switch (this.$r8$classId) {
                case 2:
                    return 100.0f / displayMetrics.densityDpi;
                default:
                    return super.calculateSpeedPerPixel(displayMetrics);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
        public PointF computeScrollVectorForPosition(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return null;
                default:
                    return super.computeScrollVectorForPosition(i);
            }
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int getVerticalSnapPreference() {
            switch (this.$r8$classId) {
                case 1:
                    return -1;
                case 2:
                default:
                    return super.getVerticalSnapPreference();
                case 3:
                    return -1;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(Context context, int i) {
            super(context);
            this.$r8$classId = i;
        }
    }

    public CarouselLayoutManager() {
        MultiBrowseCarouselStrategy multiBrowseCarouselStrategy = new MultiBrowseCarouselStrategy();
        new DebugItemDecoration();
        this.recyclerViewSizeChangeListener = new PreviewView$$ExternalSyntheticLambda0(this, 3);
        this.carouselStrategy = multiBrowseCarouselStrategy;
        requestLayout();
        setOrientation(0);
    }
}
