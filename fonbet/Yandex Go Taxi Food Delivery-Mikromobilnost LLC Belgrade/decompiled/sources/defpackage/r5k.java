package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class r5k implements zsq0, nyi {
    public final JsonParserComponent a;

    public r5k(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        c4x c4xVar;
        c4x c4xVar2;
        String R = wwg.R(jSONObject);
        hex hexVar = yf90Var.b().get(R);
        c4x c4xVar3 = null;
        v5k v5kVar = hexVar instanceof v5k ? (v5k) hexVar : null;
        if (v5kVar != null) {
            if (v5kVar instanceof t5k) {
                R = "text";
            } else {
                if (!(v5kVar instanceof u5k)) {
                    w511.b();
                    return null;
                }
                R = "url";
            }
        }
        boolean equals = R.equals("text");
        JsonParserComponent jsonParserComponent = this.a;
        if (equals) {
            whe wheVar = (whe) jsonParserComponent.t.getValue();
            if (v5kVar == null) {
                c4xVar2 = null;
            } else if (v5kVar instanceof t5k) {
                c4xVar2 = ((t5k) v5kVar).a;
            } else {
                if (!(v5kVar instanceof u5k)) {
                    w511.b();
                    return null;
                }
                c4xVar2 = ((u5k) v5kVar).a;
            }
            yhe yheVar = (yhe) c4xVar2;
            wheVar.getClass();
            return new t5k(new yhe(wcx.d(udq0.Q(yf90Var), jSONObject, "value", wm11.c, yf90Var.i(), yheVar != null ? yheVar.a : null)));
        }
        if (!R.equals("url")) {
            throw fg90.m(jSONObject, "type", R);
        }
        uie uieVar = (uie) jsonParserComponent.w.getValue();
        if (v5kVar != null) {
            if (v5kVar instanceof t5k) {
                c4xVar = ((t5k) v5kVar).a;
            } else {
                if (!(v5kVar instanceof u5k)) {
                    w511.b();
                    return null;
                }
                c4xVar = ((u5k) v5kVar).a;
            }
            c4xVar3 = c4xVar;
        }
        uieVar.getClass();
        return new u5k(uie.c(yf90Var, (wie) c4xVar3, jSONObject));
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, v5k v5kVar) {
        boolean z = v5kVar instanceof t5k;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            whe wheVar = (whe) jsonParserComponent.t.getValue();
            yhe yheVar = ((t5k) v5kVar).a;
            wheVar.getClass();
            return whe.c(yf90Var, yheVar);
        }
        if (!(v5kVar instanceof u5k)) {
            w511.b();
            return null;
        }
        uie uieVar = (uie) jsonParserComponent.w.getValue();
        wie wieVar = ((u5k) v5kVar).a;
        uieVar.getClass();
        return uie.d(yf90Var, wieVar);
    }
}
