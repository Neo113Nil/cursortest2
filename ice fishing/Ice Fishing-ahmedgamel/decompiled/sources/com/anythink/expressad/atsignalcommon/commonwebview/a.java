package com.anythink.expressad.atsignalcommon.commonwebview;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Message;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class a extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    private static final String f18015a = "CommonWebChromeClient";

    /* renamed from: b, reason: collision with root package name */
    private CopyOnWriteArrayList<WebChromeClient> f18016b = new CopyOnWriteArrayList<>();

    public final void a(WebChromeClient webChromeClient) {
        this.f18016b.add(webChromeClient);
    }

    public final void b(WebChromeClient webChromeClient) {
        this.f18016b.remove(webChromeClient);
    }

    @Override // android.webkit.WebChromeClient
    public final Bitmap getDefaultVideoPoster() {
        return super.getDefaultVideoPoster();
    }

    @Override // android.webkit.WebChromeClient
    public final View getVideoLoadingProgressView() {
        return super.getVideoLoadingProgressView();
    }

    @Override // android.webkit.WebChromeClient
    public final void getVisitedHistory(ValueCallback<String[]> valueCallback) {
        super.getVisitedHistory(valueCallback);
    }

    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        Iterator<WebChromeClient> it = this.f18016b.iterator();
        while (it.hasNext()) {
            it.next().onCloseWindow(webView);
        }
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public final void onConsoleMessage(String str, int i, String str2) {
        Iterator<WebChromeClient> it = this.f18016b.iterator();
        while (it.hasNext()) {
            it.next().onConsoleMessage(str, i, str2);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z3, boolean z6, Message message) {
        Iterator<WebChromeClient> it = this.f18016b.iterator();
        boolean z9 = false;
        while (it.hasNext()) {
            z9 = it.next().onCreateWindow(webView, z3, z6, message);
        }
        return z9;
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public final void onExceededDatabaseQuota(String str, String str2, long j6, long j9, long j10, WebStorage.QuotaUpdater quotaUpdater) {
        Iterator<WebChromeClient> it = this.f18016b.iterator();
        while (it.hasNext()) {
            it.next().onExceededDatabaseQuota(str, str2, j6, j9, j10, quotaUpdater);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsHidePrompt() {
        Iterator<WebChromeClient> it = this.f18016b.iterator();
        while (it.hasNext()) {
            it.next().onGeolocationPermissionsHidePrompt();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        Iterator<WebChromeClient> it = this.f18016b.iterator();
        while (it.hasNext()) {
            it.next().onGeolocationPermissionsShowPrompt(str, callback);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        Iterator<WebChromeClient> it = this.f18016b.iterator();
        while (it.hasNext()) {
            it.next().onHideCustomView();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        Iterator<WebChromeClient> it = this.f18016b.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            z3 = it.next().onJsAlert(webView, str, str2, jsResult);
        }
        return z3;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        Iterator<WebChromeClient> it = this.f18016b.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            z3 = it.next().onJsBeforeUnload(webView, str, str2, jsResult);
        }
        return z3;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        Iterator<WebChromeClient> it = this.f18016b.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            z3 = it.next().onJsConfirm(webView, str, str2, jsResult);
        }
        return z3;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        Iterator<WebChromeClient> it = this.f18016b.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            z3 = it.next().onJsPrompt(webView, str, str2, str3, jsPromptResult);
        }
        return z3;
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public final boolean onJsTimeout() {
        Iterator<WebChromeClient> it = this.f18016b.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            z3 = it.next().onJsTimeout();
        }
        return z3;
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        try {
            Iterator<WebChromeClient> it = this.f18016b.iterator();
            while (it.hasNext()) {
                it.next().onPermissionRequest(permissionRequest);
            }
        } catch (Exception e9) {
            e9.getMessage();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        try {
            Iterator<WebChromeClient> it = this.f18016b.iterator();
            while (it.hasNext()) {
                it.next().onPermissionRequestCanceled(permissionRequest);
            }
        } catch (Exception e9) {
            e9.getMessage();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        Iterator<WebChromeClient> it = this.f18016b.iterator();
        while (it.hasNext()) {
            it.next().onProgressChanged(webView, i);
        }
    }

    @Deprecated
    public final void onReachedMaxAppCacheSize(long j6, long j9, WebStorage.QuotaUpdater quotaUpdater) {
        Iterator<WebChromeClient> it = this.f18016b.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedIcon(WebView webView, Bitmap bitmap) {
        Iterator<WebChromeClient> it = this.f18016b.iterator();
        while (it.hasNext()) {
            it.next().onReceivedIcon(webView, bitmap);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        Iterator<WebChromeClient> it = this.f18016b.iterator();
        while (it.hasNext()) {
            it.next().onReceivedTitle(webView, str);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTouchIconUrl(WebView webView, String str, boolean z3) {
        Iterator<WebChromeClient> it = this.f18016b.iterator();
        while (it.hasNext()) {
            it.next().onReceivedTouchIconUrl(webView, str, z3);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onRequestFocus(WebView webView) {
        Iterator<WebChromeClient> it = this.f18016b.iterator();
        while (it.hasNext()) {
            it.next().onRequestFocus(webView);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        Iterator<WebChromeClient> it = this.f18016b.iterator();
        while (it.hasNext()) {
            it.next().onShowCustomView(view, customViewCallback);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        boolean z3 = false;
        try {
            Iterator<WebChromeClient> it = this.f18016b.iterator();
            while (it.hasNext()) {
                z3 = it.next().onShowFileChooser(webView, valueCallback, fileChooserParams);
            }
            return z3;
        } catch (Exception e9) {
            e9.getMessage();
            return z3;
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        Iterator<WebChromeClient> it = this.f18016b.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            z3 = it.next().onConsoleMessage(consoleMessage);
        }
        return z3;
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public final void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        Iterator<WebChromeClient> it = this.f18016b.iterator();
        while (it.hasNext()) {
            it.next().onShowCustomView(view, i, customViewCallback);
        }
    }
}
