package com.squareup.cash.arcade.components;

import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt__MathJVMKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes5.dex */
public final /* synthetic */ class SegmentedControlKt$$ExternalSyntheticLambda4 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AnchoredDraggableState f$0;

    public /* synthetic */ SegmentedControlKt$$ExternalSyntheticLambda4(AnchoredDraggableState anchoredDraggableState, int i) {
        this.$r8$classId = i;
        this.f$0 = anchoredDraggableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Density density = (Density) obj;
        switch (this.$r8$classId) {
            case 0:
                density.getClass();
                break;
            case 1:
                density.getClass();
                break;
            default:
                density.getClass();
                break;
        }
        return new IntOffset(MathKt__MathJVMKt.roundToInt(this.f$0.requireOffset()) & BodyPartID.bodyIdMax);
    }
}
