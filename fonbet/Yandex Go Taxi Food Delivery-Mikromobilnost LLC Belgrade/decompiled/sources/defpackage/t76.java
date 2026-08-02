package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class t76 {
    public final String a;
    public final boolean b;

    public t76(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t76)) {
            return false;
        }
        t76 t76Var = (t76) obj;
        return jl40.l(this.a, t76Var.a) && this.b == t76Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.k("OpenModal(modalId=", this.a, ", overrideTrailClick=", this.b, Extension.C_BRAKE);
    }
}
