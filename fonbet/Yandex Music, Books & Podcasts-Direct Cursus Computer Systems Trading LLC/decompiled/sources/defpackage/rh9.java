package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class rh9 implements gip, py7 {
    public final t6f a;

    public rh9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final qh9 a(t7k t7kVar, JSONObject jSONObject) {
        szb d = e5f.d(t7kVar, jSONObject, "background_color", vct.f, kzj.G);
        t6f t6fVar = this.a;
        jyr jyrVar = t6fVar.F3;
        jz8 jz8Var = (jz8) etn.U(t7kVar, jSONObject, "corner_radius", jyrVar);
        if (jz8Var == null) {
            jz8Var = uh9.a;
        }
        jz8 jz8Var2 = (jz8) etn.U(t7kVar, jSONObject, "item_height", jyrVar);
        if (jz8Var2 == null) {
            jz8Var2 = uh9.b;
        }
        jz8 jz8Var3 = (jz8) etn.U(t7kVar, jSONObject, "item_width", jyrVar);
        if (jz8Var3 == null) {
            jz8Var3 = uh9.c;
        }
        ln9 ln9Var = (ln9) etn.U(t7kVar, jSONObject, "stroke", t6fVar.a8);
        return new qh9(d, jz8Var, jz8Var2, jz8Var3, ln9Var);
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, qh9 qh9Var) {
        t6f t6fVar = this.a;
        jyr jyrVar = t6fVar.F3;
        JSONObject jSONObject = new JSONObject();
        szb szbVar = qh9Var.a;
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
        etn.m0(t7kVar, jSONObject, "corner_radius", qh9Var.b, jyrVar);
        etn.m0(t7kVar, jSONObject, "item_height", qh9Var.c, jyrVar);
        etn.m0(t7kVar, jSONObject, "item_width", qh9Var.d, jyrVar);
        etn.m0(t7kVar, jSONObject, "stroke", qh9Var.e, t6fVar.a8);
        etn.l0(t7kVar, jSONObject, "type", "rounded_rectangle");
        return jSONObject;
    }
}
