package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class xch {
    public final String a;
    public final String b;

    public xch(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xch)) {
            return false;
        }
        xch xchVar = (xch) obj;
        return jl40.l(this.a, xchVar.a) && jl40.l(this.b, xchVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("DefaultIdentityProvider(deviceId=", this.a, ", uuid=", this.b, Extension.C_BRAKE);
    }
}
