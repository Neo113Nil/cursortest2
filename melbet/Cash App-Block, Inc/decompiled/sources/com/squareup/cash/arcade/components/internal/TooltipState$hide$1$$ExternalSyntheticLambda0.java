package com.squareup.cash.arcade.components.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class TooltipState$hide$1$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TooltipState f$0;

    public /* synthetic */ TooltipState$hide$1$$ExternalSyntheticLambda0(TooltipState tooltipState, int i) {
        this.$r8$classId = i;
        this.f$0 = tooltipState;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        TooltipState tooltipState = this.f$0;
        float floatValue = ((Float) obj).floatValue();
        ((Float) obj2).getClass();
        switch (i) {
            case 0:
                tooltipState._alpha$delegate.setFloatValue(floatValue);
                break;
            default:
                tooltipState._alpha$delegate.setFloatValue(floatValue);
                break;
        }
        return Unit.INSTANCE;
    }
}
