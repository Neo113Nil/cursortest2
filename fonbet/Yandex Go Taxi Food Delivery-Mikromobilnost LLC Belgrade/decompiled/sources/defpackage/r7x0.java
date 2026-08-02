package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class r7x0 implements t7x0 {
    public final so5 a;

    public r7x0(so5 so5Var) {
        this.a = so5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r7x0) && this.a.equals(((r7x0) obj).a);
    }

    public final int hashCode() {
        return Float.hashCode(this.a.a);
    }

    public final String toString() {
        return "Box(alignment=" + this.a + Extension.C_BRAKE;
    }
}
