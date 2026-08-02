package defpackage;

import com.connectsdk.service.command.ServiceCommand;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class dj8 implements gip, py7 {
    public final t6f a;

    public dj8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final cj8 a(t7k t7kVar, JSONObject jSONObject) {
        szb a = e5f.a(t7kVar, jSONObject, "container_id", vct.c);
        t6f t6fVar = this.a;
        jyr jyrVar = t6fVar.t1;
        return new cj8(a, etn.Y(t7kVar, jSONObject, "on_fail_actions", jyrVar), etn.Y(t7kVar, jSONObject, "on_success_actions", jyrVar), (bj8) etn.O(t7kVar, jSONObject, ServiceCommand.TYPE_REQ, t6fVar.b1));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, cj8 cj8Var) {
        JSONObject jSONObject = new JSONObject();
        e5f.g(t7kVar, jSONObject, "container_id", cj8Var.a);
        List list = cj8Var.b;
        t6f t6fVar = this.a;
        jyr jyrVar = t6fVar.t1;
        etn.n0(t7kVar, jSONObject, "on_fail_actions", list, jyrVar);
        etn.n0(t7kVar, jSONObject, "on_success_actions", cj8Var.c, jyrVar);
        etn.m0(t7kVar, jSONObject, ServiceCommand.TYPE_REQ, cj8Var.d, t6fVar.b1);
        etn.l0(t7kVar, jSONObject, "type", "submit");
        return jSONObject;
    }
}
