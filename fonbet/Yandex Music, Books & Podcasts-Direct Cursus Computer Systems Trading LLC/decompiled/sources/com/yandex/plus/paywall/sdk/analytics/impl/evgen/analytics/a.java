package com.yandex.plus.paywall.sdk.analytics.impl.evgen.analytics;

import android.content.Context;
import android.content.res.Configuration;
import com.connectsdk.service.NetcastTVService;
import com.yandex.plus.domain.auth.api.e;
import com.yandex.plus.domain.auth.impl.i;
import com.yandex.plus.experiments.impl.providers.h;
import com.yandex.plus.pay.internal.network.d;
import defpackage.jyr;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.uah;
import defpackage.z7o;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.Pair;

/* loaded from: classes5.dex */
public final class a {
    public final com.yandex.plus.paywall.sdk.analytics.impl.acquisition.analytics.b a;
    public final com.yandex.plus.paywall.sdk.analytics.impl.acquisition.analytics.a b;
    public final d c;

    public a(com.yandex.plus.paywall.sdk.analytics.impl.acquisition.analytics.b bVar, com.yandex.plus.paywall.sdk.analytics.impl.acquisition.analytics.a aVar, d dVar) {
        this.a = bVar;
        this.b = aVar;
        this.c = dVar;
    }

    public static HashMap a(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        hashMap3.put("version", 1);
        hashMap2.put(NetcastTVService.UDAP_API_EVENT, hashMap3);
        hashMap2.put("interfaces", hashMap);
        return hashMap2;
    }

    public final void b(String str, LinkedHashMap linkedHashMap) {
        HashMap hashMap = new HashMap();
        hashMap.putAll(linkedHashMap);
        com.yandex.plus.paywall.sdk.analytics.impl.acquisition.analytics.a aVar = this.b;
        com.yandex.plus.acquisition.sdk.common.impl.di.b bVar = aVar.a;
        com.yandex.plus.acquisition.sdk.common.api.di.b bVar2 = bVar.a;
        Context context = (Context) bVar2.i;
        Object f = ((h) aVar.b.e.getValue()).f();
        r7o r7oVar = z7o.b;
        if (f instanceof t7o) {
            f = null;
        }
        com.yandex.plus.experiments.api.a aVar2 = (com.yandex.plus.experiments.api.a) f;
        String str2 = aVar2 != null ? aVar2.a : null;
        String str3 = aVar2 != null ? aVar2.b : null;
        i iVar = (i) bVar.d.getValue();
        iVar.getClass();
        Long id = ((e) iVar.h.getValue()).getId();
        String l = id != null ? id.toString() : null;
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        String uuid = com.yandex.plus.core.analytics.logging.e.c().toString();
        uuid.getClass();
        Configuration configuration = context.getResources().getConfiguration();
        configuration.getClass();
        Locale locale = configuration.getLocales().get(0);
        locale.getClass();
        String language = locale.getLanguage();
        String format = aVar.c.format(Float.valueOf(com.yandex.plus.home.common.utils.a.c(context)));
        c cVar = context.getPackageManager().hasSystemFeature("android.software.leanback") ? c.Tv : (context.getResources().getConfiguration().screenLayout & 15) >= 3 ? c.Pad : c.Phone;
        String str4 = (String) bVar2.c;
        String str5 = (String) bVar2.b;
        String str6 = (String) bVar2.a;
        if (str2 == null) {
            str2 = "no_value";
        }
        if (l == null) {
            l = "no_value";
        }
        if (str3 == null) {
            str3 = "no_value";
        }
        language.getClass();
        format.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        hashMap.putAll(uah.e(new Pair("client_app_package", str4), new Pair("client_app_version", str5), new Pair("service", str6), new Pair("sdk_version", "110.0.0"), new Pair("testids", str2), new Pair("puid", l), new Pair("log_session_id", uuid), new Pair("triggered_testids", str3), new Pair("device_language", language), new Pair("device_screen_size", format), new Pair(CommonUrlParts.DEVICE_TYPE, cVar.a)));
        hashMap.putAll(((b) this.c.a.getValue()).a);
        Iterator it = ((com.yandex.plus.acquisition.sdk.pay.impl.internal.b) this.a.a.d.getValue()).b.iterator();
        while (it.hasNext()) {
            ((com.yandex.plus.core.analytics.i) it.next()).reportEvent(str, hashMap);
        }
    }
}
