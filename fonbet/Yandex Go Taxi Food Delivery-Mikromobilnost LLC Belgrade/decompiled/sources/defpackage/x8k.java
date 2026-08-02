package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.state.db.StateEntry;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class x8k implements qfy0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [com.yandex.div.json.expressions.Expression] */
    public static u8k b(yf90 yf90Var, z8k z8kVar, JSONObject jSONObject) {
        Expression c = xcx.c(yf90Var, z8kVar.a, jSONObject, StateEntry.COLUMN_STATE_ID, wm11.c);
        exq exqVar = z8kVar.b;
        wms wmsVar = wm11.a;
        tls tlsVar = b.f;
        kvo kvoVar = y8k.a;
        ?? o = xcx.o(yf90Var, exqVar, jSONObject, "temporary", wmsVar, tlsVar, kvoVar);
        if (o != 0) {
            kvoVar = o;
        }
        return new u8k(c, kvoVar);
    }

    @Override // defpackage.qfy0
    public final /* bridge */ /* synthetic */ Object a(yf90 yf90Var, hex hexVar, JSONObject jSONObject) {
        return b(yf90Var, (z8k) hexVar, jSONObject);
    }
}
