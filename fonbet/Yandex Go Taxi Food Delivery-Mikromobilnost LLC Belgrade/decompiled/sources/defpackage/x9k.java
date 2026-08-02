package defpackage;

import com.yandex.div.internal.parser.a;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class x9k implements zsq0, nyi {
    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        ums umsVar = wm11.c;
        return new q9k(a.a(yf90Var, jSONObject, "name", umsVar), a.b(yf90Var, jSONObject, "value", umsVar, q5z.c, q5z.b));
    }

    @Override // defpackage.zsq0
    public final JSONObject b(yf90 yf90Var, Object obj) {
        q9k q9kVar = (q9k) obj;
        JSONObject jSONObject = new JSONObject();
        a.g(yf90Var, jSONObject, "name", q9kVar.a);
        a.g(yf90Var, jSONObject, "value", q9kVar.b);
        return jSONObject;
    }
}
