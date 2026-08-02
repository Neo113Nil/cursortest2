package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div2.JsonParserComponent;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.expression.BduiExpressionResolverImpl;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class xuk implements zsq0, nyi {
    public final JsonParserComponent a;

    public xuk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        String R = wwg.R(jSONObject);
        boolean equals = R.equals("regex");
        JsonParserComponent jsonParserComponent = this.a;
        if (equals) {
            ((bvk) jsonParserComponent.x4.getValue()).getClass();
            return new quk(new avk(a.a(yf90Var, jSONObject, "pattern", wm11.c)));
        }
        if (R.equals(BduiExpressionResolverImpl.EXPRESSION_KEY)) {
            ((tuk) jsonParserComponent.u4.getValue()).getClass();
            return new puk(tuk.c(yf90Var, jSONObject));
        }
        hex b = yf90Var.b().b(R, jSONObject);
        hvk hvkVar = b instanceof hvk ? (hvk) b : null;
        if (hvkVar != null) {
            return ((zuk) jsonParserComponent.C4.getValue()).a(yf90Var, hvkVar, jSONObject);
        }
        throw fg90.m(jSONObject, "type", R);
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, ruk rukVar) {
        boolean z = rukVar instanceof quk;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            bvk bvkVar = (bvk) jsonParserComponent.x4.getValue();
            avk avkVar = ((quk) rukVar).b;
            bvkVar.getClass();
            return bvk.c(yf90Var, avkVar);
        }
        if (!(rukVar instanceof puk)) {
            w511.b();
            return null;
        }
        tuk tukVar = (tuk) jsonParserComponent.u4.getValue();
        suk sukVar = ((puk) rukVar).b;
        tukVar.getClass();
        return tuk.d(yf90Var, sukVar);
    }
}
