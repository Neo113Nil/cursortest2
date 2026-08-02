package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class qkk implements zsq0, nyi {
    public final JsonParserComponent a;

    public qkk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        String R = wwg.R(jSONObject);
        boolean equals = R.equals("infinity");
        JsonParserComponent jsonParserComponent = this.a;
        if (equals) {
            ((euk) jsonParserComponent.r4.getValue()).getClass();
            return new okk(new duk());
        }
        if (R.equals("fixed")) {
            ((dqk) jsonParserComponent.v3.getValue()).getClass();
            return new nkk(dqk.c(yf90Var, jSONObject));
        }
        hex b = yf90Var.b().b(R, jSONObject);
        vkk vkkVar = b instanceof vkk ? (vkk) b : null;
        if (vkkVar != null) {
            return ((skk) jsonParserComponent.G2.getValue()).a(yf90Var, vkkVar, jSONObject);
        }
        throw fg90.m(jSONObject, "type", R);
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, pkk pkkVar) {
        boolean z = pkkVar instanceof okk;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            ((euk) jsonParserComponent.r4.getValue()).getClass();
            return euk.c(yf90Var);
        }
        if (!(pkkVar instanceof nkk)) {
            w511.b();
            return null;
        }
        dqk dqkVar = (dqk) jsonParserComponent.v3.getValue();
        cqk cqkVar = ((nkk) pkkVar).b;
        dqkVar.getClass();
        return dqk.d(yf90Var, cqkVar);
    }
}
