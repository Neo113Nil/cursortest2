package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class vw8 implements gip, py7 {
    public final t6f a;

    public vw8(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v1, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v5, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v8, types: [szb] */
    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        ox8 ox8Var = vct.b;
        kzj kzjVar = kzj.F;
        lc8 lc8Var = xw8.e;
        ozb ozbVar = xw8.a;
        ?? e = e5f.e(t7kVar, jSONObject, "disappear_duration", ox8Var, kzjVar, lc8Var, ozbVar);
        ozb ozbVar2 = e == 0 ? ozbVar : e;
        t6f t6fVar = this.a;
        zw8 zw8Var = (zw8) etn.U(t7kVar, jSONObject, "download_callbacks", t6fVar.b3);
        ox8 ox8Var2 = vct.a;
        kzj kzjVar2 = kzj.B;
        ozb ozbVar3 = xw8.b;
        ns9 ns9Var = bcx.h;
        ?? e2 = e5f.e(t7kVar, jSONObject, "is_enabled", ox8Var2, kzjVar2, ns9Var, ozbVar3);
        ozb ozbVar4 = e2 == 0 ? ozbVar3 : e2;
        szb b = e5f.b(t7kVar, jSONObject, "log_id", vct.c, bcx.i, ns9Var);
        uw8 uw8Var = xw8.f;
        ozb ozbVar5 = xw8.c;
        ?? e3 = e5f.e(t7kVar, jSONObject, "log_limit", ox8Var, kzjVar, uw8Var, ozbVar5);
        ozb ozbVar6 = e3 == 0 ? ozbVar5 : e3;
        Object opt = jSONObject.opt("payload");
        Object obj = JSONObject.NULL;
        if (opt == obj) {
            opt = null;
        }
        if (opt == null) {
            opt = null;
        }
        JSONObject jSONObject2 = (JSONObject) opt;
        px8 px8Var = vct.e;
        kzj kzjVar3 = kzj.C;
        szb e4 = e5f.e(t7kVar, jSONObject, "referer", px8Var, kzjVar3, ns9Var, null);
        Object opt2 = jSONObject.opt("scope_id");
        if (opt2 == obj) {
            opt2 = null;
        }
        String str = (String) (opt2 != null ? opt2 : null);
        uk8 uk8Var = (uk8) etn.U(t7kVar, jSONObject, "typed", t6fVar.k1);
        szb e5 = e5f.e(t7kVar, jSONObject, "url", px8Var, kzjVar3, ns9Var, null);
        uw8 uw8Var2 = xw8.g;
        ozb ozbVar7 = xw8.d;
        ?? e6 = e5f.e(t7kVar, jSONObject, "visibility_percentage", ox8Var, kzjVar, uw8Var2, ozbVar7);
        return new tw8(uk8Var, zw8Var, ozbVar2, ozbVar4, b, ozbVar6, e4, e5, e6 == 0 ? ozbVar7 : e6, str, jSONObject2);
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, tw8 tw8Var) {
        JSONObject jSONObject = new JSONObject();
        e5f.g(t7kVar, jSONObject, "disappear_duration", tw8Var.a);
        zw8 zw8Var = tw8Var.b;
        t6f t6fVar = this.a;
        etn.m0(t7kVar, jSONObject, "download_callbacks", zw8Var, t6fVar.b3);
        e5f.g(t7kVar, jSONObject, "is_enabled", tw8Var.c);
        e5f.g(t7kVar, jSONObject, "log_id", tw8Var.d);
        e5f.g(t7kVar, jSONObject, "log_limit", tw8Var.e);
        etn.l0(t7kVar, jSONObject, "payload", tw8Var.f);
        szb szbVar = tw8Var.g;
        kzj kzjVar = kzj.H;
        e5f.h(t7kVar, jSONObject, "referer", szbVar, kzjVar);
        etn.l0(t7kVar, jSONObject, "scope_id", tw8Var.h);
        etn.m0(t7kVar, jSONObject, "typed", tw8Var.i, t6fVar.k1);
        e5f.h(t7kVar, jSONObject, "url", tw8Var.j, kzjVar);
        e5f.g(t7kVar, jSONObject, "visibility_percentage", tw8Var.k);
        return jSONObject;
    }
}
