package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class zp8 extends aq8 {
    public final boolean c;

    public zp8(boolean z) {
        this.c = z;
    }

    @Override // defpackage.aq8
    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zp8) && this.c == ((zp8) obj).c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c);
    }

    public final String toString() {
        return nzs.b("Shimmer(hasBackdrop=", Extension.C_BRAKE, this.c);
    }
}
