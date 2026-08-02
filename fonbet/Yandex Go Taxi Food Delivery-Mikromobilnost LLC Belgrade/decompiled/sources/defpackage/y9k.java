package defpackage;

import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class y9k implements zsq0, yey0 {
    @Override // defpackage.yey0, defpackage.nyi
    public final hex a(yf90 yf90Var, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        ums umsVar = wm11.c;
        return new bak(wcx.d(Q, jSONObject, "name", umsVar, i, null), wcx.d(Q, jSONObject, "value", umsVar, i, null));
    }

    @Override // defpackage.zsq0
    public final JSONObject b(yf90 yf90Var, Object obj) {
        bak bakVar = (bak) obj;
        JSONObject jSONObject = new JSONObject();
        wcx.q(yf90Var, jSONObject, "name", bakVar.a);
        wcx.q(yf90Var, jSONObject, "value", bakVar.b);
        return jSONObject;
    }
}
