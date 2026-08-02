package com.appsflyer.internal;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AFb1jSDK b;

    public /* synthetic */ e(AFb1jSDK aFb1jSDK, int i) {
        this.a = i;
        this.b = aFb1jSDK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AFb1jSDK.getMonetizationNetwork(this.b);
                break;
            default:
                AFb1jSDK.AFAdRevenueData(this.b);
                break;
        }
    }
}
