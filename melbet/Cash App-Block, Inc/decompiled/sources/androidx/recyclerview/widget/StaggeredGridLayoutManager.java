package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.camera.video.Recorder;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.fragment.app.FragmentState;
import androidx.media3.common.util.CircularIntArray;
import androidx.recyclerview.widget.FastScroller;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public class StaggeredGridLayoutManager extends RecyclerView.LayoutManager implements RecyclerView.SmoothScroller.ScrollVectorProvider {
    public final AnchorInfo mAnchorInfo;
    public final FastScroller.AnonymousClass1 mCheckForGapsRunnable;
    public final int mGapStrategy;
    public boolean mLastLayoutFromEnd;
    public boolean mLastLayoutRTL;
    public final LayoutState mLayoutState;
    public final LazySpanLookup mLazySpanLookup;
    public final int mOrientation;
    public SavedState mPendingSavedState;
    public int[] mPrefetchDistances;
    public final OrientationHelper mPrimaryOrientation;
    public final BitSet mRemainingSpans;
    public boolean mReverseLayout;
    public final OrientationHelper mSecondaryOrientation;
    public int mSizePerSpan;
    public final boolean mSmoothScrollbarEnabled;
    public final int mSpanCount;
    public final Span[] mSpans;
    public final Rect mTmpRect;
    public boolean mShouldReverseLayout = false;
    public int mPendingScrollPosition = -1;
    public int mPendingScrollPositionOffset = PKIFailureInfo.systemUnavail;

    public final class AnchorInfo {
        public boolean mInvalidateOffsets;
        public boolean mLayoutFromEnd;
        public int mOffset;
        public int mPosition;
        public int[] mSpanReferenceLines;
        public boolean mValid;

        public AnchorInfo() {
            reset();
        }

        public final void reset() {
            this.mPosition = -1;
            this.mOffset = PKIFailureInfo.systemUnavail;
            this.mLayoutFromEnd = false;
            this.mInvalidateOffsets = false;
            this.mValid = false;
            int[] iArr = this.mSpanReferenceLines;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    public static class LayoutParams extends RecyclerView.LayoutParams {
        public Span mSpan;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public final class LazySpanLookup {
        public int[] mData;
        public ArrayList mFullSpanItems;

        public final class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new FragmentState.AnonymousClass1(21);
            public int mGapDir;
            public int[] mGapPerSpan;
            public boolean mHasUnwantedGapAfter;
            public int mPosition;

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final String toString() {
                return "FullSpanItem{mPosition=" + this.mPosition + ", mGapDir=" + this.mGapDir + ", mHasUnwantedGapAfter=" + this.mHasUnwantedGapAfter + ", mGapPerSpan=" + Arrays.toString(this.mGapPerSpan) + '}';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.mPosition);
                parcel.writeInt(this.mGapDir);
                parcel.writeInt(this.mHasUnwantedGapAfter ? 1 : 0);
                int[] iArr = this.mGapPerSpan;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.mGapPerSpan);
                }
            }
        }

        public final void clear() {
            int[] iArr = this.mData;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.mFullSpanItems = null;
        }

        public final void ensureSize(int i) {
            int[] iArr = this.mData;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i, 10) + 1];
                this.mData = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int length = iArr.length;
                while (length <= i) {
                    length *= 2;
                }
                int[] iArr3 = new int[length];
                this.mData = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.mData;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        public final void offsetForAddition(int i, int i2) {
            int[] iArr = this.mData;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            ensureSize(i3);
            int[] iArr2 = this.mData;
            System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
            Arrays.fill(this.mData, i, i3, -1);
            ArrayList arrayList = this.mFullSpanItems;
            if (arrayList == null) {
                return;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.mFullSpanItems.get(size);
                int i4 = fullSpanItem.mPosition;
                if (i4 >= i) {
                    fullSpanItem.mPosition = i4 + i2;
                }
            }
        }

        public final void offsetForRemoval(int i, int i2) {
            int[] iArr = this.mData;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            ensureSize(i3);
            int[] iArr2 = this.mData;
            System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
            int[] iArr3 = this.mData;
            Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
            ArrayList arrayList = this.mFullSpanItems;
            if (arrayList == null) {
                return;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.mFullSpanItems.get(size);
                int i4 = fullSpanItem.mPosition;
                if (i4 >= i) {
                    if (i4 < i3) {
                        this.mFullSpanItems.remove(size);
                    } else {
                        fullSpanItem.mPosition = i4 - i2;
                    }
                }
            }
        }
    }

    public final class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new FragmentState.AnonymousClass1(22);
        public boolean mAnchorLayoutFromEnd;
        public int mAnchorPosition;
        public ArrayList mFullSpanItems;
        public boolean mLastLayoutRTL;
        public boolean mReverseLayout;
        public int[] mSpanLookup;
        public int mSpanLookupSize;
        public int[] mSpanOffsets;
        public int mSpanOffsetsSize;
        public int mVisibleAnchorPosition;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.mAnchorPosition);
            parcel.writeInt(this.mVisibleAnchorPosition);
            parcel.writeInt(this.mSpanOffsetsSize);
            if (this.mSpanOffsetsSize > 0) {
                parcel.writeIntArray(this.mSpanOffsets);
            }
            parcel.writeInt(this.mSpanLookupSize);
            if (this.mSpanLookupSize > 0) {
                parcel.writeIntArray(this.mSpanLookup);
            }
            parcel.writeInt(this.mReverseLayout ? 1 : 0);
            parcel.writeInt(this.mAnchorLayoutFromEnd ? 1 : 0);
            parcel.writeInt(this.mLastLayoutRTL ? 1 : 0);
            parcel.writeList(this.mFullSpanItems);
        }
    }

    public final class Span {
        public final int mIndex;
        public final ArrayList mViews = new ArrayList();
        public int mCachedStart = PKIFailureInfo.systemUnavail;
        public int mCachedEnd = PKIFailureInfo.systemUnavail;
        public int mDeletedSize = 0;

        public Span(int i) {
            this.mIndex = i;
        }

        public final void calculateCachedEnd() {
            View view = (View) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(1, this.mViews);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            this.mCachedEnd = StaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedEnd(view);
            layoutParams.getClass();
        }

        public final void clear() {
            this.mViews.clear();
            this.mCachedStart = PKIFailureInfo.systemUnavail;
            this.mCachedEnd = PKIFailureInfo.systemUnavail;
            this.mDeletedSize = 0;
        }

        public final int findFirstPartiallyVisibleItemPosition() {
            return StaggeredGridLayoutManager.this.mReverseLayout ? findOnePartiallyVisibleChild(r1.size() - 1, -1) : findOnePartiallyVisibleChild(0, this.mViews.size());
        }

        public final int findLastPartiallyVisibleItemPosition() {
            return StaggeredGridLayoutManager.this.mReverseLayout ? findOnePartiallyVisibleChild(0, this.mViews.size()) : findOnePartiallyVisibleChild(r1.size() - 1, -1);
        }

        public final int findOnePartiallyVisibleChild(int i, int i2) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            int startAfterPadding = staggeredGridLayoutManager.mPrimaryOrientation.getStartAfterPadding();
            int endAfterPadding = staggeredGridLayoutManager.mPrimaryOrientation.getEndAfterPadding();
            int i3 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = (View) this.mViews.get(i);
                int decoratedStart = staggeredGridLayoutManager.mPrimaryOrientation.getDecoratedStart(view);
                int decoratedEnd = staggeredGridLayoutManager.mPrimaryOrientation.getDecoratedEnd(view);
                boolean z = decoratedStart <= endAfterPadding;
                boolean z2 = decoratedEnd >= startAfterPadding;
                if (z && z2 && (decoratedStart < startAfterPadding || decoratedEnd > endAfterPadding)) {
                    return RecyclerView.LayoutManager.getPosition(view);
                }
                i += i3;
            }
            return -1;
        }

        public final int getEndLine(int i) {
            int i2 = this.mCachedEnd;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.mViews.size() == 0) {
                return i;
            }
            calculateCachedEnd();
            return this.mCachedEnd;
        }

        public final View getFocusableViewAfter(int i, int i2) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            View view = null;
            ArrayList arrayList = this.mViews;
            if (i2 != -1) {
                int size = arrayList.size() - 1;
                while (size >= 0) {
                    View view2 = (View) arrayList.get(size);
                    if ((staggeredGridLayoutManager.mReverseLayout && RecyclerView.LayoutManager.getPosition(view2) >= i) || ((!staggeredGridLayoutManager.mReverseLayout && RecyclerView.LayoutManager.getPosition(view2) <= i) || !view2.hasFocusable())) {
                        break;
                    }
                    size--;
                    view = view2;
                }
                return view;
            }
            int size2 = arrayList.size();
            int i3 = 0;
            while (i3 < size2) {
                View view3 = (View) arrayList.get(i3);
                if ((staggeredGridLayoutManager.mReverseLayout && RecyclerView.LayoutManager.getPosition(view3) <= i) || ((!staggeredGridLayoutManager.mReverseLayout && RecyclerView.LayoutManager.getPosition(view3) >= i) || !view3.hasFocusable())) {
                    break;
                }
                i3++;
                view = view3;
            }
            return view;
        }

        public final int getStartLine(int i) {
            int i2 = this.mCachedStart;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            ArrayList arrayList = this.mViews;
            if (arrayList.size() == 0) {
                return i;
            }
            View view = (View) arrayList.get(0);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            this.mCachedStart = StaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedStart(view);
            layoutParams.getClass();
            return this.mCachedStart;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.mSpanCount = -1;
        this.mReverseLayout = false;
        LazySpanLookup lazySpanLookup = new LazySpanLookup();
        this.mLazySpanLookup = lazySpanLookup;
        this.mGapStrategy = 2;
        this.mTmpRect = new Rect();
        this.mAnchorInfo = new AnchorInfo();
        this.mSmoothScrollbarEnabled = true;
        this.mCheckForGapsRunnable = new FastScroller.AnonymousClass1(this, 2);
        RecyclerView.LayoutManager.Properties properties = RecyclerView.LayoutManager.getProperties(context, attributeSet, i, i2);
        int i3 = properties.orientation;
        if (i3 != 0 && i3 != 1) {
            a$$ExternalSyntheticBUOutline0.m$3("invalid orientation.");
            throw null;
        }
        assertNotInLayoutOrScroll(null);
        if (i3 != this.mOrientation) {
            this.mOrientation = i3;
            OrientationHelper orientationHelper = this.mPrimaryOrientation;
            this.mPrimaryOrientation = this.mSecondaryOrientation;
            this.mSecondaryOrientation = orientationHelper;
            requestLayout();
        }
        int i4 = properties.spanCount;
        assertNotInLayoutOrScroll(null);
        if (i4 != this.mSpanCount) {
            lazySpanLookup.clear();
            requestLayout();
            this.mSpanCount = i4;
            this.mRemainingSpans = new BitSet(this.mSpanCount);
            this.mSpans = new Span[this.mSpanCount];
            for (int i5 = 0; i5 < this.mSpanCount; i5++) {
                this.mSpans[i5] = new Span(i5);
            }
            requestLayout();
        }
        boolean z = properties.reverseLayout;
        assertNotInLayoutOrScroll(null);
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null && savedState.mReverseLayout != z) {
            savedState.mReverseLayout = z;
        }
        this.mReverseLayout = z;
        requestLayout();
        LayoutState layoutState = new LayoutState();
        layoutState.mRecycle = true;
        layoutState.mStartLine = 0;
        layoutState.mEndLine = 0;
        this.mLayoutState = layoutState;
        this.mPrimaryOrientation = OrientationHelper.createOrientationHelper(this, this.mOrientation);
        this.mSecondaryOrientation = OrientationHelper.createOrientationHelper(this, 1 - this.mOrientation);
    }

    public static int updateSpecWithExtra(int i, int i2, int i3) {
        int mode;
        return (!(i2 == 0 && i3 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollHorizontally() {
        return this.mOrientation == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollVertically() {
        return this.mOrientation == 1;
    }

    public final boolean checkForGaps() {
        int firstChildPosition;
        if (getChildCount() != 0 && this.mGapStrategy != 0 && this.mIsAttachedToWindow) {
            if (this.mShouldReverseLayout) {
                firstChildPosition = getLastChildPosition();
                getFirstChildPosition();
            } else {
                firstChildPosition = getFirstChildPosition();
                getLastChildPosition();
            }
            if (firstChildPosition == 0 && hasGapsToFix() != null) {
                this.mLazySpanLookup.clear();
                this.mRequestedSimpleAnimations = true;
                requestLayout();
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void collectAdjacentPrefetchPositions(int i, int i2, RecyclerView.State state, CircularIntArray circularIntArray) {
        LayoutState layoutState;
        int endLine;
        if (this.mOrientation != 0) {
            i = i2;
        }
        if (getChildCount() == 0 || i == 0) {
            return;
        }
        prepareLayoutStateForDelta(i, state);
        int[] iArr = this.mPrefetchDistances;
        int i3 = this.mSpanCount;
        if (iArr == null || iArr.length < i3) {
            this.mPrefetchDistances = new int[i3];
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            layoutState = this.mLayoutState;
            if (i4 >= i3) {
                break;
            }
            int i6 = layoutState.mItemDirection;
            Span[] spanArr = this.mSpans;
            if (i6 == -1) {
                int i7 = layoutState.mStartLine;
                endLine = i7 - spanArr[i4].getStartLine(i7);
            } else {
                endLine = spanArr[i4].getEndLine(layoutState.mEndLine) - layoutState.mEndLine;
            }
            if (endLine >= 0) {
                this.mPrefetchDistances[i5] = endLine;
                i5++;
            }
            i4++;
        }
        Arrays.sort(this.mPrefetchDistances, 0, i5);
        for (int i8 = 0; i8 < i5; i8++) {
            int i9 = layoutState.mCurrentPosition;
            if (i9 < 0 || i9 >= state.getItemCount()) {
                return;
            }
            circularIntArray.addPosition(layoutState.mCurrentPosition, this.mPrefetchDistances[i8]);
            layoutState.mCurrentPosition += layoutState.mItemDirection;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollExtent(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z = !this.mSmoothScrollbarEnabled;
        return DiffUtil.computeScrollExtent(state, this.mPrimaryOrientation, findFirstVisibleItemClosestToStart(z), findFirstVisibleItemClosestToEnd(z), this, this.mSmoothScrollbarEnabled);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollOffset(RecyclerView.State state) {
        return computeScrollOffset$1(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollRange(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z = !this.mSmoothScrollbarEnabled;
        return DiffUtil.computeScrollRange(state, this.mPrimaryOrientation, findFirstVisibleItemClosestToStart(z), findFirstVisibleItemClosestToEnd(z), this, this.mSmoothScrollbarEnabled);
    }

    public final int computeScrollOffset$1(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z = !this.mSmoothScrollbarEnabled;
        return DiffUtil.computeScrollOffset(state, this.mPrimaryOrientation, findFirstVisibleItemClosestToStart(z), findFirstVisibleItemClosestToEnd(z), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0019, code lost:
    
        if ((r4 < getFirstChildPosition()) != r3.mShouldReverseLayout) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r3.mShouldReverseLayout != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
    
        r1 = 1;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PointF computeScrollVectorForPosition(int i) {
        int i2 = -1;
        if (getChildCount() == 0) {
        }
        PointF pointF = new PointF();
        if (i2 == 0) {
            return null;
        }
        if (this.mOrientation == 0) {
            pointF.x = i2;
            pointF.y = RecyclerView.DECELERATION_RATE;
            return pointF;
        }
        pointF.x = RecyclerView.DECELERATION_RATE;
        pointF.y = i2;
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollExtent(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z = !this.mSmoothScrollbarEnabled;
        return DiffUtil.computeScrollExtent(state, this.mPrimaryOrientation, findFirstVisibleItemClosestToStart(z), findFirstVisibleItemClosestToEnd(z), this, this.mSmoothScrollbarEnabled);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollOffset(RecyclerView.State state) {
        return computeScrollOffset$1(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollRange(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z = !this.mSmoothScrollbarEnabled;
        return DiffUtil.computeScrollRange(state, this.mPrimaryOrientation, findFirstVisibleItemClosestToStart(z), findFirstVisibleItemClosestToEnd(z), this, this.mSmoothScrollbarEnabled);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0262, code lost:
    
        recycle(r1, r7);
     */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int fill(RecyclerView.Recycler recycler, LayoutState layoutState, RecyclerView.State state) {
        Span[] spanArr;
        BitSet bitSet;
        int i;
        Span[] spanArr2;
        Span span;
        ?? r5;
        int startLine;
        int decoratedMeasurement;
        int i2;
        int i3;
        BitSet bitSet2;
        int i4;
        int i5;
        RecyclerView.Recycler recycler2 = recycler;
        BitSet bitSet3 = this.mRemainingSpans;
        int i6 = this.mSpanCount;
        bitSet3.set(0, i6, true);
        LayoutState layoutState2 = this.mLayoutState;
        int i7 = layoutState2.mInfinite ? layoutState.mLayoutDirection == 1 ? Integer.MAX_VALUE : PKIFailureInfo.systemUnavail : layoutState.mLayoutDirection == 1 ? layoutState.mEndLine + layoutState.mAvailable : layoutState.mStartLine - layoutState.mAvailable;
        int i8 = layoutState.mLayoutDirection;
        int i9 = 0;
        while (true) {
            spanArr = this.mSpans;
            if (i9 >= i6) {
                break;
            }
            if (!spanArr[i9].mViews.isEmpty()) {
                updateRemainingSpans(spanArr[i9], i8, i7);
            }
            i9++;
        }
        boolean z = this.mShouldReverseLayout;
        OrientationHelper orientationHelper = this.mPrimaryOrientation;
        int endAfterPadding = z ? orientationHelper.getEndAfterPadding() : orientationHelper.getStartAfterPadding();
        boolean z2 = false;
        while (true) {
            int i10 = layoutState.mCurrentPosition;
            if (i10 < 0 || i10 >= state.getItemCount() || (!layoutState2.mInfinite && bitSet3.isEmpty())) {
                break;
            }
            View viewForPosition = recycler2.getViewForPosition(layoutState.mCurrentPosition);
            layoutState.mCurrentPosition += layoutState.mItemDirection;
            LayoutParams layoutParams = (LayoutParams) viewForPosition.getLayoutParams();
            int layoutPosition = layoutParams.mViewHolder.getLayoutPosition();
            LazySpanLookup lazySpanLookup = this.mLazySpanLookup;
            int[] iArr = lazySpanLookup.mData;
            int i11 = (iArr == null || layoutPosition >= iArr.length) ? -1 : iArr[layoutPosition];
            if (i11 == -1) {
                if (preferLastSpan(layoutState.mLayoutDirection)) {
                    i = i6;
                    i5 = i6 - 1;
                    i6 = -1;
                    i4 = -1;
                } else {
                    i = i6;
                    i4 = 1;
                    i5 = 0;
                }
                Span span2 = null;
                int i12 = i4;
                if (layoutState.mLayoutDirection == 1) {
                    int startAfterPadding = orientationHelper.getStartAfterPadding();
                    spanArr2 = spanArr;
                    int i13 = i5;
                    int i14 = Integer.MAX_VALUE;
                    while (i13 != i6) {
                        int i15 = i13;
                        Span span3 = spanArr2[i15];
                        BitSet bitSet4 = bitSet3;
                        int endLine = span3.getEndLine(startAfterPadding);
                        if (endLine < i14) {
                            i14 = endLine;
                            span2 = span3;
                        }
                        i13 = i15 + i12;
                        bitSet3 = bitSet4;
                    }
                    bitSet = bitSet3;
                } else {
                    bitSet = bitSet3;
                    spanArr2 = spanArr;
                    int endAfterPadding2 = orientationHelper.getEndAfterPadding();
                    int i16 = i5;
                    int i17 = PKIFailureInfo.systemUnavail;
                    while (i16 != i6) {
                        Span span4 = spanArr2[i16];
                        int i18 = i6;
                        int startLine2 = span4.getStartLine(endAfterPadding2);
                        if (startLine2 > i17) {
                            i17 = startLine2;
                            span2 = span4;
                        }
                        i16 += i12;
                        i6 = i18;
                    }
                }
                span = span2;
                lazySpanLookup.ensureSize(layoutPosition);
                lazySpanLookup.mData[layoutPosition] = span.mIndex;
            } else {
                bitSet = bitSet3;
                i = i6;
                spanArr2 = spanArr;
                span = spanArr2[i11];
            }
            layoutParams.mSpan = span;
            if (layoutState.mLayoutDirection == 1) {
                r5 = 0;
                addViewInt(viewForPosition, -1, false);
            } else {
                r5 = 0;
                addViewInt(viewForPosition, 0, false);
            }
            int i19 = this.mOrientation;
            if (i19 == 1) {
                measureChildWithDecorationsAndMargin$1(viewForPosition, RecyclerView.LayoutManager.getChildMeasureSpec(r5, this.mSizePerSpan, this.mWidthMode, r5, ((ViewGroup.MarginLayoutParams) layoutParams).width), RecyclerView.LayoutManager.getChildMeasureSpec(true, this.mHeight, this.mHeightMode, getPaddingBottom() + getPaddingTop(), ((ViewGroup.MarginLayoutParams) layoutParams).height));
            } else {
                measureChildWithDecorationsAndMargin$1(viewForPosition, RecyclerView.LayoutManager.getChildMeasureSpec(true, this.mWidth, this.mWidthMode, getPaddingRight() + getPaddingLeft(), ((ViewGroup.MarginLayoutParams) layoutParams).width), RecyclerView.LayoutManager.getChildMeasureSpec(false, this.mSizePerSpan, this.mHeightMode, 0, ((ViewGroup.MarginLayoutParams) layoutParams).height));
            }
            if (layoutState.mLayoutDirection == 1) {
                decoratedMeasurement = span.getEndLine(endAfterPadding);
                startLine = orientationHelper.getDecoratedMeasurement(viewForPosition) + decoratedMeasurement;
            } else {
                startLine = span.getStartLine(endAfterPadding);
                decoratedMeasurement = startLine - orientationHelper.getDecoratedMeasurement(viewForPosition);
            }
            int i20 = layoutState.mLayoutDirection;
            Span span5 = layoutParams.mSpan;
            if (i20 == 1) {
                span5.getClass();
                LayoutParams layoutParams2 = (LayoutParams) viewForPosition.getLayoutParams();
                layoutParams2.mSpan = span5;
                ArrayList arrayList = span5.mViews;
                arrayList.add(viewForPosition);
                span5.mCachedEnd = PKIFailureInfo.systemUnavail;
                if (arrayList.size() == 1) {
                    span5.mCachedStart = PKIFailureInfo.systemUnavail;
                }
                if (layoutParams2.mViewHolder.isRemoved() || layoutParams2.mViewHolder.isUpdated()) {
                    span5.mDeletedSize = StaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedMeasurement(viewForPosition) + span5.mDeletedSize;
                }
            } else {
                span5.getClass();
                LayoutParams layoutParams3 = (LayoutParams) viewForPosition.getLayoutParams();
                layoutParams3.mSpan = span5;
                ArrayList arrayList2 = span5.mViews;
                arrayList2.add(0, viewForPosition);
                span5.mCachedStart = PKIFailureInfo.systemUnavail;
                if (arrayList2.size() == 1) {
                    span5.mCachedEnd = PKIFailureInfo.systemUnavail;
                }
                if (layoutParams3.mViewHolder.isRemoved() || layoutParams3.mViewHolder.isUpdated()) {
                    span5.mDeletedSize = StaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedMeasurement(viewForPosition) + span5.mDeletedSize;
                }
            }
            boolean isLayoutRTL = isLayoutRTL();
            OrientationHelper orientationHelper2 = this.mSecondaryOrientation;
            if (isLayoutRTL && i19 == 1) {
                i3 = orientationHelper2.getEndAfterPadding() - (((i - 1) - span.mIndex) * this.mSizePerSpan);
                i2 = i3 - orientationHelper2.getDecoratedMeasurement(viewForPosition);
            } else {
                int startAfterPadding2 = (span.mIndex * this.mSizePerSpan) + orientationHelper2.getStartAfterPadding();
                int decoratedMeasurement2 = orientationHelper2.getDecoratedMeasurement(viewForPosition) + startAfterPadding2;
                i2 = startAfterPadding2;
                i3 = decoratedMeasurement2;
            }
            z2 = true;
            if (i19 == 1) {
                RecyclerView.LayoutManager.layoutDecoratedWithMargins(viewForPosition, i2, decoratedMeasurement, i3, startLine);
            } else {
                RecyclerView.LayoutManager.layoutDecoratedWithMargins(viewForPosition, decoratedMeasurement, i2, startLine, i3);
            }
            updateRemainingSpans(span, layoutState2.mLayoutDirection, i7);
            recycler2 = recycler;
            recycle(recycler2, layoutState2);
            if (layoutState2.mStopInFocusable && viewForPosition.hasFocusable()) {
                bitSet2 = bitSet;
                bitSet2.set(span.mIndex, false);
            } else {
                bitSet2 = bitSet;
            }
            bitSet3 = bitSet2;
            i6 = i;
            spanArr = spanArr2;
        }
        int startAfterPadding3 = layoutState2.mLayoutDirection == -1 ? orientationHelper.getStartAfterPadding() - getMinStart(orientationHelper.getStartAfterPadding()) : getMaxEnd(orientationHelper.getEndAfterPadding()) - orientationHelper.getEndAfterPadding();
        if (startAfterPadding3 > 0) {
            return Math.min(layoutState.mAvailable, startAfterPadding3);
        }
        return 0;
    }

    public final View findFirstVisibleItemClosestToEnd(boolean z) {
        OrientationHelper orientationHelper = this.mPrimaryOrientation;
        int startAfterPadding = orientationHelper.getStartAfterPadding();
        int endAfterPadding = orientationHelper.getEndAfterPadding();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int decoratedStart = orientationHelper.getDecoratedStart(childAt);
            int decoratedEnd = orientationHelper.getDecoratedEnd(childAt);
            if (decoratedEnd > startAfterPadding && decoratedStart < endAfterPadding) {
                if (decoratedEnd <= endAfterPadding || !z) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    public final View findFirstVisibleItemClosestToStart(boolean z) {
        OrientationHelper orientationHelper = this.mPrimaryOrientation;
        int startAfterPadding = orientationHelper.getStartAfterPadding();
        int endAfterPadding = orientationHelper.getEndAfterPadding();
        int childCount = getChildCount();
        View view = null;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int decoratedStart = orientationHelper.getDecoratedStart(childAt);
            if (orientationHelper.getDecoratedEnd(childAt) > startAfterPadding && decoratedStart < endAfterPadding) {
                if (decoratedStart >= startAfterPadding || !z) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    public final void fixEndGap(RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
        int endAfterPadding;
        int maxEnd = getMaxEnd(PKIFailureInfo.systemUnavail);
        if (maxEnd != Integer.MIN_VALUE && (endAfterPadding = this.mPrimaryOrientation.getEndAfterPadding() - maxEnd) > 0) {
            int i = endAfterPadding - (-scrollBy$1(-endAfterPadding, recycler, state));
            if (!z || i <= 0) {
                return;
            }
            this.mPrimaryOrientation.offsetChildren(i);
        }
    }

    public final void fixStartGap(RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
        int startAfterPadding;
        int minStart = getMinStart(Integer.MAX_VALUE);
        if (minStart != Integer.MAX_VALUE && (startAfterPadding = minStart - this.mPrimaryOrientation.getStartAfterPadding()) > 0) {
            int scrollBy$1 = startAfterPadding - scrollBy$1(startAfterPadding, recycler, state);
            if (!z || scrollBy$1 <= 0) {
                return;
            }
            this.mPrimaryOrientation.offsetChildren(-scrollBy$1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return this.mOrientation == 0 ? new LayoutParams(-2, -1) : new LayoutParams(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int getColumnCountForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.mOrientation == 1) {
            return Math.min(this.mSpanCount, state.getItemCount());
        }
        return -1;
    }

    public final int getFirstChildPosition() {
        if (getChildCount() == 0) {
            return 0;
        }
        return RecyclerView.LayoutManager.getPosition(getChildAt(0));
    }

    public final int getLastChildPosition() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return RecyclerView.LayoutManager.getPosition(getChildAt(childCount - 1));
    }

    public final int getMaxEnd(int i) {
        int endLine = this.mSpans[0].getEndLine(i);
        for (int i2 = 1; i2 < this.mSpanCount; i2++) {
            int endLine2 = this.mSpans[i2].getEndLine(i);
            if (endLine2 > endLine) {
                endLine = endLine2;
            }
        }
        return endLine;
    }

    public final int getMinStart(int i) {
        int startLine = this.mSpans[0].getStartLine(i);
        for (int i2 = 1; i2 < this.mSpanCount; i2++) {
            int startLine2 = this.mSpans[i2].getStartLine(i);
            if (startLine2 < startLine) {
                startLine = startLine2;
            }
        }
        return startLine;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int getRowCountForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.mOrientation == 0) {
            return Math.min(this.mSpanCount, state.getItemCount());
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleUpdate(int i, int i2, int i3) {
        int i4;
        int i5;
        LazySpanLookup lazySpanLookup;
        int[] iArr;
        ArrayList arrayList;
        LazySpanLookup.FullSpanItem fullSpanItem;
        int i6;
        int lastChildPosition = this.mShouldReverseLayout ? getLastChildPosition() : getFirstChildPosition();
        if (i3 != 8) {
            i4 = i + i2;
        } else {
            if (i >= i2) {
                i4 = i + 1;
                i5 = i2;
                lazySpanLookup = this.mLazySpanLookup;
                iArr = lazySpanLookup.mData;
                if (iArr != null && i5 < iArr.length) {
                    arrayList = lazySpanLookup.mFullSpanItems;
                    if (arrayList != null) {
                        int size = arrayList.size() - 1;
                        while (true) {
                            if (size < 0) {
                                fullSpanItem = null;
                                break;
                            }
                            fullSpanItem = (LazySpanLookup.FullSpanItem) lazySpanLookup.mFullSpanItems.get(size);
                            if (fullSpanItem.mPosition == i5) {
                                break;
                            } else {
                                size--;
                            }
                        }
                        if (fullSpanItem != null) {
                            lazySpanLookup.mFullSpanItems.remove(fullSpanItem);
                        }
                        int size2 = lazySpanLookup.mFullSpanItems.size();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= size2) {
                                i7 = -1;
                                break;
                            } else if (((LazySpanLookup.FullSpanItem) lazySpanLookup.mFullSpanItems.get(i7)).mPosition >= i5) {
                                break;
                            } else {
                                i7++;
                            }
                        }
                        if (i7 != -1) {
                            LazySpanLookup.FullSpanItem fullSpanItem2 = (LazySpanLookup.FullSpanItem) lazySpanLookup.mFullSpanItems.get(i7);
                            lazySpanLookup.mFullSpanItems.remove(i7);
                            i6 = fullSpanItem2.mPosition;
                            int[] iArr2 = lazySpanLookup.mData;
                            if (i6 == -1) {
                                Arrays.fill(iArr2, i5, iArr2.length, -1);
                                int length = lazySpanLookup.mData.length;
                            } else {
                                Arrays.fill(lazySpanLookup.mData, i5, Math.min(i6 + 1, iArr2.length), -1);
                            }
                        }
                    }
                    i6 = -1;
                    int[] iArr22 = lazySpanLookup.mData;
                    if (i6 == -1) {
                    }
                }
                if (i3 != 1) {
                    lazySpanLookup.offsetForAddition(i, i2);
                } else if (i3 == 2) {
                    lazySpanLookup.offsetForRemoval(i, i2);
                } else if (i3 == 8) {
                    lazySpanLookup.offsetForRemoval(i, 1);
                    lazySpanLookup.offsetForAddition(i2, 1);
                }
                if (i4 > lastChildPosition) {
                    return;
                }
                if (i5 <= (this.mShouldReverseLayout ? getFirstChildPosition() : getLastChildPosition())) {
                    requestLayout();
                    return;
                }
                return;
            }
            i4 = i2 + 1;
        }
        i5 = i;
        lazySpanLookup = this.mLazySpanLookup;
        iArr = lazySpanLookup.mData;
        if (iArr != null) {
            arrayList = lazySpanLookup.mFullSpanItems;
            if (arrayList != null) {
            }
            i6 = -1;
            int[] iArr222 = lazySpanLookup.mData;
            if (i6 == -1) {
            }
        }
        if (i3 != 1) {
        }
        if (i4 > lastChildPosition) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x002a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View hasGapsToFix() {
        int childCount = getChildCount();
        int i = childCount - 1;
        int i2 = this.mSpanCount;
        BitSet bitSet = new BitSet(i2);
        bitSet.set(0, i2, true);
        char c = (this.mOrientation == 1 && isLayoutRTL()) ? (char) 1 : (char) 65535;
        if (this.mShouldReverseLayout) {
            childCount = -1;
        } else {
            i = 0;
        }
        int i3 = i < childCount ? 1 : -1;
        while (i != childCount) {
            View childAt = getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            boolean z = bitSet.get(layoutParams.mSpan.mIndex);
            OrientationHelper orientationHelper = this.mPrimaryOrientation;
            if (z) {
                Span span = layoutParams.mSpan;
                if (this.mShouldReverseLayout) {
                    int i4 = span.mCachedEnd;
                    if (i4 == Integer.MIN_VALUE) {
                        span.calculateCachedEnd();
                        i4 = span.mCachedEnd;
                    }
                    if (i4 < orientationHelper.getEndAfterPadding()) {
                        ((LayoutParams) ((View) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(1, span.mViews)).getLayoutParams()).getClass();
                        return childAt;
                    }
                } else {
                    int i5 = span.mCachedStart;
                    ArrayList arrayList = span.mViews;
                    if (i5 == Integer.MIN_VALUE) {
                        View view = (View) arrayList.get(0);
                        LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
                        span.mCachedStart = StaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedStart(view);
                        layoutParams2.getClass();
                        i5 = span.mCachedStart;
                    }
                    if (i5 > orientationHelper.getStartAfterPadding()) {
                        ((LayoutParams) ((View) arrayList.get(0)).getLayoutParams()).getClass();
                        return childAt;
                    }
                }
                bitSet.clear(layoutParams.mSpan.mIndex);
            }
            i += i3;
            if (i != childCount) {
                View childAt2 = getChildAt(i);
                if (this.mShouldReverseLayout) {
                    int decoratedEnd = orientationHelper.getDecoratedEnd(childAt);
                    int decoratedEnd2 = orientationHelper.getDecoratedEnd(childAt2);
                    if (decoratedEnd < decoratedEnd2) {
                        return childAt;
                    }
                    if (decoratedEnd == decoratedEnd2) {
                        if ((layoutParams.mSpan.mIndex - ((LayoutParams) childAt2.getLayoutParams()).mSpan.mIndex >= 0) == (c >= 0)) {
                            return childAt;
                        }
                    } else {
                        continue;
                    }
                } else {
                    int decoratedStart = orientationHelper.getDecoratedStart(childAt);
                    int decoratedStart2 = orientationHelper.getDecoratedStart(childAt2);
                    if (decoratedStart > decoratedStart2) {
                        return childAt;
                    }
                    if (decoratedStart == decoratedStart2) {
                        if ((layoutParams.mSpan.mIndex - ((LayoutParams) childAt2.getLayoutParams()).mSpan.mIndex >= 0) == (c >= 0)) {
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean isAutoMeasureEnabled() {
        return this.mGapStrategy != 0;
    }

    public final boolean isLayoutRTL() {
        return this.mRecyclerView.getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean isLayoutReversed() {
        return this.mReverseLayout;
    }

    public final void measureChildWithDecorationsAndMargin$1(View view, int i, int i2) {
        RecyclerView recyclerView = this.mRecyclerView;
        Rect rect = this.mTmpRect;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.getItemDecorInsetsForChild(view));
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int updateSpecWithExtra = updateSpecWithExtra(i, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + rect.right);
        int updateSpecWithExtra2 = updateSpecWithExtra(i2, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + rect.bottom);
        if (shouldMeasureChild(view, updateSpecWithExtra, updateSpecWithExtra2, layoutParams)) {
            view.measure(updateSpecWithExtra, updateSpecWithExtra2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void offsetChildrenHorizontal(int i) {
        super.offsetChildrenHorizontal(i);
        for (int i2 = 0; i2 < this.mSpanCount; i2++) {
            Span span = this.mSpans[i2];
            int i3 = span.mCachedStart;
            if (i3 != Integer.MIN_VALUE) {
                span.mCachedStart = i3 + i;
            }
            int i4 = span.mCachedEnd;
            if (i4 != Integer.MIN_VALUE) {
                span.mCachedEnd = i4 + i;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void offsetChildrenVertical(int i) {
        super.offsetChildrenVertical(i);
        for (int i2 = 0; i2 < this.mSpanCount; i2++) {
            Span span = this.mSpans[i2];
            int i3 = span.mCachedStart;
            if (i3 != Integer.MIN_VALUE) {
                span.mCachedStart = i3 + i;
            }
            int i4 = span.mCachedEnd;
            if (i4 != Integer.MIN_VALUE) {
                span.mCachedEnd = i4 + i;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onAdapterChanged() {
        this.mLazySpanLookup.clear();
        for (int i = 0; i < this.mSpanCount; i++) {
            this.mSpans[i].clear();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onDetachedFromWindow(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.mRecyclerView;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.mCheckForGapsRunnable);
        }
        for (int i = 0; i < this.mSpanCount; i++) {
            this.mSpans[i].clear();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x004d, code lost:
    
        if (r0 == 1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0051, code lost:
    
        if (r0 == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x005b, code lost:
    
        if (isLayoutRTL() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0065, code lost:
    
        if (isLayoutRTL() == false) goto L34;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View onFocusSearchFailed(View view, int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        View view2;
        int i2;
        if (getChildCount() != 0) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (view2 = recyclerView.findContainingItemView(view)) == null || ((ArrayList) this.mChildHelper.currentThread).contains(view2)) {
                view2 = null;
            }
            if (view2 != null) {
                resolveShouldLayoutReverse$1();
                int i3 = this.mOrientation;
                if (i == 1) {
                    if (i3 != 1) {
                    }
                    i2 = -1;
                } else if (i == 2) {
                    if (i3 != 1) {
                    }
                    i2 = 1;
                } else if (i != 17) {
                    if (i != 33) {
                        if (i == 66) {
                        }
                    }
                    i2 = Integer.MIN_VALUE;
                }
                if (i2 != Integer.MIN_VALUE) {
                    LayoutParams layoutParams = (LayoutParams) view2.getLayoutParams();
                    layoutParams.getClass();
                    Span span = layoutParams.mSpan;
                    int lastChildPosition = i2 == 1 ? getLastChildPosition() : getFirstChildPosition();
                    updateLayoutState(lastChildPosition, state);
                    setLayoutStateDirection(i2);
                    LayoutState layoutState = this.mLayoutState;
                    layoutState.mCurrentPosition = layoutState.mItemDirection + lastChildPosition;
                    layoutState.mAvailable = (int) (this.mPrimaryOrientation.getTotalSpace() * 0.33333334f);
                    layoutState.mStopInFocusable = true;
                    layoutState.mRecycle = false;
                    fill(recycler, layoutState, state);
                    this.mLastLayoutFromEnd = this.mShouldReverseLayout;
                    View focusableViewAfter = span.getFocusableViewAfter(lastChildPosition, i2);
                    if (focusableViewAfter != null && focusableViewAfter != view2) {
                        return focusableViewAfter;
                    }
                    boolean preferLastSpan = preferLastSpan(i2);
                    Span[] spanArr = this.mSpans;
                    int i4 = this.mSpanCount;
                    if (preferLastSpan) {
                        for (int i5 = i4 - 1; i5 >= 0; i5--) {
                            View focusableViewAfter2 = spanArr[i5].getFocusableViewAfter(lastChildPosition, i2);
                            if (focusableViewAfter2 != null && focusableViewAfter2 != view2) {
                                return focusableViewAfter2;
                            }
                        }
                    } else {
                        for (int i6 = 0; i6 < i4; i6++) {
                            View focusableViewAfter3 = spanArr[i6].getFocusableViewAfter(lastChildPosition, i2);
                            if (focusableViewAfter3 != null && focusableViewAfter3 != view2) {
                                return focusableViewAfter3;
                            }
                        }
                    }
                    boolean z = (this.mReverseLayout ^ true) == (i2 == -1);
                    View findViewByPosition = findViewByPosition(z ? span.findFirstPartiallyVisibleItemPosition() : span.findLastPartiallyVisibleItemPosition());
                    if (findViewByPosition != null && findViewByPosition != view2) {
                        return findViewByPosition;
                    }
                    if (preferLastSpan(i2)) {
                        for (int i7 = i4 - 1; i7 >= 0; i7--) {
                            if (i7 != span.mIndex) {
                                View findViewByPosition2 = findViewByPosition(z ? spanArr[i7].findFirstPartiallyVisibleItemPosition() : spanArr[i7].findLastPartiallyVisibleItemPosition());
                                if (findViewByPosition2 != null && findViewByPosition2 != view2) {
                                    return findViewByPosition2;
                                }
                            }
                        }
                    } else {
                        for (int i8 = 0; i8 < i4; i8++) {
                            View findViewByPosition3 = findViewByPosition(z ? spanArr[i8].findFirstPartiallyVisibleItemPosition() : spanArr[i8].findLastPartiallyVisibleItemPosition());
                            if (findViewByPosition3 != null && findViewByPosition3 != view2) {
                                return findViewByPosition3;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            View findFirstVisibleItemClosestToStart = findFirstVisibleItemClosestToStart(false);
            View findFirstVisibleItemClosestToEnd = findFirstVisibleItemClosestToEnd(false);
            if (findFirstVisibleItemClosestToStart == null || findFirstVisibleItemClosestToEnd == null) {
                return;
            }
            int position = RecyclerView.LayoutManager.getPosition(findFirstVisibleItemClosestToStart);
            int position2 = RecyclerView.LayoutManager.getPosition(findFirstVisibleItemClosestToEnd);
            if (position < position2) {
                accessibilityEvent.setFromIndex(position);
                accessibilityEvent.setToIndex(position2);
            } else {
                accessibilityEvent.setFromIndex(position2);
                accessibilityEvent.setToIndex(position);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onInitializeAccessibilityNodeInfo(RecyclerView.Recycler recycler, RecyclerView.State state, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(recycler, state, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.setClassName("androidx.recyclerview.widget.StaggeredGridLayoutManager");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onInitializeAccessibilityNodeInfoForItem(RecyclerView.Recycler recycler, RecyclerView.State state, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            onInitializeAccessibilityNodeInfoForItem(view, accessibilityNodeInfoCompat);
            return;
        }
        Span span = ((LayoutParams) layoutParams).mSpan;
        if (this.mOrientation == 0) {
            accessibilityNodeInfoCompat.setCollectionItemInfo(Recorder.AnonymousClass6.obtain(false, span == null ? -1 : span.mIndex, 1, -1, -1));
        } else {
            accessibilityNodeInfoCompat.setCollectionItemInfo(Recorder.AnonymousClass6.obtain(false, -1, -1, span == null ? -1 : span.mIndex, 1));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsAdded(int i, int i2) {
        handleUpdate(i, i2, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsChanged() {
        this.mLazySpanLookup.clear();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsMoved(int i, int i2) {
        handleUpdate(i, i2, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsRemoved(int i, int i2) {
        handleUpdate(i, i2, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsUpdated(int i, int i2) {
        handleUpdate(i, i2, 4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x018b, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0187, code lost:
    
        if ((r4 < getFirstChildPosition()) != r17.mShouldReverseLayout) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0179, code lost:
    
        if (r17.mShouldReverseLayout != false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0189, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:261:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:267:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
        int i;
        boolean z2;
        boolean z3;
        SavedState savedState;
        int i2;
        boolean z4;
        int i3;
        boolean z5;
        SavedState savedState2 = this.mPendingSavedState;
        AnchorInfo anchorInfo = this.mAnchorInfo;
        if (!(savedState2 == null && this.mPendingScrollPosition == -1) && state.getItemCount() == 0) {
            removeAndRecycleAllViews(recycler);
            anchorInfo.reset();
            return;
        }
        boolean z6 = anchorInfo.mValid;
        StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
        boolean z7 = (z6 && this.mPendingScrollPosition == -1 && this.mPendingSavedState == null) ? false : true;
        Span[] spanArr = this.mSpans;
        int i4 = this.mSpanCount;
        LazySpanLookup lazySpanLookup = this.mLazySpanLookup;
        if (z7) {
            anchorInfo.reset();
            SavedState savedState3 = this.mPendingSavedState;
            OrientationHelper orientationHelper = this.mPrimaryOrientation;
            if (savedState3 != null) {
                int i5 = savedState3.mSpanOffsetsSize;
                if (i5 > 0) {
                    if (i5 == i4) {
                        for (int i6 = 0; i6 < i4; i6++) {
                            spanArr[i6].clear();
                            SavedState savedState4 = this.mPendingSavedState;
                            int i7 = savedState4.mSpanOffsets[i6];
                            if (i7 != Integer.MIN_VALUE) {
                                i7 += savedState4.mAnchorLayoutFromEnd ? orientationHelper.getEndAfterPadding() : orientationHelper.getStartAfterPadding();
                            }
                            Span span = spanArr[i6];
                            span.mCachedStart = i7;
                            span.mCachedEnd = i7;
                        }
                    } else {
                        savedState3.mSpanOffsets = null;
                        savedState3.mSpanOffsetsSize = 0;
                        savedState3.mSpanLookupSize = 0;
                        savedState3.mSpanLookup = null;
                        savedState3.mFullSpanItems = null;
                        savedState3.mAnchorPosition = savedState3.mVisibleAnchorPosition;
                    }
                }
                SavedState savedState5 = this.mPendingSavedState;
                this.mLastLayoutRTL = savedState5.mLastLayoutRTL;
                boolean z8 = savedState5.mReverseLayout;
                assertNotInLayoutOrScroll(null);
                SavedState savedState6 = this.mPendingSavedState;
                if (savedState6 != null && savedState6.mReverseLayout != z8) {
                    savedState6.mReverseLayout = z8;
                }
                this.mReverseLayout = z8;
                requestLayout();
                resolveShouldLayoutReverse$1();
                SavedState savedState7 = this.mPendingSavedState;
                int i8 = savedState7.mAnchorPosition;
                if (i8 != -1) {
                    this.mPendingScrollPosition = i8;
                    anchorInfo.mLayoutFromEnd = savedState7.mAnchorLayoutFromEnd;
                } else {
                    anchorInfo.mLayoutFromEnd = this.mShouldReverseLayout;
                }
                if (savedState7.mSpanLookupSize > 1) {
                    lazySpanLookup.mData = savedState7.mSpanLookup;
                    lazySpanLookup.mFullSpanItems = savedState7.mFullSpanItems;
                }
            } else {
                resolveShouldLayoutReverse$1();
                anchorInfo.mLayoutFromEnd = this.mShouldReverseLayout;
            }
            if (!state.mInPreLayout && (i3 = this.mPendingScrollPosition) != -1) {
                if (i3 < 0 || i3 >= state.getItemCount()) {
                    this.mPendingScrollPosition = -1;
                    this.mPendingScrollPositionOffset = PKIFailureInfo.systemUnavail;
                } else {
                    SavedState savedState8 = this.mPendingSavedState;
                    if (savedState8 == null || savedState8.mAnchorPosition == -1 || savedState8.mSpanOffsetsSize < 1) {
                        View findViewByPosition = findViewByPosition(this.mPendingScrollPosition);
                        if (findViewByPosition != null) {
                            anchorInfo.mPosition = this.mShouldReverseLayout ? getLastChildPosition() : getFirstChildPosition();
                            if (this.mPendingScrollPositionOffset != Integer.MIN_VALUE) {
                                if (anchorInfo.mLayoutFromEnd) {
                                    anchorInfo.mOffset = (orientationHelper.getEndAfterPadding() - this.mPendingScrollPositionOffset) - orientationHelper.getDecoratedEnd(findViewByPosition);
                                } else {
                                    anchorInfo.mOffset = (orientationHelper.getStartAfterPadding() + this.mPendingScrollPositionOffset) - orientationHelper.getDecoratedStart(findViewByPosition);
                                }
                            } else if (orientationHelper.getDecoratedMeasurement(findViewByPosition) > orientationHelper.getTotalSpace()) {
                                anchorInfo.mOffset = anchorInfo.mLayoutFromEnd ? orientationHelper.getEndAfterPadding() : orientationHelper.getStartAfterPadding();
                            } else {
                                int decoratedStart = orientationHelper.getDecoratedStart(findViewByPosition) - orientationHelper.getStartAfterPadding();
                                if (decoratedStart < 0) {
                                    anchorInfo.mOffset = -decoratedStart;
                                } else {
                                    int endAfterPadding = orientationHelper.getEndAfterPadding() - orientationHelper.getDecoratedEnd(findViewByPosition);
                                    if (endAfterPadding < 0) {
                                        anchorInfo.mOffset = endAfterPadding;
                                    } else {
                                        anchorInfo.mOffset = PKIFailureInfo.systemUnavail;
                                    }
                                }
                            }
                        } else {
                            int i9 = this.mPendingScrollPosition;
                            anchorInfo.mPosition = i9;
                            int i10 = this.mPendingScrollPositionOffset;
                            if (i10 == Integer.MIN_VALUE) {
                                if (getChildCount() == 0) {
                                }
                                anchorInfo.mLayoutFromEnd = z5;
                                OrientationHelper orientationHelper2 = staggeredGridLayoutManager.mPrimaryOrientation;
                                anchorInfo.mOffset = z5 ? orientationHelper2.getEndAfterPadding() : orientationHelper2.getStartAfterPadding();
                            } else {
                                boolean z9 = anchorInfo.mLayoutFromEnd;
                                OrientationHelper orientationHelper3 = staggeredGridLayoutManager.mPrimaryOrientation;
                                if (z9) {
                                    anchorInfo.mOffset = orientationHelper3.getEndAfterPadding() - i10;
                                } else {
                                    anchorInfo.mOffset = orientationHelper3.getStartAfterPadding() + i10;
                                }
                            }
                            z4 = true;
                            anchorInfo.mInvalidateOffsets = true;
                            anchorInfo.mValid = z4;
                        }
                    } else {
                        anchorInfo.mOffset = PKIFailureInfo.systemUnavail;
                        anchorInfo.mPosition = this.mPendingScrollPosition;
                    }
                    z4 = true;
                    anchorInfo.mValid = z4;
                }
            }
            if (this.mLastLayoutFromEnd) {
                int itemCount = state.getItemCount();
                for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    i2 = RecyclerView.LayoutManager.getPosition(getChildAt(childCount));
                    if (i2 >= 0 && i2 < itemCount) {
                        break;
                    }
                }
                i2 = 0;
                anchorInfo.mPosition = i2;
                anchorInfo.mOffset = PKIFailureInfo.systemUnavail;
                z4 = true;
                anchorInfo.mValid = z4;
            } else {
                int itemCount2 = state.getItemCount();
                int childCount2 = getChildCount();
                for (int i11 = 0; i11 < childCount2; i11++) {
                    int position = RecyclerView.LayoutManager.getPosition(getChildAt(i11));
                    if (position >= 0 && position < itemCount2) {
                        i2 = position;
                        break;
                    }
                }
                i2 = 0;
                anchorInfo.mPosition = i2;
                anchorInfo.mOffset = PKIFailureInfo.systemUnavail;
                z4 = true;
                anchorInfo.mValid = z4;
            }
        }
        if (this.mPendingSavedState == null && this.mPendingScrollPosition == -1 && !(anchorInfo.mLayoutFromEnd == this.mLastLayoutFromEnd && isLayoutRTL() == this.mLastLayoutRTL)) {
            lazySpanLookup.clear();
            i = 1;
            anchorInfo.mInvalidateOffsets = true;
        } else {
            i = 1;
        }
        if (getChildCount() > 0 && ((savedState = this.mPendingSavedState) == null || savedState.mSpanOffsetsSize < i)) {
            if (anchorInfo.mInvalidateOffsets) {
                for (int i12 = 0; i12 < i4; i12++) {
                    spanArr[i12].clear();
                    int i13 = anchorInfo.mOffset;
                    if (i13 != Integer.MIN_VALUE) {
                        Span span2 = spanArr[i12];
                        span2.mCachedStart = i13;
                        span2.mCachedEnd = i13;
                    }
                }
            } else if (z7 || anchorInfo.mSpanReferenceLines == null) {
                for (int i14 = 0; i14 < i4; i14++) {
                    Span span3 = spanArr[i14];
                    boolean z10 = this.mShouldReverseLayout;
                    int i15 = anchorInfo.mOffset;
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    int endLine = z10 ? span3.getEndLine(PKIFailureInfo.systemUnavail) : span3.getStartLine(PKIFailureInfo.systemUnavail);
                    span3.clear();
                    if (endLine != Integer.MIN_VALUE && ((!z10 || endLine >= staggeredGridLayoutManager2.mPrimaryOrientation.getEndAfterPadding()) && (z10 || endLine <= staggeredGridLayoutManager2.mPrimaryOrientation.getStartAfterPadding()))) {
                        if (i15 != Integer.MIN_VALUE) {
                            endLine += i15;
                        }
                        span3.mCachedEnd = endLine;
                        span3.mCachedStart = endLine;
                    }
                }
                int length = spanArr.length;
                int[] iArr = anchorInfo.mSpanReferenceLines;
                if (iArr == null || iArr.length < length) {
                    anchorInfo.mSpanReferenceLines = new int[staggeredGridLayoutManager.mSpans.length];
                }
                for (int i16 = 0; i16 < length; i16++) {
                    anchorInfo.mSpanReferenceLines[i16] = spanArr[i16].getStartLine(PKIFailureInfo.systemUnavail);
                }
            } else {
                for (int i17 = 0; i17 < i4; i17++) {
                    Span span4 = spanArr[i17];
                    span4.clear();
                    int i18 = anchorInfo.mSpanReferenceLines[i17];
                    span4.mCachedStart = i18;
                    span4.mCachedEnd = i18;
                }
            }
        }
        detachAndScrapAttachedViews(recycler);
        LayoutState layoutState = this.mLayoutState;
        layoutState.mRecycle = false;
        OrientationHelper orientationHelper4 = this.mSecondaryOrientation;
        int totalSpace = orientationHelper4.getTotalSpace();
        this.mSizePerSpan = totalSpace / i4;
        View.MeasureSpec.makeMeasureSpec(totalSpace, orientationHelper4.getMode());
        updateLayoutState(anchorInfo.mPosition, state);
        if (anchorInfo.mLayoutFromEnd) {
            setLayoutStateDirection(-1);
            fill(recycler, layoutState, state);
            setLayoutStateDirection(1);
            layoutState.mCurrentPosition = anchorInfo.mPosition + layoutState.mItemDirection;
            fill(recycler, layoutState, state);
        } else {
            setLayoutStateDirection(1);
            fill(recycler, layoutState, state);
            setLayoutStateDirection(-1);
            layoutState.mCurrentPosition = anchorInfo.mPosition + layoutState.mItemDirection;
            fill(recycler, layoutState, state);
        }
        if (orientationHelper4.getMode() != 1073741824) {
            int childCount3 = getChildCount();
            float f = RecyclerView.DECELERATION_RATE;
            for (int i19 = 0; i19 < childCount3; i19++) {
                View childAt = getChildAt(i19);
                float decoratedMeasurement = orientationHelper4.getDecoratedMeasurement(childAt);
                if (decoratedMeasurement >= f) {
                    ((LayoutParams) childAt.getLayoutParams()).getClass();
                    f = Math.max(f, decoratedMeasurement);
                }
            }
            int i20 = this.mSizePerSpan;
            int round = Math.round(f * i4);
            if (orientationHelper4.getMode() == Integer.MIN_VALUE) {
                round = Math.min(round, orientationHelper4.getTotalSpace());
            }
            this.mSizePerSpan = round / i4;
            View.MeasureSpec.makeMeasureSpec(round, orientationHelper4.getMode());
            if (this.mSizePerSpan != i20) {
                for (int i21 = 0; i21 < childCount3; i21++) {
                    View childAt2 = getChildAt(i21);
                    LayoutParams layoutParams = (LayoutParams) childAt2.getLayoutParams();
                    layoutParams.getClass();
                    boolean isLayoutRTL = isLayoutRTL();
                    int i22 = this.mOrientation;
                    if (isLayoutRTL && i22 == 1) {
                        int i23 = -((i4 - 1) - layoutParams.mSpan.mIndex);
                        childAt2.offsetLeftAndRight((this.mSizePerSpan * i23) - (i23 * i20));
                    } else {
                        int i24 = layoutParams.mSpan.mIndex;
                        int i25 = this.mSizePerSpan * i24;
                        int i26 = i24 * i20;
                        if (i22 == 1) {
                            childAt2.offsetLeftAndRight(i25 - i26);
                        } else {
                            childAt2.offsetTopAndBottom(i25 - i26);
                        }
                    }
                }
            }
        }
        if (getChildCount() <= 0) {
            z2 = true;
        } else if (this.mShouldReverseLayout) {
            z2 = true;
            fixEndGap(recycler, state, true);
            fixStartGap(recycler, state, false);
        } else {
            z2 = true;
            fixStartGap(recycler, state, true);
            fixEndGap(recycler, state, false);
        }
        if (z && !state.mInPreLayout && this.mGapStrategy != 0 && getChildCount() > 0 && hasGapsToFix() != null) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.mCheckForGapsRunnable);
            }
            if (checkForGaps()) {
                z3 = z2;
                if (state.mInPreLayout) {
                    anchorInfo.reset();
                }
                this.mLastLayoutFromEnd = anchorInfo.mLayoutFromEnd;
                this.mLastLayoutRTL = isLayoutRTL();
                if (z3) {
                    return;
                }
                anchorInfo.reset();
                onLayoutChildren(recycler, state, false);
                return;
            }
        }
        z3 = false;
        if (state.mInPreLayout) {
        }
        this.mLastLayoutFromEnd = anchorInfo.mLayoutFromEnd;
        this.mLastLayoutRTL = isLayoutRTL();
        if (z3) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutCompleted(RecyclerView.State state) {
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = PKIFailureInfo.systemUnavail;
        this.mPendingSavedState = null;
        this.mAnchorInfo.reset();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.mPendingSavedState = savedState;
            if (this.mPendingScrollPosition != -1) {
                savedState.mAnchorPosition = -1;
                savedState.mVisibleAnchorPosition = -1;
                savedState.mSpanOffsets = null;
                savedState.mSpanOffsetsSize = 0;
                savedState.mSpanLookupSize = 0;
                savedState.mSpanLookup = null;
                savedState.mFullSpanItems = null;
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final Parcelable onSaveInstanceState() {
        int startLine;
        int startAfterPadding;
        int[] iArr;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            SavedState savedState2 = new SavedState();
            savedState2.mSpanOffsetsSize = savedState.mSpanOffsetsSize;
            savedState2.mAnchorPosition = savedState.mAnchorPosition;
            savedState2.mVisibleAnchorPosition = savedState.mVisibleAnchorPosition;
            savedState2.mSpanOffsets = savedState.mSpanOffsets;
            savedState2.mSpanLookupSize = savedState.mSpanLookupSize;
            savedState2.mSpanLookup = savedState.mSpanLookup;
            savedState2.mReverseLayout = savedState.mReverseLayout;
            savedState2.mAnchorLayoutFromEnd = savedState.mAnchorLayoutFromEnd;
            savedState2.mLastLayoutRTL = savedState.mLastLayoutRTL;
            savedState2.mFullSpanItems = savedState.mFullSpanItems;
            return savedState2;
        }
        SavedState savedState3 = new SavedState();
        savedState3.mReverseLayout = this.mReverseLayout;
        savedState3.mAnchorLayoutFromEnd = this.mLastLayoutFromEnd;
        savedState3.mLastLayoutRTL = this.mLastLayoutRTL;
        LazySpanLookup lazySpanLookup = this.mLazySpanLookup;
        if (lazySpanLookup == null || (iArr = lazySpanLookup.mData) == null) {
            savedState3.mSpanLookupSize = 0;
        } else {
            savedState3.mSpanLookup = iArr;
            savedState3.mSpanLookupSize = iArr.length;
            savedState3.mFullSpanItems = lazySpanLookup.mFullSpanItems;
        }
        if (getChildCount() <= 0) {
            savedState3.mAnchorPosition = -1;
            savedState3.mVisibleAnchorPosition = -1;
            savedState3.mSpanOffsetsSize = 0;
            return savedState3;
        }
        savedState3.mAnchorPosition = this.mLastLayoutFromEnd ? getLastChildPosition() : getFirstChildPosition();
        View findFirstVisibleItemClosestToEnd = this.mShouldReverseLayout ? findFirstVisibleItemClosestToEnd(true) : findFirstVisibleItemClosestToStart(true);
        savedState3.mVisibleAnchorPosition = findFirstVisibleItemClosestToEnd != null ? RecyclerView.LayoutManager.getPosition(findFirstVisibleItemClosestToEnd) : -1;
        int i = this.mSpanCount;
        savedState3.mSpanOffsetsSize = i;
        savedState3.mSpanOffsets = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            boolean z = this.mLastLayoutFromEnd;
            OrientationHelper orientationHelper = this.mPrimaryOrientation;
            Span[] spanArr = this.mSpans;
            if (z) {
                startLine = spanArr[i2].getEndLine(PKIFailureInfo.systemUnavail);
                if (startLine != Integer.MIN_VALUE) {
                    startAfterPadding = orientationHelper.getEndAfterPadding();
                    startLine -= startAfterPadding;
                    savedState3.mSpanOffsets[i2] = startLine;
                } else {
                    savedState3.mSpanOffsets[i2] = startLine;
                }
            } else {
                startLine = spanArr[i2].getStartLine(PKIFailureInfo.systemUnavail);
                if (startLine != Integer.MIN_VALUE) {
                    startAfterPadding = orientationHelper.getStartAfterPadding();
                    startLine -= startAfterPadding;
                    savedState3.mSpanOffsets[i2] = startLine;
                } else {
                    savedState3.mSpanOffsets[i2] = startLine;
                }
            }
        }
        return savedState3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onScrollStateChanged(int i) {
        if (i == 0) {
            checkForGaps();
        }
    }

    public final boolean preferLastSpan(int i) {
        if (this.mOrientation == 0) {
            return (i == -1) != this.mShouldReverseLayout;
        }
        return ((i == -1) == this.mShouldReverseLayout) == isLayoutRTL();
    }

    public final void prepareLayoutStateForDelta(int i, RecyclerView.State state) {
        int firstChildPosition;
        int i2;
        if (i > 0) {
            firstChildPosition = getLastChildPosition();
            i2 = 1;
        } else {
            firstChildPosition = getFirstChildPosition();
            i2 = -1;
        }
        LayoutState layoutState = this.mLayoutState;
        layoutState.mRecycle = true;
        updateLayoutState(firstChildPosition, state);
        setLayoutStateDirection(i2);
        layoutState.mCurrentPosition = firstChildPosition + layoutState.mItemDirection;
        layoutState.mAvailable = Math.abs(i);
    }

    public final void recycle(RecyclerView.Recycler recycler, LayoutState layoutState) {
        if (!layoutState.mRecycle || layoutState.mInfinite) {
            return;
        }
        int i = layoutState.mAvailable;
        int i2 = layoutState.mLayoutDirection;
        if (i == 0) {
            if (i2 == -1) {
                recycleFromEnd(recycler, layoutState.mEndLine);
                return;
            } else {
                recycleFromStart(recycler, layoutState.mStartLine);
                return;
            }
        }
        int i3 = this.mSpanCount;
        Span[] spanArr = this.mSpans;
        int i4 = 1;
        if (i2 == -1) {
            int i5 = layoutState.mStartLine;
            int startLine = spanArr[0].getStartLine(i5);
            while (i4 < i3) {
                int startLine2 = spanArr[i4].getStartLine(i5);
                if (startLine2 > startLine) {
                    startLine = startLine2;
                }
                i4++;
            }
            int i6 = i5 - startLine;
            int i7 = layoutState.mEndLine;
            if (i6 >= 0) {
                i7 -= Math.min(i6, layoutState.mAvailable);
            }
            recycleFromEnd(recycler, i7);
            return;
        }
        int i8 = layoutState.mEndLine;
        int endLine = spanArr[0].getEndLine(i8);
        while (i4 < i3) {
            int endLine2 = spanArr[i4].getEndLine(i8);
            if (endLine2 < endLine) {
                endLine = endLine2;
            }
            i4++;
        }
        int i9 = endLine - layoutState.mEndLine;
        int i10 = layoutState.mStartLine;
        if (i9 >= 0) {
            i10 += Math.min(i9, layoutState.mAvailable);
        }
        recycleFromStart(recycler, i10);
    }

    public final void recycleFromEnd(RecyclerView.Recycler recycler, int i) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            OrientationHelper orientationHelper = this.mPrimaryOrientation;
            if (orientationHelper.getDecoratedStart(childAt) < i || orientationHelper.getTransformedStartWithDecoration(childAt) < i) {
                return;
            }
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            layoutParams.getClass();
            if (layoutParams.mSpan.mViews.size() == 1) {
                return;
            }
            Span span = layoutParams.mSpan;
            ArrayList arrayList = span.mViews;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
            layoutParams2.mSpan = null;
            if (layoutParams2.mViewHolder.isRemoved() || layoutParams2.mViewHolder.isUpdated()) {
                span.mDeletedSize -= StaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedMeasurement(view);
            }
            if (size == 1) {
                span.mCachedStart = PKIFailureInfo.systemUnavail;
            }
            span.mCachedEnd = PKIFailureInfo.systemUnavail;
            removeAndRecycleView(childAt, recycler);
        }
    }

    public final void recycleFromStart(RecyclerView.Recycler recycler, int i) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            OrientationHelper orientationHelper = this.mPrimaryOrientation;
            if (orientationHelper.getDecoratedEnd(childAt) > i || orientationHelper.getTransformedEndWithDecoration(childAt) > i) {
                return;
            }
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            layoutParams.getClass();
            if (layoutParams.mSpan.mViews.size() == 1) {
                return;
            }
            Span span = layoutParams.mSpan;
            ArrayList arrayList = span.mViews;
            View view = (View) arrayList.remove(0);
            LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
            layoutParams2.mSpan = null;
            if (arrayList.size() == 0) {
                span.mCachedEnd = PKIFailureInfo.systemUnavail;
            }
            if (layoutParams2.mViewHolder.isRemoved() || layoutParams2.mViewHolder.isUpdated()) {
                span.mDeletedSize -= StaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedMeasurement(view);
            }
            span.mCachedStart = PKIFailureInfo.systemUnavail;
            removeAndRecycleView(childAt, recycler);
        }
    }

    public final void resolveShouldLayoutReverse$1() {
        if (this.mOrientation == 1 || !isLayoutRTL()) {
            this.mShouldReverseLayout = this.mReverseLayout;
        } else {
            this.mShouldReverseLayout = !this.mReverseLayout;
        }
    }

    public final int scrollBy$1(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        prepareLayoutStateForDelta(i, state);
        LayoutState layoutState = this.mLayoutState;
        int fill = fill(recycler, layoutState, state);
        if (layoutState.mAvailable >= fill) {
            i = i < 0 ? -fill : fill;
        }
        this.mPrimaryOrientation.offsetChildren(-i);
        this.mLastLayoutFromEnd = this.mShouldReverseLayout;
        layoutState.mAvailable = 0;
        recycle(recycler, layoutState);
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return scrollBy$1(i, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void scrollToPosition(int i) {
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null && savedState.mAnchorPosition != i) {
            savedState.mSpanOffsets = null;
            savedState.mSpanOffsetsSize = 0;
            savedState.mAnchorPosition = -1;
            savedState.mVisibleAnchorPosition = -1;
        }
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = PKIFailureInfo.systemUnavail;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return scrollBy$1(i, recycler, state);
    }

    public final void setLayoutStateDirection(int i) {
        LayoutState layoutState = this.mLayoutState;
        layoutState.mLayoutDirection = i;
        layoutState.mItemDirection = this.mShouldReverseLayout != (i == -1) ? -1 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void setMeasuredDimension(Rect rect, int i, int i2) {
        int chooseSize;
        int chooseSize2;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i3 = this.mOrientation;
        int i4 = this.mSpanCount;
        if (i3 == 1) {
            int height = rect.height() + paddingBottom;
            RecyclerView recyclerView = this.mRecyclerView;
            WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
            chooseSize2 = RecyclerView.LayoutManager.chooseSize(i2, height, recyclerView.getMinimumHeight());
            chooseSize = RecyclerView.LayoutManager.chooseSize(i, (this.mSizePerSpan * i4) + paddingRight, this.mRecyclerView.getMinimumWidth());
        } else {
            int width = rect.width() + paddingRight;
            RecyclerView recyclerView2 = this.mRecyclerView;
            WeakHashMap weakHashMap2 = ViewCompat.sViewPropertyAnimatorMap;
            chooseSize = RecyclerView.LayoutManager.chooseSize(i, width, recyclerView2.getMinimumWidth());
            chooseSize2 = RecyclerView.LayoutManager.chooseSize(i2, (this.mSizePerSpan * i4) + paddingBottom, this.mRecyclerView.getMinimumHeight());
        }
        this.mRecyclerView.setMeasuredDimension(chooseSize, chooseSize2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext());
        linearSmoothScroller.mTargetPosition = i;
        startSmoothScroll(linearSmoothScroller);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null;
    }

    public final void updateLayoutState(int i, RecyclerView.State state) {
        int i2;
        int i3;
        int i4;
        LayoutState layoutState = this.mLayoutState;
        boolean z = false;
        layoutState.mAvailable = 0;
        layoutState.mCurrentPosition = i;
        LinearSmoothScroller linearSmoothScroller = this.mSmoothScroller;
        OrientationHelper orientationHelper = this.mPrimaryOrientation;
        if (linearSmoothScroller == null || !linearSmoothScroller.mRunning || (i4 = state.mTargetPosition) == -1) {
            i2 = 0;
            i3 = 0;
        } else {
            if (this.mShouldReverseLayout == (i4 < i)) {
                i2 = orientationHelper.getTotalSpace();
                i3 = 0;
            } else {
                i3 = orientationHelper.getTotalSpace();
                i2 = 0;
            }
        }
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || !recyclerView.mClipToPadding) {
            layoutState.mEndLine = orientationHelper.getEnd() + i2;
            layoutState.mStartLine = -i3;
        } else {
            layoutState.mStartLine = orientationHelper.getStartAfterPadding() - i3;
            layoutState.mEndLine = orientationHelper.getEndAfterPadding() + i2;
        }
        layoutState.mStopInFocusable = false;
        layoutState.mRecycle = true;
        if (orientationHelper.getMode() == 0 && orientationHelper.getEnd() == 0) {
            z = true;
        }
        layoutState.mInfinite = z;
    }

    public final void updateRemainingSpans(Span span, int i, int i2) {
        int i3 = span.mDeletedSize;
        int i4 = span.mIndex;
        BitSet bitSet = this.mRemainingSpans;
        if (i != -1) {
            int i5 = span.mCachedEnd;
            if (i5 == Integer.MIN_VALUE) {
                span.calculateCachedEnd();
                i5 = span.mCachedEnd;
            }
            if (i5 - i3 >= i2) {
                bitSet.set(i4, false);
                return;
            }
            return;
        }
        int i6 = span.mCachedStart;
        if (i6 == Integer.MIN_VALUE) {
            View view = (View) span.mViews.get(0);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            span.mCachedStart = StaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedStart(view);
            layoutParams.getClass();
            i6 = span.mCachedStart;
        }
        if (i6 + i3 <= i2) {
            bitSet.set(i4, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        onLayoutChildren(recycler, state, true);
    }
}
