package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class q510 implements s510 {
    public final nvi0 a;

    public q510(nvi0 nvi0Var) {
        this.a = nvi0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q510) && this.a.equals(((q510) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "IconSpot(image=" + this.a + Extension.C_BRAKE;
    }
}
