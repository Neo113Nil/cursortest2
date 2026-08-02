package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class dj9 implements u1f {
    public final szb a;
    public final szb b;
    public final szb c;
    public final bf9 d;
    public Integer e;

    public dj9(szb szbVar, szb szbVar2, szb szbVar3, bf9 bf9Var) {
        this.a = szbVar;
        this.b = szbVar2;
        this.c = szbVar3;
        this.d = bf9Var;
    }

    public final boolean a(dj9 dj9Var, xzb xzbVar, xzb xzbVar2) {
        return dj9Var != null && ((Number) this.a.a(xzbVar)).doubleValue() == ((Number) dj9Var.a.a(xzbVar2)).doubleValue() && ((Number) this.b.a(xzbVar)).longValue() == ((Number) dj9Var.b.a(xzbVar2)).longValue() && ((Number) this.c.a(xzbVar)).intValue() == ((Number) dj9Var.c.a(xzbVar2)).intValue() && this.d.a(dj9Var.d, xzbVar, xzbVar2);
    }

    public final int b() {
        Integer num = this.e;
        if (num != null) {
            return num.intValue();
        }
        int b = this.d.b() + this.c.hashCode() + this.b.hashCode() + this.a.hashCode() + ern.a(dj9.class).hashCode();
        this.e = Integer.valueOf(b);
        return b;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        return ((ej9) rj3.b.e7.getValue()).b(rj3.a, this);
    }
}
