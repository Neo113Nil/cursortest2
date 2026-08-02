package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class yt51 implements zt51 {
    public final String a;
    public final String b;

    public yt51(String str, String str2) {
        this.a = str;
        this.b = str2;
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
        if (!(obj instanceof yt51)) {
            return false;
        }
        yt51 yt51Var = (yt51) obj;
        return jl40.l(this.a, yt51Var.a) && jl40.l(this.b, yt51Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("Token(token=", this.a, ", platform=", this.b, Extension.C_BRAKE);
    }
}
