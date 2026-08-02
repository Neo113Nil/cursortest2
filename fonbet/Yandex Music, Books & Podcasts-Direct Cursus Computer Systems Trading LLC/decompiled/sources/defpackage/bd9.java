package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class bd9 implements gip, r8s {
    public final t6f a;

    public bd9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final d7f a(t7k t7kVar, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        t6f t6fVar = this.a;
        jyr jyrVar = t6fVar.R5;
        jyr jyrVar2 = t6fVar.u1;
        y19 y19Var = cd9.c;
        y19Var.getClass();
        return new fd9(y2x.L(Y, jSONObject, "changes", d, null, jyrVar, y19Var), y2x.P(Y, jSONObject, "mode", cd9.b, d, null, i49.z0, bcx.h), y2x.R(Y, jSONObject, "on_applied_actions", d, null, jyrVar2), y2x.R(Y, jSONObject, "on_failed_actions", d, null, jyrVar2));
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, fd9 fd9Var) {
        JSONObject jSONObject = new JSONObject();
        c9c c9cVar = fd9Var.a;
        t6f t6fVar = this.a;
        y2x.k0(t7kVar, jSONObject, "changes", c9cVar, t6fVar.R5);
        y2x.e0(fd9Var.b, t7kVar, "mode", i49.A0, jSONObject);
        c9c c9cVar2 = fd9Var.c;
        jyr jyrVar = t6fVar.u1;
        y2x.k0(t7kVar, jSONObject, "on_applied_actions", c9cVar2, jyrVar);
        y2x.k0(t7kVar, jSONObject, "on_failed_actions", fd9Var.d, jyrVar);
        return jSONObject;
    }
}
