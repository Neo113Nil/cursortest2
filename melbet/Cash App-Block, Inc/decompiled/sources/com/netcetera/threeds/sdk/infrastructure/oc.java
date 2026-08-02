package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.nw;
import org.slf4j.Logger;

/* loaded from: classes5.dex */
class oc implements nw.getWarnings {
    private final Logger ThreeDS2ServiceInstance;

    public oc(Logger logger) {
        this.ThreeDS2ServiceInstance = logger;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.nw.getWarnings
    public void get(String str) {
        this.ThreeDS2ServiceInstance.error(str);
    }
}
