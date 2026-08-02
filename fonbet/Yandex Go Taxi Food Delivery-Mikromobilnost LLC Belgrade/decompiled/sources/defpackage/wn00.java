package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class wn00 implements fo00 {
    public final ixy0 a;

    public wn00(ixy0 ixy0Var) {
        this.a = ixy0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wn00) && this.a.equals(((wn00) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SocialDefaultPinStyle(image=" + this.a + Extension.C_BRAKE;
    }
}
