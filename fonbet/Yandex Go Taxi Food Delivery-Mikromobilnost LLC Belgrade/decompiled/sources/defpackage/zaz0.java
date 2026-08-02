package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class zaz0 {
    public final String a;
    public final xaz0 b;

    public zaz0(String str, xaz0 xaz0Var) {
        this.a = str;
        this.b = xaz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zaz0)) {
            return false;
        }
        zaz0 zaz0Var = (zaz0) obj;
        return jl40.l(this.a, zaz0Var.a) && jl40.l(this.b, zaz0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        xaz0 xaz0Var = this.b;
        return hashCode + (xaz0Var == null ? 0 : xaz0Var.hashCode());
    }

    public final String toString() {
        return "TimelineDetailsShareButtonState(text=" + this.a + ", action=" + this.b + Extension.C_BRAKE;
    }
}
