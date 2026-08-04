package com.gamericefishpro.space.x7;

import android.os.Message;
import android.webkit.ConsoleMessage;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.gamericefishpro.space.d0.q0;
import com.gamericefishpro.space.d0.w;
import com.gamericefishpro.space.w.m1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends WebChromeClient {
    public final /* synthetic */ com.gamericefishpro.space.b1.d a;

    public a(com.gamericefishpro.space.b1.d dVar) {
        this.a = dVar;
    }

    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView window) {
        Intrinsics.checkNotNullParameter(window, "window");
        ((q0) this.a.v).invoke(window);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String strMessage;
        if (consoleMessage == null || (strMessage = consoleMessage.message()) == null) {
            return true;
        }
        ((m1) this.a.w).invoke(strMessage);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView view, boolean z, boolean z2, Message message) {
        Intrinsics.checkNotNullParameter(view, "view");
        ((com.gamericefishpro.space.l7.a) this.a.i).invoke(view, message);
        return Boolean.TRUE.booleanValue();
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        ((com.gamericefishpro.space.a5.b) this.a.d).invoke(Integer.valueOf(i));
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        ((w) this.a.e).invoke(valueCallback, fileChooserParams);
        return true;
    }
}
