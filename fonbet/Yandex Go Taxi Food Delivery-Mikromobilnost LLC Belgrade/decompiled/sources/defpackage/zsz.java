package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class zsz implements btz {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof zsz) {
            return this.a == ((zsz) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return oyr.j(this.a, "RawRes(resId=", Extension.C_BRAKE);
    }
}
