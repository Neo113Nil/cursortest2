package com.squareup.cash.card.onboarding;

import androidx.compose.foundation.lazy.LazyListMeasuredItem;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final /* synthetic */ class CardStylePickerViewKt$$ExternalSyntheticLambda9 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ LazyListState f$0;
    public final /* synthetic */ float f$1;

    public /* synthetic */ CardStylePickerViewKt$$ExternalSyntheticLambda9(LazyListState lazyListState, float f, int i) {
        this.$r8$classId = i;
        this.f$0 = lazyListState;
        this.f$1 = f;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        float f;
        int i = this.$r8$classId;
        float f2 = this.f$1;
        LazyListState lazyListState = this.f$0;
        switch (i) {
            case 0:
                if (lazyListState.getLayoutInfo().totalItemsCount != 0) {
                    if (lazyListState.scrollPosition.index$delegate.getIntValue() == 0) {
                        LazyListMeasuredItem lazyListMeasuredItem = (LazyListMeasuredItem) lazyListState.getLayoutInfo().visibleItemsInfo.get(0);
                        float abs = Math.abs(lazyListMeasuredItem.offset);
                        float f3 = lazyListMeasuredItem.size;
                        float f4 = abs + f2;
                        if (f4 >= f3) {
                            f = (f4 - f3) / f2;
                        }
                    } else {
                        f = 1.0f;
                    }
                    return Float.valueOf(f);
                }
                f = RecyclerView.DECELERATION_RATE;
                return Float.valueOf(f);
            default:
                return Boolean.valueOf(lazyListState.scrollPosition.index$delegate.getIntValue() > 0 || ((float) lazyListState.scrollPosition.scrollOffset$delegate.getIntValue()) > f2);
        }
    }
}
