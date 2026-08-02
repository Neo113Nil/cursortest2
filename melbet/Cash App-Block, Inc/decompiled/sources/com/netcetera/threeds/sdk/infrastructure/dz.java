package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
class dz implements computeIfAbsent {
    private final eb ThreeDS2ServiceInstance;

    public dz(eb ebVar) {
        this.ThreeDS2ServiceInstance = ebVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.computeIfAbsent
    public void get(size sizeVar) {
        eb.ThreeDS2Service(new Object[]{r0, sizeVar}, 634382875, -634382875, System.identityHashCode(this.ThreeDS2ServiceInstance));
    }
}
