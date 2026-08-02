package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class zjl implements zsq0, nyi {
    public final JsonParserComponent a;

    public zjl(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        Object cklVar;
        Object obj;
        Object obj2;
        String R = wwg.R(jSONObject);
        hex hexVar = yf90Var.b().get(R);
        Object obj3 = null;
        dkl dklVar = hexVar instanceof dkl ? (dkl) hexVar : null;
        if (dklVar != null) {
            if (dklVar instanceof bkl) {
                R = "rotation";
            } else {
                if (!(dklVar instanceof ckl)) {
                    w511.b();
                    return null;
                }
                R = "translation";
            }
        }
        boolean equals = R.equals("rotation");
        JsonParserComponent jsonParserComponent = this.a;
        if (equals) {
            g7l g7lVar = (g7l) jsonParserComponent.I6.getValue();
            if (dklVar != null) {
                if (dklVar instanceof bkl) {
                    obj2 = ((bkl) dklVar).a;
                } else {
                    if (!(dklVar instanceof ckl)) {
                        w511.b();
                        return null;
                    }
                    obj2 = ((ckl) dklVar).a;
                }
                obj3 = obj2;
            }
            cklVar = new bkl(g7lVar.c(yf90Var, (j7l) obj3, jSONObject));
        } else {
            if (!R.equals("translation")) {
                throw fg90.m(jSONObject, "type", R);
            }
            cll cllVar = (cll) jsonParserComponent.u9.getValue();
            if (dklVar != null) {
                if (dklVar instanceof bkl) {
                    obj = ((bkl) dklVar).a;
                } else {
                    if (!(dklVar instanceof ckl)) {
                        w511.b();
                        return null;
                    }
                    obj = ((ckl) dklVar).a;
                }
                obj3 = obj;
            }
            cklVar = new ckl(cllVar.c(yf90Var, (ell) obj3, jSONObject));
        }
        return cklVar;
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, dkl dklVar) {
        boolean z = dklVar instanceof bkl;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            return ((g7l) jsonParserComponent.I6.getValue()).b(yf90Var, ((bkl) dklVar).a);
        }
        if (dklVar instanceof ckl) {
            return ((cll) jsonParserComponent.u9.getValue()).b(yf90Var, ((ckl) dklVar).a);
        }
        w511.b();
        return null;
    }
}
