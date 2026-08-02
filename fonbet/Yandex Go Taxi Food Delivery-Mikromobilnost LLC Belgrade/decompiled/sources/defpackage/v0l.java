package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class v0l implements zsq0, yey0 {
    public final JsonParserComponent a;

    public v0l(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final hex a(yf90 yf90Var, JSONObject jSONObject) {
        return new x0l(wcx.c(udq0.Q(yf90Var), jSONObject, "page_width", yf90Var.i(), null, this.a.S5));
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, x0l x0lVar) {
        JSONObject jSONObject = new JSONObject();
        wcx.u(yf90Var, jSONObject, "page_width", x0lVar.a, this.a.S5);
        wwg.Z(yf90Var, jSONObject, "type", "percentage");
        return jSONObject;
    }
}
