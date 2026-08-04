package com.appsflyer.internal;

import com.android.installreferrer.api.InstallReferrerClient;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f89a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AFd1uSDK f90b;

    public /* synthetic */ k(AFd1uSDK aFd1uSDK, int i2) {
        this.f89a = i2;
        this.f90b = aFd1uSDK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f89a;
        AFd1uSDK aFd1uSDK = this.f90b;
        switch (i2) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                AFd1uSDK.AFAdRevenueData(aFd1uSDK);
                break;
            default:
                AFd1uSDK.getMonetizationNetwork(aFd1uSDK);
                break;
        }
    }
}
