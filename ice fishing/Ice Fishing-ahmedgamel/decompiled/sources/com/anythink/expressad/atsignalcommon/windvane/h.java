package com.anythink.expressad.atsignalcommon.windvane;

import D.y;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class h extends com.anythink.core.express.d.a {

    /* renamed from: a, reason: collision with root package name */
    private static h f18076a = new h();

    private h() {
    }

    public static h a() {
        return f18076a;
    }

    @Override // com.anythink.core.express.d.b
    public final void b(Object obj, String str) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (TextUtils.isEmpty(str)) {
                String str2 = bVar.f18068g;
            } else {
                str = com.anythink.core.express.d.d.c(str);
            }
            String p9 = y.p("javascript:window.WindVane.onFailure(", bVar.f18068g, ",'", str, "');");
            WindVaneWebView windVaneWebView = bVar.f18062a;
            if (windVaneWebView == null || windVaneWebView.isDestroyed()) {
                return;
            }
            try {
                bVar.f18062a.loadUrl(p9);
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
            String o6 = TextUtils.isEmpty(str2) ? y.o("javascript:window.WindVane.fireEvent('", str, "', '');") : y.p("javascript:window.WindVane.fireEvent('", str, "','", com.anythink.core.express.d.d.c(str2), "');");
            WindVaneWebView windVaneWebView = bVar.f18062a;
            if (windVaneWebView == null || windVaneWebView.isDestroyed()) {
                return;
            }
            try {
                bVar.f18062a.loadUrl(o6);
            } catch (Exception e9) {
                e9.printStackTrace();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @Override // com.anythink.core.express.d.b
    public final void a(Object obj, String str) {
        String p9;
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (TextUtils.isEmpty(str)) {
                p9 = y.o("javascript:window.WindVane.onSuccess(", bVar.f18068g, ",'');");
            } else {
                p9 = y.p("javascript:window.WindVane.onSuccess(", bVar.f18068g, ",'", com.anythink.core.express.d.d.c(str), "');");
            }
            WindVaneWebView windVaneWebView = bVar.f18062a;
            if (windVaneWebView == null || windVaneWebView.isDestroyed()) {
                return;
            }
            try {
                bVar.f18062a.loadUrl(p9);
            } catch (Exception e9) {
                e9.printStackTrace();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
