package com.anythink.basead.webtemplet.a;

import D.y;
import android.text.TextUtils;
import android.webkit.WebView;
import com.anythink.basead.webtemplet.WTWebView;
import com.anythink.basead.webtemplet.e;
import com.anythink.basead.webtemplet.h;
import com.anythink.core.common.d.t;
import o1.RunnableC4781a;
import o1.RunnableC4782b;

/* loaded from: classes.dex */
public class c implements a {

    /* renamed from: b, reason: collision with root package name */
    private static volatile c f11443b;

    /* renamed from: a, reason: collision with root package name */
    private final String f11444a = "c";

    private c() {
    }

    public static c a() {
        if (f11443b == null) {
            synchronized (c.class) {
                try {
                    if (f11443b == null) {
                        f11443b = new c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f11443b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Object obj, String str, String str2) {
        e eVar = (e) obj;
        WTWebView wTWebView = eVar.f11491a;
        if (wTWebView == null || wTWebView.isDestroyed()) {
            return;
        }
        try {
            eVar.f11491a.loadUrl(a(str, str2));
        } catch (Throwable th) {
            a(str, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(WebView webView, String str, String str2) {
        try {
            if ((webView instanceof WTWebView) && ((WTWebView) webView).isDestroyed()) {
                return;
            }
            webView.loadUrl(a(str, str2));
        } catch (Throwable th) {
            a(str, th);
        }
    }

    private static String a(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return y.o("javascript:window.ATWebTPL.fireEvent('", str, "', '');");
        }
        return y.p("javascript:window.ATWebTPL.fireEvent('", str, "','", h.e(str2), "');");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(e eVar, String str) {
        WTWebView wTWebView = eVar.f11491a;
        if (wTWebView == null || wTWebView.isDestroyed()) {
            return;
        }
        try {
            eVar.f11491a.loadUrl(str);
        } catch (Throwable th) {
            a("callSuccess", th);
        }
    }

    @Override // com.anythink.basead.webtemplet.a.a
    public final void b(Object obj, String str) {
        String p9;
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (TextUtils.isEmpty(str)) {
                p9 = y.o("javascript:window.ATWebTPL.onFailure('", eVar.f11497g, "','');");
            } else {
                p9 = y.p("javascript:window.ATWebTPL.onFailure('", eVar.f11497g, "','", h.e(str), "');");
            }
            String str2 = eVar.f11497g;
            t.b().b(new RunnableC4781a(this, eVar, p9, 1));
        }
    }

    @Override // com.anythink.basead.webtemplet.a.a
    public final void a(Object obj, String str, String str2) {
        if (!(obj instanceof e) || TextUtils.isEmpty(str)) {
            return;
        }
        t.b().b(new RunnableC4782b(this, (e) obj, str, str2, 1));
    }

    public final void a(WebView webView, String str, String str2) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return;
        }
        t.b().b(new RunnableC4782b(this, webView, str, str2, 0));
    }

    @Override // com.anythink.basead.webtemplet.a.a
    public final void a(Object obj, String str) {
        String p9;
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (TextUtils.isEmpty(str)) {
                p9 = y.o("javascript:window.ATWebTPL.onSuccess('", eVar.f11497g, "','');");
            } else {
                p9 = y.p("javascript:window.ATWebTPL.onSuccess('", eVar.f11497g, "','", h.e(str), "');");
            }
            String str2 = eVar.f11497g;
            t.b().b(new RunnableC4781a(this, eVar, p9, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(e eVar, String str) {
        WTWebView wTWebView = eVar.f11491a;
        if (wTWebView == null || wTWebView.isDestroyed()) {
            return;
        }
        try {
            eVar.f11491a.loadUrl(str);
        } catch (Throwable th) {
            a("callFailure", th);
        }
    }

    private static void a(String str, Throwable th) {
        th.getMessage();
    }
}
