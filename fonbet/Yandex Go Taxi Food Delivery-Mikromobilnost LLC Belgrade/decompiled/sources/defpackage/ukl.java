package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class ukl implements zsq0, nyi {
    public final JsonParserComponent a;

    public ukl(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        String R = wwg.R(jSONObject);
        boolean equals = R.equals("translation-fixed");
        JsonParserComponent jsonParserComponent = this.a;
        if (equals) {
            ((yqk) jsonParserComponent.H3.getValue()).getClass();
            return new rkl(yqk.c(yf90Var, jSONObject));
        }
        if (R.equals("translation-percentage")) {
            ((o3l) jsonParserComponent.U5.getValue()).getClass();
            return new skl(o3l.c(yf90Var, jSONObject));
        }
        hex b = yf90Var.b().b(R, jSONObject);
        zkl zklVar = b instanceof zkl ? (zkl) b : null;
        if (zklVar != null) {
            return ((wkl) jsonParserComponent.y9.getValue()).a(yf90Var, zklVar, jSONObject);
        }
        throw fg90.m(jSONObject, "type", R);
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, tkl tklVar) {
        boolean z = tklVar instanceof rkl;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            yqk yqkVar = (yqk) jsonParserComponent.H3.getValue();
            xqk xqkVar = ((rkl) tklVar).b;
            yqkVar.getClass();
            return yqk.d(yf90Var, xqkVar);
        }
        if (!(tklVar instanceof skl)) {
            w511.b();
            return null;
        }
        o3l o3lVar = (o3l) jsonParserComponent.U5.getValue();
        n3l n3lVar = ((skl) tklVar).b;
        o3lVar.getClass();
        return o3l.d(yf90Var, n3lVar);
    }
}
