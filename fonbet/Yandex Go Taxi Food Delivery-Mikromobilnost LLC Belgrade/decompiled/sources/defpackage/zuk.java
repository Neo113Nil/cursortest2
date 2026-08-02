package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class zuk implements qfy0 {
    public final JsonParserComponent a;

    public zuk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ruk a(yf90 yf90Var, hvk hvkVar, JSONObject jSONObject) {
        boolean z = hvkVar instanceof gvk;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            dvk dvkVar = (dvk) jsonParserComponent.z4.getValue();
            evk evkVar = ((gvk) hvkVar).a;
            dvkVar.getClass();
            return new quk(new avk(xcx.c(yf90Var, evkVar.a, jSONObject, "pattern", wm11.c)));
        }
        if (!(hvkVar instanceof fvk)) {
            w511.b();
            return null;
        }
        vuk vukVar = (vuk) jsonParserComponent.w4.getValue();
        wuk wukVar = ((fvk) hvkVar).a;
        vukVar.getClass();
        return new puk(new suk(xcx.d(yf90Var, wukVar.a, jSONObject, "condition", wm11.a, b.f)));
    }
}
