package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class qik implements zsq0, yey0 {
    public final JsonParserComponent a;

    public qik(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    public final tik c(yf90 yf90Var, tik tikVar, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        exq j = wcx.j(Q, jSONObject, "background_color", wm11.f, i, tikVar != null ? tikVar.a : null, b.b, q5z.b);
        exq exqVar = tikVar != null ? tikVar.b : null;
        JsonParserComponent jsonParserComponent = this.a;
        return new tik(j, wcx.i(Q, jSONObject, "radius", i, exqVar, jsonParserComponent.F3), wcx.i(Q, jSONObject, "stroke", i, tikVar != null ? tikVar.c : null, jsonParserComponent.Z7));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, tik tikVar) {
        JSONObject jSONObject = new JSONObject();
        wcx.p(tikVar.a, b.a, yf90Var, "background_color", jSONObject);
        exq exqVar = tikVar.b;
        JsonParserComponent jsonParserComponent = this.a;
        wcx.u(yf90Var, jSONObject, "radius", exqVar, jsonParserComponent.F3);
        wcx.u(yf90Var, jSONObject, "stroke", tikVar.c, jsonParserComponent.Z7);
        wwg.Z(yf90Var, jSONObject, "type", "circle");
        return jSONObject;
    }
}
