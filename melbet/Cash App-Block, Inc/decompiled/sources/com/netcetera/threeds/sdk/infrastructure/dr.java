package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;

/* loaded from: classes5.dex */
class dr implements computeIfAbsent {
    private final Context ThreeDS2ServiceInstance;
    private final dq get;

    public dr(dq dqVar, Context context) {
        this.get = dqVar;
        this.ThreeDS2ServiceInstance = context;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.computeIfAbsent
    public void get(size sizeVar) {
        dq.get(new Object[]{r0, this.ThreeDS2ServiceInstance, sizeVar}, 1866042265, -1866042265, System.identityHashCode(this.get));
    }
}
