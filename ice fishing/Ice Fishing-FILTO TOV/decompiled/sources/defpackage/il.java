package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class il implements el {
    public final ju AvO7iQsrTN;
    public final float EljAMC1QTz;
    public final float OOA6hdeuvCS;

    public il(float f, float f2, ju juVar) {
        this.OOA6hdeuvCS = f;
        this.EljAMC1QTz = f2;
        this.AvO7iQsrTN = juVar;
    }

    @Override // defpackage.el
    public final float AEn1Rrio(long j) {
        if (b91.GWasM1elztuh(a91.Yi7zF1RB1(j), 4294967296L)) {
            return this.AvO7iQsrTN.Yi7zF1RB1(a91.X1lG3V04pd(j));
        }
        o4.jivtDDk9H("Only Sp can convert to Px");
        return 0.0f;
    }

    @Override // defpackage.el
    public final float Yi7zF1RB1() {
        return this.OOA6hdeuvCS;
    }

    @Override // defpackage.el
    public final long YmKjaVtbfp5Z(float f) {
        return o50.EXrPz3p7hFb(this.AvO7iQsrTN.GWasM1elztuh(f), 4294967296L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof il)) {
            return false;
        }
        il ilVar = (il) obj;
        return Float.compare(this.OOA6hdeuvCS, ilVar.OOA6hdeuvCS) == 0 && Float.compare(this.EljAMC1QTz, ilVar.EljAMC1QTz) == 0 && this.AvO7iQsrTN.equals(ilVar.AvO7iQsrTN);
    }

    public final int hashCode() {
        return this.AvO7iQsrTN.hashCode() + mr0.GWasM1elztuh(this.EljAMC1QTz, Float.hashCode(this.OOA6hdeuvCS) * 31, 31);
    }

    @Override // defpackage.el
    public final float mOu10nynGul() {
        return this.EljAMC1QTz;
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.OOA6hdeuvCS + ", fontScale=" + this.EljAMC1QTz + ", converter=" + this.AvO7iQsrTN + ')';
    }
}
