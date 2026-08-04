package com.gamericefishpro.space.n;

import android.database.DataSetObserver;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 extends DataSetObserver {
    public final /* synthetic */ i1 a;

    public f1(i1 i1Var) {
        this.a = i1Var;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        i1 i1Var = this.a;
        if (i1Var.O.isShowing()) {
            i1Var.a();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.a.dismiss();
    }
}
