package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.api.ui.logic.UiCustomization;

/* loaded from: classes5.dex */
public final class ll implements ju {
    private static int ThreeDS2Service = 1;
    private static int get;
    private final ju ThreeDS2ServiceInstance;
    private final ju initialize;

    public ll(ju juVar, ju juVar2) {
        this.ThreeDS2ServiceInstance = juVar;
        this.initialize = juVar2;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.ju
    public jr ThreeDS2Service() {
        kr krVar = new kr(this.ThreeDS2ServiceInstance.ThreeDS2Service(), this.initialize.ThreeDS2Service());
        int i = ThreeDS2Service;
        int i2 = i & 77;
        int i3 = (((i | 77) & (~i2)) - (~(i2 << 1))) - 1;
        get = i3 % 128;
        if (i3 % 2 == 0) {
            return krVar;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.ju
    public jq ThreeDS2ServiceInstance() {
        la laVar = new la(this.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(), this.initialize.ThreeDS2ServiceInstance());
        int i = get;
        int i2 = ((i ^ 33) | (i & 33)) << 1;
        int i3 = -(((~i) & 33) | (i & (-34)));
        int i4 = (i2 & i3) + (i3 | i2);
        ThreeDS2Service = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 6 / 0;
        }
        return laVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.ju
    public jw get() {
        lj ljVar = new lj(this.ThreeDS2ServiceInstance.get(), this.initialize.get());
        int i = get;
        int i2 = (i & 61) + (i | 61);
        ThreeDS2Service = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 88 / 0;
        }
        return ljVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.ju
    public jt getWarnings() {
        lp lpVar = new lp(this.ThreeDS2ServiceInstance.getWarnings(), this.initialize.getWarnings());
        int i = ThreeDS2Service;
        int i2 = i & 75;
        int i3 = i | 75;
        get = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
        return lpVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.ju
    public jo get(UiCustomization.ButtonType buttonType) {
        kq kqVar = new kq(this.ThreeDS2ServiceInstance.get(buttonType), this.initialize.get(buttonType));
        int i = get;
        ThreeDS2Service = (((i | 47) << 1) - (i ^ 47)) % 128;
        return kqVar;
    }
}
