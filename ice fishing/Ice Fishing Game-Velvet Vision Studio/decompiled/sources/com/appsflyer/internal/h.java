package com.appsflyer.internal;

import android.content.Context;
import android.hardware.SensorEvent;
import com.android.installreferrer.api.InstallReferrerClient;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object i;

    public /* synthetic */ h(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.i = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                AFb1iSDK.getMonetizationNetwork((AFb1iSDK) this.e, (AFh1qSDK) this.i);
                break;
            case 1:
                ((AFa1ySDK) this.e).getCurrencyIso4217Code((AFh1mSDK) this.i);
                break;
            case 2:
                ((AFj1nSDK) this.e).G_((SensorEvent) this.i);
                break;
            case 3:
                AFj1rSDK.getRevenue((AFj1rSDK) this.e, (Context) this.i);
                break;
            case 4:
                ((AFj1wSDK) this.e).getRevenue((Context) this.i);
                break;
            default:
                AFj1ySDK.getMonetizationNetwork((AFj1ySDK) this.e, (Context) this.i);
                break;
        }
    }
}
