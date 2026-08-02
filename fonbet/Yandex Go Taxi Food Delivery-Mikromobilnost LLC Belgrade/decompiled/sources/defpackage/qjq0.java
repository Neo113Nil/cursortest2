package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class qjq0 {
    public final String a;
    public final boolean b;

    public qjq0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qjq0)) {
            return false;
        }
        qjq0 qjq0Var = (qjq0) obj;
        return jl40.l(this.a, qjq0Var.a) && this.b == qjq0Var.b;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return xvz.k("MiddleName(title=", this.a, ", noMiddleNameSelected=", this.b, Extension.C_BRAKE);
    }
}
