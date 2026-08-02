package com.squareup.cash.investing.components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.investing.components.InvestingHomeRowAdapter;

/* loaded from: classes4.dex */
public final class SpacingBetweenItemsDecoration extends RecyclerView.ItemDecoration {
    public final /* synthetic */ int $r8$classId;
    public final int spacing;

    public /* synthetic */ SpacingBetweenItemsDecoration(int i, int i2) {
        this.$r8$classId = i2;
        this.spacing = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        if (((java.lang.Boolean) r5.needsTopMargin$delegate.getValue(r5, com.squareup.cash.investing.components.InvestingHomeRowAdapter.ViewHolder.HeaderViewHolder.$$delegatedProperties[0])).booleanValue() != false) goto L17;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int i;
        int i2 = this.$r8$classId;
        int i3 = this.spacing;
        rect.getClass();
        view.getClass();
        state.getClass();
        switch (i2) {
            case 0:
                RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(view);
                if ((childViewHolder.getAdapterPosition() == -1 ? childViewHolder.getOldPosition() : childViewHolder.getAdapterPosition()) != 0) {
                    rect.left = i3 / 2;
                }
                RecyclerView.ViewHolder childViewHolder2 = recyclerView.getChildViewHolder(view);
                int oldPosition = childViewHolder2.getAdapterPosition() == -1 ? childViewHolder2.getOldPosition() : childViewHolder2.getAdapterPosition();
                RecyclerView.Adapter adapter = recyclerView.mAdapter;
                adapter.getClass();
                if (oldPosition != adapter.getItemCount() - 1) {
                    rect.right = i3 / 2;
                    break;
                }
                break;
            default:
                if (view.getVisibility() == 0) {
                    RecyclerView.ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                    int absoluteAdapterPosition = childViewHolderInt != null ? childViewHolderInt.getAbsoluteAdapterPosition() : -1;
                    RecyclerView.Adapter adapter2 = recyclerView.mAdapter;
                    adapter2.getClass();
                    boolean z = absoluteAdapterPosition == adapter2.getItemCount() - 1;
                    RecyclerView.ViewHolder childViewHolder3 = recyclerView.getChildViewHolder(view);
                    childViewHolder3.getClass();
                    int itemViewType = childViewHolder3.getItemViewType();
                    if (itemViewType == 4) {
                        if (!(childViewHolder3 instanceof InvestingHomeRowAdapter.ViewHolder.HeaderViewHolder)) {
                            a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
                            break;
                        } else {
                            InvestingHomeRowAdapter.ViewHolder.HeaderViewHolder headerViewHolder = (InvestingHomeRowAdapter.ViewHolder.HeaderViewHolder) childViewHolder3;
                            break;
                        }
                    } else {
                        switch (itemViewType) {
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                                i = i3;
                                break;
                            default:
                                i = 0;
                                break;
                        }
                    }
                    rect.top = i;
                    if (!z) {
                        i3 = 0;
                    }
                    rect.bottom = i3;
                    break;
                }
                break;
        }
    }
}
