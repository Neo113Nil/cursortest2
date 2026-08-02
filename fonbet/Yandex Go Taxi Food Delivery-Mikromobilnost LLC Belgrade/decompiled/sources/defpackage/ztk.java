package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ztk implements qfy0 {
    public final JsonParserComponent a;

    public ztk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final wtk a(yf90 yf90Var, cuk cukVar, JSONObject jSONObject) {
        boolean z = cukVar instanceof auk;
        JsonParserComponent jsonParserComponent = this.a;
        if (!z) {
            if (cukVar instanceof buk) {
                return new vtk(((ybl) jsonParserComponent.O7.getValue()).a(yf90Var, ((buk) cukVar).a(), jSONObject));
            }
            w511.b();
            return null;
        }
        gnk gnkVar = (gnk) jsonParserComponent.T2.getValue();
        ink inkVar = ((auk) cukVar).a;
        gnkVar.getClass();
        exq exqVar = inkVar.a;
        JsonParserComponent jsonParserComponent2 = gnkVar.a;
        sqk sqkVar = (sqk) xcx.h(yf90Var, exqVar, jSONObject, "space_between_centers", jsonParserComponent2.G3, jsonParserComponent2.E3);
        if (sqkVar == null) {
            sqkVar = hnk.a;
        }
        return new utk(new dnk(sqkVar));
    }
}
