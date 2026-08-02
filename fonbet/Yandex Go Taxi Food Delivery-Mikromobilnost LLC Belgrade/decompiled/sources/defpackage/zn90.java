package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class zn90 {
    public final String a;
    public final String b;

    public zn90(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zn90)) {
            return false;
        }
        zn90 zn90Var = (zn90) obj;
        return this.a.equals(zn90Var.a) && this.b.equals(zn90Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("PassportCredentials(clientId=", this.a, ", secretId=", this.b, Extension.C_BRAKE);
    }
}
