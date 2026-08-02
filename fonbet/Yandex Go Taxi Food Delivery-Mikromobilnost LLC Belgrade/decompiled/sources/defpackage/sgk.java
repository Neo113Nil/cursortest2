package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class sgk implements zsq0, yey0 {
    public final JsonParserComponent a;

    public sgk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final hex a(yf90 yf90Var, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        exq j = wcx.j(Q, jSONObject, "corner_radius", wm11.b, i, null, b.h, tgk.b);
        JsonParserComponent jsonParserComponent = this.a;
        return new vgk(j, wcx.i(Q, jSONObject, "corners_radius", i, null, jsonParserComponent.C2), wcx.j(Q, jSONObject, "has_shadow", wm11.a, i, null, b.f, q5z.b), wcx.i(Q, jSONObject, "shadow", i, null, jsonParserComponent.d7), wcx.i(Q, jSONObject, "stroke", i, null, jsonParserComponent.Z7));
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, vgk vgkVar) {
        JSONObject jSONObject = new JSONObject();
        wcx.q(yf90Var, jSONObject, "corner_radius", vgkVar.a);
        exq exqVar = vgkVar.b;
        JsonParserComponent jsonParserComponent = this.a;
        wcx.u(yf90Var, jSONObject, "corners_radius", exqVar, jsonParserComponent.C2);
        wcx.q(yf90Var, jSONObject, "has_shadow", vgkVar.c);
        wcx.u(yf90Var, jSONObject, "shadow", vgkVar.d, jsonParserComponent.d7);
        wcx.u(yf90Var, jSONObject, "stroke", vgkVar.e, jsonParserComponent.Z7);
        return jSONObject;
    }
}
