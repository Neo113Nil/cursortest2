package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class slc {
    public int a;
    public String b;

    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof slc)) {
            return false;
        }
        slc slcVar = (slc) obj;
        return this.a == slcVar.a && this.b.equals(slcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return oyr.l(this.a, "CommandResult(code=", ", message=", this.b, Extension.C_BRAKE);
    }
}
