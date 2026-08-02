package com.braze.ui.actions.brazeactions.steps;

import com.braze.ui.actions.brazeactions.BrazeActionParser;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class StepData$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ StepData f$0;

    public /* synthetic */ StepData$$ExternalSyntheticLambda0(int i, StepData stepData) {
        this.$r8$classId = i;
        this.f$0 = stepData;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List args_delegate$lambda$0;
        String parse$lambda$1;
        String run$lambda$0;
        String run$lambda$02;
        Object firstArg_delegate$lambda$0;
        Object secondArg_delegate$lambda$0;
        int i = this.$r8$classId;
        StepData stepData = this.f$0;
        switch (i) {
            case 0:
                args_delegate$lambda$0 = StepData.args_delegate$lambda$0(stepData);
                return args_delegate$lambda$0;
            case 1:
                parse$lambda$1 = BrazeActionParser.parse$lambda$1(stepData);
                return parse$lambda$1;
            case 2:
                run$lambda$0 = SetEmailSubscriptionStep.run$lambda$0(stepData);
                return run$lambda$0;
            case 3:
                run$lambda$02 = SetPushNotificationSubscriptionStep.run$lambda$0(stepData);
                return run$lambda$02;
            case 4:
                firstArg_delegate$lambda$0 = StepData.firstArg_delegate$lambda$0(stepData);
                return firstArg_delegate$lambda$0;
            default:
                secondArg_delegate$lambda$0 = StepData.secondArg_delegate$lambda$0(stepData);
                return secondArg_delegate$lambda$0;
        }
    }
}
