package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div.state.db.StateEntry;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class ymk implements zsq0, yey0 {
    public final JsonParserComponent a;

    public ymk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final hex a(yf90 yf90Var, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        return new ank(wcx.c(Q, jSONObject, "div", i, null, this.a.Y9), wcx.b(Q, jSONObject, StateEntry.COLUMN_STATE_ID, i, null, b.h, q5z.b));
    }

    @Override // defpackage.zsq0
    public final JSONObject b(yf90 yf90Var, Object obj) {
        ank ankVar = (ank) obj;
        JSONObject jSONObject = new JSONObject();
        wcx.u(yf90Var, jSONObject, "div", ankVar.a, this.a.Y9);
        wcx.t(yf90Var, jSONObject, StateEntry.COLUMN_STATE_ID, ankVar.b);
        return jSONObject;
    }
}
