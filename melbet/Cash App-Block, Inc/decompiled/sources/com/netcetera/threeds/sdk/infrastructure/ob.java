package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.nw;

/* loaded from: classes5.dex */
class ob implements nw.getWarnings {
    private final nw getWarnings;

    public ob(nw nwVar) {
        this.getWarnings = nwVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.nw.getWarnings
    public void get(String str) {
        this.getWarnings.ThreeDS2ServiceInstance(str);
    }
}
