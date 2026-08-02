package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class z6m0 {
    public final String a;
    public final String b;
    public final boolean c;

    public z6m0(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z6m0)) {
            return false;
        }
        z6m0 z6m0Var = (z6m0) obj;
        return jl40.l(this.a, z6m0Var.a) && jl40.l(this.b, z6m0Var.b) && this.c == z6m0Var.c;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return x4e.i(b64.v("SavingsAccountLockState(title=", this.a, ", subtitle=", this.b, ", lockingInProgress="), this.c, Extension.C_BRAKE);
    }
}
