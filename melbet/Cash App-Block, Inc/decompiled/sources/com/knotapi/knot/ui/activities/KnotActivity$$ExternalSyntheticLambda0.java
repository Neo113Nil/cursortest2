package com.knotapi.knot.ui.activities;

/* loaded from: classes4.dex */
public final /* synthetic */ class KnotActivity$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ KnotActivity f$0;

    public /* synthetic */ KnotActivity$$ExternalSyntheticLambda0(KnotActivity knotActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = knotActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        KnotActivity knotActivity = this.f$0;
        switch (i) {
            case 0:
                knotActivity.lambda$hideLoading$5();
                break;
            case 1:
                knotActivity.lambda$callSlowInternetTimeOut$6();
                break;
            default:
                knotActivity.lambda$showLoading$4();
                break;
        }
    }
}
