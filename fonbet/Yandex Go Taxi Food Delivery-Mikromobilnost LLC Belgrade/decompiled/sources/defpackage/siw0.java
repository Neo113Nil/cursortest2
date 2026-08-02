package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class siw0 {
    public final fqc a;
    public final String b;

    public siw0(fqc fqcVar, String str) {
        this.a = fqcVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof siw0)) {
            return false;
        }
        siw0 siw0Var = (siw0) obj;
        return this.a.equals(siw0Var.a) && jl40.l(this.b, siw0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "SupportChatData(source=" + this.a + ", botGuid=" + this.b + Extension.C_BRAKE;
    }
}
