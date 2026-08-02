package defpackage;

import com.yandex.div2.JsonParserComponent;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class unk implements zsq0, nyi {
    public final JsonParserComponent a;

    public unk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        JsonParserComponent jsonParserComponent = this.a;
        return new tnk(wwg.O(yf90Var, jSONObject, "on_fail_actions", jsonParserComponent.t1), wwg.O(yf90Var, jSONObject, "on_success_actions", jsonParserComponent.t1));
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, tnk tnkVar) {
        JSONObject jSONObject = new JSONObject();
        List list = tnkVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        wwg.c0(yf90Var, jSONObject, "on_fail_actions", list, jsonParserComponent.t1);
        wwg.c0(yf90Var, jSONObject, "on_success_actions", tnkVar.b, jsonParserComponent.t1);
        return jSONObject;
    }
}
