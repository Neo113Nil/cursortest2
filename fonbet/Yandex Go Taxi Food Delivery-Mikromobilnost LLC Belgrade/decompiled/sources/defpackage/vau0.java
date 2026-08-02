package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class vau0 implements pbu0 {
    public final String a;
    public final kdc b;
    public final kdc c;
    public final uau0 d;
    public final boolean e;
    public final boolean f;

    public vau0(String str, kdc kdcVar, kdc kdcVar2, uau0 uau0Var, boolean z, boolean z2) {
        this.a = str;
        this.b = kdcVar;
        this.c = kdcVar2;
        this.d = uau0Var;
        this.e = z;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vau0)) {
            return false;
        }
        vau0 vau0Var = (vau0) obj;
        return jl40.l(this.a, vau0Var.a) && jl40.l(this.b, vau0Var.b) && jl40.l(this.c, vau0Var.c) && this.d.equals(vau0Var.d) && this.e == vau0Var.e && this.f == vau0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + unr0.e((this.d.hashCode() + smw0.d(this.c, smw0.d(this.b, this.a.hashCode() * 31, 31), 31)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StepsButtonState(text=");
        sb.append(this.a);
        sb.append(", textColor=");
        sb.append(this.b);
        sb.append(", backgroundColor=");
        sb.append(this.c);
        sb.append(", action=");
        sb.append(this.d);
        sb.append(", isFirstItem=");
        return smw0.k(", isAccent=", Extension.C_BRAKE, sb, this.e, this.f);
    }
}
