package defpackage;

import com.yandex.div2.JsonParserComponent;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.expression.BduiExpressionResolverImpl;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class qwk implements zsq0, nyi {
    public final JsonParserComponent a;

    public qwk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        String R = wwg.R(jSONObject);
        boolean equals = R.equals("regex");
        JsonParserComponent jsonParserComponent = this.a;
        if (equals) {
            ((uwk) jsonParserComponent.L4.getValue()).getClass();
            return new dwk(uwk.c(yf90Var, jSONObject));
        }
        if (R.equals(BduiExpressionResolverImpl.EXPRESSION_KEY)) {
            ((lwk) jsonParserComponent.I4.getValue()).getClass();
            return new cwk(lwk.c(yf90Var, jSONObject));
        }
        hex b = yf90Var.b().b(R, jSONObject);
        bxk bxkVar = b instanceof bxk ? (bxk) b : null;
        if (bxkVar != null) {
            return ((swk) jsonParserComponent.Q4.getValue()).a(yf90Var, bxkVar, jSONObject);
        }
        throw fg90.m(jSONObject, "type", R);
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, ewk ewkVar) {
        boolean z = ewkVar instanceof dwk;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            uwk uwkVar = (uwk) jsonParserComponent.L4.getValue();
            twk twkVar = ((dwk) ewkVar).b;
            uwkVar.getClass();
            return uwk.d(yf90Var, twkVar);
        }
        if (!(ewkVar instanceof cwk)) {
            w511.b();
            return null;
        }
        lwk lwkVar = (lwk) jsonParserComponent.I4.getValue();
        kwk kwkVar = ((cwk) ewkVar).b;
        lwkVar.getClass();
        return lwk.d(yf90Var, kwkVar);
    }
}
