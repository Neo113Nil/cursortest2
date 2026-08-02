package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class vkl implements zsq0, nyi {
    public final JsonParserComponent a;

    public vkl(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        Object yklVar;
        Object obj;
        Object obj2;
        String R = wwg.R(jSONObject);
        hex hexVar = yf90Var.b().get(R);
        Object obj3 = null;
        zkl zklVar = hexVar instanceof zkl ? (zkl) hexVar : null;
        if (zklVar != null) {
            if (zklVar instanceof xkl) {
                R = "translation-fixed";
            } else {
                if (!(zklVar instanceof ykl)) {
                    w511.b();
                    return null;
                }
                R = "translation-percentage";
            }
        }
        boolean equals = R.equals("translation-fixed");
        JsonParserComponent jsonParserComponent = this.a;
        if (equals) {
            zqk zqkVar = (zqk) jsonParserComponent.I3.getValue();
            if (zklVar != null) {
                if (zklVar instanceof xkl) {
                    obj2 = ((xkl) zklVar).a;
                } else {
                    if (!(zklVar instanceof ykl)) {
                        w511.b();
                        return null;
                    }
                    obj2 = ((ykl) zklVar).a;
                }
                obj3 = obj2;
            }
            zqkVar.getClass();
            yklVar = new xkl(zqk.c(yf90Var, (brk) obj3, jSONObject));
        } else {
            if (!R.equals("translation-percentage")) {
                throw fg90.m(jSONObject, "type", R);
            }
            p3l p3lVar = (p3l) jsonParserComponent.V5.getValue();
            if (zklVar != null) {
                if (zklVar instanceof xkl) {
                    obj = ((xkl) zklVar).a;
                } else {
                    if (!(zklVar instanceof ykl)) {
                        w511.b();
                        return null;
                    }
                    obj = ((ykl) zklVar).a;
                }
                obj3 = obj;
            }
            p3lVar.getClass();
            yklVar = new ykl(p3l.c(yf90Var, (r3l) obj3, jSONObject));
        }
        return yklVar;
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, zkl zklVar) {
        boolean z = zklVar instanceof xkl;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            zqk zqkVar = (zqk) jsonParserComponent.I3.getValue();
            brk brkVar = ((xkl) zklVar).a;
            zqkVar.getClass();
            return zqk.d(yf90Var, brkVar);
        }
        if (!(zklVar instanceof ykl)) {
            w511.b();
            return null;
        }
        p3l p3lVar = (p3l) jsonParserComponent.V5.getValue();
        r3l r3lVar = ((ykl) zklVar).a;
        p3lVar.getClass();
        return p3l.d(yf90Var, r3lVar);
    }
}
