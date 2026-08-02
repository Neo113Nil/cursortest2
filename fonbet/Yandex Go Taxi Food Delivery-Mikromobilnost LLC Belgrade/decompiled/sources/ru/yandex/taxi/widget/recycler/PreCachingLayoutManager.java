package ru.yandex.taxi.widget.recycler;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/yandex/taxi/widget/recycler/PreCachingLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public class PreCachingLayoutManager extends LinearLayoutManager {
    public int b0;

    public PreCachingLayoutManager(Context context) {
        super(context, 0, false);
        this.b0 = 600;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void z1(RecyclerView.k kVar, int[] iArr) {
        int i = this.b0;
        iArr[0] = i;
        iArr[1] = i;
    }
}
