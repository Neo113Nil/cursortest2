package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class th30 implements wh30 {
    public final String a;

    public th30(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof th30) && jl40.l(this.a, ((th30) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("TransportCardDeeplinkTapped(deeplink=", this.a, Extension.C_BRAKE);
    }
}
