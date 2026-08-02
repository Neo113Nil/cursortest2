package io.flutter.plugins.webviewflutter;

import android.os.Message;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: classes4.dex */
public class WebChromeClientProxyApi$SecureWebChromeClient extends WebChromeClient {
    WebViewClient webViewClient;

    public boolean onCreateWindow(final WebView webView, Message message, WebView webView2) {
        if (this.webViewClient == null) {
            return false;
        }
        WebViewClient webViewClient = new WebViewClient() { // from class: io.flutter.plugins.webviewflutter.WebChromeClientProxyApi$SecureWebChromeClient.1
            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView3, WebResourceRequest webResourceRequest) {
                if (WebChromeClientProxyApi$SecureWebChromeClient.this.webViewClient.shouldOverrideUrlLoading(webView, webResourceRequest)) {
                    return true;
                }
                webView.loadUrl(webResourceRequest.getUrl().toString());
                return true;
            }
        };
        if (webView2 == null) {
            webView2 = new WebView(webView.getContext());
        }
        webView2.setWebViewClient(webViewClient);
        ((WebView.WebViewTransport) message.obj).setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        this.webViewClient = webViewClient;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        return onCreateWindow(webView, message, new WebView(webView.getContext()));
    }
}
