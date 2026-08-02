package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class yfi0 {
    public final String a;
    public final String b;
    public final String c;
    public long d;

    public yfi0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yfi0)) {
            return false;
        }
        yfi0 yfi0Var = (yfi0) obj;
        return jl40.l(this.a, yfi0Var.a) && jl40.l(this.b, yfi0Var.b) && jl40.l(this.c, yfi0Var.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return oyr.t(b64.v("RecentStickerData(stickerId=", this.a, ", originalPackId=", this.b, ", text="), this.c, Extension.C_BRAKE);
    }
}
