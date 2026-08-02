package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes6.dex */
public final class tky {
    public static final sky Companion = new sky();
    public final String a;

    public /* synthetic */ tky(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            qje.Z(i, 1, rky.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tky) && jl40.l(this.a, ((tky) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("LinkCardStatusRequest(sessionId=", this.a, Extension.C_BRAKE);
    }

    public tky(String str) {
        this.a = str;
    }
}
