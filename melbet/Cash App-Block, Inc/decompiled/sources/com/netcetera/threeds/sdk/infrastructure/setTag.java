package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;

/* loaded from: classes5.dex */
public class setTag {
    private static int get = 1;
    private static int getWarnings;
    private final Context ThreeDS2Service;
    private final setPadding initialize;

    public setTag(Context context, setPadding setpadding) {
        this.ThreeDS2Service = context;
        this.initialize = setpadding;
    }

    public setActivated get(com.netcetera.threeds.sdk.api.configparameters.ConfigParameters configParameters) {
        setForegroundTintMode setforegroundtintmode = new setForegroundTintMode(setPointerIcon.ThreeDS2ServiceInstance());
        setId setid = new setId();
        setForegroundTintList setforegroundtintlist = new setForegroundTintList();
        setPadding setpadding = this.initialize;
        setPaddingRelative setpaddingrelative = new setPaddingRelative(setpadding, setforegroundtintmode.initialize(configParameters, setpadding), setid.get(this.ThreeDS2Service, this.initialize), setforegroundtintlist.getWarnings(this.ThreeDS2Service, this.initialize));
        int i = getWarnings;
        int i2 = i & 85;
        int i3 = ((i ^ 85) | i2) << 1;
        int i4 = -((i | 85) & (~i2));
        int i5 = (i3 & i4) + (i4 | i3);
        get = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 75 / 0;
        }
        return setpaddingrelative;
    }
}
