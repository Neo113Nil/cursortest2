package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
class ji {
    private static int get = 0;
    private static int initialize = 1;
    private final jj ThreeDS2Service;
    private final ju ThreeDS2ServiceInstance;

    public ji(jj jjVar, ju juVar) {
        this.ThreeDS2Service = jjVar;
        this.ThreeDS2ServiceInstance = juVar;
    }

    public jl initialize() {
        jl jlVar = new jl();
        jlVar.ThreeDS2ServiceInstance(this.ThreeDS2Service);
        jlVar.get(this.ThreeDS2ServiceInstance);
        int i = initialize;
        int i2 = i ^ 117;
        int i3 = ((i & 117) | i2) << 1;
        int i4 = -i2;
        get = (((i3 | i4) << 1) - (i3 ^ i4)) % 128;
        return jlVar;
    }
}
