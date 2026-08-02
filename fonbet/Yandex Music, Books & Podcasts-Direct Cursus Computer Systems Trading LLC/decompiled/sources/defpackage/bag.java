package defpackage;

/* loaded from: classes6.dex */
public final class bag {
    public final int a;
    public final int b;
    public final int c;

    public bag(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bag)) {
            return false;
        }
        bag bagVar = (bag) obj;
        return this.a == bagVar.a && this.b == bagVar.b && this.c == bagVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + f1d.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PendingScroll(firstVisible=");
        sb.append(this.a);
        sb.append(", visibleCount=");
        sb.append(this.b);
        sb.append(", totalCount=");
        return vz1.r(sb, this.c, ')');
    }
}
