package com.braze.ui.actions.brazeactions.steps;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class StepData$$ExternalSyntheticLambda3 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ int f$0;
    public final /* synthetic */ StepData f$1;

    public /* synthetic */ StepData$$ExternalSyntheticLambda3(int i, StepData stepData, int i2) {
        this.$r8$classId = i2;
        this.f$0 = i;
        this.f$1 = stepData;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String isArgString$lambda$0;
        String isArgOptionalJsonObject$lambda$0;
        String isArgCountInBounds$lambda$0;
        int i = this.$r8$classId;
        StepData stepData = this.f$1;
        int i2 = this.f$0;
        switch (i) {
            case 0:
                isArgString$lambda$0 = StepData.isArgString$lambda$0(i2, stepData);
                return isArgString$lambda$0;
            case 1:
                isArgOptionalJsonObject$lambda$0 = StepData.isArgOptionalJsonObject$lambda$0(i2, stepData);
                return isArgOptionalJsonObject$lambda$0;
            default:
                isArgCountInBounds$lambda$0 = StepData.isArgCountInBounds$lambda$0(i2, stepData);
                return isArgCountInBounds$lambda$0;
        }
    }
}
