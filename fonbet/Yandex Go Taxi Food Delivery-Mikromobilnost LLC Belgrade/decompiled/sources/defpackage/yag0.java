package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class yag0 implements qas0 {
    public final String a;
    public final boolean b;

    public yag0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final String a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yag0)) {
            return false;
        }
        yag0 yag0Var = (yag0) obj;
        return jl40.l(this.a, yag0Var.a) && this.b == yag0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.k("OpenRedirectLink(link=", this.a, ", isDeeplink=", this.b, Extension.C_BRAKE);
    }
}
