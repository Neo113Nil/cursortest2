package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class w69 implements gip, py7 {
    public final t6f a;

    public w69(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        String b0 = etn.b0(jSONObject);
        boolean equals = b0.equals("regex");
        t6f t6fVar = this.a;
        if (equals) {
            ((a79) t6fVar.M4.getValue()).getClass();
            return new j69(a79.c(t7kVar, jSONObject));
        }
        if (b0.equals("expression")) {
            ((r69) t6fVar.J4.getValue()).getClass();
            return new i69(r69.c(t7kVar, jSONObject));
        }
        d7f t = t7kVar.b().t(b0, jSONObject);
        h79 h79Var = t instanceof h79 ? (h79) t : null;
        if (h79Var != null) {
            return ((y69) t6fVar.R4.getValue()).a(t7kVar, h79Var, jSONObject);
        }
        throw a8k.l(jSONObject, "type", b0);
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, k69 k69Var) {
        boolean z = k69Var instanceof j69;
        t6f t6fVar = this.a;
        if (z) {
            a79 a79Var = (a79) t6fVar.M4.getValue();
            z69 z69Var = ((j69) k69Var).b;
            a79Var.getClass();
            return a79.d(t7kVar, z69Var);
        }
        if (!(k69Var instanceof i69)) {
            b6e.s();
            return null;
        }
        r69 r69Var = (r69) t6fVar.J4.getValue();
        q69 q69Var = ((i69) k69Var).b;
        r69Var.getClass();
        return r69.d(t7kVar, q69Var);
    }
}
