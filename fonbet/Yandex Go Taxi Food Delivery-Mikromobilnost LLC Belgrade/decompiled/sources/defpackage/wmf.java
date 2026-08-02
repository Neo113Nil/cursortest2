package defpackage;

import android.content.DialogInterface;
import android.webkit.JsResult;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.webview.CustomWebView$setupWebChromeClient$1;

/* loaded from: classes12.dex */
public final /* synthetic */ class wmf implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ JsResult b;

    public /* synthetic */ wmf(JsResult jsResult, int i) {
        this.a = i;
        this.b = jsResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i = this.a;
        JsResult jsResult = this.b;
        switch (i) {
            case 0:
                CustomWebView$setupWebChromeClient$1.onJsAlert$lambda$1(jsResult, dialogInterface);
                break;
            default:
                CustomWebView$setupWebChromeClient$1.onJsConfirm$lambda$4(jsResult, dialogInterface);
                break;
        }
    }
}
