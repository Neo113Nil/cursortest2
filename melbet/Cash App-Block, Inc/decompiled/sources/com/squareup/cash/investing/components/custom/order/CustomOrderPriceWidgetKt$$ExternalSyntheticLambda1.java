package com.squareup.cash.investing.components.custom.order;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt__MathJVMKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes6.dex */
public final /* synthetic */ class CustomOrderPriceWidgetKt$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ GraphState f$0;
    public final /* synthetic */ PriceWidgetState f$1;

    public /* synthetic */ CustomOrderPriceWidgetKt$$ExternalSyntheticLambda1(GraphState graphState, PriceWidgetState priceWidgetState, int i) {
        this.$r8$classId = i;
        this.f$0 = graphState;
        this.f$1 = priceWidgetState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        PriceWidgetState priceWidgetState = this.f$1;
        GraphState graphState = this.f$0;
        Density density = (Density) obj;
        switch (i) {
            case 0:
                density.getClass();
                return new IntOffset((((MathKt__MathJVMKt.roundToInt(Float.intBitsToFloat((int) (((Offset) graphState.graphPosition$delegate.getValue()).packedValue & BodyPartID.bodyIdMax))) - priceWidgetState.dragWidgetOffset$delegate.getIntValue()) - priceWidgetState.tooltipHeight$delegate.getIntValue()) - density.mo230roundToPx0680j_4(8.0f)) & BodyPartID.bodyIdMax);
            default:
                density.getClass();
                return new IntOffset((MathKt__MathJVMKt.roundToInt(Float.intBitsToFloat((int) (((Offset) graphState.graphPosition$delegate.getValue()).packedValue & BodyPartID.bodyIdMax))) - priceWidgetState.dragWidgetOffset$delegate.getIntValue()) & BodyPartID.bodyIdMax);
        }
    }
}
