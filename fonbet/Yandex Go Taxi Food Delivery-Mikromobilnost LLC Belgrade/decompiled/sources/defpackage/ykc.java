package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes2.dex */
public final class ykc {
    public static final xkc Companion = new xkc();
    public final String a;

    public /* synthetic */ ykc(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            qje.Z(i, 1, wkc.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ykc) && jl40.l(this.a, ((ykc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("Payload(id=", this.a, Extension.C_BRAKE);
    }

    public ykc(String str) {
        this.a = str;
    }
}
