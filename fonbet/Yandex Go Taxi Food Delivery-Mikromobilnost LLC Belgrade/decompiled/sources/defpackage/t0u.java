package defpackage;

/* loaded from: classes10.dex */
public final class t0u {
    public final int a;

    public t0u(int i) {
        this.a = i;
        if (i > 0) {
            return;
        }
        lxv.a("Provided count should be larger than zero");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t0u) {
            return this.a == ((t0u) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return -this.a;
    }
}
