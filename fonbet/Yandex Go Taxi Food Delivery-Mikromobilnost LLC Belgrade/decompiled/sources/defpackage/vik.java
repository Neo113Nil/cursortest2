package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class vik implements zsq0, nyi {
    public final JsonParserComponent a;

    public vik(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final uik a(yf90 yf90Var, JSONObject jSONObject) {
        return new uik(a.b(yf90Var, jSONObject, "color", wm11.f, b.b, q5z.b), a.b(yf90Var, jSONObject, "corner_radius", wm11.b, b.h, r991.a), (DivEdgeInsets) wwg.M(yf90Var, jSONObject, "paddings", this.a.g3));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, uik uikVar) {
        JSONObject jSONObject = new JSONObject();
        a.h(yf90Var, jSONObject, "color", uikVar.a, b.a);
        a.g(yf90Var, jSONObject, "corner_radius", uikVar.b);
        wwg.b0(yf90Var, jSONObject, "paddings", uikVar.c, this.a.g3);
        wwg.Z(yf90Var, jSONObject, "type", "cloud");
        return jSONObject;
    }
}
