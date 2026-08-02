package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class fx8 implements gip, py7 {
    public final t6f a;

    public fx8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        String b0 = etn.b0(jSONObject);
        d7f d7fVar = t7kVar.b().get(b0);
        hx8 hx8Var = d7fVar instanceof hx8 ? (hx8) d7fVar : null;
        if (hx8Var != null) {
            b0 = "shape_drawable";
        }
        if (b0.equals("shape_drawable")) {
            return new hx8(((nj9) this.a.i7.getValue()).c(t7kVar, hx8Var != null ? hx8Var.a : null, jSONObject));
        }
        throw a8k.l(jSONObject, "type", b0);
    }

    @Override // defpackage.gip
    public final JSONObject b(t7k t7kVar, Object obj) {
        hx8 hx8Var = (hx8) obj;
        if (hx8Var != null) {
            return ((nj9) this.a.i7.getValue()).b(t7kVar, hx8Var.a);
        }
        b6e.s();
        return null;
    }
}
