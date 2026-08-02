package com.yandex.passport.internal.network.client;

import defpackage.ezc;
import defpackage.l3o;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final /* synthetic */ class f extends ezc implements Function1 {
    public static final f a = new f(1, com.yandex.passport.internal.network.a.class, "parseUpdatePersonProfileResponse", "parseUpdatePersonProfileResponse(Lokhttp3/Response;)V", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        l3o l3oVar = (l3o) obj;
        l3oVar.getClass();
        JSONObject b = com.yandex.passport.internal.network.a.b(l3oVar);
        String d = com.yandex.passport.internal.network.a.d(b);
        if (d != null) {
            com.yandex.passport.internal.network.a.i(d);
            throw new com.yandex.passport.data.exceptions.h(d);
        }
        String string = b.getString("status");
        if (string.equals("ok")) {
            return Unit.a;
        }
        throw new com.yandex.passport.data.exceptions.h(string);
    }
}
