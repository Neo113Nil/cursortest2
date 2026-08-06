package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ou implements Comparable {
    public static final ou AvO7iQsrTN;
    public static final ou EljAMC1QTz;
    public static final ou JFJ3QoxA;
    public static final ou encWxUiV2;
    public static final ou mOu10nynGul;
    public final int OOA6hdeuvCS;

    static {
        ou ouVar = new ou(100);
        ou ouVar2 = new ou(200);
        ou ouVar3 = new ou(300);
        ou ouVar4 = new ou(400);
        ou ouVar5 = new ou(500);
        ou ouVar6 = new ou(600);
        EljAMC1QTz = ouVar6;
        ou ouVar7 = new ou(700);
        ou ouVar8 = new ou(800);
        ou ouVar9 = new ou(900);
        AvO7iQsrTN = ouVar4;
        encWxUiV2 = ouVar5;
        mOu10nynGul = ouVar6;
        JFJ3QoxA = ouVar7;
        fb1.rezfBrjOrqK(ouVar, ouVar2, ouVar3, ouVar4, ouVar5, ouVar6, ouVar7, ouVar8, ouVar9);
    }

    public ou(int i) {
        this.OOA6hdeuvCS = i;
        boolean z = false;
        if (1 <= i && i < 1001) {
            z = true;
        }
        if (z) {
            return;
        }
        u10.GWasM1elztuh("Font weight can be in range [1, 1000]. Current value: " + i);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return o30.uFEq9NpZ(this.OOA6hdeuvCS, ((ou) obj).OOA6hdeuvCS);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ou) {
            return this.OOA6hdeuvCS == ((ou) obj).OOA6hdeuvCS;
        }
        return false;
    }

    public final int hashCode() {
        return this.OOA6hdeuvCS;
    }

    public final String toString() {
        return "FontWeight(weight=" + this.OOA6hdeuvCS + ')';
    }
}
