package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class wb61 extends xb61 {
    public final ad7 a;

    public wb61(ad7 ad7Var) {
        this.a = ad7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wb61) && this.a.equals(((wb61) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(drawable=" + this.a + Extension.C_BRAKE;
    }
}
