package defpackage;

import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class w9k implements qfy0 {
    public final JsonParserComponent a;

    public w9k(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final t9k a(yf90 yf90Var, dak dakVar, JSONObject jSONObject) {
        Expression c = xcx.c(yf90Var, dakVar.a, jSONObject, "container_id", wm11.c);
        exq exqVar = dakVar.b;
        JsonParserComponent jsonParserComponent = this.a;
        i3y i3yVar = jsonParserComponent.v1;
        i3y i3yVar2 = jsonParserComponent.t1;
        return new t9k(c, xcx.s(yf90Var, exqVar, jSONObject, "on_fail_actions", i3yVar, i3yVar2), xcx.s(yf90Var, dakVar.c, jSONObject, "on_success_actions", jsonParserComponent.v1, i3yVar2), (s9k) xcx.b(yf90Var, dakVar.d, jSONObject, "request", jsonParserComponent.d1, jsonParserComponent.b1));
    }
}
