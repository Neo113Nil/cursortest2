package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class zl3 implements am3 {
    public final wl3 a;

    public zl3(wl3 wl3Var) {
        this.a = wl3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zl3) && this.a.equals(((zl3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(uid=" + this.a + Extension.C_BRAKE;
    }
}
