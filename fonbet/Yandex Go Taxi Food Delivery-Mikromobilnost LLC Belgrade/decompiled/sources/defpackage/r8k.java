package defpackage;

import com.yandex.div.internal.parser.b;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class r8k implements zsq0, yey0 {
    @Override // defpackage.yey0, defpackage.nyi
    public final hex a(yf90 yf90Var, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        tms tmsVar = wm11.b;
        tls tlsVar = b.h;
        kbs kbsVar = q5z.b;
        return new s8k(wcx.j(Q, jSONObject, "end", tmsVar, i, null, tlsVar, kbsVar), wcx.e(Q, jSONObject, "start", tmsVar, i, null, tlsVar, kbsVar));
    }

    @Override // defpackage.zsq0
    public final JSONObject b(yf90 yf90Var, Object obj) {
        s8k s8kVar = (s8k) obj;
        JSONObject jSONObject = new JSONObject();
        wcx.q(yf90Var, jSONObject, "end", s8kVar.a);
        wcx.q(yf90Var, jSONObject, "start", s8kVar.b);
        wwg.Z(yf90Var, jSONObject, "type", "absolute");
        return jSONObject;
    }
}
