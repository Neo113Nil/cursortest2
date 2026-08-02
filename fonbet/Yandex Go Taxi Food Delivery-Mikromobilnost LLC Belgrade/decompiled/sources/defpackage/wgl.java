package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class wgl implements zsq0, nyi {
    public final JsonParserComponent a;

    public wgl(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        Object mhlVar;
        Object obj;
        Object obj2;
        String R = wwg.R(jSONObject);
        hex hexVar = yf90Var.b().get(R);
        Object obj3 = null;
        nhl nhlVar = hexVar instanceof nhl ? (nhl) hexVar : null;
        if (nhlVar != null) {
            if (nhlVar instanceof lhl) {
                R = "particles";
            } else {
                if (!(nhlVar instanceof mhl)) {
                    w511.b();
                    return null;
                }
                R = "solid";
            }
        }
        boolean equals = R.equals("particles");
        JsonParserComponent jsonParserComponent = this.a;
        if (equals) {
            bhl bhlVar = (bhl) jsonParserComponent.C8.getValue();
            if (nhlVar != null) {
                if (nhlVar instanceof lhl) {
                    obj2 = ((lhl) nhlVar).a;
                } else {
                    if (!(nhlVar instanceof mhl)) {
                        w511.b();
                        return null;
                    }
                    obj2 = ((mhl) nhlVar).a;
                }
                obj3 = obj2;
            }
            mhlVar = new lhl(bhlVar.c(yf90Var, (ehl) obj3, jSONObject));
        } else {
            if (!R.equals("solid")) {
                throw fg90.m(jSONObject, "type", R);
            }
            hhl hhlVar = (hhl) jsonParserComponent.F8.getValue();
            if (nhlVar != null) {
                if (nhlVar instanceof lhl) {
                    obj = ((lhl) nhlVar).a;
                } else {
                    if (!(nhlVar instanceof mhl)) {
                        w511.b();
                        return null;
                    }
                    obj = ((mhl) nhlVar).a;
                }
                obj3 = obj;
            }
            hhlVar.getClass();
            mhlVar = new mhl(hhl.c(yf90Var, (khl) obj3, jSONObject));
        }
        return mhlVar;
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, nhl nhlVar) {
        boolean z = nhlVar instanceof lhl;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            return ((bhl) jsonParserComponent.C8.getValue()).b(yf90Var, ((lhl) nhlVar).a);
        }
        if (!(nhlVar instanceof mhl)) {
            w511.b();
            return null;
        }
        hhl hhlVar = (hhl) jsonParserComponent.F8.getValue();
        khl khlVar = ((mhl) nhlVar).a;
        hhlVar.getClass();
        return hhl.d(yf90Var, khlVar);
    }
}
