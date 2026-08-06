package defpackage;

/* loaded from: classes.dex */
public final class wf1 {
    public static final long oh6vYeIP = defpackage.l80.r1MBDhnF(0, 0);
    public static final /* synthetic */ int r1MBDhnF = 0;
    public final long IHQe1A4L2xu;

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.wf1) {
            return this.IHQe1A4L2xu == ((defpackage.wf1) obj).IHQe1A4L2xu;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.IHQe1A4L2xu);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TextRange(");
        long j = this.IHQe1A4L2xu;
        sb.append((int) (j >> 32));
        sb.append(", ");
        sb.append((int) (j & 4294967295L));
        sb.append(')');
        return sb.toString();
    }
}
