package defpackage;

/* loaded from: classes.dex */
public final class aqe {
    public static final aqe e = new aqe(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public aqe(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final long a() {
        return (this.a << 32) | (this.b & 4294967295L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aqe)) {
            return false;
        }
        aqe aqeVar = (aqe) obj;
        return this.a == aqeVar.a && this.b == aqeVar.b && this.c == aqeVar.c && this.d == aqeVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + f1d.a(this.c, f1d.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRect.fromLTRB(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        return vz1.r(sb, this.d, ')');
    }
}
