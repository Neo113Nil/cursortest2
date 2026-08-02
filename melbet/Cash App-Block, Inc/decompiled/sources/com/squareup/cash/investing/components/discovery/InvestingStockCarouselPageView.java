package com.squareup.cash.investing.components.discovery;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.ui.Ui;
import coil3.RealImageLoader;
import com.squareup.cash.investing.components.InvestingHomeRowAdapter;
import com.squareup.cash.investing.components.MooncakeInvestingStockRowView$Factory$Impl;
import com.squareup.cash.investing.components.categories.MooncakeInvestingCategoryCarouselView$Factory$Impl;

/* loaded from: classes6.dex */
public final class InvestingStockCarouselPageView extends RecyclerView {
    public final Ui.EventReceiver eventReceiver;
    public final InvestingHomeRowAdapter stocksAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestingStockCarouselPageView(Context context, Ui.EventReceiver eventReceiver, MooncakeInvestingCategoryCarouselView$Factory$Impl mooncakeInvestingCategoryCarouselView$Factory$Impl, MooncakeInvestingStockRowView$Factory$Impl mooncakeInvestingStockRowView$Factory$Impl, RealImageLoader realImageLoader) {
        super(context);
        context.getClass();
        eventReceiver.getClass();
        mooncakeInvestingCategoryCarouselView$Factory$Impl.getClass();
        mooncakeInvestingStockRowView$Factory$Impl.getClass();
        realImageLoader.getClass();
        this.eventReceiver = eventReceiver;
        InvestingHomeRowAdapter investingHomeRowAdapter = new InvestingHomeRowAdapter(context, false, mooncakeInvestingCategoryCarouselView$Factory$Impl, mooncakeInvestingStockRowView$Factory$Impl, realImageLoader);
        this.stocksAdapter = investingHomeRowAdapter;
        setLayoutManager(new LinearLayoutManager(context));
        setHasFixedSize(true);
        setAdapter(investingHomeRowAdapter);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InvestingHomeRowAdapter investingHomeRowAdapter = this.stocksAdapter;
        investingHomeRowAdapter.getClass();
        Ui.EventReceiver eventReceiver = this.eventReceiver;
        eventReceiver.getClass();
        investingHomeRowAdapter.eventReceiver = eventReceiver;
    }
}
