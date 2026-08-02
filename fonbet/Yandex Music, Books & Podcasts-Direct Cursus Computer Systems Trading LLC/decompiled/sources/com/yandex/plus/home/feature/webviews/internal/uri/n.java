package com.yandex.plus.home.feature.webviews.internal.uri;

import android.net.Uri;
import android.os.Build;
import defpackage.b6e;
import defpackage.btf;
import defpackage.cg6;
import defpackage.jyr;
import defpackage.ncu;
import defpackage.ps;
import defpackage.q5b;
import defpackage.tah;
import defpackage.uah;
import defpackage.uop;
import defpackage.v75;
import defpackage.vop;
import defpackage.x3f;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class n implements k {
    public final Uri a;
    public final com.yandex.plus.log.api.b b;
    public final com.yandex.plus.bdui.flex.ui.s c;
    public final jyr d;
    public final jyr e;
    public final jyr f;
    public final jyr g;
    public final jyr h;

    public n(final boolean z, final com.yandex.plus.home.repository.api.model.plusstate.a aVar, final String str, final Map map, final boolean z2, final String str2, final String str3, final String str4, final boolean z3, final Locale locale, final String str5, final String str6, final String str7, final String str8, final String str9, final com.yandex.plus.home.feature.webviews.internalapi.insets.a aVar2, final com.yandex.plus.home.feature.webviews.internalapi.payment.a aVar3, final com.yandex.plus.core.strings.a aVar4, final int i, Uri uri, com.yandex.plus.log.api.b bVar, com.yandex.plus.bdui.flex.ui.s sVar) {
        String str10 = Build.MANUFACTURER;
        String str11 = Build.MODEL;
        str.getClass();
        str2.getClass();
        str3.getClass();
        locale.getClass();
        str9.getClass();
        aVar3.getClass();
        aVar4.getClass();
        str10.getClass();
        str11.getClass();
        uri.getClass();
        bVar.getClass();
        this.a = uri;
        this.b = bVar;
        this.c = sVar;
        this.d = btf.b(new Function0() { // from class: com.yandex.plus.home.feature.webviews.internal.uri.l
            {
                String str12 = Build.MANUFACTURER;
                String str13 = Build.MODEL;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String str12;
                Pair pair;
                String str13;
                String str14 = Build.MANUFACTURER;
                String str15 = Build.MODEL;
                Pair pair2 = new Pair("client_app_version", vop.e(str2));
                String str16 = str3;
                Pair pair3 = new Pair("client_id", vop.e(str16));
                Pair pair4 = new Pair("service_name", vop.e(str16));
                Pair pair5 = new Pair("theme", uop.b(z3 ? "DARK" : "LIGHT"));
                Pair pair6 = new Pair("lang", vop.e(locale.getLanguage()));
                Pair pair7 = new Pair("plus_sdk_version", uop.b("110.0.0"));
                Pair pair8 = new Pair("device_manufacturer", vop.e(str14));
                Pair pair9 = new Pair("device_model", vop.e(str15));
                Pair pair10 = new Pair(CommonUrlParts.OS_VERSION, vop.e(String.valueOf(i)));
                Pair pair11 = new Pair("mm_device_id", vop.e(str5));
                Pair pair12 = new Pair("metrica_uuid", vop.e(str6));
                int ordinal = aVar4.ordinal();
                if (ordinal == 0) {
                    str12 = "yandex";
                } else {
                    if (ordinal != 1) {
                        b6e.s();
                        return null;
                    }
                    str12 = "yango";
                }
                Pair pair13 = new Pair("brand", uop.b(str12));
                Pair pair14 = new Pair("mode", uop.b("SDK"));
                Pair pair15 = new Pair("platform", uop.b("ANDROID"));
                Pair pair16 = new Pair("log_id", vop.e(str9));
                Pair pair17 = new Pair("plus_sdk_service_channel", vop.e(str4));
                Pair pair18 = new Pair("place", vop.e(str7));
                Pair pair19 = new Pair("host_purchase_available", vop.e(String.valueOf(false)));
                Pair pair20 = new Pair("source", vop.e(str8));
                q5b q5bVar = q5b.a;
                Pair pair21 = new Pair("coordinates_lat", q5bVar);
                Pair pair22 = new Pair("coordinates_lon", q5bVar);
                Pair pair23 = new Pair("coordinates_acc", q5bVar);
                Pair pair24 = new Pair("geo_pin_position_lat", q5bVar);
                Pair pair25 = new Pair("geo_pin_position_lon", q5bVar);
                Pair pair26 = new Pair("geo_pin_position_acc", q5bVar);
                Pair pair27 = new Pair("geo_zone_name", q5bVar);
                com.yandex.plus.home.feature.webviews.internalapi.payment.a aVar5 = aVar3;
                Pair pair28 = new Pair("plus_sdk_is_native_payment_available", vop.e(String.valueOf(aVar5.b)));
                Pair pair29 = new Pair("plus_sdk_inapp_country_code", vop.e(aVar5.a));
                Map map2 = map;
                if (map2 != null) {
                    pair = pair29;
                    str13 = x3f.d.c(com.yandex.plus.core.serialization.kotlin.kserializer.a.a, map2);
                } else {
                    pair = pair29;
                    str13 = null;
                }
                Pair pair30 = new Pair("service_payload", vop.e(str13));
                com.yandex.plus.home.feature.webviews.internalapi.insets.a aVar6 = aVar2;
                return uah.e(pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, pair15, pair16, pair17, pair18, pair19, pair20, pair21, pair22, pair23, pair24, pair25, pair26, pair27, pair28, pair, pair30, new Pair("sal", vop.e(String.valueOf(aVar6.a))), new Pair("sat", vop.e(String.valueOf(aVar6.b))), new Pair("sar", vop.e(String.valueOf(aVar6.c))), new Pair("sab", vop.e(String.valueOf(aVar6.d))));
            }
        });
        this.e = btf.b(new Function0() { // from class: com.yandex.plus.home.feature.webviews.internal.uri.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Map map2 = (Map) n.this.d.getValue();
                String str12 = z ? "COOKIE_INJECT" : null;
                boolean z4 = z2;
                Pair pair = new Pair("available_features", vop.f("BROADCASTING", "UPD_TARGETS", "SMART_WEBVIEW", "SERVICE_INFORMATION", "MINI_STORIES", str12, "CARD_OVER_BRIDGE", "CARD_OVER_BRIDGE", "PAY_BUTTON_CONFIG", "ANDROID_SELL_IN_STORY", "NATIVE_PURCHASE", "INAPP_PURCHASE", "HOST_PURCHASE", "PURCHASE_TARIFFICATOR", z4 ? "BANK" : null, z4 ? "WALLET" : null, "BACKGROUND_FOREGROUND_MESSAGES", "OVERLAP_MESSAGES", "NATIVE_VIBRATE"));
                com.yandex.plus.home.repository.api.model.plusstate.a aVar5 = aVar;
                return uah.i(map2, uah.e(pair, new Pair("loyalty[0].currency", vop.e(aVar5 != null ? aVar5.b : null)), new Pair("loyalty[0].amount", vop.e(aVar5 != null ? Double.valueOf(aVar5.a).toString() : null)), new Pair("from", vop.e(str))));
            }
        });
        this.f = btf.b(new ncu(1, this, z, z2));
        this.g = btf.b(new ps(this, z, 15));
        this.h = btf.b(new com.yandex.plus.bdui.flex.factory.p(13, str2, str3, aVar3));
    }

    public static LinkedHashMap e(Uri uri) {
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        queryParameterNames.getClass();
        Set<String> set = queryParameterNames;
        int a = tah.a(v75.o(set, 10));
        if (a < 16) {
            a = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a);
        for (Object obj : set) {
            List<String> queryParameters = uri.getQueryParameters((String) obj);
            queryParameters.getClass();
            linkedHashMap.put(obj, CollectionsKt.A0(queryParameters));
        }
        return linkedHashMap;
    }

    public static void f(Uri.Builder builder, LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (!((Set) entry.getValue()).isEmpty()) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            String str = (String) entry2.getKey();
            Set set = (Set) entry2.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : set) {
                String str2 = (String) obj;
                if (str2.length() != 0 && !str2.equalsIgnoreCase("null")) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                builder.appendQueryParameter(str, (String) it.next());
            }
        }
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.uri.k
    public final Object a(f fVar, Continuation continuation) {
        Map e = uah.e(new Pair(Constants.KEY_MESSAGE, vop.e(fVar.l)), new Pair("deeplink", vop.e(this.c.A(fVar).toString())));
        Uri uri = fVar.a;
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        clearQuery.getClass();
        f(clearQuery, uah.i(uah.i(e(uri), (Map) this.f.getValue()), e));
        Uri build = clearQuery.build();
        build.getClass();
        f fVar2 = new f(build, fVar.b, fVar.c, fVar.d, fVar.e, fVar.f, fVar.g, fVar.h, fVar.i, fVar.j, fVar.k, fVar.l);
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
        com.yandex.plus.log.api.b bVar = this.b;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "DeeplinkCustomizerImpl", fVar + " -> " + fVar2);
        }
        return fVar2;
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.uri.k
    public final Object b(e eVar, cg6 cg6Var) {
        Uri.Builder clearQuery = eVar.a.buildUpon().clearQuery();
        clearQuery.getClass();
        f(clearQuery, uah.i(e(eVar.a), (Map) this.h.getValue()));
        Uri build = clearQuery.build();
        build.getClass();
        e eVar2 = new e(build, eVar.b, eVar.c, eVar.d, eVar.e, eVar.f, eVar.g, eVar.h);
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
        com.yandex.plus.log.api.b bVar = this.b;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "DeeplinkCustomizerImpl", eVar + " -> " + eVar2);
        }
        return eVar2;
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.uri.k
    public final Object c(g gVar, cg6 cg6Var) {
        Map e = uah.e(new Pair(Constants.KEY_MESSAGE, vop.e(gVar.c)), new Pair("deeplink", vop.e(this.c.A(gVar).toString())));
        Uri uri = gVar.a;
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        clearQuery.getClass();
        f(clearQuery, uah.i(uah.i(e(uri), (Map) this.g.getValue()), e));
        Uri build = clearQuery.fragment(uri.getFragment()).build();
        build.getClass();
        g gVar2 = new g(build, gVar.b, gVar.c);
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
        com.yandex.plus.log.api.b bVar = this.b;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "DeeplinkCustomizerImpl", gVar + " -> " + gVar2);
        }
        return gVar2;
    }

    @Override // com.yandex.plus.home.feature.webviews.internal.uri.k
    public final Object d(b bVar, Continuation continuation) {
        Pair pair = new Pair(Constants.KEY_MESSAGE, vop.e(bVar.c));
        Pair pair2 = new Pair("deeplink", vop.e(this.c.A(bVar).toString()));
        boolean z = bVar.b;
        Map e = uah.e(pair, pair2, new Pair("buyAfterAuth", vop.e(String.valueOf(z))));
        Uri uri = this.a;
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        clearQuery.getClass();
        Uri uri2 = bVar.a;
        f(clearQuery, uah.i(uah.i(uah.i(e(uri2), e(uri)), (Map) this.e.getValue()), e));
        Uri build = clearQuery.fragment(uri2.getFragment()).build();
        build.getClass();
        b bVar2 = new b(build, z, bVar.c);
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
        com.yandex.plus.log.api.b bVar3 = this.b;
        if (bVar3.b(aVar)) {
            bVar3.c(aVar, "DeeplinkCustomizerImpl", bVar + " -> " + bVar2);
        }
        return bVar2;
    }
}
