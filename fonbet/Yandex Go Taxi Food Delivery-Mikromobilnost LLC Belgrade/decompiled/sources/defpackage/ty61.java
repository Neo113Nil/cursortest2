package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes7.dex */
public final class ty61 {
    public static final mn61 Companion = new mn61();
    public final wn71 a;

    public ty61(int i, wn71 wn71Var) {
        if (1 == (i & 1)) {
            this.a = wn71Var;
        } else {
            qje.Z(i, 1, rj61.b);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ty61) && jl40.l(this.a, ((ty61) obj).a);
    }

    public final int hashCode() {
        wn71 wn71Var = this.a;
        if (wn71Var == null) {
            return 0;
        }
        return wn71Var.hashCode();
    }

    public final String toString() {
        return "FontParameters(urls=" + this.a + Extension.C_BRAKE;
    }
}
