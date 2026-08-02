package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import com.yandex.div2.DivTransform;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class rjl implements zsq0, nyi {
    public final JsonParserComponent a;

    public rjl(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        JsonParserComponent jsonParserComponent = this.a;
        z3l z3lVar = (z3l) wwg.M(yf90Var, jSONObject, "pivot_x", jsonParserComponent.g6);
        if (z3lVar == null) {
            z3lVar = tjl.a;
        }
        z3l z3lVar2 = (z3l) wwg.M(yf90Var, jSONObject, "pivot_y", jsonParserComponent.g6);
        if (z3lVar2 == null) {
            z3lVar2 = tjl.b;
        }
        return new DivTransform(z3lVar, z3lVar2, a.e(yf90Var, jSONObject, "rotation", wm11.d, b.g, q5z.b, null));
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, DivTransform divTransform) {
        JSONObject jSONObject = new JSONObject();
        z3l z3lVar = divTransform.a;
        JsonParserComponent jsonParserComponent = this.a;
        wwg.b0(yf90Var, jSONObject, "pivot_x", z3lVar, jsonParserComponent.g6);
        wwg.b0(yf90Var, jSONObject, "pivot_y", divTransform.b, jsonParserComponent.g6);
        a.g(yf90Var, jSONObject, "rotation", divTransform.c);
        return jSONObject;
    }
}
