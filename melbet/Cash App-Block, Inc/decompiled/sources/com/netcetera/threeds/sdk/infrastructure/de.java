package com.netcetera.threeds.sdk.infrastructure;

import android.text.TextUtils;
import com.netcetera.threeds.sdk.infrastructure.setMinEms;

/* loaded from: classes5.dex */
public class de implements replace {
    private static int cleanup = 1;
    private static int getSDKVersion;
    private final no getWarnings = (no) nu.initialize(new Object[]{de.class}, -1889553984, 1889553984, (int) System.currentTimeMillis());
    private final size initialize;
    private static char[] ThreeDS2Service = {14987, 14958, 14950, 14957, 14953, 14955, 14997, 15068, 14990, 14995, 14944, 14999, 14983, 15030, 14952, 14946, 14949, 14996, 15034, 14969, 14975};
    private static int ThreeDS2ServiceInstance = 993475324;
    private static boolean get = true;
    private static boolean ThreeDS2ServiceInitializationCallback = true;

    public de(size sizeVar) {
        this.initialize = sizeVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.replace
    public void ThreeDS2Service(setMinEms.initialize initializeVar) {
        int i = cleanup;
        getSDKVersion = (i + 119) % 128;
        size sizeVar = this.initialize;
        if (sizeVar instanceof bg) {
            int i2 = i + 109;
            getSDKVersion = i2 % 128;
            if (i2 % 2 != 0) {
                oj.ThreeDS2Service(((bg) sizeVar).getWarnings());
                throw null;
            }
            String warnings = ((bg) sizeVar).getWarnings();
            if (oj.ThreeDS2Service(warnings)) {
                int i3 = cleanup + 65;
                getSDKVersion = i3 % 128;
                if (i3 % 2 != 0) {
                    TextUtils.getOffsetAfter("", 1);
                    new Object[1][1] = warnings;
                } else {
                    TextUtils.getOffsetAfter("", 0);
                }
                initializeVar.ThreeDS2Service(warnings);
            }
        }
    }
}
