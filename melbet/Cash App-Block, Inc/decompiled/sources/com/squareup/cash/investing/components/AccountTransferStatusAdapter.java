package com.squareup.cash.investing.components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.composable.adapter.SingleRowAdapter;
import com.squareup.cash.support.chat.views.transcript.message.UnknownMessageBodyView;
import com.squareup.util.android.Views;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class AccountTransferStatusAdapter extends SingleRowAdapter {
    public final InvestingHomeView$$ExternalSyntheticLambda2 onClick;

    public AccountTransferStatusAdapter(InvestingHomeView$$ExternalSyntheticLambda2 investingHomeView$$ExternalSyntheticLambda2) {
        super(15, false);
        this.onClick = investingHomeView$$ExternalSyntheticLambda2;
    }

    @Override // com.squareup.cash.composable.adapter.SingleRowAdapter
    public final void bind(View view, Object obj) {
        view.getClass();
        ((Unit) obj).getClass();
    }

    @Override // com.squareup.cash.composable.adapter.SingleRowAdapter
    public final View createView(ViewGroup viewGroup) {
        viewGroup.getClass();
        Context context = viewGroup.getContext();
        context.getClass();
        UnknownMessageBodyView unknownMessageBodyView = new UnknownMessageBodyView(context, this.onClick);
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, -2);
        layoutParams.setMargins(Views.dip((View) unknownMessageBodyView, 24), Views.dip((View) unknownMessageBodyView, 24), Views.dip((View) unknownMessageBodyView, 24), 0);
        unknownMessageBodyView.setLayoutParams(layoutParams);
        return unknownMessageBodyView;
    }
}
