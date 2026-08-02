package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class y6a implements g7a {
    public final String a;

    public y6a(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y6a) && jl40.l(this.a, ((y6a) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("OpenDvizhSubscription(promoPlateId=", this.a, Extension.C_BRAKE);
    }
}
