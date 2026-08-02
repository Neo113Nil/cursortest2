package defpackage;

import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ax8 implements gip, py7 {
    public final t6f a;

    public ax8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        jyr jyrVar = this.a.t1;
        return new zw8(etn.Y(t7kVar, jSONObject, "on_fail_actions", jyrVar), etn.Y(t7kVar, jSONObject, "on_success_actions", jyrVar));
    }

    @Override // defpackage.gip
    public final JSONObject b(t7k t7kVar, Object obj) {
        zw8 zw8Var = (zw8) obj;
        JSONObject jSONObject = new JSONObject();
        List list = zw8Var.a;
        jyr jyrVar = this.a.t1;
        etn.n0(t7kVar, jSONObject, "on_fail_actions", list, jyrVar);
        etn.n0(t7kVar, jSONObject, "on_success_actions", zw8Var.b, jyrVar);
        return jSONObject;
    }
}
