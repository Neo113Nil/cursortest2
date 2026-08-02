package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivEvaluableType;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class stf0 implements zsq0, nyi {
    public final JsonParserComponent a;

    public stf0(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final ptf0 a(yf90 yf90Var, JSONObject jSONObject) {
        Expression a = a.a(yf90Var, jSONObject, "get", wm11.c);
        Object opt = jSONObject.opt("name");
        Object obj = JSONObject.NULL;
        if (opt == obj) {
            opt = null;
        }
        if (opt == null) {
            throw fg90.h("name", jSONObject);
        }
        String str = (String) opt;
        Object opt2 = jSONObject.opt("new_value_variable_name");
        if (opt2 == obj) {
            opt2 = null;
        }
        String str2 = (String) (opt2 != null ? opt2 : null);
        if (str2 == null) {
            str2 = "new_value";
        }
        return new ptf0(a, str, str2, wwg.O(yf90Var, jSONObject, "set", this.a.t1), (DivEvaluableType) wwg.G(jSONObject, "value_type", DivEvaluableType.FROM_STRING));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, ptf0 ptf0Var) {
        JSONObject jSONObject = new JSONObject();
        a.g(yf90Var, jSONObject, "get", ptf0Var.a);
        wwg.Z(yf90Var, jSONObject, "name", ptf0Var.b);
        wwg.Z(yf90Var, jSONObject, "new_value_variable_name", ptf0Var.c);
        wwg.c0(yf90Var, jSONObject, "set", ptf0Var.d, this.a.t1);
        wwg.Z(yf90Var, jSONObject, "type", "property");
        wwg.a0(yf90Var, jSONObject, "value_type", ptf0Var.e, DivEvaluableType.TO_STRING);
        return jSONObject;
    }
}
