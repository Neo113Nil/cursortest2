package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class yjl implements zsq0, nyi {
    public final JsonParserComponent a;

    public yjl(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        String R = wwg.R(jSONObject);
        boolean equals = R.equals("rotation");
        JsonParserComponent jsonParserComponent = this.a;
        if (equals) {
            return new vjl(((f7l) jsonParserComponent.H6.getValue()).a(yf90Var, jSONObject));
        }
        if (R.equals("translation")) {
            return new wjl(((bll) jsonParserComponent.t9.getValue()).a(yf90Var, jSONObject));
        }
        hex b = yf90Var.b().b(R, jSONObject);
        dkl dklVar = b instanceof dkl ? (dkl) b : null;
        if (dklVar != null) {
            return ((akl) jsonParserComponent.s9.getValue()).a(yf90Var, dklVar, jSONObject);
        }
        throw fg90.m(jSONObject, "type", R);
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, xjl xjlVar) {
        boolean z = xjlVar instanceof vjl;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            return ((f7l) jsonParserComponent.H6.getValue()).b(yf90Var, ((vjl) xjlVar).b);
        }
        if (xjlVar instanceof wjl) {
            return ((bll) jsonParserComponent.t9.getValue()).b(yf90Var, ((wjl) xjlVar).b);
        }
        w511.b();
        return null;
    }
}
