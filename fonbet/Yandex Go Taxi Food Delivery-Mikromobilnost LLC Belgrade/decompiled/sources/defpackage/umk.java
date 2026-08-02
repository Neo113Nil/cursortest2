package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div2.DivTransitionSelector;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.z;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class umk implements zsq0, nyi {
    public final JsonParserComponent a;

    public umk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.nyi
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final omk a(yf90 yf90Var, JSONObject jSONObject) {
        yf90 k6oVar = yf90Var instanceof k6o ? yf90Var : new k6o(yf90Var);
        JsonParserComponent jsonParserComponent = this.a;
        List O = wwg.O(k6oVar, jSONObject, "functions", jsonParserComponent.T3);
        Object opt = jSONObject.opt("log_id");
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        if (opt == null) {
            throw fg90.h("log_id", jSONObject);
        }
        String str = (String) opt;
        List J = wwg.J(k6oVar, jSONObject, "states", jsonParserComponent.P2, z.c);
        List O2 = wwg.O(k6oVar, jSONObject, "timers", jsonParserComponent.Z8);
        qkj qkjVar = z.b;
        tls tlsVar = DivTransitionSelector.FROM_STRING;
        kvo kvoVar = z.a;
        ?? e = a.e(k6oVar, jSONObject, "transition_animation_selector", qkjVar, tlsVar, q5z.b, kvoVar);
        yf90 yf90Var2 = k6oVar;
        if (e != 0) {
            kvoVar = e;
        }
        return new omk(O, str, J, O2, kvoVar, wwg.O(yf90Var2, jSONObject, "variable_triggers", jsonParserComponent.z9), wwg.O(yf90Var2, jSONObject, "variables", jsonParserComponent.F9), udq0.s(yf90Var2));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, omk omkVar) {
        JSONObject jSONObject = new JSONObject();
        List list = omkVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        wwg.c0(yf90Var, jSONObject, "functions", list, jsonParserComponent.T3);
        wwg.Z(yf90Var, jSONObject, "log_id", omkVar.b);
        wwg.c0(yf90Var, jSONObject, "states", omkVar.c, jsonParserComponent.P2);
        wwg.c0(yf90Var, jSONObject, "timers", omkVar.d, jsonParserComponent.Z8);
        a.h(yf90Var, jSONObject, "transition_animation_selector", omkVar.e, DivTransitionSelector.TO_STRING);
        wwg.c0(yf90Var, jSONObject, "variable_triggers", omkVar.f, jsonParserComponent.z9);
        wwg.c0(yf90Var, jSONObject, "variables", omkVar.g, jsonParserComponent.F9);
        return jSONObject;
    }
}
