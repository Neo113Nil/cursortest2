package com.squareup.cash.paychecks.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.paychecks.viewmodels.MultipleAllocationViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class MultipleAllocationView$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ MultipleAllocationViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ MultipleAllocationView$$ExternalSyntheticLambda1(MultipleAllocationViewModel multipleAllocationViewModel, Function1 function1) {
        this.f$0 = multipleAllocationViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        MultipleAllocationViewModel multipleAllocationViewModel = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                int i2 = MultipleAllocationView.$r8$clinit;
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    HelpSheetViewKt.MultipleAllocation(multipleAllocationViewModel, function1, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                num.getClass();
                HelpSheetViewKt.MultipleAllocation(multipleAllocationViewModel, function1, composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ MultipleAllocationView$$ExternalSyntheticLambda1(MultipleAllocationViewModel multipleAllocationViewModel, Function1 function1, int i) {
        this.f$0 = multipleAllocationViewModel;
        this.f$1 = function1;
    }
}
