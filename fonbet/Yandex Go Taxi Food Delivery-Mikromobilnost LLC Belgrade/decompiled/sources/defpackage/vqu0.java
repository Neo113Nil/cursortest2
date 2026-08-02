package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class vqu0 implements xqu0 {
    public final jz60 a;

    public vqu0(jz60 jz60Var) {
        this.a = jz60Var;
    }

    public final jz60 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vqu0) && this.a.equals(((vqu0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnJumpOrDivergence(config=" + this.a + Extension.C_BRAKE;
    }
}
