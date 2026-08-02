package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ar8 implements gip, py7 {
    public final t6f a;

    public ar8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final zq8 a(t7k t7kVar, JSONObject jSONObject) {
        szb d = e5f.d(t7kVar, jSONObject, "background_color", vct.f, kzj.G);
        t6f t6fVar = this.a;
        jz8 jz8Var = (jz8) etn.U(t7kVar, jSONObject, "radius", t6fVar.F3);
        if (jz8Var == null) {
            jz8Var = dr8.a;
        }
        return new zq8(d, jz8Var, (ln9) etn.U(t7kVar, jSONObject, "stroke", t6fVar.a8));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, zq8 zq8Var) {
        JSONObject jSONObject = new JSONObject();
        szb szbVar = zq8Var.a;
        if (szbVar != null) {
            Object b = szbVar.b();
            try {
                if (szbVar instanceof pzb) {
                    jSONObject.put("background_color", b);
                } else {
                    jSONObject.put("background_color", c85.a(((Number) b).intValue()));
                }
            } catch (JSONException e) {
                t7kVar.a().a(e);
            }
        }
        jz8 jz8Var = zq8Var.b;
        t6f t6fVar = this.a;
        etn.m0(t7kVar, jSONObject, "radius", jz8Var, t6fVar.F3);
        etn.m0(t7kVar, jSONObject, "stroke", zq8Var.c, t6fVar.a8);
        etn.l0(t7kVar, jSONObject, "type", "circle");
        return jSONObject;
    }
}
