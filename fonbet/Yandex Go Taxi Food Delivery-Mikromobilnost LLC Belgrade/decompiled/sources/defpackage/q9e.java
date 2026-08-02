package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class q9e {
    public final String a;
    public final String b;

    public q9e(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q9e)) {
            return false;
        }
        q9e q9eVar = (q9e) obj;
        return jl40.l(this.a, q9eVar.a) && jl40.l(this.b, q9eVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return unr0.p("Contact(name=", this.a, ", phone=", this.b, Extension.C_BRAKE);
    }
}
