package com.squareup.cash.directdeposit.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.banking.viewmodels.DemandDepositDialogViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class DirectDepositDialogKt$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ DemandDepositDialogViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ DirectDepositDialogKt$$ExternalSyntheticLambda2(DemandDepositDialogViewModel demandDepositDialogViewModel, Function1 function1) {
        this.f$0 = demandDepositDialogViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        DemandDepositDialogViewModel demandDepositDialogViewModel = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                DirectDepositDialogKt.DirectDepositDialog(demandDepositDialogViewModel, function1, composer, Updater.updateChangedFlags(1));
                break;
            default:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    DirectDepositDialogKt.DirectDepositDialog(demandDepositDialogViewModel, function1, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ DirectDepositDialogKt$$ExternalSyntheticLambda2(DemandDepositDialogViewModel demandDepositDialogViewModel, Function1 function1, int i) {
        this.f$0 = demandDepositDialogViewModel;
        this.f$1 = function1;
    }
}
