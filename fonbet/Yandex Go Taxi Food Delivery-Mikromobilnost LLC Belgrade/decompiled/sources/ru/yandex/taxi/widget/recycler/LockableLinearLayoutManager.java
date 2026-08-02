package ru.yandex.taxi.widget.recycler;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/yandex/taxi/widget/recycler/LockableLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public class LockableLinearLayoutManager extends LinearLayoutManager {
    public boolean b0;

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.e
    public final boolean I() {
        return !this.b0 && super.I();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.e
    public final boolean J() {
        return !this.b0 && super.J();
    }
}
