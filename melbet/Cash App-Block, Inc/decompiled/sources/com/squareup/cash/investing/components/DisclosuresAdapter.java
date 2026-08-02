package com.squareup.cash.investing.components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.composable.adapter.SingleRowAdapter;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda2;
import com.squareup.util.android.Views;

/* loaded from: classes6.dex */
public final class DisclosuresAdapter extends SingleRowAdapter {
    public GpsConfigQueries$$ExternalSyntheticLambda2 onLinkClick;

    @Override // com.squareup.cash.composable.adapter.SingleRowAdapter
    public final void bind(View view, Object obj) {
        InvestingHomeDisclosuresView investingHomeDisclosuresView = (InvestingHomeDisclosuresView) view;
        String str = (String) obj;
        investingHomeDisclosuresView.getClass();
        str.getClass();
        investingHomeDisclosuresView.disclosureText$delegate.setValue(str);
    }

    @Override // com.squareup.cash.composable.adapter.SingleRowAdapter
    public final View createView(ViewGroup viewGroup) {
        viewGroup.getClass();
        Context context = viewGroup.getContext();
        context.getClass();
        InvestingHomeDisclosuresView investingHomeDisclosuresView = new InvestingHomeDisclosuresView(context);
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, -2);
        layoutParams.setMargins(Views.dip((View) investingHomeDisclosuresView, 24), 0, Views.dip((View) investingHomeDisclosuresView, 24), 0);
        investingHomeDisclosuresView.setLayoutParams(layoutParams);
        return investingHomeDisclosuresView;
    }

    @Override // com.squareup.cash.composable.adapter.SingleRowAdapter
    public final void onViewCreated(View view) {
        InvestingHomeDisclosuresView investingHomeDisclosuresView = (InvestingHomeDisclosuresView) view;
        investingHomeDisclosuresView.getClass();
        investingHomeDisclosuresView.setOnLinkClickListener(new GpsConfigQueries$$ExternalSyntheticLambda2(this, 20));
    }
}
