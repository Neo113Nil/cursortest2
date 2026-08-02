package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class yk9 {
    public final CharSequence a;
    public final String b;

    public yk9(CharSequence charSequence, String str) {
        this.a = charSequence;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yk9)) {
            return false;
        }
        yk9 yk9Var = (yk9) obj;
        return jl40.l(this.a, yk9Var.a) && jl40.l(this.b, yk9Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "HeaderPart(title=" + ((Object) this.a) + ", iconUrl=" + this.b + Extension.C_BRAKE;
    }
}
