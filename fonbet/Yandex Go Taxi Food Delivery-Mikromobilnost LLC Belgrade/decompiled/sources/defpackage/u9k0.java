package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class u9k0 implements ibk0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public u9k0(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    @Override // defpackage.nqs0
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u9k0)) {
            return false;
        }
        u9k0 u9k0Var = (u9k0) obj;
        return jl40.l(this.a, u9k0Var.a) && jl40.l(this.b, u9k0Var.b) && jl40.l(this.c, u9k0Var.c) && jl40.l(this.d, u9k0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return g8e.r(b64.v("OpenCenterModal(analyticsName=", this.a, ", title=", this.b, ", description="), this.c, ", buttonTitle=", this.d, Extension.C_BRAKE);
    }
}
