package defpackage;

import com.yandex.div2.DivTransitionSelector;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.z;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class vmk implements zsq0, yey0 {
    public final JsonParserComponent a;

    public vmk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final hex a(yf90 yf90Var, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        JsonParserComponent jsonParserComponent = this.a;
        return new bnk(wcx.k(Q, jSONObject, "functions", i, null, jsonParserComponent.U3), wcx.a(Q, jSONObject, "log_id", i, null), wcx.f(Q, jSONObject, "states", i, null, jsonParserComponent.Q2, z.c), wcx.k(Q, jSONObject, "timers", i, null, jsonParserComponent.a9), wcx.j(Q, jSONObject, "transition_animation_selector", z.b, i, null, DivTransitionSelector.FROM_STRING, q5z.b), wcx.k(Q, jSONObject, "variable_triggers", i, null, jsonParserComponent.A9), wcx.k(Q, jSONObject, "variables", i, null, jsonParserComponent.G9));
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, bnk bnkVar) {
        JSONObject jSONObject = new JSONObject();
        exq exqVar = bnkVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        wcx.w(yf90Var, jSONObject, "functions", exqVar, jsonParserComponent.U3);
        wcx.t(yf90Var, jSONObject, "log_id", bnkVar.b);
        wcx.w(yf90Var, jSONObject, "states", bnkVar.c, jsonParserComponent.Q2);
        wcx.w(yf90Var, jSONObject, "timers", bnkVar.d, jsonParserComponent.a9);
        wcx.p(bnkVar.e, DivTransitionSelector.TO_STRING, yf90Var, "transition_animation_selector", jSONObject);
        wcx.w(yf90Var, jSONObject, "variable_triggers", bnkVar.f, jsonParserComponent.A9);
        wcx.w(yf90Var, jSONObject, "variables", bnkVar.g, jsonParserComponent.G9);
        return jSONObject;
    }
}
