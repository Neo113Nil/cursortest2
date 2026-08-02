package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.ku;

/* loaded from: classes5.dex */
class lh implements ku.initialize {
    public static final lh getWarnings = new lh();

    @Override // com.netcetera.threeds.sdk.infrastructure.ku.initialize
    public Object ThreeDS2ServiceInstance(jp jpVar) {
        return Integer.valueOf(((jq) jpVar).createTransaction());
    }
}
