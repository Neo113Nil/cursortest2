package com.netcetera.threeds.sdk.infrastructure;

import android.view.View;

/* loaded from: classes5.dex */
class store implements View.OnClickListener {
    private final storeToXML initialize;

    public store(storeToXML storetoxml) {
        this.initialize = storetoxml;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        storeToXML.initialize(this.initialize, view);
    }
}
