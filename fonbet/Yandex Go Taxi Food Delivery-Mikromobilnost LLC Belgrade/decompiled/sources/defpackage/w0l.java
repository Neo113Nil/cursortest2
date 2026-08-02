package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class w0l implements qfy0 {
    public final JsonParserComponent a;

    public w0l(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.qfy0
    public final Object a(yf90 yf90Var, hex hexVar, JSONObject jSONObject) {
        exq exqVar = ((x0l) hexVar).a;
        JsonParserComponent jsonParserComponent = this.a;
        return new t0l((j3l) xcx.b(yf90Var, exqVar, jSONObject, "page_width", jsonParserComponent.T5, jsonParserComponent.R5));
    }
}
