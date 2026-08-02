package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class s3f {
    public final String a;
    public final boolean b;
    public final String c;
    public final boolean d;

    public s3f(boolean z, boolean z2, String str, String str2) {
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s3f)) {
            return false;
        }
        s3f s3fVar = (s3f) obj;
        return jl40.l(this.a, s3fVar.a) && this.b == s3fVar.b && jl40.l(this.c, s3fVar.c) && this.d == s3fVar.d;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.d) + unr0.b(unr0.e((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return nnm.i(this.c, ", showNameInput=", Extension.C_BRAKE, oo31.l("CreateAccountState(accountName=", this.a, ", createButtonProgressing=", ", nameInputError=", this.b), this.d);
    }

    public s3f() {
        this(false, false, null, "");
    }
}
