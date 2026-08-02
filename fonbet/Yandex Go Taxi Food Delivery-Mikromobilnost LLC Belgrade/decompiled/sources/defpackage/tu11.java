package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class tu11 implements vu11 {
    public final String a;
    public final String b;

    public tu11(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.nqs0
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tu11)) {
            return false;
        }
        tu11 tu11Var = (tu11) obj;
        return jl40.l(this.a, tu11Var.a) && jl40.l(this.b, tu11Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("OpenDeeplink(analyticsName=", this.a, ", deeplink=", this.b, Extension.C_BRAKE);
    }
}
