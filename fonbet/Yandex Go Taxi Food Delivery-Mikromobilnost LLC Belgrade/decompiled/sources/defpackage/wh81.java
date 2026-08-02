package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class wh81 {
    public final boolean a;
    public final String b;
    public final String c;

    public wh81(String str, String str2, boolean z) {
        this.a = z;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wh81)) {
            return false;
        }
        wh81 wh81Var = (wh81) obj;
        return this.a == wh81Var.a && jl40.l(this.b, wh81Var.b) && jl40.l(this.c, wh81Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + z2a1.a(Boolean.hashCode(this.a) * 31, this.b);
    }

    public final String toString() {
        return oyr.t(ly3.v("AdTuneInfo(shouldShow=", ", token=", this.b, ", advertiserInfo=", this.a), this.c, Extension.C_BRAKE);
    }
}
