package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class zv9 implements dw9 {
    public final sr9 a;
    public final boolean b;

    public zv9(sr9 sr9Var, boolean z) {
        this.a = sr9Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zv9)) {
            return false;
        }
        zv9 zv9Var = (zv9) obj;
        return jl40.l(this.a, zv9Var.a) && this.b == zv9Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Details(details=" + this.a + ", openedFromTargetDiscount=" + this.b + Extension.C_BRAKE;
    }
}
