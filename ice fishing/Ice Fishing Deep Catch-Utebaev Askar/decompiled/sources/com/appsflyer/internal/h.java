package com.appsflyer.internal;

import com.android.installreferrer.api.InstallReferrerClient;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f86a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AFd1iSDK f87b;

    public /* synthetic */ h(AFd1iSDK aFd1iSDK, int i2) {
        this.f86a = i2;
        this.f87b = aFd1iSDK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f86a;
        AFd1iSDK aFd1iSDK = this.f87b;
        switch (i2) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                AFd1iSDK.getMediationNetwork(aFd1iSDK);
                break;
            case 1:
                AFd1iSDK.getMonetizationNetwork(aFd1iSDK);
                break;
            case 2:
                AFd1iSDK.getMonetizationNetwork(aFd1iSDK);
                break;
            case 3:
                AFd1iSDK.AFAdRevenueData(aFd1iSDK);
                break;
            default:
                AFd1iSDK.AFAdRevenueData(aFd1iSDK);
                break;
        }
    }
}
