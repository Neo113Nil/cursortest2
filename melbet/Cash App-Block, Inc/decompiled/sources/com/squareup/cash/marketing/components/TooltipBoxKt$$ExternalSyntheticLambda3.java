package com.squareup.cash.marketing.components;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.JobKt;

/* loaded from: classes6.dex */
public final /* synthetic */ class TooltipBoxKt$$ExternalSyntheticLambda3 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TooltipState f$0;
    public final /* synthetic */ Function0 f$1;

    public /* synthetic */ TooltipBoxKt$$ExternalSyntheticLambda3(TooltipState tooltipState, Function0 function0, int i) {
        this.$r8$classId = i;
        this.f$0 = tooltipState;
        this.f$1 = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Function0 function0 = this.f$1;
        TooltipState tooltipState = this.f$0;
        switch (i) {
            case 0:
                JobKt.launch$default(tooltipState.scope, null, null, new TooltipState$hide$1(tooltipState, null, 0), 3);
                function0.invoke();
                break;
            default:
                JobKt.launch$default(tooltipState.scope, null, null, new TooltipState$hide$1(tooltipState, null, 0), 3);
                function0.invoke();
                break;
        }
        return Unit.INSTANCE;
    }
}
