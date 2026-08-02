package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class yoj0 implements zoj0 {
    public final String a;

    public yoj0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yoj0) && this.a.equals(((yoj0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("TariffIcon(tariffIconUrl=", this.a, Extension.C_BRAKE);
    }
}
