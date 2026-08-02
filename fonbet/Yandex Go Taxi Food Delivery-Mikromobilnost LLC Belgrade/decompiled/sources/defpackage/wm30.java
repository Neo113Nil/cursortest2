package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class wm30 implements bn30 {
    public final String a;
    public final pj40 b;

    public wm30(String str, pj40 pj40Var) {
        this.a = str;
        this.b = pj40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wm30)) {
            return false;
        }
        wm30 wm30Var = (wm30) obj;
        return jl40.l(this.a, wm30Var.a) && this.b.equals(wm30Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LineModal(lineId=" + this.a + ", utmParams=" + this.b + Extension.C_BRAKE;
    }
}
