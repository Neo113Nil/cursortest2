package com.braze.ui.actions.brazeactions;

import com.braze.ui.actions.brazeactions.BrazeActionParser;
import com.braze.ui.actions.brazeactions.steps.StepData;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class BrazeActionParser$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BrazeActionParser.ActionType f$0;
    public final /* synthetic */ StepData f$1;

    public /* synthetic */ BrazeActionParser$$ExternalSyntheticLambda0(BrazeActionParser.ActionType actionType, StepData stepData, int i) {
        this.$r8$classId = i;
        this.f$0 = actionType;
        this.f$1 = stepData;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String actionType$lambda$0;
        String parse$lambda$0;
        int i = this.$r8$classId;
        StepData stepData = this.f$1;
        BrazeActionParser.ActionType actionType = this.f$0;
        switch (i) {
            case 0:
                actionType$lambda$0 = BrazeActionParser.getActionType$lambda$0(actionType, stepData);
                return actionType$lambda$0;
            default:
                parse$lambda$0 = BrazeActionParser.parse$lambda$0(actionType, stepData);
                return parse$lambda$0;
        }
    }
}
