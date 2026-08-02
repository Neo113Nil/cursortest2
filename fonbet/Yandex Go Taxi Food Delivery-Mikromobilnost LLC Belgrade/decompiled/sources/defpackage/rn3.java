package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class rn3 implements tn3 {
    public final String a;

    public rn3(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rn3) && this.a.equals(((rn3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("Authorized(accountUid=", oyr.p("AccountUid(rawValue=", this.a, Extension.C_BRAKE), Extension.C_BRAKE);
    }
}
