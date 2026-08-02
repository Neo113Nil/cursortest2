package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class bx8 implements gip, r8s {
    public final t6f a;

    public bx8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final d7f a(t7k t7kVar, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        t6f t6fVar = this.a;
        return new cx8(y2x.R(Y, jSONObject, "on_fail_actions", d, null, t6fVar.u1), y2x.R(Y, jSONObject, "on_success_actions", d, null, t6fVar.u1));
    }

    @Override // defpackage.gip
    public final JSONObject b(t7k t7kVar, Object obj) {
        cx8 cx8Var = (cx8) obj;
        JSONObject jSONObject = new JSONObject();
        c9c c9cVar = cx8Var.a;
        jyr jyrVar = this.a.u1;
        y2x.k0(t7kVar, jSONObject, "on_fail_actions", c9cVar, jyrVar);
        y2x.k0(t7kVar, jSONObject, "on_success_actions", cx8Var.b, jyrVar);
        return jSONObject;
    }
}
