package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class vfi0 {
    public final String a;
    public final String b;

    public vfi0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vfi0)) {
            return false;
        }
        vfi0 vfi0Var = (vfi0) obj;
        return jl40.l(this.a, vfi0Var.a) && jl40.l(this.b, vfi0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("ReceiverInfoEntity(phoneNumber=", this.a, ", name=", this.b, Extension.C_BRAKE);
    }
}
