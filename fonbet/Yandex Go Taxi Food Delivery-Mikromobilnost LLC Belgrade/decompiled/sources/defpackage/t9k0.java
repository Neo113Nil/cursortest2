package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class t9k0 implements ibk0 {
    public final String a;
    public final uc6 b;

    public t9k0(String str, uc6 uc6Var) {
        this.a = str;
        this.b = uc6Var;
    }

    @Override // defpackage.nqs0
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t9k0)) {
            return false;
        }
        t9k0 t9k0Var = (t9k0) obj;
        return jl40.l(this.a, t9k0Var.a) && this.b.equals(t9k0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OpenBottomModal(analyticsName=" + this.a + ", bottomModalParams=" + this.b + Extension.C_BRAKE;
    }
}
