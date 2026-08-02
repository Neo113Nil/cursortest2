package defpackage;

import com.yandex.div.internal.parser.b;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class q4k implements zsq0, yey0 {
    public static s4k c(yf90 yf90Var, s4k s4kVar, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        return new s4k(wcx.e(Q, jSONObject, "index", wm11.b, i, s4kVar != null ? s4kVar.a : null, b.h, q5z.b), wcx.d(Q, jSONObject, "variable_name", wm11.c, i, s4kVar != null ? s4kVar.b : null));
    }

    public static JSONObject d(yf90 yf90Var, s4k s4kVar) {
        JSONObject jSONObject = new JSONObject();
        wcx.q(yf90Var, jSONObject, "index", s4kVar.a);
        wwg.Z(yf90Var, jSONObject, "type", "array_remove_value");
        wcx.q(yf90Var, jSONObject, "variable_name", s4kVar.b);
        return jSONObject;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (s4k) obj);
    }
}
