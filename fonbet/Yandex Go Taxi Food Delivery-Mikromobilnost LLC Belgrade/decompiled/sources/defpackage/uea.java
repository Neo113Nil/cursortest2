package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class uea {
    public final CharSequence a;
    public final String b;

    public uea(CharSequence charSequence, String str) {
        this.a = charSequence;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uea)) {
            return false;
        }
        uea ueaVar = (uea) obj;
        return jl40.l(this.a, ueaVar.a) && jl40.l(this.b, ueaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TermsLink(title=" + ((Object) this.a) + ", url=" + this.b + Extension.C_BRAKE;
    }
}
