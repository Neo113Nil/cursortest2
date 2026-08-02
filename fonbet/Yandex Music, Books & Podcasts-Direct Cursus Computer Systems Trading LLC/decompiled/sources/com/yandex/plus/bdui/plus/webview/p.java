package com.yandex.plus.bdui.plus.webview;

import android.webkit.JavascriptInterface;
import defpackage.f1d;
import defpackage.ouj;
import java.util.LinkedHashMap;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class p extends com.yandex.plus.webview.api.contract.b implements com.yandex.plus.webview.core.javascript.a {
    public final com.yandex.plus.bdui.plus.analytics.c b;
    public final com.yandex.plus.log.api.b c;

    public p(com.yandex.plus.bdui.plus.analytics.c cVar, com.yandex.plus.log.api.b bVar) {
        cVar.getClass();
        bVar.getClass();
        this.b = cVar;
        this.c = bVar;
    }

    @Override // com.yandex.plus.webview.core.javascript.a
    public final String a() {
        return "analyticsManager";
    }

    @JavascriptInterface
    public final void sendAnalytics(@NotNull String str, @NotNull String str2, String str3) {
        LinkedHashMap M;
        str.getClass();
        str2.getClass();
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        com.yandex.plus.log.api.b bVar = this.c;
        if (bVar.b(aVar)) {
            StringBuilder m = f1d.m("sendAnalytics(); type = ", str, ", name = ", str2, ", params = ");
            m.append(str3);
            bVar.c(aVar, "SendAnalyticsContract", m.toString());
        }
        if (str3 != null) {
            try {
                M = com.yandex.plus.bdui.flex.ui.a.M(new JSONObject(str3));
            } catch (JSONException e) {
                com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.e;
                if (bVar.b(aVar2)) {
                    bVar.a(aVar2, "SendAnalyticsContract", ouj.k('!', "sendAnalytics(); invalid params = ", str3), e);
                    return;
                }
                return;
            }
        } else {
            M = null;
        }
        com.yandex.plus.bdui.analytics.c cVar = new com.yandex.plus.bdui.analytics.c(str2, M);
        if (bVar.b(aVar)) {
            bVar.c(aVar, "SendAnalyticsContract", "sendAnalytics(); send event = " + cVar);
        }
        this.b.a(str, new com.yandex.plus.bdui.plus.checkout.h(8, cVar));
    }
}
