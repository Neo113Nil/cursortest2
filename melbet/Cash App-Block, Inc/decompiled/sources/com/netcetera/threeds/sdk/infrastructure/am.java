package com.netcetera.threeds.sdk.infrastructure;

import android.view.View;

/* loaded from: classes5.dex */
class am implements View.OnClickListener {
    private final aq ThreeDS2ServiceInstance;

    public am(aq aqVar) {
        this.ThreeDS2ServiceInstance = aqVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        aq.get(this.ThreeDS2ServiceInstance, view);
    }
}
