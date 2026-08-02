package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div.state.db.StateEntry;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class w8k implements zsq0, yey0 {
    public static z8k c(yf90 yf90Var, z8k z8kVar, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        return new z8k(wcx.d(Q, jSONObject, StateEntry.COLUMN_STATE_ID, wm11.c, i, z8kVar != null ? z8kVar.a : null), wcx.j(Q, jSONObject, "temporary", wm11.a, i, z8kVar != null ? z8kVar.b : null, b.f, q5z.b));
    }

    public static JSONObject d(yf90 yf90Var, z8k z8kVar) {
        JSONObject jSONObject = new JSONObject();
        wcx.q(yf90Var, jSONObject, StateEntry.COLUMN_STATE_ID, z8kVar.a);
        wcx.q(yf90Var, jSONObject, "temporary", z8kVar.b);
        wwg.Z(yf90Var, jSONObject, "type", "set_state");
        return jSONObject;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (z8k) obj);
    }
}
