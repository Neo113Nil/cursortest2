package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class w5k implements zsq0, nyi {
    public final JsonParserComponent a;

    public w5k(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final m5k a(yf90 yf90Var, JSONObject jSONObject) {
        return new m5k((p5k) wwg.E(yf90Var, jSONObject, "content", this.a.c0));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, m5k m5kVar) {
        JSONObject jSONObject = new JSONObject();
        wwg.b0(yf90Var, jSONObject, "content", m5kVar.a, this.a.c0);
        wwg.Z(yf90Var, jSONObject, "type", "copy_to_clipboard");
        return jSONObject;
    }
}
