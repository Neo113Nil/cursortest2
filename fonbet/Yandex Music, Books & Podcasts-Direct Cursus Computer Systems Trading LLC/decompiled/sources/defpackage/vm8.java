package defpackage;

import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class vm8 implements gip, py7 {
    public final t6f a;

    public vm8(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v12, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v4, types: [szb] */
    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        ox8 ox8Var = vct.b;
        kzj kzjVar = kzj.F;
        lc8 lc8Var = xm8.g;
        ozb ozbVar = xm8.a;
        ?? e = e5f.e(t7kVar, jSONObject, "duration", ox8Var, kzjVar, lc8Var, ozbVar);
        ozb ozbVar2 = e == 0 ? ozbVar : e;
        ox8 ox8Var2 = vct.d;
        kzj kzjVar2 = kzj.E;
        ns9 ns9Var = bcx.h;
        szb e2 = e5f.e(t7kVar, jSONObject, "end_value", ox8Var2, kzjVar2, ns9Var, null);
        tct tctVar = xm8.e;
        qm8 qm8Var = qm8.v;
        ozb ozbVar3 = xm8.b;
        ?? e3 = e5f.e(t7kVar, jSONObject, "interpolator", tctVar, qm8Var, ns9Var, ozbVar3);
        ozb ozbVar4 = e3 == 0 ? ozbVar3 : e3;
        t6f t6fVar = this.a;
        List Y = etn.Y(t7kVar, jSONObject, "items", t6fVar.z1);
        szb b = e5f.b(t7kVar, jSONObject, "name", xm8.f, va8.B0, ns9Var);
        lu8 lu8Var = (lu8) etn.U(t7kVar, jSONObject, "repeat", t6fVar.E2);
        if (lu8Var == null) {
            lu8Var = xm8.c;
        }
        lu8 lu8Var2 = lu8Var;
        lc8 lc8Var2 = xm8.h;
        ozb ozbVar5 = xm8.d;
        ?? e4 = e5f.e(t7kVar, jSONObject, "start_delay", ox8Var, kzjVar, lc8Var2, ozbVar5);
        return new sm8(ozbVar2, e2, ozbVar4, Y, b, lu8Var2, e4 == 0 ? ozbVar5 : e4, e5f.e(t7kVar, jSONObject, "start_value", ox8Var2, kzjVar2, ns9Var, null));
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, sm8 sm8Var) {
        JSONObject jSONObject = new JSONObject();
        e5f.g(t7kVar, jSONObject, "duration", sm8Var.a);
        e5f.g(t7kVar, jSONObject, "end_value", sm8Var.b);
        szb szbVar = sm8Var.c;
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
        List list = sm8Var.d;
        t6f t6fVar = this.a;
        etn.n0(t7kVar, jSONObject, "items", list, t6fVar.z1);
        szb szbVar2 = sm8Var.e;
        if (szbVar2 != null) {
            Object b2 = szbVar2.b();
            try {
                if (szbVar2 instanceof pzb) {
                    jSONObject.put("name", b2);
                } else {
                    jSONObject.put("name", ((rm8) b2).a);
                }
            } catch (JSONException e2) {
                t7kVar.a().a(e2);
            }
        }
        etn.m0(t7kVar, jSONObject, "repeat", sm8Var.f, t6fVar.E2);
        e5f.g(t7kVar, jSONObject, "start_delay", sm8Var.g);
        e5f.g(t7kVar, jSONObject, "start_value", sm8Var.h);
        return jSONObject;
    }
}
