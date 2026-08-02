package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.expression.BduiExpressionResolverImpl;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class uuk implements zsq0, yey0 {
    public static wuk c(yf90 yf90Var, wuk wukVar, JSONObject jSONObject) {
        return new wuk(wcx.e(udq0.Q(yf90Var), jSONObject, "condition", wm11.a, yf90Var.i(), wukVar != null ? wukVar.a : null, b.f, q5z.b));
    }

    public static JSONObject d(yf90 yf90Var, wuk wukVar) {
        JSONObject jSONObject = new JSONObject();
        wcx.q(yf90Var, jSONObject, "condition", wukVar.a);
        wwg.Z(yf90Var, jSONObject, "type", BduiExpressionResolverImpl.EXPRESSION_KEY);
        return jSONObject;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (wuk) obj);
    }
}
