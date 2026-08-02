package com.squareup.cash.paychecks.views;

import com.squareup.cash.paychecks.viewmodels.MultipleAllocationViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class MultipleAllocationViewKt$$ExternalSyntheticLambda15 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ MultipleAllocationViewModel.Active.AllocationRow f$1;

    public /* synthetic */ MultipleAllocationViewKt$$ExternalSyntheticLambda15(Function1 function1, MultipleAllocationViewModel.Active.AllocationRow allocationRow, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = allocationRow;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        MultipleAllocationViewModel.Active.AllocationRow allocationRow = this.f$1;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(allocationRow.action);
                return Unit.INSTANCE;
            default:
                function1.invoke(allocationRow.action);
                return Boolean.TRUE;
        }
    }
}
