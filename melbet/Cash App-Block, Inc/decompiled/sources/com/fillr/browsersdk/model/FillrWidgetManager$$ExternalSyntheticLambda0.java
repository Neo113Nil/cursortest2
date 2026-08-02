package com.fillr.browsersdk.model;

/* loaded from: classes4.dex */
public final /* synthetic */ class FillrWidgetManager$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FillrWebView f$0;

    public /* synthetic */ FillrWidgetManager$$ExternalSyntheticLambda0(FillrWebView fillrWebView, int i) {
        this.$r8$classId = i;
        this.f$0 = fillrWebView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        FillrWebView fillrWebView = this.f$0;
        switch (i) {
            case 0:
                fillrWebView.loadJavascript(FillrWebView.FILLR_JS_CLIENT);
                break;
            default:
                fillrWebView.widgetInjected = true;
                break;
        }
    }
}
