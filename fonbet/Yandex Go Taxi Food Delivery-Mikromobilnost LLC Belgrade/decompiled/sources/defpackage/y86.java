package defpackage;

import com.yandex.div.internal.parser.b;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class y86 implements zsq0, yey0 {
    public static a96 c(yf90 yf90Var, a96 a96Var, JSONObject jSONObject) {
        return new a96(wcx.e(udq0.Q(yf90Var), jSONObject, "value", wm11.a, yf90Var.i(), a96Var != null ? a96Var.a : null, b.f, q5z.b));
    }

    public static JSONObject d(yf90 yf90Var, a96 a96Var) {
        JSONObject w = n.w(yf90Var, "type", "boolean");
        wcx.q(yf90Var, w, "value", a96Var.a);
        return w;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (a96) obj);
    }
}
