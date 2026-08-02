package defpackage;

/* loaded from: classes.dex */
public final class iap {
    public static final iap c = new iap(0, 0);
    public final long a;
    public final long b;

    public iap(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && iap.class == obj.getClass()) {
            iap iapVar = (iap) obj;
            if (this.a == iapVar.a && this.b == iapVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[timeUs=");
        sb.append(this.a);
        sb.append(", position=");
        return hrg.m(this.b, "]", sb);
    }
}
