package com.squareup.cash.retro.views;

import com.squareup.cash.retro.viewmodels.PaymentPlanSummaryViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final /* synthetic */ class PaymentPlanSummaryKt$$ExternalSyntheticLambda32 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ PaymentPlanSummaryViewModel.LabeledLink f$1;

    public /* synthetic */ PaymentPlanSummaryKt$$ExternalSyntheticLambda32(Function1 function1, PaymentPlanSummaryViewModel.LabeledLink labeledLink, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = labeledLink;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.invoke(this.f$1.uri);
                break;
            default:
                this.f$0.invoke(this.f$1.uri);
                break;
        }
        return Unit.INSTANCE;
    }
}
