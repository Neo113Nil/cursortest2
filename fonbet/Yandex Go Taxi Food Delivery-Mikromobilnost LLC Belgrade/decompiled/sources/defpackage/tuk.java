package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.expression.BduiExpressionResolverImpl;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class tuk implements zsq0, nyi {
    public static suk c(yf90 yf90Var, JSONObject jSONObject) {
        return new suk(a.b(yf90Var, jSONObject, "condition", wm11.a, b.f, q5z.b));
    }

    public static JSONObject d(yf90 yf90Var, suk sukVar) {
        JSONObject jSONObject = new JSONObject();
        a.g(yf90Var, jSONObject, "condition", sukVar.a);
        wwg.Z(yf90Var, jSONObject, "type", BduiExpressionResolverImpl.EXPRESSION_KEY);
        return jSONObject;
    }

    @Override // defpackage.nyi
    public final /* bridge */ /* synthetic */ Object a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (suk) obj);
    }
}
