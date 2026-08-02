package defpackage;

import com.yandex.div.internal.parser.a;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class vhe implements zsq0, nyi {
    public static JSONObject c(yf90 yf90Var, uhe uheVar) {
        JSONObject w = n.w(yf90Var, "type", "text");
        a.g(yf90Var, w, "value", uheVar.a);
        return w;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        return new uhe(a.a(yf90Var, jSONObject, "value", wm11.c));
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return c(yf90Var, (uhe) obj);
    }
}
