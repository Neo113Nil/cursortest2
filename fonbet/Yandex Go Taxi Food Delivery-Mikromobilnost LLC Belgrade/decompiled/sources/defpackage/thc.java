package defpackage;

import com.yandex.div.internal.parser.b;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class thc implements zsq0, yey0 {
    public static vhc c(yf90 yf90Var, vhc vhcVar, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        return new vhc(wcx.a(Q, jSONObject, "name", i, vhcVar != null ? vhcVar.a : null), wcx.e(Q, jSONObject, "value", wm11.f, i, vhcVar != null ? vhcVar.b : null, b.b, q5z.b));
    }

    public static JSONObject d(yf90 yf90Var, vhc vhcVar) {
        JSONObject jSONObject = new JSONObject();
        wcx.t(yf90Var, jSONObject, "name", vhcVar.a);
        wwg.Z(yf90Var, jSONObject, "type", "color");
        wcx.p(vhcVar.b, b.a, yf90Var, "value", jSONObject);
        return jSONObject;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (vhc) obj);
    }
}
