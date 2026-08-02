package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class bf9 implements u1f {
    public final ow8 a;
    public final ow8 b;
    public Integer c;

    public bf9(ow8 ow8Var, ow8 ow8Var2) {
        this.a = ow8Var;
        this.b = ow8Var2;
    }

    public final boolean a(bf9 bf9Var, xzb xzbVar, xzb xzbVar2) {
        return bf9Var != null && this.a.a(bf9Var.a, xzbVar, xzbVar2) && this.b.a(bf9Var.b, xzbVar, xzbVar2);
    }

    public final int b() {
        Integer num = this.c;
        if (num != null) {
            return num.intValue();
        }
        int b = this.b.b() + this.a.b() + ern.a(bf9.class).hashCode();
        this.c = Integer.valueOf(b);
        return b;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        cf9 cf9Var = (cf9) rj3.b.l6.getValue();
        pt0 pt0Var = rj3.a;
        cf9Var.getClass();
        JSONObject jSONObject = new JSONObject();
        jyr jyrVar = cf9Var.a.V2;
        etn.m0(pt0Var, jSONObject, "x", this.a, jyrVar);
        etn.m0(pt0Var, jSONObject, "y", this.b, jyrVar);
        return jSONObject;
    }
}
