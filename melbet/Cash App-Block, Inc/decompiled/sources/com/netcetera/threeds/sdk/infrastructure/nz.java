package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.nw;

/* loaded from: classes5.dex */
class nz implements nw.getWarnings {
    private final nw ThreeDS2ServiceInstance;

    public nz(nw nwVar) {
        this.ThreeDS2ServiceInstance = nwVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.nw.getWarnings
    public void get(String str) {
        this.ThreeDS2ServiceInstance.initialize(str);
    }
}
