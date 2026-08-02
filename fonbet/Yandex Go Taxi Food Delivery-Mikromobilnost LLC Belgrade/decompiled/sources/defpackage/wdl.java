package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class wdl implements zsq0, yey0 {
    public final JsonParserComponent a;

    public wdl(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final hex a(yf90 yf90Var, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        JsonParserComponent jsonParserComponent = this.a;
        return new del(wcx.c(Q, jSONObject, "div", i, null, jsonParserComponent.Y9), wcx.d(Q, jSONObject, "title", wm11.c, i, null), wcx.i(Q, jSONObject, "title_click_action", i, null, jsonParserComponent.u1));
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, del delVar) {
        JSONObject jSONObject = new JSONObject();
        exq exqVar = delVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        wcx.u(yf90Var, jSONObject, "div", exqVar, jsonParserComponent.Y9);
        wcx.q(yf90Var, jSONObject, "title", delVar.b);
        wcx.u(yf90Var, jSONObject, "title_click_action", delVar.c, jsonParserComponent.u1);
        return jSONObject;
    }
}
