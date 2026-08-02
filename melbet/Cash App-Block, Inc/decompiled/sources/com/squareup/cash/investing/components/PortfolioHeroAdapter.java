package com.squareup.cash.investing.components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.platform.ComposeView;
import com.squareup.cash.composable.adapter.SingleRowAdapter;
import com.squareup.cash.pdf.view.PdfPreviewViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingHomePortfolioHeaderContentModel;
import com.squareup.cash.portfolio.graphs.views.InvestingPortfolioAmountView;

/* loaded from: classes6.dex */
public final class PortfolioHeroAdapter extends SingleRowAdapter {
    @Override // com.squareup.cash.composable.adapter.SingleRowAdapter
    public final void bind(View view, Object obj) {
        InvestingPortfolioAmountView investingPortfolioAmountView = (InvestingPortfolioAmountView) view;
        InvestingHomePortfolioHeaderContentModel investingHomePortfolioHeaderContentModel = (InvestingHomePortfolioHeaderContentModel) obj;
        investingPortfolioAmountView.getClass();
        investingHomePortfolioHeaderContentModel.getClass();
        ComposeView composeView = investingPortfolioAmountView.composeHeaderView;
        composeView.setVisibility(0);
        investingPortfolioAmountView.titleView.setVisibility(8);
        investingPortfolioAmountView.uptoDateDataViews.setVisibility(8);
        investingPortfolioAmountView.staleDataMessageView.setVisibility(8);
        composeView.setContent(new ComposableLambdaImpl(new PdfPreviewViewKt$$ExternalSyntheticLambda0(27, investingPortfolioAmountView, investingHomePortfolioHeaderContentModel), true, -2078070688));
    }

    @Override // com.squareup.cash.composable.adapter.SingleRowAdapter
    public final View createView(ViewGroup viewGroup) {
        viewGroup.getClass();
        Context context = viewGroup.getContext();
        context.getClass();
        return new InvestingPortfolioAmountView(context);
    }
}
