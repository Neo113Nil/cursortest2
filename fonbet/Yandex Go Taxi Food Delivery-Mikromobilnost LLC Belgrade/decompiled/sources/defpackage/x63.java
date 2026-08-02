package defpackage;

import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class x63 implements zsq0, yey0 {
    public static z63 c(yf90 yf90Var, z63 z63Var, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        return new z63(wcx.a(Q, jSONObject, "name", i, z63Var != null ? z63Var.a : null), wcx.d(Q, jSONObject, "value", wm11.g, i, z63Var != null ? z63Var.b : null));
    }

    public static JSONObject d(yf90 yf90Var, z63 z63Var) {
        JSONObject jSONObject = new JSONObject();
        wcx.t(yf90Var, jSONObject, "name", z63Var.a);
        wwg.Z(yf90Var, jSONObject, "type", "array");
        wcx.q(yf90Var, jSONObject, "value", z63Var.b);
        return jSONObject;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (z63) obj);
    }
}
