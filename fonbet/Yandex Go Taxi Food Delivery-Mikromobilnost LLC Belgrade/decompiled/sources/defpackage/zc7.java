package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class zc7 {
    public final String a;
    public final et5 b;
    public final ot5 c;

    public zc7(String str, et5 et5Var, ot5 ot5Var) {
        this.a = str;
        this.b = et5Var;
        this.c = ot5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zc7) {
            zc7 zc7Var = (zc7) obj;
            if (jl40.l(this.a, zc7Var.a) && this.b == zc7Var.b && this.c.equals(zc7Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CachedBin(prefix=" + this.a + ", binInfo=" + this.b + ", context=" + this.c + Extension.C_BRAKE;
    }
}
