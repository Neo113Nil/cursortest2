package defpackage;

import com.yandex.div.internal.parser.b;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class qn60 implements zsq0, yey0 {
    public static sn60 c(yf90 yf90Var, sn60 sn60Var, JSONObject jSONObject) {
        return new sn60(wcx.e(udq0.Q(yf90Var), jSONObject, "value", wm11.d, yf90Var.i(), sn60Var != null ? sn60Var.a : null, b.g, q5z.b));
    }

    public static JSONObject d(yf90 yf90Var, sn60 sn60Var) {
        JSONObject w = n.w(yf90Var, "type", "number");
        wcx.q(yf90Var, w, "value", sn60Var.a);
        return w;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (sn60) obj);
    }
}
