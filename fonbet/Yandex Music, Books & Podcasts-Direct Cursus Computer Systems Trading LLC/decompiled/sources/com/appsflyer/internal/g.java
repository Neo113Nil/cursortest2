package com.appsflyer.internal;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AFc1dSDK b;

    public /* synthetic */ g(AFc1dSDK aFc1dSDK, int i) {
        this.a = i;
        this.b = aFc1dSDK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AFc1dSDK.getMediationNetwork(this.b);
                break;
            case 1:
                AFc1dSDK.getRevenue(this.b);
                break;
            default:
                AFc1dSDK.getMonetizationNetwork(this.b);
                break;
        }
    }
}
