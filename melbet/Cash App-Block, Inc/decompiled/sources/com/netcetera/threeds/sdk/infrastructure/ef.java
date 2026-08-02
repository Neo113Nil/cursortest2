package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
class ef implements computeIfAbsent {
    private final ee ThreeDS2Service;

    public ef(ee eeVar) {
        this.ThreeDS2Service = eeVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.computeIfAbsent
    public void get(size sizeVar) {
        ee.ThreeDS2Service(new Object[]{r0, sizeVar}, -821231005, 821231005, System.identityHashCode(this.ThreeDS2Service));
    }
}
