package defpackage;

import com.yandex.div2.DivRadialGradientRelativeRadius$Value;
import com.yandex.div2.l1;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class w6l implements zsq0, yey0 {
    public static y6l c(yf90 yf90Var, y6l y6lVar, JSONObject jSONObject) {
        return new y6l(wcx.e(udq0.Q(yf90Var), jSONObject, "value", l1.a, yf90Var.i(), y6lVar != null ? y6lVar.a : null, DivRadialGradientRelativeRadius$Value.FROM_STRING, q5z.b));
    }

    public static JSONObject d(yf90 yf90Var, y6l y6lVar) {
        JSONObject w = n.w(yf90Var, "type", "relative");
        wcx.p(y6lVar.a, DivRadialGradientRelativeRadius$Value.TO_STRING, yf90Var, "value", w);
        return w;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (y6l) obj);
    }
}
