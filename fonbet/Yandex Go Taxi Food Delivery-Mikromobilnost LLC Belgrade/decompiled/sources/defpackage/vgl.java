package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class vgl implements zsq0, nyi {
    public final JsonParserComponent a;

    public vgl(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        String R = wwg.R(jSONObject);
        boolean equals = R.equals("particles");
        JsonParserComponent jsonParserComponent = this.a;
        if (equals) {
            return new ngl(((ahl) jsonParserComponent.B8.getValue()).a(yf90Var, jSONObject));
        }
        if (R.equals("solid")) {
            ((ghl) jsonParserComponent.E8.getValue()).getClass();
            return new ogl(ghl.c(yf90Var, jSONObject));
        }
        hex b = yf90Var.b().b(R, jSONObject);
        nhl nhlVar = b instanceof nhl ? (nhl) b : null;
        if (nhlVar != null) {
            return ((xgl) jsonParserComponent.J8.getValue()).a(yf90Var, nhlVar, jSONObject);
        }
        throw fg90.m(jSONObject, "type", R);
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, pgl pglVar) {
        boolean z = pglVar instanceof ngl;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            return ((ahl) jsonParserComponent.B8.getValue()).b(yf90Var, ((ngl) pglVar).b);
        }
        if (!(pglVar instanceof ogl)) {
            w511.b();
            return null;
        }
        ghl ghlVar = (ghl) jsonParserComponent.E8.getValue();
        fhl fhlVar = ((ogl) pglVar).b;
        ghlVar.getClass();
        return ghl.d(yf90Var, fhlVar);
    }
}
