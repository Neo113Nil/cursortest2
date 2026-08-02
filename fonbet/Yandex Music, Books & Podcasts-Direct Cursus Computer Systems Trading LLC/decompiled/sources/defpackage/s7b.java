package defpackage;

/* loaded from: classes6.dex */
public final class s7b {
    public final int a;
    public final int b;

    public s7b(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s7b)) {
            return false;
        }
        s7b s7bVar = (s7b) obj;
        return this.a == s7bVar.a && this.b == s7bVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EngineCount(backward=");
        sb.append(this.a);
        sb.append(", forward=");
        return vz1.r(sb, this.b, ')');
    }
}
