package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class z9a implements jaa {
    public final String a;

    public z9a(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z9a) && jl40.l(this.a, ((z9a) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("OnDiscountsButtonClick(offerId=", this.a, Extension.C_BRAKE);
    }
}
