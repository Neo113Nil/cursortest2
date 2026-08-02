package com.squareup.cash.earningstracker.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import com.squareup.cash.earningstracker.viewmodels.EarningsTrackerViewModel;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class EarningsTrackerViewKt$$ExternalSyntheticLambda3 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ EarningsTrackerViewModel f$0;
    public final /* synthetic */ Function1 f$1;
    public final /* synthetic */ MoneyFormatter f$2;
    public final /* synthetic */ MoneyFormatter f$3;

    public /* synthetic */ EarningsTrackerViewKt$$ExternalSyntheticLambda3(EarningsTrackerViewModel earningsTrackerViewModel, Function1 function1, MoneyFormatter moneyFormatter, MoneyFormatter moneyFormatter2, int i) {
        this.$r8$classId = i;
        this.f$0 = earningsTrackerViewModel;
        this.f$1 = function1;
        this.f$2 = moneyFormatter;
        this.f$3 = moneyFormatter2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    EarningsTrackerViewKt.EarningsTrackerUi(this.f$0, this.f$1, this.f$2, this.f$3, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    EarningsTrackerViewKt.EarningsContent((EarningsTrackerViewModel.Loaded) this.f$0, this.f$1, this.f$2, this.f$3, gapComposer2, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
