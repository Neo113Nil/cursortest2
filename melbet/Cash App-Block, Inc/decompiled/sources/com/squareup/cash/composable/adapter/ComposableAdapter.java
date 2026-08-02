package com.squareup.cash.composable.adapter;

import android.os.Looper;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.data.blockers.FlowStarter$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes6.dex */
public final class ComposableAdapter extends RecyclerView.Adapter {
    public final LinkedHashMap states = new LinkedHashMap();
    public final LinkedHashMap adapterForViewType = new LinkedHashMap();
    public final ArrayList observers = new ArrayList();
    public List adapters = EmptyList.INSTANCE;

    public final class InnerAdapter {
        public final RecyclerView.Adapter adapter;
        public final int preceedingItems;

        public InnerAdapter(int i, RecyclerView.Adapter adapter) {
            this.preceedingItems = i;
            this.adapter = adapter;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InnerAdapter)) {
                return false;
            }
            InnerAdapter innerAdapter = (InnerAdapter) obj;
            return this.preceedingItems == innerAdapter.preceedingItems && this.adapter.equals(innerAdapter.adapter);
        }

        public final int hashCode() {
            return this.adapter.hashCode() + (Integer.hashCode(this.preceedingItems) * 31);
        }

        public final String toString() {
            return "InnerAdapter(preceedingItems=" + this.preceedingItems + ", adapter=" + this.adapter + ")";
        }
    }

    public static final InnerAdapter access$adapterForPosition(ComposableAdapter composableAdapter, List list, int i) {
        composableAdapter.getClass();
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            RecyclerView.Adapter adapter = (RecyclerView.Adapter) it.next();
            if (adapter.getItemCount() + i2 > i) {
                return new InnerAdapter(i2, adapter);
            }
            i2 += adapter.getItemCount();
        }
        int itemCount = composableAdapter.getItemCount();
        a$$ExternalSyntheticBUOutline0.m(Recorder$$ExternalSyntheticOutline2.m107m(i, itemCount, "No adapter for position ", ", itemCount: ", ", adapters: "), (Object) CollectionsKt.joinToString$default(composableAdapter.adapters, null, null, null, 0, null, new FlowStarter$$ExternalSyntheticLambda0(2), 31));
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        Iterator it = this.adapters.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((RecyclerView.Adapter) it.next()).getItemCount();
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        if (!hasStableIds()) {
            return super.getItemId(i);
        }
        int i2 = 0;
        for (RecyclerView.Adapter adapter : this.adapters) {
            if (adapter.getItemCount() + i2 > i) {
                return adapter.getItemId(i - i2);
            }
            i2 += adapter.getItemCount();
        }
        Path$$ExternalSyntheticBUOutline0.m();
        return 0L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        int i2 = 0;
        for (RecyclerView.Adapter adapter : this.adapters) {
            if (adapter.getItemCount() + i2 > i) {
                int itemViewType = adapter.getItemViewType(i - i2);
                if (itemViewType != 0) {
                    this.adapterForViewType.put(Integer.valueOf(itemViewType), adapter);
                    return itemViewType;
                }
                Path$$ExternalSyntheticBUOutline0.m$1((Object) Boxes$$ExternalSyntheticOutline1.m((Class) adapter.getClass(), "Missing getItemViewType() in "));
                return 0;
            }
            i2 += adapter.getItemCount();
        }
        a$$ExternalSyntheticBUOutline0.m(Recorder$$ExternalSyntheticOutline2.m107m(i, getItemCount(), "No viewtype for position ", ", itemCount: ", ", adapters: "), (Object) CollectionsKt.joinToString$default(this.adapters, null, null, null, 0, null, new FlowStarter$$ExternalSyntheticLambda0(1), 31));
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        viewHolder.getClass();
        int i2 = 0;
        for (RecyclerView.Adapter adapter : this.adapters) {
            if (adapter.getItemCount() + i2 > i) {
                adapter.onBindViewHolder(viewHolder, i - i2);
                if (hasStableIds()) {
                    SparseArray<Parcelable> sparseArray = (SparseArray) this.states.get(new ViewStateId(viewHolder.getItemId(), viewHolder.getItemViewType()));
                    if (sparseArray == null || sparseArray.size() == 0) {
                        return;
                    }
                    viewHolder.itemView.restoreHierarchyState(sparseArray);
                    sparseArray.clear();
                    return;
                }
                return;
            }
            i2 += adapter.getItemCount();
        }
        Path$$ExternalSyntheticBUOutline0.m();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder onCreateViewHolder;
        viewGroup.getClass();
        RecyclerView.Adapter adapter = (RecyclerView.Adapter) this.adapterForViewType.get(Integer.valueOf(i));
        if (adapter != null && (onCreateViewHolder = adapter.onCreateViewHolder(viewGroup, i)) != null) {
            return onCreateViewHolder;
        }
        a$$ExternalSyntheticBUOutline0.m$2(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "No adapter for view type "));
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        viewHolder.getClass();
        if (hasStableIds()) {
            saveState(viewHolder);
        }
    }

    public final void saveState(RecyclerView.ViewHolder viewHolder) {
        ViewStateId viewStateId = new ViewStateId(viewHolder.getItemId(), viewHolder.getItemViewType());
        LinkedHashMap linkedHashMap = this.states;
        SparseArray<Parcelable> sparseArray = (SparseArray) linkedHashMap.get(viewStateId);
        if (sparseArray == null) {
            sparseArray = new SparseArray<>();
        }
        sparseArray.clear();
        viewHolder.itemView.saveHierarchyState(sparseArray);
        linkedHashMap.put(new ViewStateId(viewHolder.getItemId(), viewHolder.getItemViewType()), sparseArray);
    }

    /* loaded from: classes9.dex */
    public final class Observer extends RecyclerView.AdapterDataObserver {
        public int priorCount;

        public Observer(int i) {
            this.priorCount = i;
        }

        public static void checkLooper() {
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                return;
            }
            a$$ExternalSyntheticBUOutline0.m$1("Can only notify on main thread");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onChanged() {
            checkLooper();
            ComposableAdapter.this.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i, int i2) {
            checkLooper();
            ComposableAdapter.this.notifyItemRangeChanged(i + this.priorCount, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeInserted(int i, int i2) {
            checkLooper();
            ComposableAdapter composableAdapter = ComposableAdapter.this;
            ArrayList arrayList = composableAdapter.observers;
            Iterator it = CollectionsKt.drop(arrayList, arrayList.indexOf(this) + 1).iterator();
            while (it.hasNext()) {
                ((Observer) it.next()).priorCount += i2;
            }
            composableAdapter.notifyItemRangeInserted(i + this.priorCount, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeMoved(int i, int i2) {
            checkLooper();
            ComposableAdapter.this.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeRemoved(int i, int i2) {
            checkLooper();
            ComposableAdapter composableAdapter = ComposableAdapter.this;
            ArrayList arrayList = composableAdapter.observers;
            Iterator it = CollectionsKt.drop(arrayList, arrayList.indexOf(this) + 1).iterator();
            while (it.hasNext()) {
                ((Observer) it.next()).priorCount -= i2;
            }
            composableAdapter.notifyItemRangeRemoved(i + this.priorCount, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i, int i2, Object obj) {
            checkLooper();
            ComposableAdapter.this.notifyItemRangeChanged(i + this.priorCount, i2, obj);
        }
    }
}
