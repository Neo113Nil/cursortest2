package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class q5k implements zsq0, nyi {
    public final JsonParserComponent a;

    public q5k(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        String R = wwg.R(jSONObject);
        boolean equals = R.equals("text");
        JsonParserComponent jsonParserComponent = this.a;
        if (equals) {
            ((vhe) jsonParserComponent.s.getValue()).getClass();
            return new n5k(new uhe(a.a(yf90Var, jSONObject, "value", wm11.c)));
        }
        if (R.equals("url")) {
            ((tie) jsonParserComponent.v.getValue()).getClass();
            return new o5k(tie.c(yf90Var, jSONObject));
        }
        hex b = yf90Var.b().b(R, jSONObject);
        v5k v5kVar = b instanceof v5k ? (v5k) b : null;
        if (v5kVar != null) {
            return ((s5k) jsonParserComponent.e0.getValue()).a(yf90Var, v5kVar, jSONObject);
        }
        throw fg90.m(jSONObject, "type", R);
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, p5k p5kVar) {
        boolean z = p5kVar instanceof n5k;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            vhe vheVar = (vhe) jsonParserComponent.s.getValue();
            uhe uheVar = ((n5k) p5kVar).b;
            vheVar.getClass();
            return vhe.c(yf90Var, uheVar);
        }
        if (!(p5kVar instanceof o5k)) {
            w511.b();
            return null;
        }
        tie tieVar = (tie) jsonParserComponent.v.getValue();
        sie a = ((o5k) p5kVar).a();
        tieVar.getClass();
        return tie.d(yf90Var, a);
    }
}
