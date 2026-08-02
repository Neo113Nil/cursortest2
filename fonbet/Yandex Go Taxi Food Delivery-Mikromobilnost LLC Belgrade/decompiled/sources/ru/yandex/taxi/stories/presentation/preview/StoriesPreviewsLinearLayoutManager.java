package ru.yandex.taxi.stories.presentation.preview;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.qzx;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lru/yandex/taxi/stories/presentation/preview/StoriesPreviewsLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Lqzx;", "stories"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StoriesPreviewsLinearLayoutManager extends LinearLayoutManager implements qzx {
    public Runnable b0;
    public boolean c0;

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.e
    public final void V0(RecyclerView.k kVar) {
        super.V0(kVar);
        this.c0 = true;
        Runnable runnable = this.b0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // defpackage.qzx
    public final void p(Runnable runnable) {
        this.b0 = runnable;
        if (runnable == null || !this.c0) {
            return;
        }
        runnable.run();
    }
}
