package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class sda0 {
    public final CharSequence a;
    public final boolean b;
    public final boolean c;

    public sda0(CharSequence charSequence, boolean z, boolean z2) {
        this.a = charSequence;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sda0)) {
            return false;
        }
        sda0 sda0Var = (sda0) obj;
        return jl40.l(this.a, sda0Var.a) && this.b == sda0Var.b && this.c == sda0Var.c;
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        return Boolean.hashCode(this.c) + unr0.e((charSequence == null ? 0 : charSequence.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaymentMethodsUiState(title=");
        sb.append((Object) this.a);
        sb.append(", isLoading=");
        sb.append(this.b);
        sb.append(", isEnabled=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }

    public sda0() {
        this(null, false, true);
    }
}
