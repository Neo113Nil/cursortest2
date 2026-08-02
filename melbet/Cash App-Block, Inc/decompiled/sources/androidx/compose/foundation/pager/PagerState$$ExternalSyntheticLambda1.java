package androidx.compose.foundation.pager;

import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function0;
import net.oneformapp.schema.Schema;

/* loaded from: classes3.dex */
public final /* synthetic */ class PagerState$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ PagerState f$0;

    public /* synthetic */ PagerState$$ExternalSyntheticLambda1(PagerState pagerState, int i) {
        this.$r8$classId = i;
        this.f$0 = pagerState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int intValue;
        int i = this.$r8$classId;
        PagerState pagerState = this.f$0;
        switch (i) {
            case 0:
                return Integer.valueOf(pagerState.scrollableState.isScrollInProgress() ? pagerState.settledPageState$delegate.getIntValue() : ((ParcelableSnapshotMutableIntState) pagerState.scrollPosition.elementTypes).getIntValue());
            case 1:
                return Integer.valueOf(pagerState.getPageCount());
            case 2:
                return Integer.valueOf(pagerState.getPageCount());
            case 3:
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = pagerState.programmaticScrollTargetPage$delegate;
                boolean isScrollInProgress = pagerState.scrollableState.isScrollInProgress();
                Schema schema = pagerState.scrollPosition;
                if (!isScrollInProgress) {
                    intValue = ((ParcelableSnapshotMutableIntState) schema.elementTypes).getIntValue();
                } else if (parcelableSnapshotMutableIntState.getIntValue() != -1) {
                    intValue = parcelableSnapshotMutableIntState.getIntValue();
                } else {
                    float abs = Math.abs(((ParcelableSnapshotMutableFloatState) schema.fieldSortOrder).getFloatValue());
                    Density density = pagerState.density;
                    PagerStateKt$UnitDensity$1 pagerStateKt$UnitDensity$1 = PagerStateKt.UnitDensity;
                    if (abs >= Math.abs(Math.min(density.mo236toPx0680j_4(56.0f), pagerState.getPageSize$foundation() / 2.0f) / pagerState.getPageSize$foundation())) {
                        boolean lastScrolledForward = pagerState.getLastScrolledForward();
                        int i2 = pagerState.firstVisiblePage;
                        intValue = lastScrolledForward ? i2 + 1 : i2;
                    } else {
                        intValue = ((ParcelableSnapshotMutableIntState) schema.elementTypes).getIntValue();
                    }
                }
                return Integer.valueOf(pagerState.coerceInPageRange(intValue));
            case 4:
                return Integer.valueOf(pagerState.getPageCount());
            case 5:
                return Float.valueOf(((ParcelableSnapshotMutableFloatState) pagerState.scrollPosition.fieldSortOrder).getFloatValue());
            case 6:
                return Integer.valueOf(((ParcelableSnapshotMutableIntState) pagerState.scrollPosition.elementTypes).getIntValue());
            case 7:
                return Integer.valueOf(((ParcelableSnapshotMutableIntState) pagerState.scrollPosition.elementTypes).getIntValue());
            case 8:
                return Integer.valueOf(pagerState.getSettledPage());
            case 9:
                return Integer.valueOf(((ParcelableSnapshotMutableIntState) pagerState.scrollPosition.elementTypes).getIntValue());
            case 10:
                return Integer.valueOf(((ParcelableSnapshotMutableIntState) pagerState.scrollPosition.elementTypes).getIntValue());
            default:
                return Integer.valueOf(pagerState.getSettledPage());
        }
    }
}
