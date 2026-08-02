package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ytk implements zsq0, nyi {
    public final JsonParserComponent a;

    public ytk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        c4x c4xVar;
        c4x c4xVar2;
        String R = wwg.R(jSONObject);
        hex hexVar = yf90Var.b().get(R);
        c4x c4xVar3 = null;
        cuk cukVar = hexVar instanceof cuk ? (cuk) hexVar : null;
        if (cukVar != null) {
            if (cukVar instanceof auk) {
                R = "default";
            } else {
                if (!(cukVar instanceof buk)) {
                    w511.b();
                    return null;
                }
                R = "stretch";
            }
        }
        boolean equals = R.equals("default");
        JsonParserComponent jsonParserComponent = this.a;
        if (!equals) {
            if (!R.equals("stretch")) {
                throw fg90.m(jSONObject, "type", R);
            }
            xbl xblVar = (xbl) jsonParserComponent.N7.getValue();
            if (cukVar != null) {
                if (cukVar instanceof auk) {
                    c4xVar = ((auk) cukVar).a;
                } else {
                    if (!(cukVar instanceof buk)) {
                        w511.b();
                        return null;
                    }
                    c4xVar = ((buk) cukVar).a();
                }
                c4xVar3 = c4xVar;
            }
            return new buk(xblVar.c(yf90Var, (acl) c4xVar3, jSONObject));
        }
        fnk fnkVar = (fnk) jsonParserComponent.S2.getValue();
        if (cukVar == null) {
            c4xVar2 = null;
        } else if (cukVar instanceof auk) {
            c4xVar2 = ((auk) cukVar).a;
        } else {
            if (!(cukVar instanceof buk)) {
                w511.b();
                return null;
            }
            c4xVar2 = ((buk) cukVar).a();
        }
        ink inkVar = (ink) c4xVar2;
        fnkVar.getClass();
        return new auk(new ink(wcx.i(udq0.Q(yf90Var), jSONObject, "space_between_centers", yf90Var.i(), inkVar != null ? inkVar.a : null, fnkVar.a.F3)));
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, cuk cukVar) {
        boolean z = cukVar instanceof auk;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            return ((fnk) jsonParserComponent.S2.getValue()).b(yf90Var, ((auk) cukVar).a);
        }
        if (cukVar instanceof buk) {
            return ((xbl) jsonParserComponent.N7.getValue()).b(yf90Var, ((buk) cukVar).a());
        }
        w511.b();
        return null;
    }
}
