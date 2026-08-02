package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class skk implements qfy0 {
    public final JsonParserComponent a;

    public skk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final pkk a(yf90 yf90Var, vkk vkkVar, JSONObject jSONObject) {
        boolean z = vkkVar instanceof ukk;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            ((guk) jsonParserComponent.t4.getValue()).getClass();
            return new okk(new duk());
        }
        if (!(vkkVar instanceof tkk)) {
            w511.b();
            return null;
        }
        fqk fqkVar = (fqk) jsonParserComponent.x3.getValue();
        gqk gqkVar = ((tkk) vkkVar).a;
        fqkVar.getClass();
        return new nkk(new cqk(xcx.e(yf90Var, gqkVar.a, jSONObject, "value", wm11.b, b.h, x991.a)));
    }
}
