package com.appsflyer;

import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.internal.AFh1ySDK;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ AFh1ySDK[] e;

    public /* synthetic */ b(AFh1ySDK[] aFh1ySDKArr, int i) {
        this.d = i;
        this.e = aFh1ySDKArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                AFLogger.getMediationNetwork(this.e);
                break;
            default:
                AFLogger.getCurrencyIso4217Code(this.e);
                break;
        }
    }
}
