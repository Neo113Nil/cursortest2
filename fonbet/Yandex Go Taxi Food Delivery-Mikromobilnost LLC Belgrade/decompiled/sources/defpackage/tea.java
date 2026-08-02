package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class tea {
    public final String a;
    public final CharSequence b;

    public tea(CharSequence charSequence, String str) {
        this.a = str;
        this.b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tea)) {
            return false;
        }
        tea teaVar = (tea) obj;
        return jl40.l(this.a, teaVar.a) && jl40.l(this.b, teaVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "Term(iconTag=" + this.a + ", title=" + ((Object) this.b) + Extension.C_BRAKE;
    }
}
