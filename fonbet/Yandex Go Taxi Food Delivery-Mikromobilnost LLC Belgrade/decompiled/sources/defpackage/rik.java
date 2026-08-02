package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class rik implements qfy0 {
    public final JsonParserComponent a;

    public rik(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final oik a(yf90 yf90Var, tik tikVar, JSONObject jSONObject) {
        Expression l = xcx.l(yf90Var, tikVar.a, jSONObject, "background_color", wm11.f, b.b);
        exq exqVar = tikVar.b;
        JsonParserComponent jsonParserComponent = this.a;
        sqk sqkVar = (sqk) xcx.h(yf90Var, exqVar, jSONObject, "radius", jsonParserComponent.G3, jsonParserComponent.E3);
        if (sqkVar == null) {
            sqkVar = sik.a;
        }
        return new oik(l, sqkVar, (bcl) xcx.h(yf90Var, tikVar.c, jSONObject, "stroke", jsonParserComponent.a8, jsonParserComponent.Y7));
    }
}
