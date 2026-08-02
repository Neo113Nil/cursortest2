package com.knotapi.knot.models;

/* loaded from: classes4.dex */
public final /* synthetic */ class JavaScriptInterface$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ JavaScriptInterface f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ JavaScriptInterface$$ExternalSyntheticLambda0(JavaScriptInterface javaScriptInterface, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = javaScriptInterface;
        this.f$1 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        String str = this.f$1;
        JavaScriptInterface javaScriptInterface = this.f$0;
        switch (i) {
            case 0:
                javaScriptInterface.lambda$onCloseMerchantWebView$0(str);
                break;
            default:
                javaScriptInterface.lambda$onVaultApproval$2(str);
                break;
        }
    }
}
