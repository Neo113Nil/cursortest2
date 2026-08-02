package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ax9 implements u8s {
    public final t6f a;

    public ax9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final xw9 a(t7k t7kVar, bx9 bx9Var, JSONObject jSONObject) {
        c9c c9cVar = bx9Var.a;
        t6f t6fVar = this.a;
        return new xw9((qw9) h4a.K(t7kVar, c9cVar, jSONObject, "x", t6fVar.B9, t6fVar.z9), (qw9) h4a.K(t7kVar, bx9Var.b, jSONObject, "y", t6fVar.B9, t6fVar.z9));
    }
}
