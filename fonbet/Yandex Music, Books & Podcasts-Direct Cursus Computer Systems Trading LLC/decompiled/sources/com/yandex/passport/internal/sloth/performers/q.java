package com.yandex.passport.internal.sloth.performers;

import com.yandex.passport.internal.properties.x;
import com.yandex.passport.internal.report.ee;
import com.yandex.passport.internal.report.fe;
import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.ge;
import com.yandex.passport.internal.report.reporters.p1;
import com.yandex.passport.internal.report.ue;
import com.yandex.passport.sloth.command.t;
import defpackage.l2b;
import defpackage.z7o;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class q implements t {
    public final com.yandex.passport.internal.sloth.webauthn.e a;
    public final x b;
    public final p1 c;

    public q(com.yandex.passport.internal.sloth.webauthn.e eVar, x xVar, p1 p1Var) {
        eVar.getClass();
        xVar.getClass();
        p1Var.getClass();
        this.a = eVar;
        this.b = xVar;
        this.c = p1Var;
    }

    @Override // com.yandex.passport.sloth.command.t
    public final Object q(com.yandex.passport.sloth.data.m mVar, Object obj, com.yandex.passport.sloth.command.f fVar) {
        x xVar = this.b;
        boolean z = xVar.w;
        p1 p1Var = this.c;
        p1Var.getClass();
        p1Var.n(fe.d, new ff(9, z));
        if (!xVar.w) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("webAuthNAvailable", false);
            return new l2b(new com.yandex.passport.sloth.command.b(jSONObject));
        }
        Object c = this.a.c();
        Throwable a = z7o.a(c);
        if (a != null) {
            p1Var.n(ee.d, new ff(a), new ue(a));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("webAuthNAvailable", false);
            return new l2b(new com.yandex.passport.sloth.command.b(jSONObject2));
        }
        boolean booleanValue = ((Boolean) c).booleanValue();
        p1Var.n(ge.d, new com.yandex.passport.internal.report.f(24, booleanValue));
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("webAuthNAvailable", booleanValue);
        return new l2b(new com.yandex.passport.sloth.command.b(jSONObject3));
    }
}
