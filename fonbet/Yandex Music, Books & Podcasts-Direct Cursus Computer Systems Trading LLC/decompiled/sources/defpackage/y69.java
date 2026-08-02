package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class y69 implements u8s {
    public final t6f a;

    public y69(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final k69 a(t7k t7kVar, h79 h79Var, JSONObject jSONObject) {
        boolean z = h79Var instanceof g79;
        t6f t6fVar = this.a;
        if (z) {
            c79 c79Var = (c79) t6fVar.O4.getValue();
            e79 e79Var = ((g79) h79Var).a;
            c79Var.getClass();
            return new j69(c79.b(t7kVar, e79Var, jSONObject));
        }
        if (!(h79Var instanceof f79)) {
            b6e.s();
            return null;
        }
        t69 t69Var = (t69) t6fVar.L4.getValue();
        v69 v69Var = ((f79) h79Var).a;
        t69Var.getClass();
        return new i69(t69.b(t7kVar, v69Var, jSONObject));
    }
}
