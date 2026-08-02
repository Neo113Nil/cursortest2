package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivBorder;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class rgk implements zsq0, nyi {
    public final JsonParserComponent a;

    public rgk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        Expression e = a.e(yf90Var, jSONObject, "corner_radius", wm11.b, b.h, tgk.b, null);
        JsonParserComponent jsonParserComponent = this.a;
        jkk jkkVar = (jkk) wwg.M(yf90Var, jSONObject, "corners_radius", jsonParserComponent.B2);
        wms wmsVar = wm11.a;
        tls tlsVar = b.f;
        kvo kvoVar = tgk.a;
        Expression e2 = a.e(yf90Var, jSONObject, "has_shadow", wmsVar, tlsVar, q5z.b, kvoVar);
        if (e2 == null) {
            e2 = kvoVar;
        }
        return new DivBorder(e, jkkVar, e2, (m8l) wwg.M(yf90Var, jSONObject, "shadow", jsonParserComponent.c7), (bcl) wwg.M(yf90Var, jSONObject, "stroke", jsonParserComponent.Y7));
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, DivBorder divBorder) {
        JSONObject jSONObject = new JSONObject();
        a.g(yf90Var, jSONObject, "corner_radius", divBorder.a);
        jkk jkkVar = divBorder.b;
        JsonParserComponent jsonParserComponent = this.a;
        wwg.b0(yf90Var, jSONObject, "corners_radius", jkkVar, jsonParserComponent.B2);
        a.g(yf90Var, jSONObject, "has_shadow", divBorder.c);
        wwg.b0(yf90Var, jSONObject, "shadow", divBorder.d, jsonParserComponent.c7);
        wwg.b0(yf90Var, jSONObject, "stroke", divBorder.e, jsonParserComponent.Y7);
        return jSONObject;
    }
}
