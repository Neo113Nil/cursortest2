package defpackage;

import com.yandex.div.internal.parser.b;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class vn60 implements zsq0, yey0 {
    public static xn60 c(yf90 yf90Var, xn60 xn60Var, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        return new xn60(wcx.a(Q, jSONObject, "name", i, xn60Var != null ? xn60Var.a : null), wcx.e(Q, jSONObject, "value", wm11.d, i, xn60Var != null ? xn60Var.b : null, b.g, q5z.b));
    }

    public static JSONObject d(yf90 yf90Var, xn60 xn60Var) {
        JSONObject jSONObject = new JSONObject();
        wcx.t(yf90Var, jSONObject, "name", xn60Var.a);
        wwg.Z(yf90Var, jSONObject, "type", "number");
        wcx.q(yf90Var, jSONObject, "value", xn60Var.b);
        return jSONObject;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (xn60) obj);
    }
}
