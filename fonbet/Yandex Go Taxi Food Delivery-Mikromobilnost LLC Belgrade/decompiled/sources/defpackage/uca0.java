package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class uca0 {
    public final String a;
    public final String b;

    public uca0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uca0)) {
            return false;
        }
        uca0 uca0Var = (uca0) obj;
        return jl40.l(this.a, uca0Var.a) && jl40.l(this.b, uca0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("PaymentMethodsNameEditUiState(baseName=", this.a, ", currentName=", this.b, Extension.C_BRAKE);
    }
}
