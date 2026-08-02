package defpackage;

import com.yandex.div.internal.parser.b;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class zu60 implements zsq0, yey0 {
    public static bv60 c(yf90 yf90Var, bv60 bv60Var, JSONObject jSONObject) {
        return new bv60(wcx.e(udq0.Q(yf90Var), jSONObject, "value", wm11.b, yf90Var.i(), bv60Var != null ? bv60Var.a : null, b.h, rm91.a));
    }

    public static JSONObject d(yf90 yf90Var, bv60 bv60Var) {
        JSONObject w = n.w(yf90Var, "type", "offset");
        wcx.q(yf90Var, w, "value", bv60Var.a);
        return w;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (bv60) obj);
    }
}
