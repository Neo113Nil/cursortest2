package com.appsflyer.internal;

import com.android.installreferrer.api.InstallReferrerClient;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ g(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                AFb1iSDK.getMediationNetwork((AFb1iSDK) this.e);
                break;
            case 1:
                AFa1ySDK.getMediationNetwork((AFd1zSDK) this.e);
                break;
            default:
                ((AFd1kSDK) this.e).AFAdRevenueData();
                break;
        }
    }
}
