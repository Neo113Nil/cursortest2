package com.squareup.cash.core.navigationcontainer;

import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.ValueInsets;
import androidx.core.graphics.Insets;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes5.dex */
public final /* synthetic */ class UiContainerKt$$ExternalSyntheticLambda12 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ float f$1;

    public /* synthetic */ UiContainerKt$$ExternalSyntheticLambda12(Function1 function1, float f, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        float f = this.f$1;
        Function1 function1 = this.f$0;
        LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
        switch (i) {
            case 0:
                layoutCoordinates.getClass();
                LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
                parentLayoutCoordinates.getClass();
                function1.invoke(UiContainerKt.scaleInsets(Insets.of(0, 0, 0, ((int) (parentLayoutCoordinates.mo838getSizeYbymL2g() & BodyPartID.bodyIdMax)) - ((int) Float.intBitsToFloat((int) (BodyPartID.bodyIdMax & ValueInsets.positionInParent(layoutCoordinates))))), f));
                break;
            default:
                layoutCoordinates.getClass();
                LayoutCoordinates parentLayoutCoordinates2 = layoutCoordinates.getParentLayoutCoordinates();
                parentLayoutCoordinates2.getClass();
                function1.invoke(UiContainerKt.scaleInsets(Insets.of(0, 0, 0, ((int) (parentLayoutCoordinates2.mo838getSizeYbymL2g() & BodyPartID.bodyIdMax)) - ((int) Float.intBitsToFloat((int) (BodyPartID.bodyIdMax & ValueInsets.positionInParent(layoutCoordinates))))), f));
                break;
        }
        return Unit.INSTANCE;
    }
}
