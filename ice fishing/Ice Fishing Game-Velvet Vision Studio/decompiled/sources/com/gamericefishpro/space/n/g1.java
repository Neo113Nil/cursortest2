package com.gamericefishpro.space.n;

import android.widget.AbsListView;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 implements AbsListView.OnScrollListener {
    public final /* synthetic */ i1 a;

    public g1(i1 i1Var) {
        this.a = i1Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        i1 i1Var = this.a;
        e1 e1Var = i1Var.G;
        w wVar = i1Var.O;
        if (i != 1 || wVar.getInputMethodMode() == 2 || wVar.getContentView() == null) {
            return;
        }
        i1Var.K.removeCallbacks(e1Var);
        e1Var.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
