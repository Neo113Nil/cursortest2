package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class r531 {
    public final String a;
    public final String b;

    public r531(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r531)) {
            return false;
        }
        r531 r531Var = (r531) obj;
        return jl40.l(this.a, r531Var.a) && jl40.l(this.b, r531Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("VehicleCopyInfo(textToCopy=", this.a, ", notificationText=", this.b, Extension.C_BRAKE);
    }
}
