package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class vgu0 implements xgu0 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof vgu0) {
            return this.a == ((vgu0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return oyr.j(this.a, "AtIndex(index=", Extension.C_BRAKE);
    }
}
