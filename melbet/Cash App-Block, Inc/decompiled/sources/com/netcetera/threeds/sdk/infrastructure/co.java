package com.netcetera.threeds.sdk.infrastructure;

import android.view.Gravity;
import com.netcetera.threeds.sdk.infrastructure.setMinEms;

/* loaded from: classes5.dex */
public class co implements replace {
    private static int ThreeDS2ServiceInstance = 1;
    private static int get;
    private final no ThreeDS2Service = (no) nu.initialize(new Object[]{co.class}, -1889553984, 1889553984, (int) System.currentTimeMillis());
    private final size getWarnings;

    public co(size sizeVar) {
        this.getWarnings = sizeVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.replace
    public void ThreeDS2Service(setMinEms.initialize initializeVar) {
        size sizeVar = this.getWarnings;
        if (sizeVar instanceof bg) {
            String warnings = ((bg) sizeVar).getWarnings();
            Gravity.getAbsoluteGravity(0, 0);
            initializeVar.getWarnings(warnings);
            get = (ThreeDS2ServiceInstance + 23) % 128;
        }
        int i = get + 7;
        ThreeDS2ServiceInstance = i % 128;
        if (i % 2 == 0) {
            int i2 = 71 / 0;
        }
    }
}
