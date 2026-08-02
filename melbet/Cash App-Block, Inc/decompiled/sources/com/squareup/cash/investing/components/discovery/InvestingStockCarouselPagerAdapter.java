package com.squareup.cash.investing.components.discovery;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.ui.Ui;
import coil3.RealImageLoader;
import com.squareup.cash.investing.components.InvestingHomeRowAdapter;
import com.squareup.cash.investing.components.MooncakeInvestingStockRowView$Factory$Impl;
import com.squareup.cash.investing.components.categories.MooncakeInvestingCategoryCarouselView$Factory$Impl;
import com.squareup.cash.investing.viewmodels.InvestingHomeViewModel;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes6.dex */
public final class InvestingStockCarouselPagerAdapter extends RecyclerView.Adapter {
    public final MooncakeInvestingCategoryCarouselView$Factory$Impl categoryCarouselViewFactory;
    public final Ui.EventReceiver eventReceiver;
    public final RealImageLoader imageLoader;
    public List pages;
    public final MooncakeInvestingStockRowView$Factory$Impl stockRowViewFactory;

    public InvestingStockCarouselPagerAdapter(Ui.EventReceiver eventReceiver, MooncakeInvestingCategoryCarouselView$Factory$Impl mooncakeInvestingCategoryCarouselView$Factory$Impl, MooncakeInvestingStockRowView$Factory$Impl mooncakeInvestingStockRowView$Factory$Impl, RealImageLoader realImageLoader) {
        eventReceiver.getClass();
        mooncakeInvestingCategoryCarouselView$Factory$Impl.getClass();
        mooncakeInvestingStockRowView$Factory$Impl.getClass();
        realImageLoader.getClass();
        this.eventReceiver = eventReceiver;
        this.categoryCarouselViewFactory = mooncakeInvestingCategoryCarouselView$Factory$Impl;
        this.stockRowViewFactory = mooncakeInvestingStockRowView$Factory$Impl;
        this.imageLoader = realImageLoader;
        this.pages = EmptyList.INSTANCE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.pages.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        viewHolder2.getClass();
        InvestingStockCarouselPageView investingStockCarouselPageView = viewHolder2.view;
        InvestingHomeViewModel.InvestingHomeRow.StockCarousel.Page page = (InvestingHomeViewModel.InvestingHomeRow.StockCarousel.Page) this.pages.get(i);
        investingStockCarouselPageView.getClass();
        page.getClass();
        InvestingHomeRowAdapter investingHomeRowAdapter = investingStockCarouselPageView.stocksAdapter;
        List list = page.rows;
        investingHomeRowAdapter.getClass();
        list.getClass();
        investingHomeRowAdapter.data = list;
        investingHomeRowAdapter.notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        Context context = viewGroup.getContext();
        context.getClass();
        ViewHolder viewHolder = new ViewHolder(new InvestingStockCarouselPageView(context, this.eventReceiver, this.categoryCarouselViewFactory, this.stockRowViewFactory, this.imageLoader));
        viewHolder.view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return viewHolder;
    }
}
