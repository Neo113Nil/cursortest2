package defpackage;

import com.yandex.div2.JsonParserComponent;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.expression.BduiExpressionResolverImpl;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class yuk implements zsq0, nyi {
    public final JsonParserComponent a;

    public yuk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        c4x c4xVar;
        c4x c4xVar2;
        String R = wwg.R(jSONObject);
        hex hexVar = yf90Var.b().get(R);
        c4x c4xVar3 = null;
        hvk hvkVar = hexVar instanceof hvk ? (hvk) hexVar : null;
        if (hvkVar != null) {
            if (hvkVar instanceof gvk) {
                R = "regex";
            } else {
                if (!(hvkVar instanceof fvk)) {
                    w511.b();
                    return null;
                }
                R = BduiExpressionResolverImpl.EXPRESSION_KEY;
            }
        }
        boolean equals = R.equals("regex");
        JsonParserComponent jsonParserComponent = this.a;
        if (equals) {
            cvk cvkVar = (cvk) jsonParserComponent.y4.getValue();
            if (hvkVar == null) {
                c4xVar2 = null;
            } else if (hvkVar instanceof gvk) {
                c4xVar2 = ((gvk) hvkVar).a;
            } else {
                if (!(hvkVar instanceof fvk)) {
                    w511.b();
                    return null;
                }
                c4xVar2 = ((fvk) hvkVar).a;
            }
            evk evkVar = (evk) c4xVar2;
            cvkVar.getClass();
            return new gvk(new evk(wcx.d(udq0.Q(yf90Var), jSONObject, "pattern", wm11.c, yf90Var.i(), evkVar != null ? evkVar.a : null)));
        }
        if (!R.equals(BduiExpressionResolverImpl.EXPRESSION_KEY)) {
            throw fg90.m(jSONObject, "type", R);
        }
        uuk uukVar = (uuk) jsonParserComponent.v4.getValue();
        if (hvkVar != null) {
            if (hvkVar instanceof gvk) {
                c4xVar = ((gvk) hvkVar).a;
            } else {
                if (!(hvkVar instanceof fvk)) {
                    w511.b();
                    return null;
                }
                c4xVar = ((fvk) hvkVar).a;
            }
            c4xVar3 = c4xVar;
        }
        uukVar.getClass();
        return new fvk(uuk.c(yf90Var, (wuk) c4xVar3, jSONObject));
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, hvk hvkVar) {
        boolean z = hvkVar instanceof gvk;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            cvk cvkVar = (cvk) jsonParserComponent.y4.getValue();
            evk evkVar = ((gvk) hvkVar).a;
            cvkVar.getClass();
            return cvk.c(yf90Var, evkVar);
        }
        if (!(hvkVar instanceof fvk)) {
            w511.b();
            return null;
        }
        uuk uukVar = (uuk) jsonParserComponent.v4.getValue();
        wuk wukVar = ((fvk) hvkVar).a;
        uukVar.getClass();
        return uuk.d(yf90Var, wukVar);
    }
}
