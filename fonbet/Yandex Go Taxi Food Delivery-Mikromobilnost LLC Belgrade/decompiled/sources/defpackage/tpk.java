package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class tpk implements qfy0 {
    public final JsonParserComponent a;

    public tpk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final qpk a(yf90 yf90Var, bqk bqkVar, JSONObject jSONObject) {
        boolean z = bqkVar instanceof zpk;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            mgk mgkVar = (mgk) jsonParserComponent.T1.getValue();
            ngk a = ((zpk) bqkVar).a();
            mgkVar.getClass();
            return new opk(mgk.b(yf90Var, a, jSONObject));
        }
        if (bqkVar instanceof aqk) {
            ((xpk) jsonParserComponent.r3.getValue()).getClass();
            return new ppk(new upk());
        }
        w511.b();
        return null;
    }
}
