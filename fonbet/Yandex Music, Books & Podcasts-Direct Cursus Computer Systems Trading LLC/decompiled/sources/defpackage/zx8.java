package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zx8 implements u1f {
    public final szb a;
    public final szb b;
    public final szb c;
    public final szb d;
    public Integer e;

    public zx8(szb szbVar, szb szbVar2, szb szbVar3, szb szbVar4) {
        this.a = szbVar;
        this.b = szbVar2;
        this.c = szbVar3;
        this.d = szbVar4;
    }

    public final boolean a(zx8 zx8Var, xzb xzbVar, xzb xzbVar2) {
        return zx8Var != null && ((Number) this.a.a(xzbVar)).doubleValue() == ((Number) zx8Var.a.a(xzbVar2)).doubleValue() && ((Number) this.b.a(xzbVar)).longValue() == ((Number) zx8Var.b.a(xzbVar2)).longValue() && this.c.a(xzbVar) == zx8Var.c.a(xzbVar2) && ((Number) this.d.a(xzbVar)).longValue() == ((Number) zx8Var.d.a(xzbVar2)).longValue();
    }

    public final int b() {
        Integer num = this.e;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.d.hashCode() + this.c.hashCode() + this.b.hashCode() + this.a.hashCode() + ern.a(zx8.class).hashCode();
        this.e = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        ay8 ay8Var = (ay8) rj3.b.n3.getValue();
        pt0 pt0Var = rj3.a;
        ay8Var.getClass();
        return ay8.d(pt0Var, this);
    }
}
