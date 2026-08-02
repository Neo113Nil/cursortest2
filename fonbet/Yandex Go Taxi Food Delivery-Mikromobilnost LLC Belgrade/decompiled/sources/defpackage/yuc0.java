package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class yuc0 {
    public final String a;
    public final kdc b;

    public yuc0(kdc kdcVar, String str) {
        this.a = str;
        this.b = kdcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yuc0)) {
            return false;
        }
        yuc0 yuc0Var = (yuc0) obj;
        return jl40.l(this.a, yuc0Var.a) && jl40.l(this.b, yuc0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        kdc kdcVar = this.b;
        return hashCode + (kdcVar == null ? 0 : kdcVar.hashCode());
    }

    public final String toString() {
        return "Text(value=" + this.a + ", color=" + this.b + Extension.C_BRAKE;
    }
}
