package defpackage;

/* loaded from: classes.dex */
public final class qpe {
    public final long a;

    public static long a(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qpe) {
            return this.a == ((qpe) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        long j = this.a;
        sb.append((int) (j >> 32));
        sb.append(", ");
        return vz1.r(sb, (int) (j & 4294967295L), ')');
    }
}
