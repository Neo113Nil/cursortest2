package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class tn9 {
    public final CharSequence a;
    public final int b;

    public tn9(int i, CharSequence charSequence) {
        this.a = charSequence;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tn9)) {
            return false;
        }
        tn9 tn9Var = (tn9) obj;
        return jl40.l(this.a, tn9Var.a) && this.b == tn9Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ChargersAttribute(text=" + ((Object) this.a) + ", backgroundColor=" + this.b + Extension.C_BRAKE;
    }
}
