package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class tw80 implements uw80 {
    public final String a;
    public final boolean b;

    public tw80(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tw80)) {
            return false;
        }
        tw80 tw80Var = (tw80) obj;
        return jl40.l(this.a, tw80Var.a) && this.b == tw80Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.k("NewAttachment(uri=", this.a, ", forceAsFile=", this.b, Extension.C_BRAKE);
    }
}
