package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class xp4 {
    public final String a;
    public final String b;

    public xp4(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xp4)) {
            return false;
        }
        xp4 xp4Var = (xp4) obj;
        return this.a.equals(xp4Var.a) && this.b.equals(xp4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("BankData(name=", this.a, ", scheme=", this.b, Extension.C_BRAKE);
    }
}
