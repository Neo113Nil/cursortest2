package com.netcetera.threeds.sdk.infrastructure;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import java.util.Iterator;

/* loaded from: classes5.dex */
public class setContentInsetStartWithNavigation {
    private static int ThreeDS2Service = 1;
    private static int get;
    private final nh ThreeDS2ServiceInstance;
    private final getView initialize;

    public setContentInsetStartWithNavigation(getView getview, nh nhVar) {
        this.initialize = getview;
        this.ThreeDS2ServiceInstance = nhVar;
    }

    public nq ThreeDS2ServiceInstance(nq nqVar) {
        int i = get;
        ThreeDS2Service = ((i ^ 105) + ((i & 105) << 1)) % 128;
        Iterator<setCollapsible> it = this.initialize.getWarnings().iterator();
        int i2 = ((-2) - ((get + 68) ^ (-1))) % 128;
        while (true) {
            ThreeDS2Service = i2;
            if (!it.hasNext()) {
                break;
            }
            int i3 = ThreeDS2Service;
            get = (((i3 | 115) << 1) - (i3 ^ 115)) % 128;
            nqVar = it.next().ThreeDS2ServiceInstance(nqVar, this.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance());
            int i4 = get;
            i2 = Thread$State$EnumUnboxingLocalUtility.m(i4 ^ 36, (i4 & 36) << 1, 1, 128);
        }
        int i5 = get;
        int i6 = i5 & 39;
        int i7 = ((i5 ^ 39) | i6) << 1;
        int i8 = -((i5 | 39) & (~i6));
        int i9 = (i7 & i8) + (i8 | i7);
        ThreeDS2Service = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 67 / 0;
        }
        return nqVar;
    }
}
