package defpackage;

import com.yandex.div.internal.parser.b;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class vwk implements zsq0, yey0 {
    public static ywk c(yf90 yf90Var, ywk ywkVar, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        exq j = wcx.j(Q, jSONObject, "allow_empty", wm11.a, i, ywkVar != null ? ywkVar.a : null, b.f, q5z.b);
        ums umsVar = wm11.c;
        return new ywk(j, wcx.d(Q, jSONObject, "label_id", umsVar, i, ywkVar != null ? ywkVar.b : null), wcx.d(Q, jSONObject, "pattern", umsVar, i, ywkVar != null ? ywkVar.c : null), wcx.a(Q, jSONObject, "variable", i, ywkVar != null ? ywkVar.d : null));
    }

    public static JSONObject d(yf90 yf90Var, ywk ywkVar) {
        JSONObject jSONObject = new JSONObject();
        wcx.q(yf90Var, jSONObject, "allow_empty", ywkVar.a);
        wcx.q(yf90Var, jSONObject, "label_id", ywkVar.b);
        wcx.q(yf90Var, jSONObject, "pattern", ywkVar.c);
        wwg.Z(yf90Var, jSONObject, "type", "regex");
        wcx.t(yf90Var, jSONObject, "variable", ywkVar.d);
        return jSONObject;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (ywk) obj);
    }
}
