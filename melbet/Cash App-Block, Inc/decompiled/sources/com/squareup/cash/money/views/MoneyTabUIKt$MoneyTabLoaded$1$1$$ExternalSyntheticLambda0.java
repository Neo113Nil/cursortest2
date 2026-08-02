package com.squareup.cash.money.views;

import androidx.compose.foundation.lazy.LazyListMeasureResult;
import androidx.compose.foundation.lazy.LazyListMeasuredItem;
import androidx.compose.foundation.lazy.LazyListScrollPosition;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.card.onboarding.CanvasKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.ranges.IntRange;

/* loaded from: classes6.dex */
public final /* synthetic */ class MoneyTabUIKt$MoneyTabLoaded$1$1$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ LazyListState f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ MoneyTabUIKt$MoneyTabLoaded$1$1$$ExternalSyntheticLambda0(LazyListState lazyListState, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = lazyListState;
        this.f$1 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Integer valueOf;
        int i = this.$r8$classId;
        Integer num = null;
        Object obj = null;
        int i2 = this.f$1;
        LazyListState lazyListState = this.f$0;
        switch (i) {
            case 0:
                lazyListState.getClass();
                LazyListMeasureResult layoutInfo = lazyListState.getLayoutInfo();
                int i3 = layoutInfo.viewportStartOffset;
                int i4 = layoutInfo.viewportEndOffset - i2;
                List list = layoutInfo.visibleItemsInfo;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    LazyListMeasuredItem lazyListMeasuredItem = (LazyListMeasuredItem) obj2;
                    int i5 = lazyListMeasuredItem.offset;
                    int i6 = lazyListMeasuredItem.size;
                    int min = Math.min(i5 + i6, i4) - Math.max(i5, i3);
                    float f = i6 > 0 ? min / i6 : RecyclerView.DECELERATION_RATE;
                    if (min >= 1 && f >= 1.0f) {
                        arrayList.add(obj2);
                    }
                }
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    valueOf = Integer.valueOf(((LazyListMeasuredItem) it.next()).index);
                    while (it.hasNext()) {
                        Integer valueOf2 = Integer.valueOf(((LazyListMeasuredItem) it.next()).index);
                        if (valueOf.compareTo(valueOf2) > 0) {
                            valueOf = valueOf2;
                        }
                    }
                } else {
                    valueOf = null;
                }
                Iterator it2 = arrayList.iterator();
                if (it2.hasNext()) {
                    num = Integer.valueOf(((LazyListMeasuredItem) it2.next()).index);
                    while (it2.hasNext()) {
                        Integer valueOf3 = Integer.valueOf(((LazyListMeasuredItem) it2.next()).index);
                        if (num.compareTo(valueOf3) < 0) {
                            num = valueOf3;
                        }
                    }
                }
                if (valueOf != null && num != null) {
                    return new IntRange(valueOf.intValue(), num.intValue(), 1);
                }
                IntRange.INSTANCE.getClass();
                return IntRange.EMPTY;
            default:
                lazyListState.getClass();
                Object[] objArr = lazyListState.getLayoutInfo().totalItemsCount > 0;
                LazyListScrollPosition lazyListScrollPosition = lazyListState.scrollPosition;
                if (objArr != true) {
                    i2 = lazyListScrollPosition.index$delegate.getIntValue();
                } else if (((LazyListMeasuredItem) CollectionsKt.first(lazyListState.getLayoutInfo().visibleItemsInfo)).key.equals("tabs")) {
                    int headerSize = CanvasKt.headerSize(lazyListState);
                    int i7 = lazyListState.getLayoutInfo().totalItemsCount - 1;
                    int intValue = lazyListScrollPosition.index$delegate.getIntValue();
                    if (intValue == i7) {
                        i2 = intValue;
                    } else {
                        int i8 = intValue + 1;
                        if (i8 != i7) {
                            Iterator it3 = lazyListState.getLayoutInfo().visibleItemsInfo.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    Object next = it3.next();
                                    if (((LazyListMeasuredItem) next).index == i8) {
                                        obj = next;
                                    }
                                }
                            }
                            LazyListMeasuredItem lazyListMeasuredItem2 = (LazyListMeasuredItem) obj;
                            if ((lazyListMeasuredItem2 != null ? lazyListMeasuredItem2.offset : 0) < headerSize) {
                                i2 = intValue + 2;
                            }
                        }
                        i2 = i8;
                    }
                }
                return Integer.valueOf(i2);
        }
    }
}
