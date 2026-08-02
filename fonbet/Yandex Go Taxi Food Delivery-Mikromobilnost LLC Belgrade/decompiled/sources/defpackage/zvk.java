package defpackage;

import com.yandex.div.internal.parser.b;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class zvk implements zsq0, yey0 {
    @Override // defpackage.yey0, defpackage.nyi
    public final hex a(yf90 yf90Var, JSONObject jSONObject) {
        return new awk(wcx.e(udq0.Q(yf90Var), jSONObject, "color", wm11.f, yf90Var.i(), null, b.b, q5z.b));
    }

    @Override // defpackage.zsq0
    public final JSONObject b(yf90 yf90Var, Object obj) {
        JSONObject jSONObject = new JSONObject();
        wcx.p(((awk) obj).a, b.a, yf90Var, "color", jSONObject);
        return jSONObject;
    }
}
