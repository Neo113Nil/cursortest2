package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.x;

/* loaded from: classes5.dex */
class az implements x.get {
    private final aw initialize;

    public az(aw awVar) {
        this.initialize = awVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.x.get
    public void getWarnings(String str) {
        aw.getWarnings(this.initialize, str);
    }
}
