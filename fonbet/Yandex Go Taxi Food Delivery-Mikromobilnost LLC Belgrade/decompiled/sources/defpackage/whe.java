package defpackage;

import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class whe implements zsq0, yey0 {
    public static JSONObject c(yf90 yf90Var, yhe yheVar) {
        JSONObject w = n.w(yf90Var, "type", "text");
        wcx.q(yf90Var, w, "value", yheVar.a);
        return w;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final hex a(yf90 yf90Var, JSONObject jSONObject) {
        return new yhe(wcx.d(udq0.Q(yf90Var), jSONObject, "value", wm11.c, yf90Var.i(), null));
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return c(yf90Var, (yhe) obj);
    }
}
