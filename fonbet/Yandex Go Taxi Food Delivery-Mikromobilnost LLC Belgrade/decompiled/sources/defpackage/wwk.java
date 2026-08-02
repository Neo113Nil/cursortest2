package defpackage;

import com.yandex.div.internal.parser.b;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class wwk implements qfy0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [com.yandex.div.json.expressions.Expression] */
    public static twk b(yf90 yf90Var, ywk ywkVar, JSONObject jSONObject) {
        exq exqVar = ywkVar.a;
        wms wmsVar = wm11.a;
        tls tlsVar = b.f;
        kvo kvoVar = xwk.a;
        ?? o = xcx.o(yf90Var, exqVar, jSONObject, "allow_empty", wmsVar, tlsVar, kvoVar);
        if (o != 0) {
            kvoVar = o;
        }
        exq exqVar2 = ywkVar.b;
        ums umsVar = wm11.c;
        return new twk(kvoVar, xcx.c(yf90Var, exqVar2, jSONObject, "label_id", umsVar), xcx.c(yf90Var, ywkVar.c, jSONObject, "pattern", umsVar), (String) xcx.a(ywkVar.d, jSONObject, "variable", q5z.c, q5z.b));
    }

    @Override // defpackage.qfy0
    public final /* bridge */ /* synthetic */ Object a(yf90 yf90Var, hex hexVar, JSONObject jSONObject) {
        return b(yf90Var, (ywk) hexVar, jSONObject);
    }
}
