package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class wg4 implements xg4 {
    public final vg4 a;
    public final xg4 b;

    public wg4(vg4 vg4Var, xg4 xg4Var) {
        this.a = vg4Var;
        this.b = xg4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wg4)) {
            return false;
        }
        wg4 wg4Var = (wg4) obj;
        return this.a.equals(wg4Var.a) && jl40.l(this.b, wg4Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        xg4 xg4Var = this.b;
        return hashCode + (xg4Var == null ? 0 : xg4Var.hashCode());
    }

    public final String toString() {
        return "VideoBackground(player=" + this.a + ", previewContent=" + this.b + Extension.C_BRAKE;
    }
}
