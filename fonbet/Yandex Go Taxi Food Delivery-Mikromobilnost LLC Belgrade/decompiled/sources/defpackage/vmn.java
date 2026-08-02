package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class vmn {
    public final String a;
    public final boolean b;

    public vmn(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vmn)) {
            return false;
        }
        vmn vmnVar = (vmn) obj;
        return jl40.l(this.a, vmnVar.a) && this.b == vmnVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.k("EditOrderDetailsArgs(deliveryId=", this.a, ", isForceOpen=", this.b, Extension.C_BRAKE);
    }
}
