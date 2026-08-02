package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class xik implements qfy0 {
    public final JsonParserComponent a;

    public xik(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final uik a(yf90 yf90Var, yik yikVar, JSONObject jSONObject) {
        Expression d = xcx.d(yf90Var, yikVar.a, jSONObject, "color", wm11.f, b.b);
        Expression e = xcx.e(yf90Var, yikVar.b, jSONObject, "corner_radius", wm11.b, b.h, r991.a);
        exq exqVar = yikVar.c;
        JsonParserComponent jsonParserComponent = this.a;
        return new uik(d, e, (DivEdgeInsets) xcx.h(yf90Var, exqVar, jSONObject, "paddings", jsonParserComponent.i3, jsonParserComponent.g3));
    }
}
