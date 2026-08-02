package defpackage;

import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class t6k implements zsq0, yey0 {
    public static JSONObject c(yf90 yf90Var, v6k v6kVar) {
        JSONObject jSONObject = new JSONObject();
        wcx.q(yf90Var, jSONObject, "element_id", v6kVar.a);
        wwg.Z(yf90Var, jSONObject, "type", "focus_element");
        return jSONObject;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final hex a(yf90 yf90Var, JSONObject jSONObject) {
        return new v6k(wcx.d(udq0.Q(yf90Var), jSONObject, "element_id", wm11.c, yf90Var.i(), null));
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return c(yf90Var, (v6k) obj);
    }
}
