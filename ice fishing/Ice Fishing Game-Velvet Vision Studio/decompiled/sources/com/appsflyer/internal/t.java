package com.appsflyer.internal;

import com.android.installreferrer.api.InstallReferrerClient;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ AFj1sSDK e;
    public final /* synthetic */ Runnable i;

    public /* synthetic */ t(AFj1sSDK aFj1sSDK, Runnable runnable, int i) {
        this.d = i;
        this.e = aFj1sSDK;
        this.i = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.e.areAllFieldsValid(this.i);
                break;
            case 1:
                this.e.getMonetizationNetwork(this.i);
                break;
            case 2:
                this.e.AFAdRevenueData(this.i);
                break;
            default:
                this.e.getRevenue(this.i);
                break;
        }
    }
}
