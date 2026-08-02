package com.squareup.cash.investing.db;

import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import com.squareup.cash.investing.presenters.InvestingPortfolioPresenter;
import com.squareup.cash.investing.viewmodels.PortfolioStockMetricType;
import com.squareup.cash.investing.viewmodels.categories.SubFilterViewModel;
import com.squareup.cash.invitations.InviteContactsViewModel;
import com.squareup.cash.portfolio.graphs.GraphPresenterData;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* loaded from: classes6.dex */
public final /* synthetic */ class InvestmentHoldingQueries$$ExternalSyntheticLambda4 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ InvestmentHoldingQueries$$ExternalSyntheticLambda4(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long duration;
        switch (this.$r8$classId) {
            case 0:
                Function1 function1 = (Function1) obj;
                function1.getClass();
                function1.invoke("investment_holding");
                break;
            case 1:
                Function1 function12 = (Function1) obj;
                function12.getClass();
                function12.invoke("investment_holding");
                break;
            case 2:
                Function1 function13 = (Function1) obj;
                function13.getClass();
                function13.invoke("investment_performance");
                break;
            case 3:
                Function1 function14 = (Function1) obj;
                function14.getClass();
                function14.invoke("category_in_filter_group");
                break;
            case 4:
                Function1 function15 = (Function1) obj;
                function15.getClass();
                function15.invoke("category_in_filter_group");
                break;
            case 5:
                Function1 function16 = (Function1) obj;
                function16.getClass();
                function16.invoke("category_in_filter_group");
                break;
            case 6:
                Function1 function17 = (Function1) obj;
                function17.getClass();
                function17.invoke("category");
                break;
            case 7:
                Function1 function18 = (Function1) obj;
                function18.getClass();
                function18.invoke("category");
                break;
            case 8:
                Function1 function19 = (Function1) obj;
                function19.getClass();
                function19.invoke("category");
                break;
            case 9:
                Function1 function110 = (Function1) obj;
                function110.getClass();
                function110.invoke("entity_in_category");
                break;
            case 10:
                Function1 function111 = (Function1) obj;
                function111.getClass();
                function111.invoke("entity_in_category");
                break;
            case 11:
                Function1 function112 = (Function1) obj;
                function112.getClass();
                function112.invoke("entity_in_category");
                break;
            case 12:
                Function1 function113 = (Function1) obj;
                function113.getClass();
                function113.invoke("filter_group");
                break;
            case 13:
                Function1 function114 = (Function1) obj;
                function114.getClass();
                function114.invoke("filter_group");
                break;
            case 14:
                Function1 function115 = (Function1) obj;
                function115.getClass();
                function115.invoke("filter_group");
                break;
            case 15:
                Function1 function116 = (Function1) obj;
                function116.getClass();
                function116.invoke("filter_for_category");
                break;
            case 16:
                Function1 function117 = (Function1) obj;
                function117.getClass();
                function117.invoke("filter_for_category");
                break;
            case 17:
                Function1 function118 = (Function1) obj;
                function118.getClass();
                function118.invoke("filter_for_category");
                break;
            case 18:
                GraphPresenterData graphPresenterData = (GraphPresenterData) obj;
                graphPresenterData.getClass();
                break;
            case 19:
                GraphPresenterData graphPresenterData2 = (GraphPresenterData) obj;
                graphPresenterData2.getClass();
                if (graphPresenterData2.contentModel instanceof InvestingGraphContentModel.Loaded) {
                    duration = InvestingPortfolioPresenter.DEBOUNCE_LOADING_INDICATOR;
                } else {
                    Duration.Companion companion = Duration.Companion;
                    duration = DurationKt.toDuration(0, DurationUnit.MILLISECONDS);
                }
                break;
            case 20:
                String str = (String) obj;
                str.getClass();
                break;
            case 21:
                PortfolioStockMetricType portfolioStockMetricType = (PortfolioStockMetricType) obj;
                portfolioStockMetricType.getClass();
                break;
            case 22:
                String str2 = (String) obj;
                str2.getClass();
                break;
            case 23:
                PortfolioStockMetricType portfolioStockMetricType2 = (PortfolioStockMetricType) obj;
                portfolioStockMetricType2.getClass();
                break;
            case 24:
                Pair pair = (Pair) obj;
                pair.getClass();
                break;
            case 25:
                SubFilterViewModel subFilterViewModel = (SubFilterViewModel) obj;
                subFilterViewModel.getClass();
                String selectedOptionToken = subFilterViewModel.getSelectedOptionToken();
                selectedOptionToken.getClass();
                break;
            case 26:
                ((SemanticsPropertyReceiver) obj).getClass();
                break;
            case 27:
                ((String) obj).getClass();
                break;
            case 28:
                ((InviteContactsViewModel.Contact) obj).getClass();
                break;
            default:
                ((String) obj).getClass();
                break;
        }
        return Unit.INSTANCE;
    }
}
