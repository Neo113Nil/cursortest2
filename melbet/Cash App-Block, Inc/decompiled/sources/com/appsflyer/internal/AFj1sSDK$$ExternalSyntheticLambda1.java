package com.appsflyer.internal;

/* loaded from: classes.dex */
public final /* synthetic */ class AFj1sSDK$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AFj1sSDK f$0;
    public final /* synthetic */ Runnable f$1;

    public /* synthetic */ AFj1sSDK$$ExternalSyntheticLambda1(AFj1sSDK aFj1sSDK, Runnable runnable, int i) {
        this.$r8$classId = i;
        this.f$0 = aFj1sSDK;
        this.f$1 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Runnable runnable = this.f$1;
        AFj1sSDK aFj1sSDK = this.f$0;
        switch (i) {
            case 0:
                aFj1sSDK.areAllFieldsValid(runnable);
                break;
            case 1:
                aFj1sSDK.AFAdRevenueData(runnable);
                break;
            default:
                aFj1sSDK.getRevenue(runnable);
                break;
        }
    }
}
