package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ma9 implements u8s {
    public final t6f a;

    public ma9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ja9 a(t7k t7kVar, bb9 bb9Var, JSONObject jSONObject) {
        boolean z = bb9Var instanceof ab9;
        t6f t6fVar = this.a;
        if (z) {
            wa9 wa9Var = (wa9) t6fVar.E5.getValue();
            ya9 ya9Var = ((ab9) bb9Var).a;
            wa9Var.getClass();
            return new ia9(wa9.b(t7kVar, ya9Var, jSONObject));
        }
        if (!(bb9Var instanceof za9)) {
            b6e.s();
            return null;
        }
        qa9 qa9Var = (qa9) t6fVar.B5.getValue();
        sa9 sa9Var = ((za9) bb9Var).a;
        qa9Var.getClass();
        return new ha9(qa9.b(t7kVar, sa9Var, jSONObject));
    }
}
