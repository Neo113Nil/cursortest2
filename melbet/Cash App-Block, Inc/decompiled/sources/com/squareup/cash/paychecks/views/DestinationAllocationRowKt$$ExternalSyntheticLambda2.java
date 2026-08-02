package com.squareup.cash.paychecks.views;

import com.squareup.cash.paychecks.viewmodels.DestinationAllocationRowViewModel;
import com.squareup.cash.paychecks.viewmodels.DistributePaycheckViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class DestinationAllocationRowKt$$ExternalSyntheticLambda2 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ DestinationAllocationRowViewModel f$1;

    public /* synthetic */ DestinationAllocationRowKt$$ExternalSyntheticLambda2(Function1 function1, DestinationAllocationRowViewModel destinationAllocationRowViewModel, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = destinationAllocationRowViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        DestinationAllocationRowViewModel destinationAllocationRowViewModel = this.f$1;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(new DistributePaycheckViewEvent.AllocationRowViewEvent(destinationAllocationRowViewModel.action));
                return Unit.INSTANCE;
            default:
                function1.invoke(new DistributePaycheckViewEvent.AllocationRowViewEvent(destinationAllocationRowViewModel.action));
                return Boolean.TRUE;
        }
    }
}
