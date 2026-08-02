package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class x8l implements qfy0 {
    public final JsonParserComponent a;

    public x8l(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final u8l a(yf90 yf90Var, y8l y8lVar, JSONObject jSONObject) {
        Expression d = xcx.d(yf90Var, y8lVar.a, jSONObject, "color", wm11.f, b.b);
        exq exqVar = y8lVar.b;
        JsonParserComponent jsonParserComponent = this.a;
        return new u8l(d, (t8l) xcx.b(yf90Var, exqVar, jSONObject, "shape", jsonParserComponent.k7, jsonParserComponent.i7), (bcl) xcx.h(yf90Var, y8lVar.c, jSONObject, "stroke", jsonParserComponent.a8, jsonParserComponent.Y7));
    }
}
