package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes12.dex */
public final class ujo {
    public static final tjo Companion = new tjo();
    public final String a;

    public /* synthetic */ ujo(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            qje.Z(i, 1, sjo.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ujo) && jl40.l(this.a, ((ujo) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("ExchangePersonalizationTokenRequestBody(userToken=", this.a, Extension.C_BRAKE);
    }

    public ujo(String str) {
        this.a = str;
    }
}
