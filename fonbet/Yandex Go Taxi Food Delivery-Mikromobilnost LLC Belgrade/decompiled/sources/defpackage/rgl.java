package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class rgl implements zsq0, nyi {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        wms wmsVar = wm11.a;
        tls tlsVar = b.f;
        kvo kvoVar = tgl.a;
        ?? e = a.e(yf90Var, jSONObject, "is_enabled", wmsVar, tlsVar, q5z.b, kvoVar);
        if (e != 0) {
            kvoVar = e;
        }
        return new qgl(kvoVar);
    }

    @Override // defpackage.zsq0
    public final JSONObject b(yf90 yf90Var, Object obj) {
        JSONObject jSONObject = new JSONObject();
        a.g(yf90Var, jSONObject, "is_enabled", ((qgl) obj).a);
        return jSONObject;
    }
}
