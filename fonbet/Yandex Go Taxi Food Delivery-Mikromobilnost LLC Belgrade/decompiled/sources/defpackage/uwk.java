package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class uwk implements zsq0, nyi {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [com.yandex.div.json.expressions.Expression] */
    public static twk c(yf90 yf90Var, JSONObject jSONObject) {
        wms wmsVar = wm11.a;
        tls tlsVar = b.f;
        kvo kvoVar = xwk.a;
        kbs kbsVar = q5z.b;
        ?? e = a.e(yf90Var, jSONObject, "allow_empty", wmsVar, tlsVar, kbsVar, kvoVar);
        if (e != 0) {
            kvoVar = e;
        }
        ums umsVar = wm11.c;
        abl0 abl0Var = q5z.c;
        Expression b = a.b(yf90Var, jSONObject, "label_id", umsVar, abl0Var, kbsVar);
        Expression b2 = a.b(yf90Var, jSONObject, "pattern", umsVar, abl0Var, kbsVar);
        Object opt = jSONObject.opt("variable");
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        if (opt != null) {
            return new twk(kvoVar, b, b2, (String) opt);
        }
        throw fg90.h("variable", jSONObject);
    }

    public static JSONObject d(yf90 yf90Var, twk twkVar) {
        JSONObject jSONObject = new JSONObject();
        a.g(yf90Var, jSONObject, "allow_empty", twkVar.a);
        a.g(yf90Var, jSONObject, "label_id", twkVar.b);
        a.g(yf90Var, jSONObject, "pattern", twkVar.c);
        wwg.Z(yf90Var, jSONObject, "type", "regex");
        wwg.Z(yf90Var, jSONObject, "variable", twkVar.d);
        return jSONObject;
    }

    @Override // defpackage.nyi
    public final /* bridge */ /* synthetic */ Object a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (twk) obj);
    }
}
