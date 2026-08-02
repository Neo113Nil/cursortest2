package com.netcetera.threeds.sdk.infrastructure;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import java.util.UUID;

/* loaded from: classes5.dex */
public class mi implements mj<Activity> {
    private static int get = 1;
    private static int getWarnings;
    private String ThreeDS2ServiceInstance;

    @Override // com.netcetera.threeds.sdk.infrastructure.mj
    public void ThreeDS2ServiceInstance(Activity activity, mu muVar) {
        mr mrVar = new mr();
        mrVar.getWarnings(muVar);
        mrVar.ThreeDS2Service((mk) mt.ThreeDS2ServiceInstance(new Object[0], 1394921779, -1394921779, (int) System.currentTimeMillis()));
        mrVar.ThreeDS2ServiceInitializationCallback();
        muVar.initialize(mrVar);
        this.ThreeDS2ServiceInstance = UUID.randomUUID().toString();
        FragmentTransaction beginTransaction = activity.getFragmentManager().beginTransaction();
        beginTransaction.add(mrVar, this.ThreeDS2ServiceInstance);
        beginTransaction.commitAllowingStateLoss();
        int i = getWarnings;
        int i2 = (i ^ 47) + ((i & 47) << 1);
        get = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
    
        r5 = com.netcetera.threeds.sdk.infrastructure.mi.getWarnings;
        com.netcetera.threeds.sdk.infrastructure.mi.get = ((-2) - (((r5 & 58) + (r5 | 58)) ^ (-1))) % 128;
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        if (r6.getFragmentManager().findFragmentByTag((java.lang.String) com.netcetera.threeds.sdk.infrastructure.oj.getWarnings(r5.ThreeDS2ServiceInstance, "")) != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0034, code lost:
    
        if (r5 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x005a, code lost:
    
        r5 = com.netcetera.threeds.sdk.infrastructure.mi.get;
        r6 = r5 & 87;
        r5 = -(-((r5 ^ 87) | r6));
        com.netcetera.threeds.sdk.infrastructure.mi.getWarnings = ((r6 ^ r5) + ((r5 & r6) << 1)) % 128;
     */
    @Override // com.netcetera.threeds.sdk.infrastructure.mj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean getWarnings(Activity activity) {
        int i = getWarnings;
        int i2 = ((i ^ 55) | (i & 55)) << 1;
        int i3 = -(((~i) & 55) | (i & (-56)));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        get = i4 % 128;
        boolean z = false;
        if (i4 % 2 == 0) {
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag((String) oj.getWarnings(this.ThreeDS2ServiceInstance, ""));
            int i5 = 59 / 0;
        }
        int i6 = get;
        int i7 = ((i6 ^ 108) + ((i6 & 108) << 1)) - 1;
        getWarnings = i7 % 128;
        if (i7 % 2 == 0) {
            return z;
        }
        throw null;
    }
}
