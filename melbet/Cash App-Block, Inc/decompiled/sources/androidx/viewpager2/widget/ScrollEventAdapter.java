package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.media3.extractor.text.ttml.TtmlParser;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class ScrollEventAdapter extends RecyclerView.OnScrollListener {
    public int mAdapterState;
    public CompositeOnPageChangeCallback mCallback;
    public boolean mDataSetChangeHappened;
    public boolean mDispatchSelected;
    public int mDragStartPosition;
    public final LinearLayoutManager mLayoutManager;
    public final ViewPager2.RecyclerViewImpl mRecyclerView;
    public boolean mScrollHappened;
    public int mScrollState;
    public final TtmlParser.FrameAndTickRate mScrollValues;
    public int mTarget;
    public final ViewPager2 mViewPager;

    public ScrollEventAdapter(ViewPager2 viewPager2) {
        this.mViewPager = viewPager2;
        ViewPager2.RecyclerViewImpl recyclerViewImpl = viewPager2.mRecyclerView;
        this.mRecyclerView = recyclerViewImpl;
        this.mLayoutManager = (LinearLayoutManager) recyclerViewImpl.mLayout;
        this.mScrollValues = new TtmlParser.FrameAndTickRate();
        resetState();
    }

    public final void dispatchStateChanged(int i) {
        if ((this.mAdapterState == 3 && this.mScrollState == 0) || this.mScrollState == i) {
            return;
        }
        this.mScrollState = i;
        CompositeOnPageChangeCallback compositeOnPageChangeCallback = this.mCallback;
        if (compositeOnPageChangeCallback != null) {
            compositeOnPageChangeCallback.onPageScrollStateChanged(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        CompositeOnPageChangeCallback compositeOnPageChangeCallback;
        CompositeOnPageChangeCallback compositeOnPageChangeCallback2;
        int i2 = this.mAdapterState;
        if (!(i2 == 1 && this.mScrollState == 1) && i == 1) {
            this.mAdapterState = 1;
            int i3 = this.mTarget;
            if (i3 != -1) {
                this.mDragStartPosition = i3;
                this.mTarget = -1;
            } else if (this.mDragStartPosition == -1) {
                this.mDragStartPosition = this.mLayoutManager.findFirstVisibleItemPosition();
            }
            dispatchStateChanged(1);
            return;
        }
        if ((i2 == 1 || i2 == 4) && i == 2) {
            if (this.mScrollHappened) {
                dispatchStateChanged(2);
                this.mDispatchSelected = true;
                return;
            }
            return;
        }
        TtmlParser.FrameAndTickRate frameAndTickRate = this.mScrollValues;
        if ((i2 == 1 || i2 == 4) && i == 0) {
            updateScrollEventValues();
            if (!this.mScrollHappened) {
                int i4 = frameAndTickRate.subFrameRate;
                if (i4 != -1 && (compositeOnPageChangeCallback2 = this.mCallback) != null) {
                    compositeOnPageChangeCallback2.onPageScrolled(i4, RecyclerView.DECELERATION_RATE, 0);
                }
            } else if (frameAndTickRate.tickRate == 0) {
                int i5 = this.mDragStartPosition;
                int i6 = frameAndTickRate.subFrameRate;
                if (i5 != i6 && (compositeOnPageChangeCallback = this.mCallback) != null) {
                    compositeOnPageChangeCallback.onPageSelected(i6);
                }
            }
            dispatchStateChanged(0);
            resetState();
        }
        if (this.mAdapterState == 2 && i == 0 && this.mDataSetChangeHappened) {
            updateScrollEventValues();
            if (frameAndTickRate.tickRate == 0) {
                int i7 = this.mTarget;
                int i8 = frameAndTickRate.subFrameRate;
                if (i7 != i8) {
                    if (i8 == -1) {
                        i8 = 0;
                    }
                    CompositeOnPageChangeCallback compositeOnPageChangeCallback3 = this.mCallback;
                    if (compositeOnPageChangeCallback3 != null) {
                        compositeOnPageChangeCallback3.onPageSelected(i8);
                    }
                }
                dispatchStateChanged(0);
                resetState();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        if ((r7 < 0) == (r5.mViewPager.mLayoutManager.mRecyclerView.getLayoutDirection() == 1)) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int i3;
        CompositeOnPageChangeCallback compositeOnPageChangeCallback;
        this.mScrollHappened = true;
        updateScrollEventValues();
        boolean z = this.mDispatchSelected;
        TtmlParser.FrameAndTickRate frameAndTickRate = this.mScrollValues;
        if (z) {
            this.mDispatchSelected = false;
            if (i2 <= 0) {
                if (i2 == 0) {
                }
                i3 = frameAndTickRate.subFrameRate;
                this.mTarget = i3;
                if (this.mDragStartPosition != i3 && (compositeOnPageChangeCallback = this.mCallback) != null) {
                    compositeOnPageChangeCallback.onPageSelected(i3);
                }
            }
            if (frameAndTickRate.tickRate != 0) {
                i3 = frameAndTickRate.subFrameRate + 1;
                this.mTarget = i3;
                if (this.mDragStartPosition != i3) {
                    compositeOnPageChangeCallback.onPageSelected(i3);
                }
            }
            i3 = frameAndTickRate.subFrameRate;
            this.mTarget = i3;
            if (this.mDragStartPosition != i3) {
            }
        } else if (this.mAdapterState == 0) {
            int i4 = frameAndTickRate.subFrameRate;
            if (i4 == -1) {
                i4 = 0;
            }
            CompositeOnPageChangeCallback compositeOnPageChangeCallback2 = this.mCallback;
            if (compositeOnPageChangeCallback2 != null) {
                compositeOnPageChangeCallback2.onPageSelected(i4);
            }
        }
        int i5 = frameAndTickRate.subFrameRate;
        if (i5 == -1) {
            i5 = 0;
        }
        float f = frameAndTickRate.effectiveFrameRate;
        int i6 = frameAndTickRate.tickRate;
        CompositeOnPageChangeCallback compositeOnPageChangeCallback3 = this.mCallback;
        if (compositeOnPageChangeCallback3 != null) {
            compositeOnPageChangeCallback3.onPageScrolled(i5, f, i6);
        }
        int i7 = frameAndTickRate.subFrameRate;
        int i8 = this.mTarget;
        if ((i7 == i8 || i8 == -1) && frameAndTickRate.tickRate == 0 && this.mScrollState != 1) {
            dispatchStateChanged(0);
            resetState();
        }
    }

    public final void resetState() {
        this.mAdapterState = 0;
        this.mScrollState = 0;
        TtmlParser.FrameAndTickRate frameAndTickRate = this.mScrollValues;
        frameAndTickRate.subFrameRate = -1;
        frameAndTickRate.effectiveFrameRate = RecyclerView.DECELERATION_RATE;
        frameAndTickRate.tickRate = 0;
        this.mDragStartPosition = -1;
        this.mTarget = -1;
        this.mDispatchSelected = false;
        this.mScrollHappened = false;
        this.mDataSetChangeHappened = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0132, code lost:
    
        if (r4[r12 - 1][1] >= r5) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0139, code lost:
    
        if (r0.getChildCount() <= 1) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateScrollEventValues() {
        int top;
        int top2;
        int i;
        int bottom;
        int i2;
        LinearLayoutManager linearLayoutManager = this.mLayoutManager;
        int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        TtmlParser.FrameAndTickRate frameAndTickRate = this.mScrollValues;
        frameAndTickRate.subFrameRate = findFirstVisibleItemPosition;
        float f = RecyclerView.DECELERATION_RATE;
        if (findFirstVisibleItemPosition == -1) {
            frameAndTickRate.subFrameRate = -1;
            frameAndTickRate.effectiveFrameRate = RecyclerView.DECELERATION_RATE;
            frameAndTickRate.tickRate = 0;
            return;
        }
        View findViewByPosition = linearLayoutManager.findViewByPosition(findFirstVisibleItemPosition);
        if (findViewByPosition == null) {
            frameAndTickRate.subFrameRate = -1;
            frameAndTickRate.effectiveFrameRate = RecyclerView.DECELERATION_RATE;
            frameAndTickRate.tickRate = 0;
            return;
        }
        int i3 = ((RecyclerView.LayoutParams) findViewByPosition.getLayoutParams()).mDecorInsets.left;
        int i4 = ((RecyclerView.LayoutParams) findViewByPosition.getLayoutParams()).mDecorInsets.right;
        int i5 = ((RecyclerView.LayoutParams) findViewByPosition.getLayoutParams()).mDecorInsets.top;
        int i6 = ((RecyclerView.LayoutParams) findViewByPosition.getLayoutParams()).mDecorInsets.bottom;
        ViewGroup.LayoutParams layoutParams = findViewByPosition.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            i3 += marginLayoutParams.leftMargin;
            i4 += marginLayoutParams.rightMargin;
            i5 += marginLayoutParams.topMargin;
            i6 += marginLayoutParams.bottomMargin;
        }
        int height = findViewByPosition.getHeight() + i5 + i6;
        int width = findViewByPosition.getWidth() + i3 + i4;
        int i7 = linearLayoutManager.mOrientation;
        ViewPager2.RecyclerViewImpl recyclerViewImpl = this.mRecyclerView;
        if (i7 == 0) {
            top = (findViewByPosition.getLeft() - i3) - recyclerViewImpl.getPaddingLeft();
            if (this.mViewPager.mLayoutManager.mRecyclerView.getLayoutDirection() == 1) {
                top = -top;
            }
            height = width;
        } else {
            top = (findViewByPosition.getTop() - i5) - recyclerViewImpl.getPaddingTop();
        }
        int i8 = -top;
        frameAndTickRate.tickRate = i8;
        if (i8 >= 0) {
            if (height != 0) {
                f = i8 / height;
            }
            frameAndTickRate.effectiveFrameRate = f;
            return;
        }
        int childCount = linearLayoutManager.getChildCount();
        if (childCount != 0) {
            boolean z = linearLayoutManager.mOrientation == 0;
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, childCount, 2);
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = linearLayoutManager.getChildAt(i9);
                if (childAt == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("null view contained in the view hierarchy");
                    return;
                }
                ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : AnimateLayoutChangeDetector.ZERO_MARGIN_LAYOUT_PARAMS;
                int[] iArr2 = iArr[i9];
                if (z) {
                    top2 = childAt.getLeft();
                    i = marginLayoutParams2.leftMargin;
                } else {
                    top2 = childAt.getTop();
                    i = marginLayoutParams2.topMargin;
                }
                iArr2[0] = top2 - i;
                int[] iArr3 = iArr[i9];
                if (z) {
                    bottom = childAt.getRight();
                    i2 = marginLayoutParams2.rightMargin;
                } else {
                    bottom = childAt.getBottom();
                    i2 = marginLayoutParams2.bottomMargin;
                }
                iArr3[1] = bottom + i2;
            }
            Arrays.sort(iArr, new ViewPager.AnonymousClass1(14));
            int i10 = 1;
            while (true) {
                if (i10 >= childCount) {
                    int[] iArr4 = iArr[0];
                    int i11 = iArr4[1];
                    int i12 = iArr4[0];
                    int i13 = i11 - i12;
                    if (i12 <= 0) {
                    }
                } else if (iArr[i10 - 1][1] != iArr[i10][0]) {
                    break;
                } else {
                    i10++;
                }
            }
            int childCount2 = linearLayoutManager.getChildCount();
            for (int i14 = 0; i14 < childCount2; i14++) {
                if (AnimateLayoutChangeDetector.hasRunningChangingLayoutTransition(linearLayoutManager.getChildAt(i14))) {
                    a$$ExternalSyntheticBUOutline0.m$1("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
                    return;
                }
            }
            Locale locale = Locale.US;
            a$$ExternalSyntheticBUOutline0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(frameAndTickRate.tickRate, "Page can only be offset by a positive amount, not by "));
        }
    }
}
