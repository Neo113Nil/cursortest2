package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class sk9 implements gip, py7 {
    public final t6f a;

    public sk9(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [szb] */
    /* JADX WARN: Type inference failed for: r5v2, types: [szb] */
    /* JADX WARN: Type inference failed for: r5v4, types: [szb] */
    @Override // defpackage.py7
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final qk9 a(t7k t7kVar, JSONObject jSONObject) {
        ow8 ow8Var = (ow8) etn.U(t7kVar, jSONObject, "distance", this.a.V2);
        ox8 ox8Var = vct.b;
        kzj kzjVar = kzj.F;
        mb9 mb9Var = vk9.g;
        ozb ozbVar = vk9.a;
        szb e = e5f.e(t7kVar, jSONObject, "duration", ox8Var, kzjVar, mb9Var, ozbVar);
        if (e == null) {
            e = ozbVar;
        }
        tct tctVar = vk9.e;
        gd9 gd9Var = gd9.z0;
        ozb ozbVar2 = vk9.b;
        ns9 ns9Var = bcx.h;
        ?? e2 = e5f.e(t7kVar, jSONObject, "edge", tctVar, gd9Var, ns9Var, ozbVar2);
        ozb ozbVar3 = e2 == 0 ? ozbVar2 : e2;
        tct tctVar2 = vk9.f;
        qm8 qm8Var = qm8.v;
        ozb ozbVar4 = vk9.c;
        ?? e3 = e5f.e(t7kVar, jSONObject, "interpolator", tctVar2, qm8Var, ns9Var, ozbVar4);
        ozb ozbVar5 = e3 == 0 ? ozbVar4 : e3;
        mb9 mb9Var2 = vk9.h;
        ozb ozbVar6 = vk9.d;
        ?? e4 = e5f.e(t7kVar, jSONObject, "start_delay", ox8Var, kzjVar, mb9Var2, ozbVar6);
        return new qk9(ow8Var, e, ozbVar3, ozbVar5, e4 == 0 ? ozbVar6 : e4);
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, qk9 qk9Var) {
        JSONObject jSONObject = new JSONObject();
        etn.m0(t7kVar, jSONObject, "distance", qk9Var.a, this.a.V2);
        e5f.g(t7kVar, jSONObject, "duration", qk9Var.b);
        szb szbVar = qk9Var.c;
        if (szbVar != null) {
            Object b = szbVar.b();
            try {
                if (szbVar instanceof pzb) {
                    jSONObject.put("edge", b);
                } else {
                    jSONObject.put("edge", ((pk9) b).a);
                }
            } catch (JSONException e) {
                t7kVar.a().a(e);
            }
        }
        szb szbVar2 = qk9Var.d;
        if (szbVar2 != null) {
            Object b2 = szbVar2.b();
            try {
                if (szbVar2 instanceof pzb) {
                    jSONObject.put("interpolator", b2);
                } else {
                    jSONObject.put("interpolator", ((um8) b2).a);
                }
            } catch (JSONException e2) {
                t7kVar.a().a(e2);
            }
        }
        e5f.g(t7kVar, jSONObject, "start_delay", qk9Var.e);
        etn.l0(t7kVar, jSONObject, "type", "slide");
        return jSONObject;
    }
}
