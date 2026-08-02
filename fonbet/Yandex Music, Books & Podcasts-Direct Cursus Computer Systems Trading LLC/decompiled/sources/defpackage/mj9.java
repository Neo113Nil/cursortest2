package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class mj9 implements gip, py7 {
    public final t6f a;

    public mj9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final lj9 a(t7k t7kVar, JSONObject jSONObject) {
        szb b = e5f.b(t7kVar, jSONObject, "color", vct.f, kzj.G, bcx.h);
        t6f t6fVar = this.a;
        return new lj9(b, (kj9) etn.O(t7kVar, jSONObject, "shape", t6fVar.k7), (ln9) etn.U(t7kVar, jSONObject, "stroke", t6fVar.a8));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, lj9 lj9Var) {
        JSONObject jSONObject = new JSONObject();
        szb szbVar = lj9Var.a;
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
        kj9 kj9Var = lj9Var.b;
        t6f t6fVar = this.a;
        etn.m0(t7kVar, jSONObject, "shape", kj9Var, t6fVar.k7);
        etn.m0(t7kVar, jSONObject, "stroke", lj9Var.c, t6fVar.a8);
        etn.l0(t7kVar, jSONObject, "type", "shape_drawable");
        return jSONObject;
    }
}
