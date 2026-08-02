package com.squareup.cash.investing.components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.ui.Ui;
import com.squareup.cash.composable.adapter.SingleRowAdapter;
import com.squareup.cash.investing.components.families.DependentDisabledStateView;
import com.squareup.cash.investing.viewmodels.families.DependentDisabledStateViewModel;
import com.squareup.util.android.Views;

/* loaded from: classes6.dex */
public final class DependentDisabledStateAdapter extends SingleRowAdapter {
    public final InvestingHomeView$$ExternalSyntheticLambda2 eventReceiverProducer;

    public DependentDisabledStateAdapter(InvestingHomeView$$ExternalSyntheticLambda2 investingHomeView$$ExternalSyntheticLambda2) {
        super(18, false);
        this.eventReceiverProducer = investingHomeView$$ExternalSyntheticLambda2;
    }

    @Override // com.squareup.cash.composable.adapter.SingleRowAdapter
    public final void bind(View view, Object obj) {
        DependentDisabledStateView dependentDisabledStateView = (DependentDisabledStateView) view;
        DependentDisabledStateViewModel dependentDisabledStateViewModel = (DependentDisabledStateViewModel) obj;
        dependentDisabledStateView.getClass();
        dependentDisabledStateViewModel.getClass();
        dependentDisabledStateView.setModel((Object) dependentDisabledStateViewModel);
        dependentDisabledStateView.setEventReceiver((Ui.EventReceiver) this.eventReceiverProducer.invoke());
    }

    @Override // com.squareup.cash.composable.adapter.SingleRowAdapter
    public final View createView(ViewGroup viewGroup) {
        viewGroup.getClass();
        Context context = viewGroup.getContext();
        context.getClass();
        DependentDisabledStateView dependentDisabledStateView = new DependentDisabledStateView(context);
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, -2);
        layoutParams.setMargins(Views.dip((View) dependentDisabledStateView, 24), 0, Views.dip((View) dependentDisabledStateView, 24), 0);
        dependentDisabledStateView.setLayoutParams(layoutParams);
        return dependentDisabledStateView;
    }
}
