package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class zzk implements zsq0, nyi {
    public final JsonParserComponent a;

    public zzk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final yzk a(yf90 yf90Var, JSONObject jSONObject) {
        return new yzk((sqk) wwg.E(yf90Var, jSONObject, "neighbour_page_width", this.a.E3));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, yzk yzkVar) {
        JSONObject jSONObject = new JSONObject();
        wwg.b0(yf90Var, jSONObject, "neighbour_page_width", yzkVar.a, this.a.E3);
        wwg.Z(yf90Var, jSONObject, "type", "fixed");
        return jSONObject;
    }
}
