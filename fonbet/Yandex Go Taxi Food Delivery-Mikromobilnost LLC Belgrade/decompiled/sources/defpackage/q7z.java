package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class q7z extends t7z {
    public final gfj0 a;

    public q7z(gfj0 gfj0Var) {
        this.a = gfj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q7z) && this.a.equals(((q7z) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Requirement(deeplink=" + this.a + Extension.C_BRAKE;
    }
}
