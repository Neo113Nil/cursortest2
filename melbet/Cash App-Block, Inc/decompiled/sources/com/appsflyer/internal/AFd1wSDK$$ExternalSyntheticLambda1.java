package com.appsflyer.internal;

/* loaded from: classes.dex */
public final /* synthetic */ class AFd1wSDK$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AFd1wSDK f$0;

    public /* synthetic */ AFd1wSDK$$ExternalSyntheticLambda1(AFd1wSDK aFd1wSDK, int i) {
        this.$r8$classId = i;
        this.f$0 = aFd1wSDK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        AFd1wSDK aFd1wSDK = this.f$0;
        switch (i) {
            case 0:
                AFd1wSDK.getMonetizationNetwork(aFd1wSDK);
                break;
            default:
                AFd1wSDK.getRevenue(aFd1wSDK);
                break;
        }
    }
}
