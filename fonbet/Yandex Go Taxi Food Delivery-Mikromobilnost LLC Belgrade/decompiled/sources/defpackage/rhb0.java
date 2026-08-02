package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class rhb0 implements uhb0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public rhb0(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rhb0)) {
            return false;
        }
        rhb0 rhb0Var = (rhb0) obj;
        return jl40.l(this.a, rhb0Var.a) && jl40.l(this.b, rhb0Var.b) && jl40.l(this.c, rhb0Var.c) && jl40.l(this.d, rhb0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return g8e.r(b64.v("Failure(title=", this.a, ", subtitle=", this.b, ", nextButtonText="), this.c, ", retryButtonText=", this.d, Extension.C_BRAKE);
    }
}
