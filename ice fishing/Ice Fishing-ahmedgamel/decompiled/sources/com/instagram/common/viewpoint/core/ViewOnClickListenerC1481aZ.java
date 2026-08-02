package com.instagram.common.viewpoint.core;

import android.view.View;
import android.webkit.WebView;

/* renamed from: com.facebook.ads.redexgen.X.aZ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1481aZ implements View.OnClickListener {
    public final /* synthetic */ M8 A00;

    public ViewOnClickListenerC1481aZ(M8 m82) {
        this.A00 = m82;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WebView webView;
        WebView webView2;
        if (WU.A02(this)) {
            return;
        }
        try {
            webView = this.A00.A07;
            if (webView.canGoBack()) {
                webView2 = this.A00.A07;
                webView2.goBack();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
