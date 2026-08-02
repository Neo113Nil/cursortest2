package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div.state.db.StateEntry;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class xmk implements zsq0, nyi {
    public final JsonParserComponent a;

    public xmk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        return new mmk((m3k) wwg.E(yf90Var, jSONObject, "div", this.a.X9), ((Number) wwg.G(jSONObject, StateEntry.COLUMN_STATE_ID, b.h)).longValue());
    }

    @Override // defpackage.zsq0
    public final JSONObject b(yf90 yf90Var, Object obj) {
        mmk mmkVar = (mmk) obj;
        JSONObject jSONObject = new JSONObject();
        wwg.b0(yf90Var, jSONObject, "div", mmkVar.a, this.a.X9);
        wwg.Z(yf90Var, jSONObject, StateEntry.COLUMN_STATE_ID, Long.valueOf(mmkVar.b));
        return jSONObject;
    }
}
