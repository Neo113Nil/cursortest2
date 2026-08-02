package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class qcr0 implements rcr0 {
    public final String a;
    public final boolean b;

    public qcr0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qcr0)) {
            return false;
        }
        qcr0 qcr0Var = (qcr0) obj;
        return jl40.l(this.a, qcr0Var.a) && this.b == qcr0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.k("Phone(phone=", this.a, ", isEnabled=", this.b, Extension.C_BRAKE);
    }
}
