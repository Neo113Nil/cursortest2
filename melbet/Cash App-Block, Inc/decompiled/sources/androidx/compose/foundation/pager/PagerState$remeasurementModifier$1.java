package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.node.LayoutNode;

/* loaded from: classes3.dex */
public final class PagerState$remeasurementModifier$1 implements RemeasurementModifier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ScrollableState this$0;

    public /* synthetic */ PagerState$remeasurementModifier$1(ScrollableState scrollableState, int i) {
        this.$r8$classId = i;
        this.this$0 = scrollableState;
    }

    @Override // androidx.compose.ui.layout.RemeasurementModifier
    public final void onRemeasurementAvailable(LayoutNode layoutNode) {
        int i = this.$r8$classId;
        ScrollableState scrollableState = this.this$0;
        switch (i) {
            case 0:
                ((PagerState) scrollableState).remeasurement$delegate.setValue(layoutNode);
                break;
            case 1:
                ((LazyListState) scrollableState).remeasurement = layoutNode;
                break;
            default:
                ((LazyGridState) scrollableState).remeasurement = layoutNode;
                break;
        }
    }
}
