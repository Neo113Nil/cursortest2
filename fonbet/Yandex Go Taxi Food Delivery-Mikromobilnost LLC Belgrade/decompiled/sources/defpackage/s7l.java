package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.DivAnimationInterpolator;
import com.yandex.div2.m1;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class s7l implements zsq0, yey0 {
    public static u7l c(yf90 yf90Var, u7l u7lVar, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        tms tmsVar = wm11.b;
        exq exqVar = u7lVar != null ? u7lVar.a : null;
        tls tlsVar = b.h;
        exq j = wcx.j(Q, jSONObject, "duration", tmsVar, i, exqVar, tlsVar, m1.h);
        exq j2 = wcx.j(Q, jSONObject, "interpolator", m1.g, i, u7lVar != null ? u7lVar.b : null, DivAnimationInterpolator.FROM_STRING, q5z.b);
        sms smsVar = wm11.d;
        exq exqVar2 = u7lVar != null ? u7lVar.c : null;
        tls tlsVar2 = b.g;
        return new u7l(j, j2, wcx.j(Q, jSONObject, "pivot_x", smsVar, i, exqVar2, tlsVar2, m1.i), wcx.j(Q, jSONObject, "pivot_y", smsVar, i, u7lVar != null ? u7lVar.d : null, tlsVar2, m1.j), wcx.j(Q, jSONObject, "scale", smsVar, i, u7lVar != null ? u7lVar.e : null, tlsVar2, m1.k), wcx.j(Q, jSONObject, "start_delay", tmsVar, i, u7lVar != null ? u7lVar.f : null, tlsVar, m1.l));
    }

    public static JSONObject d(yf90 yf90Var, u7l u7lVar) {
        JSONObject jSONObject = new JSONObject();
        wcx.q(yf90Var, jSONObject, "duration", u7lVar.a);
        wcx.p(u7lVar.b, DivAnimationInterpolator.TO_STRING, yf90Var, "interpolator", jSONObject);
        wcx.q(yf90Var, jSONObject, "pivot_x", u7lVar.c);
        wcx.q(yf90Var, jSONObject, "pivot_y", u7lVar.d);
        wcx.q(yf90Var, jSONObject, "scale", u7lVar.e);
        wcx.q(yf90Var, jSONObject, "start_delay", u7lVar.f);
        wwg.Z(yf90Var, jSONObject, "type", "scale");
        return jSONObject;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (u7l) obj);
    }
}
