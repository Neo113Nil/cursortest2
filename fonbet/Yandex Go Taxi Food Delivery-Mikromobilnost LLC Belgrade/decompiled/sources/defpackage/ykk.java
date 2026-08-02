package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.json.expressions.Expression;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class ykk implements zsq0, nyi {
    public static xkk c(yf90 yf90Var, JSONObject jSONObject) {
        wms wmsVar = wm11.a;
        Expression c = a.c(yf90Var, jSONObject, "locale");
        Object opt = jSONObject.opt("raw_text_variable");
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        if (opt != null) {
            return new xkk(c, (String) opt);
        }
        throw fg90.h("raw_text_variable", jSONObject);
    }

    public static JSONObject d(yf90 yf90Var, xkk xkkVar) {
        JSONObject jSONObject = new JSONObject();
        a.g(yf90Var, jSONObject, "locale", xkkVar.a);
        wwg.Z(yf90Var, jSONObject, "raw_text_variable", xkkVar.b);
        wwg.Z(yf90Var, jSONObject, "type", "currency");
        return jSONObject;
    }

    @Override // defpackage.nyi
    public final /* bridge */ /* synthetic */ Object a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (xkk) obj);
    }
}
