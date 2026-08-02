package defpackage;

/* loaded from: classes4.dex */
public final class i2p implements k2p {
    public final boolean a;
    public final int b;

    public i2p(int i, boolean z) {
        this.a = z;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2p)) {
            return false;
        }
        i2p i2pVar = (i2p) obj;
        return this.a == i2pVar.a && this.b == i2pVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Placeholder(isLoading=" + this.a + ", count=" + this.b + ")";
    }
}
