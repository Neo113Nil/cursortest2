package defpackage;

import com.yandex.div.internal.parser.a;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class s6k implements zsq0, nyi {
    public static r6k c(yf90 yf90Var, JSONObject jSONObject) {
        return new r6k(a.a(yf90Var, jSONObject, "element_id", wm11.c));
    }

    public static JSONObject d(yf90 yf90Var, r6k r6kVar) {
        JSONObject jSONObject = new JSONObject();
        a.g(yf90Var, jSONObject, "element_id", r6kVar.a);
        wwg.Z(yf90Var, jSONObject, "type", "focus_element");
        return jSONObject;
    }

    @Override // defpackage.nyi
    public final /* bridge */ /* synthetic */ Object a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (r6k) obj);
    }
}
