package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes12.dex */
public final class xjo {
    public static final wjo Companion = new wjo();
    public final String a;

    public /* synthetic */ xjo(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            qje.Z(i, 1, vjo.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xjo) && jl40.l(this.a, ((xjo) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("ExchangePersonalizationTokenResponseDto(userToken=", this.a, Extension.C_BRAKE);
    }
}
