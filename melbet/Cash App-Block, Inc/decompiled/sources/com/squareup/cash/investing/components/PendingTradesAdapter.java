package com.squareup.cash.investing.components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.ui.Ui;
import com.squareup.cash.composable.adapter.SingleRowAdapter;
import com.squareup.cash.investing.components.market.hours.InvestingPendingTradesTileView;
import com.squareup.cash.investing.viewmodels.market.hours.InvestingPendingTradesTileWidgetViewModel;
import com.squareup.util.android.Views;

/* loaded from: classes6.dex */
public final class PendingTradesAdapter extends SingleRowAdapter {
    public final InvestingHomeView$$ExternalSyntheticLambda2 eventReceiverProducer;

    public PendingTradesAdapter(InvestingHomeView$$ExternalSyntheticLambda2 investingHomeView$$ExternalSyntheticLambda2) {
        super(14, false);
        this.eventReceiverProducer = investingHomeView$$ExternalSyntheticLambda2;
    }

    @Override // com.squareup.cash.composable.adapter.SingleRowAdapter
    public final void bind(View view, Object obj) {
        InvestingPendingTradesTileView investingPendingTradesTileView = (InvestingPendingTradesTileView) view;
        InvestingPendingTradesTileWidgetViewModel investingPendingTradesTileWidgetViewModel = (InvestingPendingTradesTileWidgetViewModel) obj;
        investingPendingTradesTileView.getClass();
        investingPendingTradesTileWidgetViewModel.getClass();
        investingPendingTradesTileView.setModel(investingPendingTradesTileWidgetViewModel);
        investingPendingTradesTileView.setEventReceiver((Ui.EventReceiver) this.eventReceiverProducer.invoke());
    }

    @Override // com.squareup.cash.composable.adapter.SingleRowAdapter
    public final View createView(ViewGroup viewGroup) {
        viewGroup.getClass();
        Context context = viewGroup.getContext();
        context.getClass();
        InvestingPendingTradesTileView investingPendingTradesTileView = new InvestingPendingTradesTileView(context);
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, -2);
        layoutParams.setMargins(Views.dip((View) investingPendingTradesTileView, 24), Views.dip((View) investingPendingTradesTileView, 24), Views.dip((View) investingPendingTradesTileView, 24), 0);
        investingPendingTradesTileView.setLayoutParams(layoutParams);
        return investingPendingTradesTileView;
    }
}
