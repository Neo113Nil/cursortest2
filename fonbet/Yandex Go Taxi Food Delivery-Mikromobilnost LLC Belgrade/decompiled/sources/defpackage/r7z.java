package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class r7z extends t7z {
    public final c2l0 a;

    public r7z(c2l0 c2l0Var) {
        this.a = c2l0Var;
    }

    public final c2l0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r7z) && this.a.equals(((r7z) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Route(deeplink=" + this.a + Extension.C_BRAKE;
    }
}
