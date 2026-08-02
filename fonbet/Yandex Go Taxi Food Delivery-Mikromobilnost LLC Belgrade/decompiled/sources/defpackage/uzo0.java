package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class uzo0 {
    public final CharSequence a;
    public final String b;

    public uzo0(CharSequence charSequence, String str) {
        this.a = charSequence;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uzo0)) {
            return false;
        }
        uzo0 uzo0Var = (uzo0) obj;
        return jl40.l(this.a, uzo0Var.a) && jl40.l(this.b, uzo0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LegalInfo(text=" + ((Object) this.a) + ", link=" + this.b + Extension.C_BRAKE;
    }
}
