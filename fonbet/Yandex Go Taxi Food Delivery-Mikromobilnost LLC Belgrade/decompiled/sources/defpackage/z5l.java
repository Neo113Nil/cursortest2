package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.k1;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class z5l implements qfy0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [com.yandex.div.json.expressions.Expression] */
    public static w5l b(yf90 yf90Var, a6l a6lVar, JSONObject jSONObject) {
        exq exqVar = a6lVar.a;
        qkj qkjVar = k1.b;
        tls tlsVar = DivSizeUnit.FROM_STRING;
        kvo kvoVar = k1.a;
        ?? o = xcx.o(yf90Var, exqVar, jSONObject, "unit", qkjVar, tlsVar, kvoVar);
        if (o != 0) {
            kvoVar = o;
        }
        return new w5l(kvoVar, xcx.d(yf90Var, a6lVar.b, jSONObject, "value", wm11.b, b.h));
    }

    @Override // defpackage.qfy0
    public final /* bridge */ /* synthetic */ Object a(yf90 yf90Var, hex hexVar, JSONObject jSONObject) {
        return b(yf90Var, (a6l) hexVar, jSONObject);
    }
}
