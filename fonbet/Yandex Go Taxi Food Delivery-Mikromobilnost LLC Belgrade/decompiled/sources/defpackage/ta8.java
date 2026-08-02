package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ta8 {
    public final String a;
    public final String b;

    public ta8(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ta8)) {
            return false;
        }
        ta8 ta8Var = (ta8) obj;
        return jl40.l(this.a, ta8Var.a) && jl40.l(this.b, ta8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("CreateApplicationResponse(applicationId=", this.a, ", agreement=", this.b, Extension.C_BRAKE);
    }
}
