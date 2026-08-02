package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class zuv {
    public final String a;
    public final String b;
    public final boolean c;

    public zuv(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zuv)) {
            return false;
        }
        zuv zuvVar = (zuv) obj;
        return this.a.equals(zuvVar.a) && this.b.equals(zuvVar.b) && this.c == zuvVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return x4e.i(b64.v("VerificationIntent(bindingId=", this.a, ", id=", this.b, ", needCvvChallenge="), this.c, Extension.C_BRAKE);
    }
}
