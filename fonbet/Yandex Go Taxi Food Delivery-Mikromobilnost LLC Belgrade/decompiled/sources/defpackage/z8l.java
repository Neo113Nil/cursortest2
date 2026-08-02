package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class z8l implements zsq0, nyi {
    public final JsonParserComponent a;

    public z8l(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        String R = wwg.R(jSONObject);
        boolean equals = R.equals("rounded_rectangle");
        JsonParserComponent jsonParserComponent = this.a;
        if (equals) {
            return new s8l(((l7l) jsonParserComponent.K6.getValue()).a(yf90Var, jSONObject));
        }
        if (R.equals("circle")) {
            return new r8l(((pik) jsonParserComponent.g2.getValue()).a(yf90Var, jSONObject));
        }
        hex b = yf90Var.b().b(R, jSONObject);
        e9l e9lVar = b instanceof e9l ? (e9l) b : null;
        if (e9lVar != null) {
            return ((b9l) jsonParserComponent.k7.getValue()).a(yf90Var, e9lVar, jSONObject);
        }
        throw fg90.m(jSONObject, "type", R);
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, t8l t8lVar) {
        boolean z = t8lVar instanceof s8l;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            return ((l7l) jsonParserComponent.K6.getValue()).b(yf90Var, ((s8l) t8lVar).b);
        }
        if (t8lVar instanceof r8l) {
            return ((pik) jsonParserComponent.g2.getValue()).b(yf90Var, ((r8l) t8lVar).b);
        }
        w511.b();
        return null;
    }
}
