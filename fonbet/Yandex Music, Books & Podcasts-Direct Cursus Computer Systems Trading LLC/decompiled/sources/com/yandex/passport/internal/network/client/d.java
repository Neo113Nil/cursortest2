package com.yandex.passport.internal.network.client;

import defpackage.ezc;
import defpackage.hrg;
import defpackage.l3o;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final /* synthetic */ class d extends ezc implements Function1 {
    public static final d a = new d(1, com.yandex.passport.internal.network.a.class, "parseMasterTokenByMailishAuthResponse", "parseMasterTokenByMailishAuthResponse(Lokhttp3/Response;)Lcom/yandex/passport/common/account/MasterToken;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        l3o l3oVar = (l3o) obj;
        l3oVar.getClass();
        JSONObject b = com.yandex.passport.internal.network.a.b(l3oVar);
        JSONObject jSONObject = b.getJSONObject("status");
        if (jSONObject.getInt("status") != 1) {
            throw new com.yandex.passport.data.exceptions.h(hrg.l(' ', jSONObject.getString("phrase"), jSONObject.getString("trace")));
        }
        String string = b.getString("xtoken");
        if (string == null || string.length() <= 0 || string.equals("-")) {
            string = null;
        }
        return new com.yandex.passport.common.account.a(string);
    }
}
