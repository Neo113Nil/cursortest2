package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class u0l implements zsq0, nyi {
    public final JsonParserComponent a;

    public u0l(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final t0l a(yf90 yf90Var, JSONObject jSONObject) {
        return new t0l((j3l) wwg.E(yf90Var, jSONObject, "page_width", this.a.R5));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, t0l t0lVar) {
        JSONObject jSONObject = new JSONObject();
        wwg.b0(yf90Var, jSONObject, "page_width", t0lVar.a, this.a.R5);
        wwg.Z(yf90Var, jSONObject, "type", "percentage");
        return jSONObject;
    }
}
