package defpackage;

import com.yandex.div.internal.parser.b;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class q6l implements zsq0, yey0 {
    public static s6l c(yf90 yf90Var, s6l s6lVar, JSONObject jSONObject) {
        return new s6l(wcx.e(udq0.Q(yf90Var), jSONObject, "value", wm11.d, yf90Var.i(), s6lVar != null ? s6lVar.a : null, b.g, q5z.b));
    }

    public static JSONObject d(yf90 yf90Var, s6l s6lVar) {
        JSONObject w = n.w(yf90Var, "type", "relative");
        wcx.q(yf90Var, w, "value", s6lVar.a);
        return w;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (s6l) obj);
    }
}
