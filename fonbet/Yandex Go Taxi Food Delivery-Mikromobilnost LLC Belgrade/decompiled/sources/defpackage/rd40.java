package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class rd40 implements td40 {
    public final boolean a;

    public rd40(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rd40) && this.a == ((rd40) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return nzs.b("OnTicketWayTypeChanged(backAndForth=", Extension.C_BRAKE, this.a);
    }
}
