package defpackage;

import com.yandex.div2.DivAppearanceTransition;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.b2;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class uek implements qfy0 {
    public final JsonParserComponent a;

    public uek(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final DivAppearanceTransition a(yf90 yf90Var, zek zekVar, JSONObject jSONObject) {
        boolean z = zekVar instanceof xek;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            mek mekVar = (mek) jsonParserComponent.H1.getValue();
            nek nekVar = ((xek) zekVar).a;
            mekVar.getClass();
            exq exqVar = nekVar.a;
            JsonParserComponent jsonParserComponent2 = mekVar.a;
            return new qek(new jek(xcx.g(yf90Var, exqVar, jSONObject, "items", jsonParserComponent2.K1, jsonParserComponent2.I1, gwk0.a)));
        }
        if (zekVar instanceof vek) {
            kpk kpkVar = (kpk) jsonParserComponent.o3.getValue();
            lpk lpkVar = ((vek) zekVar).a;
            kpkVar.getClass();
            return new oek(kpk.b(yf90Var, lpkVar, jSONObject));
        }
        if (zekVar instanceof wek) {
            t7l t7lVar = (t7l) jsonParserComponent.P6.getValue();
            u7l u7lVar = ((wek) zekVar).a;
            t7lVar.getClass();
            return new pek(t7l.b(yf90Var, u7lVar, jSONObject));
        }
        if (zekVar instanceof yek) {
            return new rek(((b2) jsonParserComponent.t7.getValue()).a(yf90Var, ((yek) zekVar).a, jSONObject));
        }
        w511.b();
        return null;
    }
}
