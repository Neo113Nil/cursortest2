package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.view.ViewConfiguration;
import com.netcetera.threeds.sdk.infrastructure.setMinEms;

/* loaded from: classes5.dex */
public class df implements replace {
    private static int getSDKInfo = 1;
    private static int getSDKVersion;
    private final no ThreeDS2Service = (no) nu.initialize(new Object[]{df.class}, -1889553984, 1889553984, (int) System.currentTimeMillis());
    private final size initialize;

    public df(size sizeVar) {
        this.initialize = sizeVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.replace
    public void ThreeDS2Service(setMinEms.initialize initializeVar) {
        String str;
        size sizeVar = this.initialize;
        String str2 = null;
        if (sizeVar instanceof bg) {
            int i = getSDKInfo + 105;
            getSDKVersion = i % 128;
            if (i % 2 != 0) {
                ((bg) sizeVar).getWarnings();
                throw null;
            }
            str2 = ((bg) sizeVar).getWarnings();
            str = null;
        } else if (sizeVar instanceof ao) {
            ao aoVar = (ao) sizeVar;
            str2 = aoVar.initialize();
            str = aoVar.ThreeDS2ServiceInstance();
        } else {
            str = null;
        }
        if (oj.ThreeDS2Service(str2, str)) {
            ViewConfiguration.getPressedStateDuration();
            initializeVar.initialize(getInfo.getWarnings);
            return;
        }
        if (oj.ThreeDS2Service(str2)) {
            getSDKVersion = (getSDKInfo + 113) % 128;
            Color.argb(0, 0, 0, 0);
            initializeVar.ThreeDS2Service(str2);
        }
        if (oj.ThreeDS2Service(str)) {
            ViewConfiguration.getScrollDefaultDelay();
            initializeVar.get(str);
        }
    }
}
