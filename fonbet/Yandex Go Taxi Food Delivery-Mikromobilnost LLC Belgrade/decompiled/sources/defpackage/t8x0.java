package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class t8x0 implements r9x0 {
    public final s8x0 a;

    public t8x0(s8x0 s8x0Var) {
        this.a = s8x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t8x0) && this.a.equals(((t8x0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ClientStateTransformAction(transformer=" + this.a + Extension.C_BRAKE;
    }
}
