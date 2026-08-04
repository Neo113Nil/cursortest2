package com.appsflyer.internal;

import com.android.installreferrer.api.InstallReferrerClient;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f75a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f76b;

    public /* synthetic */ a(int i2, Object obj) {
        this.f75a = i2;
        this.f76b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f75a;
        Object obj = this.f76b;
        switch (i2) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((AFe1ySDK) obj).AFAdRevenueData();
                break;
            default:
                AFb1rSDK.getRevenue((AFd1kSDK) obj);
                break;
        }
    }
}
