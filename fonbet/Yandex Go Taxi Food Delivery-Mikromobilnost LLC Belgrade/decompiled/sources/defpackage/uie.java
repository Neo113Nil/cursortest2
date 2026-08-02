package defpackage;

import com.yandex.div.internal.parser.b;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class uie implements zsq0, yey0 {
    public static wie c(yf90 yf90Var, wie wieVar, JSONObject jSONObject) {
        return new wie(wcx.e(udq0.Q(yf90Var), jSONObject, "value", wm11.e, yf90Var.i(), wieVar != null ? wieVar.a : null, b.e, q5z.b));
    }

    public static JSONObject d(yf90 yf90Var, wie wieVar) {
        JSONObject w = n.w(yf90Var, "type", "url");
        wcx.p(wieVar.a, b.c, yf90Var, "value", w);
        return w;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (wie) obj);
    }
}
