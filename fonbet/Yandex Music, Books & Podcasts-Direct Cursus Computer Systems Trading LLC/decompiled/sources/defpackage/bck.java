package defpackage;

import android.os.Build;
import com.connectsdk.service.DeviceService;
import com.connectsdk.service.NetcastTVService;
import com.yandex.plus.domain.auth.api.e;
import com.yandex.plus.home.plaque.plugin.internal.proxy.a;
import com.yandex.plus.pay.internal.analytics.evgen.d;
import com.yandex.plus.pay.internal.di.b;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.Pair;

/* loaded from: classes4.dex */
public final class bck {
    public final a a;
    public final d b;
    public final a c;

    public bck(a aVar, d dVar, a aVar2) {
        dVar.getClass();
        this.a = aVar;
        this.b = dVar;
        this.c = aVar2;
    }

    public static void b(bck bckVar, String str, String str2, String str3, String str4) {
        LinkedHashMap m = dfi.m("code", str, Constants.KEY_MESSAGE, str2);
        m.put("currency", str3);
        m.put("additionalData", "no_value");
        m.put("productIdentifier", str4);
        m.put("_meta", c(new HashMap()));
        bckVar.d("Error.Subscription.GooglePlay.Pay.NotEnoughFunds", m);
    }

    public static HashMap c(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        hashMap3.put("version", 1);
        hashMap2.put(NetcastTVService.UDAP_API_EVENT, hashMap3);
        hashMap2.put("interfaces", hashMap);
        return hashMap2;
    }

    public final void a(String str, String str2, String str3, ack ackVar, String str4, String str5, String str6) {
        str.getClass();
        str2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("requestHost", str);
        linkedHashMap.put("requestName", str2);
        linkedHashMap.put("requestId", str3);
        linkedHashMap.put("type", ackVar.a);
        linkedHashMap.put("code", str4);
        linkedHashMap.put(DeviceService.KEY_DESC, str5);
        linkedHashMap.put("additionalData", str6);
        linkedHashMap.put("_meta", c(new HashMap()));
        d("Error.Api.RequestFailed", linkedHashMap);
    }

    public final void d(String str, LinkedHashMap linkedHashMap) {
        String str2;
        String str3;
        String str4;
        HashMap hashMap = new HashMap();
        hashMap.putAll(linkedHashMap);
        d dVar = this.b;
        b bVar = dVar.e;
        vdr vdrVar = dVar.f;
        String a = dVar.h.a();
        String str5 = "no_value";
        if (a == null) {
            a = "no_value";
        }
        String str6 = Build.VERSION.RELEASE;
        str6.getClass();
        String language = ((Locale) dVar.j.invoke()).getLanguage();
        language.getClass();
        String language2 = ((Locale) dVar.k.invoke()).getLanguage();
        language2.getClass();
        String str7 = dVar.a;
        String str8 = dVar.b;
        String str9 = dVar.c;
        String str10 = (String) dVar.d.invoke();
        Long id = ((e) vdrVar.getValue()).getId();
        if (id == null || (str2 = id.toString()) == null) {
            str2 = "no_value";
        }
        com.yandex.plus.experiments.api.a aVar = (com.yandex.plus.experiments.api.a) bVar.invoke();
        if (aVar == null || (str3 = aVar.a) == null) {
            str3 = "no_value";
        }
        com.yandex.plus.experiments.api.a aVar2 = (com.yandex.plus.experiments.api.a) bVar.invoke();
        if (aVar2 != null && (str4 = aVar2.b) != null) {
            str5 = str4;
        }
        String name = dVar.i.name();
        Locale locale = Locale.ROOT;
        String lowerCase = name.toLowerCase(locale);
        lowerCase.getClass();
        com.yandex.plus.core.user.a aVar3 = (com.yandex.plus.core.user.a) dVar.g.invoke();
        String lowerCase2 = (vdrVar.getValue() instanceof com.yandex.plus.domain.auth.api.d ? dck.NotLoggedIn : aVar3 == com.yandex.plus.core.user.a.a ? dck.NoSubscription : aVar3 == com.yandex.plus.core.user.a.b ? dck.Active : dck.Unknown).name().toLowerCase(locale);
        lowerCase2.getClass();
        String str11 = ((Boolean) dVar.l.invoke()).booleanValue() ? "store" : "testService";
        str9.getClass();
        hashMap.putAll(uah.e(new Pair("deviceId", a), new Pair("osVersion", str6), new Pair("deviceLanguage", language), new Pair("devicePreferredLanguage", language2), new Pair("deviceRegion", "null"), new Pair("clientAppPackage", str7), new Pair("clientAppVersion", str8), new Pair("service", str9), new Pair("sdkVersion", "110.0.0"), new Pair("logSessionId", str10), new Pair("puid", str2), new Pair("testIds", str3), new Pair("triggeredTestIds", str5), new Pair("brand", lowerCase), new Pair("userStatus", lowerCase2), new Pair("buildOrigin", str11)));
        hashMap.putAll(((m86) this.c.b).a);
        ((com.yandex.plus.pay.internal.analytics.evgen.a) this.a.b).b.b(new com.yandex.plus.pay.reporter.api.e(com.yandex.plus.pay.reporter.api.d.c, str, hashMap, (Throwable) null));
    }
}
