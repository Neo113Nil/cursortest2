package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class sj9 implements u8s {
    public final t6f a;

    public sj9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final kj9 a(t7k t7kVar, vj9 vj9Var, JSONObject jSONObject) {
        boolean z = vj9Var instanceof uj9;
        t6f t6fVar = this.a;
        if (z) {
            return new jj9(((th9) t6fVar.O6.getValue()).a(t7kVar, ((uj9) vj9Var).a, jSONObject));
        }
        if (vj9Var instanceof tj9) {
            return new ij9(((cr8) t6fVar.i2.getValue()).a(t7kVar, ((tj9) vj9Var).a, jSONObject));
        }
        b6e.s();
        return null;
    }
}
