package defpackage;

/* loaded from: classes.dex */
public final class gg1 {
    public final long IHQe1A4L2xu;

    public static final boolean IHQe1A4L2xu(long j, long j2) {
        return j == j2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.gg1) {
            return this.IHQe1A4L2xu == ((defpackage.gg1) obj).IHQe1A4L2xu;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.IHQe1A4L2xu);
    }

    public final java.lang.String toString() {
        long j = this.IHQe1A4L2xu;
        return IHQe1A4L2xu(j, 0L) ? "Unspecified" : IHQe1A4L2xu(j, 4294967296L) ? "Sp" : IHQe1A4L2xu(j, 8589934592L) ? "Em" : "Invalid";
    }
}
