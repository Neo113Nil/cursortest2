package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.lazy.LazyListLayoutInfoKt;
import androidx.compose.foundation.lazy.LazyListMeasureResult;
import androidx.compose.foundation.lazy.LazyListMeasuredItem;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.grid.LazyGridMeasureResult;
import androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.avatar.components.AvatarKt;
import com.squareup.cash.mooncake.compose_ui.ComposeUtilsKt;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.RangesKt___RangesKt;
import net.oneformapp.schema.Schema;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final class PagerScrollScopeKt$LazyLayoutScrollScope$1 implements ScrollScope {
    public final /* synthetic */ ScrollScope $$delegate_0;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ScrollableState $state;

    public /* synthetic */ PagerScrollScopeKt$LazyLayoutScrollScope$1(ScrollScope scrollScope, ScrollableState scrollableState, int i) {
        this.$r8$classId = i;
        this.$state = scrollableState;
        this.$$delegate_0 = scrollScope;
    }

    public final int calculateDistanceTo(int i) {
        Object obj;
        int i2 = this.$r8$classId;
        Object obj2 = null;
        r2 = null;
        Integer valueOf = null;
        ScrollableState scrollableState = this.$state;
        switch (i2) {
            case 0:
                PagerState pagerState = (PagerState) scrollableState;
                Schema schema = pagerState.scrollPosition;
                return (int) (RangesKt___RangesKt.coerceIn(ComposeUtilsKt.currentAbsoluteScrollOffset(pagerState) + MathKt__MathJVMKt.roundToInt(((pagerState.getPageSizeWithSpacing$foundation() * (i - ((ParcelableSnapshotMutableIntState) schema.elementTypes).getIntValue())) - (((ParcelableSnapshotMutableFloatState) schema.fieldSortOrder).getFloatValue() * pagerState.getPageSizeWithSpacing$foundation())) + RecyclerView.DECELERATION_RATE), pagerState.minScrollOffset, pagerState.maxScrollOffset) - ComposeUtilsKt.currentAbsoluteScrollOffset(pagerState));
            case 1:
                LazyListMeasureResult layoutInfo = ((LazyListState) scrollableState).getLayoutInfo();
                if (layoutInfo.visibleItemsInfo.isEmpty()) {
                    return 0;
                }
                int firstVisibleItemIndex = getFirstVisibleItemIndex();
                if (i > getLastVisibleItemIndex() || firstVisibleItemIndex > i) {
                    return ((i - getFirstVisibleItemIndex()) * LazyListLayoutInfoKt.visibleItemsAverageSize(layoutInfo)) - getFirstVisibleItemScrollOffset();
                }
                List list = layoutInfo.visibleItemsInfo;
                int size = list.size();
                int i3 = 0;
                while (true) {
                    if (i3 < size) {
                        Object obj3 = list.get(i3);
                        if (((LazyListMeasuredItem) obj3).index == i) {
                            obj2 = obj3;
                        } else {
                            i3++;
                        }
                    }
                }
                LazyListMeasuredItem lazyListMeasuredItem = (LazyListMeasuredItem) obj2;
                if (lazyListMeasuredItem != null) {
                    return lazyListMeasuredItem.offset;
                }
                return 0;
            default:
                LazyGridState lazyGridState = (LazyGridState) scrollableState;
                LazyGridMeasureResult layoutInfo2 = lazyGridState.getLayoutInfo();
                if (layoutInfo2.visibleItemsInfo.isEmpty()) {
                    return 0;
                }
                int firstVisibleItemIndex2 = getFirstVisibleItemIndex();
                if (i > getLastVisibleItemIndex() || firstVisibleItemIndex2 > i) {
                    int i4 = ((LazyGridMeasureResult) lazyGridState.layoutInfoState.getValue()).slotsPerLine;
                    return (((((i4 - 1) * (i < getFirstVisibleItemIndex() ? -1 : 1)) + (i - getFirstVisibleItemIndex())) / i4) * AvatarKt.visibleLinesAverageMainAxisSize(layoutInfo2)) - getFirstVisibleItemScrollOffset();
                }
                List list2 = layoutInfo2.visibleItemsInfo;
                int size2 = list2.size();
                int i5 = 0;
                while (true) {
                    if (i5 < size2) {
                        obj = list2.get(i5);
                        if (((LazyGridMeasuredItem) obj).index != i) {
                            i5++;
                        }
                    } else {
                        obj = null;
                    }
                }
                LazyGridMeasuredItem lazyGridMeasuredItem = (LazyGridMeasuredItem) obj;
                if (layoutInfo2.orientation == Orientation.Vertical) {
                    if (lazyGridMeasuredItem != null) {
                        valueOf = Integer.valueOf((int) (lazyGridMeasuredItem.offset & BodyPartID.bodyIdMax));
                    }
                } else if (lazyGridMeasuredItem != null) {
                    valueOf = Integer.valueOf((int) (lazyGridMeasuredItem.offset >> 32));
                }
                if (valueOf != null) {
                    return valueOf.intValue();
                }
                return 0;
        }
    }

    public final int getFirstVisibleItemIndex() {
        int i = this.$r8$classId;
        ScrollableState scrollableState = this.$state;
        switch (i) {
            case 0:
                return ((PagerState) scrollableState).firstVisiblePage;
            case 1:
                return ((LazyListState) scrollableState).scrollPosition.index$delegate.getIntValue();
            default:
                return ((LazyGridState) scrollableState).scrollPosition.index$delegate.getIntValue();
        }
    }

    public final int getFirstVisibleItemScrollOffset() {
        int i = this.$r8$classId;
        ScrollableState scrollableState = this.$state;
        switch (i) {
            case 0:
                return ((PagerState) scrollableState).firstVisiblePageOffset;
            case 1:
                return ((LazyListState) scrollableState).scrollPosition.scrollOffset$delegate.getIntValue();
            default:
                return ((LazyGridState) scrollableState).scrollPosition.scrollOffset$delegate.getIntValue();
        }
    }

    public final int getLastVisibleItemIndex() {
        int i = this.$r8$classId;
        ScrollableState scrollableState = this.$state;
        switch (i) {
            case 0:
                return ((MeasuredPage) CollectionsKt.last(((PagerState) scrollableState).getLayoutInfo().visiblePagesInfo)).index;
            case 1:
                LazyListMeasuredItem lazyListMeasuredItem = (LazyListMeasuredItem) CollectionsKt.lastOrNull(((LazyListState) scrollableState).getLayoutInfo().visibleItemsInfo);
                if (lazyListMeasuredItem != null) {
                    return lazyListMeasuredItem.index;
                }
                return 0;
            default:
                LazyGridMeasuredItem lazyGridMeasuredItem = (LazyGridMeasuredItem) CollectionsKt.lastOrNull(((LazyGridState) scrollableState).getLayoutInfo().visibleItemsInfo);
                if (lazyGridMeasuredItem != null) {
                    return lazyGridMeasuredItem.index;
                }
                return 0;
        }
    }

    @Override // androidx.compose.foundation.gestures.ScrollScope
    public final float scrollBy(float f) {
        switch (this.$r8$classId) {
        }
        return this.$$delegate_0.scrollBy(f);
    }

    public final void snapToItem(int i, int i2) {
        int i3 = this.$r8$classId;
        ScrollableState scrollableState = this.$state;
        switch (i3) {
            case 0:
                PagerState pagerState = (PagerState) scrollableState;
                float pageSizeWithSpacing$foundation = pagerState.getPageSizeWithSpacing$foundation();
                float f = RecyclerView.DECELERATION_RATE;
                if (pageSizeWithSpacing$foundation != RecyclerView.DECELERATION_RATE) {
                    f = i2 / pageSizeWithSpacing$foundation;
                }
                pagerState.snapToItem$foundation(i, f, true);
                break;
            case 1:
                ((LazyListState) scrollableState).snapToItemIndexInternal$foundation(i, i2);
                break;
            default:
                ((LazyGridState) scrollableState).snapToItemIndexInternal$foundation(i, i2);
                break;
        }
    }
}
