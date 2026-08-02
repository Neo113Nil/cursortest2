package com.anythink.expressad.atsignalcommon.windvane;

import D.x;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class h extends com.anythink.core.express.d.a {

    /* renamed from: a, reason: collision with root package name */
    private static h f18863a = new h();

    private h() {
    }

    public static h a() {
        return f18863a;
    }

    @Override // com.anythink.core.express.d.b
    public final void b(Object obj, String str) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (TextUtils.isEmpty(str)) {
                String str2 = bVar.f18855g;
            } else {
                str = com.anythink.core.express.d.d.c(str);
            }
            String m9 = x.m("javascript:window.WindVane.onFailure(", bVar.f18855g, ",'", str, "');");
            WindVaneWebView windVaneWebView = bVar.f18849a;
            if (windVaneWebView == null || windVaneWebView.isDestroyed()) {
                return;
            }
            try {
                bVar.f18849a.loadUrl(m9);
            } catch (Exception e9) {
                e9.printStackTrace();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @Override // com.anythink.core.express.d.b
    public final void a(Object obj, String str, String str2) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            String l9 = TextUtils.isEmpty(str2) ? x.l("javascript:window.WindVane.fireEvent('", str, "', '');") : x.m("javascript:window.WindVane.fireEvent('", str, "','", com.anythink.core.express.d.d.c(str2), "');");
            WindVaneWebView windVaneWebView = bVar.f18849a;
            if (windVaneWebView == null || windVaneWebView.isDestroyed()) {
                return;
            }
            try {
                bVar.f18849a.loadUrl(l9);
            } catch (Exception e9) {
                e9.printStackTrace();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @Override // com.anythink.core.express.d.b
    public final void a(Object obj, String str) {
        String m9;
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (TextUtils.isEmpty(str)) {
                m9 = x.l("javascript:window.WindVane.onSuccess(", bVar.f18855g, ",'');");
            } else {
                m9 = x.m("javascript:window.WindVane.onSuccess(", bVar.f18855g, ",'", com.anythink.core.express.d.d.c(str), "');");
            }
            WindVaneWebView windVaneWebView = bVar.f18849a;
            if (windVaneWebView == null || windVaneWebView.isDestroyed()) {
                return;
            }
            try {
                bVar.f18849a.loadUrl(m9);
            } catch (Exception e9) {
                e9.printStackTrace();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
