package defpackage;

import com.yandex.div.internal.parser.a;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class q63 implements zsq0, nyi {
    public static JSONObject c(yf90 yf90Var, p63 p63Var) {
        JSONObject w = n.w(yf90Var, "type", "array");
        a.g(yf90Var, w, "value", p63Var.a);
        return w;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        return new p63(a.a(yf90Var, jSONObject, "value", wm11.g));
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return c(yf90Var, (p63) obj);
    }
}
