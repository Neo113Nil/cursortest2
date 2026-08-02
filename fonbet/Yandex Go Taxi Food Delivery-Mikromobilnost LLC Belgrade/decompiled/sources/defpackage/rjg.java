package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r0;

/* loaded from: classes3.dex */
public final class rjg extends LinearLayoutManager {
    public final Context b0;
    public final hjg c0;
    public boolean d0;
    public final pjg e0;

    public rjg(Context context, hjg hjgVar) {
        super(context);
        this.b0 = context;
        this.c0 = hjgVar;
        this.Q = false;
        this.e0 = new pjg(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void H0(RecyclerView recyclerView) {
        recyclerView.addOnScrollListener(this.e0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.e
    public final void I0(RecyclerView recyclerView, r0 r0Var) {
        recyclerView.removeOnScrollListener(this.e0);
        super.I0(recyclerView, r0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.e
    public final void x1(RecyclerView recyclerView, RecyclerView.k kVar, int i) {
        if (i != 0) {
            super.x1(recyclerView, kVar, i);
            return;
        }
        qjg qjgVar = new qjg(this.b0);
        qjgVar.a = i;
        this.d0 = true;
        v(qjgVar);
    }
}
