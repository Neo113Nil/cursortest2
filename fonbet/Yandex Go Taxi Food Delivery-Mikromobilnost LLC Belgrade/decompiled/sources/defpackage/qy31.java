package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class qy31 extends sy31 {
    public final ps50 a;

    public qy31(ps50 ps50Var) {
        this.a = ps50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qy31) && this.a.equals(((qy31) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Failure(networkError=" + this.a + Extension.C_BRAKE;
    }
}
