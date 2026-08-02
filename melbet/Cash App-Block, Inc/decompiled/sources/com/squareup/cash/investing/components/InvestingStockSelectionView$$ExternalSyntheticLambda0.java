package com.squareup.cash.investing.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.room.TransactorKt;
import app.cash.local.views.LocalViewFactory$$ExternalSyntheticLambda4;
import com.squareup.cash.investing.viewmodels.InvestingStockSelectionViewModel;
import com.squareup.cash.offers.db.OffersHomeQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.p2pblocking.views.P2PListView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class InvestingStockSelectionView$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 2;
    public final /* synthetic */ InvestingStockSelectionViewModel f$0;
    public final /* synthetic */ Function1 f$1;
    public final /* synthetic */ P2PListView f$2;

    public /* synthetic */ InvestingStockSelectionView$$ExternalSyntheticLambda0(InvestingStockSelectionViewModel investingStockSelectionViewModel, P2PListView p2PListView, Function1 function1) {
        this.f$0 = investingStockSelectionViewModel;
        this.f$2 = p2PListView;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        InvestingStockSelectionViewModel investingStockSelectionViewModel = this.f$0;
        Function1 function1 = this.f$1;
        P2PListView p2PListView = this.f$2;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    InvestingStockSelectionViewModel investingStockSelectionViewModel2 = this.f$0;
                    TransactorKt.LoadableContent(investingStockSelectionViewModel2, investingStockSelectionViewModel2 instanceof InvestingStockSelectionViewModel.Submitting, null, null, new OffersHomeQueries$$ExternalSyntheticLambda1(false, 5), null, Expect_jvmKt.rememberComposableLambda(-970996943, new LocalViewFactory$$ExternalSyntheticLambda4(27, function1, p2PListView), gapComposer), gapComposer, 1572864, 44);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                p2PListView.Content(investingStockSelectionViewModel, function1, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    ArcadeBordersKt.StockList((InvestingStockSelectionViewModel.Loaded) investingStockSelectionViewModel, p2PListView.imageLoader, function1, gapComposer2, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ InvestingStockSelectionView$$ExternalSyntheticLambda0(InvestingStockSelectionViewModel investingStockSelectionViewModel, Function1 function1, P2PListView p2PListView) {
        this.f$0 = investingStockSelectionViewModel;
        this.f$1 = function1;
        this.f$2 = p2PListView;
    }

    public /* synthetic */ InvestingStockSelectionView$$ExternalSyntheticLambda0(P2PListView p2PListView, InvestingStockSelectionViewModel investingStockSelectionViewModel, Function1 function1, int i) {
        this.f$2 = p2PListView;
        this.f$0 = investingStockSelectionViewModel;
        this.f$1 = function1;
    }
}
