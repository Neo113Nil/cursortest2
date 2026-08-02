package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.e0;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class yqk implements zsq0, nyi {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [com.yandex.div.json.expressions.Expression] */
    public static xqk c(yf90 yf90Var, JSONObject jSONObject) {
        qkj qkjVar = e0.b;
        tls tlsVar = DivSizeUnit.FROM_STRING;
        kvo kvoVar = e0.a;
        kbs kbsVar = q5z.b;
        ?? e = a.e(yf90Var, jSONObject, "unit", qkjVar, tlsVar, kbsVar, kvoVar);
        if (e != 0) {
            kvoVar = e;
        }
        return new xqk(kvoVar, a.b(yf90Var, jSONObject, "value", wm11.b, b.h, kbsVar));
    }

    public static JSONObject d(yf90 yf90Var, xqk xqkVar) {
        JSONObject w = n.w(yf90Var, "type", "translation-fixed");
        a.h(yf90Var, w, "unit", xqkVar.a, DivSizeUnit.TO_STRING);
        a.g(yf90Var, w, "value", xqkVar.b);
        return w;
    }

    @Override // defpackage.nyi
    public final /* bridge */ /* synthetic */ Object a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (xqk) obj);
    }
}
