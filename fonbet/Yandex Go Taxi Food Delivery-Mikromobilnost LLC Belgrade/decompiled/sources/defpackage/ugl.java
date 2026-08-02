package defpackage;

import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class ugl implements c4x, hex {
    public final exq a;

    static {
        new kvo(Boolean.TRUE);
    }

    public ugl(exq exqVar) {
        this.a = exqVar;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        sgl sglVar = (sgl) ft6.b.A8.getValue();
        lb7 lb7Var = ft6.a;
        sglVar.getClass();
        JSONObject jSONObject = new JSONObject();
        wcx.q(lb7Var, jSONObject, "is_enabled", this.a);
        return jSONObject;
    }
}
