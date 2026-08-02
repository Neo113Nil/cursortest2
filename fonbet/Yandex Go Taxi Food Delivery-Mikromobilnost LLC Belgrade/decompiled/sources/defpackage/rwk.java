package defpackage;

import com.yandex.div2.JsonParserComponent;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.expression.BduiExpressionResolverImpl;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class rwk implements zsq0, nyi {
    public final JsonParserComponent a;

    public rwk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        Object zwkVar;
        Object obj;
        Object obj2;
        String R = wwg.R(jSONObject);
        hex hexVar = yf90Var.b().get(R);
        Object obj3 = null;
        bxk bxkVar = hexVar instanceof bxk ? (bxk) hexVar : null;
        if (bxkVar != null) {
            if (bxkVar instanceof axk) {
                R = "regex";
            } else {
                if (!(bxkVar instanceof zwk)) {
                    w511.b();
                    return null;
                }
                R = BduiExpressionResolverImpl.EXPRESSION_KEY;
            }
        }
        boolean equals = R.equals("regex");
        JsonParserComponent jsonParserComponent = this.a;
        if (equals) {
            vwk vwkVar = (vwk) jsonParserComponent.M4.getValue();
            if (bxkVar != null) {
                if (bxkVar instanceof axk) {
                    obj2 = ((axk) bxkVar).a;
                } else {
                    if (!(bxkVar instanceof zwk)) {
                        w511.b();
                        return null;
                    }
                    obj2 = ((zwk) bxkVar).a;
                }
                obj3 = obj2;
            }
            vwkVar.getClass();
            zwkVar = new axk(vwk.c(yf90Var, (ywk) obj3, jSONObject));
        } else {
            if (!R.equals(BduiExpressionResolverImpl.EXPRESSION_KEY)) {
                throw fg90.m(jSONObject, "type", R);
            }
            mwk mwkVar = (mwk) jsonParserComponent.J4.getValue();
            if (bxkVar != null) {
                if (bxkVar instanceof axk) {
                    obj = ((axk) bxkVar).a;
                } else {
                    if (!(bxkVar instanceof zwk)) {
                        w511.b();
                        return null;
                    }
                    obj = ((zwk) bxkVar).a;
                }
                obj3 = obj;
            }
            mwkVar.getClass();
            zwkVar = new zwk(mwk.c(yf90Var, (pwk) obj3, jSONObject));
        }
        return zwkVar;
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, bxk bxkVar) {
        boolean z = bxkVar instanceof axk;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            vwk vwkVar = (vwk) jsonParserComponent.M4.getValue();
            ywk ywkVar = ((axk) bxkVar).a;
            vwkVar.getClass();
            return vwk.d(yf90Var, ywkVar);
        }
        if (!(bxkVar instanceof zwk)) {
            w511.b();
            return null;
        }
        mwk mwkVar = (mwk) jsonParserComponent.J4.getValue();
        pwk pwkVar = ((zwk) bxkVar).a;
        mwkVar.getClass();
        return mwk.d(yf90Var, pwkVar);
    }
}
