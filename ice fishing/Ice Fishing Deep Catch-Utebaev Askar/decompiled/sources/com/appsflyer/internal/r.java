package com.appsflyer.internal;

import com.android.installreferrer.api.InstallReferrerClient;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AFj1mSDK f102b;

    public /* synthetic */ r(AFj1mSDK aFj1mSDK, int i2) {
        this.f101a = i2;
        this.f102b = aFj1mSDK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f101a;
        AFj1mSDK aFj1mSDK = this.f102b;
        switch (i2) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                aFj1mSDK.areAllFieldsValid();
                break;
            case 1:
                aFj1mSDK.component4();
                break;
            case 2:
                aFj1mSDK.areAllFieldsValid();
                break;
            default:
                aFj1mSDK.component3();
                break;
        }
    }
}
