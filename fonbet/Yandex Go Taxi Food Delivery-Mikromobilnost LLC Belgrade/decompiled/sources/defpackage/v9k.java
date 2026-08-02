package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class v9k implements zsq0, yey0 {
    public final JsonParserComponent a;

    public v9k(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    public final dak c(yf90 yf90Var, dak dakVar, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        exq d = wcx.d(Q, jSONObject, "container_id", wm11.c, i, dakVar != null ? dakVar.a : null);
        exq exqVar = dakVar != null ? dakVar.b : null;
        JsonParserComponent jsonParserComponent = this.a;
        return new dak(d, wcx.k(Q, jSONObject, "on_fail_actions", i, exqVar, jsonParserComponent.u1), wcx.k(Q, jSONObject, "on_success_actions", i, dakVar != null ? dakVar.c : null, jsonParserComponent.u1), wcx.c(Q, jSONObject, "request", i, dakVar != null ? dakVar.d : null, jsonParserComponent.c1));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, dak dakVar) {
        JSONObject jSONObject = new JSONObject();
        wcx.q(yf90Var, jSONObject, "container_id", dakVar.a);
        exq exqVar = dakVar.b;
        JsonParserComponent jsonParserComponent = this.a;
        wcx.w(yf90Var, jSONObject, "on_fail_actions", exqVar, jsonParserComponent.u1);
        wcx.w(yf90Var, jSONObject, "on_success_actions", dakVar.c, jsonParserComponent.u1);
        wcx.u(yf90Var, jSONObject, "request", dakVar.d, jsonParserComponent.c1);
        wwg.Z(yf90Var, jSONObject, "type", "submit");
        return jSONObject;
    }
}
