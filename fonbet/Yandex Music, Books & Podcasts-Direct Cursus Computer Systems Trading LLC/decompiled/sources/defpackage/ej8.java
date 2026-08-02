package defpackage;

import com.connectsdk.service.command.ServiceCommand;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ej8 implements gip, r8s {
    public final t6f a;

    public ej8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    public final nj8 c(t7k t7kVar, nj8 nj8Var, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        c9c J = y2x.J(Y, jSONObject, "container_id", vct.c, d, nj8Var != null ? nj8Var.a : null);
        c9c c9cVar = nj8Var != null ? nj8Var.b : null;
        t6f t6fVar = this.a;
        return new nj8(J, y2x.R(Y, jSONObject, "on_fail_actions", d, c9cVar, t6fVar.u1), y2x.R(Y, jSONObject, "on_success_actions", d, nj8Var != null ? nj8Var.c : null, t6fVar.u1), y2x.H(Y, jSONObject, ServiceCommand.TYPE_REQ, d, nj8Var != null ? nj8Var.d : null, t6fVar.c1));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, nj8 nj8Var) {
        JSONObject jSONObject = new JSONObject();
        y2x.f0(t7kVar, jSONObject, "container_id", nj8Var.a);
        c9c c9cVar = nj8Var.b;
        t6f t6fVar = this.a;
        jyr jyrVar = t6fVar.u1;
        y2x.k0(t7kVar, jSONObject, "on_fail_actions", c9cVar, jyrVar);
        y2x.k0(t7kVar, jSONObject, "on_success_actions", nj8Var.c, jyrVar);
        y2x.i0(t7kVar, jSONObject, ServiceCommand.TYPE_REQ, nj8Var.d, t6fVar.c1);
        etn.l0(t7kVar, jSONObject, "type", "submit");
        return jSONObject;
    }
}
