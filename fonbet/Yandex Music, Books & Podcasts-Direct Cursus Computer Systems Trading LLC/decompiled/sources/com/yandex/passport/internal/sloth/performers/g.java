package com.yandex.passport.internal.sloth.performers;

import com.yandex.passport.internal.properties.x;
import com.yandex.passport.sloth.command.data.u;
import com.yandex.passport.sloth.command.t;
import com.yandex.passport.sloth.command.v;
import defpackage.irf;
import defpackage.l2b;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class g implements t {
    public final x a;

    public g(x xVar) {
        this.a = xVar;
    }

    @Override // com.yandex.passport.sloth.command.t
    public final Object q(com.yandex.passport.sloth.data.m mVar, Object obj, com.yandex.passport.sloth.command.f fVar) {
        com.yandex.passport.api.impl.b bVar;
        u uVar = (u) obj;
        x xVar = this.a;
        if (xVar == null) {
            return new l2b(v.b);
        }
        String str = uVar.a;
        if (str != null) {
            com.yandex.passport.api.impl.b bVar2 = com.yandex.passport.api.impl.b.c;
            if (str.endsWith("@yandex-team.ru")) {
                bVar = com.yandex.passport.api.impl.b.d;
                String str2 = new com.yandex.passport.internal.credentials.g(xVar).a(bVar).c;
                JSONObject jSONObject = new JSONObject();
                irf.G(jSONObject, "x_token_client_id", str2);
                return new l2b(new com.yandex.passport.sloth.command.b(jSONObject));
            }
        }
        bVar = com.yandex.passport.api.impl.b.c;
        String str22 = new com.yandex.passport.internal.credentials.g(xVar).a(bVar).c;
        JSONObject jSONObject2 = new JSONObject();
        irf.G(jSONObject2, "x_token_client_id", str22);
        return new l2b(new com.yandex.passport.sloth.command.b(jSONObject2));
    }
}
