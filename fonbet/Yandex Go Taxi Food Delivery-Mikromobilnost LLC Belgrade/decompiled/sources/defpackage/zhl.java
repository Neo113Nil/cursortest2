package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.JsonParserComponent;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zhl implements zsq0, nyi {
    public final JsonParserComponent a;

    public zhl(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        tms tmsVar = wm11.b;
        tls tlsVar = b.h;
        yhl yhlVar = bil.b;
        kvo kvoVar = bil.a;
        Expression e = a.e(yf90Var, jSONObject, "duration", tmsVar, tlsVar, yhlVar, kvoVar);
        if (e == null) {
            e = kvoVar;
        }
        JsonParserComponent jsonParserComponent = this.a;
        List O = wwg.O(yf90Var, jSONObject, "end_actions", jsonParserComponent.t1);
        Object opt = jSONObject.opt("id");
        Object obj = JSONObject.NULL;
        if (opt == obj) {
            opt = null;
        }
        if (opt == null) {
            throw fg90.h("id", jSONObject);
        }
        String str = (String) opt;
        List O2 = wwg.O(yf90Var, jSONObject, "tick_actions", jsonParserComponent.t1);
        Expression e2 = a.e(yf90Var, jSONObject, "tick_interval", tmsVar, tlsVar, bil.c, null);
        Object opt2 = jSONObject.opt("value_variable");
        if (opt2 == obj) {
            opt2 = null;
        }
        return new vhl(e, O, str, O2, e2, (String) (opt2 != null ? opt2 : null));
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, vhl vhlVar) {
        JSONObject jSONObject = new JSONObject();
        a.g(yf90Var, jSONObject, "duration", vhlVar.a);
        List list = vhlVar.b;
        JsonParserComponent jsonParserComponent = this.a;
        wwg.c0(yf90Var, jSONObject, "end_actions", list, jsonParserComponent.t1);
        wwg.Z(yf90Var, jSONObject, "id", vhlVar.c);
        wwg.c0(yf90Var, jSONObject, "tick_actions", vhlVar.d, jsonParserComponent.t1);
        a.g(yf90Var, jSONObject, "tick_interval", vhlVar.e);
        wwg.Z(yf90Var, jSONObject, "value_variable", vhlVar.f);
        return jSONObject;
    }
}
