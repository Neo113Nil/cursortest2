package com.appsflyer;

import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.internal.AFh1uSDK;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f59a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AFh1uSDK[] f60b;

    public /* synthetic */ b(AFh1uSDK[] aFh1uSDKArr, int i2) {
        this.f59a = i2;
        this.f60b = aFh1uSDKArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f59a;
        AFh1uSDK[] aFh1uSDKArr = this.f60b;
        switch (i2) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                AFLogger.getMonetizationNetwork(aFh1uSDKArr);
                break;
            default:
                AFLogger.getCurrencyIso4217Code(aFh1uSDKArr);
                break;
        }
    }
}
