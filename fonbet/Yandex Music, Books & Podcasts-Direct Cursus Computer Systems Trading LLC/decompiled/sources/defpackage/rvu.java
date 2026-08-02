package defpackage;

/* loaded from: classes4.dex */
public final class rvu implements svu {
    public final int a;
    public final int b;

    public rvu(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rvu)) {
            return false;
        }
        rvu rvuVar = (rvu) obj;
        return this.a == rvuVar.a && this.b == rvuVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return hrg.s("SetNotExact(queuePosition=", ran.a(this.a), ", originalPosition=", gxj.a(this.b), ")");
    }
}
