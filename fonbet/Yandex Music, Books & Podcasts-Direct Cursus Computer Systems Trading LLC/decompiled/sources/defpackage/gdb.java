package defpackage;

/* loaded from: classes3.dex */
public final class gdb implements hdb {
    public final boolean a;
    public final boolean b;

    public gdb(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    @Override // defpackage.hdb
    public final boolean a() {
        return this.b;
    }

    @Override // defpackage.hdb
    public final boolean c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gdb)) {
            return false;
        }
        gdb gdbVar = (gdb) obj;
        return this.a == gdbVar.a && this.b == gdbVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return hrg.t("NotAuthorized(shouldShowMainScreen=", this.a, ", isOnboardingShown=", this.b, ")");
    }
}
