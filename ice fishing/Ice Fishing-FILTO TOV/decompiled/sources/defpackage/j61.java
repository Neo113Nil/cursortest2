package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class j61 extends qj {
    public final float Mjvvu5DE;
    public final int Y6hRI1cF8;
    public final int jivtDDk9H;
    public final float mE4lRynR;

    public j61(float f, float f2, int i, int i2, int i3) {
        f2 = (i3 & 2) != 0 ? 4.0f : f2;
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? 0 : i2;
        this.Mjvvu5DE = f;
        this.mE4lRynR = f2;
        this.jivtDDk9H = i;
        this.Y6hRI1cF8 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j61)) {
            return false;
        }
        j61 j61Var = (j61) obj;
        return this.Mjvvu5DE == j61Var.Mjvvu5DE && this.mE4lRynR == j61Var.mE4lRynR && this.jivtDDk9H == j61Var.jivtDDk9H && this.Y6hRI1cF8 == j61Var.Y6hRI1cF8;
    }

    public final int hashCode() {
        return mr0.Yi7zF1RB1(this.Y6hRI1cF8, mr0.Yi7zF1RB1(this.jivtDDk9H, mr0.GWasM1elztuh(this.mE4lRynR, Float.hashCode(this.Mjvvu5DE) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Stroke(width=");
        sb.append(this.Mjvvu5DE);
        sb.append(", miter=");
        sb.append(this.mE4lRynR);
        sb.append(", cap=");
        String str = "Unknown";
        int i = this.jivtDDk9H;
        sb.append((Object) (i == 0 ? "Butt" : i == 1 ? "Round" : i == 2 ? "Square" : "Unknown"));
        sb.append(", join=");
        int i2 = this.Y6hRI1cF8;
        if (i2 == 0) {
            str = "Miter";
        } else if (i2 == 1) {
            str = "Round";
        } else if (i2 == 2) {
            str = "Bevel";
        }
        sb.append((Object) str);
        sb.append(", pathEffect=null)");
        return sb.toString();
    }
}
