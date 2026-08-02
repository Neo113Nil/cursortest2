package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class swk implements qfy0 {
    public final JsonParserComponent a;

    public swk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ewk a(yf90 yf90Var, bxk bxkVar, JSONObject jSONObject) {
        boolean z = bxkVar instanceof axk;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            wwk wwkVar = (wwk) jsonParserComponent.N4.getValue();
            ywk ywkVar = ((axk) bxkVar).a;
            wwkVar.getClass();
            return new dwk(wwk.b(yf90Var, ywkVar, jSONObject));
        }
        if (!(bxkVar instanceof zwk)) {
            w511.b();
            return null;
        }
        nwk nwkVar = (nwk) jsonParserComponent.K4.getValue();
        pwk pwkVar = ((zwk) bxkVar).a;
        nwkVar.getClass();
        return new cwk(nwk.b(yf90Var, pwkVar, jSONObject));
    }
}
