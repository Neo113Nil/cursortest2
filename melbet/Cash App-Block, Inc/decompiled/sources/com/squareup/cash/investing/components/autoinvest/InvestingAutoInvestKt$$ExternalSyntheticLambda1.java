package com.squareup.cash.investing.components.autoinvest;

import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoRecurringPurchaseTileViewModel;
import com.squareup.cash.recurring.db.RecurringPreferenceId;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class InvestingAutoInvestKt$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ InvestingCryptoRecurringPurchaseTileViewModel.Item f$1;

    public /* synthetic */ InvestingAutoInvestKt$$ExternalSyntheticLambda1(Function1 function1, InvestingCryptoRecurringPurchaseTileViewModel.Item item, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = item;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        InvestingCryptoRecurringPurchaseTileViewModel.Item item = this.f$1;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(new RecurringPreferenceId(item.preferenceId));
                break;
            default:
                function1.invoke(new RecurringPreferenceId(item.preferenceId));
                break;
        }
        return Unit.INSTANCE;
    }
}
