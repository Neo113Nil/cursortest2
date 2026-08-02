package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class tzx0 implements uzx0 {
    public final ynv0 a;

    public tzx0(ynv0 ynv0Var) {
        this.a = ynv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tzx0) && jl40.l(this.a, ((tzx0) obj).a);
    }

    public final int hashCode() {
        ynv0 ynv0Var = this.a;
        if (ynv0Var == null) {
            return 0;
        }
        return ynv0Var.hashCode();
    }

    public final String toString() {
        return "Summary(origin=" + this.a + Extension.C_BRAKE;
    }
}
