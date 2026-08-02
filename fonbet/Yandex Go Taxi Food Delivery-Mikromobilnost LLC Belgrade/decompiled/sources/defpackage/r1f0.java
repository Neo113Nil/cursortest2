package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class r1f0 {
    public final String a;
    public final boolean b;

    public r1f0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1f0)) {
            return false;
        }
        r1f0 r1f0Var = (r1f0) obj;
        return this.a.equals(r1f0Var.a) && this.b == r1f0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.k("PrimaryButtonUiState(title=", this.a, ", isLoading=", this.b, Extension.C_BRAKE);
    }
}
