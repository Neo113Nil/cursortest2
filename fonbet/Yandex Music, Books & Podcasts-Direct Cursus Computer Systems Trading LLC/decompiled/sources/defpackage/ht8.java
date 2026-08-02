package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ht8 implements u1f {
    public final ix8 a;
    public final szb b;
    public final szb c;
    public final szb d;
    public final dx8 e;
    public Integer f;

    public ht8(ix8 ix8Var, szb szbVar, szb szbVar2, szb szbVar3, dx8 dx8Var) {
        this.a = ix8Var;
        this.b = szbVar;
        this.c = szbVar2;
        this.d = szbVar3;
        this.e = dx8Var;
    }

    public final boolean a(ht8 ht8Var, xzb xzbVar, xzb xzbVar2) {
        if (ht8Var != null) {
            ix8 ix8Var = ht8Var.a;
            ix8 ix8Var2 = this.a;
            if ((ix8Var2 != null ? ix8Var2.a(ix8Var, xzbVar, xzbVar2) : ix8Var == null) && ((Boolean) this.b.a(xzbVar)).booleanValue() == ((Boolean) ht8Var.b.a(xzbVar2)).booleanValue() && ((Boolean) this.c.a(xzbVar)).booleanValue() == ((Boolean) ht8Var.c.a(xzbVar2)).booleanValue() && ((Boolean) this.d.a(xzbVar)).booleanValue() == ((Boolean) ht8Var.d.a(xzbVar2)).booleanValue() && this.e.a(ht8Var.e, xzbVar, xzbVar2)) {
                return true;
            }
        }
        return false;
    }

    public final int b() {
        Integer num = this.f;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = ern.a(ht8.class).hashCode();
        ix8 ix8Var = this.a;
        int b = this.e.b() + this.d.hashCode() + this.c.hashCode() + this.b.hashCode() + hashCode + (ix8Var != null ? ix8Var.b() : 0);
        this.f = Integer.valueOf(b);
        return b;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        return ((wt8) rj3.b.y2.getValue()).b(rj3.a, this);
    }
}
