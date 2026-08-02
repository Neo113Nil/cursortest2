package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class s7z extends t7z {
    public final s811 a;

    public s7z(s811 s811Var) {
        this.a = s811Var;
    }

    public final s811 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s7z) && this.a.equals(((s7z) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TransportRoutes(deeplink=" + this.a + Extension.C_BRAKE;
    }
}
