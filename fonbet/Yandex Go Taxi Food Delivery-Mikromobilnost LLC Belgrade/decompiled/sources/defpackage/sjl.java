package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class sjl implements zsq0, yey0 {
    public final JsonParserComponent a;

    public sjl(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final hex a(yf90 yf90Var, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        JsonParserComponent jsonParserComponent = this.a;
        return new ujl(wcx.i(Q, jSONObject, "pivot_x", i, null, jsonParserComponent.h6), wcx.i(Q, jSONObject, "pivot_y", i, null, jsonParserComponent.h6), wcx.j(Q, jSONObject, "rotation", wm11.d, i, null, b.g, q5z.b));
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, ujl ujlVar) {
        JSONObject jSONObject = new JSONObject();
        exq exqVar = ujlVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        wcx.u(yf90Var, jSONObject, "pivot_x", exqVar, jsonParserComponent.h6);
        wcx.u(yf90Var, jSONObject, "pivot_y", ujlVar.b, jsonParserComponent.h6);
        wcx.q(yf90Var, jSONObject, "rotation", ujlVar.c);
        return jSONObject;
    }
}
