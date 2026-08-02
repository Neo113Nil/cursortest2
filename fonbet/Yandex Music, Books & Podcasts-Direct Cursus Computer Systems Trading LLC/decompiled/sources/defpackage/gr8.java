package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class gr8 implements gip, py7 {
    public final t6f a;

    public gr8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final fr8 a(t7k t7kVar, JSONObject jSONObject) {
        return new fr8(e5f.b(t7kVar, jSONObject, "color", vct.f, kzj.G, bcx.h), e5f.b(t7kVar, jSONObject, "corner_radius", vct.b, kzj.F, sj2.h), (ix8) etn.U(t7kVar, jSONObject, "paddings", this.a.h3));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, fr8 fr8Var) {
        JSONObject jSONObject = new JSONObject();
        szb szbVar = fr8Var.a;
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
        e5f.g(t7kVar, jSONObject, "corner_radius", fr8Var.b);
        etn.m0(t7kVar, jSONObject, "paddings", fr8Var.c, this.a.h3);
        etn.l0(t7kVar, jSONObject, "type", "cloud");
        return jSONObject;
    }
}
