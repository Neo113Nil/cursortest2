package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class rpk implements zsq0, nyi {
    public final JsonParserComponent a;

    public rpk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        String R = wwg.R(jSONObject);
        boolean equals = R.equals("blur");
        JsonParserComponent jsonParserComponent = this.a;
        if (equals) {
            ((kgk) jsonParserComponent.R1.getValue()).getClass();
            return new opk(kgk.c(yf90Var, jSONObject));
        }
        if (R.equals("rtl_mirror")) {
            ((vpk) jsonParserComponent.p3.getValue()).getClass();
            return new ppk(new upk());
        }
        hex b = yf90Var.b().b(R, jSONObject);
        bqk bqkVar = b instanceof bqk ? (bqk) b : null;
        if (bqkVar != null) {
            return ((tpk) jsonParserComponent.u3.getValue()).a(yf90Var, bqkVar, jSONObject);
        }
        throw fg90.m(jSONObject, "type", R);
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, qpk qpkVar) {
        boolean z = qpkVar instanceof opk;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            kgk kgkVar = (kgk) jsonParserComponent.R1.getValue();
            jgk jgkVar = ((opk) qpkVar).b;
            kgkVar.getClass();
            return kgk.d(yf90Var, jgkVar);
        }
        if (qpkVar instanceof ppk) {
            ((vpk) jsonParserComponent.p3.getValue()).getClass();
            return vpk.c(yf90Var);
        }
        w511.b();
        return null;
    }
}
