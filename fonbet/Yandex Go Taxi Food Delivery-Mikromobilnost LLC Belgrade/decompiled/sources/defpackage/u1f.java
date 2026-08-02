package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class u1f {
    public final String a;
    public final boolean b;

    public u1f(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1f)) {
            return false;
        }
        u1f u1fVar = (u1f) obj;
        return this.a.equals(u1fVar.a) && this.b == u1fVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.k("ConfirmButton(text=", this.a, ", isEnabled=", this.b, Extension.C_BRAKE);
    }
}
