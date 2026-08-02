package defpackage;

/* loaded from: classes.dex */
public final class z7w {
    public final long a;
    public final long b;

    public z7w(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z7w)) {
            return false;
        }
        z7w z7wVar = (z7w) obj;
        return this.a == z7wVar.a && this.b == z7wVar.b;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
