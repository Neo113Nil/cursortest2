package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class hl implements el {
    public final float EljAMC1QTz;
    public final float OOA6hdeuvCS;

    public hl(float f, float f2) {
        this.OOA6hdeuvCS = f;
        this.EljAMC1QTz = f2;
    }

    @Override // defpackage.el
    public final float Yi7zF1RB1() {
        return this.OOA6hdeuvCS;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hl)) {
            return false;
        }
        hl hlVar = (hl) obj;
        return Float.compare(this.OOA6hdeuvCS, hlVar.OOA6hdeuvCS) == 0 && Float.compare(this.EljAMC1QTz, hlVar.EljAMC1QTz) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.EljAMC1QTz) + (Float.hashCode(this.OOA6hdeuvCS) * 31);
    }

    @Override // defpackage.el
    public final float mOu10nynGul() {
        return this.EljAMC1QTz;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DensityImpl(density=");
        sb.append(this.OOA6hdeuvCS);
        sb.append(", fontScale=");
        return mr0.JFJ3QoxA(sb, this.EljAMC1QTz, ')');
    }
}
