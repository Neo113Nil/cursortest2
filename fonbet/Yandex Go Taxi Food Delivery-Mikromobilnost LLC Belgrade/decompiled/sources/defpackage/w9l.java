package defpackage;

import com.yandex.div2.DivSizeUnit;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class w9l implements c4x, hex {
    public final exq a;
    public final exq b;

    static {
        new kvo(DivSizeUnit.DP);
    }

    public w9l(exq exqVar, exq exqVar2) {
        this.a = exqVar;
        this.b = exqVar2;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        v9l v9lVar = (v9l) ft6.b.m7.getValue();
        lb7 lb7Var = ft6.a;
        v9lVar.getClass();
        JSONObject jSONObject = new JSONObject();
        wcx.p(this.a, DivSizeUnit.TO_STRING, lb7Var, "unit", jSONObject);
        wcx.q(lb7Var, jSONObject, "value", this.b);
        return jSONObject;
    }
}
