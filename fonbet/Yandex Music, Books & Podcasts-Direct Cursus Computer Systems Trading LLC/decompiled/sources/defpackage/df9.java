package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class df9 implements gip, r8s {
    public final t6f a;

    public df9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final d7f a(t7k t7kVar, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        t6f t6fVar = this.a;
        return new ef9(y2x.H(Y, jSONObject, "x", d, null, t6fVar.W2), y2x.H(Y, jSONObject, "y", d, null, t6fVar.W2));
    }

    @Override // defpackage.gip
    public final JSONObject b(t7k t7kVar, Object obj) {
        ef9 ef9Var = (ef9) obj;
        JSONObject jSONObject = new JSONObject();
        c9c c9cVar = ef9Var.a;
        jyr jyrVar = this.a.W2;
        y2x.i0(t7kVar, jSONObject, "x", c9cVar, jyrVar);
        y2x.i0(t7kVar, jSONObject, "y", ef9Var.b, jyrVar);
        return jSONObject;
    }
}
