package defpackage;

/* loaded from: classes6.dex */
public final class u3r {
    public final float a;
    public final float b;
    public final int c;
    public final float d;

    public u3r(float f, float f2, float f3, int i) {
        this.a = f;
        this.b = f2;
        this.c = i;
        this.d = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u3r)) {
            return false;
        }
        u3r u3rVar = (u3r) obj;
        return cma.a(this.a, u3rVar.a) && cma.a(this.b, u3rVar.b) && this.c == u3rVar.c && Float.compare(this.d, u3rVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + f1d.a(this.c, eta.a(Float.hashCode(this.a) * 31, this.b, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Spacers(verticalArrangement=");
        vz1.z(this.a, ", horizontalArrangement=", sb);
        vz1.z(this.b, ", labelSpace=", sb);
        sb.append(this.c);
        sb.append(", tableCharWidthMultiplier=");
        return ouj.p(sb, this.d, ')');
    }
}
