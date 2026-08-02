package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class yg51 extends sg51 {
    public final String b;

    public yg51(String str) {
        super(null);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yg51) && jl40.l(this.b, ((yg51) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return oyr.p("RegistrationSuccess(applicationId=", this.b, Extension.C_BRAKE);
    }
}
