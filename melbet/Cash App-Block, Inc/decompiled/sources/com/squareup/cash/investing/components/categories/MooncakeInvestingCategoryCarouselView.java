package com.squareup.cash.investing.components.categories;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.FastScroller;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.R;
import com.squareup.cash.cdf.stock.StockViewBrowseCategories;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.investing.components.SpacingBetweenItemsDecoration;
import com.squareup.util.android.Views;

/* loaded from: classes6.dex */
public final class MooncakeInvestingCategoryCarouselView extends RecyclerView {
    public final Analytics analytics;
    public final CategoryAdapter tileAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MooncakeInvestingCategoryCarouselView(Context context, MooncakeInvestingCategoryTileView$Factory$Impl mooncakeInvestingCategoryTileView$Factory$Impl, Analytics analytics) {
        super(context);
        context.getClass();
        this.analytics = analytics;
        CategoryAdapter categoryAdapter = new CategoryAdapter(mooncakeInvestingCategoryTileView$Factory$Impl);
        this.tileAdapter = categoryAdapter;
        setLayoutParams(new RecyclerView.LayoutParams(-2, -2));
        setClipToPadding(false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.investing_components_tile_horizontal_margin);
        setPaddingRelative(dimensionPixelSize, getPaddingTop(), dimensionPixelSize, getPaddingBottom());
        setLayoutManager(new LinearLayoutManager(context, 0, false));
        addItemDecoration(new SpacingBetweenItemsDecoration(Views.dip((View) this, 16), 0));
        setAdapter(categoryAdapter);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.analytics.track(new StockViewBrowseCategories(), null);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        addOnScrollListener(new FastScroller.AnonymousClass2(this, 3));
    }
}
