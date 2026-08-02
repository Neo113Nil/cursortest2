package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class gq8 implements gip, py7 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v3, types: [szb] */
    /* JADX WARN: Type inference failed for: r3v1, types: [szb] */
    public static fq8 c(t7k t7kVar, JSONObject jSONObject) {
        ox8 ox8Var = vct.b;
        kzj kzjVar = kzj.F;
        lc8 lc8Var = jq8.e;
        ozb ozbVar = jq8.a;
        ?? e = e5f.e(t7kVar, jSONObject, "duration", ox8Var, kzjVar, lc8Var, ozbVar);
        ozb ozbVar2 = e == 0 ? ozbVar : e;
        tct tctVar = jq8.d;
        qm8 qm8Var = qm8.v;
        ozb ozbVar3 = jq8.b;
        ?? e2 = e5f.e(t7kVar, jSONObject, "interpolator", tctVar, qm8Var, bcx.h, ozbVar3);
        if (e2 != 0) {
            ozbVar3 = e2;
        }
        lc8 lc8Var2 = jq8.f;
        ozb ozbVar4 = jq8.c;
        ?? e3 = e5f.e(t7kVar, jSONObject, "start_delay", ox8Var, kzjVar, lc8Var2, ozbVar4);
        if (e3 != 0) {
            ozbVar4 = e3;
        }
        return new fq8(ozbVar2, ozbVar3, ozbVar4);
    }

    public static JSONObject d(t7k t7kVar, fq8 fq8Var) {
        JSONObject jSONObject = new JSONObject();
        e5f.g(t7kVar, jSONObject, "duration", fq8Var.a);
        szb szbVar = fq8Var.b;
        if (szbVar != null) {
            Object b = szbVar.b();
            try {
                if (szbVar instanceof pzb) {
                    jSONObject.put("interpolator", b);
                } else {
                    jSONObject.put("interpolator", ((um8) b).a);
                }
            } catch (JSONException e) {
                t7kVar.a().a(e);
            }
        }
        e5f.g(t7kVar, jSONObject, "start_delay", fq8Var.c);
        etn.l0(t7kVar, jSONObject, "type", "change_bounds");
        return jSONObject;
    }

    @Override // defpackage.py7
    public final /* bridge */ /* synthetic */ Object a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, jSONObject);
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return d(t7kVar, (fq8) obj);
    }
}
