package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class wd40 implements xd40 {
    public final CharSequence a;
    public final CharSequence b;

    public /* synthetic */ wd40(String str, int i) {
        this((i & 1) != 0 ? null : str, (String) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wd40)) {
            return false;
        }
        wd40 wd40Var = (wd40) obj;
        return jl40.l(this.a, wd40Var.a) && jl40.l(this.b, wd40Var.b);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.b;
        return hashCode + (charSequence2 != null ? charSequence2.hashCode() : 0);
    }

    public final String toString() {
        return ly3.l(this.a, this.b, "Loading(title=", ", subtitle=", Extension.C_BRAKE);
    }

    public wd40(CharSequence charSequence, String str) {
        this.a = charSequence;
        this.b = str;
    }

    public wd40() {
        this((String) null, 3);
    }
}
