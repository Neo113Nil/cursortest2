package com.squareup.cash.core.navigationcontainer;

import androidx.compose.foundation.pager.PagerState;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function0;
import kotlin.ranges.RangesKt___RangesKt;

/* loaded from: classes6.dex */
public final /* synthetic */ class UiContainer$$ExternalSyntheticLambda52 implements Function0 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ PagerState f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ UiContainer$$ExternalSyntheticLambda52(int i, PagerState pagerState) {
        this.f$1 = i;
        this.f$0 = pagerState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        PagerState pagerState = this.f$0;
        int i2 = this.f$1;
        switch (i) {
            case 0:
                return Boolean.valueOf(pagerState.getSettledPage() == i2);
            default:
                float f = RecyclerView.DECELERATION_RATE;
                if (i2 != -1) {
                    f = RangesKt___RangesKt.coerceIn(1.0f - Math.abs(pagerState.getOffsetDistanceInPages(i2)), RecyclerView.DECELERATION_RATE, 1.0f);
                }
                return Float.valueOf(f);
        }
    }

    public /* synthetic */ UiContainer$$ExternalSyntheticLambda52(PagerState pagerState, int i) {
        this.f$0 = pagerState;
        this.f$1 = i;
    }
}
