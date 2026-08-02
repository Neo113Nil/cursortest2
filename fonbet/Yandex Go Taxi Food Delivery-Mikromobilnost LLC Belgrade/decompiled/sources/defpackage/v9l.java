package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.x1;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class v9l implements zsq0, yey0 {
    @Override // defpackage.yey0, defpackage.nyi
    public final hex a(yf90 yf90Var, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        return new w9l(wcx.j(Q, jSONObject, "unit", x1.b, i, null, DivSizeUnit.FROM_STRING, q5z.b), wcx.e(Q, jSONObject, "value", wm11.b, i, null, b.h, x1.c));
    }

    @Override // defpackage.zsq0
    public final JSONObject b(yf90 yf90Var, Object obj) {
        w9l w9lVar = (w9l) obj;
        JSONObject jSONObject = new JSONObject();
        wcx.p(w9lVar.a, DivSizeUnit.TO_STRING, yf90Var, "unit", jSONObject);
        wcx.q(yf90Var, jSONObject, "value", w9lVar.b);
        return jSONObject;
    }
}
