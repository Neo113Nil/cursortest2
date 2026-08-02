package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.k1;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class y5l implements zsq0, yey0 {
    public static a6l c(yf90 yf90Var, a6l a6lVar, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        qkj qkjVar = k1.b;
        exq exqVar = a6lVar != null ? a6lVar.a : null;
        tls tlsVar = DivSizeUnit.FROM_STRING;
        kbs kbsVar = q5z.b;
        return new a6l(wcx.j(Q, jSONObject, "unit", qkjVar, i, exqVar, tlsVar, kbsVar), wcx.e(Q, jSONObject, "value", wm11.b, i, a6lVar != null ? a6lVar.b : null, b.h, kbsVar));
    }

    public static JSONObject d(yf90 yf90Var, a6l a6lVar) {
        JSONObject w = n.w(yf90Var, "type", "fixed");
        wcx.p(a6lVar.a, DivSizeUnit.TO_STRING, yf90Var, "unit", w);
        wcx.q(yf90Var, w, "value", a6lVar.b);
        return w;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (a6l) obj);
    }
}
