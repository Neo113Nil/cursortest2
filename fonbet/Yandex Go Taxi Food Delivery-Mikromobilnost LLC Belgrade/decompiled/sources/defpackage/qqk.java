package defpackage;

import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class qqk implements c4x, hex {
    public final exq a;
    public final exq b;
    public final exq c;

    static {
        new lvo(eg90.a, "_");
    }

    public qqk(exq exqVar, exq exqVar2, exq exqVar3) {
        this.a = exqVar;
        this.b = exqVar2;
        this.c = exqVar3;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        oqk oqkVar = (oqk) ft6.b.C3.getValue();
        lb7 lb7Var = ft6.a;
        oqkVar.getClass();
        JSONObject jSONObject = new JSONObject();
        wcx.q(lb7Var, jSONObject, "key", this.a);
        wcx.q(lb7Var, jSONObject, "placeholder", this.b);
        wcx.q(lb7Var, jSONObject, "regex", this.c);
        return jSONObject;
    }
}
