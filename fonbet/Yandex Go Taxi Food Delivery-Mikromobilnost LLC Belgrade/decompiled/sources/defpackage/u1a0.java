package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class u1a0 implements w1a0 {
    public final z1a0 a;

    public u1a0(z1a0 z1a0Var) {
        this.a = z1a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u1a0) && this.a.equals(((u1a0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(paymentInfoEntityType=" + this.a + Extension.C_BRAKE;
    }
}
