package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class qhb0 implements uhb0 {
    public final qzd a;

    public qhb0(qzd qzdVar) {
        this.a = qzdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qhb0) && this.a.equals(((qhb0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Camera(config=" + this.a + Extension.C_BRAKE;
    }
}
