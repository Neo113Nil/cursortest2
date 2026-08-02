package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.nw;
import org.slf4j.Logger;

/* loaded from: classes5.dex */
class nv implements nw.getWarnings {
    private final Logger initialize;

    public nv(Logger logger) {
        this.initialize = logger;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.nw.getWarnings
    public void get(String str) {
        this.initialize.warn(str);
    }
}
