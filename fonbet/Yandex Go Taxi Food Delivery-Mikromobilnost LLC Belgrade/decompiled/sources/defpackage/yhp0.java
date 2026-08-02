package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class yhp0 extends RecyclerView.g {
    public final sls a;

    public yhp0(sls slsVar) {
        this.a = slsVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        sls slsVar;
        super.onScrollStateChanged(recyclerView, i);
        if (i != 1 || (slsVar = this.a) == null) {
            return;
        }
        slsVar.invoke();
    }

    public yhp0() {
        this(null);
    }
}
