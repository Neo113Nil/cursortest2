package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class uzc {
    public final b4u0 a;
    public final b4u0 b;

    public uzc(b4u0 b4u0Var, b4u0 b4u0Var2) {
        this.a = b4u0Var;
        this.b = b4u0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uzc)) {
            return false;
        }
        uzc uzcVar = (uzc) obj;
        return this.a.equals(uzcVar.a) && jl40.l(this.b, uzcVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        b4u0 b4u0Var = this.b;
        return hashCode + (b4u0Var == null ? 0 : b4u0Var.hashCode());
    }

    public final String toString() {
        return "CompletedStateButtons(primary=" + this.a + ", secondary=" + this.b + Extension.C_BRAKE;
    }
}
