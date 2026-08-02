package com.netcetera.threeds.sdk.infrastructure;

import android.view.ViewConfiguration;
import com.netcetera.threeds.sdk.infrastructure.ev;
import com.netcetera.threeds.sdk.infrastructure.setMinEms;

/* loaded from: classes5.dex */
public class ck implements replace {
    private static int cleanup = 1;
    private static int createTransaction;
    private static int[] initialize = {-201645191, -1113733502, 462870577, -1921351914, -1770164387, 737522018, 473832045, 1988568353, 516715784, -1530761567, 1429854554, 75771998, -1428277197, -597695610, 1231609182, -2116486656, 1659566453, 1017459895};
    private final size ThreeDS2Service;
    private final String ThreeDS2ServiceInstance;
    private final String get;
    private final no getWarnings = (no) nu.initialize(new Object[]{ck.class}, -1889553984, 1889553984, (int) System.currentTimeMillis());

    public ck(size sizeVar, String str, String str2) {
        this.ThreeDS2Service = sizeVar;
        this.get = str;
        this.ThreeDS2ServiceInstance = str2;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.replace
    public void ThreeDS2Service(setMinEms.initialize initializeVar) {
        String str;
        int i = createTransaction;
        cleanup = (i + 45) % 128;
        size sizeVar = this.ThreeDS2Service;
        if (sizeVar instanceof bg) {
            int i2 = i + 51;
            cleanup = i2 % 128;
            if (i2 % 2 == 0) {
                str = ((bg) sizeVar).getWarnings();
                int i3 = 12 / 0;
            } else {
                str = ((bg) sizeVar).getWarnings();
            }
        } else {
            str = null;
        }
        ViewConfiguration.getMinimumFlingVelocity();
        if (!ev.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance.ThreeDS2Service().equals(this.get)) {
            initializeVar.getWarnings(str);
        }
        initializeVar.initialize(this.get);
        initializeVar.ThreeDS2ServiceInstance(this.ThreeDS2ServiceInstance);
        cleanup = (createTransaction + 47) % 128;
    }
}
