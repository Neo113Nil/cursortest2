package defpackage;

import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class s8k implements c4x, hex {
    public final exq a;
    public final exq b;

    public s8k(exq exqVar, exq exqVar2) {
        this.a = exqVar;
        this.b = exqVar2;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        r8k r8kVar = (r8k) ft6.b.K0.getValue();
        lb7 lb7Var = ft6.a;
        r8kVar.getClass();
        JSONObject jSONObject = new JSONObject();
        wcx.q(lb7Var, jSONObject, "end", this.a);
        wcx.q(lb7Var, jSONObject, "start", this.b);
        wwg.Z(lb7Var, jSONObject, "type", "absolute");
        return jSONObject;
    }
}
