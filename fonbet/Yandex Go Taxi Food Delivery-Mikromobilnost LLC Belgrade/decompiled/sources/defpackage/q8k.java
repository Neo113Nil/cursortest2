package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class q8k implements zsq0, nyi {
    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        tms tmsVar = wm11.b;
        tls tlsVar = b.h;
        return new l8k(a.d(yf90Var, jSONObject, "end", tmsVar, tlsVar), a.b(yf90Var, jSONObject, "start", tmsVar, tlsVar, q5z.b));
    }

    @Override // defpackage.zsq0
    public final JSONObject b(yf90 yf90Var, Object obj) {
        l8k l8kVar = (l8k) obj;
        JSONObject jSONObject = new JSONObject();
        a.g(yf90Var, jSONObject, "end", l8kVar.a);
        a.g(yf90Var, jSONObject, "start", l8kVar.b);
        wwg.Z(yf90Var, jSONObject, "type", "absolute");
        return jSONObject;
    }
}
