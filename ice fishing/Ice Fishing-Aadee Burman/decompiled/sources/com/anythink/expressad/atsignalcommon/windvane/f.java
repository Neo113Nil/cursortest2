package com.anythink.expressad.atsignalcommon.windvane;

import D.y;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class f extends a {

    /* renamed from: a, reason: collision with root package name */
    private static f f18071a = new f();

    private f() {
    }

    public static f a() {
        return f18071a;
    }

    @Override // com.anythink.core.express.d.b
    public final void a(Object obj, String str) {
        String p9;
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (TextUtils.isEmpty(str)) {
                p9 = y.o("javascript:window.OW.onSuccess(", bVar.f18068g, ",'');");
            } else {
                p9 = y.p("javascript:window.OW.onSuccess(", bVar.f18068g, ",'", com.anythink.core.express.d.d.c(str), "');");
            }
            WindVaneWebView windVaneWebView = bVar.f18062a;
            if (windVaneWebView != null) {
                try {
                    windVaneWebView.loadUrl(p9);
                } catch (Exception e9) {
                    e9.printStackTrace();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }
}
