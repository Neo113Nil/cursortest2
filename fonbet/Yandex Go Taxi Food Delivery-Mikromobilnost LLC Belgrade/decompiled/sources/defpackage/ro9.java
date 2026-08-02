package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ro9 implements uj9 {
    public final hwa a;

    public ro9(hwa hwaVar) {
        this.a = hwaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ro9) && this.a.equals(((ro9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OpenSurgeModal(surgeModal=" + this.a + Extension.C_BRAKE;
    }
}
