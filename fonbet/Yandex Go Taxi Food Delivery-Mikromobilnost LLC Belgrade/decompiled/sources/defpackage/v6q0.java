package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class v6q0 {
    public final int a;
    public final String b;

    public v6q0(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v6q0)) {
            return false;
        }
        v6q0 v6q0Var = (v6q0) obj;
        return this.a == v6q0Var.a && jl40.l(this.b, v6q0Var.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return oyr.l(this.a, "SecurityCodeLabel(fallbackRes=", ", customLabel=", this.b, Extension.C_BRAKE);
    }
}
