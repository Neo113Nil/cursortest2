package com.squareup.cash.composable.adapter;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes6.dex */
public abstract class SingleRowAdapter extends RecyclerView.Adapter {
    public Object data;
    public final boolean hasStableIds;
    public final StateFlowImpl initialLoadComplete = FlowKt.MutableStateFlow(Boolean.FALSE);
    public final int viewType;

    public final class ViewHolder extends RecyclerView.ViewHolder {
        public final View view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(View view) {
            super(view);
            view.getClass();
            this.view = view;
        }
    }

    public SingleRowAdapter(int i, boolean z) {
        this.viewType = i;
        this.hasStableIds = z;
        if (z) {
            super.setHasStableIds(true);
        }
    }

    public abstract void bind(View view, Object obj);

    public abstract View createView(ViewGroup viewGroup);

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.data == null ? 0 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return this.hasStableIds ? this.viewType : super.getItemId(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return this.viewType;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        viewHolder2.getClass();
        Object obj = this.data;
        if (obj != null) {
            bind(viewHolder2.view, obj);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        View createView = createView(viewGroup);
        onViewCreated(createView);
        return new ViewHolder(createView);
    }

    public void onViewCreated(View view) {
        view.getClass();
    }

    public final void setData(Object obj) {
        Boolean bool = Boolean.TRUE;
        StateFlowImpl stateFlowImpl = this.initialLoadComplete;
        stateFlowImpl.getClass();
        stateFlowImpl.updateState(null, bool);
        Object obj2 = this.data;
        this.data = obj;
        if (obj2 == null && obj != null) {
            notifyItemInserted(0);
            return;
        }
        if (obj2 != null && obj == null) {
            notifyItemRemoved(0);
        } else {
            if (Intrinsics.areEqual(obj2, obj)) {
                return;
            }
            notifyItemChanged(0);
        }
    }
}
