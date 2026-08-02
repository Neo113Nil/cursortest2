package com.squareup.cash.earnings.views.home;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.earnings.viewmodels.home.EarningsHomeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class EarningsToolsSectionKt$$ExternalSyntheticLambda6 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ EarningsHomeViewModel.EarningToolsItem f$0;

    public /* synthetic */ EarningsToolsSectionKt$$ExternalSyntheticLambda6(EarningsHomeViewModel.EarningToolsItem earningToolsItem, int i) {
        this.$r8$classId = 1;
        this.f$0 = earningToolsItem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        EarningsHomeViewModel.EarningToolsItem earningToolsItem = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    EarningsToolsSectionKt.EarningToolLabel(earningToolsItem, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                num.getClass();
                EarningsToolsSectionKt.EarningToolLabel(earningToolsItem, composer, Updater.updateChangedFlags(1));
                break;
            default:
                int intValue2 = num.intValue();
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    EarningsToolsSectionKt.EarningToolLabel(earningToolsItem, gapComposer2, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ EarningsToolsSectionKt$$ExternalSyntheticLambda6(EarningsHomeViewModel.EarningToolsItem earningToolsItem, int i, byte b) {
        this.$r8$classId = i;
        this.f$0 = earningToolsItem;
    }
}
