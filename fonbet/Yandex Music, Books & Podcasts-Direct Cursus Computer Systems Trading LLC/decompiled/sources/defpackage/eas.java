package defpackage;

/* loaded from: classes3.dex */
public final class eas {
    public final int a;
    public final int b;
    public final int c;

    public eas(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eas)) {
            return false;
        }
        eas easVar = (eas) obj;
        return this.a == easVar.a && this.b == easVar.b && this.c == easVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + f1d.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextDiff(start=");
        sb.append(this.a);
        sb.append(", added=");
        sb.append(this.b);
        sb.append(", removed=");
        return vz1.r(sb, this.c, ')');
    }
}
