package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class u5l implements zsq0, nyi {
    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        return new j5l(a.b(yf90Var, jSONObject, "color", wm11.f, b.b, q5z.b), a.b(yf90Var, jSONObject, "position", wm11.d, b.g, ea91.a));
    }

    @Override // defpackage.zsq0
    public final JSONObject b(yf90 yf90Var, Object obj) {
        j5l j5lVar = (j5l) obj;
        JSONObject jSONObject = new JSONObject();
        a.h(yf90Var, jSONObject, "color", j5lVar.a, b.a);
        a.g(yf90Var, jSONObject, "position", j5lVar.b);
        return jSONObject;
    }
}
