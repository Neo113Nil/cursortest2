package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class uv0 implements z11 {
    public final dh GWasM1elztuh;
    public final dh X1lG3V04pd;
    public final dh Yi7zF1RB1;
    public final dh xqGvceK5x;

    public uv0(dh dhVar, dh dhVar2, dh dhVar3, dh dhVar4) {
        this.GWasM1elztuh = dhVar;
        this.Yi7zF1RB1 = dhVar2;
        this.X1lG3V04pd = dhVar3;
        this.xqGvceK5x = dhVar4;
    }

    public static uv0 Yi7zF1RB1(uv0 uv0Var, dh dhVar, dh dhVar2, dh dhVar3, dh dhVar4, int i) {
        if ((i & 1) != 0) {
            dhVar = uv0Var.GWasM1elztuh;
        }
        if ((i & 2) != 0) {
            dhVar2 = uv0Var.Yi7zF1RB1;
        }
        if ((i & 4) != 0) {
            dhVar3 = uv0Var.X1lG3V04pd;
        }
        if ((i & 8) != 0) {
            dhVar4 = uv0Var.xqGvceK5x;
        }
        uv0Var.getClass();
        return new uv0(dhVar, dhVar2, dhVar3, dhVar4);
    }

    @Override // defpackage.z11
    public final z50 GWasM1elztuh(long j, p50 p50Var, el elVar) {
        float GWasM1elztuh = this.GWasM1elztuh.GWasM1elztuh(j, elVar);
        float GWasM1elztuh2 = this.Yi7zF1RB1.GWasM1elztuh(j, elVar);
        float GWasM1elztuh3 = this.X1lG3V04pd.GWasM1elztuh(j, elVar);
        float GWasM1elztuh4 = this.xqGvceK5x.GWasM1elztuh(j, elVar);
        float Yi7zF1RB1 = t21.Yi7zF1RB1(j);
        float f = GWasM1elztuh + GWasM1elztuh4;
        if (f > Yi7zF1RB1) {
            float f2 = Yi7zF1RB1 / f;
            GWasM1elztuh *= f2;
            GWasM1elztuh4 *= f2;
        }
        float f3 = GWasM1elztuh2 + GWasM1elztuh3;
        if (f3 > Yi7zF1RB1) {
            float f4 = Yi7zF1RB1 / f3;
            GWasM1elztuh2 *= f4;
            GWasM1elztuh3 *= f4;
        }
        if (GWasM1elztuh < 0.0f || GWasM1elztuh2 < 0.0f || GWasM1elztuh3 < 0.0f || GWasM1elztuh4 < 0.0f) {
            w10.GWasM1elztuh("Corner size in Px can't be negative(topStart = " + GWasM1elztuh + ", topEnd = " + GWasM1elztuh2 + ", bottomEnd = " + GWasM1elztuh3 + ", bottomStart = " + GWasM1elztuh4 + ")!");
        }
        if (GWasM1elztuh + GWasM1elztuh2 + GWasM1elztuh3 + GWasM1elztuh4 == 0.0f) {
            return new an0(w60.EljAMC1QTz(0L, j));
        }
        kt0 EljAMC1QTz = w60.EljAMC1QTz(0L, j);
        p50 p50Var2 = p50.OOA6hdeuvCS;
        float f5 = p50Var == p50Var2 ? GWasM1elztuh : GWasM1elztuh2;
        long floatToRawIntBits = (Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L);
        if (p50Var == p50Var2) {
            GWasM1elztuh = GWasM1elztuh2;
        }
        long floatToRawIntBits2 = (Float.floatToRawIntBits(GWasM1elztuh) << 32) | (Float.floatToRawIntBits(GWasM1elztuh) & 4294967295L);
        float f6 = p50Var == p50Var2 ? GWasM1elztuh3 : GWasM1elztuh4;
        long floatToRawIntBits3 = (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f6) & 4294967295L);
        if (p50Var != p50Var2) {
            GWasM1elztuh4 = GWasM1elztuh3;
        }
        return new bn0(new sv0(EljAMC1QTz.GWasM1elztuh, EljAMC1QTz.Yi7zF1RB1, EljAMC1QTz.X1lG3V04pd, EljAMC1QTz.xqGvceK5x, floatToRawIntBits, floatToRawIntBits2, floatToRawIntBits3, (Float.floatToRawIntBits(GWasM1elztuh4) << 32) | (Float.floatToRawIntBits(GWasM1elztuh4) & 4294967295L)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uv0)) {
            return false;
        }
        uv0 uv0Var = (uv0) obj;
        return o30.rQPn8YBR(this.GWasM1elztuh, uv0Var.GWasM1elztuh) && o30.rQPn8YBR(this.Yi7zF1RB1, uv0Var.Yi7zF1RB1) && o30.rQPn8YBR(this.X1lG3V04pd, uv0Var.X1lG3V04pd) && o30.rQPn8YBR(this.xqGvceK5x, uv0Var.xqGvceK5x);
    }

    public final int hashCode() {
        return this.xqGvceK5x.hashCode() + ((this.X1lG3V04pd.hashCode() + ((this.Yi7zF1RB1.hashCode() + (this.GWasM1elztuh.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.GWasM1elztuh + ", topEnd = " + this.Yi7zF1RB1 + ", bottomEnd = " + this.X1lG3V04pd + ", bottomStart = " + this.xqGvceK5x + ')';
    }
}
