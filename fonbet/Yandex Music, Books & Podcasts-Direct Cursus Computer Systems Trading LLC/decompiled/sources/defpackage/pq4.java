package defpackage;

/* loaded from: classes4.dex */
public final class pq4 {
    public final oq4 a;
    public final int b;

    public pq4(oq4 oq4Var, int i) {
        this.a = oq4Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pq4)) {
            return false;
        }
        pq4 pq4Var = (pq4) obj;
        return this.a == pq4Var.a && this.b == pq4Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CodecBitrate(codec=" + this.a + ", bitrate=" + this.b + ")";
    }
}
