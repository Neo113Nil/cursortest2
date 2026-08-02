package com.squareup.cash.banking.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.banking.viewmodels.BankingDialogViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class BankingDialog$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ BankingDialogViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ BankingDialog$$ExternalSyntheticLambda0(BankingDialogViewModel bankingDialogViewModel, Function1 function1) {
        this.f$0 = bankingDialogViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        BankingDialogViewModel bankingDialogViewModel = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                int i2 = BankingDialog.$r8$clinit;
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    BankingDialogKt.BankingDialog(bankingDialogViewModel, function1, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                num.getClass();
                BankingDialogKt.BankingDialog(bankingDialogViewModel, function1, composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ BankingDialog$$ExternalSyntheticLambda0(BankingDialogViewModel bankingDialogViewModel, Function1 function1, int i) {
        this.f$0 = bankingDialogViewModel;
        this.f$1 = function1;
    }
}
