package androidx.compose.material3;

import androidx.compose.foundation.lazy.LazyListMeasuredItem;
import androidx.compose.foundation.lazy.LazyListState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class DatePickerKt$$ExternalSyntheticLambda24 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ LazyListState f$0;

    public /* synthetic */ DatePickerKt$$ExternalSyntheticLambda24(LazyListState lazyListState, int i) {
        this.$r8$classId = i;
        this.f$0 = lazyListState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        LazyListState lazyListState = this.f$0;
        switch (i) {
            case 0:
                return Integer.valueOf(lazyListState.scrollPosition.index$delegate.getIntValue());
            case 1:
                return Integer.valueOf(lazyListState.getLayoutInfo().totalItemsCount);
            case 2:
                return Boolean.valueOf(lazyListState.scrollableState.isScrollInProgress());
            case 3:
                return Boolean.valueOf(lazyListState.scrollableState.isScrollInProgress());
            case 4:
                return Boolean.valueOf(lazyListState.scrollableState.isScrollInProgress());
            case 5:
                List list = lazyListState.getLayoutInfo().visibleItemsInfo;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((LazyListMeasuredItem) it.next()).index));
                }
                return arrayList;
            case 6:
                return Integer.valueOf(lazyListState.scrollPosition.scrollOffset$delegate.getIntValue());
            case 7:
                return Boolean.valueOf(lazyListState.getLayoutInfo().totalItemsCount > 0);
            case 8:
                return Integer.valueOf(lazyListState.getLayoutInfo().totalItemsCount);
            case 9:
                return Boolean.valueOf(lazyListState.scrollableState.isScrollInProgress());
            case 10:
                return Boolean.valueOf(!lazyListState.getCanScrollForward());
            case 11:
                LazyListMeasuredItem lazyListMeasuredItem = (LazyListMeasuredItem) CollectionsKt.lastOrNull(lazyListState.getLayoutInfo().visibleItemsInfo);
                return new Pair(lazyListMeasuredItem != null ? Integer.valueOf(lazyListMeasuredItem.index) : null, Integer.valueOf(lazyListState.getLayoutInfo().totalItemsCount - 1));
            case 12:
                LazyListMeasuredItem lazyListMeasuredItem2 = (LazyListMeasuredItem) CollectionsKt.lastOrNull(lazyListState.getLayoutInfo().visibleItemsInfo);
                return new Pair(lazyListMeasuredItem2 != null ? Integer.valueOf(lazyListMeasuredItem2.index) : null, Integer.valueOf(lazyListState.getLayoutInfo().totalItemsCount - 1));
            case 13:
                return Boolean.valueOf(lazyListState.scrollableState.isScrollInProgress());
            case 14:
                return Boolean.valueOf(lazyListState.scrollableState.isScrollInProgress());
            default:
                LazyListMeasuredItem lazyListMeasuredItem3 = (LazyListMeasuredItem) CollectionsKt.lastOrNull(lazyListState.getLayoutInfo().visibleItemsInfo);
                if (lazyListMeasuredItem3 != null && lazyListMeasuredItem3.index == lazyListState.getLayoutInfo().totalItemsCount - 1) {
                    r2 = true;
                }
                return Boolean.valueOf(r2);
        }
    }
}
