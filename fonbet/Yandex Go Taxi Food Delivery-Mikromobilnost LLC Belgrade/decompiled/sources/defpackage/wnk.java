package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class wnk implements c4x, hex {
    public final exq a;
    public final exq b;

    public wnk(exq exqVar, exq exqVar2) {
        this.a = exqVar;
        this.b = exqVar2;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        vnk vnkVar = (vnk) ft6.b.b3.getValue();
        lb7 lb7Var = ft6.a;
        vnkVar.getClass();
        JSONObject jSONObject = new JSONObject();
        JsonParserComponent jsonParserComponent = vnkVar.a;
        wcx.w(lb7Var, jSONObject, "on_fail_actions", this.a, jsonParserComponent.u1);
        wcx.w(lb7Var, jSONObject, "on_success_actions", this.b, jsonParserComponent.u1);
        return jSONObject;
    }
}
