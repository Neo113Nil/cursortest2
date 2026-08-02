package defpackage;

import com.yandex.div.internal.parser.b;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zal implements zsq0, yey0 {
    public static bbl c(yf90 yf90Var, bbl bblVar, JSONObject jSONObject) {
        return new bbl(wcx.e(udq0.Q(yf90Var), jSONObject, "color", wm11.f, yf90Var.i(), bblVar != null ? bblVar.a : null, b.b, q5z.b));
    }

    public static JSONObject d(yf90 yf90Var, bbl bblVar) {
        JSONObject jSONObject = new JSONObject();
        wcx.p(bblVar.a, b.a, yf90Var, "color", jSONObject);
        wwg.Z(yf90Var, jSONObject, "type", "solid");
        return jSONObject;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (bbl) obj);
    }
}
