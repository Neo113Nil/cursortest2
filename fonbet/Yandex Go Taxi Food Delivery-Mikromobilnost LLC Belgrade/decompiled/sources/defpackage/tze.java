package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class tze extends RecyclerView.g {
    public final /* synthetic */ uze a;

    public tze(uze uzeVar) {
        this.a = uzeVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        super.onScrollStateChanged(recyclerView, i);
        if (i == 0) {
            uze uzeVar = this.a;
            uze.a(uzeVar);
            uze.c(uzeVar);
            uze.b(uzeVar);
        }
    }
}
