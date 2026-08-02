package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.camera.video.Recorder;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.media3.common.util.CircularIntArray;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.zipline.CallResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public static final Set sSupportedDirectionsForActionScrollInDirection = Collections.unmodifiableSet(new HashSet(Arrays.asList(17, 66, 33, Integer.valueOf(EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE))));
    public int[] mCachedBorders;
    public int mColumnWithAccessibilityFocus;
    public final Rect mDecorInsets;
    public boolean mPendingSpanCountChange;
    public int mPositionTargetedByScrollInDirection;
    public final SparseIntArray mPreLayoutSpanIndexCache;
    public final SparseIntArray mPreLayoutSpanSizeCache;
    public int mRowWithAccessibilityFocus;
    public View[] mSet;
    public int mSpanCount;
    public final CallResult mSpanSizeLookup;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mPendingSpanCountChange = false;
        this.mSpanCount = -1;
        this.mPreLayoutSpanSizeCache = new SparseIntArray();
        this.mPreLayoutSpanIndexCache = new SparseIntArray();
        this.mSpanSizeLookup = new CallResult(12);
        this.mDecorInsets = new Rect();
        this.mPositionTargetedByScrollInDirection = -1;
        this.mRowWithAccessibilityFocus = -1;
        this.mColumnWithAccessibilityFocus = -1;
        setSpanCount(RecyclerView.LayoutManager.getProperties(context, attributeSet, i, i2).spanCount);
    }

    public final void calculateItemBorders(int i) {
        int i2;
        int[] iArr = this.mCachedBorders;
        int i3 = this.mSpanCount;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.mCachedBorders = iArr;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void collectPrefetchPositionsForLayoutState(RecyclerView.State state, LinearLayoutManager.LayoutState layoutState, CircularIntArray circularIntArray) {
        int i;
        int i2 = this.mSpanCount;
        for (int i3 = 0; i3 < this.mSpanCount && (i = layoutState.mCurrentPosition) >= 0 && i < state.getItemCount() && i2 > 0; i3++) {
            circularIntArray.addPosition(layoutState.mCurrentPosition, Math.max(0, layoutState.mScrollingOffset));
            this.mSpanSizeLookup.getClass();
            i2--;
            layoutState.mCurrentPosition += layoutState.mItemDirection;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollOffset(RecyclerView.State state) {
        return computeScrollOffset(state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollRange(RecyclerView.State state) {
        return computeScrollRange(state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollOffset(RecyclerView.State state) {
        return computeScrollOffset(state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollRange(RecyclerView.State state) {
        return computeScrollRange(state);
    }

    public final void ensureViewSet() {
        View[] viewArr = this.mSet;
        if (viewArr == null || viewArr.length != this.mSpanCount) {
            this.mSet = new View[this.mSpanCount];
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View findReferenceChild(RecyclerView.Recycler recycler, RecyclerView.State state, boolean z, boolean z2) {
        int i;
        int i2;
        int childCount = getChildCount();
        int i3 = 1;
        if (z2) {
            i2 = getChildCount() - 1;
            i = -1;
            i3 = -1;
        } else {
            i = childCount;
            i2 = 0;
        }
        int itemCount = state.getItemCount();
        ensureLayoutState();
        int startAfterPadding = this.mOrientationHelper.getStartAfterPadding();
        int endAfterPadding = this.mOrientationHelper.getEndAfterPadding();
        View view = null;
        View view2 = null;
        while (i2 != i) {
            View childAt = getChildAt(i2);
            int position = RecyclerView.LayoutManager.getPosition(childAt);
            if (position >= 0 && position < itemCount && getSpanIndex(position, recycler, state) == 0) {
                if (((RecyclerView.LayoutParams) childAt.getLayoutParams()).mViewHolder.isRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.mOrientationHelper.getDecoratedStart(childAt) < endAfterPadding && this.mOrientationHelper.getDecoratedEnd(childAt) >= startAfterPadding) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i2 += i3;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return this.mOrientation == 0 ? new LayoutParams(-2, -1) : new LayoutParams(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            LayoutParams layoutParams2 = new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            layoutParams2.mSpanIndex = -1;
            layoutParams2.mSpanSize = 0;
            return layoutParams2;
        }
        LayoutParams layoutParams3 = new LayoutParams(layoutParams);
        layoutParams3.mSpanIndex = -1;
        layoutParams3.mSpanSize = 0;
        return layoutParams3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int getColumnCountForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.mOrientation == 1) {
            return Math.min(this.mSpanCount, getItemCount());
        }
        if (state.getItemCount() < 1) {
            return 0;
        }
        return getSpanGroupIndex(state.getItemCount() - 1, recycler, state) + 1;
    }

    public final int getColumnIndex(int i) {
        int i2 = this.mOrientation;
        RecyclerView recyclerView = this.mRecyclerView;
        return i2 == 0 ? getSpanGroupIndex(i, recyclerView.mRecycler, recyclerView.mState) : getSpanIndex(i, recyclerView.mRecycler, recyclerView.mState);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int getRowCountForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.mOrientation == 0) {
            return Math.min(this.mSpanCount, getItemCount());
        }
        if (state.getItemCount() < 1) {
            return 0;
        }
        return getSpanGroupIndex(state.getItemCount() - 1, recycler, state) + 1;
    }

    public final int getRowIndex(int i) {
        int i2 = this.mOrientation;
        RecyclerView recyclerView = this.mRecyclerView;
        return i2 == 1 ? getSpanGroupIndex(i, recyclerView.mRecycler, recyclerView.mState) : getSpanIndex(i, recyclerView.mRecycler, recyclerView.mState);
    }

    public final HashSet getRowIndices(int i) {
        return getRowOrColumnIndices(getRowIndex(i), i);
    }

    public final HashSet getRowOrColumnIndices(int i, int i2) {
        HashSet hashSet = new HashSet();
        RecyclerView recyclerView = this.mRecyclerView;
        int spanSize = getSpanSize(i2, recyclerView.mRecycler, recyclerView.mState);
        for (int i3 = i; i3 < i + spanSize; i3++) {
            hashSet.add(Integer.valueOf(i3));
        }
        return hashSet;
    }

    public final int getSpaceForSpanRange(int i, int i2) {
        if (this.mOrientation != 1 || !isLayoutRTL()) {
            int[] iArr = this.mCachedBorders;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.mCachedBorders;
        int i3 = this.mSpanCount;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    public final int getSpanGroupIndex(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        boolean z = state.mInPreLayout;
        CallResult callResult = this.mSpanSizeLookup;
        if (!z) {
            int i2 = this.mSpanCount;
            callResult.getClass();
            return CallResult.getSpanGroupIndex(i, i2);
        }
        int convertPreLayoutPositionToPostLayout = recycler.convertPreLayoutPositionToPostLayout(i);
        if (convertPreLayoutPositionToPostLayout != -1) {
            int i3 = this.mSpanCount;
            callResult.getClass();
            return CallResult.getSpanGroupIndex(convertPreLayoutPositionToPostLayout, i3);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    public final int getSpanIndex(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        boolean z = state.mInPreLayout;
        CallResult callResult = this.mSpanSizeLookup;
        if (!z) {
            int i2 = this.mSpanCount;
            callResult.getClass();
            return i % i2;
        }
        int i3 = this.mPreLayoutSpanIndexCache.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int convertPreLayoutPositionToPostLayout = recycler.convertPreLayoutPositionToPostLayout(i);
        if (convertPreLayoutPositionToPostLayout != -1) {
            int i4 = this.mSpanCount;
            callResult.getClass();
            return convertPreLayoutPositionToPostLayout % i4;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    public final int getSpanSize(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        boolean z = state.mInPreLayout;
        CallResult callResult = this.mSpanSizeLookup;
        if (!z) {
            callResult.getClass();
            return 1;
        }
        int i2 = this.mPreLayoutSpanSizeCache.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (recycler.convertPreLayoutPositionToPostLayout(i) != -1) {
            callResult.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x008a, code lost:
    
        r22.mFinished = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v20, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v31 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void layoutChunk(RecyclerView.Recycler recycler, RecyclerView.State state, LinearLayoutManager.LayoutState layoutState, LinearLayoutManager.LayoutChunkResult layoutChunkResult) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int childMeasureSpec;
        int i7;
        ?? r12;
        int i8;
        View next;
        int modeInOther = this.mOrientationHelper.getModeInOther();
        boolean z = modeInOther != 1073741824;
        int i9 = getChildCount() > 0 ? this.mCachedBorders[this.mSpanCount] : 0;
        if (z) {
            updateMeasurements();
        }
        boolean z2 = layoutState.mItemDirection == 1;
        int i10 = this.mSpanCount;
        if (!z2) {
            i10 = getSpanIndex(layoutState.mCurrentPosition, recycler, state) + getSpanSize(layoutState.mCurrentPosition, recycler, state);
        }
        int i11 = 0;
        while (i11 < this.mSpanCount && (i8 = layoutState.mCurrentPosition) >= 0 && i8 < state.getItemCount() && i10 > 0) {
            int i12 = layoutState.mCurrentPosition;
            int spanSize = getSpanSize(i12, recycler, state);
            if (spanSize > this.mSpanCount) {
                a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.mSpanCount, " spans.", Recorder$$ExternalSyntheticOutline2.m107m(i12, spanSize, "Item at position ", " requires ", " spans but GridLayoutManager has only ")));
                return;
            }
            i10 -= spanSize;
            if (i10 < 0 || (next = layoutState.next(recycler)) == null) {
                break;
            }
            this.mSet[i11] = next;
            i11++;
        }
        if (z2) {
            i3 = 1;
            i2 = i11;
            i = 0;
        } else {
            i = i11 - 1;
            i2 = -1;
            i3 = -1;
        }
        int i13 = 0;
        while (i != i2) {
            View view = this.mSet[i];
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int spanSize2 = getSpanSize(RecyclerView.LayoutManager.getPosition(view), recycler, state);
            layoutParams.mSpanSize = spanSize2;
            layoutParams.mSpanIndex = i13;
            i13 += spanSize2;
            i += i3;
        }
        float f = RecyclerView.DECELERATION_RATE;
        int i14 = 0;
        for (int i15 = 0; i15 < i11; i15++) {
            View view2 = this.mSet[i15];
            if (layoutState.mScrapList != null) {
                r12 = 0;
                r12 = 0;
                if (z2) {
                    addViewInt(view2, -1, true);
                } else {
                    addViewInt(view2, 0, true);
                }
            } else if (z2) {
                r12 = 0;
                addViewInt(view2, -1, false);
            } else {
                r12 = 0;
                addViewInt(view2, 0, false);
            }
            RecyclerView recyclerView = this.mRecyclerView;
            Rect rect = this.mDecorInsets;
            if (recyclerView == null) {
                rect.set(r12, r12, r12, r12);
            } else {
                rect.set(recyclerView.getItemDecorInsetsForChild(view2));
            }
            measureChild(view2, modeInOther, r12);
            int decoratedMeasurement = this.mOrientationHelper.getDecoratedMeasurement(view2);
            if (decoratedMeasurement > i14) {
                i14 = decoratedMeasurement;
            }
            float decoratedMeasurementInOther = (this.mOrientationHelper.getDecoratedMeasurementInOther(view2) * 1.0f) / ((LayoutParams) view2.getLayoutParams()).mSpanSize;
            if (decoratedMeasurementInOther > f) {
                f = decoratedMeasurementInOther;
            }
        }
        if (z) {
            calculateItemBorders(Math.max(Math.round(f * this.mSpanCount), i9));
            i14 = 0;
            for (int i16 = 0; i16 < i11; i16++) {
                View view3 = this.mSet[i16];
                measureChild(view3, 1073741824, true);
                int decoratedMeasurement2 = this.mOrientationHelper.getDecoratedMeasurement(view3);
                if (decoratedMeasurement2 > i14) {
                    i14 = decoratedMeasurement2;
                }
            }
        }
        for (int i17 = 0; i17 < i11; i17++) {
            View view4 = this.mSet[i17];
            if (this.mOrientationHelper.getDecoratedMeasurement(view4) != i14) {
                LayoutParams layoutParams2 = (LayoutParams) view4.getLayoutParams();
                Rect rect2 = layoutParams2.mDecorInsets;
                int i18 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                int i19 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                int spaceForSpanRange = getSpaceForSpanRange(layoutParams2.mSpanIndex, layoutParams2.mSpanSize);
                if (this.mOrientation == 1) {
                    i7 = RecyclerView.LayoutManager.getChildMeasureSpec(false, spaceForSpanRange, 1073741824, i19, ((ViewGroup.MarginLayoutParams) layoutParams2).width);
                    childMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14 - i18, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14 - i19, 1073741824);
                    childMeasureSpec = RecyclerView.LayoutManager.getChildMeasureSpec(false, spaceForSpanRange, 1073741824, i18, ((ViewGroup.MarginLayoutParams) layoutParams2).height);
                    i7 = makeMeasureSpec;
                }
                if (shouldReMeasureChild(view4, i7, childMeasureSpec, (RecyclerView.LayoutParams) view4.getLayoutParams())) {
                    view4.measure(i7, childMeasureSpec);
                }
            }
        }
        layoutChunkResult.mConsumed = i14;
        int i20 = this.mOrientation;
        int i21 = layoutState.mLayoutDirection;
        int i22 = layoutState.mOffset;
        if (i20 != 1) {
            if (i21 == -1) {
                i6 = i22 - i14;
                i5 = 0;
                i4 = i22;
            } else {
                i4 = i22 + i14;
                i5 = 0;
                i6 = i22;
            }
            i22 = i5;
        } else if (i21 == -1) {
            i5 = i22 - i14;
            i6 = 0;
            i4 = 0;
        } else {
            i4 = 0;
            i5 = i22;
            i22 += i14;
            i6 = 0;
        }
        int i23 = 0;
        while (true) {
            View[] viewArr = this.mSet;
            if (i23 >= i11) {
                Arrays.fill(viewArr, (Object) null);
                return;
            }
            View view5 = viewArr[i23];
            LayoutParams layoutParams3 = (LayoutParams) view5.getLayoutParams();
            if (this.mOrientation != 1) {
                i5 = getPaddingTop() + this.mCachedBorders[layoutParams3.mSpanIndex];
                i22 = this.mOrientationHelper.getDecoratedMeasurementInOther(view5) + i5;
            } else if (isLayoutRTL()) {
                int paddingLeft = getPaddingLeft() + this.mCachedBorders[this.mSpanCount - layoutParams3.mSpanIndex];
                i4 = paddingLeft;
                i6 = paddingLeft - this.mOrientationHelper.getDecoratedMeasurementInOther(view5);
            } else {
                i6 = getPaddingLeft() + this.mCachedBorders[layoutParams3.mSpanIndex];
                i4 = this.mOrientationHelper.getDecoratedMeasurementInOther(view5) + i6;
            }
            RecyclerView.LayoutManager.layoutDecoratedWithMargins(view5, i6, i5, i4, i22);
            if (layoutParams3.mViewHolder.isRemoved() || layoutParams3.mViewHolder.isUpdated()) {
                layoutChunkResult.mIgnoreConsumed = true;
            }
            layoutChunkResult.mFocusable = view5.hasFocusable() | layoutChunkResult.mFocusable;
            i23++;
        }
    }

    public final void measureChild(View view, int i, boolean z) {
        int i2;
        int i3;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect = layoutParams.mDecorInsets;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        int spaceForSpanRange = getSpaceForSpanRange(layoutParams.mSpanIndex, layoutParams.mSpanSize);
        if (this.mOrientation == 1) {
            i3 = RecyclerView.LayoutManager.getChildMeasureSpec(false, spaceForSpanRange, i, i5, ((ViewGroup.MarginLayoutParams) layoutParams).width);
            i2 = RecyclerView.LayoutManager.getChildMeasureSpec(true, this.mOrientationHelper.getTotalSpace(), this.mHeightMode, i4, ((ViewGroup.MarginLayoutParams) layoutParams).height);
        } else {
            int childMeasureSpec = RecyclerView.LayoutManager.getChildMeasureSpec(false, spaceForSpanRange, i, i4, ((ViewGroup.MarginLayoutParams) layoutParams).height);
            int childMeasureSpec2 = RecyclerView.LayoutManager.getChildMeasureSpec(true, this.mOrientationHelper.getTotalSpace(), this.mWidthMode, i5, ((ViewGroup.MarginLayoutParams) layoutParams).width);
            i2 = childMeasureSpec;
            i3 = childMeasureSpec2;
        }
        RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (z ? shouldReMeasureChild(view, i3, i2, layoutParams2) : shouldMeasureChild(view, i3, i2, layoutParams2)) {
            view.measure(i3, i2);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void onAnchorReady(RecyclerView.Recycler recycler, RecyclerView.State state, LinearLayoutManager.AnchorInfo anchorInfo, int i) {
        updateMeasurements();
        if (state.getItemCount() > 0 && !state.mInPreLayout) {
            boolean z = i == 1;
            int spanIndex = getSpanIndex(anchorInfo.mPosition, recycler, state);
            if (z) {
                while (spanIndex > 0) {
                    int i2 = anchorInfo.mPosition;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    anchorInfo.mPosition = i3;
                    spanIndex = getSpanIndex(i3, recycler, state);
                }
            } else {
                int itemCount = state.getItemCount() - 1;
                int i4 = anchorInfo.mPosition;
                while (i4 < itemCount) {
                    int i5 = i4 + 1;
                    int spanIndex2 = getSpanIndex(i5, recycler, state);
                    if (spanIndex2 <= spanIndex) {
                        break;
                    }
                    i4 = i5;
                    spanIndex = spanIndex2;
                }
                anchorInfo.mPosition = i4;
            }
        }
        ensureViewSet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e2, code lost:
    
        if (r13 == (r2 > r15)) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0107, code lost:
    
        if (r13 == (r2 > r8)) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0021, code lost:
    
        if (((java.util.ArrayList) r22.mChildHelper.currentThread).contains(r3) != false) goto L10;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View onFocusSearchFailed(View view, int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        View findContainingItemView;
        int childCount;
        int i2;
        int i3;
        View view2;
        View view3;
        int i4;
        int i5;
        RecyclerView.Recycler recycler2 = recycler;
        RecyclerView.State state2 = state;
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            findContainingItemView = recyclerView.findContainingItemView(view);
            if (findContainingItemView != null) {
            }
        }
        findContainingItemView = null;
        if (findContainingItemView != null) {
            LayoutParams layoutParams = (LayoutParams) findContainingItemView.getLayoutParams();
            int i6 = layoutParams.mSpanIndex;
            int i7 = layoutParams.mSpanSize + i6;
            if (super.onFocusSearchFailed(view, i, recycler, state) != null) {
                if ((convertFocusDirectionToLayoutDirection$1(i) == 1) != this.mShouldReverseLayout) {
                    i3 = getChildCount() - 1;
                    childCount = -1;
                    i2 = -1;
                } else {
                    childCount = getChildCount();
                    i2 = 1;
                    i3 = 0;
                }
                boolean z = this.mOrientation == 1 && isLayoutRTL();
                int spanGroupIndex = getSpanGroupIndex(i3, recycler2, state2);
                View view4 = null;
                int i8 = -1;
                int i9 = -1;
                int i10 = 0;
                int i11 = i3;
                int i12 = 0;
                View view5 = null;
                while (true) {
                    view2 = view5;
                    if (i11 == childCount) {
                        break;
                    }
                    int spanGroupIndex2 = getSpanGroupIndex(i11, recycler2, state2);
                    View childAt = getChildAt(i11);
                    if (childAt == findContainingItemView) {
                        break;
                    }
                    if (!childAt.hasFocusable() || spanGroupIndex2 == spanGroupIndex) {
                        LayoutParams layoutParams2 = (LayoutParams) childAt.getLayoutParams();
                        int i13 = layoutParams2.mSpanIndex;
                        view3 = findContainingItemView;
                        int i14 = layoutParams2.mSpanSize + i13;
                        if (childAt.hasFocusable() && i13 == i6 && i14 == i7) {
                            return childAt;
                        }
                        if (!(childAt.hasFocusable() && view4 == null) && (childAt.hasFocusable() || view2 != null)) {
                            i4 = childCount;
                            int min = Math.min(i14, i7) - Math.max(i13, i6);
                            if (childAt.hasFocusable()) {
                                if (min <= i10) {
                                    if (min == i10) {
                                    }
                                    i5 = i10;
                                }
                                i5 = i10;
                            } else {
                                if (view4 == null) {
                                    i5 = i10;
                                    if (!this.mHorizontalBoundCheck.isViewWithinBoundFlags(childAt) || !this.mVerticalBoundCheck.isViewWithinBoundFlags(childAt)) {
                                        if (min <= i12) {
                                            if (min == i12) {
                                            }
                                        }
                                    }
                                }
                                i5 = i10;
                            }
                        } else {
                            i5 = i10;
                            i4 = childCount;
                        }
                        boolean hasFocusable = childAt.hasFocusable();
                        int i15 = layoutParams2.mSpanIndex;
                        if (hasFocusable) {
                            i10 = Math.min(i14, i7) - Math.max(i13, i6);
                            view4 = childAt;
                            i9 = i15;
                            view5 = view2;
                        } else {
                            i12 = Math.min(i14, i7) - Math.max(i13, i6);
                            i8 = i15;
                            i10 = i5;
                            view5 = childAt;
                        }
                        i11 += i2;
                        recycler2 = recycler;
                        state2 = state;
                        findContainingItemView = view3;
                        childCount = i4;
                    } else {
                        if (view4 != null) {
                            break;
                        }
                        view3 = findContainingItemView;
                        i5 = i10;
                        i4 = childCount;
                    }
                    view5 = view2;
                    i10 = i5;
                    i11 += i2;
                    recycler2 = recycler;
                    state2 = state;
                    findContainingItemView = view3;
                    childCount = i4;
                }
                return view4 != null ? view4 : view2;
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onInitializeAccessibilityNodeInfo(RecyclerView.Recycler recycler, RecyclerView.State state, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(recycler, state, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.setClassName(GridView.class.getName());
        RecyclerView.Adapter adapter = this.mRecyclerView.mAdapter;
        if (adapter == null || adapter.getItemCount() <= 1) {
            return;
        }
        accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_IN_DIRECTION);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onInitializeAccessibilityNodeInfoForItem(RecyclerView.Recycler recycler, RecyclerView.State state, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            onInitializeAccessibilityNodeInfoForItem(view, accessibilityNodeInfoCompat);
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        int spanGroupIndex = getSpanGroupIndex(layoutParams2.mViewHolder.getLayoutPosition(), recycler, state);
        int i = this.mOrientation;
        int i2 = layoutParams2.mSpanIndex;
        int i3 = layoutParams2.mSpanSize;
        if (i == 0) {
            accessibilityNodeInfoCompat.setCollectionItemInfo(Recorder.AnonymousClass6.obtain(false, i2, i3, spanGroupIndex, 1));
        } else {
            accessibilityNodeInfoCompat.setCollectionItemInfo(Recorder.AnonymousClass6.obtain(false, spanGroupIndex, 1, i2, i3));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsAdded(int i, int i2) {
        CallResult callResult = this.mSpanSizeLookup;
        callResult.invalidateSpanIndexCache();
        ((SparseIntArray) callResult.serviceNames).clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsChanged() {
        CallResult callResult = this.mSpanSizeLookup;
        callResult.invalidateSpanIndexCache();
        ((SparseIntArray) callResult.serviceNames).clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsMoved(int i, int i2) {
        CallResult callResult = this.mSpanSizeLookup;
        callResult.invalidateSpanIndexCache();
        ((SparseIntArray) callResult.serviceNames).clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsRemoved(int i, int i2) {
        CallResult callResult = this.mSpanSizeLookup;
        callResult.invalidateSpanIndexCache();
        ((SparseIntArray) callResult.serviceNames).clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsUpdated(int i, int i2) {
        CallResult callResult = this.mSpanSizeLookup;
        callResult.invalidateSpanIndexCache();
        ((SparseIntArray) callResult.serviceNames).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        boolean z = state.mInPreLayout;
        SparseIntArray sparseIntArray = this.mPreLayoutSpanIndexCache;
        SparseIntArray sparseIntArray2 = this.mPreLayoutSpanSizeCache;
        if (z) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i).getLayoutParams();
                int layoutPosition = layoutParams.mViewHolder.getLayoutPosition();
                sparseIntArray2.put(layoutPosition, layoutParams.mSpanSize);
                sparseIntArray.put(layoutPosition, layoutParams.mSpanIndex);
            }
        }
        super.onLayoutChildren(recycler, state);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutCompleted(RecyclerView.State state) {
        View findViewByPosition;
        super.onLayoutCompleted(state);
        this.mPendingSpanCountChange = false;
        int i = this.mPositionTargetedByScrollInDirection;
        if (i == -1 || (findViewByPosition = findViewByPosition(i)) == null) {
            return;
        }
        findViewByPosition.sendAccessibilityEvent(67108864);
        this.mPositionTargetedByScrollInDirection = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0213  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        View view;
        RecyclerView.ViewHolder childViewHolder;
        int i2;
        int i3;
        if (i == AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_IN_DIRECTION.getId() && i != -1) {
            int i4 = 0;
            while (true) {
                if (i4 >= getChildCount()) {
                    view = null;
                    break;
                }
                View childAt = getChildAt(i4);
                Objects.requireNonNull(childAt);
                if (childAt.isAccessibilityFocused()) {
                    view = getChildAt(i4);
                    break;
                }
                i4++;
            }
            if (view != null && bundle != null) {
                int i5 = bundle.getInt("android.view.accessibility.action.ARGUMENT_DIRECTION_INT", -1);
                if (sSupportedDirectionsForActionScrollInDirection.contains(Integer.valueOf(i5)) && (childViewHolder = this.mRecyclerView.getChildViewHolder(view)) != null) {
                    int absoluteAdapterPosition = childViewHolder.getAbsoluteAdapterPosition();
                    int rowIndex = getRowIndex(absoluteAdapterPosition);
                    int columnIndex = getColumnIndex(absoluteAdapterPosition);
                    if (rowIndex >= 0 && columnIndex >= 0) {
                        if (!getRowIndices(absoluteAdapterPosition).contains(Integer.valueOf(this.mRowWithAccessibilityFocus)) || !getRowOrColumnIndices(getColumnIndex(absoluteAdapterPosition), absoluteAdapterPosition).contains(Integer.valueOf(this.mColumnWithAccessibilityFocus))) {
                            this.mRowWithAccessibilityFocus = rowIndex;
                            this.mColumnWithAccessibilityFocus = columnIndex;
                        }
                        int i6 = this.mRowWithAccessibilityFocus;
                        if (i6 == -1) {
                            i6 = rowIndex;
                        }
                        int i7 = this.mColumnWithAccessibilityFocus;
                        if (i7 != -1) {
                            columnIndex = i7;
                        }
                        if (i5 == 17) {
                            i2 = absoluteAdapterPosition - 1;
                            while (i2 >= 0) {
                                int rowIndex2 = getRowIndex(i2);
                                int columnIndex2 = getColumnIndex(i2);
                                if (rowIndex2 < 0 || columnIndex2 < 0) {
                                    break;
                                }
                                if (this.mOrientation != 1) {
                                    if (getRowIndices(i2).contains(Integer.valueOf(i6)) && columnIndex2 < columnIndex) {
                                        this.mColumnWithAccessibilityFocus = columnIndex2;
                                        break;
                                    }
                                    i2--;
                                } else {
                                    if ((rowIndex2 == i6 && columnIndex2 < columnIndex) || rowIndex2 < i6) {
                                        this.mRowWithAccessibilityFocus = rowIndex2;
                                        this.mColumnWithAccessibilityFocus = columnIndex2;
                                        break;
                                    }
                                    i2--;
                                }
                            }
                            i2 = -1;
                            if (i2 == -1) {
                            }
                            if (i2 != -1) {
                            }
                        } else if (i5 == 33) {
                            i2 = absoluteAdapterPosition - 1;
                            while (i2 >= 0) {
                                int rowIndex3 = getRowIndex(i2);
                                int columnIndex3 = getColumnIndex(i2);
                                if (rowIndex3 < 0 || columnIndex3 < 0) {
                                    break;
                                }
                                if (this.mOrientation == 1) {
                                    if (rowIndex3 < i6 && getRowOrColumnIndices(getColumnIndex(i2), i2).contains(Integer.valueOf(columnIndex))) {
                                        this.mRowWithAccessibilityFocus = rowIndex3;
                                        break;
                                    }
                                    i2--;
                                } else {
                                    if (rowIndex3 < i6 && columnIndex3 == columnIndex) {
                                        this.mRowWithAccessibilityFocus = ((Integer) Collections.max(getRowIndices(i2))).intValue();
                                        break;
                                    }
                                    i2--;
                                }
                            }
                            i2 = -1;
                            if (i2 == -1) {
                            }
                            if (i2 != -1) {
                            }
                        } else if (i5 == 66) {
                            i2 = absoluteAdapterPosition + 1;
                            while (i2 < getItemCount()) {
                                int rowIndex4 = getRowIndex(i2);
                                int columnIndex4 = getColumnIndex(i2);
                                if (rowIndex4 < 0 || columnIndex4 < 0) {
                                    break;
                                }
                                if (this.mOrientation != 1) {
                                    if (columnIndex4 > columnIndex && getRowIndices(i2).contains(Integer.valueOf(i6))) {
                                        this.mColumnWithAccessibilityFocus = columnIndex4;
                                        break;
                                    }
                                    i2++;
                                } else {
                                    if ((rowIndex4 == i6 && columnIndex4 > columnIndex) || rowIndex4 > i6) {
                                        this.mRowWithAccessibilityFocus = rowIndex4;
                                        this.mColumnWithAccessibilityFocus = columnIndex4;
                                        break;
                                    }
                                    i2++;
                                }
                            }
                            i2 = -1;
                            if (i2 == -1) {
                                if (i5 != 17) {
                                }
                            }
                            if (i2 != -1) {
                            }
                        } else if (i5 == 130) {
                            i2 = absoluteAdapterPosition + 1;
                            while (i2 < getItemCount()) {
                                int rowIndex5 = getRowIndex(i2);
                                int columnIndex5 = getColumnIndex(i2);
                                if (rowIndex5 < 0 || columnIndex5 < 0) {
                                    break;
                                }
                                if (this.mOrientation == 1) {
                                    if (rowIndex5 > i6 && (columnIndex5 == columnIndex || getRowOrColumnIndices(getColumnIndex(i2), i2).contains(Integer.valueOf(columnIndex)))) {
                                        this.mRowWithAccessibilityFocus = rowIndex5;
                                        break;
                                    }
                                    i2++;
                                } else {
                                    if (rowIndex5 > i6 && columnIndex5 == columnIndex) {
                                        this.mRowWithAccessibilityFocus = getRowIndex(i2);
                                        break;
                                    }
                                    i2++;
                                }
                            }
                            i2 = -1;
                            if (i2 == -1 && (i3 = this.mOrientation) == 0) {
                                if (i5 != 17) {
                                    if (rowIndex >= 0 && i3 != 1) {
                                        TreeMap treeMap = new TreeMap(Collections.reverseOrder());
                                        int i8 = 0;
                                        loop2: while (true) {
                                            if (i8 >= getItemCount()) {
                                                for (Integer num : treeMap.keySet()) {
                                                    int intValue = num.intValue();
                                                    if (intValue < rowIndex) {
                                                        i2 = ((Integer) treeMap.get(num)).intValue();
                                                        this.mRowWithAccessibilityFocus = intValue;
                                                        this.mColumnWithAccessibilityFocus = getColumnIndex(i2);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                Iterator it = getRowIndices(i8).iterator();
                                                while (it.hasNext()) {
                                                    Integer num2 = (Integer) it.next();
                                                    if (num2.intValue() < 0) {
                                                        break loop2;
                                                    }
                                                    treeMap.put(num2, Integer.valueOf(i8));
                                                }
                                                i8++;
                                            }
                                        }
                                    }
                                    i2 = -1;
                                } else if (i5 == 66) {
                                    if (rowIndex >= 0 && i3 != 1) {
                                        TreeMap treeMap2 = new TreeMap();
                                        int i9 = 0;
                                        loop5: while (true) {
                                            if (i9 >= getItemCount()) {
                                                for (Integer num3 : treeMap2.keySet()) {
                                                    int intValue2 = num3.intValue();
                                                    if (intValue2 > rowIndex) {
                                                        i2 = ((Integer) treeMap2.get(num3)).intValue();
                                                        this.mRowWithAccessibilityFocus = intValue2;
                                                        this.mColumnWithAccessibilityFocus = 0;
                                                        break;
                                                    }
                                                }
                                            } else {
                                                Iterator it2 = getRowIndices(i9).iterator();
                                                while (it2.hasNext()) {
                                                    Integer num4 = (Integer) it2.next();
                                                    if (num4.intValue() < 0) {
                                                        break loop5;
                                                    }
                                                    if (!treeMap2.containsKey(num4)) {
                                                        treeMap2.put(num4, Integer.valueOf(i9));
                                                    }
                                                }
                                                i9++;
                                            }
                                        }
                                    }
                                    i2 = -1;
                                }
                            }
                            if (i2 != -1) {
                                scrollToPosition(i2);
                                this.mPositionTargetedByScrollInDirection = i2;
                                return true;
                            }
                        }
                    }
                }
            }
        } else {
            if (i != 16908343 || bundle == null) {
                return super.performAccessibilityAction(i, bundle);
            }
            int i10 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
            int i11 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
            if (i10 != -1 && i11 != -1) {
                int itemCount = this.mRecyclerView.mAdapter.getItemCount();
                int i12 = 0;
                while (true) {
                    if (i12 >= itemCount) {
                        i12 = -1;
                        break;
                    }
                    RecyclerView recyclerView = this.mRecyclerView;
                    int spanIndex = getSpanIndex(i12, recyclerView.mRecycler, recyclerView.mState);
                    RecyclerView recyclerView2 = this.mRecyclerView;
                    int spanGroupIndex = getSpanGroupIndex(i12, recyclerView2.mRecycler, recyclerView2.mState);
                    if (this.mOrientation == 1) {
                        if (spanIndex == i11 && spanGroupIndex == i10) {
                            break;
                        }
                        i12++;
                    } else {
                        if (spanIndex == i10 && spanGroupIndex == i11) {
                            break;
                        }
                        i12++;
                    }
                }
                if (i12 > -1) {
                    scrollToPositionWithOffset(i12, 0);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        updateMeasurements();
        ensureViewSet();
        return super.scrollHorizontallyBy(i, recycler, state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        updateMeasurements();
        ensureViewSet();
        return super.scrollVerticallyBy(i, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void setMeasuredDimension(Rect rect, int i, int i2) {
        int chooseSize;
        int chooseSize2;
        if (this.mCachedBorders == null) {
            super.setMeasuredDimension(rect, i, i2);
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.mOrientation == 1) {
            int height = rect.height() + paddingBottom;
            RecyclerView recyclerView = this.mRecyclerView;
            WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
            chooseSize2 = RecyclerView.LayoutManager.chooseSize(i2, height, recyclerView.getMinimumHeight());
            int[] iArr = this.mCachedBorders;
            chooseSize = RecyclerView.LayoutManager.chooseSize(i, iArr[iArr.length - 1] + paddingRight, this.mRecyclerView.getMinimumWidth());
        } else {
            int width = rect.width() + paddingRight;
            RecyclerView recyclerView2 = this.mRecyclerView;
            WeakHashMap weakHashMap2 = ViewCompat.sViewPropertyAnimatorMap;
            chooseSize = RecyclerView.LayoutManager.chooseSize(i, width, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.mCachedBorders;
            chooseSize2 = RecyclerView.LayoutManager.chooseSize(i2, iArr2[iArr2.length - 1] + paddingBottom, this.mRecyclerView.getMinimumHeight());
        }
        this.mRecyclerView.setMeasuredDimension(chooseSize, chooseSize2);
    }

    public final void setSpanCount(int i) {
        if (i == this.mSpanCount) {
            return;
        }
        this.mPendingSpanCountChange = true;
        if (i < 1) {
            a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Span count should be at least 1. Provided "));
            return;
        }
        this.mSpanCount = i;
        this.mSpanSizeLookup.invalidateSpanIndexCache();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void setStackFromEnd(boolean z) {
        if (z) {
            a$$ExternalSyntheticBUOutline0.m("GridLayoutManager does not support stack from end. Consider using reverse layout");
        } else {
            super.setStackFromEnd(false);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && !this.mPendingSpanCountChange;
    }

    public final void updateMeasurements() {
        int paddingBottom;
        int paddingTop;
        if (this.mOrientation == 1) {
            paddingBottom = this.mWidth - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            paddingBottom = this.mHeight - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        calculateItemBorders(paddingBottom - paddingTop);
    }

    public static class LayoutParams extends RecyclerView.LayoutParams {
        public int mSpanIndex;
        public int mSpanSize;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.mSpanIndex = -1;
            this.mSpanSize = 0;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.mSpanIndex = -1;
            this.mSpanSize = 0;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    public GridLayoutManager(Context context, int i) {
        super(context);
        this.mPendingSpanCountChange = false;
        this.mSpanCount = -1;
        this.mPreLayoutSpanSizeCache = new SparseIntArray();
        this.mPreLayoutSpanIndexCache = new SparseIntArray();
        this.mSpanSizeLookup = new CallResult(12);
        this.mDecorInsets = new Rect();
        this.mPositionTargetedByScrollInDirection = -1;
        this.mRowWithAccessibilityFocus = -1;
        this.mColumnWithAccessibilityFocus = -1;
        setSpanCount(i);
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        this.mPendingSpanCountChange = false;
        this.mSpanCount = -1;
        this.mPreLayoutSpanSizeCache = new SparseIntArray();
        this.mPreLayoutSpanIndexCache = new SparseIntArray();
        this.mSpanSizeLookup = new CallResult(12);
        this.mDecorInsets = new Rect();
        this.mPositionTargetedByScrollInDirection = -1;
        this.mRowWithAccessibilityFocus = -1;
        this.mColumnWithAccessibilityFocus = -1;
        setSpanCount(i);
    }
}
