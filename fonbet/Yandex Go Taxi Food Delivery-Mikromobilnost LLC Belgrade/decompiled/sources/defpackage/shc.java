package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class shc implements zsq0, nyi {
    public static rhc c(yf90 yf90Var, JSONObject jSONObject) {
        return new rhc(a.b(yf90Var, jSONObject, "value", wm11.f, b.b, q5z.b), (String) wwg.F("name", jSONObject));
    }

    public static JSONObject d(yf90 yf90Var, rhc rhcVar) {
        JSONObject jSONObject = new JSONObject();
        wwg.Z(yf90Var, jSONObject, "name", rhcVar.a);
        wwg.Z(yf90Var, jSONObject, "type", "color");
        a.h(yf90Var, jSONObject, "value", rhcVar.b, b.a);
        return jSONObject;
    }

    @Override // defpackage.nyi
    public final /* bridge */ /* synthetic */ Object a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (rhc) obj);
    }
}
