package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class zvo {
    public final pd5 a;
    public final pd5 b;

    public zvo(pd5 pd5Var, pd5 pd5Var2) {
        this.a = pd5Var;
        this.b = pd5Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zvo)) {
            return false;
        }
        zvo zvoVar = (zvo) obj;
        return jl40.l(this.a, zvoVar.a) && jl40.l(this.b, zvoVar.b);
    }

    public final int hashCode() {
        pd5 pd5Var = this.a;
        int hashCode = (pd5Var == null ? 0 : pd5Var.hashCode()) * 31;
        pd5 pd5Var2 = this.b;
        return hashCode + (pd5Var2 != null ? pd5Var2.hashCode() : 0);
    }

    public final String toString() {
        return "ConfirmationWindowActionState(mainScreen=" + this.a + ", alertPopup=" + this.b + Extension.C_BRAKE;
    }
}
