package defpackage;

import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivEvaluableType;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class utf0 implements qfy0 {
    public final JsonParserComponent a;

    public utf0(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ptf0 a(yf90 yf90Var, vtf0 vtf0Var, JSONObject jSONObject) {
        Expression c = xcx.c(yf90Var, vtf0Var.a, jSONObject, "get", wm11.c);
        exq exqVar = vtf0Var.b;
        abl0 abl0Var = q5z.c;
        kbs kbsVar = q5z.b;
        String str = (String) xcx.a(exqVar, jSONObject, "name", abl0Var, kbsVar);
        String str2 = (String) xcx.i(vtf0Var.c, abl0Var, yf90Var, "new_value_variable_name", jSONObject);
        if (str2 == null) {
            str2 = "new_value";
        }
        exq exqVar2 = vtf0Var.d;
        JsonParserComponent jsonParserComponent = this.a;
        return new ptf0(c, str, str2, xcx.s(yf90Var, exqVar2, jSONObject, "set", jsonParserComponent.v1, jsonParserComponent.t1), (DivEvaluableType) xcx.a(vtf0Var.e, jSONObject, "value_type", DivEvaluableType.FROM_STRING, kbsVar));
    }
}
