package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class re0 extends ye0 {
    public final String b;

    public re0(String str) {
        super(str);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof re0) && jl40.l(this.b, ((re0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return oyr.p("CustomEntryPoint(source=", this.b, Extension.C_BRAKE);
    }
}
