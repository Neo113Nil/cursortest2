package defpackage;

/* loaded from: classes10.dex */
public final class xza0 implements zza0 {
    public final boolean a;

    public xza0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xza0) && this.a == ((xza0) obj).a;
    }

    public final int hashCode() {
        boolean z = this.a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        return unr0.u(new StringBuilder("Denied(shouldShowRationale="), this.a, ')');
    }
}
