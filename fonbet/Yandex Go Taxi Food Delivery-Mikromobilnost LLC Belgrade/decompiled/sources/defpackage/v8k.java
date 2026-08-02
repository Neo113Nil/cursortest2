package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.state.db.StateEntry;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class v8k implements zsq0, nyi {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [com.yandex.div.json.expressions.Expression] */
    public static u8k c(yf90 yf90Var, JSONObject jSONObject) {
        Expression a = a.a(yf90Var, jSONObject, StateEntry.COLUMN_STATE_ID, wm11.c);
        wms wmsVar = wm11.a;
        tls tlsVar = b.f;
        kvo kvoVar = y8k.a;
        ?? e = a.e(yf90Var, jSONObject, "temporary", wmsVar, tlsVar, q5z.b, kvoVar);
        if (e != 0) {
            kvoVar = e;
        }
        return new u8k(a, kvoVar);
    }

    public static JSONObject d(yf90 yf90Var, u8k u8kVar) {
        JSONObject jSONObject = new JSONObject();
        a.g(yf90Var, jSONObject, StateEntry.COLUMN_STATE_ID, u8kVar.a);
        a.g(yf90Var, jSONObject, "temporary", u8kVar.b);
        wwg.Z(yf90Var, jSONObject, "type", "set_state");
        return jSONObject;
    }

    @Override // defpackage.nyi
    public final /* bridge */ /* synthetic */ Object a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (u8k) obj);
    }
}
