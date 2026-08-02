package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.d0;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class uqk implements zsq0, yey0 {
    public static wqk c(yf90 yf90Var, wqk wqkVar, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        return new wqk(wcx.j(Q, jSONObject, "unit", d0.b, i, wqkVar != null ? wqkVar.a : null, DivSizeUnit.FROM_STRING, q5z.b), wcx.e(Q, jSONObject, "value", wm11.b, i, wqkVar != null ? wqkVar.b : null, b.h, d0.c));
    }

    public static JSONObject d(yf90 yf90Var, wqk wqkVar) {
        JSONObject w = n.w(yf90Var, "type", "fixed");
        wcx.p(wqkVar.a, DivSizeUnit.TO_STRING, yf90Var, "unit", w);
        wcx.q(yf90Var, w, "value", wqkVar.b);
        return w;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (wqk) obj);
    }
}
