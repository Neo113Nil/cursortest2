package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes11.dex */
public abstract class wzs0 extends LinearLayoutManager {
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.e
    public final void x1(RecyclerView recyclerView, RecyclerView.k kVar, int i) {
        vzs0 vzs0Var = new vzs0(recyclerView.getContext());
        vzs0Var.a = i;
        v(vzs0Var);
    }
}
