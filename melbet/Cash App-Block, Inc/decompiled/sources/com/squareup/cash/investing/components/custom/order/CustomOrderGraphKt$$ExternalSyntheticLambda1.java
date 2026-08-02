package com.squareup.cash.investing.components.custom.order;

import com.squareup.cash.multiplatform.investing.PriceValue;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final /* synthetic */ class CustomOrderGraphKt$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ GraphState f$0;

    public /* synthetic */ CustomOrderGraphKt$$ExternalSyntheticLambda1(GraphState graphState, int i) {
        this.$r8$classId = i;
        this.f$0 = graphState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        GraphState graphState = this.f$0;
        switch (i) {
            case 0:
                long j = graphState.currentPrice;
                graphState.onSelectPrice.invoke(null);
                graphState.selectedPrice$delegate.setValue(new PriceValue(j));
                graphState.currentPrice = j;
                graphState.priceWidgetOffsetY$delegate.setFloatValue(graphState.m3582pointForPricenM2_iWI(j));
                break;
            case 1:
                graphState.tick(-1);
                break;
            default:
                graphState.tick(1);
                break;
        }
        return Unit.INSTANCE;
    }
}
