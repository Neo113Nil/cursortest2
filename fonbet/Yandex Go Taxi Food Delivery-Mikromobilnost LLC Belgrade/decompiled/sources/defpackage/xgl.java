package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class xgl implements qfy0 {
    public final JsonParserComponent a;

    public xgl(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final pgl a(yf90 yf90Var, nhl nhlVar, JSONObject jSONObject) {
        boolean z = nhlVar instanceof lhl;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            return new ngl(((chl) jsonParserComponent.D8.getValue()).a(yf90Var, ((lhl) nhlVar).a, jSONObject));
        }
        if (!(nhlVar instanceof mhl)) {
            w511.b();
            return null;
        }
        ihl ihlVar = (ihl) jsonParserComponent.G8.getValue();
        khl khlVar = ((mhl) nhlVar).a;
        ihlVar.getClass();
        return new ogl(ihl.b(yf90Var, khlVar, jSONObject));
    }
}
