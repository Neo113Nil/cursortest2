package com.squareup.cash.investing.components.news;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import coil3.RealImageLoader;
import com.squareup.cash.R;
import com.squareup.cash.investing.components.SpacingBetweenItemsDecoration;
import com.squareup.cash.ui.widget.recycler.CashRecyclerView;
import com.squareup.util.android.Views;

/* loaded from: classes6.dex */
public final class InvestingNewsCarouselView extends CashRecyclerView {
    public final NewsArticleAdapter articleAdapter;

    public InvestingNewsCarouselView(Context context, RealImageLoader realImageLoader) {
        super(context, null, 6, 0);
        NewsArticleAdapter newsArticleAdapter = new NewsArticleAdapter(realImageLoader);
        this.articleAdapter = newsArticleAdapter;
        setId(R.id.investing_components_news_carousel);
        setLayoutManager(new LinearLayoutManager(context, 0, false));
        setAdapter(newsArticleAdapter);
        setClipToPadding(false);
        setPadding(Views.dip((View) this, 8), getPaddingTop(), Views.dip((View) this, 24), getPaddingBottom());
        addItemDecoration(new SpacingBetweenItemsDecoration(Views.dip((View) this, 16), 0));
    }
}
