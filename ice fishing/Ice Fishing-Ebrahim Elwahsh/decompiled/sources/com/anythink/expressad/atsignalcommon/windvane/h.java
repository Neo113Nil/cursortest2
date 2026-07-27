package com.anythink.expressad.atsignalcommon.windvane;

import D.y;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class h extends com.anythink.core.express.d.a {

    /* renamed from: a, reason: collision with root package name */
    private static h f18234a = new h();

    private h() {
    }

    public static h a() {
        return f18234a;
    }

    @Override // com.anythink.core.express.d.b
    public final void b(Object obj, String str) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (TextUtils.isEmpty(str)) {
                String str2 = bVar.f18226g;
            } else {
                str = com.anythink.core.express.d.d.c(str);
            }
            String l9 = y.l("javascript:window.WindVane.onFailure(", bVar.f18226g, ",'", str, "');");
            WindVaneWebView windVaneWebView = bVar.f18220a;
            if (windVaneWebView == null || windVaneWebView.isDestroyed()) {
                return;
            }
            try {
                bVar.f18220a.loadUrl(l9);
            } catch (Exception e6) {
                e6.printStackTrace();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @Override // com.anythink.core.express.d.b
    public final void a(Object obj, String str, String str2) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            String k6 = TextUtils.isEmpty(str2) ? y.k("javascript:window.WindVane.fireEvent('", str, "', '');") : y.l("javascript:window.WindVane.fireEvent('", str, "','", com.anythink.core.express.d.d.c(str2), "');");
            WindVaneWebView windVaneWebView = bVar.f18220a;
            if (windVaneWebView == null || windVaneWebView.isDestroyed()) {
                return;
            }
            try {
                bVar.f18220a.loadUrl(k6);
            } catch (Exception e6) {
                e6.printStackTrace();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @Override // com.anythink.core.express.d.b
    public final void a(Object obj, String str) {
        String l9;
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (TextUtils.isEmpty(str)) {
                l9 = y.k("javascript:window.WindVane.onSuccess(", bVar.f18226g, ",'');");
            } else {
                l9 = y.l("javascript:window.WindVane.onSuccess(", bVar.f18226g, ",'", com.anythink.core.express.d.d.c(str), "');");
            }
            WindVaneWebView windVaneWebView = bVar.f18220a;
            if (windVaneWebView == null || windVaneWebView.isDestroyed()) {
                return;
            }
            try {
                bVar.f18220a.loadUrl(l9);
            } catch (Exception e6) {
                e6.printStackTrace();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
