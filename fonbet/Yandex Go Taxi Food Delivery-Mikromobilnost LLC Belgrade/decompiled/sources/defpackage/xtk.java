package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class xtk implements zsq0, nyi {
    public final JsonParserComponent a;

    public xtk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        String R = wwg.R(jSONObject);
        boolean equals = R.equals("default");
        JsonParserComponent jsonParserComponent = this.a;
        if (equals) {
            return new utk(((enk) jsonParserComponent.R2.getValue()).a(yf90Var, jSONObject));
        }
        if (R.equals("stretch")) {
            return new vtk(((wbl) jsonParserComponent.M7.getValue()).a(yf90Var, jSONObject));
        }
        hex b = yf90Var.b().b(R, jSONObject);
        cuk cukVar = b instanceof cuk ? (cuk) b : null;
        if (cukVar != null) {
            return ((ztk) jsonParserComponent.n4.getValue()).a(yf90Var, cukVar, jSONObject);
        }
        throw fg90.m(jSONObject, "type", R);
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, wtk wtkVar) {
        boolean z = wtkVar instanceof utk;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            return ((enk) jsonParserComponent.R2.getValue()).b(yf90Var, ((utk) wtkVar).b);
        }
        if (wtkVar instanceof vtk) {
            return ((wbl) jsonParserComponent.M7.getValue()).b(yf90Var, ((vtk) wtkVar).b);
        }
        w511.b();
        return null;
    }
}
