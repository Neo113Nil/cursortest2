package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.x1;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class u9l implements zsq0, nyi {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        qkj qkjVar = x1.b;
        tls tlsVar = DivSizeUnit.FROM_STRING;
        kvo kvoVar = x1.a;
        ?? e = a.e(yf90Var, jSONObject, "unit", qkjVar, tlsVar, q5z.b, kvoVar);
        if (e != 0) {
            kvoVar = e;
        }
        return new t9l(kvoVar, a.b(yf90Var, jSONObject, "value", wm11.b, b.h, x1.c));
    }

    @Override // defpackage.zsq0
    public final JSONObject b(yf90 yf90Var, Object obj) {
        t9l t9lVar = (t9l) obj;
        JSONObject jSONObject = new JSONObject();
        a.h(yf90Var, jSONObject, "unit", t9lVar.a, DivSizeUnit.TO_STRING);
        a.g(yf90Var, jSONObject, "value", t9lVar.b);
        return jSONObject;
    }
}
