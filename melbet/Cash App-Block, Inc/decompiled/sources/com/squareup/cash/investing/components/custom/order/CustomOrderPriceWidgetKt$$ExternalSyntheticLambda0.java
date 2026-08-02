package com.squareup.cash.investing.components.custom.order;

import androidx.compose.ui.unit.IntSize;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes6.dex */
public final /* synthetic */ class CustomOrderPriceWidgetKt$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ PriceWidgetState f$0;

    public /* synthetic */ CustomOrderPriceWidgetKt$$ExternalSyntheticLambda0(PriceWidgetState priceWidgetState, int i) {
        this.$r8$classId = i;
        this.f$0 = priceWidgetState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        PriceWidgetState priceWidgetState = this.f$0;
        IntSize intSize = (IntSize) obj;
        switch (i) {
            case 0:
                int intValue = priceWidgetState.tooltipHeight$delegate.getIntValue();
                int i2 = (int) (BodyPartID.bodyIdMax & intSize.packedValue);
                if (intValue != i2) {
                    priceWidgetState.tooltipHeight$delegate.setIntValue(i2);
                }
                break;
            default:
                int i3 = ((int) (intSize.packedValue & BodyPartID.bodyIdMax)) / 2;
                if (priceWidgetState.dragWidgetOffset$delegate.getIntValue() != i3) {
                    priceWidgetState.dragWidgetOffset$delegate.setIntValue(i3);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
