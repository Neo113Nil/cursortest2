package com.appsflyer.internal;

import com.android.installreferrer.api.InstallReferrerClient;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AFj1uSDK f104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f105c;

    public /* synthetic */ s(AFj1uSDK aFj1uSDK, Runnable runnable, int i2) {
        this.f103a = i2;
        this.f104b = aFj1uSDK;
        this.f105c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f103a;
        Runnable runnable = this.f105c;
        AFj1uSDK aFj1uSDK = this.f104b;
        switch (i2) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                aFj1uSDK.getRevenue(runnable);
                break;
            case 1:
                aFj1uSDK.component4(runnable);
                break;
            case 2:
                aFj1uSDK.getMediationNetwork(runnable);
                break;
            default:
                aFj1uSDK.getMonetizationNetwork(runnable);
                break;
        }
    }
}
