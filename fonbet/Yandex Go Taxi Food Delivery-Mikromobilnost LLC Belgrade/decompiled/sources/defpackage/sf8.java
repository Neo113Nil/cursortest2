package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class sf8 {
    public final String a;
    public final String b;
    public final boolean c;

    public sf8(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sf8)) {
            return false;
        }
        sf8 sf8Var = (sf8) obj;
        return this.a.equals(sf8Var.a) && this.b.equals(sf8Var.b) && this.c == sf8Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return x4e.i(b64.v("CardInfo(id=", this.a, ", paymentSystem=", this.b, ", isWithoutCvn="), this.c, Extension.C_BRAKE);
    }
}
