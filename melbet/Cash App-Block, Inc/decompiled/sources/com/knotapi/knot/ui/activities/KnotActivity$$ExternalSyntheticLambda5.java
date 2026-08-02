package com.knotapi.knot.ui.activities;

/* loaded from: classes4.dex */
public final /* synthetic */ class KnotActivity$$ExternalSyntheticLambda5 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ KnotActivity f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ KnotActivity$$ExternalSyntheticLambda5(KnotActivity knotActivity, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = knotActivity;
        this.f$1 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        String str = this.f$1;
        KnotActivity knotActivity = this.f$0;
        switch (i) {
            case 0:
                knotActivity.lambda$evaluateJS$9(str);
                break;
            default:
                knotActivity.lambda$onConnectionStateChanged$7(str);
                break;
        }
    }
}
