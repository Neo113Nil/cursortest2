package defpackage;

import android.content.DialogInterface;
import android.webkit.JsResult;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.webview.CustomWebView$setupWebChromeClient$1;

/* loaded from: classes12.dex */
public final /* synthetic */ class xmf implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ JsResult b;

    public /* synthetic */ xmf(JsResult jsResult, int i) {
        this.a = i;
        this.b = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.a;
        JsResult jsResult = this.b;
        switch (i2) {
            case 0:
                CustomWebView$setupWebChromeClient$1.onJsAlert$lambda$2(jsResult, dialogInterface, i);
                break;
            case 1:
                CustomWebView$setupWebChromeClient$1.onJsConfirm$lambda$3(jsResult, dialogInterface, i);
                break;
            default:
                CustomWebView$setupWebChromeClient$1.onJsConfirm$lambda$5(jsResult, dialogInterface, i);
                break;
        }
    }
}
