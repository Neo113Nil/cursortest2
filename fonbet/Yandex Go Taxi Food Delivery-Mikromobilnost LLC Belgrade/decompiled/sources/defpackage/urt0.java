package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class urt0 implements bst0 {
    public final boolean a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;

    public urt0(String str, int i, String str2, String str3, boolean z) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof urt0)) {
            return false;
        }
        urt0 urt0Var = (urt0) obj;
        return this.a == urt0Var.a && jl40.l(this.b, urt0Var.b) && jl40.l(this.c, urt0Var.c) && jl40.l(this.d, urt0Var.d) && this.e == urt0Var.e;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        return Integer.hashCode(this.e) + unr0.b(unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder v = ly3.v("SplashScreenV2Config(isEnabled=", ", title=", this.b, ", imageTag=", this.a);
        g8e.D(v, this.c, ", imageUrl=", this.d, ", exitDelay=");
        return oyr.m(this.e, Extension.C_BRAKE, v);
    }
}
