package com.yandex.plus.pay.ui.webview.common.diagnostic;

import defpackage.fdk;
import defpackage.gdk;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* loaded from: classes5.dex */
public final class a {
    public final String a;
    public final gdk b;

    public a(String str, gdk gdkVar) {
        str.getClass();
        gdkVar.getClass();
        this.a = str;
        this.b = gdkVar;
    }

    public final void a(long j, String str, String str2) {
        str.getClass();
        gdk gdkVar = this.b;
        gdkVar.getClass();
        String str3 = this.a;
        str3.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("page_url", str);
        linkedHashMap.put("webViewName", str3);
        linkedHashMap.put("additionalData", "no_value");
        linkedHashMap.put("timeOutMillis", String.valueOf(j));
        linkedHashMap.put(Constants.KEY_MESSAGE, str2);
        linkedHashMap.put("_meta", gdk.c(new HashMap()));
        gdkVar.d("Error.WebView.Messaging.Timeout", linkedHashMap);
    }

    public final void b(String str, String str2) {
        str.getClass();
        str2.getClass();
        fdk[] fdkVarArr = fdk.a;
        gdk gdkVar = this.b;
        gdkVar.getClass();
        String str3 = this.a;
        str3.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("page_url", str);
        linkedHashMap.put("webViewName", str3);
        linkedHashMap.put("additionalData", "no_value");
        linkedHashMap.put("type", "unhandled");
        linkedHashMap.put(Constants.KEY_MESSAGE, str2);
        linkedHashMap.put("_meta", gdk.c(new HashMap()));
        gdkVar.d("Error.WebView.Messaging.Failed", linkedHashMap);
    }
}
