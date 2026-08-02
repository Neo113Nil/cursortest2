package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class v4k implements zsq0, yey0 {
    public final JsonParserComponent a;

    public v4k(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    public final x4k c(yf90 yf90Var, x4k x4kVar, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        return new x4k(wcx.e(Q, jSONObject, "index", wm11.b, i, x4kVar != null ? x4kVar.a : null, b.h, q5z.b), wcx.c(Q, jSONObject, "value", i, x4kVar != null ? x4kVar.b : null, this.a.D9), wcx.d(Q, jSONObject, "variable_name", wm11.c, i, x4kVar != null ? x4kVar.c : null));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, x4k x4kVar) {
        JSONObject jSONObject = new JSONObject();
        wcx.q(yf90Var, jSONObject, "index", x4kVar.a);
        wwg.Z(yf90Var, jSONObject, "type", "array_set_value");
        wcx.u(yf90Var, jSONObject, "value", x4kVar.b, this.a.D9);
        wcx.q(yf90Var, jSONObject, "variable_name", x4kVar.c);
        return jSONObject;
    }
}
