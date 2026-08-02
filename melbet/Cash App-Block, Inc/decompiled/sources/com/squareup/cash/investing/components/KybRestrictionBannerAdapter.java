package com.squareup.cash.investing.components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import com.squareup.cash.businessaccount.kybrestriction.components.FeatureRestrictionCallbackBannerView;
import com.squareup.cash.composable.adapter.SingleRowAdapter;
import com.squareup.util.android.Views;

/* loaded from: classes6.dex */
public final class KybRestrictionBannerAdapter extends SingleRowAdapter {
    @Override // com.squareup.cash.composable.adapter.SingleRowAdapter
    public final void bind(View view, Object obj) {
        FeatureRestrictionCallbackBannerView featureRestrictionCallbackBannerView = (FeatureRestrictionCallbackBannerView) view;
        UiCallbackModel uiCallbackModel = (UiCallbackModel) obj;
        featureRestrictionCallbackBannerView.getClass();
        uiCallbackModel.getClass();
        featureRestrictionCallbackBannerView.setModel(uiCallbackModel);
    }

    @Override // com.squareup.cash.composable.adapter.SingleRowAdapter
    public final View createView(ViewGroup viewGroup) {
        viewGroup.getClass();
        Context context = viewGroup.getContext();
        context.getClass();
        FeatureRestrictionCallbackBannerView featureRestrictionCallbackBannerView = new FeatureRestrictionCallbackBannerView(context);
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, -2);
        layoutParams.setMargins(Views.dip((View) featureRestrictionCallbackBannerView, 24), 0, Views.dip((View) featureRestrictionCallbackBannerView, 24), 0);
        featureRestrictionCallbackBannerView.setLayoutParams(layoutParams);
        return featureRestrictionCallbackBannerView;
    }
}
