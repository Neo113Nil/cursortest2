package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class vdl implements zsq0, nyi {
    public final JsonParserComponent a;

    public vdl(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        JsonParserComponent jsonParserComponent = this.a;
        return new kdl((m3k) wwg.E(yf90Var, jSONObject, "div", jsonParserComponent.X9), a.b(yf90Var, jSONObject, "title", wm11.c, q5z.c, q5z.b), (v3k) wwg.M(yf90Var, jSONObject, "title_click_action", jsonParserComponent.t1));
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, kdl kdlVar) {
        JSONObject jSONObject = new JSONObject();
        m3k m3kVar = kdlVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        wwg.b0(yf90Var, jSONObject, "div", m3kVar, jsonParserComponent.X9);
        a.g(yf90Var, jSONObject, "title", kdlVar.b);
        wwg.b0(yf90Var, jSONObject, "title_click_action", kdlVar.c, jsonParserComponent.t1);
        return jSONObject;
    }
}
