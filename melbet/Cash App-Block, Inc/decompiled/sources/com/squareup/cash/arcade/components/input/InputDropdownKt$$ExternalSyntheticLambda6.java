package com.squareup.cash.arcade.components.input;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final /* synthetic */ class InputDropdownKt$$ExternalSyntheticLambda6 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DropdownState f$0;

    public /* synthetic */ InputDropdownKt$$ExternalSyntheticLambda6(DropdownState dropdownState, int i) {
        this.$r8$classId = i;
        this.f$0 = dropdownState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        DropdownState dropdownState = this.f$0;
        switch (i) {
            case 0:
                dropdownState.expanded$delegate.setValue(Boolean.valueOf(!((Boolean) dropdownState.expanded$delegate.getValue()).booleanValue()));
                break;
            default:
                dropdownState.expanded$delegate.setValue(Boolean.FALSE);
                break;
        }
        return Unit.INSTANCE;
    }
}
