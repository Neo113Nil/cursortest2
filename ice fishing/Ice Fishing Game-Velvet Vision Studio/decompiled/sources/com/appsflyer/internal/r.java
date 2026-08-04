package com.appsflyer.internal;

import com.android.installreferrer.api.InstallReferrerClient;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ AFj1pSDK e;

    public /* synthetic */ r(AFj1pSDK aFj1pSDK, int i) {
        this.d = i;
        this.e = aFj1pSDK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.e.component4();
                break;
            case 1:
                this.e.component2();
                break;
            default:
                this.e.component1();
                break;
        }
    }
}
