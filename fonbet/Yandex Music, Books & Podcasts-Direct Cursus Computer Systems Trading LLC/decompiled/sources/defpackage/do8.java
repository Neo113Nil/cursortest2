package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class do8 implements u1f {
    public final szb a;
    public Integer b;

    public do8(szb szbVar) {
        this.a = szbVar;
    }

    public final boolean a(do8 do8Var, xzb xzbVar, xzb xzbVar2) {
        return do8Var != null && ((Number) this.a.a(xzbVar)).doubleValue() == ((Number) do8Var.a.a(xzbVar2)).doubleValue();
    }

    public final int b() {
        Integer num = this.b;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.a.hashCode() + ern.a(do8.class).hashCode();
        this.b = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        eo8 eo8Var = (eo8) rj3.b.L1.getValue();
        pt0 pt0Var = rj3.a;
        eo8Var.getClass();
        JSONObject jSONObject = new JSONObject();
        e5f.g(pt0Var, jSONObject, "ratio", this.a);
        return jSONObject;
    }
}
