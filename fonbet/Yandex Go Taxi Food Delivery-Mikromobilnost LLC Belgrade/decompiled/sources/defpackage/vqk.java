package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.d0;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class vqk implements qfy0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.yandex.div.json.expressions.Expression] */
    public static sqk b(yf90 yf90Var, wqk wqkVar, JSONObject jSONObject) {
        exq exqVar = wqkVar.a;
        qkj qkjVar = d0.b;
        tls tlsVar = DivSizeUnit.FROM_STRING;
        kvo kvoVar = d0.a;
        ?? o = xcx.o(yf90Var, exqVar, jSONObject, "unit", qkjVar, tlsVar, kvoVar);
        if (o != 0) {
            kvoVar = o;
        }
        return new sqk(kvoVar, xcx.e(yf90Var, wqkVar.b, jSONObject, "value", wm11.b, b.h, d0.c));
    }

    @Override // defpackage.qfy0
    public final /* bridge */ /* synthetic */ Object a(yf90 yf90Var, hex hexVar, JSONObject jSONObject) {
        return b(yf90Var, (wqk) hexVar, jSONObject);
    }
}
