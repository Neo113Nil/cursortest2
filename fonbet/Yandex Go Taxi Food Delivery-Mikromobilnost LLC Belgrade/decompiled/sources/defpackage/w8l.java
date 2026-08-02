package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class w8l implements zsq0, yey0 {
    public final JsonParserComponent a;

    public w8l(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    public final y8l c(yf90 yf90Var, y8l y8lVar, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        exq e = wcx.e(Q, jSONObject, "color", wm11.f, i, y8lVar != null ? y8lVar.a : null, b.b, q5z.b);
        exq exqVar = y8lVar != null ? y8lVar.b : null;
        JsonParserComponent jsonParserComponent = this.a;
        return new y8l(e, wcx.c(Q, jSONObject, "shape", i, exqVar, jsonParserComponent.j7), wcx.i(Q, jSONObject, "stroke", i, y8lVar != null ? y8lVar.c : null, jsonParserComponent.Z7));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, y8l y8lVar) {
        JSONObject jSONObject = new JSONObject();
        wcx.p(y8lVar.a, b.a, yf90Var, "color", jSONObject);
        exq exqVar = y8lVar.b;
        JsonParserComponent jsonParserComponent = this.a;
        wcx.u(yf90Var, jSONObject, "shape", exqVar, jsonParserComponent.j7);
        wcx.u(yf90Var, jSONObject, "stroke", y8lVar.c, jsonParserComponent.Z7);
        wwg.Z(yf90Var, jSONObject, "type", "shape_drawable");
        return jSONObject;
    }
}
