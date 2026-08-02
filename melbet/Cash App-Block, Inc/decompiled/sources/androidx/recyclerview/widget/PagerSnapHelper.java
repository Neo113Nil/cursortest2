package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class PagerSnapHelper extends RecyclerView.OnFlingListener {
    public OrientationHelper.AnonymousClass1 mHorizontalHelper;
    public RecyclerView mRecyclerView;
    public final SnapHelper$1 mScrollListener = new RecyclerView.OnScrollListener() { // from class: androidx.recyclerview.widget.SnapHelper$1
        public boolean mScrolled = false;

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (i == 0 && this.mScrolled) {
                this.mScrolled = false;
                PagerSnapHelper.this.snapToTargetExistingView();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            if (i == 0 && i2 == 0) {
                return;
            }
            this.mScrolled = true;
        }
    };
    public OrientationHelper.AnonymousClass2 mVerticalHelper;

    public static int distanceToCenter(View view, OrientationHelper orientationHelper) {
        return ((orientationHelper.getDecoratedMeasurement(view) / 2) + orientationHelper.getDecoratedStart(view)) - ((orientationHelper.getTotalSpace() / 2) + orientationHelper.getStartAfterPadding());
    }

    public static View findCenterView(RecyclerView.LayoutManager layoutManager, OrientationHelper orientationHelper) {
        int childCount = layoutManager.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int totalSpace = (orientationHelper.getTotalSpace() / 2) + orientationHelper.getStartAfterPadding();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = layoutManager.getChildAt(i2);
            int abs = Math.abs(((orientationHelper.getDecoratedMeasurement(childAt) / 2) + orientationHelper.getDecoratedStart(childAt)) - totalSpace);
            if (abs < i) {
                view = childAt;
                i = abs;
            }
        }
        return view;
    }

    public final void attachToRecyclerView(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.mRecyclerView;
        if (recyclerView2 == recyclerView) {
            return;
        }
        SnapHelper$1 snapHelper$1 = this.mScrollListener;
        if (recyclerView2 != null) {
            ArrayList arrayList = recyclerView2.mScrollListeners;
            if (arrayList != null) {
                arrayList.remove(snapHelper$1);
            }
            this.mRecyclerView.setOnFlingListener(null);
        }
        this.mRecyclerView = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.mOnFlingListener != null) {
                a$$ExternalSyntheticBUOutline0.m$1("An instance of OnFlingListener already set.");
                return;
            }
            recyclerView.addOnScrollListener(snapHelper$1);
            this.mRecyclerView.setOnFlingListener(this);
            new Scroller(this.mRecyclerView.getContext(), new DecelerateInterpolator());
            snapToTargetExistingView();
        }
    }

    public final int[] calculateDistanceToFinalSnap(RecyclerView.LayoutManager layoutManager, View view) {
        int[] iArr = new int[2];
        if (layoutManager.canScrollHorizontally()) {
            iArr[0] = distanceToCenter(view, getHorizontalHelper(layoutManager));
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.canScrollVertically()) {
            iArr[1] = distanceToCenter(view, getVerticalHelper(layoutManager));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    public View findSnapView(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager.canScrollVertically()) {
            return findCenterView(layoutManager, getVerticalHelper(layoutManager));
        }
        if (layoutManager.canScrollHorizontally()) {
            return findCenterView(layoutManager, getHorizontalHelper(layoutManager));
        }
        return null;
    }

    public final OrientationHelper getHorizontalHelper(RecyclerView.LayoutManager layoutManager) {
        OrientationHelper.AnonymousClass1 anonymousClass1 = this.mHorizontalHelper;
        if (anonymousClass1 == null || anonymousClass1.mLayoutManager != layoutManager) {
            this.mHorizontalHelper = new OrientationHelper.AnonymousClass1(layoutManager);
        }
        return this.mHorizontalHelper;
    }

    public final OrientationHelper getVerticalHelper(RecyclerView.LayoutManager layoutManager) {
        OrientationHelper.AnonymousClass2 anonymousClass2 = this.mVerticalHelper;
        if (anonymousClass2 == null || anonymousClass2.mLayoutManager != layoutManager) {
            this.mVerticalHelper = new OrientationHelper.AnonymousClass2(layoutManager);
        }
        return this.mVerticalHelper;
    }

    public final void snapToTargetExistingView() {
        RecyclerView.LayoutManager layoutManager;
        View findSnapView;
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || (layoutManager = recyclerView.mLayout) == null || (findSnapView = findSnapView(layoutManager)) == null) {
            return;
        }
        int[] calculateDistanceToFinalSnap = calculateDistanceToFinalSnap(layoutManager, findSnapView);
        int i = calculateDistanceToFinalSnap[0];
        if (i == 0 && calculateDistanceToFinalSnap[1] == 0) {
            return;
        }
        this.mRecyclerView.smoothScrollBy$1(i, calculateDistanceToFinalSnap[1], false);
    }
}
