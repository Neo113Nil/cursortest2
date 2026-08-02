package com.anythink.expressad.atsignalcommon.windvane;

import D.x;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class f extends a {

    /* renamed from: a, reason: collision with root package name */
    private static f f18858a = new f();

    private f() {
    }

    public static f a() {
        return f18858a;
    }

    @Override // com.anythink.core.express.d.b
    public final void a(Object obj, String str) {
        String m9;
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (TextUtils.isEmpty(str)) {
                m9 = x.l("javascript:window.OW.onSuccess(", bVar.f18855g, ",'');");
            } else {
                m9 = x.m("javascript:window.OW.onSuccess(", bVar.f18855g, ",'", com.anythink.core.express.d.d.c(str), "');");
            }
            WindVaneWebView windVaneWebView = bVar.f18849a;
            if (windVaneWebView != null) {
                try {
                    windVaneWebView.loadUrl(m9);
                } catch (Exception e9) {
                    e9.printStackTrace();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }
}
