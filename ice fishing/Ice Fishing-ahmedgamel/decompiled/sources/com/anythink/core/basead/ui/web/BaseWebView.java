package com.anythink.core.basead.ui.web;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.CookieManager;
import android.webkit.WebView;
import com.anythink.core.common.d.v;
import com.anythink.core.common.res.d;
import com.anythink.core.common.v.am;
import com.anythink.core.common.v.p;

/* loaded from: classes.dex */
public class BaseWebView extends WebView {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f11940a = false;

    /* renamed from: g, reason: collision with root package name */
    protected boolean f11941g;

    public BaseWebView(Context context) {
        super(context);
        a();
    }

    private static void a(Context context) {
    }

    private void b() {
        getSettings().setJavaScriptEnabled(true);
        getSettings().setDomStorageEnabled(true);
        getSettings().setCacheMode(-1);
    }

    private void c() {
        getSettings().setAllowFileAccess(false);
        getSettings().setAllowContentAccess(false);
        getSettings().setAllowFileAccessFromFileURLs(false);
        getSettings().setAllowUniversalAccessFromFileURLs(false);
    }

    @Override // android.webkit.WebView
    public void destroy() {
        if (this.f11941g) {
            return;
        }
        this.f11941g = true;
        am.a(this);
        stopLoading();
        setWebChromeClient(null);
        setWebViewClient(null);
        clearHistory();
        clearCache(true);
        getSettings().setJavaScriptEnabled(false);
        loadUrl(d.f16215a);
        removeAllViews();
        super.destroy();
    }

    public boolean isDestroyed() {
        return this.f11941g;
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        CookieManager.getInstance().setAcceptThirdPartyCookies(this, v.a(getContext()).b());
    }

    public void a() {
        getSettings().setAllowFileAccess(false);
        getSettings().setAllowContentAccess(false);
        getSettings().setAllowFileAccessFromFileURLs(false);
        getSettings().setAllowUniversalAccessFromFileURLs(false);
        com.anythink.core.basead.ui.a.a.a(this);
        p.a(this);
        if (f11940a) {
            return;
        }
        getContext();
        f11940a = true;
    }

    public BaseWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public BaseWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }
}
