package defpackage;

import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class u3l implements zsq0, yey0 {
    public static JSONObject c(yf90 yf90Var, w3l w3lVar) {
        JSONObject jSONObject = new JSONObject();
        wcx.t(yf90Var, jSONObject, "raw_text_variable", w3lVar.a);
        wwg.Z(yf90Var, jSONObject, "type", "phone");
        return jSONObject;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final hex a(yf90 yf90Var, JSONObject jSONObject) {
        return new w3l(wcx.a(udq0.Q(yf90Var), jSONObject, "raw_text_variable", yf90Var.i(), null));
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return c(yf90Var, (w3l) obj);
    }
}
