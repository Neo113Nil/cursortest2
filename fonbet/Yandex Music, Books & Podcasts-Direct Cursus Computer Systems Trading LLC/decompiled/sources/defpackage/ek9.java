package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ek9 implements u8s {
    public final t6f a;

    public ek9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final bk9 a(t7k t7kVar, ik9 ik9Var, JSONObject jSONObject) {
        boolean z = ik9Var instanceof fk9;
        t6f t6fVar = this.a;
        if (z) {
            mz8 mz8Var = (mz8) t6fVar.H3.getValue();
            oz8 oz8Var = ((fk9) ik9Var).a;
            mz8Var.getClass();
            return new yj9(mz8.b(t7kVar, oz8Var, jSONObject));
        }
        if (ik9Var instanceof gk9) {
            return new zj9(((d99) t6fVar.j5.getValue()).a(t7kVar, ((gk9) ik9Var).a, jSONObject));
        }
        if (ik9Var instanceof hk9) {
            return new ak9(((a2a) t6fVar.Z9.getValue()).a(t7kVar, ((hk9) ik9Var).a, jSONObject));
        }
        b6e.s();
        return null;
    }
}
