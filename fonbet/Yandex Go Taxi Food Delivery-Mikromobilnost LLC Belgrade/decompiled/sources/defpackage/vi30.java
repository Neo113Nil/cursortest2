package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class vi30 {
    public final int a;
    public final CharSequence b;

    public vi30(int i, CharSequence charSequence) {
        this.a = i;
        this.b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vi30)) {
            return false;
        }
        vi30 vi30Var = (vi30) obj;
        return this.a == vi30Var.a && jl40.l(this.b, vi30Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "MtDuration(minutes=" + this.a + ", text=" + ((Object) this.b) + Extension.C_BRAKE;
    }
}
