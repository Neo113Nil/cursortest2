package com.yandex.plus.home.analytics.diagnostic.webview;

import com.connectsdk.service.DeviceService;
import defpackage.cnb;
import defpackage.dnb;
import defpackage.e5b;
import defpackage.eta;
import defpackage.nsa;
import defpackage.tah;
import defpackage.uah;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes5.dex */
public final class a {
    public final dnb a;
    public final cnb b;

    public a(dnb dnbVar, cnb cnbVar) {
        dnbVar.getClass();
        this.a = dnbVar;
        this.b = cnbVar;
    }

    public final void a(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        Map e = uah.e(new Pair("is_auto_trigger", Boolean.valueOf(z)), new Pair(DeviceService.KEY_DESC, str2));
        dnb dnbVar = this.a;
        dnbVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("webview_type", this.b.a);
        linkedHashMap.put("additional_params", e);
        linkedHashMap.put("option_id", str);
        linkedHashMap.put("_meta", dnb.b(new HashMap()));
        dnbVar.c("Error.WebView.ChangeServiceOption", linkedHashMap);
    }

    public final void b(int i, String str, String str2, String str3, boolean z) {
        str3.getClass();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        Map b = tah.b(new Pair(DeviceService.KEY_DESC, str3));
        dnb dnbVar = this.a;
        dnbVar.getClass();
        b.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("webview_type", this.b.a);
        linkedHashMap.put("page_url", str);
        eta.u(linkedHashMap, "resource_url", str2, z, "is_main_frame");
        linkedHashMap.put("additional_params", b);
        linkedHashMap.put("error_code", String.valueOf(i));
        linkedHashMap.put("_meta", dnb.b(new HashMap()));
        dnbVar.c("Error.WebView.Loading.HTTP", linkedHashMap);
    }

    public final void c(int i, String str, String str2, String str3, boolean z) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        String valueOf = String.valueOf(i);
        Map b = tah.b(new Pair(DeviceService.KEY_DESC, str3));
        dnb dnbVar = this.a;
        dnbVar.getClass();
        b.getClass();
        valueOf.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("webview_type", this.b.a);
        linkedHashMap.put("page_url", str);
        eta.u(linkedHashMap, "resource_url", str2, z, "is_main_frame");
        linkedHashMap.put("additional_params", b);
        linkedHashMap.put("error_code", valueOf);
        linkedHashMap.put("_meta", dnb.b(new HashMap()));
        dnbVar.c("Error.WebView.Loading.Other", linkedHashMap);
    }

    public final void d(long j, String str) {
        if (str == null) {
            str = "";
        }
        int f = (int) nsa.f(j);
        e5b e5bVar = e5b.a;
        e5bVar.getClass();
        dnb dnbVar = this.a;
        dnbVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("webview_type", this.b.a);
        linkedHashMap.put("additional_params", e5bVar);
        linkedHashMap.put("page_url", str);
        linkedHashMap.put("timeout_value", String.valueOf(f));
        linkedHashMap.put("_meta", dnb.b(new HashMap()));
        dnbVar.c("Error.WebView.Loading.ReadyTimeout", linkedHashMap);
    }

    public final void e(int i, String str, String str2, String str3, boolean z) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        String valueOf = String.valueOf(i);
        Map b = tah.b(new Pair(DeviceService.KEY_DESC, str3));
        dnb dnbVar = this.a;
        dnbVar.getClass();
        b.getClass();
        valueOf.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("webview_type", this.b.a);
        linkedHashMap.put("page_url", str);
        eta.u(linkedHashMap, "resource_url", str2, z, "is_main_frame");
        linkedHashMap.put("additional_params", b);
        linkedHashMap.put("error_code", valueOf);
        linkedHashMap.put("_meta", dnb.b(new HashMap()));
        dnbVar.c("Error.WebView.Loading.SSL", linkedHashMap);
    }
}
