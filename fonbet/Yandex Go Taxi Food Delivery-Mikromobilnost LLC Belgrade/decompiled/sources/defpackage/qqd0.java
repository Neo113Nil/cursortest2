package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class qqd0 {
    public final String a;
    public final boolean b;

    public qqd0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qqd0)) {
            return false;
        }
        qqd0 qqd0Var = (qqd0) obj;
        return jl40.l(this.a, qqd0Var.a) && this.b == qqd0Var.b;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return xvz.k("PlusUserInfo(balance=", this.a, ", hasSubscription=", this.b, Extension.C_BRAKE);
    }
}
