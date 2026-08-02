package defpackage;

import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class kg8 implements gip, py7 {
    public final t6f a;

    public kg8(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [szb] */
    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        t6f t6fVar = this.a;
        zw8 zw8Var = (zw8) etn.U(t7kVar, jSONObject, "download_callbacks", t6fVar.b3);
        ox8 ox8Var = vct.a;
        kzj kzjVar = kzj.B;
        ozb ozbVar = ng8.a;
        ns9 ns9Var = bcx.h;
        ?? e = e5f.e(t7kVar, jSONObject, "is_enabled", ox8Var, kzjVar, ns9Var, ozbVar);
        ozb ozbVar2 = e == 0 ? ozbVar : e;
        szb b = e5f.b(t7kVar, jSONObject, "log_id", vct.c, bcx.i, ns9Var);
        px8 px8Var = vct.e;
        kzj kzjVar2 = kzj.C;
        szb e2 = e5f.e(t7kVar, jSONObject, "log_url", px8Var, kzjVar2, ns9Var, null);
        List Y = etn.Y(t7kVar, jSONObject, "menu_items", t6fVar.w1);
        Object opt = jSONObject.opt("payload");
        Object obj = JSONObject.NULL;
        if (opt == obj) {
            opt = null;
        }
        if (opt == null) {
            opt = null;
        }
        JSONObject jSONObject2 = (JSONObject) opt;
        szb e3 = e5f.e(t7kVar, jSONObject, "referer", px8Var, kzjVar2, ns9Var, null);
        Object opt2 = jSONObject.opt("scope_id");
        if (opt2 == obj) {
            opt2 = null;
        }
        return new bd8(zw8Var, ozbVar2, b, e2, Y, jSONObject2, e3, (String) (opt2 != null ? opt2 : null), e5f.e(t7kVar, jSONObject, "target", ng8.b, va8.x, ns9Var, null), (uk8) etn.U(t7kVar, jSONObject, "typed", t6fVar.k1), e5f.e(t7kVar, jSONObject, "url", px8Var, kzjVar2, ns9Var, null));
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, bd8 bd8Var) {
        JSONObject jSONObject = new JSONObject();
        zw8 zw8Var = bd8Var.a;
        t6f t6fVar = this.a;
        etn.m0(t7kVar, jSONObject, "download_callbacks", zw8Var, t6fVar.b3);
        e5f.g(t7kVar, jSONObject, "is_enabled", bd8Var.b);
        e5f.g(t7kVar, jSONObject, "log_id", bd8Var.c);
        szb szbVar = bd8Var.d;
        kzj kzjVar = kzj.H;
        e5f.h(t7kVar, jSONObject, "log_url", szbVar, kzjVar);
        etn.n0(t7kVar, jSONObject, "menu_items", bd8Var.e, t6fVar.w1);
        etn.l0(t7kVar, jSONObject, "payload", bd8Var.f);
        e5f.h(t7kVar, jSONObject, "referer", bd8Var.g, kzjVar);
        etn.l0(t7kVar, jSONObject, "scope_id", bd8Var.h);
        szb szbVar2 = bd8Var.i;
        if (szbVar2 != null) {
            Object b = szbVar2.b();
            try {
                if (szbVar2 instanceof pzb) {
                    jSONObject.put("target", b);
                } else {
                    jSONObject.put("target", ((ad8) b).a);
                }
            } catch (JSONException e) {
                t7kVar.a().a(e);
            }
        }
        etn.m0(t7kVar, jSONObject, "typed", bd8Var.j, t6fVar.k1);
        e5f.h(t7kVar, jSONObject, "url", bd8Var.k, kzjVar);
        return jSONObject;
    }
}
