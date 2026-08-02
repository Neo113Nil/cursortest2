package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ug4 implements xg4 {
    public final ldc a;

    public ug4(ldc ldcVar) {
        this.a = ldcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ug4) && jl40.l(this.a, ((ug4) obj).a);
    }

    public final int hashCode() {
        ldc ldcVar = this.a;
        if (ldcVar == null) {
            return 0;
        }
        return Long.hashCode(ldcVar.a);
    }

    public final String toString() {
        return "SolidBackground(color=" + this.a + Extension.C_BRAKE;
    }
}
