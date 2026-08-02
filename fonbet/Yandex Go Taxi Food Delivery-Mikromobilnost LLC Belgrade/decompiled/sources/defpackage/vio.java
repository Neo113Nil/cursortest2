package defpackage;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes2.dex */
public final class vio {
    public final uho a;
    public final EvgenDiagnostic$WebViewType b;

    public vio(uho uhoVar, EvgenDiagnostic$WebViewType evgenDiagnostic$WebViewType) {
        this.a = uhoVar;
        this.b = evgenDiagnostic$WebViewType;
    }

    public final void a(String str) {
        Map e = gw00.e(new Pair(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, str));
        uho uhoVar = this.a;
        uhoVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("webview_type", this.b.getEventValue());
        linkedHashMap.put("additional_params", e);
        linkedHashMap.put("_meta", uho.b(new HashMap()));
        uhoVar.c("Error.WebView.Messaging.CriticalError", linkedHashMap);
    }

    public final void b(String str, String str2) {
        Map i = b.i(new Pair("js_message", str), new Pair(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, str2));
        uho uhoVar = this.a;
        uhoVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("webview_type", this.b.getEventValue());
        linkedHashMap.put("additional_params", i);
        linkedHashMap.put("_meta", uho.b(new HashMap()));
        uhoVar.c("Error.WebView.Messaging.Unhandled", linkedHashMap);
    }

    public final void c(String str) {
        Map f = b.f();
        uho uhoVar = this.a;
        uhoVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("webview_type", this.b.getEventValue());
        linkedHashMap.put("additional_params", f);
        linkedHashMap.put("error_url", str);
        linkedHashMap.put("_meta", uho.b(new HashMap()));
        uhoVar.c("Error.WebView.Messaging.OpenURL.IncorrectURL", linkedHashMap);
    }
}
