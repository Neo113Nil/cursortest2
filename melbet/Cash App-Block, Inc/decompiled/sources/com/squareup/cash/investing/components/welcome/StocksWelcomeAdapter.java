package com.squareup.cash.investing.components.welcome;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import coil3.RealImageLoader;
import com.squareup.cash.composable.adapter.SingleRowAdapter;
import com.squareup.cash.investing.viewmodels.InvestingHomeViewModel;

/* loaded from: classes6.dex */
public final class StocksWelcomeAdapter extends SingleRowAdapter {
    public final InvestingStocksWelcomeView$Factory$Impl viewFactory;

    public StocksWelcomeAdapter(InvestingStocksWelcomeView$Factory$Impl investingStocksWelcomeView$Factory$Impl) {
        super(1, false);
        this.viewFactory = investingStocksWelcomeView$Factory$Impl;
        setHasStableIds(true);
    }

    @Override // com.squareup.cash.composable.adapter.SingleRowAdapter
    public final void bind(View view, Object obj) {
        InvestingStocksWelcomeView investingStocksWelcomeView = (InvestingStocksWelcomeView) view;
        InvestingHomeViewModel.StocksWelcome stocksWelcome = (InvestingHomeViewModel.StocksWelcome) obj;
        investingStocksWelcomeView.getClass();
        stocksWelcome.getClass();
        if (stocksWelcome.equals(investingStocksWelcomeView.lastRenderedModel)) {
            return;
        }
        investingStocksWelcomeView.lastRenderedModel = stocksWelcome;
        investingStocksWelcomeView.heroView.setContent(new ComposableLambdaImpl(new InvestingStocksWelcomeView$$ExternalSyntheticLambda0(stocksWelcome, 0), true, -1462101732));
    }

    @Override // com.squareup.cash.composable.adapter.SingleRowAdapter
    public final View createView(ViewGroup viewGroup) {
        viewGroup.getClass();
        Context context = viewGroup.getContext();
        context.getClass();
        InvestingStocksWelcomeView$Factory$Impl investingStocksWelcomeView$Factory$Impl = this.viewFactory;
        investingStocksWelcomeView$Factory$Impl.getClass();
        RealImageLoader realImageLoader = (RealImageLoader) investingStocksWelcomeView$Factory$Impl.delegateFactory.staticImageLoader.invoke();
        realImageLoader.getClass();
        return new InvestingStocksWelcomeView(context, realImageLoader);
    }

    @Override // com.squareup.cash.composable.adapter.SingleRowAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        return 1L;
    }
}
