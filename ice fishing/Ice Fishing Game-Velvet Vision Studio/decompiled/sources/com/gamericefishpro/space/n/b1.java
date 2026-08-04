package com.gamericefishpro.space.n;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ i1 d;

    public b1(i1 i1Var) {
        this.d = i1Var;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        m1 m1Var;
        if (i == -1 || (m1Var = this.d.i) == null) {
            return;
        }
        m1Var.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
