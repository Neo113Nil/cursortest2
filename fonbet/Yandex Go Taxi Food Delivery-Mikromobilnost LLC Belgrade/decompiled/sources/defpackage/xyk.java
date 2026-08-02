package defpackage;

import com.yandex.div.internal.parser.b;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class xyk implements zsq0, yey0 {
    @Override // defpackage.yey0, defpackage.nyi
    public final hex a(yf90 yf90Var, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        return new czk(wcx.e(Q, jSONObject, "color", wm11.f, i, null, b.b, q5z.b), wcx.e(Q, jSONObject, "position", wm11.d, i, null, b.g, vez0.a));
    }

    @Override // defpackage.zsq0
    public final JSONObject b(yf90 yf90Var, Object obj) {
        czk czkVar = (czk) obj;
        JSONObject jSONObject = new JSONObject();
        wcx.p(czkVar.a, b.a, yf90Var, "color", jSONObject);
        wcx.q(yf90Var, jSONObject, "position", czkVar.b);
        return jSONObject;
    }
}
