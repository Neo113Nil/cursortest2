package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.ku;

/* loaded from: classes5.dex */
class kv implements ku.initialize {
    public static final kv get = new kv();

    @Override // com.netcetera.threeds.sdk.infrastructure.ku.initialize
    public Object ThreeDS2ServiceInstance(jp jpVar) {
        return Integer.valueOf(jpVar.ThreeDS2ServiceInstance());
    }
}
