package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.os.Process;
import com.netcetera.threeds.sdk.infrastructure.setMinEms;

/* loaded from: classes5.dex */
public class dt implements replace {
    private static int getSDKInfo = 0;
    private static int getSDKVersion = 1;
    private final no ThreeDS2Service = (no) nu.initialize(new Object[]{dt.class}, -1889553984, 1889553984, (int) System.currentTimeMillis());
    private final entrySet initialize;

    public dt(entrySet entryset) {
        this.initialize = entryset;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.replace
    public void ThreeDS2Service(setMinEms.initialize initializeVar) {
        int i = getSDKInfo + 97;
        getSDKVersion = i % 128;
        int i2 = i % 2 == 0 ? 1 : 0;
        Color.red(i2);
        Process.getThreadPriority(i2);
        initializeVar.ThreeDS2ServiceInstance(this.initialize);
        int i3 = getSDKVersion + 31;
        getSDKInfo = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }
}
