package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class til implements zsq0, nyi {
    public final JsonParserComponent a;

    public til(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        Object fjlVar;
        Object obj;
        Object obj2;
        String R = wwg.R(jSONObject);
        hex hexVar = yf90Var.b().get(R);
        Object obj3 = null;
        hjl hjlVar = hexVar instanceof hjl ? (hjl) hexVar : null;
        if (hjlVar != null) {
            if (hjlVar instanceof gjl) {
                R = "non_modal";
            } else {
                if (!(hjlVar instanceof fjl)) {
                    w511.b();
                    return null;
                }
                R = "modal";
            }
        }
        boolean equals = R.equals("non_modal");
        JsonParserComponent jsonParserComponent = this.a;
        if (equals) {
            cjl cjlVar = (cjl) jsonParserComponent.f9.getValue();
            if (hjlVar != null) {
                if (hjlVar instanceof gjl) {
                    obj2 = ((gjl) hjlVar).a;
                } else {
                    if (!(hjlVar instanceof fjl)) {
                        w511.b();
                        return null;
                    }
                    obj2 = ((fjl) hjlVar).a;
                }
                obj3 = obj2;
            }
            cjlVar.getClass();
            fjlVar = new gjl(new ejl());
        } else {
            if (!R.equals("modal")) {
                throw fg90.m(jSONObject, "type", R);
            }
            xil xilVar = (xil) jsonParserComponent.c9.getValue();
            if (hjlVar != null) {
                if (hjlVar instanceof gjl) {
                    obj = ((gjl) hjlVar).a;
                } else {
                    if (!(hjlVar instanceof fjl)) {
                        w511.b();
                        return null;
                    }
                    obj = ((fjl) hjlVar).a;
                }
                obj3 = obj;
            }
            xilVar.getClass();
            fjlVar = new fjl(new zil());
        }
        return fjlVar;
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, hjl hjlVar) {
        boolean z = hjlVar instanceof gjl;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            ((cjl) jsonParserComponent.f9.getValue()).getClass();
            JSONObject jSONObject = new JSONObject();
            wwg.Z(yf90Var, jSONObject, "type", "non_modal");
            return jSONObject;
        }
        if (!(hjlVar instanceof fjl)) {
            w511.b();
            return null;
        }
        ((xil) jsonParserComponent.c9.getValue()).getClass();
        JSONObject jSONObject2 = new JSONObject();
        wwg.Z(yf90Var, jSONObject2, "type", "modal");
        return jSONObject2;
    }
}
