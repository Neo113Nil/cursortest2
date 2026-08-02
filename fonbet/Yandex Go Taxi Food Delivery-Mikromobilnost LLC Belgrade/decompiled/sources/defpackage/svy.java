package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class svy extends n351 {
    public final zvy c;

    public svy(zvy zvyVar) {
        super("live-location-key", false, 14);
        this.c = zvyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof svy) && this.c.equals(((svy) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "LiveLocationModel(payload=" + this.c + Extension.C_BRAKE;
    }
}
