package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class qev extends tev {
    public final int c;
    public final int d;

    public qev(int i, int i2) {
        super(i, i2);
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qev)) {
            return false;
        }
        qev qevVar = (qev) obj;
        return this.c == qevVar.c && this.d == qevVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + (Integer.hashCode(this.c) * 31);
    }

    public final String toString() {
        return b64.d(this.c, this.d, "Custom(widthPx=", ", heightPx=", Extension.C_BRAKE);
    }
}
