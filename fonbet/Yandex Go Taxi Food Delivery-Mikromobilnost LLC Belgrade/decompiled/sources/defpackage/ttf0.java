package defpackage;

import com.yandex.div2.DivEvaluableType;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class ttf0 implements zsq0, yey0 {
    public final JsonParserComponent a;

    public ttf0(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    public final vtf0 c(yf90 yf90Var, vtf0 vtf0Var, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        return new vtf0(wcx.d(Q, jSONObject, "get", wm11.c, i, vtf0Var != null ? vtf0Var.a : null), wcx.a(Q, jSONObject, "name", i, vtf0Var != null ? vtf0Var.b : null), wcx.h(Q, jSONObject, "new_value_variable_name", i, vtf0Var != null ? vtf0Var.c : null, q5z.c), wcx.k(Q, jSONObject, "set", i, vtf0Var != null ? vtf0Var.d : null, this.a.u1), wcx.b(Q, jSONObject, "value_type", i, vtf0Var != null ? vtf0Var.e : null, DivEvaluableType.FROM_STRING, q5z.b));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, vtf0 vtf0Var) {
        JSONObject jSONObject = new JSONObject();
        wcx.q(yf90Var, jSONObject, "get", vtf0Var.a);
        wcx.t(yf90Var, jSONObject, "name", vtf0Var.b);
        wcx.t(yf90Var, jSONObject, "new_value_variable_name", vtf0Var.c);
        wcx.w(yf90Var, jSONObject, "set", vtf0Var.d, this.a.u1);
        wwg.Z(yf90Var, jSONObject, "type", "property");
        wcx.s(vtf0Var.e, DivEvaluableType.TO_STRING, yf90Var, "value_type", jSONObject);
        return jSONObject;
    }
}
