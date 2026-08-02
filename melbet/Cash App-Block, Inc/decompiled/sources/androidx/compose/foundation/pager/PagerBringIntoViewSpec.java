package androidx.compose.foundation.pager;

import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.foundation.gestures.BringIntoViewSpec;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.ranges.RangesKt___RangesKt;

/* loaded from: classes3.dex */
public final class PagerBringIntoViewSpec implements BringIntoViewSpec {
    public final BringIntoViewSpec defaultBringIntoViewSpec;
    public final LayoutDirection layoutDirection;
    public final PagerState pagerState;

    public PagerBringIntoViewSpec(PagerState pagerState, BringIntoViewSpec bringIntoViewSpec, LayoutDirection layoutDirection) {
        this.pagerState = pagerState;
        this.defaultBringIntoViewSpec = bringIntoViewSpec;
        this.layoutDirection = layoutDirection;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if ((r8 + r9) > r10) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x001b, code lost:
    
        if (r8 <= 1.0f) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        r3 = true;
     */
    @Override // androidx.compose.foundation.gestures.BringIntoViewSpec
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float calculateScrollDistance(float f, float f2, float f3) {
        int i;
        int pageSizeWithSpacing$foundation;
        int i2;
        float calculateScrollDistance = this.defaultBringIntoViewSpec.calculateScrollDistance(f, f2, f3);
        boolean z = false;
        if (f <= RecyclerView.DECELERATION_RATE) {
            float f4 = f + f2;
            Rect rect = VisibilityThresholdsKt.RectVisibilityThreshold;
        }
        float abs = Math.abs(calculateScrollDistance);
        LayoutDirection layoutDirection = this.layoutDirection;
        PagerState pagerState = this.pagerState;
        if (abs != RecyclerView.DECELERATION_RATE && z) {
            if (layoutDirection == LayoutDirection.Rtl && pagerState.getLayoutInfo().orientation == Orientation.Horizontal) {
                i2 = pagerState.getPageSizeWithSpacing$foundation() + (-pagerState.firstVisiblePageOffset);
            } else {
                i2 = pagerState.firstVisiblePageOffset;
            }
            float f5 = i2 * (-1.0f);
            while (calculateScrollDistance > RecyclerView.DECELERATION_RATE && f5 < calculateScrollDistance) {
                f5 += pagerState.getPageSizeWithSpacing$foundation();
            }
            while (calculateScrollDistance < RecyclerView.DECELERATION_RATE && f5 > calculateScrollDistance) {
                f5 -= pagerState.getPageSizeWithSpacing$foundation();
            }
            return f5;
        }
        if (Math.abs(pagerState.firstVisiblePageOffset) < 1.0E-6d) {
            return RecyclerView.DECELERATION_RATE;
        }
        LayoutDirection layoutDirection2 = LayoutDirection.Rtl;
        if (layoutDirection == layoutDirection2 && pagerState.getLayoutInfo().orientation == Orientation.Horizontal) {
            i = pagerState.getPageSizeWithSpacing$foundation() + (-pagerState.firstVisiblePageOffset);
        } else {
            i = pagerState.firstVisiblePageOffset;
        }
        float f6 = i * (-1.0f);
        if (layoutDirection == layoutDirection2 && pagerState.getLayoutInfo().orientation == Orientation.Horizontal) {
            if (!pagerState.getLastScrolledForward()) {
                pageSizeWithSpacing$foundation = pagerState.getPageSizeWithSpacing$foundation();
                f6 += pageSizeWithSpacing$foundation;
            }
            return RangesKt___RangesKt.coerceIn(f6, -f3, f3);
        }
        if (pagerState.getLastScrolledForward()) {
            pageSizeWithSpacing$foundation = pagerState.getPageSizeWithSpacing$foundation();
            f6 += pageSizeWithSpacing$foundation;
        }
        return RangesKt___RangesKt.coerceIn(f6, -f3, f3);
    }
}
