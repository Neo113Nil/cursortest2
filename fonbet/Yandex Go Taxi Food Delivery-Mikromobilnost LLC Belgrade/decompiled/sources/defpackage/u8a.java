package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class u8a {
    public final boolean a;
    public final boolean b;

    public u8a(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u8a)) {
            return false;
        }
        u8a u8aVar = (u8a) obj;
        return this.a == u8aVar.a && this.b == u8aVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return ly3.o("ChargersOfferPlaquesState(hasPlaque=", ", isExpanded=", Extension.C_BRAKE, this.a, this.b);
    }

    public u8a() {
        this(false, false);
    }
}
