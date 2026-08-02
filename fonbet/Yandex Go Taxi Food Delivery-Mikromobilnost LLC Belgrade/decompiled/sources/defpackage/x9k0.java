package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class x9k0 implements ibk0 {
    public final String a;

    public x9k0(String str) {
        this.a = str;
    }

    @Override // defpackage.nqs0
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x9k0) && jl40.l(this.a, ((x9k0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("OpenCompactOrDetails(analyticsName=", this.a, Extension.C_BRAKE);
    }
}
