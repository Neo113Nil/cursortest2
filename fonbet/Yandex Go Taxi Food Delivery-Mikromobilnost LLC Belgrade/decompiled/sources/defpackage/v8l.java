package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class v8l implements zsq0, nyi {
    public final JsonParserComponent a;

    public v8l(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final u8l a(yf90 yf90Var, JSONObject jSONObject) {
        Expression b = a.b(yf90Var, jSONObject, "color", wm11.f, b.b, q5z.b);
        JsonParserComponent jsonParserComponent = this.a;
        return new u8l(b, (t8l) wwg.E(yf90Var, jSONObject, "shape", jsonParserComponent.i7), (bcl) wwg.M(yf90Var, jSONObject, "stroke", jsonParserComponent.Y7));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, u8l u8lVar) {
        JSONObject jSONObject = new JSONObject();
        a.h(yf90Var, jSONObject, "color", u8lVar.a, b.a);
        t8l t8lVar = u8lVar.b;
        JsonParserComponent jsonParserComponent = this.a;
        wwg.b0(yf90Var, jSONObject, "shape", t8lVar, jsonParserComponent.i7);
        wwg.b0(yf90Var, jSONObject, "stroke", u8lVar.c, jsonParserComponent.Y7);
        wwg.Z(yf90Var, jSONObject, "type", "shape_drawable");
        return jSONObject;
    }
}
