package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class wik implements zsq0, yey0 {
    public final JsonParserComponent a;

    public wik(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    public final yik c(yf90 yf90Var, yik yikVar, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        return new yik(wcx.e(Q, jSONObject, "color", wm11.f, i, yikVar != null ? yikVar.a : null, b.b, q5z.b), wcx.e(Q, jSONObject, "corner_radius", wm11.b, i, yikVar != null ? yikVar.b : null, b.h, r991.a), wcx.i(Q, jSONObject, "paddings", i, yikVar != null ? yikVar.c : null, this.a.h3));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, yik yikVar) {
        JSONObject jSONObject = new JSONObject();
        wcx.p(yikVar.a, b.a, yf90Var, "color", jSONObject);
        wcx.q(yf90Var, jSONObject, "corner_radius", yikVar.b);
        wcx.u(yf90Var, jSONObject, "paddings", yikVar.c, this.a.h3);
        wwg.Z(yf90Var, jSONObject, "type", "cloud");
        return jSONObject;
    }
}
