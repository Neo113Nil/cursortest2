package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class wyk implements zsq0, nyi {
    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        return new uyk(a.b(yf90Var, jSONObject, "color", wm11.f, b.b, q5z.b), a.b(yf90Var, jSONObject, "position", wm11.d, b.g, vez0.a));
    }

    @Override // defpackage.zsq0
    public final JSONObject b(yf90 yf90Var, Object obj) {
        uyk uykVar = (uyk) obj;
        JSONObject jSONObject = new JSONObject();
        a.h(yf90Var, jSONObject, "color", uykVar.a, b.a);
        a.g(yf90Var, jSONObject, "position", uykVar.b);
        return jSONObject;
    }
}
