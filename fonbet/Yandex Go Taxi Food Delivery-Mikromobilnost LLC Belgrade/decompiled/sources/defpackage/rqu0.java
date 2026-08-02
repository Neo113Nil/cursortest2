package defpackage;

import com.yandex.div.internal.parser.a;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class rqu0 implements zsq0, nyi {
    public static qqu0 c(yf90 yf90Var, JSONObject jSONObject) {
        return new qqu0(a.b(yf90Var, jSONObject, "value", wm11.c, q5z.c, q5z.b), (String) wwg.F("name", jSONObject));
    }

    public static JSONObject d(yf90 yf90Var, qqu0 qqu0Var) {
        JSONObject jSONObject = new JSONObject();
        wwg.Z(yf90Var, jSONObject, "name", qqu0Var.a);
        wwg.Z(yf90Var, jSONObject, "type", "string");
        a.g(yf90Var, jSONObject, "value", qqu0Var.b);
        return jSONObject;
    }

    @Override // defpackage.nyi
    public final /* bridge */ /* synthetic */ Object a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (qqu0) obj);
    }
}
