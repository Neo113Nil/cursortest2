package com.appsflyer;

import com.appsflyer.internal.AFh1ySDK;

/* loaded from: classes.dex */
public final /* synthetic */ class AFLogger$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AFh1ySDK[] f$0;

    public /* synthetic */ AFLogger$$ExternalSyntheticLambda1(AFh1ySDK[] aFh1ySDKArr, int i) {
        this.$r8$classId = i;
        this.f$0 = aFh1ySDKArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        AFh1ySDK[] aFh1ySDKArr = this.f$0;
        switch (i) {
            case 0:
                AFLogger.getMediationNetwork(aFh1ySDKArr);
                break;
            default:
                AFLogger.getCurrencyIso4217Code(aFh1ySDKArr);
                break;
        }
    }
}
