package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class uv7 implements uni {
    public final String a;
    public final vwa0 b;

    public uv7(String str, vwa0 vwa0Var) {
        this.a = str;
        this.b = vwa0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uv7)) {
            return false;
        }
        uv7 uv7Var = (uv7) obj;
        return jl40.l(this.a, uv7Var.a) && jl40.l(this.b, uv7Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        vwa0 vwa0Var = this.b;
        return hashCode + (vwa0Var == null ? 0 : vwa0Var.hashCode());
    }

    public final String toString() {
        return "CancelInfoArgs(deliveryId=" + this.a + ", performer=" + this.b + Extension.C_BRAKE;
    }
}
