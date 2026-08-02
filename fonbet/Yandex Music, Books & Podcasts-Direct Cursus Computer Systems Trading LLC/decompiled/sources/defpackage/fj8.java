package defpackage;

import com.connectsdk.service.command.ServiceCommand;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class fj8 implements u8s {
    public final t6f a;

    public fj8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final cj8 a(t7k t7kVar, nj8 nj8Var, JSONObject jSONObject) {
        szb F = h4a.F(t7kVar, nj8Var.a, jSONObject, "container_id", vct.c);
        c9c c9cVar = nj8Var.b;
        t6f t6fVar = this.a;
        return new cj8(F, h4a.V(t7kVar, c9cVar, jSONObject, "on_fail_actions", t6fVar.v1, t6fVar.t1), h4a.V(t7kVar, nj8Var.c, jSONObject, "on_success_actions", t6fVar.v1, t6fVar.t1), (bj8) h4a.D(t7kVar, nj8Var.d, jSONObject, ServiceCommand.TYPE_REQ, t6fVar.d1, t6fVar.b1));
    }
}
