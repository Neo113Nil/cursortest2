package com.squareup.cash.banking.views;

import com.squareup.cash.banking.viewmodels.BalanceHomeViewEvent;
import com.squareup.protos.franklin.common.BalanceData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final /* synthetic */ class BalanceHomeViewKt$$ExternalSyntheticLambda16 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ BalanceData.Button f$1;

    public /* synthetic */ BalanceHomeViewKt$$ExternalSyntheticLambda16(Function1 function1, BalanceData.Button button, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = button;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        BalanceData.Button button = this.f$1;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(new BalanceHomeViewEvent.BankingDetailsClicked(button));
                break;
            default:
                function1.invoke(new BalanceHomeViewEvent.BankingDetailsClicked(button));
                break;
        }
        return Unit.INSTANCE;
    }
}
