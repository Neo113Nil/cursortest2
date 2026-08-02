package defpackage;

import com.ybsdk.feature.webview.internal.presentation.WebViewFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class zp41 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ WebViewFragment b;

    public /* synthetic */ zp41(WebViewFragment webViewFragment, int i) {
        this.a = i;
        this.b = webViewFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 viewBinding$lambda$4$lambda$3;
        zy11 onControlClickListenerIfNeeded$lambda$15;
        int i = this.a;
        WebViewFragment webViewFragment = this.b;
        switch (i) {
            case 0:
                viewBinding$lambda$4$lambda$3 = WebViewFragment.getViewBinding$lambda$4$lambda$3(webViewFragment);
                return viewBinding$lambda$4$lambda$3;
            default:
                onControlClickListenerIfNeeded$lambda$15 = WebViewFragment.setOnControlClickListenerIfNeeded$lambda$15(webViewFragment);
                return onControlClickListenerIfNeeded$lambda$15;
        }
    }
}
