package ru.rt.ebs.cryptosdk.common.webview;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import defpackage.z2v;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"ru/rt/ebs/cryptosdk/common/webview/EbsSdkJavaScriptInterface$Companion$setEbsSdkJavaScriptInterface$1", "Landroid/webkit/WebViewClient;", "Landroid/webkit/WebView;", "view", "", "url", "Lzy11;", "onPageFinished", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "cryptosdk_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EbsSdkJavaScriptInterface$Companion$setEbsSdkJavaScriptInterface$1 extends WebViewClient {
    final /* synthetic */ z2v $listener;

    public EbsSdkJavaScriptInterface$Companion$setEbsSdkJavaScriptInterface$1(z2v z2vVar) {
        this.$listener = z2vVar;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView view, String url) {
        super.onPageFinished(view, url);
        this.$listener.g();
    }
}
