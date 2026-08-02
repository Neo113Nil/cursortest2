package defpackage;

import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class r63 implements zsq0, yey0 {
    public static JSONObject c(yf90 yf90Var, t63 t63Var) {
        JSONObject w = n.w(yf90Var, "type", "array");
        wcx.q(yf90Var, w, "value", t63Var.a);
        return w;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final hex a(yf90 yf90Var, JSONObject jSONObject) {
        return new t63(wcx.d(udq0.Q(yf90Var), jSONObject, "value", wm11.g, yf90Var.i(), null));
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return c(yf90Var, (t63) obj);
    }
}
