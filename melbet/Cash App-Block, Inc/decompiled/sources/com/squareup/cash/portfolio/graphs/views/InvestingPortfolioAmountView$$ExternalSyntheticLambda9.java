package com.squareup.cash.portfolio.graphs.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingHomePortfolioHeaderContentModel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class InvestingPortfolioAmountView$$ExternalSyntheticLambda9 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ InvestingHomePortfolioHeaderContentModel f$0;

    public /* synthetic */ InvestingPortfolioAmountView$$ExternalSyntheticLambda9(InvestingHomePortfolioHeaderContentModel investingHomePortfolioHeaderContentModel, int i) {
        this.$r8$classId = 2;
        this.f$0 = investingHomePortfolioHeaderContentModel;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        InvestingHomePortfolioHeaderContentModel investingHomePortfolioHeaderContentModel = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                int i2 = InvestingPortfolioAmountView.$r8$clinit;
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    InvestingGraphTabsViewKt.InvestingPortfolioHeroHeader(investingHomePortfolioHeaderContentModel, gapComposer, 8);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, investingHomePortfolioHeaderContentModel.title, (Map) null, (Function1) null, false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                InvestingGraphTabsViewKt.InvestingPortfolioHeroHeader(investingHomePortfolioHeaderContentModel, (Composer) obj, Updater.updateChangedFlags(9));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ InvestingPortfolioAmountView$$ExternalSyntheticLambda9(InvestingHomePortfolioHeaderContentModel investingHomePortfolioHeaderContentModel, int i, byte b) {
        this.$r8$classId = i;
        this.f$0 = investingHomePortfolioHeaderContentModel;
    }
}
