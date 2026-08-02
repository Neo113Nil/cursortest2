package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setMinEms;
import com.netcetera.threeds.sdk.infrastructure.setTitleMarginStart;

/* loaded from: classes5.dex */
public class bx implements replace {
    private static int ThreeDS2ServiceInstance = 1;
    private static char[] get = {52958, 52910, 52908, 52887, 52873, 52873, 52899, 52906, 52891, 52914, 52956, 52924, 52885, 52885, 52874, 52877, 52876, 52877, 52900, 52900, 52864, 52877, 52875, 52879};
    private static int getWarnings;
    private final getCause ThreeDS2Service;
    private final no initialize = (no) nu.initialize(new Object[]{bx.class}, -1889553984, 1889553984, (int) System.currentTimeMillis());

    public bx(getCause getcause) {
        this.ThreeDS2Service = getcause;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.replace
    public void ThreeDS2Service(setMinEms.initialize initializeVar) {
        initializeVar.get(this.ThreeDS2Service);
        setTitleMarginStart settitlemarginstart = new setTitleMarginStart();
        settitlemarginstart.initialize(new setTitleMarginStart.initialize(this.ThreeDS2Service));
        initializeVar.getWarnings(settitlemarginstart);
        int i = ThreeDS2ServiceInstance + 11;
        getWarnings = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
