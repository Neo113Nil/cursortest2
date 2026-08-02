package com.yandex.plus.pay.ui.core.debug.internal.ui.log;

import android.view.View;
import android.widget.AdapterView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import defpackage.s9f;
import defpackage.xdr;

/* loaded from: classes5.dex */
public final class e implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ h a;
    public final /* synthetic */ FloatingActionButton b;

    public e(h hVar, FloatingActionButton floatingActionButton) {
        this.a = hVar;
        this.b = floatingActionButton;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        adapterView.getClass();
        com.yandex.plus.log.api.a valueOf = com.yandex.plus.log.api.a.valueOf(adapterView.getItemAtPosition(i).toString());
        s9f[] s9fVarArr = h.n;
        k kVar = (k) this.a.h.getValue();
        valueOf.getClass();
        xdr xdrVar = kVar.n;
        xdrVar.getClass();
        xdrVar.m(null, valueOf);
        this.b.h(null, true);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
