package com.squareup.cash.investing.components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.ui.Ui;
import com.squareup.cash.composable.adapter.SingleRowAdapter;
import com.squareup.cash.investing.components.market.hours.InvestingPlaceholderGraphView;
import com.squareup.cash.investing.viewmodels.market.hours.InvestingPlaceholderGraphViewModel;

/* loaded from: classes6.dex */
public final class PlaceHolderGraphAdapter extends SingleRowAdapter {
    public final InvestingHomeView$$ExternalSyntheticLambda2 eventReceiverProducer;

    public PlaceHolderGraphAdapter(InvestingHomeView$$ExternalSyntheticLambda2 investingHomeView$$ExternalSyntheticLambda2) {
        super(16, false);
        this.eventReceiverProducer = investingHomeView$$ExternalSyntheticLambda2;
    }

    @Override // com.squareup.cash.composable.adapter.SingleRowAdapter
    public final void bind(View view, Object obj) {
        InvestingPlaceholderGraphView investingPlaceholderGraphView = (InvestingPlaceholderGraphView) view;
        InvestingPlaceholderGraphViewModel investingPlaceholderGraphViewModel = (InvestingPlaceholderGraphViewModel) obj;
        investingPlaceholderGraphView.getClass();
        investingPlaceholderGraphViewModel.getClass();
        investingPlaceholderGraphView.setModel(investingPlaceholderGraphViewModel);
        investingPlaceholderGraphView.setEventReceiver((Ui.EventReceiver) this.eventReceiverProducer.invoke());
    }

    @Override // com.squareup.cash.composable.adapter.SingleRowAdapter
    public final View createView(ViewGroup viewGroup) {
        viewGroup.getClass();
        Context context = viewGroup.getContext();
        context.getClass();
        InvestingPlaceholderGraphView investingPlaceholderGraphView = new InvestingPlaceholderGraphView(context);
        investingPlaceholderGraphView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        return investingPlaceholderGraphView;
    }
}
