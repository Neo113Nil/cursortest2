package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class wv6 {
    public final tv6 a;

    public wv6(int i) {
        this.a = new tv6(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wv6) && jl40.l(this.a, ((wv6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BusTariffState(data=" + this.a + Extension.C_BRAKE;
    }

    public wv6() {
        this(0);
    }
}
