package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class i51 implements td1 {
    public final long EljAMC1QTz;
    public final td1 OOA6hdeuvCS;

    public i51(td1 td1Var, long j) {
        this.OOA6hdeuvCS = td1Var;
        this.EljAMC1QTz = j;
    }

    @Override // defpackage.td1
    public final r3 E7jCp8Ls(long j, r3 r3Var, r3 r3Var2, r3 r3Var3) {
        long j2 = this.EljAMC1QTz;
        return j < j2 ? r3Var3 : this.OOA6hdeuvCS.E7jCp8Ls(j - j2, r3Var, r3Var2, r3Var3);
    }

    @Override // defpackage.td1
    public final boolean GWasM1elztuh() {
        return this.OOA6hdeuvCS.GWasM1elztuh();
    }

    @Override // defpackage.td1
    public final long Yi7zF1RB1(r3 r3Var, r3 r3Var2, r3 r3Var3) {
        return this.OOA6hdeuvCS.Yi7zF1RB1(r3Var, r3Var2, r3Var3) + this.EljAMC1QTz;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i51)) {
            return false;
        }
        i51 i51Var = (i51) obj;
        return i51Var.EljAMC1QTz == this.EljAMC1QTz && o30.rQPn8YBR(i51Var.OOA6hdeuvCS, this.OOA6hdeuvCS);
    }

    public final int hashCode() {
        return Long.hashCode(this.EljAMC1QTz) + (this.OOA6hdeuvCS.hashCode() * 31);
    }

    @Override // defpackage.td1
    public final r3 iwATDS1i01k(long j, r3 r3Var, r3 r3Var2, r3 r3Var3) {
        long j2 = this.EljAMC1QTz;
        return j < j2 ? r3Var : this.OOA6hdeuvCS.iwATDS1i01k(j - j2, r3Var, r3Var2, r3Var3);
    }
}
