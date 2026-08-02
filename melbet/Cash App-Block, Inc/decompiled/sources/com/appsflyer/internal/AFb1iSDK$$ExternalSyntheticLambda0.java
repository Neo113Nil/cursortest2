package com.appsflyer.internal;

/* loaded from: classes.dex */
public final /* synthetic */ class AFb1iSDK$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ AFb1iSDK$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                AFb1iSDK.getMediationNetwork((AFb1iSDK) obj);
                break;
            default:
                AFa1ySDK.getMediationNetwork((AFd1zSDK) obj);
                break;
        }
    }
}
