package com.squareup.cash.family.familyhub.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.family.familyhub.viewmodels.ControlDisablingConfirmationViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class ControlDisablingConfirmationDialogKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ ControlDisablingConfirmationViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ ControlDisablingConfirmationDialogKt$$ExternalSyntheticLambda0(int i, ControlDisablingConfirmationViewModel controlDisablingConfirmationViewModel, Function1 function1) {
        this.f$0 = controlDisablingConfirmationViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        ControlDisablingConfirmationViewModel controlDisablingConfirmationViewModel = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    AllowanceViewKt.DisablingConfirmationDialog(controlDisablingConfirmationViewModel, function1, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                num.getClass();
                AllowanceViewKt.DisablingConfirmationDialog(controlDisablingConfirmationViewModel, function1, composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ControlDisablingConfirmationDialogKt$$ExternalSyntheticLambda0(ControlDisablingConfirmationViewModel controlDisablingConfirmationViewModel, Function1 function1) {
        this.f$0 = controlDisablingConfirmationViewModel;
        this.f$1 = function1;
    }
}
