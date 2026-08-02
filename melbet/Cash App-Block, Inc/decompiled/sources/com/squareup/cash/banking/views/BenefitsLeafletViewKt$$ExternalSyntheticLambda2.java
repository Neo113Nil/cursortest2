package com.squareup.cash.banking.views;

import com.squareup.cash.banking.viewmodels.BenefitsLeafletViewEvent;
import com.squareup.cash.banking.viewmodels.BenefitsLeafletViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final /* synthetic */ class BenefitsLeafletViewKt$$ExternalSyntheticLambda2 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ BenefitsLeafletViewModel f$1;

    public /* synthetic */ BenefitsLeafletViewKt$$ExternalSyntheticLambda2(Function1 function1, BenefitsLeafletViewModel benefitsLeafletViewModel, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = benefitsLeafletViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.invoke(new BenefitsLeafletViewEvent.Dismissed(this.f$1 instanceof BenefitsLeafletViewModel.Error));
                break;
            default:
                this.f$0.invoke(new BenefitsLeafletViewEvent.Dismissed(this.f$1 instanceof BenefitsLeafletViewModel.Error));
                break;
        }
        return Unit.INSTANCE;
    }
}
