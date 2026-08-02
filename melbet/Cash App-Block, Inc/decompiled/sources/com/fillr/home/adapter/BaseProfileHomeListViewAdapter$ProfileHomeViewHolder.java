package com.fillr.home.adapter;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.fillr.n;

/* loaded from: classes4.dex */
public final class BaseProfileHomeListViewAdapter$ProfileHomeViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    public n.b mListener;
    public TextView txtViewTitle;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.mListener.onItemClicked(view, getAdapterPosition());
    }
}
