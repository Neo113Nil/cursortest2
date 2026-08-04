package com.appsflyer.internal;

import com.android.installreferrer.api.InstallReferrerClient;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ AFd1wSDK e;

    public /* synthetic */ l(AFd1wSDK aFd1wSDK, int i) {
        this.d = i;
        this.e = aFd1wSDK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                AFd1wSDK.getMonetizationNetwork(this.e);
                break;
            case 1:
                AFd1wSDK.getMediationNetwork(this.e);
                break;
            default:
                AFd1wSDK.getRevenue(this.e);
                break;
        }
    }
}
