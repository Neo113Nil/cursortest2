package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class y5k implements qfy0 {
    public final JsonParserComponent a;

    public y5k(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.qfy0
    public final Object a(yf90 yf90Var, hex hexVar, JSONObject jSONObject) {
        exq exqVar = ((z5k) hexVar).a;
        JsonParserComponent jsonParserComponent = this.a;
        return new m5k((p5k) xcx.b(yf90Var, exqVar, jSONObject, "content", jsonParserComponent.e0, jsonParserComponent.c0));
    }
}
