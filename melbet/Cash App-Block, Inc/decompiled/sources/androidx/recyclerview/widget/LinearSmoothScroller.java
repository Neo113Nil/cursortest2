package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public class LinearSmoothScroller extends RecyclerView.SmoothScroller {
    public final DisplayMetrics mDisplayMetrics;
    public float mMillisPerPixel;
    public PointF mTargetVector;
    public final LinearInterpolator mLinearInterpolator = new LinearInterpolator();
    public final DecelerateInterpolator mDecelerateInterpolator = new DecelerateInterpolator();
    public boolean mHasCalculatedMillisPerPixel = false;
    public int mInterimTargetDx = 0;
    public int mInterimTargetDy = 0;

    public LinearSmoothScroller(Context context) {
        this.mDisplayMetrics = context.getResources().getDisplayMetrics();
    }

    public static int calculateDtToFit(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            if (i5 == 1) {
                return i4 - i2;
            }
            a$$ExternalSyntheticBUOutline0.m$3("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            return 0;
        }
        int i6 = i3 - i;
        if (i6 > 0) {
            return i6;
        }
        int i7 = i4 - i2;
        if (i7 < 0) {
            return i7;
        }
        return 0;
    }

    public int calculateDxToMakeVisible(View view, int i) {
        RecyclerView.LayoutManager layoutManager = this.mLayoutManager;
        if (layoutManager == null || !layoutManager.canScrollHorizontally()) {
            return 0;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        return calculateDtToFit(RecyclerView.LayoutManager.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, RecyclerView.LayoutManager.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, layoutManager.getPaddingLeft(), layoutManager.mWidth - layoutManager.getPaddingRight(), i);
    }

    public int calculateDyToMakeVisible(View view, int i) {
        RecyclerView.LayoutManager layoutManager = this.mLayoutManager;
        if (layoutManager == null || !layoutManager.canScrollVertically()) {
            return 0;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        return calculateDtToFit(RecyclerView.LayoutManager.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, RecyclerView.LayoutManager.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutManager.getPaddingTop(), layoutManager.mHeight - layoutManager.getPaddingBottom(), i);
    }

    public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int calculateTimeForScrolling(int i) {
        float abs = Math.abs(i);
        if (!this.mHasCalculatedMillisPerPixel) {
            this.mMillisPerPixel = calculateSpeedPerPixel(this.mDisplayMetrics);
            this.mHasCalculatedMillisPerPixel = true;
        }
        return (int) Math.ceil(abs * this.mMillisPerPixel);
    }

    public int getVerticalSnapPreference() {
        PointF pointF = this.mTargetVector;
        if (pointF == null) {
            return 0;
        }
        float f = pointF.y;
        if (f == RecyclerView.DECELERATION_RATE) {
            return 0;
        }
        return f > RecyclerView.DECELERATION_RATE ? 1 : -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003d  */
    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onTargetFound(View view, RecyclerView.SmoothScroller.Action action) {
        int i;
        int ceil;
        PointF pointF = this.mTargetVector;
        if (pointF != null) {
            float f = pointF.x;
            if (f != RecyclerView.DECELERATION_RATE) {
                i = f > RecyclerView.DECELERATION_RATE ? 1 : -1;
                int calculateDxToMakeVisible = calculateDxToMakeVisible(view, i);
                int calculateDyToMakeVisible = calculateDyToMakeVisible(view, getVerticalSnapPreference());
                ceil = (int) Math.ceil(calculateTimeForScrolling((int) Math.sqrt((calculateDyToMakeVisible * calculateDyToMakeVisible) + (calculateDxToMakeVisible * calculateDxToMakeVisible))) / 0.3356d);
                if (ceil <= 0) {
                    action.mDx = -calculateDxToMakeVisible;
                    action.mDy = -calculateDyToMakeVisible;
                    action.mDuration = ceil;
                    action.mInterpolator = this.mDecelerateInterpolator;
                    action.mChanged = true;
                    return;
                }
                return;
            }
        }
        i = 0;
        int calculateDxToMakeVisible2 = calculateDxToMakeVisible(view, i);
        int calculateDyToMakeVisible2 = calculateDyToMakeVisible(view, getVerticalSnapPreference());
        ceil = (int) Math.ceil(calculateTimeForScrolling((int) Math.sqrt((calculateDyToMakeVisible2 * calculateDyToMakeVisible2) + (calculateDxToMakeVisible2 * calculateDxToMakeVisible2))) / 0.3356d);
        if (ceil <= 0) {
        }
    }
}
