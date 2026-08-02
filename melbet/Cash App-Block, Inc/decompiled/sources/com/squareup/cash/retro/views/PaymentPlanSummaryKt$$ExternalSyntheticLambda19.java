package com.squareup.cash.retro.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import com.squareup.cash.retro.viewmodels.PaymentPlanSummaryViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class PaymentPlanSummaryKt$$ExternalSyntheticLambda19 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ PaymentPlanSummaryViewModel.SummarySection f$0;
    public final /* synthetic */ Function0 f$1;
    public final /* synthetic */ Modifier f$2;

    public /* synthetic */ PaymentPlanSummaryKt$$ExternalSyntheticLambda19(PaymentPlanSummaryViewModel.SummarySection summarySection, Function0 function0, Modifier modifier, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = summarySection;
        this.f$1 = function0;
        this.f$2 = modifier;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                PaymentPlanSummaryKt.SummarySection(this.f$0, this.f$1, this.f$2, composer, Updater.updateChangedFlags(1));
                break;
            default:
                PaymentPlanSummaryViewKt.SummarySection(this.f$0, this.f$1, this.f$2, composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
