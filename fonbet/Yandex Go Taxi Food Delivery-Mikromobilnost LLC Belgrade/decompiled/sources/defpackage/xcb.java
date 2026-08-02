package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class xcb extends zcb {
    public final int c;

    public xcb(int i) {
        super(i);
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xcb) && this.c == ((xcb) obj).c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c);
    }

    public final String toString() {
        return oyr.j(this.c, "Unknown(unknownValue=", Extension.C_BRAKE);
    }
}
