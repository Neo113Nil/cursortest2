package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setMinEms;

/* loaded from: classes5.dex */
public class en implements replace {
    private static int ThreeDS2Service = 0;
    private static int getWarnings = 1;
    private final replaceAll ThreeDS2ServiceInstance;
    private final replace initialize;

    public en(replace replaceVar, replaceAll replaceall) {
        this.initialize = replaceVar;
        this.ThreeDS2ServiceInstance = replaceall;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.replace
    public void ThreeDS2Service(setMinEms.initialize initializeVar) {
        int i = ThreeDS2Service;
        int i2 = (-2) - ((((i | 98) << 1) - (i ^ 98)) ^ (-1));
        getWarnings = i2 % 128;
        int i3 = i2 % 2;
        replaceAll replaceall = this.ThreeDS2ServiceInstance;
        if (i3 == 0) {
            initializeVar.ThreeDS2ServiceInstance(replaceall);
            this.initialize.ThreeDS2Service(initializeVar);
            throw null;
        }
        initializeVar.ThreeDS2ServiceInstance(replaceall);
        this.initialize.ThreeDS2Service(initializeVar);
        int i4 = ThreeDS2Service;
        getWarnings = ((-2) - (((i4 & 84) + (i4 | 84)) ^ (-1))) % 128;
    }
}
