package defpackage;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class qyk implements c4x, hex {
    public final exq a;
    public final exq b;

    public qyk(exq exqVar, exq exqVar2) {
        this.a = exqVar;
        this.b = exqVar2;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        pyk pykVar = (pyk) ft6.b.Y4.getValue();
        lb7 lb7Var = ft6.a;
        pykVar.getClass();
        JSONObject jSONObject = new JSONObject();
        wcx.t(lb7Var, jSONObject, "height_variable_name", this.a);
        wcx.t(lb7Var, jSONObject, "width_variable_name", this.b);
        return jSONObject;
    }
}
