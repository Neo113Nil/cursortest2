package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.JsonParserComponent;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class u9k implements zsq0, nyi {
    public final JsonParserComponent a;

    public u9k(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final t9k a(yf90 yf90Var, JSONObject jSONObject) {
        Expression a = a.a(yf90Var, jSONObject, "container_id", wm11.c);
        JsonParserComponent jsonParserComponent = this.a;
        return new t9k(a, wwg.O(yf90Var, jSONObject, "on_fail_actions", jsonParserComponent.t1), wwg.O(yf90Var, jSONObject, "on_success_actions", jsonParserComponent.t1), (s9k) wwg.E(yf90Var, jSONObject, "request", jsonParserComponent.b1));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, t9k t9kVar) {
        JSONObject jSONObject = new JSONObject();
        a.g(yf90Var, jSONObject, "container_id", t9kVar.a);
        List list = t9kVar.b;
        JsonParserComponent jsonParserComponent = this.a;
        wwg.c0(yf90Var, jSONObject, "on_fail_actions", list, jsonParserComponent.t1);
        wwg.c0(yf90Var, jSONObject, "on_success_actions", t9kVar.c, jsonParserComponent.t1);
        wwg.b0(yf90Var, jSONObject, "request", t9kVar.d, jsonParserComponent.b1);
        wwg.Z(yf90Var, jSONObject, "type", "submit");
        return jSONObject;
    }
}
