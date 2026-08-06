package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class xf {
    public final java.lang.String ZpBGe2uQfcn8;
    public final int fWTAfUmVKrZq;
    public final long giKS3J6vZuNy;

    public xf(java.lang.String str, long j, int i) {
        this.ZpBGe2uQfcn8 = str;
        this.giKS3J6vZuNy = j;
        this.fWTAfUmVKrZq = i;
        if (str.length() == 0) {
            defpackage.h7.w7APNrr0aGRc("The name of a color space cannot be null and must contain at least 1 character");
            throw null;
        }
        if (i < -1 || i > 63) {
            defpackage.h7.w7APNrr0aGRc("The id must be between -1 and 63");
            throw null;
        }
    }

    public abstract long JhCgjQRTAOCT(float f, float f2, float f3);

    public abstract float WDYagTQQm9ns(float f, float f2, float f3);

    public abstract float ZpBGe2uQfcn8(int i);

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        defpackage.xf xfVar = (defpackage.xf) obj;
        if (this.fWTAfUmVKrZq == xfVar.fWTAfUmVKrZq && this.ZpBGe2uQfcn8.equals(xfVar.ZpBGe2uQfcn8)) {
            return defpackage.jr0.maCixPsq4ml2(this.giKS3J6vZuNy, xfVar.giKS3J6vZuNy);
        }
        return false;
    }

    public boolean fWTAfUmVKrZq() {
        return false;
    }

    public abstract float giKS3J6vZuNy(int i);

    public int hashCode() {
        return defpackage.pVQOaWB9QMo4.fWTAfUmVKrZq(this.ZpBGe2uQfcn8.hashCode() * 31, 31, this.giKS3J6vZuNy) + this.fWTAfUmVKrZq;
    }

    public abstract long oh71FJcDz6S2(float f, float f2, float f3, float f4, defpackage.xf xfVar);

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.ZpBGe2uQfcn8);
        sb.append(" (id=");
        sb.append(this.fWTAfUmVKrZq);
        sb.append(", model=");
        long j = this.giKS3J6vZuNy;
        sb.append((java.lang.Object) (defpackage.jr0.maCixPsq4ml2(j, 12884901888L) ? "Rgb" : defpackage.jr0.maCixPsq4ml2(j, 12884901889L) ? "Xyz" : defpackage.jr0.maCixPsq4ml2(j, 12884901890L) ? "Lab" : defpackage.jr0.maCixPsq4ml2(j, 17179869187L) ? "Cmyk" : "Unknown"));
        sb.append(')');
        return sb.toString();
    }
}
