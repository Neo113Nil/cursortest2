package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class riz implements tiz {
    public final String a;

    public riz(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof riz) && jl40.l(this.a, ((riz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("DirectPhoneCall(phoneNumber=", this.a, Extension.C_BRAKE);
    }
}
