package com.yandex.plus.home.analytics.diagnostic.messaging;

import com.connectsdk.service.DeviceService;
import defpackage.cnb;
import defpackage.dnb;
import defpackage.e5b;
import defpackage.tah;
import defpackage.uah;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes5.dex */
public final class b {
    public final dnb a;
    public final cnb b;

    public b(dnb dnbVar, cnb cnbVar) {
        dnbVar.getClass();
        this.a = dnbVar;
        this.b = cnbVar;
    }

    public final void a(String str) {
        str.getClass();
        Map b = tah.b(new Pair(DeviceService.KEY_DESC, str));
        dnb dnbVar = this.a;
        dnbVar.getClass();
        b.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("webview_type", this.b.a);
        linkedHashMap.put("additional_params", b);
        linkedHashMap.put("_meta", dnb.b(new HashMap()));
        dnbVar.c("Error.WebView.Messaging.CriticalError", linkedHashMap);
    }

    public final void b(String str, String str2) {
        str.getClass();
        Map e = uah.e(new Pair("js_message", str), new Pair(DeviceService.KEY_DESC, str2));
        dnb dnbVar = this.a;
        dnbVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("webview_type", this.b.a);
        linkedHashMap.put("additional_params", e);
        linkedHashMap.put("_meta", dnb.b(new HashMap()));
        dnbVar.c("Error.WebView.Messaging.Unhandled", linkedHashMap);
    }

    public final void c(String str) {
        str.getClass();
        e5b e5bVar = e5b.a;
        e5bVar.getClass();
        dnb dnbVar = this.a;
        dnbVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("webview_type", this.b.a);
        linkedHashMap.put("additional_params", e5bVar);
        linkedHashMap.put("error_url", str);
        linkedHashMap.put("_meta", dnb.b(new HashMap()));
        dnbVar.c("Error.WebView.Messaging.OpenURL.IncorrectURL", linkedHashMap);
    }
}
