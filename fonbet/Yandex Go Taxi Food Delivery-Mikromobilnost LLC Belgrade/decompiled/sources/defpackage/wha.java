package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class wha {
    public final String a;
    public final CharSequence b;

    public wha(CharSequence charSequence, String str) {
        this.a = str;
        this.b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wha)) {
            return false;
        }
        wha whaVar = (wha) obj;
        return jl40.l(this.a, whaVar.a) && jl40.l(this.b, whaVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "PaymentMethodRowState(iconTag=" + this.a + ", body=" + ((Object) this.b) + Extension.C_BRAKE;
    }
}
