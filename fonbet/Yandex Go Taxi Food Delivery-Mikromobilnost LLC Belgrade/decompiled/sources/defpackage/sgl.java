package defpackage;

import com.yandex.div.internal.parser.b;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class sgl implements zsq0, yey0 {
    @Override // defpackage.yey0, defpackage.nyi
    public final hex a(yf90 yf90Var, JSONObject jSONObject) {
        return new ugl(wcx.j(udq0.Q(yf90Var), jSONObject, "is_enabled", wm11.a, yf90Var.i(), null, b.f, q5z.b));
    }

    @Override // defpackage.zsq0
    public final JSONObject b(yf90 yf90Var, Object obj) {
        JSONObject jSONObject = new JSONObject();
        wcx.q(yf90Var, jSONObject, "is_enabled", ((ugl) obj).a);
        return jSONObject;
    }
}
