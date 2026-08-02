package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class OpReorderer implements ListUpdateCallback {
    public final Object mCallback;

    public /* synthetic */ OpReorderer(Object obj) {
        this.mCallback = obj;
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onChanged(int i, int i2, Object obj) {
        ((RecyclerView.Adapter) this.mCallback).notifyItemRangeChanged(i, i2, obj);
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onInserted(int i, int i2) {
        ((RecyclerView.Adapter) this.mCallback).notifyItemRangeInserted(i, i2);
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onMoved(int i, int i2) {
        ((RecyclerView.Adapter) this.mCallback).notifyItemMoved(i, i2);
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onRemoved(int i, int i2) {
        ((RecyclerView.Adapter) this.mCallback).notifyItemRangeRemoved(i, i2);
    }
}
