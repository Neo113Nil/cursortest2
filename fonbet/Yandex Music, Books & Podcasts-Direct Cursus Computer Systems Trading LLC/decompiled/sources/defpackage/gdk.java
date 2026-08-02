package defpackage;

import android.os.Build;
import com.connectsdk.service.NetcastTVService;
import com.yandex.plus.core.locale.b;
import com.yandex.plus.domain.auth.api.e;
import com.yandex.plus.experiments.impl.providers.h;
import com.yandex.plus.home.plaque.plugin.internal.proxy.a;
import com.yandex.plus.metrica.utils.i;
import com.yandex.plus.pay.ui.core.internal.common.c;
import com.yandex.plus.pay.ui.core.internal.common.d;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes5.dex */
public final class gdk {
    public final c a;
    public final c b;
    public final a c;

    public gdk(c cVar, c cVar2, a aVar) {
        this.a = cVar;
        this.b = cVar2;
        this.c = aVar;
    }

    public static void a(gdk gdkVar, String str, String str2, String str3, edk edkVar, String str4) {
        gdkVar.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("page_url", str);
        linkedHashMap.put("webViewName", str2);
        linkedHashMap.put("additionalData", "no_value");
        linkedHashMap.put("resource_url", str3);
        linkedHashMap.put("type", edkVar.a);
        linkedHashMap.put("code", str4);
        linkedHashMap.put("_meta", c(new HashMap()));
        gdkVar.d("Error.WebView.Loading.Failed", linkedHashMap);
    }

    public static void b(gdk gdkVar, String str, String str2) {
        gdkVar.getClass();
        str2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("page_url", str);
        linkedHashMap.put("webViewName", str2);
        linkedHashMap.put("additionalData", "no_value");
        linkedHashMap.put("navigation_type", "initial_page");
        linkedHashMap.put("_meta", c(new HashMap()));
        gdkVar.d("Error.WebView.Loading.Whitelist", linkedHashMap);
    }

    public static HashMap c(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        hashMap3.put("version", 1);
        hashMap2.put(NetcastTVService.UDAP_API_EVENT, hashMap3);
        hashMap2.put("interfaces", hashMap);
        return hashMap2;
    }

    public final void d(String str, LinkedHashMap linkedHashMap) {
        HashMap hashMap = new HashMap();
        hashMap.putAll(linkedHashMap);
        d dVar = this.b.a;
        i iVar = dVar.j;
        h hVar = dVar.h;
        vdr vdrVar = dVar.f;
        com.yandex.plus.core.locale.a aVar = dVar.i;
        String a = iVar.a();
        if (a == null) {
            a = "no_value";
        }
        String str2 = Build.VERSION.RELEASE;
        str2.getClass();
        String m = b.m(aVar);
        String m2 = b.m(aVar);
        String str3 = dVar.d;
        String str4 = dVar.e;
        String str5 = dVar.a;
        String uuid = dVar.m.a.toString();
        uuid.getClass();
        Long id = ((e) vdrVar.getValue()).getId();
        String l = id != null ? id.toString() : null;
        if (l == null) {
            l = "no_value";
        }
        Object f = hVar.f();
        r7o r7oVar = z7o.b;
        if (f instanceof t7o) {
            f = null;
        }
        com.yandex.plus.experiments.api.a aVar2 = (com.yandex.plus.experiments.api.a) f;
        String str6 = aVar2 != null ? aVar2.a : null;
        if (str6 == null) {
            str6 = "no_value";
        }
        Object f2 = hVar.f();
        if (f2 instanceof t7o) {
            f2 = null;
        }
        com.yandex.plus.experiments.api.a aVar3 = (com.yandex.plus.experiments.api.a) f2;
        String str7 = aVar3 != null ? aVar3.b : null;
        String str8 = str7 != null ? str7 : "no_value";
        String name = dVar.c.name();
        Locale locale = Locale.ROOT;
        String lowerCase = name.toLowerCase(locale);
        lowerCase.getClass();
        com.yandex.plus.core.user.a aVar4 = (com.yandex.plus.core.user.a) dVar.g.invoke();
        String lowerCase2 = (vdrVar.getValue() instanceof com.yandex.plus.domain.auth.api.d ? idk.NotLoggedIn : aVar4 == com.yandex.plus.core.user.a.a ? idk.NoSubscription : aVar4 == com.yandex.plus.core.user.a.b ? idk.Active : idk.Unknown).name().toLowerCase(locale);
        lowerCase2.getClass();
        String str9 = ((Boolean) dVar.k.invoke()).booleanValue() ? "store" : "testService";
        str5.getClass();
        hashMap.putAll(uah.e(new Pair("deviceId", a), new Pair("osVersion", str2), new Pair("deviceLanguage", m), new Pair("devicePreferredLanguage", m2), new Pair("deviceRegion", "null"), new Pair("clientAppPackage", str3), new Pair("clientAppVersion", str4), new Pair("service", str5), new Pair("sdkVersion", "110.0.0"), new Pair("logSessionId", uuid), new Pair("puid", l), new Pair("testIds", str6), new Pair("triggeredTestIds", str8), new Pair("brand", lowerCase), new Pair("userStatus", lowerCase2), new Pair("buildOrigin", str9)));
        hashMap.putAll((Map) ((g8c) this.c.b).a);
        this.a.a.l.b(new com.yandex.plus.pay.reporter.api.e(com.yandex.plus.pay.reporter.api.d.c, str, hashMap, (Throwable) null));
    }
}
