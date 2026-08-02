package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import yads.dg2;
import yads.ig2;

@gsq0
/* loaded from: classes7.dex */
public final class u671 {
    public static final w371 Companion = new w371();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, dg2.w)};
    public final String a;
    public final ig2 b;

    public u671(int i, String str, ig2 ig2Var) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, qp61.b);
            throw null;
        }
        this.a = str;
        this.b = ig2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u671)) {
            return false;
        }
        u671 u671Var = (u671) obj;
        return jl40.l(this.a, u671Var.a) && this.b == u671Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PreloadBlock(adUnitId=" + this.a + ", format=" + this.b + Extension.C_BRAKE;
    }

    public u671(String str, ig2 ig2Var) {
        this.a = str;
        this.b = ig2Var;
    }
}
