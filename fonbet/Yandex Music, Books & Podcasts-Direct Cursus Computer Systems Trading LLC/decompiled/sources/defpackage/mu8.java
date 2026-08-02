package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class mu8 implements gip, py7 {
    public final t6f a;

    public mu8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        String b0 = etn.b0(jSONObject);
        boolean equals = b0.equals("infinity");
        t6f t6fVar = this.a;
        if (equals) {
            ((c49) t6fVar.s4.getValue()).getClass();
            return new ku8(new b49());
        }
        if (b0.equals("fixed")) {
            ((uy8) t6fVar.w3.getValue()).getClass();
            return new ju8(uy8.c(t7kVar, jSONObject));
        }
        d7f t = t7kVar.b().t(b0, jSONObject);
        ru8 ru8Var = t instanceof ru8 ? (ru8) t : null;
        if (ru8Var != null) {
            return ((ou8) t6fVar.G2.getValue()).a(t7kVar, ru8Var, jSONObject);
        }
        throw a8k.l(jSONObject, "type", b0);
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, lu8 lu8Var) {
        boolean z = lu8Var instanceof ku8;
        t6f t6fVar = this.a;
        if (z) {
            ((c49) t6fVar.s4.getValue()).getClass();
            JSONObject jSONObject = new JSONObject();
            etn.l0(t7kVar, jSONObject, "type", "infinity");
            return jSONObject;
        }
        if (!(lu8Var instanceof ju8)) {
            b6e.s();
            return null;
        }
        uy8 uy8Var = (uy8) t6fVar.w3.getValue();
        ty8 ty8Var = ((ju8) lu8Var).b;
        uy8Var.getClass();
        return uy8.d(t7kVar, ty8Var);
    }
}
