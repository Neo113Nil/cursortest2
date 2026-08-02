package com.yandex.plus.home.analytics.evgen;

import com.yandex.plus.bdui.plus.checkout.content.controller.w;
import defpackage.rnb;
import defpackage.tb;
import defpackage.uah;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes5.dex */
public final class a {
    public final String a;
    public final String b;
    public final com.yandex.plus.home.graphql.configuration.a c;
    public final w d;
    public final w e;
    public final c f;
    public final c g;
    public final c h;
    public final com.yandex.plus.home.internal.di.a i;

    public a(String str, String str2, com.yandex.plus.home.graphql.configuration.a aVar, w wVar, w wVar2, c cVar, c cVar2, c cVar3, com.yandex.plus.home.internal.di.a aVar2) {
        this.a = str;
        this.b = str2;
        this.c = aVar;
        this.d = wVar;
        this.e = wVar2;
        this.f = cVar;
        this.g = cVar2;
        this.h = cVar3;
        this.i = aVar2;
    }

    public final tb a() {
        String str = (String) this.c.invoke();
        String str2 = (String) this.d.invoke();
        String str3 = (String) this.e.invoke();
        String str4 = (String) this.f.invoke();
        rnb rnbVar = (rnb) this.g.invoke();
        double doubleValue = ((Number) this.h.invoke()).doubleValue();
        Map map = (Map) this.i.invoke();
        str2.getClass();
        str4.getClass();
        str.getClass();
        str3.getClass();
        rnbVar.getClass();
        map.getClass();
        tb tbVar = new tb();
        tbVar.a = uah.e(new Pair("client_app_package", this.a), new Pair("client_app_version", this.b), new Pair("service", "music"), new Pair("sdk_version", "110.0.0"), new Pair("testids", str2), new Pair("puid", str4), new Pair("log_session_id", str), new Pair("triggered_testids", str3), new Pair("client_id", "music"), new Pair("plus_sdk_version", "110.0.0"), new Pair("plus_sdk_type", "web"), new Pair("plus_state", rnbVar.a), new Pair("balance", Double.valueOf(doubleValue)), new Pair("add_params", map));
        return tbVar;
    }
}
