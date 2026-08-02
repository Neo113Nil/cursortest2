package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class rnr0 {
    public final String a;
    public final String b;
    public final Boolean c;

    public rnr0(String str, String str2, Boolean bool) {
        this.a = str;
        this.b = str2;
        this.c = bool;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rnr0)) {
            return false;
        }
        rnr0 rnr0Var = (rnr0) obj;
        return jl40.l(this.a, rnr0Var.a) && jl40.l(this.b, rnr0Var.b) && jl40.l(this.c, rnr0Var.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        Boolean bool = this.c;
        return b + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        return nzs.d(b64.v("Details(name=", this.a, ", color=", this.b, ", hasPassportAccount="), this.c, Extension.C_BRAKE);
    }
}
