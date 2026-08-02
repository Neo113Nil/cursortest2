package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ypi {
    public final bqi a;

    public ypi(bqi bqiVar) {
        this.a = bqiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ypi) && this.a.equals(((ypi) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AdsBanner(adsBannerSettings=" + this.a + Extension.C_BRAKE;
    }
}
