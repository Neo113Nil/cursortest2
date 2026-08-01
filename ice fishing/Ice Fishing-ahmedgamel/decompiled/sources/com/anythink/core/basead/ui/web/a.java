package com.anythink.core.basead.ui.web;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.anythink.core.basead.a.e;
import com.anythink.core.common.h.cc;
import com.anythink.core.common.res.d;
import com.anythink.core.common.v.q;

/* loaded from: classes.dex */
public final class a extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    private b f11995a;

    public a(b bVar) {
        this.f11995a = bVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        b bVar = this.f11995a;
        if (bVar != null) {
            bVar.onWebPageFinish(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        b bVar = this.f11995a;
        if (bVar != null) {
            bVar.onWebPageStart(webView, str);
            WebProgressBarView webProgressBarView = this.f11995a.getWebProgressBarView();
            if (webProgressBarView != null) {
                webProgressBarView.setVisibility(0);
                webProgressBarView.setProgress(0);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        b bVar = this.f11995a;
        if (bVar != null) {
            bVar.onWebPageLoadError(webView, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        b bVar = this.f11995a;
        if (bVar == null) {
            return true;
        }
        bVar.onWebFinish();
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (!TextUtils.isEmpty(str) && !d.f16215a.equals(str)) {
            b bVar = this.f11995a;
            if (bVar != null) {
                bVar.recordRedirectUrl(str);
            }
            b bVar2 = this.f11995a;
            if (bVar2 != null && bVar2.supportDeeplinkJump()) {
                cc a9 = e.a(webView.getContext(), str, this.f11995a.getBaseAdContent());
                if (a9.f13906m) {
                    b bVar3 = this.f11995a;
                    if (bVar3 != null) {
                        bVar3.callbackClickResult(a9);
                    }
                    return true;
                }
                b bVar4 = this.f11995a;
                if (bVar4 != null) {
                    bVar4.callbackClickResult(a9);
                }
                cc a10 = e.a(str);
                b bVar5 = this.f11995a;
                if (bVar5 != null) {
                    bVar5.callbackClickResult(a10);
                }
                if (!TextUtils.equals(a10.f13908o, str)) {
                    webView.loadUrl(a10.f13908o);
                    return true;
                }
            }
            if (!q.d(str)) {
                return true;
            }
        }
        return false;
    }
}
