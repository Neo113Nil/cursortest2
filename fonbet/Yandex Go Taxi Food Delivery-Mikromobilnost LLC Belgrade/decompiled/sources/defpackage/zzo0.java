package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class zzo0 {
    public final CharSequence a;
    public final String b;

    public zzo0(CharSequence charSequence, String str) {
        this.a = charSequence;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzo0)) {
            return false;
        }
        zzo0 zzo0Var = (zzo0) obj;
        return jl40.l(this.a, zzo0Var.a) && jl40.l(this.b, zzo0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LegalInfo(text=" + ((Object) this.a) + ", link=" + this.b + Extension.C_BRAKE;
    }
}
