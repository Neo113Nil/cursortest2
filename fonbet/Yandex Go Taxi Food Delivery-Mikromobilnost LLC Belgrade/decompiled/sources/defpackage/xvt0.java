package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class xvt0 {
    public final jbv a;

    public xvt0(jbv jbvVar) {
        this.a = jbvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xvt0) && this.a.equals(((xvt0) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "State(image=" + this.a + Extension.C_BRAKE;
    }
}
