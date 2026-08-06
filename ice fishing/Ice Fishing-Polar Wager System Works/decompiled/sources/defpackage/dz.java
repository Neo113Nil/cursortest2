package defpackage;

/* loaded from: classes.dex */
public final class dz implements java.lang.Comparable {
    public static final defpackage.dz AARZUJiTa;
    public static final defpackage.dz EXtogiMhuM;
    public static final defpackage.dz SH1y5HwkJhh;
    public static final defpackage.dz riuEU0zW4;
    public static final defpackage.dz xiZrDbcSW0;
    public final int adDC3e2L;

    static {
        defpackage.dz dzVar = new defpackage.dz(100);
        defpackage.dz dzVar2 = new defpackage.dz(200);
        defpackage.dz dzVar3 = new defpackage.dz(300);
        defpackage.dz dzVar4 = new defpackage.dz(400);
        defpackage.dz dzVar5 = new defpackage.dz(500);
        defpackage.dz dzVar6 = new defpackage.dz(600);
        xiZrDbcSW0 = dzVar6;
        defpackage.dz dzVar7 = new defpackage.dz(700);
        defpackage.dz dzVar8 = new defpackage.dz(800);
        defpackage.dz dzVar9 = new defpackage.dz(900);
        AARZUJiTa = dzVar4;
        EXtogiMhuM = dzVar5;
        riuEU0zW4 = dzVar6;
        SH1y5HwkJhh = dzVar7;
        defpackage.fm.yIx6ChFVk(dzVar, dzVar2, dzVar3, dzVar4, dzVar5, dzVar6, dzVar7, dzVar8, dzVar9);
    }

    public dz(int i) {
        this.adDC3e2L = i;
        boolean z = false;
        if (1 <= i && i < 1001) {
            z = true;
        }
        if (z) {
            return;
        }
        defpackage.y50.IHQe1A4L2xu("Font weight can be in range [1, 1000]. Current value: " + i);
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object obj) {
        return defpackage.x70.kNAkVymC(this.adDC3e2L, ((defpackage.dz) obj).adDC3e2L);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.dz) {
            return this.adDC3e2L == ((defpackage.dz) obj).adDC3e2L;
        }
        return false;
    }

    public final int hashCode() {
        return this.adDC3e2L;
    }

    public final java.lang.String toString() {
        return "FontWeight(weight=" + this.adDC3e2L + ')';
    }
}
