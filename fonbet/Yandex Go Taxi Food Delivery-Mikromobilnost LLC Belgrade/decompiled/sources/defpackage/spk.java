package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class spk implements zsq0, nyi {
    public final JsonParserComponent a;

    public spk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        Object obj;
        Object obj2;
        String R = wwg.R(jSONObject);
        hex hexVar = yf90Var.b().get(R);
        Object obj3 = null;
        bqk bqkVar = hexVar instanceof bqk ? (bqk) hexVar : null;
        if (bqkVar != null) {
            if (bqkVar instanceof zpk) {
                R = "blur";
            } else {
                if (!(bqkVar instanceof aqk)) {
                    w511.b();
                    return null;
                }
                R = "rtl_mirror";
            }
        }
        boolean equals = R.equals("blur");
        JsonParserComponent jsonParserComponent = this.a;
        if (equals) {
            lgk lgkVar = (lgk) jsonParserComponent.S1.getValue();
            if (bqkVar != null) {
                if (bqkVar instanceof zpk) {
                    obj2 = ((zpk) bqkVar).a();
                } else {
                    if (!(bqkVar instanceof aqk)) {
                        w511.b();
                        return null;
                    }
                    obj2 = ((aqk) bqkVar).a;
                }
                obj3 = obj2;
            }
            lgkVar.getClass();
            return new zpk(lgk.c(yf90Var, (ngk) obj3, jSONObject));
        }
        if (!R.equals("rtl_mirror")) {
            throw fg90.m(jSONObject, "type", R);
        }
        wpk wpkVar = (wpk) jsonParserComponent.q3.getValue();
        if (bqkVar != null) {
            if (bqkVar instanceof zpk) {
                obj = ((zpk) bqkVar).a();
            } else {
                if (!(bqkVar instanceof aqk)) {
                    w511.b();
                    return null;
                }
                obj = ((aqk) bqkVar).a;
            }
            obj3 = obj;
        }
        wpkVar.getClass();
        return new aqk(new ypk());
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, bqk bqkVar) {
        boolean z = bqkVar instanceof zpk;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            lgk lgkVar = (lgk) jsonParserComponent.S1.getValue();
            ngk a = ((zpk) bqkVar).a();
            lgkVar.getClass();
            return lgk.d(yf90Var, a);
        }
        if (!(bqkVar instanceof aqk)) {
            w511.b();
            return null;
        }
        ((wpk) jsonParserComponent.q3.getValue()).getClass();
        JSONObject jSONObject = new JSONObject();
        wwg.Z(yf90Var, jSONObject, "type", "rtl_mirror");
        return jSONObject;
    }
}
