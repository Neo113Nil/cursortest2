package defpackage;

/* loaded from: classes4.dex */
public final class evm extends fvm {
    public final int a;

    public evm(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof evm) && this.a == ((evm) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return dfi.c(this.a, "Success(text=", ")");
    }
}
