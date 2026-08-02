package defpackage;

import com.connectsdk.service.NetcastTVService;
import com.yandex.plus.core.graphql.type.a1;
import com.yandex.plus.home.analytics.evgen.b;
import com.yandex.plus.home.internal.di.c;
import com.yandex.plus.home.internal.di.d;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes3.dex */
public final class dnb {
    public final c a;
    public final b b;

    public dnb(c cVar, b bVar, a1 a1Var) {
        bVar.getClass();
        this.a = cVar;
        this.b = bVar;
    }

    public static HashMap b(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        hashMap3.put("version", 1);
        hashMap2.put(NetcastTVService.UDAP_API_EVENT, hashMap3);
        hashMap2.put("interfaces", hashMap);
        return hashMap2;
    }

    public final void a(String str, ymb ymbVar, String str2, Map map) {
        str.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("operation_name", str);
        linkedHashMap.put("error_type", ymbVar.a);
        linkedHashMap.put(Constants.KEY_MESSAGE, str2);
        linkedHashMap.put("additional_params", map);
        linkedHashMap.put("_meta", b(new HashMap()));
        c("Error.PlusSdkApi", linkedHashMap);
    }

    public final void c(String str, LinkedHashMap linkedHashMap) {
        HashMap hashMap = new HashMap();
        hashMap.putAll(linkedHashMap);
        b bVar = this.b;
        String str2 = bVar.a;
        String str3 = bVar.b;
        gh3 gh3Var = (gh3) bVar.c.invoke();
        String str4 = (String) bVar.d.invoke();
        String str5 = (String) bVar.e.invoke();
        String str6 = (String) bVar.f.invoke();
        String str7 = (String) bVar.g.invoke();
        itt ittVar = (itt) bVar.h.invoke();
        String str8 = (String) bVar.i.invoke();
        String str9 = bVar.j;
        String str10 = bVar.k;
        str7.getClass();
        str10.getClass();
        hashMap.putAll(uah.e(new Pair("client_app_package", str2), new Pair("client_app_version", str3), new Pair("service", "music"), new Pair("sdk_version", "110.0.0"), new Pair("testids", str5), new Pair("puid", str7), new Pair("log_session_id", str4), new Pair("triggered_testids", str6), new Pair("brand", gh3Var.a), new Pair("user_status", ittVar.a), new Pair(CommonUrlParts.MODEL, str9), new Pair(CommonUrlParts.OS_VERSION, str10), new Pair("device_language", str8)));
        hashMap.putAll(tah.b(new Pair("platform", ConstantDeviceInfo.APP_PLATFORM)));
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        d dVar = this.a.a;
        dVar.c().reportEvent(lowerCase, hashMap);
        dVar.c().reportDiagnosticEvent(lowerCase, hashMap);
    }
}
