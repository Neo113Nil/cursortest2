package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

/* loaded from: classes.dex */
public final class uho {
    public final cot a;
    public final zho b;

    public uho(cot cotVar, zho zhoVar, bio bioVar) {
        this.a = cotVar;
        this.b = zhoVar;
    }

    public static HashMap b(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        hashMap3.put("version", 1);
        hashMap2.put(DatabaseHelper.OttTrackingTable.COLUMN_EVENT, hashMap3);
        hashMap2.put("interfaces", hashMap);
        return hashMap2;
    }

    public final void a(String str, EvgenDiagnostic$NetworkErrorType evgenDiagnostic$NetworkErrorType, String str2, Map map) {
        LinkedHashMap x = g8e.x("operation_name", str);
        x.put("error_type", evgenDiagnostic$NetworkErrorType.getEventValue());
        x.put(Constants.KEY_MESSAGE, str2);
        x.put("additional_params", map);
        x.put("_meta", b(new HashMap()));
        c("Error.PlusSdkApi", x);
    }

    public final void c(String str, LinkedHashMap linkedHashMap) {
        HashMap hashMap = new HashMap();
        hashMap.putAll(linkedHashMap);
        zho zhoVar = this.b;
        String str2 = zhoVar.a;
        String str3 = zhoVar.b;
        String str4 = zhoVar.c;
        BrandType brandType = (BrandType) zhoVar.d.invoke();
        String str5 = (String) zhoVar.e.invoke();
        String str6 = (String) zhoVar.f.invoke();
        String str7 = (String) zhoVar.g.invoke();
        String str8 = (String) zhoVar.h.invoke();
        UserStatusType userStatusType = (UserStatusType) zhoVar.i.invoke();
        String str9 = (String) zhoVar.j.invoke();
        hashMap.putAll(b.i(new Pair("client_app_package", str2), new Pair("client_app_version", str3), new Pair(Constants.KEY_SERVICE, str4), new Pair("sdk_version", "110.0.2"), new Pair("testids", str6), new Pair("puid", str8), new Pair("log_session_id", str5), new Pair("triggered_testids", str7), new Pair("brand", brandType.getEventValue()), new Pair("user_status", userStatusType.getEventValue()), new Pair("model", zhoVar.k), new Pair("os_version", zhoVar.l), new Pair("device_language", str9)));
        hashMap.putAll(new aio().a);
        String lowerCase = str.toLowerCase(Locale.ROOT);
        com.yandex.plus.home.internal.di.b bVar = (com.yandex.plus.home.internal.di.b) this.a.b;
        bVar.c().reportEvent(lowerCase, hashMap);
        bVar.c().reportDiagnosticEvent(lowerCase, hashMap);
    }
}
