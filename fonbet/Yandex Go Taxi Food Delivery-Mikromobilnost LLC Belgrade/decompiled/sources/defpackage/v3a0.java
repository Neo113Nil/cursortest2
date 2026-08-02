package defpackage;

/* loaded from: classes2.dex */
public final class v3a0 {
    public final String a;
    public final rw90 b;

    public v3a0(String str, rw90 rw90Var) {
        this.a = str;
        this.b = rw90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v3a0)) {
            return false;
        }
        v3a0 v3a0Var = (v3a0) obj;
        return this.a.equals(v3a0Var.a) && this.b.equals(v3a0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Asset(__typename=" + this.a + ", paymentButtonAsset=" + this.b + ')';
    }
}
