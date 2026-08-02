package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.d0;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class tqk implements zsq0, nyi {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [com.yandex.div.json.expressions.Expression] */
    public static sqk c(yf90 yf90Var, JSONObject jSONObject) {
        qkj qkjVar = d0.b;
        tls tlsVar = DivSizeUnit.FROM_STRING;
        kvo kvoVar = d0.a;
        ?? e = a.e(yf90Var, jSONObject, "unit", qkjVar, tlsVar, q5z.b, kvoVar);
        if (e != 0) {
            kvoVar = e;
        }
        return new sqk(kvoVar, a.b(yf90Var, jSONObject, "value", wm11.b, b.h, d0.c));
    }

    public static JSONObject d(yf90 yf90Var, sqk sqkVar) {
        JSONObject w = n.w(yf90Var, "type", "fixed");
        a.h(yf90Var, w, "unit", sqkVar.a, DivSizeUnit.TO_STRING);
        a.g(yf90Var, w, "value", sqkVar.b);
        return w;
    }

    @Override // defpackage.nyi
    public final /* bridge */ /* synthetic */ Object a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (sqk) obj);
    }
}
