package com.squareup.cash.investing.components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.composable.adapter.SingleRowAdapter;

/* loaded from: classes6.dex */
public final class DiscoverStockAdapter extends SingleRowAdapter {
    public final InvestingHomeView$$ExternalSyntheticLambda2 eventReceiverProducer;

    public DiscoverStockAdapter(InvestingHomeView$$ExternalSyntheticLambda2 investingHomeView$$ExternalSyntheticLambda2) {
        super(13, false);
        this.eventReceiverProducer = investingHomeView$$ExternalSyntheticLambda2;
    }

    @Override // com.squareup.cash.composable.adapter.SingleRowAdapter
    public final void bind(View view, Object obj) {
        ComposeView composeView = (ComposeView) view;
        String str = (String) obj;
        composeView.getClass();
        str.getClass();
        composeView.setContent(new ComposableLambdaImpl(new DiscoverStockAdapter$$ExternalSyntheticLambda0(this, str, 0), true, -964987987));
    }

    @Override // com.squareup.cash.composable.adapter.SingleRowAdapter
    public final View createView(ViewGroup viewGroup) {
        viewGroup.getClass();
        Context context = viewGroup.getContext();
        context.getClass();
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        return composeView;
    }
}
