package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class gc {
    public final String GWasM1elztuh;
    public final int X1lG3V04pd;
    public final long Yi7zF1RB1;

    public gc(String str, long j, int i) {
        this.GWasM1elztuh = str;
        this.Yi7zF1RB1 = j;
        this.X1lG3V04pd = i;
        if (str.length() == 0) {
            o4.mE4lRynR("The name of a color space cannot be null and must contain at least 1 character");
            throw null;
        }
        if (i < -1 || i > 63) {
            o4.mE4lRynR("The id must be between -1 and 63");
            throw null;
        }
    }

    public abstract long EljAMC1QTz(float f, float f2, float f3, float f4, gc gcVar);

    public abstract float GWasM1elztuh(int i);

    public abstract float OOA6hdeuvCS(float f, float f2, float f3);

    public boolean X1lG3V04pd() {
        return false;
    }

    public abstract float Yi7zF1RB1(int i);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        gc gcVar = (gc) obj;
        if (this.X1lG3V04pd == gcVar.X1lG3V04pd && this.GWasM1elztuh.equals(gcVar.GWasM1elztuh)) {
            return p.E7jCp8Ls(this.Yi7zF1RB1, gcVar.Yi7zF1RB1);
        }
        return false;
    }

    public int hashCode() {
        return mr0.X1lG3V04pd(this.GWasM1elztuh.hashCode() * 31, 31, this.Yi7zF1RB1) + this.X1lG3V04pd;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.GWasM1elztuh);
        sb.append(" (id=");
        sb.append(this.X1lG3V04pd);
        sb.append(", model=");
        long j = this.Yi7zF1RB1;
        sb.append((Object) (p.E7jCp8Ls(j, 12884901888L) ? "Rgb" : p.E7jCp8Ls(j, 12884901889L) ? "Xyz" : p.E7jCp8Ls(j, 12884901890L) ? "Lab" : p.E7jCp8Ls(j, 17179869187L) ? "Cmyk" : "Unknown"));
        sb.append(')');
        return sb.toString();
    }

    public abstract long xqGvceK5x(float f, float f2, float f3);
}
