package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class vk11 {
    public final String a;
    public final String b;

    public vk11(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vk11)) {
            return false;
        }
        vk11 vk11Var = (vk11) obj;
        return jl40.l(this.a, vk11Var.a) && jl40.l(this.b, vk11Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("TwoFactorData(pinCode=", this.a, ", operationId=", this.b, Extension.C_BRAKE);
    }
}
