package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class vjb implements zjb {
    public final Throwable a;
    public final q8j0 b;
    public final String c;

    public vjb(Throwable th, q8j0 q8j0Var, String str) {
        this.a = th;
        this.b = q8j0Var;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vjb)) {
            return false;
        }
        vjb vjbVar = (vjb) obj;
        return this.a.equals(vjbVar.a) && this.b.equals(vjbVar.b) && jl40.l(this.c, vjbVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Error(throwable=");
        sb.append(this.a);
        sb.append(", requestState=");
        sb.append(this.b);
        sb.append(", requestId=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
