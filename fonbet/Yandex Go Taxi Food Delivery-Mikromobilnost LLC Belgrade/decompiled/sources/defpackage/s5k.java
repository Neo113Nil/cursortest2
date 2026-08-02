package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class s5k implements qfy0 {
    public final JsonParserComponent a;

    public s5k(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final p5k a(yf90 yf90Var, v5k v5kVar, JSONObject jSONObject) {
        boolean z = v5kVar instanceof t5k;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            xhe xheVar = (xhe) jsonParserComponent.u.getValue();
            yhe yheVar = ((t5k) v5kVar).a;
            xheVar.getClass();
            return new n5k(new uhe(xcx.c(yf90Var, yheVar.a, jSONObject, "value", wm11.c)));
        }
        if (!(v5kVar instanceof u5k)) {
            w511.b();
            return null;
        }
        vie vieVar = (vie) jsonParserComponent.x.getValue();
        wie wieVar = ((u5k) v5kVar).a;
        vieVar.getClass();
        return new o5k(new sie(xcx.d(yf90Var, wieVar.a, jSONObject, "value", wm11.e, b.e)));
    }
}
