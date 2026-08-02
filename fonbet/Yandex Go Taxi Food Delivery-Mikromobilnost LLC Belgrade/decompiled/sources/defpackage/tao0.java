package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class tao0 implements wao0 {
    public final String a;

    public final boolean equals(Object obj) {
        if (obj instanceof tao0) {
            return this.a.equals(((tao0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("OpenLegalTerms(link=", this.a, Extension.C_BRAKE);
    }
}
