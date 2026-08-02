package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
class cr implements computeIfAbsent {
    private final cm ThreeDS2ServiceInstance;

    public cr(cm cmVar) {
        this.ThreeDS2ServiceInstance = cmVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.computeIfAbsent
    public void get(size sizeVar) {
        cm.initialize(new Object[]{r0, sizeVar}, -1532363730, 1532363730, System.identityHashCode(this.ThreeDS2ServiceInstance));
    }
}
