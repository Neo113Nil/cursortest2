package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class qj9 implements gip, py7 {
    public final t6f a;

    public qj9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        String b0 = etn.b0(jSONObject);
        boolean equals = b0.equals("rounded_rectangle");
        t6f t6fVar = this.a;
        if (equals) {
            return new jj9(((rh9) t6fVar.M6.getValue()).a(t7kVar, jSONObject));
        }
        if (b0.equals("circle")) {
            return new ij9(((ar8) t6fVar.g2.getValue()).a(t7kVar, jSONObject));
        }
        d7f t = t7kVar.b().t(b0, jSONObject);
        vj9 vj9Var = t instanceof vj9 ? (vj9) t : null;
        if (vj9Var != null) {
            return ((sj9) t6fVar.m7.getValue()).a(t7kVar, vj9Var, jSONObject);
        }
        throw a8k.l(jSONObject, "type", b0);
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, kj9 kj9Var) {
        boolean z = kj9Var instanceof jj9;
        t6f t6fVar = this.a;
        if (z) {
            return ((rh9) t6fVar.M6.getValue()).b(t7kVar, ((jj9) kj9Var).b);
        }
        if (kj9Var instanceof ij9) {
            return ((ar8) t6fVar.g2.getValue()).b(t7kVar, ((ij9) kj9Var).b);
        }
        b6e.s();
        return null;
    }
}
