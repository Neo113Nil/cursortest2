package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ex8 implements gip, py7 {
    public final t6f a;

    public ex8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        String b0 = etn.b0(jSONObject);
        boolean equals = b0.equals("shape_drawable");
        t6f t6fVar = this.a;
        if (equals) {
            return new dx8(((mj9) t6fVar.h7.getValue()).a(t7kVar, jSONObject));
        }
        d7f t = t7kVar.b().t(b0, jSONObject);
        hx8 hx8Var = t instanceof hx8 ? (hx8) t : null;
        if (hx8Var != null) {
            return ((gx8) t6fVar.g3.getValue()).a(t7kVar, hx8Var, jSONObject);
        }
        throw a8k.l(jSONObject, "type", b0);
    }

    @Override // defpackage.gip
    public final JSONObject b(t7k t7kVar, Object obj) {
        dx8 dx8Var = (dx8) obj;
        if (dx8Var != null) {
            return ((mj9) this.a.h7.getValue()).b(t7kVar, dx8Var.b);
        }
        b6e.s();
        return null;
    }
}
