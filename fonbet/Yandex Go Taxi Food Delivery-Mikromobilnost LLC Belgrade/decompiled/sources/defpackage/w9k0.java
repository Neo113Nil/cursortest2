package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class w9k0 implements ibk0 {
    public final String a;
    public final v9k0 b;

    public w9k0(String str, v9k0 v9k0Var) {
        this.a = str;
        this.b = v9k0Var;
    }

    @Override // defpackage.nqs0
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w9k0)) {
            return false;
        }
        w9k0 w9k0Var = (w9k0) obj;
        return jl40.l(this.a, w9k0Var.a) && jl40.l(this.b, w9k0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        v9k0 v9k0Var = this.b;
        return hashCode + (v9k0Var == null ? 0 : v9k0Var.hashCode());
    }

    public final String toString() {
        return "OpenComment(analyticsName=" + this.a + ", support=" + this.b + Extension.C_BRAKE;
    }
}
