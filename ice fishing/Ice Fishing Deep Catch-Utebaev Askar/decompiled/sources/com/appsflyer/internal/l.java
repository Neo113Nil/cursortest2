package com.appsflyer.internal;

import android.content.Context;
import android.hardware.SensorEvent;
import com.android.installreferrer.api.InstallReferrerClient;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f91a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f92b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f93c;

    public /* synthetic */ l(Object obj, Object obj2, int i2) {
        this.f91a = i2;
        this.f92b = obj;
        this.f93c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f91a;
        Object obj = this.f93c;
        Object obj2 = this.f92b;
        switch (i2) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                AFd1uSDK.getRevenue((AFd1uSDK) obj2, (AFh1mSDK) obj);
                break;
            case 1:
                ((AFj1nSDK) obj2).I_((SensorEvent) obj);
                break;
            case 2:
                AFj1rSDK.getMediationNetwork((AFj1rSDK) obj2, (Context) obj);
                break;
            case 3:
                AFj1vSDK.getRevenue((AFj1vSDK) obj2, (Context) obj);
                break;
            default:
                ((AFj1zSDK) obj2).getCurrencyIso4217Code((Context) obj);
                break;
        }
    }
}
