package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class dt9 implements gip, py7 {
    public final t6f a;

    public dt9(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [szb] */
    @Override // defpackage.py7
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final ct9 a(t7k t7kVar, JSONObject jSONObject) {
        ox8 ox8Var = vct.f;
        kzj kzjVar = kzj.G;
        ns9 ns9Var = bcx.h;
        szb b = e5f.b(t7kVar, jSONObject, "color", ox8Var, kzjVar, ns9Var);
        ox8 ox8Var2 = vct.d;
        kzj kzjVar2 = kzj.E;
        ns9 ns9Var2 = gt9.e;
        ozb ozbVar = gt9.a;
        ?? e = e5f.e(t7kVar, jSONObject, "density", ox8Var2, kzjVar2, ns9Var2, ozbVar);
        ozb ozbVar2 = e == 0 ? ozbVar : e;
        ox8 ox8Var3 = vct.a;
        kzj kzjVar3 = kzj.B;
        ozb ozbVar3 = gt9.b;
        szb e2 = e5f.e(t7kVar, jSONObject, "is_animated", ox8Var3, kzjVar3, ns9Var, ozbVar3);
        if (e2 == null) {
            e2 = ozbVar3;
        }
        ozb ozbVar4 = gt9.c;
        szb e3 = e5f.e(t7kVar, jSONObject, "is_enabled", ox8Var3, kzjVar3, ns9Var, ozbVar4);
        if (e3 == null) {
            e3 = ozbVar4;
        }
        jz8 jz8Var = (jz8) etn.U(t7kVar, jSONObject, "particle_size", this.a.F3);
        if (jz8Var == null) {
            jz8Var = gt9.d;
        }
        return new ct9(b, ozbVar2, e2, e3, jz8Var);
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, ct9 ct9Var) {
        JSONObject jSONObject = new JSONObject();
        szb szbVar = ct9Var.a;
        if (szbVar != null) {
            Object b = szbVar.b();
            try {
                if (szbVar instanceof pzb) {
                    jSONObject.put("color", b);
                } else {
                    jSONObject.put("color", c85.a(((Number) b).intValue()));
                }
            } catch (JSONException e) {
                t7kVar.a().a(e);
            }
        }
        e5f.g(t7kVar, jSONObject, "density", ct9Var.b);
        e5f.g(t7kVar, jSONObject, "is_animated", ct9Var.c);
        e5f.g(t7kVar, jSONObject, "is_enabled", ct9Var.d);
        etn.m0(t7kVar, jSONObject, "particle_size", ct9Var.e, this.a.F3);
        etn.l0(t7kVar, jSONObject, "type", "particles");
        return jSONObject;
    }
}
