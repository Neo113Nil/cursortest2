package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class x5k implements zsq0, yey0 {
    public final JsonParserComponent a;

    public x5k(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final hex a(yf90 yf90Var, JSONObject jSONObject) {
        return new z5k(wcx.c(udq0.Q(yf90Var), jSONObject, "content", yf90Var.i(), null, this.a.d0));
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, z5k z5kVar) {
        JSONObject jSONObject = new JSONObject();
        wcx.u(yf90Var, jSONObject, "content", z5kVar.a, this.a.d0);
        wwg.Z(yf90Var, jSONObject, "type", "copy_to_clipboard");
        return jSONObject;
    }
}
