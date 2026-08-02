package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class t2a {
    public final CharSequence a;

    public final boolean equals(Object obj) {
        if (obj instanceof t2a) {
            return this.a.equals(((t2a) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.h(this.a, "ChargersLegalTerms(legalTerms=", Extension.C_BRAKE);
    }
}
