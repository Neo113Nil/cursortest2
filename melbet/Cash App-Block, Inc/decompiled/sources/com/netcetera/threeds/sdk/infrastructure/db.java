package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
class db implements computeIfAbsent {
    private final cu ThreeDS2ServiceInstance;

    public db(cu cuVar) {
        this.ThreeDS2ServiceInstance = cuVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.computeIfAbsent
    public void get(size sizeVar) {
        cu.get(new Object[]{r0, sizeVar}, -1532004706, 1532004706, System.identityHashCode(this.ThreeDS2ServiceInstance));
    }
}
