package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.altpins.AltpinSourceModalViewEntryPoint;

/* loaded from: classes5.dex */
public final class xx1 {
    public final String a;
    public final sz1 b;
    public final zzs c;
    public final lz1 d;
    public final AltpinSourceModalViewEntryPoint e;

    public xx1(String str, sz1 sz1Var, zzs zzsVar, lz1 lz1Var, AltpinSourceModalViewEntryPoint altpinSourceModalViewEntryPoint) {
        this.a = str;
        this.b = sz1Var;
        this.c = zzsVar;
        this.d = lz1Var;
        this.e = altpinSourceModalViewEntryPoint;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xx1) {
            xx1 xx1Var = (xx1) obj;
            if (jl40.l(this.a, xx1Var.a) && this.b == xx1Var.b && jl40.l(this.c, xx1Var.c) && this.d.equals(xx1Var.d) && this.e == xx1Var.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + nnm.b(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        return "AlternativeSourceModalViewPayload(orderId=" + this.a + ", bubble=" + this.b + ", point=" + this.c + ", altpinModalViewData=" + this.d + ", entryPoint=" + this.e + Extension.C_BRAKE;
    }
}
