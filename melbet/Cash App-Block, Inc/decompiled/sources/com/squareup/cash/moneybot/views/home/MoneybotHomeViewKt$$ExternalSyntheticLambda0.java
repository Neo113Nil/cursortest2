package com.squareup.cash.moneybot.views.home;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function0;
import kotlin.ranges.RangesKt___RangesKt;

/* loaded from: classes6.dex */
public final /* synthetic */ class MoneybotHomeViewKt$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ LazyListState f$1;

    public /* synthetic */ MoneybotHomeViewKt$$ExternalSyntheticLambda0(boolean z, LazyListState lazyListState, int i) {
        this.$r8$classId = i;
        this.f$0 = z;
        this.f$1 = lazyListState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        float coerceIn;
        int i = this.$r8$classId;
        LazyListState lazyListState = this.f$1;
        boolean z = this.f$0;
        switch (i) {
            case 0:
                if (z) {
                    coerceIn = lazyListState.scrollPosition.index$delegate.getIntValue() == 0 ? RangesKt___RangesKt.coerceIn(1.0f - ((lazyListState.scrollPosition.scrollOffset$delegate.getIntValue() / 1000.0f) * 0.8f), 0.2f, 1.0f) : 0.2f;
                } else {
                    coerceIn = RecyclerView.DECELERATION_RATE;
                }
                return Float.valueOf(coerceIn);
            default:
                return Boolean.valueOf(z && (lazyListState.scrollPosition.index$delegate.getIntValue() > 0 || lazyListState.scrollPosition.scrollOffset$delegate.getIntValue() > 0));
        }
    }
}
