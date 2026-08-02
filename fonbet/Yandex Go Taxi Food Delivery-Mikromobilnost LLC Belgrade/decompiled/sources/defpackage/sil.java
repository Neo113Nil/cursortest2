package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class sil implements zsq0, nyi {
    public final JsonParserComponent a;

    public sil(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        String R = wwg.R(jSONObject);
        boolean equals = R.equals("non_modal");
        JsonParserComponent jsonParserComponent = this.a;
        if (equals) {
            ((bjl) jsonParserComponent.e9.getValue()).getClass();
            return new qil(new ajl());
        }
        if (R.equals("modal")) {
            ((wil) jsonParserComponent.b9.getValue()).getClass();
            return new pil(wil.c());
        }
        hex b = yf90Var.b().b(R, jSONObject);
        hjl hjlVar = b instanceof hjl ? (hjl) b : null;
        if (hjlVar != null) {
            return ((uil) jsonParserComponent.j9.getValue()).b(hjlVar);
        }
        throw fg90.m(jSONObject, "type", R);
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, ril rilVar) {
        boolean z = rilVar instanceof qil;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            ((bjl) jsonParserComponent.e9.getValue()).getClass();
            JSONObject jSONObject = new JSONObject();
            wwg.Z(yf90Var, jSONObject, "type", "non_modal");
            return jSONObject;
        }
        if (rilVar instanceof pil) {
            ((wil) jsonParserComponent.b9.getValue()).getClass();
            return wil.d(yf90Var);
        }
        w511.b();
        return null;
    }
}
