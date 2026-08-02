package defpackage;

/* loaded from: classes.dex */
public final class cbp {
    public final long a;
    public final long b;

    public cbp(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && cbp.class == obj.getClass()) {
            cbp cbpVar = (cbp) obj;
            if (this.a == cbpVar.a && this.b == cbpVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
