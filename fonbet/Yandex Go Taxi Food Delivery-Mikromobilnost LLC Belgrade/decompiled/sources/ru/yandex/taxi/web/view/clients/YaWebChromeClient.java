package ru.yandex.taxi.web.view.clients;

import android.content.Intent;
import android.os.Message;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import defpackage.af41;
import defpackage.jst;
import defpackage.lj41;
import defpackage.m501;
import defpackage.tse;
import kotlin.Metadata;
import ru.yandex.taxi.fragment.common.BaseWebChromeClient;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0017\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001b\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\fH\u0014¢\u0006\u0004\b\u001d\u0010\u0010J\u000f\u0010\u001e\u001a\u00020\fH\u0014¢\u0006\u0004\b\u001e\u0010\u0010J\u001f\u0010!\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010#¨\u0006$"}, d2 = {"Lru/yandex/taxi/web/view/clients/YaWebChromeClient;", "Lru/yandex/taxi/fragment/common/BaseWebChromeClient;", "Ltse;", "coroutineScope", "", "delayedSpinner", "Llj41;", "progress", "<init>", "(Ltse;ZLlj41;)V", "Laf41;", "listener", "Lzy11;", "setListener", "(Laf41;)V", "release", "()V", "Landroid/webkit/WebView;", "view", "isDialog", "isUserGesture", "Landroid/os/Message;", "resultMsg", "onCreateWindow", "(Landroid/webkit/WebView;ZZLandroid/os/Message;)Z", "", "newProgress", "onProgressChanged", "(Landroid/webkit/WebView;I)V", "hideContent", "showContent", "", "webTitle", "onReceivedTitle", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "Laf41;", "web"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class YaWebChromeClient extends BaseWebChromeClient {
    private af41 listener;

    public YaWebChromeClient(tse tseVar, boolean z, lj41 lj41Var) {
        super(tseVar, z, lj41Var);
        this.listener = m501.w;
    }

    @Override // ru.yandex.taxi.fragment.common.BaseWebChromeClient
    public void hideContent() {
        super.hideContent();
        this.listener.z();
    }

    @Override // ru.yandex.taxi.fragment.common.BaseWebChromeClient, android.webkit.WebChromeClient
    public boolean onCreateWindow(WebView view, boolean isDialog, boolean isUserGesture, Message resultMsg) {
        if (view == null || resultMsg == null) {
            return super.onCreateWindow(view, isDialog, isUserGesture, resultMsg);
        }
        WebView webView = new WebView(view.getContext());
        webView.setWebViewClient(new WebViewClient() { // from class: ru.yandex.taxi.web.view.clients.YaWebChromeClient$onCreateWindow$1
            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView view2, WebResourceRequest request) {
                view2.getContext().startActivity(new Intent("android.intent.action.VIEW", request.getUrl()));
                return true;
            }
        });
        Object obj = resultMsg.obj;
        WebView.WebViewTransport webViewTransport = obj instanceof WebView.WebViewTransport ? (WebView.WebViewTransport) obj : null;
        if (webViewTransport == null) {
            jst.e.c("Invalid message object type: expected WebViewTransport");
            return false;
        }
        webViewTransport.setWebView(webView);
        resultMsg.sendToTarget();
        return true;
    }

    @Override // ru.yandex.taxi.fragment.common.BaseWebChromeClient, android.webkit.WebChromeClient
    public void onProgressChanged(WebView view, int newProgress) {
        super.onProgressChanged(view, newProgress);
        this.listener.d();
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTitle(WebView view, String webTitle) {
        this.listener.E(webTitle);
    }

    public final void release() {
        setListener(m501.w);
    }

    public final void setListener(af41 listener) {
        this.listener = listener;
    }

    @Override // ru.yandex.taxi.fragment.common.BaseWebChromeClient
    public void showContent() {
        super.showContent();
        this.listener.H();
    }
}
