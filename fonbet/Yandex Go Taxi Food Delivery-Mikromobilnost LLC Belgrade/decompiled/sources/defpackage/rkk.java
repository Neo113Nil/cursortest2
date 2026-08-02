package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class rkk implements zsq0, nyi {
    public final JsonParserComponent a;

    public rkk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        Object obj;
        Object obj2;
        String R = wwg.R(jSONObject);
        hex hexVar = yf90Var.b().get(R);
        Object obj3 = null;
        vkk vkkVar = hexVar instanceof vkk ? (vkk) hexVar : null;
        if (vkkVar != null) {
            if (vkkVar instanceof ukk) {
                R = "infinity";
            } else {
                if (!(vkkVar instanceof tkk)) {
                    w511.b();
                    return null;
                }
                R = "fixed";
            }
        }
        boolean equals = R.equals("infinity");
        JsonParserComponent jsonParserComponent = this.a;
        if (equals) {
            fuk fukVar = (fuk) jsonParserComponent.s4.getValue();
            if (vkkVar != null) {
                if (vkkVar instanceof ukk) {
                    obj2 = ((ukk) vkkVar).a;
                } else {
                    if (!(vkkVar instanceof tkk)) {
                        w511.b();
                        return null;
                    }
                    obj2 = ((tkk) vkkVar).a;
                }
                obj3 = obj2;
            }
            fukVar.getClass();
            return new ukk(new huk());
        }
        if (!R.equals("fixed")) {
            throw fg90.m(jSONObject, "type", R);
        }
        eqk eqkVar = (eqk) jsonParserComponent.w3.getValue();
        if (vkkVar != null) {
            if (vkkVar instanceof ukk) {
                obj = ((ukk) vkkVar).a;
            } else {
                if (!(vkkVar instanceof tkk)) {
                    w511.b();
                    return null;
                }
                obj = ((tkk) vkkVar).a;
            }
            obj3 = obj;
        }
        eqkVar.getClass();
        return new tkk(eqk.c(yf90Var, (gqk) obj3, jSONObject));
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, vkk vkkVar) {
        boolean z = vkkVar instanceof ukk;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            ((fuk) jsonParserComponent.s4.getValue()).getClass();
            JSONObject jSONObject = new JSONObject();
            wwg.Z(yf90Var, jSONObject, "type", "infinity");
            return jSONObject;
        }
        if (!(vkkVar instanceof tkk)) {
            w511.b();
            return null;
        }
        eqk eqkVar = (eqk) jsonParserComponent.w3.getValue();
        gqk gqkVar = ((tkk) vkkVar).a;
        eqkVar.getClass();
        return eqk.d(yf90Var, gqkVar);
    }
}
