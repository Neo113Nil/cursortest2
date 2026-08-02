package defpackage;

import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class gg9 implements gip, py7 {
    public final t6f a;

    public gg9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final of9 a(t7k t7kVar, JSONObject jSONObject) {
        t6f t6fVar = this.a;
        jyr jyrVar = t6fVar.o6;
        rf9 rf9Var = (rf9) etn.U(t7kVar, jSONObject, "center_x", jyrVar);
        if (rf9Var == null) {
            rf9Var = jg9.a;
        }
        rf9 rf9Var2 = (rf9) etn.U(t7kVar, jSONObject, "center_y", jyrVar);
        if (rf9Var2 == null) {
            rf9Var2 = jg9.b;
        }
        List Z = etn.Z(t7kVar, jSONObject, "color_map", t6fVar.G6, jg9.e);
        vzb f = e5f.f(t7kVar, jSONObject, "colors", vct.f, jg9.d);
        mg9 mg9Var = (mg9) etn.U(t7kVar, jSONObject, "radius", t6fVar.u6);
        if (mg9Var == null) {
            mg9Var = jg9.c;
        }
        return new of9(rf9Var, rf9Var2, Z, f, mg9Var);
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, of9 of9Var) {
        JSONObject jSONObject = new JSONObject();
        rf9 rf9Var = of9Var.a;
        t6f t6fVar = this.a;
        jyr jyrVar = t6fVar.o6;
        etn.m0(t7kVar, jSONObject, "center_x", rf9Var, jyrVar);
        etn.m0(t7kVar, jSONObject, "center_y", of9Var.b, jyrVar);
        etn.n0(t7kVar, jSONObject, "color_map", of9Var.c, t6fVar.G6);
        e5f.i(t7kVar, jSONObject, of9Var.d);
        etn.m0(t7kVar, jSONObject, "radius", of9Var.e, t6fVar.u6);
        etn.l0(t7kVar, jSONObject, "type", "radial_gradient");
        return jSONObject;
    }
}
