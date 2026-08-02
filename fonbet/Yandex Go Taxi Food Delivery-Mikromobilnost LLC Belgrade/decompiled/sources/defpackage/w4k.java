package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class w4k implements qfy0 {
    public final JsonParserComponent a;

    public w4k(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final t4k a(yf90 yf90Var, x4k x4kVar, JSONObject jSONObject) {
        Expression d = xcx.d(yf90Var, x4kVar.a, jSONObject, "index", wm11.b, b.h);
        exq exqVar = x4kVar.b;
        JsonParserComponent jsonParserComponent = this.a;
        return new t4k(d, (xll) xcx.b(yf90Var, exqVar, jSONObject, "value", jsonParserComponent.E9, jsonParserComponent.C9), xcx.c(yf90Var, x4kVar.c, jSONObject, "variable_name", wm11.c));
    }
}
