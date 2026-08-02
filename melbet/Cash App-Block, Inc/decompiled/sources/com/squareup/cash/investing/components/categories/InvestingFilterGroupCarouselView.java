package com.squareup.cash.investing.components.categories;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.investing.components.SpacingBetweenItemsDecoration;
import com.squareup.cash.investing.components.categories.FilterGroupAdapter;
import com.squareup.util.android.Views;

/* loaded from: classes6.dex */
public final class InvestingFilterGroupCarouselView extends RecyclerView {
    public final FilterGroupAdapter adapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestingFilterGroupCarouselView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        FilterGroupAdapter filterGroupAdapter = new FilterGroupAdapter(FilterGroupAdapter.DiffItemCallback.INSTANCE);
        this.adapter = filterGroupAdapter;
        RecyclerView.LayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
        addItemDecoration(new SpacingBetweenItemsDecoration(Views.dip((View) this, 4), 0));
        setLayoutManager(linearLayoutManager);
        setAdapter(filterGroupAdapter);
        setPaddingRelative(Views.dip((View) this, 24), Views.dip((View) this, 24), Views.dip((View) this, 24), Views.dip((View) this, 24));
        setClipToPadding(false);
    }
}
