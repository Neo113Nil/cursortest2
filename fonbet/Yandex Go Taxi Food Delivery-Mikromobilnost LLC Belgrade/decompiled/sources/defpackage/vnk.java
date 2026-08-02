package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class vnk implements zsq0, yey0 {
    public final JsonParserComponent a;

    public vnk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final hex a(yf90 yf90Var, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        JsonParserComponent jsonParserComponent = this.a;
        return new wnk(wcx.k(Q, jSONObject, "on_fail_actions", i, null, jsonParserComponent.u1), wcx.k(Q, jSONObject, "on_success_actions", i, null, jsonParserComponent.u1));
    }

    @Override // defpackage.zsq0
    public final JSONObject b(yf90 yf90Var, Object obj) {
        wnk wnkVar = (wnk) obj;
        JSONObject jSONObject = new JSONObject();
        exq exqVar = wnkVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        wcx.w(yf90Var, jSONObject, "on_fail_actions", exqVar, jsonParserComponent.u1);
        wcx.w(yf90Var, jSONObject, "on_success_actions", wnkVar.b, jsonParserComponent.u1);
        return jSONObject;
    }
}
