package defpackage;

import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class squ0 implements zsq0, yey0 {
    public static uqu0 c(yf90 yf90Var, uqu0 uqu0Var, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        return new uqu0(wcx.a(Q, jSONObject, "name", i, uqu0Var != null ? uqu0Var.a : null), wcx.d(Q, jSONObject, "value", wm11.c, i, uqu0Var != null ? uqu0Var.b : null));
    }

    public static JSONObject d(yf90 yf90Var, uqu0 uqu0Var) {
        JSONObject jSONObject = new JSONObject();
        wcx.t(yf90Var, jSONObject, "name", uqu0Var.a);
        wwg.Z(yf90Var, jSONObject, "type", "string");
        wcx.q(yf90Var, jSONObject, "value", uqu0Var.b);
        return jSONObject;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (uqu0) obj);
    }
}
