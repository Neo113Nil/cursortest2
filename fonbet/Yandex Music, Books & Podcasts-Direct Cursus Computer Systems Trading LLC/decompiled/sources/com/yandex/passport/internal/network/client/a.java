package com.yandex.passport.internal.network.client;

import defpackage.ezc;
import defpackage.l3o;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final /* synthetic */ class a extends ezc implements Function1 {
    public static final a a = new a(1, com.yandex.passport.internal.network.a.class, "parseTrackWithUidResponse", "parseTrackWithUidResponse(Lokhttp3/Response;)Ljava/lang/String;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        l3o l3oVar = (l3o) obj;
        l3oVar.getClass();
        JSONObject b = com.yandex.passport.internal.network.a.b(l3oVar);
        com.yandex.passport.internal.network.a.h(b);
        return b.getString("track_id");
    }
}
