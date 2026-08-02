package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class un60 implements zsq0, nyi {
    public static tn60 c(yf90 yf90Var, JSONObject jSONObject) {
        return new tn60(a.b(yf90Var, jSONObject, "value", wm11.d, b.g, q5z.b), (String) wwg.F("name", jSONObject));
    }

    public static JSONObject d(yf90 yf90Var, tn60 tn60Var) {
        JSONObject jSONObject = new JSONObject();
        wwg.Z(yf90Var, jSONObject, "name", tn60Var.a);
        wwg.Z(yf90Var, jSONObject, "type", "number");
        a.g(yf90Var, jSONObject, "value", tn60Var.b);
        return jSONObject;
    }

    @Override // defpackage.nyi
    public final /* bridge */ /* synthetic */ Object a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (tn60) obj);
    }
}
