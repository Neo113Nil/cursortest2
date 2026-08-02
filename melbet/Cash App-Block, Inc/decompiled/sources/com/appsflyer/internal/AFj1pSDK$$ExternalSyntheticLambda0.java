package com.appsflyer.internal;

/* loaded from: classes.dex */
public final /* synthetic */ class AFj1pSDK$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AFj1pSDK f$0;

    public /* synthetic */ AFj1pSDK$$ExternalSyntheticLambda0(AFj1pSDK aFj1pSDK, int i) {
        this.$r8$classId = i;
        this.f$0 = aFj1pSDK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        AFj1pSDK aFj1pSDK = this.f$0;
        switch (i) {
            case 0:
                aFj1pSDK.component4();
                break;
            case 1:
                aFj1pSDK.component2();
                break;
            default:
                aFj1pSDK.component1();
                break;
        }
    }
}
