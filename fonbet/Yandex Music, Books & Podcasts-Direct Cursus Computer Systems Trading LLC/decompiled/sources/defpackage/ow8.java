package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ow8 implements u1f {
    public final szb a;
    public final szb b;
    public Integer c;

    public ow8(szb szbVar, szb szbVar2) {
        this.a = szbVar;
        this.b = szbVar2;
    }

    public final boolean a(ow8 ow8Var, xzb xzbVar, xzb xzbVar2) {
        return ow8Var != null && this.a.a(xzbVar) == ow8Var.a.a(xzbVar2) && ((Number) this.b.a(xzbVar)).doubleValue() == ((Number) ow8Var.b.a(xzbVar2)).doubleValue();
    }

    public final int b() {
        Integer num = this.c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.b.hashCode() + this.a.hashCode() + ern.a(ow8.class).hashCode();
        this.c = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        pw8 pw8Var = (pw8) rj3.b.V2.getValue();
        pt0 pt0Var = rj3.a;
        pw8Var.getClass();
        return pw8.c(pt0Var, this);
    }
}
