package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.DivAnimationInterpolator;
import com.yandex.div2.p;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class yhk implements zsq0, yey0 {
    public static aik c(yf90 yf90Var, aik aikVar, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        tms tmsVar = wm11.b;
        exq exqVar = aikVar != null ? aikVar.a : null;
        tls tlsVar = b.h;
        return new aik(wcx.j(Q, jSONObject, "duration", tmsVar, i, exqVar, tlsVar, p.e), wcx.j(Q, jSONObject, "interpolator", p.d, i, aikVar != null ? aikVar.b : null, DivAnimationInterpolator.FROM_STRING, q5z.b), wcx.j(Q, jSONObject, "start_delay", tmsVar, i, aikVar != null ? aikVar.c : null, tlsVar, p.f));
    }

    public static JSONObject d(yf90 yf90Var, aik aikVar) {
        JSONObject jSONObject = new JSONObject();
        wcx.q(yf90Var, jSONObject, "duration", aikVar.a);
        wcx.p(aikVar.b, DivAnimationInterpolator.TO_STRING, yf90Var, "interpolator", jSONObject);
        wcx.q(yf90Var, jSONObject, "start_delay", aikVar.c);
        wwg.Z(yf90Var, jSONObject, "type", "change_bounds");
        return jSONObject;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (aik) obj);
    }
}
