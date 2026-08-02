package com.yandex.plus.paywall.sdk.analytics.impl.evgen.diagnostic;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import com.connectsdk.service.NetcastTVService;
import com.yandex.plus.acquisition.sdk.pay.common.api.u;
import com.yandex.plus.acquisition.sdk.pay.common.api.v;
import com.yandex.plus.acquisition.sdk.pay.common.api.w;
import com.yandex.plus.domain.auth.impl.i;
import com.yandex.plus.experiments.impl.providers.h;
import defpackage.b6e;
import defpackage.jyr;
import defpackage.l1j;
import defpackage.ouj;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.uah;
import defpackage.z7o;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class e {
    public final com.yandex.plus.paywall.sdk.analytics.impl.acquisition.analytics.b a;
    public final com.yandex.plus.paywall.sdk.analytics.impl.acquisition.analytics.a b;
    public final com.yandex.plus.pay.internal.network.d c;

    public e(com.yandex.plus.paywall.sdk.analytics.impl.acquisition.analytics.b bVar, com.yandex.plus.paywall.sdk.analytics.impl.acquisition.analytics.a aVar, com.yandex.plus.pay.internal.network.d dVar) {
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
        Object obj;
        HashMap hashMap = new HashMap();
        hashMap.putAll(linkedHashMap);
        com.yandex.plus.paywall.sdk.analytics.impl.acquisition.analytics.a aVar = this.b;
        com.yandex.plus.acquisition.sdk.common.impl.di.b bVar = aVar.a;
        com.yandex.plus.acquisition.sdk.common.api.di.b bVar2 = bVar.a;
        jyr jyrVar = bVar.d;
        Context context = (Context) bVar2.i;
        com.yandex.plus.acquisition.sdk.pay.impl.b bVar3 = aVar.b;
        Object f = ((h) bVar3.e.getValue()).f();
        r7o r7oVar = z7o.b;
        if (f instanceof t7o) {
            f = null;
        }
        com.yandex.plus.experiments.api.a aVar2 = (com.yandex.plus.experiments.api.a) f;
        String str2 = aVar2 != null ? aVar2.a : null;
        String str3 = aVar2 != null ? aVar2.b : null;
        i iVar = (i) jyrVar.getValue();
        iVar.getClass();
        Long id = ((com.yandex.plus.domain.auth.api.e) iVar.h.getValue()).getId();
        String l = id != null ? id.toString() : null;
        jyr jyrVar2 = com.yandex.plus.core.analytics.logging.e.a;
        String uuid = com.yandex.plus.core.analytics.logging.e.c().toString();
        uuid.getClass();
        String a = ((com.yandex.plus.metrica.utils.i) bVar.e.getValue()).a();
        Configuration configuration = context.getResources().getConfiguration();
        configuration.getClass();
        Locale locale = configuration.getLocales().get(0);
        locale.getClass();
        String language = locale.getLanguage();
        String format = aVar.c.format(Float.valueOf(com.yandex.plus.home.common.utils.a.c(context)));
        c cVar = context.getPackageManager().hasSystemFeature("android.software.leanback") ? c.Tv : (context.getResources().getConfiguration().screenLayout & 15) >= 3 ? c.Pad : c.Phone;
        if (((Function0) bVar2.h).invoke() != null) {
            l1j.f();
            return;
        }
        int ordinal = ((com.yandex.plus.pay.internal.g) ((com.yandex.plus.acquisition.sdk.pay.impl.subscription.a) bVar3.i.getValue()).a).e().ordinal();
        if (ordinal == 0) {
            obj = v.a;
        } else if (ordinal == 1) {
            obj = u.a;
        } else {
            if (ordinal != 2) {
                b6e.s();
                return;
            }
            obj = w.a;
        }
        i iVar2 = (i) jyrVar.getValue();
        iVar2.getClass();
        g gVar = !(iVar2.h.getValue() instanceof com.yandex.plus.domain.auth.api.b) ? g.NotLoggedIn : obj instanceof v ? g.NoSubscription : obj instanceof u ? g.Active : obj instanceof w ? g.Unknown : g.Unknown;
        a aVar3 = com.yandex.plus.pay.common.api.utils.a.a((Context) bVar.a.i) ? a.Store : a.TestService;
        b[] bVarArr = b.a;
        String str4 = (String) bVar2.c;
        String str5 = (String) bVar2.b;
        String str6 = str3;
        String str7 = (String) bVar2.a;
        String str8 = str2;
        String str9 = l;
        String str10 = str8 == null ? "no_value" : str8;
        String str11 = str9 == null ? "no_value" : str9;
        String str12 = str6 == null ? "no_value" : str6;
        format.getClass();
        String str13 = a == null ? "no_value" : a;
        String str14 = Build.VERSION.RELEASE;
        str14.getClass();
        language.getClass();
        String name = ((com.yandex.plus.core.strings.a) bVar2.g).name();
        str4.getClass();
        str5.getClass();
        str7.getClass();
        name.getClass();
        hashMap.putAll(uah.e(new Pair("client_app_package", str4), new Pair("client_app_version", str5), new Pair("service", str7), new Pair("sdk_version", "110.0.0"), new Pair("testids", str10), new Pair("puid", str11), new Pair("log_session_id", uuid), new Pair("triggered_testids", str12), new Pair("device_screen_size", format), new Pair(CommonUrlParts.DEVICE_TYPE, cVar.a), new Pair("device_id", str13), new Pair(CommonUrlParts.OS_VERSION, str14), new Pair("device_language", language), new Pair("device_region", "no_value"), new Pair("brand", name), new Pair("subscription_status", gVar.a), new Pair("build_origin", aVar3.a), new Pair("build_type", "release")));
        hashMap.putAll(((f) this.c.a.getValue()).a);
        com.yandex.plus.acquisition.sdk.pay.impl.b bVar4 = this.a.a;
        com.yandex.plus.acquisition.sdk.pay.impl.internal.b bVar5 = (com.yandex.plus.acquisition.sdk.pay.impl.internal.b) bVar4.d.getValue();
        StringBuilder u = ouj.u("event: ", str, ", parameters: ");
        u.append(CollectionsKt.X(hashMap.entrySet(), null, null, null, null, 63));
        u.append(')');
        String sb = u.toString();
        bVar5.getClass();
        bVar5.a.g(com.yandex.plus.pay.api.log.b.a, sb, null);
        for (com.yandex.plus.core.analytics.i iVar3 : ((com.yandex.plus.acquisition.sdk.pay.impl.internal.b) bVar4.d.getValue()).b) {
            iVar3.reportEvent(str, hashMap);
            iVar3.reportDiagnosticEvent(str, hashMap);
        }
    }
}
