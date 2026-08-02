package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class rmc implements tmc {
    public final pmc a;

    public rmc(pmc pmcVar) {
        this.a = pmcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rmc) && this.a.equals(((rmc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Loaded(data=" + this.a + Extension.C_BRAKE;
    }
}
