package defpackage;

/* loaded from: classes.dex */
public final class yof {
    public final int a;
    public final int b;
    public final boolean c;

    public yof(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yof)) {
            return false;
        }
        yof yofVar = (yof) obj;
        return this.a == yofVar.a && this.b == yofVar.b && this.c == yofVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + f1d.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BidiRun(start=");
        sb.append(this.a);
        sb.append(", end=");
        sb.append(this.b);
        sb.append(", isRtl=");
        return dfi.j(sb, this.c, ')');
    }
}
