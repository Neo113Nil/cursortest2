package com.squareup.cash.fidesmo.views;

import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import com.squareup.cash.fidesmo.viewmodels.FidesmoScanningPulseShape;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class ScanningShapePulseKt$$ExternalSyntheticLambda3 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ float f$0;
    public final /* synthetic */ FidesmoScanningPulseShape f$1;

    public /* synthetic */ ScanningShapePulseKt$$ExternalSyntheticLambda3(float f, FidesmoScanningPulseShape fidesmoScanningPulseShape, int i) {
        this.$r8$classId = i;
        this.f$0 = f;
        this.f$1 = fidesmoScanningPulseShape;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        FidesmoScanningPulseShape fidesmoScanningPulseShape = this.f$1;
        float f = this.f$0;
        ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj;
        reusableGraphicsLayerScope.getClass();
        switch (i) {
            case 0:
                reusableGraphicsLayerScope.setRotationZ(f);
                reusableGraphicsLayerScope.m711setTransformOrigin__ExYCQ(ScanningShapePulseKt.rotationTransformOrigin(fidesmoScanningPulseShape));
                break;
            default:
                reusableGraphicsLayerScope.setRotationZ(f);
                reusableGraphicsLayerScope.m711setTransformOrigin__ExYCQ(ScanningShapePulseKt.rotationTransformOrigin(fidesmoScanningPulseShape));
                break;
        }
        return Unit.INSTANCE;
    }
}
