package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class aw9 implements u8s {
    public final t6f a;

    public aw9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final xv9 a(t7k t7kVar, dw9 dw9Var, JSONObject jSONObject) {
        boolean z = dw9Var instanceof bw9;
        t6f t6fVar = this.a;
        if (z) {
            return new vv9(((nh9) t6fVar.L6.getValue()).a(t7kVar, ((bw9) dw9Var).a, jSONObject));
        }
        if (dw9Var instanceof cw9) {
            return new wv9(((ax9) t6fVar.y9.getValue()).a(t7kVar, ((cw9) dw9Var).a, jSONObject));
        }
        b6e.s();
        return null;
    }
}
