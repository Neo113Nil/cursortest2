package defpackage;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes2.dex */
public final class wio {
    public final uho a;
    public final EvgenDiagnostic$WebViewType b;

    public wio(uho uhoVar, EvgenDiagnostic$WebViewType evgenDiagnostic$WebViewType) {
        this.a = uhoVar;
        this.b = evgenDiagnostic$WebViewType;
    }

    public final void a(String str, String str2, boolean z) {
        Map i = b.i(new Pair("is_auto_trigger", Boolean.valueOf(z)), new Pair(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, str2));
        uho uhoVar = this.a;
        uhoVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("webview_type", this.b.getEventValue());
        linkedHashMap.put("additional_params", i);
        linkedHashMap.put("option_id", str);
        linkedHashMap.put("_meta", uho.b(new HashMap()));
        uhoVar.c("Error.WebView.ChangeServiceOption", linkedHashMap);
    }

    public final void b(String str, int i, String str2, String str3, boolean z) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        Map e = gw00.e(new Pair(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, str3));
        uho uhoVar = this.a;
        uhoVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("webview_type", this.b.getEventValue());
        linkedHashMap.put("page_url", str);
        linkedHashMap.put("resource_url", str2);
        linkedHashMap.put("is_main_frame", String.valueOf(z));
        linkedHashMap.put("additional_params", e);
        linkedHashMap.put("error_code", String.valueOf(i));
        linkedHashMap.put("_meta", uho.b(new HashMap()));
        uhoVar.c("Error.WebView.Loading.HTTP", linkedHashMap);
    }

    public final void c(String str, int i, String str2, String str3, boolean z) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        String valueOf = String.valueOf(i);
        Map e = gw00.e(new Pair(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, str3));
        uho uhoVar = this.a;
        uhoVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("webview_type", this.b.getEventValue());
        linkedHashMap.put("page_url", str);
        linkedHashMap.put("resource_url", str2);
        linkedHashMap.put("is_main_frame", String.valueOf(z));
        linkedHashMap.put("additional_params", e);
        linkedHashMap.put("error_code", valueOf);
        linkedHashMap.put("_meta", uho.b(new HashMap()));
        uhoVar.c("Error.WebView.Loading.Other", linkedHashMap);
    }

    public final void d(long j, String str) {
        if (str == null) {
            str = "";
        }
        int e = (int) e3n.e(j);
        Map f = b.f();
        uho uhoVar = this.a;
        uhoVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("webview_type", this.b.getEventValue());
        linkedHashMap.put("additional_params", f);
        linkedHashMap.put("page_url", str);
        linkedHashMap.put("timeout_value", String.valueOf(e));
        linkedHashMap.put("_meta", uho.b(new HashMap()));
        uhoVar.c("Error.WebView.Loading.ReadyTimeout", linkedHashMap);
    }

    public final void e(String str, int i, String str2, String str3, boolean z) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        String valueOf = String.valueOf(i);
        Map e = gw00.e(new Pair(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, str3));
        uho uhoVar = this.a;
        uhoVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("webview_type", this.b.getEventValue());
        linkedHashMap.put("page_url", str);
        linkedHashMap.put("resource_url", str2);
        linkedHashMap.put("is_main_frame", String.valueOf(z));
        linkedHashMap.put("additional_params", e);
        linkedHashMap.put("error_code", valueOf);
        linkedHashMap.put("_meta", uho.b(new HashMap()));
        uhoVar.c("Error.WebView.Loading.SSL", linkedHashMap);
    }
}
