package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class sxs0 implements vxs0 {
    public final o33 a;

    public sxs0(o33 o33Var) {
        this.a = o33Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sxs0) && this.a.equals(((sxs0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ChangeArBoxSize(newSize=" + this.a + Extension.C_BRAKE;
    }
}
